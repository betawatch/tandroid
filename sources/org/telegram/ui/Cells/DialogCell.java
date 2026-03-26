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
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.RightSlidingDialogContainer;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.StoryViewer;

/* loaded from: classes4.dex */
public class DialogCell extends BaseCell implements StoriesListPlaceProvider.AvatarOverlaysView {
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
    private BounceInterpolator interpolator;
    public boolean isDialogCell;
    public boolean isForChannelSubscriberCell;
    private boolean isForum;
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

    @Override // org.telegram.ui.Cells.BaseCell, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
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
        this.avatarImage.setRoundRadius(AndroidUtilities.dp(28.0f));
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

    public boolean hasTags() {
        DialogCellTags dialogCellTags = this.tags;
        return (dialogCellTags == null || dialogCellTags.isEmpty()) ? false : true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:303|(3:514|515|(33:517|518|519|520|(20:522|308|309|310|(1:510)(1:314)|315|316|(5:501|(1:504)|505|(1:507)(1:509)|508)(3:320|(2:322|(1:326))|327)|328|329|330|331|332|333|334|(10:336|(8:340|(1:342)|343|(1:345)|346|(1:373)(2:350|(1:352)(2:358|(1:360)(2:361|(3:363|(1:365)(1:367)|366)(1:368))))|353|(2:355|(1:357)))|374|(3:378|(1:(2:380|(1:382)(2:383|384))(2:387|388))|(1:386))|389|(3:393|(1:(2:395|(1:397)(2:398|399))(2:402|403))|(1:401))|404|(2:410|(1:412))|413|(4:417|(1:419)|420|421))(10:439|(7:443|(1:445)|446|(4:448|(1:450)|451|(1:453))|454|(1:456)|457)|458|(4:462|(1:464)|465|466)|467|(4:471|(1:473)|474|475)|476|(4:480|(1:482)|483|484)|485|(1:489))|422|(3:(1:436)(1:431)|432|(1:434)(1:435))|437|438)|306|307|308|309|310|(1:312)|510|315|316|(1:318)|499|501|(1:504)|505|(0)(0)|508|328|329|330|331|332|333|334|(0)(0)|422|(6:424|426|(1:429)|436|432|(0)(0))|437|438))|305|306|307|308|309|310|(0)|510|315|316|(0)|499|501|(0)|505|(0)(0)|508|328|329|330|331|332|333|334|(0)(0)|422|(0)|437|438) */
    /* JADX WARN: Can't wrap try/catch for region: R(96:14|(1:16)|17|(2:1901|1902)(1:23)|24|(1:1900)(1:28)|29|(1:31)|32|(1:1899)(1:36)|37|(1:39)|40|(1:42)(1:1892)|43|(7:45|(1:47)|48|49|(1:51)|52|53)|54|(1:56)(1:1891)|57|(9:59|(2:61|(2:892|(1:894)(1:895))(2:65|(1:67)(1:891)))(4:896|(1:913)(1:900)|901|(2:909|(1:911)(1:912))(2:905|(1:907)(1:908)))|68|(3:70|(1:72)(4:878|(1:880)|881|(1:886)(1:885))|73)(3:887|(1:889)|890)|74|(1:76)(1:877)|77|(1:79)(1:(1:873)(1:(1:875)(1:876)))|80)(40:914|(2:1887|(1:1889)(1:1890))(2:918|(1:920)(1:1886))|921|(2:923|(2:925|(2:933|(1:935)(1:936))(2:929|(1:931)(1:932))))(2:1812|(41:1814|(4:1816|(1:1818)(2:1828|(1:1830)(3:1831|(1:1833)(5:1834|(1:1846)(1:1838)|1839|(1:1845)(1:1843)|1844)|1820))|1819|1820)(34:1847|(7:1849|(1:1851)(2:1867|(1:1869)(5:1870|(1:1884)(1:1874)|1875|(1:1883)(1:1881)|1882))|1852|(2:1854|(3:1858|1859|(2:1861|(1:1863)(1:1864))))(1:1866)|1865|1859|(0))(1:1885)|1822|1823|(1:1827)|938|(1:942)|943|(6:945|(1:947)(1:1797)|948|(1:950)(1:1796)|951|(1:955))(2:1798|(5:1803|(1:1805)(1:1811)|1806|(1:1808)(1:1810)|1809)(1:1802))|956|(4:960|(2:962|(2:964|(2:966|(1:1766))))|1768|(22:1780|970|(11:972|(1:974)(1:1223)|975|(3:(1:978)(1:1221)|979|(1:981))(1:1222)|982|(1:984)(1:1220)|985|(1:987)(1:1219)|988|(2:990|(1:993))|994)(2:1224|(1:1226)(21:(6:1228|(1:1230)(1:1764)|1231|(1:1233)(1:1763)|(1:1235)(1:1762)|1236)(1:1765)|1237|(4:1716|1717|(7:1730|(1:1732)(2:1756|(2:1758|(1:1760))(1:1761))|1733|(2:1735|(3:1739|(1:1741)(1:1743)|1742))(2:1753|(1:1755))|1744|(1:1752)(1:1748)|1749)(2:1721|(1:1729)(1:1725))|1726)(5:1241|(1:1243)(2:1247|(2:1249|(1:1251)(5:1252|(2:1254|(1:1256)(2:1257|(1:1259)(2:1260|(1:1262)(2:1263|(2:1265|(1:1267)(1:1268))))))(2:1270|(3:1274|(1:1280)(1:1278)|1279))|1269|1245|1246))(11:1281|(1:1283)(1:1715)|1284|(2:1298|(2:1300|(8:1302|(7:1304|(1:1306)(3:1708|(1:1710)(1:1712)|1711)|(1:1308)(6:1315|(4:1317|(4:1319|(2:1321|(2:1323|(1:1325)(2:1329|(1:1331)(1:1332))))|1333|(1:1335)(2:1336|(1:1338)(2:1339|(1:1341)(1:1342))))(1:1343)|1326|1327)(2:1344|(5:1355|(2:1363|(19:1382|1383|(1:1707)(1:1391)|1392|(4:1462|(2:1464|(4:(1:1467)|1469|(1:1471)|1473))|1475|(8:1483|(2:1485|(6:1487|(1:1501)|1493|1494|(2:1496|(1:1498))(1:1500)|1499)(2:1502|(4:1509|(2:1511|(2:1516|(1:1518)(2:1519|(1:1521)(1:1522))))|1523|(4:1525|(1:1527)(2:1551|(1:1553)(2:1554|(1:1556)(2:1557|(1:1559)(2:1560|(1:1562)(1:1563)))))|1528|(3:1543|(3:1545|(1:1547)(1:1549)|1548)|1550)(4:1532|(2:1534|(1:1536)(1:1537))|(1:1541)|1542))(2:1564|(3:1566|(2:1568|(1:1570)(1:1572))(2:1573|(1:1575)(1:1576))|1571)(2:1577|(4:1579|(4:1581|(1:1583)(1:1588)|1584|1585)(3:1589|(1:1591)(1:1593)|1592)|1586|1587)(5:1594|(5:1596|(2:1598|(3:1600|(1:1602)(1:1610)|1603))|1611|(0)(0)|1603)(2:1612|(1:1614)(2:1615|(2:1617|(1:1622)(1:1621))(2:1623|(2:1625|(1:1630)(1:1629))(2:1631|(1:1633)(2:1634|(1:1636)(2:1637|(1:1639)(2:1640|(3:1654|(4:1662|(1:1664)|1665|(2:1667|(3:1669|(1:1671)(1:1673)|1672)))(2:1658|(1:1660))|1661)(2:1644|(3:1646|(2:1648|(1:1650))(1:1652)|1651)(1:1653)))))))))|1604|1605|(2:1607|(1:1609))))))(1:1508)))|1674|(1:1676)|1677|(7:1679|(3:1702|(1:1704)|1705)(2:1683|(1:1685))|1686|(1:1688)(1:1701)|1689|(2:1691|(1:1693))|1694)(1:1706)|1695|(1:1700)(1:1699)))|1402|(1:1404)|1405|(2:1413|(11:1415|(1:1459)(1:1419)|1420|1421|1422|(1:1458)(5:1428|1429|1430|1431|1432)|1433|(2:1435|(1:1437))|1438|(4:1440|(1:1442)|1443|(1:1445)(1:1446))|1447))|1460|1421|1422|(2:1424|1454)|1458|1433|(0)|1438|(0)|1447)(8:1369|(3:1378|(1:1381)|1380)(1:1373)|1374|(1:1376)|1377|1310|1311|(2:1313|1246)(1:1314)))(1:1361)|1362|1311|(0)(0))(3:1348|(1:1354)(1:1352)|1353))|1328|1310|1311|(0)(0))|1309|1310|1311|(0)(0))|1713|(0)(0)|1309|1310|1311|(0)(0))))|1714|1713|(0)(0)|1309|1310|1311|(0)(0)))|1244|1245|1246)|996|(3:1012|(1:1016)|1017)|1018|(10:1210|(1:1212)(2:1213|(1:1215)(2:1216|(1:1218)))|1021|(4:1200|1201|(1:1209)(1:1207)|1208)(5:1025|(4:1027|(1:(1:1030)(2:1169|1032))(1:1170)|1031|1032)(9:1171|(1:1173)(2:1187|(3:1195|1196|(1:1198)(1:1199))(1:1194))|1174|(1:1176)(1:1186)|1177|(1:1179)(1:1185)|1180|(1:1182)(1:1184)|1183)|1033|(2:1038|(2:1040|(1:1042)(2:1129|(1:1131)(2:1132|(4:1134|(3:1136|(1:1138)(1:1142)|1139)(2:1143|(3:1145|(1:1157)(1:1149)|1150)(3:1158|(1:1166)(1:1164)|1165))|1140|1141)(1:1167)))))|1168)|1043|(2:1047|(1:1049)(2:1050|(4:1052|(1:1054)|1055|(4:1057|1058|(2:1061|(1:1063)(2:1064|(3:1066|(3:1068|(1:1070)|1071)(2:1078|(4:1080|(1:1082)|1083|(1:1085)(1:1086))(2:1087|(1:1095)(2:1091|(1:1093)(1:1094))))|(1:1077))(4:1096|(3:1098|(1:1100)(2:1101|(1:1103)(2:1104|(2:1118|(4:1120|(1:1122)|1123|(1:1125)(1:1126))(1:1127))(2:1108|(1:1110)(2:1111|(1:1113)(3:1114|(1:1116)|1117)))))|(2:1075|1077))|1073|(0))))|1060))))|1128|1058|(0)|1060)|1020|1021|(1:1023)|1200|1201|(1:1203)|1209|1208|1043|(3:1045|1047|(0)(0))|1128|1058|(0)|1060))|995|996|(10:998|1000|1002|1004|1006|1008|1010|1012|(2:1014|1016)|1017)|1018|(0)|1020|1021|(0)|1200|1201|(0)|1209|1208|1043|(0)|1128|1058|(0)|1060))|968|969|970|(0)(0)|995|996|(0)|1018|(0)|1020|1021|(0)|1200|1201|(0)|1209|1208|1043|(0)|1128|1058|(0)|1060)|1821|1822|1823|(2:1825|1827)|938|(2:940|942)|943|(0)(0)|956|(29:958|960|(0)|1768|(2:1770|1772)|1774|1776|1780|970|(0)(0)|995|996|(0)|1018|(0)|1020|1021|(0)|1200|1201|(0)|1209|1208|1043|(0)|1128|1058|(0)|1060)|1790|960|(0)|1768|(0)|1774|1776|1780|970|(0)(0)|995|996|(0)|1018|(0)|1020|1021|(0)|1200|1201|(0)|1209|1208|1043|(0)|1128|1058|(0)|1060))|937|938|(0)|943|(0)(0)|956|(0)|1790|960|(0)|1768|(0)|1774|1776|1780|970|(0)(0)|995|996|(0)|1018|(0)|1020|1021|(0)|1200|1201|(0)|1209|1208|1043|(0)|1128|1058|(0)|1060)|81|(4:83|(1:85)(1:870)|86|(1:88)(1:869))(1:871)|89|(3:91|(1:93)(1:867)|94)(1:868)|95|(1:97)(1:866)|98|(3:100|(1:102)|103)|104|(2:106|(1:108)(1:853))(2:854|(2:856|(2:858|(1:860)(1:861))(2:862|(1:864)(1:865))))|109|110|(2:823|(2:850|(1:852))(2:827|(2:829|(1:831))(2:832|(2:834|(1:836))(2:837|(4:839|(1:841)(1:845)|842|(1:844))))))(2:114|(1:116))|117|(1:119)|120|(2:122|(1:124))|(18:125|126|(1:128)|129|(1:131)|132|(3:134|(1:136)(1:812)|137)(2:813|(3:815|(1:817)(1:819)|818))|138|(1:140)(1:811)|141|(1:143)|144|(1:810)(1:150)|151|(1:153)(1:809)|154|(1:808)(1:158)|159)|160|(4:782|(1:784)(1:806)|785|(2:786|(5:788|(1:790)(1:804)|791|(2:802|803)(2:799|800)|801)(1:805)))(9:164|(1:166)(1:781)|167|168|(1:170)(1:780)|171|(1:173)(1:779)|174|(2:175|(5:177|(1:179)(1:193)|180|(2:191|192)(2:188|189)|190)(1:194)))|195|196|(1:198)(1:778)|199|(1:201)|202|(1:210)|211|(2:213|(1:215)(1:216))|217|(2:219|(1:221)(1:640))(1:(6:(4:677|(1:679)(1:774)|680|681)(1:775)|(6:683|(1:685)(1:772)|686|(3:688|(1:690)(1:766)|691)(3:767|(1:769)(1:771)|770)|692|693)(1:773)|694|(2:696|(4:698|(3:700|(1:702)(1:704)|703)|705|(3:707|(1:709)(1:711)|710))(5:712|(3:714|(1:716)(1:718)|717)|719|(3:721|(1:723)(1:725)|724)|726))|727|(2:729|(6:731|(1:733)|734|(3:736|(1:738)(1:740)|739)|741|(3:743|(1:745)(1:747)|746))(7:748|(1:750)|751|(3:753|(1:755)(1:757)|756)|758|(3:760|(1:762)(1:764)|763)|765)))(2:647|(1:675)(6:659|(1:674)(3:663|(1:665)(1:673)|666)|667|(1:669)(1:672)|670|671)))|(7:(1:224)|225|(1:227)|228|(1:241)(1:232)|233|(1:237))|242|(1:639)(1:246)|247|(3:253|(1:255)(1:257)|256)|258|(4:260|(1:584)(1:264)|265|(2:266|(1:268)(1:269)))(2:585|(8:613|614|(1:620)|621|622|(1:632)(1:626)|627|(2:628|(1:630)(1:631)))(3:589|590|(4:595|(1:605)(1:599)|600|(2:601|(1:603)(1:604)))(1:594)))|270|(1:272)|273|274|275|(1:277)(1:582)|278|279|280|281|(5:283|(3:285|(1:287)|288)|289|(1:291)|288)|(4:292|293|(4:547|548|(5:550|(2:552|(4:554|(2:556|(1:558))|559|(2:561|(2:563|(4:565|(1:569)|570|571)))))|572|570|571)|573)|295)|(2:545|546)(2:299|(1:537)(31:303|(3:514|515|(33:517|518|519|520|(20:522|308|309|310|(1:510)(1:314)|315|316|(5:501|(1:504)|505|(1:507)(1:509)|508)(3:320|(2:322|(1:326))|327)|328|329|330|331|332|333|334|(10:336|(8:340|(1:342)|343|(1:345)|346|(1:373)(2:350|(1:352)(2:358|(1:360)(2:361|(3:363|(1:365)(1:367)|366)(1:368))))|353|(2:355|(1:357)))|374|(3:378|(1:(2:380|(1:382)(2:383|384))(2:387|388))|(1:386))|389|(3:393|(1:(2:395|(1:397)(2:398|399))(2:402|403))|(1:401))|404|(2:410|(1:412))|413|(4:417|(1:419)|420|421))(10:439|(7:443|(1:445)|446|(4:448|(1:450)|451|(1:453))|454|(1:456)|457)|458|(4:462|(1:464)|465|466)|467|(4:471|(1:473)|474|475)|476|(4:480|(1:482)|483|484)|485|(1:489))|422|(3:(1:436)(1:431)|432|(1:434)(1:435))|437|438)|306|307|308|309|310|(1:312)|510|315|316|(1:318)|499|501|(1:504)|505|(0)(0)|508|328|329|330|331|332|333|334|(0)(0)|422|(6:424|426|(1:429)|436|432|(0)(0))|437|438))|305|306|307|308|309|310|(0)|510|315|316|(0)|499|501|(0)|505|(0)(0)|508|328|329|330|331|332|333|334|(0)(0)|422|(0)|437|438))|538|310|(0)|510|315|316|(0)|499|501|(0)|505|(0)(0)|508|328|329|330|331|332|333|334|(0)(0)|422|(0)|437|438) */
    /* JADX WARN: Code restructure failed: missing block: B:1072:0x1568, code lost:
    
        if (r2 == null) goto L1072;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1468:0x0aea, code lost:
    
        if (r11.id != r9) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1472:0x0af8, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r55.chat) != false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1474:0x0b00, code lost:
    
        if (org.telegram.ui.Components.Forum.ForumUtilities.isTopicCreateMessage(r55.message) == false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1767:0x064f, code lost:
    
        if (r2.post_messages == false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x2472, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x2473, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x2474, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x2476, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x2477, code lost:
    
        r11 = r5;
        r10 = org.telegram.tgnet.ConnectionsManager.DEFAULT_DATACENTER_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x247c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x247d, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x247e, code lost:
    
        r10 = org.telegram.tgnet.ConnectionsManager.DEFAULT_DATACENTER_ID;
     */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x1334  */
    /* JADX WARN: Removed duplicated region for block: B:1045:0x14cf  */
    /* JADX WARN: Removed duplicated region for block: B:1049:0x14e2  */
    /* JADX WARN: Removed duplicated region for block: B:1050:0x14eb  */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x1530  */
    /* JADX WARN: Removed duplicated region for block: B:1075:0x1691  */
    /* JADX WARN: Removed duplicated region for block: B:1203:0x149b  */
    /* JADX WARN: Removed duplicated region for block: B:1210:0x130d  */
    /* JADX WARN: Removed duplicated region for block: B:1224:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:1308:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:1313:0x1194  */
    /* JADX WARN: Removed duplicated region for block: B:1314:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:1315:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:1435:0x1122  */
    /* JADX WARN: Removed duplicated region for block: B:1440:0x1133  */
    /* JADX WARN: Removed duplicated region for block: B:1602:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:1610:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:1770:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:1798:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:1861:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x23bc A[Catch: Exception -> 0x239d, TRY_ENTER, TryCatch #0 {Exception -> 0x239d, blocks: (B:520:0x2378, B:522:0x2381, B:312:0x23bc, B:314:0x23c0, B:318:0x23cc, B:322:0x2411, B:324:0x2423, B:326:0x2429, B:501:0x23d6, B:504:0x23dc, B:505:0x23e3, B:508:0x23f5), top: B:519:0x2378 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x23cc A[Catch: Exception -> 0x239d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x239d, blocks: (B:520:0x2378, B:522:0x2381, B:312:0x23bc, B:314:0x23c0, B:318:0x23cc, B:322:0x2411, B:324:0x2423, B:326:0x2429, B:501:0x23d6, B:504:0x23dc, B:505:0x23e3, B:508:0x23f5), top: B:519:0x2378 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x249f  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x274d  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x278a  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x2792  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x2664  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x23da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x23f0  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x23f3  */
    /* JADX WARN: Removed duplicated region for block: B:940:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:962:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:998:0x128e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildLayout() {
        CharSequence charSequence;
        String str;
        CharSequence charSequence2;
        int i;
        boolean z;
        String str2;
        CharSequence charSequence3;
        boolean z2;
        long j;
        boolean z3;
        int i2;
        boolean z4;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.InputReplyTo inputReplyTo;
        boolean z5;
        TLRPC.DraftMessage draftMessage3;
        String str3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        boolean z6;
        int i3;
        CharSequence charSequence6;
        CharSequence string;
        String str4;
        boolean z7;
        ArrayList<TLRPC.MessageEntity> arrayList;
        CharSequence charSequence7;
        int i4;
        CharSequence charSequence8;
        boolean z8;
        CharSequence charSequence9;
        TLRPC.Chat chat;
        boolean z9;
        CharSequence charSequence10;
        boolean z10;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence replaceNewLines;
        CharSequence charSequence13;
        char c;
        String str5;
        CharSequence charSequence14;
        boolean isChannelAndNotMegaGroup;
        CharSequence formatPluralString;
        char c2;
        int i5;
        String formatPluralString2;
        String str6;
        CharSequence charSequence15;
        MessageObject messageObject;
        CharSequence charSequence16;
        int i6;
        Object foregroundColorSpanThemable;
        TLRPC.User user;
        MessageObject messageObject2;
        TLRPC.User user2;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence charSequence19;
        CharSequence charSequence20;
        CharSequence charSequence21;
        CharSequence charSequence22;
        CharSequence charSequence23;
        CharSequence charSequence24;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence string2;
        CharSequence charSequence25;
        CharSequence charSequence26;
        String stringForMessageListDate;
        MessageObject messageObject3;
        boolean z11;
        String str7;
        String str8;
        MessagesController messagesController;
        CharSequence charSequence27;
        CharSequence charSequence28;
        String str9;
        CharSequence charSequence29;
        String str10;
        int i7;
        CharSequence charSequence30;
        CharSequence charSequence31;
        CharSequence charSequence32;
        int i8;
        boolean z12;
        boolean z13;
        boolean z14;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i9;
        int i10;
        TLRPC.Chat chat2;
        MessageObject messageObject5;
        CharSequence charSequence33;
        CharSequence charSequence34;
        int i11;
        float f;
        int i12;
        int dp;
        int measuredWidth;
        int dp2;
        int dp3;
        DialogCellTags dialogCellTags;
        int dp4;
        CharSequence highlightText;
        int i13;
        int i14;
        int i15;
        StaticLayout staticLayout;
        int i16;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i17;
        int lineCount4;
        int lineCount5;
        int i18;
        int lineCount6;
        int i19;
        CharSequence charSequence35;
        Layout.Alignment alignment;
        CharSequence ellipsize;
        CharSequence replaceTwoNewLinesToOne;
        CharSequence highlightText2;
        DialogCellTags dialogCellTags2;
        int dp5;
        int dp6;
        DialogCellTags dialogCellTags3;
        CharSequence highlightText3;
        CharSequence charSequence36;
        CharSequence charSequence37;
        boolean z15;
        boolean z16;
        String str11;
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
            charSequence = " ";
            str = "**reaction**";
            charSequence2 = null;
        } else {
            str = "**reaction**";
            charSequence = " ";
            charSequence2 = MessagesController.getInstance(this.currentAccount).getPrintingString(this.currentDialogId, getTopicId(), true);
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
        MessageObject messageObject6 = this.message;
        if (messageObject6 != null) {
            messageObject6.updateTranslation();
        }
        MessageObject messageObject7 = this.message;
        CharSequence charSequence38 = messageObject7 != null ? messageObject7.messageText : null;
        if (charSequence38 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence38);
            for (URLSpanNoUnderlineBold uRLSpanNoUnderlineBold : (URLSpanNoUnderlineBold[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderlineBold.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderlineBold);
            }
            for (URLSpanNoUnderline uRLSpanNoUnderline : (URLSpanNoUnderline[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderline.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderline);
            }
            charSequence38 = spannableStringBuilder;
        }
        this.lastMessageString = charSequence38;
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
                charSequence37 = LocaleController.getString(R.string.FromYou);
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
                        formatInternal = formatInternal(i, str12, charSequence37);
                    } else {
                        formatInternal = formatInternal(i, str12.replace('\n', ' '), charSequence37);
                    }
                }
                charSequence36 = Emoji.replaceEmoji(formatInternal, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                z15 = false;
            } else {
                charSequence36 = customDialog2.message;
                if (customDialog2.isMedia) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                }
                charSequence37 = null;
                z15 = true;
            }
            String stringForMessageListDate2 = LocaleController.stringForMessageListDate(this.customDialog.date);
            int i21 = this.customDialog.unread_count;
            if (i21 != 0) {
                this.drawCount = true;
                z16 = false;
                str11 = String.format("%d", Integer.valueOf(i21));
            } else {
                z16 = false;
                this.drawCount = false;
                str11 = null;
            }
            CustomDialog customDialog4 = this.customDialog;
            int i22 = customDialog4.sent;
            if (i22 == 0) {
                this.drawClock = true;
                this.drawCheck1 = z16;
                this.drawCheck2 = z16;
            } else if (i22 == 2) {
                this.drawCheck1 = true;
                this.drawCheck2 = true;
                this.drawClock = z16;
            } else if (i22 == 1) {
                this.drawCheck1 = z16;
                this.drawCheck2 = true;
                this.drawClock = z16;
            } else {
                this.drawClock = z16;
                this.drawCheck1 = z16;
                this.drawCheck2 = z16;
            }
            this.drawError = z16;
            z8 = z15;
            str9 = stringForMessageListDate2;
            charSequence33 = "";
            i7 = -1;
            charSequence29 = null;
            charSequence32 = charSequence36;
            charSequence30 = charSequence37;
            charSequence31 = customDialog4.name;
            str7 = str11;
            str10 = null;
        } else {
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
            int i23 = i;
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
            } else if (this.currentDialogFolderId == 0) {
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
                    } else {
                        if (DialogObject.getEmojiStatusDocumentId(chat4.emoji_status) != 0) {
                            this.drawPremium = true;
                            this.nameLayoutEllipsizeByGradient = true;
                            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
                            swapAnimatedEmojiDrawable.center = LocaleController.isRTL;
                            str2 = str;
                            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), false);
                            this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), false);
                        } else {
                            str2 = str;
                            boolean z18 = this.forbidVerified;
                            this.drawVerified = !z18 && this.chat.verified;
                            this.drawBotVerified = (z18 || this.chat.bot_verification_icon == 0) ? false : true;
                        }
                        charSequence3 = charSequence38;
                    }
                    str2 = str;
                    charSequence3 = charSequence38;
                } else {
                    str2 = str;
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
                            boolean z19 = this.forbidVerified;
                            this.drawVerified = !z19 && user4.verified;
                            this.drawBotVerified = (z19 || UserObject.isUserSelf(user4) || this.user.bot_verification_icon == 0) ? false : true;
                        }
                        if (MessagesController.getInstance(this.currentAccount).isPremiumUser(this.user)) {
                            long j2 = UserConfig.getInstance(this.currentAccount).clientUserId;
                            charSequence3 = charSequence38;
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
                                        long longValue = emojiStatusDocumentId.longValue();
                                        z2 = false;
                                        swapAnimatedEmojiDrawable2.set(longValue, false);
                                        this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), false);
                                    } else {
                                        z2 = false;
                                        this.nameLayoutEllipsizeByGradient = true;
                                        swapAnimatedEmojiDrawable2.set(PremiumGradient.getInstance().premiumStarDrawableMini, false);
                                        this.emojiStatus.setParticles(false, false);
                                    }
                                }
                            }
                        } else {
                            charSequence3 = charSequence38;
                        }
                        z3 = false;
                        this.drawPremium = z3;
                        if (z3) {
                        }
                    } else {
                        charSequence3 = charSequence38;
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
                        boolean z20 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                        this.draftVoice = z20;
                        TLRPC.DraftMessage draft = !z20 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, getTopicId()) : null;
                        this.draftMessage = draft;
                        if (draft != null && TextUtils.isEmpty(draft.message)) {
                            this.draftMessage = null;
                        }
                    } else if (this.isDialogCell || this.isSavedDialogCell) {
                        boolean z21 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                        this.draftVoice = z21;
                        this.draftMessage = !z21 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, 0L) : null;
                    } else {
                        this.draftVoice = false;
                        this.draftMessage = null;
                    }
                    z4 = this.draftVoice;
                    if ((!z4 && this.draftMessage == null) || ((z4 || (draftMessage2 = this.draftMessage) == null || !TextUtils.isEmpty(draftMessage2.message) || ((inputReplyTo = this.draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0)) && ((draftMessage = this.draftMessage) == null || i2 <= draftMessage.date || this.unreadCount == 0))) {
                        if (ChatObject.isChannel(this.chat)) {
                            TLRPC.Chat chat5 = this.chat;
                            if (!chat5.megagroup) {
                                if (!chat5.creator) {
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = chat5.admin_rights;
                                    if (tL_chatAdminRights != null) {
                                    }
                                }
                            }
                        }
                        chat2 = this.chat;
                        if ((chat2 != null || (!chat2.left && !chat2.kicked)) && !this.forbidDraft && (!ChatObject.isForum(chat2) || this.isTopic)) {
                            draftMessage3 = null;
                            z5 = false;
                            if (isForumCell()) {
                                this.draftMessage = draftMessage3;
                                this.draftVoice = z5;
                                this.needEmoji = true;
                                updateMessageThumbs();
                                string = ChatObject.isMonoForum(this.chat) ? null : AndroidUtilities.escape(getMessageNameString());
                                if (ChatObject.isMonoForum(this.chat)) {
                                    if (i23 == 1) {
                                        i10 = 3;
                                        i9 = 2;
                                    } else {
                                        i9 = i23;
                                        i10 = 3;
                                    }
                                    string = null;
                                    if (i9 == i10) {
                                        i9 = 4;
                                    }
                                } else {
                                    i9 = i23;
                                }
                                charSequence9 = formatTopicsNames();
                                MessageObject messageObject8 = this.message;
                                String messageStringFormatted = this.message != null ? getMessageStringFormatted(i9, messageObject8 != null ? MessagesController.getInstance(messageObject8.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason) : null, string, true) : "";
                                CharSequence charSequence39 = messageStringFormatted;
                                if (this.applyName) {
                                    int length = messageStringFormatted.length();
                                    charSequence39 = messageStringFormatted;
                                    charSequence39 = messageStringFormatted;
                                    if (length >= 0 && string != null) {
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(messageStringFormatted);
                                        valueOf.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_name, this.resourcesProvider), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                        charSequence39 = valueOf;
                                    }
                                }
                                this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                charSequence8 = charSequence39;
                                str3 = "%d";
                                charSequence6 = charSequence;
                                charSequence25 = "";
                            } else if (!TextUtils.isEmpty(this.customMessage)) {
                                this.draftMessage = null;
                                this.draftVoice = false;
                                charSequence9 = this.customMessage;
                                this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                str3 = "%d";
                                charSequence6 = charSequence;
                                charSequence25 = "";
                                string = null;
                                charSequence8 = null;
                            } else {
                                if (charSequence2 != null) {
                                    this.lastPrintString = charSequence2;
                                    str3 = "%d";
                                    int intValue = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.currentDialogId, getTopicId()).intValue();
                                    this.printingStringType = intValue;
                                    StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(intValue);
                                    int intrinsicWidth = chatStatusDrawable != null ? chatStatusDrawable.getIntrinsicWidth() + AndroidUtilities.dp(3.0f) : 0;
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    CharSequence replace = TextUtils.replace(charSequence2, new String[]{"..."}, new String[]{""});
                                    int indexOf = this.printingStringType == 5 ? replace.toString().indexOf("**oo**") : -1;
                                    if (indexOf >= 0) {
                                        spannableStringBuilder2.append(replace).setSpan(new FixedWidthSpan(Theme.getChatStatusDrawable(this.printingStringType).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                        charSequence4 = charSequence;
                                    } else {
                                        charSequence4 = charSequence;
                                        spannableStringBuilder2.append(charSequence4).append(replace).setSpan(new FixedWidthSpan(intrinsicWidth), 0, 1, 0);
                                    }
                                    i3 = indexOf;
                                    z6 = false;
                                    charSequence5 = spannableStringBuilder2;
                                } else {
                                    str3 = "%d";
                                    charSequence4 = charSequence;
                                    this.lastPrintString = null;
                                    this.printingStringType = -1;
                                    charSequence5 = "";
                                    z6 = true;
                                    i3 = -1;
                                }
                                if (this.draftVoice || this.draftMessage != null) {
                                    boolean z22 = z17;
                                    charSequence6 = charSequence4;
                                    string = LocaleController.getString(R.string.Draft);
                                    TLRPC.DraftMessage draftMessage4 = this.draftMessage;
                                    if (draftMessage4 != null && TextUtils.isEmpty(draftMessage4.message)) {
                                        if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                            i4 = i3;
                                            charSequence9 = "";
                                            z17 = z22;
                                            charSequence8 = null;
                                            z8 = false;
                                            charSequence26 = charSequence5;
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                            valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string.length(), 33);
                                            charSequence7 = valueOf2;
                                        }
                                    } else {
                                        if (this.draftVoice) {
                                            str4 = LocaleController.getString(R.string.AttachAudio);
                                        } else {
                                            TLRPC.DraftMessage draftMessage5 = this.draftMessage;
                                            if (draftMessage5 != null) {
                                                str4 = draftMessage5.message;
                                                if (str4.length() > 150) {
                                                    str4 = str4.substring(0, 150);
                                                }
                                            } else {
                                                str4 = "";
                                            }
                                        }
                                        SpannableString spannableString = new SpannableString(str4);
                                        TLRPC.DraftMessage draftMessage6 = this.draftMessage;
                                        if (draftMessage6 != null) {
                                            MediaDataController.addTextStyleRuns(draftMessage6, spannableString, NotificationCenter.needShareTheme);
                                            TLRPC.DraftMessage draftMessage7 = this.draftMessage;
                                            if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                TextPaint textPaint2 = this.currentMessagePaint;
                                                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint2 == null ? null : textPaint2.getFontMetricsInt());
                                            }
                                        } else if (this.draftVoice) {
                                            spannableString.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, this.resourcesProvider), 0, spannableString.length(), 33);
                                        }
                                        SpannableStringBuilder formatInternal2 = formatInternal(i23, AndroidUtilities.replaceNewLines(spannableString), string);
                                        if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                            z7 = false;
                                        } else {
                                            z7 = false;
                                            formatInternal2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string.length() + 1, 33);
                                        }
                                        charSequence7 = Emoji.replaceEmoji(formatInternal2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), z7);
                                    }
                                    i4 = i3;
                                    charSequence8 = null;
                                    z8 = false;
                                    charSequence9 = charSequence7;
                                    z17 = z22;
                                    charSequence26 = charSequence5;
                                } else {
                                    if (this.clearingDialog) {
                                        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                        string2 = LocaleController.getString(R.string.HistoryCleared);
                                    } else {
                                        MessageObject messageObject9 = this.message;
                                        if (messageObject9 == null) {
                                            if (this.currentDialogFolderId != 0) {
                                                string2 = formatArchivedDialogNames();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.encryptedChat;
                                                if (encryptedChat != null) {
                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        string2 = LocaleController.getString(R.string.EncryptionProcessing);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        string2 = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(this.user));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        string2 = LocaleController.getString(R.string.EncryptionRejected);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        if (encryptedChat.admin_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                            string2 = LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(this.user));
                                                        } else {
                                                            string2 = LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                        }
                                                    }
                                                } else if (this.dialogsType == 3 && UserObject.isUserSelf(this.user)) {
                                                    DialogsActivity dialogsActivity = this.parentFragment;
                                                    z8 = z6;
                                                    i4 = i3;
                                                    charSequence6 = charSequence4;
                                                    string = null;
                                                    charSequence8 = null;
                                                    z = false;
                                                    charSequence9 = LocaleController.getString((dialogsActivity == null || !dialogsActivity.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                    z17 = false;
                                                    charSequence26 = charSequence5;
                                                }
                                                z8 = z6;
                                                i4 = i3;
                                                charSequence6 = charSequence4;
                                                charSequence9 = "";
                                                string = null;
                                                charSequence8 = null;
                                                charSequence26 = charSequence5;
                                            }
                                        } else {
                                            String restrictionReason = MessagesController.getInstance(messageObject9.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
                                            CharSequence charSequence40 = charSequence4;
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
                                                    long j4 = messagePeerReaction.peer_id.user_id;
                                                    if (j4 != 0) {
                                                        z8 = z6;
                                                        z9 = z17;
                                                        if (j4 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                            ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(messagePeerReaction.reaction);
                                                            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                            String str13 = fromTL.emojicon;
                                                            if (str13 != null) {
                                                                z10 = true;
                                                                charSequence10 = LocaleController.formatString(R.string.ReactionInDialog, str13);
                                                            } else {
                                                                String formatString = LocaleController.formatString(R.string.ReactionInDialog, str2);
                                                                String str14 = str2;
                                                                int indexOf2 = formatString.indexOf(str14);
                                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(formatString.replace(str14, "d"));
                                                                long j5 = fromTL.documentId;
                                                                TextPaint textPaint3 = this.currentMessagePaint;
                                                                spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(j5, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                                charSequence10 = spannableStringBuilder3;
                                                                z10 = true;
                                                            }
                                                            if (z10) {
                                                                charSequence6 = charSequence40;
                                                                charSequence12 = charSequence10;
                                                            } else {
                                                                int i24 = this.dialogsType;
                                                                if (i24 == 2) {
                                                                    TLRPC.Chat chat6 = this.chat;
                                                                    if (chat6 != null) {
                                                                        if (ChatObject.isChannel(chat6)) {
                                                                            TLRPC.Chat chat7 = this.chat;
                                                                            if (!chat7.megagroup) {
                                                                                int i25 = chat7.participants_count;
                                                                                if (i25 != 0) {
                                                                                    charSequence21 = LocaleController.formatPluralStringComma("Subscribers", i25);
                                                                                } else if (!ChatObject.isPublic(chat7)) {
                                                                                    charSequence21 = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                                                                } else {
                                                                                    charSequence21 = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                                }
                                                                            }
                                                                        }
                                                                        TLRPC.Chat chat8 = this.chat;
                                                                        int i26 = chat8.participants_count;
                                                                        if (i26 != 0) {
                                                                            charSequence21 = LocaleController.formatPluralStringComma("Members", i26);
                                                                        } else if (chat8.has_geo) {
                                                                            charSequence21 = LocaleController.getString(R.string.MegaLocation);
                                                                        } else if (!ChatObject.isPublic(chat8)) {
                                                                            charSequence21 = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                                                        } else {
                                                                            charSequence21 = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                        }
                                                                    } else {
                                                                        charSequence21 = "";
                                                                    }
                                                                    this.drawCount2 = false;
                                                                    charSequence20 = charSequence21;
                                                                } else if (i24 == 3 && UserObject.isUserSelf(this.user)) {
                                                                    DialogsActivity dialogsActivity2 = this.parentFragment;
                                                                    charSequence20 = LocaleController.getString((dialogsActivity2 == null || !dialogsActivity2.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                } else {
                                                                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout && this.currentDialogFolderId != 0) {
                                                                        charSequence6 = charSequence40;
                                                                        z17 = z9;
                                                                        charSequence18 = null;
                                                                        charSequence19 = formatArchivedDialogNames();
                                                                    } else {
                                                                        MessageObject messageObject10 = this.message;
                                                                        if ((messageObject10.messageOwner instanceof TLRPC.TL_messageService) && (!MessageObject.isTopicActionMessage(messageObject10) || (this.message.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                            if (ChatObject.isChannelAndNotMegaGroup(this.chat) && (this.message.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                charSequence17 = "";
                                                                                z17 = false;
                                                                            } else {
                                                                                CharSequence charSequence41 = this.message.messageTextShort;
                                                                                CharSequence charSequence42 = charSequence41;
                                                                                if (charSequence41 == null) {
                                                                                    charSequence42 = charSequence3;
                                                                                }
                                                                                z17 = z9;
                                                                                charSequence17 = charSequence42;
                                                                            }
                                                                            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                            CharSequence charSequence43 = charSequence17;
                                                                            if (this.message.type == 21) {
                                                                                updateMessageThumbs();
                                                                                charSequence43 = applyThumbs(charSequence17);
                                                                            }
                                                                            charSequence6 = charSequence40;
                                                                            charSequence24 = charSequence43;
                                                                            charSequence22 = null;
                                                                            charSequence23 = charSequence24;
                                                                            if (this.currentDialogFolderId != 0) {
                                                                                i4 = i3;
                                                                                charSequence9 = charSequence23;
                                                                                string = formatArchivedDialogNames();
                                                                                charSequence8 = null;
                                                                                charSequence26 = charSequence5;
                                                                            } else {
                                                                                i4 = i3;
                                                                                charSequence8 = null;
                                                                                charSequence9 = charSequence23;
                                                                                string = charSequence22;
                                                                                charSequence26 = charSequence5;
                                                                            }
                                                                        } else {
                                                                            this.needEmoji = true;
                                                                            updateMessageThumbs();
                                                                            String escape = (this.isSavedDialog || (user2 = this.user) == null || !user2.self || this.message.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                            if ((!this.isSavedDialog || (user = this.user) == null || user.self || (messageObject2 = this.message) == null || !messageObject2.isOutOwner()) && escape == null) {
                                                                                TLRPC.Chat chat9 = this.chat;
                                                                                if (chat9 != null) {
                                                                                    long j6 = chat9.id;
                                                                                    if (j6 > 0) {
                                                                                        if (chat != null) {
                                                                                        }
                                                                                        if (ChatObject.isChannel(chat9)) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                TLRPC.User user5 = this.user;
                                                                                if (user5 == null || user5.id != UserObject.VERIFY || (messageObject = this.message) == null || messageObject.getForwardedFromId() == null) {
                                                                                    boolean isEmpty = TextUtils.isEmpty(restrictionReason);
                                                                                    CharSequence charSequence44 = restrictionReason;
                                                                                    if (isEmpty) {
                                                                                        if (MessageObject.isTopicActionMessage(this.message)) {
                                                                                            MessageObject messageObject11 = this.message;
                                                                                            CharSequence charSequence45 = messageObject11.messageTextShort;
                                                                                            if (charSequence45 == null || ((messageObject11.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.isTopic)) {
                                                                                                charSequence45 = messageObject11.messageText;
                                                                                            }
                                                                                            CharSequence charSequence46 = charSequence45;
                                                                                            if (messageObject11.topicIconDrawable[0] instanceof ForumBubbleDrawable) {
                                                                                                charSequence15 = charSequence46;
                                                                                                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-this.message.getDialogId(), MessageObject.getTopicId(this.currentAccount, this.message.messageOwner, true));
                                                                                                if (findTopic != null) {
                                                                                                    ((ForumBubbleDrawable) this.message.topicIconDrawable[0]).setColor(findTopic.icon_color);
                                                                                                }
                                                                                            } else {
                                                                                                charSequence15 = charSequence46;
                                                                                            }
                                                                                            charSequence44 = charSequence15;
                                                                                        } else {
                                                                                            TLRPC.MessageMedia messageMedia = this.message.messageOwner.media;
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
                                                                                                if (getCaptionMessage() != null) {
                                                                                                    MessageObject captionMessage = getCaptionMessage();
                                                                                                    if (!this.needEmoji) {
                                                                                                        str6 = "";
                                                                                                    } else if (captionMessage.isVideo()) {
                                                                                                        str6 = "📹 ";
                                                                                                    } else if (captionMessage.isVoice()) {
                                                                                                        str6 = "🎤 ";
                                                                                                    } else if (captionMessage.isMusic()) {
                                                                                                        str6 = "🎧 ";
                                                                                                    } else if (captionMessage.isPhoto()) {
                                                                                                        str6 = "🖼 ";
                                                                                                    } else {
                                                                                                        str6 = "📎 ";
                                                                                                    }
                                                                                                    if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                                                                                                        CharSequence charSequence47 = captionMessage.messageTrimmedToHighlight;
                                                                                                        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 47);
                                                                                                        if (this.hasNameInMessage) {
                                                                                                            if (!TextUtils.isEmpty(null)) {
                                                                                                                throw null;
                                                                                                            }
                                                                                                            measuredWidth2 = (int) (measuredWidth2 - this.currentMessagePaint.measureText(": "));
                                                                                                        }
                                                                                                        if (measuredWidth2 > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                            charSequence47 = AndroidUtilities.ellipsizeCenterEnd(charSequence47, captionMessage.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                                                                                                        }
                                                                                                        charSequence44 = new SpannableStringBuilder(str6).append(charSequence47);
                                                                                                    } else {
                                                                                                        SpannableString spannableString2 = new SpannableString(captionMessage.caption);
                                                                                                        if (captionMessage.messageOwner != null) {
                                                                                                            captionMessage.spoilLoginCode();
                                                                                                            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString2, NotificationCenter.needShareTheme);
                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList3 = captionMessage.messageOwner.entities;
                                                                                                            TextPaint textPaint4 = this.currentMessagePaint;
                                                                                                            MediaDataController.addAnimatedEmojiSpans(arrayList3, spannableString2, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                        }
                                                                                                        charSequence44 = new SpannableStringBuilder(str6).append((CharSequence) spannableString2);
                                                                                                    }
                                                                                                } else {
                                                                                                    MessageObject messageObject12 = this.message;
                                                                                                    TLRPC.Message message2 = messageObject12.messageOwner;
                                                                                                    TLRPC.MessageMedia messageMedia2 = message2.media;
                                                                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                        int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                        if (this.hasVideoThumb) {
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
                                                                                                        int i27 = R.string.AttachPaidMedia;
                                                                                                        Object[] objArr = new Object[i5];
                                                                                                        objArr[c2] = formatPluralString2;
                                                                                                        CharSequence replaceStars = StarsIntroActivity.replaceStars(LocaleController.formatString(i27, objArr));
                                                                                                        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                        charSequence44 = replaceStars;
                                                                                                    } else if (this.thumbsCount > 1) {
                                                                                                        if (this.hasVideoThumb) {
                                                                                                            ArrayList arrayList4 = this.groupMessages;
                                                                                                            formatPluralString = LocaleController.formatPluralString("Media", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                        } else {
                                                                                                            ArrayList arrayList5 = this.groupMessages;
                                                                                                            formatPluralString = LocaleController.formatPluralString("Photos", arrayList5 == null ? 0 : arrayList5.size(), new Object[0]);
                                                                                                        }
                                                                                                        charSequence44 = formatPluralString;
                                                                                                        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                    } else {
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                            TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                                                                                                            if (messageFwdHeader != null) {
                                                                                                                TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                    isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, this.currentAccount);
                                                                                                                    charSequence14 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                }
                                                                                                            }
                                                                                                            isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.chat);
                                                                                                            charSequence14 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                            charSequence14 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                            TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                            if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                charSequence14 = "📊 " + tL_messageMediaPoll.poll.question.text;
                                                                                                            } else {
                                                                                                                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                MediaDataController.addTextStyleRuns(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString3);
                                                                                                                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                                charSequence14 = new SpannableStringBuilder("📊 ").append((CharSequence) spannableString3);
                                                                                                            }
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                            TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                            if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                charSequence14 = "✅ " + tL_messageMediaToDo.todo.title.text;
                                                                                                            } else {
                                                                                                                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                MediaDataController.addTextStyleRuns(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString4);
                                                                                                                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                                charSequence14 = new SpannableStringBuilder("✅ ").append((CharSequence) spannableString4);
                                                                                                            }
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                            charSequence14 = "🎮 " + this.message.messageOwner.media.game.title;
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                            charSequence14 = messageMedia2.title;
                                                                                                        } else if (messageObject12.type == 14) {
                                                                                                            charSequence14 = String.format("🎧 %s - %s", messageObject12.getMusicAuthor(), this.message.getMusicTitle());
                                                                                                        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaStory) && messageMedia2.via_mention) {
                                                                                                            if (messageObject12.isOut()) {
                                                                                                                TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.message.getDialogId()));
                                                                                                                if (user6 != null) {
                                                                                                                    str5 = UserObject.getFirstName(user6);
                                                                                                                    int indexOf3 = str5.indexOf(32);
                                                                                                                    c = 0;
                                                                                                                    if (indexOf3 >= 0) {
                                                                                                                        str5 = str5.substring(0, indexOf3);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    c = 0;
                                                                                                                    str5 = "";
                                                                                                                }
                                                                                                                int i28 = R.string.StoryYouMentionInDialog;
                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                objArr2[c] = str5;
                                                                                                                charSequence14 = LocaleController.formatString(i28, objArr2);
                                                                                                            } else {
                                                                                                                charSequence14 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (messageObject12.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                                                CharSequence charSequence48 = this.message.messageTrimmedToHighlight;
                                                                                                                int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 23);
                                                                                                                MessageObject messageObject13 = this.message;
                                                                                                                charSequence13 = charSequence48;
                                                                                                                if (messageObject13.messageTrimmedToHighlightCut) {
                                                                                                                    charSequence13 = AndroidUtilities.ellipsizeCenterEnd(charSequence48, messageObject13.highlightedWords.get(0), measuredWidth3, this.currentMessagePaint, NotificationCenter.dialogTranslate);
                                                                                                                }
                                                                                                            } else {
                                                                                                                SpannableString spannableString5 = new SpannableString(charSequence3);
                                                                                                                MessageObject messageObject14 = this.message;
                                                                                                                if (messageObject14 != null) {
                                                                                                                    messageObject14.spoilLoginCode();
                                                                                                                }
                                                                                                                MediaDataController.addTextStyleRuns(this.message, spannableString5, NotificationCenter.needShareTheme);
                                                                                                                MessageObject messageObject15 = this.message;
                                                                                                                charSequence13 = spannableString5;
                                                                                                                if (messageObject15 != null) {
                                                                                                                    TLRPC.Message message3 = messageObject15.messageOwner;
                                                                                                                    charSequence13 = spannableString5;
                                                                                                                    if (message3 != null) {
                                                                                                                        ArrayList<TLRPC.MessageEntity> arrayList6 = message3.entities;
                                                                                                                        TextPaint textPaint5 = this.currentMessagePaint;
                                                                                                                        MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                                        charSequence13 = spannableString5;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            AndroidUtilities.highlightText(charSequence13, this.message.highlightedWords, this.resourcesProvider);
                                                                                                            charSequence14 = charSequence13;
                                                                                                        }
                                                                                                        CharSequence charSequence49 = charSequence14;
                                                                                                        MessageObject messageObject16 = this.message;
                                                                                                        charSequence44 = charSequence49;
                                                                                                        if (messageObject16.messageOwner.media != null) {
                                                                                                            charSequence44 = charSequence49;
                                                                                                            if (!messageObject16.isMediaEmpty()) {
                                                                                                                this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                                charSequence44 = charSequence49;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    CharSequence charSequence50 = charSequence44;
                                                                                    if (this.message.isReplyToStory()) {
                                                                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence44);
                                                                                        spannableStringBuilder4.insert(0, (CharSequence) "d ");
                                                                                        spannableStringBuilder4.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                        charSequence50 = spannableStringBuilder4;
                                                                                    }
                                                                                    if (this.thumbsCount > 0) {
                                                                                        if (this.message.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                            replaceNewLines = this.message.messageTrimmedToHighlight;
                                                                                            int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(((this.messagePaddingStart + 23) + ((this.thumbSize + 2) * this.thumbsCount)) + 3);
                                                                                            MessageObject messageObject17 = this.message;
                                                                                            if (messageObject17.messageTrimmedToHighlightCut) {
                                                                                                replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject17.highlightedWords.get(0), measuredWidth4, this.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                                                                                            }
                                                                                        } else {
                                                                                            int length2 = charSequence50.length();
                                                                                            CharSequence charSequence51 = charSequence50;
                                                                                            if (length2 > 150) {
                                                                                                charSequence51 = charSequence50.subSequence(0, 150);
                                                                                            }
                                                                                            replaceNewLines = AndroidUtilities.replaceNewLines(charSequence51);
                                                                                        }
                                                                                        CharSequence spannableStringBuilder5 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                        SpannableStringBuilder spannableStringBuilder6 = (SpannableStringBuilder) spannableStringBuilder5;
                                                                                        charSequence6 = charSequence40;
                                                                                        spannableStringBuilder6.insert(0, charSequence6);
                                                                                        spannableStringBuilder6.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 3)), 0, 1, 33);
                                                                                        Emoji.replaceEmoji(spannableStringBuilder6, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                        CharSequence charSequence52 = spannableStringBuilder5;
                                                                                        if (this.message.hasHighlightedWords()) {
                                                                                            CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder6, this.message.highlightedWords, this.resourcesProvider);
                                                                                            charSequence52 = spannableStringBuilder5;
                                                                                            if (highlightText4 != null) {
                                                                                                charSequence52 = highlightText4;
                                                                                            }
                                                                                        }
                                                                                        z8 = false;
                                                                                        charSequence11 = charSequence52;
                                                                                    } else {
                                                                                        charSequence6 = charSequence40;
                                                                                        charSequence11 = charSequence50;
                                                                                    }
                                                                                    if (this.message.isForwarded() && this.message.needDrawForwarded()) {
                                                                                        this.drawForwardIcon = true;
                                                                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence11);
                                                                                        spannableStringBuilder7.insert(0, (CharSequence) "d ");
                                                                                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                        coloredImageSpan.setAlpha(0.9f);
                                                                                        spannableStringBuilder7.setSpan(coloredImageSpan, 0, 1, 0);
                                                                                        charSequence12 = spannableStringBuilder7;
                                                                                    } else {
                                                                                        charSequence12 = charSequence11;
                                                                                    }
                                                                                }
                                                                            }
                                                                            charSequence6 = charSequence40;
                                                                            if (escape == null) {
                                                                                escape = getMessageNameString();
                                                                            }
                                                                            CharSequence escape2 = AndroidUtilities.escape(escape);
                                                                            TLRPC.Chat chat10 = this.chat;
                                                                            if (chat10 != null && chat10.forum && !this.isTopic && !this.useFromUserAsAvatar) {
                                                                                CharSequence topicIconName = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint);
                                                                                if (!TextUtils.isEmpty(topicIconName)) {
                                                                                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("-");
                                                                                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                    coloredImageSpan2.setColorKey((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? -1 : Theme.key_chats_nameMessage);
                                                                                    spannableStringBuilder8.setSpan(coloredImageSpan2, 0, 1, 0);
                                                                                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                                                                                    spannableStringBuilder9.append(escape2).append((CharSequence) spannableStringBuilder8).append(topicIconName);
                                                                                    charSequence16 = spannableStringBuilder9;
                                                                                    SpannableStringBuilder messageStringFormatted2 = getMessageStringFormatted(i23, restrictionReason, charSequence16, false);
                                                                                    if (!this.useFromUserAsAvatar || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && (this.currentDialogFolderId == 0 || messageStringFormatted2.length() <= 0))) {
                                                                                        i6 = 0;
                                                                                    } else {
                                                                                        try {
                                                                                            foregroundColorSpanThemable = new ForegroundColorSpanThemable(Theme.key_chats_nameMessage, this.resourcesProvider);
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
                                                                                            CharSequence replaceEmoji = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence53 = replaceEmoji;
                                                                                            if (this.message.hasHighlightedWords()) {
                                                                                            }
                                                                                            CharSequence charSequence54 = charSequence53;
                                                                                            if (this.thumbsCount > 0) {
                                                                                            }
                                                                                            z17 = z9;
                                                                                            charSequence19 = charSequence54;
                                                                                            charSequence18 = charSequence16;
                                                                                            z8 = false;
                                                                                            charSequence23 = charSequence19;
                                                                                            charSequence22 = charSequence18;
                                                                                            if (this.currentDialogFolderId != 0) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    CharSequence replaceEmoji2 = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                    CharSequence charSequence532 = replaceEmoji2;
                                                                                    if (this.message.hasHighlightedWords()) {
                                                                                        CharSequence highlightText5 = AndroidUtilities.highlightText(replaceEmoji2, this.message.highlightedWords, this.resourcesProvider);
                                                                                        charSequence532 = replaceEmoji2;
                                                                                        if (highlightText5 != null) {
                                                                                            charSequence532 = highlightText5;
                                                                                        }
                                                                                    }
                                                                                    CharSequence charSequence542 = charSequence532;
                                                                                    if (this.thumbsCount > 0) {
                                                                                        boolean z23 = charSequence532 instanceof SpannableStringBuilder;
                                                                                        CharSequence charSequence55 = charSequence532;
                                                                                        if (!z23) {
                                                                                            charSequence55 = new SpannableStringBuilder(charSequence532);
                                                                                        }
                                                                                        SpannableStringBuilder spannableStringBuilder10 = (SpannableStringBuilder) charSequence55;
                                                                                        if (i6 >= spannableStringBuilder10.length()) {
                                                                                            spannableStringBuilder10.append(charSequence6);
                                                                                            spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), spannableStringBuilder10.length() - 1, spannableStringBuilder10.length(), 33);
                                                                                            charSequence542 = charSequence55;
                                                                                        } else {
                                                                                            spannableStringBuilder10.insert(i6, charSequence6);
                                                                                            spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), i6, i6 + 1, 33);
                                                                                            charSequence542 = charSequence55;
                                                                                        }
                                                                                    }
                                                                                    z17 = z9;
                                                                                    charSequence19 = charSequence542;
                                                                                    charSequence18 = charSequence16;
                                                                                }
                                                                            }
                                                                            charSequence16 = escape2;
                                                                            SpannableStringBuilder messageStringFormatted22 = getMessageStringFormatted(i23, restrictionReason, charSequence16, false);
                                                                            if (this.useFromUserAsAvatar) {
                                                                            }
                                                                            i6 = 0;
                                                                            CharSequence replaceEmoji22 = Emoji.replaceEmoji(messageStringFormatted22, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                            CharSequence charSequence5322 = replaceEmoji22;
                                                                            if (this.message.hasHighlightedWords()) {
                                                                            }
                                                                            CharSequence charSequence5422 = charSequence5322;
                                                                            if (this.thumbsCount > 0) {
                                                                            }
                                                                            z17 = z9;
                                                                            charSequence19 = charSequence5422;
                                                                            charSequence18 = charSequence16;
                                                                        }
                                                                    }
                                                                    z8 = false;
                                                                    charSequence23 = charSequence19;
                                                                    charSequence22 = charSequence18;
                                                                    if (this.currentDialogFolderId != 0) {
                                                                    }
                                                                }
                                                                charSequence6 = charSequence40;
                                                                z17 = false;
                                                                z = false;
                                                                charSequence24 = charSequence20;
                                                                charSequence22 = null;
                                                                charSequence23 = charSequence24;
                                                                if (this.currentDialogFolderId != 0) {
                                                                }
                                                            }
                                                            z17 = z9;
                                                            charSequence24 = charSequence12;
                                                            charSequence22 = null;
                                                            charSequence23 = charSequence24;
                                                            if (this.currentDialogFolderId != 0) {
                                                            }
                                                        }
                                                        charSequence10 = "";
                                                        z10 = false;
                                                        if (z10) {
                                                        }
                                                        z17 = z9;
                                                        charSequence24 = charSequence12;
                                                        charSequence22 = null;
                                                        charSequence23 = charSequence24;
                                                        if (this.currentDialogFolderId != 0) {
                                                        }
                                                    }
                                                }
                                            }
                                            z8 = z6;
                                            z9 = z17;
                                            charSequence10 = "";
                                            z10 = false;
                                            if (z10) {
                                            }
                                            z17 = z9;
                                            charSequence24 = charSequence12;
                                            charSequence22 = null;
                                            charSequence23 = charSequence24;
                                            if (this.currentDialogFolderId != 0) {
                                            }
                                        }
                                    }
                                    z8 = z6;
                                    i4 = i3;
                                    charSequence9 = string2;
                                    charSequence6 = charSequence4;
                                    string = null;
                                    charSequence8 = null;
                                    charSequence26 = charSequence5;
                                }
                                if (!this.drawForwardIcon && !isFolderCell() && !isForumCell() && !isDialogFolder() && this.draftMessage == null && (messageObject4 = this.message) != null && (message = messageObject4.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                    this.drawGiftIcon = true;
                                    SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(charSequence9);
                                    spannableStringBuilder11.insert(0, (CharSequence) "d ");
                                    ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_gift).mutate());
                                    coloredImageSpan3.setScale(1.25f, 1.25f);
                                    coloredImageSpan3.spaceScaleX = 0.9f;
                                    coloredImageSpan3.setAlpha(0.9f);
                                    spannableStringBuilder11.setSpan(coloredImageSpan3, 0, 1, 0);
                                    tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.message.messageOwner.action).message;
                                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                        this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                    }
                                    charSequence9 = spannableStringBuilder11;
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
                                    messageObject3 = this.message;
                                    if (messageObject3 != null || this.isSavedDialog) {
                                        this.drawCheck1 = false;
                                        this.drawCheck2 = false;
                                        this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                        z11 = false;
                                        this.drawCount = false;
                                        this.drawMention = false;
                                        this.drawReactionMention = false;
                                        this.drawPollVotesMention = false;
                                        this.drawError = false;
                                        str7 = null;
                                        str8 = null;
                                    } else {
                                        if (this.currentDialogFolderId != 0) {
                                            int i30 = this.unreadCount;
                                            int i31 = this.mentionCount;
                                            int i32 = i30 + i31;
                                            if (i32 <= 0) {
                                                z14 = false;
                                                this.drawCount = false;
                                                this.drawMention = false;
                                                str7 = null;
                                            } else if (i30 > i31) {
                                                this.drawCount = true;
                                                z14 = false;
                                                this.drawMention = false;
                                                str7 = String.format(str3, Integer.valueOf(i32));
                                            } else {
                                                z14 = false;
                                                this.drawCount = false;
                                                this.drawMention = true;
                                                str8 = String.format(str3, Integer.valueOf(i32));
                                                str7 = null;
                                                this.drawReactionMention = z14;
                                                this.drawPollVotesMention = z14;
                                            }
                                            str8 = null;
                                            this.drawReactionMention = z14;
                                            this.drawPollVotesMention = z14;
                                        } else {
                                            if (this.clearingDialog) {
                                                this.drawCount = false;
                                                z17 = false;
                                                str7 = null;
                                                z12 = true;
                                                z13 = false;
                                            } else {
                                                int i33 = this.unreadCount;
                                                z12 = true;
                                                if (i33 != 0 && (i33 != 1 || i33 != this.mentionCount || !messageObject3.messageOwner.mentioned)) {
                                                    this.drawCount = true;
                                                    z13 = false;
                                                    str7 = String.format(str3, Integer.valueOf(i33));
                                                } else {
                                                    z13 = false;
                                                    if (this.markUnread) {
                                                        this.drawCount = true;
                                                        str7 = "";
                                                    } else {
                                                        this.drawCount = false;
                                                        str7 = null;
                                                    }
                                                }
                                            }
                                            if (this.mentionCount != 0) {
                                                this.drawMention = z12;
                                                str8 = "@";
                                            } else {
                                                this.drawMention = z13;
                                                str8 = null;
                                            }
                                            this.drawReactionMention = this.reactionMentionCount > 0;
                                            this.drawPollVotesMention = this.pollVotesMentionCount > 0;
                                        }
                                        if (this.message.isOut() && this.draftMessage == null && z17) {
                                            MessageObject messageObject18 = this.message;
                                            if (!(messageObject18.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                if (messageObject18.isSending()) {
                                                    z11 = false;
                                                    this.drawCheck1 = false;
                                                    this.drawCheck2 = false;
                                                    this.drawClock = true;
                                                    this.drawError = false;
                                                } else {
                                                    z11 = false;
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
                                                        z11 = false;
                                                        this.drawClock = false;
                                                        this.drawError = false;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                }
                                            }
                                        }
                                        z11 = false;
                                        this.drawCheck1 = false;
                                        this.drawCheck2 = false;
                                        this.drawClock = false;
                                        this.drawError = false;
                                    }
                                    this.promoDialog = z11;
                                    messagesController = MessagesController.getInstance(this.currentAccount);
                                    if (this.dialogsType == 0 && messagesController.isPromoDialog(this.currentDialogId, true)) {
                                        this.drawPinBackground = true;
                                        this.promoDialog = true;
                                        i8 = messagesController.promoDialogType;
                                        if (i8 != MessagesController.PROMO_TYPE_PROXY) {
                                            stringForMessageListDate = LocaleController.getString(R.string.UseProxySponsor);
                                        } else if (i8 == MessagesController.PROMO_TYPE_PSA) {
                                            stringForMessageListDate = LocaleController.getString("PsaType_" + messagesController.promoPsaType);
                                            if (TextUtils.isEmpty(stringForMessageListDate)) {
                                                stringForMessageListDate = LocaleController.getString(R.string.PsaTypeDefault);
                                            }
                                            if (!TextUtils.isEmpty(messagesController.promoPsaMessage)) {
                                                charSequence27 = messagesController.promoPsaMessage;
                                                this.thumbsCount = 0;
                                                charSequence28 = this.titleOverride;
                                                if (charSequence28 == null) {
                                                    if (this.currentDialogFolderId != 0) {
                                                        charSequence28 = LocaleController.getString(R.string.ArchivedChats);
                                                    } else {
                                                        TLRPC.Chat chat11 = this.chat;
                                                        if (chat11 != null) {
                                                            if (this.useFromUserAsAvatar) {
                                                                if (this.topicIconInName == null) {
                                                                    this.topicIconInName = new Drawable[1];
                                                                }
                                                                this.topicIconInName[0] = null;
                                                                charSequence28 = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint, this.topicIconInName);
                                                            } else if (this.isTopic) {
                                                                if (this.topicIconInName == null) {
                                                                    this.topicIconInName = new Drawable[1];
                                                                }
                                                                Drawable[] drawableArr = this.topicIconInName;
                                                                drawableArr[0] = null;
                                                                charSequence28 = this.showTopicIconInName ? ForumUtilities.getTopicSpannedName(this.forumTopic, Theme.dialogs_namePaint[this.paintIndex], drawableArr, false) : AndroidUtilities.escape(this.forumTopic.title);
                                                            } else if (chat11.monoforum && chat11.linked_monoforum_id != 0) {
                                                                TLRPC.Chat chat12 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.linked_monoforum_id));
                                                                if (chat12 != null) {
                                                                    SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(AndroidUtilities.escape(chat12.title));
                                                                    spannableStringBuilder12.append(charSequence6);
                                                                    int length3 = spannableStringBuilder12.length();
                                                                    int i35 = R.string.MonoforumSpan;
                                                                    spannableStringBuilder12.append((CharSequence) LocaleController.getString(i35));
                                                                    spannableStringBuilder12.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i35), 9.33f, Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider), length3, spannableStringBuilder12.length(), 33);
                                                                    charSequence28 = spannableStringBuilder12;
                                                                } else {
                                                                    charSequence28 = AndroidUtilities.escape(this.chat.title);
                                                                }
                                                            } else {
                                                                charSequence28 = AndroidUtilities.escape(chat11.title);
                                                            }
                                                            if (charSequence28 != null && charSequence28.length() == 0) {
                                                                charSequence28 = LocaleController.getString(R.string.HiddenName);
                                                            }
                                                        } else {
                                                            TLRPC.User user7 = this.user;
                                                            if (user7 != null) {
                                                                if (UserObject.isReplyUser(user7)) {
                                                                    charSequence28 = LocaleController.getString(R.string.RepliesTitle);
                                                                } else if (UserObject.isAnonymous(this.user)) {
                                                                    charSequence28 = LocaleController.getString(R.string.AnonymousForward);
                                                                } else if (UserObject.isUserSelf(this.user) && !this.isMonoForumTopicDialog) {
                                                                    if (this.isSavedDialog) {
                                                                        charSequence28 = LocaleController.getString(R.string.MyNotes);
                                                                    } else if (this.useMeForMyMessages) {
                                                                        charSequence28 = LocaleController.getString(R.string.FromYou);
                                                                    } else {
                                                                        if (this.dialogsType == 3) {
                                                                            this.drawPinBackground = true;
                                                                        }
                                                                        charSequence28 = LocaleController.getString(R.string.SavedMessages);
                                                                    }
                                                                } else if (this.isTopic) {
                                                                    if (this.topicIconInName == null) {
                                                                        this.topicIconInName = new Drawable[1];
                                                                    }
                                                                    Drawable[] drawableArr2 = this.topicIconInName;
                                                                    drawableArr2[0] = null;
                                                                    charSequence28 = this.showTopicIconInName ? ForumUtilities.getTopicSpannedName(this.forumTopic, Theme.dialogs_namePaint[this.paintIndex], drawableArr2, false) : AndroidUtilities.escape(this.forumTopic.title);
                                                                } else {
                                                                    charSequence28 = AndroidUtilities.escape(UserObject.getUserName(this.user));
                                                                }
                                                                if (charSequence28 != null) {
                                                                    charSequence28 = LocaleController.getString(R.string.HiddenName);
                                                                }
                                                            }
                                                            charSequence28 = "";
                                                            if (charSequence28 != null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                str9 = stringForMessageListDate;
                                                charSequence29 = charSequence8;
                                                str10 = str8;
                                                i7 = i4;
                                                CharSequence charSequence56 = charSequence27;
                                                charSequence30 = string;
                                                charSequence31 = charSequence28;
                                                charSequence32 = charSequence56;
                                                charSequence33 = charSequence26;
                                            }
                                        }
                                    }
                                    charSequence27 = charSequence9;
                                    charSequence28 = this.titleOverride;
                                    if (charSequence28 == null) {
                                    }
                                    str9 = stringForMessageListDate;
                                    charSequence29 = charSequence8;
                                    str10 = str8;
                                    i7 = i4;
                                    CharSequence charSequence562 = charSequence27;
                                    charSequence30 = string;
                                    charSequence31 = charSequence28;
                                    charSequence32 = charSequence562;
                                    charSequence33 = charSequence26;
                                }
                                stringForMessageListDate = "";
                                messageObject3 = this.message;
                                if (messageObject3 != null) {
                                }
                                this.drawCheck1 = false;
                                this.drawCheck2 = false;
                                this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                z11 = false;
                                this.drawCount = false;
                                this.drawMention = false;
                                this.drawReactionMention = false;
                                this.drawPollVotesMention = false;
                                this.drawError = false;
                                str7 = null;
                                str8 = null;
                                this.promoDialog = z11;
                                messagesController = MessagesController.getInstance(this.currentAccount);
                                if (this.dialogsType == 0) {
                                    this.drawPinBackground = true;
                                    this.promoDialog = true;
                                    i8 = messagesController.promoDialogType;
                                    if (i8 != MessagesController.PROMO_TYPE_PROXY) {
                                    }
                                }
                                charSequence27 = charSequence9;
                                charSequence28 = this.titleOverride;
                                if (charSequence28 == null) {
                                }
                                str9 = stringForMessageListDate;
                                charSequence29 = charSequence8;
                                str10 = str8;
                                i7 = i4;
                                CharSequence charSequence5622 = charSequence27;
                                charSequence30 = string;
                                charSequence31 = charSequence28;
                                charSequence32 = charSequence5622;
                                charSequence33 = charSequence26;
                            }
                            i4 = -1;
                            z8 = true;
                            charSequence26 = charSequence25;
                            if (!this.drawForwardIcon) {
                                this.drawGiftIcon = true;
                                SpannableStringBuilder spannableStringBuilder112 = new SpannableStringBuilder(charSequence9);
                                spannableStringBuilder112.insert(0, (CharSequence) "d ");
                                ColoredImageSpan coloredImageSpan32 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_gift).mutate());
                                coloredImageSpan32.setScale(1.25f, 1.25f);
                                coloredImageSpan32.spaceScaleX = 0.9f;
                                coloredImageSpan32.setAlpha(0.9f);
                                spannableStringBuilder112.setSpan(coloredImageSpan32, 0, 1, 0);
                                tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) this.message.messageOwner.action).message;
                                if (tL_textWithEntities != null) {
                                    this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                }
                                charSequence9 = spannableStringBuilder112;
                            }
                            if (TextUtils.isEmpty(this.customMessage)) {
                            }
                            stringForMessageListDate = "";
                            messageObject3 = this.message;
                            if (messageObject3 != null) {
                            }
                            this.drawCheck1 = false;
                            this.drawCheck2 = false;
                            this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                            z11 = false;
                            this.drawCount = false;
                            this.drawMention = false;
                            this.drawReactionMention = false;
                            this.drawPollVotesMention = false;
                            this.drawError = false;
                            str7 = null;
                            str8 = null;
                            this.promoDialog = z11;
                            messagesController = MessagesController.getInstance(this.currentAccount);
                            if (this.dialogsType == 0) {
                            }
                            charSequence27 = charSequence9;
                            charSequence28 = this.titleOverride;
                            if (charSequence28 == null) {
                            }
                            str9 = stringForMessageListDate;
                            charSequence29 = charSequence8;
                            str10 = str8;
                            i7 = i4;
                            CharSequence charSequence56222 = charSequence27;
                            charSequence30 = string;
                            charSequence31 = charSequence28;
                            charSequence32 = charSequence56222;
                            charSequence33 = charSequence26;
                        }
                    }
                    draftMessage3 = null;
                    this.draftMessage = null;
                    z5 = false;
                    this.draftVoice = false;
                    if (isForumCell()) {
                    }
                    i4 = -1;
                    z8 = true;
                    charSequence26 = charSequence25;
                    if (!this.drawForwardIcon) {
                    }
                    if (TextUtils.isEmpty(this.customMessage)) {
                    }
                    stringForMessageListDate = "";
                    messageObject3 = this.message;
                    if (messageObject3 != null) {
                    }
                    this.drawCheck1 = false;
                    this.drawCheck2 = false;
                    this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                    z11 = false;
                    this.drawCount = false;
                    this.drawMention = false;
                    this.drawReactionMention = false;
                    this.drawPollVotesMention = false;
                    this.drawError = false;
                    str7 = null;
                    str8 = null;
                    this.promoDialog = z11;
                    messagesController = MessagesController.getInstance(this.currentAccount);
                    if (this.dialogsType == 0) {
                    }
                    charSequence27 = charSequence9;
                    charSequence28 = this.titleOverride;
                    if (charSequence28 == null) {
                    }
                    str9 = stringForMessageListDate;
                    charSequence29 = charSequence8;
                    str10 = str8;
                    i7 = i4;
                    CharSequence charSequence562222 = charSequence27;
                    charSequence30 = string;
                    charSequence31 = charSequence28;
                    charSequence32 = charSequence562222;
                    charSequence33 = charSequence26;
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
                    if (ChatObject.isChannel(this.chat)) {
                    }
                    chat2 = this.chat;
                    if (chat2 != null) {
                    }
                    draftMessage3 = null;
                    z5 = false;
                    if (isForumCell()) {
                    }
                    i4 = -1;
                    z8 = true;
                    charSequence26 = charSequence25;
                    if (!this.drawForwardIcon) {
                    }
                    if (TextUtils.isEmpty(this.customMessage)) {
                    }
                    stringForMessageListDate = "";
                    messageObject3 = this.message;
                    if (messageObject3 != null) {
                    }
                    this.drawCheck1 = false;
                    this.drawCheck2 = false;
                    this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                    z11 = false;
                    this.drawCount = false;
                    this.drawMention = false;
                    this.drawReactionMention = false;
                    this.drawPollVotesMention = false;
                    this.drawError = false;
                    str7 = null;
                    str8 = null;
                    this.promoDialog = z11;
                    messagesController = MessagesController.getInstance(this.currentAccount);
                    if (this.dialogsType == 0) {
                    }
                    charSequence27 = charSequence9;
                    charSequence28 = this.titleOverride;
                    if (charSequence28 == null) {
                    }
                    str9 = stringForMessageListDate;
                    charSequence29 = charSequence8;
                    str10 = str8;
                    i7 = i4;
                    CharSequence charSequence5622222 = charSequence27;
                    charSequence30 = string;
                    charSequence31 = charSequence28;
                    charSequence32 = charSequence5622222;
                    charSequence33 = charSequence26;
                }
                if (ChatObject.isChannel(this.chat)) {
                }
                chat2 = this.chat;
                if (chat2 != null) {
                }
                draftMessage3 = null;
                z5 = false;
                if (isForumCell()) {
                }
                i4 = -1;
                z8 = true;
                charSequence26 = charSequence25;
                if (!this.drawForwardIcon) {
                }
                if (TextUtils.isEmpty(this.customMessage)) {
                }
                stringForMessageListDate = "";
                messageObject3 = this.message;
                if (messageObject3 != null) {
                }
                this.drawCheck1 = false;
                this.drawCheck2 = false;
                this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                z11 = false;
                this.drawCount = false;
                this.drawMention = false;
                this.drawReactionMention = false;
                this.drawPollVotesMention = false;
                this.drawError = false;
                str7 = null;
                str8 = null;
                this.promoDialog = z11;
                messagesController = MessagesController.getInstance(this.currentAccount);
                if (this.dialogsType == 0) {
                }
                charSequence27 = charSequence9;
                charSequence28 = this.titleOverride;
                if (charSequence28 == null) {
                }
                str9 = stringForMessageListDate;
                charSequence29 = charSequence8;
                str10 = str8;
                i7 = i4;
                CharSequence charSequence56222222 = charSequence27;
                charSequence30 = string;
                charSequence31 = charSequence28;
                charSequence32 = charSequence56222222;
                charSequence33 = charSequence26;
            }
            charSequence3 = charSequence38;
            str2 = str;
            i2 = this.lastMessageDate;
            if (i2 == 0) {
            }
            if (this.isTopic) {
            }
            z4 = this.draftVoice;
            if (!z4) {
            }
            if (ChatObject.isChannel(this.chat)) {
            }
            chat2 = this.chat;
            if (chat2 != null) {
            }
            draftMessage3 = null;
            z5 = false;
            if (isForumCell()) {
            }
            i4 = -1;
            z8 = true;
            charSequence26 = charSequence25;
            if (!this.drawForwardIcon) {
            }
            if (TextUtils.isEmpty(this.customMessage)) {
            }
            stringForMessageListDate = "";
            messageObject3 = this.message;
            if (messageObject3 != null) {
            }
            this.drawCheck1 = false;
            this.drawCheck2 = false;
            this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
            z11 = false;
            this.drawCount = false;
            this.drawMention = false;
            this.drawReactionMention = false;
            this.drawPollVotesMention = false;
            this.drawError = false;
            str7 = null;
            str8 = null;
            this.promoDialog = z11;
            messagesController = MessagesController.getInstance(this.currentAccount);
            if (this.dialogsType == 0) {
            }
            charSequence27 = charSequence9;
            charSequence28 = this.titleOverride;
            if (charSequence28 == null) {
            }
            str9 = stringForMessageListDate;
            charSequence29 = charSequence8;
            str10 = str8;
            i7 = i4;
            CharSequence charSequence562222222 = charSequence27;
            charSequence30 = string;
            charSequence31 = charSequence28;
            charSequence32 = charSequence562222222;
            charSequence33 = charSequence26;
        }
        if (z) {
            TextPaint timeTextPaint = getTimeTextPaint();
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str9));
            charSequence34 = charSequence29;
            this.timeLayout = new StaticLayout(str9, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i11 = ceil + AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f);
            if (!LocaleController.isRTL) {
                this.timeLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.0f)) - i11;
            } else {
                this.timeLeft = AndroidUtilities.dp(15.0f);
            }
        } else {
            charSequence34 = charSequence29;
            this.timeLayout = null;
            this.timeLeft = 0;
            i11 = 0;
        }
        if (drawLock2()) {
            if (LocaleController.isRTL) {
                f = 4.0f;
                this.lock2Left = this.timeLeft + i11 + AndroidUtilities.dp(4.0f);
            } else {
                f = 4.0f;
                this.lock2Left = (this.timeLeft - Theme.dialogs_lock2Drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i12 = Theme.dialogs_lock2Drawable.getIntrinsicWidth() + AndroidUtilities.dp(f);
            i11 += i12;
        } else {
            f = 4.0f;
            i12 = 0;
        }
        if (!LocaleController.isRTL) {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(22.0f)) - i11;
        } else {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(this.messagePaddingStart + 13)) - i11;
            this.nameLeft += i11;
        }
        if (this.drawNameLock) {
            int i36 = this.nameWidth;
            if (LocaleController.isRTL) {
                f = 8.0f;
            }
            this.nameWidth = i36 - (AndroidUtilities.dp(f) + Theme.dialogs_lockDrawable.getIntrinsicWidth());
        }
        if (this.drawClock) {
            int intrinsicWidth2 = Theme.dialogs_clockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            this.nameWidth -= intrinsicWidth2;
            if (!LocaleController.isRTL) {
                this.clockDrawLeft = (this.timeLeft - i12) - intrinsicWidth2;
            } else {
                this.clockDrawLeft = this.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth2;
            }
        } else if (this.drawCheck2) {
            int intrinsicWidth3 = Theme.dialogs_checkDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            int i37 = this.nameWidth - intrinsicWidth3;
            this.nameWidth = i37;
            if (this.drawCheck1) {
                this.nameWidth = i37 - (Theme.dialogs_halfCheckDrawable.getIntrinsicWidth() - AndroidUtilities.dp(8.0f));
                if (!LocaleController.isRTL) {
                    int i38 = (this.timeLeft - i12) - intrinsicWidth3;
                    this.halfCheckDrawLeft = i38;
                    this.checkDrawLeft = i38 - AndroidUtilities.dp(5.5f);
                } else {
                    int dp7 = this.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                    this.checkDrawLeft = dp7;
                    this.halfCheckDrawLeft = dp7 + AndroidUtilities.dp(5.5f);
                    this.nameLeft += (intrinsicWidth3 + Theme.dialogs_halfCheckDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(8.0f);
                }
            } else if (!LocaleController.isRTL) {
                this.checkDrawLeft1 = (this.timeLeft - i12) - intrinsicWidth3;
            } else {
                this.checkDrawLeft1 = this.timeLeft + i11 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth3;
            }
        }
        this.nameAdditionalsForChannelSubscriber = 0;
        if (this.drawPremium && this.emojiStatus.getDrawable() != null) {
            int dp8 = AndroidUtilities.dp(36.0f);
            this.nameWidth -= dp8;
            this.nameAdditionalsForChannelSubscriber += dp8;
            if (LocaleController.isRTL) {
                this.nameLeft += dp8;
            }
        } else if ((this.dialogMuted || this.drawUnmute) && !this.drawVerified && this.drawScam == 0) {
            int dp9 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            this.nameWidth -= dp9;
            this.nameAdditionalsForChannelSubscriber += dp9;
            if (LocaleController.isRTL) {
                this.nameLeft += dp9;
            }
        } else if (this.drawVerified) {
            int dp10 = AndroidUtilities.dp(6.0f) + Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
            this.nameWidth -= dp10;
            this.nameAdditionalsForChannelSubscriber += dp10;
            if (LocaleController.isRTL) {
                this.nameLeft += dp10;
            }
        } else if (this.drawPremium) {
            int dp11 = AndroidUtilities.dp(36.0f);
            this.nameWidth -= dp11;
            this.nameAdditionalsForChannelSubscriber += dp11;
            if (LocaleController.isRTL) {
                this.nameLeft += dp11;
            }
        } else if (this.drawScam != 0) {
            int dp12 = AndroidUtilities.dp(6.0f) + (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth();
            this.nameWidth -= dp12;
            this.nameAdditionalsForChannelSubscriber += dp12;
            if (LocaleController.isRTL) {
                this.nameLeft += dp12;
            }
        }
        if (this.drawBotVerified) {
            this.nameWidth -= AndroidUtilities.dp(21.0f);
        }
        int i39 = this.namePaddingEnd;
        if (i39 > 0) {
            this.nameWidth -= i39;
            if (LocaleController.isRTL) {
                this.nameLeft += i39;
            }
        }
        try {
            int dp13 = this.nameWidth - AndroidUtilities.dp(12.0f);
            if (dp13 < 0) {
                dp13 = 0;
            }
            if (charSequence31 instanceof String) {
                charSequence31 = ((String) charSequence31).replace('\n', ' ');
            }
            if (this.nameLayoutEllipsizeByGradient) {
                this.nameLayoutFits = charSequence31.length() == TextUtils.ellipsize(charSequence31, Theme.dialogs_namePaint[this.paintIndex], (float) dp13, TextUtils.TruncateAt.END).length();
                dp13 += AndroidUtilities.dp(48.0f);
                this.channelShouldUseLineWidth = this.nameLayoutFits;
            } else if (this.isForChannelSubscriberCell) {
                this.channelShouldUseLineWidth = charSequence31.length() == TextUtils.ellipsize(charSequence31, Theme.dialogs_namePaint[this.paintIndex], (float) dp13, TextUtils.TruncateAt.END).length();
            }
            float f2 = dp13;
            this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(charSequence31.toString()) > f2;
            if (!this.twoLinesForName) {
                charSequence31 = TextUtils.ellipsize(charSequence31, Theme.dialogs_namePaint[this.paintIndex], f2, TextUtils.TruncateAt.END);
            }
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(charSequence31, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject19 = this.message;
            CharSequence charSequence57 = (messageObject19 == null || !messageObject19.hasHighlightedWords() || (highlightText3 = AndroidUtilities.highlightText(replaceEmoji3, this.message.highlightedWords, this.resourcesProvider)) == null) ? replaceEmoji3 : highlightText3;
            if (this.twoLinesForName) {
                this.nameLayout = StaticLayoutEx.createStaticLayout(charSequence57, Theme.dialogs_namePaint[this.paintIndex], dp13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp13, 2);
            } else {
                this.nameLayout = new StaticLayout(charSequence57, Theme.dialogs_namePaint[this.paintIndex], Math.max(dp13, this.nameWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.nameLayoutTranslateX = (this.nameLayoutEllipsizeByGradient && this.nameLayout.isRtlCharAt(0)) ? -AndroidUtilities.dp(36.0f) : 0.0f;
            this.nameLayoutEllipsizeLeft = this.nameLayout.isRtlCharAt(0);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        this.animatedEmojiStackName = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStackName, this.nameLayout);
        float f3 = 20.0f;
        if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
            dp = AndroidUtilities.dp(11.0f);
            this.messageNameTop = AndroidUtilities.dp(32.0f);
            this.timeTop = AndroidUtilities.dp(13.0f);
            this.errorTop = AndroidUtilities.dp(42.33f);
            this.pinTop = AndroidUtilities.dp(43.0f);
            this.countTop = AndroidUtilities.dp(42.33f);
            this.checkDrawTop = AndroidUtilities.dp(13.0f);
            measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
            if (LocaleController.isRTL) {
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
            this.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f) + dp);
            int i40 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                if (i40 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i40].setImageCoords(((this.thumbSize + 2) * i40) + dp3, ((AndroidUtilities.dp(31.0f) + dp) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i40++;
            }
        } else {
            dp = AndroidUtilities.dp(9.0f);
            this.messageNameTop = AndroidUtilities.dp(31.0f);
            this.timeTop = AndroidUtilities.dp(16.0f);
            this.errorTop = AndroidUtilities.dp(38.0f);
            this.pinTop = AndroidUtilities.dp(39.0f);
            this.countTop = AndroidUtilities.dp(this.isTopic ? 35.0f : 38.0f);
            this.checkDrawTop = AndroidUtilities.dp(17.0f);
            measuredWidth = getMeasuredWidth() - AndroidUtilities.dp((this.messagePaddingStart + 20) - (LocaleController.isRTL ? 0 : 12));
            if (LocaleController.isRTL) {
                int dp16 = AndroidUtilities.dp(22.0f);
                this.messageNameLeft = dp16;
                this.messageLeft = dp16;
                this.typingLeft = dp16;
                this.buttonLeft = dp16;
                dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.avatarStart + 52);
                dp6 = dp5 - AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 9);
            } else {
                int dp17 = AndroidUtilities.dp(this.messagePaddingStart + 4);
                this.messageNameLeft = dp17;
                this.messageLeft = dp17;
                this.typingLeft = dp17;
                this.buttonLeft = dp17;
                dp5 = AndroidUtilities.dp(this.avatarStart);
                dp6 = AndroidUtilities.dp(67.0f) + dp5;
            }
            this.storyParams.originalAvatarRect.set(dp5, dp, dp5 + AndroidUtilities.dp(52.0f), dp + AndroidUtilities.dp(52.0f));
            int i41 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr2 = this.thumbImage;
                if (i41 >= imageReceiverArr2.length) {
                    break;
                }
                imageReceiverArr2[i41].setImageCoords(((this.thumbSize + 2) * i41) + dp6, ((AndroidUtilities.dp(30.0f) + dp) + (this.twoLinesForName ? AndroidUtilities.dp(f3) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags3 = this.tags) == null || dialogCellTags3.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.thumbSize), AndroidUtilities.dp(this.thumbSize));
                i41++;
                f3 = 20.0f;
            }
        }
        int i42 = dp;
        if (LocaleController.isRTL) {
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
            int dp18 = AndroidUtilities.dp(29.0f);
            measuredWidth -= dp18;
            if (!LocaleController.isRTL) {
                this.errorLeft = getMeasuredWidth() - AndroidUtilities.dp(36.3333f);
            } else {
                this.errorLeft = AndroidUtilities.dp(15.666f);
                this.messageLeft += dp18;
                this.typingLeft += dp18;
                this.buttonLeft += dp18;
                this.messageNameLeft += dp18;
            }
        } else if (str7 != null || str10 != null || this.drawReactionMention || this.drawPollVotesMention) {
            if (str7 != null) {
                this.countWidth = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str7)));
                this.countLayout = new StaticLayout(str7, Theme.dialogs_countTextPaint2, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp19 = this.countWidth + AndroidUtilities.dp(17.0f);
                measuredWidth -= dp19;
                if (!LocaleController.isRTL) {
                    this.countLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.666f)) - (this.countWidth + AndroidUtilities.dp(12.666f));
                } else {
                    this.countLeft = AndroidUtilities.dp(15.666f);
                    this.messageLeft += dp19;
                    this.typingLeft += dp19;
                    this.buttonLeft += dp19;
                    this.messageNameLeft += dp19;
                }
                this.drawCount = true;
            } else {
                this.countWidth = 0;
            }
            if (str10 != null) {
                if (this.currentDialogFolderId != 0) {
                    this.mentionWidth = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str10)));
                    this.mentionLayout = new StaticLayout(str10, Theme.dialogs_countTextPaint2, this.mentionWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.mentionWidth = AndroidUtilities.dp(8.0f);
                }
                int dp20 = this.mentionWidth + AndroidUtilities.dp(17.0f);
                measuredWidth -= dp20;
                if (!LocaleController.isRTL) {
                    int measuredWidth5 = (getMeasuredWidth() - (this.mentionWidth + AndroidUtilities.dp(12.666f))) - AndroidUtilities.dp(15.666f);
                    int i43 = this.countWidth;
                    this.mentionLeft = measuredWidth5 - (i43 != 0 ? i43 + AndroidUtilities.dp(17.0f) : 0);
                } else {
                    int dp21 = AndroidUtilities.dp(15.666f);
                    int i44 = this.countWidth;
                    this.mentionLeft = dp21 + (i44 != 0 ? i44 + AndroidUtilities.dp(17.0f) : 0);
                    this.messageLeft += dp20;
                    this.typingLeft += dp20;
                    this.buttonLeft += dp20;
                    this.messageNameLeft += dp20;
                }
                this.drawMention = true;
            } else {
                this.mentionWidth = 0;
            }
            if (this.drawReactionMention) {
                int dp22 = AndroidUtilities.dp(25.0f);
                measuredWidth -= dp22;
                if (!LocaleController.isRTL) {
                    int measuredWidth6 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    this.reactionMentionLeft = measuredWidth6;
                    if (this.drawMention) {
                        int i45 = this.mentionWidth;
                        this.reactionMentionLeft = measuredWidth6 - (i45 != 0 ? i45 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i46 = this.reactionMentionLeft;
                        int i47 = this.countWidth;
                        this.reactionMentionLeft = i46 - (i47 != 0 ? i47 + AndroidUtilities.dp(17.0f) : 0);
                    }
                } else {
                    int dp23 = AndroidUtilities.dp(15.666f);
                    this.reactionMentionLeft = dp23;
                    if (this.drawMention) {
                        int i48 = this.mentionWidth;
                        this.reactionMentionLeft = dp23 + (i48 != 0 ? i48 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i49 = this.reactionMentionLeft;
                        int i50 = this.countWidth;
                        this.reactionMentionLeft = i49 + (i50 != 0 ? i50 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    this.messageLeft += dp22;
                    this.typingLeft += dp22;
                    this.buttonLeft += dp22;
                    this.messageNameLeft += dp22;
                }
            }
            if (this.drawPollVotesMention) {
                int dp24 = AndroidUtilities.dp(25.0f);
                measuredWidth -= dp24;
                if (!LocaleController.isRTL) {
                    int measuredWidth7 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    this.pollVotesMentionLeft = measuredWidth7;
                    if (this.drawReactionMention) {
                        this.pollVotesMentionLeft = measuredWidth7 - AndroidUtilities.dp(25.0f);
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
                    int dp25 = AndroidUtilities.dp(15.666f);
                    this.pollVotesMentionLeft = dp25;
                    if (this.drawReactionMention) {
                        this.pollVotesMentionLeft = dp25 + AndroidUtilities.dp(25.0f);
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
                    this.messageLeft += dp24;
                    this.typingLeft += dp24;
                    this.buttonLeft += dp24;
                    this.messageNameLeft += dp24;
                }
            }
        } else if (this.allowBotOpenButton && !isFolderCell() && !isForumCell() && !isDialogFolder() && UserObject.isBot(this.user) && this.user.bot_has_main_app) {
            setOpenBotButton(true);
            int dp26 = (int) (AndroidUtilities.dp(26.0f) + this.openButtonText.getCurrentWidth());
            int dp27 = AndroidUtilities.dp(13.0f);
            measuredWidth -= dp26;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                dp4 = AndroidUtilities.dp(40.0f);
            } else {
                dp4 = AndroidUtilities.dp(this.isTopic ? 33.0f : 36.0f);
            }
            if (!LocaleController.isRTL) {
                this.openButtonRect.set((getMeasuredWidth() - dp26) - AndroidUtilities.dp(13.0f), dp4, getMeasuredWidth() - AndroidUtilities.dp(13.0f), dp4 + AndroidUtilities.dp(28.0f));
            } else {
                this.openButtonRect.set(AndroidUtilities.dp(13.0f), dp4, AndroidUtilities.dp(13.0f) + dp26, dp4 + AndroidUtilities.dp(28.0f));
                int i59 = dp26 + dp27;
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
        if (z8) {
            if (charSequence32 == null) {
                charSequence32 = "";
            }
            if (charSequence32.length() > 150) {
                charSequence32 = charSequence32.subSequence(0, 150);
            }
            if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence30 != null) {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceNewLines(charSequence32);
            } else {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceTwoNewLinesToOne(charSequence32);
            }
            charSequence32 = Emoji.replaceEmoji(replaceTwoNewLinesToOne, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject20 = this.message;
            if (messageObject20 != null && (highlightText2 = AndroidUtilities.highlightText(charSequence32, messageObject20.highlightedWords, this.resourcesProvider)) != null) {
                charSequence32 = highlightText2;
            }
        }
        int max = Math.max(AndroidUtilities.dp(12.0f), measuredWidth);
        this.buttonTop = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
            this.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
        }
        if (isForumCell()) {
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
        } else if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && charSequence30 != null && (this.currentDialogFolderId == 0 || this.currentDialogFolderDialogsCount == 1)) {
            try {
                MessageObject messageObject21 = this.message;
                if (messageObject21 != null && messageObject21.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(charSequence30, this.message.highlightedWords, this.resourcesProvider)) != null) {
                    charSequence30 = highlightText;
                }
                this.messageNameLayout = StaticLayoutEx.createStaticLayout(charSequence30, Theme.dialogs_messageNamePaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, max, 1);
            } catch (Exception e4) {
                FileLog.e(e4);
            }
            this.messageTop = AndroidUtilities.dp(51.0f);
            int dp28 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
            int i61 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.thumbImage;
                if (i61 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i61].setImageY(i42 + dp28 + AndroidUtilities.dp(40.0f));
                i61++;
            }
        } else {
            this.messageNameLayout = null;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                this.messageTop = AndroidUtilities.dp(32.0f);
                int dp29 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
                int i62 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.thumbImage;
                    if (i62 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i62].setImageY(i42 + dp29 + AndroidUtilities.dp(21.0f));
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
            if (!TextUtils.isEmpty(charSequence34)) {
                this.buttonLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence34, this.currentMessagePaint.getFontMetricsInt(), false), this.currentMessagePaint, max - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.currentMessagePaint, max - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            if (!TextUtils.isEmpty(charSequence33)) {
                if (!this.useForceThreeLines) {
                    if (SharedConfig.useThreeLinesLayout) {
                    }
                    this.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence33, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                if (!hasTags()) {
                    this.typingLayout = StaticLayoutEx.createStaticLayout(charSequence33, Theme.dialogs_messagePrintingPaint[this.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, 1);
                }
                this.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence33, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        } catch (Exception e5) {
            FileLog.e(e5);
        }
        try {
            if (charSequence32 instanceof Spannable) {
                try {
                    Spannable spannable = (Spannable) charSequence32;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ClickableSpan)) {
                            if (!(obj instanceof CodeHighlighting.Span)) {
                                if (!isFolderCell()) {
                                    if (!(obj instanceof TypefaceSpan)) {
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
                        }
                        spannable.removeSpan(obj);
                    }
                } catch (Exception e6) {
                    e = e6;
                    i13 = i7;
                    staticLayout = null;
                    i14 = 0;
                    i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    this.messageLayout = staticLayout;
                    FileLog.e(e);
                    i16 = max;
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[i14] = this.messageLayout;
                    this.animatedEmojiStack = AnimatedEmojiSpan.update(i14, this, emojiGroupedSpans, layoutArr);
                    if (!LocaleController.isRTL) {
                    }
                    staticLayout2 = this.typingLayout;
                    if (staticLayout2 != null) {
                    }
                    updateThumbsPosition();
                }
            }
        } catch (Exception e7) {
            e = e7;
            i13 = i7;
            i14 = 0;
        }
        if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && this.currentDialogFolderId != 0 && this.currentDialogFolderDialogsCount > 1) {
            this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
            charSequence35 = charSequence30;
            charSequence30 = null;
        } else {
            if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence30 != null || (ChatObject.isMonoForum(this.chat) && ChatObject.canManageMonoForum(this.currentAccount, this.chat))) {
                if (!isForumCell()) {
                    try {
                    } catch (Exception e8) {
                        e = e8;
                        i14 = 0;
                    }
                    if (charSequence32 instanceof Spanned) {
                        i14 = 0;
                        try {
                        } catch (Exception e9) {
                            e = e9;
                            i13 = i7;
                            staticLayout = null;
                            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            this.messageLayout = staticLayout;
                            FileLog.e(e);
                            i16 = max;
                            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = this.animatedEmojiStack;
                            Layout[] layoutArr2 = new Layout[1];
                            layoutArr2[i14] = this.messageLayout;
                            this.animatedEmojiStack = AnimatedEmojiSpan.update(i14, this, emojiGroupedSpans2, layoutArr2);
                            if (!LocaleController.isRTL) {
                            }
                            staticLayout2 = this.typingLayout;
                            if (staticLayout2 != null) {
                            }
                            updateThumbsPosition();
                        }
                        if (((FixedWidthSpan[]) ((Spanned) charSequence32).getSpans(0, charSequence32.length(), FixedWidthSpan.class)).length <= 0) {
                            ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max - AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 15), TextUtils.TruncateAt.END);
                            charSequence35 = ellipsize;
                            alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                            if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                if (this.thumbsCount > 0 && charSequence30 != null) {
                                    max += AndroidUtilities.dp(5.0f);
                                }
                                this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence30 == null ? 1 : 2);
                            } else {
                                if (this.thumbsCount > 0) {
                                    max += AndroidUtilities.dp((r0 * (this.thumbSize + 2)) + 3);
                                    if (LocaleController.isRTL && !isForumCell()) {
                                        this.messageLeft -= AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3);
                                    }
                                }
                                this.messageLayout = new StaticLayout(charSequence35, this.currentMessagePaint, max, alignment, 1.0f, 0.0f, false);
                            }
                            i16 = max;
                            this.spoilersPool.addAll(this.spoilers);
                            this.spoilers.clear();
                            StaticLayout staticLayout3 = this.messageLayout;
                            Stack stack = this.spoilersPool;
                            List list = this.spoilers;
                            i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            i13 = i7;
                            SpoilerEffect.addSpoilers(this, staticLayout3, -2, -2, stack, list);
                            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22 = this.animatedEmojiStack;
                            Layout[] layoutArr22 = new Layout[1];
                            layoutArr22[i14] = this.messageLayout;
                            this.animatedEmojiStack = AnimatedEmojiSpan.update(i14, this, emojiGroupedSpans22, layoutArr22);
                            if (!LocaleController.isRTL) {
                                StaticLayout staticLayout4 = this.nameLayout;
                                if (staticLayout4 != null && staticLayout4.getLineCount() > 0) {
                                    float lineLeft = this.nameLayout.getLineLeft(i14);
                                    double ceil2 = Math.ceil(this.nameLayout.getLineWidth(i14));
                                    int dp30 = this.nameLeft + AndroidUtilities.dp(12.0f);
                                    this.nameLeft = dp30;
                                    if (this.drawBotVerified) {
                                        this.nameLeft = dp30 + AndroidUtilities.dp(21.0f);
                                    }
                                    if (this.nameLayoutEllipsizeByGradient) {
                                        ceil2 = Math.min(this.nameWidth, ceil2);
                                    }
                                    if ((this.dialogMuted || this.drawUnmute) && !this.drawVerified && this.drawScam == 0) {
                                        this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                                    } else if (this.drawVerified) {
                                        this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_verifiedDrawable.getIntrinsicWidth());
                                    } else if (this.drawPremium) {
                                        this.nameMuteLeft = (int) ((this.nameLeft + ((this.nameWidth - ceil2) - lineLeft)) - AndroidUtilities.dp(24.0f));
                                    } else if (this.drawScam != 0) {
                                        this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth());
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
                                StaticLayout staticLayout5 = this.messageLayout;
                                if (staticLayout5 != null && (lineCount6 = staticLayout5.getLineCount()) > 0) {
                                    int i63 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    int i64 = 0;
                                    while (true) {
                                        if (i64 >= lineCount6) {
                                            i19 = i63;
                                            break;
                                        } else if (this.messageLayout.getLineLeft(i64) != 0.0f) {
                                            i19 = 0;
                                            break;
                                        } else {
                                            i63 = Math.min(i63, (int) (i16 - Math.ceil(this.messageLayout.getLineWidth(i64))));
                                            i64++;
                                        }
                                    }
                                    if (i19 != i15) {
                                        this.messageLeft += i19;
                                    }
                                }
                                StaticLayout staticLayout6 = this.typingLayout;
                                if (staticLayout6 != null && (lineCount5 = staticLayout6.getLineCount()) > 0) {
                                    int i65 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    int i66 = 0;
                                    while (true) {
                                        if (i66 >= lineCount5) {
                                            i18 = i65;
                                            break;
                                        } else if (this.typingLayout.getLineLeft(i66) != 0.0f) {
                                            i18 = 0;
                                            break;
                                        } else {
                                            i65 = Math.min(i65, (int) (i16 - Math.ceil(this.typingLayout.getLineWidth(i66))));
                                            i66++;
                                        }
                                    }
                                    if (i18 != i15) {
                                        this.typingLeft += i18;
                                    }
                                }
                                StaticLayout staticLayout7 = this.messageNameLayout;
                                if (staticLayout7 != null && staticLayout7.getLineCount() > 0 && this.messageNameLayout.getLineLeft(i14) == 0.0f) {
                                    double ceil3 = Math.ceil(this.messageNameLayout.getLineWidth(i14));
                                    double d2 = i16;
                                    if (ceil3 < d2) {
                                        this.messageNameLeft = (int) (this.messageNameLeft + (d2 - ceil3));
                                    }
                                }
                                StaticLayout staticLayout8 = this.buttonLayout;
                                if (staticLayout8 != null && (lineCount4 = staticLayout8.getLineCount()) > 0) {
                                    int i67 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i68 = 0; i68 < lineCount4; i68++) {
                                        i67 = (int) Math.min(i67, this.buttonLayout.getWidth() - this.buttonLayout.getLineRight(i68));
                                    }
                                    this.buttonLeft += i67;
                                }
                            } else {
                                StaticLayout staticLayout9 = this.nameLayout;
                                if (staticLayout9 != null && staticLayout9.getLineCount() > 0) {
                                    float lineRight = this.nameLayout.getLineRight(i14);
                                    if (this.nameLayoutEllipsizeByGradient) {
                                        lineRight = Math.min(this.nameWidth, lineRight);
                                    }
                                    if (lineRight == this.nameWidth) {
                                        double ceil4 = Math.ceil(this.nameLayout.getLineWidth(i14));
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
                                    this.nameMuteLeft = (int) (this.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
                                }
                                StaticLayout staticLayout10 = this.messageLayout;
                                if (staticLayout10 != null && (lineCount3 = staticLayout10.getLineCount()) > 0) {
                                    float f4 = 2.14748365E9f;
                                    for (int i69 = 0; i69 < lineCount3; i69++) {
                                        f4 = Math.min(f4, this.messageLayout.getLineLeft(i69));
                                    }
                                    this.messageLeft = (int) (this.messageLeft - f4);
                                }
                                StaticLayout staticLayout11 = this.buttonLayout;
                                if (staticLayout11 != null && (lineCount2 = staticLayout11.getLineCount()) > 0) {
                                    float f5 = 2.14748365E9f;
                                    for (int i70 = 0; i70 < lineCount2; i70++) {
                                        f5 = Math.min(f5, this.buttonLayout.getLineLeft(i70));
                                    }
                                    this.buttonLeft = (int) (this.buttonLeft - f5);
                                }
                                StaticLayout staticLayout12 = this.typingLayout;
                                if (staticLayout12 != null && (lineCount = staticLayout12.getLineCount()) > 0) {
                                    float f6 = 2.14748365E9f;
                                    for (int i71 = 0; i71 < lineCount; i71++) {
                                        f6 = Math.min(f6, this.typingLayout.getLineLeft(i71));
                                    }
                                    this.typingLeft = (int) (this.typingLeft - f6);
                                }
                                StaticLayout staticLayout13 = this.messageNameLayout;
                                if (staticLayout13 != null && staticLayout13.getLineCount() > 0) {
                                    this.messageNameLeft = (int) (this.messageNameLeft - this.messageNameLayout.getLineLeft(i14));
                                }
                            }
                            staticLayout2 = this.typingLayout;
                            if (staticLayout2 != null && this.printingStringType >= 0 && staticLayout2.getText().length() > 0) {
                                if (i13 < 0 && (i17 = i13 + 1) < this.typingLayout.getText().length()) {
                                    primaryHorizontal = this.typingLayout.getPrimaryHorizontal(i13);
                                    primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(i17);
                                } else {
                                    primaryHorizontal = this.typingLayout.getPrimaryHorizontal(i14);
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
                        ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                        charSequence35 = ellipsize;
                        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                        if (!this.useForceThreeLines) {
                        }
                        if (this.thumbsCount > 0) {
                            max += AndroidUtilities.dp(5.0f);
                        }
                        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence30 == null ? 1 : 2);
                        i16 = max;
                        this.spoilersPool.addAll(this.spoilers);
                        this.spoilers.clear();
                        StaticLayout staticLayout32 = this.messageLayout;
                        Stack stack2 = this.spoilersPool;
                        List list2 = this.spoilers;
                        i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        i13 = i7;
                        SpoilerEffect.addSpoilers(this, staticLayout32, -2, -2, stack2, list2);
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans222 = this.animatedEmojiStack;
                        Layout[] layoutArr222 = new Layout[1];
                        layoutArr222[i14] = this.messageLayout;
                        this.animatedEmojiStack = AnimatedEmojiSpan.update(i14, this, emojiGroupedSpans222, layoutArr222);
                        if (!LocaleController.isRTL) {
                        }
                        staticLayout2 = this.typingLayout;
                        if (staticLayout2 != null) {
                            if (i13 < 0) {
                            }
                            primaryHorizontal = this.typingLayout.getPrimaryHorizontal(i14);
                            primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(1);
                            if (primaryHorizontal >= primaryHorizontal2) {
                            }
                        }
                        updateThumbsPosition();
                    }
                }
                i14 = 0;
                ellipsize = TextUtils.ellipsize(charSequence32, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                charSequence35 = ellipsize;
                alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                if (!this.useForceThreeLines) {
                }
                if (this.thumbsCount > 0) {
                }
                this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence30 == null ? 1 : 2);
                i16 = max;
                this.spoilersPool.addAll(this.spoilers);
                this.spoilers.clear();
                StaticLayout staticLayout322 = this.messageLayout;
                Stack stack22 = this.spoilersPool;
                List list22 = this.spoilers;
                i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i13 = i7;
                SpoilerEffect.addSpoilers(this, staticLayout322, -2, -2, stack22, list22);
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2222 = this.animatedEmojiStack;
                Layout[] layoutArr2222 = new Layout[1];
                layoutArr2222[i14] = this.messageLayout;
                this.animatedEmojiStack = AnimatedEmojiSpan.update(i14, this, emojiGroupedSpans2222, layoutArr2222);
                if (!LocaleController.isRTL) {
                }
                staticLayout2 = this.typingLayout;
                if (staticLayout2 != null) {
                }
                updateThumbsPosition();
            }
            charSequence35 = charSequence32;
        }
        i14 = 0;
        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        if (!this.useForceThreeLines) {
        }
        if (this.thumbsCount > 0) {
        }
        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence35, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence30 == null ? 1 : 2);
        i16 = max;
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        StaticLayout staticLayout3222 = this.messageLayout;
        Stack stack222 = this.spoilersPool;
        List list222 = this.spoilers;
        i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        i13 = i7;
        SpoilerEffect.addSpoilers(this, staticLayout3222, -2, -2, stack222, list222);
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22222 = this.animatedEmojiStack;
        Layout[] layoutArr22222 = new Layout[1];
        layoutArr22222[i14] = this.messageLayout;
        this.animatedEmojiStack = AnimatedEmojiSpan.update(i14, this, emojiGroupedSpans22222, layoutArr22222);
        if (!LocaleController.isRTL) {
        }
        staticLayout2 = this.typingLayout;
        if (staticLayout2 != null) {
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
        return (isDialogFolder() || (chat = this.chat) == null || (!chat.forum && (!ChatObject.isMonoForum(chat) || !ChatObject.canManageMonoForum(this.currentAccount, this.chat))) || this.isTopic) ? false : true;
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
                    Theme.dialogs_clockDrawable.setAlpha(NotificationCenter.invalidateMotionBackground);
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
                        Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.invalidateMotionBackground);
                    }
                    if (z4 || f == 0.0f) {
                        return;
                    }
                    canvas.restore();
                    Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.invalidateMotionBackground);
                    Theme.dialogs_checkReadDrawable.setAlpha(NotificationCenter.invalidateMotionBackground);
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
                    Theme.dialogs_checkDrawable.setAlpha(NotificationCenter.invalidateMotionBackground);
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

    /* JADX WARN: Code restructure failed: missing block: B:263:0x04b9, code lost:
    
        if (r43.reactionMentionCount == r15) goto L273;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x04f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean update(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        long j;
        MessageObject messageObject;
        boolean z7;
        boolean z8;
        TLRPC.User user;
        int dp;
        TLRPC.Chat chat;
        boolean z9;
        int i3;
        TLRPC.Chat chat2;
        boolean z10;
        MessageObject messageObject2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TLRPC.Chat chat3;
        MessageObject messageObject3;
        long j2;
        boolean isForumCell = isForumCell();
        int i9 = 0;
        this.drawAvatarSelector = false;
        this.ttlPeriod = 0;
        CustomDialog customDialog = this.customDialog;
        if (customDialog != null) {
            this.lastMessageDate = customDialog.date;
            int i10 = customDialog.unread_count;
            this.lastUnreadState = i10 != 0;
            this.unreadCount = i10;
            this.drawPin = customDialog.pinned;
            this.dialogMuted = customDialog.muted;
            this.hasUnmutedTopics = false;
            this.avatarDrawable.setInfo(customDialog.id, customDialog.name, null);
            if (this.isShareToStoryCell) {
                this.avatarImage.setImage(null, "50_50", this.repostStoryDrawable, null, 0L);
            } else {
                this.avatarImage.setImage(null, "50_50", this.avatarDrawable, null, 0L);
            }
            int i11 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                if (i11 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i11].setImageBitmap((Drawable) null);
                i11++;
            }
            this.drawMonoforumAvatar = false;
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(28.0f));
            this.drawUnmute = false;
            z6 = isForumCell;
            z7 = false;
            z5 = false;
        } else {
            int i12 = this.unreadCount;
            boolean z11 = this.reactionMentionCount != 0;
            boolean z12 = this.markUnread;
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
                            int[] forumUnreadCount = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat4.id);
                            this.unreadCount = forumUnreadCount[0];
                            this.mentionCount = forumUnreadCount[1];
                            this.reactionMentionCount = forumUnreadCount[2];
                            this.hasUnmutedTopics = forumUnreadCount[3] != 0;
                            this.pollVotesMentionCount = 0;
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            this.unreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                            this.mentionCount = 0;
                            this.reactionMentionCount = 0;
                            this.pollVotesMentionCount = 0;
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
                        int i13 = this.dialogsType;
                        if (i13 == 7 || i13 == 8) {
                            MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType == 8 ? (char) 1 : (char) 0];
                            this.drawPin = dialogFilter != null && dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0;
                        } else {
                            this.drawPin = this.currentDialogFolderId == 0 && dialog.pinned;
                        }
                        MessageObject messageObject6 = this.message;
                        if (messageObject6 != null) {
                            this.lastSendState = messageObject6.messageOwner.send_state;
                        }
                    }
                } else {
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
                if (this.tags.update(this.currentAccount, this.dialogsType, this.currentDialogId)) {
                    if (isEmpty != this.tags.isEmpty()) {
                        z3 = true;
                        z4 = true;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    i2 = 1;
                    if (i == 0) {
                        TLRPC.User user2 = this.user;
                        if (user2 != null && !MessagesController.isSupportUser(user2) && !this.user.bot && (i & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id));
                            if (this.wasDrawnOnline != isOnline()) {
                                i2 = 1;
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
                                i2 = 1;
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
                                i2 = 1;
                            }
                            if (j2 != 0) {
                                z10 = !this.drawBotVerified;
                                this.botVerification.set(j2, z);
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
                        if (!z10 && (i & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.user == null) {
                            z10 = true;
                        }
                        if (!z10) {
                            MessageObject messageObject7 = this.message;
                            if (messageObject7 != null && this.lastUnreadState != messageObject7.isUnread()) {
                                this.lastUnreadState = this.message.isUnread();
                                z10 = true;
                            }
                            if (this.isDialogCell) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                                TLRPC.Chat chat7 = dialog2 == null ? null : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog2.id));
                                if (chat7 != null && (chat7.forum || (chat7.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat7)))) {
                                    z6 = z2;
                                    int[] forumUnreadCount2 = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat7.id);
                                    i6 = forumUnreadCount2[0];
                                    i8 = forumUnreadCount2[1];
                                    int i14 = forumUnreadCount2[2];
                                    this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                    i7 = i14;
                                } else {
                                    z6 = z2;
                                    if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                        i6 = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                    } else if (dialog2 != null) {
                                        i6 = dialog2.unread_count;
                                        int i15 = dialog2.unread_mentions_count;
                                        i7 = dialog2.unread_reactions_count;
                                        i9 = dialog2.unread_poll_votes_count;
                                        i8 = i15;
                                    } else {
                                        i9 = 0;
                                        i6 = 0;
                                    }
                                    i7 = 0;
                                    i8 = 0;
                                }
                                int i16 = ChatObject.isMonoForum(chat7) ? 0 : i8;
                                if (dialog2 != null) {
                                    if (this.unreadCount == i6) {
                                        z5 = z4;
                                        if (this.markUnread == dialog2.unread_mark) {
                                            if (this.mentionCount == i16) {
                                            }
                                        }
                                    } else {
                                        z5 = z4;
                                    }
                                    this.unreadCount = i6;
                                    this.mentionCount = i16;
                                    this.markUnread = dialog2.unread_mark;
                                    this.reactionMentionCount = i7;
                                    this.pollVotesMentionCount = i9;
                                    z10 = true;
                                } else {
                                    z5 = z4;
                                }
                                if (!z10 && (i & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject2 = this.message) != null) {
                                    i4 = this.lastSendState;
                                    i5 = messageObject2.messageOwner.send_state;
                                    if (i4 != i5) {
                                        this.lastSendState = i5;
                                        z10 = true;
                                    }
                                }
                                if (!z10) {
                                    invalidate();
                                    return z3;
                                }
                            }
                        }
                        z5 = z4;
                        z6 = z2;
                        if (!z10) {
                            i4 = this.lastSendState;
                            i5 = messageObject2.messageOwner.send_state;
                            if (i4 != i5) {
                            }
                        }
                        if (!z10) {
                        }
                    } else {
                        z5 = z4;
                        z6 = z2;
                    }
                    this.user = null;
                    this.chat = null;
                    this.encryptedChat = null;
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
                                if (z || ((i12 == this.unreadCount && z12 == this.markUnread) || (this.isDialogCell && System.currentTimeMillis() - this.lastDialogChangedTime <= 100))) {
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
                                    if ((i12 == 0 || this.markUnread) && (this.markUnread || !z12)) {
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
                                        String format = String.format("%d", Integer.valueOf(i12));
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
                                                    i3 = 1;
                                                } else {
                                                    z9 = z3;
                                                    i3 = 1;
                                                    spannableStringBuilder3.setSpan(new EmptyStubSpan(), i17, i17 + 1, 0);
                                                }
                                                i17 += i3;
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
                                    this.countAnimationIncrement = this.unreadCount > i12;
                                    this.countAnimator.start();
                                }
                                this.animatorPollVotesMentionVisible.setValue(this.pollVotesMentionCount != 0, z);
                                boolean z13 = this.reactionMentionCount != 0;
                                if (!z && z13 != z11) {
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
                                ImageReceiver imageReceiver = this.avatarImage;
                                if (z8) {
                                    dp = 1;
                                } else {
                                    TLRPC.Chat chat10 = this.chat;
                                    dp = AndroidUtilities.dp(((chat10 == null || !chat10.forum || this.currentDialogFolderId != 0 || this.useFromUserAsAvatar) && (this.isSavedDialog || (user = this.user) == null || !user.self || !MessagesController.getInstance(this.currentAccount).savedViewAsChats)) ? 28.0f : 16.0f);
                                }
                                imageReceiver.setRoundRadius(dp);
                                i9 = i2;
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
                    ImageReceiver imageReceiver2 = this.avatarImage;
                    if (z8) {
                    }
                    imageReceiver2.setRoundRadius(dp);
                    i9 = i2;
                }
            } else {
                z2 = isForumCell;
            }
            z3 = false;
            z4 = false;
            i2 = 0;
            if (i == 0) {
            }
            this.user = null;
            this.chat = null;
            this.encryptedChat = null;
            if (this.currentDialogFolderId == 0) {
            }
            if (j != 0) {
            }
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
            ImageReceiver imageReceiver22 = this.avatarImage;
            if (z8) {
            }
            imageReceiver22.setRoundRadius(dp);
            i9 = i2;
        }
        boolean z14 = (this.isTopic || (getMeasuredWidth() == 0 && getMeasuredHeight() == 0)) ? z5 : true;
        if (i9 == 0) {
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
        if (z14) {
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

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0d3c, code lost:
    
        if (r3.lastKnownTypingType >= 0) goto L419;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0ce3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0de6  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0ff5  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x10d0  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x113a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x1146 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x11a0  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x11c5  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x11dd  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x13a3  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x140b  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x1656  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x17db  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1809  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x181d  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x1842  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x185c  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x18a3  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x18d1  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x18dc  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x18ed  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1949  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x1952  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1959  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x19ac  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x1a2c  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x1a7a  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1ad7  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x1b08  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x1b5e  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x1b72  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x1bb6  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x1bbe  */
    /* JADX WARN: Removed duplicated region for block: B:641:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x1bb8  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x1b96  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x1b31  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x1adf  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x1af0  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x183c  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x145b  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x162f  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x1632  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x15d8  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x15e4  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x15e7  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x15e0  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x13ad  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x1232  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x11a3  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x1246  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x1298  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x10c4  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x0ff0  */
    /* JADX WARN: Removed duplicated region for block: B:876:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:899:0x0ddf  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v43 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        int color;
        int color2;
        int i;
        String string;
        float f;
        int i2;
        String str;
        int i3;
        RLottieDrawable rLottieDrawable;
        float f2;
        float f3;
        Canvas canvas2;
        float f4;
        ?? r12;
        int i4;
        float f5;
        boolean z;
        boolean z2;
        float f6;
        boolean z3;
        boolean z4;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int i5;
        float f7;
        int i6;
        boolean z5;
        int i7;
        int i8;
        float f8;
        int i9;
        int i10;
        Canvas canvas3;
        Canvas canvas4;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        int i15;
        Canvas canvas5;
        int i16;
        boolean z6;
        int i17;
        float f10;
        Drawable drawable;
        Drawable drawable2;
        int i18;
        boolean z7;
        DialogCellTags dialogCellTags;
        char c;
        float dp;
        float f11;
        StaticLayout staticLayout;
        int i19;
        int i20;
        float f12;
        float f13;
        DialogUpdateHelper dialogUpdateHelper;
        float f14;
        StaticLayout staticLayout2;
        float f15;
        int i21;
        StaticLayout staticLayout3;
        StaticLayout staticLayout4;
        Drawable drawable3;
        CustomDialog customDialog;
        int i22;
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        TLRPC.TL_forumTopic tL_forumTopic3;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic4;
        float f16 = 12.0f;
        float f17 = 12.5f;
        if ((this.currentDialogId == 0 && this.customDialog == null) || !this.visibleOnScreen) {
            return;
        }
        boolean z8 = this.drawArchive;
        if (z8 && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic4 = this.forumTopic) != null && tL_forumTopic4.id == 1)) && (pullForegroundDrawable2 = this.archivedChatsDrawable) != null && pullForegroundDrawable2.outProgress == 0.0f && this.translationX == 0.0f)) {
            canvas.save();
            canvas.translate(0.0f, (-this.translateY) - this.rightFragmentOffset);
            canvas.clipRect(0.0f, getMeasuredHeight() * (1.0f - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas);
            canvas.restore();
            this.emojiStatusView.setVisibility(4);
            return;
        }
        boolean z9 = z8 && (this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic3 = this.forumTopic) != null && tL_forumTopic3.id == 1)) && this.archivedChatsDrawable != null && this.translationX == 0.0f && (dialogsActivity = this.parentFragment) != null && dialogsActivity.hasHiddenArchive() && ((rightSlidingDialogContainer = this.parentFragment.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment());
        PullForegroundDrawable pullForegroundDrawable3 = this.archivedChatsDrawable;
        float pullProgress = pullForegroundDrawable3 != null ? pullForegroundDrawable3.getPullProgress() : 1.0f;
        if (z9) {
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
                String str2 = this.overrideSwipeActionStringKey;
                i = this.overrideSwipeActionStringId;
                string = LocaleController.getString(str2, i);
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
                if (SharedConfig.getChatSwipeAction(this.currentAccount) == 3) {
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
            int i23 = color2;
            if (this.swipeCanceled && (rLottieDrawable = this.lastDrawTranslationDrawable) != null) {
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
            if (this.currentRevealProgress < 1.0f) {
                Theme.dialogs_pinnedPaint.setColor(color);
                f = measuredWidth;
                i2 = i;
                str = string;
                i3 = i23;
                canvas.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                if (this.currentRevealProgress == 0.0f) {
                    if (Theme.dialogs_archiveDrawableRecolored) {
                        Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                        Theme.dialogs_archiveDrawableRecolored = false;
                    }
                    if (Theme.dialogs_hidePsaDrawableRecolored) {
                        Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                        RLottieDrawable rLottieDrawable2 = Theme.dialogs_hidePsaDrawable;
                        int i24 = Theme.key_chats_archiveBackground;
                        rLottieDrawable2.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i24));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i24));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i24));
                        Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                        Theme.dialogs_hidePsaDrawableRecolored = false;
                    }
                }
            } else {
                f = measuredWidth;
                i2 = i;
                str = string;
                i3 = i23;
            }
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.translationDrawable.getIntrinsicWidth() / 2);
            int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
            int intrinsicWidth = (this.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
            int intrinsicHeight = (this.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
            if (this.currentRevealProgress > 0.0f) {
                canvas.save();
                canvas.clipRect(f - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Theme.dialogs_pinnedPaint.setColor(i3);
                canvas.drawCircle(intrinsicWidth, intrinsicHeight, ((float) Math.sqrt((intrinsicWidth * intrinsicWidth) + ((intrinsicHeight - getMeasuredHeight()) * (intrinsicHeight - getMeasuredHeight())))) * AndroidUtilities.accelerateInterpolator.getInterpolation(this.currentRevealProgress), Theme.dialogs_pinnedPaint);
                canvas.restore();
                if (!Theme.dialogs_archiveDrawableRecolored) {
                    Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                    Theme.dialogs_archiveDrawableRecolored = true;
                }
                if (!Theme.dialogs_hidePsaDrawableRecolored) {
                    Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                    RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                    int i25 = Theme.key_chats_archivePinBackground;
                    rLottieDrawable3.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i25));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i25));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i25));
                    Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                    Theme.dialogs_hidePsaDrawableRecolored = true;
                }
            }
            canvas.save();
            canvas.translate(measuredWidth2, measuredHeight);
            float f18 = this.currentRevealBounceProgress;
            if (f18 != 0.0f && f18 != 1.0f) {
                float interpolation = this.interpolator.getInterpolation(f18) + 1.0f;
                canvas.scale(interpolation, interpolation, this.translationDrawable.getIntrinsicWidth() / 2, this.translationDrawable.getIntrinsicHeight() / 2);
            }
            BaseCell.setDrawableBounds((Drawable) this.translationDrawable, 0, 0);
            this.translationDrawable.draw(canvas);
            canvas.restore();
            canvas.clipRect(f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            String str3 = str;
            int ceil = (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str3));
            int i26 = i2;
            if (this.swipeMessageTextId != i26 || this.swipeMessageWidth != getMeasuredWidth()) {
                this.swipeMessageTextId = i26;
                this.swipeMessageWidth = getMeasuredWidth();
                TextPaint textPaint = Theme.dialogs_archiveTextPaint;
                int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                StaticLayout staticLayout5 = new StaticLayout(str3, textPaint, min, alignment, 1.0f, 0.0f, false);
                this.swipeMessageTextLayout = staticLayout5;
                if (staticLayout5.getLineCount() > 1) {
                    this.swipeMessageTextLayout = new StaticLayout(str3, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                }
            }
            if (this.swipeMessageTextLayout != null) {
                canvas.save();
                canvas.translate((getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.swipeMessageTextLayout.getWidth() / 2.0f), measuredHeight + AndroidUtilities.dp(36.0f) + (this.swipeMessageTextLayout.getLineCount() > 1 ? -AndroidUtilities.dp(4.0f) : 0.0f));
                this.swipeMessageTextLayout.draw(canvas);
                canvas.restore();
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
            f2 = this.translationX + 0.0f;
        } else {
            f2 = 0.0f;
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
            f3 = this.collapseOffset + 0.0f;
        } else {
            f3 = 0.0f;
        }
        float f19 = this.rightFragmentOpenedProgress;
        if (f19 != 1.0f) {
            if (f19 != 0.0f) {
                float clamp = Utilities.clamp(f19 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    i5 = 2;
                    i22 = canvas.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.rightFragmentOpenedProgress) * 255.0f), 31);
                } else {
                    i5 = 2;
                    int save = canvas.save();
                    canvas.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i22 = save;
                }
                canvas.translate((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress, 0.0f);
                f7 = f2 + ((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress);
                i6 = i22;
            } else {
                i5 = 2;
                f7 = f2;
                i6 = -1;
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
                float f20 = this.cornerProgress;
                if (f20 < 1.0f) {
                    float f21 = f20 + 0.10666667f;
                    this.cornerProgress = f21;
                    if (f21 > 1.0f) {
                        this.cornerProgress = 1.0f;
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
                        float[] fArr = new float[i5];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{-1, 0}, fArr, Shader.TileMode.CLAMP));
                        this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (this.fadePaintBack == null) {
                        Paint paint2 = new Paint();
                        this.fadePaintBack = paint2;
                        float[] fArr2 = new float[i5];
                        // fill-array-data instruction
                        fArr2[0] = 0.0f;
                        fArr2[1] = 1.0f;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, -1}, fArr2, Shader.TileMode.CLAMP));
                        this.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), NotificationCenter.invalidateMotionBackground, 31);
                    int i27 = this.nameLeft;
                    canvas.clipRect(i27, 0, this.nameWidth + i27, getMeasuredHeight());
                }
                if (this.currentDialogFolderId != 0) {
                    TextPaint textPaint2 = Theme.dialogs_namePaint[this.paintIndex];
                    int color3 = Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider);
                    textPaint2.linkColor = color3;
                    textPaint2.setColor(color3);
                } else if (this.encryptedChat != null || ((customDialog = this.customDialog) != null && customDialog.type == i5)) {
                    TextPaint textPaint3 = Theme.dialogs_namePaint[this.paintIndex];
                    int color4 = Theme.getColor(Theme.key_chats_secretName, this.resourcesProvider);
                    textPaint3.linkColor = color4;
                    textPaint3.setColor(color4);
                } else {
                    TextPaint textPaint4 = Theme.dialogs_namePaint[this.paintIndex];
                    int color5 = Theme.getColor(Theme.key_chats_name, this.resourcesProvider);
                    textPaint4.linkColor = color5;
                    textPaint4.setColor(color5);
                }
                canvas.save();
                canvas.translate(this.nameLeft + this.nameLayoutTranslateX, dp3);
                SpoilerEffect.layoutDrawMaybe(this.nameLayout, canvas);
                StaticLayout staticLayout6 = this.nameLayout;
                int i28 = i6;
                i9 = -1;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, this.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(0, staticLayout6.getPaint().getColor()));
                canvas.restore();
                if (!this.nameLayoutEllipsizeByGradient || this.nameLayoutFits) {
                    i7 = i28;
                    i8 = 1;
                    f8 = 0.0f;
                    i5 = 2;
                } else {
                    canvas.save();
                    if (this.nameLayoutEllipsizeLeft) {
                        canvas.translate(this.nameLeft, 0.0f);
                        i7 = i28;
                        i5 = 2;
                        i8 = 1;
                        f8 = 0.0f;
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaint);
                    } else {
                        i7 = i28;
                        i8 = 1;
                        f8 = 0.0f;
                        i5 = 2;
                        canvas.translate((this.nameLeft + this.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaintBack);
                    }
                    canvas.restore();
                    canvas.restore();
                }
            } else {
                i7 = i6;
                i8 = 1;
                f8 = 0.0f;
                i9 = -1;
            }
            if (this.timeLayout == null || this.currentDialogFolderId != 0) {
                i10 = i7;
                canvas3 = canvas;
            } else {
                canvas.save();
                canvas.translate(this.timeLeft, this.timeTop);
                TextPaint timeTextPaint = getTimeTextPaint();
                if (getIsPinned()) {
                    canvas.translate(AndroidUtilities.dp(20.0f), f8);
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
                    drawable4.setBounds(dp5, dp4, drawable4.getIntrinsicWidth() + dp5, dp4 + drawable4.getIntrinsicHeight());
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    i10 = i7;
                    canvas3 = canvas;
                    canvas.drawRoundRect(f24, height, width, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable4.draw(canvas3);
                } else {
                    i10 = i7;
                    canvas3 = canvas;
                }
                int color6 = this.timeLayout.getPaint().getColor();
                boolean z10 = color6 != timeTextPaint.getColor();
                if (z10) {
                    this.timeLayout.getPaint().setColor(timeTextPaint.getColor());
                }
                SpoilerEffect.layoutDrawMaybe(this.timeLayout, canvas3);
                if (z10) {
                    this.timeLayout.getPaint().setColor(color6);
                }
                canvas.restore();
            }
            if (drawLock2()) {
                Theme.dialogs_lock2Drawable.setBounds(this.lock2Left, this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i5), this.lock2Left + Theme.dialogs_lock2Drawable.getIntrinsicWidth(), this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i5) + Theme.dialogs_lock2Drawable.getIntrinsicHeight());
                Theme.dialogs_lock2Drawable.draw(canvas3);
            }
            if (this.messageNameLayout == null || isForumCell()) {
                canvas4 = canvas3;
                i11 = i10;
                i12 = 2;
                f9 = 0.0f;
                i13 = 1;
            } else {
                if (this.currentDialogFolderId != 0) {
                    TextPaint textPaint5 = Theme.dialogs_messageNamePaint;
                    int color7 = Theme.getColor(Theme.key_chats_nameMessageArchived_threeLines, this.resourcesProvider);
                    textPaint5.linkColor = color7;
                    textPaint5.setColor(color7);
                } else if (this.draftMessage != null) {
                    TextPaint textPaint6 = Theme.dialogs_messageNamePaint;
                    int color8 = Theme.getColor(Theme.key_chats_draft, this.resourcesProvider);
                    textPaint6.linkColor = color8;
                    textPaint6.setColor(color8);
                } else {
                    TextPaint textPaint7 = Theme.dialogs_messageNamePaint;
                    int color9 = Theme.getColor(Theme.key_chats_nameMessage_threeLines, this.resourcesProvider);
                    textPaint7.linkColor = color9;
                    textPaint7.setColor(color9);
                }
                canvas.save();
                canvas3.translate(this.messageNameLeft, this.messageNameTop);
                try {
                    SpoilerEffect.layoutDrawMaybe(this.messageNameLayout, canvas3);
                    staticLayout4 = this.messageNameLayout;
                    i13 = 1;
                    f9 = 0.0f;
                    i12 = 2;
                    canvas4 = canvas3;
                    i11 = i10;
                } catch (Exception e) {
                    e = e;
                    canvas4 = canvas3;
                    i11 = i10;
                    i12 = 2;
                    f9 = 0.0f;
                    i13 = 1;
                }
                try {
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, this.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i8, staticLayout4.getPaint().getColor()));
                } catch (Exception e2) {
                    e = e2;
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
                    if (this.dialogsType == i16) {
                    }
                    if (this.drawVerified) {
                    }
                    z = false;
                    if (!this.drawReorder) {
                    }
                    if (!LocaleController.isRTL) {
                    }
                    Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                    Theme.dialogs_reorderDrawable.draw(canvas5);
                    float floatValue = this.animatorPollVotesMentionVisible.getFloatValue();
                    if (this.drawError) {
                    }
                    canvas2 = canvas5;
                    i4 = 1;
                    if (this.thumbsCount > 0) {
                    }
                    i18 = -1;
                    z7 = false;
                    dialogCellTags = this.tags;
                    if (dialogCellTags != null) {
                    }
                    if (i15 != i18) {
                    }
                    z2 = z5;
                    r12 = z7;
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
                    if (z9) {
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
            if (this.messageLayout == null) {
                if (this.currentDialogFolderId != 0) {
                    if (this.chat != null) {
                        TextPaint textPaint8 = Theme.dialogs_messagePaint[this.paintIndex];
                        int color10 = Theme.getColor(Theme.key_chats_nameMessageArchived, this.resourcesProvider);
                        textPaint8.linkColor = color10;
                        textPaint8.setColor(color10);
                    } else {
                        TextPaint textPaint9 = Theme.dialogs_messagePaint[this.paintIndex];
                        int color11 = Theme.getColor(Theme.key_chats_messageArchived, this.resourcesProvider);
                        textPaint9.linkColor = color11;
                        textPaint9.setColor(color11);
                    }
                } else {
                    TextPaint textPaint10 = Theme.dialogs_messagePaint[this.paintIndex];
                    int color12 = Theme.getColor(Theme.key_chats_message, this.resourcesProvider);
                    textPaint10.linkColor = color12;
                    textPaint10.setColor(color12);
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
                            staticLayout3 = this.messageLayout;
                            i21 = alpha2;
                            f13 = 1.0f;
                        } catch (Exception e3) {
                            e = e3;
                            i21 = alpha2;
                            f13 = 1.0f;
                        }
                        try {
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, this.animatedEmojiStack, -0.075f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i12, staticLayout3.getPaint().getColor()));
                            canvas.restore();
                            for (int i29 = 0; i29 < this.spoilers.size(); i29 += i13) {
                                SpoilerEffect spoilerEffect = (SpoilerEffect) this.spoilers.get(i29);
                                spoilerEffect.setColor(this.messageLayout.getPaint().getColor());
                                spoilerEffect.draw(canvas4);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            FileLog.e(e);
                            this.messageLayout.getPaint().setAlpha(i21);
                            canvas.restore();
                            canvas.save();
                            dialogUpdateHelper = this.updateHelper;
                            if (!dialogUpdateHelper.typingOutToTop) {
                            }
                            if (!this.useForceThreeLines) {
                                f14 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                canvas4.translate(this.typingLeft, f14);
                                staticLayout2 = this.typingLayout;
                                if (staticLayout2 != null) {
                                    int alpha3 = staticLayout2.getPaint().getAlpha();
                                    this.typingLayout.getPaint().setAlpha((int) (alpha3 * this.updateHelper.typingProgres));
                                    this.typingLayout.draw(canvas4);
                                    this.typingLayout.getPaint().setAlpha(alpha3);
                                }
                                canvas.restore();
                                if (this.typingLayout != null) {
                                }
                                i14 = 4;
                                if (this.buttonLayout == null) {
                                }
                                if (this.currentDialogFolderId == 0) {
                                }
                                if (this.drawBotVerified) {
                                }
                                if (this.drawUnmute) {
                                }
                                if (this.dialogsType == i16) {
                                }
                                if (this.drawVerified) {
                                }
                                z = false;
                                if (!this.drawReorder) {
                                }
                                if (!LocaleController.isRTL) {
                                }
                                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                Theme.dialogs_reorderDrawable.draw(canvas5);
                                float floatValue2 = this.animatorPollVotesMentionVisible.getFloatValue();
                                if (this.drawError) {
                                }
                                canvas2 = canvas5;
                                i4 = 1;
                                if (this.thumbsCount > 0) {
                                }
                                i18 = -1;
                                z7 = false;
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null) {
                                }
                                if (i15 != i18) {
                                }
                                z2 = z5;
                                r12 = z7;
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
                                if (z9) {
                                }
                                z3 = this.drawReorder;
                                if (!z3) {
                                }
                                if (z3) {
                                }
                                if (!this.archiveHidden) {
                                }
                            }
                            f14 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            canvas4.translate(this.typingLeft, f14);
                            staticLayout2 = this.typingLayout;
                            if (staticLayout2 != null) {
                            }
                            canvas.restore();
                            if (this.typingLayout != null) {
                            }
                            i14 = 4;
                            if (this.buttonLayout == null) {
                            }
                            if (this.currentDialogFolderId == 0) {
                            }
                            if (this.drawBotVerified) {
                            }
                            if (this.drawUnmute) {
                            }
                            if (this.dialogsType == i16) {
                            }
                            if (this.drawVerified) {
                            }
                            z = false;
                            if (!this.drawReorder) {
                            }
                            if (!LocaleController.isRTL) {
                            }
                            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                            Theme.dialogs_reorderDrawable.draw(canvas5);
                            float floatValue22 = this.animatorPollVotesMentionVisible.getFloatValue();
                            if (this.drawError) {
                            }
                            canvas2 = canvas5;
                            i4 = 1;
                            if (this.thumbsCount > 0) {
                            }
                            i18 = -1;
                            z7 = false;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                            }
                            if (i15 != i18) {
                            }
                            z2 = z5;
                            r12 = z7;
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
                            if (z9) {
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
                        i21 = alpha2;
                        f13 = 1.0f;
                        SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                        StaticLayout staticLayout7 = this.messageLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout7, this.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i12, staticLayout7.getPaint().getColor()));
                    }
                    this.messageLayout.getPaint().setAlpha(i21);
                    canvas.restore();
                } else {
                    f13 = 1.0f;
                }
                canvas.save();
                dialogUpdateHelper = this.updateHelper;
                if (!dialogUpdateHelper.typingOutToTop) {
                    f14 = this.messageTop + ((f13 - dialogUpdateHelper.typingProgres) * dp6);
                } else {
                    f14 = this.messageTop - ((f13 - dialogUpdateHelper.typingProgres) * dp6);
                }
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    f14 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                }
                canvas4.translate(this.typingLeft, f14);
                staticLayout2 = this.typingLayout;
                if (staticLayout2 != null && this.updateHelper.typingProgres > f9) {
                    int alpha32 = staticLayout2.getPaint().getAlpha();
                    this.typingLayout.getPaint().setAlpha((int) (alpha32 * this.updateHelper.typingProgres));
                    this.typingLayout.draw(canvas4);
                    this.typingLayout.getPaint().setAlpha(alpha32);
                }
                canvas.restore();
                if (this.typingLayout != null) {
                    int i30 = this.printingStringType;
                    if (i30 < 0) {
                        DialogUpdateHelper dialogUpdateHelper3 = this.updateHelper;
                        if (dialogUpdateHelper3.typingProgres > f9) {
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
                            f15 = this.messageTop + (dp6 * (f13 - dialogUpdateHelper4.typingProgres));
                        } else {
                            f15 = this.messageTop - (dp6 * (f13 - dialogUpdateHelper4.typingProgres));
                        }
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            f15 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                        }
                        i14 = 4;
                        if (i30 == i13 || i30 == 4) {
                            canvas4.translate(this.statusDrawableLeft, f15 + (i30 == i13 ? AndroidUtilities.dp(f13) : 0));
                        } else {
                            canvas4.translate(this.statusDrawableLeft, f15 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
                        }
                        chatStatusDrawable.draw(canvas4);
                        invalidate();
                        canvas.restore();
                    }
                }
                i14 = 4;
            } else {
                i14 = 4;
            }
            if (this.buttonLayout == null) {
                canvas.save();
                if (this.buttonBackgroundPaint == null) {
                    this.buttonBackgroundPaint = new Paint(i13);
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
                if (this.lastTopicMessageUnread && this.topMessageTopicEndIndex != this.topMessageTopicStartIndex && ((i19 = this.dialogsType) == 0 || i19 == 7 || i19 == 8)) {
                    this.canvasButton.setColor(ColorUtils.setAlphaComponent(this.currentMessagePaint.getColor(), Theme.isCurrentThemeDark() ? 36 : 26));
                    if (!this.buttonCreated) {
                        this.canvasButton.rewind();
                        int i31 = this.topMessageTopicEndIndex;
                        if (i31 == this.topMessageTopicStartIndex || i31 <= 0) {
                            i20 = 0;
                        } else {
                            float f25 = this.messageTop;
                            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                f25 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            }
                            RectF rectF = AndroidUtilities.rectTmp;
                            i20 = 0;
                            float dp7 = this.messageLeft + AndroidUtilities.dp(2.0f) + this.messageLayout.getPrimaryHorizontal(0);
                            float f26 = this.messageLeft;
                            StaticLayout staticLayout8 = this.messageLayout;
                            rectF.set(dp7, f25, (f26 + staticLayout8.getPrimaryHorizontal(Math.min(staticLayout8.getText().length(), this.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), this.buttonTop - AndroidUtilities.dp(4.0f));
                            rectF.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                            if (rectF.right > rectF.left) {
                                this.canvasButton.addRect(rectF);
                            }
                        }
                        float lineLeft = this.buttonLayout.getLineLeft(i20);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(this.buttonLeft + lineLeft + AndroidUtilities.dp(2.0f), this.buttonTop + AndroidUtilities.dp(2.0f), this.buttonLeft + lineLeft + this.buttonLayout.getLineWidth(i20) + AndroidUtilities.dp(12.0f), this.buttonTop + this.buttonLayout.getHeight());
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
                        staticLayout = this.buttonLayout;
                    } catch (Exception e5) {
                        e = e5;
                    }
                    try {
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout, this.animatedEmojiStack3, -0.075f, this.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout.getPaint().getColor()));
                        canvas.restore();
                        for (int i32 = 0; i32 < this.spoilers2.size(); i32 += i13) {
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
                        if (this.dialogsType == i16) {
                        }
                        if (this.drawVerified) {
                        }
                        z = false;
                        if (!this.drawReorder) {
                        }
                        if (!LocaleController.isRTL) {
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas5);
                        float floatValue222 = this.animatorPollVotesMentionVisible.getFloatValue();
                        if (this.drawError) {
                        }
                        canvas2 = canvas5;
                        i4 = 1;
                        if (this.thumbsCount > 0) {
                        }
                        i18 = -1;
                        z7 = false;
                        dialogCellTags = this.tags;
                        if (dialogCellTags != null) {
                        }
                        if (i15 != i18) {
                        }
                        z2 = z5;
                        r12 = z7;
                        if (this.animatingArchiveAvatar) {
                        }
                        if (this.drawAvatar) {
                            if (!this.drawMonoforumAvatar) {
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
                            canvas2.clipRect(f5, getMeasuredHeight() * (f4 - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
                            this.archivedChatsDrawable.draw(canvas2);
                            canvas.restore();
                        }
                        if (this.useSeparator) {
                        }
                        if (this.clipProgress != f5) {
                        }
                        if (z9) {
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
            if (this.currentDialogFolderId == 0) {
                int i33 = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                int i34 = this.lastStatusDrawableParams;
                if (i34 >= 0 && i34 != i33 && !this.statusDrawableAnimationInProgress) {
                    createStatusDrawableAnimator(i34, i33);
                }
                boolean z11 = this.statusDrawableAnimationInProgress;
                if (z11) {
                    i33 = this.animateToStatusDrawableParams;
                }
                boolean z12 = (i33 & 1) != 0;
                boolean z13 = (i33 & 2) != 0;
                boolean z14 = (i33 & i14) != 0;
                if (z11) {
                    int i35 = this.animateFromStatusDrawableParams;
                    boolean z15 = (i35 & 1) != 0;
                    boolean z16 = (i35 & 2) != 0;
                    boolean z17 = (i35 & i14) != 0;
                    if (!z12 && !z15 && z17 && !z16 && z13 && z14) {
                        i15 = i11;
                        drawCheckStatus(canvas, z12, z13, z14, true, this.statusDrawableProgress);
                        canvas5 = canvas4;
                        f4 = 1.0f;
                        i16 = 2;
                        f5 = 0.0f;
                    } else {
                        i15 = i11;
                        boolean z18 = z15;
                        i16 = 2;
                        boolean z19 = z16;
                        f5 = 0.0f;
                        boolean z20 = z17;
                        f4 = 1.0f;
                        canvas5 = canvas4;
                        drawCheckStatus(canvas, z18, z19, z20, false, 1.0f - this.statusDrawableProgress);
                        drawCheckStatus(canvas, z12, z13, z14, false, this.statusDrawableProgress);
                    }
                } else {
                    i15 = i11;
                    canvas5 = canvas4;
                    f4 = 1.0f;
                    i16 = 2;
                    f5 = 0.0f;
                    drawCheckStatus(canvas, z12, z13, z14, false, 1.0f);
                }
                this.lastStatusDrawableParams = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
            } else {
                i15 = i11;
                canvas5 = canvas4;
                f4 = 1.0f;
                i16 = 2;
                f5 = 0.0f;
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
                    this.botVerification.draw(canvas5);
                }
            }
            boolean z21 = !this.drawUnmute || this.dialogMuted;
            if (this.dialogsType == i16 && ((z21 || this.dialogMutedProgress > f5) && !this.drawVerified && this.drawScam == 0 && !this.drawPremium)) {
                if (z21) {
                    float f27 = this.dialogMutedProgress;
                    if (f27 != f4) {
                        float f28 = f27 + 0.10666667f;
                        this.dialogMutedProgress = f28;
                        if (f28 > f4) {
                            this.dialogMutedProgress = f4;
                        } else {
                            invalidate();
                        }
                        float dp9 = this.nameMuteLeft - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                        float dp10 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            dp10 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                        }
                        BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp9, dp10);
                        BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp9, dp10);
                        if (this.dialogMutedProgress != f4) {
                            canvas.save();
                            float f29 = this.dialogMutedProgress;
                            canvas5.scale(f29, f29, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
                            if (this.drawUnmute) {
                                Theme.dialogs_unmuteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_unmuteDrawable.draw(canvas5);
                                Theme.dialogs_unmuteDrawable.setAlpha(NotificationCenter.invalidateMotionBackground);
                            } else {
                                Theme.dialogs_muteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_muteDrawable.draw(canvas5);
                                Theme.dialogs_muteDrawable.setAlpha(NotificationCenter.invalidateMotionBackground);
                            }
                            canvas.restore();
                        } else if (this.drawUnmute) {
                            Theme.dialogs_unmuteDrawable.draw(canvas5);
                        } else {
                            Theme.dialogs_muteDrawable.draw(canvas5);
                        }
                    }
                }
                if (!z21) {
                    float f30 = this.dialogMutedProgress;
                    if (f30 != f5) {
                        float f31 = f30 - 0.10666667f;
                        this.dialogMutedProgress = f31;
                        if (f31 < f5) {
                            this.dialogMutedProgress = f5;
                        } else {
                            invalidate();
                        }
                    }
                }
                float dp92 = this.nameMuteLeft - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                float dp102 = AndroidUtilities.dp(!SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                if (!this.useForceThreeLines) {
                    dp102 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                    BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp92, dp102);
                    BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp92, dp102);
                    if (this.dialogMutedProgress != f4) {
                    }
                }
                dp102 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp92, dp102);
                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp92, dp102);
                if (this.dialogMutedProgress != f4) {
                }
            } else if (this.drawVerified) {
                float dp11 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp11 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft - AndroidUtilities.dp(f4), dp11);
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft - AndroidUtilities.dp(f4), dp11);
                Theme.dialogs_verifiedDrawable.draw(canvas5);
                Theme.dialogs_verifiedCheckDrawable.draw(canvas5);
            } else if (this.drawPremium) {
                int dp12 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp12 -= AndroidUtilities.dp(9.0f);
                }
                if (this.emojiStatus != null) {
                    this.emojiStatusView.setTranslationX((f7 + this.nameMuteLeft) - AndroidUtilities.dp(2.0f));
                    this.emojiStatusView.setTranslationY((f3 + dp12) - AndroidUtilities.dp(4.0f));
                    if (this.rightFragmentOpenedProgress > f5) {
                        this.emojiStatus.setBounds(this.nameMuteLeft - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(4.0f), this.nameMuteLeft + AndroidUtilities.dp(20.0f), (dp12 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(22.0f));
                        this.emojiStatus.draw(canvas5);
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
                            canvas5.translate(this.pinLeft - AndroidUtilities.dp(24.0f), this.pinTop);
                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth() - (this.pinLeft - AndroidUtilities.dp(24.0f)), AndroidUtilities.dp(24.0f), paintReorderGradient);
                            canvas.restore();
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas5);
                    }
                    float floatValue2222 = this.animatorPollVotesMentionVisible.getFloatValue();
                    if (this.drawError) {
                        Theme.dialogs_errorDrawable.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                        this.rect.set(this.errorLeft, this.errorTop, r2 + AndroidUtilities.dp(20.666f), this.errorTop + AndroidUtilities.dp(20.666f));
                        RectF rectF6 = this.rect;
                        float f32 = AndroidUtilities.density * 10.5f;
                        canvas5.drawRoundRect(rectF6, f32, f32, Theme.dialogs_errorPaint);
                        BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, this.errorLeft + AndroidUtilities.dp(4.5f), this.errorTop + AndroidUtilities.dp(5.0f));
                        Theme.dialogs_errorDrawable.draw(canvas5);
                    } else if (((this.drawCount || this.drawMention) && this.drawCount2) || this.countChangeProgress != f4 || this.drawReactionMention || this.reactionsMentionsChangeProgress != f4 || this.drawPollVotesMention || floatValue2222 > f5) {
                        boolean isCounterMuted2 = isCounterMuted();
                        canvas2 = canvas5;
                        i4 = 1;
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
                                i17 = 17;
                                DrawableUtils.setBounds(drawable6, this.mentionLeft + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), 17);
                                drawable6.draw(canvas2);
                                if (!this.drawReactionMention || this.reactionsMentionsChangeProgress != f4) {
                                    this.rect.set(this.reactionMentionLeft, this.countTop, AndroidUtilities.dp(20.666f) + r1, this.countTop + AndroidUtilities.dp(20.666f));
                                    f10 = this.reactionsMentionsChangeProgress;
                                    if (f10 != f4) {
                                        f10 = 1.0f;
                                    } else if (!this.drawReactionMention) {
                                        f10 = f4 - f10;
                                    }
                                    if (!isCounterMuted2) {
                                        drawable = Theme.dialogs_reactionsMentionDrawableMuted;
                                    } else {
                                        drawable = Theme.dialogs_reactionsMentionDrawable;
                                    }
                                    drawable.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                                    DrawableUtils.setBounds(drawable, r1 + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i17);
                                    DrawableUtils.drawWithScale(canvas2, drawable, f10);
                                }
                                if ((!this.drawPollVotesMention || floatValue2222 > f5) && floatValue2222 != f5) {
                                    this.rect.set(this.pollVotesMentionLeft, this.countTop, AndroidUtilities.dp(20.666f) + r1, this.countTop + AndroidUtilities.dp(20.666f));
                                    if (!isCounterMuted2) {
                                        drawable2 = Theme.dialogs_pollMentionDrawableMuted;
                                    } else {
                                        drawable2 = Theme.dialogs_pollMentionDrawable;
                                    }
                                    drawable2.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                                    DrawableUtils.setBounds(drawable2, r1 + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i17);
                                    DrawableUtils.drawWithScale(canvas2, drawable2, floatValue2222);
                                }
                                if (this.thumbsCount > 0) {
                                    float f33 = this.updateHelper.typingProgres;
                                    if (f33 != f4) {
                                        if (f33 > f5) {
                                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((f4 - f33) * 255.0f), 31);
                                            if (this.updateHelper.typingOutToTop) {
                                                dp = -AndroidUtilities.dp(14.0f);
                                                f11 = this.updateHelper.typingProgres;
                                            } else {
                                                dp = AndroidUtilities.dp(14.0f);
                                                f11 = this.updateHelper.typingProgres;
                                            }
                                            canvas2.translate(f5, dp * f11);
                                        }
                                        int i36 = 0;
                                        while (i36 < this.thumbsCount) {
                                            if (this.thumbImageSeen[i36]) {
                                                if (this.thumbBackgroundPaint == null) {
                                                    Paint paint4 = new Paint(i4);
                                                    this.thumbBackgroundPaint = paint4;
                                                    paint4.setShadowLayer(AndroidUtilities.dp(1.34f), f5, AndroidUtilities.dp(0.34f), 402653184);
                                                    c = 0;
                                                    this.thumbBackgroundPaint.setColor(0);
                                                } else {
                                                    c = 0;
                                                }
                                                RectF rectF8 = AndroidUtilities.rectTmp;
                                                rectF8.set(this.thumbImage[i36].getImageX(), this.thumbImage[i36].getImageY(), this.thumbImage[i36].getImageX2(), this.thumbImage[i36].getImageY2());
                                                this.thumbImage[i36].draw(canvas2);
                                                if (this.drawSpoiler[i36]) {
                                                    Path path = this.thumbPath;
                                                    if (path == null) {
                                                        this.thumbPath = new Path();
                                                    } else {
                                                        path.rewind();
                                                    }
                                                    this.thumbPath.addRoundRect(rectF8, this.thumbImage[i36].getRoundRadius()[c], this.thumbImage[i36].getRoundRadius()[i4], Path.Direction.CW);
                                                    canvas.save();
                                                    canvas2.clipPath(this.thumbPath);
                                                    if (this.thumbSpoiler == null) {
                                                        this.thumbSpoiler = new SpoilerEffect();
                                                    }
                                                    this.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                                    this.thumbSpoiler.setBounds((int) this.thumbImage[i36].getImageX(), (int) this.thumbImage[i36].getImageY(), (int) this.thumbImage[i36].getImageX2(), (int) this.thumbImage[i36].getImageY2());
                                                    this.thumbSpoiler.draw(canvas2);
                                                    invalidate();
                                                    canvas.restore();
                                                }
                                                if (this.drawPlay[i36]) {
                                                    BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (this.thumbImage[i36].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (this.thumbImage[i36].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)));
                                                    Theme.dialogs_playDrawable.draw(canvas2);
                                                }
                                            }
                                            i36 += i4;
                                            i9 = -1;
                                        }
                                        i18 = -1;
                                        z7 = false;
                                        z7 = false;
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
                                        if (i15 != i18) {
                                            canvas2.restoreToCount(i15);
                                        }
                                        z2 = z5;
                                        r12 = z7;
                                    }
                                }
                                i18 = -1;
                                z7 = false;
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null) {
                                    canvas.save();
                                    canvas2.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                                    this.tags.draw(canvas2, this.tagsRight - this.tagsLeft);
                                    canvas.restore();
                                }
                                if (i15 != i18) {
                                }
                                z2 = z5;
                                r12 = z7;
                            }
                        }
                        i17 = 17;
                        if (!this.drawReactionMention) {
                        }
                        this.rect.set(this.reactionMentionLeft, this.countTop, AndroidUtilities.dp(20.666f) + r1, this.countTop + AndroidUtilities.dp(20.666f));
                        f10 = this.reactionsMentionsChangeProgress;
                        if (f10 != f4) {
                        }
                        if (!isCounterMuted2) {
                        }
                        drawable.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable, r1 + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i17);
                        DrawableUtils.drawWithScale(canvas2, drawable, f10);
                        if (!this.drawPollVotesMention) {
                        }
                        this.rect.set(this.pollVotesMentionLeft, this.countTop, AndroidUtilities.dp(20.666f) + r1, this.countTop + AndroidUtilities.dp(20.666f));
                        if (!isCounterMuted2) {
                        }
                        drawable2.setAlpha((int) ((f4 - this.reorderIconProgress) * 255.0f));
                        DrawableUtils.setBounds(drawable2, r1 + AndroidUtilities.dp(10.333f), this.countTop + AndroidUtilities.dp(10.333f), i17);
                        DrawableUtils.drawWithScale(canvas2, drawable2, floatValue2222);
                        if (this.thumbsCount > 0) {
                        }
                        i18 = -1;
                        z7 = false;
                        dialogCellTags = this.tags;
                        if (dialogCellTags != null) {
                        }
                        if (i15 != i18) {
                        }
                        z2 = z5;
                        r12 = z7;
                    } else if (this.openBot) {
                        canvas.save();
                        float scale = this.openButtonBounce.getScale(0.05f);
                        canvas5.scale(scale, scale, this.openButtonRect.centerX(), this.openButtonRect.centerY());
                        this.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                        RectF rectF9 = this.openButtonRect;
                        canvas5.drawRoundRect(rectF9, rectF9.height() / 2.0f, this.openButtonRect.height() / 2.0f, this.openButtonBackgroundPaint);
                        Text text = this.openButtonText;
                        if (text != null) {
                            text.draw(canvas, AndroidUtilities.dp(13.0f) + this.openButtonRect.left, this.openButtonRect.centerY(), Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider), 1.0f);
                        }
                        canvas.restore();
                    }
                    canvas2 = canvas5;
                    i4 = 1;
                    if (this.thumbsCount > 0) {
                    }
                    i18 = -1;
                    z7 = false;
                    dialogCellTags = this.tags;
                    if (dialogCellTags != null) {
                    }
                    if (i15 != i18) {
                    }
                    z2 = z5;
                    r12 = z7;
                } else {
                    Drawable drawable7 = PremiumGradient.getInstance().premiumStarDrawableMini;
                    int dp13 = this.nameMuteLeft - AndroidUtilities.dp(f4);
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f17 = 15.5f;
                    }
                    BaseCell.setDrawableBounds(drawable7, dp13, AndroidUtilities.dp(f17));
                    drawable7.draw(canvas5);
                }
            } else if (this.drawScam != 0) {
                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                    f16 = 15.0f;
                }
                int dp14 = AndroidUtilities.dp(f16);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp14 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds((Drawable) (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable), this.nameMuteLeft, dp14);
                (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).draw(canvas5);
                z = false;
                if (!this.drawReorder) {
                }
                if (!LocaleController.isRTL) {
                }
                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                Theme.dialogs_reorderDrawable.draw(canvas5);
                float floatValue22222 = this.animatorPollVotesMentionVisible.getFloatValue();
                if (this.drawError) {
                }
                canvas2 = canvas5;
                i4 = 1;
                if (this.thumbsCount > 0) {
                }
                i18 = -1;
                z7 = false;
                dialogCellTags = this.tags;
                if (dialogCellTags != null) {
                }
                if (i15 != i18) {
                }
                z2 = z5;
                r12 = z7;
            }
            z = false;
            if (!this.drawReorder) {
            }
            if (!LocaleController.isRTL) {
            }
            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
            Theme.dialogs_reorderDrawable.draw(canvas5);
            float floatValue222222 = this.animatorPollVotesMentionVisible.getFloatValue();
            if (this.drawError) {
            }
            canvas2 = canvas5;
            i4 = 1;
            if (this.thumbsCount > 0) {
            }
            i18 = -1;
            z7 = false;
            dialogCellTags = this.tags;
            if (dialogCellTags != null) {
            }
            if (i15 != i18) {
            }
            z2 = z5;
            r12 = z7;
        } else {
            canvas2 = canvas;
            f4 = 1.0f;
            r12 = 0;
            i4 = 1;
            f5 = 0.0f;
            z = false;
            z2 = false;
        }
        if (this.animatingArchiveAvatar) {
            canvas.save();
            f6 = 170.0f;
            float interpolation2 = this.interpolator.getInterpolation(this.animatingArchiveAvatarProgress / 170.0f) + f4;
            canvas2.scale(interpolation2, interpolation2, this.avatarImage.getCenterX(), this.avatarImage.getCenterY());
        } else {
            f6 = 170.0f;
        }
        if (this.drawAvatar && (!this.isTopic || (tL_forumTopic2 = this.forumTopic) == null || tL_forumTopic2.id != i4 || (pullForegroundDrawable = this.archivedChatsDrawable) == null || !pullForegroundDrawable.isDraw())) {
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
            } else {
                StoriesUtilities.AvatarStoryParams avatarStoryParams = this.storyParams;
                boolean z22 = this.isShareToStoryCell;
                avatarStoryParams.drawHiddenStoriesAsSegments = z22 || this.currentDialogFolderId != 0;
                int i37 = avatarStoryParams.forceState;
                if (z22) {
                    avatarStoryParams.forceState = i4;
                }
                StoriesUtilities.drawAvatarWithStory(this.currentDialogId, canvas2, this.avatarImage, avatarStoryParams);
                if (this.storyParams.drawnLive) {
                    checkTtl();
                }
                this.storyParams.forceState = i37;
            }
        }
        if (this.animatingArchiveAvatar) {
            canvas.restore();
        }
        boolean z23 = (this.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) ? z2 : true;
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
        if (this.drawArchive && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == i4)) && this.translationX == f5 && this.archivedChatsDrawable != null)) {
            canvas.save();
            canvas2.translate(f5, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
            canvas2.clipRect(f5, getMeasuredHeight() * (f4 - this.archivedChatsDrawable.getPullProgress()), getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas2);
            canvas.restore();
        }
        if (this.useSeparator) {
            int dp15 = (this.fullSeparator || !(this.currentDialogFolderId == 0 || !this.archiveHidden || this.fullSeparator2) || (this.fullSeparator2 && !this.archiveHidden)) ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
            if (this.rightFragmentOpenedProgress != f4) {
                int alpha4 = Theme.dividerPaint.getAlpha();
                float f34 = this.rightFragmentOpenedProgress;
                if (f34 != f5) {
                    Theme.dividerPaint.setAlpha((int) (alpha4 * (f4 - f34)));
                }
                float measuredHeight2 = (getMeasuredHeight() - i4) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight2, getMeasuredWidth() - dp15, measuredHeight2, Theme.dividerPaint);
                } else {
                    canvas.drawLine(dp15, measuredHeight2, getMeasuredWidth(), measuredHeight2, Theme.dividerPaint);
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
        if (z9) {
            float f35 = f4 - pullProgress;
            int measuredHeight3 = (int) (getMeasuredHeight() * f35);
            int color13 = Theme.getColor(Theme.key_windowBackgroundWhite);
            if (this.archiveFadeGradientDrawable == null) {
                this.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
            }
            if (this.archiveFadeGradientDrawableColor != color13) {
                this.archiveFadeGradientDrawableColor = color13;
                this.archiveFadeGradientDrawable.setColors(new int[]{color13, 16777215 & color13});
            }
            float clamp2 = MathUtils.clamp((f35 - 0.05f) * 10.0f, f5, f4);
            this.archiveFadeGradientDrawable.setBounds(r12, measuredHeight3, getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight3);
            this.archiveFadeGradientDrawable.setAlpha((int) (clamp2 * 255.0f));
            this.archiveFadeGradientDrawable.draw(canvas2);
            canvas.restore();
        }
        z3 = this.drawReorder;
        if (!z3 || this.reorderIconProgress != f5) {
            if (z3) {
                float f36 = this.reorderIconProgress;
                if (f36 < f4) {
                    float f37 = f36 + 0.09411765f;
                    this.reorderIconProgress = f37;
                    if (f37 > f4) {
                        this.reorderIconProgress = f4;
                    }
                    z4 = true;
                }
            } else {
                float f38 = this.reorderIconProgress;
                if (f38 > f5) {
                    float f39 = f38 - 0.09411765f;
                    this.reorderIconProgress = f39;
                    if (f39 < f5) {
                        this.reorderIconProgress = f5;
                    }
                    z4 = true;
                }
            }
            if (!this.archiveHidden) {
                float f40 = this.archiveBackgroundProgress;
                if (f40 > f5) {
                    float f41 = f40 - 0.069565214f;
                    this.archiveBackgroundProgress = f41;
                    if (f41 < f5) {
                        this.archiveBackgroundProgress = f5;
                    }
                    if (this.avatarDrawable.getAvatarType() == 2) {
                        this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                    }
                    z4 = true;
                }
                if (this.animatingArchiveAvatar) {
                    float f42 = this.animatingArchiveAvatarProgress + 16.0f;
                    this.animatingArchiveAvatarProgress = f42;
                    if (f42 >= f6) {
                        this.animatingArchiveAvatarProgress = f6;
                        this.animatingArchiveAvatar = r12;
                    }
                    z4 = true;
                }
                if (!this.drawRevealBackground) {
                    float f43 = this.currentRevealBounceProgress;
                    if (f43 < f4) {
                        float f44 = f43 + 0.09411765f;
                        this.currentRevealBounceProgress = f44;
                        if (f44 > f4) {
                            this.currentRevealBounceProgress = f4;
                            z4 = true;
                        }
                    }
                    float f45 = this.currentRevealProgress;
                    if (f45 < f4) {
                        float f46 = f45 + 0.053333335f;
                        this.currentRevealProgress = f46;
                        if (f46 > f4) {
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
                    this.currentRevealBounceProgress = f5;
                    z4 = true;
                }
                float f47 = this.currentRevealProgress;
                if (f47 > f5) {
                    float f48 = f47 - 0.053333335f;
                    this.currentRevealProgress = f48;
                    if (f48 < f5) {
                        this.currentRevealProgress = f5;
                    }
                    z4 = true;
                }
                this.emojiStatusView.setVisibility(!z ? 0 : 4);
                if (z4) {
                }
            } else {
                float f49 = this.archiveBackgroundProgress;
                if (f49 < f4) {
                    float f50 = f49 + 0.069565214f;
                    this.archiveBackgroundProgress = f50;
                    if (f50 > f4) {
                        this.archiveBackgroundProgress = f4;
                    }
                    if (this.avatarDrawable.getAvatarType() == 2) {
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
        z4 = z23;
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
        int i4 = NotificationCenter.invalidateMotionBackground;
        if (z2) {
            if (this.counterPaintOutline == null) {
                Paint paint2 = new Paint();
                this.counterPaintOutline = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.counterPaintOutline.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.counterPaintOutline.setStrokeJoin(Paint.Join.ROUND);
                this.counterPaintOutline.setStrokeCap(Paint.Cap.ROUND);
            }
            this.counterPaintOutline.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_pinnedOverlay), NotificationCenter.invalidateMotionBackground), Color.alpha(r13) / 255.0f));
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
                    charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            if (charSequence6.length() > 150) {
                charSequence6 = charSequence6.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(charSequence6);
            captionMessage.spoilLoginCode();
            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, charSequence6, spannableString, NotificationCenter.needShareTheme);
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
        if (message2.media != null && !messageObject2.isMediaEmpty()) {
            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
            int i2 = Theme.key_chats_attachMessage;
            MessageObject messageObject3 = this.message;
            TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                    charSequence2 = String.format("📊 \u2068%s\u2069", tL_textWithEntities.text);
                } else {
                    SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                    MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2);
                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                    charSequence2 = new SpannableStringBuilder("📊 \u2068").append((CharSequence) spannableString2).append((CharSequence) "\u2069");
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                    charSequence2 = String.format("✅ \u2068%s\u2069", tL_textWithEntities3.text);
                } else {
                    SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                    TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                    MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3);
                    MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                    charSequence2 = new SpannableStringBuilder("✅ \u2068").append((CharSequence) spannableString3).append((CharSequence) "\u2069");
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                charSequence2 = String.format("🎮 \u2068%s\u2069", messageMedia.game.title);
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
            SpannableStringBuilder formatInternal = formatInternal(i, charSequence2, charSequence);
            if (!isForumCell()) {
                try {
                    formatInternal.setSpan(new ForegroundColorSpanThemable(i2, this.resourcesProvider), this.hasNameInMessage ? charSequence.length() + 2 : 0, formatInternal.length(), 33);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return formatInternal;
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
                    charSequence8 = AndroidUtilities.ellipsizeCenterEnd(charSequence8, this.message.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
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
            MediaDataController.addTextStyleRuns(this.message, (Spannable) spannableString4, NotificationCenter.needShareTheme);
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

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0164, code lost:
        
            if (org.telegram.messenger.MessagesController.getInstance(r19.this$0.currentAccount).getTopicsController().endIsReached(-r19.this$0.currentDialogId) != false) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x02d9  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x02dc  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x029d  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02e1  */
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
            long j = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0) + (dialog.unread_poll_votes_count > 0 ? 1048576 : 0);
            if (DialogCell.this.isForumCell() && MessagesController.getInstance(DialogCell.this.currentAccount).getTopicsController().getForumUnreadCount(-DialogCell.this.currentDialogId)[2] > 0) {
                j |= 1048576;
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

    @Override // org.telegram.ui.Cells.BaseCell
    protected boolean allowCaching() {
        return this.rightFragmentOpenedProgress <= 0.0f;
    }
}
