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
            public boolean isAvatarClickable(long j, TLRPC.Chat chat) {
                return (chat == null || chat.linked_community_id == 0 || DialogCell.this.insideCommunityList) ? false : true;
            }

            @Override // org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams
            public boolean onAvatarClick(View view, long j) {
                TLRPC.Chat chat;
                if (j < 0 && DialogCell.this.parentFragment != null) {
                    DialogCell dialogCell = DialogCell.this;
                    if (!dialogCell.insideCommunityList && (chat = MessagesController.getInstance(dialogCell.currentAccount).getChat(Long.valueOf(-j))) != null && chat.linked_community_id != 0) {
                        DialogCell.this.parentFragment.showDialog(new CommunitySheet(DialogCell.this.parentFragment, chat.linked_community_id));
                        return true;
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

    /* JADX WARN: Can't wrap try/catch for region: R(125:14|(1:16)|17|(2:1962|1963)(1:23)|24|(1:1961)(1:28)|29|(1:31)|32|(1:1960)(1:36)|37|(1:39)|40|(1:42)(1:1953)|43|(7:45|(1:47)|48|49|(1:51)|52|53)|54|(1:56)(1:1952)|57|(9:59|(2:61|(2:906|(1:908)(1:909))(2:65|(1:67)(1:905)))(4:910|(1:927)(1:914)|915|(2:923|(1:925)(1:926))(2:919|(1:921)(1:922)))|68|(3:70|(1:72)(4:892|(1:894)|895|(1:900)(1:899))|73)(3:901|(1:903)|904)|74|(1:76)(1:891)|77|(1:79)(1:(1:887)(1:(1:889)(1:890)))|80)(42:928|(2:1948|(1:1950)(1:1951))(2:932|(1:934)(1:1947))|935|(2:937|(2:939|(2:947|(1:949)(1:950))(2:943|(1:945)(1:946))))(2:1872|(43:1876|(3:1878|(1:1880)(2:1889|(1:1891)(2:1892|(1:1894)(5:1895|(1:1907)(1:1899)|1900|(1:1906)(1:1904)|1905)))|1881)(38:1908|(7:1910|(1:1912)(2:1928|(1:1930)(5:1931|(1:1945)(1:1935)|1936|(1:1944)(1:1942)|1943))|1913|(2:1915|(3:1919|1920|(2:1922|(1:1924)(1:1925))))(1:1927)|1926|1920|(0))(1:1946)|1883|1884|(1:1888)|952|(1:956)|957|(6:959|(1:961)(1:1857)|962|(1:964)(1:1856)|965|(1:969))(2:1858|(5:1863|(1:1865)(1:1871)|1866|(1:1868)(1:1870)|1869)(1:1862))|970|(3:(2:1844|(25:1846|(1:1848)|982|983|984|(11:986|(1:988)(1:1234)|989|(4:991|(1:993)(1:997)|994|(1:996))|998|(1:1000)(1:1233)|1001|(1:1003)(1:1232)|1004|(2:1006|(1:1009))|1010)(2:1235|(1:1237)(21:(6:1239|(1:1241)(1:1822)|1242|(1:1244)(1:1821)|(1:1246)(1:1820)|1247)(1:1823)|1248|(5:1769|1770|(1:(7:1788|(1:1790)(2:1814|(2:1816|(1:1818))(1:1819))|1791|(2:1793|(3:1797|(1:1799)(1:1801)|1800))(2:1811|(1:1813))|1802|(1:1810)(1:1806)|1807)(2:1780|(2:1787|1776)(1:1784)))(1:1774)|1775|1776)(5:1252|(1:1254)(2:1258|(2:1260|(1:1262)(2:1263|(1:1265)(5:1266|(2:1268|(1:1270)(2:1271|(1:1273)(2:1274|(1:1276)(2:1277|(2:1279|(1:1281)(1:1282))))))(2:1284|(3:1288|(1:1294)(1:1292)|1293))|1283|1256|1257)))(14:1295|(1:1297)(1:1768)|1298|1299|(2:1313|(10:1315|(2:1317|(10:1319|(1:1321)(3:1760|(1:1762)(1:1764)|1763)|1322|(8:1334|(4:1336|(4:1338|(2:1340|(2:1342|(1:1344)(2:1348|(1:1350)(1:1351))))|1352|(1:1354)(2:1355|(1:1357)(2:1358|(1:1360)(1:1361))))(1:1362)|1345|1346)(2:1363|(8:1374|(1:(6:1389|(19:1422|1423|(1:1759)(1:1431)|1432|(5:1507|(2:1509|(5:1511|(1:1513)|1752|(1:1754)|1756))|1758|1515|(9:1523|(8:1556|(6:1558|(1:1572)|1564|1565|(2:1567|(1:1569))(1:1571)|1570)(2:1573|(4:1580|(2:1582|(2:1587|(1:1589)(2:1590|(1:1592)(1:1593))))|1594|(2:1637|(3:1639|(2:1641|(1:1643)(1:1645))(2:1646|(1:1648)(1:1649))|1644)(2:1650|(3:1652|(4:1654|(1:1656)(1:1660)|1657|1658)(3:1661|(1:1663)(1:1665)|1664)|1659)(5:1666|(5:1668|(2:1670|(3:1672|(1:1674)(1:1687)|1675))|1688|(0)(0)|1675)(2:1689|(1:1691)(2:1692|(3:1694|(1:1700)(1:1698)|1699)(2:1701|(2:1703|(1:1708)(1:1707))(2:1709|(1:1711)(2:1712|(1:1714)(2:1715|(1:1717)(2:1718|(3:1732|(4:1740|(1:1742)|1743|(2:1745|(3:1747|(1:1749)(1:1751)|1750)))(2:1736|(1:1738))|1739)(2:1722|(3:1724|(2:1726|(1:1728))(1:1730)|1729)(1:1731)))))))))|1676|(2:1681|(2:1683|(1:1685)))|1680)))(4:1598|(1:1600)(2:1624|(1:1626)(2:1627|(1:1629)(2:1630|(1:1632)(2:1633|(1:1635)(1:1636)))))|1601|(3:1616|(3:1618|(1:1620)(1:1622)|1621)|1623)(4:1605|(2:1607|(1:1609)(1:1610))|(1:1614)|1615)))(1:1579))|1526|(1:1528)|1529|(7:1531|(3:1547|(1:1549)|1550)(2:1535|(1:1537))|1538|(1:1540)|1541|(2:1543|(1:1545))|1546)|1551|(2:1555|1325))|1525|1526|(0)|1529|(0)|1551|(3:1553|1555|1325)))|(1:1443)|1444|(2:1452|(12:1454|(1:1498)(1:1458)|1459|1460|1461|(1:1497)(5:1467|1468|1469|1470|1471)|1472|(1:1476)|1477|(4:1479|(1:1481)|1482|(1:1484)(1:1485))|1486|1382))|1499|1460|1461|(2:1463|1493)|1497|1472|(2:1474|1476)|1477|(0)|1486|1382)(4:1395|(2:1397|(4:1399|(1:1401)(1:1408)|1402|1403)(3:1409|(1:1411)(1:1413)|1412))(2:1414|(2:1419|(1:1421))(1:1418))|1404|(1:1406)(2:1407|1325))|1326|(1:1328)(2:1330|(1:1332)(2:1333|1257))|1329|1257)(1:1388))(1:1380)|1381|1382|1326|(0)(0)|1329|1257)(3:1367|(1:1373)(1:1371)|1372))|1347|1325|1326|(0)(0)|1329|1257)|1324|1325|1326|(0)(0)|1329|1257))(1:1766)|1765|(0)|1324|1325|1326|(0)(0)|1329|1257))|1767|1765|(0)|1324|1325|1326|(0)(0)|1329|1257))|1255|1256|1257)|1012|(2:1014|(2:1016|(2:1018|(2:1020|(2:1022|(2:1024|(2:1026|(3:1028|(1:1032)|1033))))))))|1034|(10:1223|(1:1225)(2:1226|(1:1228)(2:1229|(1:1231)))|1037|(4:1213|1214|(1:1222)(1:1220)|1221)(5:1041|(4:1043|(1:(2:1046|1047)(1:1187))(1:1189)|1188|1047)(9:1190|(1:1192)(2:1206|(1:1208)(2:1209|(1:1211)(1:1212)))|1193|(1:1195)(1:1205)|1196|(1:1198)(1:1204)|1199|(1:1201)(1:1203)|1202)|1048|(2:1053|(2:1055|(1:1057)(2:1147|(1:1149)(2:1150|(4:1152|(3:1154|(1:1156)(1:1160)|1157)(2:1161|(3:1163|(1:1175)(1:1167)|1168)(3:1176|(1:1184)(1:1182)|1183))|1158|1159)(1:1185)))))|1186)|1058|(2:1060|(2:1062|(1:1064)(2:1065|(4:1067|(1:1069)|1070|(1:1072)))))|1073|1074|(1:1076)(3:1078|(1:1080)(3:1082|(3:1084|(3:1086|(1:1088)|1089)(2:1097|(4:1099|(1:1101)|1102|(1:1104)(1:1105))(2:1106|(1:1114)(2:1110|(1:1112)(1:1113))))|1096)(3:1115|(3:1117|(1:1119)(2:1120|(1:1122)(2:1123|(2:1137|(4:1139|(1:1141)|1142|(1:1144)(1:1145))(1:1146))(2:1127|(1:1129)(2:1130|(1:1132)(3:1133|(1:1135)|1136)))))|1096)|1091)|(1:1095))|1081)|1077)|1036|1037|(1:1039)|1213|1214|(1:1216)|1222|1221|1058|(0)|1073|1074|(0)(0)|1077))|1011|1012|(0)|1034|(0)|1036|1037|(0)|1213|1214|(0)|1222|1221|1058|(0)|1073|1074|(0)(0)|1077))|1850|(2:1852|(1:1854)))|974|(2:976|(2:978|(25:980|(1:1824)|982|983|984|(0)(0)|1011|1012|(0)|1034|(0)|1036|1037|(0)|1213|1214|(0)|1222|1221|1058|(0)|1073|1074|(0)(0)|1077)))|1826|(22:1838|984|(0)(0)|1011|1012|(0)|1034|(0)|1036|1037|(0)|1213|1214|(0)|1222|1221|1058|(0)|1073|1074|(0)(0)|1077)|982|983|984|(0)(0)|1011|1012|(0)|1034|(0)|1036|1037|(0)|1213|1214|(0)|1222|1221|1058|(0)|1073|1074|(0)(0)|1077)|1882|1883|1884|(2:1886|1888)|952|(2:954|956)|957|(0)(0)|970|(1:972)|(4:1840|1842|1844|(0))|1850|(0)|974|(0)|1826|(2:1828|1830)|1832|1834|1838|984|(0)(0)|1011|1012|(0)|1034|(0)|1036|1037|(0)|1213|1214|(0)|1222|1221|1058|(0)|1073|1074|(0)(0)|1077))|951|952|(0)|957|(0)(0)|970|(0)|(0)|1850|(0)|974|(0)|1826|(0)|1832|1834|1838|984|(0)(0)|1011|1012|(0)|1034|(0)|1036|1037|(0)|1213|1214|(0)|1222|1221|1058|(0)|1073|1074|(0)(0)|1077)|(4:82|(1:84)(1:884)|85|(1:87)(1:883))(1:885)|88|(3:90|(1:92)(1:881)|93)(1:882)|94|(1:96)(1:880)|97|(3:99|(1:101)|102)|103|(2:105|(1:107)(1:867))(2:868|(2:870|(2:872|(1:874)(1:875))(2:876|(1:878)(1:879))))|108|109|(1:866)(1:117)|118|(1:(4:837|(1:839)|840|(1:842))(2:843|(2:845|(1:847))(2:848|(2:850|(1:852))(2:853|(4:855|(1:857)(1:861)|858|(1:860))))))(4:122|(1:124)|125|(1:127))|128|(1:130)|131|(2:133|(1:135))|136|137|(1:139)|140|(1:142)|143|(3:145|(1:147)(1:825)|148)(2:826|(3:828|(1:830)(1:832)|831))|149|(1:151)(1:824)|152|(1:154)|155|(1:823)(1:161)|162|(1:164)(1:822)|165|(1:821)(1:169)|170|171|(5:794|(1:796)(1:819)|797|(2:798|(5:800|(1:802)(1:816)|803|(2:814|815)(2:811|812)|813)(1:817))|818)(11:175|(1:177)(1:793)|178|179|(1:181)(1:792)|182|(1:184)(1:791)|185|186|(2:187|(5:189|(1:191)(1:205)|192|(2:203|204)(2:200|201)|202)(1:206))|207)|208|209|(1:211)(1:790)|212|(1:214)|215|(1:223)|224|(2:226|(1:228)(1:229))|230|(2:232|(1:234)(1:653))(1:(6:(4:689|(1:691)(1:786)|692|693)(1:787)|(6:695|(1:697)(1:784)|698|(3:700|(1:702)(1:778)|703)(3:779|(1:781)(1:783)|782)|704|705)(1:785)|706|(2:708|(4:710|(3:712|(1:714)(1:716)|715)|717|(3:719|(1:721)(1:723)|722))(5:724|(3:726|(1:728)(1:730)|729)|731|(3:733|(1:735)(1:737)|736)|738))|739|(2:741|(6:743|(1:745)|746|(3:748|(1:750)(1:752)|751)|753|(3:755|(1:757)(1:759)|758))(7:760|(1:762)|763|(3:765|(1:767)(1:769)|768)|770|(3:772|(1:774)(1:776)|775)|777)))(2:660|(1:687)(6:672|(1:686)(2:676|(1:678)(1:685))|679|(1:681)(1:684)|682|683)))|(7:(1:237)|238|(1:240)|241|(1:254)(1:245)|246|(1:250))|255|(1:652)(1:259)|260|(3:266|(1:268)(1:270)|269)|271|(4:273|(1:597)(1:277)|278|(2:279|(1:281)(1:282)))(2:598|(8:626|627|(1:633)|634|635|(1:645)(1:639)|640|(2:641|(1:643)(1:644)))(3:602|603|(4:608|(1:618)(1:612)|613|(2:614|(1:616)(1:617)))(1:607)))|283|(1:285)|286|287|288|(1:290)(1:595)|291|292|293|294|(5:296|(3:298|(1:300)|301)|302|(1:304)|301)|305|306|(4:558|559|(5:561|(1:586)(4:565|(2:567|(2:569|(1:571)))|575|(2:577|(2:579|(4:581|(1:585)|573|574))))|572|573|574)|587)|308|(3:546|547|(30:549|550|(19:552|553|326|(1:535)(1:330)|331|332|(5:526|(1:529)|530|(1:532)(1:534)|533)(3:336|(2:338|(1:342))|343)|344|345|346|347|348|349|350|(10:352|(9:356|(1:358)|359|(1:361)|362|(2:392|(1:394)(1:395))(2:368|(1:370)(2:377|(1:379)(2:380|(3:382|(1:384)(1:386)|385)(1:387))))|371|372|(2:374|(1:376)))|396|(4:400|(1:(1:410)(2:402|(1:404)(2:405|406)))|407|(1:409))|411|(1:461)(3:415|(1:(2:417|(1:419)(2:420|421))(2:459|460))|(1:423))|424|(2:430|(1:432))|433|(4:437|(1:439)|440|441))(10:462|(8:466|(1:468)|469|(4:471|(1:473)|474|(1:476))|477|(1:479)|480|(1:482))|483|(4:487|(1:489)|490|491)|492|(4:496|(1:498)|499|500)|501|(4:505|(1:507)|508|509)|510|(1:514))|442|(3:(1:456)(1:451)|452|(1:454)(1:455))|457|458)|313|(3:317|(1:536)(1:323)|324)|325|326|(1:328)|535|331|332|(1:334)|524|526|(1:529)|530|(0)(0)|533|344|345|346|347|348|349|350|(0)(0)|442|(6:444|446|(1:449)|456|452|(0)(0))|457|458))|312|313|(30:315|317|(1:319)|536|324|325|326|(0)|535|331|332|(0)|524|526|(0)|530|(0)(0)|533|344|345|346|347|348|349|350|(0)(0)|442|(0)|457|458)|537|317|(0)|536|324|325|326|(0)|535|331|332|(0)|524|526|(0)|530|(0)(0)|533|344|345|346|347|348|349|350|(0)(0)|442|(0)|457|458) */
    /* JADX WARN: Can't wrap try/catch for region: R(160:1488|1489|1472|(0)|1477|(0)|1486|1382|1326|(0)(0)|1329|1257|1012|(0)|1034|(0)|1036|1037|(0)|1213|1214|(0)|1222|1221|1058|(0)|1073|1074|(0)(0)|1077|(0)(0)|88|(0)(0)|94|(0)(0)|97|(0)|103|(0)(0)|108|109|(1:111)|862|864|866|118|(1:120)|(0)(0)|128|(0)|131|(0)|136|137|(0)|140|(0)|143|(0)(0)|149|(0)(0)|152|(0)|155|(1:157)|823|162|(0)(0)|165|(1:167)|821|170|171|(1:173)|794|(0)(0)|797|(3:798|(0)(0)|813)|818|208|209|(0)(0)|212|(0)|215|(74:217|219|221|223|224|(0)|230|(0)(0)|(0)|255|(1:257)|652|260|(60:262|264|266|(0)(0)|269|271|(0)(0)|283|(0)|286|287|288|(0)(0)|291|292|293|294|(0)|305|306|(0)|308|(1:310)|544|546|547|(0)|312|313|(0)|537|317|(0)|536|324|325|326|(0)|535|331|332|(0)|524|526|(0)|530|(0)(0)|533|344|345|346|347|348|349|350|(0)(0)|442|(0)|457|458)|650|264|266|(0)(0)|269|271|(0)(0)|283|(0)|286|287|288|(0)(0)|291|292|293|294|(0)|305|306|(0)|308|(0)|544|546|547|(0)|312|313|(0)|537|317|(0)|536|324|325|326|(0)|535|331|332|(0)|524|526|(0)|530|(0)(0)|533|344|345|346|347|348|349|350|(0)(0)|442|(0)|457|458)|788|219|221|223|224|(0)|230|(0)(0)|(0)|255|(0)|652|260|(0)|650|264|266|(0)(0)|269|271|(0)(0)|283|(0)|286|287|288|(0)(0)|291|292|293|294|(0)|305|306|(0)|308|(0)|544|546|547|(0)|312|313|(0)|537|317|(0)|536|324|325|326|(0)|535|331|332|(0)|524|526|(0)|530|(0)(0)|533|344|345|346|347|348|349|350|(0)(0)|442|(0)|457|458) */
    /* JADX WARN: Code restructure failed: missing block: B:1090:0x15d3, code lost:
    
        if (r3 == null) goto L1116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1514:0x0b43, code lost:
    
        if (r9.id == r14) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1686:0x0f88, code lost:
    
        if (org.telegram.messenger.MessageObject.isBlueBlock(r54.message.messageOwner.rich_message.blocks.get(0)) != false) goto L803;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1755:0x0b51, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r54.chat) == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1757:0x0b59, code lost:
    
        if (org.telegram.ui.Components.Forum.ForumUtilities.isTopicCreateMessage(r54.message) != false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1825:0x0655, code lost:
    
        if (r0.post_messages == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1849:0x062c, code lost:
    
        if (r1.reply_to_msg_id == 0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1855:0x063b, code lost:
    
        if (r54.unreadCount != 0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x2516, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x2517, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x2518, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x251a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x251b, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x23ed, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x1301  */
    /* JADX WARN: Removed duplicated region for block: B:1039:0x13a7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x17f4  */
    /* JADX WARN: Removed duplicated region for block: B:1060:0x153c  */
    /* JADX WARN: Removed duplicated region for block: B:1076:0x1590  */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x159a  */
    /* JADX WARN: Removed duplicated region for block: B:1216:0x1508  */
    /* JADX WARN: Removed duplicated region for block: B:1223:0x1380  */
    /* JADX WARN: Removed duplicated region for block: B:1235:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x1989  */
    /* JADX WARN: Removed duplicated region for block: B:1328:0x11de  */
    /* JADX WARN: Removed duplicated region for block: B:1330:0x11e5  */
    /* JADX WARN: Removed duplicated region for block: B:1334:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1998  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x19af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x19b4 A[Catch: Exception -> 0x19bf, TryCatch #2 {Exception -> 0x19bf, blocks: (B:137:0x19a6, B:140:0x19b0, B:142:0x19b4, B:143:0x19c2, B:145:0x19c6, B:148:0x19e0, B:149:0x1a0e, B:152:0x1a24, B:154:0x1a2a, B:155:0x1a36, B:157:0x1a49, B:159:0x1a4f, B:162:0x1a60, B:164:0x1a64, B:165:0x1aa2, B:167:0x1aa6, B:169:0x1aaf, B:170:0x1ab7, B:822:0x1a85, B:826:0x19ee, B:828:0x19f2, B:831:0x1a0c), top: B:136:0x19a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x19c6 A[Catch: Exception -> 0x19bf, TryCatch #2 {Exception -> 0x19bf, blocks: (B:137:0x19a6, B:140:0x19b0, B:142:0x19b4, B:143:0x19c2, B:145:0x19c6, B:148:0x19e0, B:149:0x1a0e, B:152:0x1a24, B:154:0x1a2a, B:155:0x1a36, B:157:0x1a49, B:159:0x1a4f, B:162:0x1a60, B:164:0x1a64, B:165:0x1aa2, B:167:0x1aa6, B:169:0x1aaf, B:170:0x1ab7, B:822:0x1a85, B:826:0x19ee, B:828:0x19f2, B:831:0x1a0c), top: B:136:0x19a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:1474:0x1169  */
    /* JADX WARN: Removed duplicated region for block: B:1479:0x117a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x1a21  */
    /* JADX WARN: Removed duplicated region for block: B:1528:0x0f9a  */
    /* JADX WARN: Removed duplicated region for block: B:1531:0x0fbf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x1a2a A[Catch: Exception -> 0x19bf, TryCatch #2 {Exception -> 0x19bf, blocks: (B:137:0x19a6, B:140:0x19b0, B:142:0x19b4, B:143:0x19c2, B:145:0x19c6, B:148:0x19e0, B:149:0x1a0e, B:152:0x1a24, B:154:0x1a2a, B:155:0x1a36, B:157:0x1a49, B:159:0x1a4f, B:162:0x1a60, B:164:0x1a64, B:165:0x1aa2, B:167:0x1aa6, B:169:0x1aaf, B:170:0x1ab7, B:822:0x1a85, B:826:0x19ee, B:828:0x19f2, B:831:0x1a0c), top: B:136:0x19a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x1a64 A[Catch: Exception -> 0x19bf, TryCatch #2 {Exception -> 0x19bf, blocks: (B:137:0x19a6, B:140:0x19b0, B:142:0x19b4, B:143:0x19c2, B:145:0x19c6, B:148:0x19e0, B:149:0x1a0e, B:152:0x1a24, B:154:0x1a2a, B:155:0x1a36, B:157:0x1a49, B:159:0x1a4f, B:162:0x1a60, B:164:0x1a64, B:165:0x1aa2, B:167:0x1aa6, B:169:0x1aaf, B:170:0x1ab7, B:822:0x1a85, B:826:0x19ee, B:828:0x19f2, B:831:0x1a0c), top: B:136:0x19a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:1674:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:1687:0x0daf  */
    /* JADX WARN: Removed duplicated region for block: B:1828:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:1840:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:1846:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:1852:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:1858:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:1922:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x1d1f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1d4b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1d88  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1db0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x20f7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x214c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x2160  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x2178  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x217b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x218a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x227c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x229f A[Catch: Exception -> 0x22f0, TryCatch #0 {Exception -> 0x22f0, blocks: (B:288:0x2297, B:290:0x229f, B:595:0x22ed), top: B:287:0x2297 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x2306 A[Catch: Exception -> 0x230f, TryCatch #1 {Exception -> 0x230f, blocks: (B:294:0x2300, B:296:0x2306, B:298:0x230a, B:301:0x233d, B:302:0x2311, B:304:0x2317), top: B:293:0x2300 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x23ca A[Catch: Exception -> 0x239c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x239c, blocks: (B:559:0x236d, B:561:0x237f, B:563:0x2385, B:565:0x2389, B:567:0x2391, B:569:0x2397, B:572:0x23c0, B:575:0x23a1, B:577:0x23a5, B:579:0x23a9, B:581:0x23ad, B:583:0x23b1, B:310:0x23ca, B:315:0x23f4, B:319:0x241c, B:321:0x2420, B:323:0x2433, B:328:0x2463, B:330:0x2467, B:334:0x2473, B:338:0x24b8, B:340:0x24ca, B:342:0x24d0, B:526:0x247d, B:529:0x2483, B:530:0x2488, B:533:0x249a, B:540:0x2400, B:542:0x2408, B:552:0x23e0), top: B:558:0x236d }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x23f4 A[Catch: Exception -> 0x239c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x239c, blocks: (B:559:0x236d, B:561:0x237f, B:563:0x2385, B:565:0x2389, B:567:0x2391, B:569:0x2397, B:572:0x23c0, B:575:0x23a1, B:577:0x23a5, B:579:0x23a9, B:581:0x23ad, B:583:0x23b1, B:310:0x23ca, B:315:0x23f4, B:319:0x241c, B:321:0x2420, B:323:0x2433, B:328:0x2463, B:330:0x2467, B:334:0x2473, B:338:0x24b8, B:340:0x24ca, B:342:0x24d0, B:526:0x247d, B:529:0x2483, B:530:0x2488, B:533:0x249a, B:540:0x2400, B:542:0x2408, B:552:0x23e0), top: B:558:0x236d }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x241c A[Catch: Exception -> 0x239c, TRY_ENTER, TryCatch #5 {Exception -> 0x239c, blocks: (B:559:0x236d, B:561:0x237f, B:563:0x2385, B:565:0x2389, B:567:0x2391, B:569:0x2397, B:572:0x23c0, B:575:0x23a1, B:577:0x23a5, B:579:0x23a9, B:581:0x23ad, B:583:0x23b1, B:310:0x23ca, B:315:0x23f4, B:319:0x241c, B:321:0x2420, B:323:0x2433, B:328:0x2463, B:330:0x2467, B:334:0x2473, B:338:0x24b8, B:340:0x24ca, B:342:0x24d0, B:526:0x247d, B:529:0x2483, B:530:0x2488, B:533:0x249a, B:540:0x2400, B:542:0x2408, B:552:0x23e0), top: B:558:0x236d }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x2463 A[Catch: Exception -> 0x239c, TRY_ENTER, TryCatch #5 {Exception -> 0x239c, blocks: (B:559:0x236d, B:561:0x237f, B:563:0x2385, B:565:0x2389, B:567:0x2391, B:569:0x2397, B:572:0x23c0, B:575:0x23a1, B:577:0x23a5, B:579:0x23a9, B:581:0x23ad, B:583:0x23b1, B:310:0x23ca, B:315:0x23f4, B:319:0x241c, B:321:0x2420, B:323:0x2433, B:328:0x2463, B:330:0x2467, B:334:0x2473, B:338:0x24b8, B:340:0x24ca, B:342:0x24d0, B:526:0x247d, B:529:0x2483, B:530:0x2488, B:533:0x249a, B:540:0x2400, B:542:0x2408, B:552:0x23e0), top: B:558:0x236d }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x2473 A[Catch: Exception -> 0x239c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x239c, blocks: (B:559:0x236d, B:561:0x237f, B:563:0x2385, B:565:0x2389, B:567:0x2391, B:569:0x2397, B:572:0x23c0, B:575:0x23a1, B:577:0x23a5, B:579:0x23a9, B:581:0x23ad, B:583:0x23b1, B:310:0x23ca, B:315:0x23f4, B:319:0x241c, B:321:0x2420, B:323:0x2433, B:328:0x2463, B:330:0x2467, B:334:0x2473, B:338:0x24b8, B:340:0x24ca, B:342:0x24d0, B:526:0x247d, B:529:0x2483, B:530:0x2488, B:533:0x249a, B:540:0x2400, B:542:0x2408, B:552:0x23e0), top: B:558:0x236d }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x2539  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x2843  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x287f  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x2887  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x274d  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x2481 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x2495  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x2498  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x23db A[Catch: Exception -> 0x23ed, TRY_LEAVE, TryCatch #3 {Exception -> 0x23ed, blocks: (B:547:0x23d7, B:549:0x23db), top: B:546:0x23d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x236d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x22ed A[Catch: Exception -> 0x22f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x22f0, blocks: (B:288:0x2297, B:290:0x229f, B:595:0x22ed), top: B:287:0x2297 }] */
    /* JADX WARN: Removed duplicated region for block: B:598:0x21af  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x1de7  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x1d36  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x1c5a  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x1cc1  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x1d17 A[EDGE_INSN: B:817:0x1d17->B:818:0x1d17 BREAK  A[LOOP:13: B:798:0x1cbc->B:813:0x1cfe], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:819:0x1c7f  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x1a85 A[Catch: Exception -> 0x19bf, TryCatch #2 {Exception -> 0x19bf, blocks: (B:137:0x19a6, B:140:0x19b0, B:142:0x19b4, B:143:0x19c2, B:145:0x19c6, B:148:0x19e0, B:149:0x1a0e, B:152:0x1a24, B:154:0x1a2a, B:155:0x1a36, B:157:0x1a49, B:159:0x1a4f, B:162:0x1a60, B:164:0x1a64, B:165:0x1aa2, B:167:0x1aa6, B:169:0x1aaf, B:170:0x1ab7, B:822:0x1a85, B:826:0x19ee, B:828:0x19f2, B:831:0x1a0c), top: B:136:0x19a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:824:0x1a23  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x19ee A[Catch: Exception -> 0x19bf, TryCatch #2 {Exception -> 0x19bf, blocks: (B:137:0x19a6, B:140:0x19b0, B:142:0x19b4, B:143:0x19c2, B:145:0x19c6, B:148:0x19e0, B:149:0x1a0e, B:152:0x1a24, B:154:0x1a2a, B:155:0x1a36, B:157:0x1a49, B:159:0x1a4f, B:162:0x1a60, B:164:0x1a64, B:165:0x1aa2, B:167:0x1aa6, B:169:0x1aaf, B:170:0x1ab7, B:822:0x1a85, B:826:0x19ee, B:828:0x19f2, B:831:0x1a0c), top: B:136:0x19a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x1715  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x18f4  */
    /* JADX WARN: Removed duplicated region for block: B:843:0x191c  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x1821  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x17b8  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x179e  */
    /* JADX WARN: Removed duplicated region for block: B:885:0x1761  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x176e  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:959:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x17a5  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:976:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:986:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x17d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildLayout() {
        String str;
        String str2;
        CharSequence charSequence;
        int i;
        boolean z;
        CharSequence charSequence2;
        boolean z2;
        long j;
        boolean z3;
        int i2;
        boolean z4;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.DraftMessage draftMessage3;
        boolean z5;
        TLRPC.DraftMessage draftMessage4;
        CharSequence charSequence3;
        boolean z6;
        int i3;
        CharSequence charSequence4;
        CharSequence string;
        String str3;
        boolean z7;
        ArrayList<TLRPC.MessageEntity> arrayList;
        int i4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        boolean z8;
        CharSequence charSequence7;
        TLRPC.Chat chat;
        CharSequence charSequence8;
        CharSequence charSequence9;
        boolean z9;
        MessageObject messageObject;
        CharSequence charSequence10;
        CharSequence charSequence11;
        char c;
        String str4;
        CharSequence charSequence12;
        CharSequence charSequence13;
        boolean isChannelAndNotMegaGroup;
        CharSequence charSequence14;
        char c2;
        int i5;
        String formatPluralString;
        String str5;
        CharSequence charSequence15;
        CharSequence charSequence16;
        CharSequence charSequence17;
        CharSequence charSequence18;
        MessageObject messageObject2;
        TLRPC.Message message;
        CharSequence charSequence19;
        int i6;
        CharSequence replaceEmoji;
        CharSequence charSequence20;
        CharSequence highlightText;
        Object foregroundColorSpanThemable;
        TLRPC.User user;
        MessageObject messageObject3;
        TLRPC.User user2;
        CharSequence charSequence21;
        int i7;
        int i8;
        CharSequence formatArchivedDialogNames;
        CharSequence charSequence22;
        CharSequence string2;
        CharSequence charSequence23;
        CharSequence charSequence24;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence charSequence25;
        CharSequence string3;
        CharSequence charSequence26;
        CharSequence string4;
        CharSequence charSequence27;
        CharSequence charSequence28;
        String stringForMessageListDate;
        MessageObject messageObject4;
        boolean z10;
        String str6;
        String str7;
        String str8;
        String str9;
        CharSequence escape;
        CharSequence charSequence29;
        CharSequence charSequence30;
        CharSequence charSequence31;
        boolean z11;
        CharSequence charSequence32;
        CharSequence charSequence33;
        boolean z12;
        boolean z13;
        String str10;
        String str11;
        CharSequence charSequence34;
        int i9;
        TLRPC.Chat chat2;
        MessageObject messageObject5;
        int i10;
        float f;
        int i11;
        boolean z14;
        int i12;
        int dp;
        int dp2;
        int dp3;
        int i13;
        int i14;
        ImageReceiver[] imageReceiverArr;
        int i15;
        DialogCellTags dialogCellTags;
        int dp4;
        CharSequence highlightText2;
        int i16;
        int i17;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i18;
        int lineCount4;
        int lineCount5;
        int i19;
        int lineCount6;
        CharSequence charSequence35;
        Layout.Alignment alignment;
        CharSequence ellipsize;
        CharSequence replaceTwoNewLinesToOne;
        CharSequence highlightText3;
        DialogCellTags dialogCellTags2;
        int dp5;
        int dp6;
        DialogCellTags dialogCellTags3;
        int dp7;
        CharSequence highlightText4;
        CharSequence charSequence36;
        boolean z15;
        SpannableStringBuilder formatInternal;
        if (this.isTransitionSupport) {
            return;
        }
        if (this.isDialogCell && !this.updateHelper.update() && this.currentDialogFolderId == 0 && this.encryptedChat == null) {
            return;
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
        if (isForumCell() || !(this.isDialogCell || this.isTopic)) {
            str = "**reaction**";
            str2 = "%d";
            charSequence = null;
        } else {
            str = "**reaction**";
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
        boolean z16 = (UserObject.isUserSelf(this.user) || this.useMeForMyMessages) ? false : true;
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
        MessageObject messageObject6 = this.message;
        if (messageObject6 != null) {
            messageObject6.updateTranslation();
        }
        MessageObject messageObject7 = this.message;
        CharSequence charSequence37 = messageObject7 != null ? messageObject7.messageText : null;
        if (charSequence37 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence37);
            for (URLSpanNoUnderlineBold uRLSpanNoUnderlineBold : (URLSpanNoUnderlineBold[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderlineBold.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderlineBold);
            }
            for (URLSpanNoUnderline uRLSpanNoUnderline : (URLSpanNoUnderline[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderline.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderline);
            }
            charSequence37 = spannableStringBuilder;
        }
        this.lastMessageString = charSequence37;
        if (this.isShareToStoryCell) {
            this.drawPinBackground = true;
            z16 = false;
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
                charSequence36 = LocaleController.getString(R.string.FromYou);
                CustomDialog customDialog3 = this.customDialog;
                if (customDialog3.isMedia) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                    formatInternal = formatInternal(i, this.message.messageText, null);
                    formatInternal.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage, this.resourcesProvider), 0, formatInternal.length(), 33);
                } else {
                    String str12 = customDialog3.message;
                    if (str12.length() > 150) {
                        str12 = str12.substring(0, 150);
                    }
                    if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        formatInternal = formatInternal(i, str12, charSequence36);
                    } else {
                        formatInternal = formatInternal(i, str12.replace('\n', ' '), charSequence36);
                    }
                }
                charSequence32 = Emoji.replaceEmoji(formatInternal, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                z11 = false;
            } else {
                charSequence32 = customDialog2.message;
                if (customDialog2.isMedia) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                }
                charSequence36 = null;
                z11 = true;
            }
            str8 = LocaleController.stringForMessageListDate(this.customDialog.date);
            int i21 = this.customDialog.unread_count;
            if (i21 != 0) {
                this.drawCount = true;
                z15 = false;
                str6 = String.format(str2, Integer.valueOf(i21));
            } else {
                z15 = false;
                this.drawCount = false;
                str6 = null;
            }
            CustomDialog customDialog4 = this.customDialog;
            int i22 = customDialog4.sent;
            if (i22 == 0) {
                this.drawClock = true;
                this.drawCheck1 = z15;
                this.drawCheck2 = z15;
            } else if (i22 == 2) {
                this.drawCheck1 = true;
                this.drawCheck2 = true;
                this.drawClock = z15;
            } else if (i22 == 1) {
                this.drawCheck1 = z15;
                this.drawCheck2 = true;
                this.drawClock = z15;
            } else {
                this.drawClock = z15;
                this.drawCheck1 = z15;
                this.drawCheck2 = z15;
            }
            this.drawError = z15;
            charSequence29 = customDialog4.name;
            charSequence33 = charSequence36;
            charSequence31 = "";
            charSequence30 = null;
            str7 = null;
            i4 = -1;
        } else {
            String str13 = str2;
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
                        } else {
                            this.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 4)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                            this.nameLeft = AndroidUtilities.dp(18.0f);
                        }
                    }
                }
            } else if (this.currentDialogFolderId == 0 && !this.isTopic) {
                TLRPC.Chat chat3 = this.chat;
                if (chat3 != null) {
                    j = DialogObject.getBotVerificationIcon(chat3);
                    TLRPC.Chat chat4 = this.chat;
                    if (chat4.scam) {
                        this.drawScam = 1;
                        Theme.dialogs_scamDrawable.checkText();
                    } else if (chat4.fake) {
                        this.drawScam = 2;
                        Theme.dialogs_fakeDrawable.checkText();
                    } else if (DialogObject.getEmojiStatusDocumentId(chat4.emoji_status) != 0) {
                        this.drawPremium = true;
                        this.nameLayoutEllipsizeByGradient = true;
                        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
                        swapAnimatedEmojiDrawable.center = LocaleController.isRTL;
                        swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), false);
                        this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), false);
                    } else {
                        boolean z17 = this.forbidVerified;
                        this.drawVerified = !z17 && this.chat.verified;
                        this.drawBotVerified = (z17 || this.chat.bot_verification_icon == 0) ? false : true;
                    }
                    charSequence2 = charSequence;
                } else {
                    TLRPC.User user3 = this.user;
                    if (user3 != null) {
                        j = DialogObject.getBotVerificationIcon(user3);
                        TLRPC.User user4 = this.user;
                        if (user4.scam) {
                            this.drawScam = 1;
                            Theme.dialogs_scamDrawable.checkText();
                        } else if (user4.fake) {
                            this.drawScam = 2;
                            Theme.dialogs_fakeDrawable.checkText();
                        } else {
                            boolean z18 = this.forbidVerified;
                            this.drawVerified = !z18 && user4.verified;
                            this.drawBotVerified = (z18 || UserObject.isUserSelf(user4) || this.user.bot_verification_icon == 0) ? false : true;
                        }
                        if (MessagesController.getInstance(this.currentAccount).isPremiumUser(this.user)) {
                            long j2 = UserConfig.getInstance(this.currentAccount).clientUserId;
                            charSequence2 = charSequence;
                            long j3 = this.user.id;
                            if (j2 != j3 && j3 != 0) {
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
                                        z2 = false;
                                        swapAnimatedEmojiDrawable2.set(PremiumGradient.getInstance().premiumStarDrawableMini, false);
                                        this.emojiStatus.setParticles(false, false);
                                    }
                                }
                            }
                        } else {
                            charSequence2 = charSequence;
                        }
                        z3 = false;
                        this.drawPremium = z3;
                        if (z3) {
                        }
                    } else {
                        charSequence2 = charSequence;
                        z2 = false;
                        j = 0;
                    }
                    if (j != 0 && this.drawBotVerified) {
                        this.botVerification.set(j, z2);
                    }
                    i2 = this.lastMessageDate;
                    if (i2 == 0 && (messageObject5 = this.message) != null) {
                        i2 = messageObject5.messageOwner.date;
                    }
                    if (this.isTopic) {
                        boolean z19 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                        this.draftVoice = z19;
                        TLRPC.DraftMessage draft = !z19 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, getTopicId()) : null;
                        this.draftMessage = draft;
                        if (draft != null && TextUtils.isEmpty(draft.message)) {
                            this.draftMessage = null;
                        }
                    } else if (this.isDialogCell || this.isSavedDialogCell) {
                        boolean z20 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                        this.draftVoice = z20;
                        this.draftMessage = !z20 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, 0L) : null;
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
                                z5 = false;
                                this.draftVoice = false;
                                if (!isForumCell()) {
                                    this.draftMessage = draftMessage4;
                                    this.draftVoice = z5;
                                    this.needEmoji = true;
                                    updateMessageThumbs();
                                    string = ChatObject.isMonoForum(this.chat) ? null : AndroidUtilities.escape(getMessageNameString());
                                    if (ChatObject.isMonoForum(this.chat)) {
                                        if (i == 1) {
                                            i9 = 3;
                                            i = 2;
                                        } else {
                                            i9 = 3;
                                        }
                                        string = null;
                                        if (i == i9) {
                                            i = 4;
                                        }
                                    }
                                    CharSequence formatTopicsNames = formatTopicsNames();
                                    MessageObject messageObject8 = this.message;
                                    String messageStringFormatted = this.message != null ? getMessageStringFormatted(i, messageObject8 != null ? MessagesController.getInstance(messageObject8.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason) : null, string, true) : "";
                                    CharSequence charSequence38 = messageStringFormatted;
                                    if (this.applyName) {
                                        int length = messageStringFormatted.length();
                                        charSequence38 = messageStringFormatted;
                                        charSequence38 = messageStringFormatted;
                                        if (length >= 0 && string != null) {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(messageStringFormatted);
                                            valueOf.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_name, this.resourcesProvider), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                            charSequence38 = valueOf;
                                        }
                                    }
                                    this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                    charSequence4 = "";
                                    charSequence34 = formatTopicsNames;
                                    charSequence28 = charSequence38;
                                } else if (!TextUtils.isEmpty(this.customMessage)) {
                                    this.draftMessage = null;
                                    this.draftVoice = false;
                                    CharSequence charSequence39 = this.customMessage;
                                    this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                    charSequence4 = "";
                                    string = null;
                                    charSequence28 = null;
                                    charSequence34 = charSequence39;
                                } else {
                                    if (charSequence2 != null) {
                                        CharSequence charSequence40 = charSequence2;
                                        this.lastPrintString = charSequence40;
                                        int intValue = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.currentDialogId, getTopicId()).intValue();
                                        this.printingStringType = intValue;
                                        StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(intValue);
                                        int intrinsicWidth = chatStatusDrawable != null ? chatStatusDrawable.getIntrinsicWidth() + AndroidUtilities.dp(3.0f) : 0;
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                        CharSequence replace = TextUtils.replace(charSequence40, new String[]{"..."}, new String[]{""});
                                        int indexOf = this.printingStringType == 5 ? replace.toString().indexOf("**oo**") : -1;
                                        if (indexOf >= 0) {
                                            spannableStringBuilder2.append(replace).setSpan(new FixedWidthSpan(Theme.getChatStatusDrawable(this.printingStringType).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                        } else {
                                            spannableStringBuilder2.append((CharSequence) " ").append(replace).setSpan(new FixedWidthSpan(intrinsicWidth), 0, 1, 0);
                                        }
                                        i3 = indexOf;
                                        z6 = false;
                                        charSequence3 = spannableStringBuilder2;
                                    } else {
                                        this.lastPrintString = null;
                                        this.printingStringType = -1;
                                        charSequence3 = "";
                                        z6 = true;
                                        i3 = -1;
                                    }
                                    if (this.draftVoice || this.draftMessage != null) {
                                        charSequence4 = charSequence3;
                                        string = LocaleController.getString(R.string.Draft);
                                        TLRPC.DraftMessage draftMessage5 = this.draftMessage;
                                        if (draftMessage5 != null && draftMessage5.rich_message != null) {
                                            SpannableStringBuilder append = SpannableStringBuilder.valueOf(string).append((CharSequence) ": ");
                                            append.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string.length(), 33);
                                            append.append(MessageObject.formatRichMessage(this.draftMessage.rich_message, false, false, 512));
                                            charSequence7 = append;
                                        } else if (draftMessage5 != null && TextUtils.isEmpty(draftMessage5.message)) {
                                            if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                                i4 = i3;
                                                charSequence5 = "";
                                                charSequence6 = null;
                                                z8 = false;
                                                string3 = charSequence5;
                                            } else {
                                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                                valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string.length(), 33);
                                                charSequence7 = valueOf2;
                                            }
                                        } else {
                                            if (this.draftVoice) {
                                                str3 = LocaleController.getString(R.string.AttachAudio);
                                            } else {
                                                TLRPC.DraftMessage draftMessage6 = this.draftMessage;
                                                if (draftMessage6 != null) {
                                                    str3 = draftMessage6.message;
                                                    if (str3.length() > 150) {
                                                        str3 = str3.substring(0, 150);
                                                    }
                                                } else {
                                                    str3 = "";
                                                }
                                            }
                                            SpannableString spannableString = new SpannableString(str3);
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
                                            charSequence7 = Emoji.replaceEmoji(formatInternal2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), z7);
                                        }
                                        i4 = i3;
                                        charSequence5 = charSequence7;
                                        charSequence6 = null;
                                        z8 = false;
                                        string3 = charSequence5;
                                    } else {
                                        if (this.clearingDialog) {
                                            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                            string4 = LocaleController.getString(R.string.HistoryCleared);
                                        } else {
                                            MessageObject messageObject9 = this.message;
                                            if (messageObject9 != null) {
                                                String restrictionReason = MessagesController.getInstance(messageObject9.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
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
                                                        charSequence8 = charSequence37;
                                                        long j4 = messagePeerReaction.peer_id.user_id;
                                                        if (j4 != 0) {
                                                            z8 = z6;
                                                            charSequence4 = charSequence3;
                                                            if (j4 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                                ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(messagePeerReaction.reaction);
                                                                this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                String str14 = fromTL.emojicon;
                                                                if (str14 != null) {
                                                                    charSequence25 = LocaleController.formatString(R.string.ReactionInDialog, str14);
                                                                } else {
                                                                    String formatString = LocaleController.formatString(R.string.ReactionInDialog, str);
                                                                    int indexOf2 = formatString.indexOf(str);
                                                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(formatString.replace(str, "d"));
                                                                    long j5 = fromTL.documentId;
                                                                    TextPaint textPaint3 = this.currentMessagePaint;
                                                                    spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(j5, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                                    charSequence25 = spannableStringBuilder3;
                                                                }
                                                                z9 = true;
                                                                charSequence9 = charSequence25;
                                                                if (!z9) {
                                                                    int i23 = this.dialogsType;
                                                                    if (i23 == 2) {
                                                                        TLRPC.Chat chat5 = this.chat;
                                                                        if (chat5 != null) {
                                                                            if (ChatObject.isChannel(chat5)) {
                                                                                TLRPC.Chat chat6 = this.chat;
                                                                                if (!chat6.megagroup) {
                                                                                    int i24 = chat6.participants_count;
                                                                                    if (i24 != 0) {
                                                                                        string2 = LocaleController.formatPluralStringComma("Subscribers", i24);
                                                                                    } else if (!ChatObject.isPublic(chat6)) {
                                                                                        string2 = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                                                                    } else {
                                                                                        string2 = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                                    }
                                                                                }
                                                                            }
                                                                            TLRPC.Chat chat7 = this.chat;
                                                                            int i25 = chat7.participants_count;
                                                                            if (i25 != 0) {
                                                                                string2 = LocaleController.formatPluralStringComma("Members", i25);
                                                                            } else if (chat7.has_geo) {
                                                                                string2 = LocaleController.getString(R.string.MegaLocation);
                                                                            } else if (!ChatObject.isPublic(chat7)) {
                                                                                string2 = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                                                            } else {
                                                                                string2 = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                            }
                                                                        } else {
                                                                            string2 = "";
                                                                        }
                                                                        this.drawCount2 = false;
                                                                    } else if (i23 == 3 && UserObject.isUserSelf(this.user)) {
                                                                        DialogsActivity dialogsActivity = this.parentFragment;
                                                                        string2 = LocaleController.getString((dialogsActivity == null || !dialogsActivity.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                    } else {
                                                                        boolean z21 = this.useForceThreeLines;
                                                                        if (!z21 && !SharedConfig.useThreeLinesLayout && this.currentDialogCommunityId != 0) {
                                                                            formatArchivedDialogNames = formatCommunityDialogNames();
                                                                        } else if (!z21 && !SharedConfig.useThreeLinesLayout && this.currentDialogFolderId != 0) {
                                                                            formatArchivedDialogNames = formatArchivedDialogNames();
                                                                        } else {
                                                                            MessageObject messageObject10 = this.message;
                                                                            if ((messageObject10.messageOwner instanceof TLRPC.TL_messageService) && (!MessageObject.isTopicActionMessage(messageObject10) || (this.message.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                                MessageObject messageObject11 = this.message;
                                                                                TLRPC.MessageAction messageAction = messageObject11.messageOwner.action;
                                                                                if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                                                                                    TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
                                                                                    if (messageObject11.isOutOwner()) {
                                                                                        if (tL_messageActionPhoneCall.video) {
                                                                                            i8 = R.drawable.dialog_media_outgoing_video_call_20;
                                                                                        } else {
                                                                                            i8 = R.drawable.dialog_media_outgoing_call_20;
                                                                                        }
                                                                                        charSequence21 = DialogMediaIconsHelper.addDialogMediaSpan(charSequence8, i8, false);
                                                                                    } else {
                                                                                        CharSequence charSequence41 = charSequence8;
                                                                                        if (tL_messageActionPhoneCall.video) {
                                                                                            i7 = R.drawable.dialog_media_incoming_video_call_20;
                                                                                        } else {
                                                                                            i7 = R.drawable.dialog_media_incoming_call_20;
                                                                                        }
                                                                                        charSequence21 = DialogMediaIconsHelper.addDialogMediaSpan(charSequence41, i7, false);
                                                                                    }
                                                                                } else {
                                                                                    charSequence21 = charSequence8;
                                                                                    if (ChatObject.isChannelAndNotMegaGroup(this.chat) && (this.message.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                        charSequence21 = "";
                                                                                        z16 = false;
                                                                                    } else {
                                                                                        CharSequence charSequence42 = this.message.messageTextShort;
                                                                                        if (charSequence42 != null) {
                                                                                            charSequence21 = charSequence42;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                if (this.message.type == 21) {
                                                                                    updateMessageThumbs();
                                                                                    charSequence9 = applyThumbs(charSequence21);
                                                                                } else {
                                                                                    charSequence17 = charSequence21;
                                                                                    charSequence23 = null;
                                                                                    charSequence24 = charSequence17;
                                                                                }
                                                                            } else {
                                                                                CharSequence charSequence43 = charSequence8;
                                                                                this.needEmoji = true;
                                                                                updateMessageThumbs();
                                                                                String escape2 = (this.isSavedDialog || (user2 = this.user) == null || !user2.self || this.message.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                                if ((!this.isSavedDialog || (user = this.user) == null || user.self || (messageObject3 = this.message) == null || !messageObject3.isOutOwner()) && escape2 == null && ((messageObject = this.message) == null || (message = messageObject.messageOwner) == null || message.guestchat_via_from == null)) {
                                                                                    TLRPC.Chat chat8 = this.chat;
                                                                                    if (chat8 != null) {
                                                                                        long j6 = chat8.id;
                                                                                        if (j6 > 0) {
                                                                                            charSequence10 = charSequence43;
                                                                                            if (chat != null) {
                                                                                            }
                                                                                            if (ChatObject.isChannel(chat8)) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    charSequence10 = charSequence43;
                                                                                    TLRPC.User user5 = this.user;
                                                                                    if (user5 == null || user5.id != UserObject.VERIFY || (messageObject2 = this.message) == null || messageObject2.getForwardedFromId() == null) {
                                                                                        if (TextUtils.isEmpty(restrictionReason)) {
                                                                                            if (MessageObject.isTopicActionMessage(this.message)) {
                                                                                                MessageObject messageObject12 = this.message;
                                                                                                CharSequence charSequence44 = messageObject12.messageTextShort;
                                                                                                if (charSequence44 == null || ((messageObject12.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.isTopic)) {
                                                                                                    charSequence44 = messageObject12.messageText;
                                                                                                }
                                                                                                CharSequence charSequence45 = charSequence44;
                                                                                                if (messageObject12.topicIconDrawable[0] instanceof ForumBubbleDrawable) {
                                                                                                    charSequence15 = charSequence45;
                                                                                                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-this.message.getDialogId(), MessageObject.getTopicId(this.currentAccount, this.message.messageOwner, true));
                                                                                                    if (findTopic != null) {
                                                                                                        ((ForumBubbleDrawable) this.message.topicIconDrawable[0]).setColor(findTopic.icon_color);
                                                                                                    }
                                                                                                } else {
                                                                                                    charSequence15 = charSequence45;
                                                                                                }
                                                                                                charSequence16 = charSequence15;
                                                                                            } else {
                                                                                                TLRPC.MessageMedia messageMedia = this.message.messageOwner.media;
                                                                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                    restrictionReason = LocaleController.getString(R.string.AttachPhotoExpired);
                                                                                                } else {
                                                                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                        TLRPC.Document document = messageMedia.document;
                                                                                                        if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                            if (messageMedia.voice) {
                                                                                                                restrictionReason = LocaleController.getString(R.string.AttachVoiceExpired);
                                                                                                            } else if (messageMedia.round) {
                                                                                                                restrictionReason = LocaleController.getString(R.string.AttachRoundExpired);
                                                                                                            } else {
                                                                                                                restrictionReason = LocaleController.getString(R.string.AttachVideoExpired);
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
                                                                                                            CharSequence charSequence46 = captionMessage.messageTrimmedToHighlight;
                                                                                                            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 47);
                                                                                                            if (this.hasNameInMessage) {
                                                                                                                if (!TextUtils.isEmpty(null)) {
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                measuredWidth = (int) (measuredWidth - this.currentMessagePaint.measureText(": "));
                                                                                                            }
                                                                                                            if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                                charSequence46 = AndroidUtilities.ellipsizeCenterEnd(charSequence46, captionMessage.highlightedWords.get(0), measuredWidth, this.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                            }
                                                                                                            charSequence16 = new SpannableStringBuilder(str5).append(charSequence46);
                                                                                                        } else {
                                                                                                            SpannableString spannableString2 = new SpannableString(captionMessage.caption);
                                                                                                            if (captionMessage.messageOwner != null) {
                                                                                                                captionMessage.spoilLoginCode();
                                                                                                                MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString2, NotificationCenter.didApplyNewTheme);
                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList3 = captionMessage.messageOwner.entities;
                                                                                                                TextPaint textPaint4 = this.currentMessagePaint;
                                                                                                                MediaDataController.addAnimatedEmojiSpans(arrayList3, spannableString2, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                            }
                                                                                                            charSequence16 = new SpannableStringBuilder(str5).append((CharSequence) spannableString2);
                                                                                                        }
                                                                                                    } else {
                                                                                                        MessageObject messageObject13 = this.message;
                                                                                                        TLRPC.Message message2 = messageObject13.messageOwner;
                                                                                                        TLRPC.MessageMedia messageMedia2 = message2.media;
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                            if (this.hasVideoThumb) {
                                                                                                                i5 = 1;
                                                                                                                if (size > 1) {
                                                                                                                    c2 = 0;
                                                                                                                    formatPluralString = LocaleController.formatPluralString("Media", size, new Object[0]);
                                                                                                                } else {
                                                                                                                    c2 = 0;
                                                                                                                    formatPluralString = LocaleController.getString(R.string.AttachVideo);
                                                                                                                }
                                                                                                            } else {
                                                                                                                c2 = 0;
                                                                                                                i5 = 1;
                                                                                                                formatPluralString = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                            }
                                                                                                            int i26 = R.string.AttachPaidMedia;
                                                                                                            Object[] objArr = new Object[i5];
                                                                                                            objArr[c2] = formatPluralString;
                                                                                                            CharSequence replaceStars = StarsIntroActivity.replaceStars(LocaleController.formatString(i26, objArr));
                                                                                                            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                            charSequence16 = replaceStars;
                                                                                                        } else if (this.thumbsCount > 1) {
                                                                                                            if (this.hasVideoThumb) {
                                                                                                                ArrayList arrayList4 = this.groupMessages;
                                                                                                                charSequence14 = LocaleController.formatPluralString("Media", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                            } else {
                                                                                                                ArrayList arrayList5 = this.groupMessages;
                                                                                                                charSequence14 = LocaleController.formatPluralString("Photos", arrayList5 == null ? 0 : arrayList5.size(), new Object[0]);
                                                                                                            }
                                                                                                            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                            charSequence16 = charSequence14;
                                                                                                        } else {
                                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                                TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                                                                                                                if (messageFwdHeader != null) {
                                                                                                                    TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                    if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                        isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, this.currentAccount);
                                                                                                                        charSequence13 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                    }
                                                                                                                }
                                                                                                                isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.chat);
                                                                                                                charSequence13 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                                charSequence13 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                                                                                                                if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                                                                                                                    SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                                    charSequence12 = DialogMediaIconsHelper.addDialogMediaSpan(spannableString3, R.drawable.dialog_media_poll_20, false);
                                                                                                                } else {
                                                                                                                    charSequence12 = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities.text, R.drawable.dialog_media_poll_20, false);
                                                                                                                }
                                                                                                                charSequence13 = charSequence12;
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                                                                                                                if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                                                                                                                    SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                                    MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                                    charSequence13 = DialogMediaIconsHelper.addDialogMediaSpan(spannableString4, R.drawable.dialog_media_checklist_20, false);
                                                                                                                } else {
                                                                                                                    charSequence13 = DialogMediaIconsHelper.addDialogMediaSpan(tL_textWithEntities3.text, R.drawable.dialog_media_checklist_20, false);
                                                                                                                }
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                                charSequence13 = DialogMediaIconsHelper.addDialogMediaSpan(messageMedia2.game.title, R.drawable.dialog_media_game_20, false);
                                                                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                                charSequence13 = messageMedia2.title;
                                                                                                            } else if (messageObject13.type == 14) {
                                                                                                                charSequence13 = String.format("🎧 %s - %s", messageObject13.getMusicAuthor(), this.message.getMusicTitle());
                                                                                                            } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaStory) && messageMedia2.via_mention) {
                                                                                                                if (messageObject13.isOut()) {
                                                                                                                    TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.message.getDialogId()));
                                                                                                                    if (user6 != null) {
                                                                                                                        str4 = UserObject.getFirstName(user6);
                                                                                                                        int indexOf3 = str4.indexOf(32);
                                                                                                                        c = 0;
                                                                                                                        if (indexOf3 >= 0) {
                                                                                                                            str4 = str4.substring(0, indexOf3);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        c = 0;
                                                                                                                        str4 = "";
                                                                                                                    }
                                                                                                                    int i27 = R.string.StoryYouMentionInDialog;
                                                                                                                    Object[] objArr2 = new Object[1];
                                                                                                                    objArr2[c] = str4;
                                                                                                                    charSequence13 = LocaleController.formatString(i27, objArr2);
                                                                                                                } else {
                                                                                                                    charSequence13 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (messageObject13.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                                                    CharSequence charSequence47 = this.message.messageTrimmedToHighlight;
                                                                                                                    int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 23);
                                                                                                                    MessageObject messageObject14 = this.message;
                                                                                                                    charSequence11 = charSequence47;
                                                                                                                    if (messageObject14.messageTrimmedToHighlightCut) {
                                                                                                                        charSequence11 = AndroidUtilities.ellipsizeCenterEnd(charSequence47, messageObject14.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    SpannableString spannableString5 = new SpannableString(charSequence10);
                                                                                                                    MessageObject messageObject15 = this.message;
                                                                                                                    if (messageObject15 != null) {
                                                                                                                        messageObject15.spoilLoginCode();
                                                                                                                    }
                                                                                                                    MediaDataController.addTextStyleRuns(this.message, spannableString5, NotificationCenter.didApplyNewTheme);
                                                                                                                    MessageObject messageObject16 = this.message;
                                                                                                                    charSequence11 = spannableString5;
                                                                                                                    if (messageObject16 != null) {
                                                                                                                        TLRPC.Message message3 = messageObject16.messageOwner;
                                                                                                                        charSequence11 = spannableString5;
                                                                                                                        if (message3 != null) {
                                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList6 = message3.entities;
                                                                                                                            TextPaint textPaint5 = this.currentMessagePaint;
                                                                                                                            MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                                            charSequence11 = spannableString5;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                AndroidUtilities.highlightText(charSequence11, this.message.highlightedWords, this.resourcesProvider);
                                                                                                                charSequence13 = charSequence11;
                                                                                                            }
                                                                                                            MessageObject messageObject17 = this.message;
                                                                                                            if (messageObject17.messageOwner.media == null || messageObject17.isMediaEmpty()) {
                                                                                                                TL_iv.RichMessage richMessage = this.message.messageOwner.rich_message;
                                                                                                                charSequence16 = charSequence13;
                                                                                                                if (richMessage != null) {
                                                                                                                    charSequence16 = charSequence13;
                                                                                                                    if (richMessage.blocks.size() == 1) {
                                                                                                                        charSequence16 = charSequence13;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                            charSequence16 = charSequence13;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            CharSequence charSequence48 = charSequence16;
                                                                                            if (this.message.isReplyToStory()) {
                                                                                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence16);
                                                                                                spannableStringBuilder4.insert(0, (CharSequence) "d ");
                                                                                                spannableStringBuilder4.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                                charSequence48 = spannableStringBuilder4;
                                                                                            }
                                                                                            charSequence9 = charSequence48;
                                                                                            if (this.thumbsCount > 0) {
                                                                                                if (this.message.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                                    CharSequence charSequence49 = this.message.messageTrimmedToHighlight;
                                                                                                    int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(((this.messagePaddingStart + 23) + ((this.thumbSize + 2) * this.thumbsCount)) + 3);
                                                                                                    MessageObject messageObject18 = this.message;
                                                                                                    charSequence18 = charSequence49;
                                                                                                    if (messageObject18.messageTrimmedToHighlightCut) {
                                                                                                        charSequence18 = AndroidUtilities.ellipsizeCenterEnd(charSequence49, messageObject18.highlightedWords.get(0), measuredWidth3, this.currentMessagePaint, NotificationCenter.dialogIsTranslatable);
                                                                                                    }
                                                                                                } else {
                                                                                                    int length2 = charSequence48.length();
                                                                                                    CharSequence charSequence50 = charSequence48;
                                                                                                    if (length2 > 150) {
                                                                                                        charSequence50 = charSequence48.subSequence(0, 150);
                                                                                                    }
                                                                                                    charSequence18 = AndroidUtilities.replaceNewLines(charSequence50);
                                                                                                }
                                                                                                boolean z22 = charSequence18 instanceof SpannableStringBuilder;
                                                                                                CharSequence charSequence51 = charSequence18;
                                                                                                if (!z22) {
                                                                                                    charSequence51 = new SpannableStringBuilder(charSequence18);
                                                                                                }
                                                                                                SpannableStringBuilder spannableStringBuilder5 = (SpannableStringBuilder) charSequence51;
                                                                                                spannableStringBuilder5.insert(0, (CharSequence) " ");
                                                                                                spannableStringBuilder5.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 3)), 0, 1, 33);
                                                                                                Emoji.replaceEmoji(spannableStringBuilder5, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                                CharSequence charSequence52 = charSequence51;
                                                                                                if (this.message.hasHighlightedWords()) {
                                                                                                    CharSequence highlightText5 = AndroidUtilities.highlightText(spannableStringBuilder5, this.message.highlightedWords, this.resourcesProvider);
                                                                                                    charSequence52 = charSequence51;
                                                                                                    if (highlightText5 != null) {
                                                                                                        charSequence52 = highlightText5;
                                                                                                    }
                                                                                                }
                                                                                                z8 = false;
                                                                                                charSequence9 = charSequence52;
                                                                                            }
                                                                                            if (this.message.isForwarded() && this.message.needDrawForwarded()) {
                                                                                                this.drawForwardIcon = true;
                                                                                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence9);
                                                                                                spannableStringBuilder6.insert(0, (CharSequence) "d ");
                                                                                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                                coloredImageSpan.setAlpha(0.9f);
                                                                                                spannableStringBuilder6.setSpan(coloredImageSpan, 0, 1, 0);
                                                                                                charSequence17 = spannableStringBuilder6;
                                                                                                charSequence23 = null;
                                                                                                charSequence24 = charSequence17;
                                                                                            }
                                                                                        }
                                                                                        charSequence16 = restrictionReason;
                                                                                        CharSequence charSequence482 = charSequence16;
                                                                                        if (this.message.isReplyToStory()) {
                                                                                        }
                                                                                        charSequence9 = charSequence482;
                                                                                        if (this.thumbsCount > 0) {
                                                                                        }
                                                                                        if (this.message.isForwarded()) {
                                                                                            this.drawForwardIcon = true;
                                                                                            SpannableStringBuilder spannableStringBuilder62 = new SpannableStringBuilder(charSequence9);
                                                                                            spannableStringBuilder62.insert(0, (CharSequence) "d ");
                                                                                            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                            coloredImageSpan2.setAlpha(0.9f);
                                                                                            spannableStringBuilder62.setSpan(coloredImageSpan2, 0, 1, 0);
                                                                                            charSequence17 = spannableStringBuilder62;
                                                                                            charSequence23 = null;
                                                                                            charSequence24 = charSequence17;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (escape2 == null) {
                                                                                    escape2 = getMessageNameString();
                                                                                }
                                                                                CharSequence escape3 = AndroidUtilities.escape(escape2);
                                                                                TLRPC.Chat chat9 = this.chat;
                                                                                if (chat9 != null && chat9.forum && !this.isTopic && !this.useFromUserAsAvatar) {
                                                                                    CharSequence topicIconName = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint);
                                                                                    if (!TextUtils.isEmpty(topicIconName)) {
                                                                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder("-");
                                                                                        ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                        coloredImageSpan3.setColorKey((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? -1 : Theme.key_chats_nameMessage);
                                                                                        spannableStringBuilder7.setSpan(coloredImageSpan3, 0, 1, 0);
                                                                                        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                                                        spannableStringBuilder8.append(escape3).append((CharSequence) spannableStringBuilder7).append(topicIconName);
                                                                                        charSequence19 = spannableStringBuilder8;
                                                                                        SpannableStringBuilder messageStringFormatted2 = getMessageStringFormatted(i, restrictionReason, charSequence19, false);
                                                                                        if (!this.useFromUserAsAvatar || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && (this.currentDialogFolderId == 0 || messageStringFormatted2.length() <= 0))) {
                                                                                            i6 = 0;
                                                                                        } else {
                                                                                            try {
                                                                                                foregroundColorSpanThemable = new ForegroundColorSpanThemable(Theme.key_chats_nameMessage, this.resourcesProvider);
                                                                                                i6 = charSequence19.length() + 1;
                                                                                            } catch (Exception e) {
                                                                                                e = e;
                                                                                                i6 = 0;
                                                                                            }
                                                                                            try {
                                                                                                messageStringFormatted2.setSpan(foregroundColorSpanThemable, 0, i6, 33);
                                                                                            } catch (Exception e2) {
                                                                                                e = e2;
                                                                                                FileLog.e(e);
                                                                                                replaceEmoji = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                                if (this.message.hasHighlightedWords()) {
                                                                                                }
                                                                                                if (this.thumbsCount > 0) {
                                                                                                }
                                                                                                charSequence20 = replaceEmoji;
                                                                                                charSequence22 = charSequence19;
                                                                                                z8 = false;
                                                                                                charSequence24 = charSequence20;
                                                                                                charSequence23 = charSequence22;
                                                                                                if (this.currentDialogCommunityId != 0) {
                                                                                                }
                                                                                                i4 = i3;
                                                                                                charSequence27 = charSequence24;
                                                                                                charSequence6 = null;
                                                                                                string3 = charSequence27;
                                                                                                CharSequence charSequence53 = string3;
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
                                                                                                str6 = null;
                                                                                                str7 = null;
                                                                                                this.promoDialog = z10;
                                                                                                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                                                                                                CharSequence charSequence54 = charSequence53;
                                                                                                if (this.dialogsType == 0) {
                                                                                                }
                                                                                                str8 = stringForMessageListDate;
                                                                                                str9 = this.titleOverride;
                                                                                                if (str9 != null) {
                                                                                                }
                                                                                                charSequence31 = charSequence4;
                                                                                                z11 = z8;
                                                                                                charSequence32 = charSequence54;
                                                                                                charSequence33 = string;
                                                                                                if (!z) {
                                                                                                }
                                                                                                if (drawLock2()) {
                                                                                                }
                                                                                                if (LocaleController.isRTL) {
                                                                                                }
                                                                                                if (this.drawNameLock) {
                                                                                                }
                                                                                                if (!this.drawClock) {
                                                                                                }
                                                                                                this.nameAdditionalsForChannelSubscriber = 0;
                                                                                                if (this.dialogMuted) {
                                                                                                }
                                                                                                if (!this.drawPremium) {
                                                                                                }
                                                                                                if (!z14) {
                                                                                                }
                                                                                                if (this.drawBotVerified) {
                                                                                                }
                                                                                                i12 = this.namePaddingEnd;
                                                                                                if (i12 > 0) {
                                                                                                }
                                                                                                dp7 = this.nameWidth - AndroidUtilities.dp(12.0f);
                                                                                                if (dp7 < 0) {
                                                                                                }
                                                                                                if (charSequence29 instanceof String) {
                                                                                                }
                                                                                                if (!this.nameLayoutEllipsizeByGradient) {
                                                                                                }
                                                                                                float f2 = dp7;
                                                                                                this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(charSequence29.toString()) <= f2;
                                                                                                if (!this.twoLinesForName) {
                                                                                                }
                                                                                                CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence29, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                                MessageObject messageObject19 = this.message;
                                                                                                if (messageObject19 == null) {
                                                                                                }
                                                                                                if (!this.twoLinesForName) {
                                                                                                }
                                                                                                this.nameLayoutTranslateX = (this.nameLayoutEllipsizeByGradient || !this.nameLayout.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(36.0f);
                                                                                                this.nameLayoutEllipsizeLeft = this.nameLayout.isRtlCharAt(0);
                                                                                                this.animatedEmojiStackName = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStackName, this.nameLayout);
                                                                                                if (!this.useForceThreeLines) {
                                                                                                }
                                                                                                dp = AndroidUtilities.dp(11.0f);
                                                                                                this.messageNameTop = AndroidUtilities.dp(32.0f);
                                                                                                this.timeTop = AndroidUtilities.dp(13.0f);
                                                                                                this.errorTop = AndroidUtilities.dp(42.33f);
                                                                                                this.pinTop = AndroidUtilities.dp(43.0f);
                                                                                                this.countTop = AndroidUtilities.dp(42.33f);
                                                                                                this.checkDrawTop = AndroidUtilities.dp(13.0f);
                                                                                                int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
                                                                                                if (!LocaleController.isRTL) {
                                                                                                }
                                                                                                i13 = measuredWidth4;
                                                                                                this.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(56.0f));
                                                                                                i14 = 0;
                                                                                                while (true) {
                                                                                                    imageReceiverArr = this.thumbImage;
                                                                                                    if (i14 < imageReceiverArr.length) {
                                                                                                    }
                                                                                                    imageReceiverArr[i14].setImageCoords(((this.thumbSize + 2) * i14) + dp3, ((AndroidUtilities.dp(31.0f) + dp) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                                                                                    i14++;
                                                                                                    dp = dp;
                                                                                                }
                                                                                                i15 = dp;
                                                                                                int i28 = i13;
                                                                                                if (!LocaleController.isRTL) {
                                                                                                }
                                                                                                if (this.twoLinesForName) {
                                                                                                }
                                                                                                if (!this.useForceThreeLines) {
                                                                                                    this.timeTop -= AndroidUtilities.dp(6.0f);
                                                                                                    this.checkDrawTop -= AndroidUtilities.dp(6.0f);
                                                                                                    if (getIsPinned()) {
                                                                                                    }
                                                                                                    if (this.drawError) {
                                                                                                    }
                                                                                                    if (z11) {
                                                                                                    }
                                                                                                    int max = Math.max(AndroidUtilities.dp(12.0f), i28);
                                                                                                    this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                    if (!this.useForceThreeLines) {
                                                                                                        this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
                                                                                                        if (!isForumCell()) {
                                                                                                        }
                                                                                                        if (this.twoLinesForName) {
                                                                                                        }
                                                                                                        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                                        this.buttonCreated = false;
                                                                                                        if (TextUtils.isEmpty(charSequence30)) {
                                                                                                        }
                                                                                                        this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                                        if (!TextUtils.isEmpty(charSequence31)) {
                                                                                                        }
                                                                                                        if (charSequence32 instanceof Spannable) {
                                                                                                        }
                                                                                                        if (!this.useForceThreeLines) {
                                                                                                        }
                                                                                                        if (this.currentDialogFolderId != 0) {
                                                                                                        }
                                                                                                        if (!this.useForceThreeLines) {
                                                                                                        }
                                                                                                        if (isForumCell()) {
                                                                                                        }
                                                                                                        ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                                                                                                        charSequence32 = ellipsize;
                                                                                                        charSequence35 = charSequence32;
                                                                                                        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                                        if (!this.useForceThreeLines) {
                                                                                                        }
                                                                                                        if (this.thumbsCount > 0) {
                                                                                                        }
                                                                                                        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence33 != null ? 1 : 2);
                                                                                                        i17 = max;
                                                                                                        this.spoilersPool.addAll(this.spoilers);
                                                                                                        this.spoilers.clear();
                                                                                                        i16 = 1;
                                                                                                        SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                                                                                                        Layout[] layoutArr = new Layout[i16];
                                                                                                        layoutArr[0] = this.messageLayout;
                                                                                                        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans, layoutArr);
                                                                                                        if (!LocaleController.isRTL) {
                                                                                                        }
                                                                                                        staticLayout = this.typingLayout;
                                                                                                        if (staticLayout != null) {
                                                                                                        }
                                                                                                        updateThumbsPosition();
                                                                                                    }
                                                                                                    this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
                                                                                                    if (!isForumCell()) {
                                                                                                    }
                                                                                                    if (this.twoLinesForName) {
                                                                                                    }
                                                                                                    this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                                    this.buttonCreated = false;
                                                                                                    if (TextUtils.isEmpty(charSequence30)) {
                                                                                                    }
                                                                                                    this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                                    if (!TextUtils.isEmpty(charSequence31)) {
                                                                                                    }
                                                                                                    if (charSequence32 instanceof Spannable) {
                                                                                                    }
                                                                                                    if (!this.useForceThreeLines) {
                                                                                                    }
                                                                                                    if (this.currentDialogFolderId != 0) {
                                                                                                    }
                                                                                                    if (!this.useForceThreeLines) {
                                                                                                    }
                                                                                                    if (isForumCell()) {
                                                                                                    }
                                                                                                    ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                                                                                                    charSequence32 = ellipsize;
                                                                                                    charSequence35 = charSequence32;
                                                                                                    alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                                    if (!this.useForceThreeLines) {
                                                                                                    }
                                                                                                    if (this.thumbsCount > 0) {
                                                                                                    }
                                                                                                    this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence33 != null ? 1 : 2);
                                                                                                    i17 = max;
                                                                                                    this.spoilersPool.addAll(this.spoilers);
                                                                                                    this.spoilers.clear();
                                                                                                    i16 = 1;
                                                                                                    SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = this.animatedEmojiStack;
                                                                                                    Layout[] layoutArr2 = new Layout[i16];
                                                                                                    layoutArr2[0] = this.messageLayout;
                                                                                                    this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans2, layoutArr2);
                                                                                                    if (!LocaleController.isRTL) {
                                                                                                    }
                                                                                                    staticLayout = this.typingLayout;
                                                                                                    if (staticLayout != null) {
                                                                                                    }
                                                                                                    updateThumbsPosition();
                                                                                                }
                                                                                                this.timeTop -= AndroidUtilities.dp(6.0f);
                                                                                                this.checkDrawTop -= AndroidUtilities.dp(6.0f);
                                                                                                if (getIsPinned()) {
                                                                                                }
                                                                                                if (this.drawError) {
                                                                                                }
                                                                                                if (z11) {
                                                                                                }
                                                                                                int max2 = Math.max(AndroidUtilities.dp(12.0f), i28);
                                                                                                this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                                if (!this.useForceThreeLines) {
                                                                                                }
                                                                                                this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
                                                                                                if (!isForumCell()) {
                                                                                                }
                                                                                                if (this.twoLinesForName) {
                                                                                                }
                                                                                                this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                                this.buttonCreated = false;
                                                                                                if (TextUtils.isEmpty(charSequence30)) {
                                                                                                }
                                                                                                this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                                if (!TextUtils.isEmpty(charSequence31)) {
                                                                                                }
                                                                                                if (charSequence32 instanceof Spannable) {
                                                                                                }
                                                                                                if (!this.useForceThreeLines) {
                                                                                                }
                                                                                                if (this.currentDialogFolderId != 0) {
                                                                                                }
                                                                                                if (!this.useForceThreeLines) {
                                                                                                }
                                                                                                if (isForumCell()) {
                                                                                                }
                                                                                                ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max2 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                                                                                                charSequence32 = ellipsize;
                                                                                                charSequence35 = charSequence32;
                                                                                                alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                                if (!this.useForceThreeLines) {
                                                                                                }
                                                                                                if (this.thumbsCount > 0) {
                                                                                                }
                                                                                                this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max2, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max2, charSequence33 != null ? 1 : 2);
                                                                                                i17 = max2;
                                                                                                this.spoilersPool.addAll(this.spoilers);
                                                                                                this.spoilers.clear();
                                                                                                i16 = 1;
                                                                                                SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22 = this.animatedEmojiStack;
                                                                                                Layout[] layoutArr22 = new Layout[i16];
                                                                                                layoutArr22[0] = this.messageLayout;
                                                                                                this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans22, layoutArr22);
                                                                                                if (!LocaleController.isRTL) {
                                                                                                }
                                                                                                staticLayout = this.typingLayout;
                                                                                                if (staticLayout != null) {
                                                                                                }
                                                                                                updateThumbsPosition();
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
                                                                                            if (i6 >= spannableStringBuilder9.length()) {
                                                                                                spannableStringBuilder9.append((CharSequence) " ");
                                                                                                spannableStringBuilder9.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), spannableStringBuilder9.length() - 1, spannableStringBuilder9.length(), 33);
                                                                                            } else {
                                                                                                spannableStringBuilder9.insert(i6, (CharSequence) " ");
                                                                                                spannableStringBuilder9.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), i6, i6 + 1, 33);
                                                                                            }
                                                                                        }
                                                                                        charSequence20 = replaceEmoji;
                                                                                        charSequence22 = charSequence19;
                                                                                        z8 = false;
                                                                                        charSequence24 = charSequence20;
                                                                                        charSequence23 = charSequence22;
                                                                                    }
                                                                                }
                                                                                charSequence19 = escape3;
                                                                                SpannableStringBuilder messageStringFormatted22 = getMessageStringFormatted(i, restrictionReason, charSequence19, false);
                                                                                if (this.useFromUserAsAvatar) {
                                                                                }
                                                                                i6 = 0;
                                                                                replaceEmoji = Emoji.replaceEmoji(messageStringFormatted22, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                if (this.message.hasHighlightedWords()) {
                                                                                    replaceEmoji = highlightText;
                                                                                }
                                                                                if (this.thumbsCount > 0) {
                                                                                }
                                                                                charSequence20 = replaceEmoji;
                                                                                charSequence22 = charSequence19;
                                                                                z8 = false;
                                                                                charSequence24 = charSequence20;
                                                                                charSequence23 = charSequence22;
                                                                            }
                                                                            if (this.currentDialogCommunityId != 0) {
                                                                                string = formatCommunityDialogNames();
                                                                            } else if (this.currentDialogFolderId != 0) {
                                                                                string = formatArchivedDialogNames();
                                                                            } else {
                                                                                i4 = i3;
                                                                                string = charSequence23;
                                                                                charSequence27 = charSequence24;
                                                                                charSequence6 = null;
                                                                                string3 = charSequence27;
                                                                            }
                                                                            i4 = i3;
                                                                            charSequence27 = charSequence24;
                                                                            charSequence6 = null;
                                                                            string3 = charSequence27;
                                                                        }
                                                                        charSequence20 = formatArchivedDialogNames;
                                                                        charSequence22 = null;
                                                                        z8 = false;
                                                                        charSequence24 = charSequence20;
                                                                        charSequence23 = charSequence22;
                                                                        if (this.currentDialogCommunityId != 0) {
                                                                        }
                                                                        i4 = i3;
                                                                        charSequence27 = charSequence24;
                                                                        charSequence6 = null;
                                                                        string3 = charSequence27;
                                                                    }
                                                                    charSequence17 = string2;
                                                                    z16 = false;
                                                                    z = false;
                                                                    charSequence23 = null;
                                                                    charSequence24 = charSequence17;
                                                                    if (this.currentDialogCommunityId != 0) {
                                                                    }
                                                                    i4 = i3;
                                                                    charSequence27 = charSequence24;
                                                                    charSequence6 = null;
                                                                    string3 = charSequence27;
                                                                }
                                                                charSequence17 = charSequence9;
                                                                charSequence23 = null;
                                                                charSequence24 = charSequence17;
                                                                if (this.currentDialogCommunityId != 0) {
                                                                }
                                                                i4 = i3;
                                                                charSequence27 = charSequence24;
                                                                charSequence6 = null;
                                                                string3 = charSequence27;
                                                            }
                                                        } else {
                                                            z8 = z6;
                                                            charSequence4 = charSequence3;
                                                        }
                                                        charSequence9 = "";
                                                        z9 = false;
                                                        if (!z9) {
                                                        }
                                                        charSequence17 = charSequence9;
                                                        charSequence23 = null;
                                                        charSequence24 = charSequence17;
                                                        if (this.currentDialogCommunityId != 0) {
                                                        }
                                                        i4 = i3;
                                                        charSequence27 = charSequence24;
                                                        charSequence6 = null;
                                                        string3 = charSequence27;
                                                    }
                                                }
                                                z8 = z6;
                                                charSequence4 = charSequence3;
                                                charSequence8 = charSequence37;
                                                charSequence9 = "";
                                                z9 = false;
                                                if (!z9) {
                                                }
                                                charSequence17 = charSequence9;
                                                charSequence23 = null;
                                                charSequence24 = charSequence17;
                                                if (this.currentDialogCommunityId != 0) {
                                                }
                                                i4 = i3;
                                                charSequence27 = charSequence24;
                                                charSequence6 = null;
                                                string3 = charSequence27;
                                            } else if (this.currentDialogCommunityId != 0) {
                                                string4 = formatCommunityDialogNames();
                                            } else if (this.currentDialogFolderId != 0) {
                                                string4 = formatArchivedDialogNames();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.encryptedChat;
                                                if (encryptedChat != null) {
                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        string4 = LocaleController.getString(R.string.EncryptionProcessing);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        string4 = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(this.user));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        string4 = LocaleController.getString(R.string.EncryptionRejected);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        if (encryptedChat.admin_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                            string4 = LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(this.user));
                                                        } else {
                                                            string4 = LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                        }
                                                    }
                                                } else if (this.dialogsType == 3 && UserObject.isUserSelf(this.user)) {
                                                    DialogsActivity dialogsActivity2 = this.parentFragment;
                                                    z8 = z6;
                                                    charSequence4 = charSequence3;
                                                    string3 = LocaleController.getString((dialogsActivity2 == null || !dialogsActivity2.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                    i4 = i3;
                                                    string = null;
                                                    charSequence6 = null;
                                                    z16 = false;
                                                    z = false;
                                                }
                                                z8 = z6;
                                                charSequence4 = charSequence3;
                                                i4 = i3;
                                                charSequence26 = "";
                                                string = null;
                                                charSequence27 = charSequence26;
                                                charSequence6 = null;
                                                string3 = charSequence27;
                                            }
                                        }
                                        z8 = z6;
                                        charSequence4 = charSequence3;
                                        charSequence26 = string4;
                                        i4 = i3;
                                        string = null;
                                        charSequence27 = charSequence26;
                                        charSequence6 = null;
                                        string3 = charSequence27;
                                    }
                                    CharSequence charSequence532 = string3;
                                    if (!this.drawForwardIcon) {
                                        charSequence532 = string3;
                                        if (!isFolderCell()) {
                                            charSequence532 = string3;
                                            if (!isForumCell()) {
                                                charSequence532 = string3;
                                                if (!isDialogFolder()) {
                                                    charSequence532 = string3;
                                                    if (this.draftMessage == null) {
                                                        MessageObject messageObject20 = this.message;
                                                        charSequence532 = string3;
                                                        if (messageObject20 != null) {
                                                            TLRPC.Message message4 = messageObject20.messageOwner;
                                                            charSequence532 = string3;
                                                            if (message4 != null) {
                                                                charSequence532 = string3;
                                                                if (message4.action instanceof TLRPC.TL_messageActionStarGift) {
                                                                    this.drawGiftIcon = true;
                                                                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(string3);
                                                                    spannableStringBuilder10.insert(0, (CharSequence) "d ");
                                                                    ColoredImageSpan coloredImageSpan4 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_gift).mutate());
                                                                    coloredImageSpan4.setScale(1.25f, 1.25f);
                                                                    coloredImageSpan4.spaceScaleX = 0.9f;
                                                                    coloredImageSpan4.setAlpha(0.9f);
                                                                    spannableStringBuilder10.setSpan(coloredImageSpan4, 0, 1, 0);
                                                                    TLRPC.TL_textWithEntities tL_textWithEntities5 = ((TLRPC.TL_messageActionStarGift) this.message.messageOwner.action).message;
                                                                    if (tL_textWithEntities5 != null && !TextUtils.isEmpty(tL_textWithEntities5.text)) {
                                                                        this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                                                    }
                                                                    charSequence532 = spannableStringBuilder10;
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
                                            stringForMessageListDate = LocaleController.stringForMessageListDate(r3.date);
                                        } else {
                                            int i29 = this.lastMessageDate;
                                            if (i29 != 0) {
                                                stringForMessageListDate = LocaleController.stringForMessageListDate(i29);
                                            } else {
                                                if (this.message != null) {
                                                    stringForMessageListDate = LocaleController.stringForMessageListDate(r3.messageOwner.date);
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
                                            str6 = null;
                                            str7 = null;
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
                                                    str11 = String.format(str13, Integer.valueOf(i32));
                                                    str10 = null;
                                                    this.drawReactionMention = z13;
                                                    this.drawPollVotesMention = z13;
                                                    String str15 = str11;
                                                    str7 = str10;
                                                    str6 = str15;
                                                } else {
                                                    z13 = false;
                                                    this.drawCount = false;
                                                    this.drawMention = true;
                                                    str10 = String.format(str13, Integer.valueOf(i32));
                                                }
                                                str11 = null;
                                                this.drawReactionMention = z13;
                                                this.drawPollVotesMention = z13;
                                                String str152 = str11;
                                                str7 = str10;
                                                str6 = str152;
                                            } else {
                                                if (this.clearingDialog) {
                                                    this.drawCount = false;
                                                    z16 = false;
                                                    str6 = null;
                                                    z12 = true;
                                                } else {
                                                    int i33 = this.unreadCount;
                                                    if (i33 != 0) {
                                                        z12 = true;
                                                        this.drawCount = true;
                                                        str6 = String.format(str13, Integer.valueOf(i33));
                                                    } else {
                                                        z12 = true;
                                                        if (this.markUnread) {
                                                            this.drawCount = true;
                                                            str6 = "";
                                                        } else {
                                                            this.drawCount = false;
                                                            str6 = null;
                                                        }
                                                    }
                                                }
                                                if (this.mentionCount != 0) {
                                                    this.drawMention = z12;
                                                    str7 = "@";
                                                } else {
                                                    this.drawMention = false;
                                                    str7 = null;
                                                }
                                                this.drawReactionMention = this.reactionMentionCount > 0;
                                                this.drawPollVotesMention = this.pollVotesMentionCount > 0;
                                            }
                                            if (this.message.isOut() && this.draftMessage == null && z16) {
                                                MessageObject messageObject21 = this.message;
                                                if (!(messageObject21.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                    if (messageObject21.isSending()) {
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
                                        CharSequence charSequence542 = charSequence532;
                                        if (this.dialogsType == 0) {
                                            charSequence542 = charSequence532;
                                            if (messagesController2.isPromoDialog(this.currentDialogId, true)) {
                                                this.drawPinBackground = true;
                                                this.promoDialog = true;
                                                int i35 = messagesController2.promoDialogType;
                                                if (i35 == MessagesController.PROMO_TYPE_PROXY) {
                                                    stringForMessageListDate = LocaleController.getString(R.string.UseProxySponsor);
                                                    charSequence542 = charSequence532;
                                                } else {
                                                    charSequence542 = charSequence532;
                                                    if (i35 == MessagesController.PROMO_TYPE_PSA) {
                                                        stringForMessageListDate = LocaleController.getString("PsaType_" + messagesController2.promoPsaType);
                                                        if (TextUtils.isEmpty(stringForMessageListDate)) {
                                                            stringForMessageListDate = LocaleController.getString(R.string.PsaTypeDefault);
                                                        }
                                                        charSequence542 = charSequence532;
                                                        if (!TextUtils.isEmpty(messagesController2.promoPsaMessage)) {
                                                            CharSequence charSequence55 = messagesController2.promoPsaMessage;
                                                            this.thumbsCount = 0;
                                                            charSequence542 = charSequence55;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        str8 = stringForMessageListDate;
                                        str9 = this.titleOverride;
                                        if (str9 != null) {
                                            charSequence30 = charSequence6;
                                            charSequence29 = str9;
                                        } else {
                                            if (this.currentDialogFolderId != 0) {
                                                charSequence29 = LocaleController.getString(R.string.ArchivedChats);
                                            } else {
                                                TLRPC.Chat chat10 = this.chat;
                                                if (chat10 != null) {
                                                    if (this.useFromUserAsAvatar) {
                                                        if (this.topicIconInName == null) {
                                                            this.topicIconInName = new Drawable[1];
                                                        }
                                                        this.topicIconInName[0] = null;
                                                        escape = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint, this.topicIconInName);
                                                    } else if (this.isTopic) {
                                                        if (this.topicIconInName == null) {
                                                            this.topicIconInName = new Drawable[1];
                                                        }
                                                        Drawable[] drawableArr = this.topicIconInName;
                                                        drawableArr[0] = null;
                                                        escape = this.showTopicIconInName ? ForumUtilities.getTopicSpannedName(this.forumTopic, Theme.dialogs_namePaint[this.paintIndex], drawableArr, false) : AndroidUtilities.escape(this.forumTopic.title);
                                                    } else if (chat10.monoforum && chat10.linked_monoforum_id != 0) {
                                                        TLRPC.Chat chat11 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.linked_monoforum_id));
                                                        if (chat11 != null) {
                                                            SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(AndroidUtilities.escape(chat11.title));
                                                            spannableStringBuilder11.append((CharSequence) " ");
                                                            int length3 = spannableStringBuilder11.length();
                                                            int i36 = R.string.MonoforumSpan;
                                                            spannableStringBuilder11.append((CharSequence) LocaleController.getString(i36));
                                                            spannableStringBuilder11.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i36), 9.33f, Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider), length3, spannableStringBuilder11.length(), 33);
                                                            charSequence29 = spannableStringBuilder11;
                                                        } else {
                                                            escape = AndroidUtilities.escape(this.chat.title);
                                                        }
                                                    } else {
                                                        escape = AndroidUtilities.escape(chat10.title);
                                                    }
                                                    charSequence29 = escape;
                                                } else {
                                                    TLRPC.User user7 = this.user;
                                                    if (user7 != null) {
                                                        if (UserObject.isReplyUser(user7)) {
                                                            escape = LocaleController.getString(R.string.RepliesTitle);
                                                        } else if (UserObject.isAnonymous(this.user)) {
                                                            escape = LocaleController.getString(R.string.AnonymousForward);
                                                        } else if (UserObject.isUserSelf(this.user) && !this.isMonoForumTopicDialog) {
                                                            if (this.isSavedDialog) {
                                                                escape = LocaleController.getString(R.string.MyNotes);
                                                            } else if (this.useMeForMyMessages) {
                                                                escape = LocaleController.getString(R.string.FromYou);
                                                            } else {
                                                                if (this.dialogsType == 3) {
                                                                    this.drawPinBackground = true;
                                                                }
                                                                escape = LocaleController.getString(R.string.SavedMessages);
                                                            }
                                                        } else if (this.isTopic) {
                                                            if (this.topicIconInName == null) {
                                                                this.topicIconInName = new Drawable[1];
                                                            }
                                                            Drawable[] drawableArr2 = this.topicIconInName;
                                                            drawableArr2[0] = null;
                                                            escape = this.showTopicIconInName ? ForumUtilities.getTopicSpannedName(this.forumTopic, Theme.dialogs_namePaint[this.paintIndex], drawableArr2, false) : AndroidUtilities.escape(this.forumTopic.title);
                                                        } else {
                                                            escape = AndroidUtilities.escape(UserObject.getUserName(this.user));
                                                        }
                                                        charSequence29 = escape;
                                                    }
                                                    charSequence29 = "";
                                                }
                                                if (charSequence29 != null && charSequence29.length() == 0) {
                                                    charSequence29 = LocaleController.getString(R.string.HiddenName);
                                                }
                                            }
                                            charSequence30 = charSequence6;
                                        }
                                        charSequence31 = charSequence4;
                                        z11 = z8;
                                        charSequence32 = charSequence542;
                                        charSequence33 = string;
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
                                    str6 = null;
                                    str7 = null;
                                    this.promoDialog = z10;
                                    MessagesController messagesController22 = MessagesController.getInstance(this.currentAccount);
                                    CharSequence charSequence5422 = charSequence532;
                                    if (this.dialogsType == 0) {
                                    }
                                    str8 = stringForMessageListDate;
                                    str9 = this.titleOverride;
                                    if (str9 != null) {
                                    }
                                    charSequence31 = charSequence4;
                                    z11 = z8;
                                    charSequence32 = charSequence5422;
                                    charSequence33 = string;
                                }
                                i4 = -1;
                                z8 = true;
                                string3 = charSequence34;
                                charSequence6 = charSequence28;
                                CharSequence charSequence5322 = string3;
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
                                str6 = null;
                                str7 = null;
                                this.promoDialog = z10;
                                MessagesController messagesController222 = MessagesController.getInstance(this.currentAccount);
                                CharSequence charSequence54222 = charSequence5322;
                                if (this.dialogsType == 0) {
                                }
                                str8 = stringForMessageListDate;
                                str9 = this.titleOverride;
                                if (str9 != null) {
                                }
                                charSequence31 = charSequence4;
                                z11 = z8;
                                charSequence32 = charSequence54222;
                                charSequence33 = string;
                            }
                        }
                        draftMessage = this.draftMessage;
                        if (draftMessage != null) {
                            if (i2 > draftMessage.date) {
                            }
                        }
                    }
                    if (ChatObject.isChannel(this.chat)) {
                        TLRPC.Chat chat12 = this.chat;
                        if (!chat12.megagroup) {
                            if (!chat12.creator) {
                                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat12.admin_rights;
                                if (tL_chatAdminRights != null) {
                                }
                                draftMessage4 = null;
                                this.draftMessage = null;
                                z5 = false;
                                this.draftVoice = false;
                                if (!isForumCell()) {
                                }
                                i4 = -1;
                                z8 = true;
                                string3 = charSequence34;
                                charSequence6 = charSequence28;
                                CharSequence charSequence53222 = string3;
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
                                str6 = null;
                                str7 = null;
                                this.promoDialog = z10;
                                MessagesController messagesController2222 = MessagesController.getInstance(this.currentAccount);
                                CharSequence charSequence542222 = charSequence53222;
                                if (this.dialogsType == 0) {
                                }
                                str8 = stringForMessageListDate;
                                str9 = this.titleOverride;
                                if (str9 != null) {
                                }
                                charSequence31 = charSequence4;
                                z11 = z8;
                                charSequence32 = charSequence542222;
                                charSequence33 = string;
                            }
                        }
                    }
                    chat2 = this.chat;
                    if ((chat2 != null || (!chat2.left && !chat2.kicked)) && !this.forbidDraft && (!ChatObject.isForum(chat2) || this.isTopic)) {
                        draftMessage4 = null;
                        z5 = false;
                        if (!isForumCell()) {
                        }
                        i4 = -1;
                        z8 = true;
                        string3 = charSequence34;
                        charSequence6 = charSequence28;
                        CharSequence charSequence532222 = string3;
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
                        str6 = null;
                        str7 = null;
                        this.promoDialog = z10;
                        MessagesController messagesController22222 = MessagesController.getInstance(this.currentAccount);
                        CharSequence charSequence5422222 = charSequence532222;
                        if (this.dialogsType == 0) {
                        }
                        str8 = stringForMessageListDate;
                        str9 = this.titleOverride;
                        if (str9 != null) {
                        }
                        charSequence31 = charSequence4;
                        z11 = z8;
                        charSequence32 = charSequence5422222;
                        charSequence33 = string;
                    }
                    draftMessage4 = null;
                    this.draftMessage = null;
                    z5 = false;
                    this.draftVoice = false;
                    if (!isForumCell()) {
                    }
                    i4 = -1;
                    z8 = true;
                    string3 = charSequence34;
                    charSequence6 = charSequence28;
                    CharSequence charSequence5322222 = string3;
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
                    str6 = null;
                    str7 = null;
                    this.promoDialog = z10;
                    MessagesController messagesController222222 = MessagesController.getInstance(this.currentAccount);
                    CharSequence charSequence54222222 = charSequence5322222;
                    if (this.dialogsType == 0) {
                    }
                    str8 = stringForMessageListDate;
                    str9 = this.titleOverride;
                    if (str9 != null) {
                    }
                    charSequence31 = charSequence4;
                    z11 = z8;
                    charSequence32 = charSequence54222222;
                    charSequence33 = string;
                }
                z2 = false;
                if (j != 0) {
                    this.botVerification.set(j, z2);
                }
                i2 = this.lastMessageDate;
                if (i2 == 0) {
                    i2 = messageObject5.messageOwner.date;
                }
                if (this.isTopic) {
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
                z5 = false;
                if (!isForumCell()) {
                }
                i4 = -1;
                z8 = true;
                string3 = charSequence34;
                charSequence6 = charSequence28;
                CharSequence charSequence53222222 = string3;
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
                str6 = null;
                str7 = null;
                this.promoDialog = z10;
                MessagesController messagesController2222222 = MessagesController.getInstance(this.currentAccount);
                CharSequence charSequence542222222 = charSequence53222222;
                if (this.dialogsType == 0) {
                }
                str8 = stringForMessageListDate;
                str9 = this.titleOverride;
                if (str9 != null) {
                }
                charSequence31 = charSequence4;
                z11 = z8;
                charSequence32 = charSequence542222222;
                charSequence33 = string;
            }
            charSequence2 = charSequence;
            i2 = this.lastMessageDate;
            if (i2 == 0) {
            }
            if (this.isTopic) {
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
            z5 = false;
            if (!isForumCell()) {
            }
            i4 = -1;
            z8 = true;
            string3 = charSequence34;
            charSequence6 = charSequence28;
            CharSequence charSequence532222222 = string3;
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
            str6 = null;
            str7 = null;
            this.promoDialog = z10;
            MessagesController messagesController22222222 = MessagesController.getInstance(this.currentAccount);
            CharSequence charSequence5422222222 = charSequence532222222;
            if (this.dialogsType == 0) {
            }
            str8 = stringForMessageListDate;
            str9 = this.titleOverride;
            if (str9 != null) {
            }
            charSequence31 = charSequence4;
            z11 = z8;
            charSequence32 = charSequence5422222222;
            charSequence33 = string;
        }
        if (!z) {
            TextPaint timeTextPaint = getTimeTextPaint();
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str8));
            this.timeLayout = new StaticLayout(str8, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i10 = AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (!LocaleController.isRTL) {
                this.timeLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.0f)) - i10;
            } else {
                this.timeLeft = AndroidUtilities.dp(15.0f);
            }
        } else {
            this.timeLayout = null;
            this.timeLeft = 0;
            i10 = 0;
        }
        if (drawLock2()) {
            f = 4.0f;
            i11 = 0;
        } else {
            if (LocaleController.isRTL) {
                f = 4.0f;
                this.lock2Left = this.timeLeft + i10 + AndroidUtilities.dp(4.0f);
            } else {
                f = 4.0f;
                this.lock2Left = (this.timeLeft - Theme.dialogs_lock2Drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i11 = Theme.dialogs_lock2Drawable.getIntrinsicWidth() + AndroidUtilities.dp(f);
            i10 += i11;
        }
        if (LocaleController.isRTL) {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(22.0f)) - i10;
        } else {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(this.messagePaddingStart + 13)) - i10;
            this.nameLeft += i10;
        }
        if (this.drawNameLock) {
            int i37 = this.nameWidth;
            if (LocaleController.isRTL) {
                f = 8.0f;
            }
            this.nameWidth = i37 - (AndroidUtilities.dp(f) + Theme.dialogs_lockDrawable.getIntrinsicWidth());
        }
        if (!this.drawClock) {
            int intrinsicWidth2 = Theme.dialogs_clockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            this.nameWidth -= intrinsicWidth2;
            if (!LocaleController.isRTL) {
                this.clockDrawLeft = (this.timeLeft - i11) - intrinsicWidth2;
            } else {
                this.clockDrawLeft = this.timeLeft + i10 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth2;
            }
        } else if (this.drawCheck2) {
            int intrinsicWidth3 = Theme.dialogs_checkDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            int i38 = this.nameWidth - intrinsicWidth3;
            this.nameWidth = i38;
            if (this.drawCheck1) {
                this.nameWidth = i38 - (Theme.dialogs_halfCheckDrawable.getIntrinsicWidth() - AndroidUtilities.dp(8.0f));
                if (!LocaleController.isRTL) {
                    int i39 = (this.timeLeft - i11) - intrinsicWidth3;
                    this.halfCheckDrawLeft = i39;
                    this.checkDrawLeft = i39 - AndroidUtilities.dp(5.5f);
                } else {
                    int dp8 = this.timeLeft + i10 + AndroidUtilities.dp(5.0f);
                    this.checkDrawLeft = dp8;
                    this.halfCheckDrawLeft = dp8 + AndroidUtilities.dp(5.5f);
                    this.nameLeft += (intrinsicWidth3 + Theme.dialogs_halfCheckDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(8.0f);
                }
            } else if (!LocaleController.isRTL) {
                this.checkDrawLeft1 = (this.timeLeft - i11) - intrinsicWidth3;
            } else {
                this.checkDrawLeft1 = this.timeLeft + i10 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth3;
            }
        }
        this.nameAdditionalsForChannelSubscriber = 0;
        z14 = (!this.dialogMuted || this.isHiddenInCommunity || this.drawUnmute || this.dialogMutedProgress > 0.0f) && !this.drawVerified && this.drawScam == 0;
        if (!this.drawPremium && this.emojiStatus.getDrawable() != null) {
            int dp9 = AndroidUtilities.dp(36.0f);
            if (z14) {
                dp9 += AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            }
            this.nameWidth -= dp9;
            this.nameAdditionalsForChannelSubscriber += dp9;
            if (LocaleController.isRTL) {
                this.nameLeft += dp9;
            }
        } else if (!z14) {
            int dp10 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            if (this.drawPremium) {
                dp10 += AndroidUtilities.dp(36.0f);
            }
            this.nameWidth -= dp10;
            this.nameAdditionalsForChannelSubscriber += dp10;
            if (LocaleController.isRTL) {
                this.nameLeft += dp10;
            }
        } else if (this.drawVerified) {
            int dp11 = AndroidUtilities.dp(6.0f) + Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
            this.nameWidth -= dp11;
            this.nameAdditionalsForChannelSubscriber += dp11;
            if (LocaleController.isRTL) {
                this.nameLeft += dp11;
            }
        } else if (this.drawPremium) {
            int dp12 = AndroidUtilities.dp(36.0f);
            this.nameWidth -= dp12;
            this.nameAdditionalsForChannelSubscriber += dp12;
            if (LocaleController.isRTL) {
                this.nameLeft += dp12;
            }
        } else if (this.drawScam != 0) {
            int dp13 = AndroidUtilities.dp(6.0f) + (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth();
            this.nameWidth -= dp13;
            this.nameAdditionalsForChannelSubscriber += dp13;
            if (LocaleController.isRTL) {
                this.nameLeft += dp13;
            }
        }
        if (this.drawBotVerified) {
            this.nameWidth -= AndroidUtilities.dp(21.0f);
        }
        i12 = this.namePaddingEnd;
        if (i12 > 0) {
            this.nameWidth -= i12;
            if (LocaleController.isRTL) {
                this.nameLeft += i12;
            }
        }
        try {
            dp7 = this.nameWidth - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
                dp7 = 0;
            }
            if (charSequence29 instanceof String) {
                charSequence29 = ((String) charSequence29).replace('\n', ' ');
            }
            if (!this.nameLayoutEllipsizeByGradient) {
                this.nameLayoutFits = charSequence29.length() == TextUtils.ellipsize(charSequence29, Theme.dialogs_namePaint[this.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
                dp7 += AndroidUtilities.dp(48.0f);
                this.channelShouldUseLineWidth = this.nameLayoutFits;
            } else if (this.isForChannelSubscriberCell) {
                this.channelShouldUseLineWidth = charSequence29.length() == TextUtils.ellipsize(charSequence29, Theme.dialogs_namePaint[this.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
            }
            float f22 = dp7;
            this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(charSequence29.toString()) <= f22;
            if (!this.twoLinesForName) {
                charSequence29 = TextUtils.ellipsize(charSequence29, Theme.dialogs_namePaint[this.paintIndex], f22, TextUtils.TruncateAt.END);
            }
            CharSequence replaceEmoji22 = Emoji.replaceEmoji(charSequence29, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject192 = this.message;
            CharSequence charSequence56 = (messageObject192 == null && messageObject192.hasHighlightedWords() && (highlightText4 = AndroidUtilities.highlightText(replaceEmoji22, this.message.highlightedWords, this.resourcesProvider)) != null) ? highlightText4 : replaceEmoji22;
            if (!this.twoLinesForName) {
                this.nameLayout = StaticLayoutEx.createStaticLayout(charSequence56, Theme.dialogs_namePaint[this.paintIndex], dp7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp7, 2);
            } else {
                this.nameLayout = new StaticLayout(charSequence56, Theme.dialogs_namePaint[this.paintIndex], Math.max(dp7, this.nameWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.nameLayoutTranslateX = (this.nameLayoutEllipsizeByGradient || !this.nameLayout.isRtlCharAt(0)) ? 0.0f : -AndroidUtilities.dp(36.0f);
            this.nameLayoutEllipsizeLeft = this.nameLayout.isRtlCharAt(0);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        this.animatedEmojiStackName = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStackName, this.nameLayout);
        if (!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
            dp = AndroidUtilities.dp(11.0f);
            this.messageNameTop = AndroidUtilities.dp(32.0f);
            this.timeTop = AndroidUtilities.dp(13.0f);
            this.errorTop = AndroidUtilities.dp(42.33f);
            this.pinTop = AndroidUtilities.dp(43.0f);
            this.countTop = AndroidUtilities.dp(42.33f);
            this.checkDrawTop = AndroidUtilities.dp(13.0f);
            int measuredWidth42 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
            if (!LocaleController.isRTL) {
                int dp14 = AndroidUtilities.dp(16.0f);
                this.messageNameLeft = dp14;
                this.messageLeft = dp14;
                this.typingLeft = dp14;
                this.buttonLeft = dp14;
                dp2 = getMeasuredWidth() - AndroidUtilities.dp(this.avatarStart + 56);
                dp3 = dp2 - AndroidUtilities.dp(31.0f);
            } else {
                int dp15 = AndroidUtilities.dp(this.messagePaddingStart + 6);
                this.messageNameLeft = dp15;
                this.messageLeft = dp15;
                this.typingLeft = dp15;
                this.buttonLeft = dp15;
                dp2 = AndroidUtilities.dp(this.avatarStart);
                dp3 = AndroidUtilities.dp(69.0f) + dp2;
            }
            i13 = measuredWidth42;
            this.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(56.0f));
            i14 = 0;
            while (true) {
                imageReceiverArr = this.thumbImage;
                if (i14 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i14].setImageCoords(((this.thumbSize + 2) * i14) + dp3, ((AndroidUtilities.dp(31.0f) + dp) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i14++;
                dp = dp;
            }
            i15 = dp;
        } else {
            int dp16 = AndroidUtilities.dp(9.0f);
            this.messageNameTop = AndroidUtilities.dp(31.0f);
            this.timeTop = AndroidUtilities.dp(16.0f);
            this.errorTop = AndroidUtilities.dp(38.0f);
            this.pinTop = AndroidUtilities.dp(39.0f);
            this.countTop = AndroidUtilities.dp(this.isTopic ? 35.0f : 38.0f);
            this.checkDrawTop = AndroidUtilities.dp(17.0f);
            int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp((this.messagePaddingStart + 20) - (LocaleController.isRTL ? 0 : 12));
            if (LocaleController.isRTL) {
                int dp17 = AndroidUtilities.dp(22.0f);
                this.messageNameLeft = dp17;
                this.messageLeft = dp17;
                this.typingLeft = dp17;
                this.buttonLeft = dp17;
                dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.avatarStart + 52);
                dp6 = dp5 - AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 9);
            } else {
                int dp18 = AndroidUtilities.dp(this.messagePaddingStart + 4);
                this.messageNameLeft = dp18;
                this.messageLeft = dp18;
                this.typingLeft = dp18;
                this.buttonLeft = dp18;
                dp5 = AndroidUtilities.dp(this.avatarStart);
                dp6 = AndroidUtilities.dp(67.0f) + dp5;
            }
            int i40 = dp5;
            int i41 = dp6;
            i13 = measuredWidth5;
            this.storyParams.originalAvatarRect.set(i40, dp16, i40 + AndroidUtilities.dp(52.0f), dp16 + AndroidUtilities.dp(52.0f));
            int i42 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr2 = this.thumbImage;
                if (i42 >= imageReceiverArr2.length) {
                    break;
                }
                imageReceiverArr2[i42].setImageCoords(((this.thumbSize + 2) * i42) + i41, ((AndroidUtilities.dp(30.0f) + dp16) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags3 = this.tags) == null || dialogCellTags3.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.thumbSize), AndroidUtilities.dp(this.thumbSize));
                i42++;
                dp16 = dp16;
            }
            i15 = dp16;
        }
        int i282 = i13;
        if (!LocaleController.isRTL) {
            this.tagsRight = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart);
            this.tagsLeft = AndroidUtilities.dp(64.0f);
        } else {
            this.tagsLeft = this.messageLeft;
            this.tagsRight = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
        }
        if (this.twoLinesForName) {
            this.messageNameTop += AndroidUtilities.dp(20.0f);
        }
        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && (dialogCellTags2 = this.tags) != null && !dialogCellTags2.isEmpty()) {
            this.timeTop -= AndroidUtilities.dp(6.0f);
            this.checkDrawTop -= AndroidUtilities.dp(6.0f);
        }
        if (getIsPinned()) {
            if (!LocaleController.isRTL) {
                this.pinLeft = (getMeasuredWidth() - Theme.dialogs_pinnedDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(14.0f);
            } else {
                this.pinLeft = AndroidUtilities.dp(14.0f);
            }
        }
        if (this.drawError) {
            int dp19 = AndroidUtilities.dp(29.0f);
            i282 -= dp19;
            if (!LocaleController.isRTL) {
                this.errorLeft = getMeasuredWidth() - AndroidUtilities.dp(36.3333f);
            } else {
                this.errorLeft = AndroidUtilities.dp(15.666f);
                this.messageLeft += dp19;
                this.typingLeft += dp19;
                this.buttonLeft += dp19;
                this.messageNameLeft += dp19;
            }
        } else if (str6 != null || str7 != null || this.drawReactionMention || this.drawPollVotesMention) {
            if (str6 != null) {
                this.countWidth = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str6)));
                this.countLayout = new StaticLayout(str6, Theme.dialogs_countTextPaint2, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp20 = this.countWidth + AndroidUtilities.dp(17.0f);
                i282 -= dp20;
                if (!LocaleController.isRTL) {
                    this.countLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.666f)) - (this.countWidth + AndroidUtilities.dp(12.666f));
                } else {
                    this.countLeft = AndroidUtilities.dp(15.666f);
                    this.messageLeft += dp20;
                    this.typingLeft += dp20;
                    this.buttonLeft += dp20;
                    this.messageNameLeft += dp20;
                }
                this.drawCount = true;
            } else {
                this.countWidth = 0;
            }
            if (str7 != null) {
                if (this.currentDialogFolderId != 0) {
                    this.mentionWidth = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str7)));
                    this.mentionLayout = new StaticLayout(str7, Theme.dialogs_countTextPaint2, this.mentionWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.mentionWidth = AndroidUtilities.dp(8.0f);
                }
                int dp21 = this.mentionWidth + AndroidUtilities.dp(17.0f);
                i282 -= dp21;
                if (!LocaleController.isRTL) {
                    int measuredWidth6 = (getMeasuredWidth() - (this.mentionWidth + AndroidUtilities.dp(12.666f))) - AndroidUtilities.dp(15.666f);
                    int i43 = this.countWidth;
                    this.mentionLeft = measuredWidth6 - (i43 != 0 ? i43 + AndroidUtilities.dp(17.0f) : 0);
                } else {
                    int dp22 = AndroidUtilities.dp(15.666f);
                    int i44 = this.countWidth;
                    this.mentionLeft = dp22 + (i44 != 0 ? i44 + AndroidUtilities.dp(17.0f) : 0);
                    this.messageLeft += dp21;
                    this.typingLeft += dp21;
                    this.buttonLeft += dp21;
                    this.messageNameLeft += dp21;
                }
                this.drawMention = true;
            } else {
                this.mentionWidth = 0;
            }
            if (this.drawReactionMention) {
                int dp23 = AndroidUtilities.dp(25.0f);
                i282 -= dp23;
                if (!LocaleController.isRTL) {
                    int measuredWidth7 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    this.reactionMentionLeft = measuredWidth7;
                    if (this.drawMention) {
                        int i45 = this.mentionWidth;
                        this.reactionMentionLeft = measuredWidth7 - (i45 != 0 ? i45 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i46 = this.reactionMentionLeft;
                        int i47 = this.countWidth;
                        this.reactionMentionLeft = i46 - (i47 != 0 ? i47 + AndroidUtilities.dp(17.0f) : 0);
                    }
                } else {
                    int dp24 = AndroidUtilities.dp(15.666f);
                    this.reactionMentionLeft = dp24;
                    if (this.drawMention) {
                        int i48 = this.mentionWidth;
                        this.reactionMentionLeft = dp24 + (i48 != 0 ? i48 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i49 = this.reactionMentionLeft;
                        int i50 = this.countWidth;
                        this.reactionMentionLeft = i49 + (i50 != 0 ? i50 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    this.messageLeft += dp23;
                    this.typingLeft += dp23;
                    this.buttonLeft += dp23;
                    this.messageNameLeft += dp23;
                }
            }
            if (this.drawPollVotesMention) {
                int dp25 = AndroidUtilities.dp(25.0f);
                i282 -= dp25;
                if (!LocaleController.isRTL) {
                    int measuredWidth8 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    this.pollVotesMentionLeft = measuredWidth8;
                    if (this.drawReactionMention) {
                        this.pollVotesMentionLeft = measuredWidth8 - AndroidUtilities.dp(25.0f);
                    }
                    if (this.drawMention) {
                        int i51 = this.pollVotesMentionLeft;
                        int i52 = this.mentionWidth;
                        this.pollVotesMentionLeft = i51 - (i52 != 0 ? i52 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i53 = this.pollVotesMentionLeft;
                        int i54 = this.countWidth;
                        this.pollVotesMentionLeft = i53 - (i54 != 0 ? i54 + AndroidUtilities.dp(17.0f) : 0);
                    }
                } else {
                    int dp26 = AndroidUtilities.dp(15.666f);
                    this.pollVotesMentionLeft = dp26;
                    if (this.drawReactionMention) {
                        this.pollVotesMentionLeft = dp26 + AndroidUtilities.dp(25.0f);
                    }
                    if (this.drawMention) {
                        int i55 = this.pollVotesMentionLeft;
                        int i56 = this.mentionWidth;
                        this.pollVotesMentionLeft = i55 + (i56 != 0 ? i56 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i57 = this.pollVotesMentionLeft;
                        int i58 = this.countWidth;
                        this.pollVotesMentionLeft = i57 + (i58 != 0 ? i58 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    this.messageLeft += dp25;
                    this.typingLeft += dp25;
                    this.buttonLeft += dp25;
                    this.messageNameLeft += dp25;
                }
            }
        } else if (this.allowBotOpenButton && !isFolderCell() && !isForumCell() && !isDialogFolder() && UserObject.isBot(this.user) && this.user.bot_has_main_app) {
            setOpenBotButton(true);
            int dp27 = (int) (AndroidUtilities.dp(26.0f) + this.openButtonText.getCurrentWidth());
            int dp28 = AndroidUtilities.dp(13.0f);
            i282 -= dp27;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                dp4 = AndroidUtilities.dp(40.0f);
            } else {
                dp4 = this.isTopic ? AndroidUtilities.dp(33.0f) : AndroidUtilities.dp(36.0f);
            }
            if (!LocaleController.isRTL) {
                this.openButtonRect.set((getMeasuredWidth() - dp27) - AndroidUtilities.dp(13.0f), dp4, getMeasuredWidth() - AndroidUtilities.dp(13.0f), dp4 + AndroidUtilities.dp(28.0f));
            } else {
                this.openButtonRect.set(AndroidUtilities.dp(13.0f), dp4, AndroidUtilities.dp(13.0f) + dp27, dp4 + AndroidUtilities.dp(28.0f));
                int i59 = dp27 + dp28;
                this.messageLeft += i59;
                this.typingLeft += i59;
                this.buttonLeft += i59;
                this.messageNameLeft += i59;
            }
            this.drawCount = false;
            this.drawMention = false;
        } else {
            this.drawCount = false;
            this.drawMention = false;
        }
        if (z11) {
            if (charSequence32 == null) {
                charSequence32 = "";
            }
            if (charSequence32.length() > 150) {
                charSequence32 = charSequence32.subSequence(0, 150);
            }
            if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence33 != null) {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceNewLines(charSequence32);
            } else {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceTwoNewLinesToOne(charSequence32);
            }
            charSequence32 = Emoji.replaceEmoji(replaceTwoNewLinesToOne, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject22 = this.message;
            if (messageObject22 != null && (highlightText3 = AndroidUtilities.highlightText(charSequence32, messageObject22.highlightedWords, this.resourcesProvider)) != null) {
                charSequence32 = highlightText3;
            }
        }
        int max22 = Math.max(AndroidUtilities.dp(12.0f), i282);
        this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
            this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
        }
        if (!isForumCell()) {
            this.messageTop = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
            int i60 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.thumbImage;
                if (i60 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i60].setImageY(this.buttonTop);
                i60++;
            }
        } else if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && charSequence33 != null && (this.currentDialogFolderId == 0 || this.currentDialogFolderDialogsCount == 1)) {
            try {
                MessageObject messageObject23 = this.message;
                if (messageObject23 != null && messageObject23.hasHighlightedWords() && (highlightText2 = AndroidUtilities.highlightText(charSequence33, this.message.highlightedWords, this.resourcesProvider)) != null) {
                    charSequence33 = highlightText2;
                }
                this.messageNameLayout = StaticLayoutEx.createStaticLayout(charSequence33, Theme.dialogs_messageNamePaint, max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, max22, 1);
            } catch (Exception e4) {
                FileLog.e(e4);
            }
            this.messageTop = AndroidUtilities.dp(51.0f);
            int dp29 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
            int i61 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.thumbImage;
                if (i61 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i61].setImageY(i15 + dp29 + AndroidUtilities.dp(40.0f));
                i61++;
            }
        } else {
            this.messageNameLayout = null;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                this.messageTop = AndroidUtilities.dp(32.0f);
                int dp30 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
                int i62 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.thumbImage;
                    if (i62 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i62].setImageY(i15 + dp30 + AndroidUtilities.dp(21.0f));
                    i62++;
                }
            } else {
                this.messageTop = AndroidUtilities.dp(39.0f);
            }
        }
        if (this.twoLinesForName) {
            this.messageTop += AndroidUtilities.dp(20.0f);
        }
        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
        try {
            this.buttonCreated = false;
            if (TextUtils.isEmpty(charSequence30)) {
                this.buttonLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence30, this.currentMessagePaint.getFontMetricsInt(), false), this.currentMessagePaint, max22 - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.currentMessagePaint, max22 - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.spoilersPool2.addAll(this.spoilers2);
                this.spoilers2.clear();
                SpoilerEffect.addSpoilers(this, this.buttonLayout, this.spoilersPool2, this.spoilers2);
            } else {
                this.buttonLayout = null;
            }
        } catch (Exception unused) {
        }
        this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
        try {
            if (!TextUtils.isEmpty(charSequence31)) {
                if (!this.useForceThreeLines) {
                    if (!SharedConfig.useThreeLinesLayout) {
                    }
                    this.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence31, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                if (!hasTags()) {
                    this.typingLayout = StaticLayoutEx.createStaticLayout(charSequence31, Theme.dialogs_messagePrintingPaint[this.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, 1);
                }
                this.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence31, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        } catch (Exception e5) {
            FileLog.e(e5);
        }
        try {
            if (charSequence32 instanceof Spannable) {
                try {
                    Spannable spannable = (Spannable) charSequence32;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ClickableSpan) && !(obj instanceof CodeHighlighting.Span)) {
                            if (this.currentDialogCommunityId == 0) {
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
                } catch (Exception e6) {
                    e = e6;
                    StaticLayout staticLayout2 = null;
                    i16 = 1;
                    this.messageLayout = staticLayout2;
                    FileLog.e(e);
                    i17 = max22;
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans222 = this.animatedEmojiStack;
                    Layout[] layoutArr222 = new Layout[i16];
                    layoutArr222[0] = this.messageLayout;
                    this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans222, layoutArr222);
                    if (!LocaleController.isRTL) {
                    }
                    staticLayout = this.typingLayout;
                    if (staticLayout != null) {
                    }
                    updateThumbsPosition();
                }
            }
        } catch (Exception e7) {
            e = e7;
            i16 = 1;
        }
        if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
            if (this.currentDialogFolderId != 0) {
                if (this.currentDialogFolderDialogsCount > 1) {
                    this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                    charSequence35 = charSequence33;
                    charSequence33 = null;
                    alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                        if (this.thumbsCount > 0 && charSequence33 != null) {
                            max22 += AndroidUtilities.dp(5.0f);
                        }
                        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence33 != null ? 1 : 2);
                    } else {
                        if (this.thumbsCount > 0) {
                            max22 += AndroidUtilities.dp((r0 * (this.thumbSize + 2)) + 3);
                            if (LocaleController.isRTL && !isForumCell()) {
                                this.messageLeft -= AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3);
                            }
                        }
                        this.messageLayout = new StaticLayout(charSequence35, this.currentMessagePaint, max22, alignment, 1.0f, 0.0f, false);
                    }
                    i17 = max22;
                    this.spoilersPool.addAll(this.spoilers);
                    this.spoilers.clear();
                    i16 = 1;
                    SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2222 = this.animatedEmojiStack;
                    Layout[] layoutArr2222 = new Layout[i16];
                    layoutArr2222[0] = this.messageLayout;
                    this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans2222, layoutArr2222);
                    if (!LocaleController.isRTL) {
                        StaticLayout staticLayout3 = this.nameLayout;
                        if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                            float lineLeft = this.nameLayout.getLineLeft(0);
                            double ceil2 = Math.ceil(this.nameLayout.getLineWidth(0));
                            int dp31 = this.nameLeft + AndroidUtilities.dp(12.0f);
                            this.nameLeft = dp31;
                            if (this.drawBotVerified) {
                                this.nameLeft = dp31 + AndroidUtilities.dp(21.0f);
                            }
                            if (this.nameLayoutEllipsizeByGradient) {
                                ceil2 = Math.min(this.nameWidth, ceil2);
                            }
                            if ((this.dialogMuted || this.drawUnmute || this.dialogMutedProgress > 0.0f) && !this.drawVerified && this.drawScam == 0) {
                                if (this.drawPremium) {
                                    int dp32 = (int) ((this.nameLeft + ((this.nameWidth - ceil2) - lineLeft)) - AndroidUtilities.dp(24.0f));
                                    this.nameMuteLeft = dp32;
                                    this.nameMutedIconLeft = (dp32 - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth();
                                } else {
                                    this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                                }
                            } else if (this.drawVerified) {
                                this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_verifiedDrawable.getIntrinsicWidth());
                            } else if (this.drawPremium) {
                                int dp33 = (int) ((this.nameLeft + ((this.nameWidth - ceil2) - lineLeft)) - AndroidUtilities.dp(24.0f));
                                this.nameMuteLeft = dp33;
                                this.nameMutedIconLeft = (dp33 - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth();
                            } else if (this.drawScam != 0) {
                                this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - (this.drawScam == i16 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth());
                            } else {
                                this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                            }
                            if (lineLeft == 0.0f) {
                                double d = this.nameWidth;
                                if (ceil2 < d) {
                                    this.nameLeft = (int) (this.nameLeft + (d - ceil2));
                                }
                            }
                        }
                        StaticLayout staticLayout4 = this.messageLayout;
                        if (staticLayout4 != null && (lineCount6 = staticLayout4.getLineCount()) > 0) {
                            int i63 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            int i64 = 0;
                            while (true) {
                                if (i64 >= lineCount6) {
                                    break;
                                }
                                if (this.messageLayout.getLineLeft(i64) != 0.0f) {
                                    i63 = 0;
                                    break;
                                } else {
                                    i63 = Math.min(i63, (int) (i17 - Math.ceil(this.messageLayout.getLineWidth(i64))));
                                    i64 += i16;
                                }
                            }
                            if (i63 != Integer.MAX_VALUE) {
                                this.messageLeft += i63;
                            }
                        }
                        StaticLayout staticLayout5 = this.typingLayout;
                        if (staticLayout5 != null && (lineCount5 = staticLayout5.getLineCount()) > 0) {
                            int i65 = 0;
                            int i66 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            while (true) {
                                if (i65 >= lineCount5) {
                                    i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    break;
                                } else if (this.typingLayout.getLineLeft(i65) != 0.0f) {
                                    i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    i66 = 0;
                                    break;
                                } else {
                                    i66 = Math.min(i66, (int) (i17 - Math.ceil(this.typingLayout.getLineWidth(i65))));
                                    i65 += i16;
                                }
                            }
                            if (i66 != i19) {
                                this.typingLeft += i66;
                            }
                        }
                        StaticLayout staticLayout6 = this.messageNameLayout;
                        if (staticLayout6 != null && staticLayout6.getLineCount() > 0 && this.messageNameLayout.getLineLeft(0) == 0.0f) {
                            double ceil3 = Math.ceil(this.messageNameLayout.getLineWidth(0));
                            double d2 = i17;
                            if (ceil3 < d2) {
                                this.messageNameLeft = (int) (this.messageNameLeft + (d2 - ceil3));
                            }
                        }
                        StaticLayout staticLayout7 = this.buttonLayout;
                        if (staticLayout7 != null && (lineCount4 = staticLayout7.getLineCount()) > 0) {
                            int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            for (int i68 = 0; i68 < lineCount4; i68 += i16) {
                                i67 = (int) Math.min(i67, this.buttonLayout.getWidth() - this.buttonLayout.getLineRight(i68));
                            }
                            this.buttonLeft += i67;
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
                            int dp34 = (int) (this.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
                            this.nameMuteLeft = dp34;
                            if (this.drawPremium) {
                                this.nameMutedIconLeft = dp34 + AndroidUtilities.dp(30.0f);
                            }
                        }
                        StaticLayout staticLayout9 = this.messageLayout;
                        if (staticLayout9 != null && (lineCount3 = staticLayout9.getLineCount()) > 0) {
                            float f3 = 2.14748365E9f;
                            for (int i69 = 0; i69 < lineCount3; i69 += i16) {
                                f3 = Math.min(f3, this.messageLayout.getLineLeft(i69));
                            }
                            this.messageLeft = (int) (this.messageLeft - f3);
                        }
                        StaticLayout staticLayout10 = this.buttonLayout;
                        if (staticLayout10 != null && (lineCount2 = staticLayout10.getLineCount()) > 0) {
                            float f4 = 2.14748365E9f;
                            for (int i70 = 0; i70 < lineCount2; i70 += i16) {
                                f4 = Math.min(f4, this.buttonLayout.getLineLeft(i70));
                            }
                            this.buttonLeft = (int) (this.buttonLeft - f4);
                        }
                        StaticLayout staticLayout11 = this.typingLayout;
                        if (staticLayout11 != null && (lineCount = staticLayout11.getLineCount()) > 0) {
                            float f5 = 2.14748365E9f;
                            for (int i71 = 0; i71 < lineCount; i71 += i16) {
                                f5 = Math.min(f5, this.typingLayout.getLineLeft(i71));
                            }
                            this.typingLeft = (int) (this.typingLeft - f5);
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
                            primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(i16);
                        }
                        if (primaryHorizontal >= primaryHorizontal2) {
                            this.statusDrawableLeft = (int) (this.typingLeft + primaryHorizontal);
                        } else {
                            this.statusDrawableLeft = (int) (this.typingLeft + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
                        }
                    }
                    updateThumbsPosition();
                }
                if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence33 != null || (ChatObject.isMonoForum(this.chat) && ChatObject.canManageMonoForum(this.currentAccount, this.chat))) {
                    if (isForumCell() && (charSequence32 instanceof Spanned) && ((FixedWidthSpan[]) ((Spanned) charSequence32).getSpans(0, charSequence32.length(), FixedWidthSpan.class)).length <= 0) {
                        ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max22 - AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 15), TextUtils.TruncateAt.END);
                    } else {
                        ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                    }
                    charSequence32 = ellipsize;
                }
                charSequence35 = charSequence32;
                alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                if (!this.useForceThreeLines) {
                }
                if (this.thumbsCount > 0) {
                    max22 += AndroidUtilities.dp(5.0f);
                }
                this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence33 != null ? 1 : 2);
                i17 = max22;
                this.spoilersPool.addAll(this.spoilers);
                this.spoilers.clear();
                i16 = 1;
                SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22222 = this.animatedEmojiStack;
                Layout[] layoutArr22222 = new Layout[i16];
                layoutArr22222[0] = this.messageLayout;
                this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans22222, layoutArr22222);
                if (!LocaleController.isRTL) {
                }
                staticLayout = this.typingLayout;
                if (staticLayout != null) {
                    if (i4 < 0) {
                    }
                    primaryHorizontal = this.typingLayout.getPrimaryHorizontal(0);
                    primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(i16);
                    if (primaryHorizontal >= primaryHorizontal2) {
                    }
                }
                updateThumbsPosition();
            }
        }
        if (!this.useForceThreeLines) {
            if (isForumCell()) {
            }
            ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
            charSequence32 = ellipsize;
            charSequence35 = charSequence32;
            alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            if (!this.useForceThreeLines) {
            }
            if (this.thumbsCount > 0) {
            }
            this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence33 != null ? 1 : 2);
            i17 = max22;
            this.spoilersPool.addAll(this.spoilers);
            this.spoilers.clear();
            i16 = 1;
            SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans222222 = this.animatedEmojiStack;
            Layout[] layoutArr222222 = new Layout[i16];
            layoutArr222222[0] = this.messageLayout;
            this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans222222, layoutArr222222);
            if (!LocaleController.isRTL) {
            }
            staticLayout = this.typingLayout;
            if (staticLayout != null) {
            }
            updateThumbsPosition();
        }
        if (isForumCell()) {
        }
        ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
        charSequence32 = ellipsize;
        charSequence35 = charSequence32;
        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        if (!this.useForceThreeLines) {
        }
        if (this.thumbsCount > 0) {
        }
        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence33 != null ? 1 : 2);
        i17 = max22;
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        i16 = 1;
        SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2222222 = this.animatedEmojiStack;
        Layout[] layoutArr2222222 = new Layout[i16];
        layoutArr2222222[0] = this.messageLayout;
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans2222222, layoutArr2222222);
        if (!LocaleController.isRTL) {
        }
        staticLayout = this.typingLayout;
        if (staticLayout != null) {
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

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0503, code lost:
    
        if (r43.reactionMentionCount == r14) goto L280;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0951 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0537  */
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
                                this.unreadCount = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog.id);
                                this.mentionCount = dialog.unread_mentions_count;
                                this.reactionMentionCount = dialog.unread_reactions_count;
                                this.pollVotesMentionCount = dialog.unread_poll_votes_count;
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
                                    i8 = forumUnreadCount2[1];
                                    int i14 = forumUnreadCount2[2];
                                    this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                    i7 = forumUnreadCount2[4];
                                    i5 = i13;
                                    i6 = i14;
                                } else {
                                    if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                        i5 = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                    } else if (dialog2 instanceof TLRPC.TL_dialogCommunity) {
                                        i5 = MessagesController.getInstance(this.currentAccount).getCommunityUnreadCount(-dialog2.id);
                                    } else if (dialog2 != null) {
                                        i5 = dialog2.unread_count;
                                        int i15 = dialog2.unread_mentions_count;
                                        i6 = dialog2.unread_reactions_count;
                                        i7 = dialog2.unread_poll_votes_count;
                                        i8 = i15;
                                    } else {
                                        i5 = 0;
                                    }
                                    i6 = 0;
                                    i7 = 0;
                                    i8 = 0;
                                }
                                int i16 = ChatObject.isMonoForum(chat7) ? 0 : i8;
                                if (dialog2 != null) {
                                    if (this.unreadCount == i5) {
                                        z5 = z4;
                                        if (this.markUnread == dialog2.unread_mark) {
                                            if (this.mentionCount == i16) {
                                            }
                                        }
                                    } else {
                                        z5 = z4;
                                    }
                                    this.unreadCount = i5;
                                    this.mentionCount = i16;
                                    this.markUnread = dialog2.unread_mark;
                                    this.reactionMentionCount = i6;
                                    this.pollVotesMentionCount = i7;
                                    z15 = true;
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

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0d54, code lost:
    
        if (r1.lastKnownTypingType >= 0) goto L425;
     */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:1033:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:1041:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:1042:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0e00  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x1018  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x10ed  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x1157  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x1167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x11ad  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x11c9  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x11ed  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x11f0  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x1229  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x12b2  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1410  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x1478  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x16b9  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x1836  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1867  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x187d  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x18a2  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x18bc  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x19b6  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x1904  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x19f3  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x19fe  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x1a0d  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x1a6c  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x1a75  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x1a7c  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x1acf  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x1b4f  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x1b9d  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x1bfb  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x1c2b  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x1c7f  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x1c9a  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x1cdf  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x1ce5  */
    /* JADX WARN: Removed duplicated region for block: B:673:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:674:0x1cbe  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x1c95  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x1c53  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x1c03  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x1c14  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x189c  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x14c6  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x141a  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x1305  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x1295  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x11cc  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x11b0  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x10e2  */
    /* JADX WARN: Removed duplicated region for block: B:887:0x1012  */
    /* JADX WARN: Removed duplicated region for block: B:899:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x0df9  */
    /* JADX WARN: Removed duplicated region for block: B:934:0x0acc  */
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
        float f;
        int i3;
        String str;
        int i4;
        float f2;
        String str2;
        int ceil;
        int i5;
        StaticLayout staticLayout;
        RLottieDrawable rLottieDrawable;
        float f3;
        float f4;
        Canvas canvas2;
        int i6;
        int i7;
        int i8;
        float f5;
        float f6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i9;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Chat chat;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int i10;
        int i11;
        float f7;
        int i12;
        boolean z5;
        int i13;
        float f8;
        Canvas canvas3;
        int i14;
        Canvas canvas4;
        float f9;
        int i15;
        int i16;
        float f10;
        boolean z6;
        Drawable drawable;
        Drawable drawable2;
        DialogCellTags dialogCellTags;
        int i17;
        float dp;
        float f11;
        StaticLayout staticLayout2;
        int i18;
        float f12;
        DialogUpdateHelper dialogUpdateHelper;
        float f13;
        StaticLayout staticLayout3;
        float f14;
        int i19;
        StaticLayout staticLayout4;
        StaticLayout staticLayout5;
        Drawable drawable3;
        CustomDialog customDialog;
        int i20;
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        TLRPC.TL_forumTopic tL_forumTopic3;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        float f15 = 12.5f;
        if ((this.currentDialogId == 0 && this.customDialog == null) || !this.visibleOnScreen) {
            return;
        }
        boolean z7 = this.drawArchive;
        if (z7 && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic4 = this.forumTopic) != null && tL_forumTopic4.id == 1)) && (pullForegroundDrawable2 = this.archivedChatsDrawable) != null && pullForegroundDrawable2.outProgress == 0.0f && this.translationX == 0.0f)) {
            canvas.save();
            canvas.translate(0.0f, (-this.translateY) - this.rightFragmentOffset);
            canvas.clipRect(0.0f, getMeasuredHeight() * (1.0f - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas);
            canvas.restore();
            this.emojiStatusView.setVisibility(4);
            return;
        }
        boolean z8 = z7 && (this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic3 = this.forumTopic) != null && tL_forumTopic3.id == 1)) && this.archivedChatsDrawable != null && this.translationX == 0.0f && (dialogsActivity = this.parentFragment) != null && dialogsActivity.hasHiddenArchive() && ((rightSlidingDialogContainer = this.parentFragment.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment());
        PullForegroundDrawable pullForegroundDrawable3 = this.archivedChatsDrawable;
        float pullProgress = pullForegroundDrawable3 != null ? pullForegroundDrawable3.getPullProgress() : 1.0f;
        if (z8) {
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
                    i = R.string.SwipeUngroupCommunity;
                    string = LocaleController.getString(i);
                    color = Theme.getColor(Theme.key_dialogSwipeRemove, this.resourcesProvider);
                    this.translationDrawable = Theme.dialogs_swipeCommunityUngroup;
                    i2 = color;
                    if (!this.swipeCanceled && (rLottieDrawable = this.lastDrawTranslationDrawable) != null) {
                        this.translationDrawable = rLottieDrawable;
                        i = this.lastDrawSwipeMessageStringId;
                    } else {
                        this.lastDrawTranslationDrawable = this.translationDrawable;
                        this.lastDrawSwipeMessageStringId = i;
                    }
                    if (!this.translationAnimationStarted && Math.abs(this.translationX) > AndroidUtilities.dp(43.0f)) {
                        this.translationAnimationStarted = true;
                        this.translationDrawable.setProgress(0.0f);
                        this.translationDrawable.setCallback(this);
                        this.translationDrawable.start();
                    }
                    float measuredWidth = this.translationX + getMeasuredWidth();
                    if (this.currentRevealProgress >= 1.0f) {
                        Theme.dialogs_pinnedPaint.setColor(color);
                        f = measuredWidth;
                        i3 = i;
                        str = string;
                        i4 = i2;
                        canvas.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                        if (this.currentRevealProgress == 0.0f) {
                            if (Theme.dialogs_archiveDrawableRecolored) {
                                Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                                Theme.dialogs_archiveDrawableRecolored = false;
                            }
                            if (Theme.dialogs_hidePsaDrawableRecolored) {
                                Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                                RLottieDrawable rLottieDrawable2 = Theme.dialogs_hidePsaDrawable;
                                int i21 = Theme.key_chats_archiveBackground;
                                rLottieDrawable2.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i21));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i21));
                                Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i21));
                                Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                                Theme.dialogs_hidePsaDrawableRecolored = false;
                            }
                        }
                    } else {
                        f = measuredWidth;
                        i3 = i;
                        str = string;
                        i4 = i2;
                    }
                    int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.translationDrawable.getIntrinsicWidth() / 2);
                    int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
                    int intrinsicWidth = (this.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
                    int intrinsicHeight = (this.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
                    if (this.currentRevealProgress > 0.0f) {
                        canvas.save();
                        canvas.clipRect(f - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        Theme.dialogs_pinnedPaint.setColor(i4);
                        canvas.drawCircle(intrinsicWidth, intrinsicHeight, ((float) Math.sqrt((intrinsicWidth * intrinsicWidth) + ((intrinsicHeight - getMeasuredHeight()) * (intrinsicHeight - getMeasuredHeight())))) * AndroidUtilities.accelerateInterpolator.getInterpolation(this.currentRevealProgress), Theme.dialogs_pinnedPaint);
                        canvas.restore();
                        if (!Theme.dialogs_archiveDrawableRecolored) {
                            Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                            Theme.dialogs_archiveDrawableRecolored = true;
                        }
                        if (!Theme.dialogs_hidePsaDrawableRecolored) {
                            Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                            RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                            int i22 = Theme.key_chats_archivePinBackground;
                            rLottieDrawable3.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i22));
                            Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i22));
                            Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i22));
                            Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                            Theme.dialogs_hidePsaDrawableRecolored = true;
                        }
                    }
                    canvas.save();
                    canvas.translate(measuredWidth2, measuredHeight);
                    f2 = this.currentRevealBounceProgress;
                    if (f2 != 0.0f && f2 != 1.0f) {
                        float interpolation = this.interpolator.getInterpolation(f2) + 1.0f;
                        canvas.scale(interpolation, interpolation, this.translationDrawable.getIntrinsicWidth() / 2, this.translationDrawable.getIntrinsicHeight() / 2);
                    }
                    BaseCell.setDrawableBounds((Drawable) this.translationDrawable, 0, 0);
                    this.translationDrawable.draw(canvas);
                    canvas.restore();
                    canvas.clipRect(f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    str2 = str;
                    ceil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str2));
                    i5 = i3;
                    if (this.swipeMessageTextId == i5 || this.swipeMessageWidth != getMeasuredWidth()) {
                        this.swipeMessageTextId = i5;
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
            i2 = color2;
            if (!this.swipeCanceled) {
            }
            this.lastDrawTranslationDrawable = this.translationDrawable;
            this.lastDrawSwipeMessageStringId = i;
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
            if (this.currentRevealProgress > 0.0f) {
            }
            canvas.save();
            canvas.translate(measuredWidth22, measuredHeight2);
            f2 = this.currentRevealBounceProgress;
            if (f2 != 0.0f) {
                float interpolation2 = this.interpolator.getInterpolation(f2) + 1.0f;
                canvas.scale(interpolation2, interpolation2, this.translationDrawable.getIntrinsicWidth() / 2, this.translationDrawable.getIntrinsicHeight() / 2);
            }
            BaseCell.setDrawableBounds((Drawable) this.translationDrawable, 0, 0);
            this.translationDrawable.draw(canvas);
            canvas.restore();
            canvas.clipRect(f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            str2 = str;
            ceil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str2));
            i5 = i3;
            if (this.swipeMessageTextId == i5) {
            }
            this.swipeMessageTextId = i5;
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
        }
        if (this.translationX != 0.0f) {
            canvas.save();
            canvas.translate(this.translationX, 0.0f);
            f3 = this.translationX + 0.0f;
        } else {
            f3 = 0.0f;
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
            Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, 1.0f));
            Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
        } else if (getIsPinned() || this.drawPinBackground) {
            Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
            Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
        }
        canvas.restore();
        this.updateHelper.updateAnimationValues();
        if (this.collapseOffset != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, this.collapseOffset);
            f4 = this.collapseOffset + 0.0f;
        } else {
            f4 = 0.0f;
        }
        float f16 = this.rightFragmentOpenedProgress;
        if (f16 != 1.0f) {
            if (f16 != 0.0f) {
                float clamp = Utilities.clamp(f16 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    i10 = 2;
                    i20 = canvas.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.rightFragmentOpenedProgress) * 255.0f), 31);
                    i11 = 1;
                } else {
                    i10 = 2;
                    int save = canvas.save();
                    i11 = 1;
                    canvas.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i20 = save;
                }
                canvas.translate((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress, 0.0f);
                f7 = f3 + ((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress);
                i12 = i20;
            } else {
                i10 = 2;
                i11 = 1;
                f7 = f3;
                i12 = -1;
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
                    Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, 1.0f));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r0.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
                } else if (getIsPinned() || this.drawPinBackground) {
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r0.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
                }
                canvas.restore();
            }
            if (this.translationX != 0.0f) {
                float f17 = this.cornerProgress;
                if (f17 < 1.0f) {
                    float f18 = f17 + 0.10666667f;
                    this.cornerProgress = f18;
                    if (f18 > 1.0f) {
                        this.cornerProgress = 1.0f;
                    }
                    z5 = true;
                }
                z5 = false;
            } else {
                float f19 = this.cornerProgress;
                if (f19 > 0.0f) {
                    float f20 = f19 - 0.10666667f;
                    this.cornerProgress = f20;
                    if (f20 < 0.0f) {
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
                if (!this.nameLayoutEllipsizeByGradient || this.nameLayoutFits) {
                    i13 = i12;
                } else {
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
                    i13 = i12;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), NotificationCenter.didReceiveSmsCode, 31);
                    int i23 = this.nameLeft;
                    canvas.clipRect(i23, 0, this.nameWidth + i23, getMeasuredHeight());
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
                StaticLayout staticLayout6 = this.nameLayout;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, this.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(0, staticLayout6.getPaint().getColor()));
                canvas.restore();
                if (!this.nameLayoutEllipsizeByGradient || this.nameLayoutFits) {
                    i11 = 1;
                } else {
                    canvas.save();
                    if (this.nameLayoutEllipsizeLeft) {
                        canvas.translate(this.nameLeft, 0.0f);
                        f8 = 0.0f;
                        i11 = 1;
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaint);
                    } else {
                        i11 = 1;
                        f8 = 0.0f;
                        canvas.translate((this.nameLeft + this.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaintBack);
                    }
                    canvas.restore();
                    canvas.restore();
                    if (this.timeLayout == null && this.currentDialogFolderId == 0) {
                        canvas.save();
                        canvas.translate(this.timeLeft, this.timeTop);
                        TextPaint timeTextPaint = getTimeTextPaint();
                        if (getIsPinned()) {
                            canvas.translate(AndroidUtilities.dp(20.0f), f8);
                            float height = (this.timeLayout.getHeight() / 2.0f) - AndroidUtilities.dp(8.5f);
                            float f21 = -AndroidUtilities.dp(20.0f);
                            float width = this.timeLayout.getWidth() + AndroidUtilities.dp(6.0f);
                            if (this.drawCount && !isCounterMuted()) {
                                drawable3 = Theme.dialogs_pinnedDrawable2Accent;
                            } else {
                                drawable3 = Theme.dialogs_pinnedDrawable2;
                            }
                            Drawable drawable4 = drawable3;
                            int dp4 = (int) (((AndroidUtilities.dp(17.0f) - drawable4.getIntrinsicHeight()) / 2.0f) + height);
                            int dp5 = ((int) f21) + AndroidUtilities.dp(4.0f);
                            drawable4.setBounds(dp5, dp4, drawable4.getIntrinsicWidth() + dp5, dp4 + drawable4.getIntrinsicHeight());
                            int alpha = timeTextPaint.getAlpha();
                            timeTextPaint.setAlpha(27);
                            canvas3 = canvas;
                            canvas.drawRoundRect(f21, height, width, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                            timeTextPaint.setAlpha(alpha);
                            drawable4.draw(canvas3);
                        } else {
                            canvas3 = canvas;
                        }
                        int color6 = this.timeLayout.getPaint().getColor();
                        boolean z9 = color6 != timeTextPaint.getColor();
                        if (z9) {
                            this.timeLayout.getPaint().setColor(timeTextPaint.getColor());
                        }
                        SpoilerEffect.layoutDrawMaybe(this.timeLayout, canvas3);
                        if (z9) {
                            this.timeLayout.getPaint().setColor(color6);
                        }
                        canvas.restore();
                    } else {
                        canvas3 = canvas;
                    }
                    if (drawLock2()) {
                        i14 = 2;
                    } else {
                        i14 = 2;
                        Theme.dialogs_lock2Drawable.setBounds(this.lock2Left, this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / 2), this.lock2Left + Theme.dialogs_lock2Drawable.getIntrinsicWidth(), this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / 2) + Theme.dialogs_lock2Drawable.getIntrinsicHeight());
                        Theme.dialogs_lock2Drawable.draw(canvas3);
                    }
                    if (this.messageNameLayout != null || isForumCell()) {
                        canvas4 = canvas3;
                        f9 = 0.0f;
                        i15 = 1;
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
                            staticLayout5 = this.messageNameLayout;
                            i15 = 1;
                            canvas4 = canvas3;
                            f9 = 0.0f;
                        } catch (Exception e) {
                            e = e;
                            canvas4 = canvas3;
                            f9 = 0.0f;
                            i15 = 1;
                        }
                        try {
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout5, this.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i11, staticLayout5.getPaint().getColor()));
                        } catch (Exception e2) {
                            e = e2;
                            FileLog.e(e);
                            canvas.restore();
                            if (this.messageLayout != null) {
                            }
                            if (this.buttonLayout != null) {
                            }
                            if (this.currentDialogFolderId != 0) {
                            }
                            if (this.drawBotVerified) {
                            }
                            if (this.drawUnmute) {
                            }
                            if (this.dialogsType != i14) {
                            }
                            i6 = 17;
                            if (!this.drawVerified) {
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
                            if (this.drawError) {
                            }
                            if (this.thumbsCount > 0) {
                            }
                            i7 = 2;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                            }
                            i17 = i13;
                            if (i17 != -1) {
                            }
                            z2 = z5;
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.drawAvatar) {
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.avatarImage.getVisible()) {
                            }
                            if (this.rightFragmentOpenedProgress > f5) {
                            }
                            if (this.collapseOffset != f5) {
                            }
                            if (this.translationX != f5) {
                            }
                            if (this.drawArchive) {
                            }
                            if (this.useSeparator) {
                            }
                            if (this.clipProgress != f5) {
                            }
                            if (z8) {
                            }
                            z3 = this.drawReorder;
                            if (!z3) {
                            }
                            if (z3) {
                            }
                            if (!this.archiveHidden) {
                            }
                        }
                        canvas.restore();
                    }
                    if (this.messageLayout != null) {
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
                            f12 = this.messageTop - (dialogUpdateHelper2.typingProgres * dp6);
                        } else {
                            f12 = this.messageTop + (dialogUpdateHelper2.typingProgres * dp6);
                        }
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            f12 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                        }
                        if (this.updateHelper.typingProgres != 1.0f) {
                            canvas.save();
                            canvas4.translate(this.messageLeft, f12);
                            int alpha2 = this.messageLayout.getPaint().getAlpha();
                            this.messageLayout.getPaint().setAlpha((int) (alpha2 * (1.0f - this.updateHelper.typingProgres)));
                            if (!this.spoilers.isEmpty()) {
                                try {
                                    canvas.save();
                                    SpoilerEffect.clipOutCanvas(canvas4, this.spoilers);
                                    SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                                    staticLayout4 = this.messageLayout;
                                    i19 = alpha2;
                                    f10 = 1.0f;
                                } catch (Exception e3) {
                                    e = e3;
                                    i19 = alpha2;
                                    f10 = 1.0f;
                                }
                                try {
                                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, this.animatedEmojiStack, -0.075f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i14, staticLayout4.getPaint().getColor()));
                                    canvas.restore();
                                    for (int i24 = 0; i24 < this.spoilers.size(); i24 += i15) {
                                        SpoilerEffect spoilerEffect = (SpoilerEffect) this.spoilers.get(i24);
                                        spoilerEffect.setColor(this.messageLayout.getPaint().getColor());
                                        spoilerEffect.draw(canvas4);
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    FileLog.e(e);
                                    this.messageLayout.getPaint().setAlpha(i19);
                                    canvas.restore();
                                    canvas.save();
                                    dialogUpdateHelper = this.updateHelper;
                                    if (!dialogUpdateHelper.typingOutToTop) {
                                    }
                                    if (!this.useForceThreeLines) {
                                        f13 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                        canvas4.translate(this.typingLeft, f13);
                                        staticLayout3 = this.typingLayout;
                                        if (staticLayout3 != null) {
                                            int alpha3 = staticLayout3.getPaint().getAlpha();
                                            this.typingLayout.getPaint().setAlpha((int) (alpha3 * this.updateHelper.typingProgres));
                                            this.typingLayout.draw(canvas4);
                                            this.typingLayout.getPaint().setAlpha(alpha3);
                                        }
                                        canvas.restore();
                                        if (this.typingLayout != null) {
                                        }
                                        i16 = 4;
                                        if (this.buttonLayout != null) {
                                        }
                                        if (this.currentDialogFolderId != 0) {
                                        }
                                        if (this.drawBotVerified) {
                                        }
                                        if (this.drawUnmute) {
                                        }
                                        if (this.dialogsType != i14) {
                                        }
                                        i6 = 17;
                                        if (!this.drawVerified) {
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
                                        if (this.drawError) {
                                        }
                                        if (this.thumbsCount > 0) {
                                        }
                                        i7 = 2;
                                        dialogCellTags = this.tags;
                                        if (dialogCellTags != null) {
                                        }
                                        i17 = i13;
                                        if (i17 != -1) {
                                        }
                                        z2 = z5;
                                        if (this.animatingArchiveAvatar) {
                                        }
                                        if (this.drawAvatar) {
                                        }
                                        if (this.animatingArchiveAvatar) {
                                        }
                                        if (this.avatarImage.getVisible()) {
                                        }
                                        if (this.rightFragmentOpenedProgress > f5) {
                                        }
                                        if (this.collapseOffset != f5) {
                                        }
                                        if (this.translationX != f5) {
                                        }
                                        if (this.drawArchive) {
                                        }
                                        if (this.useSeparator) {
                                        }
                                        if (this.clipProgress != f5) {
                                        }
                                        if (z8) {
                                        }
                                        z3 = this.drawReorder;
                                        if (!z3) {
                                        }
                                        if (z3) {
                                        }
                                        if (!this.archiveHidden) {
                                        }
                                    }
                                    f13 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                    canvas4.translate(this.typingLeft, f13);
                                    staticLayout3 = this.typingLayout;
                                    if (staticLayout3 != null) {
                                    }
                                    canvas.restore();
                                    if (this.typingLayout != null) {
                                    }
                                    i16 = 4;
                                    if (this.buttonLayout != null) {
                                    }
                                    if (this.currentDialogFolderId != 0) {
                                    }
                                    if (this.drawBotVerified) {
                                    }
                                    if (this.drawUnmute) {
                                    }
                                    if (this.dialogsType != i14) {
                                    }
                                    i6 = 17;
                                    if (!this.drawVerified) {
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
                                    if (this.drawError) {
                                    }
                                    if (this.thumbsCount > 0) {
                                    }
                                    i7 = 2;
                                    dialogCellTags = this.tags;
                                    if (dialogCellTags != null) {
                                    }
                                    i17 = i13;
                                    if (i17 != -1) {
                                    }
                                    z2 = z5;
                                    if (this.animatingArchiveAvatar) {
                                    }
                                    if (this.drawAvatar) {
                                    }
                                    if (this.animatingArchiveAvatar) {
                                    }
                                    if (this.avatarImage.getVisible()) {
                                    }
                                    if (this.rightFragmentOpenedProgress > f5) {
                                    }
                                    if (this.collapseOffset != f5) {
                                    }
                                    if (this.translationX != f5) {
                                    }
                                    if (this.drawArchive) {
                                    }
                                    if (this.useSeparator) {
                                    }
                                    if (this.clipProgress != f5) {
                                    }
                                    if (z8) {
                                    }
                                    z3 = this.drawReorder;
                                    if (!z3) {
                                    }
                                    if (z3) {
                                    }
                                    if (!this.archiveHidden) {
                                    }
                                }
                            } else {
                                i19 = alpha2;
                                f10 = 1.0f;
                                SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                                StaticLayout staticLayout7 = this.messageLayout;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout7, this.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i14, staticLayout7.getPaint().getColor()));
                            }
                            this.messageLayout.getPaint().setAlpha(i19);
                            canvas.restore();
                        } else {
                            f10 = 1.0f;
                        }
                        canvas.save();
                        dialogUpdateHelper = this.updateHelper;
                        if (!dialogUpdateHelper.typingOutToTop) {
                            f13 = this.messageTop + ((f10 - dialogUpdateHelper.typingProgres) * dp6);
                        } else {
                            f13 = this.messageTop - ((f10 - dialogUpdateHelper.typingProgres) * dp6);
                        }
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            f13 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                        }
                        canvas4.translate(this.typingLeft, f13);
                        staticLayout3 = this.typingLayout;
                        if (staticLayout3 != null && this.updateHelper.typingProgres > f9) {
                            int alpha32 = staticLayout3.getPaint().getAlpha();
                            this.typingLayout.getPaint().setAlpha((int) (alpha32 * this.updateHelper.typingProgres));
                            this.typingLayout.draw(canvas4);
                            this.typingLayout.getPaint().setAlpha(alpha32);
                        }
                        canvas.restore();
                        if (this.typingLayout != null) {
                            int i25 = this.printingStringType;
                            if (i25 < 0) {
                                DialogUpdateHelper dialogUpdateHelper3 = this.updateHelper;
                                if (dialogUpdateHelper3.typingProgres > f9) {
                                }
                            }
                            if (i25 < 0) {
                                i25 = this.updateHelper.lastKnownTypingType;
                            }
                            StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(i25);
                            if (chatStatusDrawable != null) {
                                canvas.save();
                                chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_actionMessage), (int) (Color.alpha(r10) * this.updateHelper.typingProgres)));
                                DialogUpdateHelper dialogUpdateHelper4 = this.updateHelper;
                                if (dialogUpdateHelper4.typingOutToTop) {
                                    f14 = this.messageTop + (dp6 * (f10 - dialogUpdateHelper4.typingProgres));
                                } else {
                                    f14 = this.messageTop - (dp6 * (f10 - dialogUpdateHelper4.typingProgres));
                                }
                                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                    f14 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                }
                                i16 = 4;
                                if (i25 == i15 || i25 == 4) {
                                    canvas4.translate(this.statusDrawableLeft, f14 + (i25 == i15 ? AndroidUtilities.dp(f10) : 0));
                                } else {
                                    canvas4.translate(this.statusDrawableLeft, f14 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
                                }
                                chatStatusDrawable.draw(canvas4);
                                invalidate();
                                canvas.restore();
                            }
                        }
                        i16 = 4;
                    } else {
                        i16 = 4;
                        f10 = 1.0f;
                    }
                    if (this.buttonLayout != null) {
                        canvas.save();
                        if (this.buttonBackgroundPaint == null) {
                            this.buttonBackgroundPaint = new Paint(i15);
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
                        if (this.lastTopicMessageUnread && this.topMessageTopicEndIndex != this.topMessageTopicStartIndex && ((i18 = this.dialogsType) == 0 || i18 == 7 || i18 == 8)) {
                            this.canvasButton.setColor(ColorUtils.setAlphaComponent(this.currentMessagePaint.getColor(), Theme.isCurrentThemeDark() ? 36 : 26));
                            if (!this.buttonCreated) {
                                this.canvasButton.rewind();
                                int i26 = this.topMessageTopicEndIndex;
                                if (i26 != this.topMessageTopicStartIndex && i26 > 0) {
                                    float f22 = this.messageTop;
                                    if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                        f22 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                    }
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    float dp7 = this.messageLeft + AndroidUtilities.dp(2.0f) + this.messageLayout.getPrimaryHorizontal(0);
                                    float f23 = this.messageLeft;
                                    StaticLayout staticLayout8 = this.messageLayout;
                                    rectF.set(dp7, f22, (f23 + staticLayout8.getPrimaryHorizontal(Math.min(staticLayout8.getText().length(), this.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), this.buttonTop - AndroidUtilities.dp(4.0f));
                                    rectF.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                                    if (rectF.right > rectF.left) {
                                        this.canvasButton.addRect(rectF);
                                    }
                                }
                                float lineLeft = this.buttonLayout.getLineLeft(0);
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                rectF2.set(this.buttonLeft + lineLeft + AndroidUtilities.dp(2.0f), this.buttonTop + AndroidUtilities.dp(2.0f), this.buttonLeft + lineLeft + this.buttonLayout.getLineWidth(0) + AndroidUtilities.dp(12.0f), this.buttonTop + this.buttonLayout.getHeight());
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
                                staticLayout2 = this.buttonLayout;
                            } catch (Exception e5) {
                                e = e5;
                            }
                            try {
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout2, this.animatedEmojiStack3, -0.075f, this.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout2.getPaint().getColor()));
                                canvas.restore();
                                for (int i27 = 0; i27 < this.spoilers2.size(); i27 += i15) {
                                    SpoilerEffect spoilerEffect2 = (SpoilerEffect) this.spoilers2.get(i27);
                                    spoilerEffect2.setColor(this.buttonLayout.getPaint().getColor());
                                    spoilerEffect2.draw(canvas4);
                                }
                            } catch (Exception e6) {
                                e = e6;
                                FileLog.e(e);
                                canvas.restore();
                                if (this.currentDialogFolderId != 0) {
                                }
                                if (this.drawBotVerified) {
                                }
                                if (this.drawUnmute) {
                                }
                                if (this.dialogsType != i14) {
                                }
                                i6 = 17;
                                if (!this.drawVerified) {
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
                                if (this.drawError) {
                                }
                                if (this.thumbsCount > 0) {
                                }
                                i7 = 2;
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null) {
                                }
                                i17 = i13;
                                if (i17 != -1) {
                                }
                                z2 = z5;
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
                                        DrawableUtils.setBounds(this.communityArrowDrawable, centerX, centerY, i6);
                                        canvas2.drawCircle(this.communityArrowDrawable.getBounds().exactCenterX(), this.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
                                        this.communityArrowDrawable.draw(canvas2);
                                    }
                                }
                                if (this.animatingArchiveAvatar) {
                                }
                                if (this.avatarImage.getVisible()) {
                                }
                                if (this.rightFragmentOpenedProgress > f5) {
                                    boolean isCounterMuted = isCounterMuted();
                                    RectF rectF4 = this.storyParams.originalAvatarRect;
                                    int width2 = (int) (((rectF4.left + rectF4.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
                                    RectF rectF5 = this.storyParams.originalAvatarRect;
                                    drawCounter(canvas, isCounterMuted, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width2, (int) (((rectF5.left + rectF5.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
                                }
                                if (this.collapseOffset != f5) {
                                }
                                if (this.translationX != f5) {
                                }
                                if (this.drawArchive) {
                                    canvas.save();
                                    canvas2.translate(f5, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
                                    canvas2.clipRect(f5, getMeasuredHeight() * (f6 - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
                                    this.archivedChatsDrawable.draw(canvas2);
                                    canvas.restore();
                                }
                                if (this.useSeparator) {
                                }
                                if (this.clipProgress != f5) {
                                }
                                if (z8) {
                                }
                                z3 = this.drawReorder;
                                if (!z3) {
                                }
                                if (z3) {
                                }
                                if (!this.archiveHidden) {
                                }
                            }
                        } else {
                            SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas4);
                            StaticLayout staticLayout9 = this.buttonLayout;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout9, this.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout9.getPaint().getColor()));
                        }
                        canvas.restore();
                    }
                    if (this.currentDialogFolderId != 0) {
                        int i28 = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                        int i29 = this.lastStatusDrawableParams;
                        if (i29 >= 0 && i29 != i28 && !this.statusDrawableAnimationInProgress) {
                            createStatusDrawableAnimator(i29, i28);
                        }
                        boolean z10 = this.statusDrawableAnimationInProgress;
                        if (z10) {
                            i28 = this.animateToStatusDrawableParams;
                        }
                        boolean z11 = (i28 & 1) != 0;
                        boolean z12 = (i28 & 2) != 0;
                        boolean z13 = (i28 & i16) != 0;
                        if (z10) {
                            int i30 = this.animateFromStatusDrawableParams;
                            boolean z14 = (i30 & 1) != 0;
                            boolean z15 = (i30 & 2) != 0;
                            boolean z16 = (i30 & i16) != 0;
                            if (!z11 && !z14 && z16 && !z15 && z12 && z13) {
                                canvas2 = canvas4;
                                drawCheckStatus(canvas, z11, z12, z13, true, this.statusDrawableProgress);
                                i8 = 1;
                                f5 = 0.0f;
                                f6 = 1.0f;
                            } else {
                                canvas2 = canvas4;
                                boolean z17 = z15;
                                i8 = 1;
                                boolean z18 = z16;
                                f5 = 0.0f;
                                f6 = 1.0f;
                                drawCheckStatus(canvas, z14, z17, z18, false, f10 - this.statusDrawableProgress);
                                drawCheckStatus(canvas, z11, z12, z13, false, this.statusDrawableProgress);
                            }
                        } else {
                            canvas2 = canvas4;
                            i8 = 1;
                            f5 = 0.0f;
                            f6 = 1.0f;
                            drawCheckStatus(canvas, z11, z12, z13, false, 1.0f);
                        }
                        this.lastStatusDrawableParams = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                    } else {
                        canvas2 = canvas4;
                        i8 = 1;
                        f5 = 0.0f;
                        f6 = 1.0f;
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
                    boolean z19 = !this.drawUnmute || this.dialogMuted || this.isHiddenInCommunity;
                    if (this.dialogsType != i14 || ((!z19 && this.dialogMutedProgress <= f5) || this.drawVerified || this.drawScam != 0)) {
                        i6 = 17;
                    } else {
                        if (z19) {
                            float f24 = this.dialogMutedProgress;
                            if (f24 != f6) {
                                float f25 = f24 + 0.10666667f;
                                this.dialogMutedProgress = f25;
                                if (f25 > f6) {
                                    this.dialogMutedProgress = f6;
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
                                i6 = 17;
                                DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                                if (this.dialogMutedProgress != f6) {
                                    canvas.save();
                                    float f26 = this.dialogMutedProgress;
                                    canvas2.scale(f26, f26, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
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
                        if (!z19) {
                            float f27 = this.dialogMutedProgress;
                            if (f27 != f5) {
                                float f28 = f27 - 0.10666667f;
                                this.dialogMutedProgress = f28;
                                if (f28 < f5) {
                                    this.dialogMutedProgress = f5;
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
                            i6 = 17;
                            DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                            if (this.dialogMutedProgress != f6) {
                            }
                        }
                        dp102 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                        BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp92, dp102);
                        BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp92, dp102);
                        i6 = 17;
                        DrawableUtils.setBounds(Theme.dialogs_hiddenDrawable, Theme.dialogs_muteDrawable.getBounds().exactCenterX() + AndroidUtilities.dp(2.0f), Theme.dialogs_muteDrawable.getBounds().exactCenterY(), 17);
                        if (this.dialogMutedProgress != f6) {
                        }
                    }
                    if (!this.drawVerified) {
                        float dp11 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            dp11 -= AndroidUtilities.dp(9.0f);
                        }
                        BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft - AndroidUtilities.dp(f6), dp11);
                        BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft - AndroidUtilities.dp(f6), dp11);
                        Theme.dialogs_verifiedDrawable.draw(canvas2);
                        Theme.dialogs_verifiedCheckDrawable.draw(canvas2);
                    } else if (this.drawPremium) {
                        int dp12 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            dp12 -= AndroidUtilities.dp(9.0f);
                        }
                        if (this.emojiStatus != null) {
                            this.emojiStatusView.setTranslationX((f7 + this.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                            this.emojiStatusView.setTranslationY((f4 + dp12) - AndroidUtilities.dp(4.0f));
                            if (this.rightFragmentOpenedProgress > f5) {
                                this.emojiStatus.setBounds(this.nameMuteLeft - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(4.0f), this.nameMuteLeft + AndroidUtilities.dp(20.0f), (dp12 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(22.0f));
                                this.emojiStatus.draw(canvas2);
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            this.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                            z = z6;
                            if (!this.drawReorder || this.reorderIconProgress != f5) {
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
                            if (this.drawError) {
                                Theme.dialogs_errorDrawable.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                this.rect.set(this.errorLeft, this.errorTop, r2 + AndroidUtilities.dp(20.666f), this.errorTop + AndroidUtilities.dp(20.666f));
                                RectF rectF6 = this.rect;
                                float f29 = AndroidUtilities.density * 10.5f;
                                canvas2.drawRoundRect(rectF6, f29, f29, Theme.dialogs_errorPaint);
                                BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, this.errorLeft + AndroidUtilities.dp(4.5f), this.errorTop + AndroidUtilities.dp(5.0f));
                                Theme.dialogs_errorDrawable.draw(canvas2);
                            } else if (((this.drawCount || this.drawMention) && this.drawCount2) || this.countChangeProgress != f6 || this.drawReactionMention || this.reactionsMentionsChangeProgress != f6 || this.drawPollVotesMention || floatValue2222 > f5) {
                                boolean isCounterMuted2 = isCounterMuted();
                                drawCounter(canvas, isCounterMuted2, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                                if (this.drawMention) {
                                    Theme.dialogs_countPaint.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                    if (this.mentionLayout != null) {
                                        this.rect.set(this.mentionLeft, this.countTop, r1 + this.mentionWidth + AndroidUtilities.dp(12.666f), this.countTop + AndroidUtilities.dp(20.666f));
                                        Paint paint3 = (!isCounterMuted2 || this.folderId == 0) ? Theme.dialogs_countPaint : Theme.dialogs_countGrayPaint;
                                        RectF rectF7 = this.rect;
                                        canvas2.drawRoundRect(rectF7, rectF7.height() / 2.0f, this.rect.height() / 2.0f, paint3);
                                        Theme.dialogs_countTextPaint2.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                        canvas.save();
                                        canvas2.translate(this.mentionLeft + AndroidUtilities.dp(6.333f), this.countTop + AndroidUtilities.dp(4.0f));
                                        this.mentionLayout.draw(canvas2);
                                        canvas.restore();
                                    } else {
                                        Drawable drawable6 = Theme.dialogs_mentionDrawable;
                                        drawable6.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                        DrawableUtils.setBounds(drawable6, this.mentionLeft + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i6);
                                        drawable6.draw(canvas2);
                                    }
                                }
                                if (this.drawReactionMention || this.reactionsMentionsChangeProgress != f6) {
                                    this.rect.set(this.reactionMentionLeft, this.countTop, AndroidUtilities.dp(20.666f) + r1, this.countTop + AndroidUtilities.dp(20.666f));
                                    float f30 = this.reactionsMentionsChangeProgress;
                                    if (f30 == f6) {
                                        f30 = 1.0f;
                                    } else if (!this.drawReactionMention) {
                                        f30 = f6 - f30;
                                    }
                                    if (isCounterMuted2) {
                                        drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                    } else {
                                        drawable = Theme.dialogs_reactionsMentionDrawable;
                                    }
                                    drawable.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                    DrawableUtils.setBounds(drawable, r1 + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i6);
                                    DrawableUtils.drawWithScale(canvas2, drawable, f30);
                                }
                                if ((this.drawPollVotesMention || floatValue2222 > f5) && floatValue2222 != f5) {
                                    this.rect.set(this.pollVotesMentionLeft, this.countTop, AndroidUtilities.dp(20.666f) + r1, this.countTop + AndroidUtilities.dp(20.666f));
                                    if (isCounterMuted2) {
                                        drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                    } else {
                                        drawable2 = Theme.dialogs_pollMentionDrawable;
                                    }
                                    drawable2.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                    DrawableUtils.setBounds(drawable2, r1 + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i6);
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
                                float f31 = this.updateHelper.typingProgres;
                                if (f31 != f6) {
                                    if (f31 > f5) {
                                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((f6 - f31) * 255.0f), 31);
                                        if (this.updateHelper.typingOutToTop) {
                                            dp = -AndroidUtilities.dp(14.0f);
                                            f11 = this.updateHelper.typingProgres;
                                        } else {
                                            dp = AndroidUtilities.dp(14.0f);
                                            f11 = this.updateHelper.typingProgres;
                                        }
                                        canvas2.translate(f5, dp * f11);
                                    }
                                    for (int i31 = 0; i31 < this.thumbsCount; i31 += i8) {
                                        if (this.thumbImageSeen[i31]) {
                                            if (this.thumbBackgroundPaint == null) {
                                                Paint paint4 = new Paint(i8);
                                                this.thumbBackgroundPaint = paint4;
                                                paint4.setShadowLayer(AndroidUtilities.dp(1.34f), f5, AndroidUtilities.dp(0.34f), 402653184);
                                                this.thumbBackgroundPaint.setColor(0);
                                            }
                                            RectF rectF9 = AndroidUtilities.rectTmp;
                                            rectF9.set(this.thumbImage[i31].getImageX(), this.thumbImage[i31].getImageY(), this.thumbImage[i31].getImageX2(), this.thumbImage[i31].getImageY2());
                                            this.thumbImage[i31].draw(canvas2);
                                            if (this.drawSpoiler[i31]) {
                                                Path path = this.thumbPath;
                                                if (path == null) {
                                                    this.thumbPath = new Path();
                                                } else {
                                                    path.rewind();
                                                }
                                                this.thumbPath.addRoundRect(rectF9, this.thumbImage[i31].getRoundRadius()[0], this.thumbImage[i31].getRoundRadius()[i8], Path.Direction.CW);
                                                canvas.save();
                                                canvas2.clipPath(this.thumbPath);
                                                if (this.thumbSpoiler == null) {
                                                    this.thumbSpoiler = new SpoilerEffect();
                                                }
                                                this.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(-1) * 0.325f)));
                                                this.thumbSpoiler.setBounds((int) this.thumbImage[i31].getImageX(), (int) this.thumbImage[i31].getImageY(), (int) this.thumbImage[i31].getImageX2(), (int) this.thumbImage[i31].getImageY2());
                                                this.thumbSpoiler.draw(canvas2);
                                                invalidate();
                                                canvas.restore();
                                            }
                                            if (this.drawPlay[i31]) {
                                                BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (this.thumbImage[i31].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (this.thumbImage[i31].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)));
                                                Theme.dialogs_playDrawable.draw(canvas2);
                                            }
                                        }
                                    }
                                    i7 = 2;
                                    if (this.updateHelper.typingProgres > f5) {
                                        canvas.restore();
                                    }
                                    dialogCellTags = this.tags;
                                    if (dialogCellTags != null && !dialogCellTags.isEmpty()) {
                                        canvas.save();
                                        canvas2.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                                        this.tags.draw(canvas2, this.tagsRight - this.tagsLeft);
                                        canvas.restore();
                                    }
                                    i17 = i13;
                                    if (i17 != -1) {
                                        canvas2.restoreToCount(i17);
                                    }
                                    z2 = z5;
                                }
                            }
                            i7 = 2;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                                canvas.save();
                                canvas2.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                                this.tags.draw(canvas2, this.tagsRight - this.tagsLeft);
                                canvas.restore();
                            }
                            i17 = i13;
                            if (i17 != -1) {
                            }
                            z2 = z5;
                        } else {
                            Drawable drawable7 = PremiumGradient.getInstance().premiumStarDrawableMini;
                            int dp13 = this.nameMuteLeft - AndroidUtilities.dp(f6);
                            if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                                f15 = 15.5f;
                            }
                            BaseCell.setDrawableBounds(drawable7, dp13, AndroidUtilities.dp(f15));
                            drawable7.draw(canvas2);
                        }
                    } else if (this.drawScam != 0) {
                        int dp14 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.0f : 15.0f);
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            dp14 -= AndroidUtilities.dp(9.0f);
                        }
                        BaseCell.setDrawableBounds((Drawable) (this.drawScam == i8 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable), this.nameMuteLeft, dp14);
                        (this.drawScam == i8 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).draw(canvas2);
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
                    if (this.drawError) {
                    }
                    if (this.thumbsCount > 0) {
                    }
                    i7 = 2;
                    dialogCellTags = this.tags;
                    if (dialogCellTags != null) {
                    }
                    i17 = i13;
                    if (i17 != -1) {
                    }
                    z2 = z5;
                }
            } else {
                i13 = i12;
            }
            f8 = 0.0f;
            if (this.timeLayout == null) {
            }
            canvas3 = canvas;
            if (drawLock2()) {
            }
            if (this.messageNameLayout != null) {
            }
            canvas4 = canvas3;
            f9 = 0.0f;
            i15 = 1;
            if (this.messageLayout != null) {
            }
            if (this.buttonLayout != null) {
            }
            if (this.currentDialogFolderId != 0) {
            }
            if (this.drawBotVerified) {
            }
            if (this.drawUnmute) {
            }
            if (this.dialogsType != i14) {
            }
            i6 = 17;
            if (!this.drawVerified) {
            }
            z = false;
            if (!this.drawReorder) {
            }
            if (!LocaleController.isRTL) {
            }
            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
            Theme.dialogs_reorderDrawable.draw(canvas2);
            float floatValue222222 = this.animatorPollVotesMentionVisible.getFloatValue();
            if (this.drawError) {
            }
            if (this.thumbsCount > 0) {
            }
            i7 = 2;
            dialogCellTags = this.tags;
            if (dialogCellTags != null) {
            }
            i17 = i13;
            if (i17 != -1) {
            }
            z2 = z5;
        } else {
            canvas2 = canvas;
            i6 = 17;
            i7 = 2;
            i8 = 1;
            f5 = 0.0f;
            f6 = 1.0f;
            z = false;
            z2 = false;
        }
        if (this.animatingArchiveAvatar) {
            canvas.save();
            float interpolation3 = this.interpolator.getInterpolation(this.animatingArchiveAvatarProgress / 170.0f) + f6;
            canvas2.scale(interpolation3, interpolation3, this.avatarImage.getCenterX(), this.avatarImage.getCenterY());
        }
        if (this.drawAvatar && (!this.isTopic || (tL_forumTopic2 = this.forumTopic) == null || tL_forumTopic2.id != i8 || (pullForegroundDrawable = this.archivedChatsDrawable) == null || !pullForegroundDrawable.isDraw())) {
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
                DrawableUtils.setBounds(this.avatarImage, this.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dpf2(f6), this.storyParams.originalAvatarRect.centerY(), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), 17);
                DrawableUtils.drawCommunityCardDrawable(canvas2, Theme.dialogs_communityCardsDrawable, this.avatarImage.getCenterX(), this.avatarImage.getCenterY(), AndroidUtilities.dp(48.0f));
                this.avatarImage.draw(canvas2);
            } else {
                StoriesUtilities.AvatarStoryParams avatarStoryParams = this.storyParams;
                boolean z20 = this.isShareToStoryCell;
                avatarStoryParams.drawHiddenStoriesAsSegments = z20 || this.currentDialogFolderId != 0;
                int i32 = avatarStoryParams.forceState;
                if (z20) {
                    avatarStoryParams.forceState = i8;
                }
                StoriesUtilities.drawAvatarWithStory(this.currentDialogId, canvas2, this.avatarImage, avatarStoryParams);
                if (this.storyParams.drawnLive) {
                    checkTtl();
                }
                this.storyParams.forceState = i32;
            }
            if (!this.insideCommunityList && (chat = this.chat) != null && chat.linked_community_id != 0 && !this.drawCommunityAvatar && this.isDialogCell && !isDialogFolder()) {
                float centerX2 = this.storyParams.originalAvatarRect.centerX() + AndroidUtilities.dp(20.33f);
                float centerY2 = this.storyParams.originalAvatarRect.centerY() + AndroidUtilities.dp(19.0f);
                if (this.communityArrowDrawable == null) {
                    this.communityArrowDrawable = new CommunityArrowDrawable();
                }
                DrawableUtils.setBounds(this.communityArrowDrawable, centerX2, centerY2, i6);
                canvas2.drawCircle(this.communityArrowDrawable.getBounds().exactCenterX(), this.communityArrowDrawable.getBounds().exactCenterY(), AndroidUtilities.dp(8.0f), Theme.fillingPaint(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
                this.communityArrowDrawable.draw(canvas2);
            }
        }
        if (this.animatingArchiveAvatar) {
            canvas.restore();
        }
        boolean z21 = (this.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) ? z2 : true;
        if (this.rightFragmentOpenedProgress > f5 && this.currentDialogFolderId == 0) {
            boolean isCounterMuted3 = isCounterMuted();
            RectF rectF42 = this.storyParams.originalAvatarRect;
            int width22 = (int) (((rectF42.left + rectF42.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
            RectF rectF52 = this.storyParams.originalAvatarRect;
            drawCounter(canvas, isCounterMuted3, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width22, (int) (((rectF52.left + rectF52.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
        }
        if (this.collapseOffset != f5) {
            canvas.restore();
        }
        if (this.translationX != f5) {
            canvas.restore();
        }
        if (this.drawArchive && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == i8)) && this.translationX == f5 && this.archivedChatsDrawable != null)) {
            canvas.save();
            canvas2.translate(f5, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
            canvas2.clipRect(f5, getMeasuredHeight() * (f6 - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas2);
            canvas.restore();
        }
        if (this.useSeparator) {
            int dp15 = (this.fullSeparator || !(this.currentDialogFolderId == 0 || !this.archiveHidden || this.fullSeparator2) || (this.fullSeparator2 && !this.archiveHidden)) ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
            if (this.rightFragmentOpenedProgress != f6) {
                int alpha4 = Theme.dividerPaint.getAlpha();
                float f32 = this.rightFragmentOpenedProgress;
                if (f32 != f5) {
                    Theme.dividerPaint.setAlpha((int) (alpha4 * (f6 - f32)));
                }
                float measuredHeight3 = (getMeasuredHeight() - i8) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight3, getMeasuredWidth() - dp15, measuredHeight3, Theme.dividerPaint);
                } else {
                    canvas.drawLine(dp15, measuredHeight3, getMeasuredWidth(), measuredHeight3, Theme.dividerPaint);
                }
                if (this.rightFragmentOpenedProgress != f5) {
                    Theme.dividerPaint.setAlpha(alpha4);
                }
            }
        }
        if (this.clipProgress != f5) {
            if (Build.VERSION.SDK_INT != 24) {
                canvas.restore();
            } else {
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.topClip * this.clipProgress, Theme.dialogs_pinnedPaint);
                canvas.drawRect(0.0f, getMeasuredHeight() - ((int) (this.bottomClip * this.clipProgress)), getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
            }
        }
        if (z8) {
            float f33 = f6 - pullProgress;
            int measuredHeight4 = (int) (getMeasuredHeight() * f33);
            int color13 = Theme.getColor(Theme.key_windowBackgroundWhite);
            if (this.archiveFadeGradientDrawable == null) {
                this.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
            }
            if (this.archiveFadeGradientDrawableColor != color13) {
                this.archiveFadeGradientDrawableColor = color13;
                this.archiveFadeGradientDrawable.setColors(new int[]{color13, 16777215 & color13});
            }
            float clamp2 = MathUtils.clamp((f33 - 0.05f) * 10.0f, f5, f6);
            this.archiveFadeGradientDrawable.setBounds(0, measuredHeight4, getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight4);
            this.archiveFadeGradientDrawable.setAlpha((int) (clamp2 * 255.0f));
            this.archiveFadeGradientDrawable.draw(canvas2);
            canvas.restore();
        }
        z3 = this.drawReorder;
        if (!z3 || this.reorderIconProgress != f5) {
            if (z3) {
                float f34 = this.reorderIconProgress;
                if (f34 < f6) {
                    float f35 = f34 + 0.09411765f;
                    this.reorderIconProgress = f35;
                    if (f35 > f6) {
                        this.reorderIconProgress = f6;
                    }
                    z4 = true;
                }
            } else {
                float f36 = this.reorderIconProgress;
                if (f36 > f5) {
                    float f37 = f36 - 0.09411765f;
                    this.reorderIconProgress = f37;
                    if (f37 < f5) {
                        this.reorderIconProgress = f5;
                    }
                    z4 = true;
                }
            }
            if (!this.archiveHidden) {
                float f38 = this.archiveBackgroundProgress;
                if (f38 > f5) {
                    float f39 = f38 - 0.069565214f;
                    this.archiveBackgroundProgress = f39;
                    if (f39 < f5) {
                        this.archiveBackgroundProgress = f5;
                    }
                    if (this.avatarDrawable.getAvatarType() == i7) {
                        this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                    }
                    z4 = true;
                }
                if (this.animatingArchiveAvatar) {
                    i9 = 0;
                } else {
                    float f40 = this.animatingArchiveAvatarProgress + 16.0f;
                    this.animatingArchiveAvatarProgress = f40;
                    if (f40 >= 170.0f) {
                        this.animatingArchiveAvatarProgress = 170.0f;
                        i9 = 0;
                        this.animatingArchiveAvatar = false;
                    } else {
                        i9 = 0;
                    }
                    z4 = true;
                }
                if (!this.drawRevealBackground) {
                    float f41 = this.currentRevealBounceProgress;
                    if (f41 < f6) {
                        float f42 = f41 + 0.09411765f;
                        this.currentRevealBounceProgress = f42;
                        if (f42 > f6) {
                            this.currentRevealBounceProgress = f6;
                            z4 = true;
                        }
                    }
                    float f43 = this.currentRevealProgress;
                    if (f43 < f6) {
                        float f44 = f43 + 0.053333335f;
                        this.currentRevealProgress = f44;
                        if (f44 > f6) {
                            this.currentRevealProgress = f6;
                        }
                        z4 = true;
                    }
                    View view = this.emojiStatusView;
                    if (!z) {
                        i9 = 4;
                    }
                    view.setVisibility(i9);
                    if (z4) {
                        return;
                    }
                    invalidate();
                    return;
                }
                if (this.currentRevealBounceProgress == f6) {
                    this.currentRevealBounceProgress = f5;
                    z4 = true;
                }
                float f45 = this.currentRevealProgress;
                if (f45 > f5) {
                    float f46 = f45 - 0.053333335f;
                    this.currentRevealProgress = f46;
                    if (f46 < f5) {
                        this.currentRevealProgress = f5;
                    }
                    z4 = true;
                }
                View view2 = this.emojiStatusView;
                if (!z) {
                }
                view2.setVisibility(i9);
                if (z4) {
                }
            } else {
                float f47 = this.archiveBackgroundProgress;
                if (f47 < f6) {
                    float f48 = f47 + 0.069565214f;
                    this.archiveBackgroundProgress = f48;
                    if (f48 > f6) {
                        this.archiveBackgroundProgress = f6;
                    }
                    if (this.avatarDrawable.getAvatarType() == i7) {
                        this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                    }
                    z4 = true;
                }
                if (this.animatingArchiveAvatar) {
                }
                if (!this.drawRevealBackground) {
                }
            }
        }
        z4 = z21;
        if (!this.archiveHidden) {
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

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0172, code lost:
        
            if (org.telegram.messenger.MessagesController.getInstance(r19.this$0.currentAccount).getTopicsController().endIsReached(-r19.this$0.currentDialogId) != false) goto L61;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x02ef  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x02b7  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02e7  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x02ea  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x029e  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0252  */
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
            if (dialog instanceof TLRPC.TL_dialogCommunity) {
                return true;
            }
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
