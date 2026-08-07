package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.ToIntFunction;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BubbleCounterPath;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogCellTags;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.PhotoBubbleClip;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TimerDrawable;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanNoUnderlineBold;
import org.telegram.ui.Components.VectorAvatarThumbDrawable;
import org.telegram.ui.Components.dialogs.DialogMediaIconsHelper;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.RightSlidingDialogContainer;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.community.CommunityArrowDrawable;
import org.telegram.ui.community.CommunitySheet;

/* loaded from: classes4.dex */
public class DialogCell extends BaseCell implements StoriesListPlaceProvider.AvatarOverlaysView, Theme.Colorable {
    private int[] adaptiveEmojiColor;
    private ColorFilter[] adaptiveEmojiColorFilter;
    public int addForumHeightForTags;
    public int addHeightForTags;
    private boolean allowBotOpenButton;
    private int animateFromStatusDrawableParams;
    private int animateToStatusDrawableParams;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack2;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack3;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStackName;
    private boolean animatingArchiveAvatar;
    private float animatingArchiveAvatarProgress;
    private BoolAnimator animatorPollVotesMentionVisible;
    private boolean applyName;
    private float archiveBackgroundProgress;
    private GradientDrawable archiveFadeGradientDrawable;
    private int archiveFadeGradientDrawableColor;
    private boolean archiveHidden;
    protected PullForegroundDrawable archivedChatsDrawable;
    private boolean attachedToWindow;
    private AvatarDrawable avatarDrawable;
    public ImageReceiver avatarImage;
    public int avatarStart;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable botVerification;
    private int bottomClip;
    private PhotoBubbleClip bubbleClip;
    private Paint buttonBackgroundPaint;
    private boolean buttonCreated;
    private StaticLayout buttonLayout;
    private int buttonLeft;
    private int buttonTop;
    CanvasButton canvasButton;
    public boolean channelShouldUseLineWidth;
    private TLRPC.Chat chat;
    private float chatCallProgress;
    protected CheckBox2 checkBox;
    private int checkDrawLeft;
    private int checkDrawLeft1;
    private int checkDrawTop;
    public float chekBoxPaddingTop;
    private boolean clearingDialog;
    private float clipProgress;
    private int clockDrawLeft;
    public float collapseOffset;
    public boolean collapsed;
    private CommunityArrowDrawable communityArrowDrawable;
    private float cornerProgress;
    private StaticLayout countAnimationInLayout;
    private boolean countAnimationIncrement;
    private StaticLayout countAnimationStableLayout;
    private ValueAnimator countAnimator;
    private float countChangeProgress;
    private StaticLayout countLayout;
    private int countLeft;
    private int countLeftOld;
    private StaticLayout countOldLayout;
    private int countTop;
    private int countWidth;
    private int countWidthOld;
    private Paint counterPaintOutline;
    private Path counterPath;
    private RectF counterPathRect;
    private int currentAccount;
    private long currentDialogCommunityId;
    private int currentDialogFolderDialogsCount;
    private int currentDialogFolderId;
    private long currentDialogId;
    private int currentEditDate;
    private TextPaint currentMessagePaint;
    private float currentRevealBounceProgress;
    private float currentRevealProgress;
    private CustomDialog customDialog;
    private String customMessage;
    DialogCellDelegate delegate;
    private boolean dialogMuted;
    private float dialogMutedProgress;
    private int dialogsType;
    private TLRPC.DraftMessage draftMessage;
    private boolean draftVoice;
    public boolean drawArchive;
    public boolean drawAvatar;
    public boolean drawAvatarSelector;
    private boolean drawBotVerified;
    private boolean drawCheck1;
    private boolean drawCheck2;
    private boolean drawClock;
    private boolean drawCommunityAvatar;
    private boolean drawCount;
    private boolean drawCount2;
    private boolean drawError;
    private boolean drawForwardIcon;
    private boolean drawGiftIcon;
    private boolean drawMention;
    public boolean drawMonoforumAvatar;
    private boolean drawNameLock;
    private boolean drawPin;
    private boolean drawPinBackground;
    private boolean drawPinForced;
    private boolean[] drawPlay;
    private boolean drawPollVotesMention;
    private boolean drawPremium;
    private boolean drawReactionMention;
    private boolean drawReorder;
    private boolean drawRevealBackground;
    private int drawScam;
    private boolean[] drawSpoiler;
    private boolean drawUnmute;
    private boolean drawVerified;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatus;
    private final View emojiStatusView;
    private TLRPC.EncryptedChat encryptedChat;
    private int errorLeft;
    private int errorTop;
    private Paint fadePaint;
    private Paint fadePaintBack;
    private int folderId;
    protected boolean forbidDraft;
    protected boolean forbidVerified;
    private ForumFormattedNames forumFormattedNames;
    public TLRPC.TL_forumTopic forumTopic;
    public boolean fullSeparator;
    public boolean fullSeparator2;
    private ArrayList groupMessages;
    private int halfCheckDrawLeft;
    private boolean hasCall;
    private boolean hasNameInMessage;
    private boolean hasUnmutedCommunityDialogs;
    private boolean hasUnmutedTopics;
    private boolean hasVideoThumb;
    public int heightDefault;
    public int heightThreeLines;
    public boolean inPreviewMode;
    private float innerProgress;
    public boolean insideCommunityList;
    public boolean insideCommunityListNoDialog;
    private BounceInterpolator interpolator;
    public boolean isDialogCell;
    public boolean isForChannelSubscriberCell;
    private boolean isForum;
    public boolean isHiddenInCommunity;
    public boolean isMonoForumTopicDialog;
    public boolean isSavedDialog;
    public boolean isSavedDialogCell;
    private boolean isSelected;
    private boolean isShareToStoryCell;
    private boolean isSliding;
    private boolean isTopic;
    public boolean isTransitionSupport;
    long lastDialogChangedTime;
    private int lastDrawSwipeMessageStringId;
    private RLottieDrawable lastDrawTranslationDrawable;
    private int lastMessageDate;
    private CharSequence lastMessageString;
    private CharSequence lastPrintString;
    private int lastSendState;
    int lastSize;
    private int lastStatusDrawableParams;
    private boolean lastTopicMessageUnread;
    private boolean lastUnreadState;
    private int lock2Left;
    private Drawable lockDrawable;
    private boolean markUnread;
    private int mentionCount;
    private StaticLayout mentionLayout;
    private int mentionLeft;
    private int mentionWidth;
    private MessageObject message;
    private int messageId;
    private StaticLayout messageLayout;
    private int messageLeft;
    private StaticLayout messageNameLayout;
    private int messageNameLeft;
    private int messageNameTop;
    public int messagePaddingStart;
    private int messageTop;
    boolean moving;
    public int nameAdditionalsForChannelSubscriber;
    private boolean nameIsEllipsized;
    public StaticLayout nameLayout;
    private boolean nameLayoutEllipsizeByGradient;
    private boolean nameLayoutEllipsizeLeft;
    private boolean nameLayoutFits;
    public float nameLayoutTranslateX;
    public int nameLeft;
    private int nameLockLeft;
    private int nameLockTop;
    private int nameMuteLeft;
    private int nameMutedIconLeft;
    public int namePaddingEnd;
    public int nameWidth;
    private boolean needEmoji;
    private Utilities.Callback onOpenButtonClick;
    private float onlineProgress;
    private boolean openBot;
    private final Paint openButtonBackgroundPaint;
    private final ButtonBounce openButtonBounce;
    private final RectF openButtonRect;
    private Text openButtonText;
    protected boolean overrideSwipeAction;
    protected int overrideSwipeActionBackgroundColorKey;
    protected RLottieDrawable overrideSwipeActionDrawable;
    protected int overrideSwipeActionRevealBackgroundColorKey;
    protected int overrideSwipeActionStringId;
    protected String overrideSwipeActionStringKey;
    private int paintIndex;
    private DialogsActivity parentFragment;
    private int pinLeft;
    private int pinTop;
    private int pollVotesMentionCount;
    private int pollVotesMentionLeft;
    private DialogsAdapter.DialogsPreloader preloader;
    private boolean premiumBlocked;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    private int printingStringType;
    private int progressStage;
    private boolean promoDialog;
    private int reactionMentionCount;
    private int reactionMentionLeft;
    private ValueAnimator reactionsMentionsAnimator;
    private float reactionsMentionsChangeProgress;
    private int readOutboxMaxId;
    private RectF rect;
    private int reorderGradientLastColor;
    private Paint reorderGradientPaint;
    private float reorderIconProgress;
    public ShareDialogCell.RepostStoryDrawable repostStoryDrawable;
    private final Theme.ResourcesProvider resourcesProvider;
    public float rightFragmentOffset;
    private float rightFragmentOpenedProgress;
    private boolean showTopicIconInName;
    private boolean showTtl;
    private List spoilers;
    private List spoilers2;
    private Stack spoilersPool;
    private Stack spoilersPool2;
    private Drawable starBg;
    private int starBgColor;
    private Drawable starFg;
    private final AnimatedFloat starsBlockedT;
    private long starsPriceBlocked;
    private boolean statusDrawableAnimationInProgress;
    private ValueAnimator statusDrawableAnimator;
    private int statusDrawableLeft;
    private float statusDrawableProgress;
    public final StoriesUtilities.AvatarStoryParams storyParams;
    public boolean swipeCanceled;
    private int swipeMessageTextId;
    private StaticLayout swipeMessageTextLayout;
    private int swipeMessageWidth;
    public DialogCellTags tags;
    private int tagsLeft;
    private int tagsRight;
    private Paint thumbBackgroundPaint;
    private ImageReceiver[] thumbImage;
    private boolean[] thumbImageSeen;
    private Path thumbPath;
    int thumbSize;
    private SpoilerEffect thumbSpoiler;
    private int thumbsCount;
    private StaticLayout timeLayout;
    private int timeLeft;
    private int timeTop;
    private TimerDrawable timerDrawable;
    private Paint timerPaint;
    private Paint timerPaint2;
    private String titleOverride;
    private int topClip;
    int topMessageTopicEndIndex;
    int topMessageTopicStartIndex;
    private Paint topicCounterPaint;
    protected Drawable[] topicIconInName;
    private boolean topicMuted;
    protected int translateY;
    private boolean translationAnimationStarted;
    private RLottieDrawable translationDrawable;
    protected float translationX;
    private int ttlPeriod;
    private float ttlProgress;
    private boolean twoLinesForName;
    private StaticLayout typingLayout;
    private int typingLeft;
    private int unreadCount;
    private Runnable unsubscribePremiumBlocked;
    private final DialogUpdateHelper updateHelper;
    private boolean updateLayout;
    public boolean useForceThreeLines;
    public boolean useFromUserAsAvatar;
    private boolean useMeForMyMessages;
    public boolean useSeparator;
    private TLRPC.User user;
    private boolean visibleOnScreen;
    private boolean wasDrawnOnline;
    protected float xOffset;

    public static class BounceInterpolator implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f < 0.33f) {
                return (f / 0.33f) * 0.1f;
            }
            float f2 = f - 0.33f;
            return f2 < 0.33f ? 0.1f - ((f2 / 0.34f) * 0.15f) : (((f2 - 0.34f) / 0.33f) * 0.05f) - 0.05f;
        }
    }

    public static class CustomDialog {
        public int date;
        public int id;
        public boolean isMedia;
        public String message;
        public boolean muted;
        public String name;
        public boolean pinned;
        public int sent = -1;
        public int type;
        public int unread_count;
        public boolean verified;
    }

    public interface DialogCellDelegate {
        boolean canClickButtonInside();

        void onButtonClicked(DialogCell dialogCell);

        void onButtonLongPress(DialogCell dialogCell);

        void openHiddenStories();

        void openStory(DialogCell dialogCell, Runnable runnable);

        void showChatPreview(DialogCell dialogCell);
    }

    public boolean checkCurrentDialogIndex(boolean z) {
        return false;
    }

    protected boolean drawLock2() {
        return false;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return Theme.Colorable.-CC.$default$getColorKeys(this);
    }

    @Override // org.telegram.ui.ActionBar.Theme.Colorable
    public void updateColors() {
    }

    public void setMoving(boolean z) {
        this.moving = z;
    }

    public boolean isMoving() {
        return this.moving;
    }

    public void setForumTopic(TLRPC.TL_forumTopic tL_forumTopic, long j, MessageObject messageObject, boolean z, boolean z2) {
        PullForegroundDrawable pullForegroundDrawable;
        this.forumTopic = tL_forumTopic;
        this.isTopic = tL_forumTopic != null;
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        if (messageObject != null) {
            Drawable drawable = messageObject.topicIconDrawable[0];
            if (drawable instanceof ForumBubbleDrawable) {
                ((ForumBubbleDrawable) drawable).setColor(tL_forumTopic.icon_color);
            }
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.isDialogCell = false;
        this.showTopicIconInName = z;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            this.lastMessageDate = message.date;
            this.currentEditDate = message.edit_date;
            this.markUnread = false;
            this.messageId = messageObject.getId();
            this.lastUnreadState = messageObject.isUnread();
        }
        MessageObject messageObject2 = this.message;
        if (messageObject2 != null) {
            this.lastSendState = messageObject2.messageOwner.send_state;
        }
        if (!z2) {
            this.lastStatusDrawableParams = -1;
        }
        if (tL_forumTopic != null) {
            this.groupMessages = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.forumTopic;
        if (tL_forumTopic2 != null && tL_forumTopic2.id == 1 && (pullForegroundDrawable = this.archivedChatsDrawable) != null) {
            pullForegroundDrawable.setCell(this);
        }
        update(0, z2);
    }

    public void setRightFragmentOpenedProgress(float f) {
        if (this.rightFragmentOpenedProgress != f) {
            this.rightFragmentOpenedProgress = f;
            invalidate();
        }
    }

    public void setCurrentDialogId(long j) {
        this.currentDialogId = j;
    }

    public void setIsTransitionSupport(boolean z) {
        this.isTransitionSupport = z;
    }

    public void setIsShareToStoryCell() {
        this.repostStoryDrawable = new ShareDialogCell.RepostStoryDrawable(getContext(), this, R.drawable.forward_to_stories, this.resourcesProvider);
        this.isShareToStoryCell = true;
    }

    public void checkHeight() {
        if (getMeasuredHeight() <= 0 || getMeasuredHeight() == computeHeight()) {
            return;
        }
        requestLayout();
    }

    public void setVisible(boolean z) {
        if (this.visibleOnScreen == z) {
            return;
        }
        this.visibleOnScreen = z;
        if (z) {
            invalidate();
        }
    }

    public static class FixedWidthSpan extends ReplacementSpan {
        private int width;

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        public FixedWidthSpan(int i) {
            this.width = i;
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            if (fontMetricsInt == null) {
                fontMetricsInt = paint.getFontMetricsInt();
            }
            if (fontMetricsInt != null) {
                int i3 = 1 - (fontMetricsInt.descent - fontMetricsInt.ascent);
                fontMetricsInt.descent = i3;
                fontMetricsInt.bottom = i3;
                fontMetricsInt.ascent = -1;
                fontMetricsInt.top = -1;
            }
            return this.width;
        }
    }

    public void setOpenBotButton(boolean z) {
        if (this.openBot == z) {
            return;
        }
        if (this.openButtonText == null) {
            this.openButtonText = new Text(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.openBot = z;
        this.openButtonBounce.setPressed(false);
    }

    public DialogCell allowBotOpenButton(boolean z, Utilities.Callback callback) {
        this.allowBotOpenButton = z;
        this.onOpenButtonClick = callback;
        return this;
    }

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    public long getStarsPrice() {
        return this.starsPriceBlocked;
    }

    public DialogCell(DialogsActivity dialogsActivity, Context context, boolean z, boolean z2) {
        this(dialogsActivity, context, z, z2, UserConfig.selectedAccount, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogCell(DialogsActivity dialogsActivity, Context context, boolean z, boolean z2, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.drawArchive = true;
        this.drawAvatar = true;
        int i2 = 0;
        this.drawMonoforumAvatar = false;
        this.avatarStart = 11;
        this.messagePaddingStart = 72;
        this.heightDefault = 70;
        this.heightThreeLines = 76;
        this.addHeightForTags = 3;
        this.addForumHeightForTags = 11;
        this.chekBoxPaddingTop = 42.0f;
        StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams(0 == true ? 1 : 0) { // from class: org.telegram.ui.Cells.DialogCell.1
            @Override // org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams
            public boolean isAvatarClickable(long j, TLRPC.Chat chat, TLRPC.User user) {
                return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || DialogCell.this.insideCommunityList) ? false : true;
            }

            @Override // org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams
            public boolean onAvatarClick(View view, long j) {
                if (DialogCell.this.parentFragment != null) {
                    DialogCell dialogCell = DialogCell.this;
                    if (!dialogCell.insideCommunityList) {
                        if (j > 0) {
                            TLRPC.User user = MessagesController.getInstance(dialogCell.currentAccount).getUser(Long.valueOf(j));
                            if (user != null && user.linked_community_id != 0) {
                                DialogCell.this.parentFragment.showDialog(new CommunitySheet(DialogCell.this.parentFragment, user.linked_community_id));
                                return true;
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(dialogCell.currentAccount).getChat(Long.valueOf(-j));
                            if (chat != null && chat.linked_community_id != 0) {
                                DialogCell.this.parentFragment.showDialog(new CommunitySheet(DialogCell.this.parentFragment, chat.linked_community_id));
                                return true;
                            }
                        }
                    }
                }
                return super.onAvatarClick(view, j);
            }

            @Override // org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams
            public void openStory(long j, Runnable runnable) {
                DialogCell dialogCell = DialogCell.this;
                if (dialogCell.delegate == null) {
                    return;
                }
                if (dialogCell.currentDialogFolderId != 0) {
                    DialogCell.this.delegate.openHiddenStories();
                    return;
                }
                DialogCell dialogCell2 = DialogCell.this;
                DialogCellDelegate dialogCellDelegate = dialogCell2.delegate;
                if (dialogCellDelegate != null) {
                    dialogCellDelegate.openStory(dialogCell2, runnable);
                }
            }

            @Override // org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams
            public void onLongPress() {
                DialogCell dialogCell = DialogCell.this;
                DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
                if (dialogCellDelegate == null) {
                    return;
                }
                dialogCellDelegate.showChatPreview(dialogCell);
            }
        };
        this.storyParams = avatarStoryParams;
        this.visibleOnScreen = true;
        this.collapseOffset = 0.0f;
        this.hasUnmutedTopics = false;
        this.hasUnmutedCommunityDialogs = false;
        this.openButtonBounce = new ButtonBounce(this);
        this.openButtonBackgroundPaint = new Paint(1);
        this.openButtonRect = new RectF();
        this.overrideSwipeAction = false;
        this.thumbImageSeen = new boolean[3];
        this.thumbImage = new ImageReceiver[3];
        this.drawPlay = new boolean[3];
        this.drawSpoiler = new boolean[3];
        this.avatarImage = new ImageReceiver(this);
        this.avatarDrawable = new AvatarDrawable();
        this.interpolator = new BounceInterpolator();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.spoilersPool = new Stack();
        this.spoilers = new ArrayList();
        this.spoilersPool2 = new Stack();
        this.spoilers2 = new ArrayList();
        this.drawCount2 = true;
        this.animatorPollVotesMentionVisible = new BoolAnimator(this, cubicBezierInterpolator, 320L);
        this.countChangeProgress = 1.0f;
        this.reactionsMentionsChangeProgress = 1.0f;
        this.rect = new RectF();
        this.lastStatusDrawableParams = -1;
        this.readOutboxMaxId = -1;
        this.updateHelper = new DialogUpdateHelper();
        avatarStoryParams.allowLongress = true;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = dialogsActivity;
        Theme.createDialogsResources(context);
        this.drawMonoforumAvatar = false;
        this.drawCommunityAvatar = false;
        this.avatarImage.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.thumbImage;
            if (i2 < imageReceiverArr.length) {
                imageReceiverArr[i2] = new ImageReceiver(this);
                ImageReceiver imageReceiver = this.thumbImage[i2];
                imageReceiver.ignoreNotifications = true;
                imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                this.thumbImage[i2].setAllowLoadingOnAttachedOnly(true);
                i2++;
            } else {
                this.useForceThreeLines = z2;
                this.currentAccount = i;
                View view = new View(context) { // from class: org.telegram.ui.Cells.DialogCell.2
                    @Override // android.view.View
                    protected void onDraw(Canvas canvas) {
                        DialogCell.this.emojiStatus.setBounds(0, 0, getWidth(), getHeight());
                        DialogCell.this.emojiStatus.draw(canvas);
                    }
                };
                this.emojiStatusView = view;
                addView(view);
                this.emojiStatus = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(22.0f));
                this.botVerification = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(17.0f));
                this.avatarImage.setAllowLoadingOnAttachedOnly(true);
                return;
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.customMessage = str;
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.customMessage, str)) {
            return;
        }
        this.customMessage = str;
        buildLayout();
        requestLayout();
    }

    public void setDialog(TLRPC.Dialog dialog, int i, int i2) {
        if (this.currentDialogId != dialog.id) {
            ValueAnimator valueAnimator = this.statusDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.statusDrawableAnimator.cancel();
            }
            this.statusDrawableAnimationInProgress = false;
            this.lastStatusDrawableParams = -1;
        }
        this.currentDialogId = dialog.id;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.isDialogCell = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.currentDialogCommunityId = dialog.community_id;
        } else {
            this.currentDialogCommunityId = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.currentDialogFolderId = ((TLRPC.TL_dialogFolder) dialog).folder.id;
            PullForegroundDrawable pullForegroundDrawable = this.archivedChatsDrawable;
            if (pullForegroundDrawable != null) {
                pullForegroundDrawable.setCell(this);
            }
        } else {
            this.currentDialogFolderId = 0;
        }
        this.dialogsType = i;
        showPremiumBlocked(i == 3);
        if (this.tags == null) {
            this.tags = new DialogCellTags(this);
        }
        this.folderId = i2;
        this.messageId = 0;
        if (update(0, false)) {
            requestLayout();
        }
        checkOnline();
        checkGroupCall();
        checkChatTheme();
        checkTtl();
    }

    public void setDialog(CustomDialog customDialog) {
        this.customDialog = customDialog;
        this.messageId = 0;
        update(0);
        checkOnline();
        checkGroupCall();
        checkChatTheme();
        checkTtl();
    }

    private void checkOnline() {
        TLRPC.User user;
        if (this.user != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id))) != null) {
            this.user = user;
        }
        this.onlineProgress = isOnline() ? 1.0f : 0.0f;
    }

    private boolean isOnline() {
        TLRPC.User user;
        if (!isForumCell() && !this.storyParams.drawnLive && (user = this.user) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            if (userStatus != null && userStatus.expires <= 0 && MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(this.user.id))) {
                return true;
            }
            TLRPC.UserStatus userStatus2 = this.user.status;
            if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                return true;
            }
        }
        return false;
    }

    private void checkGroupCall() {
        TLRPC.Chat chat = this.chat;
        boolean z = chat != null && chat.call_active && chat.call_not_empty;
        this.hasCall = z;
        this.chatCallProgress = z ? 1.0f : 0.0f;
    }

    private void checkTtl() {
        CheckBox2 checkBox2;
        boolean z = this.ttlPeriod > 0 && !this.hasCall && !isOnline() && ((checkBox2 = this.checkBox) == null || !checkBox2.isChecked()) && !this.storyParams.drawnLive;
        this.showTtl = z;
        this.ttlProgress = z ? 1.0f : 0.0f;
    }

    private void checkChatTheme() {
        TLRPC.Message message;
        MessageObject messageObject = this.message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.lastUnreadState) {
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.currentDialogId, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
        }
    }

    public void setDialog(long j, MessageObject messageObject, int i, boolean z, boolean z2) {
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.useMeForMyMessages = z;
        this.isDialogCell = false;
        this.lastMessageDate = i;
        this.currentEditDate = messageObject != null ? messageObject.messageOwner.edit_date : 0;
        this.unreadCount = 0;
        this.markUnread = false;
        this.messageId = messageObject != null ? messageObject.getId() : 0;
        this.mentionCount = 0;
        this.reactionMentionCount = 0;
        this.pollVotesMentionCount = 0;
        this.lastUnreadState = messageObject != null && messageObject.isUnread();
        MessageObject messageObject2 = this.message;
        if (messageObject2 != null) {
            this.lastSendState = messageObject2.messageOwner.send_state;
        }
        update(0, z2);
    }

    public void setDialog(long j, MessageObject messageObject, ArrayList arrayList, int i, boolean z, boolean z2) {
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.useMeForMyMessages = z;
        this.isDialogCell = false;
        this.lastMessageDate = i;
        this.currentEditDate = messageObject != null ? messageObject.messageOwner.edit_date : 0;
        this.unreadCount = 0;
        this.markUnread = false;
        this.messageId = messageObject != null ? messageObject.getId() : 0;
        this.mentionCount = 0;
        this.reactionMentionCount = 0;
        this.pollVotesMentionCount = 0;
        this.lastUnreadState = messageObject != null && messageObject.isUnread();
        this.groupMessages = arrayList;
        MessageObject messageObject2 = this.message;
        if (messageObject2 != null) {
            this.lastSendState = messageObject2.messageOwner.send_state;
        }
        update(0, z2);
    }

    public long getDialogId() {
        return this.currentDialogId;
    }

    public int getMessageId() {
        return this.messageId;
    }

    public void setPreloader(DialogsAdapter.DialogsPreloader dialogsPreloader) {
        this.preloader = dialogsPreloader;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isSliding = false;
        this.drawRevealBackground = false;
        this.currentRevealProgress = 0.0f;
        this.attachedToWindow = false;
        this.reorderIconProgress = (getIsPinned() && this.drawReorder) ? 1.0f : 0.0f;
        this.avatarImage.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.thumbImage;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].onDetachedFromWindow();
            i++;
        }
        RLottieDrawable rLottieDrawable = this.translationDrawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
            this.translationDrawable.setProgress(0.0f);
            this.translationDrawable.setCallback(null);
            this.translationDrawable = null;
            this.translationAnimationStarted = false;
        }
        DialogsAdapter.DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.remove(this.currentDialogId);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.detach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerification;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.detach();
        }
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack2);
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack3);
        AnimatedEmojiSpan.release(this, this.animatedEmojiStackName);
        this.storyParams.onDetachFromWindow();
        this.canvasButton = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarImage.onAttachedToWindow();
        int i = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.thumbImage;
            if (i >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i].onAttachedToWindow();
            i++;
        }
        resetPinnedArchiveState();
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack, this.messageLayout);
        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
        this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
        this.animatedEmojiStackName = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStackName, this.nameLayout);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.attach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerification;
        if (swapAnimatedEmojiDrawable2 != null) {
            swapAnimatedEmojiDrawable2.attach();
        }
    }

    public void resetPinnedArchiveState() {
        boolean z = SharedConfig.archiveHidden;
        this.archiveHidden = z;
        float f = z ? 0.0f : 1.0f;
        this.archiveBackgroundProgress = f;
        this.avatarDrawable.setArchivedAvatarHiddenProgress(f);
        this.clipProgress = 0.0f;
        this.isSliding = false;
        this.reorderIconProgress = (getIsPinned() && this.drawReorder) ? 1.0f : 0.0f;
        this.attachedToWindow = true;
        this.cornerProgress = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
        if (swapAnimatedEmojiDrawable != null && this.attachedToWindow) {
            swapAnimatedEmojiDrawable.attach();
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerification;
        if (swapAnimatedEmojiDrawable2 == null || !this.attachedToWindow) {
            return;
        }
        swapAnimatedEmojiDrawable2.attach();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        View view = this.emojiStatusView;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        if (this.isTopic) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault) + ((!hasTags() || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !isForumCell())) ? 0 : isForumCell() ? this.addForumHeightForTags : this.addHeightForTags)) + (this.useSeparator ? 1 : 0));
            checkTwoLinesForName();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), computeHeight());
        this.topClip = 0;
        this.bottomClip = getMeasuredHeight();
    }

    private int computeHeight() {
        if (isForumCell() && !this.isTransitionSupport && !this.collapsed) {
            int dp = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 86.0f : 91.0f);
            if (this.useSeparator) {
                dp++;
            }
            return hasTags() ? dp + AndroidUtilities.dp(this.addForumHeightForTags) : dp;
        }
        return getCollapsedHeight();
    }

    private int getCollapsedHeight() {
        int dp = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault) + 1;
        if (this.twoLinesForName) {
            dp += AndroidUtilities.dp(20.0f);
        }
        if (!hasTags()) {
            return dp;
        }
        if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !isForumCell()) {
            return dp;
        }
        return dp + AndroidUtilities.dp(isForumCell() ? this.addForumHeightForTags : this.addHeightForTags);
    }

    private void checkTwoLinesForName() {
        this.twoLinesForName = false;
        if (!this.isTopic || hasTags()) {
            return;
        }
        buildLayout();
        if (this.nameIsEllipsized) {
            this.twoLinesForName = true;
            buildLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int dp;
        if (this.currentDialogId == 0 && this.customDialog == null) {
            return;
        }
        View view = this.emojiStatusView;
        if (view != null) {
            view.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
        }
        if (this.checkBox != null) {
            int dp2 = AndroidUtilities.dp(this.messagePaddingStart - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 29 : 27));
            if (this.inPreviewMode) {
                dp2 = AndroidUtilities.dp(8.0f);
                dp = (getMeasuredHeight() - this.checkBox.getMeasuredHeight()) >> 1;
            } else {
                if (LocaleController.isRTL) {
                    dp2 = (i3 - i) - dp2;
                }
                dp = AndroidUtilities.dp(this.chekBoxPaddingTop + ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6 : 0));
            }
            CheckBox2 checkBox2 = this.checkBox;
            checkBox2.layout(dp2, dp, checkBox2.getMeasuredWidth() + dp2, this.checkBox.getMeasuredHeight() + dp);
        }
        int measuredHeight = (getMeasuredHeight() + getMeasuredWidth()) << 16;
        if (measuredHeight != this.lastSize || this.updateLayout) {
            this.updateLayout = false;
            this.lastSize = measuredHeight;
            try {
                buildLayout();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public boolean getHasUnread() {
        return this.unreadCount != 0 || this.markUnread;
    }

    public boolean getIsMuted() {
        return this.dialogMuted;
    }

    public boolean getIsPinned() {
        return this.drawPin || this.drawPinForced;
    }

    public void setPinForced(boolean z) {
        this.drawPinForced = z;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            buildLayout();
        }
        invalidate();
    }

    private CharSequence formatArchivedDialogNames() {
        TLRPC.User user;
        String escape;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.currentDialogFolderId);
        this.currentDialogFolderDialogsCount = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = dialogs.get(i);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(dialog.id)));
                    user = encryptedChat != null ? messagesController.getUser(Long.valueOf(encryptedChat.user_id)) : null;
                } else if (DialogObject.isUserDialog(dialog.id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.id));
                    user = null;
                }
                if (chat != null) {
                    escape = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else if (UserObject.isDeleted(user)) {
                    escape = LocaleController.getString(R.string.HiddenName);
                } else {
                    escape = AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = escape.length() + length;
                spannableStringBuilder.append((CharSequence) escape);
                if (dialog.unread_count > 0) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        if (MessagesController.getInstance(this.currentAccount).storiesController.getTotalStoriesCount(true) > 0) {
            int max = Math.max(1, MessagesController.getInstance(this.currentAccount).storiesController.getTotalStoriesCount(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Stories", max, new Object[0]));
        }
        return Emoji.replaceEmoji(spannableStringBuilder, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
    }

    private CharSequence formatCommunityDialogNames() {
        TLRPC.User user;
        String escape;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.currentDialogId);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.id)) {
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(dialog.id)));
                    user = encryptedChat != null ? messagesController.getUser(Long.valueOf(encryptedChat.user_id)) : null;
                } else if (DialogObject.isUserDialog(dialog.id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.id));
                    user = null;
                }
                if (chat != null) {
                    escape = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else if (UserObject.isDeleted(user)) {
                    escape = LocaleController.getString(R.string.HiddenName);
                } else {
                    escape = AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = escape.length() + length;
                spannableStringBuilder.append((CharSequence) escape);
                if (dialog.unread_count > 0) {
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
    }

    public boolean hasTags() {
        DialogCellTags dialogCellTags = this.tags;
        return (dialogCellTags == null || dialogCellTags.isEmpty()) ? false : true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:292|293|294|(3:295|296|(5:298|(3:300|(1:302)|303)|304|(1:306)|303))|307|308|(3:310|(5:312|(1:337)(4:316|(2:318|(2:320|(1:322)))|326|(2:328|(2:330|(4:332|(1:336)|324|325))))|323|324|325)|338)|339|(35:341|(1:343)|344|345|(1:347)|567|(1:(20:570|(1:574)|357|358|(1:565)(1:362)|363|364|(5:556|(1:559)|560|(1:562)(1:564)|563)(3:368|(2:370|(1:374))|375)|376|377|378|379|380|381|382|(10:384|(9:388|(1:390)|391|(1:393)|394|(2:424|(1:426)(1:427))(2:400|(1:402)(2:409|(1:411)(2:412|(3:414|(1:416)(1:418)|417)(1:419))))|403|404|(2:406|(1:408)))|428|(4:432|(1:(1:442)(2:434|(1:436)(2:437|438)))|439|(1:441))|443|(1:493)(3:447|(1:(2:449|(1:451)(2:452|453))(2:491|492))|(1:455))|456|(2:462|(1:464))|465|(4:469|(1:471)|472|473))(10:494|(8:498|(1:500)|501|(4:503|(1:505)|506|(1:508))|509|(1:511)|512|(1:514))|515|(4:519|(1:521)|522|523)|524|(4:528|(1:530)|531|532)|533|(4:537|(1:539)|540|541)|542|(1:546))|474|(3:(1:488)(1:483)|484|(1:486)(1:487))|489|490))|349|(1:566)(1:355)|356|357|358|(1:360)|565|363|364|(1:366)|554|556|(1:559)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(6:476|478|(1:481)|488|484|(0)(0))|489|490)|575|(3:577|578|(34:580|581|(25:583|358|(0)|565|363|364|(0)|554|556|(0)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(0)|489|490)|345|(0)|349|(1:351)|566|356|357|358|(0)|565|363|364|(0)|554|556|(0)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(0)|489|490))|344|345|(0)|567|570|(6:572|574|349|(0)|566|356)|357|358|(0)|565|363|364|(0)|554|556|(0)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(0)|489|490) */
    /* JADX WARN: Can't wrap try/catch for region: R(74:5|(1:1975)(2:11|(1:15))|16|(1:18)|19|(1:1974)(1:25)|26|(1:1973)(1:30)|31|(1:33)|34|(1:1972)(1:38)|39|(1:41)|42|(1:44)(1:1965)|45|(7:47|(1:49)|50|51|(1:53)|54|55)|56|(1:58)(1:1964)|59|(9:61|(2:63|(2:909|(1:911)(1:912))(2:67|(1:69)(1:908)))(4:913|(1:930)(1:917)|918|(2:926|(1:928)(1:929))(2:922|(1:924)(1:925)))|70|(3:72|(1:74)(4:895|(1:897)|898|(1:903)(1:902))|75)(3:904|(1:906)|907)|76|(1:78)(1:894)|79|(1:81)(1:(1:890)(1:(1:892)(1:893)))|82)(43:931|(2:1960|(1:1962)(1:1963))(2:935|(1:937)(1:1959))|938|(2:940|(2:942|(2:950|(1:952)(1:953))(2:946|(1:948)(1:949))))(2:1883|(44:1887|(3:1889|(1:1891)(2:1900|(1:1902)(2:1903|(1:1905)(5:1906|(1:1918)(1:1910)|1911|(1:1917)(1:1915)|1916)))|1892)(2:1919|(8:1921|(1:1923)(2:1939|(1:1941)(11:1942|(1:1957)(1:1946)|1947|(1:1956)(2:1951|(7:1953|1954|1925|(2:1927|(3:1931|1932|(39:1934|(1:1936)(1:1937)|1894|1895|(1:1899)|955|(1:959)|960|(6:962|(1:964)(1:1868)|965|(1:967)(1:1867)|968|(1:972))(2:1869|(5:1874|(1:1876)(1:1882)|1877|(1:1879)(1:1881)|1880)(1:1873))|973|(3:(2:1855|(26:1857|(1:1859)|985|986|987|(11:989|(1:991)(1:1240)|992|(4:994|(1:996)|997|(1:999))|1000|(1:1002)(1:1239)|1003|(1:1005)(1:1238)|1006|(2:1008|(1:1011))|1012)(2:1241|(1:1243)(22:(6:1245|(1:1247)(1:1833)|1248|(1:1250)(1:1832)|(1:1252)(1:1831)|1253)(1:1834)|1254|(5:1778|1779|(7:1795|(2:1823|(1:1825)(1:(2:1827|(1:1829))(1:1830)))(1:1799)|1800|(2:1802|(3:1806|(1:1808)(1:1810)|1809))(2:1820|(1:1822))|1811|(1:1819)(1:1815)|1816)(2:1785|(2:1794|1791)(1:1789))|1790|1791)(5:1258|(1:1260)(2:1264|(2:1266|(1:1268)(2:1269|(1:1271)(5:1272|(2:1274|(1:1276)(2:1277|(1:1279)(2:1280|(1:1282)(2:1283|(2:1285|(1:1287)(1:1288))))))(2:1290|(4:1294|(1:1300)(1:1298)|1299|1263))|1289|1262|1263)))(14:1301|(1:1303)(1:1777)|1304|(2:1318|(11:1320|(10:1322|(8:1324|(1:1326)(3:1768|(1:1770)(1:1772)|1771)|(1:1328)(6:1338|(4:1340|(4:1342|(2:1344|(2:1346|(1:1348)(2:1352|(1:1354)(1:1355))))|1356|(1:1358)(2:1359|(1:1361)(2:1362|(1:1364)(1:1365))))(1:1366)|1349|1350)(2:1367|(7:1378|(1:(2:1393|(23:1429|1430|(1:1767)(1:1438)|1439|(4:1515|(2:1517|(4:(1:1520)|1522|(1:1524)|1526))|1528|(8:1536|(2:1538|(5:1540|(1:1552)|1546|1547|(2:1549|(1:1551)))(2:1553|(4:1560|(2:1562|(2:1567|(1:1569)(2:1570|(1:1572)(1:1573))))|1574|(2:1617|(3:1619|(2:1621|(1:1623)(1:1625))(2:1626|(1:1628)(1:1629))|1624)(2:1630|(4:1632|(4:1634|(1:1636)(1:1641)|1637|1638)(3:1642|(1:1644)(1:1646)|1645)|1639|1640)(6:1647|(5:1649|(2:1651|(3:1653|(1:1655)(1:1669)|1656))|1670|(0)(0)|1656)(2:1671|(1:1673)(2:1674|(3:1676|(1:1682)(1:1680)|1681)(2:1683|(2:1685|(1:1690)(1:1689))(2:1691|(1:1693)(2:1694|(1:1696)(2:1697|(1:1699)(2:1700|(3:1714|(4:1722|(1:1724)|1725|(2:1727|(3:1729|(1:1731)(1:1733)|1732)))(2:1718|(1:1720))|1721)(2:1704|(3:1706|(2:1708|(1:1710))(1:1712)|1711)(1:1713)))))))))|1657|1658|(2:1663|(2:1665|(1:1667)))|1662)))(4:1578|(1:1580)(2:1604|(1:1606)(2:1607|(1:1609)(2:1610|(1:1612)(2:1613|(1:1615)(1:1616)))))|1581|(3:1596|(3:1598|(1:1600)(1:1602)|1601)|1603)(4:1585|(2:1587|(1:1589)(1:1590))|(1:1594)|1595)))(1:1559)))|1734|(1:1736)(1:1766)|1737|(7:1739|(3:1756|(1:1758)|1759)(2:1743|(1:1745))|1746|(1:1748)(1:1755)|1749|(2:1751|(1:1753))|1754)|1760|(1:1765)(1:1764)))|1449|(1:1451)|1452|(2:1460|(15:1462|(1:1506)(1:1466)|1467|1468|1469|(1:1505)(5:1475|1476|1477|1478|1479)|1480|(2:1482|(1:1484))|1485|(4:1487|(1:1489)|1490|(1:1492)(1:1493))|1494|1386|1331|(1:1333)(2:1335|(1:1337))|1334))|1507|1468|1469|(2:1471|1501)|1505|1480|(0)|1485|(0)|1494|1386|1331|(0)(0)|1334)(10:1399|(2:1401|(4:1403|(1:1405)(1:1414)|1406|1407)(3:1415|(1:1417)(1:1419)|1418))(2:1420|(2:1425|(1:1427)(1:1428))(8:1424|1409|(1:1411)(1:1413)|1412|1330|1331|(0)(0)|1334))|1408|1409|(0)(0)|1412|1330|1331|(0)(0)|1334))(1:1392))(1:1384)|1385|1386|1331|(0)(0)|1334)(3:1371|(1:1377)(1:1375)|1376))|1351|1331|(0)(0)|1334)|1329|1330|1331|(0)(0)|1334)|1773|1774|(0)(0)|1329|1330|1331|(0)(0)|1334)|1775|1773|1774|(0)(0)|1329|1330|1331|(0)(0)|1334))|1776|1775|1773|1774|(0)(0)|1329|1330|1331|(0)(0)|1334))|1261|1262|1263)|1014|(2:1016|(2:1018|(2:1020|(2:1022|(2:1024|(2:1026|(2:1028|(3:1030|(1:1034)|1035))))))))|1036|(1:1038)(11:1229|(1:1231)(2:1232|(1:1234)(2:1235|(1:1237)))|1040|(4:1219|1220|(1:1228)(1:1226)|1227)(6:1044|(4:1046|(1:(1:1049)(2:1194|1051))(1:1195)|1050|1051)(9:1196|(1:1198)(2:1212|(1:1214)(2:1215|(1:1217)(1:1218)))|1199|(1:1201)(1:1211)|1202|(1:1204)(1:1210)|1205|(1:1207)(1:1209)|1208)|1052|(2:1057|(3:1059|(1:1061)(2:1154|(1:1156)(2:1157|(1:1192)(4:1159|(3:1161|(1:1163)(1:1167)|1164)(2:1168|(3:1170|(1:1182)(1:1174)|1175)(3:1183|(1:1191)(1:1189)|1190))|1165|1166)))|1062))|1193|1062)|1063|(2:1067|(5:1069|1070|1071|(2:1074|(1:1076)(4:1077|(3:1079|(3:1081|(1:1083)|1084)(2:1093|(5:1095|(1:1097)|1098|(1:1100)(1:1102)|1101)(3:1103|(1:1112)(2:1107|(1:1109)(1:1110))|1111))|1092)(3:1113|(3:1115|(1:1117)(2:1118|(1:1120)(2:1121|(2:1135|(4:1137|(1:1139)|1140|(1:1142)(1:1143))(1:1144))(2:1125|(1:1127)(2:1128|(1:1130)(3:1131|(1:1133)|1134)))))|1111)|1086)|(1:1090)|1091))|1073)(2:1145|(4:1147|(1:1149)|1150|(4:1152|1071|(0)|1073))))|1153|1070|1071|(0)|1073)|1039|1040|(1:1042)|1219|1220|(1:1222)|1228|1227|1063|(3:1065|1067|(0)(0))|1153|1070|1071|(0)|1073))|1013|1014|(0)|1036|(0)(0)|1039|1040|(0)|1219|1220|(0)|1228|1227|1063|(0)|1153|1070|1071|(0)|1073))|1861|(2:1863|(1:1865)))|977|(2:979|(2:981|(26:983|(1:1835)|985|986|987|(0)(0)|1013|1014|(0)|1036|(0)(0)|1039|1040|(0)|1219|1220|(0)|1228|1227|1063|(0)|1153|1070|1071|(0)|1073)))|1837|(23:1849|987|(0)(0)|1013|1014|(0)|1036|(0)(0)|1039|1040|(0)|1219|1220|(0)|1228|1227|1063|(0)|1153|1070|1071|(0)|1073)|985|986|987|(0)(0)|1013|1014|(0)|1036|(0)(0)|1039|1040|(0)|1219|1220|(0)|1228|1227|1063|(0)|1153|1070|1071|(0)|1073)))|1938|1932|(0)))|1955|1954|1925|(0)|1938|1932|(0)))|1924|1925|(0)|1938|1932|(0))(41:1958|1895|(2:1897|1899)|955|(2:957|959)|960|(0)(0)|973|(1:975)|(4:1851|1853|1855|(0))|1861|(0)|977|(0)|1837|(2:1839|1841)|1843|1845|1849|987|(0)(0)|1013|1014|(0)|1036|(0)(0)|1039|1040|(0)|1219|1220|(0)|1228|1227|1063|(0)|1153|1070|1071|(0)|1073))|1893|1894|1895|(0)|955|(0)|960|(0)(0)|973|(0)|(0)|1861|(0)|977|(0)|1837|(0)|1843|1845|1849|987|(0)(0)|1013|1014|(0)|1036|(0)(0)|1039|1040|(0)|1219|1220|(0)|1228|1227|1063|(0)|1153|1070|1071|(0)|1073))|954|955|(0)|960|(0)(0)|973|(0)|(0)|1861|(0)|977|(0)|1837|(0)|1843|1845|1849|987|(0)(0)|1013|1014|(0)|1036|(0)(0)|1039|1040|(0)|1219|1220|(0)|1228|1227|1063|(0)|1153|1070|1071|(0)|1073)|(4:84|(1:86)(1:887)|87|(1:89)(1:886))(1:888)|90|(3:92|(1:94)(1:884)|95)(1:885)|96|(1:98)(1:883)|99|(3:101|(1:103)|104)|105|(2:107|(1:109)(1:870))(2:871|(2:873|(2:875|(1:877)(1:878))(2:879|(1:881)(1:882))))|110|111|(1:869)(1:119)|120|(1:(4:840|(1:842)|843|(1:845))(2:846|(2:848|(1:850))(2:851|(2:853|(1:855))(2:856|(4:858|(1:860)(1:864)|861|(1:863))))))(4:124|(1:126)|127|(1:129))|130|(1:132)|133|(2:135|(1:137))|(18:138|139|(1:141)|142|(1:144)|145|(3:147|(1:149)(1:828)|150)(2:829|(3:831|(1:833)(1:835)|834))|151|(1:153)(1:827)|154|(1:156)|157|(1:826)(1:163)|164|(1:166)(1:825)|167|(1:824)(1:171)|172)|173|(6:796|(1:798)(1:822)|799|800|(2:801|(5:803|(1:805)(1:819)|806|(2:817|818)(2:814|815)|816)(1:820))|821)(10:177|(1:179)(1:795)|180|181|(1:183)(1:794)|184|(1:186)(1:793)|187|(2:188|(5:190|(1:192)(1:206)|193|(2:204|205)(2:201|202)|203)(1:207))|208)|209|(1:211)(1:792)|212|(1:214)|215|(1:223)|224|(2:226|(1:228)(1:229))|230|(2:232|(1:234)(1:655))(1:(20:(4:691|(1:693)(1:788)|694|695)(1:789)|(6:697|(1:699)(1:786)|700|(3:702|(1:704)(1:780)|705)(3:781|(1:783)(1:785)|784)|706|707)(1:787)|708|(2:710|(4:712|(3:714|(1:716)(1:718)|717)|719|(3:721|(1:723)(1:725)|724))(5:726|(3:728|(1:730)(1:732)|731)|733|(3:735|(1:737)(1:739)|738)|740))|741|(2:743|(6:745|(1:747)|748|(3:750|(1:752)(1:754)|753)|755|(3:757|(1:759)(1:761)|760))(7:762|(1:764)|765|(3:767|(1:769)(1:771)|770)|772|(3:774|(1:776)(1:778)|777)|779))|(7:(1:238)|239|(1:241)|242|(1:255)(1:246)|247|(1:251))|256|(1:654)(1:260)|261|(3:267|(1:269)(1:271)|270)|272|(4:274|(1:599)(1:278)|279|(2:280|(1:282)(1:283)))(2:600|(8:628|629|(1:635)|636|637|(1:647)(1:641)|642|(2:643|(1:645)(1:646)))(3:604|605|(4:610|(1:620)(1:614)|615|(2:616|(1:618)(1:619)))(1:609)))|284|285|(1:287)|288|289|290|(44:292|293|294|295|296|(5:298|(3:300|(1:302)|303)|304|(1:306)|303)|307|308|(3:310|(5:312|(1:337)(4:316|(2:318|(2:320|(1:322)))|326|(2:328|(2:330|(4:332|(1:336)|324|325))))|323|324|325)|338)|339|(35:341|(1:343)|344|345|(1:347)|567|(1:(20:570|(1:574)|357|358|(1:565)(1:362)|363|364|(5:556|(1:559)|560|(1:562)(1:564)|563)(3:368|(2:370|(1:374))|375)|376|377|378|379|380|381|382|(10:384|(9:388|(1:390)|391|(1:393)|394|(2:424|(1:426)(1:427))(2:400|(1:402)(2:409|(1:411)(2:412|(3:414|(1:416)(1:418)|417)(1:419))))|403|404|(2:406|(1:408)))|428|(4:432|(1:(1:442)(2:434|(1:436)(2:437|438)))|439|(1:441))|443|(1:493)(3:447|(1:(2:449|(1:451)(2:452|453))(2:491|492))|(1:455))|456|(2:462|(1:464))|465|(4:469|(1:471)|472|473))(10:494|(8:498|(1:500)|501|(4:503|(1:505)|506|(1:508))|509|(1:511)|512|(1:514))|515|(4:519|(1:521)|522|523)|524|(4:528|(1:530)|531|532)|533|(4:537|(1:539)|540|541)|542|(1:546))|474|(3:(1:488)(1:483)|484|(1:486)(1:487))|489|490))|349|(1:566)(1:355)|356|357|358|(1:360)|565|363|364|(1:366)|554|556|(1:559)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(6:476|478|(1:481)|488|484|(0)(0))|489|490)|575|(3:577|578|(34:580|581|(25:583|358|(0)|565|363|364|(0)|554|556|(0)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(0)|489|490)|345|(0)|349|(1:351)|566|356|357|358|(0)|565|363|364|(0)|554|556|(0)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(0)|489|490))|344|345|(0)|567|570|(6:572|574|349|(0)|566|356)|357|358|(0)|565|363|364|(0)|554|556|(0)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(0)|489|490)(45:593|594|595|294|295|296|(0)|307|308|(0)|339|(0)|575|(0)|344|345|(0)|567|570|(0)|357|358|(0)|565|363|364|(0)|554|556|(0)|560|(0)(0)|563|376|377|378|379|380|381|382|(0)(0)|474|(0)|489|490))(2:662|(1:689)(6:674|(1:688)(2:678|(1:680)(1:687))|681|(1:683)(1:686)|684|685)))|235|(0)|256|(1:258)|654|261|(14:263|265|267|(0)(0)|270|272|(0)(0)|284|285|(0)|288|289|290|(0)(0))|652|265|267|(0)(0)|270|272|(0)(0)|284|285|(0)|288|289|290|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:1085:0x15d5, code lost:
    
        if (r8 == null) goto L1124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1521:0x0b4b, code lost:
    
        if (r14.id != r2) goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1525:0x0b59, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r7.chat) != false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1527:0x0b61, code lost:
    
        if (org.telegram.ui.Components.Forum.ForumUtilities.isTopicCreateMessage(r7.message) == false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1668:0x0f88, code lost:
    
        if (org.telegram.messenger.MessageObject.isBlueBlock(r7.message.messageOwner.rich_message.blocks.get(0)) != false) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1836:0x0649, code lost:
    
        if (r0.post_messages == false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1860:0x0620, code lost:
    
        if (r5.reply_to_msg_id == 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1866:0x062f, code lost:
    
        if (r7.unreadCount != 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x255a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x255b, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x255d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x255e, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x12f8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x17e6  */
    /* JADX WARN: Removed duplicated region for block: B:1038:0x1374  */
    /* JADX WARN: Removed duplicated region for block: B:1042:0x13a8  */
    /* JADX WARN: Removed duplicated region for block: B:1065:0x1535  */
    /* JADX WARN: Removed duplicated region for block: B:1069:0x1548  */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x159b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x1803  */
    /* JADX WARN: Removed duplicated region for block: B:1145:0x1550  */
    /* JADX WARN: Removed duplicated region for block: B:1222:0x1501  */
    /* JADX WARN: Removed duplicated region for block: B:1229:0x1379  */
    /* JADX WARN: Removed duplicated region for block: B:1241:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:1328:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x199d  */
    /* JADX WARN: Removed duplicated region for block: B:1333:0x11ea  */
    /* JADX WARN: Removed duplicated region for block: B:1335:0x11f8  */
    /* JADX WARN: Removed duplicated region for block: B:1338:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x19ac  */
    /* JADX WARN: Removed duplicated region for block: B:1411:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:1413:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x19c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x19c8 A[Catch: Exception -> 0x19d3, TryCatch #8 {Exception -> 0x19d3, blocks: (B:139:0x19ba, B:142:0x19c4, B:144:0x19c8, B:145:0x19d6, B:147:0x19da, B:150:0x19f4, B:151:0x1a22, B:154:0x1a38, B:156:0x1a3e, B:157:0x1a4a, B:159:0x1a5d, B:161:0x1a63, B:164:0x1a74, B:166:0x1a78, B:167:0x1ab6, B:169:0x1aba, B:171:0x1ac3, B:172:0x1acb, B:825:0x1a99, B:829:0x1a02, B:831:0x1a06, B:834:0x1a20), top: B:138:0x19ba }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x19da A[Catch: Exception -> 0x19d3, TryCatch #8 {Exception -> 0x19d3, blocks: (B:139:0x19ba, B:142:0x19c4, B:144:0x19c8, B:145:0x19d6, B:147:0x19da, B:150:0x19f4, B:151:0x1a22, B:154:0x1a38, B:156:0x1a3e, B:157:0x1a4a, B:159:0x1a5d, B:161:0x1a63, B:164:0x1a74, B:166:0x1a78, B:167:0x1ab6, B:169:0x1aba, B:171:0x1ac3, B:172:0x1acb, B:825:0x1a99, B:829:0x1a02, B:831:0x1a06, B:834:0x1a20), top: B:138:0x19ba }] */
    /* JADX WARN: Removed duplicated region for block: B:1482:0x1171  */
    /* JADX WARN: Removed duplicated region for block: B:1487:0x1182  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x1a35  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x1a3e A[Catch: Exception -> 0x19d3, TryCatch #8 {Exception -> 0x19d3, blocks: (B:139:0x19ba, B:142:0x19c4, B:144:0x19c8, B:145:0x19d6, B:147:0x19da, B:150:0x19f4, B:151:0x1a22, B:154:0x1a38, B:156:0x1a3e, B:157:0x1a4a, B:159:0x1a5d, B:161:0x1a63, B:164:0x1a74, B:166:0x1a78, B:167:0x1ab6, B:169:0x1aba, B:171:0x1ac3, B:172:0x1acb, B:825:0x1a99, B:829:0x1a02, B:831:0x1a06, B:834:0x1a20), top: B:138:0x19ba }] */
    /* JADX WARN: Removed duplicated region for block: B:1655:0x0dad  */
    /* JADX WARN: Removed duplicated region for block: B:1669:0x0db0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1a78 A[Catch: Exception -> 0x19d3, TryCatch #8 {Exception -> 0x19d3, blocks: (B:139:0x19ba, B:142:0x19c4, B:144:0x19c8, B:145:0x19d6, B:147:0x19da, B:150:0x19f4, B:151:0x1a22, B:154:0x1a38, B:156:0x1a3e, B:157:0x1a4a, B:159:0x1a5d, B:161:0x1a63, B:164:0x1a74, B:166:0x1a78, B:167:0x1ab6, B:169:0x1aba, B:171:0x1ac3, B:172:0x1acb, B:825:0x1a99, B:829:0x1a02, B:831:0x1a06, B:834:0x1a20), top: B:138:0x19ba }] */
    /* JADX WARN: Removed duplicated region for block: B:1839:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:1851:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:1857:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:1863:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:1869:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:1897:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:1927:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:1934:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x1d33  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1d5f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1d9c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1dc4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x2137  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x218c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x21a0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x21b8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x21bb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x21ca  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x22be  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x22e1 A[Catch: Exception -> 0x232e, TRY_LEAVE, TryCatch #2 {Exception -> 0x232e, blocks: (B:290:0x22d9, B:292:0x22e1), top: B:289:0x22d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x2349 A[Catch: Exception -> 0x2352, TryCatch #9 {Exception -> 0x2352, blocks: (B:296:0x2343, B:298:0x2349, B:300:0x234d, B:303:0x2380, B:304:0x2354, B:306:0x235a), top: B:295:0x2343 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x23b0 A[Catch: Exception -> 0x23df, TryCatch #1 {Exception -> 0x23df, blocks: (B:308:0x23ac, B:310:0x23b0, B:312:0x23c2, B:314:0x23c8, B:316:0x23cc, B:318:0x23d4, B:320:0x23da, B:323:0x2402, B:325:0x2406, B:326:0x23e3, B:328:0x23e7, B:330:0x23eb, B:332:0x23ef, B:334:0x23f3, B:339:0x2408, B:341:0x240c, B:345:0x2432, B:347:0x2436, B:349:0x2458, B:351:0x245e, B:353:0x2462, B:355:0x2475, B:358:0x24a2, B:360:0x24a6, B:362:0x24aa, B:364:0x24b2, B:366:0x24b6, B:368:0x24f9, B:370:0x24fd, B:372:0x250f, B:374:0x2515, B:375:0x2529, B:554:0x24ba, B:556:0x24c0, B:559:0x24c6, B:560:0x24cd, B:563:0x24df, B:565:0x24af, B:566:0x2492, B:567:0x243a, B:570:0x2442, B:572:0x244a, B:575:0x2413, B:583:0x2422), top: B:307:0x23ac }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x240c A[Catch: Exception -> 0x23df, TryCatch #1 {Exception -> 0x23df, blocks: (B:308:0x23ac, B:310:0x23b0, B:312:0x23c2, B:314:0x23c8, B:316:0x23cc, B:318:0x23d4, B:320:0x23da, B:323:0x2402, B:325:0x2406, B:326:0x23e3, B:328:0x23e7, B:330:0x23eb, B:332:0x23ef, B:334:0x23f3, B:339:0x2408, B:341:0x240c, B:345:0x2432, B:347:0x2436, B:349:0x2458, B:351:0x245e, B:353:0x2462, B:355:0x2475, B:358:0x24a2, B:360:0x24a6, B:362:0x24aa, B:364:0x24b2, B:366:0x24b6, B:368:0x24f9, B:370:0x24fd, B:372:0x250f, B:374:0x2515, B:375:0x2529, B:554:0x24ba, B:556:0x24c0, B:559:0x24c6, B:560:0x24cd, B:563:0x24df, B:565:0x24af, B:566:0x2492, B:567:0x243a, B:570:0x2442, B:572:0x244a, B:575:0x2413, B:583:0x2422), top: B:307:0x23ac }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x2436 A[Catch: Exception -> 0x23df, TryCatch #1 {Exception -> 0x23df, blocks: (B:308:0x23ac, B:310:0x23b0, B:312:0x23c2, B:314:0x23c8, B:316:0x23cc, B:318:0x23d4, B:320:0x23da, B:323:0x2402, B:325:0x2406, B:326:0x23e3, B:328:0x23e7, B:330:0x23eb, B:332:0x23ef, B:334:0x23f3, B:339:0x2408, B:341:0x240c, B:345:0x2432, B:347:0x2436, B:349:0x2458, B:351:0x245e, B:353:0x2462, B:355:0x2475, B:358:0x24a2, B:360:0x24a6, B:362:0x24aa, B:364:0x24b2, B:366:0x24b6, B:368:0x24f9, B:370:0x24fd, B:372:0x250f, B:374:0x2515, B:375:0x2529, B:554:0x24ba, B:556:0x24c0, B:559:0x24c6, B:560:0x24cd, B:563:0x24df, B:565:0x24af, B:566:0x2492, B:567:0x243a, B:570:0x2442, B:572:0x244a, B:575:0x2413, B:583:0x2422), top: B:307:0x23ac }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x245e A[Catch: Exception -> 0x23df, TryCatch #1 {Exception -> 0x23df, blocks: (B:308:0x23ac, B:310:0x23b0, B:312:0x23c2, B:314:0x23c8, B:316:0x23cc, B:318:0x23d4, B:320:0x23da, B:323:0x2402, B:325:0x2406, B:326:0x23e3, B:328:0x23e7, B:330:0x23eb, B:332:0x23ef, B:334:0x23f3, B:339:0x2408, B:341:0x240c, B:345:0x2432, B:347:0x2436, B:349:0x2458, B:351:0x245e, B:353:0x2462, B:355:0x2475, B:358:0x24a2, B:360:0x24a6, B:362:0x24aa, B:364:0x24b2, B:366:0x24b6, B:368:0x24f9, B:370:0x24fd, B:372:0x250f, B:374:0x2515, B:375:0x2529, B:554:0x24ba, B:556:0x24c0, B:559:0x24c6, B:560:0x24cd, B:563:0x24df, B:565:0x24af, B:566:0x2492, B:567:0x243a, B:570:0x2442, B:572:0x244a, B:575:0x2413, B:583:0x2422), top: B:307:0x23ac }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x24a6 A[Catch: Exception -> 0x23df, TryCatch #1 {Exception -> 0x23df, blocks: (B:308:0x23ac, B:310:0x23b0, B:312:0x23c2, B:314:0x23c8, B:316:0x23cc, B:318:0x23d4, B:320:0x23da, B:323:0x2402, B:325:0x2406, B:326:0x23e3, B:328:0x23e7, B:330:0x23eb, B:332:0x23ef, B:334:0x23f3, B:339:0x2408, B:341:0x240c, B:345:0x2432, B:347:0x2436, B:349:0x2458, B:351:0x245e, B:353:0x2462, B:355:0x2475, B:358:0x24a2, B:360:0x24a6, B:362:0x24aa, B:364:0x24b2, B:366:0x24b6, B:368:0x24f9, B:370:0x24fd, B:372:0x250f, B:374:0x2515, B:375:0x2529, B:554:0x24ba, B:556:0x24c0, B:559:0x24c6, B:560:0x24cd, B:563:0x24df, B:565:0x24af, B:566:0x2492, B:567:0x243a, B:570:0x2442, B:572:0x244a, B:575:0x2413, B:583:0x2422), top: B:307:0x23ac }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x24b6 A[Catch: Exception -> 0x23df, TryCatch #1 {Exception -> 0x23df, blocks: (B:308:0x23ac, B:310:0x23b0, B:312:0x23c2, B:314:0x23c8, B:316:0x23cc, B:318:0x23d4, B:320:0x23da, B:323:0x2402, B:325:0x2406, B:326:0x23e3, B:328:0x23e7, B:330:0x23eb, B:332:0x23ef, B:334:0x23f3, B:339:0x2408, B:341:0x240c, B:345:0x2432, B:347:0x2436, B:349:0x2458, B:351:0x245e, B:353:0x2462, B:355:0x2475, B:358:0x24a2, B:360:0x24a6, B:362:0x24aa, B:364:0x24b2, B:366:0x24b6, B:368:0x24f9, B:370:0x24fd, B:372:0x250f, B:374:0x2515, B:375:0x2529, B:554:0x24ba, B:556:0x24c0, B:559:0x24c6, B:560:0x24cd, B:563:0x24df, B:565:0x24af, B:566:0x2492, B:567:0x243a, B:570:0x2442, B:572:0x244a, B:575:0x2413, B:583:0x2422), top: B:307:0x23ac }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x2579  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x2883  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x28bf  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x28c7  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x278d  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x24c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x24da  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x24dd  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x2442 A[Catch: Exception -> 0x23df, TryCatch #1 {Exception -> 0x23df, blocks: (B:308:0x23ac, B:310:0x23b0, B:312:0x23c2, B:314:0x23c8, B:316:0x23cc, B:318:0x23d4, B:320:0x23da, B:323:0x2402, B:325:0x2406, B:326:0x23e3, B:328:0x23e7, B:330:0x23eb, B:332:0x23ef, B:334:0x23f3, B:339:0x2408, B:341:0x240c, B:345:0x2432, B:347:0x2436, B:349:0x2458, B:351:0x245e, B:353:0x2462, B:355:0x2475, B:358:0x24a2, B:360:0x24a6, B:362:0x24aa, B:364:0x24b2, B:366:0x24b6, B:368:0x24f9, B:370:0x24fd, B:372:0x250f, B:374:0x2515, B:375:0x2529, B:554:0x24ba, B:556:0x24c0, B:559:0x24c6, B:560:0x24cd, B:563:0x24df, B:565:0x24af, B:566:0x2492, B:567:0x243a, B:570:0x2442, B:572:0x244a, B:575:0x2413, B:583:0x2422), top: B:307:0x23ac }] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x244a A[Catch: Exception -> 0x23df, TryCatch #1 {Exception -> 0x23df, blocks: (B:308:0x23ac, B:310:0x23b0, B:312:0x23c2, B:314:0x23c8, B:316:0x23cc, B:318:0x23d4, B:320:0x23da, B:323:0x2402, B:325:0x2406, B:326:0x23e3, B:328:0x23e7, B:330:0x23eb, B:332:0x23ef, B:334:0x23f3, B:339:0x2408, B:341:0x240c, B:345:0x2432, B:347:0x2436, B:349:0x2458, B:351:0x245e, B:353:0x2462, B:355:0x2475, B:358:0x24a2, B:360:0x24a6, B:362:0x24aa, B:364:0x24b2, B:366:0x24b6, B:368:0x24f9, B:370:0x24fd, B:372:0x250f, B:374:0x2515, B:375:0x2529, B:554:0x24ba, B:556:0x24c0, B:559:0x24c6, B:560:0x24cd, B:563:0x24df, B:565:0x24af, B:566:0x2492, B:567:0x243a, B:570:0x2442, B:572:0x244a, B:575:0x2413, B:583:0x2422), top: B:307:0x23ac }] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x2419 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x2330  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x21ef  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x1dfb  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x1d4a  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x1c6b  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x1cd2  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x1d29 A[EDGE_INSN: B:820:0x1d29->B:821:0x1d29 BREAK  A[LOOP:13: B:801:0x1ccd->B:816:0x1d10], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:822:0x1c8f  */
    /* JADX WARN: Removed duplicated region for block: B:825:0x1a99 A[Catch: Exception -> 0x19d3, TryCatch #8 {Exception -> 0x19d3, blocks: (B:139:0x19ba, B:142:0x19c4, B:144:0x19c8, B:145:0x19d6, B:147:0x19da, B:150:0x19f4, B:151:0x1a22, B:154:0x1a38, B:156:0x1a3e, B:157:0x1a4a, B:159:0x1a5d, B:161:0x1a63, B:164:0x1a74, B:166:0x1a78, B:167:0x1ab6, B:169:0x1aba, B:171:0x1ac3, B:172:0x1acb, B:825:0x1a99, B:829:0x1a02, B:831:0x1a06, B:834:0x1a20), top: B:138:0x19ba }] */
    /* JADX WARN: Removed duplicated region for block: B:827:0x1a37  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x1a02 A[Catch: Exception -> 0x19d3, TryCatch #8 {Exception -> 0x19d3, blocks: (B:139:0x19ba, B:142:0x19c4, B:144:0x19c8, B:145:0x19d6, B:147:0x19da, B:150:0x19f4, B:151:0x1a22, B:154:0x1a38, B:156:0x1a3e, B:157:0x1a4a, B:159:0x1a5d, B:161:0x1a63, B:164:0x1a74, B:166:0x1a78, B:167:0x1ab6, B:169:0x1aba, B:171:0x1ac3, B:172:0x1acb, B:825:0x1a99, B:829:0x1a02, B:831:0x1a06, B:834:0x1a20), top: B:138:0x19ba }] */
    /* JADX WARN: Removed duplicated region for block: B:840:0x1908  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x1930  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x1724  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x1831  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x17c7  */
    /* JADX WARN: Removed duplicated region for block: B:885:0x17ad  */
    /* JADX WARN: Removed duplicated region for block: B:888:0x1770  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x177d  */
    /* JADX WARN: Removed duplicated region for block: B:957:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:962:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:975:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:979:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:989:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x17b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildLayout() {
        String str;
        int i;
        boolean z;
        CharSequence charSequence;
        boolean z2;
        long j;
        long j2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        boolean z6;
        TLRPC.DraftMessage draftMessage4;
        CharSequence charSequence2;
        int i3;
        boolean z7;
        int i4;
        CharSequence charSequence3;
        CharSequence string;
        CharSequence charSequence4;
        boolean z8;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TL_iv.RichMessage richMessage;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        TLRPC.Chat chat;
        boolean z9;
        boolean z10;
        CharSequence charSequence9;
        CharSequence charSequence10;
        boolean z11;
        MessageObject messageObject;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence replaceNewLines;
        CharSequence charSequence13;
        char c;
        String str2;
        CharSequence charSequence14;
        CharSequence charSequence15;
        boolean isChannelAndNotMegaGroup;
        String formatPluralString;
        char c2;
        int i5;
        String formatPluralString2;
        String str3;
        MessageObject messageObject2;
        TLRPC.Message message;
        CharSequence charSequence16;
        int i6;
        CharSequence charSequence17;
        ForegroundColorSpanThemable foregroundColorSpanThemable;
        TLRPC.User user;
        MessageObject messageObject3;
        TLRPC.User user2;
        CharSequence charSequence18;
        CharSequence charSequence19;
        int i7;
        int i8;
        CharSequence charSequence20;
        CharSequence charSequence21;
        String str4;
        String str5;
        CharSequence charSequence22;
        CharSequence charSequence23;
        CharSequence charSequence24;
        CharSequence charSequence25;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence string2;
        CharSequence charSequence26;
        CharSequence string3;
        CharSequence charSequence27;
        CharSequence charSequence28;
        CharSequence charSequence29;
        CharSequence charSequence30;
        String stringForMessageListDate;
        DialogCell dialogCell;
        MessageObject messageObject4;
        boolean z12;
        String str6;
        String str7;
        MessagesController messagesController;
        String str8;
        CharSequence charSequence31;
        CharSequence charSequence32;
        String str9;
        CharSequence escape;
        String str10;
        String str11;
        CharSequence charSequence33;
        CharSequence charSequence34;
        boolean z13;
        String str12;
        int i9;
        CharSequence topicSpannedName;
        int i10;
        boolean z14;
        String str13;
        boolean z15;
        TLRPC.Chat chat2;
        MessageObject messageObject5;
        DialogCell dialogCell2;
        int i11;
        float f;
        int i12;
        boolean z16;
        int i13;
        int dp;
        int dp2;
        int dp3;
        int i14;
        int i15;
        ImageReceiver[] imageReceiverArr;
        int i16;
        int i17;
        DialogCellTags dialogCellTags;
        CharSequence charSequence35;
        int dp4;
        CharSequence highlightText;
        StaticLayout staticLayout;
        int i18;
        int i19;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i20;
        int lineCount4;
        int lineCount5;
        int i21;
        int lineCount6;
        CharSequence charSequence36;
        Layout.Alignment alignment;
        CharSequence ellipsize;
        CharSequence replaceTwoNewLinesToOne;
        CharSequence highlightText2;
        DialogCellTags dialogCellTags2;
        int dp5;
        int dp6;
        DialogCellTags dialogCellTags3;
        int dp7;
        CharSequence highlightText3;
        CharSequence charSequence37;
        boolean z17;
        SpannableStringBuilder formatInternal;
        DialogCell dialogCell3 = this;
        if (dialogCell3.isTransitionSupport) {
            return;
        }
        if (dialogCell3.isDialogCell && !dialogCell3.updateHelper.update() && dialogCell3.currentDialogFolderId == 0) {
            str = "**reaction**";
            if (dialogCell3.currentDialogCommunityId == 0 && dialogCell3.encryptedChat == null) {
                return;
            }
        } else {
            str = "**reaction**";
        }
        if (!dialogCell3.useForceThreeLines) {
            int i22 = SharedConfig.PASSCODE_TYPE_PIN;
        }
        Theme.dialogs_namePaint[0].setTextSize(AndroidUtilities.dp(17.0f));
        Theme.dialogs_nameEncryptedPaint[0].setTextSize(AndroidUtilities.dp(17.0f));
        Theme.dialogs_messagePaint[0].setTextSize(AndroidUtilities.dp(16.0f));
        Theme.dialogs_messagePrintingPaint[0].setTextSize(AndroidUtilities.dp(16.0f));
        Theme.dialogs_namePaint[1].setTextSize(AndroidUtilities.dp(16.0f));
        Theme.dialogs_nameEncryptedPaint[1].setTextSize(AndroidUtilities.dp(16.0f));
        Theme.dialogs_messagePaint[1].setTextSize(AndroidUtilities.dp(15.0f));
        Theme.dialogs_messagePrintingPaint[1].setTextSize(AndroidUtilities.dp(15.0f));
        TextPaint textPaint = Theme.dialogs_messagePaint[1];
        int color = Theme.getColor(Theme.key_chats_message_threeLines, dialogCell3.resourcesProvider);
        textPaint.linkColor = color;
        textPaint.setColor(color);
        dialogCell3.paintIndex = 1;
        dialogCell3.thumbSize = 18;
        dialogCell3.currentDialogFolderDialogsCount = 0;
        CharSequence charSequence38 = null;
        CharSequence printingString = (isForumCell() || !(dialogCell3.isDialogCell || dialogCell3.isTopic)) ? null : MessagesController.getInstance(dialogCell3.currentAccount).getPrintingString(dialogCell3.currentDialogId, getTopicId(), true);
        dialogCell3.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell3.paintIndex];
        dialogCell3.drawNameLock = false;
        dialogCell3.drawVerified = false;
        dialogCell3.drawBotVerified = false;
        dialogCell3.drawPremium = false;
        dialogCell3.drawForwardIcon = false;
        dialogCell3.drawGiftIcon = false;
        dialogCell3.drawScam = 0;
        dialogCell3.drawPinBackground = false;
        dialogCell3.thumbsCount = 0;
        dialogCell3.hasVideoThumb = false;
        dialogCell3.nameLayoutEllipsizeByGradient = false;
        boolean z18 = (UserObject.isUserSelf(dialogCell3.user) || dialogCell3.useMeForMyMessages) ? false : true;
        dialogCell3.printingStringType = -1;
        if (!isForumCell()) {
            dialogCell3.buttonLayout = null;
        }
        dialogCell3.setOpenBotButton(false);
        if ((!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.currentDialogFolderId != 0 || isForumCell() || hasTags()) {
            dialogCell3.hasNameInMessage = true;
            i = 1;
        } else {
            dialogCell3.hasNameInMessage = false;
            i = 2;
        }
        MessageObject messageObject6 = dialogCell3.message;
        if (messageObject6 != null) {
            messageObject6.updateTranslation();
        }
        MessageObject messageObject7 = dialogCell3.message;
        CharSequence charSequence39 = messageObject7 != null ? messageObject7.messageText : null;
        if (charSequence39 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence39);
            for (URLSpanNoUnderlineBold uRLSpanNoUnderlineBold : (URLSpanNoUnderlineBold[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderlineBold.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderlineBold);
            }
            for (URLSpanNoUnderline uRLSpanNoUnderline : (URLSpanNoUnderline[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderline.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderline);
            }
            charSequence39 = spannableStringBuilder;
        }
        dialogCell3.lastMessageString = charSequence39;
        if (dialogCell3.isShareToStoryCell) {
            dialogCell3.drawPinBackground = true;
            z18 = false;
            z = false;
        } else {
            z = true;
        }
        CustomDialog customDialog = dialogCell3.customDialog;
        if (customDialog != null) {
            if (customDialog.type == 2) {
                dialogCell3.drawNameLock = true;
                if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                    dialogCell3.nameLockTop = AndroidUtilities.dp(12.5f);
                    if (!LocaleController.isRTL) {
                        dialogCell3.nameLockLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 6);
                        dialogCell3.nameLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 10) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                    } else {
                        dialogCell3.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(dialogCell3.messagePaddingStart + 6)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        dialogCell3.nameLeft = AndroidUtilities.dp(22.0f);
                    }
                } else {
                    dialogCell3.nameLockTop = AndroidUtilities.dp(16.5f);
                    if (!LocaleController.isRTL) {
                        dialogCell3.nameLockLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 4);
                        dialogCell3.nameLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 8) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                    } else {
                        dialogCell3.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(dialogCell3.messagePaddingStart + 4)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        dialogCell3.nameLeft = AndroidUtilities.dp(18.0f);
                    }
                }
            } else {
                dialogCell3.drawVerified = !dialogCell3.forbidVerified && customDialog.verified;
                if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                    if (!LocaleController.isRTL) {
                        dialogCell3.nameLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 6);
                    } else {
                        dialogCell3.nameLeft = AndroidUtilities.dp(22.0f);
                    }
                } else if (!LocaleController.isRTL) {
                    dialogCell3.nameLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 4);
                } else {
                    dialogCell3.nameLeft = AndroidUtilities.dp(18.0f);
                }
            }
            CustomDialog customDialog2 = dialogCell3.customDialog;
            if (customDialog2.type == 1) {
                charSequence37 = LocaleController.getString(R.string.FromYou);
                CustomDialog customDialog3 = dialogCell3.customDialog;
                if (customDialog3.isMedia) {
                    dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                    formatInternal = dialogCell3.formatInternal(i, dialogCell3.message.messageText, null);
                    formatInternal.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage, dialogCell3.resourcesProvider), 0, formatInternal.length(), 33);
                } else {
                    String str14 = customDialog3.message;
                    if (str14.length() > 150) {
                        str14 = str14.substring(0, 150);
                    }
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        formatInternal = dialogCell3.formatInternal(i, str14, charSequence37);
                    } else {
                        formatInternal = dialogCell3.formatInternal(i, str14.replace('\n', ' '), charSequence37);
                    }
                }
                charSequence31 = Emoji.replaceEmoji(formatInternal, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                z13 = false;
            } else {
                charSequence31 = customDialog2.message;
                if (customDialog2.isMedia) {
                    dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                }
                charSequence37 = null;
                z13 = true;
            }
            String stringForMessageListDate2 = LocaleController.stringForMessageListDate(dialogCell3.customDialog.date);
            int i23 = dialogCell3.customDialog.unread_count;
            if (i23 != 0) {
                dialogCell3.drawCount = true;
                z17 = false;
                str12 = String.format("%d", Integer.valueOf(i23));
            } else {
                z17 = false;
                dialogCell3.drawCount = false;
                str12 = null;
            }
            CustomDialog customDialog4 = dialogCell3.customDialog;
            int i24 = customDialog4.sent;
            if (i24 == 0) {
                dialogCell3.drawClock = true;
                dialogCell3.drawCheck1 = z17;
                dialogCell3.drawCheck2 = z17;
            } else if (i24 == 2) {
                dialogCell3.drawCheck1 = true;
                dialogCell3.drawCheck2 = true;
                dialogCell3.drawClock = z17;
            } else if (i24 == 1) {
                dialogCell3.drawCheck1 = z17;
                dialogCell3.drawCheck2 = true;
                dialogCell3.drawClock = z17;
            } else {
                dialogCell3.drawClock = z17;
                dialogCell3.drawCheck1 = z17;
                dialogCell3.drawCheck2 = z17;
            }
            dialogCell3.drawError = z17;
            charSequence32 = customDialog4.name;
            charSequence34 = charSequence37;
            str11 = null;
            str10 = stringForMessageListDate2;
            charSequence33 = "";
            i9 = -1;
            dialogCell2 = dialogCell3;
        } else {
            if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                if (!LocaleController.isRTL) {
                    dialogCell3.nameLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 6);
                } else {
                    dialogCell3.nameLeft = AndroidUtilities.dp(22.0f);
                }
            } else if (!LocaleController.isRTL) {
                dialogCell3.nameLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 4);
            } else {
                dialogCell3.nameLeft = AndroidUtilities.dp(18.0f);
            }
            if (dialogCell3.encryptedChat != null) {
                if (dialogCell3.currentDialogFolderId == 0) {
                    dialogCell3.drawNameLock = true;
                    if (dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        dialogCell3.nameLockTop = AndroidUtilities.dp(12.5f);
                        if (!LocaleController.isRTL) {
                            dialogCell3.nameLockLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 6);
                            dialogCell3.nameLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 10) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        } else {
                            dialogCell3.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(dialogCell3.messagePaddingStart + 6)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                            dialogCell3.nameLeft = AndroidUtilities.dp(22.0f);
                        }
                    } else {
                        dialogCell3.nameLockTop = AndroidUtilities.dp(16.5f);
                        if (!LocaleController.isRTL) {
                            dialogCell3.nameLockLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 4);
                            dialogCell3.nameLeft = AndroidUtilities.dp(dialogCell3.messagePaddingStart + 8) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        } else {
                            dialogCell3.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(dialogCell3.messagePaddingStart + 4)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                            dialogCell3.nameLeft = AndroidUtilities.dp(18.0f);
                        }
                    }
                }
            } else if (dialogCell3.currentDialogFolderId == 0 && !dialogCell3.isTopic) {
                TLRPC.Chat chat3 = dialogCell3.chat;
                if (chat3 != null) {
                    long botVerificationIcon = DialogObject.getBotVerificationIcon(chat3);
                    TLRPC.Chat chat4 = dialogCell3.chat;
                    if (chat4.scam) {
                        dialogCell3.drawScam = 1;
                        Theme.dialogs_scamDrawable.checkText();
                    } else if (chat4.fake) {
                        dialogCell3.drawScam = 2;
                        Theme.dialogs_fakeDrawable.checkText();
                    } else if (DialogObject.getEmojiStatusDocumentId(chat4.emoji_status) != 0) {
                        dialogCell3.drawPremium = true;
                        dialogCell3.nameLayoutEllipsizeByGradient = true;
                        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = dialogCell3.emojiStatus;
                        swapAnimatedEmojiDrawable.center = LocaleController.isRTL;
                        swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(dialogCell3.chat.emoji_status), false);
                        dialogCell3.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(dialogCell3.chat.emoji_status), false);
                    } else {
                        boolean z19 = dialogCell3.forbidVerified;
                        dialogCell3.drawVerified = !z19 && dialogCell3.chat.verified;
                        dialogCell3.drawBotVerified = (z19 || dialogCell3.chat.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence = charSequence39;
                    j2 = botVerificationIcon;
                } else {
                    TLRPC.User user3 = dialogCell3.user;
                    if (user3 != null) {
                        j2 = DialogObject.getBotVerificationIcon(user3);
                        TLRPC.User user4 = dialogCell3.user;
                        if (user4.scam) {
                            dialogCell3.drawScam = 1;
                            Theme.dialogs_scamDrawable.checkText();
                        } else if (user4.fake) {
                            dialogCell3.drawScam = 2;
                            Theme.dialogs_fakeDrawable.checkText();
                        } else {
                            boolean z20 = dialogCell3.forbidVerified;
                            dialogCell3.drawVerified = !z20 && user4.verified;
                            if (z20 || UserObject.isUserSelf(user4)) {
                                charSequence = charSequence39;
                            } else {
                                charSequence = charSequence39;
                                if (dialogCell3.user.bot_verification_icon != 0) {
                                    z3 = true;
                                    dialogCell3.drawBotVerified = z3;
                                    if (MessagesController.getInstance(dialogCell3.currentAccount).isPremiumUser(dialogCell3.user)) {
                                        long j3 = UserConfig.getInstance(dialogCell3.currentAccount).clientUserId;
                                        long j4 = dialogCell3.user.id;
                                        if (j3 != j4 && j4 != 0) {
                                            z4 = true;
                                            dialogCell3.drawPremium = z4;
                                            if (z4) {
                                                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(dialogCell3.user);
                                                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = dialogCell3.emojiStatus;
                                                swapAnimatedEmojiDrawable2.center = LocaleController.isRTL;
                                                if (emojiStatusDocumentId != null) {
                                                    dialogCell3.nameLayoutEllipsizeByGradient = true;
                                                    z2 = false;
                                                    swapAnimatedEmojiDrawable2.set(emojiStatusDocumentId.longValue(), false);
                                                    dialogCell3.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(dialogCell3.user.emoji_status), false);
                                                } else {
                                                    z2 = false;
                                                    dialogCell3.nameLayoutEllipsizeByGradient = true;
                                                    swapAnimatedEmojiDrawable2.set(PremiumGradient.getInstance().premiumStarDrawableMini, false);
                                                    dialogCell3.emojiStatus.setParticles(false, false);
                                                }
                                                j = 0;
                                                if (j2 != j && dialogCell3.drawBotVerified) {
                                                    dialogCell3.botVerification.set(j2, z2);
                                                }
                                                i2 = dialogCell3.lastMessageDate;
                                                if (i2 == 0 && (messageObject5 = dialogCell3.message) != null) {
                                                    i2 = messageObject5.messageOwner.date;
                                                }
                                                if (!dialogCell3.isTopic) {
                                                    boolean z21 = MediaDataController.getInstance(dialogCell3.currentAccount).getDraftVoice(dialogCell3.currentDialogId, (long) getTopicId()) != null;
                                                    dialogCell3.draftVoice = z21;
                                                    TLRPC.DraftMessage draft = !z21 ? MediaDataController.getInstance(dialogCell3.currentAccount).getDraft(dialogCell3.currentDialogId, getTopicId()) : null;
                                                    dialogCell3.draftMessage = draft;
                                                    if (draft != null && TextUtils.isEmpty(draft.message)) {
                                                        dialogCell3.draftMessage = null;
                                                    }
                                                } else if (dialogCell3.isDialogCell || dialogCell3.isSavedDialogCell) {
                                                    boolean z22 = MediaDataController.getInstance(dialogCell3.currentAccount).getDraftVoice(dialogCell3.currentDialogId, (long) getTopicId()) != null;
                                                    dialogCell3.draftVoice = z22;
                                                    dialogCell3.draftMessage = !z22 ? MediaDataController.getInstance(dialogCell3.currentAccount).getDraft(dialogCell3.currentDialogId, 0L) : null;
                                                } else {
                                                    dialogCell3.draftVoice = false;
                                                    dialogCell3.draftMessage = null;
                                                }
                                                z5 = dialogCell3.draftVoice;
                                                if (!z5 || dialogCell3.draftMessage != null) {
                                                    if (!z5 && (draftMessage2 = dialogCell3.draftMessage) != null && TextUtils.isEmpty(draftMessage2.message)) {
                                                        draftMessage3 = dialogCell3.draftMessage;
                                                        if (draftMessage3.rich_message == null) {
                                                            TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                                                            if (inputReplyTo == null) {
                                                            }
                                                            draftMessage4 = null;
                                                            dialogCell3.draftMessage = null;
                                                            z6 = false;
                                                            dialogCell3.draftVoice = false;
                                                            if (isForumCell()) {
                                                                dialogCell3.draftMessage = draftMessage4;
                                                                dialogCell3.draftVoice = z6;
                                                                dialogCell3.needEmoji = true;
                                                                updateMessageThumbs();
                                                                string = ChatObject.isMonoForum(dialogCell3.chat) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                if (ChatObject.isMonoForum(dialogCell3.chat)) {
                                                                    if (i == 1) {
                                                                        i = 2;
                                                                    }
                                                                    string = null;
                                                                    if (i == 3) {
                                                                        i = 4;
                                                                    }
                                                                }
                                                                CharSequence formatTopicsNames = formatTopicsNames();
                                                                MessageObject messageObject8 = dialogCell3.message;
                                                                String messageStringFormatted = dialogCell3.message != null ? dialogCell3.getMessageStringFormatted(i, messageObject8 != null ? MessagesController.getInstance(messageObject8.currentAccount).getRestrictionReason(dialogCell3.message.messageOwner.restriction_reason) : null, string, true) : "";
                                                                CharSequence charSequence40 = messageStringFormatted;
                                                                if (dialogCell3.applyName) {
                                                                    int length = messageStringFormatted.length();
                                                                    charSequence40 = messageStringFormatted;
                                                                    charSequence40 = messageStringFormatted;
                                                                    if (length >= 0 && string != null) {
                                                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(messageStringFormatted);
                                                                        valueOf.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_name, dialogCell3.resourcesProvider), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                                                        charSequence40 = valueOf;
                                                                    }
                                                                }
                                                                dialogCell3.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell3.paintIndex];
                                                                charSequence27 = formatTopicsNames;
                                                                charSequence7 = charSequence40;
                                                                charSequence3 = "d ";
                                                                charSequence28 = "";
                                                            } else if (!TextUtils.isEmpty(dialogCell3.customMessage)) {
                                                                dialogCell3.draftMessage = null;
                                                                dialogCell3.draftVoice = false;
                                                                String str15 = dialogCell3.customMessage;
                                                                dialogCell3.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell3.paintIndex];
                                                                charSequence27 = str15;
                                                                charSequence3 = "d ";
                                                                charSequence28 = "";
                                                                string = null;
                                                                charSequence7 = null;
                                                            } else {
                                                                if (printingString != null) {
                                                                    dialogCell3.lastPrintString = printingString;
                                                                    int intValue = MessagesController.getInstance(dialogCell3.currentAccount).getPrintingStringType(dialogCell3.currentDialogId, getTopicId()).intValue();
                                                                    dialogCell3.printingStringType = intValue;
                                                                    StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(intValue);
                                                                    int intrinsicWidth = chatStatusDrawable != null ? chatStatusDrawable.getIntrinsicWidth() + AndroidUtilities.dp(3.0f) : 0;
                                                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                                    CharSequence replace = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
                                                                    int indexOf = dialogCell3.printingStringType == 5 ? replace.toString().indexOf("**oo**") : -1;
                                                                    if (indexOf >= 0) {
                                                                        spannableStringBuilder2.append(replace).setSpan(new FixedWidthSpan(Theme.getChatStatusDrawable(dialogCell3.printingStringType).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                                                    } else {
                                                                        spannableStringBuilder2.append((CharSequence) " ").append(replace).setSpan(new FixedWidthSpan(intrinsicWidth), 0, 1, 0);
                                                                    }
                                                                    i3 = indexOf;
                                                                    z7 = false;
                                                                    charSequence2 = spannableStringBuilder2;
                                                                } else {
                                                                    dialogCell3.lastPrintString = null;
                                                                    dialogCell3.printingStringType = -1;
                                                                    charSequence2 = "";
                                                                    i3 = -1;
                                                                    z7 = true;
                                                                }
                                                                if (dialogCell3.draftVoice || dialogCell3.draftMessage != null) {
                                                                    i4 = i3;
                                                                    boolean z23 = z18;
                                                                    boolean z24 = z;
                                                                    CharSequence charSequence41 = charSequence2;
                                                                    charSequence3 = "d ";
                                                                    string = LocaleController.getString(R.string.Draft);
                                                                    TLRPC.DraftMessage draftMessage5 = dialogCell3.draftMessage;
                                                                    if (draftMessage5 != null && TextUtils.isEmpty(draftMessage5.message) && dialogCell3.draftMessage.rich_message == null) {
                                                                        if ((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                                                            charSequence5 = charSequence41;
                                                                            charSequence6 = "";
                                                                            z = z24;
                                                                            z18 = z23;
                                                                            charSequence7 = null;
                                                                            z7 = false;
                                                                            charSequence24 = charSequence6;
                                                                            charSequence23 = charSequence5;
                                                                        } else {
                                                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                                                            valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, dialogCell3.resourcesProvider), 0, string.length(), 33);
                                                                            charSequence8 = valueOf2;
                                                                        }
                                                                    } else {
                                                                        TLRPC.DraftMessage draftMessage6 = dialogCell3.draftMessage;
                                                                        if (draftMessage6 != null && (richMessage = draftMessage6.rich_message) != null) {
                                                                            charSequence4 = MessageObject.formatRichMessage(richMessage, false, false, 150);
                                                                        } else if (dialogCell3.draftVoice) {
                                                                            charSequence4 = LocaleController.getString(R.string.AttachAudio);
                                                                        } else if (draftMessage6 != null) {
                                                                            charSequence4 = draftMessage6.message;
                                                                            if (charSequence4.length() > 150) {
                                                                                charSequence4 = charSequence4.subSequence(0, 150);
                                                                            }
                                                                        } else {
                                                                            charSequence4 = "";
                                                                        }
                                                                        SpannableString spannableString = new SpannableString(charSequence4);
                                                                        TLRPC.DraftMessage draftMessage7 = dialogCell3.draftMessage;
                                                                        if (draftMessage7 != null) {
                                                                            MediaDataController.addTextStyleRuns(draftMessage7, spannableString, NotificationCenter.didApplyNewTheme);
                                                                            TLRPC.DraftMessage draftMessage8 = dialogCell3.draftMessage;
                                                                            if (draftMessage8 != null && (arrayList = draftMessage8.entities) != null) {
                                                                                TextPaint textPaint2 = dialogCell3.currentMessagePaint;
                                                                                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint2 == null ? null : textPaint2.getFontMetricsInt());
                                                                            }
                                                                        } else if (dialogCell3.draftVoice) {
                                                                            spannableString.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, dialogCell3.resourcesProvider), 0, spannableString.length(), 33);
                                                                        }
                                                                        SpannableStringBuilder formatInternal2 = dialogCell3.formatInternal(i, AndroidUtilities.replaceNewLines(spannableString), string);
                                                                        if ((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                                                            z8 = false;
                                                                        } else {
                                                                            z8 = false;
                                                                            formatInternal2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, dialogCell3.resourcesProvider), 0, string.length() + 1, 33);
                                                                        }
                                                                        charSequence8 = Emoji.replaceEmoji(formatInternal2, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), z8);
                                                                    }
                                                                    charSequence5 = charSequence41;
                                                                    charSequence6 = charSequence8;
                                                                    z = z24;
                                                                    z18 = z23;
                                                                    charSequence7 = null;
                                                                    z7 = false;
                                                                    charSequence24 = charSequence6;
                                                                    charSequence23 = charSequence5;
                                                                } else {
                                                                    if (dialogCell3.clearingDialog) {
                                                                        dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                        string3 = LocaleController.getString(R.string.HistoryCleared);
                                                                    } else {
                                                                        MessageObject messageObject9 = dialogCell3.message;
                                                                        if (messageObject9 != null) {
                                                                            String restrictionReason = MessagesController.getInstance(messageObject9.currentAccount).getRestrictionReason(dialogCell3.message.messageOwner.restriction_reason);
                                                                            long fromChatId = dialogCell3.message.getFromChatId();
                                                                            if (DialogObject.isUserDialog(fromChatId)) {
                                                                                MessagesController.getInstance(dialogCell3.currentAccount).getUser(Long.valueOf(fromChatId));
                                                                                chat = null;
                                                                            } else {
                                                                                chat = MessagesController.getInstance(dialogCell3.currentAccount).getChat(Long.valueOf(-fromChatId));
                                                                            }
                                                                            dialogCell3.drawCount2 = true;
                                                                            if (dialogCell3.dialogsType == 0 && dialogCell3.currentDialogId > 0 && dialogCell3.message.isOutOwner() && (tL_messageReactions = dialogCell3.message.messageOwner.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && dialogCell3.reactionMentionCount > 0) {
                                                                                TLRPC.MessagePeerReaction messagePeerReaction = dialogCell3.message.messageOwner.reactions.recent_reactions.get(0);
                                                                                if (messagePeerReaction.unread) {
                                                                                    i4 = i3;
                                                                                    long j5 = messagePeerReaction.peer_id.user_id;
                                                                                    if (j5 != 0) {
                                                                                        z9 = z18;
                                                                                        z10 = z;
                                                                                        if (j5 != UserConfig.getInstance(dialogCell3.currentAccount).clientUserId) {
                                                                                            ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(messagePeerReaction.reaction);
                                                                                            dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                            String str16 = fromTL.emojicon;
                                                                                            if (str16 != null) {
                                                                                                z11 = true;
                                                                                                charSequence9 = charSequence2;
                                                                                                charSequence10 = LocaleController.formatString(R.string.ReactionInDialog, str16);
                                                                                            } else {
                                                                                                String formatString = LocaleController.formatString(R.string.ReactionInDialog, str);
                                                                                                String str17 = str;
                                                                                                int indexOf2 = formatString.indexOf(str17);
                                                                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(formatString.replace(str17, "d"));
                                                                                                charSequence9 = charSequence2;
                                                                                                long j6 = fromTL.documentId;
                                                                                                TextPaint textPaint3 = dialogCell3.currentMessagePaint;
                                                                                                spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(j6, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                                                                charSequence10 = spannableStringBuilder3;
                                                                                                z11 = true;
                                                                                            }
                                                                                            if (!z11) {
                                                                                                charSequence3 = "d ";
                                                                                                charSequence12 = charSequence10;
                                                                                            } else {
                                                                                                int i25 = dialogCell3.dialogsType;
                                                                                                if (i25 == 2) {
                                                                                                    TLRPC.Chat chat5 = dialogCell3.chat;
                                                                                                    if (chat5 != null) {
                                                                                                        if (ChatObject.isChannel(chat5)) {
                                                                                                            TLRPC.Chat chat6 = dialogCell3.chat;
                                                                                                            if (!chat6.megagroup) {
                                                                                                                int i26 = chat6.participants_count;
                                                                                                                if (i26 != 0) {
                                                                                                                    str5 = LocaleController.formatPluralStringComma("Subscribers", i26);
                                                                                                                } else if (!ChatObject.isPublic(chat6)) {
                                                                                                                    str5 = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                                                                                                } else {
                                                                                                                    str5 = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        TLRPC.Chat chat7 = dialogCell3.chat;
                                                                                                        int i27 = chat7.participants_count;
                                                                                                        if (i27 != 0) {
                                                                                                            str5 = LocaleController.formatPluralStringComma("Members", i27);
                                                                                                        } else if (chat7.has_geo) {
                                                                                                            str5 = LocaleController.getString(R.string.MegaLocation);
                                                                                                        } else if (!ChatObject.isPublic(chat7)) {
                                                                                                            str5 = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                                                                                        } else {
                                                                                                            str5 = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                                                        }
                                                                                                    } else {
                                                                                                        str5 = "";
                                                                                                    }
                                                                                                    dialogCell3.drawCount2 = false;
                                                                                                    str4 = str5;
                                                                                                } else if (i25 == 3 && UserObject.isUserSelf(dialogCell3.user)) {
                                                                                                    DialogsActivity dialogsActivity = dialogCell3.parentFragment;
                                                                                                    str4 = LocaleController.getString((dialogsActivity == null || !dialogsActivity.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                                                } else {
                                                                                                    boolean z25 = dialogCell3.useForceThreeLines;
                                                                                                    if (!z25 && !SharedConfig.useThreeLinesLayout && dialogCell3.currentDialogCommunityId != 0) {
                                                                                                        charSequence21 = formatCommunityDialogNames();
                                                                                                    } else if (!z25 && !SharedConfig.useThreeLinesLayout && dialogCell3.currentDialogFolderId != 0) {
                                                                                                        charSequence21 = formatArchivedDialogNames();
                                                                                                    } else {
                                                                                                        MessageObject messageObject10 = dialogCell3.message;
                                                                                                        if ((messageObject10.messageOwner instanceof TLRPC.TL_messageService) && (!MessageObject.isTopicActionMessage(messageObject10) || (dialogCell3.message.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                                            MessageObject messageObject11 = dialogCell3.message;
                                                                                                            TLRPC.MessageAction messageAction = messageObject11.messageOwner.action;
                                                                                                            if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                                                TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                                                if (messageObject11.isOutOwner()) {
                                                                                                                    if (tL_messageActionPhoneCall.video) {
                                                                                                                        i8 = R.drawable.dialog_media_outgoing_video_call_20;
                                                                                                                    } else {
                                                                                                                        i8 = R.drawable.dialog_media_outgoing_call_20;
                                                                                                                    }
                                                                                                                    charSequence18 = DialogMediaIconsHelper.addDialogMediaSpan(charSequence, i8, false);
                                                                                                                } else {
                                                                                                                    if (tL_messageActionPhoneCall.video) {
                                                                                                                        i7 = R.drawable.dialog_media_incoming_video_call_20;
                                                                                                                    } else {
                                                                                                                        i7 = R.drawable.dialog_media_incoming_call_20;
                                                                                                                    }
                                                                                                                    charSequence18 = DialogMediaIconsHelper.addDialogMediaSpan(charSequence, i7, false);
                                                                                                                }
                                                                                                            } else if (!ChatObject.isChannelAndNotMegaGroup(dialogCell3.chat) || !(dialogCell3.message.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                                                CharSequence charSequence42 = dialogCell3.message.messageTextShort;
                                                                                                                charSequence18 = charSequence42 != null ? charSequence42 : charSequence;
                                                                                                            } else {
                                                                                                                charSequence18 = "";
                                                                                                                z18 = false;
                                                                                                                dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                                                if (dialogCell3.message.type != 21) {
                                                                                                                    updateMessageThumbs();
                                                                                                                    charSequence19 = dialogCell3.applyThumbs(charSequence18);
                                                                                                                } else {
                                                                                                                    charSequence19 = charSequence18;
                                                                                                                }
                                                                                                                charSequence3 = "d ";
                                                                                                                z = z10;
                                                                                                                charSequence25 = charSequence19;
                                                                                                                charSequence17 = null;
                                                                                                                charSequence22 = charSequence25;
                                                                                                                if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                                                }
                                                                                                                charSequence23 = charSequence9;
                                                                                                                charSequence7 = null;
                                                                                                                CharSequence charSequence43 = charSequence17;
                                                                                                                charSequence24 = charSequence22;
                                                                                                                string = charSequence43;
                                                                                                            }
                                                                                                            z18 = z9;
                                                                                                            dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                                            if (dialogCell3.message.type != 21) {
                                                                                                            }
                                                                                                            charSequence3 = "d ";
                                                                                                            z = z10;
                                                                                                            charSequence25 = charSequence19;
                                                                                                            charSequence17 = null;
                                                                                                            charSequence22 = charSequence25;
                                                                                                            if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                                            }
                                                                                                            charSequence23 = charSequence9;
                                                                                                            charSequence7 = null;
                                                                                                            CharSequence charSequence432 = charSequence17;
                                                                                                            charSequence24 = charSequence22;
                                                                                                            string = charSequence432;
                                                                                                        } else {
                                                                                                            dialogCell3.needEmoji = true;
                                                                                                            updateMessageThumbs();
                                                                                                            String escape2 = (dialogCell3.isSavedDialog || (user2 = dialogCell3.user) == null || !user2.self || dialogCell3.message.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                                                            if ((!dialogCell3.isSavedDialog || (user = dialogCell3.user) == null || user.self || (messageObject3 = dialogCell3.message) == null || !messageObject3.isOutOwner()) && escape2 == null && ((messageObject = dialogCell3.message) == null || (message = messageObject.messageOwner) == null || message.guestchat_via_from == null)) {
                                                                                                                TLRPC.Chat chat8 = dialogCell3.chat;
                                                                                                                if (chat8 != null) {
                                                                                                                    long j7 = chat8.id;
                                                                                                                    if (j7 > 0) {
                                                                                                                        if (chat != null) {
                                                                                                                        }
                                                                                                                        if (ChatObject.isChannel(chat8)) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                TLRPC.User user5 = dialogCell3.user;
                                                                                                                if (user5 == null || user5.id != UserObject.VERIFY || (messageObject2 = dialogCell3.message) == null || messageObject2.getForwardedFromId() == null) {
                                                                                                                    boolean isEmpty = TextUtils.isEmpty(restrictionReason);
                                                                                                                    CharSequence charSequence44 = restrictionReason;
                                                                                                                    if (isEmpty) {
                                                                                                                        if (MessageObject.isTopicActionMessage(dialogCell3.message)) {
                                                                                                                            MessageObject messageObject12 = dialogCell3.message;
                                                                                                                            CharSequence charSequence45 = messageObject12.messageTextShort;
                                                                                                                            if (charSequence45 == null || ((messageObject12.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && dialogCell3.isTopic)) {
                                                                                                                                charSequence45 = messageObject12.messageText;
                                                                                                                            }
                                                                                                                            CharSequence charSequence46 = charSequence45;
                                                                                                                            charSequence44 = charSequence46;
                                                                                                                            if (messageObject12.topicIconDrawable[0] instanceof ForumBubbleDrawable) {
                                                                                                                                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(dialogCell3.currentAccount).getTopicsController().findTopic(-dialogCell3.message.getDialogId(), MessageObject.getTopicId(dialogCell3.currentAccount, dialogCell3.message.messageOwner, true));
                                                                                                                                charSequence44 = charSequence46;
                                                                                                                                if (findTopic != null) {
                                                                                                                                    ((ForumBubbleDrawable) dialogCell3.message.topicIconDrawable[0]).setColor(findTopic.icon_color);
                                                                                                                                    charSequence44 = charSequence46;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            TLRPC.MessageMedia messageMedia = dialogCell3.message.messageOwner.media;
                                                                                                                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                                                charSequence44 = LocaleController.getString(R.string.AttachPhotoExpired);
                                                                                                                            } else {
                                                                                                                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                                                    TLRPC.Document document = messageMedia.document;
                                                                                                                                    if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                                                        if (messageMedia.voice) {
                                                                                                                                            charSequence44 = LocaleController.getString(R.string.AttachVoiceExpired);
                                                                                                                                        } else if (messageMedia.round) {
                                                                                                                                            charSequence44 = LocaleController.getString(R.string.AttachRoundExpired);
                                                                                                                                        } else {
                                                                                                                                            charSequence44 = LocaleController.getString(R.string.AttachVideoExpired);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (getCaptionMessage() != null && !(dialogCell3.message.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                                                    MessageObject captionMessage = getCaptionMessage();
                                                                                                                                    if (!dialogCell3.needEmoji) {
                                                                                                                                        str3 = "";
                                                                                                                                    } else if (captionMessage.isVideo()) {
                                                                                                                                        str3 = "📹 ";
                                                                                                                                    } else if (captionMessage.isVoice()) {
                                                                                                                                        str3 = "🎤 ";
                                                                                                                                    } else if (captionMessage.isMusic()) {
                                                                                                                                        str3 = "🎧 ";
                                                                                                                                    } else if (captionMessage.isPhoto()) {
                                                                                                                                        str3 = "🖼 ";
                                                                                                                                    } else {
                                                                                                                                        str3 = "📎 ";
                                                                                                                                    }
                                                                                                                                    if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                                                                                                                                        CharSequence charSequence47 = captionMessage.messageTrimmedToHighlight;
                                                                                                                                        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(dialogCell3.messagePaddingStart + 47);
                                                                                                                                        if (dialogCell3.hasNameInMessage) {
                                                                                                                                            if (!TextUtils.isEmpty(null)) {
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            measuredWidth = (int) (measuredWidth - dialogCell3.currentMessagePaint.measureText(": "));
                                                                                                                                        }
                                                                                                                                        if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                                                            charSequence47 = AndroidUtilities.ellipsizeCenterEnd(charSequence47, captionMessage.highlightedWords.get(0), measuredWidth, dialogCell3.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                                                        }
                                                                                                                                        charSequence44 = new SpannableStringBuilder(str3).append(charSequence47);
                                                                                                                                    } else {
                                                                                                                                        SpannableString spannableString2 = new SpannableString(captionMessage.caption);
                                                                                                                                        if (captionMessage.messageOwner != null) {
                                                                                                                                            captionMessage.spoilLoginCode();
                                                                                                                                            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString2, NotificationCenter.didApplyNewTheme);
                                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList3 = captionMessage.messageOwner.entities;
                                                                                                                                            TextPaint textPaint4 = dialogCell3.currentMessagePaint;
                                                                                                                                            MediaDataController.addAnimatedEmojiSpans(arrayList3, spannableString2, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                                                        }
                                                                                                                                        charSequence44 = new SpannableStringBuilder(str3).append((CharSequence) spannableString2);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    MessageObject messageObject13 = dialogCell3.message;
                                                                                                                                    TLRPC.Message message2 = messageObject13.messageOwner;
                                                                                                                                    TLRPC.MessageMedia messageMedia2 = message2.media;
                                                                                                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                                                        int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                                                        if (dialogCell3.hasVideoThumb) {
                                                                                                                                            i5 = 1;
                                                                                                                                            if (size > 1) {
                                                                                                                                                c2 = 0;
                                                                                                                                                formatPluralString2 = LocaleController.formatPluralString("Media", size, new Object[0]);
                                                                                                                                            } else {
                                                                                                                                                c2 = 0;
                                                                                                                                                formatPluralString2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            c2 = 0;
                                                                                                                                            i5 = 1;
                                                                                                                                            formatPluralString2 = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                                                        }
                                                                                                                                        int i28 = R.string.AttachPaidMedia;
                                                                                                                                        Object[] objArr = new Object[i5];
                                                                                                                                        objArr[c2] = formatPluralString2;
                                                                                                                                        SpannableStringBuilder replaceStars = StarsIntroActivity.replaceStars(LocaleController.formatString(i28, objArr));
                                                                                                                                        dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                                                                        charSequence44 = replaceStars;
                                                                                                                                    } else if (dialogCell3.thumbsCount > 1) {
                                                                                                                                        if (dialogCell3.hasVideoThumb) {
                                                                                                                                            ArrayList arrayList4 = dialogCell3.groupMessages;
                                                                                                                                            formatPluralString = LocaleController.formatPluralString("Media", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                                                        } else {
                                                                                                                                            ArrayList arrayList5 = dialogCell3.groupMessages;
                                                                                                                                            formatPluralString = LocaleController.formatPluralString("Photos", arrayList5 == null ? 0 : arrayList5.size(), new Object[0]);
                                                                                                                                        }
                                                                                                                                        charSequence44 = formatPluralString;
                                                                                                                                        dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                                                                    } else {
                                                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                                            TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                                                                                                                                            if (messageFwdHeader != null) {
                                                                                                                                                TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                                                if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                                                    isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, dialogCell3.currentAccount);
                                                                                                                                                    charSequence15 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(dialogCell3.chat);
                                                                                                                                            charSequence15 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                                            charSequence15 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                                            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                                                                                                                                            if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                                                                                                                                                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                                                MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                                                                                                                                                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt());
                                                                                                                                                charSequence14 = DialogMediaIconsHelper.addDialogMediaSpan(spannableString3, R.drawable.dialog_media_poll_20, false);
                                                                                                                                            } else {
                                                                                                                                                charSequence14 = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities.text, R.drawable.dialog_media_poll_20, false);
                                                                                                                                            }
                                                                                                                                            charSequence15 = charSequence14;
                                                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                                            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                                            TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                                                                                                                                            if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                                                                                                                                                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                                                MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                                                                                                                                                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt());
                                                                                                                                                charSequence15 = DialogMediaIconsHelper.addDialogMediaSpan(spannableString4, R.drawable.dialog_media_checklist_20, false);
                                                                                                                                            } else {
                                                                                                                                                charSequence15 = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities3.text, R.drawable.dialog_media_checklist_20, false);
                                                                                                                                            }
                                                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                                            charSequence15 = DialogMediaIconsHelper.addDialogMediaSpan(messageMedia2.game.title, R.drawable.dialog_media_game_20, false);
                                                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                                            charSequence15 = messageMedia2.title;
                                                                                                                                        } else if (messageObject13.type == 14) {
                                                                                                                                            charSequence15 = String.format("🎧 %s - %s", messageObject13.getMusicAuthor(), dialogCell3.message.getMusicTitle());
                                                                                                                                        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaStory) && messageMedia2.via_mention) {
                                                                                                                                            if (messageObject13.isOut()) {
                                                                                                                                                TLRPC.User user6 = MessagesController.getInstance(dialogCell3.currentAccount).getUser(Long.valueOf(dialogCell3.message.getDialogId()));
                                                                                                                                                if (user6 != null) {
                                                                                                                                                    str2 = UserObject.getFirstName(user6);
                                                                                                                                                    int indexOf3 = str2.indexOf(32);
                                                                                                                                                    c = 0;
                                                                                                                                                    if (indexOf3 >= 0) {
                                                                                                                                                        str2 = str2.substring(0, indexOf3);
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    c = 0;
                                                                                                                                                    str2 = "";
                                                                                                                                                }
                                                                                                                                                int i29 = R.string.StoryYouMentionInDialog;
                                                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                                                objArr2[c] = str2;
                                                                                                                                                charSequence15 = LocaleController.formatString(i29, objArr2);
                                                                                                                                            } else {
                                                                                                                                                charSequence15 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            if (messageObject13.hasHighlightedWords() && !TextUtils.isEmpty(dialogCell3.message.messageOwner.message)) {
                                                                                                                                                CharSequence charSequence48 = dialogCell3.message.messageTrimmedToHighlight;
                                                                                                                                                int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(dialogCell3.messagePaddingStart + 23);
                                                                                                                                                MessageObject messageObject14 = dialogCell3.message;
                                                                                                                                                charSequence13 = charSequence48;
                                                                                                                                                if (messageObject14.messageTrimmedToHighlightCut) {
                                                                                                                                                    charSequence13 = AndroidUtilities.ellipsizeCenterEnd(charSequence48, messageObject14.highlightedWords.get(0), measuredWidth2, dialogCell3.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                SpannableString spannableString5 = new SpannableString(charSequence);
                                                                                                                                                MessageObject messageObject15 = dialogCell3.message;
                                                                                                                                                if (messageObject15 != null) {
                                                                                                                                                    messageObject15.spoilLoginCode();
                                                                                                                                                }
                                                                                                                                                MediaDataController.addTextStyleRuns(dialogCell3.message, spannableString5, NotificationCenter.didApplyNewTheme);
                                                                                                                                                MessageObject messageObject16 = dialogCell3.message;
                                                                                                                                                charSequence13 = spannableString5;
                                                                                                                                                if (messageObject16 != null) {
                                                                                                                                                    TLRPC.Message message3 = messageObject16.messageOwner;
                                                                                                                                                    charSequence13 = spannableString5;
                                                                                                                                                    if (message3 != null) {
                                                                                                                                                        ArrayList<TLRPC.MessageEntity> arrayList6 = message3.entities;
                                                                                                                                                        TextPaint textPaint5 = dialogCell3.currentMessagePaint;
                                                                                                                                                        MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                                                                        charSequence13 = spannableString5;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            AndroidUtilities.highlightText(charSequence13, dialogCell3.message.highlightedWords, dialogCell3.resourcesProvider);
                                                                                                                                            charSequence15 = charSequence13;
                                                                                                                                        }
                                                                                                                                        CharSequence charSequence49 = charSequence15;
                                                                                                                                        MessageObject messageObject17 = dialogCell3.message;
                                                                                                                                        if (messageObject17.messageOwner.media == null || messageObject17.isMediaEmpty()) {
                                                                                                                                            TL_iv.RichMessage richMessage2 = dialogCell3.message.messageOwner.rich_message;
                                                                                                                                            charSequence44 = charSequence49;
                                                                                                                                            if (richMessage2 != null) {
                                                                                                                                                charSequence44 = charSequence49;
                                                                                                                                                if (richMessage2.blocks.size() == 1) {
                                                                                                                                                    charSequence44 = charSequence49;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                                                                        charSequence44 = charSequence49;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (!dialogCell3.message.isReplyToStory()) {
                                                                                                                        charSequence3 = "d ";
                                                                                                                        charSequence11 = charSequence44;
                                                                                                                    } else {
                                                                                                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence44);
                                                                                                                        charSequence3 = "d ";
                                                                                                                        spannableStringBuilder4.insert(0, charSequence3);
                                                                                                                        spannableStringBuilder4.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                                                        charSequence11 = spannableStringBuilder4;
                                                                                                                    }
                                                                                                                    CharSequence charSequence50 = charSequence11;
                                                                                                                    if (dialogCell3.thumbsCount > 0) {
                                                                                                                        if (dialogCell3.message.hasHighlightedWords() && !TextUtils.isEmpty(dialogCell3.message.messageOwner.message)) {
                                                                                                                            replaceNewLines = dialogCell3.message.messageTrimmedToHighlight;
                                                                                                                            int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(((dialogCell3.messagePaddingStart + 23) + ((dialogCell3.thumbSize + 2) * dialogCell3.thumbsCount)) + 3);
                                                                                                                            MessageObject messageObject18 = dialogCell3.message;
                                                                                                                            if (messageObject18.messageTrimmedToHighlightCut) {
                                                                                                                                replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject18.highlightedWords.get(0), measuredWidth3, dialogCell3.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int length2 = charSequence11.length();
                                                                                                                            CharSequence charSequence51 = charSequence11;
                                                                                                                            if (length2 > 150) {
                                                                                                                                charSequence51 = charSequence11.subSequence(0, 150);
                                                                                                                            }
                                                                                                                            replaceNewLines = AndroidUtilities.replaceNewLines(charSequence51);
                                                                                                                        }
                                                                                                                        CharSequence spannableStringBuilder5 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                                                        SpannableStringBuilder spannableStringBuilder6 = (SpannableStringBuilder) spannableStringBuilder5;
                                                                                                                        spannableStringBuilder6.insert(0, (CharSequence) " ");
                                                                                                                        spannableStringBuilder6.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((dialogCell3.thumbSize + 2) * dialogCell3.thumbsCount) + 3)), 0, 1, 33);
                                                                                                                        Emoji.replaceEmoji(spannableStringBuilder6, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                                                                                                                        CharSequence charSequence52 = spannableStringBuilder5;
                                                                                                                        if (dialogCell3.message.hasHighlightedWords()) {
                                                                                                                            CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder6, dialogCell3.message.highlightedWords, dialogCell3.resourcesProvider);
                                                                                                                            charSequence52 = spannableStringBuilder5;
                                                                                                                            if (highlightText4 != null) {
                                                                                                                                charSequence52 = highlightText4;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        z7 = false;
                                                                                                                        charSequence50 = charSequence52;
                                                                                                                    }
                                                                                                                    if (dialogCell3.message.isForwarded() && dialogCell3.message.needDrawForwarded()) {
                                                                                                                        dialogCell3.drawForwardIcon = true;
                                                                                                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence50);
                                                                                                                        spannableStringBuilder7.insert(0, charSequence3);
                                                                                                                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                                                        coloredImageSpan.setAlpha(0.9f);
                                                                                                                        spannableStringBuilder7.setSpan(coloredImageSpan, 0, 1, 0);
                                                                                                                        charSequence12 = spannableStringBuilder7;
                                                                                                                    } else {
                                                                                                                        charSequence12 = charSequence50;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            charSequence3 = "d ";
                                                                                                            if (escape2 == null) {
                                                                                                                escape2 = getMessageNameString();
                                                                                                            }
                                                                                                            CharSequence escape3 = AndroidUtilities.escape(escape2);
                                                                                                            TLRPC.Chat chat9 = dialogCell3.chat;
                                                                                                            if (chat9 != null && chat9.forum && !dialogCell3.isTopic && !dialogCell3.useFromUserAsAvatar) {
                                                                                                                CharSequence topicIconName = MessagesController.getInstance(dialogCell3.currentAccount).getTopicsController().getTopicIconName(dialogCell3.chat, dialogCell3.message, dialogCell3.currentMessagePaint);
                                                                                                                if (!TextUtils.isEmpty(topicIconName)) {
                                                                                                                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("-");
                                                                                                                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                                                    coloredImageSpan2.setColorKey((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? -1 : Theme.key_chats_nameMessage);
                                                                                                                    spannableStringBuilder8.setSpan(coloredImageSpan2, 0, 1, 0);
                                                                                                                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                                                                                                                    spannableStringBuilder9.append(escape3).append((CharSequence) spannableStringBuilder8).append(topicIconName);
                                                                                                                    charSequence16 = spannableStringBuilder9;
                                                                                                                    SpannableStringBuilder messageStringFormatted2 = dialogCell3.getMessageStringFormatted(i, restrictionReason, charSequence16, false);
                                                                                                                    if (!dialogCell3.useFromUserAsAvatar || ((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) && (dialogCell3.currentDialogFolderId == 0 || messageStringFormatted2.length() <= 0))) {
                                                                                                                        i6 = 0;
                                                                                                                    } else {
                                                                                                                        try {
                                                                                                                            foregroundColorSpanThemable = new ForegroundColorSpanThemable(Theme.key_chats_nameMessage, dialogCell3.resourcesProvider);
                                                                                                                            i6 = charSequence16.length() + 1;
                                                                                                                        } catch (Exception e) {
                                                                                                                            e = e;
                                                                                                                            i6 = 0;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            messageStringFormatted2.setSpan(foregroundColorSpanThemable, 0, i6, 33);
                                                                                                                        } catch (Exception e2) {
                                                                                                                            e = e2;
                                                                                                                            FileLog.e(e);
                                                                                                                            CharSequence replaceEmoji = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                                                                                                                            CharSequence charSequence53 = replaceEmoji;
                                                                                                                            if (dialogCell3.message.hasHighlightedWords()) {
                                                                                                                            }
                                                                                                                            CharSequence charSequence54 = charSequence53;
                                                                                                                            if (dialogCell3.thumbsCount > 0) {
                                                                                                                            }
                                                                                                                            charSequence17 = charSequence16;
                                                                                                                            z = z10;
                                                                                                                            z18 = z9;
                                                                                                                            charSequence20 = charSequence54;
                                                                                                                            z7 = false;
                                                                                                                            charSequence22 = charSequence20;
                                                                                                                            if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                                                            }
                                                                                                                            charSequence23 = charSequence9;
                                                                                                                            charSequence7 = null;
                                                                                                                            CharSequence charSequence4322 = charSequence17;
                                                                                                                            charSequence24 = charSequence22;
                                                                                                                            string = charSequence4322;
                                                                                                                            CharSequence charSequence55 = charSequence24;
                                                                                                                            if (!dialogCell3.drawForwardIcon) {
                                                                                                                            }
                                                                                                                            if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                                                                                                                            }
                                                                                                                            stringForMessageListDate = "";
                                                                                                                            dialogCell = dialogCell3;
                                                                                                                            messageObject4 = dialogCell.message;
                                                                                                                            if (messageObject4 != null) {
                                                                                                                            }
                                                                                                                            dialogCell.drawCheck1 = false;
                                                                                                                            dialogCell.drawCheck2 = false;
                                                                                                                            dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                                                                                                                            z12 = false;
                                                                                                                            dialogCell.drawCount = false;
                                                                                                                            dialogCell.drawMention = false;
                                                                                                                            dialogCell.drawReactionMention = false;
                                                                                                                            dialogCell.drawPollVotesMention = false;
                                                                                                                            dialogCell.drawError = false;
                                                                                                                            str6 = null;
                                                                                                                            str7 = null;
                                                                                                                            dialogCell.promoDialog = z12;
                                                                                                                            messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                                                                                                                            if (dialogCell.dialogsType == 0) {
                                                                                                                            }
                                                                                                                            str8 = stringForMessageListDate;
                                                                                                                            charSequence31 = charSequence30;
                                                                                                                            charSequence32 = dialogCell.titleOverride;
                                                                                                                            if (charSequence32 == null) {
                                                                                                                            }
                                                                                                                            str11 = str7;
                                                                                                                            charSequence33 = charSequence23;
                                                                                                                            charSequence38 = charSequence7;
                                                                                                                            z13 = z7;
                                                                                                                            i9 = i4;
                                                                                                                            str12 = str6;
                                                                                                                            str10 = str8;
                                                                                                                            charSequence34 = charSequence29;
                                                                                                                            dialogCell2 = dialogCell;
                                                                                                                            if (!z) {
                                                                                                                            }
                                                                                                                            if (drawLock2()) {
                                                                                                                            }
                                                                                                                            if (LocaleController.isRTL) {
                                                                                                                            }
                                                                                                                            if (dialogCell2.drawNameLock) {
                                                                                                                            }
                                                                                                                            if (!dialogCell2.drawClock) {
                                                                                                                            }
                                                                                                                            dialogCell2.nameAdditionalsForChannelSubscriber = 0;
                                                                                                                            if (dialogCell2.dialogMuted) {
                                                                                                                            }
                                                                                                                            if (!dialogCell2.drawPremium) {
                                                                                                                            }
                                                                                                                            if (!z16) {
                                                                                                                            }
                                                                                                                            if (dialogCell2.drawBotVerified) {
                                                                                                                            }
                                                                                                                            i13 = dialogCell2.namePaddingEnd;
                                                                                                                            if (i13 > 0) {
                                                                                                                            }
                                                                                                                            dp7 = dialogCell2.nameWidth - AndroidUtilities.dp(12.0f);
                                                                                                                            if (dp7 < 0) {
                                                                                                                            }
                                                                                                                            if (charSequence32 instanceof String) {
                                                                                                                            }
                                                                                                                            if (!dialogCell2.nameLayoutEllipsizeByGradient) {
                                                                                                                            }
                                                                                                                            float f2 = dp7;
                                                                                                                            dialogCell2.nameIsEllipsized = Theme.dialogs_namePaint[dialogCell2.paintIndex].measureText(charSequence32.toString()) <= f2;
                                                                                                                            if (!dialogCell2.twoLinesForName) {
                                                                                                                            }
                                                                                                                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence32, Theme.dialogs_namePaint[dialogCell2.paintIndex].getFontMetricsInt(), false);
                                                                                                                            MessageObject messageObject19 = dialogCell2.message;
                                                                                                                            if (messageObject19 == null) {
                                                                                                                            }
                                                                                                                            if (!dialogCell2.twoLinesForName) {
                                                                                                                            }
                                                                                                                            dialogCell2.nameLayoutTranslateX = (dialogCell2.nameLayoutEllipsizeByGradient || !dialogCell2.nameLayout.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(36.0f);
                                                                                                                            dialogCell2.nameLayoutEllipsizeLeft = dialogCell2.nameLayout.isRtlCharAt(0);
                                                                                                                            dialogCell2.animatedEmojiStackName = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStackName, dialogCell2.nameLayout);
                                                                                                                            if (!dialogCell2.useForceThreeLines) {
                                                                                                                            }
                                                                                                                            dp = AndroidUtilities.dp(11.0f);
                                                                                                                            dialogCell2.messageNameTop = AndroidUtilities.dp(32.0f);
                                                                                                                            dialogCell2.timeTop = AndroidUtilities.dp(13.0f);
                                                                                                                            dialogCell2.errorTop = AndroidUtilities.dp(42.33f);
                                                                                                                            dialogCell2.pinTop = AndroidUtilities.dp(43.0f);
                                                                                                                            dialogCell2.countTop = AndroidUtilities.dp(42.33f);
                                                                                                                            dialogCell2.checkDrawTop = AndroidUtilities.dp(13.0f);
                                                                                                                            int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(dialogCell2.messagePaddingStart + 21);
                                                                                                                            if (!LocaleController.isRTL) {
                                                                                                                            }
                                                                                                                            i14 = dp3;
                                                                                                                            dialogCell2.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(56.0f));
                                                                                                                            i15 = 0;
                                                                                                                            while (true) {
                                                                                                                                imageReceiverArr = dialogCell2.thumbImage;
                                                                                                                                if (i15 < imageReceiverArr.length) {
                                                                                                                                }
                                                                                                                                imageReceiverArr[i15].setImageCoords(((dialogCell2.thumbSize + 2) * i15) + i14, ((AndroidUtilities.dp(31.0f) + dp) + (dialogCell2.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = dialogCell2.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                                                                                                                i15++;
                                                                                                                                dp = dp;
                                                                                                                            }
                                                                                                                            i16 = measuredWidth4;
                                                                                                                            i17 = dp;
                                                                                                                            if (!LocaleController.isRTL) {
                                                                                                                            }
                                                                                                                            if (dialogCell2.twoLinesForName) {
                                                                                                                            }
                                                                                                                            if (!dialogCell2.useForceThreeLines) {
                                                                                                                                dialogCell2.timeTop -= AndroidUtilities.dp(6.0f);
                                                                                                                                dialogCell2.checkDrawTop -= AndroidUtilities.dp(6.0f);
                                                                                                                                if (getIsPinned()) {
                                                                                                                                }
                                                                                                                                if (dialogCell2.drawError) {
                                                                                                                                }
                                                                                                                                charSequence35 = charSequence38;
                                                                                                                                if (z13) {
                                                                                                                                }
                                                                                                                                int max = Math.max(AndroidUtilities.dp(12.0f), i16);
                                                                                                                                dialogCell2.buttonTop = AndroidUtilities.dp((!dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                                                if (!dialogCell2.useForceThreeLines) {
                                                                                                                                }
                                                                                                                                dialogCell2.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
                                                                                                                                if (isForumCell()) {
                                                                                                                                }
                                                                                                                                CharSequence charSequence56 = charSequence34;
                                                                                                                                if (dialogCell2.twoLinesForName) {
                                                                                                                                }
                                                                                                                                dialogCell2.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStack2, dialogCell2.messageNameLayout);
                                                                                                                                dialogCell2.buttonCreated = false;
                                                                                                                                if (!TextUtils.isEmpty(charSequence35)) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                            dialogCell2.timeTop -= AndroidUtilities.dp(6.0f);
                                                                                                                            dialogCell2.checkDrawTop -= AndroidUtilities.dp(6.0f);
                                                                                                                            if (getIsPinned()) {
                                                                                                                            }
                                                                                                                            if (dialogCell2.drawError) {
                                                                                                                            }
                                                                                                                            charSequence35 = charSequence38;
                                                                                                                            if (z13) {
                                                                                                                            }
                                                                                                                            int max2 = Math.max(AndroidUtilities.dp(12.0f), i16);
                                                                                                                            dialogCell2.buttonTop = AndroidUtilities.dp((!dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                                            if (!dialogCell2.useForceThreeLines) {
                                                                                                                            }
                                                                                                                            dialogCell2.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
                                                                                                                            if (isForumCell()) {
                                                                                                                            }
                                                                                                                            CharSequence charSequence562 = charSequence34;
                                                                                                                            if (dialogCell2.twoLinesForName) {
                                                                                                                            }
                                                                                                                            dialogCell2.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStack2, dialogCell2.messageNameLayout);
                                                                                                                            dialogCell2.buttonCreated = false;
                                                                                                                            if (!TextUtils.isEmpty(charSequence35)) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    CharSequence replaceEmoji3 = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                                                                                                                    CharSequence charSequence532 = replaceEmoji3;
                                                                                                                    if (dialogCell3.message.hasHighlightedWords()) {
                                                                                                                        CharSequence highlightText5 = AndroidUtilities.highlightText(replaceEmoji3, dialogCell3.message.highlightedWords, dialogCell3.resourcesProvider);
                                                                                                                        charSequence532 = replaceEmoji3;
                                                                                                                        if (highlightText5 != null) {
                                                                                                                            charSequence532 = highlightText5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    CharSequence charSequence542 = charSequence532;
                                                                                                                    if (dialogCell3.thumbsCount > 0) {
                                                                                                                        boolean z26 = charSequence532 instanceof SpannableStringBuilder;
                                                                                                                        CharSequence charSequence57 = charSequence532;
                                                                                                                        if (!z26) {
                                                                                                                            charSequence57 = new SpannableStringBuilder(charSequence532);
                                                                                                                        }
                                                                                                                        SpannableStringBuilder spannableStringBuilder10 = (SpannableStringBuilder) charSequence57;
                                                                                                                        if (i6 >= spannableStringBuilder10.length()) {
                                                                                                                            spannableStringBuilder10.append((CharSequence) " ");
                                                                                                                            spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((dialogCell3.thumbsCount * (dialogCell3.thumbSize + 2)) + 3)), spannableStringBuilder10.length() - 1, spannableStringBuilder10.length(), 33);
                                                                                                                            charSequence542 = charSequence57;
                                                                                                                        } else {
                                                                                                                            spannableStringBuilder10.insert(i6, (CharSequence) " ");
                                                                                                                            spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((dialogCell3.thumbsCount * (dialogCell3.thumbSize + 2)) + 3)), i6, i6 + 1, 33);
                                                                                                                            charSequence542 = charSequence57;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    charSequence17 = charSequence16;
                                                                                                                    z = z10;
                                                                                                                    z18 = z9;
                                                                                                                    charSequence20 = charSequence542;
                                                                                                                    z7 = false;
                                                                                                                    charSequence22 = charSequence20;
                                                                                                                    if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                                                        charSequence17 = formatCommunityDialogNames();
                                                                                                                    } else if (dialogCell3.currentDialogFolderId != 0) {
                                                                                                                        charSequence17 = formatArchivedDialogNames();
                                                                                                                    }
                                                                                                                    charSequence23 = charSequence9;
                                                                                                                    charSequence7 = null;
                                                                                                                    CharSequence charSequence43222 = charSequence17;
                                                                                                                    charSequence24 = charSequence22;
                                                                                                                    string = charSequence43222;
                                                                                                                }
                                                                                                            }
                                                                                                            charSequence16 = escape3;
                                                                                                            SpannableStringBuilder messageStringFormatted22 = dialogCell3.getMessageStringFormatted(i, restrictionReason, charSequence16, false);
                                                                                                            if (dialogCell3.useFromUserAsAvatar) {
                                                                                                            }
                                                                                                            i6 = 0;
                                                                                                            CharSequence replaceEmoji32 = Emoji.replaceEmoji(messageStringFormatted22, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                                                                                                            CharSequence charSequence5322 = replaceEmoji32;
                                                                                                            if (dialogCell3.message.hasHighlightedWords()) {
                                                                                                            }
                                                                                                            CharSequence charSequence5422 = charSequence5322;
                                                                                                            if (dialogCell3.thumbsCount > 0) {
                                                                                                            }
                                                                                                            charSequence17 = charSequence16;
                                                                                                            z = z10;
                                                                                                            z18 = z9;
                                                                                                            charSequence20 = charSequence5422;
                                                                                                            z7 = false;
                                                                                                            charSequence22 = charSequence20;
                                                                                                            if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                                            }
                                                                                                            charSequence23 = charSequence9;
                                                                                                            charSequence7 = null;
                                                                                                            CharSequence charSequence432222 = charSequence17;
                                                                                                            charSequence24 = charSequence22;
                                                                                                            string = charSequence432222;
                                                                                                        }
                                                                                                    }
                                                                                                    charSequence3 = "d ";
                                                                                                    z = z10;
                                                                                                    z18 = z9;
                                                                                                    charSequence17 = null;
                                                                                                    charSequence20 = charSequence21;
                                                                                                    z7 = false;
                                                                                                    charSequence22 = charSequence20;
                                                                                                    if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                                    }
                                                                                                    charSequence23 = charSequence9;
                                                                                                    charSequence7 = null;
                                                                                                    CharSequence charSequence4322222 = charSequence17;
                                                                                                    charSequence24 = charSequence22;
                                                                                                    string = charSequence4322222;
                                                                                                }
                                                                                                charSequence3 = "d ";
                                                                                                charSequence17 = null;
                                                                                                z18 = false;
                                                                                                z = false;
                                                                                                charSequence22 = str4;
                                                                                                if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                                }
                                                                                                charSequence23 = charSequence9;
                                                                                                charSequence7 = null;
                                                                                                CharSequence charSequence43222222 = charSequence17;
                                                                                                charSequence24 = charSequence22;
                                                                                                string = charSequence43222222;
                                                                                            }
                                                                                            z = z10;
                                                                                            z18 = z9;
                                                                                            charSequence25 = charSequence12;
                                                                                            charSequence17 = null;
                                                                                            charSequence22 = charSequence25;
                                                                                            if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                            }
                                                                                            charSequence23 = charSequence9;
                                                                                            charSequence7 = null;
                                                                                            CharSequence charSequence432222222 = charSequence17;
                                                                                            charSequence24 = charSequence22;
                                                                                            string = charSequence432222222;
                                                                                        }
                                                                                        charSequence9 = charSequence2;
                                                                                        charSequence10 = "";
                                                                                        z11 = false;
                                                                                        if (!z11) {
                                                                                        }
                                                                                        z = z10;
                                                                                        z18 = z9;
                                                                                        charSequence25 = charSequence12;
                                                                                        charSequence17 = null;
                                                                                        charSequence22 = charSequence25;
                                                                                        if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                        }
                                                                                        charSequence23 = charSequence9;
                                                                                        charSequence7 = null;
                                                                                        CharSequence charSequence4322222222 = charSequence17;
                                                                                        charSequence24 = charSequence22;
                                                                                        string = charSequence4322222222;
                                                                                    }
                                                                                    z9 = z18;
                                                                                    z10 = z;
                                                                                    charSequence9 = charSequence2;
                                                                                    charSequence10 = "";
                                                                                    z11 = false;
                                                                                    if (!z11) {
                                                                                    }
                                                                                    z = z10;
                                                                                    z18 = z9;
                                                                                    charSequence25 = charSequence12;
                                                                                    charSequence17 = null;
                                                                                    charSequence22 = charSequence25;
                                                                                    if (dialogCell3.currentDialogCommunityId != 0) {
                                                                                    }
                                                                                    charSequence23 = charSequence9;
                                                                                    charSequence7 = null;
                                                                                    CharSequence charSequence43222222222 = charSequence17;
                                                                                    charSequence24 = charSequence22;
                                                                                    string = charSequence43222222222;
                                                                                }
                                                                            }
                                                                            i4 = i3;
                                                                            z9 = z18;
                                                                            z10 = z;
                                                                            charSequence9 = charSequence2;
                                                                            charSequence10 = "";
                                                                            z11 = false;
                                                                            if (!z11) {
                                                                            }
                                                                            z = z10;
                                                                            z18 = z9;
                                                                            charSequence25 = charSequence12;
                                                                            charSequence17 = null;
                                                                            charSequence22 = charSequence25;
                                                                            if (dialogCell3.currentDialogCommunityId != 0) {
                                                                            }
                                                                            charSequence23 = charSequence9;
                                                                            charSequence7 = null;
                                                                            CharSequence charSequence432222222222 = charSequence17;
                                                                            charSequence24 = charSequence22;
                                                                            string = charSequence432222222222;
                                                                        } else if (dialogCell3.currentDialogCommunityId != 0) {
                                                                            string3 = formatCommunityDialogNames();
                                                                        } else if (dialogCell3.currentDialogFolderId != 0) {
                                                                            string3 = formatArchivedDialogNames();
                                                                        } else {
                                                                            TLRPC.EncryptedChat encryptedChat = dialogCell3.encryptedChat;
                                                                            if (encryptedChat != null) {
                                                                                dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                                                    string3 = LocaleController.getString(R.string.EncryptionProcessing);
                                                                                } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                                                    string3 = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(dialogCell3.user));
                                                                                } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                                                    string3 = LocaleController.getString(R.string.EncryptionRejected);
                                                                                } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                                                    if (encryptedChat.admin_id == UserConfig.getInstance(dialogCell3.currentAccount).getClientUserId()) {
                                                                                        string3 = LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(dialogCell3.user));
                                                                                    } else {
                                                                                        string3 = LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                                                    }
                                                                                }
                                                                            } else if (dialogCell3.dialogsType == 3 && UserObject.isUserSelf(dialogCell3.user)) {
                                                                                DialogsActivity dialogsActivity2 = dialogCell3.parentFragment;
                                                                                string2 = LocaleController.getString((dialogsActivity2 == null || !dialogsActivity2.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                                i4 = i3;
                                                                                charSequence3 = "d ";
                                                                                string = null;
                                                                                z18 = false;
                                                                                z = false;
                                                                                charSequence7 = null;
                                                                                charSequence24 = string2;
                                                                                charSequence23 = charSequence2;
                                                                            }
                                                                            i4 = i3;
                                                                            charSequence3 = "d ";
                                                                            charSequence26 = "";
                                                                            string = null;
                                                                            string2 = charSequence26;
                                                                            charSequence7 = null;
                                                                            charSequence24 = string2;
                                                                            charSequence23 = charSequence2;
                                                                        }
                                                                    }
                                                                    charSequence26 = string3;
                                                                    i4 = i3;
                                                                    charSequence3 = "d ";
                                                                    string = null;
                                                                    string2 = charSequence26;
                                                                    charSequence7 = null;
                                                                    charSequence24 = string2;
                                                                    charSequence23 = charSequence2;
                                                                }
                                                                CharSequence charSequence552 = charSequence24;
                                                                if (!dialogCell3.drawForwardIcon) {
                                                                    charSequence552 = charSequence24;
                                                                    if (!isFolderCell()) {
                                                                        charSequence552 = charSequence24;
                                                                        if (!isForumCell()) {
                                                                            charSequence552 = charSequence24;
                                                                            if (!isDialogFolder()) {
                                                                                charSequence552 = charSequence24;
                                                                                if (dialogCell3.draftMessage == null) {
                                                                                    MessageObject messageObject20 = dialogCell3.message;
                                                                                    charSequence552 = charSequence24;
                                                                                    if (messageObject20 != null) {
                                                                                        TLRPC.Message message4 = messageObject20.messageOwner;
                                                                                        charSequence552 = charSequence24;
                                                                                        if (message4 != null) {
                                                                                            charSequence552 = charSequence24;
                                                                                            if (message4.action instanceof TLRPC.TL_messageActionStarGift) {
                                                                                                dialogCell3.drawGiftIcon = true;
                                                                                                SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(charSequence24);
                                                                                                spannableStringBuilder11.insert(0, charSequence3);
                                                                                                ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_gift).mutate());
                                                                                                coloredImageSpan3.setScale(1.25f, 1.25f);
                                                                                                coloredImageSpan3.spaceScaleX = 0.9f;
                                                                                                coloredImageSpan3.setAlpha(0.9f);
                                                                                                spannableStringBuilder11.setSpan(coloredImageSpan3, 0, 1, 0);
                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities5 = ((TLRPC.TL_messageActionStarGift) dialogCell3.message.messageOwner.action).message;
                                                                                                if (tL_textWithEntities5 != null && !TextUtils.isEmpty(tL_textWithEntities5.text)) {
                                                                                                    dialogCell3.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell3.paintIndex];
                                                                                                }
                                                                                                charSequence552 = spannableStringBuilder11;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                                                                    if (dialogCell3.draftMessage != null) {
                                                                        stringForMessageListDate = LocaleController.stringForMessageListDate(r2.date);
                                                                        dialogCell = this;
                                                                        charSequence29 = string;
                                                                        charSequence30 = charSequence552;
                                                                    } else {
                                                                        int i30 = dialogCell3.lastMessageDate;
                                                                        if (i30 != 0) {
                                                                            charSequence29 = string;
                                                                            charSequence30 = charSequence552;
                                                                            stringForMessageListDate = LocaleController.stringForMessageListDate(i30);
                                                                            dialogCell = dialogCell3;
                                                                        } else {
                                                                            charSequence29 = string;
                                                                            charSequence30 = charSequence552;
                                                                            if (dialogCell3.message != null) {
                                                                                stringForMessageListDate = LocaleController.stringForMessageListDate(r0.messageOwner.date);
                                                                                dialogCell = dialogCell3;
                                                                            }
                                                                        }
                                                                    }
                                                                    messageObject4 = dialogCell.message;
                                                                    if (messageObject4 != null || dialogCell.isSavedDialog) {
                                                                        dialogCell.drawCheck1 = false;
                                                                        dialogCell.drawCheck2 = false;
                                                                        dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                                                                        z12 = false;
                                                                        dialogCell.drawCount = false;
                                                                        dialogCell.drawMention = false;
                                                                        dialogCell.drawReactionMention = false;
                                                                        dialogCell.drawPollVotesMention = false;
                                                                        dialogCell.drawError = false;
                                                                        str6 = null;
                                                                        str7 = null;
                                                                    } else {
                                                                        if (dialogCell.currentDialogFolderId != 0) {
                                                                            int i31 = dialogCell.unreadCount;
                                                                            int i32 = dialogCell.mentionCount;
                                                                            int i33 = i31 + i32;
                                                                            if (i33 <= 0) {
                                                                                z15 = false;
                                                                                dialogCell.drawCount = false;
                                                                                dialogCell.drawMention = false;
                                                                                str6 = null;
                                                                            } else if (i31 > i32) {
                                                                                dialogCell.drawCount = true;
                                                                                z15 = false;
                                                                                dialogCell.drawMention = false;
                                                                                str6 = String.format("%d", Integer.valueOf(i33));
                                                                            } else {
                                                                                z15 = false;
                                                                                dialogCell.drawCount = false;
                                                                                dialogCell.drawMention = true;
                                                                                str13 = String.format("%d", Integer.valueOf(i33));
                                                                                str6 = null;
                                                                                dialogCell.drawReactionMention = z15;
                                                                                dialogCell.drawPollVotesMention = z15;
                                                                            }
                                                                            str13 = null;
                                                                            dialogCell.drawReactionMention = z15;
                                                                            dialogCell.drawPollVotesMention = z15;
                                                                        } else {
                                                                            if (dialogCell.clearingDialog) {
                                                                                dialogCell.drawCount = false;
                                                                                str6 = null;
                                                                                z14 = true;
                                                                                z18 = false;
                                                                            } else {
                                                                                int i34 = dialogCell.unreadCount;
                                                                                if (i34 != 0) {
                                                                                    z14 = true;
                                                                                    dialogCell.drawCount = true;
                                                                                    str6 = String.format("%d", Integer.valueOf(i34));
                                                                                } else {
                                                                                    z14 = true;
                                                                                    if (dialogCell.markUnread) {
                                                                                        dialogCell.drawCount = true;
                                                                                        str6 = "";
                                                                                    } else {
                                                                                        dialogCell.drawCount = false;
                                                                                        str6 = null;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (dialogCell.mentionCount != 0) {
                                                                                dialogCell.drawMention = z14;
                                                                                str13 = "@";
                                                                            } else {
                                                                                dialogCell.drawMention = false;
                                                                                str13 = null;
                                                                            }
                                                                            dialogCell.drawReactionMention = dialogCell.reactionMentionCount > 0;
                                                                            dialogCell.drawPollVotesMention = dialogCell.pollVotesMentionCount > 0;
                                                                        }
                                                                        if (dialogCell.message.isOut() && dialogCell.draftMessage == null && z18) {
                                                                            MessageObject messageObject21 = dialogCell.message;
                                                                            if (!(messageObject21.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                                                if (messageObject21.isSending()) {
                                                                                    dialogCell.drawCheck1 = false;
                                                                                    dialogCell.drawCheck2 = false;
                                                                                    dialogCell.drawClock = true;
                                                                                    dialogCell.drawError = false;
                                                                                } else if (dialogCell.message.isSendError()) {
                                                                                    dialogCell.drawCheck1 = false;
                                                                                    dialogCell.drawCheck2 = false;
                                                                                    dialogCell.drawClock = false;
                                                                                    dialogCell.drawError = true;
                                                                                    dialogCell.drawCount = false;
                                                                                    dialogCell.drawMention = false;
                                                                                } else if (dialogCell.message.isSent()) {
                                                                                    TLRPC.TL_forumTopic tL_forumTopic = dialogCell.forumTopic;
                                                                                    if (tL_forumTopic != null) {
                                                                                        dialogCell.drawCheck1 = tL_forumTopic.read_outbox_max_id >= dialogCell.message.getId();
                                                                                    } else if (dialogCell.isDialogCell) {
                                                                                        int i35 = dialogCell.readOutboxMaxId;
                                                                                        dialogCell.drawCheck1 = (i35 > 0 && i35 >= dialogCell.message.getId()) || !dialogCell.message.isUnread() || (ChatObject.isChannel(dialogCell.chat) && !dialogCell.chat.megagroup);
                                                                                    } else {
                                                                                        dialogCell.drawCheck1 = !dialogCell.message.isUnread() || (ChatObject.isChannel(dialogCell.chat) && !dialogCell.chat.megagroup);
                                                                                    }
                                                                                    dialogCell.drawCheck2 = true;
                                                                                    dialogCell.drawClock = false;
                                                                                    dialogCell.drawError = false;
                                                                                }
                                                                                str7 = str13;
                                                                                z12 = false;
                                                                            }
                                                                        }
                                                                        dialogCell.drawCheck1 = false;
                                                                        dialogCell.drawCheck2 = false;
                                                                        dialogCell.drawClock = false;
                                                                        dialogCell.drawError = false;
                                                                        str7 = str13;
                                                                        z12 = false;
                                                                    }
                                                                    dialogCell.promoDialog = z12;
                                                                    messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                                                                    if (dialogCell.dialogsType == 0 && messagesController.isPromoDialog(dialogCell.currentDialogId, true)) {
                                                                        dialogCell.drawPinBackground = true;
                                                                        dialogCell.promoDialog = true;
                                                                        i10 = messagesController.promoDialogType;
                                                                        if (i10 != MessagesController.PROMO_TYPE_PROXY) {
                                                                            str8 = LocaleController.getString(R.string.UseProxySponsor);
                                                                            charSequence31 = charSequence30;
                                                                            charSequence32 = dialogCell.titleOverride;
                                                                            if (charSequence32 == null) {
                                                                                if (dialogCell.currentDialogFolderId != 0) {
                                                                                    charSequence32 = LocaleController.getString(R.string.ArchivedChats);
                                                                                } else {
                                                                                    TLRPC.Chat chat10 = dialogCell.chat;
                                                                                    if (chat10 != null) {
                                                                                        if (dialogCell.useFromUserAsAvatar) {
                                                                                            if (dialogCell.topicIconInName == null) {
                                                                                                dialogCell.topicIconInName = new Drawable[1];
                                                                                            }
                                                                                            dialogCell.topicIconInName[0] = null;
                                                                                            topicSpannedName = MessagesController.getInstance(dialogCell.currentAccount).getTopicsController().getTopicIconName(dialogCell.chat, dialogCell.message, dialogCell.currentMessagePaint, dialogCell.topicIconInName);
                                                                                            str9 = str6;
                                                                                        } else if (dialogCell.isTopic) {
                                                                                            if (dialogCell.topicIconInName == null) {
                                                                                                dialogCell.topicIconInName = new Drawable[1];
                                                                                            }
                                                                                            Drawable[] drawableArr = dialogCell.topicIconInName;
                                                                                            drawableArr[0] = null;
                                                                                            topicSpannedName = dialogCell.showTopicIconInName ? ForumUtilities.getTopicSpannedName(dialogCell.forumTopic, Theme.dialogs_namePaint[dialogCell.paintIndex], drawableArr, false) : AndroidUtilities.escape(dialogCell.forumTopic.title);
                                                                                            str9 = str6;
                                                                                        } else {
                                                                                            if (chat10.monoforum && chat10.linked_monoforum_id != 0) {
                                                                                                TLRPC.Chat chat11 = MessagesController.getInstance(dialogCell.currentAccount).getChat(Long.valueOf(dialogCell.chat.linked_monoforum_id));
                                                                                                if (chat11 != null) {
                                                                                                    SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(AndroidUtilities.escape(chat11.title));
                                                                                                    spannableStringBuilder12.append((CharSequence) " ");
                                                                                                    int length3 = spannableStringBuilder12.length();
                                                                                                    int i36 = R.string.MonoforumSpan;
                                                                                                    spannableStringBuilder12.append((CharSequence) LocaleController.getString(i36));
                                                                                                    str9 = str6;
                                                                                                    spannableStringBuilder12.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i36), 9.33f, Theme.key_windowBackgroundWhiteGrayText, dialogCell.resourcesProvider), length3, spannableStringBuilder12.length(), 33);
                                                                                                    charSequence32 = spannableStringBuilder12;
                                                                                                } else {
                                                                                                    str9 = str6;
                                                                                                    escape = AndroidUtilities.escape(dialogCell.chat.title);
                                                                                                }
                                                                                            } else {
                                                                                                str9 = str6;
                                                                                                escape = AndroidUtilities.escape(chat10.title);
                                                                                            }
                                                                                            charSequence32 = escape;
                                                                                        }
                                                                                        charSequence32 = topicSpannedName;
                                                                                    } else {
                                                                                        str9 = str6;
                                                                                        TLRPC.User user7 = dialogCell.user;
                                                                                        if (user7 != null) {
                                                                                            if (UserObject.isReplyUser(user7)) {
                                                                                                escape = LocaleController.getString(R.string.RepliesTitle);
                                                                                            } else if (UserObject.isAnonymous(dialogCell.user)) {
                                                                                                escape = LocaleController.getString(R.string.AnonymousForward);
                                                                                            } else if (UserObject.isUserSelf(dialogCell.user) && !dialogCell.isMonoForumTopicDialog) {
                                                                                                if (dialogCell.isSavedDialog) {
                                                                                                    escape = LocaleController.getString(R.string.MyNotes);
                                                                                                } else if (dialogCell.useMeForMyMessages) {
                                                                                                    escape = LocaleController.getString(R.string.FromYou);
                                                                                                } else {
                                                                                                    if (dialogCell.dialogsType == 3) {
                                                                                                        dialogCell.drawPinBackground = true;
                                                                                                    }
                                                                                                    escape = LocaleController.getString(R.string.SavedMessages);
                                                                                                }
                                                                                            } else if (dialogCell.isTopic) {
                                                                                                if (dialogCell.topicIconInName == null) {
                                                                                                    dialogCell.topicIconInName = new Drawable[1];
                                                                                                }
                                                                                                Drawable[] drawableArr2 = dialogCell.topicIconInName;
                                                                                                drawableArr2[0] = null;
                                                                                                escape = dialogCell.showTopicIconInName ? ForumUtilities.getTopicSpannedName(dialogCell.forumTopic, Theme.dialogs_namePaint[dialogCell.paintIndex], drawableArr2, false) : AndroidUtilities.escape(dialogCell.forumTopic.title);
                                                                                            } else {
                                                                                                escape = AndroidUtilities.escape(UserObject.getUserName(dialogCell.user));
                                                                                            }
                                                                                            charSequence32 = escape;
                                                                                        }
                                                                                        charSequence32 = "";
                                                                                    }
                                                                                    if (charSequence32 != null && charSequence32.length() == 0) {
                                                                                        charSequence32 = LocaleController.getString(R.string.HiddenName);
                                                                                    }
                                                                                    str10 = str8;
                                                                                    str11 = str7;
                                                                                    charSequence33 = charSequence23;
                                                                                    charSequence34 = charSequence29;
                                                                                    charSequence38 = charSequence7;
                                                                                    z13 = z7;
                                                                                    str12 = str9;
                                                                                    i9 = i4;
                                                                                    dialogCell2 = dialogCell;
                                                                                }
                                                                            }
                                                                            str11 = str7;
                                                                            charSequence33 = charSequence23;
                                                                            charSequence38 = charSequence7;
                                                                            z13 = z7;
                                                                            i9 = i4;
                                                                            str12 = str6;
                                                                            str10 = str8;
                                                                            charSequence34 = charSequence29;
                                                                            dialogCell2 = dialogCell;
                                                                        } else if (i10 == MessagesController.PROMO_TYPE_PSA) {
                                                                            stringForMessageListDate = LocaleController.getString("PsaType_" + messagesController.promoPsaType);
                                                                            if (TextUtils.isEmpty(stringForMessageListDate)) {
                                                                                stringForMessageListDate = LocaleController.getString(R.string.PsaTypeDefault);
                                                                            }
                                                                            if (!TextUtils.isEmpty(messagesController.promoPsaMessage)) {
                                                                                String str18 = messagesController.promoPsaMessage;
                                                                                dialogCell.thumbsCount = 0;
                                                                                String str19 = stringForMessageListDate;
                                                                                charSequence31 = str18;
                                                                                str8 = str19;
                                                                                charSequence32 = dialogCell.titleOverride;
                                                                                if (charSequence32 == null) {
                                                                                }
                                                                                str11 = str7;
                                                                                charSequence33 = charSequence23;
                                                                                charSequence38 = charSequence7;
                                                                                z13 = z7;
                                                                                i9 = i4;
                                                                                str12 = str6;
                                                                                str10 = str8;
                                                                                charSequence34 = charSequence29;
                                                                                dialogCell2 = dialogCell;
                                                                            }
                                                                        }
                                                                    }
                                                                    str8 = stringForMessageListDate;
                                                                    charSequence31 = charSequence30;
                                                                    charSequence32 = dialogCell.titleOverride;
                                                                    if (charSequence32 == null) {
                                                                    }
                                                                    str11 = str7;
                                                                    charSequence33 = charSequence23;
                                                                    charSequence38 = charSequence7;
                                                                    z13 = z7;
                                                                    i9 = i4;
                                                                    str12 = str6;
                                                                    str10 = str8;
                                                                    charSequence34 = charSequence29;
                                                                    dialogCell2 = dialogCell;
                                                                } else {
                                                                    charSequence29 = string;
                                                                    charSequence30 = charSequence552;
                                                                }
                                                                stringForMessageListDate = "";
                                                                dialogCell = dialogCell3;
                                                                messageObject4 = dialogCell.message;
                                                                if (messageObject4 != null) {
                                                                }
                                                                dialogCell.drawCheck1 = false;
                                                                dialogCell.drawCheck2 = false;
                                                                dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                                                                z12 = false;
                                                                dialogCell.drawCount = false;
                                                                dialogCell.drawMention = false;
                                                                dialogCell.drawReactionMention = false;
                                                                dialogCell.drawPollVotesMention = false;
                                                                dialogCell.drawError = false;
                                                                str6 = null;
                                                                str7 = null;
                                                                dialogCell.promoDialog = z12;
                                                                messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                                                                if (dialogCell.dialogsType == 0) {
                                                                    dialogCell.drawPinBackground = true;
                                                                    dialogCell.promoDialog = true;
                                                                    i10 = messagesController.promoDialogType;
                                                                    if (i10 != MessagesController.PROMO_TYPE_PROXY) {
                                                                    }
                                                                }
                                                                str8 = stringForMessageListDate;
                                                                charSequence31 = charSequence30;
                                                                charSequence32 = dialogCell.titleOverride;
                                                                if (charSequence32 == null) {
                                                                }
                                                                str11 = str7;
                                                                charSequence33 = charSequence23;
                                                                charSequence38 = charSequence7;
                                                                z13 = z7;
                                                                i9 = i4;
                                                                str12 = str6;
                                                                str10 = str8;
                                                                charSequence34 = charSequence29;
                                                                dialogCell2 = dialogCell;
                                                            }
                                                            z7 = true;
                                                            i4 = -1;
                                                            charSequence24 = charSequence27;
                                                            charSequence23 = charSequence28;
                                                            CharSequence charSequence5522 = charSequence24;
                                                            if (!dialogCell3.drawForwardIcon) {
                                                            }
                                                            if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                                                            }
                                                            stringForMessageListDate = "";
                                                            dialogCell = dialogCell3;
                                                            messageObject4 = dialogCell.message;
                                                            if (messageObject4 != null) {
                                                            }
                                                            dialogCell.drawCheck1 = false;
                                                            dialogCell.drawCheck2 = false;
                                                            dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                                                            z12 = false;
                                                            dialogCell.drawCount = false;
                                                            dialogCell.drawMention = false;
                                                            dialogCell.drawReactionMention = false;
                                                            dialogCell.drawPollVotesMention = false;
                                                            dialogCell.drawError = false;
                                                            str6 = null;
                                                            str7 = null;
                                                            dialogCell.promoDialog = z12;
                                                            messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                                                            if (dialogCell.dialogsType == 0) {
                                                            }
                                                            str8 = stringForMessageListDate;
                                                            charSequence31 = charSequence30;
                                                            charSequence32 = dialogCell.titleOverride;
                                                            if (charSequence32 == null) {
                                                            }
                                                            str11 = str7;
                                                            charSequence33 = charSequence23;
                                                            charSequence38 = charSequence7;
                                                            z13 = z7;
                                                            i9 = i4;
                                                            str12 = str6;
                                                            str10 = str8;
                                                            charSequence34 = charSequence29;
                                                            dialogCell2 = dialogCell;
                                                        }
                                                    }
                                                    draftMessage = dialogCell3.draftMessage;
                                                    if (draftMessage != null) {
                                                        if (i2 > draftMessage.date) {
                                                        }
                                                    }
                                                }
                                                if (ChatObject.isChannel(dialogCell3.chat)) {
                                                    TLRPC.Chat chat12 = dialogCell3.chat;
                                                    if (!chat12.megagroup) {
                                                        if (!chat12.creator) {
                                                            TLRPC.TL_chatAdminRights tL_chatAdminRights = chat12.admin_rights;
                                                            if (tL_chatAdminRights != null) {
                                                            }
                                                            draftMessage4 = null;
                                                            dialogCell3.draftMessage = null;
                                                            z6 = false;
                                                            dialogCell3.draftVoice = false;
                                                            if (isForumCell()) {
                                                            }
                                                            z7 = true;
                                                            i4 = -1;
                                                            charSequence24 = charSequence27;
                                                            charSequence23 = charSequence28;
                                                            CharSequence charSequence55222 = charSequence24;
                                                            if (!dialogCell3.drawForwardIcon) {
                                                            }
                                                            if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                                                            }
                                                            stringForMessageListDate = "";
                                                            dialogCell = dialogCell3;
                                                            messageObject4 = dialogCell.message;
                                                            if (messageObject4 != null) {
                                                            }
                                                            dialogCell.drawCheck1 = false;
                                                            dialogCell.drawCheck2 = false;
                                                            dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                                                            z12 = false;
                                                            dialogCell.drawCount = false;
                                                            dialogCell.drawMention = false;
                                                            dialogCell.drawReactionMention = false;
                                                            dialogCell.drawPollVotesMention = false;
                                                            dialogCell.drawError = false;
                                                            str6 = null;
                                                            str7 = null;
                                                            dialogCell.promoDialog = z12;
                                                            messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                                                            if (dialogCell.dialogsType == 0) {
                                                            }
                                                            str8 = stringForMessageListDate;
                                                            charSequence31 = charSequence30;
                                                            charSequence32 = dialogCell.titleOverride;
                                                            if (charSequence32 == null) {
                                                            }
                                                            str11 = str7;
                                                            charSequence33 = charSequence23;
                                                            charSequence38 = charSequence7;
                                                            z13 = z7;
                                                            i9 = i4;
                                                            str12 = str6;
                                                            str10 = str8;
                                                            charSequence34 = charSequence29;
                                                            dialogCell2 = dialogCell;
                                                        }
                                                    }
                                                }
                                                chat2 = dialogCell3.chat;
                                                if ((chat2 != null || (!chat2.left && !chat2.kicked)) && !dialogCell3.forbidDraft && (!ChatObject.isForum(chat2) || dialogCell3.isTopic)) {
                                                    draftMessage4 = null;
                                                    z6 = false;
                                                    if (isForumCell()) {
                                                    }
                                                    z7 = true;
                                                    i4 = -1;
                                                    charSequence24 = charSequence27;
                                                    charSequence23 = charSequence28;
                                                    CharSequence charSequence552222 = charSequence24;
                                                    if (!dialogCell3.drawForwardIcon) {
                                                    }
                                                    if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                                                    }
                                                    stringForMessageListDate = "";
                                                    dialogCell = dialogCell3;
                                                    messageObject4 = dialogCell.message;
                                                    if (messageObject4 != null) {
                                                    }
                                                    dialogCell.drawCheck1 = false;
                                                    dialogCell.drawCheck2 = false;
                                                    dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                                                    z12 = false;
                                                    dialogCell.drawCount = false;
                                                    dialogCell.drawMention = false;
                                                    dialogCell.drawReactionMention = false;
                                                    dialogCell.drawPollVotesMention = false;
                                                    dialogCell.drawError = false;
                                                    str6 = null;
                                                    str7 = null;
                                                    dialogCell.promoDialog = z12;
                                                    messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                                                    if (dialogCell.dialogsType == 0) {
                                                    }
                                                    str8 = stringForMessageListDate;
                                                    charSequence31 = charSequence30;
                                                    charSequence32 = dialogCell.titleOverride;
                                                    if (charSequence32 == null) {
                                                    }
                                                    str11 = str7;
                                                    charSequence33 = charSequence23;
                                                    charSequence38 = charSequence7;
                                                    z13 = z7;
                                                    i9 = i4;
                                                    str12 = str6;
                                                    str10 = str8;
                                                    charSequence34 = charSequence29;
                                                    dialogCell2 = dialogCell;
                                                }
                                                draftMessage4 = null;
                                                dialogCell3.draftMessage = null;
                                                z6 = false;
                                                dialogCell3.draftVoice = false;
                                                if (isForumCell()) {
                                                }
                                                z7 = true;
                                                i4 = -1;
                                                charSequence24 = charSequence27;
                                                charSequence23 = charSequence28;
                                                CharSequence charSequence5522222 = charSequence24;
                                                if (!dialogCell3.drawForwardIcon) {
                                                }
                                                if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                                                }
                                                stringForMessageListDate = "";
                                                dialogCell = dialogCell3;
                                                messageObject4 = dialogCell.message;
                                                if (messageObject4 != null) {
                                                }
                                                dialogCell.drawCheck1 = false;
                                                dialogCell.drawCheck2 = false;
                                                dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                                                z12 = false;
                                                dialogCell.drawCount = false;
                                                dialogCell.drawMention = false;
                                                dialogCell.drawReactionMention = false;
                                                dialogCell.drawPollVotesMention = false;
                                                dialogCell.drawError = false;
                                                str6 = null;
                                                str7 = null;
                                                dialogCell.promoDialog = z12;
                                                messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                                                if (dialogCell.dialogsType == 0) {
                                                }
                                                str8 = stringForMessageListDate;
                                                charSequence31 = charSequence30;
                                                charSequence32 = dialogCell.titleOverride;
                                                if (charSequence32 == null) {
                                                }
                                                str11 = str7;
                                                charSequence33 = charSequence23;
                                                charSequence38 = charSequence7;
                                                z13 = z7;
                                                i9 = i4;
                                                str12 = str6;
                                                str10 = str8;
                                                charSequence34 = charSequence29;
                                                dialogCell2 = dialogCell;
                                            }
                                        }
                                    }
                                    z4 = false;
                                    dialogCell3.drawPremium = z4;
                                    if (z4) {
                                    }
                                }
                            }
                            z3 = false;
                            dialogCell3.drawBotVerified = z3;
                            if (MessagesController.getInstance(dialogCell3.currentAccount).isPremiumUser(dialogCell3.user)) {
                            }
                            z4 = false;
                            dialogCell3.drawPremium = z4;
                            if (z4) {
                            }
                        }
                        charSequence = charSequence39;
                        if (MessagesController.getInstance(dialogCell3.currentAccount).isPremiumUser(dialogCell3.user)) {
                        }
                        z4 = false;
                        dialogCell3.drawPremium = z4;
                        if (z4) {
                        }
                    } else {
                        charSequence = charSequence39;
                        z2 = false;
                        j = 0;
                        j2 = 0;
                        if (j2 != j) {
                            dialogCell3.botVerification.set(j2, z2);
                        }
                        i2 = dialogCell3.lastMessageDate;
                        if (i2 == 0) {
                            i2 = messageObject5.messageOwner.date;
                        }
                        if (!dialogCell3.isTopic) {
                        }
                        z5 = dialogCell3.draftVoice;
                        if (!z5) {
                        }
                        if (!z5) {
                            draftMessage3 = dialogCell3.draftMessage;
                            if (draftMessage3.rich_message == null) {
                            }
                        }
                        draftMessage = dialogCell3.draftMessage;
                        if (draftMessage != null) {
                        }
                        if (ChatObject.isChannel(dialogCell3.chat)) {
                        }
                        chat2 = dialogCell3.chat;
                        if (chat2 != null) {
                        }
                        draftMessage4 = null;
                        z6 = false;
                        if (isForumCell()) {
                        }
                        z7 = true;
                        i4 = -1;
                        charSequence24 = charSequence27;
                        charSequence23 = charSequence28;
                        CharSequence charSequence55222222 = charSequence24;
                        if (!dialogCell3.drawForwardIcon) {
                        }
                        if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                        }
                        stringForMessageListDate = "";
                        dialogCell = dialogCell3;
                        messageObject4 = dialogCell.message;
                        if (messageObject4 != null) {
                        }
                        dialogCell.drawCheck1 = false;
                        dialogCell.drawCheck2 = false;
                        dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                        z12 = false;
                        dialogCell.drawCount = false;
                        dialogCell.drawMention = false;
                        dialogCell.drawReactionMention = false;
                        dialogCell.drawPollVotesMention = false;
                        dialogCell.drawError = false;
                        str6 = null;
                        str7 = null;
                        dialogCell.promoDialog = z12;
                        messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                        if (dialogCell.dialogsType == 0) {
                        }
                        str8 = stringForMessageListDate;
                        charSequence31 = charSequence30;
                        charSequence32 = dialogCell.titleOverride;
                        if (charSequence32 == null) {
                        }
                        str11 = str7;
                        charSequence33 = charSequence23;
                        charSequence38 = charSequence7;
                        z13 = z7;
                        i9 = i4;
                        str12 = str6;
                        str10 = str8;
                        charSequence34 = charSequence29;
                        dialogCell2 = dialogCell;
                    }
                }
                z2 = false;
                j = 0;
                if (j2 != j) {
                }
                i2 = dialogCell3.lastMessageDate;
                if (i2 == 0) {
                }
                if (!dialogCell3.isTopic) {
                }
                z5 = dialogCell3.draftVoice;
                if (!z5) {
                }
                if (!z5) {
                }
                draftMessage = dialogCell3.draftMessage;
                if (draftMessage != null) {
                }
                if (ChatObject.isChannel(dialogCell3.chat)) {
                }
                chat2 = dialogCell3.chat;
                if (chat2 != null) {
                }
                draftMessage4 = null;
                z6 = false;
                if (isForumCell()) {
                }
                z7 = true;
                i4 = -1;
                charSequence24 = charSequence27;
                charSequence23 = charSequence28;
                CharSequence charSequence552222222 = charSequence24;
                if (!dialogCell3.drawForwardIcon) {
                }
                if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                }
                stringForMessageListDate = "";
                dialogCell = dialogCell3;
                messageObject4 = dialogCell.message;
                if (messageObject4 != null) {
                }
                dialogCell.drawCheck1 = false;
                dialogCell.drawCheck2 = false;
                dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
                z12 = false;
                dialogCell.drawCount = false;
                dialogCell.drawMention = false;
                dialogCell.drawReactionMention = false;
                dialogCell.drawPollVotesMention = false;
                dialogCell.drawError = false;
                str6 = null;
                str7 = null;
                dialogCell.promoDialog = z12;
                messagesController = MessagesController.getInstance(dialogCell.currentAccount);
                if (dialogCell.dialogsType == 0) {
                }
                str8 = stringForMessageListDate;
                charSequence31 = charSequence30;
                charSequence32 = dialogCell.titleOverride;
                if (charSequence32 == null) {
                }
                str11 = str7;
                charSequence33 = charSequence23;
                charSequence38 = charSequence7;
                z13 = z7;
                i9 = i4;
                str12 = str6;
                str10 = str8;
                charSequence34 = charSequence29;
                dialogCell2 = dialogCell;
            }
            charSequence = charSequence39;
            i2 = dialogCell3.lastMessageDate;
            if (i2 == 0) {
            }
            if (!dialogCell3.isTopic) {
            }
            z5 = dialogCell3.draftVoice;
            if (!z5) {
            }
            if (!z5) {
            }
            draftMessage = dialogCell3.draftMessage;
            if (draftMessage != null) {
            }
            if (ChatObject.isChannel(dialogCell3.chat)) {
            }
            chat2 = dialogCell3.chat;
            if (chat2 != null) {
            }
            draftMessage4 = null;
            z6 = false;
            if (isForumCell()) {
            }
            z7 = true;
            i4 = -1;
            charSequence24 = charSequence27;
            charSequence23 = charSequence28;
            CharSequence charSequence5522222222 = charSequence24;
            if (!dialogCell3.drawForwardIcon) {
            }
            if (TextUtils.isEmpty(dialogCell3.customMessage)) {
            }
            stringForMessageListDate = "";
            dialogCell = dialogCell3;
            messageObject4 = dialogCell.message;
            if (messageObject4 != null) {
            }
            dialogCell.drawCheck1 = false;
            dialogCell.drawCheck2 = false;
            dialogCell.drawClock = messageObject4 == null && messageObject4.isSending() && dialogCell.currentDialogId == UserConfig.getInstance(dialogCell.currentAccount).getClientUserId();
            z12 = false;
            dialogCell.drawCount = false;
            dialogCell.drawMention = false;
            dialogCell.drawReactionMention = false;
            dialogCell.drawPollVotesMention = false;
            dialogCell.drawError = false;
            str6 = null;
            str7 = null;
            dialogCell.promoDialog = z12;
            messagesController = MessagesController.getInstance(dialogCell.currentAccount);
            if (dialogCell.dialogsType == 0) {
            }
            str8 = stringForMessageListDate;
            charSequence31 = charSequence30;
            charSequence32 = dialogCell.titleOverride;
            if (charSequence32 == null) {
            }
            str11 = str7;
            charSequence33 = charSequence23;
            charSequence38 = charSequence7;
            z13 = z7;
            i9 = i4;
            str12 = str6;
            str10 = str8;
            charSequence34 = charSequence29;
            dialogCell2 = dialogCell;
        }
        if (!z) {
            TextPaint timeTextPaint = getTimeTextPaint();
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str10));
            dialogCell2.timeLayout = new StaticLayout(str10, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i11 = AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (!LocaleController.isRTL) {
                dialogCell2.timeLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.0f)) - i11;
            } else {
                dialogCell2.timeLeft = AndroidUtilities.dp(15.0f);
            }
        } else {
            dialogCell2.timeLayout = null;
            dialogCell2.timeLeft = 0;
            i11 = 0;
        }
        if (drawLock2()) {
            f = 4.0f;
            i12 = 0;
        } else {
            if (LocaleController.isRTL) {
                f = 4.0f;
                dialogCell2.lock2Left = dialogCell2.timeLeft + i11 + AndroidUtilities.dp(4.0f);
            } else {
                f = 4.0f;
                dialogCell2.lock2Left = (dialogCell2.timeLeft - Theme.dialogs_lock2Drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i12 = Theme.dialogs_lock2Drawable.getIntrinsicWidth() + AndroidUtilities.dp(f);
            i11 += i12;
        }
        if (LocaleController.isRTL) {
            dialogCell2.nameWidth = ((getMeasuredWidth() - dialogCell2.nameLeft) - AndroidUtilities.dp(22.0f)) - i11;
        } else {
            dialogCell2.nameWidth = ((getMeasuredWidth() - dialogCell2.nameLeft) - AndroidUtilities.dp(dialogCell2.messagePaddingStart + 13)) - i11;
            dialogCell2.nameLeft += i11;
        }
        if (dialogCell2.drawNameLock) {
            int i37 = dialogCell2.nameWidth;
            if (LocaleController.isRTL) {
                f = 8.0f;
            }
            dialogCell2.nameWidth = i37 - (AndroidUtilities.dp(f) + Theme.dialogs_lockDrawable.getIntrinsicWidth());
        }
        if (!dialogCell2.drawClock) {
            int intrinsicWidth2 = Theme.dialogs_clockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            dialogCell2.nameWidth -= intrinsicWidth2;
            if (!LocaleController.isRTL) {
                dialogCell2.clockDrawLeft = (dialogCell2.timeLeft - i12) - intrinsicWidth2;
            } else {
                dialogCell2.clockDrawLeft = dialogCell2.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                dialogCell2.nameLeft += intrinsicWidth2;
            }
        } else if (dialogCell2.drawCheck2) {
            int intrinsicWidth3 = Theme.dialogs_checkDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            int i38 = dialogCell2.nameWidth - intrinsicWidth3;
            dialogCell2.nameWidth = i38;
            if (dialogCell2.drawCheck1) {
                dialogCell2.nameWidth = i38 - (Theme.dialogs_halfCheckDrawable.getIntrinsicWidth() - AndroidUtilities.dp(8.0f));
                if (!LocaleController.isRTL) {
                    int i39 = (dialogCell2.timeLeft - i12) - intrinsicWidth3;
                    dialogCell2.halfCheckDrawLeft = i39;
                    dialogCell2.checkDrawLeft = i39 - AndroidUtilities.dp(5.5f);
                } else {
                    int dp8 = dialogCell2.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                    dialogCell2.checkDrawLeft = dp8;
                    dialogCell2.halfCheckDrawLeft = dp8 + AndroidUtilities.dp(5.5f);
                    dialogCell2.nameLeft += (intrinsicWidth3 + Theme.dialogs_halfCheckDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(8.0f);
                }
            } else if (!LocaleController.isRTL) {
                dialogCell2.checkDrawLeft1 = (dialogCell2.timeLeft - i12) - intrinsicWidth3;
            } else {
                dialogCell2.checkDrawLeft1 = dialogCell2.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                dialogCell2.nameLeft += intrinsicWidth3;
            }
        }
        dialogCell2.nameAdditionalsForChannelSubscriber = 0;
        z16 = (!dialogCell2.dialogMuted || dialogCell2.isHiddenInCommunity || dialogCell2.drawUnmute || dialogCell2.dialogMutedProgress > 0.0f) && !dialogCell2.drawVerified && dialogCell2.drawScam == 0;
        if (!dialogCell2.drawPremium && dialogCell2.emojiStatus.getDrawable() != null) {
            int dp9 = AndroidUtilities.dp(36.0f);
            if (z16) {
                dp9 += AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            }
            dialogCell2.nameWidth -= dp9;
            dialogCell2.nameAdditionalsForChannelSubscriber += dp9;
            if (LocaleController.isRTL) {
                dialogCell2.nameLeft += dp9;
            }
        } else if (!z16) {
            int dp10 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            if (dialogCell2.drawPremium) {
                dp10 += AndroidUtilities.dp(36.0f);
            }
            dialogCell2.nameWidth -= dp10;
            dialogCell2.nameAdditionalsForChannelSubscriber += dp10;
            if (LocaleController.isRTL) {
                dialogCell2.nameLeft += dp10;
            }
        } else if (dialogCell2.drawVerified) {
            int dp11 = AndroidUtilities.dp(6.0f) + Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
            dialogCell2.nameWidth -= dp11;
            dialogCell2.nameAdditionalsForChannelSubscriber += dp11;
            if (LocaleController.isRTL) {
                dialogCell2.nameLeft += dp11;
            }
        } else if (dialogCell2.drawPremium) {
            int dp12 = AndroidUtilities.dp(36.0f);
            dialogCell2.nameWidth -= dp12;
            dialogCell2.nameAdditionalsForChannelSubscriber += dp12;
            if (LocaleController.isRTL) {
                dialogCell2.nameLeft += dp12;
            }
        } else if (dialogCell2.drawScam != 0) {
            int dp13 = AndroidUtilities.dp(6.0f) + (dialogCell2.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth();
            dialogCell2.nameWidth -= dp13;
            dialogCell2.nameAdditionalsForChannelSubscriber += dp13;
            if (LocaleController.isRTL) {
                dialogCell2.nameLeft += dp13;
            }
        }
        if (dialogCell2.drawBotVerified) {
            dialogCell2.nameWidth -= AndroidUtilities.dp(21.0f);
        }
        i13 = dialogCell2.namePaddingEnd;
        if (i13 > 0) {
            dialogCell2.nameWidth -= i13;
            if (LocaleController.isRTL) {
                dialogCell2.nameLeft += i13;
            }
        }
        try {
            dp7 = dialogCell2.nameWidth - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
                dp7 = 0;
            }
            if (charSequence32 instanceof String) {
                charSequence32 = ((String) charSequence32).replace('\n', ' ');
            }
            if (!dialogCell2.nameLayoutEllipsizeByGradient) {
                dialogCell2.nameLayoutFits = charSequence32.length() == TextUtils.ellipsize(charSequence32, Theme.dialogs_namePaint[dialogCell2.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
                dp7 += AndroidUtilities.dp(48.0f);
                dialogCell2.channelShouldUseLineWidth = dialogCell2.nameLayoutFits;
            } else if (dialogCell2.isForChannelSubscriberCell) {
                dialogCell2.channelShouldUseLineWidth = charSequence32.length() == TextUtils.ellipsize(charSequence32, Theme.dialogs_namePaint[dialogCell2.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
            }
            float f22 = dp7;
            dialogCell2.nameIsEllipsized = Theme.dialogs_namePaint[dialogCell2.paintIndex].measureText(charSequence32.toString()) <= f22;
            if (!dialogCell2.twoLinesForName) {
                charSequence32 = TextUtils.ellipsize(charSequence32, Theme.dialogs_namePaint[dialogCell2.paintIndex], f22, TextUtils.TruncateAt.END);
            }
            CharSequence replaceEmoji22 = Emoji.replaceEmoji(charSequence32, Theme.dialogs_namePaint[dialogCell2.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject192 = dialogCell2.message;
            CharSequence charSequence58 = (messageObject192 == null && messageObject192.hasHighlightedWords() && (highlightText3 = AndroidUtilities.highlightText(replaceEmoji22, dialogCell2.message.highlightedWords, dialogCell2.resourcesProvider)) != null) ? highlightText3 : replaceEmoji22;
            if (!dialogCell2.twoLinesForName) {
                dialogCell2.nameLayout = StaticLayoutEx.createStaticLayout(charSequence58, Theme.dialogs_namePaint[dialogCell2.paintIndex], dp7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp7, 2);
            } else {
                dialogCell2.nameLayout = new StaticLayout(charSequence58, Theme.dialogs_namePaint[dialogCell2.paintIndex], Math.max(dp7, dialogCell2.nameWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            dialogCell2.nameLayoutTranslateX = (dialogCell2.nameLayoutEllipsizeByGradient || !dialogCell2.nameLayout.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(36.0f);
            dialogCell2.nameLayoutEllipsizeLeft = dialogCell2.nameLayout.isRtlCharAt(0);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        dialogCell2.animatedEmojiStackName = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStackName, dialogCell2.nameLayout);
        if (!dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
            dp = AndroidUtilities.dp(11.0f);
            dialogCell2.messageNameTop = AndroidUtilities.dp(32.0f);
            dialogCell2.timeTop = AndroidUtilities.dp(13.0f);
            dialogCell2.errorTop = AndroidUtilities.dp(42.33f);
            dialogCell2.pinTop = AndroidUtilities.dp(43.0f);
            dialogCell2.countTop = AndroidUtilities.dp(42.33f);
            dialogCell2.checkDrawTop = AndroidUtilities.dp(13.0f);
            int measuredWidth42 = getMeasuredWidth() - AndroidUtilities.dp(dialogCell2.messagePaddingStart + 21);
            if (!LocaleController.isRTL) {
                int dp14 = AndroidUtilities.dp(16.0f);
                dialogCell2.messageNameLeft = dp14;
                dialogCell2.messageLeft = dp14;
                dialogCell2.typingLeft = dp14;
                dialogCell2.buttonLeft = dp14;
                dp2 = getMeasuredWidth() - AndroidUtilities.dp(dialogCell2.avatarStart + 56);
                dp3 = dp2 - AndroidUtilities.dp(31.0f);
            } else {
                int dp15 = AndroidUtilities.dp(dialogCell2.messagePaddingStart + 6);
                dialogCell2.messageNameLeft = dp15;
                dialogCell2.messageLeft = dp15;
                dialogCell2.typingLeft = dp15;
                dialogCell2.buttonLeft = dp15;
                dp2 = AndroidUtilities.dp(dialogCell2.avatarStart);
                dp3 = AndroidUtilities.dp(69.0f) + dp2;
            }
            i14 = dp3;
            dialogCell2.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(56.0f));
            i15 = 0;
            while (true) {
                imageReceiverArr = dialogCell2.thumbImage;
                if (i15 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i15].setImageCoords(((dialogCell2.thumbSize + 2) * i15) + i14, ((AndroidUtilities.dp(31.0f) + dp) + (dialogCell2.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = dialogCell2.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i15++;
                dp = dp;
            }
            i16 = measuredWidth42;
            i17 = dp;
        } else {
            int dp16 = AndroidUtilities.dp(9.0f);
            dialogCell2.messageNameTop = AndroidUtilities.dp(31.0f);
            dialogCell2.timeTop = AndroidUtilities.dp(16.0f);
            dialogCell2.errorTop = AndroidUtilities.dp(38.0f);
            dialogCell2.pinTop = AndroidUtilities.dp(39.0f);
            dialogCell2.countTop = AndroidUtilities.dp(dialogCell2.isTopic ? 35.0f : 38.0f);
            dialogCell2.checkDrawTop = AndroidUtilities.dp(17.0f);
            int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp((dialogCell2.messagePaddingStart + 20) - (LocaleController.isRTL ? 0 : 12));
            if (LocaleController.isRTL) {
                int dp17 = AndroidUtilities.dp(22.0f);
                dialogCell2.messageNameLeft = dp17;
                dialogCell2.messageLeft = dp17;
                dialogCell2.typingLeft = dp17;
                dialogCell2.buttonLeft = dp17;
                dp5 = getMeasuredWidth() - AndroidUtilities.dp(dialogCell2.avatarStart + 52);
                dp6 = dp5 - AndroidUtilities.dp(((dialogCell2.thumbSize + 2) * dialogCell2.thumbsCount) + 9);
            } else {
                int dp18 = AndroidUtilities.dp(dialogCell2.messagePaddingStart + 4);
                dialogCell2.messageNameLeft = dp18;
                dialogCell2.messageLeft = dp18;
                dialogCell2.typingLeft = dp18;
                dialogCell2.buttonLeft = dp18;
                dp5 = AndroidUtilities.dp(dialogCell2.avatarStart);
                dp6 = AndroidUtilities.dp(67.0f) + dp5;
            }
            dialogCell2.storyParams.originalAvatarRect.set(dp5, dp16, dp5 + AndroidUtilities.dp(52.0f), dp16 + AndroidUtilities.dp(52.0f));
            int i40 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr2 = dialogCell2.thumbImage;
                if (i40 >= imageReceiverArr2.length) {
                    break;
                }
                imageReceiverArr2[i40].setImageCoords(((dialogCell2.thumbSize + 2) * i40) + dp6, ((AndroidUtilities.dp(30.0f) + dp16) + (dialogCell2.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags3 = dialogCell2.tags) == null || dialogCellTags3.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(dialogCell2.thumbSize), AndroidUtilities.dp(dialogCell2.thumbSize));
                i40++;
                dp16 = dp16;
            }
            i17 = dp16;
            i16 = measuredWidth5;
        }
        if (!LocaleController.isRTL) {
            dialogCell2.tagsRight = getMeasuredWidth() - AndroidUtilities.dp(dialogCell2.messagePaddingStart);
            dialogCell2.tagsLeft = AndroidUtilities.dp(64.0f);
        } else {
            dialogCell2.tagsLeft = dialogCell2.messageLeft;
            dialogCell2.tagsRight = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
        }
        if (dialogCell2.twoLinesForName) {
            dialogCell2.messageNameTop += AndroidUtilities.dp(20.0f);
        }
        if (((!dialogCell2.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && (dialogCellTags2 = dialogCell2.tags) != null && !dialogCellTags2.isEmpty()) {
            dialogCell2.timeTop -= AndroidUtilities.dp(6.0f);
            dialogCell2.checkDrawTop -= AndroidUtilities.dp(6.0f);
        }
        if (getIsPinned()) {
            if (!LocaleController.isRTL) {
                dialogCell2.pinLeft = (getMeasuredWidth() - Theme.dialogs_pinnedDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(14.0f);
            } else {
                dialogCell2.pinLeft = AndroidUtilities.dp(14.0f);
            }
        }
        if (dialogCell2.drawError) {
            int dp19 = AndroidUtilities.dp(29.0f);
            i16 -= dp19;
            if (!LocaleController.isRTL) {
                dialogCell2.errorLeft = getMeasuredWidth() - AndroidUtilities.dp(36.3333f);
            } else {
                dialogCell2.errorLeft = AndroidUtilities.dp(15.666f);
                dialogCell2.messageLeft += dp19;
                dialogCell2.typingLeft += dp19;
                dialogCell2.buttonLeft += dp19;
                dialogCell2.messageNameLeft += dp19;
            }
        } else {
            if (str12 != null || str11 != null || dialogCell2.drawReactionMention || dialogCell2.drawPollVotesMention) {
                if (str12 != null) {
                    charSequence35 = charSequence38;
                    dialogCell2.countWidth = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str12)));
                    dialogCell2.countLayout = new StaticLayout(str12, Theme.dialogs_countTextPaint2, dialogCell2.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    int dp20 = dialogCell2.countWidth + AndroidUtilities.dp(17.0f);
                    i16 -= dp20;
                    if (!LocaleController.isRTL) {
                        dialogCell2.countLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.666f)) - (dialogCell2.countWidth + AndroidUtilities.dp(12.666f));
                    } else {
                        dialogCell2.countLeft = AndroidUtilities.dp(15.666f);
                        dialogCell2.messageLeft += dp20;
                        dialogCell2.typingLeft += dp20;
                        dialogCell2.buttonLeft += dp20;
                        dialogCell2.messageNameLeft += dp20;
                    }
                    dialogCell2.drawCount = true;
                } else {
                    charSequence35 = charSequence38;
                    dialogCell2.countWidth = 0;
                }
                if (str11 != null) {
                    if (dialogCell2.currentDialogFolderId != 0) {
                        dialogCell2.mentionWidth = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str11)));
                        dialogCell2.mentionLayout = new StaticLayout(str11, Theme.dialogs_countTextPaint2, dialogCell2.mentionWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    } else {
                        dialogCell2.mentionWidth = AndroidUtilities.dp(8.0f);
                    }
                    int dp21 = dialogCell2.mentionWidth + AndroidUtilities.dp(17.0f);
                    i16 -= dp21;
                    if (!LocaleController.isRTL) {
                        int measuredWidth6 = (getMeasuredWidth() - (dialogCell2.mentionWidth + AndroidUtilities.dp(12.666f))) - AndroidUtilities.dp(15.666f);
                        int i41 = dialogCell2.countWidth;
                        dialogCell2.mentionLeft = measuredWidth6 - (i41 != 0 ? i41 + AndroidUtilities.dp(17.0f) : 0);
                    } else {
                        int dp22 = AndroidUtilities.dp(15.666f);
                        int i42 = dialogCell2.countWidth;
                        dialogCell2.mentionLeft = dp22 + (i42 != 0 ? i42 + AndroidUtilities.dp(17.0f) : 0);
                        dialogCell2.messageLeft += dp21;
                        dialogCell2.typingLeft += dp21;
                        dialogCell2.buttonLeft += dp21;
                        dialogCell2.messageNameLeft += dp21;
                    }
                    dialogCell2.drawMention = true;
                } else {
                    dialogCell2.mentionWidth = 0;
                }
                if (dialogCell2.drawReactionMention) {
                    int dp23 = AndroidUtilities.dp(25.0f);
                    i16 -= dp23;
                    if (!LocaleController.isRTL) {
                        int measuredWidth7 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                        dialogCell2.reactionMentionLeft = measuredWidth7;
                        if (dialogCell2.drawMention) {
                            int i43 = dialogCell2.mentionWidth;
                            dialogCell2.reactionMentionLeft = measuredWidth7 - (i43 != 0 ? i43 + AndroidUtilities.dp(17.0f) : 0);
                        }
                        if (dialogCell2.drawCount) {
                            int i44 = dialogCell2.reactionMentionLeft;
                            int i45 = dialogCell2.countWidth;
                            dialogCell2.reactionMentionLeft = i44 - (i45 != 0 ? i45 + AndroidUtilities.dp(17.0f) : 0);
                        }
                    } else {
                        int dp24 = AndroidUtilities.dp(15.666f);
                        dialogCell2.reactionMentionLeft = dp24;
                        if (dialogCell2.drawMention) {
                            int i46 = dialogCell2.mentionWidth;
                            dialogCell2.reactionMentionLeft = dp24 + (i46 != 0 ? i46 + AndroidUtilities.dp(17.0f) : 0);
                        }
                        if (dialogCell2.drawCount) {
                            int i47 = dialogCell2.reactionMentionLeft;
                            int i48 = dialogCell2.countWidth;
                            dialogCell2.reactionMentionLeft = i47 + (i48 != 0 ? i48 + AndroidUtilities.dp(17.0f) : 0);
                        }
                        dialogCell2.messageLeft += dp23;
                        dialogCell2.typingLeft += dp23;
                        dialogCell2.buttonLeft += dp23;
                        dialogCell2.messageNameLeft += dp23;
                    }
                }
                if (dialogCell2.drawPollVotesMention) {
                    int dp25 = AndroidUtilities.dp(25.0f);
                    i16 -= dp25;
                    if (!LocaleController.isRTL) {
                        int measuredWidth8 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                        dialogCell2.pollVotesMentionLeft = measuredWidth8;
                        if (dialogCell2.drawReactionMention) {
                            dialogCell2.pollVotesMentionLeft = measuredWidth8 - AndroidUtilities.dp(25.0f);
                        }
                        if (dialogCell2.drawMention) {
                            int i49 = dialogCell2.pollVotesMentionLeft;
                            int i50 = dialogCell2.mentionWidth;
                            dialogCell2.pollVotesMentionLeft = i49 - (i50 != 0 ? i50 + AndroidUtilities.dp(17.0f) : 0);
                        }
                        if (dialogCell2.drawCount) {
                            int i51 = dialogCell2.pollVotesMentionLeft;
                            int i52 = dialogCell2.countWidth;
                            dialogCell2.pollVotesMentionLeft = i51 - (i52 != 0 ? i52 + AndroidUtilities.dp(17.0f) : 0);
                        }
                    } else {
                        int dp26 = AndroidUtilities.dp(15.666f);
                        dialogCell2.pollVotesMentionLeft = dp26;
                        if (dialogCell2.drawReactionMention) {
                            dialogCell2.pollVotesMentionLeft = dp26 + AndroidUtilities.dp(25.0f);
                        }
                        if (dialogCell2.drawMention) {
                            int i53 = dialogCell2.pollVotesMentionLeft;
                            int i54 = dialogCell2.mentionWidth;
                            dialogCell2.pollVotesMentionLeft = i53 + (i54 != 0 ? i54 + AndroidUtilities.dp(17.0f) : 0);
                        }
                        if (dialogCell2.drawCount) {
                            int i55 = dialogCell2.pollVotesMentionLeft;
                            int i56 = dialogCell2.countWidth;
                            dialogCell2.pollVotesMentionLeft = i55 + (i56 != 0 ? i56 + AndroidUtilities.dp(17.0f) : 0);
                        }
                        dialogCell2.messageLeft += dp25;
                        dialogCell2.typingLeft += dp25;
                        dialogCell2.buttonLeft += dp25;
                        dialogCell2.messageNameLeft += dp25;
                    }
                }
                if (z13) {
                    if (charSequence31 == null) {
                        charSequence31 = "";
                    }
                    if (charSequence31.length() > 150) {
                        charSequence31 = charSequence31.subSequence(0, 150);
                    }
                    if ((!dialogCell2.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence34 != null) {
                        replaceTwoNewLinesToOne = AndroidUtilities.replaceNewLines(charSequence31);
                    } else {
                        replaceTwoNewLinesToOne = AndroidUtilities.replaceTwoNewLinesToOne(charSequence31);
                    }
                    charSequence31 = Emoji.replaceEmoji(replaceTwoNewLinesToOne, Theme.dialogs_messagePaint[dialogCell2.paintIndex].getFontMetricsInt(), false);
                    MessageObject messageObject22 = dialogCell2.message;
                    if (messageObject22 != null && (highlightText2 = AndroidUtilities.highlightText(charSequence31, messageObject22.highlightedWords, dialogCell2.resourcesProvider)) != null) {
                        charSequence31 = highlightText2;
                    }
                }
                int max22 = Math.max(AndroidUtilities.dp(12.0f), i16);
                dialogCell2.buttonTop = AndroidUtilities.dp((!dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                if (((!dialogCell2.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dialogCell2.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
                }
                if (isForumCell()) {
                    dialogCell2.messageTop = AndroidUtilities.dp((dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
                    int i57 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr3 = dialogCell2.thumbImage;
                        if (i57 >= imageReceiverArr3.length) {
                            break;
                        }
                        imageReceiverArr3[i57].setImageY(dialogCell2.buttonTop);
                        i57++;
                    }
                } else if ((dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && charSequence34 != null && (dialogCell2.currentDialogFolderId == 0 || dialogCell2.currentDialogFolderDialogsCount == 1)) {
                    try {
                        MessageObject messageObject23 = dialogCell2.message;
                        if (messageObject23 != null && messageObject23.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(charSequence34, dialogCell2.message.highlightedWords, dialogCell2.resourcesProvider)) != null) {
                            charSequence34 = highlightText;
                        }
                        dialogCell2.messageNameLayout = StaticLayoutEx.createStaticLayout(charSequence34, Theme.dialogs_messageNamePaint, max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, max22, 1);
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                    dialogCell2.messageTop = AndroidUtilities.dp(51.0f);
                    int dp27 = (dialogCell2.nameIsEllipsized && dialogCell2.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
                    int i58 = 0;
                    while (true) {
                        ImageReceiver[] imageReceiverArr4 = dialogCell2.thumbImage;
                        if (i58 >= imageReceiverArr4.length) {
                            break;
                        }
                        imageReceiverArr4[i58].setImageY(i17 + dp27 + AndroidUtilities.dp(40.0f));
                        i58++;
                    }
                } else {
                    dialogCell2.messageNameLayout = null;
                    if (dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        dialogCell2.messageTop = AndroidUtilities.dp(32.0f);
                        int dp28 = (dialogCell2.nameIsEllipsized && dialogCell2.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
                        int i59 = 0;
                        while (true) {
                            ImageReceiver[] imageReceiverArr5 = dialogCell2.thumbImage;
                            if (i59 >= imageReceiverArr5.length) {
                                break;
                            }
                            imageReceiverArr5[i59].setImageY(i17 + dp28 + AndroidUtilities.dp(21.0f));
                            i59++;
                        }
                    } else {
                        dialogCell2.messageTop = AndroidUtilities.dp(39.0f);
                    }
                }
                CharSequence charSequence5622 = charSequence34;
                if (dialogCell2.twoLinesForName) {
                    dialogCell2.messageTop += AndroidUtilities.dp(20.0f);
                }
                dialogCell2.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStack2, dialogCell2.messageNameLayout);
                dialogCell2.buttonCreated = false;
                if (!TextUtils.isEmpty(charSequence35)) {
                    dialogCell2.buttonLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence35, dialogCell2.currentMessagePaint.getFontMetricsInt(), false), dialogCell2.currentMessagePaint, max22 - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), dialogCell2.currentMessagePaint, max22 - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    dialogCell2.spoilersPool2.addAll(dialogCell2.spoilers2);
                    dialogCell2.spoilers2.clear();
                    SpoilerEffect.addSpoilers(dialogCell2, dialogCell2.buttonLayout, dialogCell2.spoilersPool2, dialogCell2.spoilers2);
                    staticLayout = 0;
                    dialogCell2.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStack3, dialogCell2.buttonLayout);
                    try {
                        if (!TextUtils.isEmpty(charSequence33)) {
                            if (!dialogCell2.useForceThreeLines) {
                                if (!SharedConfig.useThreeLinesLayout) {
                                }
                                dialogCell2.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence33, dialogCell2.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[dialogCell2.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            }
                            if (!hasTags()) {
                                dialogCell2.typingLayout = StaticLayoutEx.createStaticLayout(charSequence33, Theme.dialogs_messagePrintingPaint[dialogCell2.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, 1);
                            }
                            dialogCell2.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence33, dialogCell2.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[dialogCell2.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        }
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                    try {
                        if (charSequence31 instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequence31;
                            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                                if (!(obj instanceof ClickableSpan) && !(obj instanceof CodeHighlighting.Span)) {
                                    if (dialogCell2.currentDialogCommunityId == 0) {
                                        if (!isFolderCell()) {
                                            if (!(obj instanceof TypefaceSpan)) {
                                            }
                                        }
                                    }
                                    if (!(obj instanceof CodeHighlighting.ColorSpan)) {
                                        if (!(obj instanceof QuoteSpan)) {
                                            if (!(obj instanceof QuoteSpan.QuoteStyleSpan)) {
                                                if ((obj instanceof StyleSpan) && ((StyleSpan) obj).getStyle() == 1) {
                                                }
                                            }
                                        }
                                    }
                                }
                                spannable.removeSpan(obj);
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                    }
                    if (!dialogCell2.useForceThreeLines) {
                        if (!SharedConfig.useThreeLinesLayout) {
                        }
                        if (!dialogCell2.useForceThreeLines) {
                        }
                        if (!hasTags()) {
                            if (charSequence5622 == null) {
                                if (ChatObject.isMonoForum(dialogCell2.chat) && ChatObject.canManageMonoForum(dialogCell2.currentAccount, dialogCell2.chat)) {
                                }
                                charSequence36 = charSequence31;
                                alignment = (dialogCell2.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                if ((!dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                    if (dialogCell2.thumbsCount > 0 && charSequence5622 != null) {
                                        max22 += AndroidUtilities.dp(5.0f);
                                    }
                                    dialogCell2.messageLayout = StaticLayoutEx.createStaticLayout(charSequence36, dialogCell2.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence5622 == null ? 1 : 2);
                                } else {
                                    if (dialogCell2.thumbsCount > 0) {
                                        max22 += AndroidUtilities.dp((r0 * (dialogCell2.thumbSize + 2)) + 3);
                                        if (LocaleController.isRTL && !isForumCell()) {
                                            dialogCell2.messageLeft -= AndroidUtilities.dp((dialogCell2.thumbsCount * (dialogCell2.thumbSize + 2)) + 3);
                                        }
                                    }
                                    dialogCell2.messageLayout = new StaticLayout(charSequence36, dialogCell2.currentMessagePaint, max22, alignment, 1.0f, 0.0f, false);
                                }
                                i19 = max22;
                                dialogCell2.spoilersPool.addAll(dialogCell2.spoilers);
                                dialogCell2.spoilers.clear();
                                i18 = 1;
                                SpoilerEffect.addSpoilers(this, dialogCell2.messageLayout, -2, -2, dialogCell2.spoilersPool, dialogCell2.spoilers);
                                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = dialogCell2.animatedEmojiStack;
                                Layout[] layoutArr = new Layout[i18];
                                layoutArr[0] = dialogCell2.messageLayout;
                                dialogCell2.animatedEmojiStack = AnimatedEmojiSpan.update(0, dialogCell2, emojiGroupedSpans, layoutArr);
                                if (!LocaleController.isRTL) {
                                    StaticLayout staticLayout3 = dialogCell2.nameLayout;
                                    if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                                        float lineLeft = dialogCell2.nameLayout.getLineLeft(0);
                                        double ceil2 = Math.ceil(dialogCell2.nameLayout.getLineWidth(0));
                                        int dp29 = dialogCell2.nameLeft + AndroidUtilities.dp(12.0f);
                                        dialogCell2.nameLeft = dp29;
                                        if (dialogCell2.drawBotVerified) {
                                            dialogCell2.nameLeft = dp29 + AndroidUtilities.dp(21.0f);
                                        }
                                        if (dialogCell2.nameLayoutEllipsizeByGradient) {
                                            ceil2 = Math.min(dialogCell2.nameWidth, ceil2);
                                        }
                                        if ((dialogCell2.dialogMuted || dialogCell2.drawUnmute || dialogCell2.dialogMutedProgress > 0.0f) && !dialogCell2.drawVerified && dialogCell2.drawScam == 0) {
                                            if (dialogCell2.drawPremium) {
                                                int dp30 = (int) ((dialogCell2.nameLeft + ((dialogCell2.nameWidth - ceil2) - lineLeft)) - AndroidUtilities.dp(24.0f));
                                                dialogCell2.nameMuteLeft = dp30;
                                                dialogCell2.nameMutedIconLeft = (dp30 - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth();
                                            } else {
                                                dialogCell2.nameMuteLeft = (int) (((dialogCell2.nameLeft + (dialogCell2.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                                            }
                                        } else if (dialogCell2.drawVerified) {
                                            dialogCell2.nameMuteLeft = (int) (((dialogCell2.nameLeft + (dialogCell2.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_verifiedDrawable.getIntrinsicWidth());
                                        } else if (dialogCell2.drawPremium) {
                                            int dp31 = (int) ((dialogCell2.nameLeft + ((dialogCell2.nameWidth - ceil2) - lineLeft)) - AndroidUtilities.dp(24.0f));
                                            dialogCell2.nameMuteLeft = dp31;
                                            dialogCell2.nameMutedIconLeft = (dp31 - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth();
                                        } else if (dialogCell2.drawScam != 0) {
                                            dialogCell2.nameMuteLeft = (int) (((dialogCell2.nameLeft + (dialogCell2.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - (dialogCell2.drawScam == i18 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth());
                                        } else {
                                            dialogCell2.nameMuteLeft = (int) (((dialogCell2.nameLeft + (dialogCell2.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                                        }
                                        if (lineLeft == 0.0f) {
                                            double d = dialogCell2.nameWidth;
                                            if (ceil2 < d) {
                                                dialogCell2.nameLeft = (int) (dialogCell2.nameLeft + (d - ceil2));
                                            }
                                        }
                                    }
                                    StaticLayout staticLayout4 = dialogCell2.messageLayout;
                                    if (staticLayout4 != null && (lineCount6 = staticLayout4.getLineCount()) > 0) {
                                        int i60 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        int i61 = 0;
                                        while (true) {
                                            if (i61 >= lineCount6) {
                                                break;
                                            }
                                            if (dialogCell2.messageLayout.getLineLeft(i61) != 0.0f) {
                                                i60 = 0;
                                                break;
                                            } else {
                                                i60 = Math.min(i60, (int) (i19 - Math.ceil(dialogCell2.messageLayout.getLineWidth(i61))));
                                                i61 += i18;
                                            }
                                        }
                                        if (i60 != Integer.MAX_VALUE) {
                                            dialogCell2.messageLeft += i60;
                                        }
                                    }
                                    StaticLayout staticLayout5 = dialogCell2.typingLayout;
                                    if (staticLayout5 != null && (lineCount5 = staticLayout5.getLineCount()) > 0) {
                                        int i62 = 0;
                                        int i63 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        while (true) {
                                            if (i62 >= lineCount5) {
                                                i21 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                break;
                                            } else if (dialogCell2.typingLayout.getLineLeft(i62) != 0.0f) {
                                                i21 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                i63 = 0;
                                                break;
                                            } else {
                                                i63 = Math.min(i63, (int) (i19 - Math.ceil(dialogCell2.typingLayout.getLineWidth(i62))));
                                                i62 += i18;
                                            }
                                        }
                                        if (i63 != i21) {
                                            dialogCell2.typingLeft += i63;
                                        }
                                    }
                                    StaticLayout staticLayout6 = dialogCell2.messageNameLayout;
                                    if (staticLayout6 != null && staticLayout6.getLineCount() > 0 && dialogCell2.messageNameLayout.getLineLeft(0) == 0.0f) {
                                        double ceil3 = Math.ceil(dialogCell2.messageNameLayout.getLineWidth(0));
                                        double d2 = i19;
                                        if (ceil3 < d2) {
                                            dialogCell2.messageNameLeft = (int) (dialogCell2.messageNameLeft + (d2 - ceil3));
                                        }
                                    }
                                    StaticLayout staticLayout7 = dialogCell2.buttonLayout;
                                    if (staticLayout7 != null && (lineCount4 = staticLayout7.getLineCount()) > 0) {
                                        int i64 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        for (int i65 = 0; i65 < lineCount4; i65 += i18) {
                                            i64 = (int) Math.min(i64, dialogCell2.buttonLayout.getWidth() - dialogCell2.buttonLayout.getLineRight(i65));
                                        }
                                        dialogCell2.buttonLeft += i64;
                                    }
                                } else {
                                    StaticLayout staticLayout8 = dialogCell2.nameLayout;
                                    if (staticLayout8 != null && staticLayout8.getLineCount() > 0) {
                                        float lineRight = dialogCell2.nameLayout.getLineRight(0);
                                        if (dialogCell2.nameLayoutEllipsizeByGradient) {
                                            lineRight = Math.min(dialogCell2.nameWidth, lineRight);
                                        }
                                        if (lineRight == dialogCell2.nameWidth) {
                                            double ceil4 = Math.ceil(dialogCell2.nameLayout.getLineWidth(0));
                                            if (dialogCell2.nameLayoutEllipsizeByGradient) {
                                                ceil4 = Math.min(dialogCell2.nameWidth, ceil4);
                                            }
                                            double d3 = dialogCell2.nameWidth;
                                            if (ceil4 < d3) {
                                                dialogCell2.nameLeft = (int) (dialogCell2.nameLeft - (d3 - ceil4));
                                            }
                                        }
                                        if (dialogCell2.drawBotVerified) {
                                            dialogCell2.nameLeft += AndroidUtilities.dp(21.0f);
                                        }
                                        int dp32 = (int) (dialogCell2.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
                                        dialogCell2.nameMuteLeft = dp32;
                                        if (dialogCell2.drawPremium) {
                                            dialogCell2.nameMutedIconLeft = dp32 + AndroidUtilities.dp(30.0f);
                                        }
                                    }
                                    StaticLayout staticLayout9 = dialogCell2.messageLayout;
                                    if (staticLayout9 != null && (lineCount3 = staticLayout9.getLineCount()) > 0) {
                                        float f3 = 2.14748365E9f;
                                        for (int i66 = 0; i66 < lineCount3; i66 += i18) {
                                            f3 = Math.min(f3, dialogCell2.messageLayout.getLineLeft(i66));
                                        }
                                        dialogCell2.messageLeft = (int) (dialogCell2.messageLeft - f3);
                                    }
                                    StaticLayout staticLayout10 = dialogCell2.buttonLayout;
                                    if (staticLayout10 != null && (lineCount2 = staticLayout10.getLineCount()) > 0) {
                                        float f4 = 2.14748365E9f;
                                        for (int i67 = 0; i67 < lineCount2; i67 += i18) {
                                            f4 = Math.min(f4, dialogCell2.buttonLayout.getLineLeft(i67));
                                        }
                                        dialogCell2.buttonLeft = (int) (dialogCell2.buttonLeft - f4);
                                    }
                                    StaticLayout staticLayout11 = dialogCell2.typingLayout;
                                    if (staticLayout11 != null && (lineCount = staticLayout11.getLineCount()) > 0) {
                                        float f5 = 2.14748365E9f;
                                        for (int i68 = 0; i68 < lineCount; i68 += i18) {
                                            f5 = Math.min(f5, dialogCell2.typingLayout.getLineLeft(i68));
                                        }
                                        dialogCell2.typingLeft = (int) (dialogCell2.typingLeft - f5);
                                    }
                                    StaticLayout staticLayout12 = dialogCell2.messageNameLayout;
                                    if (staticLayout12 != null && staticLayout12.getLineCount() > 0) {
                                        dialogCell2.messageNameLeft = (int) (dialogCell2.messageNameLeft - dialogCell2.messageNameLayout.getLineLeft(0));
                                    }
                                }
                                staticLayout2 = dialogCell2.typingLayout;
                                if (staticLayout2 != null && dialogCell2.printingStringType >= 0 && staticLayout2.getText().length() > 0) {
                                    if (i9 < 0 && (i20 = i9 + 1) < dialogCell2.typingLayout.getText().length()) {
                                        primaryHorizontal = dialogCell2.typingLayout.getPrimaryHorizontal(i9);
                                        primaryHorizontal2 = dialogCell2.typingLayout.getPrimaryHorizontal(i20);
                                    } else {
                                        primaryHorizontal = dialogCell2.typingLayout.getPrimaryHorizontal(0);
                                        primaryHorizontal2 = dialogCell2.typingLayout.getPrimaryHorizontal(i18);
                                    }
                                    if (primaryHorizontal >= primaryHorizontal2) {
                                        dialogCell2.statusDrawableLeft = (int) (dialogCell2.typingLeft + primaryHorizontal);
                                    } else {
                                        dialogCell2.statusDrawableLeft = (int) (dialogCell2.typingLeft + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
                                    }
                                }
                                updateThumbsPosition();
                                return;
                            }
                        }
                        if (isForumCell() && (charSequence31 instanceof Spanned) && ((FixedWidthSpan[]) ((Spanned) charSequence31).getSpans(0, charSequence31.length(), FixedWidthSpan.class)).length <= 0) {
                            ellipsize = TextUtils.ellipsize(charSequence31, dialogCell2.currentMessagePaint, max22 - AndroidUtilities.dp((dialogCell2.thumbsCount * (dialogCell2.thumbSize + 2)) + 15), TextUtils.TruncateAt.END);
                        } else {
                            ellipsize = TextUtils.ellipsize(charSequence31, dialogCell2.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                        }
                        charSequence31 = ellipsize;
                        charSequence36 = charSequence31;
                        alignment = (dialogCell2.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                        if (!dialogCell2.useForceThreeLines) {
                        }
                        if (dialogCell2.thumbsCount > 0) {
                            max22 += AndroidUtilities.dp(5.0f);
                        }
                        dialogCell2.messageLayout = StaticLayoutEx.createStaticLayout(charSequence36, dialogCell2.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence5622 == null ? 1 : 2);
                        i19 = max22;
                        dialogCell2.spoilersPool.addAll(dialogCell2.spoilers);
                        dialogCell2.spoilers.clear();
                        i18 = 1;
                        SpoilerEffect.addSpoilers(this, dialogCell2.messageLayout, -2, -2, dialogCell2.spoilersPool, dialogCell2.spoilers);
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = dialogCell2.animatedEmojiStack;
                        Layout[] layoutArr2 = new Layout[i18];
                        layoutArr2[0] = dialogCell2.messageLayout;
                        dialogCell2.animatedEmojiStack = AnimatedEmojiSpan.update(0, dialogCell2, emojiGroupedSpans2, layoutArr2);
                        if (!LocaleController.isRTL) {
                        }
                        staticLayout2 = dialogCell2.typingLayout;
                        if (staticLayout2 != null) {
                            if (i9 < 0) {
                            }
                            primaryHorizontal = dialogCell2.typingLayout.getPrimaryHorizontal(0);
                            primaryHorizontal2 = dialogCell2.typingLayout.getPrimaryHorizontal(i18);
                            if (primaryHorizontal >= primaryHorizontal2) {
                            }
                        }
                        updateThumbsPosition();
                        return;
                    }
                    if (!hasTags()) {
                        try {
                        } catch (Exception e7) {
                            e = e7;
                            i18 = 1;
                            dialogCell2.messageLayout = staticLayout;
                            FileLog.e(e);
                            i19 = max22;
                            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22 = dialogCell2.animatedEmojiStack;
                            Layout[] layoutArr22 = new Layout[i18];
                            layoutArr22[0] = dialogCell2.messageLayout;
                            dialogCell2.animatedEmojiStack = AnimatedEmojiSpan.update(0, dialogCell2, emojiGroupedSpans22, layoutArr22);
                            if (!LocaleController.isRTL) {
                            }
                            staticLayout2 = dialogCell2.typingLayout;
                            if (staticLayout2 != null) {
                            }
                            updateThumbsPosition();
                            return;
                        }
                        if (dialogCell2.currentDialogFolderId != 0) {
                            if (dialogCell2.currentDialogFolderDialogsCount > 1) {
                                dialogCell2.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell2.paintIndex];
                                charSequence36 = charSequence5622;
                                charSequence5622 = staticLayout;
                                alignment = (dialogCell2.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                if (!dialogCell2.useForceThreeLines) {
                                }
                                if (dialogCell2.thumbsCount > 0) {
                                }
                                dialogCell2.messageLayout = StaticLayoutEx.createStaticLayout(charSequence36, dialogCell2.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence5622 == null ? 1 : 2);
                                i19 = max22;
                                dialogCell2.spoilersPool.addAll(dialogCell2.spoilers);
                                dialogCell2.spoilers.clear();
                                i18 = 1;
                                SpoilerEffect.addSpoilers(this, dialogCell2.messageLayout, -2, -2, dialogCell2.spoilersPool, dialogCell2.spoilers);
                                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans222 = dialogCell2.animatedEmojiStack;
                                Layout[] layoutArr222 = new Layout[i18];
                                layoutArr222[0] = dialogCell2.messageLayout;
                                dialogCell2.animatedEmojiStack = AnimatedEmojiSpan.update(0, dialogCell2, emojiGroupedSpans222, layoutArr222);
                                if (!LocaleController.isRTL) {
                                }
                                staticLayout2 = dialogCell2.typingLayout;
                                if (staticLayout2 != null) {
                                }
                                updateThumbsPosition();
                                return;
                            }
                            if ((!dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && charSequence5622 == null) {
                            }
                            if (isForumCell()) {
                            }
                            ellipsize = TextUtils.ellipsize(charSequence31, dialogCell2.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                            charSequence31 = ellipsize;
                            charSequence36 = charSequence31;
                            alignment = (dialogCell2.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                            if (!dialogCell2.useForceThreeLines) {
                            }
                            if (dialogCell2.thumbsCount > 0) {
                            }
                            dialogCell2.messageLayout = StaticLayoutEx.createStaticLayout(charSequence36, dialogCell2.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence5622 == null ? 1 : 2);
                            i19 = max22;
                            dialogCell2.spoilersPool.addAll(dialogCell2.spoilers);
                            dialogCell2.spoilers.clear();
                            i18 = 1;
                            SpoilerEffect.addSpoilers(this, dialogCell2.messageLayout, -2, -2, dialogCell2.spoilersPool, dialogCell2.spoilers);
                            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2222 = dialogCell2.animatedEmojiStack;
                            Layout[] layoutArr2222 = new Layout[i18];
                            layoutArr2222[0] = dialogCell2.messageLayout;
                            dialogCell2.animatedEmojiStack = AnimatedEmojiSpan.update(0, dialogCell2, emojiGroupedSpans2222, layoutArr2222);
                            if (!LocaleController.isRTL) {
                            }
                            staticLayout2 = dialogCell2.typingLayout;
                            if (staticLayout2 != null) {
                            }
                            updateThumbsPosition();
                            return;
                        }
                    }
                    if (!dialogCell2.useForceThreeLines) {
                    }
                    if (ChatObject.isMonoForum(dialogCell2.chat)) {
                        if (isForumCell()) {
                        }
                        ellipsize = TextUtils.ellipsize(charSequence31, dialogCell2.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                        charSequence31 = ellipsize;
                    }
                    charSequence36 = charSequence31;
                    alignment = (dialogCell2.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    if (!dialogCell2.useForceThreeLines) {
                    }
                    if (dialogCell2.thumbsCount > 0) {
                    }
                    dialogCell2.messageLayout = StaticLayoutEx.createStaticLayout(charSequence36, dialogCell2.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence5622 == null ? 1 : 2);
                    i19 = max22;
                    dialogCell2.spoilersPool.addAll(dialogCell2.spoilers);
                    dialogCell2.spoilers.clear();
                    i18 = 1;
                    SpoilerEffect.addSpoilers(this, dialogCell2.messageLayout, -2, -2, dialogCell2.spoilersPool, dialogCell2.spoilers);
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22222 = dialogCell2.animatedEmojiStack;
                    Layout[] layoutArr22222 = new Layout[i18];
                    layoutArr22222[0] = dialogCell2.messageLayout;
                    dialogCell2.animatedEmojiStack = AnimatedEmojiSpan.update(0, dialogCell2, emojiGroupedSpans22222, layoutArr22222);
                    if (!LocaleController.isRTL) {
                    }
                    staticLayout2 = dialogCell2.typingLayout;
                    if (staticLayout2 != null) {
                    }
                    updateThumbsPosition();
                    return;
                }
                staticLayout = 0;
                staticLayout = 0;
                try {
                    dialogCell2.buttonLayout = null;
                } catch (Exception unused) {
                }
                dialogCell2.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStack3, dialogCell2.buttonLayout);
                if (!TextUtils.isEmpty(charSequence33)) {
                }
                if (charSequence31 instanceof Spannable) {
                }
                if (!dialogCell2.useForceThreeLines) {
                }
                if (!hasTags()) {
                }
                if (!dialogCell2.useForceThreeLines) {
                }
                if (ChatObject.isMonoForum(dialogCell2.chat)) {
                }
                charSequence36 = charSequence31;
                alignment = (dialogCell2.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                if (!dialogCell2.useForceThreeLines) {
                }
                if (dialogCell2.thumbsCount > 0) {
                }
                dialogCell2.messageLayout = StaticLayoutEx.createStaticLayout(charSequence36, dialogCell2.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence5622 == null ? 1 : 2);
                i19 = max22;
                dialogCell2.spoilersPool.addAll(dialogCell2.spoilers);
                dialogCell2.spoilers.clear();
                i18 = 1;
                SpoilerEffect.addSpoilers(this, dialogCell2.messageLayout, -2, -2, dialogCell2.spoilersPool, dialogCell2.spoilers);
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans222222 = dialogCell2.animatedEmojiStack;
                Layout[] layoutArr222222 = new Layout[i18];
                layoutArr222222[0] = dialogCell2.messageLayout;
                dialogCell2.animatedEmojiStack = AnimatedEmojiSpan.update(0, dialogCell2, emojiGroupedSpans222222, layoutArr222222);
                if (!LocaleController.isRTL) {
                }
                staticLayout2 = dialogCell2.typingLayout;
                if (staticLayout2 != null) {
                }
                updateThumbsPosition();
                return;
            }
            if (dialogCell2.allowBotOpenButton && !isFolderCell() && !isForumCell() && !isDialogFolder() && UserObject.isBot(dialogCell2.user) && dialogCell2.user.bot_has_main_app) {
                dialogCell2.setOpenBotButton(true);
                int dp33 = (int) (AndroidUtilities.dp(26.0f) + dialogCell2.openButtonText.getCurrentWidth());
                int dp34 = AndroidUtilities.dp(13.0f);
                i16 -= dp33;
                if (dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                    dp4 = AndroidUtilities.dp(40.0f);
                } else {
                    dp4 = dialogCell2.isTopic ? AndroidUtilities.dp(33.0f) : AndroidUtilities.dp(36.0f);
                }
                if (!LocaleController.isRTL) {
                    dialogCell2.openButtonRect.set((getMeasuredWidth() - dp33) - AndroidUtilities.dp(13.0f), dp4, getMeasuredWidth() - AndroidUtilities.dp(13.0f), dp4 + AndroidUtilities.dp(28.0f));
                } else {
                    dialogCell2.openButtonRect.set(AndroidUtilities.dp(13.0f), dp4, AndroidUtilities.dp(13.0f) + dp33, dp4 + AndroidUtilities.dp(28.0f));
                    int i69 = dp33 + dp34;
                    dialogCell2.messageLeft += i69;
                    dialogCell2.typingLeft += i69;
                    dialogCell2.buttonLeft += i69;
                    dialogCell2.messageNameLeft += i69;
                }
                dialogCell2.drawCount = false;
                dialogCell2.drawMention = false;
            } else {
                dialogCell2.drawCount = false;
                dialogCell2.drawMention = false;
            }
        }
        charSequence35 = charSequence38;
        if (z13) {
        }
        int max222 = Math.max(AndroidUtilities.dp(12.0f), i16);
        dialogCell2.buttonTop = AndroidUtilities.dp((!dialogCell2.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (!dialogCell2.useForceThreeLines) {
            dialogCell2.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
            if (isForumCell()) {
            }
            CharSequence charSequence56222 = charSequence34;
            if (dialogCell2.twoLinesForName) {
            }
            dialogCell2.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStack2, dialogCell2.messageNameLayout);
            dialogCell2.buttonCreated = false;
            if (!TextUtils.isEmpty(charSequence35)) {
            }
        }
        dialogCell2.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
        if (isForumCell()) {
        }
        CharSequence charSequence562222 = charSequence34;
        if (dialogCell2.twoLinesForName) {
        }
        dialogCell2.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, dialogCell2, dialogCell2.animatedEmojiStack2, dialogCell2.messageNameLayout);
        dialogCell2.buttonCreated = false;
        if (!TextUtils.isEmpty(charSequence35)) {
        }
    }

    public void setTitleOverride(String str) {
        this.titleOverride = str;
    }

    private SpannableStringBuilder formatInternal(int i, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
        } else if (i == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
        } else if (i == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
        } else if (i == 4) {
            spannableStringBuilder.append(charSequence);
        }
        return spannableStringBuilder;
    }

    private void updateThumbsPosition() {
        if (this.thumbsCount > 0) {
            StaticLayout staticLayout = isForumCell() ? this.buttonLayout : this.messageLayout;
            int i = isForumCell() ? this.buttonLeft : this.messageLeft;
            if (staticLayout == null) {
                return;
            }
            try {
                CharSequence text = staticLayout.getText();
                if (text instanceof Spanned) {
                    FixedWidthSpan[] fixedWidthSpanArr = (FixedWidthSpan[]) ((Spanned) text).getSpans(0, text.length(), FixedWidthSpan.class);
                    if (fixedWidthSpanArr == null || fixedWidthSpanArr.length <= 0) {
                        for (int i2 = 0; i2 < 3; i2++) {
                            this.thumbImageSeen[i2] = false;
                        }
                        return;
                    }
                    int spanStart = ((Spanned) text).getSpanStart(fixedWidthSpanArr[0]);
                    if (spanStart < 0) {
                        spanStart = 0;
                    }
                    int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                    if (ceil != 0 && !this.drawForwardIcon && !this.drawGiftIcon) {
                        ceil += AndroidUtilities.dp(3.0f);
                    }
                    for (int i3 = 0; i3 < this.thumbsCount; i3++) {
                        this.thumbImage[i3].setImageX(i + ceil + AndroidUtilities.dp((this.thumbSize + 2) * i3));
                        this.thumbImageSeen[i3] = true;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private CharSequence applyThumbs(CharSequence charSequence) {
        if (this.thumbsCount <= 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.insert(0, (CharSequence) " ");
        valueOf.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 3)), 0, 1, 33);
        return valueOf;
    }

    private CharSequence formatTopicsNames() {
        if (this.forumFormattedNames == null) {
            this.forumFormattedNames = new ForumFormattedNames(this);
        }
        this.forumFormattedNames.formatTopicsNames(this.currentAccount, this.message, this.chat);
        ForumFormattedNames forumFormattedNames = this.forumFormattedNames;
        this.topMessageTopicStartIndex = forumFormattedNames.topMessageTopicStartIndex;
        this.topMessageTopicEndIndex = forumFormattedNames.topMessageTopicEndIndex;
        this.lastTopicMessageUnread = forumFormattedNames.lastTopicMessageUnread;
        return forumFormattedNames.formattedNames;
    }

    public boolean isForumCell() {
        TLRPC.Chat chat;
        return (isDialogFolder() || this.insideCommunityListNoDialog || (chat = this.chat) == null || (!chat.forum && (!ChatObject.isMonoForum(chat) || !ChatObject.canManageMonoForum(this.currentAccount, this.chat))) || this.isTopic) ? false : true;
    }

    private void drawCheckStatus(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f) {
        if (f != 0.0f || z4) {
            float f2 = (f * 0.5f) + 0.5f;
            if (z) {
                BaseCell.setDrawableBounds(Theme.dialogs_clockDrawable, this.clockDrawLeft, this.checkDrawTop);
                if (f != 1.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, Theme.dialogs_clockDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                    Theme.dialogs_clockDrawable.setAlpha((int) (f * 255.0f));
                }
                Theme.dialogs_clockDrawable.draw(canvas);
                if (f != 1.0f) {
                    canvas.restore();
                    Theme.dialogs_clockDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                }
                invalidate();
                return;
            }
            if (z3) {
                if (z2) {
                    BaseCell.setDrawableBounds(Theme.dialogs_halfCheckDrawable, this.halfCheckDrawLeft, this.checkDrawTop);
                    if (z4) {
                        canvas.save();
                        canvas.scale(f2, f2, Theme.dialogs_halfCheckDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                        Theme.dialogs_halfCheckDrawable.setAlpha((int) (f * 255.0f));
                    }
                    if (!z4 && f != 0.0f) {
                        canvas.save();
                        canvas.scale(f2, f2, Theme.dialogs_halfCheckDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                        int i = (int) (255.0f * f);
                        Theme.dialogs_halfCheckDrawable.setAlpha(i);
                        Theme.dialogs_checkReadDrawable.setAlpha(i);
                    }
                    Theme.dialogs_halfCheckDrawable.draw(canvas);
                    if (z4) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(4.0f) * (1.0f - f), 0.0f);
                    }
                    BaseCell.setDrawableBounds(Theme.dialogs_checkReadDrawable, this.checkDrawLeft, this.checkDrawTop);
                    Theme.dialogs_checkReadDrawable.draw(canvas);
                    if (z4) {
                        canvas.restore();
                        Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                    }
                    if (z4 || f == 0.0f) {
                        return;
                    }
                    canvas.restore();
                    Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                    Theme.dialogs_checkReadDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                    return;
                }
                BaseCell.setDrawableBounds(Theme.dialogs_checkDrawable, this.checkDrawLeft1, this.checkDrawTop);
                if (f != 1.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, Theme.dialogs_checkDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                    Theme.dialogs_checkDrawable.setAlpha((int) (f * 255.0f));
                }
                Theme.dialogs_checkDrawable.draw(canvas);
                if (f != 1.0f) {
                    canvas.restore();
                    Theme.dialogs_checkDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                }
            }
        }
    }

    public boolean isPointInsideAvatar(float f, float f2) {
        return !LocaleController.isRTL ? f >= 0.0f && f < ((float) AndroidUtilities.dp(60.0f)) : f >= ((float) (getMeasuredWidth() - AndroidUtilities.dp(60.0f))) && f < ((float) getMeasuredWidth());
    }

    public void setDialogSelected(boolean z) {
        if (this.isSelected != z) {
            invalidate();
        }
        this.isSelected = z;
    }

    public void animateArchiveAvatar() {
        if (this.avatarDrawable.getAvatarType() != 2) {
            return;
        }
        this.animatingArchiveAvatar = true;
        this.animatingArchiveAvatarProgress = 0.0f;
        Theme.dialogs_archiveAvatarDrawable.setProgress(0.0f);
        Theme.dialogs_archiveAvatarDrawable.start();
        invalidate();
    }

    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null || z) {
            if (checkBox2 == null) {
                CheckBox2 checkBox22 = new CheckBox2(getContext(), 21, this.resourcesProvider) { // from class: org.telegram.ui.Cells.DialogCell.3
                    @Override // android.view.View
                    public void invalidate() {
                        super.invalidate();
                        DialogCell.this.invalidate();
                    }
                };
                this.checkBox = checkBox22;
                checkBox22.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                this.checkBox.setDrawUnchecked(false);
                this.checkBox.setDrawBackgroundAsArc(3);
                addView(this.checkBox);
            }
            this.checkBox.setChecked(z, z2);
            checkTtl();
        }
    }

    private MessageObject findFolderTopMessage() {
        ArrayList dialogsArray;
        DialogsActivity dialogsActivity = this.parentFragment;
        if (dialogsActivity == null || (dialogsArray = dialogsActivity.getDialogsArray(this.currentAccount, this.dialogsType, this.currentDialogFolderId, false)) == null || dialogsArray.isEmpty()) {
            return null;
        }
        int size = dialogsArray.size();
        MessageObject messageObject = null;
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) dialogsArray.get(i);
            LongSparseArray longSparseArray = MessagesController.getInstance(this.currentAccount).dialogMessage;
            if (longSparseArray != null) {
                ArrayList arrayList = (ArrayList) longSparseArray.get(dialog.id);
                MessageObject messageObject2 = (arrayList == null || arrayList.isEmpty()) ? null : (MessageObject) arrayList.get(0);
                if (messageObject2 != null && (messageObject == null || messageObject2.messageOwner.date > messageObject.messageOwner.date)) {
                    messageObject = messageObject2;
                }
                if (dialog.pinnedNum == 0 && messageObject != null) {
                    break;
                }
            }
        }
        return messageObject;
    }

    public boolean isFolderCell() {
        return this.currentDialogFolderId != 0;
    }

    public boolean update(int i) {
        return update(i, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x096d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0553  */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean update(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r3;
        long j;
        MessageObject messageObject;
        boolean z7;
        boolean z8;
        int dp;
        TLRPC.User user;
        TLRPC.Chat chat;
        boolean z9;
        int i2;
        TLRPC.Chat chat2;
        boolean z10;
        MessageObject messageObject2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TLRPC.Chat chat3;
        MessageObject messageObject3;
        long j2;
        boolean isForumCell = isForumCell();
        boolean z11 = false;
        this.drawAvatarSelector = false;
        this.ttlPeriod = 0;
        CustomDialog customDialog = this.customDialog;
        if (customDialog != null) {
            this.lastMessageDate = customDialog.date;
            int i9 = customDialog.unread_count;
            this.lastUnreadState = i9 != 0;
            this.unreadCount = i9;
            this.drawPin = customDialog.pinned;
            this.dialogMuted = customDialog.muted;
            this.hasUnmutedTopics = false;
            this.hasUnmutedCommunityDialogs = false;
            this.avatarDrawable.setInfo(customDialog.id, customDialog.name, null);
            if (this.isShareToStoryCell) {
                this.avatarImage.setImage(null, "50_50", this.repostStoryDrawable, null, 0L);
            } else {
                this.avatarImage.setImage(null, "50_50", this.avatarDrawable, null, 0L);
            }
            int i10 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                if (i10 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i10].setImageBitmap((Drawable) null);
                i10++;
            }
            this.drawMonoforumAvatar = false;
            this.drawCommunityAvatar = false;
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(26.0f));
            this.drawUnmute = false;
            z6 = isForumCell;
            z7 = false;
            z5 = false;
        } else {
            int i11 = this.unreadCount;
            boolean z12 = this.reactionMentionCount != 0;
            boolean z13 = this.markUnread;
            this.hasUnmutedTopics = false;
            this.hasUnmutedCommunityDialogs = false;
            this.readOutboxMaxId = -1;
            if (this.isDialogCell) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                if (dialog != null) {
                    this.readOutboxMaxId = dialog.read_outbox_max_id;
                    this.ttlPeriod = dialog.ttl_period;
                    if (i == 0) {
                        this.clearingDialog = MessagesController.getInstance(this.currentAccount).isClearingDialog(dialog.id);
                        ArrayList arrayList = (ArrayList) MessagesController.getInstance(this.currentAccount).dialogMessage.get(dialog.id);
                        this.groupMessages = arrayList;
                        MessageObject messageObject4 = (arrayList == null || arrayList.size() <= 0) ? null : (MessageObject) this.groupMessages.get(0);
                        this.message = messageObject4;
                        this.lastUnreadState = messageObject4 != null && messageObject4.isUnread();
                        TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                        if (chat4 != null && (chat4.forum || (chat4.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat4)))) {
                            z2 = isForumCell;
                            int[] forumUnreadCount = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat4.id);
                            this.unreadCount = forumUnreadCount[0];
                            this.mentionCount = forumUnreadCount[1];
                            this.reactionMentionCount = forumUnreadCount[2];
                            this.hasUnmutedTopics = forumUnreadCount[3] != 0;
                            this.pollVotesMentionCount = forumUnreadCount[4];
                        } else {
                            z2 = isForumCell;
                            if (dialog instanceof TLRPC.TL_dialogFolder) {
                                this.unreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                this.mentionCount = 0;
                                this.reactionMentionCount = 0;
                                this.pollVotesMentionCount = 0;
                            } else if (dialog instanceof TLRPC.TL_dialogCommunity) {
                                MessagesController.UnreadCounts communityUnreadCount = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog.id);
                                this.unreadCount = communityUnreadCount.unreadCount;
                                this.mentionCount = communityUnreadCount.mentionCount;
                                this.reactionMentionCount = communityUnreadCount.reactionMentionCount;
                                this.pollVotesMentionCount = communityUnreadCount.pollVotesMentionCount;
                                this.hasUnmutedCommunityDialogs = communityUnreadCount.hasUnmutedUnreadDialogs;
                            } else {
                                this.unreadCount = dialog.unread_count;
                                this.mentionCount = dialog.unread_mentions_count;
                                this.reactionMentionCount = dialog.unread_reactions_count;
                                this.pollVotesMentionCount = dialog.unread_poll_votes_count;
                            }
                        }
                        if (ChatObject.isMonoForum(chat4)) {
                            this.mentionCount = 0;
                        }
                        this.markUnread = dialog.unread_mark;
                        MessageObject messageObject5 = this.message;
                        this.currentEditDate = messageObject5 != null ? messageObject5.messageOwner.edit_date : 0;
                        this.lastMessageDate = dialog.last_message_date;
                        int i12 = this.dialogsType;
                        if (i12 == 7 || i12 == 8) {
                            MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType == 8 ? (char) 1 : (char) 0];
                            this.drawPin = dialogFilter != null && dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0;
                        } else {
                            this.drawPin = this.currentDialogFolderId == 0 && dialog.pinned;
                        }
                        MessageObject messageObject6 = this.message;
                        if (messageObject6 != null) {
                            this.lastSendState = messageObject6.messageOwner.send_state;
                        }
                    } else {
                        z2 = isForumCell;
                    }
                } else {
                    z2 = isForumCell;
                    this.unreadCount = 0;
                    this.mentionCount = 0;
                    this.reactionMentionCount = 0;
                    this.pollVotesMentionCount = 0;
                    this.currentEditDate = 0;
                    this.lastMessageDate = 0;
                    this.clearingDialog = false;
                }
                long j3 = this.currentDialogId;
                this.drawAvatarSelector = j3 != 0 && j3 == RightSlidingDialogContainer.fragmentDialogId;
            } else {
                z2 = isForumCell;
                this.drawPin = false;
            }
            TLRPC.TL_forumTopic tL_forumTopic = this.forumTopic;
            if (tL_forumTopic != null) {
                this.unreadCount = tL_forumTopic.unread_count;
                this.mentionCount = tL_forumTopic.unread_mentions_count;
                this.reactionMentionCount = tL_forumTopic.unread_reactions_count;
                this.pollVotesMentionCount = tL_forumTopic.unread_poll_votes_count;
            }
            if (this.dialogsType == 2) {
                this.drawPin = false;
            }
            DialogCellTags dialogCellTags = this.tags;
            if (dialogCellTags != null) {
                boolean isEmpty = dialogCellTags.isEmpty();
                if (this.tags.update(this.currentAccount, this.dialogsType, this.currentDialogId)) {
                    if (isEmpty != this.tags.isEmpty()) {
                        z3 = true;
                        z4 = true;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    z11 = true;
                    if (i == 0) {
                        TLRPC.User user2 = this.user;
                        if (user2 == null || MessagesController.isSupportUser(user2) || this.user.bot || (i & MessagesController.UPDATE_MASK_STATUS) == 0) {
                            z6 = z2;
                        } else {
                            z6 = z2;
                            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                            if (this.wasDrawnOnline != isOnline()) {
                                z11 = true;
                            }
                        }
                        if ((i & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                            if (this.user != null) {
                                TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                                this.user = user3;
                                if (user3 != null && DialogObject.getEmojiStatusDocumentId(user3.emoji_status) != 0) {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.user.emoji_status), z);
                                    this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), z);
                                } else {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                    this.emojiStatus.setParticles(false, z);
                                }
                                j2 = DialogObject.getBotVerificationIcon(this.user);
                                z11 = true;
                            } else {
                                j2 = 0;
                            }
                            if (this.chat != null) {
                                TLRPC.Chat chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                                this.chat = chat5;
                                if (chat5 != null && DialogObject.getEmojiStatusDocumentId(chat5.emoji_status) != 0) {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), z);
                                    this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), z);
                                } else {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                    this.emojiStatus.setParticles(false, z);
                                }
                                j2 = DialogObject.getBotVerificationIcon(this.chat);
                                z11 = true;
                            }
                            if (j2 != 0) {
                                boolean z14 = !this.drawBotVerified;
                                this.botVerification.set(j2, z);
                                z10 = z14;
                            } else {
                                z10 = this.drawBotVerified;
                                this.botVerification.set((Drawable) null, z);
                            }
                        } else {
                            z10 = false;
                        }
                        if ((this.isDialogCell || this.isTopic) && (i & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                            CharSequence printingString = MessagesController.getInstance(this.currentAccount).getPrintingString(this.currentDialogId, getTopicId(), true);
                            CharSequence charSequence = this.lastPrintString;
                            if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                                z10 = true;
                            }
                        }
                        if (!z10 && (i & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject3 = this.message) != null && messageObject3.messageText != this.lastMessageString) {
                            z10 = true;
                        }
                        if (!z10 && (i & MessagesController.UPDATE_MASK_CHAT) != 0 && this.chat != null) {
                            TLRPC.Chat chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                            if ((chat6 != null && chat6.call_active && chat6.call_not_empty) != this.hasCall) {
                                z10 = true;
                            }
                        }
                        if (!z10 && (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat3 = this.chat) == null || (chat3.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat3)))) {
                            ForumFormattedNames forumFormattedNames = this.forumFormattedNames;
                            if (forumFormattedNames != null) {
                                forumFormattedNames.invalidateSpans();
                            }
                            z10 = true;
                        }
                        if (!z10 && (i & MessagesController.UPDATE_MASK_NAME) != 0 && this.chat == null) {
                            z10 = true;
                        }
                        if (!z10 && (i & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.user == null) {
                            z10 = true;
                        }
                        boolean z15 = (z10 || (i & MessagesController.UPDATE_MASK_CHAT_NAME) == 0 || this.user != null) ? z10 : true;
                        if (!z15) {
                            MessageObject messageObject7 = this.message;
                            if (messageObject7 != null && this.lastUnreadState != messageObject7.isUnread()) {
                                this.lastUnreadState = this.message.isUnread();
                                z15 = true;
                            }
                            if (this.isDialogCell) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                                TLRPC.Chat chat7 = dialog2 == null ? null : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog2.id));
                                if (chat7 != null && (chat7.forum || (chat7.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat7)))) {
                                    int[] forumUnreadCount2 = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat7.id);
                                    int i13 = forumUnreadCount2[0];
                                    int i14 = forumUnreadCount2[1];
                                    int i15 = forumUnreadCount2[2];
                                    this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                    i7 = i15;
                                    z5 = z4;
                                    i5 = forumUnreadCount2[4];
                                    i6 = i13;
                                    i8 = i14;
                                } else {
                                    if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                        i6 = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                        z5 = z4;
                                        i5 = 0;
                                    } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                        MessagesController.UnreadCounts communityUnreadCount2 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog2.id);
                                        i6 = communityUnreadCount2.unreadCount;
                                        i8 = communityUnreadCount2.mentionCount;
                                        i7 = communityUnreadCount2.reactionMentionCount;
                                        z5 = z4;
                                        i5 = communityUnreadCount2.pollVotesMentionCount;
                                        this.hasUnmutedCommunityDialogs = communityUnreadCount2.hasUnmutedUnreadDialogs;
                                    } else {
                                        z5 = z4;
                                        if (dialog2 != null) {
                                            i6 = dialog2.unread_count;
                                            int i16 = dialog2.unread_mentions_count;
                                            i7 = dialog2.unread_reactions_count;
                                            i8 = i16;
                                            i5 = dialog2.unread_poll_votes_count;
                                        } else {
                                            i5 = 0;
                                            i6 = 0;
                                        }
                                    }
                                    i8 = 0;
                                    i7 = 0;
                                }
                                if (ChatObject.isMonoForum(chat7)) {
                                    i8 = 0;
                                }
                                if (dialog2 != null && (this.unreadCount != i6 || this.markUnread != dialog2.unread_mark || this.mentionCount != i8 || this.reactionMentionCount != i7)) {
                                    this.unreadCount = i6;
                                    this.mentionCount = i8;
                                    this.markUnread = dialog2.unread_mark;
                                    this.reactionMentionCount = i7;
                                    this.pollVotesMentionCount = i5;
                                    z15 = true;
                                }
                                if (!z15 && (i & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject2 = this.message) != null) {
                                    i3 = this.lastSendState;
                                    i4 = messageObject2.messageOwner.send_state;
                                    if (i3 != i4) {
                                        this.lastSendState = i4;
                                        z15 = true;
                                    }
                                }
                                if (z15) {
                                    invalidate();
                                    return z3;
                                }
                                r3 = 0;
                            }
                        }
                        z5 = z4;
                        if (!z15) {
                            i3 = this.lastSendState;
                            i4 = messageObject2.messageOwner.send_state;
                            if (i3 != i4) {
                            }
                        }
                        if (z15) {
                        }
                    } else {
                        z5 = z4;
                        z6 = z2;
                        r3 = 0;
                    }
                    this.user = r3;
                    this.chat = r3;
                    this.encryptedChat = r3;
                    if (this.currentDialogCommunityId != 0) {
                        this.message = MessagesController.getInstance(this.currentAccount).findCommunityLastMessage(this.currentDialogCommunityId);
                    }
                    if (this.currentDialogFolderId == 0) {
                        this.dialogMuted = false;
                        this.drawUnmute = false;
                        MessageObject findFolderTopMessage = findFolderTopMessage();
                        this.message = findFolderTopMessage;
                        j = findFolderTopMessage != null ? findFolderTopMessage.getDialogId() : 0L;
                    } else {
                        this.drawUnmute = false;
                        if (this.forumTopic != null) {
                            boolean isDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, 0L);
                            boolean isDialogMuted2 = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, this.forumTopic.id);
                            this.topicMuted = isDialogMuted2;
                            if (isDialogMuted == isDialogMuted2) {
                                this.dialogMuted = false;
                                this.drawUnmute = false;
                            } else {
                                this.dialogMuted = isDialogMuted2;
                                this.drawUnmute = !isDialogMuted2;
                            }
                        } else {
                            this.dialogMuted = this.isDialogCell && MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, (long) getTopicId());
                        }
                        j = this.currentDialogId;
                    }
                    if (j != 0) {
                        if (DialogObject.isEncryptedDialog(j)) {
                            TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j)));
                            this.encryptedChat = encryptedChat;
                            if (encryptedChat != null) {
                                this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.encryptedChat.user_id));
                            }
                        } else if (DialogObject.isUserDialog(j)) {
                            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
                        } else {
                            TLRPC.Chat chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                            this.chat = chat8;
                            if (!this.isDialogCell && chat8 != null && chat8.migrated_to != null && (chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.migrated_to.channel_id))) != null) {
                                this.chat = chat2;
                            }
                        }
                        if (this.useMeForMyMessages && this.user != null && this.message.isOutOwner()) {
                            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
                        }
                    }
                    this.drawCommunityAvatar = this.insideCommunityList && ChatObject.isCommunity(this.chat) && this.isDialogCell;
                    if (this.currentDialogFolderId == 0) {
                        Theme.dialogs_archiveAvatarDrawable.setCallback(this);
                        this.avatarDrawable.setAvatarType(2);
                        this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                    } else if (this.useFromUserAsAvatar && (messageObject = this.message) != null) {
                        this.avatarDrawable.setInfo(this.currentAccount, messageObject.getFromPeerObject());
                        this.avatarImage.setForUserOrChat(this.message.getFromPeerObject(), this.avatarDrawable);
                    } else {
                        TLRPC.User user4 = this.user;
                        if (user4 != null) {
                            this.avatarDrawable.setInfo(this.currentAccount, user4);
                            if (UserObject.isReplyUser(this.user)) {
                                this.avatarDrawable.setAvatarType(12);
                                this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                            } else if (UserObject.isAnonymous(this.user)) {
                                this.avatarDrawable.setAvatarType(21);
                                this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                            } else if (UserObject.isUserSelf(this.user) && this.isSavedDialog && !this.isMonoForumTopicDialog) {
                                this.avatarDrawable.setAvatarType(22);
                                this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                            } else if (UserObject.isUserSelf(this.user) && !this.useMeForMyMessages && !this.isMonoForumTopicDialog) {
                                this.avatarDrawable.setAvatarType(1);
                                this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                            } else {
                                this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                            }
                        } else {
                            TLRPC.Chat chat9 = this.chat;
                            if (chat9 != null) {
                                if (chat9.monoforum) {
                                    ForumUtilities.setMonoForumAvatar(this.currentAccount, chat9, this.avatarDrawable, this.avatarImage);
                                    this.avatarDrawable.setScaleSize(1.0f);
                                } else {
                                    this.avatarDrawable.setInfo(this.currentAccount, chat9);
                                    this.avatarImage.setForUserOrChat(chat9, this.avatarDrawable);
                                }
                                if (z || ((i11 == this.unreadCount && z13 == this.markUnread) || (this.isDialogCell && System.currentTimeMillis() - this.lastDialogChangedTime <= 100))) {
                                    z7 = z3;
                                } else {
                                    ValueAnimator valueAnimator = this.countAnimator;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    this.countAnimator = ofFloat;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda0
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            DialogCell.this.lambda$update$0(valueAnimator2);
                                        }
                                    });
                                    this.countAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.DialogCell.4
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public void onAnimationEnd(Animator animator) {
                                            DialogCell.this.countChangeProgress = 1.0f;
                                            DialogCell.this.countOldLayout = null;
                                            DialogCell.this.countAnimationStableLayout = null;
                                            DialogCell.this.countAnimationInLayout = null;
                                            DialogCell.this.invalidate();
                                        }
                                    });
                                    if ((i11 == 0 || this.markUnread) && (this.markUnread || !z13)) {
                                        this.countAnimator.setDuration(220L);
                                        this.countAnimator.setInterpolator(new OvershootInterpolator());
                                    } else if (this.unreadCount == 0) {
                                        this.countAnimator.setDuration(150L);
                                        this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                    } else {
                                        this.countAnimator.setDuration(430L);
                                        this.countAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                    }
                                    if (this.drawCount && this.drawCount2 && this.countLayout != null) {
                                        String format = String.format("%d", Integer.valueOf(i11));
                                        String format2 = String.format("%d", Integer.valueOf(this.unreadCount));
                                        if (format.length() == format2.length()) {
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                            int i17 = 0;
                                            while (i17 < format.length()) {
                                                if (format.charAt(i17) == format2.charAt(i17)) {
                                                    int i18 = i17 + 1;
                                                    spannableStringBuilder.setSpan(new EmptyStubSpan(), i17, i18, 0);
                                                    spannableStringBuilder2.setSpan(new EmptyStubSpan(), i17, i18, 0);
                                                    z9 = z3;
                                                    i2 = 1;
                                                } else {
                                                    z9 = z3;
                                                    i2 = 1;
                                                    spannableStringBuilder3.setSpan(new EmptyStubSpan(), i17, i17 + 1, 0);
                                                }
                                                i17 += i2;
                                                z3 = z9;
                                            }
                                            z7 = z3;
                                            int max = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(format)));
                                            TextPaint textPaint = Theme.dialogs_countTextPaint2;
                                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                            this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                            this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, Theme.dialogs_countTextPaint2, max, alignment, 1.0f, 0.0f, false);
                                            this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, Theme.dialogs_countTextPaint2, max, alignment, 1.0f, 0.0f, false);
                                        } else {
                                            z7 = z3;
                                            this.countOldLayout = this.countLayout;
                                        }
                                    } else {
                                        z7 = z3;
                                    }
                                    this.countWidthOld = this.countWidth;
                                    this.countLeftOld = this.countLeft;
                                    this.countAnimationIncrement = this.unreadCount > i11;
                                    this.countAnimator.start();
                                }
                                this.animatorPollVotesMentionVisible.setValue(this.pollVotesMentionCount != 0, z);
                                boolean z16 = this.reactionMentionCount != 0;
                                if (!z && z16 != z12) {
                                    ValueAnimator valueAnimator2 = this.reactionsMentionsAnimator;
                                    if (valueAnimator2 != null) {
                                        valueAnimator2.cancel();
                                    }
                                    this.reactionsMentionsChangeProgress = 0.0f;
                                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    this.reactionsMentionsAnimator = ofFloat2;
                                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda1
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                            DialogCell.this.lambda$update$1(valueAnimator3);
                                        }
                                    });
                                    this.reactionsMentionsAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.DialogCell.5
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public void onAnimationEnd(Animator animator) {
                                            DialogCell.this.reactionsMentionsChangeProgress = 1.0f;
                                            DialogCell.this.invalidate();
                                        }
                                    });
                                    if (z16) {
                                        this.reactionsMentionsAnimator.setDuration(220L);
                                        this.reactionsMentionsAnimator.setInterpolator(new OvershootInterpolator());
                                    } else {
                                        this.reactionsMentionsAnimator.setDuration(150L);
                                        this.reactionsMentionsAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                                    }
                                    this.reactionsMentionsAnimator.start();
                                }
                                z8 = isFolderCell() && (chat = this.chat) != null && chat.monoforum;
                                this.drawMonoforumAvatar = z8;
                                if (z8) {
                                    dp = 1;
                                } else if (this.drawCommunityAvatar) {
                                    dp = AndroidUtilities.dp(12.0f);
                                } else {
                                    TLRPC.Chat chat10 = this.chat;
                                    if ((chat10 != null && chat10.forum && this.currentDialogFolderId == 0 && !this.useFromUserAsAvatar) || (!this.isSavedDialog && (user = this.user) != null && user.self && MessagesController.getInstance(this.currentAccount).savedViewAsChats)) {
                                        dp = AndroidUtilities.dp(16.0f);
                                    } else {
                                        dp = AndroidUtilities.dp(28.0f);
                                    }
                                }
                                this.avatarImage.setRoundRadius(dp);
                            }
                        }
                    }
                    if (z) {
                    }
                    z7 = z3;
                    this.animatorPollVotesMentionVisible.setValue(this.pollVotesMentionCount != 0, z);
                    if (this.reactionMentionCount != 0) {
                    }
                    if (!z) {
                    }
                    if (isFolderCell()) {
                    }
                    this.drawMonoforumAvatar = z8;
                    if (z8) {
                    }
                    this.avatarImage.setRoundRadius(dp);
                }
            }
            z3 = false;
            z4 = false;
            z11 = false;
            if (i == 0) {
            }
            this.user = r3;
            this.chat = r3;
            this.encryptedChat = r3;
            if (this.currentDialogCommunityId != 0) {
            }
            if (this.currentDialogFolderId == 0) {
            }
            if (j != 0) {
            }
            this.drawCommunityAvatar = this.insideCommunityList && ChatObject.isCommunity(this.chat) && this.isDialogCell;
            if (this.currentDialogFolderId == 0) {
            }
            if (z) {
            }
            z7 = z3;
            this.animatorPollVotesMentionVisible.setValue(this.pollVotesMentionCount != 0, z);
            if (this.reactionMentionCount != 0) {
            }
            if (!z) {
            }
            if (isFolderCell()) {
            }
            this.drawMonoforumAvatar = z8;
            if (z8) {
            }
            this.avatarImage.setRoundRadius(dp);
        }
        if (!this.isTopic && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z5 = true;
        }
        if (!z11) {
            int i19 = this.storyParams.currentState;
            StoriesUtilities.getPredictiveUnreadState(MessagesController.getInstance(this.currentAccount).getStoriesController(), getDialogId());
        }
        if (!z) {
            this.dialogMutedProgress = (this.dialogMuted || this.drawUnmute) ? 1.0f : 0.0f;
            ValueAnimator valueAnimator3 = this.countAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
        invalidate();
        if (isForumCell() != z6) {
            z7 = true;
        }
        if (z5) {
            if (this.attachedToWindow) {
                buildLayout();
            } else {
                this.updateLayout = true;
            }
        }
        updatePremiumBlocked(z);
        return z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$update$0(ValueAnimator valueAnimator) {
        this.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$update$1(ValueAnimator valueAnimator) {
        this.reactionsMentionsChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.forumTopic;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f == this.translationX) {
            return;
        }
        this.translationX = f;
        RLottieDrawable rLottieDrawable = this.translationDrawable;
        if (rLottieDrawable != null && f == 0.0f) {
            rLottieDrawable.setProgress(0.0f);
            this.translationAnimationStarted = false;
            this.archiveHidden = SharedConfig.archiveHidden;
            this.currentRevealProgress = 0.0f;
            this.isSliding = false;
        }
        float f2 = this.translationX;
        if (f2 != 0.0f) {
            this.isSliding = true;
        } else {
            this.currentRevealBounceProgress = 0.0f;
            this.currentRevealProgress = 0.0f;
            this.drawRevealBackground = false;
        }
        if (this.isSliding && !this.swipeCanceled) {
            boolean z = this.drawRevealBackground;
            boolean z2 = Math.abs(f2) >= ((float) getMeasuredWidth()) * 0.45f;
            this.drawRevealBackground = z2;
            if (z != z2 && this.archiveHidden == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0d3f, code lost:
    
        if (r1.lastKnownTypingType >= 0) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x165b, code lost:
    
        if (r12 > 0.0f) goto L835;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1021:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:1048:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:1056:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:1058:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d31  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0dea  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0ff9  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x10d1  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x113b  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x114b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x1193  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x11af  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x11d3  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x11d6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x120f  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1298  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x13f7  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1460  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x16a5  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x182e  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x185e  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x1872  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x1897  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x18b1  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x19b5  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x18f9  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x19f2  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x19fd  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x1a0d  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1a6d  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x1a76  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x1a7d  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x1ad2  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x1b56  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x1ba4  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x1c02  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x1c36  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x1c8c  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x1ca2  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x1ce9  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x1cf1  */
    /* JADX WARN: Removed duplicated region for block: B:702:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:703:0x1ceb  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x1cc6  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x1c5e  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x1c0e  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x1c20  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x1891  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x14ae  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x1402  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x12eb  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x127b  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x11b2  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x1196  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x10c6  */
    /* JADX WARN: Removed duplicated region for block: B:919:0x0ff4  */
    /* JADX WARN: Removed duplicated region for block: B:929:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:938:0x0de4  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v102 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        int color;
        int color2;
        int i;
        String string;
        int i2;
        int i3;
        int i4;
        float f;
        String str;
        int i5;
        float f2;
        float f3;
        float f4;
        String str2;
        int ceil;
        int i6;
        StaticLayout staticLayout;
        RLottieDrawable rLottieDrawable;
        float f5;
        float f6;
        Canvas canvas2;
        ?? r10;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        float f7;
        boolean z3;
        float f8;
        boolean z4;
        float f9;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int i10;
        float f10;
        int i11;
        boolean z5;
        int i12;
        float f11;
        Object obj;
        int i13;
        Canvas canvas3;
        int i14;
        Canvas canvas4;
        Object obj2;
        float f12;
        int i15;
        int i16;
        int i17;
        boolean z6;
        boolean z7;
        Drawable drawable;
        Drawable drawable2;
        int i18;
        DialogCellTags dialogCellTags;
        int i19;
        float dp;
        float f13;
        boolean z8;
        int i20;
        float f14;
        DialogUpdateHelper dialogUpdateHelper;
        float f15;
        StaticLayout staticLayout2;
        float f16;
        float f17;
        int i21;
        StaticLayout staticLayout3;
        Drawable drawable3;
        CustomDialog customDialog;
        int i22;
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        TLRPC.TL_forumTopic tL_forumTopic3;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        float f18 = 12.5f;
        if ((this.currentDialogId == 0 && this.customDialog == null) || !this.visibleOnScreen) {
            return;
        }
        boolean z9 = this.drawArchive;
        if (z9 && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic4 = this.forumTopic) != null && tL_forumTopic4.id == 1)) && (pullForegroundDrawable2 = this.archivedChatsDrawable) != null && pullForegroundDrawable2.outProgress == 0.0f && this.translationX == 0.0f)) {
            canvas.save();
            canvas.translate(0.0f, (-this.translateY) - this.rightFragmentOffset);
            canvas.clipRect(0.0f, getMeasuredHeight() * (1.0f - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas);
            canvas.restore();
            this.emojiStatusView.setVisibility(4);
            return;
        }
        boolean z10 = z9 && (this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic3 = this.forumTopic) != null && tL_forumTopic3.id == 1)) && this.archivedChatsDrawable != null && this.translationX == 0.0f && (dialogsActivity = this.parentFragment) != null && dialogsActivity.hasHiddenArchive() && ((rightSlidingDialogContainer = this.parentFragment.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment());
        PullForegroundDrawable pullForegroundDrawable3 = this.archivedChatsDrawable;
        float pullProgress = pullForegroundDrawable3 != null ? pullForegroundDrawable3.getPullProgress() : 1.0f;
        if (z10) {
            canvas.save();
            canvas.clipRect(0.0f, getMeasuredHeight() * (1.0f - pullProgress), getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.clipProgress != 0.0f && Build.VERSION.SDK_INT != 24) {
            canvas.save();
            canvas.clipRect(0.0f, this.topClip * this.clipProgress, getMeasuredWidth(), getMeasuredHeight() - ((int) (this.bottomClip * this.clipProgress)));
        }
        if (this.translationX != 0.0f || this.cornerProgress != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, -this.translateY);
            if (this.overrideSwipeAction) {
                color = Theme.getColor(this.overrideSwipeActionBackgroundColorKey, this.resourcesProvider);
                color2 = Theme.getColor(this.overrideSwipeActionRevealBackgroundColorKey, this.resourcesProvider);
                String str3 = this.overrideSwipeActionStringKey;
                i = this.overrideSwipeActionStringId;
                string = LocaleController.getString(str3, i);
                this.translationDrawable = this.overrideSwipeActionDrawable;
            } else if (this.currentDialogFolderId != 0) {
                if (this.archiveHidden) {
                    color = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                    color2 = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                    i = R.string.UnhideFromTop;
                    string = LocaleController.getString(i);
                    this.translationDrawable = Theme.dialogs_unpinArchiveDrawable;
                } else {
                    color = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                    color2 = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                    i = R.string.HideOnTop;
                    string = LocaleController.getString(i);
                    this.translationDrawable = Theme.dialogs_pinArchiveDrawable;
                }
            } else if (this.promoDialog) {
                color = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                color2 = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                i = R.string.PsaHide;
                string = LocaleController.getString(i);
                this.translationDrawable = Theme.dialogs_hidePsaDrawable;
            } else if (this.folderId == 0) {
                color = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                color2 = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                if (ChatObject.isCommunity(this.chat)) {
                    int i23 = R.string.SwipeUngroupCommunity;
                    string = LocaleController.getString(i23);
                    color = Theme.getColor(Theme.key_dialogSwipeRemove, this.resourcesProvider);
                    this.translationDrawable = Theme.dialogs_swipeCommunityUngroup;
                    i2 = i23;
                    i3 = color;
                    if (!this.swipeCanceled && (rLottieDrawable = this.lastDrawTranslationDrawable) != null) {
                        this.translationDrawable = rLottieDrawable;
                        i2 = this.lastDrawSwipeMessageStringId;
                    } else {
                        this.lastDrawTranslationDrawable = this.translationDrawable;
                        this.lastDrawSwipeMessageStringId = i2;
                    }
                    int i24 = i2;
                    if (!this.translationAnimationStarted && Math.abs(this.translationX) > AndroidUtilities.dp(43.0f)) {
                        this.translationAnimationStarted = true;
                        this.translationDrawable.setProgress(0.0f);
                        this.translationDrawable.setCallback(this);
                        this.translationDrawable.start();
                    }
                    float measuredWidth = this.translationX + getMeasuredWidth();
                    if (this.currentRevealProgress >= 1.0f) {
                        Theme.dialogs_pinnedPaint.setColor(color);
                        i4 = i24;
                        f = measuredWidth;
                        str = string;
                        canvas.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                        if (this.currentRevealProgress == 0.0f) {
                            if (Theme.dialogs_archiveDrawableRecolored) {
                                Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                                Theme.dialogs_archiveDrawableRecolored = false;
                            }
                            if (Theme.dialogs_hidePsaDrawableRecolored) {
                                Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                                RLottieDrawable rLottieDrawable2 = Theme.dialogs_hidePsaDrawable;
                                int i25 = Theme.key_chats_archiveBackground;
                                rLottieDrawable2.setLayerColor("Line 1", Theme.getNonAnimatedColor(i25));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i25));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i25));
                                Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                Theme.dialogs_hidePsaDrawableRecolored = false;
                            }
                        }
                    } else {
                        i4 = i24;
                        f = measuredWidth;
                        str = string;
                    }
                    int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.translationDrawable.getIntrinsicWidth() / 2);
                    int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
                    int intrinsicWidth = (this.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
                    int intrinsicHeight = (this.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
                    if (this.currentRevealProgress <= 0.0f) {
                        canvas.save();
                        f2 = f;
                        i5 = i4;
                        canvas.clipRect(f2 - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        Theme.dialogs_pinnedPaint.setColor(i3);
                        canvas.drawCircle(intrinsicWidth, intrinsicHeight, ((float) Math.sqrt((intrinsicWidth * intrinsicWidth) + ((intrinsicHeight - getMeasuredHeight()) * (intrinsicHeight - getMeasuredHeight())))) * AndroidUtilities.accelerateInterpolator.getInterpolation(this.currentRevealProgress), Theme.dialogs_pinnedPaint);
                        canvas.restore();
                        if (!Theme.dialogs_archiveDrawableRecolored) {
                            Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                            Theme.dialogs_archiveDrawableRecolored = true;
                        }
                        if (!Theme.dialogs_hidePsaDrawableRecolored) {
                            Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                            RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                            int i26 = Theme.key_chats_archivePinBackground;
                            rLottieDrawable3.setLayerColor("Line 1", Theme.getNonAnimatedColor(i26));
                            Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i26));
                            Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i26));
                            Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                            Theme.dialogs_hidePsaDrawableRecolored = true;
                        }
                    } else {
                        i5 = i4;
                        f2 = f;
                    }
                    canvas.save();
                    canvas.translate(measuredWidth2, measuredHeight);
                    f3 = this.currentRevealBounceProgress;
                    f4 = 1.0f;
                    if (f3 != 0.0f && f3 != 1.0f) {
                        float interpolation = this.interpolator.getInterpolation(f3) + 1.0f;
                        canvas.scale(interpolation, interpolation, this.translationDrawable.getIntrinsicWidth() / 2, this.translationDrawable.getIntrinsicHeight() / 2);
                    }
                    BaseCell.setDrawableBounds((Drawable) this.translationDrawable, 0, 0);
                    this.translationDrawable.draw(canvas);
                    canvas.restore();
                    canvas.clipRect(f2, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    str2 = str;
                    ceil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str2));
                    i6 = i5;
                    if (this.swipeMessageTextId == i6 || this.swipeMessageWidth != getMeasuredWidth()) {
                        this.swipeMessageTextId = i6;
                        this.swipeMessageWidth = getMeasuredWidth();
                        TextPaint textPaint = Theme.dialogs_archiveTextPaint;
                        int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        staticLayout = new StaticLayout(str2, textPaint, min, alignment, 1.0f, 0.0f, false);
                        this.swipeMessageTextLayout = staticLayout;
                        if (staticLayout.getLineCount() > 1) {
                            this.swipeMessageTextLayout = new StaticLayout(str2, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                        }
                    }
                    if (this.swipeMessageTextLayout != null) {
                        canvas.save();
                        canvas.translate((getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.swipeMessageTextLayout.getWidth() / 2.0f), measuredHeight + AndroidUtilities.dp(36.0f) + (this.swipeMessageTextLayout.getLineCount() > 1 ? -AndroidUtilities.dp(4.0f) : 0.0f));
                        this.swipeMessageTextLayout.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else if (SharedConfig.getChatSwipeAction(this.currentAccount) == 3) {
                    if (this.dialogMuted) {
                        i = R.string.SwipeUnmute;
                        string = LocaleController.getString(i);
                        this.translationDrawable = Theme.dialogs_swipeUnmuteDrawable;
                    } else {
                        i = R.string.SwipeMute;
                        string = LocaleController.getString(i);
                        this.translationDrawable = Theme.dialogs_swipeMuteDrawable;
                    }
                } else if (SharedConfig.getChatSwipeAction(this.currentAccount) == 4) {
                    i = R.string.SwipeDeleteChat;
                    string = LocaleController.getString(i);
                    color = Theme.getColor(Theme.key_dialogSwipeRemove, this.resourcesProvider);
                    this.translationDrawable = Theme.dialogs_swipeDeleteDrawable;
                } else if (SharedConfig.getChatSwipeAction(this.currentAccount) == 1) {
                    if (this.unreadCount > 0 || this.markUnread) {
                        i = R.string.SwipeMarkAsRead;
                        string = LocaleController.getString(i);
                        this.translationDrawable = Theme.dialogs_swipeReadDrawable;
                    } else {
                        i = R.string.SwipeMarkAsUnread;
                        string = LocaleController.getString(i);
                        this.translationDrawable = Theme.dialogs_swipeUnreadDrawable;
                    }
                } else if (SharedConfig.getChatSwipeAction(this.currentAccount) == 0) {
                    if (getIsPinned()) {
                        i = R.string.SwipeUnpin;
                        string = LocaleController.getString(i);
                        this.translationDrawable = Theme.dialogs_swipeUnpinDrawable;
                    } else {
                        i = R.string.SwipePin;
                        string = LocaleController.getString(i);
                        this.translationDrawable = Theme.dialogs_swipePinDrawable;
                    }
                } else {
                    i = R.string.Archive;
                    string = LocaleController.getString(i);
                    this.translationDrawable = Theme.dialogs_archiveDrawable;
                }
            } else {
                color = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                color2 = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                i = R.string.Unarchive;
                string = LocaleController.getString(i);
                this.translationDrawable = Theme.dialogs_unarchiveDrawable;
            }
            int i27 = i;
            i3 = color2;
            i2 = i27;
            if (!this.swipeCanceled) {
            }
            this.lastDrawTranslationDrawable = this.translationDrawable;
            this.lastDrawSwipeMessageStringId = i2;
            int i242 = i2;
            if (!this.translationAnimationStarted) {
                this.translationAnimationStarted = true;
                this.translationDrawable.setProgress(0.0f);
                this.translationDrawable.setCallback(this);
                this.translationDrawable.start();
            }
            float measuredWidth3 = this.translationX + getMeasuredWidth();
            if (this.currentRevealProgress >= 1.0f) {
            }
            int measuredWidth22 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.translationDrawable.getIntrinsicWidth() / 2);
            int measuredHeight2 = (getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
            int intrinsicWidth2 = (this.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (this.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight2;
            if (this.currentRevealProgress <= 0.0f) {
            }
            canvas.save();
            canvas.translate(measuredWidth22, measuredHeight2);
            f3 = this.currentRevealBounceProgress;
            f4 = 1.0f;
            if (f3 != 0.0f) {
                float interpolation2 = this.interpolator.getInterpolation(f3) + 1.0f;
                canvas.scale(interpolation2, interpolation2, this.translationDrawable.getIntrinsicWidth() / 2, this.translationDrawable.getIntrinsicHeight() / 2);
            }
            BaseCell.setDrawableBounds((Drawable) this.translationDrawable, 0, 0);
            this.translationDrawable.draw(canvas);
            canvas.restore();
            canvas.clipRect(f2, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            str2 = str;
            ceil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str2));
            i6 = i5;
            if (this.swipeMessageTextId == i6) {
            }
            this.swipeMessageTextId = i6;
            this.swipeMessageWidth = getMeasuredWidth();
            TextPaint textPaint2 = Theme.dialogs_archiveTextPaint;
            int min2 = Math.min(AndroidUtilities.dp(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str2, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            this.swipeMessageTextLayout = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (this.swipeMessageTextLayout != null) {
            }
            canvas.restore();
        } else {
            RLottieDrawable rLottieDrawable4 = this.translationDrawable;
            if (rLottieDrawable4 != null) {
                rLottieDrawable4.stop();
                this.translationDrawable.setProgress(0.0f);
                this.translationDrawable.setCallback(null);
                this.translationDrawable = null;
                this.translationAnimationStarted = false;
            }
            f4 = 1.0f;
        }
        if (this.translationX != 0.0f) {
            canvas.save();
            canvas.translate(this.translationX, 0.0f);
            f5 = this.translationX + 0.0f;
        } else {
            f5 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(8.0f) * this.cornerProgress;
        if (this.isSelected) {
            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), getCollapsedHeight(), this.rightFragmentOpenedProgress));
            this.rect.offset(0.0f, (-this.translateY) + this.collapseOffset);
            canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
        }
        canvas.save();
        canvas.translate(0.0f, (-this.rightFragmentOffset) * this.rightFragmentOpenedProgress);
        if (this.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || this.archiveBackgroundProgress != 0.0f)) {
            Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, f4));
            Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (f4 - this.rightFragmentOpenedProgress)));
        } else if (getIsPinned() || this.drawPinBackground) {
            Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
            Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (f4 - this.rightFragmentOpenedProgress)));
        }
        canvas.restore();
        this.updateHelper.updateAnimationValues();
        if (this.collapseOffset != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, this.collapseOffset);
            f6 = this.collapseOffset + 0.0f;
        } else {
            f6 = 0.0f;
        }
        float f19 = this.rightFragmentOpenedProgress;
        if (f19 != f4) {
            if (f19 != 0.0f) {
                float clamp = Utilities.clamp(f19 / 0.4f, f4, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    i10 = 2;
                    i22 = canvas.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (f4 - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((f4 - this.rightFragmentOpenedProgress) * 255.0f), 31);
                } else {
                    i10 = 2;
                    int save = canvas.save();
                    canvas.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (f4 - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i22 = save;
                }
                canvas.translate((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress, 0.0f);
                f10 = f5 + ((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress);
                i11 = i22;
            } else {
                i10 = 2;
                f10 = f5;
                i11 = -1;
            }
            if (this.translationX != 0.0f || this.cornerProgress != 0.0f) {
                canvas.save();
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                this.rect.set(getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.rect.offset(0.0f, -this.translateY);
                canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_pinnedPaint);
                if (this.isSelected) {
                    canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
                }
                if (this.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || this.archiveBackgroundProgress != 0.0f)) {
                    Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, f4));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r0.getAlpha() * (f4 - this.rightFragmentOpenedProgress)));
                } else if (getIsPinned() || this.drawPinBackground) {
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r0.getAlpha() * (f4 - this.rightFragmentOpenedProgress)));
                }
                canvas.restore();
            }
            if (this.translationX != 0.0f) {
                float f20 = this.cornerProgress;
                if (f20 < f4) {
                    float f21 = f20 + 0.10666667f;
                    this.cornerProgress = f21;
                    if (f21 > f4) {
                        this.cornerProgress = f4;
                    }
                    z5 = true;
                }
                z5 = false;
            } else {
                float f22 = this.cornerProgress;
                if (f22 > 0.0f) {
                    float f23 = f22 - 0.10666667f;
                    this.cornerProgress = f23;
                    if (f23 < 0.0f) {
                        this.cornerProgress = 0.0f;
                    }
                    z5 = true;
                }
                z5 = false;
            }
            if (this.drawNameLock) {
                BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, this.nameLockLeft, this.nameLockTop);
                Theme.dialogs_lockDrawable.draw(canvas);
            }
            int dp3 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                dp3 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
            }
            if (this.nameLayout != null) {
                if (this.nameLayoutEllipsizeByGradient && !this.nameLayoutFits) {
                    if (this.nameLayoutEllipsizeLeft && this.fadePaint == null) {
                        Paint paint = new Paint();
                        this.fadePaint = paint;
                        float[] fArr = new float[i10];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{-1, 0}, fArr, Shader.TileMode.CLAMP));
                        this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (this.fadePaintBack == null) {
                        Paint paint2 = new Paint();
                        this.fadePaintBack = paint2;
                        float[] fArr2 = new float[i10];
                        // fill-array-data instruction
                        fArr2[0] = 0.0f;
                        fArr2[1] = 1.0f;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, -1}, fArr2, Shader.TileMode.CLAMP));
                        this.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), NotificationCenter.didReceiveSmsCode, 31);
                    int i28 = this.nameLeft;
                    canvas.clipRect(i28, 0, this.nameWidth + i28, getMeasuredHeight());
                }
                if (this.currentDialogFolderId != 0) {
                    TextPaint textPaint3 = Theme.dialogs_namePaint[this.paintIndex];
                    int color3 = Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider);
                    textPaint3.linkColor = color3;
                    textPaint3.setColor(color3);
                } else if (this.encryptedChat != null || ((customDialog = this.customDialog) != null && customDialog.type == i10)) {
                    TextPaint textPaint4 = Theme.dialogs_namePaint[this.paintIndex];
                    int color4 = Theme.getColor(Theme.key_chats_secretName, this.resourcesProvider);
                    textPaint4.linkColor = color4;
                    textPaint4.setColor(color4);
                } else {
                    TextPaint textPaint5 = Theme.dialogs_namePaint[this.paintIndex];
                    int color5 = Theme.getColor(Theme.key_chats_name, this.resourcesProvider);
                    textPaint5.linkColor = color5;
                    textPaint5.setColor(color5);
                }
                canvas.save();
                canvas.translate(this.nameLeft + this.nameLayoutTranslateX, dp3);
                SpoilerEffect.layoutDrawMaybe(this.nameLayout, canvas);
                StaticLayout staticLayout4 = this.nameLayout;
                f11 = 0.0f;
                i12 = i11;
                i13 = -1;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, this.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(0, staticLayout4.getPaint().getColor()));
                canvas.restore();
                if (!this.nameLayoutEllipsizeByGradient || this.nameLayoutFits) {
                    obj = null;
                } else {
                    canvas.save();
                    if (this.nameLayoutEllipsizeLeft) {
                        canvas.translate(this.nameLeft, 0.0f);
                        obj = null;
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaint);
                    } else {
                        obj = null;
                        canvas.translate((this.nameLeft + this.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaintBack);
                    }
                    canvas.restore();
                    canvas.restore();
                }
            } else {
                i12 = i11;
                f11 = 0.0f;
                obj = null;
                i13 = -1;
            }
            if (this.timeLayout == null || this.currentDialogFolderId != 0) {
                canvas3 = canvas;
            } else {
                canvas.save();
                canvas.translate(this.timeLeft, this.timeTop);
                TextPaint timeTextPaint = getTimeTextPaint();
                if (getIsPinned()) {
                    canvas.translate(AndroidUtilities.dp(20.0f), f11);
                    float height = (this.timeLayout.getHeight() / 2.0f) - AndroidUtilities.dp(8.5f);
                    float f24 = -AndroidUtilities.dp(20.0f);
                    float width = this.timeLayout.getWidth() + AndroidUtilities.dp(6.0f);
                    if (this.drawCount && !isCounterMuted()) {
                        drawable3 = Theme.dialogs_pinnedDrawable2Accent;
                    } else {
                        drawable3 = Theme.dialogs_pinnedDrawable2;
                    }
                    Drawable drawable4 = drawable3;
                    int dp4 = (int) (((AndroidUtilities.dp(17.0f) - drawable4.getIntrinsicHeight()) / 2.0f) + height);
                    int dp5 = ((int) f24) + AndroidUtilities.dp(4.0f);
                    drawable4.setBounds(dp5, dp4, drawable4.getIntrinsicWidth() + dp5, drawable4.getIntrinsicHeight() + dp4);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3 = canvas;
                    canvas.drawRoundRect(f24, height, width, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable4.draw(canvas3);
                } else {
                    canvas3 = canvas;
                }
                int color6 = this.timeLayout.getPaint().getColor();
                boolean z11 = color6 != timeTextPaint.getColor();
                if (z11) {
                    this.timeLayout.getPaint().setColor(timeTextPaint.getColor());
                }
                SpoilerEffect.layoutDrawMaybe(this.timeLayout, canvas3);
                if (z11) {
                    this.timeLayout.getPaint().setColor(color6);
                }
                canvas.restore();
            }
            if (drawLock2()) {
                i14 = 2;
                Theme.dialogs_lock2Drawable.setBounds(this.lock2Left, this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / 2), this.lock2Left + Theme.dialogs_lock2Drawable.getIntrinsicWidth(), this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / 2) + Theme.dialogs_lock2Drawable.getIntrinsicHeight());
                Theme.dialogs_lock2Drawable.draw(canvas3);
            } else {
                i14 = 2;
            }
            if (this.messageNameLayout == null || isForumCell()) {
                canvas4 = canvas3;
                obj2 = obj;
                f12 = 1.0f;
                i15 = 0;
                i16 = 1;
            } else {
                if (this.currentDialogFolderId != 0) {
                    TextPaint textPaint6 = Theme.dialogs_messageNamePaint;
                    int color7 = Theme.getColor(Theme.key_chats_nameMessageArchived_threeLines, this.resourcesProvider);
                    textPaint6.linkColor = color7;
                    textPaint6.setColor(color7);
                } else if (this.draftMessage != null) {
                    TextPaint textPaint7 = Theme.dialogs_messageNamePaint;
                    int color8 = Theme.getColor(Theme.key_chats_draft, this.resourcesProvider);
                    textPaint7.linkColor = color8;
                    textPaint7.setColor(color8);
                } else {
                    TextPaint textPaint8 = Theme.dialogs_messageNamePaint;
                    int color9 = Theme.getColor(Theme.key_chats_nameMessage_threeLines, this.resourcesProvider);
                    textPaint8.linkColor = color9;
                    textPaint8.setColor(color9);
                }
                canvas.save();
                canvas3.translate(this.messageNameLeft, this.messageNameTop);
                try {
                    SpoilerEffect.layoutDrawMaybe(this.messageNameLayout, canvas3);
                    StaticLayout staticLayout5 = this.messageNameLayout;
                    i16 = 1;
                    try {
                        canvas4 = canvas3;
                        i15 = 0;
                        f12 = 1.0f;
                        obj2 = obj;
                        try {
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout5, this.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(1, staticLayout5.getPaint().getColor()));
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            canvas.restore();
                            if (this.messageLayout == null) {
                            }
                            if (this.buttonLayout == null) {
                            }
                            if (this.currentDialogFolderId == 0) {
                            }
                            if (this.drawBotVerified) {
                            }
                            if (this.drawUnmute) {
                            }
                            if (this.dialogsType != i14) {
                            }
                            i7 = 17;
                            if (this.drawVerified) {
                            }
                            z = false;
                            if (!this.drawReorder) {
                            }
                            if (!LocaleController.isRTL) {
                            }
                            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                            Theme.dialogs_reorderDrawable.draw(canvas2);
                            float floatValue = this.animatorPollVotesMentionVisible.getFloatValue();
                            if (!this.drawError) {
                            }
                            if (this.thumbsCount > 0) {
                            }
                            i18 = -1;
                            i8 = 2;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                            }
                            i19 = i12;
                            if (i19 != i18) {
                            }
                            z2 = z5;
                            r10 = z6;
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.drawAvatar) {
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.avatarImage.getVisible()) {
                            }
                            if (this.rightFragmentOpenedProgress > 0.0f) {
                            }
                            if (this.collapseOffset != 0.0f) {
                            }
                            if (this.translationX != 0.0f) {
                            }
                            if (this.drawArchive) {
                            }
                            if (this.useSeparator) {
                            }
                            f7 = 0.0f;
                            if (this.clipProgress != f7) {
                            }
                            if (z10) {
                            }
                            z3 = this.drawReorder;
                            if (!z3) {
                            }
                            if (!z3) {
                            }
                            r11 = true;
                            if (!this.archiveHidden) {
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (!this.drawRevealBackground) {
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        canvas4 = canvas3;
                        obj2 = obj;
                        f12 = 1.0f;
                        i15 = 0;
                    }
                } catch (Exception e3) {
                    e = e3;
                    canvas4 = canvas3;
                    obj2 = obj;
                    f12 = 1.0f;
                    i15 = 0;
                    i16 = 1;
                }
                canvas.restore();
            }
            if (this.messageLayout == null) {
                if (this.currentDialogFolderId != 0) {
                    if (this.chat != null) {
                        TextPaint textPaint9 = Theme.dialogs_messagePaint[this.paintIndex];
                        int color10 = Theme.getColor(Theme.key_chats_nameMessageArchived, this.resourcesProvider);
                        textPaint9.linkColor = color10;
                        textPaint9.setColor(color10);
                    } else {
                        TextPaint textPaint10 = Theme.dialogs_messagePaint[this.paintIndex];
                        int color11 = Theme.getColor(Theme.key_chats_messageArchived, this.resourcesProvider);
                        textPaint10.linkColor = color11;
                        textPaint10.setColor(color11);
                    }
                } else {
                    TextPaint textPaint11 = Theme.dialogs_messagePaint[this.paintIndex];
                    int color12 = Theme.getColor(Theme.key_chats_message, this.resourcesProvider);
                    textPaint11.linkColor = color12;
                    textPaint11.setColor(color12);
                }
                float dp6 = AndroidUtilities.dp(14.0f);
                DialogUpdateHelper dialogUpdateHelper2 = this.updateHelper;
                if (dialogUpdateHelper2.typingOutToTop) {
                    f14 = this.messageTop - (dialogUpdateHelper2.typingProgres * dp6);
                } else {
                    f14 = this.messageTop + (dialogUpdateHelper2.typingProgres * dp6);
                }
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    f14 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                }
                if (this.updateHelper.typingProgres != f12) {
                    canvas.save();
                    canvas4.translate(this.messageLeft, f14);
                    int alpha2 = this.messageLayout.getPaint().getAlpha();
                    this.messageLayout.getPaint().setAlpha((int) (alpha2 * (f12 - this.updateHelper.typingProgres)));
                    if (!this.spoilers.isEmpty()) {
                        try {
                            canvas.save();
                            SpoilerEffect.clipOutCanvas(canvas4, this.spoilers);
                            SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                            staticLayout3 = this.messageLayout;
                            i21 = alpha2;
                        } catch (Exception e4) {
                            e = e4;
                            i21 = alpha2;
                        }
                        try {
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, this.animatedEmojiStack, -0.075f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i14, staticLayout3.getPaint().getColor()));
                            canvas.restore();
                            for (int i29 = 0; i29 < this.spoilers.size(); i29 += i16) {
                                SpoilerEffect spoilerEffect = (SpoilerEffect) this.spoilers.get(i29);
                                spoilerEffect.setColor(this.messageLayout.getPaint().getColor());
                                spoilerEffect.draw(canvas4);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            FileLog.e(e);
                            this.messageLayout.getPaint().setAlpha(i21);
                            canvas.restore();
                            canvas.save();
                            dialogUpdateHelper = this.updateHelper;
                            if (!dialogUpdateHelper.typingOutToTop) {
                            }
                            if (!this.useForceThreeLines) {
                                f15 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                canvas4.translate(this.typingLeft, f15);
                                staticLayout2 = this.typingLayout;
                                if (staticLayout2 != null) {
                                }
                                canvas.restore();
                                if (this.typingLayout != null) {
                                }
                                i17 = 4;
                                if (this.buttonLayout == null) {
                                }
                                if (this.currentDialogFolderId == 0) {
                                }
                                if (this.drawBotVerified) {
                                }
                                if (this.drawUnmute) {
                                }
                                if (this.dialogsType != i14) {
                                }
                                i7 = 17;
                                if (this.drawVerified) {
                                }
                                z = false;
                                if (!this.drawReorder) {
                                }
                                if (!LocaleController.isRTL) {
                                }
                                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                Theme.dialogs_reorderDrawable.draw(canvas2);
                                float floatValue2 = this.animatorPollVotesMentionVisible.getFloatValue();
                                if (!this.drawError) {
                                }
                                if (this.thumbsCount > 0) {
                                }
                                i18 = -1;
                                i8 = 2;
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null) {
                                }
                                i19 = i12;
                                if (i19 != i18) {
                                }
                                z2 = z5;
                                r10 = z6;
                                if (this.animatingArchiveAvatar) {
                                }
                                if (this.drawAvatar) {
                                }
                                if (this.animatingArchiveAvatar) {
                                }
                                if (this.avatarImage.getVisible()) {
                                }
                                if (this.rightFragmentOpenedProgress > 0.0f) {
                                }
                                if (this.collapseOffset != 0.0f) {
                                }
                                if (this.translationX != 0.0f) {
                                }
                                if (this.drawArchive) {
                                }
                                if (this.useSeparator) {
                                }
                                f7 = 0.0f;
                                if (this.clipProgress != f7) {
                                }
                                if (z10) {
                                }
                                z3 = this.drawReorder;
                                if (!z3) {
                                }
                                if (!z3) {
                                }
                                r11 = true;
                                if (!this.archiveHidden) {
                                }
                                if (this.animatingArchiveAvatar) {
                                }
                                if (!this.drawRevealBackground) {
                                }
                            }
                            f15 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            canvas4.translate(this.typingLeft, f15);
                            staticLayout2 = this.typingLayout;
                            if (staticLayout2 != null) {
                            }
                            canvas.restore();
                            if (this.typingLayout != null) {
                            }
                            i17 = 4;
                            if (this.buttonLayout == null) {
                            }
                            if (this.currentDialogFolderId == 0) {
                            }
                            if (this.drawBotVerified) {
                            }
                            if (this.drawUnmute) {
                            }
                            if (this.dialogsType != i14) {
                            }
                            i7 = 17;
                            if (this.drawVerified) {
                            }
                            z = false;
                            if (!this.drawReorder) {
                            }
                            if (!LocaleController.isRTL) {
                            }
                            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                            Theme.dialogs_reorderDrawable.draw(canvas2);
                            float floatValue22 = this.animatorPollVotesMentionVisible.getFloatValue();
                            if (!this.drawError) {
                            }
                            if (this.thumbsCount > 0) {
                            }
                            i18 = -1;
                            i8 = 2;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                            }
                            i19 = i12;
                            if (i19 != i18) {
                            }
                            z2 = z5;
                            r10 = z6;
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.drawAvatar) {
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.avatarImage.getVisible()) {
                            }
                            if (this.rightFragmentOpenedProgress > 0.0f) {
                            }
                            if (this.collapseOffset != 0.0f) {
                            }
                            if (this.translationX != 0.0f) {
                            }
                            if (this.drawArchive) {
                            }
                            if (this.useSeparator) {
                            }
                            f7 = 0.0f;
                            if (this.clipProgress != f7) {
                            }
                            if (z10) {
                            }
                            z3 = this.drawReorder;
                            if (!z3) {
                            }
                            if (!z3) {
                            }
                            r11 = true;
                            if (!this.archiveHidden) {
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (!this.drawRevealBackground) {
                            }
                        }
                    } else {
                        i21 = alpha2;
                        SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                        StaticLayout staticLayout6 = this.messageLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, this.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i14, staticLayout6.getPaint().getColor()));
                    }
                    this.messageLayout.getPaint().setAlpha(i21);
                    canvas.restore();
                }
                canvas.save();
                dialogUpdateHelper = this.updateHelper;
                if (!dialogUpdateHelper.typingOutToTop) {
                    f15 = this.messageTop + ((f12 - dialogUpdateHelper.typingProgres) * dp6);
                } else {
                    f15 = this.messageTop - ((f12 - dialogUpdateHelper.typingProgres) * dp6);
                }
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    f15 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                }
                canvas4.translate(this.typingLeft, f15);
                staticLayout2 = this.typingLayout;
                if (staticLayout2 != null) {
                    f16 = 0.0f;
                    if (this.updateHelper.typingProgres > 0.0f) {
                        int alpha3 = staticLayout2.getPaint().getAlpha();
                        this.typingLayout.getPaint().setAlpha((int) (alpha3 * this.updateHelper.typingProgres));
                        this.typingLayout.draw(canvas4);
                        this.typingLayout.getPaint().setAlpha(alpha3);
                    }
                } else {
                    f16 = 0.0f;
                }
                canvas.restore();
                if (this.typingLayout != null) {
                    int i30 = this.printingStringType;
                    if (i30 < 0) {
                        DialogUpdateHelper dialogUpdateHelper3 = this.updateHelper;
                        if (dialogUpdateHelper3.typingProgres > f16) {
                        }
                    }
                    if (i30 < 0) {
                        i30 = this.updateHelper.lastKnownTypingType;
                    }
                    StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(i30);
                    if (chatStatusDrawable != null) {
                        canvas.save();
                        chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_actionMessage), (int) (Color.alpha(r10) * this.updateHelper.typingProgres)));
                        DialogUpdateHelper dialogUpdateHelper4 = this.updateHelper;
                        if (dialogUpdateHelper4.typingOutToTop) {
                            f17 = this.messageTop + (dp6 * (f12 - dialogUpdateHelper4.typingProgres));
                        } else {
                            f17 = this.messageTop - (dp6 * (f12 - dialogUpdateHelper4.typingProgres));
                        }
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            f17 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                        }
                        i17 = 4;
                        if (i30 == i16 || i30 == 4) {
                            canvas4.translate(this.statusDrawableLeft, f17 + (i30 == i16 ? AndroidUtilities.dp(f12) : 0));
                        } else {
                            canvas4.translate(this.statusDrawableLeft, f17 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
                        }
                        chatStatusDrawable.draw(canvas4);
                        invalidate();
                        canvas.restore();
                    }
                }
                i17 = 4;
            } else {
                i17 = 4;
            }
            if (this.buttonLayout == null) {
                canvas.save();
                if (this.buttonBackgroundPaint == null) {
                    this.buttonBackgroundPaint = new Paint(i16);
                }
                if (this.canvasButton == null) {
                    CanvasButton canvasButton = new CanvasButton(this);
                    this.canvasButton = canvasButton;
                    canvasButton.setDelegate(new Runnable() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogCell.this.lambda$onDraw$2();
                        }
                    });
                    this.canvasButton.setLongPress(new Runnable() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogCell.this.lambda$onDraw$3();
                        }
                    });
                }
                if (this.lastTopicMessageUnread && this.topMessageTopicEndIndex != this.topMessageTopicStartIndex && ((i20 = this.dialogsType) == 0 || i20 == 7 || i20 == 8)) {
                    this.canvasButton.setColor(ColorUtils.setAlphaComponent(this.currentMessagePaint.getColor(), Theme.isCurrentThemeDark() ? 36 : 26));
                    if (!this.buttonCreated) {
                        this.canvasButton.rewind();
                        int i31 = this.topMessageTopicEndIndex;
                        if (i31 != this.topMessageTopicStartIndex && i31 > 0) {
                            float f25 = this.messageTop;
                            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                f25 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            }
                            RectF rectF = AndroidUtilities.rectTmp;
                            float dp7 = this.messageLeft + AndroidUtilities.dp(2.0f) + this.messageLayout.getPrimaryHorizontal(i15);
                            float f26 = this.messageLeft;
                            StaticLayout staticLayout7 = this.messageLayout;
                            rectF.set(dp7, f25, (f26 + staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), this.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), this.buttonTop - AndroidUtilities.dp(4.0f));
                            rectF.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                            if (rectF.right > rectF.left) {
                                this.canvasButton.addRect(rectF);
                            }
                        }
                        float lineLeft = this.buttonLayout.getLineLeft(i15);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(this.buttonLeft + lineLeft + AndroidUtilities.dp(2.0f), this.buttonTop + AndroidUtilities.dp(2.0f), this.buttonLeft + lineLeft + this.buttonLayout.getLineWidth(i15) + AndroidUtilities.dp(12.0f), this.buttonTop + this.buttonLayout.getHeight());
                        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                        this.canvasButton.addRect(rectF2);
                    }
                    this.canvasButton.draw(canvas4);
                    Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                    Drawable drawable5 = Theme.dialogs_forum_arrowDrawable;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    BaseCell.setDrawableBounds(drawable5, rectF3.right - AndroidUtilities.dp(18.0f), rectF3.top + ((rectF3.height() - Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight()) / 2.0f));
                    Theme.dialogs_forum_arrowDrawable.draw(canvas4);
                }
                canvas4.translate(this.buttonLeft, this.buttonTop);
                if (!this.spoilers2.isEmpty()) {
                    try {
                        canvas.save();
                        SpoilerEffect.clipOutCanvas(canvas4, this.spoilers2);
                        SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas4);
                        StaticLayout staticLayout8 = this.buttonLayout;
                        try {
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout8, this.animatedEmojiStack3, -0.075f, this.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout8.getPaint().getColor()));
                            canvas.restore();
                            for (int i32 = 0; i32 < this.spoilers2.size(); i32 += i16) {
                                SpoilerEffect spoilerEffect2 = (SpoilerEffect) this.spoilers2.get(i32);
                                spoilerEffect2.setColor(this.buttonLayout.getPaint().getColor());
                                spoilerEffect2.draw(canvas4);
                            }
                        } catch (Exception e6) {
                            e = e6;
                            FileLog.e(e);
                            canvas.restore();
                            if (this.currentDialogFolderId == 0) {
                            }
                            if (this.drawBotVerified) {
                            }
                            if (this.drawUnmute) {
                            }
                            if (this.dialogsType != i14) {
                            }
                            i7 = 17;
                            if (this.drawVerified) {
                            }
                            z = false;
                            if (!this.drawReorder) {
                            }
                            if (!LocaleController.isRTL) {
                            }
                            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                            Theme.dialogs_reorderDrawable.draw(canvas2);
                            float floatValue222 = this.animatorPollVotesMentionVisible.getFloatValue();
                            if (!this.drawError) {
                            }
                            if (this.thumbsCount > 0) {
                            }
                            i18 = -1;
                            i8 = 2;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                            }
                            i19 = i12;
                            if (i19 != i18) {
                            }
                            z2 = z5;
                            r10 = z6;
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.drawAvatar) {
                                if (!this.drawMonoforumAvatar) {
                                }
                                if (!this.insideCommunityList) {
                                    float centerX = this.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                    float centerY = this.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                    if (this.communityArrowDrawable == null) {
                                    }
                                    DrawableUtils.setBounds(this.communityArrowDrawable, centerX, centerY, i7);
                                    canvas2.drawCircle(this.communityArrowDrawable.getBounds().exactCenterX(), this.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
                                    this.communityArrowDrawable.draw(canvas2);
                                }
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.avatarImage.getVisible()) {
                            }
                            if (this.rightFragmentOpenedProgress > 0.0f) {
                                boolean isCounterMuted = isCounterMuted();
                                RectF rectF4 = this.storyParams.originalAvatarRect;
                                int width2 = (int) (((rectF4.left + rectF4.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
                                RectF rectF5 = this.storyParams.originalAvatarRect;
                                drawCounter(canvas, isCounterMuted, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width2, (int) (((rectF5.left + rectF5.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
                            }
                            if (this.collapseOffset != 0.0f) {
                            }
                            if (this.translationX != 0.0f) {
                            }
                            if (this.drawArchive) {
                                canvas.save();
                                canvas2.translate(0.0f, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
                                canvas2.clipRect(0.0f, getMeasuredHeight() * (f4 - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
                                this.archivedChatsDrawable.draw(canvas2);
                                canvas.restore();
                            }
                            if (this.useSeparator) {
                            }
                            f7 = 0.0f;
                            if (this.clipProgress != f7) {
                            }
                            if (z10) {
                            }
                            z3 = this.drawReorder;
                            if (!z3) {
                            }
                            if (!z3) {
                            }
                            r11 = true;
                            if (!this.archiveHidden) {
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (!this.drawRevealBackground) {
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                } else {
                    SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas4);
                    StaticLayout staticLayout9 = this.buttonLayout;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout9, this.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout9.getPaint().getColor()));
                }
                canvas.restore();
            }
            if (this.currentDialogFolderId == 0) {
                int i33 = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                int i34 = this.lastStatusDrawableParams;
                if (i34 >= 0 && i34 != i33 && !this.statusDrawableAnimationInProgress) {
                    createStatusDrawableAnimator(i34, i33);
                }
                boolean z12 = this.statusDrawableAnimationInProgress;
                if (z12) {
                    i33 = this.animateToStatusDrawableParams;
                }
                boolean z13 = (i33 & 1) != 0;
                boolean z14 = (i33 & 2) != 0;
                boolean z15 = (i33 & i17) != 0;
                if (z12) {
                    int i35 = this.animateFromStatusDrawableParams;
                    boolean z16 = (i35 & 1) != 0;
                    boolean z17 = (i35 & 2) != 0;
                    boolean z18 = (i35 & i17) != 0;
                    if (!z13 && !z16 && z18 && !z17 && z14 && z15) {
                        canvas2 = canvas4;
                        i9 = 1;
                        drawCheckStatus(canvas, z13, z14, z15, true, this.statusDrawableProgress);
                        z8 = false;
                        f4 = 1.0f;
                    } else {
                        canvas2 = canvas4;
                        boolean z19 = z16;
                        i9 = 1;
                        boolean z20 = z17;
                        boolean z21 = z18;
                        z8 = false;
                        f4 = 1.0f;
                        drawCheckStatus(canvas, z19, z20, z21, false, 1.0f - this.statusDrawableProgress);
                        drawCheckStatus(canvas, z13, z14, z15, false, this.statusDrawableProgress);
                    }
                } else {
                    canvas2 = canvas4;
                    z8 = false;
                    i9 = 1;
                    f4 = 1.0f;
                    drawCheckStatus(canvas, z13, z14, z15, false, 1.0f);
                }
                this.lastStatusDrawableParams = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                z6 = z8;
            } else {
                canvas2 = canvas4;
                z6 = false;
                i9 = 1;
                f4 = 1.0f;
            }
            if (this.drawBotVerified) {
                int dp8 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp8 -= AndroidUtilities.dp(9.0f);
                }
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.botVerification;
                if (swapAnimatedEmojiDrawable != null) {
                    swapAnimatedEmojiDrawable.setBounds(this.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + dp8, this.nameLeft - AndroidUtilities.dp(2.0f), dp8 + AndroidUtilities.dp(16.0f));
                    this.botVerification.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                    this.botVerification.draw(canvas2);
                }
            }
            boolean z22 = !this.drawUnmute || this.dialogMuted || this.isHiddenInCommunity;
            if (this.dialogsType != i14 || ((!z22 && this.dialogMutedProgress <= 0.0f) || this.drawVerified || this.drawScam != 0)) {
                i7 = 17;
            } else {
                if (z22) {
                    float f27 = this.dialogMutedProgress;
                    if (f27 != f4) {
                        float f28 = f27 + 0.10666667f;
                        this.dialogMutedProgress = f28;
                        if (f28 > f4) {
                            this.dialogMutedProgress = f4;
                        } else {
                            invalidate();
                        }
                        float dp9 = (!this.drawPremium ? this.nameMutedIconLeft : this.nameMuteLeft) - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                        float dp10 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            dp10 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                        }
                        BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp9, dp10);
                        BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp9, dp10);
                        i7 = 17;
                        DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                        if (this.dialogMutedProgress != f4) {
                            canvas.save();
                            float f29 = this.dialogMutedProgress;
                            canvas2.scale(f29, f29, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
                            if (this.isHiddenInCommunity) {
                                Theme.dialogs_hiddenDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_hiddenDrawable.draw(canvas2);
                                Theme.dialogs_hiddenDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                            } else if (this.drawUnmute) {
                                Theme.dialogs_unmuteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_unmuteDrawable.draw(canvas2);
                                Theme.dialogs_unmuteDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                            } else {
                                Theme.dialogs_muteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_muteDrawable.draw(canvas2);
                                Theme.dialogs_muteDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                            }
                            canvas.restore();
                        } else if (this.isHiddenInCommunity) {
                            Theme.dialogs_hiddenDrawable.draw(canvas2);
                        } else if (this.drawUnmute) {
                            Theme.dialogs_unmuteDrawable.draw(canvas2);
                        } else {
                            Theme.dialogs_muteDrawable.draw(canvas2);
                        }
                    }
                }
                if (!z22) {
                    float f30 = this.dialogMutedProgress;
                    if (f30 != 0.0f) {
                        float f31 = f30 - 0.10666667f;
                        this.dialogMutedProgress = f31;
                        if (f31 < 0.0f) {
                            this.dialogMutedProgress = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                float dp92 = (!this.drawPremium ? this.nameMutedIconLeft : this.nameMuteLeft) - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                float dp102 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                if (!this.useForceThreeLines) {
                    dp102 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                    BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp92, dp102);
                    BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp92, dp102);
                    i7 = 17;
                    DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                    if (this.dialogMutedProgress != f4) {
                    }
                }
                dp102 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp92, dp102);
                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp92, dp102);
                i7 = 17;
                DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                if (this.dialogMutedProgress != f4) {
                }
            }
            if (this.drawVerified) {
                float dp11 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp11 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft - AndroidUtilities.dp(f4), dp11);
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft - AndroidUtilities.dp(f4), dp11);
                Theme.dialogs_verifiedDrawable.draw(canvas2);
                Theme.dialogs_verifiedCheckDrawable.draw(canvas2);
            } else if (this.drawPremium) {
                int dp12 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp12 -= AndroidUtilities.dp(9.0f);
                }
                if (this.emojiStatus != null) {
                    this.emojiStatusView.setTranslationX((f10 + this.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                    this.emojiStatusView.setTranslationY((f6 + dp12) - AndroidUtilities.dp(4.0f));
                    if (this.rightFragmentOpenedProgress > 0.0f) {
                        this.emojiStatus.setBounds(this.nameMuteLeft - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(4.0f), this.nameMuteLeft + AndroidUtilities.dp(20.0f), (dp12 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(22.0f));
                        this.emojiStatus.draw(canvas2);
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    this.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                    z = z7;
                    if (!this.drawReorder || this.reorderIconProgress != 0.0f) {
                        if (!LocaleController.isRTL) {
                            Paint paintReorderGradient = getPaintReorderGradient();
                            paintReorderGradient.setAlpha((int) (this.reorderIconProgress * 255.0f));
                            canvas.save();
                            canvas2.translate(this.pinLeft - AndroidUtilities.dp(24.0f), this.pinTop);
                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth() - (this.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient);
                            canvas.restore();
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas2);
                    }
                    float floatValue2222 = this.animatorPollVotesMentionVisible.getFloatValue();
                    if (!this.drawError) {
                        Theme.dialogs_errorDrawable.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                        this.rect.set(this.errorLeft, this.errorTop, r2 + AndroidUtilities.dp(20.666f), this.errorTop + AndroidUtilities.dp(20.666f));
                        RectF rectF6 = this.rect;
                        float f32 = AndroidUtilities.density * 10.5f;
                        canvas2.drawRoundRect(rectF6, f32, f32, Theme.dialogs_errorPaint);
                        BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, this.errorLeft + AndroidUtilities.dp(4.5f), this.errorTop + AndroidUtilities.dp(5.0f));
                        Theme.dialogs_errorDrawable.draw(canvas2);
                    } else if (((this.drawCount || this.drawMention) && this.drawCount2) || this.countChangeProgress != f4 || this.drawReactionMention || this.reactionsMentionsChangeProgress != f4 || this.drawPollVotesMention || floatValue2222 > 0.0f) {
                        boolean isCounterMuted2 = isCounterMuted();
                        drawCounter(canvas, isCounterMuted2, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                        if (this.drawMention) {
                            Theme.dialogs_countPaint.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                            if (this.mentionLayout != null) {
                                this.rect.set(this.mentionLeft, this.countTop, r1 + this.mentionWidth + AndroidUtilities.dp(12.666f), this.countTop + AndroidUtilities.dp(20.666f));
                                Paint paint3 = (!isCounterMuted2 || this.folderId == 0) ? Theme.dialogs_countPaint : Theme.dialogs_countGrayPaint;
                                RectF rectF7 = this.rect;
                                canvas2.drawRoundRect(rectF7, rectF7.height() / 2.0f, this.rect.height() / 2.0f, paint3);
                                Theme.dialogs_countTextPaint2.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                                canvas.save();
                                canvas2.translate(this.mentionLeft + AndroidUtilities.dp(6.333f), this.countTop + AndroidUtilities.dp(4.0f));
                                this.mentionLayout.draw(canvas2);
                                canvas.restore();
                            } else {
                                Drawable drawable6 = Theme.dialogs_mentionDrawable;
                                drawable6.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                                DrawableUtils.setBounds(drawable6, this.mentionLeft + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i7);
                                drawable6.draw(canvas2);
                            }
                        }
                        if (this.drawReactionMention || this.reactionsMentionsChangeProgress != f4) {
                            this.rect.set(this.reactionMentionLeft, this.countTop, AndroidUtilities.dp(20.666f) + r1, this.countTop + AndroidUtilities.dp(20.666f));
                            float f33 = this.reactionsMentionsChangeProgress;
                            if (f33 == f4) {
                                f33 = 1.0f;
                            } else if (!this.drawReactionMention) {
                                f33 = f4 - f33;
                            }
                            if (isCounterMuted2) {
                                drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                            } else {
                                drawable = Theme.dialogs_reactionsMentionDrawable;
                            }
                            drawable.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                            DrawableUtils.setBounds(drawable, r1 + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i7);
                            DrawableUtils.drawWithScale(canvas2, drawable, f33);
                        }
                        float f34 = !this.drawPollVotesMention ? 0.0f : 0.0f;
                        if (floatValue2222 != f34) {
                            this.rect.set(this.pollVotesMentionLeft, this.countTop, AndroidUtilities.dp(20.666f) + r1, this.countTop + AndroidUtilities.dp(20.666f));
                            if (isCounterMuted2) {
                                drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                            } else {
                                drawable2 = Theme.dialogs_pollMentionDrawable;
                            }
                            drawable2.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                            DrawableUtils.setBounds(drawable2, r1 + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i7);
                            DrawableUtils.drawWithScale(canvas2, drawable2, floatValue2222);
                        }
                    } else if (this.openBot) {
                        canvas.save();
                        float scale = this.openButtonBounce.getScale(0.05f);
                        canvas2.scale(scale, scale, this.openButtonRect.centerX(), this.openButtonRect.centerY());
                        this.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                        RectF rectF8 = this.openButtonRect;
                        canvas2.drawRoundRect(rectF8, rectF8.height() / 2.0f, this.openButtonRect.height() / 2.0f, this.openButtonBackgroundPaint);
                        Text text = this.openButtonText;
                        if (text != null) {
                            text.draw(canvas, AndroidUtilities.dp(13.0f) + this.openButtonRect.left, this.openButtonRect.centerY(), Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider), 1.0f);
                        }
                        canvas.restore();
                    }
                    if (this.thumbsCount > 0) {
                        float f35 = this.updateHelper.typingProgres;
                        if (f35 != f4) {
                            if (f35 > 0.0f) {
                                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((f4 - f35) * 255.0f), 31);
                                if (this.updateHelper.typingOutToTop) {
                                    dp = -AndroidUtilities.dp(14.0f);
                                    f13 = this.updateHelper.typingProgres;
                                } else {
                                    dp = AndroidUtilities.dp(14.0f);
                                    f13 = this.updateHelper.typingProgres;
                                }
                                canvas2.translate(0.0f, dp * f13);
                            }
                            int i36 = 0;
                            while (i36 < this.thumbsCount) {
                                if (this.thumbImageSeen[i36]) {
                                    if (this.thumbBackgroundPaint == null) {
                                        Paint paint4 = new Paint(i9);
                                        this.thumbBackgroundPaint = paint4;
                                        paint4.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                        this.thumbBackgroundPaint.setColor(z6 ? 1 : 0);
                                    }
                                    RectF rectF9 = AndroidUtilities.rectTmp;
                                    rectF9.set(this.thumbImage[i36].getImageX(), this.thumbImage[i36].getImageY(), this.thumbImage[i36].getImageX2(), this.thumbImage[i36].getImageY2());
                                    this.thumbImage[i36].draw(canvas2);
                                    if (this.drawSpoiler[i36]) {
                                        Path path = this.thumbPath;
                                        if (path == null) {
                                            this.thumbPath = new Path();
                                        } else {
                                            path.rewind();
                                        }
                                        this.thumbPath.addRoundRect(rectF9, this.thumbImage[i36].getRoundRadius()[z6 ? 1 : 0], this.thumbImage[i36].getRoundRadius()[i9], Path.Direction.CW);
                                        canvas.save();
                                        canvas2.clipPath(this.thumbPath);
                                        if (this.thumbSpoiler == null) {
                                            this.thumbSpoiler = new SpoilerEffect();
                                        }
                                        this.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i13) * 0.325f)));
                                        this.thumbSpoiler.setBounds((int) this.thumbImage[i36].getImageX(), (int) this.thumbImage[i36].getImageY(), (int) this.thumbImage[i36].getImageX2(), (int) this.thumbImage[i36].getImageY2());
                                        this.thumbSpoiler.draw(canvas2);
                                        invalidate();
                                        canvas.restore();
                                    }
                                    if (this.drawPlay[i36]) {
                                        BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (this.thumbImage[i36].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (this.thumbImage[i36].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)));
                                        Theme.dialogs_playDrawable.draw(canvas2);
                                        i36 += i9;
                                        i13 = -1;
                                    }
                                }
                                i36 += i9;
                                i13 = -1;
                            }
                            i18 = -1;
                            i8 = 2;
                            if (this.updateHelper.typingProgres > 0.0f) {
                                canvas.restore();
                            }
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null && !dialogCellTags.isEmpty()) {
                                canvas.save();
                                canvas2.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                                this.tags.draw(canvas2, this.tagsRight - this.tagsLeft);
                                canvas.restore();
                            }
                            i19 = i12;
                            if (i19 != i18) {
                                canvas2.restoreToCount(i19);
                            }
                            z2 = z5;
                            r10 = z6;
                        }
                    }
                    i18 = -1;
                    i8 = 2;
                    dialogCellTags = this.tags;
                    if (dialogCellTags != null) {
                        canvas.save();
                        canvas2.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                        this.tags.draw(canvas2, this.tagsRight - this.tagsLeft);
                        canvas.restore();
                    }
                    i19 = i12;
                    if (i19 != i18) {
                    }
                    z2 = z5;
                    r10 = z6;
                } else {
                    Drawable drawable7 = PremiumGradient.getInstance().premiumStarDrawableMini;
                    int dp13 = this.nameMuteLeft - AndroidUtilities.dp(f4);
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f18 = 15.5f;
                    }
                    BaseCell.setDrawableBounds(drawable7, dp13, AndroidUtilities.dp(f18));
                    drawable7.draw(canvas2);
                }
            } else if (this.drawScam != 0) {
                int dp14 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.0f : 15.0f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp14 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds((Drawable) (this.drawScam == i9 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable), this.nameMuteLeft, dp14);
                (this.drawScam == i9 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).draw(canvas2);
            }
            z = false;
            if (!this.drawReorder) {
            }
            if (!LocaleController.isRTL) {
            }
            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
            Theme.dialogs_reorderDrawable.draw(canvas2);
            float floatValue22222 = this.animatorPollVotesMentionVisible.getFloatValue();
            if (!this.drawError) {
            }
            if (this.thumbsCount > 0) {
            }
            i18 = -1;
            i8 = 2;
            dialogCellTags = this.tags;
            if (dialogCellTags != null) {
            }
            i19 = i12;
            if (i19 != i18) {
            }
            z2 = z5;
            r10 = z6;
        } else {
            canvas2 = canvas;
            r10 = 0;
            i7 = 17;
            i8 = 2;
            i9 = 1;
            z = false;
            z2 = false;
        }
        if (this.animatingArchiveAvatar) {
            canvas.save();
            float interpolation3 = this.interpolator.getInterpolation(this.animatingArchiveAvatarProgress / 170.0f) + f4;
            canvas2.scale(interpolation3, interpolation3, this.avatarImage.getCenterX(), this.avatarImage.getCenterY());
        }
        if (this.drawAvatar && (!this.isTopic || (tL_forumTopic2 = this.forumTopic) == null || tL_forumTopic2.id != i9 || (pullForegroundDrawable = this.archivedChatsDrawable) == null || !pullForegroundDrawable.isDraw())) {
            if (!this.drawMonoforumAvatar) {
                if (this.bubbleClip == null) {
                    this.bubbleClip = new PhotoBubbleClip();
                }
                this.bubbleClip.setBounds((int) this.storyParams.originalAvatarRect.centerX(), (int) this.storyParams.originalAvatarRect.centerY(), (int) (this.storyParams.originalAvatarRect.width() / 2.0f));
                canvas.save();
                canvas2.clipPath(this.bubbleClip);
                this.avatarImage.setImageCoords(this.storyParams.originalAvatarRect);
                this.avatarImage.draw(canvas2);
                canvas.restore();
            } else if (this.drawCommunityAvatar) {
                DrawableUtils.setBounds(this.avatarImage, this.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dpf2(f4), this.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), 17);
                DrawableUtils.drawCommunityCardDrawable(canvas2, Theme.dialogs_communityCardsDrawable, this.avatarImage.getCenterX(), this.avatarImage.getCenterY(), AndroidUtilities.dp(48.0f));
                this.avatarImage.draw(canvas2);
            } else {
                StoriesUtilities.AvatarStoryParams avatarStoryParams = this.storyParams;
                boolean z23 = this.isShareToStoryCell;
                avatarStoryParams.drawHiddenStoriesAsSegments = z23 || this.currentDialogFolderId != 0;
                int i37 = avatarStoryParams.forceState;
                if (z23) {
                    avatarStoryParams.forceState = i9;
                }
                StoriesUtilities.drawAvatarWithStory(this.currentDialogId, canvas2, this.avatarImage, avatarStoryParams);
                if (this.storyParams.drawnLive) {
                    checkTtl();
                }
                this.storyParams.forceState = i37;
            }
            if (!this.insideCommunityList && ((((chat = this.chat) != null && chat.linked_community_id != 0) || ((user = this.user) != null && user.linked_community_id != 0)) && !this.drawCommunityAvatar && this.isDialogCell && !isDialogFolder())) {
                float centerX2 = this.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                float centerY2 = this.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                if (this.communityArrowDrawable == null) {
                    this.communityArrowDrawable = new CommunityArrowDrawable();
                }
                DrawableUtils.setBounds(this.communityArrowDrawable, centerX2, centerY2, i7);
                canvas2.drawCircle(this.communityArrowDrawable.getBounds().exactCenterX(), this.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
                this.communityArrowDrawable.draw(canvas2);
            }
        }
        if (this.animatingArchiveAvatar) {
            canvas.restore();
        }
        boolean z24 = (this.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) ? z2 : true;
        if (this.rightFragmentOpenedProgress > 0.0f && this.currentDialogFolderId == 0) {
            boolean isCounterMuted3 = isCounterMuted();
            RectF rectF42 = this.storyParams.originalAvatarRect;
            int width22 = (int) (((rectF42.left + rectF42.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
            RectF rectF52 = this.storyParams.originalAvatarRect;
            drawCounter(canvas, isCounterMuted3, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width22, (int) (((rectF52.left + rectF52.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
        }
        if (this.collapseOffset != 0.0f) {
            canvas.restore();
        }
        if (this.translationX != 0.0f) {
            canvas.restore();
        }
        if (this.drawArchive && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == i9)) && this.translationX == 0.0f && this.archivedChatsDrawable != null)) {
            canvas.save();
            canvas2.translate(0.0f, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
            canvas2.clipRect(0.0f, getMeasuredHeight() * (f4 - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas2);
            canvas.restore();
        }
        if (this.useSeparator) {
            int dp15 = (this.fullSeparator || !(this.currentDialogFolderId == 0 || !this.archiveHidden || this.fullSeparator2) || (this.fullSeparator2 && !this.archiveHidden)) ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
            if (this.rightFragmentOpenedProgress != f4) {
                int alpha4 = Theme.dividerPaint.getAlpha();
                float f36 = this.rightFragmentOpenedProgress;
                if (f36 != 0.0f) {
                    Theme.dividerPaint.setAlpha((int) (alpha4 * (f4 - f36)));
                }
                float measuredHeight3 = (getMeasuredHeight() - i9) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight3, getMeasuredWidth() - dp15, measuredHeight3, Theme.dividerPaint);
                } else {
                    canvas.drawLine(dp15, measuredHeight3, getMeasuredWidth(), measuredHeight3, Theme.dividerPaint);
                }
                f7 = 0.0f;
                if (this.rightFragmentOpenedProgress != 0.0f) {
                    Theme.dividerPaint.setAlpha(alpha4);
                }
                if (this.clipProgress != f7) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.topClip * this.clipProgress, Theme.dialogs_pinnedPaint);
                        canvas.drawRect(0.0f, getMeasuredHeight() - ((int) (this.bottomClip * this.clipProgress)), getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                    }
                }
                if (z10) {
                    float f37 = f4 - pullProgress;
                    int measuredHeight4 = (int) (getMeasuredHeight() * f37);
                    int color13 = Theme.getColor(Theme.key_windowBackgroundWhite);
                    if (this.archiveFadeGradientDrawable == null) {
                        this.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                    }
                    if (this.archiveFadeGradientDrawableColor != color13) {
                        this.archiveFadeGradientDrawableColor = color13;
                        this.archiveFadeGradientDrawable.setColors(new int[]{color13, 16777215 & color13});
                    }
                    float clamp2 = MathUtils.clamp((f37 - 0.05f) * 10.0f, 0.0f, f4);
                    this.archiveFadeGradientDrawable.setBounds(r10, measuredHeight4, getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight4);
                    this.archiveFadeGradientDrawable.setAlpha((int) (clamp2 * 255.0f));
                    this.archiveFadeGradientDrawable.draw(canvas2);
                    canvas.restore();
                }
                z3 = this.drawReorder;
                if (!z3 || this.reorderIconProgress != 0.0f) {
                    if (!z3) {
                        float f38 = this.reorderIconProgress;
                        if (f38 < f4) {
                            float f39 = f38 + 0.09411765f;
                            this.reorderIconProgress = f39;
                            if (f39 > f4) {
                                this.reorderIconProgress = f4;
                            }
                            f8 = 0.0f;
                        }
                    } else {
                        float f40 = this.reorderIconProgress;
                        f8 = 0.0f;
                        if (f40 > 0.0f) {
                            float f41 = f40 - 0.09411765f;
                            this.reorderIconProgress = f41;
                            if (f41 < 0.0f) {
                                this.reorderIconProgress = 0.0f;
                            }
                        }
                        if (!this.archiveHidden) {
                            float f42 = this.archiveBackgroundProgress;
                            if (f42 > f8) {
                                float f43 = f42 - 0.069565214f;
                                this.archiveBackgroundProgress = f43;
                                if (f43 < f8) {
                                    this.archiveBackgroundProgress = f8;
                                }
                                if (this.avatarDrawable.getAvatarType() == i8) {
                                    this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                                }
                                z4 = true;
                            }
                            z4 = z24;
                        } else {
                            float f44 = this.archiveBackgroundProgress;
                            if (f44 < f4) {
                                float f45 = f44 + 0.069565214f;
                                this.archiveBackgroundProgress = f45;
                                if (f45 > f4) {
                                    this.archiveBackgroundProgress = f4;
                                }
                                if (this.avatarDrawable.getAvatarType() == i8) {
                                    this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                                }
                                z4 = true;
                            }
                            z4 = z24;
                        }
                        if (this.animatingArchiveAvatar) {
                            float f46 = this.animatingArchiveAvatarProgress + 16.0f;
                            this.animatingArchiveAvatarProgress = f46;
                            if (f46 >= 170.0f) {
                                this.animatingArchiveAvatarProgress = 170.0f;
                                this.animatingArchiveAvatar = r10;
                            }
                            z4 = true;
                        }
                        if (!this.drawRevealBackground) {
                            float f47 = this.currentRevealBounceProgress;
                            if (f47 < f4) {
                                float f48 = f47 + 0.09411765f;
                                this.currentRevealBounceProgress = f48;
                                if (f48 > f4) {
                                    this.currentRevealBounceProgress = f4;
                                    z4 = true;
                                }
                            }
                            float f49 = this.currentRevealProgress;
                            if (f49 < f4) {
                                float f50 = f49 + 0.053333335f;
                                this.currentRevealProgress = f50;
                                if (f50 > f4) {
                                    this.currentRevealProgress = f4;
                                }
                                z4 = true;
                            }
                            this.emojiStatusView.setVisibility(!z ? 0 : 4);
                            if (z4) {
                                return;
                            }
                            invalidate();
                            return;
                        }
                        if (this.currentRevealBounceProgress == f4) {
                            f9 = 0.0f;
                            this.currentRevealBounceProgress = 0.0f;
                            z4 = true;
                        } else {
                            f9 = 0.0f;
                        }
                        float f51 = this.currentRevealProgress;
                        if (f51 > f9) {
                            float f52 = f51 - 0.053333335f;
                            this.currentRevealProgress = f52;
                            if (f52 < f9) {
                                this.currentRevealProgress = f9;
                            }
                            z4 = true;
                        }
                        this.emojiStatusView.setVisibility(!z ? 0 : 4);
                        if (z4) {
                        }
                    }
                    z24 = true;
                    if (!this.archiveHidden) {
                    }
                    if (this.animatingArchiveAvatar) {
                    }
                    if (!this.drawRevealBackground) {
                    }
                }
                f8 = 0.0f;
                if (!this.archiveHidden) {
                }
                if (this.animatingArchiveAvatar) {
                }
                if (!this.drawRevealBackground) {
                }
            }
        }
        f7 = 0.0f;
        if (this.clipProgress != f7) {
        }
        if (z10) {
        }
        z3 = this.drawReorder;
        if (!z3) {
        }
        if (!z3) {
        }
        z24 = true;
        if (!this.archiveHidden) {
        }
        if (this.animatingArchiveAvatar) {
        }
        if (!this.drawRevealBackground) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDraw$2() {
        DialogCellDelegate dialogCellDelegate = this.delegate;
        if (dialogCellDelegate != null) {
            dialogCellDelegate.onButtonClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDraw$3() {
        DialogCellDelegate dialogCellDelegate = this.delegate;
        if (dialogCellDelegate != null) {
            dialogCellDelegate.onButtonLongPress(this);
        }
    }

    private TextPaint getTimeTextPaint() {
        return this.drawCount ? isCounterMuted() ? Theme.dialogs_timePaintBold : Theme.dialogs_timePaintBoldAccent : Theme.dialogs_timePaint;
    }

    private boolean isCounterMuted() {
        if (isDialogCommunity()) {
            return !this.hasUnmutedCommunityDialogs;
        }
        if (this.isTopic) {
            return this.topicMuted;
        }
        TLRPC.Chat chat = this.chat;
        return (chat != null && chat.forum && this.forumTopic == null) ? !this.hasUnmutedTopics : this.dialogMuted;
    }

    private Paint getPaintReorderGradient() {
        int color = Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider);
        if (this.reorderGradientLastColor != color || this.reorderGradientPaint == null) {
            this.reorderGradientLastColor = color;
            if (this.reorderGradientPaint == null) {
                this.reorderGradientPaint = new Paint(1);
            }
            this.reorderGradientPaint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, color}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.reorderGradientPaint;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x023a, code lost:
    
        if (r3 > 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027a  */
    @Override // org.telegram.ui.Stories.StoriesListPlaceProvider.AvatarOverlaysView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawAvatarOverlays(Canvas canvas) {
        boolean z;
        int dp;
        float dp2;
        float dp3;
        float dp4;
        float f;
        float dp5;
        float dp6;
        float f2;
        float dp7;
        float dp8;
        float f3;
        float dp9;
        float dp10;
        float f4;
        float f5;
        boolean z2;
        boolean z3;
        float dp11;
        float dp12;
        CheckBox2 checkBox2;
        TLRPC.Chat chat = this.chat;
        if (chat == null || (chat.flags2 & 2048) == 0) {
            z = false;
        } else {
            float imageY2 = this.avatarImage.getImageY2();
            float imageX2 = this.avatarImage.getImageX2();
            CheckBox2 checkBox22 = this.checkBox;
            float progress = (checkBox22 == null || !checkBox22.isChecked()) ? 1.0f : 1.0f - this.checkBox.getProgress();
            if (this.starBg == null) {
                this.starBg = getContext().getResources().getDrawable(R.drawable.star_small_outline).mutate();
            }
            int color = Theme.getColor(Theme.key_windowBackgroundWhite);
            if (this.starBgColor != color) {
                Drawable drawable = this.starBg;
                this.starBgColor = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            if (this.starFg == null) {
                this.starFg = getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate();
            }
            int dp13 = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i = (int) imageX2;
            int i2 = (int) imageY2;
            int i3 = i2 - dp13;
            rect.set((AndroidUtilities.dp(1.66f) + i) - dp13, i3, AndroidUtilities.dp(1.66f) + i, i2);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.starBg.setBounds(rect);
            int i4 = (int) (progress * 255.0f);
            this.starBg.setAlpha(i4);
            this.starBg.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i) - dp13, i3, i + AndroidUtilities.dp(1.66f), i2);
            this.starFg.setBounds(rect);
            this.starFg.setAlpha(i4);
            this.starFg.draw(canvas);
            z = true;
        }
        float f6 = this.premiumBlockedT.set(this.premiumBlocked && !z);
        float f7 = 10.0f;
        if (f6 > 0.0f) {
            float centerY = this.avatarImage.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.avatarImage.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * f6, Theme.dialogs_onlineCirclePaint);
            if (this.premiumGradient == null) {
                this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, this.resourcesProvider);
            }
            this.premiumGradient.gradientMatrix((int) (centerX - AndroidUtilities.dp(10.0f)), (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), (int) (AndroidUtilities.dp(10.0f) + centerY), 0.0f, 0.0f);
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * f6, this.premiumGradient.paint);
            if (this.lockDrawable == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.lockDrawable.setBounds((int) (centerX - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * f6)), (int) (centerY - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f6)), (int) (centerX + ((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f6)), (int) (centerY + ((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f6)));
            this.lockDrawable.setAlpha((int) (f6 * 255.0f));
            this.lockDrawable.draw(canvas);
            canvas.restore();
            return false;
        }
        if (!this.isDialogCell || this.currentDialogFolderId != 0 || z) {
            return false;
        }
        boolean z4 = (this.ttlPeriod <= 0 || isOnline() || this.hasCall || this.storyParams.drawnLive) ? false : true;
        this.showTtl = z4;
        if (this.rightFragmentOpenedProgress != 1.0f && (z4 || this.ttlProgress > 0.0f)) {
            TimerDrawable timerDrawable = this.timerDrawable;
            if (timerDrawable != null) {
                int time = timerDrawable.getTime();
                int i5 = this.ttlPeriod;
                if (time != i5) {
                }
                if (this.timerPaint == null) {
                    this.timerPaint = new Paint(1);
                    Paint paint = new Paint(1);
                    this.timerPaint2 = paint;
                    paint.setColor(838860800);
                }
                int imageY22 = (int) (this.avatarImage.getImageY2() - AndroidUtilities.dp(9.0f));
                if (!LocaleController.isRTL) {
                    dp12 = this.storyParams.originalAvatarRect.left + AndroidUtilities.dp(9.0f);
                } else {
                    dp12 = this.storyParams.originalAvatarRect.right - AndroidUtilities.dp(9.0f);
                }
                int i6 = (int) dp12;
                this.timerDrawable.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
                this.timerDrawable.setTime(this.ttlPeriod);
                if (!this.avatarImage.updateThumbShaderMatrix()) {
                    ImageReceiver imageReceiver = this.avatarImage;
                    BitmapShader bitmapShader = imageReceiver.thumbShader;
                    if (bitmapShader != null) {
                        this.timerPaint.setShader(bitmapShader);
                    } else {
                        BitmapShader bitmapShader2 = imageReceiver.staticThumbShader;
                        if (bitmapShader2 != null) {
                            this.timerPaint.setShader(bitmapShader2);
                        }
                    }
                } else {
                    this.timerPaint.setShader(null);
                    if (this.avatarImage.getBitmap() != null && !this.avatarImage.getBitmap().isRecycled()) {
                        this.timerPaint.setColor(AndroidUtilities.getDominantColor(this.avatarImage.getBitmap()));
                    } else if (this.avatarImage.getDrawable() instanceof VectorAvatarThumbDrawable) {
                        this.timerPaint.setColor(((VectorAvatarThumbDrawable) this.avatarImage.getDrawable()).gradientTools.getAverageColor());
                    } else {
                        this.timerPaint.setColor(this.avatarDrawable.getColor2());
                    }
                }
                canvas.save();
                float f8 = this.ttlProgress * (1.0f - this.rightFragmentOpenedProgress);
                checkBox2 = this.checkBox;
                if (checkBox2 != null) {
                    f8 *= 1.0f - checkBox2.getProgress();
                }
                float f9 = i6;
                float f10 = imageY22;
                canvas.scale(f8, f8, f9, f10);
                canvas.drawCircle(f9, f10, AndroidUtilities.dpf2(11.0f), this.timerPaint);
                canvas.drawCircle(f9, f10, AndroidUtilities.dpf2(11.0f), this.timerPaint2);
                canvas.save();
                canvas.translate(f9 - AndroidUtilities.dpf2(11.0f), f10 - AndroidUtilities.dpf2(11.0f));
                this.timerDrawable.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            this.timerDrawable = TimerDrawable.getTtlIconForDialogs(this.ttlPeriod);
            if (this.timerPaint == null) {
            }
            int imageY222 = (int) (this.avatarImage.getImageY2() - AndroidUtilities.dp(9.0f));
            if (!LocaleController.isRTL) {
            }
            int i62 = (int) dp12;
            this.timerDrawable.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.timerDrawable.setTime(this.ttlPeriod);
            if (!this.avatarImage.updateThumbShaderMatrix()) {
            }
            canvas.save();
            float f82 = this.ttlProgress * (1.0f - this.rightFragmentOpenedProgress);
            checkBox2 = this.checkBox;
            if (checkBox2 != null) {
            }
            float f92 = i62;
            float f102 = imageY222;
            canvas.scale(f82, f82, f92, f102);
            canvas.drawCircle(f92, f102, AndroidUtilities.dpf2(11.0f), this.timerPaint);
            canvas.drawCircle(f92, f102, AndroidUtilities.dpf2(11.0f), this.timerPaint2);
            canvas.save();
            canvas.translate(f92 - AndroidUtilities.dpf2(11.0f), f102 - AndroidUtilities.dpf2(11.0f));
            this.timerDrawable.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.user;
        if (user != null && !MessagesController.isSupportUser(user) && !this.user.bot) {
            boolean isOnline = isOnline();
            this.wasDrawnOnline = isOnline;
            if (isOnline || this.onlineProgress != 0.0f) {
                int dp14 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    float f11 = this.storyParams.originalAvatarRect.left;
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f7 = 6.0f;
                    }
                    dp11 = f11 + AndroidUtilities.dp(f7);
                } else {
                    float f12 = this.storyParams.originalAvatarRect.right;
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f7 = 6.0f;
                    }
                    dp11 = f12 - AndroidUtilities.dp(f7);
                }
                int i7 = (int) dp11;
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                float f13 = i7;
                float f14 = dp14;
                canvas.drawCircle(f13, f14, AndroidUtilities.dp(7.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                canvas.drawCircle(f13, f14, AndroidUtilities.dp(5.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
                if (isOnline) {
                    float f15 = this.onlineProgress;
                    if (f15 < 1.0f) {
                        float f16 = f15 + 0.10666667f;
                        this.onlineProgress = f16;
                        if (f16 > 1.0f) {
                            this.onlineProgress = 1.0f;
                        }
                        z2 = true;
                    }
                } else {
                    float f17 = this.onlineProgress;
                    if (f17 > 0.0f) {
                        float f18 = f17 - 0.10666667f;
                        this.onlineProgress = f18;
                        if (f18 < 0.0f) {
                            this.onlineProgress = 0.0f;
                        }
                        z2 = true;
                    }
                }
                if (this.showTtl) {
                }
                this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                return z3;
            }
            z2 = false;
            if (this.showTtl) {
            }
            this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
            return z3;
        }
        TLRPC.Chat chat2 = this.chat;
        if (chat2 != null) {
            boolean z5 = chat2.call_active && chat2.call_not_empty;
            this.hasCall = z5;
            if ((z5 || this.chatCallProgress != 0.0f) && this.rightFragmentOpenedProgress < 1.0f) {
                CheckBox2 checkBox23 = this.checkBox;
                float progress2 = (checkBox23 == null || !checkBox23.isChecked()) ? 1.0f : 1.0f - this.checkBox.getProgress();
                int dp15 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    dp = (int) (this.storyParams.originalAvatarRect.left + AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 6.0f));
                } else {
                    dp = (int) (this.storyParams.originalAvatarRect.right - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 6.0f));
                }
                if (this.rightFragmentOpenedProgress != 0.0f) {
                    canvas.save();
                    float f19 = 1.0f - this.rightFragmentOpenedProgress;
                    canvas.scale(f19, f19, dp, dp15);
                }
                Paint paint2 = Theme.dialogs_onlineCirclePaint;
                int i8 = Theme.key_windowBackgroundWhite;
                paint2.setColor(Theme.getColor(i8, this.resourcesProvider));
                float f20 = dp;
                float f21 = dp15;
                canvas.drawCircle(f20, f21, AndroidUtilities.dp(11.0f) * this.chatCallProgress * progress2, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                canvas.drawCircle(f20, f21, AndroidUtilities.dp(9.0f) * this.chatCallProgress * progress2, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(i8, this.resourcesProvider));
                if (!LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                    this.innerProgress = 0.65f;
                }
                int i9 = this.progressStage;
                if (i9 == 0) {
                    dp2 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.innerProgress);
                    dp9 = AndroidUtilities.dp(3.0f);
                    dp10 = AndroidUtilities.dp(2.0f);
                    f4 = this.innerProgress;
                } else {
                    if (i9 == 1) {
                        dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                        dp7 = AndroidUtilities.dp(1.0f);
                        dp8 = AndroidUtilities.dp(4.0f);
                        f3 = this.innerProgress;
                    } else {
                        if (i9 == 2) {
                            dp2 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(2.0f) * this.innerProgress);
                            dp5 = AndroidUtilities.dp(5.0f);
                            dp6 = AndroidUtilities.dp(4.0f);
                            f2 = this.innerProgress;
                        } else {
                            if (i9 == 3) {
                                dp2 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.innerProgress);
                                dp3 = AndroidUtilities.dp(1.0f);
                                dp4 = AndroidUtilities.dp(2.0f);
                                f = this.innerProgress;
                            } else if (i9 == 4) {
                                dp2 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                dp9 = AndroidUtilities.dp(3.0f);
                                dp10 = AndroidUtilities.dp(2.0f);
                                f4 = this.innerProgress;
                            } else if (i9 == 5) {
                                dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                dp7 = AndroidUtilities.dp(1.0f);
                                dp8 = AndroidUtilities.dp(4.0f);
                                f3 = this.innerProgress;
                            } else if (i9 == 6) {
                                dp2 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                dp5 = AndroidUtilities.dp(5.0f);
                                dp6 = AndroidUtilities.dp(4.0f);
                                f2 = this.innerProgress;
                            } else {
                                dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                dp3 = AndroidUtilities.dp(1.0f);
                                dp4 = AndroidUtilities.dp(2.0f);
                                f = this.innerProgress;
                            }
                            f5 = dp3 + (dp4 * f);
                            if (this.chatCallProgress >= 1.0f || progress2 < 1.0f) {
                                canvas.save();
                                float f22 = this.chatCallProgress * progress2;
                                canvas.scale(f22, f22, f20, f21);
                            }
                            this.rect.set(dp - AndroidUtilities.dp(1.0f), f21 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f21);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            float f23 = f21 - f5;
                            float f24 = f21 + f5;
                            this.rect.set(dp - AndroidUtilities.dp(5.0f), f23, dp - AndroidUtilities.dp(3.0f), f24);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            this.rect.set(AndroidUtilities.dp(3.0f) + dp, f23, dp + AndroidUtilities.dp(5.0f), f24);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            if (this.chatCallProgress >= 1.0f || progress2 < 1.0f) {
                                canvas.restore();
                            }
                            if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                                z2 = false;
                            } else {
                                float f25 = this.innerProgress + 0.04f;
                                this.innerProgress = f25;
                                if (f25 >= 1.0f) {
                                    this.innerProgress = 0.0f;
                                    int i10 = this.progressStage + 1;
                                    this.progressStage = i10;
                                    if (i10 >= 8) {
                                        this.progressStage = 0;
                                    }
                                }
                                z2 = true;
                            }
                            if (!this.hasCall) {
                                float f26 = this.chatCallProgress;
                                if (f26 < 1.0f) {
                                    float f27 = f26 + 0.10666667f;
                                    this.chatCallProgress = f27;
                                    if (f27 > 1.0f) {
                                        this.chatCallProgress = 1.0f;
                                    }
                                }
                            } else {
                                float f28 = this.chatCallProgress;
                                if (f28 > 0.0f) {
                                    float f29 = f28 - 0.10666667f;
                                    this.chatCallProgress = f29;
                                    if (f29 < 0.0f) {
                                        this.chatCallProgress = 0.0f;
                                    }
                                }
                            }
                            if (this.rightFragmentOpenedProgress != 0.0f) {
                                canvas.restore();
                            }
                            if (this.showTtl) {
                                float f30 = this.ttlProgress;
                                if (f30 < 1.0f) {
                                    this.ttlProgress = f30 + 0.10666667f;
                                    z3 = true;
                                }
                                z3 = z2;
                            } else {
                                float f31 = this.ttlProgress;
                                if (f31 > 0.0f) {
                                    this.ttlProgress = f31 - 0.10666667f;
                                    z3 = true;
                                }
                                z3 = z2;
                            }
                            this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                            return z3;
                        }
                        f5 = dp5 - (dp6 * f2);
                        if (this.chatCallProgress >= 1.0f) {
                        }
                        canvas.save();
                        float f222 = this.chatCallProgress * progress2;
                        canvas.scale(f222, f222, f20, f21);
                        this.rect.set(dp - AndroidUtilities.dp(1.0f), f21 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f21);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        float f232 = f21 - f5;
                        float f242 = f21 + f5;
                        this.rect.set(dp - AndroidUtilities.dp(5.0f), f232, dp - AndroidUtilities.dp(3.0f), f242);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        this.rect.set(AndroidUtilities.dp(3.0f) + dp, f232, dp + AndroidUtilities.dp(5.0f), f242);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        if (this.chatCallProgress >= 1.0f) {
                        }
                        canvas.restore();
                        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        }
                        if (!this.hasCall) {
                        }
                        if (this.rightFragmentOpenedProgress != 0.0f) {
                        }
                        if (this.showTtl) {
                        }
                        this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                        return z3;
                    }
                    f5 = (dp8 * f3) + dp7;
                    if (this.chatCallProgress >= 1.0f) {
                    }
                    canvas.save();
                    float f2222 = this.chatCallProgress * progress2;
                    canvas.scale(f2222, f2222, f20, f21);
                    this.rect.set(dp - AndroidUtilities.dp(1.0f), f21 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f21);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    float f2322 = f21 - f5;
                    float f2422 = f21 + f5;
                    this.rect.set(dp - AndroidUtilities.dp(5.0f), f2322, dp - AndroidUtilities.dp(3.0f), f2422);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    this.rect.set(AndroidUtilities.dp(3.0f) + dp, f2322, dp + AndroidUtilities.dp(5.0f), f2422);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    if (this.chatCallProgress >= 1.0f) {
                    }
                    canvas.restore();
                    if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                    }
                    if (!this.hasCall) {
                    }
                    if (this.rightFragmentOpenedProgress != 0.0f) {
                    }
                    if (this.showTtl) {
                    }
                    this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                    return z3;
                }
                f5 = dp9 - (dp10 * f4);
                if (this.chatCallProgress >= 1.0f) {
                }
                canvas.save();
                float f22222 = this.chatCallProgress * progress2;
                canvas.scale(f22222, f22222, f20, f21);
                this.rect.set(dp - AndroidUtilities.dp(1.0f), f21 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f21);
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                float f23222 = f21 - f5;
                float f24222 = f21 + f5;
                this.rect.set(dp - AndroidUtilities.dp(5.0f), f23222, dp - AndroidUtilities.dp(3.0f), f24222);
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                this.rect.set(AndroidUtilities.dp(3.0f) + dp, f23222, dp + AndroidUtilities.dp(5.0f), f24222);
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                if (this.chatCallProgress >= 1.0f) {
                }
                canvas.restore();
                if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                }
                if (!this.hasCall) {
                }
                if (this.rightFragmentOpenedProgress != 0.0f) {
                }
                if (this.showTtl) {
                }
                this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                return z3;
            }
        }
        z2 = false;
        if (this.showTtl) {
        }
        this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
        return z3;
    }

    private void drawCounter(Canvas canvas, boolean z, int i, int i2, int i3, float f, boolean z2) {
        Paint paint;
        boolean z3;
        RectF rectF;
        float f2;
        float interpolation;
        RectF rectF2;
        boolean z4 = isForumCell() || isFolderCell();
        if (!(this.drawCount && this.drawCount2) && this.countChangeProgress == 1.0f) {
            return;
        }
        float f3 = (this.unreadCount != 0 || this.markUnread) ? this.countChangeProgress : 1.0f - this.countChangeProgress;
        int i4 = NotificationCenter.didReceiveSmsCode;
        if (z2) {
            if (this.counterPaintOutline == null) {
                Paint paint2 = new Paint();
                this.counterPaintOutline = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.counterPaintOutline.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.counterPaintOutline.setStrokeJoin(Paint.Join.ROUND);
                this.counterPaintOutline.setStrokeCap(Paint.Cap.ROUND);
            }
            this.counterPaintOutline.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_pinnedOverlay), NotificationCenter.didReceiveSmsCode), Color.alpha(r13) / 255.0f));
        }
        if (this.isTopic && this.forumTopic.read_inbox_max_id == 0) {
            if (this.topicCounterPaint == null) {
                this.topicCounterPaint = new Paint();
            }
            paint = this.topicCounterPaint;
            int color = Theme.getColor(z ? Theme.key_topics_unreadCounterMuted : Theme.key_topics_unreadCounter, this.resourcesProvider);
            paint.setColor(color);
            Theme.dialogs_countTextPaint2.setColor(color);
            i4 = z ? 30 : 40;
            z3 = true;
        } else {
            paint = (z || this.currentDialogFolderId != 0) ? Theme.dialogs_countGrayPaint : Theme.dialogs_countPaint;
            z3 = false;
        }
        StaticLayout staticLayout = this.countOldLayout;
        if (staticLayout == null || this.unreadCount == 0) {
            if (this.unreadCount != 0) {
                staticLayout = this.countLayout;
            }
            paint.setAlpha((int) ((1.0f - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
            float f4 = i;
            this.rect.set(i2, f4, this.countWidth + i2 + AndroidUtilities.dp(12.666f), i + AndroidUtilities.dp(20.666f));
            int save = canvas.save();
            if (f != 1.0f) {
                canvas.scale(f, f, this.rect.centerX(), this.rect.centerY());
            }
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, this.rect.centerX(), this.rect.centerY());
            }
            if (z4) {
                if (this.counterPath == null || (rectF = this.counterPathRect) == null || !rectF.equals(this.rect)) {
                    RectF rectF3 = this.counterPathRect;
                    if (rectF3 == null) {
                        this.counterPathRect = new RectF(this.rect);
                    } else {
                        rectF3.set(this.rect);
                    }
                    if (this.counterPath == null) {
                        this.counterPath = new Path();
                    }
                    BubbleCounterPath.addBubbleRect(this.counterPath, this.counterPathRect, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.counterPath, paint);
                if (z2) {
                    canvas.drawPath(this.counterPath, this.counterPaintOutline);
                }
            } else {
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.counterPaintOutline);
                }
            }
            if (staticLayout != null) {
                canvas.save();
                canvas.translate(i2 + AndroidUtilities.dp(6.333f), f4 + AndroidUtilities.dpf2(3.0f));
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((1.0f - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
            float f5 = f3 * 2.0f;
            float f6 = f5 > 1.0f ? 1.0f : f5;
            float f7 = 1.0f - f6;
            float f8 = (i2 * f6) + (i3 * f7);
            float f9 = i;
            this.rect.set(f8, f9, (this.countWidth * f6) + f8 + (this.countWidthOld * f7) + AndroidUtilities.dp(12.666f), i + AndroidUtilities.dp(20.666f));
            if (f3 <= 0.5f) {
                interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f5) * 0.1f;
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
                interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(1.0f - ((f3 - 0.5f) * 2.0f)) * 0.1f;
            }
            float f10 = interpolation + f2;
            canvas.save();
            float f11 = f10 * f;
            canvas.scale(f11, f11, this.rect.centerX(), this.rect.centerY());
            if (z4) {
                if (this.counterPath == null || (rectF2 = this.counterPathRect) == null || !rectF2.equals(this.rect)) {
                    RectF rectF4 = this.counterPathRect;
                    if (rectF4 == null) {
                        this.counterPathRect = new RectF(this.rect);
                    } else {
                        rectF4.set(this.rect);
                    }
                    if (this.counterPath == null) {
                        this.counterPath = new Path();
                    }
                    BubbleCounterPath.addBubbleRect(this.counterPath, this.counterPathRect, AndroidUtilities.dp(10.33f));
                }
                canvas.drawPath(this.counterPath, paint);
                if (z2) {
                    canvas.drawPath(this.counterPath, this.counterPaintOutline);
                }
            } else {
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                if (z2) {
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.counterPaintOutline);
                }
            }
            if (this.countAnimationStableLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f8, AndroidUtilities.dpf2(3.0f) + f9);
                this.countAnimationStableLayout.draw(canvas);
                canvas.restore();
            }
            int alpha = Theme.dialogs_countTextPaint2.getAlpha();
            float f12 = alpha;
            Theme.dialogs_countTextPaint2.setAlpha((int) (f12 * f6));
            if (this.countAnimationInLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f8, ((this.countAnimationIncrement ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f7) + f9 + AndroidUtilities.dpf2(3.0f));
                this.countAnimationInLayout.draw(canvas);
                canvas.restore();
            } else if (this.countLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f8, ((this.countAnimationIncrement ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f7) + f9 + AndroidUtilities.dpf2(3.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countOldLayout != null) {
                Theme.dialogs_countTextPaint2.setAlpha((int) (f12 * f7));
                canvas.save();
                canvas.translate(f8 + AndroidUtilities.dpf2(6.333f), ((this.countAnimationIncrement ? -AndroidUtilities.dp(17.0f) : AndroidUtilities.dp(17.0f)) * f6) + f9 + AndroidUtilities.dpf2(3.0f));
                this.countOldLayout.draw(canvas);
                canvas.restore();
            }
            Theme.dialogs_countTextPaint2.setAlpha(alpha);
            canvas.restore();
        }
        if (z3) {
            Theme.dialogs_countTextPaint2.setColor(Theme.getColor(Theme.key_chats_unreadCounterText));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createStatusDrawableAnimator(int i, int i2) {
        this.statusDrawableProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.statusDrawableAnimator = ofFloat;
        ofFloat.setDuration(220L);
        this.statusDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.animateFromStatusDrawableParams = i;
        this.animateToStatusDrawableParams = i2;
        this.statusDrawableAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DialogCell.this.lambda$createStatusDrawableAnimator$4(valueAnimator);
            }
        });
        this.statusDrawableAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.DialogCell.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i3 = (DialogCell.this.drawClock ? 1 : 0) + (DialogCell.this.drawCheck1 ? 2 : 0) + (DialogCell.this.drawCheck2 ? 4 : 0);
                if (DialogCell.this.animateToStatusDrawableParams == i3) {
                    DialogCell.this.statusDrawableAnimationInProgress = false;
                    DialogCell dialogCell = DialogCell.this;
                    dialogCell.lastStatusDrawableParams = dialogCell.animateToStatusDrawableParams;
                } else {
                    DialogCell dialogCell2 = DialogCell.this;
                    dialogCell2.createStatusDrawableAnimator(dialogCell2.animateToStatusDrawableParams, i3);
                }
                DialogCell.this.invalidate();
            }
        });
        this.statusDrawableAnimationInProgress = true;
        this.statusDrawableAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createStatusDrawableAnimator$4(ValueAnimator valueAnimator) {
        this.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void startOutAnimation() {
        PullForegroundDrawable pullForegroundDrawable = this.archivedChatsDrawable;
        if (pullForegroundDrawable != null) {
            if (this.isTopic) {
                pullForegroundDrawable.outCy = AndroidUtilities.dp(24.0f);
                this.archivedChatsDrawable.outCx = AndroidUtilities.dp(24.0f);
                PullForegroundDrawable pullForegroundDrawable2 = this.archivedChatsDrawable;
                pullForegroundDrawable2.outRadius = 0.0f;
                pullForegroundDrawable2.outImageSize = 0.0f;
            } else {
                pullForegroundDrawable.outCy = this.storyParams.originalAvatarRect.centerY();
                this.archivedChatsDrawable.outCx = this.storyParams.originalAvatarRect.centerX();
                this.archivedChatsDrawable.outRadius = this.storyParams.originalAvatarRect.width() / 2.0f;
                if (MessagesController.getInstance(this.currentAccount).getStoriesController().hasHiddenStories()) {
                    this.archivedChatsDrawable.outRadius -= AndroidUtilities.dpf2(3.5f);
                }
                this.archivedChatsDrawable.outImageSize = this.avatarImage.getBitmapWidth();
            }
            this.archivedChatsDrawable.startOutAnimation();
        }
    }

    public void onReorderStateChanged(boolean z, boolean z2) {
        if ((!getIsPinned() && z) || this.drawReorder == z) {
            if (getIsPinned()) {
                return;
            }
            this.drawReorder = false;
        } else {
            this.drawReorder = z;
            if (z2) {
                this.reorderIconProgress = z ? 0.0f : 1.0f;
            } else {
                this.reorderIconProgress = z ? 1.0f : 0.0f;
            }
            invalidate();
        }
    }

    public void setSliding(boolean z) {
        this.isSliding = z;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.translationDrawable || drawable == Theme.dialogs_archiveAvatarDrawable) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        DialogsActivity dialogsActivity;
        if (i == R.id.acc_action_chat_preview && (dialogsActivity = this.parentFragment) != null) {
            dialogsActivity.showChatPreview(this);
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        PullForegroundDrawable pullForegroundDrawable;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isFolderCell() && (pullForegroundDrawable = this.archivedChatsDrawable) != null && SharedConfig.archiveHidden && pullForegroundDrawable.getPullProgress() == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!isFolderCell() && this.parentFragment != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null || !checkBox2.isChecked()) {
            return;
        }
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb = new StringBuilder();
        String str = this.titleOverride;
        if (str != null) {
            sb.append(str);
            sb.append(". ");
        } else if (this.currentDialogFolderId == 1) {
            sb.append(LocaleController.getString(R.string.ArchivedChats));
            sb.append(". ");
        } else {
            if (this.encryptedChat != null) {
                sb.append(LocaleController.getString(R.string.AccDescrSecretChat));
                sb.append(". ");
            }
            if (this.isTopic && this.forumTopic != null) {
                sb.append(LocaleController.getString(R.string.AccDescrTopic));
                sb.append(". ");
                sb.append(this.forumTopic.title);
                sb.append(". ");
            } else {
                TLRPC.User user2 = this.user;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.user)) {
                        sb.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.user.bot) {
                            sb.append(LocaleController.getString(R.string.Bot));
                            sb.append(". ");
                        }
                        TLRPC.User user3 = this.user;
                        if (user3.self) {
                            sb.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb.append(". ");
                } else {
                    TLRPC.Chat chat = this.chat;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb.append(". ");
                        sb.append(this.chat.title);
                        sb.append(". ");
                    }
                }
            }
        }
        if (this.drawVerified) {
            sb.append(LocaleController.getString(R.string.AccDescrVerified));
            sb.append(". ");
        }
        if (this.dialogMuted) {
            sb.append(LocaleController.getString(R.string.AccDescrNotificationsMuted));
            sb.append(". ");
        }
        if (isOnline()) {
            sb.append(LocaleController.getString(R.string.AccDescrUserOnline));
            sb.append(". ");
        }
        int i = this.unreadCount;
        if (i > 0) {
            sb.append(LocaleController.formatPluralString("NewMessages", i, new Object[0]));
            sb.append(". ");
        }
        int i2 = this.mentionCount;
        if (i2 > 0) {
            sb.append(LocaleController.formatPluralString("AccDescrMentionCount", i2, new Object[0]));
            sb.append(". ");
        }
        if (this.reactionMentionCount > 0) {
            sb.append(LocaleController.getString(R.string.AccDescrMentionReaction));
            sb.append(". ");
        }
        MessageObject messageObject = this.message;
        if (messageObject == null || this.currentDialogFolderId != 0) {
            accessibilityEvent.setContentDescription(sb);
            setContentDescription(sb);
            return;
        }
        int i3 = this.lastMessageDate;
        if (i3 == 0) {
            i3 = messageObject.messageOwner.date;
        }
        String formatDateAudio = LocaleController.formatDateAudio(i3, true);
        if (this.message.isOut()) {
            sb.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio));
        } else {
            sb.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
        }
        sb.append(". ");
        if (this.chat != null && !this.message.isOut() && this.message.isFromUser() && this.message.messageOwner.action == null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.message.messageOwner.from_id.user_id))) != null) {
            sb.append(ContactsController.formatName(user.first_name, user.last_name));
            sb.append(". ");
        }
        if (this.encryptedChat == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.message.messageText);
            if (!this.message.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                if (sb2.length() > 0) {
                    sb2.append(". ");
                }
                sb2.append(captionMessage.caption);
            }
            StaticLayout staticLayout = this.messageLayout;
            int length = staticLayout == null ? -1 : staticLayout.getText().length();
            if (length > 0) {
                int length2 = sb2.length();
                int indexOf = sb2.indexOf("\n", length);
                if (indexOf < length2 && indexOf >= 0) {
                    length2 = indexOf;
                }
                int indexOf2 = sb2.indexOf("\t", length);
                if (indexOf2 < length2 && indexOf2 >= 0) {
                    length2 = indexOf2;
                }
                int indexOf3 = sb2.indexOf(" ", length);
                if (indexOf3 < length2 && indexOf3 >= 0) {
                    length2 = indexOf3;
                }
                sb.append(sb2.substring(0, length2));
            } else {
                sb.append((CharSequence) sb2);
            }
        }
        accessibilityEvent.setContentDescription(sb);
        setContentDescription(sb);
    }

    private MessageObject getCaptionMessage() {
        CharSequence charSequence;
        if (this.groupMessages == null) {
            MessageObject messageObject = this.message;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        MessageObject messageObject2 = null;
        int i = 0;
        for (int i2 = 0; i2 < this.groupMessages.size(); i2++) {
            MessageObject messageObject3 = (MessageObject) this.groupMessages.get(i2);
            if (messageObject3 != null && (charSequence = messageObject3.caption) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i++;
                }
                messageObject2 = messageObject3;
            }
        }
        if (i > 1) {
            return null;
        }
        return messageObject2;
    }

    public void updateMessageThumbs() {
        TLRPC.Message message;
        int i;
        MessageObject messageObject = this.message;
        if (messageObject == null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
        MessageObject messageObject2 = this.message;
        int i2 = 0;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                this.thumbsCount = 0;
                this.hasVideoThumb = false;
                TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
                int i3 = 0;
                while (i2 < tL_messageMediaPaidMedia.extended_media.size() && this.thumbsCount < 3) {
                    TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i2);
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                        i = i3 + 1;
                        setThumb(i3, ((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb);
                    } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        i = i3 + 1;
                        setThumb(i3, ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media);
                    } else {
                        i2++;
                    }
                    i3 = i;
                    i2++;
                }
                return;
            }
        }
        ArrayList arrayList = this.groupMessages;
        if (arrayList != null && arrayList.size() > 1 && TextUtils.isEmpty(restrictionReason) && this.currentDialogFolderId == 0 && this.encryptedChat == null) {
            this.thumbsCount = 0;
            this.hasVideoThumb = false;
            Collections.sort(this.groupMessages, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda4
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((MessageObject) obj).getId();
                }
            }));
            while (i2 < Math.min(3, this.groupMessages.size())) {
                MessageObject messageObject3 = (MessageObject) this.groupMessages.get(i2);
                if (messageObject3 != null && !messageObject3.needDrawBluredPreview() && (messageObject3.isPhoto() || messageObject3.isNewGif() || messageObject3.isVideo() || messageObject3.isRoundVideo() || messageObject3.isStoryMedia())) {
                    String str = messageObject3.isWebpage() ? messageObject3.messageOwner.media.webpage.type : null;
                    if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                        setThumb(i2, messageObject3);
                    }
                }
                i2++;
            }
            return;
        }
        MessageObject messageObject4 = this.message;
        if (messageObject4 == null || this.currentDialogFolderId != 0) {
            return;
        }
        this.thumbsCount = 0;
        this.hasVideoThumb = false;
        if (messageObject4.needDrawBluredPreview()) {
            return;
        }
        if (this.message.isPhoto() || this.message.isNewGif() || this.message.isVideo() || this.message.isRoundVideo() || this.message.isStoryMedia()) {
            String str2 = this.message.isWebpage() ? this.message.messageOwner.media.webpage.type : null;
            if ("app".equals(str2) || "profile".equals(str2) || "article".equals(str2)) {
                return;
            }
            if (str2 == null || !str2.startsWith("telegram_")) {
                setThumb(0, this.message);
            }
        }
    }

    private void setThumb(int i, MessageObject messageObject) {
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        TLObject tLObject = messageObject.photoThumbsObject;
        if (messageObject.isStoryMedia()) {
            TL_stories.StoryItem storyItem = messageObject.messageOwner.media.storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null) {
                return;
            }
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                arrayList = document.thumbs;
                tLObject = document;
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    arrayList = photo.sizes;
                    tLObject = photo;
                }
            }
        }
        TLRPC.PhotoSize strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
        if (strippedPhotoSize == null) {
            strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 40);
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
        TLRPC.PhotoSize photoSize = strippedPhotoSize != closestPhotoSizeWithSize ? closestPhotoSizeWithSize : null;
        if (photoSize == null || !DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject)) {
            photoSize = strippedPhotoSize;
        }
        if (strippedPhotoSize != null) {
            this.hasVideoThumb = this.hasVideoThumb || messageObject.isVideo() || messageObject.isRoundVideo();
            int i2 = this.thumbsCount;
            if (i2 < 3) {
                this.thumbsCount = i2 + 1;
                this.drawPlay[i] = (messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers();
                this.drawSpoiler[i] = messageObject.hasMediaSpoilers();
                int i3 = (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size;
                String str = messageObject.hasMediaSpoilers() ? "5_5_b" : "20_20";
                this.thumbImage[i].setImage(ImageLocation.getForObject(photoSize, tLObject), str, ImageLocation.getForObject(strippedPhotoSize, tLObject), str, i3, null, messageObject, 0);
                this.thumbImage[i].setRoundRadius(AndroidUtilities.dp(messageObject.isRoundVideo() ? 18.0f : 2.0f));
                this.needEmoji = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void setThumb(int i, TLRPC.MessageMedia messageMedia) {
        TLRPC.Document document;
        ArrayList<TLRPC.PhotoSize> arrayList;
        boolean z;
        TLRPC.Document document2;
        TLRPC.PhotoSize strippedPhotoSize;
        TLRPC.PhotoSize photoSize;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = messageMedia.photo;
            arrayList = photo.sizes;
            document = photo;
        } else {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                boolean isVideoDocument = MessageObject.isVideoDocument(messageMedia.document);
                TLRPC.Document document3 = messageMedia.document;
                z = isVideoDocument;
                arrayList = document3.thumbs;
                document2 = document3;
                strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                if (strippedPhotoSize == null) {
                    strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 40);
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
                photoSize = strippedPhotoSize != closestPhotoSizeWithSize ? closestPhotoSizeWithSize : null;
                if (photoSize != null || !DownloadController.getInstance(this.currentAccount).canDownloadMedia(1, photoSize.size)) {
                    photoSize = strippedPhotoSize;
                }
                if (strippedPhotoSize == null) {
                    this.hasVideoThumb = this.hasVideoThumb || z;
                    int i2 = this.thumbsCount;
                    if (i2 < 3) {
                        this.thumbsCount = i2 + 1;
                        this.drawPlay[i] = z;
                        this.drawSpoiler[i] = false;
                        this.thumbImage[i].setImage(ImageLocation.getForObject(photoSize, document2), "20_20", ImageLocation.getForObject(strippedPhotoSize, document2), "20_20", (z || photoSize == null) ? 0 : photoSize.size, null, this.message, 0);
                        this.thumbImage[i].setRoundRadius(AndroidUtilities.dp(2.0f));
                        this.needEmoji = false;
                        return;
                    }
                    return;
                }
                return;
            }
            document = null;
            arrayList = null;
        }
        z = false;
        document2 = document;
        strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
        if (strippedPhotoSize == null) {
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
        if (strippedPhotoSize != closestPhotoSizeWithSize2) {
        }
        if (photoSize != null) {
        }
        photoSize = strippedPhotoSize;
        if (strippedPhotoSize == null) {
        }
    }

    private void setThumb(int i, TLRPC.PhotoSize photoSize) {
        if (i < 3 && photoSize != null) {
            this.hasVideoThumb = false;
            int i2 = this.thumbsCount;
            if (i2 < 3) {
                this.thumbsCount = i2 + 1;
                this.drawPlay[i] = false;
                this.drawSpoiler[i] = true;
                this.thumbImage[i].setImage(ImageLocation.getForObject(photoSize, this.message.messageOwner), "2_2_b", null, null, 0, null, this.message, 0);
                this.thumbImage[i].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.needEmoji = false;
            }
        }
    }

    public String getMessageNameString() {
        TLRPC.Chat chat;
        TLRPC.User user;
        String str;
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        String str2;
        MessageObject messageObject;
        TLRPC.Message message2;
        TLRPC.User user2;
        MessageObject messageObject2;
        TLRPC.Message message3;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Message message4;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        TLRPC.MessageFwdHeader messageFwdHeader4;
        MessageObject messageObject3 = this.message;
        if (messageObject3 == null) {
            return null;
        }
        long fromChatId = messageObject3.getFromChatId();
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if (!this.isSavedDialog && this.currentDialogId == clientUserId) {
            long savedDialogId = this.message.getSavedDialogId();
            if (savedDialogId == clientUserId) {
                return null;
            }
            if (savedDialogId != UserObject.ANONYMOUS) {
                TLRPC.Message message5 = this.message.messageOwner;
                if (message5 != null && (messageFwdHeader4 = message5.fwd_from) != null) {
                    long peerDialogId = DialogObject.getPeerDialogId(messageFwdHeader4.saved_from_id);
                    if (peerDialogId == 0) {
                        peerDialogId = DialogObject.getPeerDialogId(this.message.messageOwner.fwd_from.from_id);
                    }
                    if (peerDialogId > 0 && peerDialogId != savedDialogId) {
                        return null;
                    }
                }
                fromChatId = savedDialogId;
            }
        }
        if (this.isSavedDialog && (message4 = this.message.messageOwner) != null && (messageFwdHeader3 = message4.fwd_from) != null) {
            fromChatId = DialogObject.getPeerDialogId(messageFwdHeader3.saved_from_id);
            if (fromChatId == 0) {
                fromChatId = DialogObject.getPeerDialogId(this.message.messageOwner.fwd_from.from_id);
            }
        }
        if (DialogObject.isUserDialog(fromChatId)) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
            chat = null;
        } else {
            chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
            user = null;
        }
        long j = this.currentDialogId;
        if (j == clientUserId) {
            if (user != null) {
                return AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", ""));
            }
            if (chat != null) {
                return AndroidUtilities.escape(chat.title.replace("\n", ""));
            }
            return null;
        }
        if (j == UserObject.VERIFY && (messageObject2 = this.message) != null && (message3 = messageObject2.messageOwner) != null && (messageFwdHeader2 = message3.fwd_from) != null) {
            String str3 = messageFwdHeader2.from_name;
            if (str3 != null) {
                return AndroidUtilities.escape(str3);
            }
            long peerDialogId2 = DialogObject.getPeerDialogId(messageFwdHeader2.from_id);
            if (DialogObject.isUserDialog(peerDialogId2)) {
                return UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId2)));
            }
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId2));
            return chat2 == null ? "" : chat2.title;
        }
        if (this.message.isOutOwner() && user != null) {
            return LocaleController.getString(R.string.FromYou);
        }
        if (!this.isSavedDialog && (messageObject = this.message) != null && (message2 = messageObject.messageOwner) != null && (message2.from_id instanceof TLRPC.TL_peerUser) && (user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.message.messageOwner.from_id.user_id))) != null) {
            return AndroidUtilities.escape(UserObject.getFirstName(user2).replace("\n", ""));
        }
        MessageObject messageObject4 = this.message;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageFwdHeader = message.fwd_from) != null && (str2 = messageFwdHeader.from_name) != null) {
            return AndroidUtilities.escape(str2);
        }
        if (user == null) {
            if (chat != null && (str = chat.title) != null) {
                return AndroidUtilities.escape(str.replace("\n", ""));
            }
            return "DELETED";
        }
        if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
            if (UserObject.isDeleted(user)) {
                return LocaleController.getString(R.string.HiddenName);
            }
            return AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace("\n", ""));
        }
        return AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.DialogCell] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence] */
    public SpannableStringBuilder getMessageStringFormatted(int i, String str, CharSequence charSequence, boolean z) {
        TLRPC.Message message;
        CharSequence charSequence2;
        String formatPluralString;
        CharSequence charSequence3;
        String str2;
        SpannableStringBuilder valueOf;
        TLRPC.TL_forumTopic findTopic;
        MessageObject captionMessage = getCaptionMessage();
        MessageObject messageObject = this.message;
        CharSequence charSequence4 = messageObject != null ? messageObject.messageText : null;
        this.applyName = true;
        if (!TextUtils.isEmpty(str)) {
            return formatInternal(i, str, charSequence);
        }
        MessageObject messageObject2 = this.message;
        TLRPC.Message message2 = messageObject2.messageOwner;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = messageObject2.messageTextShort;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.isTopic)) {
                charSequence5 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                valueOf = formatInternal(i, charSequence5, charSequence);
                if ((this.message.topicIconDrawable[0] instanceof ForumBubbleDrawable) && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-this.message.getDialogId(), MessageObject.getTopicId(this.currentAccount, this.message.messageOwner, true))) != null) {
                    ((ForumBubbleDrawable) this.message.topicIconDrawable[0]).setColor(findTopic.icon_color);
                }
            } else {
                this.applyName = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (!z) {
                return valueOf;
            }
            applyThumbs(valueOf);
            return valueOf;
        }
        if (captionMessage != null && (charSequence3 = captionMessage.caption) != null) {
            CharSequence charSequence6 = charSequence3.toString();
            if (!this.needEmoji) {
                str2 = "";
            } else if (captionMessage.isVideo()) {
                str2 = "📹 ";
            } else if (captionMessage.isVoice()) {
                str2 = "🎤 ";
            } else if (captionMessage.isMusic()) {
                str2 = "🎧 ";
            } else if (captionMessage.isPhoto()) {
                str2 = "🖼 ";
            } else {
                str2 = "📎 ";
            }
            if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                CharSequence charSequence7 = captionMessage.messageTrimmedToHighlight;
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 47);
                if (this.hasNameInMessage) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.currentMessagePaint.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.currentMessagePaint.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                    charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            if (charSequence6.length() > 150) {
                charSequence6 = charSequence6.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(charSequence6);
            captionMessage.spoilLoginCode();
            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, charSequence6, spannableString, NotificationCenter.didApplyNewTheme);
            TLRPC.Message message3 = captionMessage.messageOwner;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.currentMessagePaint;
                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint != null ? textPaint.getFontMetricsInt() : null);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString));
            if (z) {
                append = applyThumbs(append);
            }
            return formatInternal(i, append, charSequence);
        }
        TL_iv.RichMessage richMessage = message2.rich_message;
        if (richMessage != null) {
            boolean isBlueBlock = richMessage.blocks.size() == 1 ? MessageObject.isBlueBlock(this.message.messageOwner.rich_message.blocks.get(0)) : false;
            SpannableStringBuilder formatInternal = formatInternal(i, this.message.messageText, charSequence);
            if (isBlueBlock && !isForumCell()) {
                try {
                    formatInternal.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, this.resourcesProvider), this.hasNameInMessage ? charSequence.length() + 2 : 0, formatInternal.length(), 33);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return formatInternal;
        }
        if (message2.media != null && !messageObject2.isMediaEmpty()) {
            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
            int i2 = Theme.key_chats_attachMessage;
            MessageObject messageObject3 = this.message;
            TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                    MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2);
                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                    charSequence2 = DialogMediaIconsHelper.addDialogMediaSpan(spannableString2, R.drawable.dialog_media_poll_20, true);
                } else {
                    charSequence2 = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities.text, R.drawable.dialog_media_poll_20, true);
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                    TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                    MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3);
                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                    charSequence2 = DialogMediaIconsHelper.addDialogMediaSpan(spannableString3, R.drawable.dialog_media_checklist_20, true);
                } else {
                    charSequence2 = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities3.text, R.drawable.dialog_media_checklist_20, true);
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                charSequence2 = DialogMediaIconsHelper.addDialogMediaSpan(messageMedia.game.title, R.drawable.dialog_media_game_20, true);
            } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                charSequence2 = messageMedia.title;
            } else if (messageObject3.type == 14) {
                charSequence2 = String.format("🎧 \u2068%s - %s\u2069", messageObject3.getMusicAuthor(), this.message.getMusicTitle());
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                if (this.hasVideoThumb) {
                    formatPluralString = size > 1 ? LocaleController.formatPluralString("Media", size, new Object[0]) : LocaleController.getString(R.string.AttachVideo);
                } else {
                    formatPluralString = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                }
                charSequence2 = StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, formatPluralString));
                i2 = Theme.key_chats_actionMessage;
            } else if (this.thumbsCount > 1) {
                if (this.hasVideoThumb) {
                    ArrayList arrayList2 = this.groupMessages;
                    charSequence2 = LocaleController.formatPluralString("Media", arrayList2 == null ? 0 : arrayList2.size(), new Object[0]);
                } else {
                    ArrayList arrayList3 = this.groupMessages;
                    charSequence2 = LocaleController.formatPluralString("Photos", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
                }
                i2 = Theme.key_chats_actionMessage;
            } else {
                charSequence2 = charSequence4.toString();
                i2 = Theme.key_chats_actionMessage;
            }
            if (charSequence2 instanceof String) {
                charSequence2 = ((String) charSequence2).replace('\n', ' ');
            }
            if (z) {
                charSequence2 = applyThumbs(charSequence2);
            }
            SpannableStringBuilder formatInternal2 = formatInternal(i, charSequence2, charSequence);
            if (!isForumCell()) {
                try {
                    formatInternal2.setSpan(new ForegroundColorSpanThemable(i2, this.resourcesProvider), this.hasNameInMessage ? charSequence.length() + 2 : 0, formatInternal2.length(), 33);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            return formatInternal2;
        }
        MessageObject messageObject4 = this.message;
        CharSequence charSequence8 = messageObject4.messageOwner.message;
        if (charSequence8 != null) {
            if (messageObject4.hasHighlightedWords()) {
                CharSequence charSequence9 = this.message.messageTrimmedToHighlight;
                if (charSequence9 != null) {
                    charSequence8 = charSequence9;
                }
                int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 33);
                if (this.hasNameInMessage) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth2 = (int) (measuredWidth2 - this.currentMessagePaint.measureText(charSequence.toString()));
                    }
                    measuredWidth2 = (int) (measuredWidth2 - this.currentMessagePaint.measureText(": "));
                }
                if (measuredWidth2 > 0) {
                    charSequence8 = AndroidUtilities.ellipsizeCenterEnd(charSequence8, this.message.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                }
            } else {
                if (charSequence8.length() > 150) {
                    charSequence8 = charSequence8.subSequence(0, 150);
                }
                charSequence8 = AndroidUtilities.replaceNewLines(charSequence8);
            }
            ?? spannableString4 = new SpannableString(charSequence8);
            MessageObject messageObject5 = this.message;
            if (messageObject5 != null) {
                messageObject5.spoilLoginCode();
            }
            MediaDataController.addTextStyleRuns(this.message, (Spannable) spannableString4, NotificationCenter.didApplyNewTheme);
            MessageObject messageObject6 = this.message;
            if (messageObject6 != null && (message = messageObject6.messageOwner) != null) {
                ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                TextPaint textPaint2 = this.currentMessagePaint;
                MediaDataController.addAnimatedEmojiSpans(arrayList4, spannableString4, textPaint2 != null ? textPaint2.getFontMetricsInt() : null);
            }
            if (z) {
                spannableString4 = applyThumbs(spannableString4);
            }
            return formatInternal(i, spannableString4, charSequence);
        }
        return new SpannableStringBuilder();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.rightFragmentOpenedProgress != 0.0f || this.isTopic || this.isShareToStoryCell || !this.storyParams.checkOnTouchEvent(motionEvent, this)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.isTopic && !this.isShareToStoryCell && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.storyParams.checkOnTouchEvent(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CanvasButton canvasButton;
        int i;
        if (this.rightFragmentOpenedProgress == 0.0f && !this.isTopic && !this.isShareToStoryCell && this.storyParams.checkOnTouchEvent(motionEvent, this)) {
            return true;
        }
        DialogCellDelegate dialogCellDelegate = this.delegate;
        if (dialogCellDelegate == null || dialogCellDelegate.canClickButtonInside()) {
            if (this.openBot) {
                boolean contains = this.openButtonRect.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    this.openButtonBounce.setPressed(contains);
                } else {
                    if (this.openButtonBounce.isPressed() && motionEvent.getAction() == 1) {
                        Utilities.Callback callback = this.onOpenButtonClick;
                        if (callback != null) {
                            callback.run(this.user);
                        }
                        this.openButtonBounce.setPressed(false);
                        return true;
                    }
                    if (this.openButtonBounce.isPressed() && motionEvent.getAction() == 3) {
                        this.openButtonBounce.setPressed(false);
                        return true;
                    }
                }
                if (contains) {
                    return true;
                }
            }
            if (this.lastTopicMessageUnread && (canvasButton = this.canvasButton) != null && this.buttonLayout != null && (((i = this.dialogsType) == 0 || i == 7 || i == 8) && canvasButton.checkTouchEvent(motionEvent))) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClipProgress(float f) {
        this.clipProgress = f;
        invalidate();
    }

    public float getClipProgress() {
        return this.clipProgress;
    }

    public void setTopClip(int i) {
        this.topClip = i;
    }

    public void setBottomClip(int i) {
        this.bottomClip = i;
    }

    public void setArchivedPullAnimation(PullForegroundDrawable pullForegroundDrawable) {
        this.archivedChatsDrawable = pullForegroundDrawable;
    }

    public int getCurrentDialogFolderId() {
        return this.currentDialogFolderId;
    }

    public boolean isDialogFolder() {
        return this.currentDialogFolderId > 0;
    }

    public boolean isDialogCommunity() {
        return ChatObject.isCommunity(this.chat);
    }

    public MessageObject getMessage() {
        return this.message;
    }

    public void setDialogCellDelegate(DialogCellDelegate dialogCellDelegate) {
        this.delegate = dialogCellDelegate;
    }

    private class DialogUpdateHelper {
        public long lastDrawnDialogId;
        public boolean lastDrawnDialogIsFolder;
        public int lastDrawnDraftHash;
        public boolean lastDrawnHasCall;
        public long lastDrawnMessageId;
        public boolean lastDrawnPinned;
        public Integer lastDrawnPrintingType;
        public long lastDrawnReadState;
        public int lastDrawnSizeHash;
        public boolean lastDrawnTranslated;
        public int lastKnownTypingType;
        public int lastTopicsCount;
        long startWaitingTime;
        public boolean typingOutToTop;
        public float typingProgres;
        boolean waitngNewMessageFroTypingAnimation;

        private DialogUpdateHelper() {
            this.waitngNewMessageFroTypingAnimation = false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x016d, code lost:
        
            if (org.telegram.messenger.MessagesController.getInstance(r19.this$0.currentAccount).getTopicsController().endIsReached(-r19.this$0.currentDialogId) != false) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x02ea  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x02e2  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x02e5  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x02a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean update() {
            Integer num;
            int i;
            boolean z;
            TLRPC.DraftMessage draft;
            int i2;
            int i3;
            boolean z2;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(DialogCell.this.currentAccount).dialogs_dict.get(DialogCell.this.currentDialogId);
            if (dialog == null) {
                if (DialogCell.this.dialogsType != 3 || this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                    return false;
                }
                this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                return true;
            }
            int id = DialogCell.this.message == null ? 0 : DialogCell.this.message.getId() + DialogCell.this.message.hashCode();
            long j = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0) + (dialog.unread_poll_votes_count > 0 ? TLObject.FLAG_21 : 0);
            if (DialogCell.this.isForumCell()) {
                int[] forumUnreadCount = MessagesController.getInstance(DialogCell.this.currentAccount).getTopicsController().getForumUnreadCount(-DialogCell.this.currentDialogId);
                if (forumUnreadCount[2] > 0) {
                    j |= 1048576;
                }
                if (forumUnreadCount[4] > 0) {
                    j |= 4194304;
                }
            }
            if (!DialogCell.this.isForumCell()) {
                DialogCell dialogCell = DialogCell.this;
                if ((dialogCell.isDialogCell || dialogCell.isTopic) && !TextUtils.isEmpty(MessagesController.getInstance(DialogCell.this.currentAccount).getPrintingString(DialogCell.this.currentDialogId, DialogCell.this.getTopicId(), true))) {
                    num = MessagesController.getInstance(DialogCell.this.currentAccount).getPrintingStringType(DialogCell.this.currentDialogId, DialogCell.this.getTopicId());
                    int measuredWidth = DialogCell.this.getMeasuredWidth() + (DialogCell.this.getMeasuredHeight() << 16);
                    if (DialogCell.this.isForumCell()) {
                        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(DialogCell.this.currentAccount).getTopicsController().getTopics(-DialogCell.this.currentDialogId);
                        i = topics == null ? -1 : topics.size();
                        if (i == -1) {
                        }
                        if (DialogCell.this.isTopic) {
                            z = MediaDataController.getInstance(DialogCell.this.currentAccount).getDraftVoice(DialogCell.this.currentDialogId, (long) DialogCell.this.getTopicId()) != null;
                            TLRPC.DraftMessage draft2 = !z ? MediaDataController.getInstance(DialogCell.this.currentAccount).getDraft(DialogCell.this.currentDialogId, DialogCell.this.getTopicId()) : null;
                            if (draft2 == null || !TextUtils.isEmpty(draft2.message)) {
                                draft = draft2;
                                if (draft != null) {
                                    i2 = 0;
                                } else {
                                    int hashCode = draft.message.hashCode();
                                    TLRPC.InputReplyTo inputReplyTo = draft.reply_to;
                                    i2 = hashCode + (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : 0);
                                }
                                boolean z3 = DialogCell.this.chat == null && DialogCell.this.chat.call_active && DialogCell.this.chat.call_not_empty;
                                boolean isTranslatingDialog = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                                if (this.lastDrawnSizeHash != measuredWidth) {
                                    i3 = measuredWidth;
                                    if (this.lastDrawnMessageId == id && this.lastDrawnTranslated == isTranslatingDialog && this.lastDrawnDialogId == DialogCell.this.currentDialogId && this.lastDrawnDialogIsFolder == dialog.isFolder && this.lastDrawnReadState == j && Objects.equals(this.lastDrawnPrintingType, num) && this.lastTopicsCount == i && i2 == this.lastDrawnDraftHash && this.lastDrawnPinned == DialogCell.this.drawPin && this.lastDrawnHasCall == z3 && DialogCell.this.draftVoice == z) {
                                        return false;
                                    }
                                } else {
                                    i3 = measuredWidth;
                                }
                                if (this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                                    this.typingProgres = num == null ? 0.0f : 1.0f;
                                    this.waitngNewMessageFroTypingAnimation = false;
                                } else if (!Objects.equals(this.lastDrawnPrintingType, num) || this.waitngNewMessageFroTypingAnimation) {
                                    boolean z4 = this.waitngNewMessageFroTypingAnimation;
                                    if (!z4 && num == null) {
                                        this.waitngNewMessageFroTypingAnimation = true;
                                        this.startWaitingTime = System.currentTimeMillis();
                                    } else if (z4 && this.lastDrawnMessageId != id) {
                                        z2 = false;
                                        this.waitngNewMessageFroTypingAnimation = false;
                                        if (this.lastDrawnMessageId == id) {
                                            this.typingOutToTop = z2;
                                        } else {
                                            this.typingOutToTop = true;
                                        }
                                    }
                                    z2 = false;
                                    if (this.lastDrawnMessageId == id) {
                                    }
                                }
                                if (num != null) {
                                    this.lastKnownTypingType = num.intValue();
                                }
                                this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                                this.lastDrawnMessageId = id;
                                this.lastDrawnDialogIsFolder = dialog.isFolder;
                                this.lastDrawnReadState = j;
                                this.lastDrawnPrintingType = num;
                                this.lastDrawnSizeHash = i3;
                                this.lastDrawnDraftHash = i2;
                                this.lastTopicsCount = i;
                                this.lastDrawnPinned = DialogCell.this.drawPin;
                                this.lastDrawnHasCall = z3;
                                this.lastDrawnTranslated = isTranslatingDialog;
                                return true;
                            }
                            draft = null;
                            if (draft != null) {
                            }
                            if (DialogCell.this.chat == null) {
                            }
                            boolean isTranslatingDialog2 = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                            if (this.lastDrawnSizeHash != measuredWidth) {
                            }
                            if (this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                            }
                            if (num != null) {
                            }
                            this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                            this.lastDrawnMessageId = id;
                            this.lastDrawnDialogIsFolder = dialog.isFolder;
                            this.lastDrawnReadState = j;
                            this.lastDrawnPrintingType = num;
                            this.lastDrawnSizeHash = i3;
                            this.lastDrawnDraftHash = i2;
                            this.lastTopicsCount = i;
                            this.lastDrawnPinned = DialogCell.this.drawPin;
                            this.lastDrawnHasCall = z3;
                            this.lastDrawnTranslated = isTranslatingDialog2;
                            return true;
                        }
                        DialogCell dialogCell2 = DialogCell.this;
                        if (dialogCell2.isDialogCell) {
                            z = MediaDataController.getInstance(dialogCell2.currentAccount).getDraftVoice(DialogCell.this.currentDialogId, 0L) != null;
                            if (!z) {
                                draft = MediaDataController.getInstance(DialogCell.this.currentAccount).getDraft(DialogCell.this.currentDialogId, 0L);
                                if (draft != null) {
                                }
                                if (DialogCell.this.chat == null) {
                                }
                                boolean isTranslatingDialog22 = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                                if (this.lastDrawnSizeHash != measuredWidth) {
                                }
                                if (this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                                }
                                if (num != null) {
                                }
                                this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                                this.lastDrawnMessageId = id;
                                this.lastDrawnDialogIsFolder = dialog.isFolder;
                                this.lastDrawnReadState = j;
                                this.lastDrawnPrintingType = num;
                                this.lastDrawnSizeHash = i3;
                                this.lastDrawnDraftHash = i2;
                                this.lastTopicsCount = i;
                                this.lastDrawnPinned = DialogCell.this.drawPin;
                                this.lastDrawnHasCall = z3;
                                this.lastDrawnTranslated = isTranslatingDialog22;
                                return true;
                            }
                        } else {
                            z = false;
                        }
                        draft = null;
                        if (draft != null) {
                        }
                        if (DialogCell.this.chat == null) {
                        }
                        boolean isTranslatingDialog222 = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                        if (this.lastDrawnSizeHash != measuredWidth) {
                        }
                        if (this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                        }
                        if (num != null) {
                        }
                        this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                        this.lastDrawnMessageId = id;
                        this.lastDrawnDialogIsFolder = dialog.isFolder;
                        this.lastDrawnReadState = j;
                        this.lastDrawnPrintingType = num;
                        this.lastDrawnSizeHash = i3;
                        this.lastDrawnDraftHash = i2;
                        this.lastTopicsCount = i;
                        this.lastDrawnPinned = DialogCell.this.drawPin;
                        this.lastDrawnHasCall = z3;
                        this.lastDrawnTranslated = isTranslatingDialog222;
                        return true;
                    }
                    i = 0;
                    if (DialogCell.this.isTopic) {
                    }
                }
            }
            num = null;
            int measuredWidth2 = DialogCell.this.getMeasuredWidth() + (DialogCell.this.getMeasuredHeight() << 16);
            if (DialogCell.this.isForumCell()) {
            }
            i = 0;
            if (DialogCell.this.isTopic) {
            }
        }

        public void updateAnimationValues() {
            if (!this.waitngNewMessageFroTypingAnimation) {
                if (this.lastDrawnPrintingType != null && DialogCell.this.typingLayout != null) {
                    float f = this.typingProgres;
                    if (f != 1.0f) {
                        this.typingProgres = f + 0.08f;
                        DialogCell.this.invalidate();
                        this.typingProgres = Utilities.clamp(this.typingProgres, 1.0f, 0.0f);
                        return;
                    }
                }
                if (this.lastDrawnPrintingType == null) {
                    float f2 = this.typingProgres;
                    if (f2 != 0.0f) {
                        this.typingProgres = f2 - 0.08f;
                        DialogCell.this.invalidate();
                    }
                }
                this.typingProgres = Utilities.clamp(this.typingProgres, 1.0f, 0.0f);
                return;
            }
            if (System.currentTimeMillis() - this.startWaitingTime > 100) {
                this.waitngNewMessageFroTypingAnimation = false;
            }
            DialogCell.this.invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.BaseCell, android.view.View
    public void invalidate() {
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        if (StoryViewer.animationInProgress) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class ForumFormattedNames {
        HashMap avatarSpans;
        CharSequence formattedNames;
        boolean isLoadingState;
        int lastMessageId;
        boolean lastTopicMessageUnread;
        private final DialogCell parent;
        int topMessageTopicEndIndex;
        int topMessageTopicStartIndex;

        ForumFormattedNames(DialogCell dialogCell) {
            this.parent = dialogCell;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateSpans() {
            HashMap hashMap = this.avatarSpans;
            if (hashMap == null || hashMap.isEmpty()) {
                return;
            }
            for (Map.Entry entry : this.avatarSpans.entrySet()) {
                ((AvatarSpan) entry.getValue()).setDialogId(((Long) entry.getKey()).longValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void formatTopicsNames(int i, MessageObject messageObject, TLRPC.Chat chat) {
            long j;
            boolean z;
            int i2;
            int id = (messageObject == null || chat == null) ? 0 : messageObject.getId();
            if (this.lastMessageId != id || this.isLoadingState) {
                this.avatarSpans = null;
                this.topMessageTopicStartIndex = 0;
                this.topMessageTopicEndIndex = 0;
                this.lastTopicMessageUnread = false;
                this.isLoadingState = false;
                this.lastMessageId = id;
                TextPaint textPaint = Theme.dialogs_messagePaint[0];
                if (chat != null) {
                    ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i).getTopicsController().getTopics(chat.id);
                    boolean z2 = true;
                    if (topics != null && !topics.isEmpty()) {
                        ArrayList arrayList = new ArrayList(topics);
                        Collections.sort(arrayList, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.ui.Cells.DialogCell$ForumFormattedNames$$ExternalSyntheticLambda0
                            @Override // java.util.function.ToIntFunction
                            public final int applyAsInt(Object obj) {
                                int lambda$formatTopicsNames$0;
                                lambda$formatTopicsNames$0 = DialogCell.ForumFormattedNames.lambda$formatTopicsNames$0((TLRPC.TL_forumTopic) obj);
                                return lambda$formatTopicsNames$0;
                            }
                        }));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (messageObject == null || ChatObject.isMonoForum(chat)) {
                            j = 0;
                            z = false;
                            i2 = 0;
                        } else {
                            j = MessageObject.getTopicId(i, messageObject.messageOwner, true);
                            TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i).getTopicsController().findTopic(chat.id, j);
                            if (findTopic != null) {
                                CharSequence topicSpannedName = ForumUtilities.getTopicSpannedName(findTopic, textPaint, false);
                                spannableStringBuilder.append(topicSpannedName);
                                i2 = findTopic.unread_count > 0 ? topicSpannedName.length() : 0;
                                this.topMessageTopicStartIndex = 0;
                                this.topMessageTopicEndIndex = topicSpannedName.length();
                                if (messageObject.isOutOwner()) {
                                    this.lastTopicMessageUnread = false;
                                } else {
                                    this.lastTopicMessageUnread = findTopic.unread_count > 0;
                                }
                            } else {
                                this.lastTopicMessageUnread = false;
                                i2 = 0;
                            }
                            if (this.lastTopicMessageUnread) {
                                spannableStringBuilder.append((CharSequence) " ");
                                spannableStringBuilder.setSpan(new FixedWidthSpan(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (ChatObject.isMonoForum(chat)) {
                            this.avatarSpans = new HashMap();
                            for (int i3 = 0; i3 < Math.min(4, arrayList.size()); i3++) {
                                if (spannableStringBuilder.length() != 0) {
                                    spannableStringBuilder.append((CharSequence) "  ");
                                }
                                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_forumTopic) arrayList.get(i3)).from_id);
                                AvatarSpan avatarSpan = new AvatarSpan(this.parent, i);
                                avatarSpan.needDrawShadow = false;
                                avatarSpan.setDialogId(peerDialogId);
                                this.avatarSpans.put(Long.valueOf(peerDialogId), avatarSpan);
                                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(DialogObject.getName(peerDialogId));
                                valueOf.insert(0, (CharSequence) "  ");
                                valueOf.setSpan(avatarSpan, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) valueOf);
                            }
                        } else {
                            int i4 = 0;
                            for (int i5 = 4; i4 < Math.min(i5, arrayList.size()); i5 = 4) {
                                if (((TLRPC.TL_forumTopic) arrayList.get(i4)).id != j) {
                                    if (spannableStringBuilder.length() != 0) {
                                        if (z2 && z) {
                                            spannableStringBuilder.append((CharSequence) " ");
                                        } else {
                                            spannableStringBuilder.append((CharSequence) ", ");
                                        }
                                    }
                                    spannableStringBuilder.append(ForumUtilities.getTopicSpannedName((TLRPC.ForumTopic) arrayList.get(i4), textPaint, false));
                                    z2 = false;
                                }
                                i4++;
                            }
                        }
                        if (i2 > 0) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.key_chats_name, null), 0, Math.min(spannableStringBuilder.length(), i2 + 2), 0);
                        }
                        this.formattedNames = spannableStringBuilder;
                        return;
                    }
                    if (MessagesController.getInstance(i).getTopicsController().endIsReached(chat.id)) {
                        this.formattedNames = LocaleController.getString(ChatObject.isMonoForum(chat) ? R.string.NoMonoforumTopicsCreated : R.string.NoTopicsCreated);
                        return;
                    }
                    MessagesController.getInstance(i).getTopicsController().preloadTopics(chat.id);
                    this.formattedNames = LocaleController.getString(R.string.Loading);
                    this.isLoadingState = true;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$formatTopicsNames$0(TLRPC.TL_forumTopic tL_forumTopic) {
            return -tL_forumTopic.top_message;
        }
    }

    private ColorFilter getAdaptiveEmojiColorFilter(int i, int i2) {
        if (this.adaptiveEmojiColorFilter == null) {
            this.adaptiveEmojiColor = new int[4];
            this.adaptiveEmojiColorFilter = new ColorFilter[4];
        }
        if (i2 != this.adaptiveEmojiColor[i] || this.adaptiveEmojiColorFilter[i] == null) {
            ColorFilter[] colorFilterArr = this.adaptiveEmojiColorFilter;
            this.adaptiveEmojiColor[i] = i2;
            colorFilterArr[i] = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
        return this.adaptiveEmojiColorFilter[i];
    }

    public void showPremiumBlocked(boolean z) {
        Runnable runnable = this.unsubscribePremiumBlocked;
        if (z != (runnable != null)) {
            if (!z && runnable != null) {
                runnable.run();
                this.unsubscribePremiumBlocked = null;
            } else if (z) {
                this.unsubscribePremiumBlocked = NotificationCenter.getInstance(this.currentAccount).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new Utilities.Callback() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        DialogCell.this.lambda$showPremiumBlocked$5((Object[]) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremiumBlocked$5(Object[] objArr) {
        updatePremiumBlocked(true);
    }

    private void updatePremiumBlocked(boolean z) {
        TL_account.RequirementToContact isUserContactBlocked = (this.unsubscribePremiumBlocked == null || this.user == null) ? null : MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.user.id);
        if (this.premiumBlocked == DialogObject.isPremiumBlocked(isUserContactBlocked) && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
            return;
        }
        this.premiumBlocked = DialogObject.isPremiumBlocked(isUserContactBlocked);
        this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
        if (!z) {
            this.premiumBlockedT.set(this.premiumBlocked, true);
            this.starsBlockedT.set(this.starsPriceBlocked > 0, true);
        }
        invalidate();
    }
}
