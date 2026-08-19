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

    /* JADX WARN: Can't wrap try/catch for region: R(12:642|643|(2:647|(8:649|650|651|652|(1:663)(1:656)|657|(2:658|(1:660)(1:661))|662))|669|650|651|652|(1:654)|663|657|(3:658|(0)(0)|660)|662) */
    /* JADX WARN: Code restructure failed: missing block: B:1534:0x0b7c, code lost:
    
        if (r13.id == r14) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1710:0x0fc7, code lost:
    
        if (org.telegram.messenger.MessageObject.isBlueBlock(r61.message.messageOwner.rich_message.blocks.get(0)) != false) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1778:0x0b8a, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r61.chat) == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1780:0x0b92, code lost:
    
        if (org.telegram.ui.Components.Forum.ForumUtilities.isTopicCreateMessage(r61.message) != false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1848:0x066c, code lost:
    
        if (r0.post_messages == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1872:0x0643, code lost:
    
        if (r6.reply_to_msg_id == 0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1878:0x0652, code lost:
    
        if (r61.unreadCount != 0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x2223, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x2224, code lost:
    
        r2 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x2226, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r49 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x133e  */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x13e4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x1838  */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x1574  */
    /* JADX WARN: Removed duplicated region for block: B:1095:0x15cd  */
    /* JADX WARN: Removed duplicated region for block: B:1236:0x1540  */
    /* JADX WARN: Removed duplicated region for block: B:1243:0x13bd  */
    /* JADX WARN: Removed duplicated region for block: B:1255:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x19d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x19e5  */
    /* JADX WARN: Removed duplicated region for block: B:1341:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:1345:0x1234  */
    /* JADX WARN: Removed duplicated region for block: B:1347:0x123e  */
    /* JADX WARN: Removed duplicated region for block: B:1351:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x19fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x1a01 A[Catch: Exception -> 0x1a0c, TryCatch #3 {Exception -> 0x1a0c, blocks: (B:137:0x19f3, B:140:0x19fd, B:142:0x1a01, B:143:0x1a11, B:146:0x1a15), top: B:136:0x19f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x1a15 A[Catch: Exception -> 0x1a0c, TRY_LEAVE, TryCatch #3 {Exception -> 0x1a0c, blocks: (B:137:0x19f3, B:140:0x19fd, B:142:0x1a01, B:143:0x1a11, B:146:0x1a15), top: B:136:0x19f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:1494:0x11b6  */
    /* JADX WARN: Removed duplicated region for block: B:1499:0x11c7  */
    /* JADX WARN: Removed duplicated region for block: B:1548:0x0fd9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x1a77  */
    /* JADX WARN: Removed duplicated region for block: B:1551:0x1003  */
    /* JADX WARN: Removed duplicated region for block: B:1579:0x0ffd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x1a80 A[Catch: Exception -> 0x1a3f, TryCatch #9 {Exception -> 0x1a3f, blocks: (B:148:0x1a22, B:151:0x1a31, B:152:0x1a64, B:155:0x1a7a, B:157:0x1a80, B:158:0x1a8c, B:160:0x1a9f, B:162:0x1aa5, B:165:0x1ab6, B:167:0x1aba, B:168:0x1af8, B:170:0x1afc, B:172:0x1b05, B:173:0x1b0d, B:843:0x1ad7, B:848:0x1a42, B:850:0x1a48, B:853:0x1a62), top: B:144:0x1a13 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1aba A[Catch: Exception -> 0x1a3f, TryCatch #9 {Exception -> 0x1a3f, blocks: (B:148:0x1a22, B:151:0x1a31, B:152:0x1a64, B:155:0x1a7a, B:157:0x1a80, B:158:0x1a8c, B:160:0x1a9f, B:162:0x1aa5, B:165:0x1ab6, B:167:0x1aba, B:168:0x1af8, B:170:0x1afc, B:172:0x1b05, B:173:0x1b0d, B:843:0x1ad7, B:848:0x1a42, B:850:0x1a48, B:853:0x1a62), top: B:144:0x1a13 }] */
    /* JADX WARN: Removed duplicated region for block: B:1697:0x0deb  */
    /* JADX WARN: Removed duplicated region for block: B:1711:0x0dee  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x1b30  */
    /* JADX WARN: Removed duplicated region for block: B:1851:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:1863:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:1869:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:1875:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:1881:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:1952:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x1d57  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1d83  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1d90  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1dbc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1de4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x2118  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x216d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x2181  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x2199  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x219c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x21ab  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x22a4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x22c5 A[Catch: Exception -> 0x2310, TRY_LEAVE, TryCatch #0 {Exception -> 0x2310, blocks: (B:288:0x22bd, B:290:0x22c5), top: B:287:0x22bd }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x232b A[Catch: Exception -> 0x2336, TryCatch #7 {Exception -> 0x2336, blocks: (B:294:0x2325, B:296:0x232b, B:298:0x232f, B:302:0x2362, B:307:0x238c, B:312:0x2338, B:314:0x233e), top: B:293:0x2325 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x2399 A[Catch: Exception -> 0x23c8, TryCatch #12 {Exception -> 0x23c8, blocks: (B:316:0x2395, B:318:0x2399, B:320:0x23ab, B:322:0x23b1, B:324:0x23b5, B:326:0x23bd, B:328:0x23c3, B:331:0x23ec, B:333:0x23f0, B:334:0x23cc, B:336:0x23d0, B:338:0x23d4, B:340:0x23d8, B:342:0x23dc, B:347:0x23f3, B:349:0x23f7, B:351:0x2417, B:353:0x241b, B:355:0x243d, B:357:0x2443, B:359:0x2447, B:361:0x245a, B:364:0x2488, B:366:0x248c, B:368:0x2490, B:370:0x2498, B:372:0x249c, B:374:0x24df, B:376:0x24e3, B:378:0x24f8, B:380:0x24fe, B:385:0x2529, B:567:0x24a0, B:569:0x24a6, B:572:0x24ac, B:585:0x2495, B:586:0x2478, B:587:0x241f, B:590:0x2427, B:592:0x242f, B:595:0x23fb, B:597:0x2401, B:599:0x2405, B:601:0x240a), top: B:315:0x2395 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x23f7 A[Catch: Exception -> 0x23c8, TryCatch #12 {Exception -> 0x23c8, blocks: (B:316:0x2395, B:318:0x2399, B:320:0x23ab, B:322:0x23b1, B:324:0x23b5, B:326:0x23bd, B:328:0x23c3, B:331:0x23ec, B:333:0x23f0, B:334:0x23cc, B:336:0x23d0, B:338:0x23d4, B:340:0x23d8, B:342:0x23dc, B:347:0x23f3, B:349:0x23f7, B:351:0x2417, B:353:0x241b, B:355:0x243d, B:357:0x2443, B:359:0x2447, B:361:0x245a, B:364:0x2488, B:366:0x248c, B:368:0x2490, B:370:0x2498, B:372:0x249c, B:374:0x24df, B:376:0x24e3, B:378:0x24f8, B:380:0x24fe, B:385:0x2529, B:567:0x24a0, B:569:0x24a6, B:572:0x24ac, B:585:0x2495, B:586:0x2478, B:587:0x241f, B:590:0x2427, B:592:0x242f, B:595:0x23fb, B:597:0x2401, B:599:0x2405, B:601:0x240a), top: B:315:0x2395 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x248c A[Catch: Exception -> 0x23c8, TryCatch #12 {Exception -> 0x23c8, blocks: (B:316:0x2395, B:318:0x2399, B:320:0x23ab, B:322:0x23b1, B:324:0x23b5, B:326:0x23bd, B:328:0x23c3, B:331:0x23ec, B:333:0x23f0, B:334:0x23cc, B:336:0x23d0, B:338:0x23d4, B:340:0x23d8, B:342:0x23dc, B:347:0x23f3, B:349:0x23f7, B:351:0x2417, B:353:0x241b, B:355:0x243d, B:357:0x2443, B:359:0x2447, B:361:0x245a, B:364:0x2488, B:366:0x248c, B:368:0x2490, B:370:0x2498, B:372:0x249c, B:374:0x24df, B:376:0x24e3, B:378:0x24f8, B:380:0x24fe, B:385:0x2529, B:567:0x24a0, B:569:0x24a6, B:572:0x24ac, B:585:0x2495, B:586:0x2478, B:587:0x241f, B:590:0x2427, B:592:0x242f, B:595:0x23fb, B:597:0x2401, B:599:0x2405, B:601:0x240a), top: B:315:0x2395 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x249c A[Catch: Exception -> 0x23c8, TryCatch #12 {Exception -> 0x23c8, blocks: (B:316:0x2395, B:318:0x2399, B:320:0x23ab, B:322:0x23b1, B:324:0x23b5, B:326:0x23bd, B:328:0x23c3, B:331:0x23ec, B:333:0x23f0, B:334:0x23cc, B:336:0x23d0, B:338:0x23d4, B:340:0x23d8, B:342:0x23dc, B:347:0x23f3, B:349:0x23f7, B:351:0x2417, B:353:0x241b, B:355:0x243d, B:357:0x2443, B:359:0x2447, B:361:0x245a, B:364:0x2488, B:366:0x248c, B:368:0x2490, B:370:0x2498, B:372:0x249c, B:374:0x24df, B:376:0x24e3, B:378:0x24f8, B:380:0x24fe, B:385:0x2529, B:567:0x24a0, B:569:0x24a6, B:572:0x24ac, B:585:0x2495, B:586:0x2478, B:587:0x241f, B:590:0x2427, B:592:0x242f, B:595:0x23fb, B:597:0x2401, B:599:0x2405, B:601:0x240a), top: B:315:0x2395 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x256b  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x2867  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x28a6  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x28ae  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x276c  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x24aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x24c1  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x24c4  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x2312  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x21d2  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x2237  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x2247 A[LOOP:12: B:658:0x2242->B:660:0x2247, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:661:0x225b A[EDGE_INSN: B:661:0x225b->B:662:0x225b BREAK  A[LOOP:12: B:658:0x2242->B:660:0x2247], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:675:0x1e1b  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x1d6e  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x1ca1  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x1d06  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x1763  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x1d53 A[EDGE_INSN: B:839:0x1d53->B:209:0x1d53 BREAK  A[LOOP:13: B:820:0x1d01->B:835:0x1d3d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:840:0x1cc4  */
    /* JADX WARN: Removed duplicated region for block: B:843:0x1ad7 A[Catch: Exception -> 0x1a3f, TryCatch #9 {Exception -> 0x1a3f, blocks: (B:148:0x1a22, B:151:0x1a31, B:152:0x1a64, B:155:0x1a7a, B:157:0x1a80, B:158:0x1a8c, B:160:0x1a9f, B:162:0x1aa5, B:165:0x1ab6, B:167:0x1aba, B:168:0x1af8, B:170:0x1afc, B:172:0x1b05, B:173:0x1b0d, B:843:0x1ad7, B:848:0x1a42, B:850:0x1a48, B:853:0x1a62), top: B:144:0x1a13 }] */
    /* JADX WARN: Removed duplicated region for block: B:845:0x1a79  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x1a42 A[Catch: Exception -> 0x1a3f, TryCatch #9 {Exception -> 0x1a3f, blocks: (B:148:0x1a22, B:151:0x1a31, B:152:0x1a64, B:155:0x1a7a, B:157:0x1a80, B:158:0x1a8c, B:160:0x1a9f, B:162:0x1aa5, B:165:0x1ab6, B:167:0x1aba, B:168:0x1af8, B:170:0x1afc, B:172:0x1b05, B:173:0x1b0d, B:843:0x1ad7, B:848:0x1a42, B:850:0x1a48, B:853:0x1a62), top: B:144:0x1a13 }] */
    /* JADX WARN: Removed duplicated region for block: B:861:0x1943  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x196b  */
    /* JADX WARN: Removed duplicated region for block: B:892:0x186a  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x17fe  */
    /* JADX WARN: Removed duplicated region for block: B:908:0x17e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x17bd  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x17b0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x17ee  */
    /* JADX WARN: Removed duplicated region for block: B:974:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:979:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:992:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:996:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x181b  */
    /* JADX WARN: Type inference failed for: r0v378, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v501, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v502 */
    /* JADX WARN: Type inference failed for: r0v510, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v134, types: [android.text.Spannable, android.text.SpannableStringBuilder, android.text.Spanned, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r24v13, types: [int] */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v21 */
    /* JADX WARN: Type inference failed for: r24v22 */
    /* JADX WARN: Type inference failed for: r24v23 */
    /* JADX WARN: Type inference failed for: r24v24 */
    /* JADX WARN: Type inference failed for: r3v261 */
    /* JADX WARN: Type inference failed for: r3v262, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v311, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v316, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v317 */
    /* JADX WARN: Type inference failed for: r3v319 */
    /* JADX WARN: Type inference failed for: r3v323 */
    /* JADX WARN: Type inference failed for: r3v336 */
    /* JADX WARN: Type inference failed for: r5v145, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v148, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r61v0, types: [android.view.View, org.telegram.ui.Cells.DialogCell] */
    /* JADX WARN: Type inference failed for: r7v164 */
    /* JADX WARN: Type inference failed for: r7v165, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r7v224 */
    /* JADX WARN: Type inference failed for: r7v225 */
    /* JADX WARN: Type inference failed for: r7v226 */
    /* JADX WARN: Type inference failed for: r7v227 */
    /* JADX WARN: Type inference failed for: r8v41, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v31, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildLayout() {
        String str;
        long j;
        String str2;
        CharSequence charSequence;
        int i;
        ?? r13;
        boolean z;
        boolean z2;
        CharSequence charSequence2;
        long j2;
        boolean z3;
        int i2;
        boolean z4;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        TLRPC.DraftMessage draftMessage4;
        CharSequence charSequence3;
        boolean z5;
        int i3;
        boolean z6;
        CharSequence charSequence4;
        String string;
        CharSequence charSequence5;
        boolean z7;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TL_iv.RichMessage richMessage;
        int i4;
        CharSequence charSequence6;
        boolean z8;
        CharSequence charSequence7;
        CharSequence charSequence8;
        TLRPC.Chat chat;
        String str3;
        boolean z9;
        MessageObject messageObject;
        int i5;
        int i6;
        CharSequence charSequence9;
        char c;
        String str4;
        CharSequence charSequence10;
        boolean isChannelAndNotMegaGroup;
        String formatPluralString;
        CharSequence charSequence11;
        int i7;
        char c2;
        String formatPluralString2;
        String str5;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        String str6;
        CharSequence replaceNewLines;
        MessageObject messageObject2;
        TLRPC.Message message;
        String str7;
        int i8;
        CharSequence replaceEmoji;
        CharSequence charSequence15;
        CharSequence highlightText;
        ForegroundColorSpanThemable foregroundColorSpanThemable;
        TLRPC.User user;
        MessageObject messageObject3;
        TLRPC.User user2;
        CharSequence charSequence16;
        CharSequence charSequence17;
        int i9;
        int i10;
        CharSequence formatArchivedDialogNames;
        String str8;
        String string2;
        CharSequence charSequence18;
        String str9;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence string3;
        CharSequence charSequence19;
        CharSequence charSequence20;
        CharSequence charSequence21;
        CharSequence charSequence22;
        CharSequence charSequence23;
        String stringForMessageListDate;
        MessageObject messageObject4;
        boolean z10;
        String str10;
        String str11;
        CharSequence charSequence24;
        CharSequence escape;
        CharSequence charSequence25;
        String str12;
        CharSequence charSequence26;
        String str13;
        boolean z11;
        String str14;
        CharSequence charSequence27;
        CharSequence charSequence28;
        String str15;
        CharSequence topicSpannedName;
        String str16;
        CharSequence charSequence29;
        String str17;
        boolean z12;
        String str18;
        String str19;
        boolean z13;
        CharSequence charSequence30;
        TLRPC.Chat chat2;
        MessageObject messageObject5;
        Spannable spannable;
        int i11;
        int i12;
        float f;
        float f2;
        String str20;
        int i13;
        ?? r24;
        boolean z14;
        int i14;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int measuredWidth;
        int dp;
        int dp2;
        int i15;
        int i16;
        ImageReceiver[] imageReceiverArr;
        DialogCellTags dialogCellTags;
        int dp3;
        String str21;
        int dp4;
        int i17;
        ImageReceiver[] imageReceiverArr2;
        MessageObject messageObject6;
        String str22;
        ?? r7;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i18;
        int lineCount4;
        int lineCount5;
        int lineCount6;
        String str23;
        Layout.Alignment alignment;
        int i19;
        String str24;
        String str25;
        ?? ellipsize;
        CharSequence replaceTwoNewLinesToOne;
        CharSequence highlightText2;
        DialogCellTags dialogCellTags2;
        int dp5;
        int dp6;
        DialogCellTags dialogCellTags3;
        int dp7;
        CharSequence highlightText3;
        String str26;
        boolean z15;
        Object obj;
        SpannableStringBuilder formatInternal;
        boolean z16 = true;
        if (this.isTransitionSupport) {
            return;
        }
        if (this.isDialogCell && !this.updateHelper.update() && this.currentDialogFolderId == 0) {
            str = "**reaction**";
            if (this.currentDialogCommunityId == 0 && this.encryptedChat == null) {
                return;
            }
        } else {
            str = "**reaction**";
        }
        if (!this.useForceThreeLines) {
            int i20 = SharedConfig.PASSCODE_TYPE_PIN;
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
        int color = Theme.getColor(Theme.key_chats_message_threeLines, this.resourcesProvider);
        textPaint.linkColor = color;
        textPaint.setColor(color);
        this.paintIndex = 1;
        this.thumbSize = 18;
        this.currentDialogFolderDialogsCount = 0;
        CharSequence charSequence31 = null;
        if (isForumCell() || !(this.isDialogCell || this.isTopic)) {
            j = 0;
            str2 = "%d";
            charSequence = null;
        } else {
            j = 0;
            str2 = "%d";
            charSequence = MessagesController.getInstance(this.currentAccount).getPrintingString(this.currentDialogId, getTopicId(), true);
        }
        this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
        this.drawNameLock = false;
        this.drawVerified = false;
        this.drawBotVerified = false;
        this.drawPremium = false;
        this.drawForwardIcon = false;
        this.drawGiftIcon = false;
        this.drawScam = 0;
        this.drawPinBackground = false;
        this.thumbsCount = 0;
        this.hasVideoThumb = false;
        this.nameLayoutEllipsizeByGradient = false;
        boolean z17 = (UserObject.isUserSelf(this.user) || this.useMeForMyMessages) ? false : true;
        this.printingStringType = -1;
        if (!isForumCell()) {
            this.buttonLayout = null;
        }
        setOpenBotButton(false);
        if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || this.currentDialogFolderId != 0 || isForumCell() || hasTags()) {
            this.hasNameInMessage = true;
            i = 1;
        } else {
            this.hasNameInMessage = false;
            i = 2;
        }
        MessageObject messageObject7 = this.message;
        if (messageObject7 != null) {
            messageObject7.updateTranslation();
        }
        MessageObject messageObject8 = this.message;
        CharSequence charSequence32 = messageObject8 != null ? messageObject8.messageText : null;
        if (charSequence32 instanceof Spannable) {
            r13 = new SpannableStringBuilder(charSequence32);
            for (URLSpanNoUnderlineBold uRLSpanNoUnderlineBold : (URLSpanNoUnderlineBold[]) r13.getSpans(0, r13.length(), URLSpanNoUnderlineBold.class)) {
                r13.removeSpan(uRLSpanNoUnderlineBold);
            }
            for (URLSpanNoUnderline uRLSpanNoUnderline : (URLSpanNoUnderline[]) r13.getSpans(0, r13.length(), URLSpanNoUnderline.class)) {
                r13.removeSpan(uRLSpanNoUnderline);
            }
        } else {
            r13 = charSequence32;
        }
        this.lastMessageString = r13;
        if (this.isShareToStoryCell) {
            this.drawPinBackground = true;
            z17 = false;
            z = false;
        } else {
            z = true;
        }
        CustomDialog customDialog = this.customDialog;
        if (customDialog != null) {
            if (customDialog.type == 2) {
                this.drawNameLock = true;
                if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                    this.nameLockTop = AndroidUtilities.dp(12.5f);
                    if (!LocaleController.isRTL) {
                        this.nameLockLeft = AndroidUtilities.dp(this.messagePaddingStart + 6);
                        this.nameLeft = AndroidUtilities.dp(this.messagePaddingStart + 10) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                    } else {
                        this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 6)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        this.nameLeft = AndroidUtilities.dp(22.0f);
                    }
                } else {
                    this.nameLockTop = AndroidUtilities.dp(16.5f);
                    if (!LocaleController.isRTL) {
                        this.nameLockLeft = AndroidUtilities.dp(this.messagePaddingStart + 4);
                        this.nameLeft = AndroidUtilities.dp(this.messagePaddingStart + 8) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                    } else {
                        this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 4)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        this.nameLeft = AndroidUtilities.dp(18.0f);
                    }
                }
            } else {
                this.drawVerified = !this.forbidVerified && customDialog.verified;
                if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                    if (!LocaleController.isRTL) {
                        this.nameLeft = AndroidUtilities.dp(this.messagePaddingStart + 6);
                    } else {
                        this.nameLeft = AndroidUtilities.dp(22.0f);
                    }
                } else if (!LocaleController.isRTL) {
                    this.nameLeft = AndroidUtilities.dp(this.messagePaddingStart + 4);
                } else {
                    this.nameLeft = AndroidUtilities.dp(18.0f);
                }
            }
            CustomDialog customDialog2 = this.customDialog;
            if (customDialog2.type == 1) {
                str26 = LocaleController.getString(R.string.FromYou);
                CustomDialog customDialog3 = this.customDialog;
                if (customDialog3.isMedia) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                    formatInternal = formatInternal(i, this.message.messageText, null);
                    formatInternal.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage, this.resourcesProvider), 0, formatInternal.length(), 33);
                } else {
                    String str27 = customDialog3.message;
                    if (str27.length() > 150) {
                        str27 = str27.substring(0, 150);
                    }
                    if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        formatInternal = formatInternal(i, str27, str26);
                    } else {
                        formatInternal = formatInternal(i, str27.replace('\n', ' '), str26);
                    }
                }
                z15 = false;
                obj = Emoji.replaceEmoji(formatInternal, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
            } else {
                Object obj2 = customDialog2.message;
                if (customDialog2.isMedia) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                }
                str26 = null;
                z15 = true;
                obj = obj2;
            }
            stringForMessageListDate = LocaleController.stringForMessageListDate(this.customDialog.date);
            int i21 = this.customDialog.unread_count;
            if (i21 != 0) {
                this.drawCount = true;
                str17 = String.format(str2, Integer.valueOf(i21));
            } else {
                this.drawCount = false;
                str17 = null;
            }
            CustomDialog customDialog4 = this.customDialog;
            int i22 = customDialog4.sent;
            if (i22 == 0) {
                this.drawClock = true;
                this.drawCheck1 = false;
                this.drawCheck2 = false;
            } else if (i22 == 2) {
                this.drawCheck1 = true;
                this.drawCheck2 = true;
                this.drawClock = false;
            } else if (i22 == 1) {
                this.drawCheck1 = false;
                this.drawCheck2 = true;
                this.drawClock = false;
            } else {
                this.drawClock = false;
                this.drawCheck1 = false;
                this.drawCheck2 = false;
            }
            this.drawError = false;
            charSequence24 = customDialog4.name;
            z16 = z15;
            str10 = null;
            i4 = -1;
            spannable = obj;
            str14 = str26;
            z11 = z;
            charSequence29 = "";
        } else {
            String str28 = str2;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                if (!LocaleController.isRTL) {
                    this.nameLeft = AndroidUtilities.dp(this.messagePaddingStart + 6);
                } else {
                    this.nameLeft = AndroidUtilities.dp(22.0f);
                }
            } else if (!LocaleController.isRTL) {
                this.nameLeft = AndroidUtilities.dp(this.messagePaddingStart + 4);
            } else {
                this.nameLeft = AndroidUtilities.dp(18.0f);
            }
            if (this.encryptedChat != null) {
                if (this.currentDialogFolderId == 0) {
                    this.drawNameLock = true;
                    if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        this.nameLockTop = AndroidUtilities.dp(12.5f);
                        if (!LocaleController.isRTL) {
                            this.nameLockLeft = AndroidUtilities.dp(this.messagePaddingStart + 6);
                            this.nameLeft = AndroidUtilities.dp(this.messagePaddingStart + 10) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        } else {
                            this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 6)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                            this.nameLeft = AndroidUtilities.dp(22.0f);
                        }
                    } else {
                        this.nameLockTop = AndroidUtilities.dp(16.5f);
                        if (!LocaleController.isRTL) {
                            this.nameLockLeft = AndroidUtilities.dp(this.messagePaddingStart + 4);
                            this.nameLeft = AndroidUtilities.dp(this.messagePaddingStart + 8) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                            z2 = z;
                            charSequence2 = r13;
                            i2 = this.lastMessageDate;
                            if (i2 == 0 && (messageObject5 = this.message) != null) {
                                i2 = messageObject5.messageOwner.date;
                            }
                            if (!this.isTopic) {
                                boolean z18 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                                this.draftVoice = z18;
                                TLRPC.DraftMessage draft = !z18 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, getTopicId()) : null;
                                this.draftMessage = draft;
                                if (draft != null && TextUtils.isEmpty(draft.message)) {
                                    this.draftMessage = null;
                                }
                            } else if (this.isDialogCell || this.isSavedDialogCell) {
                                boolean z19 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                                this.draftVoice = z19;
                                this.draftMessage = !z19 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, j) : null;
                            } else {
                                this.draftVoice = false;
                                this.draftMessage = null;
                            }
                            z4 = this.draftVoice;
                            if (!z4 || this.draftMessage != null) {
                                if (!z4 && (draftMessage2 = this.draftMessage) != null && TextUtils.isEmpty(draftMessage2.message)) {
                                    draftMessage3 = this.draftMessage;
                                    if (draftMessage3.rich_message == null) {
                                        TLRPC.InputReplyTo inputReplyTo = draftMessage3.reply_to;
                                        if (inputReplyTo == null) {
                                        }
                                        draftMessage4 = null;
                                        this.draftMessage = null;
                                        this.draftVoice = false;
                                        if (isForumCell()) {
                                            this.draftMessage = draftMessage4;
                                            this.draftVoice = false;
                                            this.needEmoji = true;
                                            updateMessageThumbs();
                                            string = ChatObject.isMonoForum(this.chat) ? null : AndroidUtilities.escape(getMessageNameString());
                                            if (ChatObject.isMonoForum(this.chat)) {
                                                if (i == 1) {
                                                    i = 2;
                                                }
                                                string = null;
                                                if (i == 3) {
                                                    i = 4;
                                                }
                                            }
                                            CharSequence formatTopicsNames = formatTopicsNames();
                                            MessageObject messageObject9 = this.message;
                                            String messageStringFormatted = this.message != null ? getMessageStringFormatted(i, messageObject9 != null ? MessagesController.getInstance(messageObject9.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason) : null, string, true) : "";
                                            CharSequence charSequence33 = messageStringFormatted;
                                            if (this.applyName) {
                                                int length = messageStringFormatted.length();
                                                charSequence33 = messageStringFormatted;
                                                charSequence33 = messageStringFormatted;
                                                if (length >= 0 && string != null) {
                                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(messageStringFormatted);
                                                    valueOf.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_name, this.resourcesProvider), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                                    charSequence33 = valueOf;
                                                }
                                            }
                                            this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                            z6 = z17;
                                            charSequence4 = "d ";
                                            charSequence21 = "";
                                            z8 = z2;
                                            charSequence30 = formatTopicsNames;
                                            charSequence22 = charSequence33;
                                        } else if (!TextUtils.isEmpty(this.customMessage)) {
                                            this.draftMessage = null;
                                            this.draftVoice = false;
                                            String str29 = this.customMessage;
                                            this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                            z6 = z17;
                                            charSequence4 = "d ";
                                            charSequence21 = "";
                                            z8 = z2;
                                            string = null;
                                            charSequence22 = null;
                                            charSequence30 = str29;
                                        } else {
                                            if (charSequence != null) {
                                                this.lastPrintString = charSequence;
                                                int intValue = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.currentDialogId, getTopicId()).intValue();
                                                this.printingStringType = intValue;
                                                StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(intValue);
                                                int intrinsicWidth = chatStatusDrawable != null ? chatStatusDrawable.getIntrinsicWidth() + AndroidUtilities.dp(3.0f) : 0;
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                CharSequence replace = TextUtils.replace(charSequence, new String[]{"..."}, new String[]{""});
                                                int indexOf = this.printingStringType == 5 ? replace.toString().indexOf("**oo**") : -1;
                                                if (indexOf >= 0) {
                                                    spannableStringBuilder.append(replace).setSpan(new FixedWidthSpan(Theme.getChatStatusDrawable(this.printingStringType).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                                } else {
                                                    spannableStringBuilder.append((CharSequence) " ").append(replace).setSpan(new FixedWidthSpan(intrinsicWidth), 0, 1, 0);
                                                }
                                                i3 = indexOf;
                                                z5 = false;
                                                charSequence3 = spannableStringBuilder;
                                            } else {
                                                this.lastPrintString = null;
                                                this.printingStringType = -1;
                                                charSequence3 = "";
                                                z5 = true;
                                                i3 = -1;
                                            }
                                            if (this.draftVoice || this.draftMessage != null) {
                                                int i23 = i3;
                                                z6 = z17;
                                                charSequence4 = "d ";
                                                string = LocaleController.getString(R.string.Draft);
                                                TLRPC.DraftMessage draftMessage5 = this.draftMessage;
                                                if (draftMessage5 != null && TextUtils.isEmpty(draftMessage5.message) && this.draftMessage.rich_message == null) {
                                                    if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                                        i4 = i23;
                                                        charSequence6 = "";
                                                        z8 = z2;
                                                        charSequence7 = null;
                                                        z16 = false;
                                                        string3 = charSequence6;
                                                        charSequence23 = charSequence3;
                                                    } else {
                                                        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                                        valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string.length(), 33);
                                                        charSequence8 = valueOf2;
                                                    }
                                                } else {
                                                    TLRPC.DraftMessage draftMessage6 = this.draftMessage;
                                                    if (draftMessage6 != null && (richMessage = draftMessage6.rich_message) != null) {
                                                        charSequence5 = MessageObject.formatRichMessage(richMessage, false, false, 150);
                                                    } else if (this.draftVoice) {
                                                        charSequence5 = LocaleController.getString(R.string.AttachAudio);
                                                    } else if (draftMessage6 != null) {
                                                        charSequence5 = draftMessage6.message;
                                                        if (charSequence5.length() > 150) {
                                                            charSequence5 = charSequence5.subSequence(0, 150);
                                                        }
                                                    } else {
                                                        charSequence5 = "";
                                                    }
                                                    SpannableString spannableString = new SpannableString(charSequence5);
                                                    TLRPC.DraftMessage draftMessage7 = this.draftMessage;
                                                    if (draftMessage7 != null) {
                                                        MediaDataController.addTextStyleRuns(draftMessage7, spannableString, NotificationCenter.didApplyNewTheme);
                                                        TLRPC.DraftMessage draftMessage8 = this.draftMessage;
                                                        if (draftMessage8 != null && (arrayList = draftMessage8.entities) != null) {
                                                            TextPaint textPaint2 = this.currentMessagePaint;
                                                            MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint2 == null ? null : textPaint2.getFontMetricsInt());
                                                        }
                                                    } else if (this.draftVoice) {
                                                        spannableString.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, this.resourcesProvider), 0, spannableString.length(), 33);
                                                    }
                                                    SpannableStringBuilder formatInternal2 = formatInternal(i, AndroidUtilities.replaceNewLines(spannableString), string);
                                                    if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                                        z7 = false;
                                                    } else {
                                                        z7 = false;
                                                        formatInternal2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string.length() + 1, 33);
                                                    }
                                                    charSequence8 = Emoji.replaceEmoji(formatInternal2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), z7);
                                                }
                                                i4 = i23;
                                                charSequence6 = charSequence8;
                                                z8 = z2;
                                                charSequence7 = null;
                                                z16 = false;
                                                string3 = charSequence6;
                                                charSequence23 = charSequence3;
                                            } else {
                                                if (this.clearingDialog) {
                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                    charSequence20 = LocaleController.getString(R.string.HistoryCleared);
                                                } else {
                                                    MessageObject messageObject10 = this.message;
                                                    if (messageObject10 != null) {
                                                        String restrictionReason = MessagesController.getInstance(messageObject10.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
                                                        long fromChatId = this.message.getFromChatId();
                                                        if (DialogObject.isUserDialog(fromChatId)) {
                                                            MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                                                            chat = null;
                                                        } else {
                                                            chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
                                                        }
                                                        this.drawCount2 = true;
                                                        if (this.dialogsType == 0 && this.currentDialogId > 0 && this.message.isOutOwner() && (tL_messageReactions = this.message.messageOwner.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.reactionMentionCount > 0) {
                                                            TLRPC.MessagePeerReaction messagePeerReaction = this.message.messageOwner.reactions.recent_reactions.get(0);
                                                            if (messagePeerReaction.unread) {
                                                                long j3 = messagePeerReaction.peer_id.user_id;
                                                                if (j3 != 0 && j3 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                                    ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(messagePeerReaction.reaction);
                                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                    String str30 = fromTL.emojicon;
                                                                    if (str30 != null) {
                                                                        z9 = true;
                                                                        str3 = LocaleController.formatString(R.string.ReactionInDialog, str30);
                                                                    } else {
                                                                        String formatString = LocaleController.formatString(R.string.ReactionInDialog, str);
                                                                        String str31 = str;
                                                                        int indexOf2 = formatString.indexOf(str31);
                                                                        ?? spannableStringBuilder2 = new SpannableStringBuilder(formatString.replace(str31, "d"));
                                                                        long j4 = fromTL.documentId;
                                                                        TextPaint textPaint3 = this.currentMessagePaint;
                                                                        spannableStringBuilder2.setSpan(new AnimatedEmojiSpan(j4, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                                        str3 = spannableStringBuilder2;
                                                                        z9 = true;
                                                                    }
                                                                    if (z9) {
                                                                        int i24 = this.dialogsType;
                                                                        if (i24 == 2) {
                                                                            TLRPC.Chat chat3 = this.chat;
                                                                            if (chat3 != null) {
                                                                                if (ChatObject.isChannel(chat3)) {
                                                                                    TLRPC.Chat chat4 = this.chat;
                                                                                    if (!chat4.megagroup) {
                                                                                        int i25 = chat4.participants_count;
                                                                                        if (i25 != 0) {
                                                                                            string2 = LocaleController.formatPluralStringComma("Subscribers", i25);
                                                                                        } else if (!ChatObject.isPublic(chat4)) {
                                                                                            string2 = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                                                                        } else {
                                                                                            string2 = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                TLRPC.Chat chat5 = this.chat;
                                                                                int i26 = chat5.participants_count;
                                                                                if (i26 != 0) {
                                                                                    string2 = LocaleController.formatPluralStringComma("Members", i26);
                                                                                } else if (chat5.has_geo) {
                                                                                    string2 = LocaleController.getString(R.string.MegaLocation);
                                                                                } else if (!ChatObject.isPublic(chat5)) {
                                                                                    string2 = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                                                                } else {
                                                                                    string2 = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                                }
                                                                            } else {
                                                                                string2 = "";
                                                                            }
                                                                            this.drawCount2 = false;
                                                                        } else if (i24 == 3 && UserObject.isUserSelf(this.user)) {
                                                                            DialogsActivity dialogsActivity = this.parentFragment;
                                                                            string2 = LocaleController.getString((dialogsActivity == null || !dialogsActivity.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                        } else {
                                                                            boolean z20 = this.useForceThreeLines;
                                                                            if (!z20 && !SharedConfig.useThreeLinesLayout && this.currentDialogCommunityId != 0) {
                                                                                formatArchivedDialogNames = formatCommunityDialogNames();
                                                                            } else if (!z20 && !SharedConfig.useThreeLinesLayout && this.currentDialogFolderId != 0) {
                                                                                formatArchivedDialogNames = formatArchivedDialogNames();
                                                                            } else {
                                                                                MessageObject messageObject11 = this.message;
                                                                                if ((messageObject11.messageOwner instanceof TLRPC.TL_messageService) && (!MessageObject.isTopicActionMessage(messageObject11) || (this.message.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                    MessageObject messageObject12 = this.message;
                                                                                    TLRPC.MessageAction messageAction = messageObject12.messageOwner.action;
                                                                                    if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                        TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                        if (messageObject12.isOutOwner()) {
                                                                                            if (tL_messageActionPhoneCall.video) {
                                                                                                i10 = R.drawable.dialog_media_outgoing_video_call_20;
                                                                                            } else {
                                                                                                i10 = R.drawable.dialog_media_outgoing_call_20;
                                                                                            }
                                                                                            charSequence16 = DialogMediaIconsHelper.addDialogMediaSpan(charSequence2, i10, false);
                                                                                        } else {
                                                                                            CharSequence charSequence34 = charSequence2;
                                                                                            if (tL_messageActionPhoneCall.video) {
                                                                                                i9 = R.drawable.dialog_media_incoming_video_call_20;
                                                                                            } else {
                                                                                                i9 = R.drawable.dialog_media_incoming_call_20;
                                                                                            }
                                                                                            charSequence16 = DialogMediaIconsHelper.addDialogMediaSpan(charSequence34, i9, false);
                                                                                        }
                                                                                    } else {
                                                                                        CharSequence charSequence35 = charSequence2;
                                                                                        if (ChatObject.isChannelAndNotMegaGroup(this.chat) && (this.message.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                            charSequence16 = "";
                                                                                            z17 = false;
                                                                                        } else {
                                                                                            CharSequence charSequence36 = this.message.messageTextShort;
                                                                                            charSequence16 = charSequence36 != null ? charSequence36 : charSequence35;
                                                                                        }
                                                                                    }
                                                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                    if (this.message.type == 21) {
                                                                                        updateMessageThumbs();
                                                                                        i5 = i3;
                                                                                        z6 = z17;
                                                                                        charSequence17 = applyThumbs(charSequence16);
                                                                                    } else {
                                                                                        i5 = i3;
                                                                                        z6 = z17;
                                                                                        charSequence17 = charSequence16;
                                                                                    }
                                                                                } else {
                                                                                    CharSequence charSequence37 = charSequence2;
                                                                                    this.needEmoji = true;
                                                                                    updateMessageThumbs();
                                                                                    String escape2 = (this.isSavedDialog || (user2 = this.user) == null || !user2.self || this.message.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                                    if ((!this.isSavedDialog || (user = this.user) == null || user.self || (messageObject3 = this.message) == null || !messageObject3.isOutOwner()) && escape2 == null && ((messageObject = this.message) == null || (message = messageObject.messageOwner) == null || message.guestchat_via_from == null)) {
                                                                                        TLRPC.Chat chat6 = this.chat;
                                                                                        if (chat6 != null) {
                                                                                            long j5 = chat6.id;
                                                                                            if (j5 > 0) {
                                                                                                i5 = i3;
                                                                                                z6 = z17;
                                                                                                if (chat != null) {
                                                                                                }
                                                                                                if (ChatObject.isChannel(chat6)) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i5 = i3;
                                                                                        z6 = z17;
                                                                                        TLRPC.User user3 = this.user;
                                                                                        if (user3 == null || user3.id != UserObject.VERIFY || (messageObject2 = this.message) == null || messageObject2.getForwardedFromId() == null) {
                                                                                            boolean isEmpty = TextUtils.isEmpty(restrictionReason);
                                                                                            CharSequence charSequence38 = restrictionReason;
                                                                                            if (isEmpty) {
                                                                                                if (MessageObject.isTopicActionMessage(this.message)) {
                                                                                                    MessageObject messageObject13 = this.message;
                                                                                                    CharSequence charSequence39 = messageObject13.messageTextShort;
                                                                                                    if (charSequence39 == null || ((messageObject13.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.isTopic)) {
                                                                                                        charSequence39 = messageObject13.messageText;
                                                                                                    }
                                                                                                    CharSequence charSequence40 = charSequence39;
                                                                                                    charSequence38 = charSequence40;
                                                                                                    if (messageObject13.topicIconDrawable[0] instanceof ForumBubbleDrawable) {
                                                                                                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-this.message.getDialogId(), MessageObject.getTopicId(this.currentAccount, this.message.messageOwner, true));
                                                                                                        charSequence38 = charSequence40;
                                                                                                        if (findTopic != null) {
                                                                                                            ((ForumBubbleDrawable) this.message.topicIconDrawable[0]).setColor(findTopic.icon_color);
                                                                                                            charSequence38 = charSequence40;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    TLRPC.MessageMedia messageMedia = this.message.messageOwner.media;
                                                                                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                        charSequence38 = LocaleController.getString(R.string.AttachPhotoExpired);
                                                                                                    } else {
                                                                                                        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                            TLRPC.Document document = messageMedia.document;
                                                                                                            if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                                if (messageMedia.voice) {
                                                                                                                    charSequence38 = LocaleController.getString(R.string.AttachVoiceExpired);
                                                                                                                } else if (messageMedia.round) {
                                                                                                                    charSequence38 = LocaleController.getString(R.string.AttachRoundExpired);
                                                                                                                } else {
                                                                                                                    charSequence38 = LocaleController.getString(R.string.AttachVideoExpired);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        if (getCaptionMessage() != null && !(this.message.messageOwner.media instanceof TLRPC.TL_messageMediaPoll)) {
                                                                                                            MessageObject captionMessage = getCaptionMessage();
                                                                                                            if (!this.needEmoji) {
                                                                                                                str5 = "";
                                                                                                            } else if (captionMessage.isVideo()) {
                                                                                                                str5 = "📹 ";
                                                                                                            } else if (captionMessage.isVoice()) {
                                                                                                                str5 = "🎤 ";
                                                                                                            } else if (captionMessage.isMusic()) {
                                                                                                                str5 = "🎧 ";
                                                                                                            } else if (captionMessage.isPhoto()) {
                                                                                                                str5 = "🖼 ";
                                                                                                            } else {
                                                                                                                str5 = "📎 ";
                                                                                                            }
                                                                                                            if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                                                                                                                CharSequence charSequence41 = captionMessage.messageTrimmedToHighlight;
                                                                                                                int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 47);
                                                                                                                if (this.hasNameInMessage) {
                                                                                                                    if (!TextUtils.isEmpty(null)) {
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    measuredWidth2 = (int) (measuredWidth2 - this.currentMessagePaint.measureText(": "));
                                                                                                                }
                                                                                                                if (measuredWidth2 > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                                    charSequence41 = AndroidUtilities.ellipsizeCenterEnd(charSequence41, captionMessage.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                                }
                                                                                                                i6 = 150;
                                                                                                                charSequence11 = new SpannableStringBuilder(str5).append(charSequence41);
                                                                                                            } else {
                                                                                                                i6 = 150;
                                                                                                                SpannableString spannableString2 = new SpannableString(captionMessage.caption);
                                                                                                                if (captionMessage.messageOwner != null) {
                                                                                                                    captionMessage.spoilLoginCode();
                                                                                                                    MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString2, NotificationCenter.didApplyNewTheme);
                                                                                                                    ArrayList<TLRPC.MessageEntity> arrayList3 = captionMessage.messageOwner.entities;
                                                                                                                    TextPaint textPaint4 = this.currentMessagePaint;
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(arrayList3, spannableString2, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                                }
                                                                                                                charSequence11 = new SpannableStringBuilder(str5).append((CharSequence) spannableString2);
                                                                                                            }
                                                                                                        } else {
                                                                                                            i6 = 150;
                                                                                                            MessageObject messageObject14 = this.message;
                                                                                                            TLRPC.Message message2 = messageObject14.messageOwner;
                                                                                                            TLRPC.MessageMedia messageMedia2 = message2.media;
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                                int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                                if (this.hasVideoThumb) {
                                                                                                                    i7 = 1;
                                                                                                                    if (size > 1) {
                                                                                                                        c2 = 0;
                                                                                                                        formatPluralString2 = LocaleController.formatPluralString("Media", size, new Object[0]);
                                                                                                                    } else {
                                                                                                                        c2 = 0;
                                                                                                                        formatPluralString2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i7 = 1;
                                                                                                                    c2 = 0;
                                                                                                                    formatPluralString2 = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                                }
                                                                                                                int i27 = R.string.AttachPaidMedia;
                                                                                                                Object[] objArr = new Object[i7];
                                                                                                                objArr[c2] = formatPluralString2;
                                                                                                                SpannableStringBuilder replaceStars = StarsIntroActivity.replaceStars(LocaleController.formatString(i27, objArr));
                                                                                                                this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                                charSequence11 = replaceStars;
                                                                                                            } else if (this.thumbsCount > 1) {
                                                                                                                if (this.hasVideoThumb) {
                                                                                                                    ArrayList arrayList4 = this.groupMessages;
                                                                                                                    formatPluralString = LocaleController.formatPluralString("Media", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                                } else {
                                                                                                                    ArrayList arrayList5 = this.groupMessages;
                                                                                                                    formatPluralString = LocaleController.formatPluralString("Photos", arrayList5 == null ? 0 : arrayList5.size(), new Object[0]);
                                                                                                                }
                                                                                                                charSequence11 = formatPluralString;
                                                                                                                this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                            } else {
                                                                                                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                    TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                                                                                                                    if (messageFwdHeader != null) {
                                                                                                                        TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                        if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                            isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, this.currentAccount);
                                                                                                                            charSequence10 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.chat);
                                                                                                                    charSequence10 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                    charSequence10 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                                                                                                                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                                                                                                                        SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                        MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                                                                                                                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                                        charSequence10 = DialogMediaIconsHelper.addDialogMediaSpan(spannableString3, R.drawable.dialog_media_poll_20, false);
                                                                                                                    } else {
                                                                                                                        charSequence10 = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities.text, R.drawable.dialog_media_poll_20, false);
                                                                                                                    }
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                                                                                                                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                                                                                                                        SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                        MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                                                                                                                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                                        charSequence10 = DialogMediaIconsHelper.addDialogMediaSpan(spannableString4, R.drawable.dialog_media_checklist_20, false);
                                                                                                                    } else {
                                                                                                                        charSequence10 = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities3.text, R.drawable.dialog_media_checklist_20, false);
                                                                                                                    }
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                    charSequence10 = DialogMediaIconsHelper.addDialogMediaSpan(messageMedia2.game.title, R.drawable.dialog_media_game_20, false);
                                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                    charSequence10 = messageMedia2.title;
                                                                                                                } else if (messageObject14.type == 14) {
                                                                                                                    charSequence10 = String.format("🎧 %s - %s", messageObject14.getMusicAuthor(), this.message.getMusicTitle());
                                                                                                                } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaStory) && messageMedia2.via_mention) {
                                                                                                                    if (messageObject14.isOut()) {
                                                                                                                        TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.message.getDialogId()));
                                                                                                                        if (user4 != null) {
                                                                                                                            str4 = UserObject.getFirstName(user4);
                                                                                                                            int indexOf3 = str4.indexOf(32);
                                                                                                                            c = 0;
                                                                                                                            if (indexOf3 >= 0) {
                                                                                                                                str4 = str4.substring(0, indexOf3);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            c = 0;
                                                                                                                            str4 = "";
                                                                                                                        }
                                                                                                                        int i28 = R.string.StoryYouMentionInDialog;
                                                                                                                        Object[] objArr2 = new Object[1];
                                                                                                                        objArr2[c] = str4;
                                                                                                                        charSequence10 = LocaleController.formatString(i28, objArr2);
                                                                                                                    } else {
                                                                                                                        charSequence10 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (messageObject14.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                                                        CharSequence charSequence42 = this.message.messageTrimmedToHighlight;
                                                                                                                        int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 23);
                                                                                                                        MessageObject messageObject15 = this.message;
                                                                                                                        charSequence9 = charSequence42;
                                                                                                                        if (messageObject15.messageTrimmedToHighlightCut) {
                                                                                                                            charSequence9 = AndroidUtilities.ellipsizeCenterEnd(charSequence42, messageObject15.highlightedWords.get(0), measuredWidth3, this.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        SpannableString spannableString5 = new SpannableString(charSequence37);
                                                                                                                        MessageObject messageObject16 = this.message;
                                                                                                                        if (messageObject16 != null) {
                                                                                                                            messageObject16.spoilLoginCode();
                                                                                                                        }
                                                                                                                        MediaDataController.addTextStyleRuns(this.message, spannableString5, NotificationCenter.didApplyNewTheme);
                                                                                                                        MessageObject messageObject17 = this.message;
                                                                                                                        charSequence9 = spannableString5;
                                                                                                                        if (messageObject17 != null) {
                                                                                                                            TLRPC.Message message3 = messageObject17.messageOwner;
                                                                                                                            charSequence9 = spannableString5;
                                                                                                                            if (message3 != null) {
                                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList6 = message3.entities;
                                                                                                                                TextPaint textPaint5 = this.currentMessagePaint;
                                                                                                                                MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                                                charSequence9 = spannableString5;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    AndroidUtilities.highlightText(charSequence9, this.message.highlightedWords, this.resourcesProvider);
                                                                                                                    charSequence10 = charSequence9;
                                                                                                                }
                                                                                                                CharSequence charSequence43 = charSequence10;
                                                                                                                MessageObject messageObject18 = this.message;
                                                                                                                if (messageObject18.messageOwner.media == null || messageObject18.isMediaEmpty()) {
                                                                                                                    TL_iv.RichMessage richMessage2 = this.message.messageOwner.rich_message;
                                                                                                                    charSequence11 = charSequence43;
                                                                                                                    if (richMessage2 != null) {
                                                                                                                        charSequence11 = charSequence43;
                                                                                                                        if (richMessage2.blocks.size() == 1) {
                                                                                                                            charSequence11 = charSequence43;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                                charSequence11 = charSequence43;
                                                                                                            }
                                                                                                        }
                                                                                                        if (this.message.isReplyToStory()) {
                                                                                                            charSequence4 = "d ";
                                                                                                            charSequence12 = charSequence11;
                                                                                                        } else {
                                                                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(charSequence11);
                                                                                                            charSequence4 = "d ";
                                                                                                            spannableStringBuilder3.insert(0, charSequence4);
                                                                                                            spannableStringBuilder3.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                                            charSequence12 = spannableStringBuilder3;
                                                                                                        }
                                                                                                        charSequence13 = charSequence12;
                                                                                                        if (this.thumbsCount > 0) {
                                                                                                            if (this.message.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                                                replaceNewLines = this.message.messageTrimmedToHighlight;
                                                                                                                int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(((this.messagePaddingStart + 23) + ((this.thumbSize + 2) * this.thumbsCount)) + 3);
                                                                                                                MessageObject messageObject19 = this.message;
                                                                                                                if (messageObject19.messageTrimmedToHighlightCut) {
                                                                                                                    replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject19.highlightedWords.get(0), measuredWidth4, this.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                                }
                                                                                                            } else {
                                                                                                                int length2 = charSequence12.length();
                                                                                                                CharSequence charSequence44 = charSequence12;
                                                                                                                if (length2 > i6) {
                                                                                                                    charSequence44 = charSequence12.subSequence(0, i6);
                                                                                                                }
                                                                                                                replaceNewLines = AndroidUtilities.replaceNewLines(charSequence44);
                                                                                                            }
                                                                                                            CharSequence spannableStringBuilder4 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                                            SpannableStringBuilder spannableStringBuilder5 = (SpannableStringBuilder) spannableStringBuilder4;
                                                                                                            spannableStringBuilder5.insert(0, (CharSequence) " ");
                                                                                                            spannableStringBuilder5.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 3)), 0, 1, 33);
                                                                                                            Emoji.replaceEmoji(spannableStringBuilder5, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                                            CharSequence charSequence45 = spannableStringBuilder4;
                                                                                                            if (this.message.hasHighlightedWords()) {
                                                                                                                CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder5, this.message.highlightedWords, this.resourcesProvider);
                                                                                                                charSequence45 = spannableStringBuilder4;
                                                                                                                if (highlightText4 != null) {
                                                                                                                    charSequence45 = highlightText4;
                                                                                                                }
                                                                                                            }
                                                                                                            z5 = false;
                                                                                                            charSequence13 = charSequence45;
                                                                                                        }
                                                                                                        if (this.message.isForwarded() || !this.message.needDrawForwarded()) {
                                                                                                            charSequence14 = charSequence13;
                                                                                                        } else {
                                                                                                            this.drawForwardIcon = true;
                                                                                                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence13);
                                                                                                            spannableStringBuilder6.insert(0, charSequence4);
                                                                                                            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                                            coloredImageSpan.setAlpha(0.9f);
                                                                                                            spannableStringBuilder6.setSpan(coloredImageSpan, 0, 1, 0);
                                                                                                            charSequence14 = spannableStringBuilder6;
                                                                                                        }
                                                                                                        z8 = z2;
                                                                                                        str6 = null;
                                                                                                        charSequence18 = charSequence14;
                                                                                                        if (this.currentDialogCommunityId != 0) {
                                                                                                            str9 = formatCommunityDialogNames();
                                                                                                        } else if (this.currentDialogFolderId != 0) {
                                                                                                            str9 = formatArchivedDialogNames();
                                                                                                        } else {
                                                                                                            i4 = i5;
                                                                                                            charSequence7 = null;
                                                                                                            z16 = z5;
                                                                                                            string = str6;
                                                                                                            string3 = charSequence18;
                                                                                                            charSequence23 = charSequence3;
                                                                                                        }
                                                                                                        i4 = i5;
                                                                                                        z16 = z5;
                                                                                                        string = str9;
                                                                                                        charSequence7 = null;
                                                                                                        string3 = charSequence18;
                                                                                                        charSequence23 = charSequence3;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            i6 = 150;
                                                                                            charSequence11 = charSequence38;
                                                                                            if (this.message.isReplyToStory()) {
                                                                                            }
                                                                                            charSequence13 = charSequence12;
                                                                                            if (this.thumbsCount > 0) {
                                                                                            }
                                                                                            if (this.message.isForwarded()) {
                                                                                            }
                                                                                            charSequence14 = charSequence13;
                                                                                            z8 = z2;
                                                                                            str6 = null;
                                                                                            charSequence18 = charSequence14;
                                                                                            if (this.currentDialogCommunityId != 0) {
                                                                                            }
                                                                                            i4 = i5;
                                                                                            z16 = z5;
                                                                                            string = str9;
                                                                                            charSequence7 = null;
                                                                                            string3 = charSequence18;
                                                                                            charSequence23 = charSequence3;
                                                                                        }
                                                                                    } else {
                                                                                        i5 = i3;
                                                                                        z6 = z17;
                                                                                    }
                                                                                    charSequence4 = "d ";
                                                                                    if (escape2 == null) {
                                                                                        escape2 = getMessageNameString();
                                                                                    }
                                                                                    String escape3 = AndroidUtilities.escape(escape2);
                                                                                    TLRPC.Chat chat7 = this.chat;
                                                                                    if (chat7 != null && chat7.forum && !this.isTopic && !this.useFromUserAsAvatar) {
                                                                                        CharSequence topicIconName = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint);
                                                                                        if (!TextUtils.isEmpty(topicIconName)) {
                                                                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder("-");
                                                                                            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                            coloredImageSpan2.setColorKey((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? -1 : Theme.key_chats_nameMessage);
                                                                                            spannableStringBuilder7.setSpan(coloredImageSpan2, 0, 1, 0);
                                                                                            ?? spannableStringBuilder8 = new SpannableStringBuilder();
                                                                                            spannableStringBuilder8.append(escape3).append((CharSequence) spannableStringBuilder7).append(topicIconName);
                                                                                            str7 = spannableStringBuilder8;
                                                                                            SpannableStringBuilder messageStringFormatted2 = getMessageStringFormatted(i, restrictionReason, str7, false);
                                                                                            if (!this.useFromUserAsAvatar || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && (this.currentDialogFolderId == 0 || messageStringFormatted2.length() <= 0))) {
                                                                                                i8 = 0;
                                                                                            } else {
                                                                                                try {
                                                                                                    foregroundColorSpanThemable = new ForegroundColorSpanThemable(Theme.key_chats_nameMessage, this.resourcesProvider);
                                                                                                    i8 = str7.length() + 1;
                                                                                                } catch (Exception e) {
                                                                                                    e = e;
                                                                                                    i8 = 0;
                                                                                                }
                                                                                                try {
                                                                                                    messageStringFormatted2.setSpan(foregroundColorSpanThemable, 0, i8, 33);
                                                                                                } catch (Exception e2) {
                                                                                                    e = e2;
                                                                                                    FileLog.e(e);
                                                                                                    replaceEmoji = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                                    if (this.message.hasHighlightedWords()) {
                                                                                                    }
                                                                                                    if (this.thumbsCount > 0) {
                                                                                                    }
                                                                                                    charSequence15 = replaceEmoji;
                                                                                                    z8 = z2;
                                                                                                    str8 = str7;
                                                                                                    z5 = false;
                                                                                                    charSequence18 = charSequence15;
                                                                                                    str6 = str8;
                                                                                                    if (this.currentDialogCommunityId != 0) {
                                                                                                    }
                                                                                                    i4 = i5;
                                                                                                    z16 = z5;
                                                                                                    string = str9;
                                                                                                    charSequence7 = null;
                                                                                                    string3 = charSequence18;
                                                                                                    charSequence23 = charSequence3;
                                                                                                    CharSequence charSequence46 = string3;
                                                                                                    if (!this.drawForwardIcon) {
                                                                                                    }
                                                                                                    if (TextUtils.isEmpty(this.customMessage)) {
                                                                                                    }
                                                                                                    stringForMessageListDate = "";
                                                                                                    messageObject4 = this.message;
                                                                                                    if (messageObject4 != null) {
                                                                                                    }
                                                                                                    this.drawCheck1 = false;
                                                                                                    this.drawCheck2 = false;
                                                                                                    this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                                                                                    z10 = false;
                                                                                                    this.drawCount = false;
                                                                                                    this.drawMention = false;
                                                                                                    this.drawReactionMention = false;
                                                                                                    this.drawPollVotesMention = false;
                                                                                                    this.drawError = false;
                                                                                                    str10 = null;
                                                                                                    str11 = null;
                                                                                                    this.promoDialog = z10;
                                                                                                    MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                                                                                                    CharSequence charSequence47 = charSequence46;
                                                                                                    if (this.dialogsType == 0) {
                                                                                                    }
                                                                                                    charSequence24 = this.titleOverride;
                                                                                                    if (charSequence24 == null) {
                                                                                                    }
                                                                                                    str14 = string;
                                                                                                    z11 = z8;
                                                                                                    charSequence27 = charSequence47;
                                                                                                    charSequence29 = charSequence23;
                                                                                                    charSequence31 = charSequence7;
                                                                                                    str17 = str11;
                                                                                                    spannable = charSequence27;
                                                                                                    if (!z11) {
                                                                                                    }
                                                                                                    if (drawLock2()) {
                                                                                                    }
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    if (this.drawNameLock) {
                                                                                                    }
                                                                                                    if (!this.drawClock) {
                                                                                                    }
                                                                                                    this.nameAdditionalsForChannelSubscriber = i13;
                                                                                                    if (this.dialogMuted) {
                                                                                                    }
                                                                                                    if (!this.drawPremium) {
                                                                                                    }
                                                                                                    if (!z14) {
                                                                                                    }
                                                                                                    if (this.drawBotVerified) {
                                                                                                    }
                                                                                                    i14 = this.namePaddingEnd;
                                                                                                    if (i14 > 0) {
                                                                                                    }
                                                                                                    dp7 = this.nameWidth - AndroidUtilities.dp(12.0f);
                                                                                                    if (dp7 < 0) {
                                                                                                    }
                                                                                                    if (charSequence24 instanceof String) {
                                                                                                    }
                                                                                                    if (!this.nameLayoutEllipsizeByGradient) {
                                                                                                    }
                                                                                                    float f8 = dp7;
                                                                                                    this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(charSequence24.toString()) <= f8;
                                                                                                    if (!this.twoLinesForName) {
                                                                                                    }
                                                                                                    CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence24, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                                    MessageObject messageObject20 = this.message;
                                                                                                    if (messageObject20 == null) {
                                                                                                    }
                                                                                                    if (!this.twoLinesForName) {
                                                                                                    }
                                                                                                    this.nameLayoutTranslateX = (this.nameLayoutEllipsizeByGradient || !this.nameLayout.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(36.0f);
                                                                                                    this.nameLayoutEllipsizeLeft = this.nameLayout.isRtlCharAt(0);
                                                                                                    f4 = r24;
                                                                                                    this.animatedEmojiStackName = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStackName, this.nameLayout);
                                                                                                    if (!this.useForceThreeLines) {
                                                                                                    }
                                                                                                    f5 = 13.0f;
                                                                                                    f6 = 20.0f;
                                                                                                    f7 = 5.0f;
                                                                                                    int dp8 = AndroidUtilities.dp(11.0f);
                                                                                                    this.messageNameTop = AndroidUtilities.dp(32.0f);
                                                                                                    this.timeTop = AndroidUtilities.dp(13.0f);
                                                                                                    this.errorTop = AndroidUtilities.dp(42.33f);
                                                                                                    this.pinTop = AndroidUtilities.dp(43.0f);
                                                                                                    this.countTop = AndroidUtilities.dp(42.33f);
                                                                                                    this.checkDrawTop = AndroidUtilities.dp(13.0f);
                                                                                                    measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    i15 = dp8;
                                                                                                    this.storyParams.originalAvatarRect.set(dp, dp8, dp + AndroidUtilities.dp(56.0f), i15 + AndroidUtilities.dp(56.0f));
                                                                                                    i16 = 0;
                                                                                                    while (true) {
                                                                                                        imageReceiverArr = this.thumbImage;
                                                                                                        if (i16 >= imageReceiverArr.length) {
                                                                                                        }
                                                                                                        imageReceiverArr[i16].setImageCoords(((this.thumbSize + 2) * i16) + dp2, ((i15 + AndroidUtilities.dp(31.0f)) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                                                                                        i16++;
                                                                                                    }
                                                                                                    if (LocaleController.isRTL) {
                                                                                                    }
                                                                                                    if (this.twoLinesForName) {
                                                                                                    }
                                                                                                    if (!this.useForceThreeLines) {
                                                                                                        this.timeTop -= AndroidUtilities.dp(f4);
                                                                                                        this.checkDrawTop -= AndroidUtilities.dp(f4);
                                                                                                        if (getIsPinned()) {
                                                                                                        }
                                                                                                        if (!this.drawError) {
                                                                                                        }
                                                                                                        if (z16) {
                                                                                                        }
                                                                                                        int max = Math.max(AndroidUtilities.dp(12.0f), measuredWidth);
                                                                                                        this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                        if (!this.useForceThreeLines) {
                                                                                                            this.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
                                                                                                            if (isForumCell()) {
                                                                                                            }
                                                                                                            if (this.twoLinesForName) {
                                                                                                            }
                                                                                                            this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                                            this.buttonCreated = false;
                                                                                                            if (TextUtils.isEmpty(charSequence31)) {
                                                                                                            }
                                                                                                        }
                                                                                                        this.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
                                                                                                        if (isForumCell()) {
                                                                                                        }
                                                                                                        if (this.twoLinesForName) {
                                                                                                        }
                                                                                                        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                                        this.buttonCreated = false;
                                                                                                        if (TextUtils.isEmpty(charSequence31)) {
                                                                                                        }
                                                                                                    }
                                                                                                    this.timeTop -= AndroidUtilities.dp(f4);
                                                                                                    this.checkDrawTop -= AndroidUtilities.dp(f4);
                                                                                                    if (getIsPinned()) {
                                                                                                    }
                                                                                                    if (!this.drawError) {
                                                                                                    }
                                                                                                    if (z16) {
                                                                                                    }
                                                                                                    int max2 = Math.max(AndroidUtilities.dp(12.0f), measuredWidth);
                                                                                                    this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                    if (!this.useForceThreeLines) {
                                                                                                    }
                                                                                                    this.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
                                                                                                    if (isForumCell()) {
                                                                                                    }
                                                                                                    if (this.twoLinesForName) {
                                                                                                    }
                                                                                                    this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                                    this.buttonCreated = false;
                                                                                                    if (TextUtils.isEmpty(charSequence31)) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            replaceEmoji = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                            if (this.message.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(replaceEmoji, this.message.highlightedWords, this.resourcesProvider)) != null) {
                                                                                                replaceEmoji = highlightText;
                                                                                            }
                                                                                            if (this.thumbsCount > 0) {
                                                                                                if (!(replaceEmoji instanceof SpannableStringBuilder)) {
                                                                                                    replaceEmoji = new SpannableStringBuilder(replaceEmoji);
                                                                                                }
                                                                                                SpannableStringBuilder spannableStringBuilder9 = (SpannableStringBuilder) replaceEmoji;
                                                                                                if (i8 >= spannableStringBuilder9.length()) {
                                                                                                    spannableStringBuilder9.append((CharSequence) " ");
                                                                                                    spannableStringBuilder9.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), spannableStringBuilder9.length() - 1, spannableStringBuilder9.length(), 33);
                                                                                                } else {
                                                                                                    spannableStringBuilder9.insert(i8, (CharSequence) " ");
                                                                                                    spannableStringBuilder9.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), i8, i8 + 1, 33);
                                                                                                }
                                                                                            }
                                                                                            charSequence15 = replaceEmoji;
                                                                                            z8 = z2;
                                                                                            str8 = str7;
                                                                                            z5 = false;
                                                                                            charSequence18 = charSequence15;
                                                                                            str6 = str8;
                                                                                            if (this.currentDialogCommunityId != 0) {
                                                                                            }
                                                                                            i4 = i5;
                                                                                            z16 = z5;
                                                                                            string = str9;
                                                                                            charSequence7 = null;
                                                                                            string3 = charSequence18;
                                                                                            charSequence23 = charSequence3;
                                                                                        }
                                                                                    }
                                                                                    str7 = escape3;
                                                                                    SpannableStringBuilder messageStringFormatted22 = getMessageStringFormatted(i, restrictionReason, str7, false);
                                                                                    if (this.useFromUserAsAvatar) {
                                                                                    }
                                                                                    i8 = 0;
                                                                                    replaceEmoji = Emoji.replaceEmoji(messageStringFormatted22, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                    if (this.message.hasHighlightedWords()) {
                                                                                        replaceEmoji = highlightText;
                                                                                    }
                                                                                    if (this.thumbsCount > 0) {
                                                                                    }
                                                                                    charSequence15 = replaceEmoji;
                                                                                    z8 = z2;
                                                                                    str8 = str7;
                                                                                    z5 = false;
                                                                                    charSequence18 = charSequence15;
                                                                                    str6 = str8;
                                                                                    if (this.currentDialogCommunityId != 0) {
                                                                                    }
                                                                                    i4 = i5;
                                                                                    z16 = z5;
                                                                                    string = str9;
                                                                                    charSequence7 = null;
                                                                                    string3 = charSequence18;
                                                                                    charSequence23 = charSequence3;
                                                                                }
                                                                            }
                                                                            i5 = i3;
                                                                            z6 = z17;
                                                                            charSequence4 = "d ";
                                                                            z8 = z2;
                                                                            str8 = null;
                                                                            charSequence15 = formatArchivedDialogNames;
                                                                            z5 = false;
                                                                            charSequence18 = charSequence15;
                                                                            str6 = str8;
                                                                            if (this.currentDialogCommunityId != 0) {
                                                                            }
                                                                            i4 = i5;
                                                                            z16 = z5;
                                                                            string = str9;
                                                                            charSequence7 = null;
                                                                            string3 = charSequence18;
                                                                            charSequence23 = charSequence3;
                                                                        }
                                                                        i5 = i3;
                                                                        charSequence18 = string2;
                                                                        charSequence4 = "d ";
                                                                        z8 = false;
                                                                        str6 = null;
                                                                        z6 = false;
                                                                        if (this.currentDialogCommunityId != 0) {
                                                                        }
                                                                        i4 = i5;
                                                                        z16 = z5;
                                                                        string = str9;
                                                                        charSequence7 = null;
                                                                        string3 = charSequence18;
                                                                        charSequence23 = charSequence3;
                                                                    } else {
                                                                        i5 = i3;
                                                                        z6 = z17;
                                                                        charSequence17 = str3;
                                                                    }
                                                                    charSequence4 = "d ";
                                                                    z8 = z2;
                                                                    str6 = null;
                                                                    charSequence18 = charSequence17;
                                                                    if (this.currentDialogCommunityId != 0) {
                                                                    }
                                                                    i4 = i5;
                                                                    z16 = z5;
                                                                    string = str9;
                                                                    charSequence7 = null;
                                                                    string3 = charSequence18;
                                                                    charSequence23 = charSequence3;
                                                                }
                                                            }
                                                        }
                                                        str3 = "";
                                                        z9 = false;
                                                        if (z9) {
                                                        }
                                                        charSequence4 = "d ";
                                                        z8 = z2;
                                                        str6 = null;
                                                        charSequence18 = charSequence17;
                                                        if (this.currentDialogCommunityId != 0) {
                                                        }
                                                        i4 = i5;
                                                        z16 = z5;
                                                        string = str9;
                                                        charSequence7 = null;
                                                        string3 = charSequence18;
                                                        charSequence23 = charSequence3;
                                                    } else if (this.currentDialogCommunityId != 0) {
                                                        charSequence20 = formatCommunityDialogNames();
                                                    } else if (this.currentDialogFolderId != 0) {
                                                        charSequence20 = formatArchivedDialogNames();
                                                    } else {
                                                        TLRPC.EncryptedChat encryptedChat = this.encryptedChat;
                                                        if (encryptedChat != null) {
                                                            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                            if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                                charSequence20 = LocaleController.getString(R.string.EncryptionProcessing);
                                                            } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                                charSequence20 = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(this.user));
                                                            } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                                charSequence20 = LocaleController.getString(R.string.EncryptionRejected);
                                                            } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                                if (encryptedChat.admin_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                                    charSequence20 = LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(this.user));
                                                                } else {
                                                                    charSequence20 = LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                                }
                                                            }
                                                        } else if (this.dialogsType == 3 && UserObject.isUserSelf(this.user)) {
                                                            DialogsActivity dialogsActivity2 = this.parentFragment;
                                                            z16 = z5;
                                                            i4 = i3;
                                                            string3 = LocaleController.getString((dialogsActivity2 == null || !dialogsActivity2.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                            charSequence4 = "d ";
                                                            string = null;
                                                            charSequence7 = null;
                                                            z8 = false;
                                                            z6 = false;
                                                            charSequence23 = charSequence3;
                                                        }
                                                        z16 = z5;
                                                        i4 = i3;
                                                        z6 = z17;
                                                        charSequence4 = "d ";
                                                        charSequence19 = "";
                                                        z8 = z2;
                                                        string = null;
                                                        charSequence7 = null;
                                                        string3 = charSequence19;
                                                        charSequence23 = charSequence3;
                                                    }
                                                }
                                                z16 = z5;
                                                i4 = i3;
                                                z6 = z17;
                                                charSequence19 = charSequence20;
                                                charSequence4 = "d ";
                                                z8 = z2;
                                                string = null;
                                                charSequence7 = null;
                                                string3 = charSequence19;
                                                charSequence23 = charSequence3;
                                            }
                                            CharSequence charSequence462 = string3;
                                            if (!this.drawForwardIcon) {
                                                charSequence462 = string3;
                                                if (!isFolderCell()) {
                                                    charSequence462 = string3;
                                                    if (!isForumCell()) {
                                                        charSequence462 = string3;
                                                        if (!isDialogFolder()) {
                                                            charSequence462 = string3;
                                                            if (this.draftMessage == null) {
                                                                MessageObject messageObject21 = this.message;
                                                                charSequence462 = string3;
                                                                if (messageObject21 != null) {
                                                                    TLRPC.Message message4 = messageObject21.messageOwner;
                                                                    charSequence462 = string3;
                                                                    if (message4 != null) {
                                                                        charSequence462 = string3;
                                                                        if (message4.action instanceof TLRPC.TL_messageActionStarGift) {
                                                                            this.drawGiftIcon = true;
                                                                            SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(string3);
                                                                            spannableStringBuilder10.insert(0, charSequence4);
                                                                            ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_gift).mutate());
                                                                            coloredImageSpan3.setScale(1.25f, 1.25f);
                                                                            coloredImageSpan3.spaceScaleX = 0.9f;
                                                                            coloredImageSpan3.setAlpha(0.9f);
                                                                            spannableStringBuilder10.setSpan(coloredImageSpan3, 0, 1, 0);
                                                                            TLRPC.TL_textWithEntities tL_textWithEntities5 = ((TLRPC.TL_messageActionStarGift) this.message.messageOwner.action).message;
                                                                            if (tL_textWithEntities5 != null && !TextUtils.isEmpty(tL_textWithEntities5.text)) {
                                                                                this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                                                            }
                                                                            charSequence462 = spannableStringBuilder10;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (TextUtils.isEmpty(this.customMessage)) {
                                                if (this.draftMessage != null) {
                                                    stringForMessageListDate = LocaleController.stringForMessageListDate(r4.date);
                                                } else {
                                                    int i29 = this.lastMessageDate;
                                                    if (i29 != 0) {
                                                        stringForMessageListDate = LocaleController.stringForMessageListDate(i29);
                                                    } else {
                                                        if (this.message != null) {
                                                            stringForMessageListDate = LocaleController.stringForMessageListDate(r4.messageOwner.date);
                                                        }
                                                    }
                                                }
                                                messageObject4 = this.message;
                                                if (messageObject4 != null || this.isSavedDialog) {
                                                    this.drawCheck1 = false;
                                                    this.drawCheck2 = false;
                                                    this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                                    z10 = false;
                                                    this.drawCount = false;
                                                    this.drawMention = false;
                                                    this.drawReactionMention = false;
                                                    this.drawPollVotesMention = false;
                                                    this.drawError = false;
                                                    str10 = null;
                                                    str11 = null;
                                                } else {
                                                    if (this.currentDialogFolderId != 0) {
                                                        int i30 = this.unreadCount;
                                                        int i31 = this.mentionCount;
                                                        int i32 = i30 + i31;
                                                        if (i32 <= 0) {
                                                            z13 = false;
                                                            this.drawCount = false;
                                                            this.drawMention = false;
                                                            str10 = null;
                                                        } else if (i30 > i31) {
                                                            this.drawCount = true;
                                                            z13 = false;
                                                            this.drawMention = false;
                                                            str11 = String.format(str28, Integer.valueOf(i32));
                                                            str10 = null;
                                                            this.drawReactionMention = z13;
                                                            this.drawPollVotesMention = z13;
                                                        } else {
                                                            z13 = false;
                                                            this.drawCount = false;
                                                            this.drawMention = true;
                                                            str10 = String.format(str28, Integer.valueOf(i32));
                                                        }
                                                        str11 = null;
                                                        this.drawReactionMention = z13;
                                                        this.drawPollVotesMention = z13;
                                                    } else {
                                                        if (this.clearingDialog) {
                                                            this.drawCount = false;
                                                            str18 = null;
                                                            z12 = true;
                                                            z6 = false;
                                                        } else {
                                                            int i33 = this.unreadCount;
                                                            if (i33 != 0) {
                                                                z12 = true;
                                                                this.drawCount = true;
                                                                str18 = String.format(str28, Integer.valueOf(i33));
                                                            } else {
                                                                z12 = true;
                                                                if (this.markUnread) {
                                                                    this.drawCount = true;
                                                                    str18 = "";
                                                                } else {
                                                                    this.drawCount = false;
                                                                    str18 = null;
                                                                }
                                                            }
                                                        }
                                                        if (this.mentionCount != 0) {
                                                            this.drawMention = z12;
                                                            str19 = "@";
                                                        } else {
                                                            this.drawMention = false;
                                                            str19 = null;
                                                        }
                                                        this.drawReactionMention = this.reactionMentionCount > 0;
                                                        this.drawPollVotesMention = this.pollVotesMentionCount > 0;
                                                        String str32 = str19;
                                                        str11 = str18;
                                                        str10 = str32;
                                                    }
                                                    if (this.message.isOut() && this.draftMessage == null && z6) {
                                                        MessageObject messageObject22 = this.message;
                                                        if (!(messageObject22.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                            if (messageObject22.isSending()) {
                                                                z10 = false;
                                                                this.drawCheck1 = false;
                                                                this.drawCheck2 = false;
                                                                this.drawClock = true;
                                                                this.drawError = false;
                                                            } else {
                                                                z10 = false;
                                                                if (this.message.isSendError()) {
                                                                    this.drawCheck1 = false;
                                                                    this.drawCheck2 = false;
                                                                    this.drawClock = false;
                                                                    this.drawError = true;
                                                                    this.drawCount = false;
                                                                    this.drawMention = false;
                                                                } else if (this.message.isSent()) {
                                                                    TLRPC.TL_forumTopic tL_forumTopic = this.forumTopic;
                                                                    if (tL_forumTopic != null) {
                                                                        this.drawCheck1 = tL_forumTopic.read_outbox_max_id >= this.message.getId();
                                                                    } else if (this.isDialogCell) {
                                                                        int i34 = this.readOutboxMaxId;
                                                                        this.drawCheck1 = (i34 > 0 && i34 >= this.message.getId()) || !this.message.isUnread() || (ChatObject.isChannel(this.chat) && !this.chat.megagroup);
                                                                    } else {
                                                                        this.drawCheck1 = !this.message.isUnread() || (ChatObject.isChannel(this.chat) && !this.chat.megagroup);
                                                                    }
                                                                    this.drawCheck2 = true;
                                                                    z10 = false;
                                                                    this.drawClock = false;
                                                                    this.drawError = false;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z10 = false;
                                                    this.drawCheck1 = false;
                                                    this.drawCheck2 = false;
                                                    this.drawClock = false;
                                                    this.drawError = false;
                                                }
                                                this.promoDialog = z10;
                                                MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                                                CharSequence charSequence472 = charSequence462;
                                                if (this.dialogsType == 0) {
                                                    charSequence472 = charSequence462;
                                                    if (messagesController2.isPromoDialog(this.currentDialogId, true)) {
                                                        this.drawPinBackground = true;
                                                        this.promoDialog = true;
                                                        int i35 = messagesController2.promoDialogType;
                                                        if (i35 == MessagesController.PROMO_TYPE_PROXY) {
                                                            stringForMessageListDate = LocaleController.getString(R.string.UseProxySponsor);
                                                            charSequence472 = charSequence462;
                                                        } else {
                                                            charSequence472 = charSequence462;
                                                            if (i35 == MessagesController.PROMO_TYPE_PSA) {
                                                                stringForMessageListDate = LocaleController.getString("PsaType_" + messagesController2.promoPsaType);
                                                                if (TextUtils.isEmpty(stringForMessageListDate)) {
                                                                    stringForMessageListDate = LocaleController.getString(R.string.PsaTypeDefault);
                                                                }
                                                                charSequence472 = charSequence462;
                                                                if (!TextUtils.isEmpty(messagesController2.promoPsaMessage)) {
                                                                    String str33 = messagesController2.promoPsaMessage;
                                                                    this.thumbsCount = 0;
                                                                    charSequence472 = str33;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                charSequence24 = this.titleOverride;
                                                if (charSequence24 == null) {
                                                    if (this.currentDialogFolderId != 0) {
                                                        charSequence24 = LocaleController.getString(R.string.ArchivedChats);
                                                    } else {
                                                        TLRPC.Chat chat8 = this.chat;
                                                        if (chat8 != null) {
                                                            if (this.useFromUserAsAvatar) {
                                                                if (this.topicIconInName == null) {
                                                                    this.topicIconInName = new Drawable[1];
                                                                }
                                                                this.topicIconInName[0] = null;
                                                                topicSpannedName = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint, this.topicIconInName);
                                                                String str34 = string;
                                                                str16 = str34;
                                                                if (topicSpannedName == null) {
                                                                    charSequence28 = charSequence472;
                                                                    str15 = str34;
                                                                    charSequence24 = "";
                                                                    str13 = str15;
                                                                    charSequence26 = charSequence28;
                                                                }
                                                            } else if (this.isTopic) {
                                                                if (this.topicIconInName == null) {
                                                                    this.topicIconInName = new Drawable[1];
                                                                }
                                                                Drawable[] drawableArr = this.topicIconInName;
                                                                drawableArr[0] = null;
                                                                topicSpannedName = this.showTopicIconInName ? ForumUtilities.getTopicSpannedName(this.forumTopic, Theme.dialogs_namePaint[this.paintIndex], drawableArr, false) : AndroidUtilities.escape(this.forumTopic.title);
                                                                str16 = string;
                                                            } else {
                                                                if (chat8.monoforum && chat8.linked_monoforum_id != 0) {
                                                                    TLRPC.Chat chat9 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.linked_monoforum_id));
                                                                    if (chat9 != null) {
                                                                        SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(AndroidUtilities.escape(chat9.title));
                                                                        spannableStringBuilder11.append((CharSequence) " ");
                                                                        int length3 = spannableStringBuilder11.length();
                                                                        int i36 = R.string.MonoforumSpan;
                                                                        spannableStringBuilder11.append((CharSequence) LocaleController.getString(i36));
                                                                        str13 = string;
                                                                        charSequence26 = charSequence472;
                                                                        spannableStringBuilder11.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i36), 9.33f, Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider), length3, spannableStringBuilder11.length(), 33);
                                                                        charSequence24 = spannableStringBuilder11;
                                                                    } else {
                                                                        str12 = string;
                                                                        charSequence25 = charSequence472;
                                                                        escape = AndroidUtilities.escape(this.chat.title);
                                                                    }
                                                                } else {
                                                                    str12 = string;
                                                                    charSequence25 = charSequence472;
                                                                    escape = AndroidUtilities.escape(chat8.title);
                                                                }
                                                                charSequence24 = escape;
                                                                str13 = str12;
                                                                charSequence26 = charSequence25;
                                                            }
                                                            charSequence24 = topicSpannedName;
                                                            charSequence26 = charSequence472;
                                                            str13 = str16;
                                                        } else {
                                                            String str35 = string;
                                                            CharSequence charSequence48 = charSequence472;
                                                            TLRPC.User user5 = this.user;
                                                            str15 = str35;
                                                            charSequence28 = charSequence48;
                                                            if (user5 != null) {
                                                                if (UserObject.isReplyUser(user5)) {
                                                                    escape = LocaleController.getString(R.string.RepliesTitle);
                                                                    str12 = str35;
                                                                    charSequence25 = charSequence48;
                                                                } else if (UserObject.isAnonymous(this.user)) {
                                                                    escape = LocaleController.getString(R.string.AnonymousForward);
                                                                    str12 = str35;
                                                                    charSequence25 = charSequence48;
                                                                } else if (UserObject.isUserSelf(this.user) && !this.isMonoForumTopicDialog) {
                                                                    if (this.isSavedDialog) {
                                                                        escape = LocaleController.getString(R.string.MyNotes);
                                                                        str12 = str35;
                                                                        charSequence25 = charSequence48;
                                                                    } else if (this.useMeForMyMessages) {
                                                                        escape = LocaleController.getString(R.string.FromYou);
                                                                        str12 = str35;
                                                                        charSequence25 = charSequence48;
                                                                    } else {
                                                                        if (this.dialogsType == 3) {
                                                                            this.drawPinBackground = true;
                                                                        }
                                                                        escape = LocaleController.getString(R.string.SavedMessages);
                                                                        str12 = str35;
                                                                        charSequence25 = charSequence48;
                                                                    }
                                                                } else if (this.isTopic) {
                                                                    if (this.topicIconInName == null) {
                                                                        this.topicIconInName = new Drawable[1];
                                                                    }
                                                                    Drawable[] drawableArr2 = this.topicIconInName;
                                                                    drawableArr2[0] = null;
                                                                    if (this.showTopicIconInName) {
                                                                        escape = ForumUtilities.getTopicSpannedName(this.forumTopic, Theme.dialogs_namePaint[this.paintIndex], drawableArr2, false);
                                                                        str12 = str35;
                                                                        charSequence25 = charSequence48;
                                                                    } else {
                                                                        escape = AndroidUtilities.escape(this.forumTopic.title);
                                                                        str12 = str35;
                                                                        charSequence25 = charSequence48;
                                                                    }
                                                                } else {
                                                                    escape = AndroidUtilities.escape(UserObject.getUserName(this.user));
                                                                    str12 = str35;
                                                                    charSequence25 = charSequence48;
                                                                }
                                                                charSequence24 = escape;
                                                                str13 = str12;
                                                                charSequence26 = charSequence25;
                                                            }
                                                            charSequence24 = "";
                                                            str13 = str15;
                                                            charSequence26 = charSequence28;
                                                        }
                                                        if (charSequence24 != null && charSequence24.length() == 0) {
                                                            charSequence24 = LocaleController.getString(R.string.HiddenName);
                                                        }
                                                        z11 = z8;
                                                        str14 = str13;
                                                        charSequence27 = charSequence26;
                                                        charSequence29 = charSequence23;
                                                        charSequence31 = charSequence7;
                                                        str17 = str11;
                                                        spannable = charSequence27;
                                                    }
                                                }
                                                str14 = string;
                                                z11 = z8;
                                                charSequence27 = charSequence472;
                                                charSequence29 = charSequence23;
                                                charSequence31 = charSequence7;
                                                str17 = str11;
                                                spannable = charSequence27;
                                            }
                                            stringForMessageListDate = "";
                                            messageObject4 = this.message;
                                            if (messageObject4 != null) {
                                            }
                                            this.drawCheck1 = false;
                                            this.drawCheck2 = false;
                                            this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                            z10 = false;
                                            this.drawCount = false;
                                            this.drawMention = false;
                                            this.drawReactionMention = false;
                                            this.drawPollVotesMention = false;
                                            this.drawError = false;
                                            str10 = null;
                                            str11 = null;
                                            this.promoDialog = z10;
                                            MessagesController messagesController22 = MessagesController.getInstance(this.currentAccount);
                                            CharSequence charSequence4722 = charSequence462;
                                            if (this.dialogsType == 0) {
                                            }
                                            charSequence24 = this.titleOverride;
                                            if (charSequence24 == null) {
                                            }
                                            str14 = string;
                                            z11 = z8;
                                            charSequence27 = charSequence4722;
                                            charSequence29 = charSequence23;
                                            charSequence31 = charSequence7;
                                            str17 = str11;
                                            spannable = charSequence27;
                                        }
                                        i4 = -1;
                                        string3 = charSequence30;
                                        charSequence7 = charSequence22;
                                        charSequence23 = charSequence21;
                                        CharSequence charSequence4622 = string3;
                                        if (!this.drawForwardIcon) {
                                        }
                                        if (TextUtils.isEmpty(this.customMessage)) {
                                        }
                                        stringForMessageListDate = "";
                                        messageObject4 = this.message;
                                        if (messageObject4 != null) {
                                        }
                                        this.drawCheck1 = false;
                                        this.drawCheck2 = false;
                                        this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                        z10 = false;
                                        this.drawCount = false;
                                        this.drawMention = false;
                                        this.drawReactionMention = false;
                                        this.drawPollVotesMention = false;
                                        this.drawError = false;
                                        str10 = null;
                                        str11 = null;
                                        this.promoDialog = z10;
                                        MessagesController messagesController222 = MessagesController.getInstance(this.currentAccount);
                                        CharSequence charSequence47222 = charSequence4622;
                                        if (this.dialogsType == 0) {
                                        }
                                        charSequence24 = this.titleOverride;
                                        if (charSequence24 == null) {
                                        }
                                        str14 = string;
                                        z11 = z8;
                                        charSequence27 = charSequence47222;
                                        charSequence29 = charSequence23;
                                        charSequence31 = charSequence7;
                                        str17 = str11;
                                        spannable = charSequence27;
                                    }
                                }
                                draftMessage = this.draftMessage;
                                if (draftMessage != null) {
                                    if (i2 > draftMessage.date) {
                                    }
                                }
                            }
                            if (ChatObject.isChannel(this.chat)) {
                                TLRPC.Chat chat10 = this.chat;
                                if (!chat10.megagroup) {
                                    if (!chat10.creator) {
                                        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat10.admin_rights;
                                        if (tL_chatAdminRights != null) {
                                        }
                                        draftMessage4 = null;
                                        this.draftMessage = null;
                                        this.draftVoice = false;
                                        if (isForumCell()) {
                                        }
                                        i4 = -1;
                                        string3 = charSequence30;
                                        charSequence7 = charSequence22;
                                        charSequence23 = charSequence21;
                                        CharSequence charSequence46222 = string3;
                                        if (!this.drawForwardIcon) {
                                        }
                                        if (TextUtils.isEmpty(this.customMessage)) {
                                        }
                                        stringForMessageListDate = "";
                                        messageObject4 = this.message;
                                        if (messageObject4 != null) {
                                        }
                                        this.drawCheck1 = false;
                                        this.drawCheck2 = false;
                                        this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                        z10 = false;
                                        this.drawCount = false;
                                        this.drawMention = false;
                                        this.drawReactionMention = false;
                                        this.drawPollVotesMention = false;
                                        this.drawError = false;
                                        str10 = null;
                                        str11 = null;
                                        this.promoDialog = z10;
                                        MessagesController messagesController2222 = MessagesController.getInstance(this.currentAccount);
                                        CharSequence charSequence472222 = charSequence46222;
                                        if (this.dialogsType == 0) {
                                        }
                                        charSequence24 = this.titleOverride;
                                        if (charSequence24 == null) {
                                        }
                                        str14 = string;
                                        z11 = z8;
                                        charSequence27 = charSequence472222;
                                        charSequence29 = charSequence23;
                                        charSequence31 = charSequence7;
                                        str17 = str11;
                                        spannable = charSequence27;
                                    }
                                }
                            }
                            chat2 = this.chat;
                            if ((chat2 != null || (!chat2.left && !chat2.kicked)) && !this.forbidDraft && (!ChatObject.isForum(chat2) || this.isTopic)) {
                                draftMessage4 = null;
                                if (isForumCell()) {
                                }
                                i4 = -1;
                                string3 = charSequence30;
                                charSequence7 = charSequence22;
                                charSequence23 = charSequence21;
                                CharSequence charSequence462222 = string3;
                                if (!this.drawForwardIcon) {
                                }
                                if (TextUtils.isEmpty(this.customMessage)) {
                                }
                                stringForMessageListDate = "";
                                messageObject4 = this.message;
                                if (messageObject4 != null) {
                                }
                                this.drawCheck1 = false;
                                this.drawCheck2 = false;
                                this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                z10 = false;
                                this.drawCount = false;
                                this.drawMention = false;
                                this.drawReactionMention = false;
                                this.drawPollVotesMention = false;
                                this.drawError = false;
                                str10 = null;
                                str11 = null;
                                this.promoDialog = z10;
                                MessagesController messagesController22222 = MessagesController.getInstance(this.currentAccount);
                                CharSequence charSequence4722222 = charSequence462222;
                                if (this.dialogsType == 0) {
                                }
                                charSequence24 = this.titleOverride;
                                if (charSequence24 == null) {
                                }
                                str14 = string;
                                z11 = z8;
                                charSequence27 = charSequence4722222;
                                charSequence29 = charSequence23;
                                charSequence31 = charSequence7;
                                str17 = str11;
                                spannable = charSequence27;
                            }
                            draftMessage4 = null;
                            this.draftMessage = null;
                            this.draftVoice = false;
                            if (isForumCell()) {
                            }
                            i4 = -1;
                            string3 = charSequence30;
                            charSequence7 = charSequence22;
                            charSequence23 = charSequence21;
                            CharSequence charSequence4622222 = string3;
                            if (!this.drawForwardIcon) {
                            }
                            if (TextUtils.isEmpty(this.customMessage)) {
                            }
                            stringForMessageListDate = "";
                            messageObject4 = this.message;
                            if (messageObject4 != null) {
                            }
                            this.drawCheck1 = false;
                            this.drawCheck2 = false;
                            this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                            z10 = false;
                            this.drawCount = false;
                            this.drawMention = false;
                            this.drawReactionMention = false;
                            this.drawPollVotesMention = false;
                            this.drawError = false;
                            str10 = null;
                            str11 = null;
                            this.promoDialog = z10;
                            MessagesController messagesController222222 = MessagesController.getInstance(this.currentAccount);
                            CharSequence charSequence47222222 = charSequence4622222;
                            if (this.dialogsType == 0) {
                            }
                            charSequence24 = this.titleOverride;
                            if (charSequence24 == null) {
                            }
                            str14 = string;
                            z11 = z8;
                            charSequence27 = charSequence47222222;
                            charSequence29 = charSequence23;
                            charSequence31 = charSequence7;
                            str17 = str11;
                            spannable = charSequence27;
                        } else {
                            this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 4)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                            this.nameLeft = AndroidUtilities.dp(18.0f);
                        }
                    }
                }
                z2 = z;
                charSequence2 = r13;
                i2 = this.lastMessageDate;
                if (i2 == 0) {
                    i2 = messageObject5.messageOwner.date;
                }
                if (!this.isTopic) {
                }
                z4 = this.draftVoice;
                if (!z4) {
                }
                if (!z4) {
                    draftMessage3 = this.draftMessage;
                    if (draftMessage3.rich_message == null) {
                    }
                }
                draftMessage = this.draftMessage;
                if (draftMessage != null) {
                }
                if (ChatObject.isChannel(this.chat)) {
                }
                chat2 = this.chat;
                if (chat2 != null) {
                }
                draftMessage4 = null;
                if (isForumCell()) {
                }
                i4 = -1;
                string3 = charSequence30;
                charSequence7 = charSequence22;
                charSequence23 = charSequence21;
                CharSequence charSequence46222222 = string3;
                if (!this.drawForwardIcon) {
                }
                if (TextUtils.isEmpty(this.customMessage)) {
                }
                stringForMessageListDate = "";
                messageObject4 = this.message;
                if (messageObject4 != null) {
                }
                this.drawCheck1 = false;
                this.drawCheck2 = false;
                this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                z10 = false;
                this.drawCount = false;
                this.drawMention = false;
                this.drawReactionMention = false;
                this.drawPollVotesMention = false;
                this.drawError = false;
                str10 = null;
                str11 = null;
                this.promoDialog = z10;
                MessagesController messagesController2222222 = MessagesController.getInstance(this.currentAccount);
                CharSequence charSequence472222222 = charSequence46222222;
                if (this.dialogsType == 0) {
                }
                charSequence24 = this.titleOverride;
                if (charSequence24 == null) {
                }
                str14 = string;
                z11 = z8;
                charSequence27 = charSequence472222222;
                charSequence29 = charSequence23;
                charSequence31 = charSequence7;
                str17 = str11;
                spannable = charSequence27;
            } else {
                if (this.currentDialogFolderId == 0 && !this.isTopic) {
                    TLRPC.Chat chat11 = this.chat;
                    if (chat11 != null) {
                        long botVerificationIcon = DialogObject.getBotVerificationIcon(chat11);
                        TLRPC.Chat chat12 = this.chat;
                        if (chat12.scam) {
                            this.drawScam = 1;
                            Theme.dialogs_scamDrawable.checkText();
                        } else if (chat12.fake) {
                            this.drawScam = 2;
                            Theme.dialogs_fakeDrawable.checkText();
                        } else {
                            if (DialogObject.getEmojiStatusDocumentId(chat12.emoji_status) != j) {
                                this.drawPremium = true;
                                this.nameLayoutEllipsizeByGradient = true;
                                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
                                swapAnimatedEmojiDrawable.center = LocaleController.isRTL;
                                z2 = z;
                                swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), false);
                                this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), false);
                            } else {
                                z2 = z;
                                boolean z21 = this.forbidVerified;
                                this.drawVerified = !z21 && this.chat.verified;
                                this.drawBotVerified = (z21 || this.chat.bot_verification_icon == j) ? false : true;
                            }
                            charSequence2 = r13;
                            j2 = botVerificationIcon;
                        }
                        z2 = z;
                        charSequence2 = r13;
                        j2 = botVerificationIcon;
                    } else {
                        z2 = z;
                        TLRPC.User user6 = this.user;
                        if (user6 != null) {
                            j2 = DialogObject.getBotVerificationIcon(user6);
                            TLRPC.User user7 = this.user;
                            if (user7.scam) {
                                this.drawScam = 1;
                                Theme.dialogs_scamDrawable.checkText();
                            } else if (user7.fake) {
                                this.drawScam = 2;
                                Theme.dialogs_fakeDrawable.checkText();
                            } else {
                                boolean z22 = this.forbidVerified;
                                this.drawVerified = !z22 && user7.verified;
                                this.drawBotVerified = (z22 || UserObject.isUserSelf(user7) || this.user.bot_verification_icon == j) ? false : true;
                            }
                            if (MessagesController.getInstance(this.currentAccount).isPremiumUser(this.user)) {
                                long j6 = UserConfig.getInstance(this.currentAccount).clientUserId;
                                charSequence2 = r13;
                                long j7 = this.user.id;
                                if (j6 != j7 && j7 != j) {
                                    z3 = true;
                                    this.drawPremium = z3;
                                    if (z3) {
                                        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(this.user);
                                        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiStatus;
                                        swapAnimatedEmojiDrawable2.center = LocaleController.isRTL;
                                        if (emojiStatusDocumentId != null) {
                                            this.nameLayoutEllipsizeByGradient = true;
                                            swapAnimatedEmojiDrawable2.set(emojiStatusDocumentId.longValue(), false);
                                            this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), false);
                                        } else {
                                            this.nameLayoutEllipsizeByGradient = true;
                                            swapAnimatedEmojiDrawable2.set(PremiumGradient.getInstance().premiumStarDrawableMini, false);
                                            this.emojiStatus.setParticles(false, false);
                                        }
                                    }
                                }
                            } else {
                                charSequence2 = r13;
                            }
                            z3 = false;
                            this.drawPremium = z3;
                            if (z3) {
                            }
                        } else {
                            charSequence2 = r13;
                            j2 = j;
                        }
                    }
                    if (j2 != j && this.drawBotVerified) {
                        this.botVerification.set(j2, false);
                    }
                    i2 = this.lastMessageDate;
                    if (i2 == 0) {
                    }
                    if (!this.isTopic) {
                    }
                    z4 = this.draftVoice;
                    if (!z4) {
                    }
                    if (!z4) {
                    }
                    draftMessage = this.draftMessage;
                    if (draftMessage != null) {
                    }
                    if (ChatObject.isChannel(this.chat)) {
                    }
                    chat2 = this.chat;
                    if (chat2 != null) {
                    }
                    draftMessage4 = null;
                    if (isForumCell()) {
                    }
                    i4 = -1;
                    string3 = charSequence30;
                    charSequence7 = charSequence22;
                    charSequence23 = charSequence21;
                    CharSequence charSequence462222222 = string3;
                    if (!this.drawForwardIcon) {
                    }
                    if (TextUtils.isEmpty(this.customMessage)) {
                    }
                    stringForMessageListDate = "";
                    messageObject4 = this.message;
                    if (messageObject4 != null) {
                    }
                    this.drawCheck1 = false;
                    this.drawCheck2 = false;
                    this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                    z10 = false;
                    this.drawCount = false;
                    this.drawMention = false;
                    this.drawReactionMention = false;
                    this.drawPollVotesMention = false;
                    this.drawError = false;
                    str10 = null;
                    str11 = null;
                    this.promoDialog = z10;
                    MessagesController messagesController22222222 = MessagesController.getInstance(this.currentAccount);
                    CharSequence charSequence4722222222 = charSequence462222222;
                    if (this.dialogsType == 0) {
                    }
                    charSequence24 = this.titleOverride;
                    if (charSequence24 == null) {
                    }
                    str14 = string;
                    z11 = z8;
                    charSequence27 = charSequence4722222222;
                    charSequence29 = charSequence23;
                    charSequence31 = charSequence7;
                    str17 = str11;
                    spannable = charSequence27;
                }
                z2 = z;
                charSequence2 = r13;
                i2 = this.lastMessageDate;
                if (i2 == 0) {
                }
                if (!this.isTopic) {
                }
                z4 = this.draftVoice;
                if (!z4) {
                }
                if (!z4) {
                }
                draftMessage = this.draftMessage;
                if (draftMessage != null) {
                }
                if (ChatObject.isChannel(this.chat)) {
                }
                chat2 = this.chat;
                if (chat2 != null) {
                }
                draftMessage4 = null;
                if (isForumCell()) {
                }
                i4 = -1;
                string3 = charSequence30;
                charSequence7 = charSequence22;
                charSequence23 = charSequence21;
                CharSequence charSequence4622222222 = string3;
                if (!this.drawForwardIcon) {
                }
                if (TextUtils.isEmpty(this.customMessage)) {
                }
                stringForMessageListDate = "";
                messageObject4 = this.message;
                if (messageObject4 != null) {
                }
                this.drawCheck1 = false;
                this.drawCheck2 = false;
                this.drawClock = messageObject4 == null && messageObject4.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                z10 = false;
                this.drawCount = false;
                this.drawMention = false;
                this.drawReactionMention = false;
                this.drawPollVotesMention = false;
                this.drawError = false;
                str10 = null;
                str11 = null;
                this.promoDialog = z10;
                MessagesController messagesController222222222 = MessagesController.getInstance(this.currentAccount);
                CharSequence charSequence47222222222 = charSequence4622222222;
                if (this.dialogsType == 0) {
                }
                charSequence24 = this.titleOverride;
                if (charSequence24 == null) {
                }
                str14 = string;
                z11 = z8;
                charSequence27 = charSequence47222222222;
                charSequence29 = charSequence23;
                charSequence31 = charSequence7;
                str17 = str11;
                spannable = charSequence27;
            }
        }
        if (!z11) {
            TextPaint timeTextPaint = getTimeTextPaint();
            int ceil = (int) Math.ceil(timeTextPaint.measureText(stringForMessageListDate));
            this.timeLayout = new StaticLayout(stringForMessageListDate, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i11 = ceil + AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f);
            if (!LocaleController.isRTL) {
                this.timeLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.0f)) - i11;
            } else {
                this.timeLeft = AndroidUtilities.dp(15.0f);
            }
        } else {
            this.timeLayout = null;
            this.timeLeft = 0;
            i11 = 0;
        }
        if (drawLock2()) {
            i12 = 0;
        } else {
            if (LocaleController.isRTL) {
                this.lock2Left = this.timeLeft + i11 + AndroidUtilities.dp(4.0f);
            } else {
                this.lock2Left = (this.timeLeft - Theme.dialogs_lock2Drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i12 = Theme.dialogs_lock2Drawable.getIntrinsicWidth() + AndroidUtilities.dp(4.0f);
            i11 += i12;
        }
        if (LocaleController.isRTL) {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(22.0f)) - i11;
        } else {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(this.messagePaddingStart + 13)) - i11;
            this.nameLeft += i11;
        }
        if (this.drawNameLock) {
            this.nameWidth -= AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 4.0f) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
        }
        if (!this.drawClock) {
            int intrinsicWidth2 = Theme.dialogs_clockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            f = 0.0f;
            this.nameWidth -= intrinsicWidth2;
            if (!LocaleController.isRTL) {
                this.clockDrawLeft = (this.timeLeft - i12) - intrinsicWidth2;
            } else {
                this.clockDrawLeft = this.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth2;
            }
            i13 = 0;
            f2 = 8.0f;
            r24 = str13;
        } else {
            f = 0.0f;
            if (this.drawCheck2) {
                int intrinsicWidth3 = Theme.dialogs_checkDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
                int i37 = this.nameWidth - intrinsicWidth3;
                this.nameWidth = i37;
                f2 = 8.0f;
                if (this.drawCheck1) {
                    int intrinsicWidth4 = Theme.dialogs_halfCheckDrawable.getIntrinsicWidth();
                    ?? dp9 = AndroidUtilities.dp(8.0f);
                    this.nameWidth = i37 - (intrinsicWidth4 - dp9);
                    if (!LocaleController.isRTL) {
                        int i38 = (this.timeLeft - i12) - intrinsicWidth3;
                        this.halfCheckDrawLeft = i38;
                        this.checkDrawLeft = i38 - AndroidUtilities.dp(5.5f);
                        str20 = dp9;
                    } else {
                        int dp10 = this.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                        this.checkDrawLeft = dp10;
                        this.halfCheckDrawLeft = dp10 + AndroidUtilities.dp(5.5f);
                        this.nameLeft += (intrinsicWidth3 + Theme.dialogs_halfCheckDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(8.0f);
                        str20 = dp9;
                    }
                } else if (!LocaleController.isRTL) {
                    this.checkDrawLeft1 = (this.timeLeft - i12) - intrinsicWidth3;
                    str20 = str13;
                } else {
                    this.checkDrawLeft1 = this.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                    this.nameLeft += intrinsicWidth3;
                    str20 = str13;
                }
            } else {
                f2 = 8.0f;
                str20 = str13;
            }
            i13 = 0;
            r24 = str20;
        }
        this.nameAdditionalsForChannelSubscriber = i13;
        z14 = (!this.dialogMuted || this.isHiddenInCommunity || this.drawUnmute || this.dialogMutedProgress > f) && !this.drawVerified && this.drawScam == 0;
        if (!this.drawPremium && this.emojiStatus.getDrawable() != null) {
            int dp11 = AndroidUtilities.dp(36.0f);
            if (z14) {
                dp11 += AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            }
            this.nameWidth -= dp11;
            this.nameAdditionalsForChannelSubscriber += dp11;
            if (LocaleController.isRTL) {
                this.nameLeft += dp11;
            }
        } else if (!z14) {
            int dp12 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            if (this.drawPremium) {
                dp12 += AndroidUtilities.dp(36.0f);
            }
            this.nameWidth -= dp12;
            this.nameAdditionalsForChannelSubscriber += dp12;
            if (LocaleController.isRTL) {
                this.nameLeft += dp12;
            }
        } else if (this.drawVerified) {
            int dp13 = AndroidUtilities.dp(6.0f) + Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
            this.nameWidth -= dp13;
            this.nameAdditionalsForChannelSubscriber += dp13;
            if (LocaleController.isRTL) {
                this.nameLeft += dp13;
            }
        } else if (this.drawPremium) {
            int dp14 = AndroidUtilities.dp(36.0f);
            this.nameWidth -= dp14;
            this.nameAdditionalsForChannelSubscriber += dp14;
            if (LocaleController.isRTL) {
                this.nameLeft += dp14;
            }
        } else if (this.drawScam != 0) {
            int dp15 = AndroidUtilities.dp(6.0f) + (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth();
            this.nameWidth -= dp15;
            this.nameAdditionalsForChannelSubscriber += dp15;
            if (LocaleController.isRTL) {
                this.nameLeft += dp15;
            }
        }
        if (this.drawBotVerified) {
            this.nameWidth -= AndroidUtilities.dp(21.0f);
        }
        i14 = this.namePaddingEnd;
        if (i14 > 0) {
            this.nameWidth -= i14;
            if (LocaleController.isRTL) {
                this.nameLeft += i14;
            }
        }
        try {
            dp7 = this.nameWidth - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
                dp7 = 0;
            }
            if (charSequence24 instanceof String) {
                charSequence24 = ((String) charSequence24).replace('\n', ' ');
            }
        } catch (Exception e3) {
            e = e3;
            f3 = 6.0f;
        }
        try {
            try {
                if (!this.nameLayoutEllipsizeByGradient) {
                    r24 = 1086324736;
                    this.nameLayoutFits = charSequence24.length() == TextUtils.ellipsize(charSequence24, Theme.dialogs_namePaint[this.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
                    dp7 += AndroidUtilities.dp(48.0f);
                    this.channelShouldUseLineWidth = this.nameLayoutFits;
                } else {
                    r24 = 1086324736;
                    r24 = 1086324736;
                    if (this.isForChannelSubscriberCell) {
                        this.channelShouldUseLineWidth = charSequence24.length() == TextUtils.ellipsize(charSequence24, Theme.dialogs_namePaint[this.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
                    }
                }
                float f82 = dp7;
                this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(charSequence24.toString()) <= f82;
                if (!this.twoLinesForName) {
                    charSequence24 = TextUtils.ellipsize(charSequence24, Theme.dialogs_namePaint[this.paintIndex], f82, TextUtils.TruncateAt.END);
                }
                CharSequence replaceEmoji22 = Emoji.replaceEmoji(charSequence24, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
                MessageObject messageObject202 = this.message;
                CharSequence charSequence49 = (messageObject202 == null && messageObject202.hasHighlightedWords() && (highlightText3 = AndroidUtilities.highlightText(replaceEmoji22, this.message.highlightedWords, this.resourcesProvider)) != null) ? highlightText3 : replaceEmoji22;
                if (!this.twoLinesForName) {
                    this.nameLayout = StaticLayoutEx.createStaticLayout(charSequence49, Theme.dialogs_namePaint[this.paintIndex], dp7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp7, 2);
                } else {
                    this.nameLayout = new StaticLayout(charSequence49, Theme.dialogs_namePaint[this.paintIndex], Math.max(dp7, this.nameWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.nameLayoutTranslateX = (this.nameLayoutEllipsizeByGradient || !this.nameLayout.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(36.0f);
                this.nameLayoutEllipsizeLeft = this.nameLayout.isRtlCharAt(0);
                f4 = r24;
            } catch (Exception e4) {
                e = e4;
                f3 = r24;
                FileLog.e(e);
                f4 = f3;
                this.animatedEmojiStackName = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStackName, this.nameLayout);
                if (!this.useForceThreeLines) {
                }
                f5 = 13.0f;
                f6 = 20.0f;
                f7 = 5.0f;
                int dp82 = AndroidUtilities.dp(11.0f);
                this.messageNameTop = AndroidUtilities.dp(32.0f);
                this.timeTop = AndroidUtilities.dp(13.0f);
                this.errorTop = AndroidUtilities.dp(42.33f);
                this.pinTop = AndroidUtilities.dp(43.0f);
                this.countTop = AndroidUtilities.dp(42.33f);
                this.checkDrawTop = AndroidUtilities.dp(13.0f);
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
                if (LocaleController.isRTL) {
                }
                i15 = dp82;
                this.storyParams.originalAvatarRect.set(dp, dp82, dp + AndroidUtilities.dp(56.0f), i15 + AndroidUtilities.dp(56.0f));
                i16 = 0;
                while (true) {
                    imageReceiverArr = this.thumbImage;
                    if (i16 >= imageReceiverArr.length) {
                    }
                    imageReceiverArr[i16].setImageCoords(((this.thumbSize + 2) * i16) + dp2, ((i15 + AndroidUtilities.dp(31.0f)) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                    i16++;
                }
                if (LocaleController.isRTL) {
                }
                if (this.twoLinesForName) {
                }
                if (!this.useForceThreeLines) {
                }
                this.timeTop -= AndroidUtilities.dp(f4);
                this.checkDrawTop -= AndroidUtilities.dp(f4);
                if (getIsPinned()) {
                }
                if (!this.drawError) {
                }
                if (z16) {
                }
                int max22 = Math.max(AndroidUtilities.dp(12.0f), measuredWidth);
                this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                if (!this.useForceThreeLines) {
                }
                this.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
                if (isForumCell()) {
                }
                if (this.twoLinesForName) {
                }
                this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack2, this.messageNameLayout);
                this.buttonCreated = false;
                if (TextUtils.isEmpty(charSequence31)) {
                }
            }
            this.buttonCreated = false;
        } catch (Exception unused) {
        }
        this.animatedEmojiStackName = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStackName, this.nameLayout);
        if (!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
            f5 = 13.0f;
            f6 = 20.0f;
            f7 = 5.0f;
            int dp822 = AndroidUtilities.dp(11.0f);
            this.messageNameTop = AndroidUtilities.dp(32.0f);
            this.timeTop = AndroidUtilities.dp(13.0f);
            this.errorTop = AndroidUtilities.dp(42.33f);
            this.pinTop = AndroidUtilities.dp(43.0f);
            this.countTop = AndroidUtilities.dp(42.33f);
            this.checkDrawTop = AndroidUtilities.dp(13.0f);
            measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
            if (LocaleController.isRTL) {
                int dp16 = AndroidUtilities.dp(16.0f);
                this.messageNameLeft = dp16;
                this.messageLeft = dp16;
                this.typingLeft = dp16;
                this.buttonLeft = dp16;
                dp = getMeasuredWidth() - AndroidUtilities.dp(this.avatarStart + 56);
                dp2 = dp - AndroidUtilities.dp(31.0f);
            } else {
                int dp17 = AndroidUtilities.dp(this.messagePaddingStart + 6);
                this.messageNameLeft = dp17;
                this.messageLeft = dp17;
                this.typingLeft = dp17;
                this.buttonLeft = dp17;
                dp = AndroidUtilities.dp(this.avatarStart);
                dp2 = AndroidUtilities.dp(69.0f) + dp;
            }
            i15 = dp822;
            this.storyParams.originalAvatarRect.set(dp, dp822, dp + AndroidUtilities.dp(56.0f), i15 + AndroidUtilities.dp(56.0f));
            i16 = 0;
            while (true) {
                imageReceiverArr = this.thumbImage;
                if (i16 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i16].setImageCoords(((this.thumbSize + 2) * i16) + dp2, ((i15 + AndroidUtilities.dp(31.0f)) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i16++;
            }
        } else {
            int dp18 = AndroidUtilities.dp(9.0f);
            this.messageNameTop = AndroidUtilities.dp(31.0f);
            this.timeTop = AndroidUtilities.dp(16.0f);
            this.errorTop = AndroidUtilities.dp(38.0f);
            this.pinTop = AndroidUtilities.dp(39.0f);
            this.countTop = AndroidUtilities.dp(this.isTopic ? 35.0f : 38.0f);
            this.checkDrawTop = AndroidUtilities.dp(17.0f);
            measuredWidth = getMeasuredWidth() - AndroidUtilities.dp((this.messagePaddingStart + 20) - (LocaleController.isRTL ? 0 : 12));
            if (LocaleController.isRTL) {
                int dp19 = AndroidUtilities.dp(22.0f);
                this.messageNameLeft = dp19;
                this.messageLeft = dp19;
                this.typingLeft = dp19;
                this.buttonLeft = dp19;
                dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.avatarStart + 52);
                f5 = 13.0f;
                dp6 = dp5 - AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 9);
            } else {
                f5 = 13.0f;
                int dp20 = AndroidUtilities.dp(this.messagePaddingStart + 4);
                this.messageNameLeft = dp20;
                this.messageLeft = dp20;
                this.typingLeft = dp20;
                this.buttonLeft = dp20;
                dp5 = AndroidUtilities.dp(this.avatarStart);
                dp6 = AndroidUtilities.dp(67.0f) + dp5;
            }
            f6 = 20.0f;
            f7 = 5.0f;
            i15 = dp18;
            this.storyParams.originalAvatarRect.set(dp5, dp18, dp5 + AndroidUtilities.dp(52.0f), i15 + AndroidUtilities.dp(52.0f));
            int i39 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.thumbImage;
                if (i39 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i39].setImageCoords(((this.thumbSize + 2) * i39) + dp6, ((i15 + AndroidUtilities.dp(30.0f)) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags3 = this.tags) == null || dialogCellTags3.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.thumbSize), AndroidUtilities.dp(this.thumbSize));
                i39++;
            }
        }
        if (LocaleController.isRTL) {
            this.tagsRight = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart);
            this.tagsLeft = AndroidUtilities.dp(64.0f);
        } else {
            this.tagsLeft = this.messageLeft;
            this.tagsRight = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
        }
        if (this.twoLinesForName) {
            this.messageNameTop += AndroidUtilities.dp(f6);
        }
        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && (dialogCellTags2 = this.tags) != null && !dialogCellTags2.isEmpty()) {
            this.timeTop -= AndroidUtilities.dp(f4);
            this.checkDrawTop -= AndroidUtilities.dp(f4);
        }
        if (getIsPinned()) {
            if (!LocaleController.isRTL) {
                this.pinLeft = (getMeasuredWidth() - Theme.dialogs_pinnedDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(14.0f);
            } else {
                this.pinLeft = AndroidUtilities.dp(14.0f);
            }
        }
        if (!this.drawError) {
            int dp21 = AndroidUtilities.dp(29.0f);
            measuredWidth -= dp21;
            if (!LocaleController.isRTL) {
                this.errorLeft = getMeasuredWidth() - AndroidUtilities.dp(36.3333f);
            } else {
                this.errorLeft = AndroidUtilities.dp(15.666f);
                this.messageLeft += dp21;
                this.typingLeft += dp21;
                this.buttonLeft += dp21;
                this.messageNameLeft += dp21;
            }
        } else if (str17 != null || str10 != null || this.drawReactionMention || this.drawPollVotesMention) {
            if (str17 != null) {
                this.countWidth = Math.max(AndroidUtilities.dp(f2), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str17)));
                this.countLayout = new StaticLayout(str17, Theme.dialogs_countTextPaint2, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp22 = this.countWidth + AndroidUtilities.dp(17.0f);
                measuredWidth -= dp22;
                if (!LocaleController.isRTL) {
                    this.countLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.666f)) - (this.countWidth + AndroidUtilities.dp(12.666f));
                } else {
                    this.countLeft = AndroidUtilities.dp(15.666f);
                    this.messageLeft += dp22;
                    this.typingLeft += dp22;
                    this.buttonLeft += dp22;
                    this.messageNameLeft += dp22;
                }
                this.drawCount = true;
            } else {
                this.countWidth = 0;
            }
            if (str10 != null) {
                if (this.currentDialogFolderId != 0) {
                    this.mentionWidth = Math.max(AndroidUtilities.dp(f2), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str10)));
                    this.mentionLayout = new StaticLayout(str10, Theme.dialogs_countTextPaint2, this.mentionWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.mentionWidth = AndroidUtilities.dp(f2);
                }
                int dp23 = this.mentionWidth + AndroidUtilities.dp(17.0f);
                measuredWidth -= dp23;
                if (!LocaleController.isRTL) {
                    int measuredWidth5 = (getMeasuredWidth() - (this.mentionWidth + AndroidUtilities.dp(12.666f))) - AndroidUtilities.dp(15.666f);
                    int i40 = this.countWidth;
                    this.mentionLeft = measuredWidth5 - (i40 != 0 ? i40 + AndroidUtilities.dp(17.0f) : 0);
                } else {
                    int dp24 = AndroidUtilities.dp(15.666f);
                    int i41 = this.countWidth;
                    this.mentionLeft = dp24 + (i41 != 0 ? i41 + AndroidUtilities.dp(17.0f) : 0);
                    this.messageLeft += dp23;
                    this.typingLeft += dp23;
                    this.buttonLeft += dp23;
                    this.messageNameLeft += dp23;
                }
                this.drawMention = true;
            } else {
                this.mentionWidth = 0;
            }
            if (this.drawReactionMention) {
                int dp25 = AndroidUtilities.dp(25.0f);
                measuredWidth -= dp25;
                if (!LocaleController.isRTL) {
                    int measuredWidth6 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    this.reactionMentionLeft = measuredWidth6;
                    if (this.drawMention) {
                        int i42 = this.mentionWidth;
                        this.reactionMentionLeft = measuredWidth6 - (i42 != 0 ? i42 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i43 = this.reactionMentionLeft;
                        int i44 = this.countWidth;
                        this.reactionMentionLeft = i43 - (i44 != 0 ? i44 + AndroidUtilities.dp(17.0f) : 0);
                    }
                } else {
                    int dp26 = AndroidUtilities.dp(15.666f);
                    this.reactionMentionLeft = dp26;
                    if (this.drawMention) {
                        int i45 = this.mentionWidth;
                        this.reactionMentionLeft = dp26 + (i45 != 0 ? i45 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i46 = this.reactionMentionLeft;
                        int i47 = this.countWidth;
                        this.reactionMentionLeft = i46 + (i47 != 0 ? i47 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    this.messageLeft += dp25;
                    this.typingLeft += dp25;
                    this.buttonLeft += dp25;
                    this.messageNameLeft += dp25;
                }
            }
            if (this.drawPollVotesMention) {
                int dp27 = AndroidUtilities.dp(25.0f);
                measuredWidth -= dp27;
                if (!LocaleController.isRTL) {
                    int measuredWidth7 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    this.pollVotesMentionLeft = measuredWidth7;
                    if (this.drawReactionMention) {
                        this.pollVotesMentionLeft = measuredWidth7 - AndroidUtilities.dp(25.0f);
                    }
                    if (this.drawMention) {
                        int i48 = this.pollVotesMentionLeft;
                        int i49 = this.mentionWidth;
                        this.pollVotesMentionLeft = i48 - (i49 != 0 ? i49 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i50 = this.pollVotesMentionLeft;
                        int i51 = this.countWidth;
                        this.pollVotesMentionLeft = i50 - (i51 != 0 ? i51 + AndroidUtilities.dp(17.0f) : 0);
                    }
                } else {
                    int dp28 = AndroidUtilities.dp(15.666f);
                    this.pollVotesMentionLeft = dp28;
                    if (this.drawReactionMention) {
                        this.pollVotesMentionLeft = dp28 + AndroidUtilities.dp(25.0f);
                    }
                    if (this.drawMention) {
                        int i52 = this.pollVotesMentionLeft;
                        int i53 = this.mentionWidth;
                        this.pollVotesMentionLeft = i52 + (i53 != 0 ? i53 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i54 = this.pollVotesMentionLeft;
                        int i55 = this.countWidth;
                        this.pollVotesMentionLeft = i54 + (i55 != 0 ? i55 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    this.messageLeft += dp27;
                    this.typingLeft += dp27;
                    this.buttonLeft += dp27;
                    this.messageNameLeft += dp27;
                }
            }
        } else if (this.allowBotOpenButton && !isFolderCell() && !isForumCell() && !isDialogFolder() && UserObject.isBot(this.user) && this.user.bot_has_main_app) {
            setOpenBotButton(true);
            int dp29 = (int) (AndroidUtilities.dp(26.0f) + this.openButtonText.getCurrentWidth());
            int dp30 = AndroidUtilities.dp(f5);
            measuredWidth -= dp29;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                dp3 = AndroidUtilities.dp(40.0f);
            } else {
                dp3 = this.isTopic ? AndroidUtilities.dp(33.0f) : AndroidUtilities.dp(36.0f);
            }
            if (!LocaleController.isRTL) {
                this.openButtonRect.set((getMeasuredWidth() - dp29) - AndroidUtilities.dp(f5), dp3, getMeasuredWidth() - AndroidUtilities.dp(f5), dp3 + AndroidUtilities.dp(28.0f));
            } else {
                this.openButtonRect.set(AndroidUtilities.dp(f5), dp3, AndroidUtilities.dp(f5) + dp29, dp3 + AndroidUtilities.dp(28.0f));
                int i56 = dp29 + dp30;
                this.messageLeft += i56;
                this.typingLeft += i56;
                this.buttonLeft += i56;
                this.messageNameLeft += i56;
            }
            this.drawCount = false;
            this.drawMention = false;
        } else {
            this.drawCount = false;
            this.drawMention = false;
        }
        if (z16) {
            if (spannable == 0) {
                spannable = "";
            }
            int length4 = spannable.length();
            CharSequence charSequence50 = spannable;
            if (length4 > 150) {
                charSequence50 = spannable.subSequence(0, 150);
            }
            if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || str14 != null) {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceNewLines(charSequence50);
            } else {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceTwoNewLinesToOne(charSequence50);
            }
            spannable = Emoji.replaceEmoji(replaceTwoNewLinesToOne, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject23 = this.message;
            if (messageObject23 != null && (highlightText2 = AndroidUtilities.highlightText((CharSequence) spannable, messageObject23.highlightedWords, this.resourcesProvider)) != null) {
                spannable = highlightText2;
            }
        }
        int max222 = Math.max(AndroidUtilities.dp(12.0f), measuredWidth);
        this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
            this.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
        }
        if (isForumCell()) {
            this.messageTop = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
            int i57 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.thumbImage;
                if (i57 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i57].setImageY(this.buttonTop);
                i57++;
            }
        } else if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && str14 != null && (this.currentDialogFolderId == 0 || this.currentDialogFolderDialogsCount == 1)) {
            try {
                messageObject6 = this.message;
            } catch (Exception e5) {
                e = e5;
            }
            if (messageObject6 != null && messageObject6.hasHighlightedWords()) {
                ?? highlightText5 = AndroidUtilities.highlightText(str14, this.message.highlightedWords, this.resourcesProvider);
                if (highlightText5 != 0) {
                    str21 = highlightText5;
                    this.messageNameLayout = StaticLayoutEx.createStaticLayout(str21, Theme.dialogs_messageNamePaint, max222, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, max222, 1);
                    this.messageTop = AndroidUtilities.dp(51.0f);
                    dp4 = (this.nameIsEllipsized || !this.isTopic) ? 0 : AndroidUtilities.dp(f6);
                    i17 = 0;
                    while (true) {
                        imageReceiverArr2 = this.thumbImage;
                        if (i17 >= imageReceiverArr2.length) {
                            break;
                        }
                        imageReceiverArr2[i17].setImageY(i15 + dp4 + AndroidUtilities.dp(40.0f));
                        i17++;
                    }
                    str14 = str21;
                }
            }
            str21 = str14;
            this.messageNameLayout = StaticLayoutEx.createStaticLayout(str21, Theme.dialogs_messageNamePaint, max222, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, max222, 1);
            this.messageTop = AndroidUtilities.dp(51.0f);
            if (this.nameIsEllipsized) {
            }
            i17 = 0;
            while (true) {
                imageReceiverArr2 = this.thumbImage;
                if (i17 >= imageReceiverArr2.length) {
                }
                imageReceiverArr2[i17].setImageY(i15 + dp4 + AndroidUtilities.dp(40.0f));
                i17++;
            }
            str14 = str21;
        } else {
            this.messageNameLayout = null;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                this.messageTop = AndroidUtilities.dp(32.0f);
                int dp31 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(f6) : 0;
                int i58 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.thumbImage;
                    if (i58 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i58].setImageY(i15 + dp31 + AndroidUtilities.dp(21.0f));
                    i58++;
                }
            } else {
                this.messageTop = AndroidUtilities.dp(39.0f);
            }
        }
        if (this.twoLinesForName) {
            this.messageTop += AndroidUtilities.dp(f6);
        }
        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack2, this.messageNameLayout);
        if (TextUtils.isEmpty(charSequence31)) {
            this.buttonLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence31, this.currentMessagePaint.getFontMetricsInt(), false), this.currentMessagePaint, max222 - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.currentMessagePaint, max222 - AndroidUtilities.dp(f6), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.spoilersPool2.addAll(this.spoilers2);
            this.spoilers2.clear();
            SpoilerEffect.addSpoilers((View) this, this.buttonLayout, this.spoilersPool2, this.spoilers2);
            str22 = null;
            this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack3, this.buttonLayout);
            try {
                if (!TextUtils.isEmpty(charSequence29)) {
                    try {
                        if (!this.useForceThreeLines) {
                            if (!SharedConfig.useThreeLinesLayout) {
                            }
                            StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(charSequence29, this.currentMessagePaint, max222 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max222, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            max222 = max222;
                            this.typingLayout = staticLayout2;
                        }
                        StaticLayout staticLayout22 = new StaticLayout(TextUtils.ellipsize(charSequence29, this.currentMessagePaint, max222 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max222, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        max222 = max222;
                        this.typingLayout = staticLayout22;
                    } catch (Exception e6) {
                        e = e6;
                        max222 = max222;
                        FileLog.e(e);
                        if (spannable instanceof Spannable) {
                        }
                        if (!this.useForceThreeLines) {
                        }
                        this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                        str23 = str14;
                        str14 = str22;
                        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                        if (!this.useForceThreeLines) {
                        }
                        if (this.thumbsCount > 0) {
                        }
                        i19 = max222;
                        try {
                            this.messageLayout = StaticLayoutEx.createStaticLayout(str23, this.currentMessagePaint, i19, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i19, str14 != null ? 1 : 2);
                            max222 = i19;
                            this.spoilersPool.addAll(this.spoilers);
                            this.spoilers.clear();
                            str24 = str22;
                            try {
                                r7 = str24;
                                SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                            } catch (Exception e7) {
                                e = e7;
                                r7 = str24;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            r7 = str22;
                            max222 = i19;
                            this.messageLayout = r7;
                            FileLog.e(e);
                            int i59 = max222;
                            this.animatedEmojiStack = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack, this.messageLayout);
                            if (!LocaleController.isRTL) {
                            }
                            staticLayout = this.typingLayout;
                            if (staticLayout != null) {
                            }
                            updateThumbsPosition();
                        }
                        int i592 = max222;
                        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack, this.messageLayout);
                        if (!LocaleController.isRTL) {
                        }
                        staticLayout = this.typingLayout;
                        if (staticLayout != null) {
                        }
                        updateThumbsPosition();
                    }
                    if (!hasTags()) {
                        this.typingLayout = StaticLayoutEx.createStaticLayout(charSequence29, Theme.dialogs_messagePrintingPaint[this.paintIndex], max222, Layout.Alignment.ALIGN_NORMAL, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max222, 1);
                    }
                }
            } catch (Exception e9) {
                e = e9;
            }
            try {
                if (spannable instanceof Spannable) {
                    Spannable spannable2 = spannable;
                    for (Object obj3 : spannable2.getSpans(0, spannable2.length(), Object.class)) {
                        if (!(obj3 instanceof ClickableSpan) && !(obj3 instanceof CodeHighlighting.Span)) {
                            if (this.currentDialogCommunityId == 0) {
                                if (!isFolderCell()) {
                                    if (!(obj3 instanceof TypefaceSpan)) {
                                    }
                                }
                            }
                            if (!(obj3 instanceof CodeHighlighting.ColorSpan)) {
                                if (!(obj3 instanceof QuoteSpan)) {
                                    if (!(obj3 instanceof QuoteSpan.QuoteStyleSpan)) {
                                        if ((obj3 instanceof StyleSpan) && ((StyleSpan) obj3).getStyle() == 1) {
                                        }
                                    }
                                }
                            }
                        }
                        spannable2.removeSpan(obj3);
                    }
                }
                if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && this.currentDialogFolderId != 0 && this.currentDialogFolderDialogsCount > 1) {
                    this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                    str23 = str14;
                    str14 = str22;
                } else {
                    if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && str14 == null) {
                        str25 = spannable;
                        if (ChatObject.isMonoForum(this.chat)) {
                            str25 = spannable;
                            if (ChatObject.canManageMonoForum(this.currentAccount, this.chat)) {
                            }
                        }
                        str23 = str25;
                    }
                    if (!isForumCell() && (spannable instanceof Spanned) && ((FixedWidthSpan[]) spannable.getSpans(0, spannable.length(), FixedWidthSpan.class)).length <= 0) {
                        ellipsize = TextUtils.ellipsize(spannable, this.currentMessagePaint, max222 - AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 15), TextUtils.TruncateAt.END);
                    } else {
                        ellipsize = TextUtils.ellipsize(spannable, this.currentMessagePaint, max222 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                    }
                    str25 = ellipsize;
                    str23 = str25;
                }
                alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                    if (this.thumbsCount > 0 && str14 != null) {
                        max222 += AndroidUtilities.dp(f7);
                    }
                    i19 = max222;
                    this.messageLayout = StaticLayoutEx.createStaticLayout(str23, this.currentMessagePaint, i19, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i19, str14 != null ? 1 : 2);
                    max222 = i19;
                } else {
                    if (this.thumbsCount > 0) {
                        max222 += AndroidUtilities.dp((r0 * (this.thumbSize + 2)) + 3);
                        if (LocaleController.isRTL && !isForumCell()) {
                            this.messageLeft -= AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3);
                        }
                    }
                    int i60 = max222;
                    try {
                        this.messageLayout = new StaticLayout(str23, this.currentMessagePaint, i60, alignment, 1.0f, 0.0f, false);
                        max222 = i60;
                    } catch (Exception e10) {
                        e = e10;
                        r7 = str22;
                        max222 = i60;
                        this.messageLayout = r7;
                        FileLog.e(e);
                        int i5922 = max222;
                        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack, this.messageLayout);
                        if (!LocaleController.isRTL) {
                        }
                        staticLayout = this.typingLayout;
                        if (staticLayout != null) {
                        }
                        updateThumbsPosition();
                    }
                }
                this.spoilersPool.addAll(this.spoilers);
                this.spoilers.clear();
                str24 = str22;
                r7 = str24;
            } catch (Exception e11) {
                e = e11;
                r7 = str22;
            }
            try {
                SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
            } catch (Exception e12) {
                e = e12;
                this.messageLayout = r7;
                FileLog.e(e);
                int i59222 = max222;
                this.animatedEmojiStack = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack, this.messageLayout);
                if (!LocaleController.isRTL) {
                }
                staticLayout = this.typingLayout;
                if (staticLayout != null) {
                }
                updateThumbsPosition();
            }
            int i592222 = max222;
            this.animatedEmojiStack = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack, this.messageLayout);
            if (!LocaleController.isRTL) {
                StaticLayout staticLayout3 = this.nameLayout;
                if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                    float lineLeft = this.nameLayout.getLineLeft(0);
                    double ceil2 = Math.ceil(this.nameLayout.getLineWidth(0));
                    int dp32 = this.nameLeft + AndroidUtilities.dp(12.0f);
                    this.nameLeft = dp32;
                    if (this.drawBotVerified) {
                        this.nameLeft = dp32 + AndroidUtilities.dp(21.0f);
                    }
                    if (this.nameLayoutEllipsizeByGradient) {
                        ceil2 = Math.min(this.nameWidth, ceil2);
                    }
                    if ((this.dialogMuted || this.drawUnmute || this.dialogMutedProgress > f) && !this.drawVerified && this.drawScam == 0) {
                        if (this.drawPremium) {
                            int dp33 = (int) ((this.nameLeft + ((this.nameWidth - ceil2) - lineLeft)) - AndroidUtilities.dp(24.0f));
                            this.nameMuteLeft = dp33;
                            this.nameMutedIconLeft = (dp33 - AndroidUtilities.dp(f4)) - Theme.dialogs_muteDrawable.getIntrinsicWidth();
                        } else {
                            this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(f4)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                        }
                    } else if (this.drawVerified) {
                        this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(f4)) - Theme.dialogs_verifiedDrawable.getIntrinsicWidth());
                    } else if (this.drawPremium) {
                        int dp34 = (int) ((this.nameLeft + ((this.nameWidth - ceil2) - lineLeft)) - AndroidUtilities.dp(24.0f));
                        this.nameMuteLeft = dp34;
                        this.nameMutedIconLeft = (dp34 - AndroidUtilities.dp(f4)) - Theme.dialogs_muteDrawable.getIntrinsicWidth();
                    } else if (this.drawScam != 0) {
                        this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(f4)) - (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth());
                    } else {
                        this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(f4)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                    }
                    if (lineLeft == f) {
                        double d = this.nameWidth;
                        if (ceil2 < d) {
                            this.nameLeft = (int) (this.nameLeft + (d - ceil2));
                        }
                    }
                }
                StaticLayout staticLayout4 = this.messageLayout;
                if (staticLayout4 != null && (lineCount6 = staticLayout4.getLineCount()) > 0) {
                    int i61 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i62 = 0;
                    while (true) {
                        if (i62 >= lineCount6) {
                            break;
                        }
                        if (this.messageLayout.getLineLeft(i62) != f) {
                            i61 = 0;
                            break;
                        } else {
                            i61 = Math.min(i61, (int) (i592222 - Math.ceil(this.messageLayout.getLineWidth(i62))));
                            i62++;
                        }
                    }
                    if (i61 != Integer.MAX_VALUE) {
                        this.messageLeft += i61;
                    }
                }
                StaticLayout staticLayout5 = this.typingLayout;
                if (staticLayout5 != null && (lineCount5 = staticLayout5.getLineCount()) > 0) {
                    int i63 = 0;
                    int i64 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    while (true) {
                        if (i63 >= lineCount5) {
                            break;
                        }
                        if (this.typingLayout.getLineLeft(i63) != f) {
                            i64 = 0;
                            break;
                        } else {
                            i64 = Math.min(i64, (int) (i592222 - Math.ceil(this.typingLayout.getLineWidth(i63))));
                            i63++;
                        }
                    }
                    if (i64 != Integer.MAX_VALUE) {
                        this.typingLeft += i64;
                    }
                }
                StaticLayout staticLayout6 = this.messageNameLayout;
                if (staticLayout6 != null && staticLayout6.getLineCount() > 0 && this.messageNameLayout.getLineLeft(0) == f) {
                    double ceil3 = Math.ceil(this.messageNameLayout.getLineWidth(0));
                    double d2 = i592222;
                    if (ceil3 < d2) {
                        this.messageNameLeft = (int) (this.messageNameLeft + (d2 - ceil3));
                    }
                }
                StaticLayout staticLayout7 = this.buttonLayout;
                if (staticLayout7 != null && (lineCount4 = staticLayout7.getLineCount()) > 0) {
                    int i65 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    for (int i66 = 0; i66 < lineCount4; i66++) {
                        i65 = (int) Math.min(i65, this.buttonLayout.getWidth() - this.buttonLayout.getLineRight(i66));
                    }
                    this.buttonLeft += i65;
                }
            } else {
                StaticLayout staticLayout8 = this.nameLayout;
                if (staticLayout8 != null && staticLayout8.getLineCount() > 0) {
                    float lineRight = this.nameLayout.getLineRight(0);
                    if (this.nameLayoutEllipsizeByGradient) {
                        lineRight = Math.min(this.nameWidth, lineRight);
                    }
                    if (lineRight == this.nameWidth) {
                        double ceil4 = Math.ceil(this.nameLayout.getLineWidth(0));
                        if (this.nameLayoutEllipsizeByGradient) {
                            ceil4 = Math.min(this.nameWidth, ceil4);
                        }
                        double d3 = this.nameWidth;
                        if (ceil4 < d3) {
                            this.nameLeft = (int) (this.nameLeft - (d3 - ceil4));
                        }
                    }
                    if (this.drawBotVerified) {
                        this.nameLeft += AndroidUtilities.dp(21.0f);
                    }
                    int dp35 = (int) (this.nameLeft + lineRight + AndroidUtilities.dp(f4));
                    this.nameMuteLeft = dp35;
                    if (this.drawPremium) {
                        this.nameMutedIconLeft = dp35 + AndroidUtilities.dp(30.0f);
                    }
                }
                StaticLayout staticLayout9 = this.messageLayout;
                if (staticLayout9 != null && (lineCount3 = staticLayout9.getLineCount()) > 0) {
                    float f9 = 2.14748365E9f;
                    for (int i67 = 0; i67 < lineCount3; i67++) {
                        f9 = Math.min(f9, this.messageLayout.getLineLeft(i67));
                    }
                    this.messageLeft = (int) (this.messageLeft - f9);
                }
                StaticLayout staticLayout10 = this.buttonLayout;
                if (staticLayout10 != null && (lineCount2 = staticLayout10.getLineCount()) > 0) {
                    float f10 = 2.14748365E9f;
                    for (int i68 = 0; i68 < lineCount2; i68++) {
                        f10 = Math.min(f10, this.buttonLayout.getLineLeft(i68));
                    }
                    this.buttonLeft = (int) (this.buttonLeft - f10);
                }
                StaticLayout staticLayout11 = this.typingLayout;
                if (staticLayout11 != null && (lineCount = staticLayout11.getLineCount()) > 0) {
                    float f11 = 2.14748365E9f;
                    for (int i69 = 0; i69 < lineCount; i69++) {
                        f11 = Math.min(f11, this.typingLayout.getLineLeft(i69));
                    }
                    this.typingLeft = (int) (this.typingLeft - f11);
                }
                StaticLayout staticLayout12 = this.messageNameLayout;
                if (staticLayout12 != null && staticLayout12.getLineCount() > 0) {
                    this.messageNameLeft = (int) (this.messageNameLeft - this.messageNameLayout.getLineLeft(0));
                }
            }
            staticLayout = this.typingLayout;
            if (staticLayout != null && this.printingStringType >= 0 && staticLayout.getText().length() > 0) {
                if (i4 < 0 && (i18 = i4 + 1) < this.typingLayout.getText().length()) {
                    primaryHorizontal = this.typingLayout.getPrimaryHorizontal(i4);
                    primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(i18);
                } else {
                    primaryHorizontal = this.typingLayout.getPrimaryHorizontal(0);
                    primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(1);
                }
                if (primaryHorizontal >= primaryHorizontal2) {
                    this.statusDrawableLeft = (int) (this.typingLeft + primaryHorizontal);
                } else {
                    this.statusDrawableLeft = (int) (this.typingLeft + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
                }
            }
            updateThumbsPosition();
        }
        str22 = null;
        try {
            this.buttonLayout = null;
        } catch (Exception unused2) {
        }
        this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack3, this.buttonLayout);
        if (!TextUtils.isEmpty(charSequence29)) {
        }
        if (spannable instanceof Spannable) {
        }
        if (!this.useForceThreeLines) {
        }
        this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
        str23 = str14;
        str14 = str22;
        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        if (!this.useForceThreeLines) {
        }
        if (this.thumbsCount > 0) {
            max222 += AndroidUtilities.dp(f7);
        }
        i19 = max222;
        this.messageLayout = StaticLayoutEx.createStaticLayout(str23, this.currentMessagePaint, i19, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, i19, str14 != null ? 1 : 2);
        max222 = i19;
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        str24 = str22;
        r7 = str24;
        SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
        int i5922222 = max222;
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, (View) this, this.animatedEmojiStack, this.messageLayout);
        if (!LocaleController.isRTL) {
        }
        staticLayout = this.typingLayout;
        if (staticLayout != null) {
            if (i4 < 0) {
            }
            primaryHorizontal = this.typingLayout.getPrimaryHorizontal(0);
            primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(1);
            if (primaryHorizontal >= primaryHorizontal2) {
            }
        }
        updateThumbsPosition();
    }

    public void setTitleOverride(String str) {
        this.titleOverride = str;
    }

    private SpannableStringBuilder formatInternal(int i, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 1) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i == 2) {
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        if (i == 3) {
            spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
            return spannableStringBuilder;
        }
        if (i != 4) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence);
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
        if (isDialogFolder() || this.insideCommunityListNoDialog || (chat = this.chat) == null) {
            return false;
        }
        return (chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, this.chat))) && !this.isTopic;
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
                    return messageObject;
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

    /* JADX WARN: Code restructure failed: missing block: B:311:0x07fe, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r39.lastDialogChangedTime) > 100) goto L398;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0547  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v140 */
    /* JADX WARN: Type inference failed for: r4v2, types: [org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean update(int i, boolean z) {
        long j;
        boolean z2;
        char c;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        ?? r4;
        long j2;
        MessageObject messageObject;
        boolean z7;
        boolean z8;
        int dp;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        char c2;
        boolean z9;
        char c3;
        MessageObject messageObject2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TLRPC.Chat chat3;
        MessageObject messageObject3;
        long j3;
        boolean isForumCell = isForumCell();
        boolean z10 = false;
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
            z2 = isForumCell;
            z3 = false;
            z4 = false;
        } else {
            int i11 = this.unreadCount;
            boolean z11 = this.reactionMentionCount != 0;
            boolean z12 = this.markUnread;
            this.hasUnmutedTopics = false;
            this.hasUnmutedCommunityDialogs = false;
            this.readOutboxMaxId = -1;
            if (this.isDialogCell) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                if (dialog != null) {
                    this.readOutboxMaxId = dialog.read_outbox_max_id;
                    this.ttlPeriod = dialog.ttl_period;
                    if (i == 0) {
                        j = 0;
                        this.clearingDialog = MessagesController.getInstance(this.currentAccount).isClearingDialog(dialog.id);
                        ArrayList arrayList = (ArrayList) MessagesController.getInstance(this.currentAccount).dialogMessage.get(dialog.id);
                        this.groupMessages = arrayList;
                        MessageObject messageObject4 = (arrayList == null || arrayList.size() <= 0) ? null : (MessageObject) this.groupMessages.get(0);
                        this.message = messageObject4;
                        this.lastUnreadState = messageObject4 != null && messageObject4.isUnread();
                        TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                        if (chat4 != null && (chat4.forum || (chat4.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat4)))) {
                            int[] forumUnreadCount = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat4.id);
                            this.unreadCount = forumUnreadCount[0];
                            this.mentionCount = forumUnreadCount[1];
                            this.reactionMentionCount = forumUnreadCount[2];
                            this.hasUnmutedTopics = forumUnreadCount[3] != 0;
                            this.pollVotesMentionCount = forumUnreadCount[4];
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
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
                        j = 0;
                    }
                } else {
                    j = 0;
                    this.unreadCount = 0;
                    this.mentionCount = 0;
                    this.reactionMentionCount = 0;
                    this.pollVotesMentionCount = 0;
                    this.currentEditDate = 0;
                    this.lastMessageDate = 0;
                    this.clearingDialog = false;
                }
                long j4 = this.currentDialogId;
                this.drawAvatarSelector = j4 != j && j4 == RightSlidingDialogContainer.fragmentDialogId;
            } else {
                j = 0;
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
                z2 = isForumCell;
                c = 2;
                if (this.tags.update(this.currentAccount, this.dialogsType, this.currentDialogId)) {
                    if (isEmpty != this.tags.isEmpty()) {
                        z3 = true;
                        z4 = true;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    z5 = true;
                    if (i == 0) {
                        TLRPC.User user2 = this.user;
                        if (user2 != null && !MessagesController.isSupportUser(user2) && !this.user.bot && (i & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                            if (this.wasDrawnOnline != isOnline()) {
                                z5 = true;
                            }
                        }
                        if ((i & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                            if (this.user != null) {
                                TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                                this.user = user3;
                                if (user3 != null && DialogObject.getEmojiStatusDocumentId(user3.emoji_status) != j) {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.user.emoji_status), z);
                                    this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), z);
                                } else {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                    this.emojiStatus.setParticles(false, z);
                                }
                                j3 = DialogObject.getBotVerificationIcon(this.user);
                                z5 = true;
                            } else {
                                j3 = j;
                            }
                            if (this.chat != null) {
                                TLRPC.Chat chat5 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                                this.chat = chat5;
                                if (chat5 != null && DialogObject.getEmojiStatusDocumentId(chat5.emoji_status) != j) {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), z);
                                    this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), z);
                                } else {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                    this.emojiStatus.setParticles(false, z);
                                }
                                j3 = DialogObject.getBotVerificationIcon(this.chat);
                                z5 = true;
                            }
                            if (j3 != j) {
                                z9 = !this.drawBotVerified;
                                c2 = 4;
                                this.botVerification.set(j3, z);
                            } else {
                                c2 = 4;
                                z9 = this.drawBotVerified;
                                this.botVerification.set((Drawable) null, z);
                            }
                        } else {
                            c2 = 4;
                            z9 = false;
                        }
                        if ((this.isDialogCell || this.isTopic) && (i & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                            z6 = z11;
                            c3 = 1;
                            CharSequence printingString = MessagesController.getInstance(this.currentAccount).getPrintingString(this.currentDialogId, getTopicId(), true);
                            CharSequence charSequence = this.lastPrintString;
                            if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                                z9 = true;
                            }
                        } else {
                            z6 = z11;
                            c3 = 1;
                        }
                        if (!z9 && (i & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject3 = this.message) != null && messageObject3.messageText != this.lastMessageString) {
                            z9 = true;
                        }
                        if (!z9 && (i & MessagesController.UPDATE_MASK_CHAT) != 0 && this.chat != null) {
                            TLRPC.Chat chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                            if ((chat6 != null && chat6.call_active && chat6.call_not_empty) != this.hasCall) {
                                z9 = true;
                            }
                        }
                        if (!z9 && (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat3 = this.chat) == null || (chat3.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat3)))) {
                            ForumFormattedNames forumFormattedNames = this.forumFormattedNames;
                            if (forumFormattedNames != null) {
                                forumFormattedNames.invalidateSpans();
                            }
                            z9 = true;
                        }
                        if (!z9 && (i & MessagesController.UPDATE_MASK_NAME) != 0 && this.chat == null) {
                            z9 = true;
                        }
                        if (!z9 && (i & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.user == null) {
                            z9 = true;
                        }
                        if (!z9 && (i & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.user == null) {
                            z9 = true;
                        }
                        if (!z9) {
                            MessageObject messageObject7 = this.message;
                            if (messageObject7 != null && this.lastUnreadState != messageObject7.isUnread()) {
                                this.lastUnreadState = this.message.isUnread();
                                z9 = true;
                            }
                            if (this.isDialogCell) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                                TLRPC.Chat chat7 = dialog2 == null ? null : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog2.id));
                                if (chat7 != null && (chat7.forum || (chat7.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat7)))) {
                                    i2 = i11;
                                    int[] forumUnreadCount2 = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat7.id);
                                    int i13 = forumUnreadCount2[0];
                                    int i14 = forumUnreadCount2[c3];
                                    int i15 = forumUnreadCount2[c];
                                    this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                    int i16 = forumUnreadCount2[c2];
                                    i5 = i14;
                                    i7 = i16;
                                    i8 = i13;
                                    i6 = i15;
                                } else {
                                    i2 = i11;
                                    if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                        i8 = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                        i5 = 0;
                                        i6 = 0;
                                        i7 = 0;
                                    } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                        MessagesController.UnreadCounts communityUnreadCount2 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog2.id);
                                        i8 = communityUnreadCount2.unreadCount;
                                        int i17 = communityUnreadCount2.mentionCount;
                                        int i18 = communityUnreadCount2.reactionMentionCount;
                                        i7 = communityUnreadCount2.pollVotesMentionCount;
                                        this.hasUnmutedCommunityDialogs = communityUnreadCount2.hasUnmutedUnreadDialogs;
                                        i5 = i17;
                                        i6 = i18;
                                    } else if (dialog2 != null) {
                                        i8 = dialog2.unread_count;
                                        i5 = dialog2.unread_mentions_count;
                                        i6 = dialog2.unread_reactions_count;
                                        i7 = dialog2.unread_poll_votes_count;
                                    } else {
                                        i5 = 0;
                                        i6 = 0;
                                        i7 = 0;
                                        i8 = 0;
                                    }
                                }
                                if (ChatObject.isMonoForum(chat7)) {
                                    i5 = 0;
                                }
                                if (dialog2 != null && (this.unreadCount != i8 || this.markUnread != dialog2.unread_mark || this.mentionCount != i5 || this.reactionMentionCount != i6)) {
                                    this.unreadCount = i8;
                                    this.mentionCount = i5;
                                    this.markUnread = dialog2.unread_mark;
                                    this.reactionMentionCount = i6;
                                    this.pollVotesMentionCount = i7;
                                    z9 = true;
                                }
                                if (!z9 && (i & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject2 = this.message) != null) {
                                    i3 = this.lastSendState;
                                    i4 = messageObject2.messageOwner.send_state;
                                    if (i3 != i4) {
                                        this.lastSendState = i4;
                                        z9 = true;
                                    }
                                }
                                if (z9) {
                                    invalidate();
                                    return z3;
                                }
                                r4 = 0;
                            }
                        }
                        i2 = i11;
                        if (!z9) {
                            i3 = this.lastSendState;
                            i4 = messageObject2.messageOwner.send_state;
                            if (i3 != i4) {
                            }
                        }
                        if (z9) {
                        }
                    } else {
                        i2 = i11;
                        z6 = z11;
                        r4 = 0;
                    }
                    this.user = r4;
                    this.chat = r4;
                    this.encryptedChat = r4;
                    if (this.currentDialogCommunityId != j) {
                        this.message = MessagesController.getInstance(this.currentAccount).findCommunityLastMessage(this.currentDialogCommunityId);
                    }
                    if (this.currentDialogFolderId == 0) {
                        this.dialogMuted = false;
                        this.drawUnmute = false;
                        MessageObject findFolderTopMessage = findFolderTopMessage();
                        this.message = findFolderTopMessage;
                        j2 = findFolderTopMessage != null ? findFolderTopMessage.getDialogId() : j;
                    } else {
                        this.drawUnmute = false;
                        if (this.forumTopic != null) {
                            boolean isDialogMuted = MessagesController.getInstance(this.currentAccount).isDialogMuted(this.currentDialogId, j);
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
                        j2 = this.currentDialogId;
                        j = 0;
                    }
                    if (j2 != j) {
                        if (DialogObject.isEncryptedDialog(j2)) {
                            TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j2)));
                            this.encryptedChat = encryptedChat;
                            if (encryptedChat != null) {
                                this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.encryptedChat.user_id));
                            }
                        } else if (DialogObject.isUserDialog(j2)) {
                            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j2));
                        } else {
                            TLRPC.Chat chat8 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j2));
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
                                if (z || (i2 == this.unreadCount && z12 == this.markUnread)) {
                                    z7 = z5;
                                } else {
                                    if (this.isDialogCell) {
                                        z7 = z5;
                                    } else {
                                        z7 = z5;
                                    }
                                    ValueAnimator valueAnimator = this.countAnimator;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    this.countAnimator = ofFloat;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda0
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            DialogCell.$r8$lambda$Rq-QBvBMWh2KGY2K5m0CRQI7VvA(DialogCell.this, valueAnimator2);
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
                                    if ((i2 == 0 || this.markUnread) && (this.markUnread || !z12)) {
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
                                        String format = String.format("%d", Integer.valueOf(i2));
                                        String format2 = String.format("%d", Integer.valueOf(this.unreadCount));
                                        if (format.length() == format2.length()) {
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                            for (int i19 = 0; i19 < format.length(); i19++) {
                                                if (format.charAt(i19) == format2.charAt(i19)) {
                                                    int i20 = i19 + 1;
                                                    spannableStringBuilder.setSpan(new EmptyStubSpan(), i19, i20, 0);
                                                    spannableStringBuilder2.setSpan(new EmptyStubSpan(), i19, i20, 0);
                                                } else {
                                                    spannableStringBuilder3.setSpan(new EmptyStubSpan(), i19, i19 + 1, 0);
                                                }
                                            }
                                            int max = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(format)));
                                            TextPaint textPaint = Theme.dialogs_countTextPaint2;
                                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                            this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                            this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, Theme.dialogs_countTextPaint2, max, alignment, 1.0f, 0.0f, false);
                                            this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, Theme.dialogs_countTextPaint2, max, alignment, 1.0f, 0.0f, false);
                                        } else {
                                            this.countOldLayout = this.countLayout;
                                        }
                                    }
                                    this.countWidthOld = this.countWidth;
                                    this.countLeftOld = this.countLeft;
                                    this.countAnimationIncrement = this.unreadCount > i2;
                                    this.countAnimator.start();
                                    this.animatorPollVotesMentionVisible.setValue(this.pollVotesMentionCount == 0, z);
                                    boolean z13 = this.reactionMentionCount == 0;
                                    if (!z && z13 != z6) {
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
                                                DialogCell.$r8$lambda$4MJcpxSv6aR-e2eKgPzb4WO4fgA(DialogCell.this, valueAnimator3);
                                            }
                                        });
                                        this.reactionsMentionsAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.DialogCell.5
                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public void onAnimationEnd(Animator animator) {
                                                DialogCell.this.reactionsMentionsChangeProgress = 1.0f;
                                                DialogCell.this.invalidate();
                                            }
                                        });
                                        if (z13) {
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
                                    if (!z8) {
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
                                    z10 = z7;
                                }
                                this.animatorPollVotesMentionVisible.setValue(this.pollVotesMentionCount == 0, z);
                                if (this.reactionMentionCount == 0) {
                                }
                                if (!z) {
                                }
                                if (isFolderCell()) {
                                }
                                this.drawMonoforumAvatar = z8;
                                if (!z8) {
                                }
                                this.avatarImage.setRoundRadius(dp);
                                z10 = z7;
                            }
                        }
                    }
                    if (z) {
                    }
                    z7 = z5;
                    this.animatorPollVotesMentionVisible.setValue(this.pollVotesMentionCount == 0, z);
                    if (this.reactionMentionCount == 0) {
                    }
                    if (!z) {
                    }
                    if (isFolderCell()) {
                    }
                    this.drawMonoforumAvatar = z8;
                    if (!z8) {
                    }
                    this.avatarImage.setRoundRadius(dp);
                    z10 = z7;
                }
            } else {
                z2 = isForumCell;
                c = 2;
            }
            z3 = false;
            z4 = false;
            z5 = false;
            if (i == 0) {
            }
            this.user = r4;
            this.chat = r4;
            this.encryptedChat = r4;
            if (this.currentDialogCommunityId != j) {
            }
            if (this.currentDialogFolderId == 0) {
            }
            if (j2 != j) {
            }
            this.drawCommunityAvatar = this.insideCommunityList && ChatObject.isCommunity(this.chat) && this.isDialogCell;
            if (this.currentDialogFolderId == 0) {
            }
            if (z) {
            }
            z7 = z5;
            this.animatorPollVotesMentionVisible.setValue(this.pollVotesMentionCount == 0, z);
            if (this.reactionMentionCount == 0) {
            }
            if (!z) {
            }
            if (isFolderCell()) {
            }
            this.drawMonoforumAvatar = z8;
            if (!z8) {
            }
            this.avatarImage.setRoundRadius(dp);
            z10 = z7;
        }
        if (!this.isTopic && (getMeasuredWidth() != 0 || getMeasuredHeight() != 0)) {
            z4 = true;
        }
        if (!z10) {
            int i21 = this.storyParams.currentState;
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
        boolean z14 = isForumCell() != z2 ? true : z3;
        if (z4) {
            if (this.attachedToWindow) {
                buildLayout();
            } else {
                this.updateLayout = true;
            }
        }
        updatePremiumBlocked(z);
        return z14;
    }

    public static /* synthetic */ void $r8$lambda$Rq-QBvBMWh2KGY2K5m0CRQI7VvA(DialogCell dialogCell, ValueAnimator valueAnimator) {
        dialogCell.getClass();
        dialogCell.countChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogCell.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$4MJcpxSv6aR-e2eKgPzb4WO4fgA(DialogCell dialogCell, ValueAnimator valueAnimator) {
        dialogCell.getClass();
        dialogCell.reactionsMentionsChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogCell.invalidate();
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

    /* JADX WARN: Code restructure failed: missing block: B:251:0x0d4b, code lost:
    
        if (r3.lastKnownTypingType >= 0) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:962:0x08f0, code lost:
    
        if (r3.type != 2) goto L292;
     */
    /* JADX WARN: Removed duplicated region for block: B:1022:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:1049:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:1058:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0cf5  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0d07  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0d3d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0dff  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1001  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x10a7  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x10b5  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x111f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x112f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x1141  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x1173  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x117c  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x118f  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x119d  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x11b3  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x11b6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x11f1  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x125d  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1192  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1176  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x115a  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x127a  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x13db  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1446  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x16a3  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x1834  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x1864  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x1875  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x189d  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x18b8  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x19bf  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x1900  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x19fe  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x1a09  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x1a1a  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x1a79  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x1a82  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x1a89  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x1ae2  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x1b6f  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x1bc0  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x1c23  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x1c5a  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x1cb0  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x1cc9  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x1d12  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x1d1a  */
    /* JADX WARN: Removed duplicated region for block: B:725:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:726:0x1d14  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x1cef  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x1cc4  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x1c82  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x1c30  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x1c44  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x1897  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x1497  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x13e7  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x12cf  */
    /* JADX WARN: Removed duplicated region for block: B:890:0x10a9  */
    /* JADX WARN: Removed duplicated region for block: B:891:0x10a1  */
    /* JADX WARN: Removed duplicated region for block: B:902:0x10ae  */
    /* JADX WARN: Removed duplicated region for block: B:914:0x0ccc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int color;
        int color2;
        int i;
        String string;
        int i2;
        int i3;
        int i4;
        float f4;
        boolean z;
        int i5;
        float f5;
        String str;
        float f6;
        String str2;
        int ceil;
        int i6;
        StaticLayout staticLayout;
        RLottieDrawable rLottieDrawable;
        float f7;
        float f8;
        float f9;
        DialogCell dialogCell;
        int i7;
        float f10;
        boolean z2;
        boolean z3;
        float f11;
        DialogCell dialogCell2;
        float f12;
        Canvas canvas2;
        boolean z4;
        float f13;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int i8;
        boolean z5;
        int i9;
        float f14;
        int i10;
        int i11;
        float f15;
        DialogCell dialogCell3;
        boolean z6;
        boolean z7;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        DialogCellTags dialogCellTags;
        int i13;
        float dp;
        float f16;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i14;
        float f17;
        float f18;
        DialogUpdateHelper dialogUpdateHelper;
        float f19;
        StaticLayout staticLayout2;
        float f20;
        int i15;
        Drawable drawable3;
        float f21;
        int i16;
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        TLRPC.TL_forumTopic tL_forumTopic3;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        final DialogCell dialogCell4 = this;
        Canvas canvas3 = canvas;
        float f22 = 12.5f;
        if ((dialogCell4.currentDialogId == 0 && dialogCell4.customDialog == null) || !dialogCell4.visibleOnScreen) {
            return;
        }
        boolean z12 = dialogCell4.drawArchive;
        if (z12 && ((dialogCell4.currentDialogFolderId != 0 || (dialogCell4.isTopic && (tL_forumTopic4 = dialogCell4.forumTopic) != null && tL_forumTopic4.id == 1)) && (pullForegroundDrawable2 = dialogCell4.archivedChatsDrawable) != null && pullForegroundDrawable2.outProgress == 0.0f && dialogCell4.translationX == 0.0f)) {
            canvas3.save();
            canvas3.translate(0.0f, (-dialogCell4.translateY) - dialogCell4.rightFragmentOffset);
            canvas3.clipRect(0.0f, dialogCell4.getMeasuredHeight() * (1.0f - dialogCell4.archivedChatsDrawable.getPullProgress()), dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
            dialogCell4.archivedChatsDrawable.draw(canvas3);
            canvas3.restore();
            dialogCell4.emojiStatusView.setVisibility(4);
            return;
        }
        boolean z13 = z12 && (dialogCell4.currentDialogFolderId != 0 || (dialogCell4.isTopic && (tL_forumTopic3 = dialogCell4.forumTopic) != null && tL_forumTopic3.id == 1)) && dialogCell4.archivedChatsDrawable != null && dialogCell4.translationX == 0.0f && (dialogsActivity = dialogCell4.parentFragment) != null && dialogsActivity.hasHiddenArchive() && ((rightSlidingDialogContainer = dialogCell4.parentFragment.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment());
        PullForegroundDrawable pullForegroundDrawable3 = dialogCell4.archivedChatsDrawable;
        float pullProgress = pullForegroundDrawable3 != null ? pullForegroundDrawable3.getPullProgress() : 1.0f;
        if (z13) {
            canvas3.save();
            f = 74.0f;
            canvas3.clipRect(0.0f, dialogCell4.getMeasuredHeight() * (1.0f - pullProgress), dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
        } else {
            f = 74.0f;
        }
        if (dialogCell4.clipProgress == 0.0f || Build.VERSION.SDK_INT == 24) {
            f2 = 1.0f;
        } else {
            canvas3.save();
            f2 = 1.0f;
            canvas3.clipRect(0.0f, dialogCell4.topClip * dialogCell4.clipProgress, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight() - ((int) (dialogCell4.bottomClip * dialogCell4.clipProgress)));
        }
        if (dialogCell4.translationX != 0.0f || dialogCell4.cornerProgress != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, -dialogCell4.translateY);
            if (dialogCell4.overrideSwipeAction) {
                color = Theme.getColor(dialogCell4.overrideSwipeActionBackgroundColorKey, dialogCell4.resourcesProvider);
                color2 = Theme.getColor(dialogCell4.overrideSwipeActionRevealBackgroundColorKey, dialogCell4.resourcesProvider);
                String str3 = dialogCell4.overrideSwipeActionStringKey;
                f3 = 4.0f;
                i = dialogCell4.overrideSwipeActionStringId;
                string = LocaleController.getString(str3, i);
                dialogCell4.translationDrawable = dialogCell4.overrideSwipeActionDrawable;
            } else {
                f3 = 4.0f;
                if (dialogCell4.currentDialogFolderId != 0) {
                    if (dialogCell4.archiveHidden) {
                        color = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                        color2 = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                        i = R.string.UnhideFromTop;
                        string = LocaleController.getString(i);
                        dialogCell4.translationDrawable = Theme.dialogs_unpinArchiveDrawable;
                    } else {
                        color = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                        color2 = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                        i = R.string.HideOnTop;
                        string = LocaleController.getString(i);
                        dialogCell4.translationDrawable = Theme.dialogs_pinArchiveDrawable;
                    }
                } else if (dialogCell4.promoDialog) {
                    color = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                    color2 = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                    i = R.string.PsaHide;
                    string = LocaleController.getString(i);
                    dialogCell4.translationDrawable = Theme.dialogs_hidePsaDrawable;
                } else if (dialogCell4.folderId == 0) {
                    color = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                    color2 = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                    if (ChatObject.isCommunity(dialogCell4.chat)) {
                        i = R.string.SwipeUngroupCommunity;
                        string = LocaleController.getString(i);
                        color = Theme.getColor(Theme.key_dialogSwipeRemove, dialogCell4.resourcesProvider);
                        dialogCell4.translationDrawable = Theme.dialogs_swipeCommunityUngroup;
                        i2 = color;
                        i3 = i;
                        String str4 = string;
                        if (!dialogCell4.swipeCanceled && (rLottieDrawable = dialogCell4.lastDrawTranslationDrawable) != null) {
                            dialogCell4.translationDrawable = rLottieDrawable;
                            i3 = dialogCell4.lastDrawSwipeMessageStringId;
                        } else {
                            dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
                            dialogCell4.lastDrawSwipeMessageStringId = i3;
                        }
                        if (!dialogCell4.translationAnimationStarted && Math.abs(dialogCell4.translationX) > AndroidUtilities.dp(43.0f)) {
                            dialogCell4.translationAnimationStarted = true;
                            dialogCell4.translationDrawable.setProgress(0.0f);
                            dialogCell4.translationDrawable.setCallback(dialogCell4);
                            dialogCell4.translationDrawable.start();
                        }
                        float measuredWidth = dialogCell4.getMeasuredWidth() + dialogCell4.translationX;
                        if (dialogCell4.currentRevealProgress >= f2) {
                            Theme.dialogs_pinnedPaint.setColor(color);
                            i4 = i3;
                            f4 = measuredWidth;
                            z = true;
                            canvas3.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                            if (dialogCell4.currentRevealProgress == 0.0f) {
                                if (Theme.dialogs_archiveDrawableRecolored) {
                                    Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                                    Theme.dialogs_archiveDrawableRecolored = false;
                                }
                                if (Theme.dialogs_hidePsaDrawableRecolored) {
                                    Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                                    RLottieDrawable rLottieDrawable2 = Theme.dialogs_hidePsaDrawable;
                                    int i17 = Theme.key_chats_archiveBackground;
                                    rLottieDrawable2.setLayerColor("Line 1", Theme.getNonAnimatedColor(i17));
                                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i17));
                                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i17));
                                    Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                    Theme.dialogs_hidePsaDrawableRecolored = false;
                                }
                            }
                        } else {
                            i4 = i3;
                            f4 = measuredWidth;
                            z = true;
                        }
                        int measuredWidth2 = (dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.translationDrawable.getIntrinsicWidth() / 2);
                        int measuredHeight = (dialogCell4.getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
                        int intrinsicWidth = (dialogCell4.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
                        int intrinsicHeight = (dialogCell4.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
                        if (dialogCell4.currentRevealProgress <= 0.0f) {
                            canvas3.save();
                            i5 = i4;
                            str = str4;
                            canvas3.clipRect(f4 - AndroidUtilities.dp(8.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                            Theme.dialogs_pinnedPaint.setColor(i2);
                            f5 = f4;
                            canvas3.drawCircle(intrinsicWidth, intrinsicHeight, ((float) Math.sqrt((intrinsicWidth * intrinsicWidth) + ((intrinsicHeight - dialogCell4.getMeasuredHeight()) * (intrinsicHeight - dialogCell4.getMeasuredHeight())))) * AndroidUtilities.accelerateInterpolator.getInterpolation(dialogCell4.currentRevealProgress), Theme.dialogs_pinnedPaint);
                            canvas3.restore();
                            if (!Theme.dialogs_archiveDrawableRecolored) {
                                Theme.dialogs_archiveDrawable.setLayerColor("Arrow", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                                Theme.dialogs_archiveDrawableRecolored = z;
                            }
                            if (!Theme.dialogs_hidePsaDrawableRecolored) {
                                Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                                RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                                int i18 = Theme.key_chats_archivePinBackground;
                                rLottieDrawable3.setLayerColor("Line 1", Theme.getNonAnimatedColor(i18));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2", Theme.getNonAnimatedColor(i18));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3", Theme.getNonAnimatedColor(i18));
                                Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                Theme.dialogs_hidePsaDrawableRecolored = z;
                            }
                        } else {
                            i5 = i4;
                            f5 = f4;
                            str = str4;
                        }
                        canvas3.save();
                        canvas3.translate(measuredWidth2, measuredHeight);
                        f6 = dialogCell4.currentRevealBounceProgress;
                        if (f6 != 0.0f && f6 != f2) {
                            float interpolation = dialogCell4.interpolator.getInterpolation(f6) + f2;
                            canvas3.scale(interpolation, interpolation, dialogCell4.translationDrawable.getIntrinsicWidth() / 2, dialogCell4.translationDrawable.getIntrinsicHeight() / 2);
                        }
                        BaseCell.setDrawableBounds((Drawable) dialogCell4.translationDrawable, 0, 0);
                        dialogCell4.translationDrawable.draw(canvas3);
                        canvas3.restore();
                        canvas3.clipRect(f5, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                        str2 = str;
                        ceil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str2));
                        i6 = i5;
                        if (dialogCell4.swipeMessageTextId == i6 || dialogCell4.swipeMessageWidth != dialogCell4.getMeasuredWidth()) {
                            dialogCell4.swipeMessageTextId = i6;
                            dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
                            TextPaint textPaint = Theme.dialogs_archiveTextPaint;
                            int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            staticLayout = new StaticLayout(str2, textPaint, min, alignment, 1.0f, 0.0f, false);
                            dialogCell4.swipeMessageTextLayout = staticLayout;
                            if (staticLayout.getLineCount() > 1) {
                                dialogCell4.swipeMessageTextLayout = new StaticLayout(str2, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                            }
                        }
                        if (dialogCell4.swipeMessageTextLayout != null) {
                            canvas3.save();
                            canvas3.translate((dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.swipeMessageTextLayout.getWidth() / 2.0f), measuredHeight + AndroidUtilities.dp(36.0f) + (dialogCell4.swipeMessageTextLayout.getLineCount() > 1 ? -AndroidUtilities.dp(f3) : 0.0f));
                            dialogCell4.swipeMessageTextLayout.draw(canvas3);
                            canvas3.restore();
                        }
                        canvas3.restore();
                    } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) == 3) {
                        if (dialogCell4.dialogMuted) {
                            i = R.string.SwipeUnmute;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeUnmuteDrawable;
                        } else {
                            i = R.string.SwipeMute;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeMuteDrawable;
                        }
                    } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) == 4) {
                        i = R.string.SwipeDeleteChat;
                        string = LocaleController.getString(i);
                        color = Theme.getColor(Theme.key_dialogSwipeRemove, dialogCell4.resourcesProvider);
                        dialogCell4.translationDrawable = Theme.dialogs_swipeDeleteDrawable;
                    } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) == 1) {
                        if (dialogCell4.unreadCount > 0 || dialogCell4.markUnread) {
                            i = R.string.SwipeMarkAsRead;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeReadDrawable;
                        } else {
                            i = R.string.SwipeMarkAsUnread;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeUnreadDrawable;
                        }
                    } else if (SharedConfig.getChatSwipeAction(dialogCell4.currentAccount) == 0) {
                        if (dialogCell4.getIsPinned()) {
                            i = R.string.SwipeUnpin;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_swipeUnpinDrawable;
                        } else {
                            i = R.string.SwipePin;
                            string = LocaleController.getString(i);
                            dialogCell4.translationDrawable = Theme.dialogs_swipePinDrawable;
                        }
                    } else {
                        i = R.string.Archive;
                        string = LocaleController.getString(i);
                        dialogCell4.translationDrawable = Theme.dialogs_archiveDrawable;
                    }
                } else {
                    color = Theme.getColor(Theme.key_chats_archivePinBackground, dialogCell4.resourcesProvider);
                    color2 = Theme.getColor(Theme.key_chats_archiveBackground, dialogCell4.resourcesProvider);
                    i = R.string.Unarchive;
                    string = LocaleController.getString(i);
                    dialogCell4.translationDrawable = Theme.dialogs_unarchiveDrawable;
                }
            }
            i2 = color2;
            i3 = i;
            String str42 = string;
            if (!dialogCell4.swipeCanceled) {
            }
            dialogCell4.lastDrawTranslationDrawable = dialogCell4.translationDrawable;
            dialogCell4.lastDrawSwipeMessageStringId = i3;
            if (!dialogCell4.translationAnimationStarted) {
                dialogCell4.translationAnimationStarted = true;
                dialogCell4.translationDrawable.setProgress(0.0f);
                dialogCell4.translationDrawable.setCallback(dialogCell4);
                dialogCell4.translationDrawable.start();
            }
            float measuredWidth3 = dialogCell4.getMeasuredWidth() + dialogCell4.translationX;
            if (dialogCell4.currentRevealProgress >= f2) {
            }
            int measuredWidth22 = (dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (dialogCell4.translationDrawable.getIntrinsicWidth() / 2);
            int measuredHeight2 = (dialogCell4.getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
            int intrinsicWidth2 = (dialogCell4.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth22;
            int intrinsicHeight2 = (dialogCell4.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight2;
            if (dialogCell4.currentRevealProgress <= 0.0f) {
            }
            canvas3.save();
            canvas3.translate(measuredWidth22, measuredHeight2);
            f6 = dialogCell4.currentRevealBounceProgress;
            if (f6 != 0.0f) {
                float interpolation2 = dialogCell4.interpolator.getInterpolation(f6) + f2;
                canvas3.scale(interpolation2, interpolation2, dialogCell4.translationDrawable.getIntrinsicWidth() / 2, dialogCell4.translationDrawable.getIntrinsicHeight() / 2);
            }
            BaseCell.setDrawableBounds((Drawable) dialogCell4.translationDrawable, 0, 0);
            dialogCell4.translationDrawable.draw(canvas3);
            canvas3.restore();
            canvas3.clipRect(f5, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
            str2 = str;
            ceil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str2));
            i6 = i5;
            if (dialogCell4.swipeMessageTextId == i6) {
            }
            dialogCell4.swipeMessageTextId = i6;
            dialogCell4.swipeMessageWidth = dialogCell4.getMeasuredWidth();
            TextPaint textPaint2 = Theme.dialogs_archiveTextPaint;
            int min2 = Math.min(AndroidUtilities.dp(80.0f), ceil);
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            staticLayout = new StaticLayout(str2, textPaint2, min2, alignment2, 1.0f, 0.0f, false);
            dialogCell4.swipeMessageTextLayout = staticLayout;
            if (staticLayout.getLineCount() > 1) {
            }
            if (dialogCell4.swipeMessageTextLayout != null) {
            }
            canvas3.restore();
        } else {
            RLottieDrawable rLottieDrawable4 = dialogCell4.translationDrawable;
            if (rLottieDrawable4 != null) {
                rLottieDrawable4.stop();
                dialogCell4.translationDrawable.setProgress(0.0f);
                dialogCell4.translationDrawable.setCallback(null);
                dialogCell4.translationDrawable = null;
                dialogCell4.translationAnimationStarted = false;
            }
            f3 = 4.0f;
        }
        if (dialogCell4.translationX != 0.0f) {
            canvas3.save();
            canvas3.translate(dialogCell4.translationX, 0.0f);
            f7 = dialogCell4.translationX + 0.0f;
        } else {
            f7 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(8.0f) * dialogCell4.cornerProgress;
        if (dialogCell4.isSelected) {
            f8 = 0.0f;
            dialogCell4.rect.set(0.0f, 0.0f, dialogCell4.getMeasuredWidth(), AndroidUtilities.lerp(dialogCell4.getMeasuredHeight(), dialogCell4.getCollapsedHeight(), dialogCell4.rightFragmentOpenedProgress));
            dialogCell4.rect.offset(0.0f, (-dialogCell4.translateY) + dialogCell4.collapseOffset);
            canvas3.drawRoundRect(dialogCell4.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
        } else {
            f8 = 0.0f;
        }
        canvas3.save();
        canvas3.translate(f8, (-dialogCell4.rightFragmentOffset) * dialogCell4.rightFragmentOpenedProgress);
        if (dialogCell4.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || dialogCell4.archiveBackgroundProgress != f8)) {
            Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider), dialogCell4.archiveBackgroundProgress, 1.0f));
            Theme.dialogs_pinnedPaint.setAlpha((int) (r3.getAlpha() * (1.0f - dialogCell4.rightFragmentOpenedProgress)));
        } else if (dialogCell4.getIsPinned() || dialogCell4.drawPinBackground) {
            Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider));
            Theme.dialogs_pinnedPaint.setAlpha((int) (r3.getAlpha() * (1.0f - dialogCell4.rightFragmentOpenedProgress)));
        }
        canvas3.restore();
        dialogCell4.updateHelper.updateAnimationValues();
        if (dialogCell4.collapseOffset != 0.0f) {
            canvas3.save();
            canvas3.translate(0.0f, dialogCell4.collapseOffset);
            f9 = 0.0f + dialogCell4.collapseOffset;
        } else {
            f9 = 0.0f;
        }
        float f23 = dialogCell4.rightFragmentOpenedProgress;
        if (f23 != 1.0f) {
            if (f23 != 0.0f) {
                float clamp = Utilities.clamp(f23 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    i16 = canvas3.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), (int) ((1.0f - dialogCell4.rightFragmentOpenedProgress) * 255.0f), 31);
                    f21 = 0.0f;
                } else {
                    int save = canvas3.save();
                    f21 = 0.0f;
                    canvas3.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                    i16 = save;
                }
                canvas3.translate((-(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(f))) * 0.7f * dialogCell4.rightFragmentOpenedProgress, f21);
                f7 += (-(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(f))) * 0.7f * dialogCell4.rightFragmentOpenedProgress;
                i8 = i16;
            } else {
                i8 = -1;
            }
            float f24 = f7;
            if (dialogCell4.translationX != 0.0f || dialogCell4.cornerProgress != 0.0f) {
                canvas3.save();
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell4.resourcesProvider));
                dialogCell4.rect.set(dialogCell4.getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight());
                dialogCell4.rect.offset(0.0f, -dialogCell4.translateY);
                canvas3.drawRoundRect(dialogCell4.rect, dp2, dp2, Theme.dialogs_pinnedPaint);
                if (dialogCell4.isSelected) {
                    canvas3.drawRoundRect(dialogCell4.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
                }
                if (dialogCell4.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || dialogCell4.archiveBackgroundProgress != 0.0f)) {
                    Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider), dialogCell4.archiveBackgroundProgress, 1.0f));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r0.getAlpha() * (1.0f - dialogCell4.rightFragmentOpenedProgress)));
                } else if (dialogCell4.getIsPinned() || dialogCell4.drawPinBackground) {
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, dialogCell4.resourcesProvider));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r0.getAlpha() * (1.0f - dialogCell4.rightFragmentOpenedProgress)));
                }
                canvas3.restore();
            }
            if (dialogCell4.translationX != 0.0f) {
                float f25 = dialogCell4.cornerProgress;
                if (f25 < 1.0f) {
                    float f26 = f25 + 0.10666667f;
                    dialogCell4.cornerProgress = f26;
                    if (f26 > 1.0f) {
                        dialogCell4.cornerProgress = 1.0f;
                    }
                    z5 = true;
                } else {
                    z5 = false;
                }
            } else {
                float f27 = dialogCell4.cornerProgress;
                if (f27 > 0.0f) {
                    float f28 = f27 - 0.10666667f;
                    dialogCell4.cornerProgress = f28;
                    if (f28 < 0.0f) {
                        dialogCell4.cornerProgress = 0.0f;
                    }
                    z5 = true;
                }
                z5 = false;
            }
            if (dialogCell4.drawNameLock) {
                BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, dialogCell4.nameLockLeft, dialogCell4.nameLockTop);
                Theme.dialogs_lockDrawable.draw(canvas3);
            }
            int dp3 = AndroidUtilities.dp((dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
            if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                dp3 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 8.0f : 9.0f);
            }
            if (dialogCell4.nameLayout != null) {
                if (dialogCell4.nameLayoutEllipsizeByGradient && !dialogCell4.nameLayoutFits) {
                    if (dialogCell4.nameLayoutEllipsizeLeft && dialogCell4.fadePaint == null) {
                        Paint paint = new Paint();
                        dialogCell4.fadePaint = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        dialogCell4.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (dialogCell4.fadePaintBack == null) {
                        Paint paint2 = new Paint();
                        dialogCell4.fadePaintBack = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        dialogCell4.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas3.saveLayerAlpha(0.0f, 0.0f, dialogCell4.getMeasuredWidth(), dialogCell4.getMeasuredHeight(), NotificationCenter.didReceiveSmsCode, 31);
                    int i19 = dialogCell4.nameLeft;
                    canvas3.clipRect(i19, 0, dialogCell4.nameWidth + i19, dialogCell4.getMeasuredHeight());
                }
                if (dialogCell4.currentDialogFolderId != 0) {
                    TextPaint textPaint3 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                    int color3 = Theme.getColor(Theme.key_chats_nameArchived, dialogCell4.resourcesProvider);
                    textPaint3.linkColor = color3;
                    textPaint3.setColor(color3);
                } else {
                    if (dialogCell4.encryptedChat == null) {
                        CustomDialog customDialog = dialogCell4.customDialog;
                        if (customDialog != null) {
                        }
                        TextPaint textPaint4 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                        int color4 = Theme.getColor(Theme.key_chats_name, dialogCell4.resourcesProvider);
                        textPaint4.linkColor = color4;
                        textPaint4.setColor(color4);
                    }
                    TextPaint textPaint5 = Theme.dialogs_namePaint[dialogCell4.paintIndex];
                    int color5 = Theme.getColor(Theme.key_chats_secretName, dialogCell4.resourcesProvider);
                    textPaint5.linkColor = color5;
                    textPaint5.setColor(color5);
                }
                canvas3.save();
                canvas3.translate(dialogCell4.nameLeft + dialogCell4.nameLayoutTranslateX, dp3);
                SpoilerEffect.layoutDrawMaybe(dialogCell4.nameLayout, canvas3);
                StaticLayout staticLayout3 = dialogCell4.nameLayout;
                i10 = -1;
                i9 = i8;
                i7 = 2;
                f14 = 0.0f;
                f10 = 10.0f;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout3, dialogCell4.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(0, staticLayout3.getPaint().getColor()));
                canvas3.restore();
                if (dialogCell4.nameLayoutEllipsizeByGradient && !dialogCell4.nameLayoutFits) {
                    canvas3.save();
                    if (dialogCell4.nameLayoutEllipsizeLeft) {
                        canvas3.translate(dialogCell4.nameLeft, 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), dialogCell4.getMeasuredHeight(), dialogCell4.fadePaint);
                    } else {
                        canvas3.translate((dialogCell4.nameLeft + dialogCell4.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                        canvas3.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), dialogCell4.getMeasuredHeight(), dialogCell4.fadePaintBack);
                    }
                    canvas3.restore();
                    canvas3.restore();
                }
            } else {
                i9 = i8;
                i7 = 2;
                f14 = 0.0f;
                i10 = -1;
                f10 = 10.0f;
            }
            if (dialogCell4.timeLayout != null && dialogCell4.currentDialogFolderId == 0) {
                canvas3.save();
                canvas3.translate(dialogCell4.timeLeft, dialogCell4.timeTop);
                TextPaint timeTextPaint = dialogCell4.getTimeTextPaint();
                if (dialogCell4.getIsPinned()) {
                    canvas3.translate(AndroidUtilities.dp(20.0f), f14);
                    float height = (dialogCell4.timeLayout.getHeight() / 2.0f) - AndroidUtilities.dp(8.5f);
                    float f29 = -AndroidUtilities.dp(20.0f);
                    float width = dialogCell4.timeLayout.getWidth() + AndroidUtilities.dp(6.0f);
                    if (dialogCell4.drawCount && !dialogCell4.isCounterMuted()) {
                        drawable3 = Theme.dialogs_pinnedDrawable2Accent;
                    } else {
                        drawable3 = Theme.dialogs_pinnedDrawable2;
                    }
                    int dp4 = (int) (((AndroidUtilities.dp(17.0f) - drawable3.getIntrinsicHeight()) / 2.0f) + height);
                    int dp5 = ((int) f29) + AndroidUtilities.dp(f3);
                    drawable3.setBounds(dp5, dp4, drawable3.getIntrinsicWidth() + dp5, drawable3.getIntrinsicHeight() + dp4);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3.drawRoundRect(f29, height, width, AndroidUtilities.dp(17.0f) + height, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable3.draw(canvas3);
                }
                int color6 = dialogCell4.timeLayout.getPaint().getColor();
                boolean z14 = color6 != timeTextPaint.getColor();
                if (z14) {
                    dialogCell4.timeLayout.getPaint().setColor(timeTextPaint.getColor());
                }
                SpoilerEffect.layoutDrawMaybe(dialogCell4.timeLayout, canvas3);
                if (z14) {
                    dialogCell4.timeLayout.getPaint().setColor(color6);
                }
                canvas3.restore();
            }
            if (dialogCell4.drawLock2()) {
                Theme.dialogs_lock2Drawable.setBounds(dialogCell4.lock2Left, dialogCell4.timeTop + ((dialogCell4.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i7), dialogCell4.lock2Left + Theme.dialogs_lock2Drawable.getIntrinsicWidth(), dialogCell4.timeTop + ((dialogCell4.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i7) + Theme.dialogs_lock2Drawable.getIntrinsicHeight());
                Theme.dialogs_lock2Drawable.draw(canvas3);
            }
            if (dialogCell4.messageNameLayout != null && !dialogCell4.isForumCell()) {
                if (dialogCell4.currentDialogFolderId != 0) {
                    TextPaint textPaint6 = Theme.dialogs_messageNamePaint;
                    int color7 = Theme.getColor(Theme.key_chats_nameMessageArchived_threeLines, dialogCell4.resourcesProvider);
                    textPaint6.linkColor = color7;
                    textPaint6.setColor(color7);
                } else if (dialogCell4.draftMessage != null) {
                    TextPaint textPaint7 = Theme.dialogs_messageNamePaint;
                    int color8 = Theme.getColor(Theme.key_chats_draft, dialogCell4.resourcesProvider);
                    textPaint7.linkColor = color8;
                    textPaint7.setColor(color8);
                } else {
                    TextPaint textPaint8 = Theme.dialogs_messageNamePaint;
                    int color9 = Theme.getColor(Theme.key_chats_nameMessage_threeLines, dialogCell4.resourcesProvider);
                    textPaint8.linkColor = color9;
                    textPaint8.setColor(color9);
                }
                canvas3.save();
                canvas3.translate(dialogCell4.messageNameLeft, dialogCell4.messageNameTop);
                try {
                    SpoilerEffect.layoutDrawMaybe(dialogCell4.messageNameLayout, canvas3);
                    StaticLayout staticLayout4 = dialogCell4.messageNameLayout;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout4, dialogCell4.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(1, staticLayout4.getPaint().getColor()));
                } catch (Exception e) {
                    FileLog.e(e);
                }
                canvas3.restore();
            }
            if (dialogCell4.messageLayout != null) {
                if (dialogCell4.currentDialogFolderId != 0) {
                    if (dialogCell4.chat != null) {
                        TextPaint textPaint9 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                        int color10 = Theme.getColor(Theme.key_chats_nameMessageArchived, dialogCell4.resourcesProvider);
                        textPaint9.linkColor = color10;
                        textPaint9.setColor(color10);
                    } else {
                        TextPaint textPaint10 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                        int color11 = Theme.getColor(Theme.key_chats_messageArchived, dialogCell4.resourcesProvider);
                        textPaint10.linkColor = color11;
                        textPaint10.setColor(color11);
                    }
                } else {
                    TextPaint textPaint11 = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
                    int color12 = Theme.getColor(Theme.key_chats_message, dialogCell4.resourcesProvider);
                    textPaint11.linkColor = color12;
                    textPaint11.setColor(color12);
                }
                float dp6 = AndroidUtilities.dp(14.0f);
                DialogUpdateHelper dialogUpdateHelper2 = dialogCell4.updateHelper;
                if (dialogUpdateHelper2.typingOutToTop) {
                    f17 = dialogCell4.messageTop - (dialogUpdateHelper2.typingProgres * dp6);
                } else {
                    f17 = dialogCell4.messageTop + (dialogUpdateHelper2.typingProgres * dp6);
                }
                if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                    f17 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                }
                if (dialogCell4.updateHelper.typingProgres != 1.0f) {
                    canvas3.save();
                    canvas3.translate(dialogCell4.messageLeft, f17);
                    int alpha2 = dialogCell4.messageLayout.getPaint().getAlpha();
                    dialogCell4.messageLayout.getPaint().setAlpha((int) (alpha2 * (1.0f - dialogCell4.updateHelper.typingProgres)));
                    if (!dialogCell4.spoilers.isEmpty()) {
                        try {
                            canvas3.save();
                            SpoilerEffect.clipOutCanvas(canvas3, dialogCell4.spoilers);
                            SpoilerEffect.layoutDrawMaybe(dialogCell4.messageLayout, canvas3);
                            try {
                                StaticLayout staticLayout5 = dialogCell4.messageLayout;
                                try {
                                } catch (Exception e2) {
                                    e = e2;
                                    f18 = dp6;
                                    i15 = alpha2;
                                }
                                try {
                                    f18 = dp6;
                                    i15 = alpha2;
                                    f15 = 0.0f;
                                } catch (Exception e3) {
                                    e = e3;
                                    f18 = dp6;
                                    i15 = alpha2;
                                    f15 = 0.0f;
                                    FileLog.e(e);
                                    dialogCell4.messageLayout.getPaint().setAlpha(i15);
                                    canvas3.restore();
                                    canvas3.save();
                                    dialogUpdateHelper = dialogCell4.updateHelper;
                                    if (dialogUpdateHelper.typingOutToTop) {
                                    }
                                    if (!dialogCell4.useForceThreeLines) {
                                        f19 -= AndroidUtilities.dp(!dialogCell4.isForumCell() ? 10.0f : 11.0f);
                                        canvas3.translate(dialogCell4.typingLeft, f19);
                                        staticLayout2 = dialogCell4.typingLayout;
                                        if (staticLayout2 != null) {
                                            int alpha3 = staticLayout2.getPaint().getAlpha();
                                            dialogCell4.typingLayout.getPaint().setAlpha((int) (alpha3 * dialogCell4.updateHelper.typingProgres));
                                            dialogCell4.typingLayout.draw(canvas3);
                                            dialogCell4.typingLayout.getPaint().setAlpha(alpha3);
                                        }
                                        canvas3.restore();
                                        if (dialogCell4.typingLayout != null) {
                                        }
                                        i11 = 4;
                                        if (dialogCell4.buttonLayout != null) {
                                        }
                                        if (dialogCell4.currentDialogFolderId != 0) {
                                        }
                                        if (dialogCell3.drawBotVerified) {
                                        }
                                        if (dialogCell3.drawUnmute) {
                                        }
                                        if (dialogCell3.dialogsType != i7) {
                                            if (z6) {
                                            }
                                            if (!z6) {
                                            }
                                            float dp7 = (dialogCell3.drawPremium ? dialogCell3.nameMutedIconLeft : dialogCell3.nameMuteLeft) - AndroidUtilities.dp((!dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                                            float dp8 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                                            if (!dialogCell3.useForceThreeLines) {
                                            }
                                            dp8 -= AndroidUtilities.dp(!dialogCell3.isForumCell() ? 8.0f : 9.0f);
                                            BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp7, dp8);
                                            BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp7, dp8);
                                            DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                                            if (dialogCell3.dialogMutedProgress == 1.0f) {
                                            }
                                        }
                                        if (!dialogCell3.drawVerified) {
                                        }
                                        z3 = false;
                                        if (!dialogCell3.drawReorder) {
                                        }
                                        if (!LocaleController.isRTL) {
                                        }
                                        Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                                        Theme.dialogs_reorderDrawable.draw(canvas3);
                                        float floatValue = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
                                        if (dialogCell3.drawError) {
                                        }
                                        dialogCell = dialogCell3;
                                        if (dialogCell.thumbsCount > 0) {
                                        }
                                        i12 = -1;
                                        dialogCellTags = dialogCell.tags;
                                        if (dialogCellTags != null) {
                                        }
                                        i13 = i9;
                                        if (i13 != i12) {
                                        }
                                        z2 = z5;
                                        if (dialogCell.animatingArchiveAvatar) {
                                        }
                                        if (dialogCell.drawAvatar) {
                                            if (!dialogCell.drawMonoforumAvatar) {
                                            }
                                            if (!dialogCell.insideCommunityList) {
                                                float centerX = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                                                float centerY = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                                                if (dialogCell.communityArrowDrawable == null) {
                                                }
                                                DrawableUtils.setBounds(dialogCell.communityArrowDrawable, centerX, centerY, 17);
                                                canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                                                dialogCell.communityArrowDrawable.draw(canvas3);
                                            }
                                        }
                                        if (dialogCell.animatingArchiveAvatar) {
                                        }
                                        if (dialogCell.avatarImage.getVisible()) {
                                        }
                                        if (dialogCell.rightFragmentOpenedProgress > 0.0f) {
                                        }
                                        dialogCell2 = dialogCell;
                                        if (dialogCell2.collapseOffset != 0.0f) {
                                        }
                                        if (dialogCell2.translationX != 0.0f) {
                                        }
                                        if (dialogCell2.drawArchive) {
                                            canvas3.save();
                                            canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
                                            canvas3.clipRect(0.0f, dialogCell2.getMeasuredHeight() * (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
                                            dialogCell2.archivedChatsDrawable.draw(canvas3);
                                            canvas3.restore();
                                        }
                                        if (dialogCell2.useSeparator) {
                                        }
                                        f12 = 0.0f;
                                        if (dialogCell2.clipProgress != f12) {
                                        }
                                        canvas2 = canvas;
                                        if (z13) {
                                        }
                                        z4 = dialogCell2.drawReorder;
                                        if (!z4) {
                                        }
                                        if (!z4) {
                                        }
                                        r0 = true;
                                        if (!dialogCell2.archiveHidden) {
                                        }
                                    }
                                    f19 -= AndroidUtilities.dp(!dialogCell4.isForumCell() ? 10.0f : 11.0f);
                                    canvas3.translate(dialogCell4.typingLeft, f19);
                                    staticLayout2 = dialogCell4.typingLayout;
                                    if (staticLayout2 != null) {
                                    }
                                    canvas3.restore();
                                    if (dialogCell4.typingLayout != null) {
                                    }
                                    i11 = 4;
                                    if (dialogCell4.buttonLayout != null) {
                                    }
                                    if (dialogCell4.currentDialogFolderId != 0) {
                                    }
                                    if (dialogCell3.drawBotVerified) {
                                    }
                                    if (dialogCell3.drawUnmute) {
                                    }
                                    if (dialogCell3.dialogsType != i7) {
                                    }
                                    if (!dialogCell3.drawVerified) {
                                    }
                                    z3 = false;
                                    if (!dialogCell3.drawReorder) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                                    Theme.dialogs_reorderDrawable.draw(canvas3);
                                    float floatValue2 = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
                                    if (dialogCell3.drawError) {
                                    }
                                    dialogCell = dialogCell3;
                                    if (dialogCell.thumbsCount > 0) {
                                    }
                                    i12 = -1;
                                    dialogCellTags = dialogCell.tags;
                                    if (dialogCellTags != null) {
                                    }
                                    i13 = i9;
                                    if (i13 != i12) {
                                    }
                                    z2 = z5;
                                    if (dialogCell.animatingArchiveAvatar) {
                                    }
                                    if (dialogCell.drawAvatar) {
                                    }
                                    if (dialogCell.animatingArchiveAvatar) {
                                    }
                                    if (dialogCell.avatarImage.getVisible()) {
                                    }
                                    if (dialogCell.rightFragmentOpenedProgress > 0.0f) {
                                    }
                                    dialogCell2 = dialogCell;
                                    if (dialogCell2.collapseOffset != 0.0f) {
                                    }
                                    if (dialogCell2.translationX != 0.0f) {
                                    }
                                    if (dialogCell2.drawArchive) {
                                    }
                                    if (dialogCell2.useSeparator) {
                                    }
                                    f12 = 0.0f;
                                    if (dialogCell2.clipProgress != f12) {
                                    }
                                    canvas2 = canvas;
                                    if (z13) {
                                    }
                                    z4 = dialogCell2.drawReorder;
                                    if (!z4) {
                                    }
                                    if (!z4) {
                                    }
                                    r0 = true;
                                    if (!dialogCell2.archiveHidden) {
                                    }
                                }
                                try {
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout5, dialogCell4.animatedEmojiStack, -0.075f, dialogCell4.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(i7, staticLayout5.getPaint().getColor()));
                                    canvas3.restore();
                                    for (int i20 = 0; i20 < dialogCell4.spoilers.size(); i20++) {
                                        SpoilerEffect spoilerEffect = (SpoilerEffect) dialogCell4.spoilers.get(i20);
                                        spoilerEffect.setColor(dialogCell4.messageLayout.getPaint().getColor());
                                        spoilerEffect.draw(canvas3);
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    FileLog.e(e);
                                    dialogCell4.messageLayout.getPaint().setAlpha(i15);
                                    canvas3.restore();
                                    canvas3.save();
                                    dialogUpdateHelper = dialogCell4.updateHelper;
                                    if (dialogUpdateHelper.typingOutToTop) {
                                    }
                                    if (!dialogCell4.useForceThreeLines) {
                                    }
                                    f19 -= AndroidUtilities.dp(!dialogCell4.isForumCell() ? 10.0f : 11.0f);
                                    canvas3.translate(dialogCell4.typingLeft, f19);
                                    staticLayout2 = dialogCell4.typingLayout;
                                    if (staticLayout2 != null) {
                                    }
                                    canvas3.restore();
                                    if (dialogCell4.typingLayout != null) {
                                    }
                                    i11 = 4;
                                    if (dialogCell4.buttonLayout != null) {
                                    }
                                    if (dialogCell4.currentDialogFolderId != 0) {
                                    }
                                    if (dialogCell3.drawBotVerified) {
                                    }
                                    if (dialogCell3.drawUnmute) {
                                    }
                                    if (dialogCell3.dialogsType != i7) {
                                    }
                                    if (!dialogCell3.drawVerified) {
                                    }
                                    z3 = false;
                                    if (!dialogCell3.drawReorder) {
                                    }
                                    if (!LocaleController.isRTL) {
                                    }
                                    Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                                    Theme.dialogs_reorderDrawable.draw(canvas3);
                                    float floatValue22 = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
                                    if (dialogCell3.drawError) {
                                    }
                                    dialogCell = dialogCell3;
                                    if (dialogCell.thumbsCount > 0) {
                                    }
                                    i12 = -1;
                                    dialogCellTags = dialogCell.tags;
                                    if (dialogCellTags != null) {
                                    }
                                    i13 = i9;
                                    if (i13 != i12) {
                                    }
                                    z2 = z5;
                                    if (dialogCell.animatingArchiveAvatar) {
                                    }
                                    if (dialogCell.drawAvatar) {
                                    }
                                    if (dialogCell.animatingArchiveAvatar) {
                                    }
                                    if (dialogCell.avatarImage.getVisible()) {
                                    }
                                    if (dialogCell.rightFragmentOpenedProgress > 0.0f) {
                                    }
                                    dialogCell2 = dialogCell;
                                    if (dialogCell2.collapseOffset != 0.0f) {
                                    }
                                    if (dialogCell2.translationX != 0.0f) {
                                    }
                                    if (dialogCell2.drawArchive) {
                                    }
                                    if (dialogCell2.useSeparator) {
                                    }
                                    f12 = 0.0f;
                                    if (dialogCell2.clipProgress != f12) {
                                    }
                                    canvas2 = canvas;
                                    if (z13) {
                                    }
                                    z4 = dialogCell2.drawReorder;
                                    if (!z4) {
                                    }
                                    if (!z4) {
                                    }
                                    r0 = true;
                                    if (!dialogCell2.archiveHidden) {
                                    }
                                }
                            } catch (Exception e5) {
                                e = e5;
                                i15 = alpha2;
                                f18 = dp6;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            f18 = dp6;
                            i15 = alpha2;
                        }
                    } else {
                        f18 = dp6;
                        i15 = alpha2;
                        f15 = 0.0f;
                        SpoilerEffect.layoutDrawMaybe(dialogCell4.messageLayout, canvas3);
                        StaticLayout staticLayout6 = dialogCell4.messageLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout6, dialogCell4.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(i7, staticLayout6.getPaint().getColor()));
                    }
                    dialogCell4.messageLayout.getPaint().setAlpha(i15);
                    canvas3.restore();
                } else {
                    f18 = dp6;
                    f15 = 0.0f;
                }
                canvas3.save();
                dialogUpdateHelper = dialogCell4.updateHelper;
                if (dialogUpdateHelper.typingOutToTop) {
                    f19 = dialogCell4.messageTop + ((1.0f - dialogUpdateHelper.typingProgres) * f18);
                } else {
                    f19 = dialogCell4.messageTop - ((1.0f - dialogUpdateHelper.typingProgres) * f18);
                }
                if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                    f19 -= AndroidUtilities.dp(!dialogCell4.isForumCell() ? 10.0f : 11.0f);
                }
                canvas3.translate(dialogCell4.typingLeft, f19);
                staticLayout2 = dialogCell4.typingLayout;
                if (staticLayout2 != null && dialogCell4.updateHelper.typingProgres > f15) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    dialogCell4.typingLayout.getPaint().setAlpha((int) (alpha32 * dialogCell4.updateHelper.typingProgres));
                    dialogCell4.typingLayout.draw(canvas3);
                    dialogCell4.typingLayout.getPaint().setAlpha(alpha32);
                }
                canvas3.restore();
                if (dialogCell4.typingLayout != null) {
                    int i21 = dialogCell4.printingStringType;
                    if (i21 < 0) {
                        DialogUpdateHelper dialogUpdateHelper3 = dialogCell4.updateHelper;
                        if (dialogUpdateHelper3.typingProgres > f15) {
                        }
                    }
                    if (i21 < 0) {
                        i21 = dialogCell4.updateHelper.lastKnownTypingType;
                    }
                    StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(i21);
                    if (chatStatusDrawable != null) {
                        canvas3.save();
                        chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_actionMessage), (int) (Color.alpha(r4) * dialogCell4.updateHelper.typingProgres)));
                        DialogUpdateHelper dialogUpdateHelper4 = dialogCell4.updateHelper;
                        if (dialogUpdateHelper4.typingOutToTop) {
                            f20 = dialogCell4.messageTop + ((1.0f - dialogUpdateHelper4.typingProgres) * f18);
                        } else {
                            f20 = dialogCell4.messageTop - ((1.0f - dialogUpdateHelper4.typingProgres) * f18);
                        }
                        if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                            f20 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                        }
                        i11 = 4;
                        if (i21 == 1 || i21 == 4) {
                            canvas3.translate(dialogCell4.statusDrawableLeft, f20 + (i21 == 1 ? AndroidUtilities.dp(1.0f) : 0));
                        } else {
                            canvas3.translate(dialogCell4.statusDrawableLeft, f20 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
                        }
                        chatStatusDrawable.draw(canvas3);
                        dialogCell4.invalidate();
                        canvas3.restore();
                    }
                }
                i11 = 4;
            } else {
                i11 = 4;
                f15 = 0.0f;
            }
            if (dialogCell4.buttonLayout != null) {
                canvas3.save();
                if (dialogCell4.buttonBackgroundPaint == null) {
                    dialogCell4.buttonBackgroundPaint = new Paint(1);
                }
                if (dialogCell4.canvasButton == null) {
                    CanvasButton canvasButton = new CanvasButton(dialogCell4);
                    dialogCell4.canvasButton = canvasButton;
                    canvasButton.setDelegate(new Runnable() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogCell.$r8$lambda$Bm6dPIvEl1CBIJ0rkgFJeuc8aDc(DialogCell.this);
                        }
                    });
                    dialogCell4.canvasButton.setLongPress(new Runnable() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogCell.$r8$lambda$es4jnDRNX4B_rZRqrp8h9ARVsrg(DialogCell.this);
                        }
                    });
                }
                if (dialogCell4.lastTopicMessageUnread && dialogCell4.topMessageTopicEndIndex != dialogCell4.topMessageTopicStartIndex && ((i14 = dialogCell4.dialogsType) == 0 || i14 == 7 || i14 == 8)) {
                    dialogCell4.canvasButton.setColor(ColorUtils.setAlphaComponent(dialogCell4.currentMessagePaint.getColor(), Theme.isCurrentThemeDark() ? 36 : 26));
                    if (!dialogCell4.buttonCreated) {
                        dialogCell4.canvasButton.rewind();
                        int i22 = dialogCell4.topMessageTopicEndIndex;
                        if (i22 != dialogCell4.topMessageTopicStartIndex && i22 > 0) {
                            float f30 = dialogCell4.messageTop;
                            if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell4.isForumCell()) && dialogCell4.hasTags()) {
                                f30 -= AndroidUtilities.dp(dialogCell4.isForumCell() ? 10.0f : 11.0f);
                            }
                            RectF rectF = AndroidUtilities.rectTmp;
                            float dp9 = dialogCell4.messageLeft + AndroidUtilities.dp(2.0f) + dialogCell4.messageLayout.getPrimaryHorizontal(0);
                            float f31 = dialogCell4.messageLeft;
                            StaticLayout staticLayout7 = dialogCell4.messageLayout;
                            rectF.set(dp9, f30, (f31 + staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), dialogCell4.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), dialogCell4.buttonTop - AndroidUtilities.dp(f3));
                            rectF.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(f3));
                            if (rectF.right > rectF.left) {
                                dialogCell4.canvasButton.addRect(rectF);
                            }
                        }
                        float lineLeft = dialogCell4.buttonLayout.getLineLeft(0);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dialogCell4.buttonLeft + lineLeft + AndroidUtilities.dp(2.0f), dialogCell4.buttonTop + AndroidUtilities.dp(2.0f), dialogCell4.buttonLeft + lineLeft + dialogCell4.buttonLayout.getLineWidth(0) + AndroidUtilities.dp(12.0f), dialogCell4.buttonTop + dialogCell4.buttonLayout.getHeight());
                        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                        dialogCell4.canvasButton.addRect(rectF2);
                    }
                    dialogCell4.canvasButton.draw(canvas3);
                    Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                    Drawable drawable4 = Theme.dialogs_forum_arrowDrawable;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    BaseCell.setDrawableBounds(drawable4, rectF3.right - AndroidUtilities.dp(18.0f), rectF3.top + ((rectF3.height() - Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight()) / 2.0f));
                    Theme.dialogs_forum_arrowDrawable.draw(canvas3);
                }
                canvas3.translate(dialogCell4.buttonLeft, dialogCell4.buttonTop);
                if (!dialogCell4.spoilers2.isEmpty()) {
                    try {
                        canvas3.save();
                        SpoilerEffect.clipOutCanvas(canvas3, dialogCell4.spoilers2);
                        SpoilerEffect.layoutDrawMaybe(dialogCell4.buttonLayout, canvas3);
                        StaticLayout staticLayout8 = dialogCell4.buttonLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout8, dialogCell4.animatedEmojiStack3, -0.075f, dialogCell4.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(3, staticLayout8.getPaint().getColor()));
                        canvas3.restore();
                        for (int i23 = 0; i23 < dialogCell4.spoilers2.size(); i23++) {
                            SpoilerEffect spoilerEffect2 = (SpoilerEffect) dialogCell4.spoilers2.get(i23);
                            spoilerEffect2.setColor(dialogCell4.buttonLayout.getPaint().getColor());
                            spoilerEffect2.draw(canvas3);
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else {
                    SpoilerEffect.layoutDrawMaybe(dialogCell4.buttonLayout, canvas3);
                    StaticLayout staticLayout9 = dialogCell4.buttonLayout;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas3, staticLayout9, dialogCell4.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, dialogCell4.getAdaptiveEmojiColorFilter(3, staticLayout9.getPaint().getColor()));
                }
                canvas.restore();
            }
            if (dialogCell4.currentDialogFolderId != 0) {
                int i24 = (dialogCell4.drawClock ? 1 : 0) + (dialogCell4.drawCheck1 ? 2 : 0) + (dialogCell4.drawCheck2 ? 4 : 0);
                int i25 = dialogCell4.lastStatusDrawableParams;
                if (i25 >= 0 && i25 != i24 && !dialogCell4.statusDrawableAnimationInProgress) {
                    dialogCell4.createStatusDrawableAnimator(i25, i24);
                }
                boolean z15 = dialogCell4.statusDrawableAnimationInProgress;
                if (z15) {
                    i24 = dialogCell4.animateToStatusDrawableParams;
                }
                boolean z16 = (i24 & 1) != 0;
                boolean z17 = (i24 & 2) != 0;
                boolean z18 = (i24 & i11) != 0;
                if (z15) {
                    int i26 = dialogCell4.animateFromStatusDrawableParams;
                    boolean z19 = (i26 & 1) != 0;
                    if ((i26 & 2) != 0) {
                        z8 = z17;
                        z9 = true;
                    } else {
                        z8 = z17;
                        z9 = false;
                    }
                    if ((i26 & i11) != 0) {
                        z10 = z18;
                        z11 = true;
                    } else {
                        z10 = z18;
                        z11 = false;
                    }
                    if (!z16 && !z19 && z11 && !z9 && z8 && z10) {
                        boolean z20 = z8;
                        canvas3 = canvas;
                        dialogCell4.drawCheckStatus(canvas3, z16, z20, z10, true, dialogCell4.statusDrawableProgress);
                    } else {
                        boolean z21 = z8;
                        canvas3 = canvas;
                        dialogCell4.drawCheckStatus(canvas3, z19, z9, z11, false, 1.0f - dialogCell4.statusDrawableProgress);
                        dialogCell4.drawCheckStatus(canvas3, z16, z21, z10, false, dialogCell4.statusDrawableProgress);
                        dialogCell3 = this;
                        dialogCell3.lastStatusDrawableParams = (dialogCell3.drawClock ? 1 : 0) + (!dialogCell3.drawCheck1 ? 2 : 0) + (!dialogCell3.drawCheck2 ? 4 : 0);
                    }
                } else {
                    dialogCell4 = this;
                    canvas3 = canvas;
                    dialogCell4.drawCheckStatus(canvas3, z16, z17, z18, false, 1.0f);
                }
                dialogCell3 = dialogCell4;
                dialogCell3.lastStatusDrawableParams = (dialogCell3.drawClock ? 1 : 0) + (!dialogCell3.drawCheck1 ? 2 : 0) + (!dialogCell3.drawCheck2 ? 4 : 0);
            } else {
                canvas3 = canvas;
                dialogCell3 = dialogCell4;
            }
            if (dialogCell3.drawBotVerified) {
                int dp10 = AndroidUtilities.dp((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    dp10 -= AndroidUtilities.dp(9.0f);
                }
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = dialogCell3.botVerification;
                if (swapAnimatedEmojiDrawable != null) {
                    swapAnimatedEmojiDrawable.setBounds(dialogCell3.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + dp10, dialogCell3.nameLeft - AndroidUtilities.dp(2.0f), dp10 + AndroidUtilities.dp(16.0f));
                    dialogCell3.botVerification.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                    dialogCell3.botVerification.draw(canvas3);
                }
            }
            z6 = !dialogCell3.drawUnmute || dialogCell3.dialogMuted || dialogCell3.isHiddenInCommunity;
            if (dialogCell3.dialogsType != i7 && ((z6 || dialogCell3.dialogMutedProgress > f15) && !dialogCell3.drawVerified && dialogCell3.drawScam == 0)) {
                if (z6) {
                    float f32 = dialogCell3.dialogMutedProgress;
                    if (f32 != 1.0f) {
                        float f33 = f32 + 0.10666667f;
                        dialogCell3.dialogMutedProgress = f33;
                        if (f33 > 1.0f) {
                            dialogCell3.dialogMutedProgress = 1.0f;
                        } else {
                            dialogCell3.invalidate();
                        }
                        float dp72 = (dialogCell3.drawPremium ? dialogCell3.nameMutedIconLeft : dialogCell3.nameMuteLeft) - AndroidUtilities.dp((!dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                        float dp82 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                        if (((!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                            dp82 -= AndroidUtilities.dp(!dialogCell3.isForumCell() ? 8.0f : 9.0f);
                        }
                        BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp72, dp82);
                        BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp72, dp82);
                        DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                        if (dialogCell3.dialogMutedProgress == 1.0f) {
                            canvas3.save();
                            float f34 = dialogCell3.dialogMutedProgress;
                            canvas3.scale(f34, f34, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
                            if (dialogCell3.isHiddenInCommunity) {
                                Theme.dialogs_hiddenDrawable.setAlpha((int) (dialogCell3.dialogMutedProgress * 255.0f));
                                Theme.dialogs_hiddenDrawable.draw(canvas3);
                                Theme.dialogs_hiddenDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                            } else if (dialogCell3.drawUnmute) {
                                Theme.dialogs_unmuteDrawable.setAlpha((int) (dialogCell3.dialogMutedProgress * 255.0f));
                                Theme.dialogs_unmuteDrawable.draw(canvas3);
                                Theme.dialogs_unmuteDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                            } else {
                                Theme.dialogs_muteDrawable.setAlpha((int) (dialogCell3.dialogMutedProgress * 255.0f));
                                Theme.dialogs_muteDrawable.draw(canvas3);
                                Theme.dialogs_muteDrawable.setAlpha(NotificationCenter.didReceiveSmsCode);
                            }
                            canvas3.restore();
                        } else if (dialogCell3.isHiddenInCommunity) {
                            Theme.dialogs_hiddenDrawable.draw(canvas3);
                        } else if (dialogCell3.drawUnmute) {
                            Theme.dialogs_unmuteDrawable.draw(canvas3);
                        } else {
                            Theme.dialogs_muteDrawable.draw(canvas3);
                        }
                    }
                }
                if (!z6) {
                    float f35 = dialogCell3.dialogMutedProgress;
                    if (f35 != f15) {
                        float f36 = f35 - 0.10666667f;
                        dialogCell3.dialogMutedProgress = f36;
                        if (f36 < f15) {
                            dialogCell3.dialogMutedProgress = 0.0f;
                        } else {
                            dialogCell3.invalidate();
                        }
                    }
                }
                float dp722 = (dialogCell3.drawPremium ? dialogCell3.nameMutedIconLeft : dialogCell3.nameMuteLeft) - AndroidUtilities.dp((!dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                float dp822 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                if (!dialogCell3.useForceThreeLines) {
                    dp822 -= AndroidUtilities.dp(!dialogCell3.isForumCell() ? 8.0f : 9.0f);
                    BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp722, dp822);
                    BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp722, dp822);
                    DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                    if (dialogCell3.dialogMutedProgress == 1.0f) {
                    }
                }
                dp822 -= AndroidUtilities.dp(!dialogCell3.isForumCell() ? 8.0f : 9.0f);
                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp722, dp822);
                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp722, dp822);
                DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                if (dialogCell3.dialogMutedProgress == 1.0f) {
                }
            }
            if (!dialogCell3.drawVerified) {
                float dp11 = AndroidUtilities.dp((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                if (((!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    dp11 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), dp11);
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f), dp11);
                Theme.dialogs_verifiedDrawable.draw(canvas3);
                Theme.dialogs_verifiedCheckDrawable.draw(canvas3);
            } else if (dialogCell3.drawPremium) {
                int dp12 = AndroidUtilities.dp((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    dp12 -= AndroidUtilities.dp(9.0f);
                }
                if (dialogCell3.emojiStatus != null) {
                    dialogCell3.emojiStatusView.setTranslationX((f24 + dialogCell3.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                    dialogCell3.emojiStatusView.setTranslationY((f9 + dp12) - AndroidUtilities.dp(f3));
                    if (dialogCell3.rightFragmentOpenedProgress > 0.0f) {
                        dialogCell3.emojiStatus.setBounds(dialogCell3.nameMuteLeft - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(f3), dialogCell3.nameMuteLeft + AndroidUtilities.dp(20.0f), (dp12 - AndroidUtilities.dp(f3)) + AndroidUtilities.dp(22.0f));
                        dialogCell3.emojiStatus.draw(canvas3);
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    dialogCell3.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, dialogCell3.resourcesProvider)));
                    z3 = z7;
                    if (!dialogCell3.drawReorder || dialogCell3.reorderIconProgress != 0.0f) {
                        if (!LocaleController.isRTL) {
                            Paint paintReorderGradient = dialogCell3.getPaintReorderGradient();
                            paintReorderGradient.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                            canvas3.save();
                            canvas3.translate(dialogCell3.pinLeft - AndroidUtilities.dp(24.0f), dialogCell3.pinTop);
                            canvas.drawRect(0.0f, 0.0f, dialogCell3.getMeasuredWidth() - (dialogCell3.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient);
                            canvas3 = canvas;
                            canvas3.restore();
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas3);
                    }
                    float floatValue222 = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
                    if (dialogCell3.drawError) {
                        Theme.dialogs_errorDrawable.setAlpha((int) ((1.0f - dialogCell3.reorderIconProgress) * 255.0f));
                        dialogCell3.rect.set(dialogCell3.errorLeft, dialogCell3.errorTop, r1 + AndroidUtilities.dp(20.666f), dialogCell3.errorTop + AndroidUtilities.dp(20.666f));
                        RectF rectF4 = dialogCell3.rect;
                        float f37 = AndroidUtilities.density * 10.5f;
                        canvas3.drawRoundRect(rectF4, f37, f37, Theme.dialogs_errorPaint);
                        BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, dialogCell3.errorLeft + AndroidUtilities.dp(4.5f), dialogCell3.errorTop + AndroidUtilities.dp(5.0f));
                        Theme.dialogs_errorDrawable.draw(canvas3);
                    } else if (((dialogCell3.drawCount || dialogCell3.drawMention) && dialogCell3.drawCount2) || dialogCell3.countChangeProgress != 1.0f || dialogCell3.drawReactionMention || dialogCell3.reactionsMentionsChangeProgress != 1.0f || dialogCell3.drawPollVotesMention || floatValue222 > 0.0f) {
                        boolean isCounterMuted = dialogCell3.isCounterMuted();
                        canvas3 = canvas;
                        drawCounter(canvas3, isCounterMuted, dialogCell3.countTop, dialogCell3.countLeft, dialogCell3.countLeftOld, 1.0f, false);
                        dialogCell = this;
                        if (dialogCell.drawMention) {
                            Theme.dialogs_countPaint.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            if (dialogCell.mentionLayout != null) {
                                dialogCell.rect.set(dialogCell.mentionLeft, dialogCell.countTop, r1 + dialogCell.mentionWidth + AndroidUtilities.dp(12.666f), dialogCell.countTop + AndroidUtilities.dp(20.666f));
                                Paint paint3 = (!isCounterMuted || dialogCell.folderId == 0) ? Theme.dialogs_countPaint : Theme.dialogs_countGrayPaint;
                                RectF rectF5 = dialogCell.rect;
                                canvas3.drawRoundRect(rectF5, rectF5.height() / 2.0f, dialogCell.rect.height() / 2.0f, paint3);
                                Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                canvas3.save();
                                canvas3.translate(dialogCell.mentionLeft + AndroidUtilities.dp(6.333f), dialogCell.countTop + AndroidUtilities.dp(f3));
                                dialogCell.mentionLayout.draw(canvas3);
                                canvas3.restore();
                            } else {
                                Drawable drawable5 = Theme.dialogs_mentionDrawable;
                                drawable5.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                                DrawableUtils.setBounds(drawable5, dialogCell.mentionLeft + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                                drawable5.draw(canvas3);
                            }
                        }
                        if (dialogCell.drawReactionMention || dialogCell.reactionsMentionsChangeProgress != 1.0f) {
                            dialogCell.rect.set(dialogCell.reactionMentionLeft, dialogCell.countTop, AndroidUtilities.dp(20.666f) + r1, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                            float f38 = dialogCell.reactionsMentionsChangeProgress;
                            if (f38 == 1.0f) {
                                f38 = 1.0f;
                            } else if (!dialogCell.drawReactionMention) {
                                f38 = 1.0f - f38;
                            }
                            if (isCounterMuted) {
                                drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                            } else {
                                drawable = Theme.dialogs_reactionsMentionDrawable;
                            }
                            drawable.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            DrawableUtils.setBounds(drawable, r1 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                            DrawableUtils.drawWithScale(canvas3, drawable, f38);
                        }
                        if ((dialogCell.drawPollVotesMention || floatValue222 > 0.0f) && floatValue222 != 0.0f) {
                            dialogCell.rect.set(dialogCell.pollVotesMentionLeft, dialogCell.countTop, AndroidUtilities.dp(20.666f) + r1, dialogCell.countTop + AndroidUtilities.dp(20.666f));
                            if (isCounterMuted) {
                                drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                            } else {
                                drawable2 = Theme.dialogs_pollMentionDrawable;
                            }
                            drawable2.setAlpha((int) ((1.0f - dialogCell.reorderIconProgress) * 255.0f));
                            DrawableUtils.setBounds(drawable2, r1 + AndroidUtilities.dp(10.333f), dialogCell.countTop + AndroidUtilities.dp(10.333f), 17);
                            DrawableUtils.drawWithScale(canvas3, drawable2, floatValue222);
                        }
                        if (dialogCell.thumbsCount > 0) {
                            float f39 = dialogCell.updateHelper.typingProgres;
                            if (f39 != 1.0f) {
                                if (f39 > 0.0f) {
                                    canvas.saveLayerAlpha(0.0f, 0.0f, dialogCell.getWidth(), dialogCell.getHeight(), (int) ((1.0f - f39) * 255.0f), 31);
                                    canvas3 = canvas;
                                    if (dialogCell.updateHelper.typingOutToTop) {
                                        dp = -AndroidUtilities.dp(14.0f);
                                        f16 = dialogCell.updateHelper.typingProgres;
                                    } else {
                                        dp = AndroidUtilities.dp(14.0f);
                                        f16 = dialogCell.updateHelper.typingProgres;
                                    }
                                    canvas3.translate(0.0f, dp * f16);
                                }
                                int i27 = 0;
                                while (i27 < dialogCell.thumbsCount) {
                                    if (dialogCell.thumbImageSeen[i27]) {
                                        if (dialogCell.thumbBackgroundPaint == null) {
                                            Paint paint4 = new Paint(1);
                                            dialogCell.thumbBackgroundPaint = paint4;
                                            paint4.setShadowLayer(AndroidUtilities.dp(1.34f), 0.0f, AndroidUtilities.dp(0.34f), 402653184);
                                            dialogCell.thumbBackgroundPaint.setColor(0);
                                        }
                                        RectF rectF6 = AndroidUtilities.rectTmp;
                                        rectF6.set(dialogCell.thumbImage[i27].getImageX(), dialogCell.thumbImage[i27].getImageY(), dialogCell.thumbImage[i27].getImageX2(), dialogCell.thumbImage[i27].getImageY2());
                                        dialogCell.thumbImage[i27].draw(canvas3);
                                        if (dialogCell.drawSpoiler[i27]) {
                                            Path path = dialogCell.thumbPath;
                                            if (path == null) {
                                                dialogCell.thumbPath = new Path();
                                            } else {
                                                path.rewind();
                                            }
                                            dialogCell.thumbPath.addRoundRect(rectF6, dialogCell.thumbImage[i27].getRoundRadius()[0], dialogCell.thumbImage[i27].getRoundRadius()[1], Path.Direction.CW);
                                            canvas3.save();
                                            canvas3.clipPath(dialogCell.thumbPath);
                                            if (dialogCell.thumbSpoiler == null) {
                                                dialogCell.thumbSpoiler = new SpoilerEffect();
                                            }
                                            dialogCell.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i10) * 0.325f)));
                                            dialogCell.thumbSpoiler.setBounds((int) dialogCell.thumbImage[i27].getImageX(), (int) dialogCell.thumbImage[i27].getImageY(), (int) dialogCell.thumbImage[i27].getImageX2(), (int) dialogCell.thumbImage[i27].getImageY2());
                                            dialogCell.thumbSpoiler.draw(canvas3);
                                            dialogCell.invalidate();
                                            canvas3.restore();
                                        }
                                        if (dialogCell.drawPlay[i27]) {
                                            BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (dialogCell.thumbImage[i27].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / i7)), (int) (dialogCell.thumbImage[i27].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / i7)));
                                            Theme.dialogs_playDrawable.draw(canvas3);
                                        }
                                    }
                                    i27++;
                                    i10 = -1;
                                }
                                i12 = -1;
                                if (dialogCell.updateHelper.typingProgres > 0.0f) {
                                    canvas3.restore();
                                }
                                dialogCellTags = dialogCell.tags;
                                if (dialogCellTags != null && !dialogCellTags.isEmpty()) {
                                    canvas3.save();
                                    canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                                    dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                                    canvas3.restore();
                                }
                                i13 = i9;
                                if (i13 != i12) {
                                    canvas3.restoreToCount(i13);
                                }
                                z2 = z5;
                            }
                        }
                        i12 = -1;
                        dialogCellTags = dialogCell.tags;
                        if (dialogCellTags != null) {
                            canvas3.save();
                            canvas3.translate(dialogCell.tagsLeft, (dialogCell.getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (dialogCell.useSeparator ? 1 : 0));
                            dialogCell.tags.draw(canvas3, dialogCell.tagsRight - dialogCell.tagsLeft);
                            canvas3.restore();
                        }
                        i13 = i9;
                        if (i13 != i12) {
                        }
                        z2 = z5;
                    } else {
                        if (dialogCell3.openBot) {
                            canvas3.save();
                            float scale = dialogCell3.openButtonBounce.getScale(0.05f);
                            canvas3.scale(scale, scale, dialogCell3.openButtonRect.centerX(), dialogCell3.openButtonRect.centerY());
                            dialogCell3.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, dialogCell3.resourcesProvider));
                            RectF rectF7 = dialogCell3.openButtonRect;
                            canvas3.drawRoundRect(rectF7, rectF7.height() / 2.0f, dialogCell3.openButtonRect.height() / 2.0f, dialogCell3.openButtonBackgroundPaint);
                            Text text = dialogCell3.openButtonText;
                            if (text != null) {
                                text.draw(canvas3, dialogCell3.openButtonRect.left + AndroidUtilities.dp(13.0f), dialogCell3.openButtonRect.centerY(), Theme.getColor(Theme.key_featuredStickers_buttonText, dialogCell3.resourcesProvider), 1.0f);
                            }
                            canvas.restore();
                        }
                        canvas3 = canvas;
                    }
                    dialogCell = dialogCell3;
                    if (dialogCell.thumbsCount > 0) {
                    }
                    i12 = -1;
                    dialogCellTags = dialogCell.tags;
                    if (dialogCellTags != null) {
                    }
                    i13 = i9;
                    if (i13 != i12) {
                    }
                    z2 = z5;
                } else {
                    Drawable drawable6 = PremiumGradient.getInstance().premiumStarDrawableMini;
                    int dp13 = dialogCell3.nameMuteLeft - AndroidUtilities.dp(1.0f);
                    if (!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f22 = 15.5f;
                    }
                    BaseCell.setDrawableBounds(drawable6, dp13, AndroidUtilities.dp(f22));
                    drawable6.draw(canvas3);
                }
            } else if (dialogCell3.drawScam != 0) {
                int dp14 = AndroidUtilities.dp((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.0f : 15.0f);
                if (((!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell3.isForumCell()) && dialogCell3.hasTags()) {
                    dp14 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds((Drawable) (dialogCell3.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable), dialogCell3.nameMuteLeft, dp14);
                (dialogCell3.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).draw(canvas3);
            }
            z3 = false;
            if (!dialogCell3.drawReorder) {
            }
            if (!LocaleController.isRTL) {
            }
            Theme.dialogs_reorderDrawable.setAlpha((int) (dialogCell3.reorderIconProgress * 255.0f));
            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, dialogCell3.pinLeft, dialogCell3.pinTop);
            Theme.dialogs_reorderDrawable.draw(canvas3);
            float floatValue2222 = dialogCell3.animatorPollVotesMentionVisible.getFloatValue();
            if (dialogCell3.drawError) {
            }
            dialogCell = dialogCell3;
            if (dialogCell.thumbsCount > 0) {
            }
            i12 = -1;
            dialogCellTags = dialogCell.tags;
            if (dialogCellTags != null) {
            }
            i13 = i9;
            if (i13 != i12) {
            }
            z2 = z5;
        } else {
            dialogCell = dialogCell4;
            i7 = 2;
            f10 = 10.0f;
            z2 = false;
            z3 = false;
        }
        if (dialogCell.animatingArchiveAvatar) {
            f11 = 170.0f;
        } else {
            canvas3.save();
            f11 = 170.0f;
            float interpolation3 = dialogCell.interpolator.getInterpolation(dialogCell.animatingArchiveAvatarProgress / 170.0f) + 1.0f;
            canvas3.scale(interpolation3, interpolation3, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY());
        }
        if (dialogCell.drawAvatar && (!dialogCell.isTopic || (tL_forumTopic2 = dialogCell.forumTopic) == null || tL_forumTopic2.id != 1 || (pullForegroundDrawable = dialogCell.archivedChatsDrawable) == null || !pullForegroundDrawable.isDraw())) {
            if (!dialogCell.drawMonoforumAvatar) {
                if (dialogCell.bubbleClip == null) {
                    dialogCell.bubbleClip = new PhotoBubbleClip();
                }
                dialogCell.bubbleClip.setBounds((int) dialogCell.storyParams.originalAvatarRect.centerX(), (int) dialogCell.storyParams.originalAvatarRect.centerY(), (int) (dialogCell.storyParams.originalAvatarRect.width() / 2.0f));
                canvas3.save();
                canvas3.clipPath(dialogCell.bubbleClip);
                dialogCell.avatarImage.setImageCoords(dialogCell.storyParams.originalAvatarRect);
                dialogCell.avatarImage.draw(canvas3);
                canvas3.restore();
            } else if (dialogCell.drawCommunityAvatar) {
                DrawableUtils.setBounds(dialogCell.avatarImage, dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dpf2(1.0f), dialogCell.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), 17);
                DrawableUtils.drawCommunityCardDrawable(canvas3, Theme.dialogs_communityCardsDrawable, dialogCell.avatarImage.getCenterX(), dialogCell.avatarImage.getCenterY(), AndroidUtilities.dp(48.0f));
                dialogCell.avatarImage.draw(canvas3);
            } else {
                StoriesUtilities.AvatarStoryParams avatarStoryParams = dialogCell.storyParams;
                boolean z22 = dialogCell.isShareToStoryCell;
                avatarStoryParams.drawHiddenStoriesAsSegments = z22 || dialogCell.currentDialogFolderId != 0;
                int i28 = avatarStoryParams.forceState;
                if (z22) {
                    avatarStoryParams.forceState = 1;
                }
                StoriesUtilities.drawAvatarWithStory(dialogCell.currentDialogId, canvas3, dialogCell.avatarImage, avatarStoryParams);
                if (dialogCell.storyParams.drawnLive) {
                    dialogCell.checkTtl();
                }
                dialogCell.storyParams.forceState = i28;
            }
            if (!dialogCell.insideCommunityList && ((((chat = dialogCell.chat) != null && chat.linked_community_id != 0) || ((user = dialogCell.user) != null && user.linked_community_id != 0)) && !dialogCell.drawCommunityAvatar && dialogCell.isDialogCell && !dialogCell.isDialogFolder())) {
                float centerX2 = dialogCell.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                float centerY2 = dialogCell.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                if (dialogCell.communityArrowDrawable == null) {
                    dialogCell.communityArrowDrawable = new CommunityArrowDrawable();
                }
                DrawableUtils.setBounds(dialogCell.communityArrowDrawable, centerX2, centerY2, 17);
                canvas3.drawCircle(dialogCell.communityArrowDrawable.getBounds().exactCenterX(), dialogCell.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell.resourcesProvider)));
                dialogCell.communityArrowDrawable.draw(canvas3);
            }
        }
        if (dialogCell.animatingArchiveAvatar) {
            canvas3.restore();
        }
        boolean z23 = (dialogCell.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) ? z2 : true;
        if (dialogCell.rightFragmentOpenedProgress > 0.0f || dialogCell.currentDialogFolderId != 0) {
            dialogCell2 = dialogCell;
        } else {
            boolean isCounterMuted2 = dialogCell.isCounterMuted();
            RectF rectF8 = dialogCell.storyParams.originalAvatarRect;
            int width2 = (int) (((rectF8.left + rectF8.width()) - dialogCell.countWidth) - AndroidUtilities.dp(5.0f));
            RectF rectF9 = dialogCell.storyParams.originalAvatarRect;
            drawCounter(canvas3, isCounterMuted2, (int) ((dialogCell.avatarImage.getImageY() + dialogCell.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width2, (int) (((rectF9.left + rectF9.width()) - dialogCell.countWidthOld) - AndroidUtilities.dp(5.0f)), dialogCell.rightFragmentOpenedProgress, true);
            dialogCell2 = this;
        }
        if (dialogCell2.collapseOffset != 0.0f) {
            canvas3.restore();
        }
        if (dialogCell2.translationX != 0.0f) {
            canvas3.restore();
        }
        if (dialogCell2.drawArchive && ((dialogCell2.currentDialogFolderId != 0 || (dialogCell2.isTopic && (tL_forumTopic = dialogCell2.forumTopic) != null && tL_forumTopic.id == 1)) && dialogCell2.translationX == 0.0f && dialogCell2.archivedChatsDrawable != null)) {
            canvas3.save();
            canvas3.translate(0.0f, (-dialogCell2.translateY) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress));
            canvas3.clipRect(0.0f, dialogCell2.getMeasuredHeight() * (1.0f - dialogCell2.archivedChatsDrawable.getPullProgress()), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight());
            dialogCell2.archivedChatsDrawable.draw(canvas3);
            canvas3.restore();
        }
        if (dialogCell2.useSeparator) {
            int dp15 = (dialogCell2.fullSeparator || !(dialogCell2.currentDialogFolderId == 0 || !dialogCell2.archiveHidden || dialogCell2.fullSeparator2) || (dialogCell2.fullSeparator2 && !dialogCell2.archiveHidden)) ? 0 : AndroidUtilities.dp(dialogCell2.messagePaddingStart);
            if (dialogCell2.rightFragmentOpenedProgress != 1.0f) {
                int alpha4 = Theme.dividerPaint.getAlpha();
                float f40 = dialogCell2.rightFragmentOpenedProgress;
                if (f40 != 0.0f) {
                    Theme.dividerPaint.setAlpha((int) (alpha4 * (1.0f - f40)));
                }
                float measuredHeight3 = (dialogCell2.getMeasuredHeight() - 1) - (dialogCell2.rightFragmentOffset * dialogCell2.rightFragmentOpenedProgress);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight3, dialogCell2.getMeasuredWidth() - dp15, measuredHeight3, Theme.dividerPaint);
                } else {
                    canvas.drawLine(dp15, measuredHeight3, dialogCell2.getMeasuredWidth(), measuredHeight3, Theme.dividerPaint);
                }
                f12 = 0.0f;
                if (dialogCell2.rightFragmentOpenedProgress != 0.0f) {
                    Theme.dividerPaint.setAlpha(alpha4);
                }
                if (dialogCell2.clipProgress != f12) {
                    if (Build.VERSION.SDK_INT != 24) {
                        canvas.restore();
                    } else {
                        Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, dialogCell2.resourcesProvider));
                        canvas.drawRect(0.0f, 0.0f, dialogCell2.getMeasuredWidth(), dialogCell2.topClip * dialogCell2.clipProgress, Theme.dialogs_pinnedPaint);
                        canvas.drawRect(0.0f, dialogCell2.getMeasuredHeight() - ((int) (dialogCell2.bottomClip * dialogCell2.clipProgress)), dialogCell2.getMeasuredWidth(), dialogCell2.getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                        canvas2 = canvas;
                        if (z13) {
                            float f41 = 1.0f - pullProgress;
                            int measuredHeight4 = (int) (dialogCell2.getMeasuredHeight() * f41);
                            int color13 = Theme.getColor(Theme.key_windowBackgroundWhite);
                            if (dialogCell2.archiveFadeGradientDrawable == null) {
                                dialogCell2.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
                            }
                            if (dialogCell2.archiveFadeGradientDrawableColor != color13) {
                                dialogCell2.archiveFadeGradientDrawableColor = color13;
                                dialogCell2.archiveFadeGradientDrawable.setColors(new int[]{color13, 16777215 & color13});
                            }
                            float clamp2 = MathUtils.clamp((f41 - 0.05f) * f10, 0.0f, 1.0f);
                            dialogCell2.archiveFadeGradientDrawable.setBounds(0, measuredHeight4, dialogCell2.getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight4);
                            dialogCell2.archiveFadeGradientDrawable.setAlpha((int) (clamp2 * 255.0f));
                            dialogCell2.archiveFadeGradientDrawable.draw(canvas2);
                            canvas2.restore();
                        }
                        z4 = dialogCell2.drawReorder;
                        if (!z4 || dialogCell2.reorderIconProgress != 0.0f) {
                            if (!z4) {
                                float f42 = dialogCell2.reorderIconProgress;
                                if (f42 < 1.0f) {
                                    float f43 = f42 + 0.09411765f;
                                    dialogCell2.reorderIconProgress = f43;
                                    if (f43 > 1.0f) {
                                        dialogCell2.reorderIconProgress = 1.0f;
                                    }
                                    f13 = 0.0f;
                                }
                            } else {
                                float f44 = dialogCell2.reorderIconProgress;
                                f13 = 0.0f;
                                if (f44 > 0.0f) {
                                    float f45 = f44 - 0.09411765f;
                                    dialogCell2.reorderIconProgress = f45;
                                    if (f45 < 0.0f) {
                                        dialogCell2.reorderIconProgress = 0.0f;
                                    }
                                }
                                if (!dialogCell2.archiveHidden) {
                                    float f46 = dialogCell2.archiveBackgroundProgress;
                                    if (f46 > f13) {
                                        float f47 = f46 - 0.069565214f;
                                        dialogCell2.archiveBackgroundProgress = f47;
                                        if (f47 < f13) {
                                            dialogCell2.archiveBackgroundProgress = f13;
                                        }
                                        if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                            dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                        }
                                        z23 = true;
                                    }
                                    if (!dialogCell2.animatingArchiveAvatar) {
                                        float f48 = dialogCell2.animatingArchiveAvatarProgress + 16.0f;
                                        dialogCell2.animatingArchiveAvatarProgress = f48;
                                        if (f48 >= f11) {
                                            dialogCell2.animatingArchiveAvatarProgress = f11;
                                            dialogCell2.animatingArchiveAvatar = false;
                                        }
                                        z23 = true;
                                    }
                                    if (!dialogCell2.drawRevealBackground) {
                                        float f49 = dialogCell2.currentRevealBounceProgress;
                                        if (f49 < 1.0f) {
                                            float f50 = f49 + 0.09411765f;
                                            dialogCell2.currentRevealBounceProgress = f50;
                                            if (f50 > 1.0f) {
                                                dialogCell2.currentRevealBounceProgress = 1.0f;
                                                z23 = true;
                                            }
                                        }
                                        float f51 = dialogCell2.currentRevealProgress;
                                        if (f51 < 1.0f) {
                                            float f52 = f51 + 0.053333335f;
                                            dialogCell2.currentRevealProgress = f52;
                                            if (f52 > 1.0f) {
                                                dialogCell2.currentRevealProgress = 1.0f;
                                            }
                                            z23 = true;
                                        }
                                        dialogCell2.emojiStatusView.setVisibility(!z3 ? 0 : 4);
                                        if (z23) {
                                            return;
                                        }
                                        dialogCell2.invalidate();
                                        return;
                                    }
                                    if (dialogCell2.currentRevealBounceProgress == 1.0f) {
                                        dialogCell2.currentRevealBounceProgress = 0.0f;
                                        z23 = true;
                                    }
                                    float f53 = dialogCell2.currentRevealProgress;
                                    if (f53 > 0.0f) {
                                        float f54 = f53 - 0.053333335f;
                                        dialogCell2.currentRevealProgress = f54;
                                        if (f54 < 0.0f) {
                                            dialogCell2.currentRevealProgress = 0.0f;
                                        }
                                        z23 = true;
                                    }
                                    dialogCell2.emojiStatusView.setVisibility(!z3 ? 0 : 4);
                                    if (z23) {
                                    }
                                } else {
                                    float f55 = dialogCell2.archiveBackgroundProgress;
                                    if (f55 < 1.0f) {
                                        float f56 = f55 + 0.069565214f;
                                        dialogCell2.archiveBackgroundProgress = f56;
                                        if (f56 > 1.0f) {
                                            dialogCell2.archiveBackgroundProgress = 1.0f;
                                        }
                                        if (dialogCell2.avatarDrawable.getAvatarType() == i7) {
                                            dialogCell2.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(dialogCell2.archiveBackgroundProgress));
                                        }
                                        z23 = true;
                                    }
                                    if (!dialogCell2.animatingArchiveAvatar) {
                                    }
                                    if (!dialogCell2.drawRevealBackground) {
                                    }
                                }
                            }
                            z23 = true;
                            if (!dialogCell2.archiveHidden) {
                            }
                        }
                        f13 = 0.0f;
                        if (!dialogCell2.archiveHidden) {
                        }
                    }
                }
                canvas2 = canvas;
                if (z13) {
                }
                z4 = dialogCell2.drawReorder;
                if (!z4) {
                }
                if (!z4) {
                }
                z23 = true;
                if (!dialogCell2.archiveHidden) {
                }
            }
        }
        f12 = 0.0f;
        if (dialogCell2.clipProgress != f12) {
        }
        canvas2 = canvas;
        if (z13) {
        }
        z4 = dialogCell2.drawReorder;
        if (!z4) {
        }
        if (!z4) {
        }
        z23 = true;
        if (!dialogCell2.archiveHidden) {
        }
    }

    public static /* synthetic */ void $r8$lambda$Bm6dPIvEl1CBIJ0rkgFJeuc8aDc(DialogCell dialogCell) {
        DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
        if (dialogCellDelegate != null) {
            dialogCellDelegate.onButtonClicked(dialogCell);
        }
    }

    public static /* synthetic */ void $r8$lambda$es4jnDRNX4B_rZRqrp8h9ARVsrg(DialogCell dialogCell) {
        DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
        if (dialogCellDelegate != null) {
            dialogCellDelegate.onButtonLongPress(dialogCell);
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

    /* JADX WARN: Code restructure failed: missing block: B:58:0x022a, code lost:
    
        if (r3 > 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026a  */
    @Override // org.telegram.ui.Stories.StoriesListPlaceProvider.AvatarOverlaysView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawAvatarOverlays(Canvas canvas) {
        boolean z;
        float f;
        int dp;
        int i;
        float f2;
        float dp2;
        float dp3;
        float dp4;
        float f3;
        float dp5;
        float dp6;
        float f4;
        float f5;
        boolean z2;
        float dp7;
        float dp8;
        CheckBox2 checkBox2;
        TLRPC.Chat chat = this.chat;
        boolean z3 = false;
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
            int dp9 = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i2 = (int) imageX2;
            int i3 = (int) imageY2;
            int i4 = i3 - dp9;
            rect.set((AndroidUtilities.dp(1.66f) + i2) - dp9, i4, AndroidUtilities.dp(1.66f) + i2, i3);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.starBg.setBounds(rect);
            int i5 = (int) (progress * 255.0f);
            this.starBg.setAlpha(i5);
            this.starBg.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i2) - dp9, i4, i2 + AndroidUtilities.dp(1.66f), i3);
            this.starFg.setBounds(rect);
            this.starFg.setAlpha(i5);
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
                int i6 = this.ttlPeriod;
                if (time != i6) {
                }
                if (this.timerPaint == null) {
                    this.timerPaint = new Paint(1);
                    Paint paint = new Paint(1);
                    this.timerPaint2 = paint;
                    paint.setColor(838860800);
                }
                int imageY22 = (int) (this.avatarImage.getImageY2() - AndroidUtilities.dp(9.0f));
                if (!LocaleController.isRTL) {
                    dp8 = this.storyParams.originalAvatarRect.left + AndroidUtilities.dp(9.0f);
                } else {
                    dp8 = this.storyParams.originalAvatarRect.right - AndroidUtilities.dp(9.0f);
                }
                int i7 = (int) dp8;
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
                float f9 = i7;
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
            int i72 = (int) dp8;
            this.timerDrawable.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.timerDrawable.setTime(this.ttlPeriod);
            if (!this.avatarImage.updateThumbShaderMatrix()) {
            }
            canvas.save();
            float f82 = this.ttlProgress * (1.0f - this.rightFragmentOpenedProgress);
            checkBox2 = this.checkBox;
            if (checkBox2 != null) {
            }
            float f92 = i72;
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
                int dp10 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    float f11 = this.storyParams.originalAvatarRect.left;
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f7 = 6.0f;
                    }
                    dp7 = f11 + AndroidUtilities.dp(f7);
                } else {
                    float f12 = this.storyParams.originalAvatarRect.right;
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f7 = 6.0f;
                    }
                    dp7 = f12 - AndroidUtilities.dp(f7);
                }
                int i8 = (int) dp7;
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                float f13 = i8;
                float f14 = dp10;
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
                        z3 = true;
                    }
                } else {
                    float f17 = this.onlineProgress;
                    if (f17 > 0.0f) {
                        float f18 = f17 - 0.10666667f;
                        this.onlineProgress = f18;
                        if (f18 < 0.0f) {
                            this.onlineProgress = 0.0f;
                        }
                        z3 = true;
                    }
                }
            }
        } else {
            TLRPC.Chat chat2 = this.chat;
            if (chat2 != null) {
                boolean z5 = chat2.call_active && chat2.call_not_empty;
                this.hasCall = z5;
                if ((z5 || this.chatCallProgress != 0.0f) && this.rightFragmentOpenedProgress < 1.0f) {
                    CheckBox2 checkBox23 = this.checkBox;
                    float progress2 = (checkBox23 == null || !checkBox23.isChecked()) ? 1.0f : 1.0f - this.checkBox.getProgress();
                    int dp11 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                    if (LocaleController.isRTL) {
                        float f19 = this.storyParams.originalAvatarRect.left;
                        f = 9.0f;
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f7 = 6.0f;
                        }
                        dp = (int) (f19 + AndroidUtilities.dp(f7));
                    } else {
                        f = 9.0f;
                        float f20 = this.storyParams.originalAvatarRect.right;
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            f7 = 6.0f;
                        }
                        dp = (int) (f20 - AndroidUtilities.dp(f7));
                    }
                    if (this.rightFragmentOpenedProgress != 0.0f) {
                        canvas.save();
                        float f21 = 1.0f - this.rightFragmentOpenedProgress;
                        canvas.scale(f21, f21, dp, dp11);
                    }
                    Paint paint2 = Theme.dialogs_onlineCirclePaint;
                    int i9 = Theme.key_windowBackgroundWhite;
                    paint2.setColor(Theme.getColor(i9, this.resourcesProvider));
                    float f22 = dp;
                    float f23 = dp11;
                    canvas.drawCircle(f22, f23, AndroidUtilities.dp(11.0f) * this.chatCallProgress * progress2, Theme.dialogs_onlineCirclePaint);
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                    canvas.drawCircle(f22, f23, AndroidUtilities.dp(f) * this.chatCallProgress * progress2, Theme.dialogs_onlineCirclePaint);
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(i9, this.resourcesProvider));
                    if (!LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        this.innerProgress = 0.65f;
                    }
                    int i10 = this.progressStage;
                    if (i10 == 0) {
                        float dp12 = AndroidUtilities.dp(1.0f);
                        float dp13 = AndroidUtilities.dp(4.0f);
                        i = LiteMode.FLAGS_CHAT;
                        dp2 = dp12 + (dp13 * this.innerProgress);
                        f2 = 0.10666667f;
                        f5 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.innerProgress);
                    } else {
                        i = LiteMode.FLAGS_CHAT;
                        f2 = 0.10666667f;
                        if (i10 == 1) {
                            dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                            dp3 = AndroidUtilities.dp(1.0f);
                            dp4 = AndroidUtilities.dp(4.0f);
                            f3 = this.innerProgress;
                        } else {
                            if (i10 == 2) {
                                dp2 = (AndroidUtilities.dp(2.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                                dp5 = AndroidUtilities.dp(5.0f);
                                dp6 = AndroidUtilities.dp(4.0f);
                                f4 = this.innerProgress;
                            } else if (i10 == 3) {
                                dp2 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.innerProgress);
                                dp3 = AndroidUtilities.dp(1.0f);
                                dp4 = AndroidUtilities.dp(2.0f);
                                f3 = this.innerProgress;
                            } else if (i10 == 4) {
                                dp2 = (AndroidUtilities.dp(4.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                                dp5 = AndroidUtilities.dp(3.0f);
                                dp6 = AndroidUtilities.dp(2.0f);
                                f4 = this.innerProgress;
                            } else if (i10 == 5) {
                                dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                dp3 = AndroidUtilities.dp(1.0f);
                                dp4 = AndroidUtilities.dp(4.0f);
                                f3 = this.innerProgress;
                            } else if (i10 == 6) {
                                dp2 = (AndroidUtilities.dp(4.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                                dp5 = AndroidUtilities.dp(5.0f);
                                dp6 = AndroidUtilities.dp(4.0f);
                                f4 = this.innerProgress;
                            } else {
                                dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                                dp3 = AndroidUtilities.dp(1.0f);
                                dp4 = AndroidUtilities.dp(2.0f);
                                f3 = this.innerProgress;
                            }
                            f5 = dp5 - (dp6 * f4);
                        }
                        f5 = dp3 + (dp4 * f3);
                    }
                    if (this.chatCallProgress < 1.0f || progress2 < 1.0f) {
                        canvas.save();
                        float f24 = this.chatCallProgress * progress2;
                        canvas.scale(f24, f24, f22, f23);
                    }
                    this.rect.set(dp - AndroidUtilities.dp(1.0f), f23 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f23);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    float f25 = f23 - f5;
                    float f26 = f23 + f5;
                    this.rect.set(dp - AndroidUtilities.dp(5.0f), f25, dp - AndroidUtilities.dp(3.0f), f26);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    this.rect.set(AndroidUtilities.dp(3.0f) + dp, f25, dp + AndroidUtilities.dp(5.0f), f26);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    if (this.chatCallProgress < 1.0f || progress2 < 1.0f) {
                        canvas.restore();
                    }
                    if (LiteMode.isEnabled(i)) {
                        float f27 = this.innerProgress + 0.04f;
                        this.innerProgress = f27;
                        if (f27 >= 1.0f) {
                            this.innerProgress = 0.0f;
                            int i11 = this.progressStage + 1;
                            this.progressStage = i11;
                            if (i11 >= 8) {
                                this.progressStage = 0;
                            }
                        }
                        z3 = true;
                    }
                    if (this.hasCall) {
                        float f28 = this.chatCallProgress;
                        if (f28 < 1.0f) {
                            float f29 = f28 + f2;
                            this.chatCallProgress = f29;
                            if (f29 > 1.0f) {
                                this.chatCallProgress = 1.0f;
                            }
                        }
                    } else {
                        float f30 = this.chatCallProgress;
                        if (f30 > 0.0f) {
                            float f31 = f30 - f2;
                            this.chatCallProgress = f31;
                            if (f31 < 0.0f) {
                                this.chatCallProgress = 0.0f;
                            }
                        }
                    }
                    if (this.rightFragmentOpenedProgress != 0.0f) {
                        canvas.restore();
                    }
                    if (!this.showTtl) {
                        float f32 = this.ttlProgress;
                        if (f32 < 1.0f) {
                            this.ttlProgress = f32 + f2;
                            z2 = true;
                        }
                        z2 = z3;
                    } else {
                        float f33 = this.ttlProgress;
                        if (f33 > 0.0f) {
                            this.ttlProgress = f33 - f2;
                            z2 = true;
                        }
                        z2 = z3;
                    }
                    this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                    return z2;
                }
            }
        }
        f2 = 0.10666667f;
        if (!this.showTtl) {
        }
        this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
        return z2;
    }

    private void drawCounter(Canvas canvas, boolean z, int i, int i2, int i3, float f, boolean z2) {
        Paint paint;
        boolean z3;
        RectF rectF;
        float interpolation;
        RectF rectF2;
        boolean z4 = isForumCell() || isFolderCell();
        if (!(this.drawCount && this.drawCount2) && this.countChangeProgress == 1.0f) {
            return;
        }
        float f2 = (this.unreadCount != 0 || this.markUnread) ? this.countChangeProgress : 1.0f - this.countChangeProgress;
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
            float f3 = i;
            this.rect.set(i2, f3, this.countWidth + i2 + AndroidUtilities.dp(12.666f), i + AndroidUtilities.dp(20.666f));
            int save = canvas.save();
            if (f != 1.0f) {
                canvas.scale(f, f, this.rect.centerX(), this.rect.centerY());
            }
            if (f2 != 1.0f) {
                canvas.scale(f2, f2, this.rect.centerX(), this.rect.centerY());
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
                canvas.translate(i2 + AndroidUtilities.dp(6.333f), f3 + AndroidUtilities.dpf2(3.0f));
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((1.0f - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
            float f4 = f2 * 2.0f;
            float f5 = f4 > 1.0f ? 1.0f : f4;
            float f6 = 1.0f - f5;
            float f7 = (i2 * f5) + (i3 * f6);
            float f8 = i;
            this.rect.set(f7, f8, (this.countWidth * f5) + f7 + (this.countWidthOld * f6) + AndroidUtilities.dp(12.666f), i + AndroidUtilities.dp(20.666f));
            if (f2 <= 0.5f) {
                interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f4);
            } else {
                interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(1.0f - ((f2 - 0.5f) * 2.0f));
            }
            float f9 = (interpolation * 0.1f) + 1.0f;
            canvas.save();
            float f10 = f9 * f;
            canvas.scale(f10, f10, this.rect.centerX(), this.rect.centerY());
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
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f7, AndroidUtilities.dpf2(3.0f) + f8);
                this.countAnimationStableLayout.draw(canvas);
                canvas.restore();
            }
            int alpha = Theme.dialogs_countTextPaint2.getAlpha();
            float f11 = alpha;
            Theme.dialogs_countTextPaint2.setAlpha((int) (f11 * f5));
            if (this.countAnimationInLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f7, ((this.countAnimationIncrement ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f6) + f8 + AndroidUtilities.dpf2(3.0f));
                this.countAnimationInLayout.draw(canvas);
                canvas.restore();
            } else if (this.countLayout != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(6.333f) + f7, ((this.countAnimationIncrement ? AndroidUtilities.dp(17.0f) : -AndroidUtilities.dp(17.0f)) * f6) + f8 + AndroidUtilities.dpf2(3.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countOldLayout != null) {
                Theme.dialogs_countTextPaint2.setAlpha((int) (f11 * f6));
                canvas.save();
                canvas.translate(f7 + AndroidUtilities.dpf2(6.333f), ((this.countAnimationIncrement ? -AndroidUtilities.dp(17.0f) : AndroidUtilities.dp(17.0f)) * f5) + f8 + AndroidUtilities.dpf2(3.0f));
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
                DialogCell.$r8$lambda$i7dvedqxuFQCCk6gtIiIlb2DeWQ(DialogCell.this, valueAnimator);
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

    public static /* synthetic */ void $r8$lambda$i7dvedqxuFQCCk6gtIiIlb2DeWQ(DialogCell dialogCell, ValueAnimator valueAnimator) {
        dialogCell.getClass();
        dialogCell.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dialogCell.invalidate();
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
            if (z) {
                applyThumbs(valueOf);
            }
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
                    return formatInternal;
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
                    return formatInternal2;
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
        
            if (org.telegram.messenger.MessagesController.getInstance(r20.this$0.currentAccount).getTopicsController().endIsReached(-r20.this$0.currentDialogId) != false) goto L58;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x02f2  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x02e9  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x02ed  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x02a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean update() {
            Integer num;
            int i;
            boolean z;
            boolean z2;
            TLRPC.DraftMessage draft;
            int i2;
            boolean z3;
            boolean isTranslatingDialog;
            int i3;
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
                            z = false;
                            z2 = MediaDataController.getInstance(DialogCell.this.currentAccount).getDraftVoice(DialogCell.this.currentDialogId, (long) DialogCell.this.getTopicId()) != null;
                            TLRPC.DraftMessage draft2 = !z2 ? MediaDataController.getInstance(DialogCell.this.currentAccount).getDraft(DialogCell.this.currentDialogId, DialogCell.this.getTopicId()) : null;
                            if (draft2 == null || !TextUtils.isEmpty(draft2.message)) {
                                draft = draft2;
                                if (draft != null) {
                                    i2 = 0;
                                } else {
                                    int hashCode = draft.message.hashCode();
                                    TLRPC.InputReplyTo inputReplyTo = draft.reply_to;
                                    i2 = hashCode + (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : 0);
                                }
                                z3 = DialogCell.this.chat == null && DialogCell.this.chat.call_active && DialogCell.this.chat.call_not_empty;
                                isTranslatingDialog = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                                if (this.lastDrawnSizeHash != measuredWidth && this.lastDrawnMessageId == id && this.lastDrawnTranslated == isTranslatingDialog && this.lastDrawnDialogId == DialogCell.this.currentDialogId && this.lastDrawnDialogIsFolder == dialog.isFolder && this.lastDrawnReadState == j && Objects.equals(this.lastDrawnPrintingType, num) && this.lastTopicsCount == i && i2 == this.lastDrawnDraftHash && this.lastDrawnPinned == DialogCell.this.drawPin && this.lastDrawnHasCall == z3 && DialogCell.this.draftVoice == z2) {
                                    return z;
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
                                        this.waitngNewMessageFroTypingAnimation = false;
                                        i3 = i2;
                                        if (this.lastDrawnMessageId == id) {
                                            this.typingOutToTop = false;
                                        } else {
                                            this.typingOutToTop = true;
                                        }
                                        if (num != null) {
                                            this.lastKnownTypingType = num.intValue();
                                        }
                                        this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                                        this.lastDrawnMessageId = id;
                                        this.lastDrawnDialogIsFolder = dialog.isFolder;
                                        this.lastDrawnReadState = j;
                                        this.lastDrawnPrintingType = num;
                                        this.lastDrawnSizeHash = measuredWidth;
                                        this.lastDrawnDraftHash = i3;
                                        this.lastTopicsCount = i;
                                        this.lastDrawnPinned = DialogCell.this.drawPin;
                                        this.lastDrawnHasCall = z3;
                                        this.lastDrawnTranslated = isTranslatingDialog;
                                        return true;
                                    }
                                    i3 = i2;
                                    if (this.lastDrawnMessageId == id) {
                                    }
                                    if (num != null) {
                                    }
                                    this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                                    this.lastDrawnMessageId = id;
                                    this.lastDrawnDialogIsFolder = dialog.isFolder;
                                    this.lastDrawnReadState = j;
                                    this.lastDrawnPrintingType = num;
                                    this.lastDrawnSizeHash = measuredWidth;
                                    this.lastDrawnDraftHash = i3;
                                    this.lastTopicsCount = i;
                                    this.lastDrawnPinned = DialogCell.this.drawPin;
                                    this.lastDrawnHasCall = z3;
                                    this.lastDrawnTranslated = isTranslatingDialog;
                                    return true;
                                }
                                i3 = i2;
                                if (num != null) {
                                }
                                this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                                this.lastDrawnMessageId = id;
                                this.lastDrawnDialogIsFolder = dialog.isFolder;
                                this.lastDrawnReadState = j;
                                this.lastDrawnPrintingType = num;
                                this.lastDrawnSizeHash = measuredWidth;
                                this.lastDrawnDraftHash = i3;
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
                            isTranslatingDialog = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                            if (this.lastDrawnSizeHash != measuredWidth) {
                            }
                            if (this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                            }
                            i3 = i2;
                            if (num != null) {
                            }
                            this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                            this.lastDrawnMessageId = id;
                            this.lastDrawnDialogIsFolder = dialog.isFolder;
                            this.lastDrawnReadState = j;
                            this.lastDrawnPrintingType = num;
                            this.lastDrawnSizeHash = measuredWidth;
                            this.lastDrawnDraftHash = i3;
                            this.lastTopicsCount = i;
                            this.lastDrawnPinned = DialogCell.this.drawPin;
                            this.lastDrawnHasCall = z3;
                            this.lastDrawnTranslated = isTranslatingDialog;
                            return true;
                        }
                        z = false;
                        DialogCell dialogCell2 = DialogCell.this;
                        if (dialogCell2.isDialogCell) {
                            z2 = MediaDataController.getInstance(dialogCell2.currentAccount).getDraftVoice(DialogCell.this.currentDialogId, 0L) != null;
                            if (!z2) {
                                draft = MediaDataController.getInstance(DialogCell.this.currentAccount).getDraft(DialogCell.this.currentDialogId, 0L);
                                if (draft != null) {
                                }
                                if (DialogCell.this.chat == null) {
                                }
                                isTranslatingDialog = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                                if (this.lastDrawnSizeHash != measuredWidth) {
                                }
                                if (this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                                }
                                i3 = i2;
                                if (num != null) {
                                }
                                this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                                this.lastDrawnMessageId = id;
                                this.lastDrawnDialogIsFolder = dialog.isFolder;
                                this.lastDrawnReadState = j;
                                this.lastDrawnPrintingType = num;
                                this.lastDrawnSizeHash = measuredWidth;
                                this.lastDrawnDraftHash = i3;
                                this.lastTopicsCount = i;
                                this.lastDrawnPinned = DialogCell.this.drawPin;
                                this.lastDrawnHasCall = z3;
                                this.lastDrawnTranslated = isTranslatingDialog;
                                return true;
                            }
                        } else {
                            z2 = false;
                        }
                        draft = null;
                        if (draft != null) {
                        }
                        if (DialogCell.this.chat == null) {
                        }
                        isTranslatingDialog = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                        if (this.lastDrawnSizeHash != measuredWidth) {
                        }
                        if (this.lastDrawnDialogId == DialogCell.this.currentDialogId) {
                        }
                        i3 = i2;
                        if (num != null) {
                        }
                        this.lastDrawnDialogId = DialogCell.this.currentDialogId;
                        this.lastDrawnMessageId = id;
                        this.lastDrawnDialogIsFolder = dialog.isFolder;
                        this.lastDrawnReadState = j;
                        this.lastDrawnPrintingType = num;
                        this.lastDrawnSizeHash = measuredWidth;
                        this.lastDrawnDraftHash = i3;
                        this.lastTopicsCount = i;
                        this.lastDrawnPinned = DialogCell.this.drawPin;
                        this.lastDrawnHasCall = z3;
                        this.lastDrawnTranslated = isTranslatingDialog;
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
                                return DialogCell.ForumFormattedNames.$r8$lambda$uICq3jFQRNqxUSEcmTlTge6AEXo((TLRPC.TL_forumTopic) obj);
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

        public static /* synthetic */ int $r8$lambda$uICq3jFQRNqxUSEcmTlTge6AEXo(TLRPC.TL_forumTopic tL_forumTopic) {
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
                        DialogCell.this.updatePremiumBlocked(true);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePremiumBlocked(boolean z) {
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
