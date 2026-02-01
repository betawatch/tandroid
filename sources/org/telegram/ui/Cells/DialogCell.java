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
        this.lastUnreadState = messageObject != null && messageObject.isUnread();
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

    /* JADX WARN: Can't wrap try/catch for region: R(110:14|(1:16)|17|(2:1852|1853)(1:23)|24|(1:1851)(1:28)|29|(1:31)|32|(1:1850)(2:36|37)|38|(1:40)|41|(1:43)(1:1843)|44|(7:46|(1:48)|49|50|(1:52)|53|54)(1:1842)|55|(1:57)(1:1841)|58|(9:60|(2:62|(2:845|(1:847)(1:848))(2:66|(1:68)(1:844)))(4:849|(1:866)(1:853)|854|(2:862|(1:864)(1:865))(2:858|(1:860)(1:861)))|69|(3:71|(1:73)(4:831|(1:833)|834|(1:839)(1:838))|74)(3:840|(1:842)|843)|75|(1:77)(1:830)|78|(1:80)(1:(1:826)(1:(1:828)(1:829)))|81)(38:867|(2:1837|(1:1839)(1:1840))(2:871|(1:873)(1:1836))|874|(2:876|(2:878|(2:886|(1:888)(1:889))(2:882|(1:884)(1:885))))(2:1762|(31:1764|(4:1766|(1:1768)(2:1776|(1:1778)(3:1779|(1:1781)(5:1782|(1:1794)(1:1786)|1787|(1:1793)(1:1791)|1792)|1770))|1769|1770)(3:1795|(8:1797|(1:1799)(2:1817|(1:1819)(5:1820|(1:1834)(1:1824)|1825|(1:1833)(1:1831)|1832))|1800|(2:1802|(4:1806|1807|1808|(2:1810|(1:1812)(1:1814))(1:1815)))|1816|1807|1808|(0)(0))(1:1835)|1813)|1771|(2:1773|(1:1775))|891|(1:895)|896|(6:898|(1:900)(1:1747)|901|(1:903)(1:1746)|904|(1:908))(2:1748|(5:1753|(1:1755)(1:1761)|1756|(1:1758)(1:1760)|1759)(1:1752))|909|(4:913|(2:915|(2:917|(2:919|(1:1716))))|1718|(20:1730|923|(11:925|(1:927)(1:1172)|928|(1:1171)(3:930|(1:932)(1:1170)|(1:934)(1:1169))|935|(1:937)(1:1168)|938|(1:940)(1:1167)|941|(2:943|(1:946))|947)(2:1173|(1:1175)(19:(6:1177|(1:1179)(1:1714)|1180|(1:1182)(1:1713)|(1:1184)(1:1712)|1185)(1:1715)|1186|(6:1666|1667|(7:1680|(1:1682)(2:1706|(2:1708|(1:1710))(1:1711))|1683|(2:1685|(3:1689|(1:1691)(1:1693)|1692))(2:1703|(1:1705))|1694|(1:1702)(1:1698)|1699)(2:1671|(1:1679)(1:1675))|1676|1228|1229)(4:1190|(1:1192)(2:1195|(2:1197|(1:1199)(4:1200|(2:1202|(1:1204)(2:1205|(1:1207)(2:1208|(1:1210)(2:1211|(2:1213|(1:1215)(1:1216))))))(2:1218|(5:1222|(1:1230)(1:1226)|1227|1228|1229))|1217|1194))(11:1231|(1:1233)(1:1665)|1234|1235|(3:1237|(2:1249|(2:1251|(2:1253|(7:1255|(1:1257)(3:1656|(1:1658)(1:1660)|1659)|(5:1265|(4:1267|(4:1269|(2:1271|(2:1273|(1:1275)(2:1279|(1:1281)(1:1282))))|1283|(1:1285)(2:1286|(1:1288)(2:1289|(1:1291)(1:1292))))(1:1293)|1276|1277)(2:1294|(5:1305|(2:1313|(18:1330|1331|(1:1655)(1:1339)|1340|(5:1410|(2:1412|(5:1414|(1:1416)|1648|(1:1650)|1652))|1654|1418|(11:1426|(2:1428|(5:1430|(1:1442)|1436|1437|(2:1439|(1:1441)))(2:1443|(4:1450|(2:1452|(2:1457|(1:1459)(2:1460|(1:1462)(1:1463))))|1464|(4:1466|(1:1468)(2:1492|(1:1494)(2:1495|(1:1497)(2:1498|(1:1500)(2:1501|(1:1503)(1:1504)))))|1469|(3:1484|(3:1486|(1:1488)(1:1490)|1489)|1491)(4:1473|(2:1475|(1:1477)(1:1478))|(1:1482)|1483))(2:1505|(3:1507|(2:1509|(1:1511)(1:1513))(2:1514|(1:1516)(1:1517))|1512)(2:1518|(4:1520|(4:1522|(1:1524)(1:1529)|1525|1526)(3:1530|(1:1532)(1:1534)|1533)|1527|1528)(5:1535|(5:1537|(2:1539|(3:1541|(1:1543)(1:1551)|1544))|1552|(0)(0)|1544)(2:1553|(1:1555)(2:1556|(2:1558|(1:1563)(1:1562))(2:1564|(2:1566|(1:1571)(1:1570))(2:1572|(1:1574)(2:1575|(1:1577)(2:1578|(1:1580)(2:1581|(3:1595|(4:1603|(1:1605)|1606|(2:1608|(3:1610|(1:1612)(1:1614)|1613)))(2:1599|(1:1601))|1602)(2:1585|(3:1587|(2:1589|(1:1591))(1:1593)|1592)(1:1594)))))))))|1545|1546|(2:1548|(1:1550))))))(1:1449)))|1615|(1:1617)(1:1647)|1618|(7:1620|(3:1637|(1:1639)|1640)(2:1624|(1:1626))|1627|(1:1629)(1:1636)|1630|(2:1632|(1:1634))|1635)|1641|(1:1646)(1:1645)|1260|1261|(2:1263|1229)(1:1264)))(1:1350)|1351|(1:1353)|1354|(2:1362|(10:1364|(1:1407)(1:1368)|1369|1370|1371|(1:1406)(5:1377|1378|1379|1380|1381)|1382|(2:1384|(1:1386))|1387|(4:1389|(1:1391)|1392|(1:1394)(1:1395))))|1408|1370|1371|(2:1373|1402)|1406|1382|(0)|1387|(0))(4:1319|(2:1327|(1:1329))(1:1323)|1324|(1:1326)))(1:1311)|1312|1261|(0)(0))(3:1298|(1:1304)(1:1302)|1303))|1278|1261|(0)(0))|1259|1260|1261|(0)(0)))(1:1662)))|1663)(1:1664)|1661|(0)|1259|1260|1261|(0)(0)))|1193|1194)|949|(3:965|(1:969)|970)|971|(8:1158|(1:1160)(2:1161|(1:1163)(2:1164|(1:1166)))|974|(4:1148|1149|(1:1157)(1:1155)|1156)(6:978|(4:980|(1:(2:983|984)(1:1121))(1:1123)|1122|984)(6:1124|(1:1126)(2:1135|(3:1143|1144|(1:1146)(1:1147))(1:1142))|1127|(1:1129)(1:1134)|1130|(1:1132)(1:1133))|985|(2:990|(3:992|(1:994)(2:1081|(1:1083)(2:1084|(1:1119)(4:1086|(3:1088|(1:1090)(1:1094)|1091)(2:1095|(3:1097|(1:1109)(1:1101)|1102)(3:1110|(1:1118)(1:1116)|1117))|1092|1093)))|995))|1120|995)|996|(2:1000|(1:1002)(2:1003|(4:1005|(1:1007)|1008|(1:1010))))|1011|(1:1013)(2:1014|(5:1016|(3:1018|(1:1020)|1021)(2:1030|(5:1032|(1:1034)|1035|(1:1037)(1:1039)|1038)(4:1040|(1:1048)(2:1044|(1:1046)(1:1047))|(1:1027)|1028))|1029|(2:1025|1027)|1028)(5:1049|(4:1051|(1:1053)(2:1054|(1:1056)(2:1057|(2:1071|(4:1073|(1:1075)|1076|(1:1078)(1:1079))(1:1080))(2:1061|(1:1063)(2:1064|(1:1066)(3:1067|(1:1069)|1070)))))|(0)|1028)|1023|(0)|1028)))|973|974|(1:976)|1148|1149|(1:1151)|1157|1156|996|(3:998|1000|(0)(0))|1011|(0)(0)))|948|949|(10:951|953|955|957|959|961|963|965|(2:967|969)|970)|971|(0)|973|974|(0)|1148|1149|(0)|1157|1156|996|(0)|1011|(0)(0)))|921|922|923|(0)(0)|948|949|(0)|971|(0)|973|974|(0)|1148|1149|(0)|1157|1156|996|(0)|1011|(0)(0)))|890|891|(2:893|895)|896|(0)(0)|909|(27:911|913|(0)|1718|(2:1720|1722)|1724|1726|1730|923|(0)(0)|948|949|(0)|971|(0)|973|974|(0)|1148|1149|(0)|1157|1156|996|(0)|1011|(0)(0))|1740|913|(0)|1718|(0)|1724|1726|1730|923|(0)(0)|948|949|(0)|971|(0)|973|974|(0)|1148|1149|(0)|1157|1156|996|(0)|1011|(0)(0))|(4:83|(1:85)(1:823)|86|(1:88)(1:822))(1:824)|89|(3:91|(1:93)(1:820)|94)(1:821)|95|(1:97)(1:819)|98|(3:100|(1:102)|103)|104|(2:106|(1:108)(1:806))(2:807|(2:809|(2:811|(1:813)(1:814))(2:815|(1:817)(1:818))))|109|110|(2:776|(2:803|(1:805))(2:780|(2:782|(1:784))(2:785|(2:787|(1:789))(2:790|(4:792|(1:794)(1:798)|795|(1:797))))))(2:114|(1:116))|117|(1:119)|120|(2:122|(1:124))|125|126|127|(1:129)|130|(1:132)|133|(3:135|(1:137)(1:765)|138)(2:766|(3:768|(1:770)(1:772)|771))|139|(1:141)(1:764)|142|(1:144)|145|(1:763)(1:151)|152|(1:154)(1:762)|155|(1:761)(1:159)|160|161|(5:734|(1:736)(1:759)|737|(2:738|(5:740|(1:742)(1:756)|743|(2:754|755)(2:751|752)|753)(1:757))|758)(10:165|(1:167)(1:733)|168|169|(1:171)(1:732)|172|(1:174)(1:731)|175|(2:176|(5:178|(1:180)(1:194)|181|(2:192|193)(2:189|190)|191)(1:195))|196)|197|(1:199)(1:730)|200|(1:202)|203|(1:211)|212|(2:214|(1:216)(1:217))|218|(2:220|(1:222)(1:633))(1:(4:(4:668|(1:670)(1:726)|671|672)(1:727)|(6:674|(1:676)(1:724)|677|(3:679|(1:681)(1:718)|682)(3:719|(1:721)(1:723)|722)|683|684)(1:725)|685|(2:687|(4:689|(3:691|(1:693)(1:695)|694)|696|(3:698|(1:700)(1:702)|701))(5:703|(3:705|(1:707)(1:709)|708)|710|(3:712|(1:714)(1:716)|715)|717)))(2:638|(1:666)(6:650|(1:665)(3:654|(1:656)(1:664)|657)|658|(1:660)(1:663)|661|662)))|(7:(1:225)|226|(1:228)|229|(1:242)(1:233)|234|(1:238))|243|(1:632)(1:247)|248|(3:254|(1:256)(1:258)|257)|259|(4:261|(1:577)(1:265)|266|(2:267|(1:269)(1:270)))(2:578|(8:606|607|(1:613)|614|615|(1:625)(1:619)|620|(2:621|(1:623)(1:624)))(3:582|583|(4:588|(1:598)(1:592)|593|(2:594|(1:596)(1:597)))(1:587)))|271|(1:273)|274|(4:275|276|(1:278)(1:575)|279)|280|(3:281|282|(5:284|(3:286|(1:288)|289)|290|(1:292)|289))|293|294|(4:541|542|(5:544|(2:546|(4:548|(2:550|(1:552))|553|(2:555|(2:557|(4:559|(1:563)|564|565)))))|566|564|565)|567)|296|(2:539|540)(2:300|(1:531)(30:304|(3:512|513|(31:515|516|517|(20:519|308|309|310|(1:511)(1:314)|315|316|(5:502|(1:505)|506|(1:508)(1:510)|509)(3:320|(2:322|(1:326))|327)|328|329|330|331|332|333|334|(10:336|(9:340|(1:342)|343|(1:345)|346|(1:374)(2:350|(1:352)(2:359|(1:361)(2:362|(3:364|(1:366)(1:368)|367)(1:369))))|353|354|(2:356|(1:358)))|375|(3:379|(1:(2:381|(1:383)(2:384|385))(2:388|389))|(1:387))|390|(3:394|(1:(2:396|(1:398)(2:399|400))(2:403|404))|(1:402))|405|(2:411|(1:413))|414|(4:418|(1:420)|421|422))(10:440|(7:444|(1:446)|447|(4:449|(1:451)|452|(1:454))|455|(1:457)|458)|459|(4:463|(1:465)|466|467)|468|(4:472|(1:474)|475|476)|477|(4:481|(1:483)|484|485)|486|(1:490))|423|(3:(1:437)(1:432)|433|(1:435)(1:436))|438|439)|307|308|309|310|(1:312)|511|315|316|(1:318)|500|502|(1:505)|506|(0)(0)|509|328|329|330|331|332|333|334|(0)(0)|423|(6:425|427|(1:430)|437|433|(0)(0))|438|439))|306|307|308|309|310|(0)|511|315|316|(0)|500|502|(0)|506|(0)(0)|509|328|329|330|331|332|333|334|(0)(0)|423|(0)|438|439))|532|310|(0)|511|315|316|(0)|500|502|(0)|506|(0)(0)|509|328|329|330|331|332|333|334|(0)(0)|423|(0)|438|439) */
    /* JADX WARN: Can't wrap try/catch for region: R(113:14|(1:16)|17|(2:1852|1853)(1:23)|24|(1:1851)(1:28)|29|(1:31)|32|(1:1850)(2:36|37)|38|(1:40)|41|(1:43)(1:1843)|44|(7:46|(1:48)|49|50|(1:52)|53|54)(1:1842)|55|(1:57)(1:1841)|58|(9:60|(2:62|(2:845|(1:847)(1:848))(2:66|(1:68)(1:844)))(4:849|(1:866)(1:853)|854|(2:862|(1:864)(1:865))(2:858|(1:860)(1:861)))|69|(3:71|(1:73)(4:831|(1:833)|834|(1:839)(1:838))|74)(3:840|(1:842)|843)|75|(1:77)(1:830)|78|(1:80)(1:(1:826)(1:(1:828)(1:829)))|81)(38:867|(2:1837|(1:1839)(1:1840))(2:871|(1:873)(1:1836))|874|(2:876|(2:878|(2:886|(1:888)(1:889))(2:882|(1:884)(1:885))))(2:1762|(31:1764|(4:1766|(1:1768)(2:1776|(1:1778)(3:1779|(1:1781)(5:1782|(1:1794)(1:1786)|1787|(1:1793)(1:1791)|1792)|1770))|1769|1770)(3:1795|(8:1797|(1:1799)(2:1817|(1:1819)(5:1820|(1:1834)(1:1824)|1825|(1:1833)(1:1831)|1832))|1800|(2:1802|(4:1806|1807|1808|(2:1810|(1:1812)(1:1814))(1:1815)))|1816|1807|1808|(0)(0))(1:1835)|1813)|1771|(2:1773|(1:1775))|891|(1:895)|896|(6:898|(1:900)(1:1747)|901|(1:903)(1:1746)|904|(1:908))(2:1748|(5:1753|(1:1755)(1:1761)|1756|(1:1758)(1:1760)|1759)(1:1752))|909|(4:913|(2:915|(2:917|(2:919|(1:1716))))|1718|(20:1730|923|(11:925|(1:927)(1:1172)|928|(1:1171)(3:930|(1:932)(1:1170)|(1:934)(1:1169))|935|(1:937)(1:1168)|938|(1:940)(1:1167)|941|(2:943|(1:946))|947)(2:1173|(1:1175)(19:(6:1177|(1:1179)(1:1714)|1180|(1:1182)(1:1713)|(1:1184)(1:1712)|1185)(1:1715)|1186|(6:1666|1667|(7:1680|(1:1682)(2:1706|(2:1708|(1:1710))(1:1711))|1683|(2:1685|(3:1689|(1:1691)(1:1693)|1692))(2:1703|(1:1705))|1694|(1:1702)(1:1698)|1699)(2:1671|(1:1679)(1:1675))|1676|1228|1229)(4:1190|(1:1192)(2:1195|(2:1197|(1:1199)(4:1200|(2:1202|(1:1204)(2:1205|(1:1207)(2:1208|(1:1210)(2:1211|(2:1213|(1:1215)(1:1216))))))(2:1218|(5:1222|(1:1230)(1:1226)|1227|1228|1229))|1217|1194))(11:1231|(1:1233)(1:1665)|1234|1235|(3:1237|(2:1249|(2:1251|(2:1253|(7:1255|(1:1257)(3:1656|(1:1658)(1:1660)|1659)|(5:1265|(4:1267|(4:1269|(2:1271|(2:1273|(1:1275)(2:1279|(1:1281)(1:1282))))|1283|(1:1285)(2:1286|(1:1288)(2:1289|(1:1291)(1:1292))))(1:1293)|1276|1277)(2:1294|(5:1305|(2:1313|(18:1330|1331|(1:1655)(1:1339)|1340|(5:1410|(2:1412|(5:1414|(1:1416)|1648|(1:1650)|1652))|1654|1418|(11:1426|(2:1428|(5:1430|(1:1442)|1436|1437|(2:1439|(1:1441)))(2:1443|(4:1450|(2:1452|(2:1457|(1:1459)(2:1460|(1:1462)(1:1463))))|1464|(4:1466|(1:1468)(2:1492|(1:1494)(2:1495|(1:1497)(2:1498|(1:1500)(2:1501|(1:1503)(1:1504)))))|1469|(3:1484|(3:1486|(1:1488)(1:1490)|1489)|1491)(4:1473|(2:1475|(1:1477)(1:1478))|(1:1482)|1483))(2:1505|(3:1507|(2:1509|(1:1511)(1:1513))(2:1514|(1:1516)(1:1517))|1512)(2:1518|(4:1520|(4:1522|(1:1524)(1:1529)|1525|1526)(3:1530|(1:1532)(1:1534)|1533)|1527|1528)(5:1535|(5:1537|(2:1539|(3:1541|(1:1543)(1:1551)|1544))|1552|(0)(0)|1544)(2:1553|(1:1555)(2:1556|(2:1558|(1:1563)(1:1562))(2:1564|(2:1566|(1:1571)(1:1570))(2:1572|(1:1574)(2:1575|(1:1577)(2:1578|(1:1580)(2:1581|(3:1595|(4:1603|(1:1605)|1606|(2:1608|(3:1610|(1:1612)(1:1614)|1613)))(2:1599|(1:1601))|1602)(2:1585|(3:1587|(2:1589|(1:1591))(1:1593)|1592)(1:1594)))))))))|1545|1546|(2:1548|(1:1550))))))(1:1449)))|1615|(1:1617)(1:1647)|1618|(7:1620|(3:1637|(1:1639)|1640)(2:1624|(1:1626))|1627|(1:1629)(1:1636)|1630|(2:1632|(1:1634))|1635)|1641|(1:1646)(1:1645)|1260|1261|(2:1263|1229)(1:1264)))(1:1350)|1351|(1:1353)|1354|(2:1362|(10:1364|(1:1407)(1:1368)|1369|1370|1371|(1:1406)(5:1377|1378|1379|1380|1381)|1382|(2:1384|(1:1386))|1387|(4:1389|(1:1391)|1392|(1:1394)(1:1395))))|1408|1370|1371|(2:1373|1402)|1406|1382|(0)|1387|(0))(4:1319|(2:1327|(1:1329))(1:1323)|1324|(1:1326)))(1:1311)|1312|1261|(0)(0))(3:1298|(1:1304)(1:1302)|1303))|1278|1261|(0)(0))|1259|1260|1261|(0)(0)))(1:1662)))|1663)(1:1664)|1661|(0)|1259|1260|1261|(0)(0)))|1193|1194)|949|(3:965|(1:969)|970)|971|(8:1158|(1:1160)(2:1161|(1:1163)(2:1164|(1:1166)))|974|(4:1148|1149|(1:1157)(1:1155)|1156)(6:978|(4:980|(1:(2:983|984)(1:1121))(1:1123)|1122|984)(6:1124|(1:1126)(2:1135|(3:1143|1144|(1:1146)(1:1147))(1:1142))|1127|(1:1129)(1:1134)|1130|(1:1132)(1:1133))|985|(2:990|(3:992|(1:994)(2:1081|(1:1083)(2:1084|(1:1119)(4:1086|(3:1088|(1:1090)(1:1094)|1091)(2:1095|(3:1097|(1:1109)(1:1101)|1102)(3:1110|(1:1118)(1:1116)|1117))|1092|1093)))|995))|1120|995)|996|(2:1000|(1:1002)(2:1003|(4:1005|(1:1007)|1008|(1:1010))))|1011|(1:1013)(2:1014|(5:1016|(3:1018|(1:1020)|1021)(2:1030|(5:1032|(1:1034)|1035|(1:1037)(1:1039)|1038)(4:1040|(1:1048)(2:1044|(1:1046)(1:1047))|(1:1027)|1028))|1029|(2:1025|1027)|1028)(5:1049|(4:1051|(1:1053)(2:1054|(1:1056)(2:1057|(2:1071|(4:1073|(1:1075)|1076|(1:1078)(1:1079))(1:1080))(2:1061|(1:1063)(2:1064|(1:1066)(3:1067|(1:1069)|1070)))))|(0)|1028)|1023|(0)|1028)))|973|974|(1:976)|1148|1149|(1:1151)|1157|1156|996|(3:998|1000|(0)(0))|1011|(0)(0)))|948|949|(10:951|953|955|957|959|961|963|965|(2:967|969)|970)|971|(0)|973|974|(0)|1148|1149|(0)|1157|1156|996|(0)|1011|(0)(0)))|921|922|923|(0)(0)|948|949|(0)|971|(0)|973|974|(0)|1148|1149|(0)|1157|1156|996|(0)|1011|(0)(0)))|890|891|(2:893|895)|896|(0)(0)|909|(27:911|913|(0)|1718|(2:1720|1722)|1724|1726|1730|923|(0)(0)|948|949|(0)|971|(0)|973|974|(0)|1148|1149|(0)|1157|1156|996|(0)|1011|(0)(0))|1740|913|(0)|1718|(0)|1724|1726|1730|923|(0)(0)|948|949|(0)|971|(0)|973|974|(0)|1148|1149|(0)|1157|1156|996|(0)|1011|(0)(0))|(4:83|(1:85)(1:823)|86|(1:88)(1:822))(1:824)|89|(3:91|(1:93)(1:820)|94)(1:821)|95|(1:97)(1:819)|98|(3:100|(1:102)|103)|104|(2:106|(1:108)(1:806))(2:807|(2:809|(2:811|(1:813)(1:814))(2:815|(1:817)(1:818))))|109|110|(2:776|(2:803|(1:805))(2:780|(2:782|(1:784))(2:785|(2:787|(1:789))(2:790|(4:792|(1:794)(1:798)|795|(1:797))))))(2:114|(1:116))|117|(1:119)|120|(2:122|(1:124))|125|126|127|(1:129)|130|(1:132)|133|(3:135|(1:137)(1:765)|138)(2:766|(3:768|(1:770)(1:772)|771))|139|(1:141)(1:764)|142|(1:144)|145|(1:763)(1:151)|152|(1:154)(1:762)|155|(1:761)(1:159)|160|161|(5:734|(1:736)(1:759)|737|(2:738|(5:740|(1:742)(1:756)|743|(2:754|755)(2:751|752)|753)(1:757))|758)(10:165|(1:167)(1:733)|168|169|(1:171)(1:732)|172|(1:174)(1:731)|175|(2:176|(5:178|(1:180)(1:194)|181|(2:192|193)(2:189|190)|191)(1:195))|196)|197|(1:199)(1:730)|200|(1:202)|203|(1:211)|212|(2:214|(1:216)(1:217))|218|(2:220|(1:222)(1:633))(1:(4:(4:668|(1:670)(1:726)|671|672)(1:727)|(6:674|(1:676)(1:724)|677|(3:679|(1:681)(1:718)|682)(3:719|(1:721)(1:723)|722)|683|684)(1:725)|685|(2:687|(4:689|(3:691|(1:693)(1:695)|694)|696|(3:698|(1:700)(1:702)|701))(5:703|(3:705|(1:707)(1:709)|708)|710|(3:712|(1:714)(1:716)|715)|717)))(2:638|(1:666)(6:650|(1:665)(3:654|(1:656)(1:664)|657)|658|(1:660)(1:663)|661|662)))|(7:(1:225)|226|(1:228)|229|(1:242)(1:233)|234|(1:238))|243|(1:632)(1:247)|248|(3:254|(1:256)(1:258)|257)|259|(4:261|(1:577)(1:265)|266|(2:267|(1:269)(1:270)))(2:578|(8:606|607|(1:613)|614|615|(1:625)(1:619)|620|(2:621|(1:623)(1:624)))(3:582|583|(4:588|(1:598)(1:592)|593|(2:594|(1:596)(1:597)))(1:587)))|271|(1:273)|274|275|276|(1:278)(1:575)|279|280|(3:281|282|(5:284|(3:286|(1:288)|289)|290|(1:292)|289))|293|294|(4:541|542|(5:544|(2:546|(4:548|(2:550|(1:552))|553|(2:555|(2:557|(4:559|(1:563)|564|565)))))|566|564|565)|567)|296|(2:539|540)(2:300|(1:531)(30:304|(3:512|513|(31:515|516|517|(20:519|308|309|310|(1:511)(1:314)|315|316|(5:502|(1:505)|506|(1:508)(1:510)|509)(3:320|(2:322|(1:326))|327)|328|329|330|331|332|333|334|(10:336|(9:340|(1:342)|343|(1:345)|346|(1:374)(2:350|(1:352)(2:359|(1:361)(2:362|(3:364|(1:366)(1:368)|367)(1:369))))|353|354|(2:356|(1:358)))|375|(3:379|(1:(2:381|(1:383)(2:384|385))(2:388|389))|(1:387))|390|(3:394|(1:(2:396|(1:398)(2:399|400))(2:403|404))|(1:402))|405|(2:411|(1:413))|414|(4:418|(1:420)|421|422))(10:440|(7:444|(1:446)|447|(4:449|(1:451)|452|(1:454))|455|(1:457)|458)|459|(4:463|(1:465)|466|467)|468|(4:472|(1:474)|475|476)|477|(4:481|(1:483)|484|485)|486|(1:490))|423|(3:(1:437)(1:432)|433|(1:435)(1:436))|438|439)|307|308|309|310|(1:312)|511|315|316|(1:318)|500|502|(1:505)|506|(0)(0)|509|328|329|330|331|332|333|334|(0)(0)|423|(6:425|427|(1:430)|437|433|(0)(0))|438|439))|306|307|308|309|310|(0)|511|315|316|(0)|500|502|(0)|506|(0)(0)|509|328|329|330|331|332|333|334|(0)(0)|423|(0)|438|439))|532|310|(0)|511|315|316|(0)|500|502|(0)|506|(0)(0)|509|328|329|330|331|332|333|334|(0)(0)|423|(0)|438|439) */
    /* JADX WARN: Code restructure failed: missing block: B:1022:0x1588, code lost:
    
        if (r4 == null) goto L1071;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1417:0x0b22, code lost:
    
        if (r12.id == r8) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1651:0x0b30, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r7.chat) == false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1653:0x0b38, code lost:
    
        if (org.telegram.ui.Components.Forum.ForumUtilities.isTopicCreateMessage(r7.message) != false) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1717:0x0663, code lost:
    
        if (r0.post_messages == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x2404, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x2405, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x2406, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x2408, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x2409, code lost:
    
        r10 = org.telegram.tgnet.ConnectionsManager.DEFAULT_DATACENTER_ID;
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x1507  */
    /* JADX WARN: Removed duplicated region for block: B:1003:0x150e  */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x1547  */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x1559  */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x16bc  */
    /* JADX WARN: Removed duplicated region for block: B:1151:0x14c2  */
    /* JADX WARN: Removed duplicated region for block: B:1158:0x133a  */
    /* JADX WARN: Removed duplicated region for block: B:1173:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:1263:0x11c9  */
    /* JADX WARN: Removed duplicated region for block: B:1264:0x11d4  */
    /* JADX WARN: Removed duplicated region for block: B:1265:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:1384:0x1158  */
    /* JADX WARN: Removed duplicated region for block: B:1389:0x1169  */
    /* JADX WARN: Removed duplicated region for block: B:1543:0x0d80  */
    /* JADX WARN: Removed duplicated region for block: B:1551:0x0d83  */
    /* JADX WARN: Removed duplicated region for block: B:1720:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:1748:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:1810:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:1815:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x2354 A[Catch: Exception -> 0x228b, TRY_ENTER, TryCatch #2 {Exception -> 0x228b, blocks: (B:542:0x2264, B:544:0x2276, B:546:0x227c, B:548:0x2280, B:550:0x2286, B:553:0x2293, B:555:0x2297, B:557:0x229b, B:559:0x229f, B:561:0x22a3, B:566:0x22b0, B:298:0x22ba, B:302:0x22de, B:517:0x2313, B:519:0x231c, B:312:0x2354, B:314:0x2358, B:318:0x2363, B:322:0x23a8, B:324:0x23ba, B:326:0x23c0, B:502:0x236d, B:505:0x2373, B:506:0x237a, B:509:0x238c, B:527:0x22ea, B:529:0x22f2, B:535:0x22c4, B:537:0x22c8, B:539:0x22cd), top: B:541:0x2264 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x2363 A[Catch: Exception -> 0x228b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x228b, blocks: (B:542:0x2264, B:544:0x2276, B:546:0x227c, B:548:0x2280, B:550:0x2286, B:553:0x2293, B:555:0x2297, B:557:0x229b, B:559:0x229f, B:561:0x22a3, B:566:0x22b0, B:298:0x22ba, B:302:0x22de, B:517:0x2313, B:519:0x231c, B:312:0x2354, B:314:0x2358, B:318:0x2363, B:322:0x23a8, B:324:0x23ba, B:326:0x23c0, B:502:0x236d, B:505:0x2373, B:506:0x237a, B:509:0x238c, B:527:0x22ea, B:529:0x22f2, B:535:0x22c4, B:537:0x22c8, B:539:0x22cd), top: B:541:0x2264 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x242d  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x26e3  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x2720  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x2728  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x25fa  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x2371 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x2387  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x238a  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:925:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x12bb  */
    /* JADX WARN: Removed duplicated region for block: B:976:0x1361  */
    /* JADX WARN: Removed duplicated region for block: B:998:0x14f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildLayout() {
        String str;
        CharSequence charSequence;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence charSequence2;
        String str2;
        boolean z4;
        long j;
        DialogCell dialogCell;
        long j2;
        boolean z5;
        DialogCell dialogCell2;
        DialogCell dialogCell3;
        int i2;
        boolean z6;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.InputReplyTo inputReplyTo;
        boolean z7;
        TLRPC.DraftMessage draftMessage3;
        CharSequence charSequence3;
        boolean z8;
        int i3;
        boolean z9;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence string;
        String str3;
        boolean z10;
        ArrayList<TLRPC.MessageEntity> arrayList;
        CharSequence charSequence7;
        CharSequence charSequence8;
        boolean z11;
        int i4;
        CharSequence charSequence9;
        CharSequence charSequence10;
        int i5;
        CharSequence charSequence11;
        CharSequence charSequence12;
        TLRPC.Chat chat;
        int i6;
        CharSequence charSequence13;
        boolean z12;
        CharSequence charSequence14;
        CharSequence charSequence15;
        CharSequence replaceNewLines;
        CharSequence charSequence16;
        char c;
        String str4;
        CharSequence charSequence17;
        boolean isChannelAndNotMegaGroup;
        CharSequence formatPluralString;
        char c2;
        int i7;
        String formatPluralString2;
        String str5;
        MessageObject messageObject;
        CharSequence charSequence18;
        int i8;
        ForegroundColorSpanThemable foregroundColorSpanThemable;
        TLRPC.User user;
        MessageObject messageObject2;
        TLRPC.User user2;
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
        String stringForMessageListDate;
        MessageObject messageObject3;
        boolean z13;
        String str6;
        String str7;
        MessagesController messagesController;
        CharSequence charSequence26;
        CharSequence escape;
        String str8;
        CharSequence charSequence27;
        boolean z14;
        int i9;
        CharSequence charSequence28;
        CharSequence topicSpannedName;
        int i10;
        boolean z15;
        boolean z16;
        String str9;
        String str10;
        boolean z17;
        String str11;
        String str12;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        TLRPC.Chat chat2;
        MessageObject messageObject5;
        DialogCell dialogCell4;
        int i12;
        float f;
        int i13;
        int dp;
        int dp2;
        int i14;
        int i15;
        DialogCellTags dialogCellTags;
        int dp3;
        CharSequence highlightText;
        int i16;
        int i17;
        int i18;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i19;
        int lineCount4;
        int lineCount5;
        int i20;
        int lineCount6;
        int i21;
        CharSequence charSequence29;
        Layout.Alignment alignment;
        CharSequence ellipsize;
        CharSequence replaceTwoNewLinesToOne;
        CharSequence highlightText2;
        DialogCellTags dialogCellTags2;
        int dp4;
        int dp5;
        DialogCellTags dialogCellTags3;
        CharSequence highlightText3;
        CharSequence charSequence30;
        CharSequence charSequence31;
        boolean z18;
        boolean z19;
        String str13;
        SpannableStringBuilder formatInternal;
        DialogCell dialogCell5 = this;
        if (dialogCell5.isTransitionSupport) {
            return;
        }
        if (dialogCell5.isDialogCell && !dialogCell5.updateHelper.update() && dialogCell5.currentDialogFolderId == 0 && dialogCell5.encryptedChat == null) {
            return;
        }
        if (!dialogCell5.useForceThreeLines) {
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
        int color = Theme.getColor(Theme.key_chats_message_threeLines, dialogCell5.resourcesProvider);
        textPaint.linkColor = color;
        textPaint.setColor(color);
        dialogCell5.paintIndex = 1;
        dialogCell5.thumbSize = 18;
        dialogCell5.currentDialogFolderDialogsCount = 0;
        if (isForumCell() || !(dialogCell5.isDialogCell || dialogCell5.isTopic)) {
            str = "%d";
            charSequence = null;
        } else {
            str = "%d";
            charSequence = MessagesController.getInstance(dialogCell5.currentAccount).getPrintingString(dialogCell5.currentDialogId, getTopicId(), true);
        }
        dialogCell5.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell5.paintIndex];
        dialogCell5.drawNameLock = false;
        dialogCell5.drawVerified = false;
        dialogCell5.drawBotVerified = false;
        dialogCell5.drawPremium = false;
        dialogCell5.drawForwardIcon = false;
        dialogCell5.drawGiftIcon = false;
        dialogCell5.drawScam = 0;
        dialogCell5.drawPinBackground = false;
        dialogCell5.thumbsCount = 0;
        dialogCell5.hasVideoThumb = false;
        dialogCell5.nameLayoutEllipsizeByGradient = false;
        boolean z20 = (UserObject.isUserSelf(dialogCell5.user) || dialogCell5.useMeForMyMessages) ? false : true;
        dialogCell5.printingStringType = -1;
        if (!isForumCell()) {
            dialogCell5.buttonLayout = null;
        }
        dialogCell5.setOpenBotButton(false);
        if ((!dialogCell5.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || dialogCell5.currentDialogFolderId != 0 || isForumCell() || hasTags()) {
            dialogCell5.hasNameInMessage = true;
            i = 1;
        } else {
            dialogCell5.hasNameInMessage = false;
            i = 2;
        }
        MessageObject messageObject6 = dialogCell5.message;
        if (messageObject6 != null) {
            messageObject6.updateTranslation();
        }
        MessageObject messageObject7 = dialogCell5.message;
        CharSequence charSequence32 = messageObject7 != null ? messageObject7.messageText : null;
        if (charSequence32 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence32);
            for (URLSpanNoUnderlineBold uRLSpanNoUnderlineBold : (URLSpanNoUnderlineBold[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderlineBold.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderlineBold);
            }
            z = true;
            for (URLSpanNoUnderline uRLSpanNoUnderline : (URLSpanNoUnderline[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderline.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderline);
            }
            charSequence32 = spannableStringBuilder;
        } else {
            z = true;
        }
        dialogCell5.lastMessageString = charSequence32;
        if (dialogCell5.isShareToStoryCell) {
            dialogCell5.drawPinBackground = z;
            z2 = false;
            z3 = false;
        } else {
            z2 = z20;
            z3 = true;
        }
        CustomDialog customDialog = dialogCell5.customDialog;
        if (customDialog != null) {
            if (customDialog.type == 2) {
                dialogCell5.drawNameLock = true;
                if (dialogCell5.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                    dialogCell5.nameLockTop = AndroidUtilities.dp(12.5f);
                    if (!LocaleController.isRTL) {
                        dialogCell5.nameLockLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 6);
                        dialogCell5.nameLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 10) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                    } else {
                        dialogCell5.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(dialogCell5.messagePaddingStart + 6)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        dialogCell5.nameLeft = AndroidUtilities.dp(22.0f);
                    }
                } else {
                    dialogCell5.nameLockTop = AndroidUtilities.dp(16.5f);
                    if (!LocaleController.isRTL) {
                        dialogCell5.nameLockLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 4);
                        dialogCell5.nameLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 8) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                    } else {
                        dialogCell5.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(dialogCell5.messagePaddingStart + 4)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        dialogCell5.nameLeft = AndroidUtilities.dp(18.0f);
                    }
                }
            } else {
                dialogCell5.drawVerified = !dialogCell5.forbidVerified && customDialog.verified;
                if (dialogCell5.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                    if (!LocaleController.isRTL) {
                        dialogCell5.nameLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 6);
                    } else {
                        dialogCell5.nameLeft = AndroidUtilities.dp(22.0f);
                    }
                } else if (!LocaleController.isRTL) {
                    dialogCell5.nameLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 4);
                } else {
                    dialogCell5.nameLeft = AndroidUtilities.dp(18.0f);
                }
            }
            CustomDialog customDialog2 = dialogCell5.customDialog;
            if (customDialog2.type == 1) {
                charSequence31 = LocaleController.getString(R.string.FromYou);
                CustomDialog customDialog3 = dialogCell5.customDialog;
                if (customDialog3.isMedia) {
                    dialogCell5.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell5.paintIndex];
                    formatInternal = dialogCell5.formatInternal(i, dialogCell5.message.messageText, null);
                    formatInternal.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage, dialogCell5.resourcesProvider), 0, formatInternal.length(), 33);
                } else {
                    String str14 = customDialog3.message;
                    if (str14.length() > 150) {
                        str14 = str14.substring(0, 150);
                    }
                    if (dialogCell5.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        formatInternal = dialogCell5.formatInternal(i, str14, charSequence31);
                    } else {
                        formatInternal = dialogCell5.formatInternal(i, str14.replace('\n', ' '), charSequence31);
                    }
                }
                charSequence30 = Emoji.replaceEmoji(formatInternal, Theme.dialogs_messagePaint[dialogCell5.paintIndex].getFontMetricsInt(), false);
                z14 = false;
            } else {
                charSequence30 = customDialog2.message;
                if (customDialog2.isMedia) {
                    dialogCell5.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell5.paintIndex];
                }
                charSequence31 = null;
                z14 = true;
            }
            str8 = LocaleController.stringForMessageListDate(dialogCell5.customDialog.date);
            int i23 = dialogCell5.customDialog.unread_count;
            if (i23 != 0) {
                z18 = true;
                dialogCell5.drawCount = true;
                z19 = false;
                str13 = String.format(str, Integer.valueOf(i23));
            } else {
                z18 = true;
                z19 = false;
                dialogCell5.drawCount = false;
                str13 = null;
            }
            CustomDialog customDialog4 = dialogCell5.customDialog;
            int i24 = customDialog4.sent;
            if (i24 == 0) {
                dialogCell5.drawClock = z18;
                dialogCell5.drawCheck1 = z19;
                dialogCell5.drawCheck2 = z19;
            } else if (i24 == 2) {
                dialogCell5.drawCheck1 = z18;
                dialogCell5.drawCheck2 = z18;
                dialogCell5.drawClock = z19;
            } else if (i24 == z18) {
                dialogCell5.drawCheck1 = z19;
                dialogCell5.drawCheck2 = z18;
                dialogCell5.drawClock = z19;
            } else {
                dialogCell5.drawClock = z19;
                dialogCell5.drawCheck1 = z19;
                dialogCell5.drawCheck2 = z19;
            }
            dialogCell5.drawError = z19;
            String str15 = customDialog4.name;
            charSequence9 = charSequence30;
            charSequence4 = "";
            charSequence27 = null;
            str7 = null;
            charSequence28 = charSequence31;
            escape = str15;
            str6 = str13;
            i9 = -1;
            dialogCell4 = dialogCell5;
        } else {
            if (dialogCell5.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                if (!LocaleController.isRTL) {
                    dialogCell5.nameLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 6);
                } else {
                    dialogCell5.nameLeft = AndroidUtilities.dp(22.0f);
                }
            } else if (!LocaleController.isRTL) {
                dialogCell5.nameLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 4);
            } else {
                dialogCell5.nameLeft = AndroidUtilities.dp(18.0f);
            }
            if (dialogCell5.encryptedChat != null) {
                if (dialogCell5.currentDialogFolderId == 0) {
                    dialogCell5.drawNameLock = true;
                    if (dialogCell5.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        dialogCell5.nameLockTop = AndroidUtilities.dp(12.5f);
                        if (!LocaleController.isRTL) {
                            dialogCell5.nameLockLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 6);
                            dialogCell5.nameLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 10) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        } else {
                            dialogCell5.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(dialogCell5.messagePaddingStart + 6)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                            dialogCell5.nameLeft = AndroidUtilities.dp(22.0f);
                        }
                    } else {
                        dialogCell5.nameLockTop = AndroidUtilities.dp(16.5f);
                        if (!LocaleController.isRTL) {
                            dialogCell5.nameLockLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 4);
                            dialogCell5.nameLeft = AndroidUtilities.dp(dialogCell5.messagePaddingStart + 8) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
                        } else {
                            dialogCell5.nameLockLeft = (getMeasuredWidth() - AndroidUtilities.dp(dialogCell5.messagePaddingStart + 4)) - Theme.dialogs_lockDrawable.getIntrinsicWidth();
                            dialogCell5.nameLeft = AndroidUtilities.dp(18.0f);
                        }
                    }
                }
            } else if (dialogCell5.currentDialogFolderId == 0) {
                TLRPC.Chat chat3 = dialogCell5.chat;
                if (chat3 != null) {
                    j = DialogObject.getBotVerificationIcon(chat3);
                    TLRPC.Chat chat4 = dialogCell5.chat;
                    if (chat4.scam) {
                        dialogCell5.drawScam = 1;
                        Theme.dialogs_scamDrawable.checkText();
                    } else if (chat4.fake) {
                        dialogCell5.drawScam = 2;
                        Theme.dialogs_fakeDrawable.checkText();
                    } else {
                        if (DialogObject.getEmojiStatusDocumentId(chat4.emoji_status) != 0) {
                            dialogCell5.drawPremium = true;
                            dialogCell5.nameLayoutEllipsizeByGradient = true;
                            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = dialogCell5.emojiStatus;
                            swapAnimatedEmojiDrawable.center = LocaleController.isRTL;
                            charSequence2 = charSequence32;
                            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(dialogCell5.chat.emoji_status), false);
                            dialogCell5.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(dialogCell5.chat.emoji_status), false);
                        } else {
                            charSequence2 = charSequence32;
                            boolean z21 = dialogCell5.forbidVerified;
                            dialogCell5.drawVerified = !z21 && dialogCell5.chat.verified;
                            dialogCell5.drawBotVerified = (z21 || dialogCell5.chat.bot_verification_icon == 0) ? false : true;
                        }
                        str2 = str;
                        j2 = 0;
                        z4 = false;
                        dialogCell2 = dialogCell5;
                    }
                    charSequence2 = charSequence32;
                    str2 = str;
                    j2 = 0;
                    z4 = false;
                    dialogCell2 = dialogCell5;
                } else {
                    charSequence2 = charSequence32;
                    TLRPC.User user3 = dialogCell5.user;
                    if (user3 != null) {
                        j = DialogObject.getBotVerificationIcon(user3);
                        TLRPC.User user4 = dialogCell5.user;
                        if (user4.scam) {
                            dialogCell5.drawScam = 1;
                            Theme.dialogs_scamDrawable.checkText();
                        } else if (user4.fake) {
                            dialogCell5.drawScam = 2;
                            Theme.dialogs_fakeDrawable.checkText();
                        } else {
                            boolean z22 = dialogCell5.forbidVerified;
                            dialogCell5.drawVerified = !z22 && user4.verified;
                            dialogCell5.drawBotVerified = (z22 || UserObject.isUserSelf(user4) || dialogCell5.user.bot_verification_icon == 0) ? false : true;
                        }
                        if (MessagesController.getInstance(dialogCell5.currentAccount).isPremiumUser(dialogCell5.user)) {
                            long j3 = UserConfig.getInstance(dialogCell5.currentAccount).clientUserId;
                            long j4 = dialogCell5.user.id;
                            if (j3 != j4 && j4 != 0) {
                                z5 = true;
                                DialogCell dialogCell6 = this;
                                dialogCell6.drawPremium = z5;
                                if (z5) {
                                    str2 = str;
                                    z4 = false;
                                    dialogCell = dialogCell6;
                                } else {
                                    Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(dialogCell6.user);
                                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = dialogCell6.emojiStatus;
                                    swapAnimatedEmojiDrawable2.center = LocaleController.isRTL;
                                    if (emojiStatusDocumentId != null) {
                                        dialogCell6.nameLayoutEllipsizeByGradient = true;
                                        str2 = str;
                                        z4 = false;
                                        swapAnimatedEmojiDrawable2.set(emojiStatusDocumentId.longValue(), false);
                                        dialogCell6.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(dialogCell6.user.emoji_status), false);
                                        dialogCell = dialogCell6;
                                    } else {
                                        str2 = str;
                                        z4 = false;
                                        dialogCell6.nameLayoutEllipsizeByGradient = true;
                                        swapAnimatedEmojiDrawable2.set(PremiumGradient.getInstance().premiumStarDrawableMini, false);
                                        dialogCell6.emojiStatus.setParticles(false, false);
                                        dialogCell = dialogCell6;
                                    }
                                }
                            }
                        }
                        z5 = false;
                        DialogCell dialogCell62 = this;
                        dialogCell62.drawPremium = z5;
                        if (z5) {
                        }
                    } else {
                        str2 = str;
                        z4 = false;
                        j = 0;
                        dialogCell = dialogCell5;
                    }
                    j2 = 0;
                    dialogCell2 = dialogCell;
                }
                dialogCell3 = dialogCell2;
                if (j != j2) {
                    boolean z23 = dialogCell2.drawBotVerified;
                    dialogCell3 = dialogCell2;
                    if (z23) {
                        dialogCell2.botVerification.set(j, z4);
                        dialogCell3 = dialogCell2;
                    }
                }
                i2 = dialogCell3.lastMessageDate;
                if (i2 == 0 && (messageObject5 = dialogCell3.message) != null) {
                    i2 = messageObject5.messageOwner.date;
                }
                if (!dialogCell3.isTopic) {
                    boolean z24 = MediaDataController.getInstance(dialogCell3.currentAccount).getDraftVoice(dialogCell3.currentDialogId, (long) getTopicId()) != null;
                    dialogCell3.draftVoice = z24;
                    TLRPC.DraftMessage draft = !z24 ? MediaDataController.getInstance(dialogCell3.currentAccount).getDraft(dialogCell3.currentDialogId, getTopicId()) : null;
                    dialogCell3.draftMessage = draft;
                    if (draft != null && TextUtils.isEmpty(draft.message)) {
                        dialogCell3.draftMessage = null;
                    }
                } else if (dialogCell3.isDialogCell || dialogCell3.isSavedDialogCell) {
                    boolean z25 = MediaDataController.getInstance(dialogCell3.currentAccount).getDraftVoice(dialogCell3.currentDialogId, (long) getTopicId()) != null;
                    dialogCell3.draftVoice = z25;
                    dialogCell3.draftMessage = !z25 ? MediaDataController.getInstance(dialogCell3.currentAccount).getDraft(dialogCell3.currentDialogId, 0L) : null;
                } else {
                    dialogCell3.draftVoice = false;
                    dialogCell3.draftMessage = null;
                }
                z6 = dialogCell3.draftVoice;
                if ((!z6 && dialogCell3.draftMessage == null) || ((z6 || (draftMessage2 = dialogCell3.draftMessage) == null || !TextUtils.isEmpty(draftMessage2.message) || ((inputReplyTo = dialogCell3.draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0)) && ((draftMessage = dialogCell3.draftMessage) == null || i2 <= draftMessage.date || dialogCell3.unreadCount == 0))) {
                    if (ChatObject.isChannel(dialogCell3.chat)) {
                        TLRPC.Chat chat5 = dialogCell3.chat;
                        if (!chat5.megagroup) {
                            if (!chat5.creator) {
                                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat5.admin_rights;
                                if (tL_chatAdminRights != null) {
                                }
                            }
                        }
                    }
                    chat2 = dialogCell3.chat;
                    if ((chat2 != null || (!chat2.left && !chat2.kicked)) && !dialogCell3.forbidDraft && (!ChatObject.isForum(chat2) || dialogCell3.isTopic)) {
                        draftMessage3 = null;
                        z7 = false;
                        if (!isForumCell()) {
                            dialogCell3.draftMessage = draftMessage3;
                            dialogCell3.draftVoice = z7;
                            dialogCell3.needEmoji = true;
                            updateMessageThumbs();
                            string = ChatObject.isMonoForum(dialogCell3.chat) ? null : AndroidUtilities.escape(getMessageNameString());
                            if (ChatObject.isMonoForum(dialogCell3.chat)) {
                                if (i == 1) {
                                    i11 = 3;
                                    i = 2;
                                } else {
                                    i11 = 3;
                                }
                                if (i == i11) {
                                    string = null;
                                    i = 4;
                                } else {
                                    string = null;
                                }
                            }
                            charSequence9 = formatTopicsNames();
                            MessageObject messageObject8 = dialogCell3.message;
                            String messageStringFormatted = dialogCell3.message != null ? dialogCell3.getMessageStringFormatted(i, messageObject8 != null ? MessagesController.getInstance(messageObject8.currentAccount).getRestrictionReason(dialogCell3.message.messageOwner.restriction_reason) : null, string, true) : "";
                            CharSequence charSequence33 = messageStringFormatted;
                            if (dialogCell3.applyName) {
                                int length = messageStringFormatted.length();
                                charSequence33 = messageStringFormatted;
                                charSequence33 = messageStringFormatted;
                                if (length >= 0 && string != null) {
                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(messageStringFormatted);
                                    valueOf.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_name, dialogCell3.resourcesProvider), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                    charSequence33 = valueOf;
                                }
                            }
                            dialogCell3.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell3.paintIndex];
                            z9 = z2;
                            charSequence5 = " ";
                            charSequence4 = "";
                            charSequence6 = "d ";
                            i4 = -1;
                            charSequence25 = charSequence33;
                        } else if (!TextUtils.isEmpty(dialogCell3.customMessage)) {
                            dialogCell3.draftMessage = null;
                            dialogCell3.draftVoice = false;
                            charSequence9 = dialogCell3.customMessage;
                            dialogCell3.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell3.paintIndex];
                            z9 = z2;
                            charSequence5 = " ";
                            charSequence4 = "";
                            charSequence6 = "d ";
                            string = null;
                            i4 = -1;
                            charSequence25 = null;
                        } else {
                            if (charSequence != null) {
                                dialogCell3.lastPrintString = charSequence;
                                int intValue = MessagesController.getInstance(dialogCell3.currentAccount).getPrintingStringType(dialogCell3.currentDialogId, getTopicId()).intValue();
                                dialogCell3.printingStringType = intValue;
                                StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(intValue);
                                int intrinsicWidth = chatStatusDrawable != null ? chatStatusDrawable.getIntrinsicWidth() + AndroidUtilities.dp(3.0f) : 0;
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                CharSequence replace = TextUtils.replace(charSequence, new String[]{"..."}, new String[]{""});
                                int indexOf = dialogCell3.printingStringType == 5 ? replace.toString().indexOf("**oo**") : -1;
                                if (indexOf >= 0) {
                                    spannableStringBuilder2.append(replace).setSpan(new FixedWidthSpan(Theme.getChatStatusDrawable(dialogCell3.printingStringType).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                } else {
                                    spannableStringBuilder2.append((CharSequence) " ").append(replace).setSpan(new FixedWidthSpan(intrinsicWidth), 0, 1, 0);
                                }
                                i3 = indexOf;
                                z8 = false;
                                charSequence3 = spannableStringBuilder2;
                            } else {
                                dialogCell3.lastPrintString = null;
                                dialogCell3.printingStringType = -1;
                                charSequence3 = "";
                                z8 = true;
                                i3 = -1;
                            }
                            if (dialogCell3.draftVoice || dialogCell3.draftMessage != null) {
                                z9 = z2;
                                charSequence4 = charSequence3;
                                int i25 = i;
                                charSequence5 = " ";
                                charSequence6 = "d ";
                                string = LocaleController.getString(R.string.Draft);
                                TLRPC.DraftMessage draftMessage4 = dialogCell3.draftMessage;
                                if (draftMessage4 != null && TextUtils.isEmpty(draftMessage4.message)) {
                                    if ((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                        i4 = i3;
                                        charSequence9 = "";
                                        charSequence10 = null;
                                        z11 = false;
                                    } else {
                                        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                        valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, dialogCell3.resourcesProvider), 0, string.length(), 33);
                                        charSequence7 = valueOf2;
                                    }
                                } else {
                                    if (dialogCell3.draftVoice) {
                                        str3 = LocaleController.getString(R.string.AttachAudio);
                                    } else {
                                        TLRPC.DraftMessage draftMessage5 = dialogCell3.draftMessage;
                                        if (draftMessage5 != null) {
                                            str3 = draftMessage5.message;
                                            if (str3.length() > 150) {
                                                str3 = str3.substring(0, 150);
                                            }
                                        } else {
                                            str3 = "";
                                        }
                                    }
                                    SpannableString spannableString = new SpannableString(str3);
                                    TLRPC.DraftMessage draftMessage6 = dialogCell3.draftMessage;
                                    if (draftMessage6 != null) {
                                        MediaDataController.addTextStyleRuns(draftMessage6, spannableString, NotificationCenter.goingToPreviewTheme);
                                        TLRPC.DraftMessage draftMessage7 = dialogCell3.draftMessage;
                                        if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                            TextPaint textPaint2 = dialogCell3.currentMessagePaint;
                                            MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint2 == null ? null : textPaint2.getFontMetricsInt());
                                        }
                                    } else if (dialogCell3.draftVoice) {
                                        spannableString.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, dialogCell3.resourcesProvider), 0, spannableString.length(), 33);
                                    }
                                    SpannableStringBuilder formatInternal2 = dialogCell3.formatInternal(i25, AndroidUtilities.replaceNewLines(spannableString), string);
                                    if ((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                        formatInternal2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, dialogCell3.resourcesProvider), 0, string.length() + 1, 33);
                                    }
                                    charSequence7 = Emoji.replaceEmoji(formatInternal2, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), z10);
                                }
                                charSequence8 = null;
                                z11 = false;
                                charSequence12 = charSequence7;
                                i5 = i3;
                                charSequence9 = charSequence12;
                                charSequence11 = charSequence8;
                                i4 = i5;
                                charSequence10 = charSequence11;
                            } else {
                                if (dialogCell3.clearingDialog) {
                                    dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                    string2 = LocaleController.getString(R.string.HistoryCleared);
                                } else {
                                    MessageObject messageObject9 = dialogCell3.message;
                                    if (messageObject9 == null) {
                                        if (dialogCell3.currentDialogFolderId != 0) {
                                            string2 = formatArchivedDialogNames();
                                        } else {
                                            TLRPC.EncryptedChat encryptedChat = dialogCell3.encryptedChat;
                                            if (encryptedChat != null) {
                                                dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                    string2 = LocaleController.getString(R.string.EncryptionProcessing);
                                                } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                    string2 = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(dialogCell3.user));
                                                } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                    string2 = LocaleController.getString(R.string.EncryptionRejected);
                                                } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                    if (encryptedChat.admin_id == UserConfig.getInstance(dialogCell3.currentAccount).getClientUserId()) {
                                                        string2 = LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(dialogCell3.user));
                                                    } else {
                                                        string2 = LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                    }
                                                }
                                            } else if (dialogCell3.dialogsType == 3 && UserObject.isUserSelf(dialogCell3.user)) {
                                                DialogsActivity dialogsActivity = dialogCell3.parentFragment;
                                                z11 = z8;
                                                charSequence4 = charSequence3;
                                                string = null;
                                                z3 = false;
                                                charSequence8 = null;
                                                z9 = false;
                                                charSequence5 = " ";
                                                charSequence6 = "d ";
                                                charSequence12 = LocaleController.getString((dialogsActivity == null || !dialogsActivity.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                i5 = i3;
                                                charSequence9 = charSequence12;
                                                charSequence11 = charSequence8;
                                                i4 = i5;
                                                charSequence10 = charSequence11;
                                            }
                                            z11 = z8;
                                            z9 = z2;
                                            charSequence4 = charSequence3;
                                            i4 = i3;
                                            charSequence9 = "";
                                            string = null;
                                            charSequence10 = null;
                                            charSequence5 = " ";
                                            charSequence6 = "d ";
                                        }
                                    } else {
                                        String restrictionReason = MessagesController.getInstance(messageObject9.currentAccount).getRestrictionReason(dialogCell3.message.messageOwner.restriction_reason);
                                        long fromChatId = dialogCell3.message.getFromChatId();
                                        if (DialogObject.isUserDialog(fromChatId)) {
                                            MessagesController.getInstance(dialogCell3.currentAccount).getUser(Long.valueOf(fromChatId));
                                            chat = null;
                                        } else {
                                            chat = MessagesController.getInstance(dialogCell3.currentAccount).getChat(Long.valueOf(-fromChatId));
                                        }
                                        dialogCell3.drawCount2 = true;
                                        if (dialogCell3.dialogsType == 0) {
                                            i6 = i;
                                            if (dialogCell3.currentDialogId > 0 && dialogCell3.message.isOutOwner() && (tL_messageReactions = dialogCell3.message.messageOwner.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && dialogCell3.reactionMentionCount > 0) {
                                                TLRPC.MessagePeerReaction messagePeerReaction = dialogCell3.message.messageOwner.reactions.recent_reactions.get(0);
                                                if (messagePeerReaction.unread) {
                                                    charSequence4 = charSequence3;
                                                    long j5 = messagePeerReaction.peer_id.user_id;
                                                    if (j5 != 0) {
                                                        z11 = z8;
                                                        z9 = z2;
                                                        if (j5 != UserConfig.getInstance(dialogCell3.currentAccount).clientUserId) {
                                                            ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(messagePeerReaction.reaction);
                                                            dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                            String str16 = fromTL.emojicon;
                                                            if (str16 != null) {
                                                                z12 = true;
                                                                charSequence13 = LocaleController.formatString(R.string.ReactionInDialog, str16);
                                                            } else {
                                                                String formatString = LocaleController.formatString(R.string.ReactionInDialog, "**reaction**");
                                                                int indexOf2 = formatString.indexOf("**reaction**");
                                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(formatString.replace("**reaction**", "d"));
                                                                long j6 = fromTL.documentId;
                                                                TextPaint textPaint3 = dialogCell3.currentMessagePaint;
                                                                spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(j6, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                                charSequence13 = spannableStringBuilder3;
                                                                z12 = true;
                                                            }
                                                            if (!z12) {
                                                                int i26 = dialogCell3.dialogsType;
                                                                if (i26 == 2) {
                                                                    TLRPC.Chat chat6 = dialogCell3.chat;
                                                                    if (chat6 != null) {
                                                                        if (ChatObject.isChannel(chat6)) {
                                                                            TLRPC.Chat chat7 = dialogCell3.chat;
                                                                            if (!chat7.megagroup) {
                                                                                int i27 = chat7.participants_count;
                                                                                if (i27 != 0) {
                                                                                    charSequence23 = LocaleController.formatPluralStringComma("Subscribers", i27);
                                                                                } else if (!ChatObject.isPublic(chat7)) {
                                                                                    charSequence23 = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                                                                } else {
                                                                                    charSequence23 = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                                }
                                                                            }
                                                                        }
                                                                        TLRPC.Chat chat8 = dialogCell3.chat;
                                                                        int i28 = chat8.participants_count;
                                                                        if (i28 != 0) {
                                                                            charSequence23 = LocaleController.formatPluralStringComma("Members", i28);
                                                                        } else if (chat8.has_geo) {
                                                                            charSequence23 = LocaleController.getString(R.string.MegaLocation);
                                                                        } else if (!ChatObject.isPublic(chat8)) {
                                                                            charSequence23 = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                                                        } else {
                                                                            charSequence23 = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                        }
                                                                    } else {
                                                                        charSequence23 = "";
                                                                    }
                                                                    dialogCell3.drawCount2 = false;
                                                                    charSequence21 = charSequence23;
                                                                } else if (i26 == 3 && UserObject.isUserSelf(dialogCell3.user)) {
                                                                    DialogsActivity dialogsActivity2 = dialogCell3.parentFragment;
                                                                    charSequence21 = LocaleController.getString((dialogsActivity2 == null || !dialogsActivity2.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                                } else {
                                                                    if (!dialogCell3.useForceThreeLines && !SharedConfig.useThreeLinesLayout && dialogCell3.currentDialogFolderId != 0) {
                                                                        charSequence5 = " ";
                                                                        charSequence6 = "d ";
                                                                        charSequence19 = null;
                                                                        charSequence20 = formatArchivedDialogNames();
                                                                    } else {
                                                                        MessageObject messageObject10 = dialogCell3.message;
                                                                        if ((messageObject10.messageOwner instanceof TLRPC.TL_messageService) && (!MessageObject.isTopicActionMessage(messageObject10) || (dialogCell3.message.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                            if (ChatObject.isChannelAndNotMegaGroup(dialogCell3.chat) && (dialogCell3.message.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                                charSequence13 = "";
                                                                                z9 = false;
                                                                            } else {
                                                                                CharSequence charSequence34 = dialogCell3.message.messageTextShort;
                                                                                charSequence13 = charSequence34;
                                                                                if (charSequence34 == null) {
                                                                                    charSequence13 = charSequence2;
                                                                                }
                                                                            }
                                                                            dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                            if (dialogCell3.message.type == 21) {
                                                                                updateMessageThumbs();
                                                                                charSequence13 = dialogCell3.applyThumbs(charSequence13);
                                                                            }
                                                                        } else {
                                                                            dialogCell3.needEmoji = true;
                                                                            updateMessageThumbs();
                                                                            String escape2 = (dialogCell3.isSavedDialog || (user2 = dialogCell3.user) == null || !user2.self || dialogCell3.message.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                            if ((!dialogCell3.isSavedDialog || (user = dialogCell3.user) == null || user.self || (messageObject2 = dialogCell3.message) == null || !messageObject2.isOutOwner()) && escape2 == null) {
                                                                                TLRPC.Chat chat9 = dialogCell3.chat;
                                                                                if (chat9 != null) {
                                                                                    long j7 = chat9.id;
                                                                                    if (j7 > 0) {
                                                                                        charSequence5 = " ";
                                                                                        if (chat != null) {
                                                                                        }
                                                                                        if (ChatObject.isChannel(chat9)) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                charSequence5 = " ";
                                                                                TLRPC.User user5 = dialogCell3.user;
                                                                                if (user5 == null || user5.id != UserObject.VERIFY || (messageObject = dialogCell3.message) == null || messageObject.getForwardedFromId() == null) {
                                                                                    boolean isEmpty = TextUtils.isEmpty(restrictionReason);
                                                                                    CharSequence charSequence35 = restrictionReason;
                                                                                    if (isEmpty) {
                                                                                        if (MessageObject.isTopicActionMessage(dialogCell3.message)) {
                                                                                            MessageObject messageObject11 = dialogCell3.message;
                                                                                            CharSequence charSequence36 = messageObject11.messageTextShort;
                                                                                            if (charSequence36 == null || ((messageObject11.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && dialogCell3.isTopic)) {
                                                                                                charSequence36 = messageObject11.messageText;
                                                                                            }
                                                                                            CharSequence charSequence37 = charSequence36;
                                                                                            charSequence35 = charSequence37;
                                                                                            if (messageObject11.topicIconDrawable[0] instanceof ForumBubbleDrawable) {
                                                                                                TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(dialogCell3.currentAccount).getTopicsController().findTopic(-dialogCell3.message.getDialogId(), MessageObject.getTopicId(dialogCell3.currentAccount, dialogCell3.message.messageOwner, true));
                                                                                                charSequence35 = charSequence37;
                                                                                                if (findTopic != null) {
                                                                                                    ((ForumBubbleDrawable) dialogCell3.message.topicIconDrawable[0]).setColor(findTopic.icon_color);
                                                                                                    charSequence35 = charSequence37;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            TLRPC.MessageMedia messageMedia = dialogCell3.message.messageOwner.media;
                                                                                            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                                charSequence35 = LocaleController.getString(R.string.AttachPhotoExpired);
                                                                                            } else {
                                                                                                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                                    TLRPC.Document document = messageMedia.document;
                                                                                                    if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                        if (messageMedia.voice) {
                                                                                                            charSequence35 = LocaleController.getString(R.string.AttachVoiceExpired);
                                                                                                        } else if (messageMedia.round) {
                                                                                                            charSequence35 = LocaleController.getString(R.string.AttachRoundExpired);
                                                                                                        } else {
                                                                                                            charSequence35 = LocaleController.getString(R.string.AttachVideoExpired);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (getCaptionMessage() != null) {
                                                                                                    MessageObject captionMessage = getCaptionMessage();
                                                                                                    if (!dialogCell3.needEmoji) {
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
                                                                                                        CharSequence charSequence38 = captionMessage.messageTrimmedToHighlight;
                                                                                                        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(dialogCell3.messagePaddingStart + 47);
                                                                                                        if (dialogCell3.hasNameInMessage) {
                                                                                                            if (!TextUtils.isEmpty(null)) {
                                                                                                                throw null;
                                                                                                            }
                                                                                                            measuredWidth = (int) (measuredWidth - dialogCell3.currentMessagePaint.measureText(": "));
                                                                                                        }
                                                                                                        if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                            charSequence38 = AndroidUtilities.ellipsizeCenterEnd(charSequence38, captionMessage.highlightedWords.get(0), measuredWidth, dialogCell3.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                                                                                                        }
                                                                                                        charSequence35 = new SpannableStringBuilder(str5).append(charSequence38);
                                                                                                    } else {
                                                                                                        SpannableString spannableString2 = new SpannableString(captionMessage.caption);
                                                                                                        if (captionMessage.messageOwner != null) {
                                                                                                            captionMessage.spoilLoginCode();
                                                                                                            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString2, NotificationCenter.goingToPreviewTheme);
                                                                                                            ArrayList<TLRPC.MessageEntity> arrayList3 = captionMessage.messageOwner.entities;
                                                                                                            TextPaint textPaint4 = dialogCell3.currentMessagePaint;
                                                                                                            MediaDataController.addAnimatedEmojiSpans(arrayList3, spannableString2, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                        }
                                                                                                        charSequence35 = new SpannableStringBuilder(str5).append((CharSequence) spannableString2);
                                                                                                    }
                                                                                                } else {
                                                                                                    MessageObject messageObject12 = dialogCell3.message;
                                                                                                    TLRPC.Message message2 = messageObject12.messageOwner;
                                                                                                    TLRPC.MessageMedia messageMedia2 = message2.media;
                                                                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                        int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                        if (dialogCell3.hasVideoThumb) {
                                                                                                            i7 = 1;
                                                                                                            if (size > 1) {
                                                                                                                c2 = 0;
                                                                                                                formatPluralString2 = LocaleController.formatPluralString("Media", size, new Object[0]);
                                                                                                            } else {
                                                                                                                c2 = 0;
                                                                                                                formatPluralString2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                            }
                                                                                                        } else {
                                                                                                            c2 = 0;
                                                                                                            i7 = 1;
                                                                                                            formatPluralString2 = size > 1 ? LocaleController.formatPluralString("Photos", size, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                        }
                                                                                                        int i29 = R.string.AttachPaidMedia;
                                                                                                        Object[] objArr = new Object[i7];
                                                                                                        objArr[c2] = formatPluralString2;
                                                                                                        CharSequence replaceStars = StarsIntroActivity.replaceStars(LocaleController.formatString(i29, objArr));
                                                                                                        dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                                        charSequence35 = replaceStars;
                                                                                                    } else if (dialogCell3.thumbsCount > 1) {
                                                                                                        if (dialogCell3.hasVideoThumb) {
                                                                                                            ArrayList arrayList4 = dialogCell3.groupMessages;
                                                                                                            formatPluralString = LocaleController.formatPluralString("Media", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                        } else {
                                                                                                            ArrayList arrayList5 = dialogCell3.groupMessages;
                                                                                                            formatPluralString = LocaleController.formatPluralString("Photos", arrayList5 == null ? 0 : arrayList5.size(), new Object[0]);
                                                                                                        }
                                                                                                        charSequence35 = formatPluralString;
                                                                                                        dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                                    } else {
                                                                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                            TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                                                                                                            if (messageFwdHeader != null) {
                                                                                                                TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                                if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                    isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, dialogCell3.currentAccount);
                                                                                                                    charSequence17 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                                }
                                                                                                            }
                                                                                                            isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(dialogCell3.chat);
                                                                                                            charSequence17 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                            charSequence17 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                            TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                            if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                                charSequence17 = "📊 " + tL_messageMediaPoll.poll.question.text;
                                                                                                            } else {
                                                                                                                SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                                MediaDataController.addTextStyleRuns(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString3);
                                                                                                                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt());
                                                                                                                charSequence17 = new SpannableStringBuilder("📊 ").append((CharSequence) spannableString3);
                                                                                                            }
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                            TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                            if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                                charSequence17 = "✅ " + tL_messageMediaToDo.todo.title.text;
                                                                                                            } else {
                                                                                                                SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                                TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                                MediaDataController.addTextStyleRuns(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString4);
                                                                                                                MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt());
                                                                                                                charSequence17 = new SpannableStringBuilder("✅ ").append((CharSequence) spannableString4);
                                                                                                            }
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                            charSequence17 = "🎮 " + dialogCell3.message.messageOwner.media.game.title;
                                                                                                        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                            charSequence17 = messageMedia2.title;
                                                                                                        } else if (messageObject12.type == 14) {
                                                                                                            charSequence17 = String.format("🎧 %s - %s", messageObject12.getMusicAuthor(), dialogCell3.message.getMusicTitle());
                                                                                                        } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaStory) && messageMedia2.via_mention) {
                                                                                                            if (messageObject12.isOut()) {
                                                                                                                TLRPC.User user6 = MessagesController.getInstance(dialogCell3.currentAccount).getUser(Long.valueOf(dialogCell3.message.getDialogId()));
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
                                                                                                                int i30 = R.string.StoryYouMentionInDialog;
                                                                                                                Object[] objArr2 = new Object[1];
                                                                                                                objArr2[c] = str4;
                                                                                                                charSequence17 = LocaleController.formatString(i30, objArr2);
                                                                                                            } else {
                                                                                                                charSequence17 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (messageObject12.hasHighlightedWords() && !TextUtils.isEmpty(dialogCell3.message.messageOwner.message)) {
                                                                                                                CharSequence charSequence39 = dialogCell3.message.messageTrimmedToHighlight;
                                                                                                                int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(dialogCell3.messagePaddingStart + 23);
                                                                                                                MessageObject messageObject13 = dialogCell3.message;
                                                                                                                charSequence16 = charSequence39;
                                                                                                                if (messageObject13.messageTrimmedToHighlightCut) {
                                                                                                                    charSequence16 = AndroidUtilities.ellipsizeCenterEnd(charSequence39, messageObject13.highlightedWords.get(0), measuredWidth2, dialogCell3.currentMessagePaint, NotificationCenter.dialogTranslate);
                                                                                                                }
                                                                                                            } else {
                                                                                                                SpannableString spannableString5 = new SpannableString(charSequence2);
                                                                                                                MessageObject messageObject14 = dialogCell3.message;
                                                                                                                if (messageObject14 != null) {
                                                                                                                    messageObject14.spoilLoginCode();
                                                                                                                }
                                                                                                                MediaDataController.addTextStyleRuns(dialogCell3.message, spannableString5, NotificationCenter.goingToPreviewTheme);
                                                                                                                MessageObject messageObject15 = dialogCell3.message;
                                                                                                                charSequence16 = spannableString5;
                                                                                                                if (messageObject15 != null) {
                                                                                                                    TLRPC.Message message3 = messageObject15.messageOwner;
                                                                                                                    charSequence16 = spannableString5;
                                                                                                                    if (message3 != null) {
                                                                                                                        ArrayList<TLRPC.MessageEntity> arrayList6 = message3.entities;
                                                                                                                        TextPaint textPaint5 = dialogCell3.currentMessagePaint;
                                                                                                                        MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                                        charSequence16 = spannableString5;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            AndroidUtilities.highlightText(charSequence16, dialogCell3.message.highlightedWords, dialogCell3.resourcesProvider);
                                                                                                            charSequence17 = charSequence16;
                                                                                                        }
                                                                                                        CharSequence charSequence40 = charSequence17;
                                                                                                        MessageObject messageObject16 = dialogCell3.message;
                                                                                                        charSequence35 = charSequence40;
                                                                                                        if (messageObject16.messageOwner.media != null) {
                                                                                                            charSequence35 = charSequence40;
                                                                                                            if (!messageObject16.isMediaEmpty()) {
                                                                                                                dialogCell3.currentMessagePaint = Theme.dialogs_messagePrintingPaint[dialogCell3.paintIndex];
                                                                                                                charSequence35 = charSequence40;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (!dialogCell3.message.isReplyToStory()) {
                                                                                        charSequence6 = "d ";
                                                                                        charSequence14 = charSequence35;
                                                                                    } else {
                                                                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence35);
                                                                                        charSequence6 = "d ";
                                                                                        spannableStringBuilder4.insert(0, charSequence6);
                                                                                        spannableStringBuilder4.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                        charSequence14 = spannableStringBuilder4;
                                                                                    }
                                                                                    CharSequence charSequence41 = charSequence14;
                                                                                    if (dialogCell3.thumbsCount > 0) {
                                                                                        if (dialogCell3.message.hasHighlightedWords() && !TextUtils.isEmpty(dialogCell3.message.messageOwner.message)) {
                                                                                            replaceNewLines = dialogCell3.message.messageTrimmedToHighlight;
                                                                                            int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(((dialogCell3.messagePaddingStart + 23) + ((dialogCell3.thumbSize + 2) * dialogCell3.thumbsCount)) + 3);
                                                                                            MessageObject messageObject17 = dialogCell3.message;
                                                                                            if (messageObject17.messageTrimmedToHighlightCut) {
                                                                                                replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject17.highlightedWords.get(0), measuredWidth3, dialogCell3.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                                                                                            }
                                                                                        } else {
                                                                                            int length2 = charSequence14.length();
                                                                                            CharSequence charSequence42 = charSequence14;
                                                                                            if (length2 > 150) {
                                                                                                charSequence42 = charSequence14.subSequence(0, 150);
                                                                                            }
                                                                                            replaceNewLines = AndroidUtilities.replaceNewLines(charSequence42);
                                                                                        }
                                                                                        CharSequence spannableStringBuilder5 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                        SpannableStringBuilder spannableStringBuilder6 = (SpannableStringBuilder) spannableStringBuilder5;
                                                                                        spannableStringBuilder6.insert(0, charSequence5);
                                                                                        spannableStringBuilder6.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((dialogCell3.thumbSize + 2) * dialogCell3.thumbsCount) + 3)), 0, 1, 33);
                                                                                        Emoji.replaceEmoji(spannableStringBuilder6, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                                                                                        CharSequence charSequence43 = spannableStringBuilder5;
                                                                                        if (dialogCell3.message.hasHighlightedWords()) {
                                                                                            CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder6, dialogCell3.message.highlightedWords, dialogCell3.resourcesProvider);
                                                                                            charSequence43 = spannableStringBuilder5;
                                                                                            if (highlightText4 != null) {
                                                                                                charSequence43 = highlightText4;
                                                                                            }
                                                                                        }
                                                                                        z11 = false;
                                                                                        charSequence41 = charSequence43;
                                                                                    }
                                                                                    if (dialogCell3.message.isForwarded() && dialogCell3.message.needDrawForwarded()) {
                                                                                        dialogCell3.drawForwardIcon = true;
                                                                                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence41);
                                                                                        spannableStringBuilder7.insert(0, charSequence6);
                                                                                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                        coloredImageSpan.setAlpha(0.9f);
                                                                                        spannableStringBuilder7.setSpan(coloredImageSpan, 0, 1, 0);
                                                                                        charSequence15 = spannableStringBuilder7;
                                                                                    } else {
                                                                                        charSequence15 = charSequence41;
                                                                                    }
                                                                                    charSequence22 = null;
                                                                                    charSequence24 = charSequence15;
                                                                                    if (dialogCell3.currentDialogFolderId == 0) {
                                                                                        charSequence11 = null;
                                                                                        i5 = i3;
                                                                                        charSequence9 = charSequence24;
                                                                                        string = formatArchivedDialogNames();
                                                                                        i4 = i5;
                                                                                        charSequence10 = charSequence11;
                                                                                    } else {
                                                                                        i4 = i3;
                                                                                        charSequence9 = charSequence24;
                                                                                        string = charSequence22;
                                                                                        charSequence10 = null;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                charSequence5 = " ";
                                                                            }
                                                                            charSequence6 = "d ";
                                                                            if (escape2 == null) {
                                                                                escape2 = getMessageNameString();
                                                                            }
                                                                            CharSequence escape3 = AndroidUtilities.escape(escape2);
                                                                            TLRPC.Chat chat10 = dialogCell3.chat;
                                                                            if (chat10 != null && chat10.forum && !dialogCell3.isTopic && !dialogCell3.useFromUserAsAvatar) {
                                                                                CharSequence topicIconName = MessagesController.getInstance(dialogCell3.currentAccount).getTopicsController().getTopicIconName(dialogCell3.chat, dialogCell3.message, dialogCell3.currentMessagePaint);
                                                                                if (!TextUtils.isEmpty(topicIconName)) {
                                                                                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("-");
                                                                                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                    coloredImageSpan2.setColorKey((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? -1 : Theme.key_chats_nameMessage);
                                                                                    spannableStringBuilder8.setSpan(coloredImageSpan2, 0, 1, 0);
                                                                                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                                                                                    spannableStringBuilder9.append(escape3).append((CharSequence) spannableStringBuilder8).append(topicIconName);
                                                                                    charSequence18 = spannableStringBuilder9;
                                                                                    SpannableStringBuilder messageStringFormatted2 = dialogCell3.getMessageStringFormatted(i6, restrictionReason, charSequence18, false);
                                                                                    if (!dialogCell3.useFromUserAsAvatar || ((dialogCell3.useForceThreeLines || SharedConfig.useThreeLinesLayout) && (dialogCell3.currentDialogFolderId == 0 || messageStringFormatted2.length() <= 0))) {
                                                                                        i8 = 0;
                                                                                    } else {
                                                                                        try {
                                                                                            foregroundColorSpanThemable = new ForegroundColorSpanThemable(Theme.key_chats_nameMessage, dialogCell3.resourcesProvider);
                                                                                            i8 = charSequence18.length() + 1;
                                                                                        } catch (Exception e) {
                                                                                            e = e;
                                                                                            i8 = 0;
                                                                                        }
                                                                                        try {
                                                                                            messageStringFormatted2.setSpan(foregroundColorSpanThemable, 0, i8, 33);
                                                                                        } catch (Exception e2) {
                                                                                            e = e2;
                                                                                            FileLog.e(e);
                                                                                            CharSequence replaceEmoji = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                                                                                            CharSequence charSequence44 = replaceEmoji;
                                                                                            if (dialogCell3.message.hasHighlightedWords()) {
                                                                                            }
                                                                                            charSequence20 = charSequence44;
                                                                                            charSequence19 = charSequence18;
                                                                                            if (dialogCell3.thumbsCount > 0) {
                                                                                            }
                                                                                            z11 = false;
                                                                                            charSequence24 = charSequence20;
                                                                                            charSequence22 = charSequence19;
                                                                                            if (dialogCell3.currentDialogFolderId == 0) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    CharSequence replaceEmoji2 = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                                                                                    CharSequence charSequence442 = replaceEmoji2;
                                                                                    if (dialogCell3.message.hasHighlightedWords()) {
                                                                                        CharSequence highlightText5 = AndroidUtilities.highlightText(replaceEmoji2, dialogCell3.message.highlightedWords, dialogCell3.resourcesProvider);
                                                                                        charSequence442 = replaceEmoji2;
                                                                                        if (highlightText5 != null) {
                                                                                            charSequence442 = highlightText5;
                                                                                        }
                                                                                    }
                                                                                    charSequence20 = charSequence442;
                                                                                    charSequence19 = charSequence18;
                                                                                    if (dialogCell3.thumbsCount > 0) {
                                                                                        boolean z26 = charSequence442 instanceof SpannableStringBuilder;
                                                                                        CharSequence charSequence45 = charSequence442;
                                                                                        if (!z26) {
                                                                                            charSequence45 = new SpannableStringBuilder(charSequence442);
                                                                                        }
                                                                                        SpannableStringBuilder spannableStringBuilder10 = (SpannableStringBuilder) charSequence45;
                                                                                        if (i8 >= spannableStringBuilder10.length()) {
                                                                                            spannableStringBuilder10.append(charSequence5);
                                                                                            spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((dialogCell3.thumbsCount * (dialogCell3.thumbSize + 2)) + 3)), spannableStringBuilder10.length() - 1, spannableStringBuilder10.length(), 33);
                                                                                            charSequence20 = charSequence45;
                                                                                            charSequence19 = charSequence18;
                                                                                        } else {
                                                                                            spannableStringBuilder10.insert(i8, charSequence5);
                                                                                            spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((dialogCell3.thumbsCount * (dialogCell3.thumbSize + 2)) + 3)), i8, i8 + 1, 33);
                                                                                            charSequence20 = charSequence45;
                                                                                            charSequence19 = charSequence18;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            charSequence18 = escape3;
                                                                            SpannableStringBuilder messageStringFormatted22 = dialogCell3.getMessageStringFormatted(i6, restrictionReason, charSequence18, false);
                                                                            if (dialogCell3.useFromUserAsAvatar) {
                                                                            }
                                                                            i8 = 0;
                                                                            CharSequence replaceEmoji22 = Emoji.replaceEmoji(messageStringFormatted22, Theme.dialogs_messagePaint[dialogCell3.paintIndex].getFontMetricsInt(), false);
                                                                            CharSequence charSequence4422 = replaceEmoji22;
                                                                            if (dialogCell3.message.hasHighlightedWords()) {
                                                                            }
                                                                            charSequence20 = charSequence4422;
                                                                            charSequence19 = charSequence18;
                                                                            if (dialogCell3.thumbsCount > 0) {
                                                                            }
                                                                        }
                                                                    }
                                                                    z11 = false;
                                                                    charSequence24 = charSequence20;
                                                                    charSequence22 = charSequence19;
                                                                    if (dialogCell3.currentDialogFolderId == 0) {
                                                                    }
                                                                }
                                                                charSequence5 = " ";
                                                                charSequence6 = "d ";
                                                                z3 = false;
                                                                charSequence22 = null;
                                                                z9 = false;
                                                                charSequence24 = charSequence21;
                                                                if (dialogCell3.currentDialogFolderId == 0) {
                                                                }
                                                            }
                                                            charSequence5 = " ";
                                                            charSequence6 = "d ";
                                                            charSequence15 = charSequence13;
                                                            charSequence22 = null;
                                                            charSequence24 = charSequence15;
                                                            if (dialogCell3.currentDialogFolderId == 0) {
                                                            }
                                                        }
                                                    } else {
                                                        z11 = z8;
                                                        z9 = z2;
                                                    }
                                                }
                                            }
                                            z11 = z8;
                                            z9 = z2;
                                            charSequence4 = charSequence3;
                                        } else {
                                            z11 = z8;
                                            z9 = z2;
                                            charSequence4 = charSequence3;
                                            i6 = i;
                                        }
                                        charSequence13 = "";
                                        z12 = false;
                                        if (!z12) {
                                        }
                                        charSequence5 = " ";
                                        charSequence6 = "d ";
                                        charSequence15 = charSequence13;
                                        charSequence22 = null;
                                        charSequence24 = charSequence15;
                                        if (dialogCell3.currentDialogFolderId == 0) {
                                        }
                                    }
                                }
                                z11 = z8;
                                z9 = z2;
                                charSequence4 = charSequence3;
                                i4 = i3;
                                charSequence9 = string2;
                                string = null;
                                charSequence10 = null;
                                charSequence5 = " ";
                                charSequence6 = "d ";
                            }
                            if (!dialogCell3.drawForwardIcon && !isFolderCell() && !isForumCell() && !isDialogFolder() && dialogCell3.draftMessage == null && (messageObject4 = dialogCell3.message) != null && (message = messageObject4.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                dialogCell3.drawGiftIcon = true;
                                SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(charSequence9);
                                spannableStringBuilder11.insert(0, charSequence6);
                                ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_gift).mutate());
                                coloredImageSpan3.setScale(1.25f, 1.25f);
                                coloredImageSpan3.spaceScaleX = 0.9f;
                                coloredImageSpan3.setAlpha(0.9f);
                                spannableStringBuilder11.setSpan(coloredImageSpan3, 0, 1, 0);
                                tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) dialogCell3.message.messageOwner.action).message;
                                if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                    dialogCell3.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell3.paintIndex];
                                }
                                charSequence9 = spannableStringBuilder11;
                            }
                            if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                                if (dialogCell3.draftMessage != null) {
                                    stringForMessageListDate = LocaleController.stringForMessageListDate(r2.date);
                                } else {
                                    int i31 = dialogCell3.lastMessageDate;
                                    if (i31 != 0) {
                                        stringForMessageListDate = LocaleController.stringForMessageListDate(i31);
                                    } else {
                                        if (dialogCell3.message != null) {
                                            stringForMessageListDate = LocaleController.stringForMessageListDate(r2.messageOwner.date);
                                        }
                                    }
                                }
                                messageObject3 = dialogCell3.message;
                                if (messageObject3 != null || dialogCell3.isSavedDialog) {
                                    dialogCell3.drawCheck1 = false;
                                    dialogCell3.drawCheck2 = false;
                                    dialogCell3.drawClock = messageObject3 == null && messageObject3.isSending() && dialogCell3.currentDialogId == UserConfig.getInstance(dialogCell3.currentAccount).getClientUserId();
                                    z13 = false;
                                    dialogCell3.drawCount = false;
                                    dialogCell3.drawMention = false;
                                    dialogCell3.drawReactionMention = false;
                                    dialogCell3.drawError = false;
                                    str6 = null;
                                    str7 = null;
                                } else {
                                    if (dialogCell3.currentDialogFolderId != 0) {
                                        int i32 = dialogCell3.unreadCount;
                                        int i33 = dialogCell3.mentionCount;
                                        int i34 = i32 + i33;
                                        if (i34 <= 0) {
                                            z17 = false;
                                            dialogCell3.drawCount = false;
                                            dialogCell3.drawMention = false;
                                            str11 = null;
                                        } else if (i32 > i33) {
                                            dialogCell3.drawCount = true;
                                            z17 = false;
                                            dialogCell3.drawMention = false;
                                            str12 = String.format(str2, Integer.valueOf(i34));
                                            str11 = null;
                                            dialogCell3.drawReactionMention = z17;
                                            str10 = str11;
                                            str9 = str12;
                                        } else {
                                            z17 = false;
                                            dialogCell3.drawCount = false;
                                            dialogCell3.drawMention = true;
                                            str11 = String.format(str2, Integer.valueOf(i34));
                                        }
                                        str12 = null;
                                        dialogCell3.drawReactionMention = z17;
                                        str10 = str11;
                                        str9 = str12;
                                    } else {
                                        if (dialogCell3.clearingDialog) {
                                            dialogCell3.drawCount = false;
                                            str9 = null;
                                            z15 = true;
                                            z16 = false;
                                            z9 = false;
                                        } else {
                                            int i35 = dialogCell3.unreadCount;
                                            z15 = true;
                                            if (i35 != 0 && (i35 != 1 || i35 != dialogCell3.mentionCount || !messageObject3.messageOwner.mentioned)) {
                                                dialogCell3.drawCount = true;
                                                z16 = false;
                                                str9 = String.format(str2, Integer.valueOf(i35));
                                            } else {
                                                z16 = false;
                                                if (dialogCell3.markUnread) {
                                                    dialogCell3.drawCount = true;
                                                    str9 = "";
                                                } else {
                                                    dialogCell3.drawCount = false;
                                                    str9 = null;
                                                }
                                            }
                                        }
                                        if (dialogCell3.mentionCount != 0) {
                                            dialogCell3.drawMention = z15;
                                            str10 = "@";
                                        } else {
                                            dialogCell3.drawMention = z16;
                                            str10 = null;
                                        }
                                        if (dialogCell3.reactionMentionCount > 0) {
                                            dialogCell3.drawReactionMention = z15;
                                        } else {
                                            dialogCell3.drawReactionMention = z16;
                                        }
                                    }
                                    if (dialogCell3.message.isOut() && dialogCell3.draftMessage == null && z9) {
                                        MessageObject messageObject18 = dialogCell3.message;
                                        if (!(messageObject18.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                            if (messageObject18.isSending()) {
                                                dialogCell3.drawCheck1 = false;
                                                dialogCell3.drawCheck2 = false;
                                                dialogCell3.drawClock = true;
                                                dialogCell3.drawError = false;
                                            } else if (dialogCell3.message.isSendError()) {
                                                dialogCell3.drawCheck1 = false;
                                                dialogCell3.drawCheck2 = false;
                                                dialogCell3.drawClock = false;
                                                dialogCell3.drawError = true;
                                                dialogCell3.drawCount = false;
                                                dialogCell3.drawMention = false;
                                            } else if (dialogCell3.message.isSent()) {
                                                TLRPC.TL_forumTopic tL_forumTopic = dialogCell3.forumTopic;
                                                if (tL_forumTopic != null) {
                                                    dialogCell3.drawCheck1 = tL_forumTopic.read_outbox_max_id >= dialogCell3.message.getId();
                                                } else if (dialogCell3.isDialogCell) {
                                                    int i36 = dialogCell3.readOutboxMaxId;
                                                    dialogCell3.drawCheck1 = (i36 > 0 && i36 >= dialogCell3.message.getId()) || !dialogCell3.message.isUnread() || (ChatObject.isChannel(dialogCell3.chat) && !dialogCell3.chat.megagroup);
                                                } else {
                                                    dialogCell3.drawCheck1 = !dialogCell3.message.isUnread() || (ChatObject.isChannel(dialogCell3.chat) && !dialogCell3.chat.megagroup);
                                                }
                                                dialogCell3.drawCheck2 = true;
                                                dialogCell3.drawClock = false;
                                                dialogCell3.drawError = false;
                                            }
                                            str7 = str10;
                                            str6 = str9;
                                            z13 = false;
                                        }
                                    }
                                    dialogCell3.drawCheck1 = false;
                                    dialogCell3.drawCheck2 = false;
                                    dialogCell3.drawClock = false;
                                    dialogCell3.drawError = false;
                                    str7 = str10;
                                    str6 = str9;
                                    z13 = false;
                                }
                                dialogCell3.promoDialog = z13;
                                messagesController = MessagesController.getInstance(dialogCell3.currentAccount);
                                if (dialogCell3.dialogsType == 0 && messagesController.isPromoDialog(dialogCell3.currentDialogId, true)) {
                                    dialogCell3.drawPinBackground = true;
                                    dialogCell3.promoDialog = true;
                                    i10 = messagesController.promoDialogType;
                                    if (i10 != MessagesController.PROMO_TYPE_PROXY) {
                                        stringForMessageListDate = LocaleController.getString(R.string.UseProxySponsor);
                                    } else if (i10 == MessagesController.PROMO_TYPE_PSA) {
                                        stringForMessageListDate = LocaleController.getString("PsaType_" + messagesController.promoPsaType);
                                        if (TextUtils.isEmpty(stringForMessageListDate)) {
                                            stringForMessageListDate = LocaleController.getString(R.string.PsaTypeDefault);
                                        }
                                        if (!TextUtils.isEmpty(messagesController.promoPsaMessage)) {
                                            CharSequence charSequence46 = messagesController.promoPsaMessage;
                                            dialogCell3.thumbsCount = 0;
                                            charSequence9 = charSequence46;
                                        }
                                    }
                                }
                                if (dialogCell3.currentDialogFolderId == 0) {
                                    str8 = stringForMessageListDate;
                                    z14 = z11;
                                    int i37 = i4;
                                    charSequence28 = string;
                                    escape = LocaleController.getString(R.string.ArchivedChats);
                                    charSequence27 = charSequence10;
                                    i9 = i37;
                                    dialogCell4 = dialogCell3;
                                } else {
                                    TLRPC.Chat chat11 = dialogCell3.chat;
                                    if (chat11 != null) {
                                        if (dialogCell3.useFromUserAsAvatar) {
                                            if (dialogCell3.topicIconInName == null) {
                                                dialogCell3.topicIconInName = new Drawable[1];
                                            }
                                            dialogCell3.topicIconInName[0] = null;
                                            topicSpannedName = MessagesController.getInstance(dialogCell3.currentAccount).getTopicsController().getTopicIconName(dialogCell3.chat, dialogCell3.message, dialogCell3.currentMessagePaint, dialogCell3.topicIconInName);
                                            charSequence26 = string;
                                        } else if (dialogCell3.isTopic) {
                                            if (dialogCell3.topicIconInName == null) {
                                                dialogCell3.topicIconInName = new Drawable[1];
                                            }
                                            Drawable[] drawableArr = dialogCell3.topicIconInName;
                                            drawableArr[0] = null;
                                            topicSpannedName = dialogCell3.showTopicIconInName ? ForumUtilities.getTopicSpannedName(dialogCell3.forumTopic, Theme.dialogs_namePaint[dialogCell3.paintIndex], drawableArr, false) : AndroidUtilities.escape(dialogCell3.forumTopic.title);
                                            charSequence26 = string;
                                        } else {
                                            if (chat11.monoforum && chat11.linked_monoforum_id != 0) {
                                                TLRPC.Chat chat12 = MessagesController.getInstance(dialogCell3.currentAccount).getChat(Long.valueOf(dialogCell3.chat.linked_monoforum_id));
                                                if (chat12 != null) {
                                                    SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(AndroidUtilities.escape(chat12.title));
                                                    spannableStringBuilder12.append(charSequence5);
                                                    int length3 = spannableStringBuilder12.length();
                                                    int i38 = R.string.MonoforumSpan;
                                                    spannableStringBuilder12.append((CharSequence) LocaleController.getString(i38));
                                                    charSequence26 = string;
                                                    spannableStringBuilder12.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i38), 9.33f, Theme.key_windowBackgroundWhiteGrayText, dialogCell3.resourcesProvider), length3, spannableStringBuilder12.length(), 33);
                                                    escape = spannableStringBuilder12;
                                                } else {
                                                    charSequence26 = string;
                                                    escape = AndroidUtilities.escape(dialogCell3.chat.title);
                                                }
                                            } else {
                                                charSequence26 = string;
                                                escape = AndroidUtilities.escape(chat11.title);
                                            }
                                            if (escape != null && escape.length() == 0) {
                                                escape = LocaleController.getString(R.string.HiddenName);
                                            }
                                            str8 = stringForMessageListDate;
                                            charSequence27 = charSequence10;
                                            z14 = z11;
                                            i9 = i4;
                                            charSequence28 = charSequence26;
                                            dialogCell4 = dialogCell3;
                                        }
                                        escape = topicSpannedName;
                                        if (escape != null) {
                                            escape = LocaleController.getString(R.string.HiddenName);
                                        }
                                        str8 = stringForMessageListDate;
                                        charSequence27 = charSequence10;
                                        z14 = z11;
                                        i9 = i4;
                                        charSequence28 = charSequence26;
                                        dialogCell4 = dialogCell3;
                                    } else {
                                        charSequence26 = string;
                                        TLRPC.User user7 = dialogCell3.user;
                                        if (user7 != null) {
                                            if (UserObject.isReplyUser(user7)) {
                                                escape = LocaleController.getString(R.string.RepliesTitle);
                                            } else if (UserObject.isAnonymous(dialogCell3.user)) {
                                                escape = LocaleController.getString(R.string.AnonymousForward);
                                            } else if (UserObject.isUserSelf(dialogCell3.user) && !dialogCell3.isMonoForumTopicDialog) {
                                                if (dialogCell3.isSavedDialog) {
                                                    escape = LocaleController.getString(R.string.MyNotes);
                                                } else if (dialogCell3.useMeForMyMessages) {
                                                    escape = LocaleController.getString(R.string.FromYou);
                                                } else {
                                                    if (dialogCell3.dialogsType == 3) {
                                                        dialogCell3.drawPinBackground = true;
                                                    }
                                                    escape = LocaleController.getString(R.string.SavedMessages);
                                                }
                                            } else if (dialogCell3.isTopic) {
                                                if (dialogCell3.topicIconInName == null) {
                                                    dialogCell3.topicIconInName = new Drawable[1];
                                                }
                                                Drawable[] drawableArr2 = dialogCell3.topicIconInName;
                                                drawableArr2[0] = null;
                                                escape = dialogCell3.showTopicIconInName ? ForumUtilities.getTopicSpannedName(dialogCell3.forumTopic, Theme.dialogs_namePaint[dialogCell3.paintIndex], drawableArr2, false) : AndroidUtilities.escape(dialogCell3.forumTopic.title);
                                            } else {
                                                escape = AndroidUtilities.escape(UserObject.getUserName(dialogCell3.user));
                                            }
                                            if (escape != null) {
                                            }
                                            str8 = stringForMessageListDate;
                                            charSequence27 = charSequence10;
                                            z14 = z11;
                                            i9 = i4;
                                            charSequence28 = charSequence26;
                                            dialogCell4 = dialogCell3;
                                        }
                                        escape = "";
                                        if (escape != null) {
                                        }
                                        str8 = stringForMessageListDate;
                                        charSequence27 = charSequence10;
                                        z14 = z11;
                                        i9 = i4;
                                        charSequence28 = charSequence26;
                                        dialogCell4 = dialogCell3;
                                    }
                                }
                            }
                            stringForMessageListDate = "";
                            messageObject3 = dialogCell3.message;
                            if (messageObject3 != null) {
                            }
                            dialogCell3.drawCheck1 = false;
                            dialogCell3.drawCheck2 = false;
                            dialogCell3.drawClock = messageObject3 == null && messageObject3.isSending() && dialogCell3.currentDialogId == UserConfig.getInstance(dialogCell3.currentAccount).getClientUserId();
                            z13 = false;
                            dialogCell3.drawCount = false;
                            dialogCell3.drawMention = false;
                            dialogCell3.drawReactionMention = false;
                            dialogCell3.drawError = false;
                            str6 = null;
                            str7 = null;
                            dialogCell3.promoDialog = z13;
                            messagesController = MessagesController.getInstance(dialogCell3.currentAccount);
                            if (dialogCell3.dialogsType == 0) {
                                dialogCell3.drawPinBackground = true;
                                dialogCell3.promoDialog = true;
                                i10 = messagesController.promoDialogType;
                                if (i10 != MessagesController.PROMO_TYPE_PROXY) {
                                }
                            }
                            if (dialogCell3.currentDialogFolderId == 0) {
                            }
                        }
                        z11 = true;
                        charSequence10 = charSequence25;
                        if (!dialogCell3.drawForwardIcon) {
                            dialogCell3.drawGiftIcon = true;
                            SpannableStringBuilder spannableStringBuilder112 = new SpannableStringBuilder(charSequence9);
                            spannableStringBuilder112.insert(0, charSequence6);
                            ColoredImageSpan coloredImageSpan32 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_gift).mutate());
                            coloredImageSpan32.setScale(1.25f, 1.25f);
                            coloredImageSpan32.spaceScaleX = 0.9f;
                            coloredImageSpan32.setAlpha(0.9f);
                            spannableStringBuilder112.setSpan(coloredImageSpan32, 0, 1, 0);
                            tL_textWithEntities = ((TLRPC.TL_messageActionStarGift) dialogCell3.message.messageOwner.action).message;
                            if (tL_textWithEntities != null) {
                                dialogCell3.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell3.paintIndex];
                            }
                            charSequence9 = spannableStringBuilder112;
                        }
                        if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                        }
                        stringForMessageListDate = "";
                        messageObject3 = dialogCell3.message;
                        if (messageObject3 != null) {
                        }
                        dialogCell3.drawCheck1 = false;
                        dialogCell3.drawCheck2 = false;
                        dialogCell3.drawClock = messageObject3 == null && messageObject3.isSending() && dialogCell3.currentDialogId == UserConfig.getInstance(dialogCell3.currentAccount).getClientUserId();
                        z13 = false;
                        dialogCell3.drawCount = false;
                        dialogCell3.drawMention = false;
                        dialogCell3.drawReactionMention = false;
                        dialogCell3.drawError = false;
                        str6 = null;
                        str7 = null;
                        dialogCell3.promoDialog = z13;
                        messagesController = MessagesController.getInstance(dialogCell3.currentAccount);
                        if (dialogCell3.dialogsType == 0) {
                        }
                        if (dialogCell3.currentDialogFolderId == 0) {
                        }
                    }
                }
                draftMessage3 = null;
                dialogCell3.draftMessage = null;
                z7 = false;
                dialogCell3.draftVoice = false;
                if (!isForumCell()) {
                }
                z11 = true;
                charSequence10 = charSequence25;
                if (!dialogCell3.drawForwardIcon) {
                }
                if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                }
                stringForMessageListDate = "";
                messageObject3 = dialogCell3.message;
                if (messageObject3 != null) {
                }
                dialogCell3.drawCheck1 = false;
                dialogCell3.drawCheck2 = false;
                dialogCell3.drawClock = messageObject3 == null && messageObject3.isSending() && dialogCell3.currentDialogId == UserConfig.getInstance(dialogCell3.currentAccount).getClientUserId();
                z13 = false;
                dialogCell3.drawCount = false;
                dialogCell3.drawMention = false;
                dialogCell3.drawReactionMention = false;
                dialogCell3.drawError = false;
                str6 = null;
                str7 = null;
                dialogCell3.promoDialog = z13;
                messagesController = MessagesController.getInstance(dialogCell3.currentAccount);
                if (dialogCell3.dialogsType == 0) {
                }
                if (dialogCell3.currentDialogFolderId == 0) {
                }
            }
            charSequence2 = charSequence32;
            str2 = str;
            dialogCell3 = dialogCell5;
            i2 = dialogCell3.lastMessageDate;
            if (i2 == 0) {
                i2 = messageObject5.messageOwner.date;
            }
            if (!dialogCell3.isTopic) {
            }
            z6 = dialogCell3.draftVoice;
            if (!z6) {
                if (ChatObject.isChannel(dialogCell3.chat)) {
                }
                chat2 = dialogCell3.chat;
                if (chat2 != null) {
                }
                draftMessage3 = null;
                z7 = false;
                if (!isForumCell()) {
                }
                z11 = true;
                charSequence10 = charSequence25;
                if (!dialogCell3.drawForwardIcon) {
                }
                if (TextUtils.isEmpty(dialogCell3.customMessage)) {
                }
                stringForMessageListDate = "";
                messageObject3 = dialogCell3.message;
                if (messageObject3 != null) {
                }
                dialogCell3.drawCheck1 = false;
                dialogCell3.drawCheck2 = false;
                dialogCell3.drawClock = messageObject3 == null && messageObject3.isSending() && dialogCell3.currentDialogId == UserConfig.getInstance(dialogCell3.currentAccount).getClientUserId();
                z13 = false;
                dialogCell3.drawCount = false;
                dialogCell3.drawMention = false;
                dialogCell3.drawReactionMention = false;
                dialogCell3.drawError = false;
                str6 = null;
                str7 = null;
                dialogCell3.promoDialog = z13;
                messagesController = MessagesController.getInstance(dialogCell3.currentAccount);
                if (dialogCell3.dialogsType == 0) {
                }
                if (dialogCell3.currentDialogFolderId == 0) {
                }
            }
            if (ChatObject.isChannel(dialogCell3.chat)) {
            }
            chat2 = dialogCell3.chat;
            if (chat2 != null) {
            }
            draftMessage3 = null;
            z7 = false;
            if (!isForumCell()) {
            }
            z11 = true;
            charSequence10 = charSequence25;
            if (!dialogCell3.drawForwardIcon) {
            }
            if (TextUtils.isEmpty(dialogCell3.customMessage)) {
            }
            stringForMessageListDate = "";
            messageObject3 = dialogCell3.message;
            if (messageObject3 != null) {
            }
            dialogCell3.drawCheck1 = false;
            dialogCell3.drawCheck2 = false;
            dialogCell3.drawClock = messageObject3 == null && messageObject3.isSending() && dialogCell3.currentDialogId == UserConfig.getInstance(dialogCell3.currentAccount).getClientUserId();
            z13 = false;
            dialogCell3.drawCount = false;
            dialogCell3.drawMention = false;
            dialogCell3.drawReactionMention = false;
            dialogCell3.drawError = false;
            str6 = null;
            str7 = null;
            dialogCell3.promoDialog = z13;
            messagesController = MessagesController.getInstance(dialogCell3.currentAccount);
            if (dialogCell3.dialogsType == 0) {
            }
            if (dialogCell3.currentDialogFolderId == 0) {
            }
        }
        if (z3) {
            TextPaint timeTextPaint = getTimeTextPaint();
            int ceil = (int) Math.ceil(timeTextPaint.measureText(str8));
            dialogCell4.timeLayout = new StaticLayout(str8, timeTextPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i12 = AndroidUtilities.dp(getIsPinned() ? 24.0f : 0.0f) + ceil;
            if (!LocaleController.isRTL) {
                dialogCell4.timeLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.0f)) - i12;
            } else {
                dialogCell4.timeLeft = AndroidUtilities.dp(15.0f);
            }
        } else {
            dialogCell4.timeLayout = null;
            dialogCell4.timeLeft = 0;
            i12 = 0;
        }
        if (drawLock2()) {
            if (LocaleController.isRTL) {
                f = 4.0f;
                dialogCell4.lock2Left = dialogCell4.timeLeft + i12 + AndroidUtilities.dp(4.0f);
            } else {
                f = 4.0f;
                dialogCell4.lock2Left = (dialogCell4.timeLeft - Theme.dialogs_lock2Drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i13 = Theme.dialogs_lock2Drawable.getIntrinsicWidth() + AndroidUtilities.dp(f);
            i12 += i13;
        } else {
            f = 4.0f;
            i13 = 0;
        }
        if (!LocaleController.isRTL) {
            dialogCell4.nameWidth = ((getMeasuredWidth() - dialogCell4.nameLeft) - AndroidUtilities.dp(22.0f)) - i12;
        } else {
            dialogCell4.nameWidth = ((getMeasuredWidth() - dialogCell4.nameLeft) - AndroidUtilities.dp(dialogCell4.messagePaddingStart + 13)) - i12;
            dialogCell4.nameLeft += i12;
        }
        if (dialogCell4.drawNameLock) {
            int i39 = dialogCell4.nameWidth;
            if (LocaleController.isRTL) {
                f = 8.0f;
            }
            dialogCell4.nameWidth = i39 - (AndroidUtilities.dp(f) + Theme.dialogs_lockDrawable.getIntrinsicWidth());
        }
        if (dialogCell4.drawClock) {
            int intrinsicWidth2 = Theme.dialogs_clockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            dialogCell4.nameWidth -= intrinsicWidth2;
            if (!LocaleController.isRTL) {
                dialogCell4.clockDrawLeft = (dialogCell4.timeLeft - i13) - intrinsicWidth2;
            } else {
                dialogCell4.clockDrawLeft = dialogCell4.timeLeft + i12 + AndroidUtilities.dp(5.0f);
                dialogCell4.nameLeft += intrinsicWidth2;
            }
        } else if (dialogCell4.drawCheck2) {
            int intrinsicWidth3 = Theme.dialogs_checkDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            int i40 = dialogCell4.nameWidth - intrinsicWidth3;
            dialogCell4.nameWidth = i40;
            if (dialogCell4.drawCheck1) {
                dialogCell4.nameWidth = i40 - (Theme.dialogs_halfCheckDrawable.getIntrinsicWidth() - AndroidUtilities.dp(8.0f));
                if (!LocaleController.isRTL) {
                    int i41 = (dialogCell4.timeLeft - i13) - intrinsicWidth3;
                    dialogCell4.halfCheckDrawLeft = i41;
                    dialogCell4.checkDrawLeft = i41 - AndroidUtilities.dp(5.5f);
                } else {
                    int dp6 = dialogCell4.timeLeft + i12 + AndroidUtilities.dp(5.0f);
                    dialogCell4.checkDrawLeft = dp6;
                    dialogCell4.halfCheckDrawLeft = dp6 + AndroidUtilities.dp(5.5f);
                    dialogCell4.nameLeft += (intrinsicWidth3 + Theme.dialogs_halfCheckDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(8.0f);
                }
            } else if (!LocaleController.isRTL) {
                dialogCell4.checkDrawLeft1 = (dialogCell4.timeLeft - i13) - intrinsicWidth3;
            } else {
                dialogCell4.checkDrawLeft1 = dialogCell4.timeLeft + i12 + AndroidUtilities.dp(5.0f);
                dialogCell4.nameLeft += intrinsicWidth3;
            }
        }
        dialogCell4.nameAdditionalsForChannelSubscriber = 0;
        if (dialogCell4.drawPremium && dialogCell4.emojiStatus.getDrawable() != null) {
            int dp7 = AndroidUtilities.dp(36.0f);
            dialogCell4.nameWidth -= dp7;
            dialogCell4.nameAdditionalsForChannelSubscriber += dp7;
            if (LocaleController.isRTL) {
                dialogCell4.nameLeft += dp7;
            }
        } else if ((dialogCell4.dialogMuted || dialogCell4.drawUnmute) && !dialogCell4.drawVerified && dialogCell4.drawScam == 0) {
            int dp8 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            dialogCell4.nameWidth -= dp8;
            dialogCell4.nameAdditionalsForChannelSubscriber += dp8;
            if (LocaleController.isRTL) {
                dialogCell4.nameLeft += dp8;
            }
        } else if (dialogCell4.drawVerified) {
            int dp9 = AndroidUtilities.dp(6.0f) + Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
            dialogCell4.nameWidth -= dp9;
            dialogCell4.nameAdditionalsForChannelSubscriber += dp9;
            if (LocaleController.isRTL) {
                dialogCell4.nameLeft += dp9;
            }
        } else if (dialogCell4.drawPremium) {
            int dp10 = AndroidUtilities.dp(36.0f);
            dialogCell4.nameWidth -= dp10;
            dialogCell4.nameAdditionalsForChannelSubscriber += dp10;
            if (LocaleController.isRTL) {
                dialogCell4.nameLeft += dp10;
            }
        } else if (dialogCell4.drawScam != 0) {
            int dp11 = AndroidUtilities.dp(6.0f) + (dialogCell4.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth();
            dialogCell4.nameWidth -= dp11;
            dialogCell4.nameAdditionalsForChannelSubscriber += dp11;
            if (LocaleController.isRTL) {
                dialogCell4.nameLeft += dp11;
            }
        }
        if (dialogCell4.drawBotVerified) {
            dialogCell4.nameWidth -= AndroidUtilities.dp(21.0f);
        }
        int i42 = dialogCell4.namePaddingEnd;
        if (i42 > 0) {
            dialogCell4.nameWidth -= i42;
            if (LocaleController.isRTL) {
                dialogCell4.nameLeft += i42;
            }
        }
        try {
            int dp12 = dialogCell4.nameWidth - AndroidUtilities.dp(12.0f);
            if (dp12 < 0) {
                dp12 = 0;
            }
            if (escape instanceof String) {
                escape = ((String) escape).replace('\n', ' ');
            }
            if (dialogCell4.nameLayoutEllipsizeByGradient) {
                dialogCell4.nameLayoutFits = escape.length() == TextUtils.ellipsize(escape, Theme.dialogs_namePaint[dialogCell4.paintIndex], (float) dp12, TextUtils.TruncateAt.END).length();
                dp12 += AndroidUtilities.dp(48.0f);
                dialogCell4.channelShouldUseLineWidth = dialogCell4.nameLayoutFits;
            } else if (dialogCell4.isForChannelSubscriberCell) {
                dialogCell4.channelShouldUseLineWidth = escape.length() == TextUtils.ellipsize(escape, Theme.dialogs_namePaint[dialogCell4.paintIndex], (float) dp12, TextUtils.TruncateAt.END).length();
            }
            float f2 = dp12;
            dialogCell4.nameIsEllipsized = Theme.dialogs_namePaint[dialogCell4.paintIndex].measureText(escape.toString()) > f2;
            if (!dialogCell4.twoLinesForName) {
                escape = TextUtils.ellipsize(escape, Theme.dialogs_namePaint[dialogCell4.paintIndex], f2, TextUtils.TruncateAt.END);
            }
            CharSequence replaceEmoji3 = Emoji.replaceEmoji(escape, Theme.dialogs_namePaint[dialogCell4.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject19 = dialogCell4.message;
            CharSequence charSequence47 = (messageObject19 == null || !messageObject19.hasHighlightedWords() || (highlightText3 = AndroidUtilities.highlightText(replaceEmoji3, dialogCell4.message.highlightedWords, dialogCell4.resourcesProvider)) == null) ? replaceEmoji3 : highlightText3;
            if (dialogCell4.twoLinesForName) {
                dialogCell4.nameLayout = StaticLayoutEx.createStaticLayout(charSequence47, Theme.dialogs_namePaint[dialogCell4.paintIndex], dp12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp12, 2);
            } else {
                dialogCell4.nameLayout = new StaticLayout(charSequence47, Theme.dialogs_namePaint[dialogCell4.paintIndex], Math.max(dp12, dialogCell4.nameWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            dialogCell4.nameLayoutTranslateX = (dialogCell4.nameLayoutEllipsizeByGradient && dialogCell4.nameLayout.isRtlCharAt(0)) ? -AndroidUtilities.dp(36.0f) : 0.0f;
            dialogCell4.nameLayoutEllipsizeLeft = dialogCell4.nameLayout.isRtlCharAt(0);
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        dialogCell4.animatedEmojiStackName = AnimatedEmojiSpan.update(0, dialogCell4, dialogCell4.animatedEmojiStackName, dialogCell4.nameLayout);
        if (dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
            int dp13 = AndroidUtilities.dp(11.0f);
            dialogCell4.messageNameTop = AndroidUtilities.dp(32.0f);
            dialogCell4.timeTop = AndroidUtilities.dp(13.0f);
            dialogCell4.errorTop = AndroidUtilities.dp(42.33f);
            dialogCell4.pinTop = AndroidUtilities.dp(43.0f);
            dialogCell4.countTop = AndroidUtilities.dp(42.33f);
            dialogCell4.checkDrawTop = AndroidUtilities.dp(13.0f);
            int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(dialogCell4.messagePaddingStart + 21);
            if (LocaleController.isRTL) {
                int dp14 = AndroidUtilities.dp(16.0f);
                dialogCell4.messageNameLeft = dp14;
                dialogCell4.messageLeft = dp14;
                dialogCell4.typingLeft = dp14;
                dialogCell4.buttonLeft = dp14;
                dp = getMeasuredWidth() - AndroidUtilities.dp(dialogCell4.avatarStart + 56);
                dp2 = dp - AndroidUtilities.dp(31.0f);
            } else {
                int dp15 = AndroidUtilities.dp(dialogCell4.messagePaddingStart + 6);
                dialogCell4.messageNameLeft = dp15;
                dialogCell4.messageLeft = dp15;
                dialogCell4.typingLeft = dp15;
                dialogCell4.buttonLeft = dp15;
                dp = AndroidUtilities.dp(dialogCell4.avatarStart);
                dp2 = AndroidUtilities.dp(69.0f) + dp;
            }
            dialogCell4.storyParams.originalAvatarRect.set(dp, dp13, dp + AndroidUtilities.dp(56.0f), dp13 + AndroidUtilities.dp(56.0f));
            int i43 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = dialogCell4.thumbImage;
                if (i43 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i43].setImageCoords(((dialogCell4.thumbSize + 2) * i43) + dp2, ((AndroidUtilities.dp(31.0f) + dp13) + (dialogCell4.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = dialogCell4.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i43++;
                dp13 = dp13;
            }
            i14 = measuredWidth4;
            i15 = dp13;
        } else {
            int dp16 = AndroidUtilities.dp(9.0f);
            dialogCell4.messageNameTop = AndroidUtilities.dp(31.0f);
            dialogCell4.timeTop = AndroidUtilities.dp(16.0f);
            dialogCell4.errorTop = AndroidUtilities.dp(38.0f);
            dialogCell4.pinTop = AndroidUtilities.dp(39.0f);
            dialogCell4.countTop = AndroidUtilities.dp(dialogCell4.isTopic ? 35.0f : 38.0f);
            dialogCell4.checkDrawTop = AndroidUtilities.dp(17.0f);
            int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp((dialogCell4.messagePaddingStart + 20) - (LocaleController.isRTL ? 0 : 12));
            if (LocaleController.isRTL) {
                int dp17 = AndroidUtilities.dp(22.0f);
                dialogCell4.messageNameLeft = dp17;
                dialogCell4.messageLeft = dp17;
                dialogCell4.typingLeft = dp17;
                dialogCell4.buttonLeft = dp17;
                dp4 = getMeasuredWidth() - AndroidUtilities.dp(dialogCell4.avatarStart + 52);
                dp5 = dp4 - AndroidUtilities.dp((dialogCell4.thumbsCount * (dialogCell4.thumbSize + 2)) + 9);
            } else {
                int dp18 = AndroidUtilities.dp(dialogCell4.messagePaddingStart + 4);
                dialogCell4.messageNameLeft = dp18;
                dialogCell4.messageLeft = dp18;
                dialogCell4.typingLeft = dp18;
                dialogCell4.buttonLeft = dp18;
                dp4 = AndroidUtilities.dp(dialogCell4.avatarStart);
                dp5 = AndroidUtilities.dp(67.0f) + dp4;
            }
            dialogCell4.storyParams.originalAvatarRect.set(dp4, dp16, dp4 + AndroidUtilities.dp(52.0f), dp16 + AndroidUtilities.dp(52.0f));
            int i44 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr2 = dialogCell4.thumbImage;
                if (i44 >= imageReceiverArr2.length) {
                    break;
                }
                imageReceiverArr2[i44].setImageCoords(((dialogCell4.thumbSize + 2) * i44) + dp5, ((AndroidUtilities.dp(30.0f) + dp16) + (dialogCell4.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags3 = dialogCell4.tags) == null || dialogCellTags3.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(dialogCell4.thumbSize), AndroidUtilities.dp(dialogCell4.thumbSize));
                i44++;
                dp16 = dp16;
            }
            i15 = dp16;
            i14 = measuredWidth5;
        }
        if (LocaleController.isRTL) {
            dialogCell4.tagsRight = getMeasuredWidth() - AndroidUtilities.dp(dialogCell4.messagePaddingStart);
            dialogCell4.tagsLeft = AndroidUtilities.dp(64.0f);
        } else {
            dialogCell4.tagsLeft = dialogCell4.messageLeft;
            dialogCell4.tagsRight = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
        }
        if (dialogCell4.twoLinesForName) {
            dialogCell4.messageNameTop += AndroidUtilities.dp(20.0f);
        }
        if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && (dialogCellTags2 = dialogCell4.tags) != null && !dialogCellTags2.isEmpty()) {
            dialogCell4.timeTop -= AndroidUtilities.dp(6.0f);
            dialogCell4.checkDrawTop -= AndroidUtilities.dp(6.0f);
        }
        if (getIsPinned()) {
            if (!LocaleController.isRTL) {
                dialogCell4.pinLeft = (getMeasuredWidth() - Theme.dialogs_pinnedDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(14.0f);
            } else {
                dialogCell4.pinLeft = AndroidUtilities.dp(14.0f);
            }
        }
        if (dialogCell4.drawError) {
            int dp19 = AndroidUtilities.dp(29.0f);
            i14 -= dp19;
            if (!LocaleController.isRTL) {
                dialogCell4.errorLeft = getMeasuredWidth() - AndroidUtilities.dp(36.3333f);
            } else {
                dialogCell4.errorLeft = AndroidUtilities.dp(15.666f);
                dialogCell4.messageLeft += dp19;
                dialogCell4.typingLeft += dp19;
                dialogCell4.buttonLeft += dp19;
                dialogCell4.messageNameLeft += dp19;
            }
        } else if (str6 != null || str7 != null || dialogCell4.drawReactionMention) {
            if (str6 != null) {
                dialogCell4.countWidth = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str6)));
                dialogCell4.countLayout = new StaticLayout(str6, Theme.dialogs_countTextPaint2, dialogCell4.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp20 = dialogCell4.countWidth + AndroidUtilities.dp(17.0f);
                i14 -= dp20;
                if (!LocaleController.isRTL) {
                    dialogCell4.countLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.666f)) - (dialogCell4.countWidth + AndroidUtilities.dp(12.666f));
                } else {
                    dialogCell4.countLeft = AndroidUtilities.dp(15.666f);
                    dialogCell4.messageLeft += dp20;
                    dialogCell4.typingLeft += dp20;
                    dialogCell4.buttonLeft += dp20;
                    dialogCell4.messageNameLeft += dp20;
                }
                dialogCell4.drawCount = true;
            } else {
                dialogCell4.countWidth = 0;
            }
            if (str7 != null) {
                if (dialogCell4.currentDialogFolderId != 0) {
                    dialogCell4.mentionWidth = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(str7)));
                    dialogCell4.mentionLayout = new StaticLayout(str7, Theme.dialogs_countTextPaint2, dialogCell4.mentionWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    dialogCell4.mentionWidth = AndroidUtilities.dp(8.0f);
                }
                int dp21 = dialogCell4.mentionWidth + AndroidUtilities.dp(17.0f);
                i14 -= dp21;
                if (!LocaleController.isRTL) {
                    int measuredWidth6 = (getMeasuredWidth() - (dialogCell4.mentionWidth + AndroidUtilities.dp(12.666f))) - AndroidUtilities.dp(15.666f);
                    int i45 = dialogCell4.countWidth;
                    dialogCell4.mentionLeft = measuredWidth6 - (i45 != 0 ? i45 + AndroidUtilities.dp(17.0f) : 0);
                } else {
                    int dp22 = AndroidUtilities.dp(15.666f);
                    int i46 = dialogCell4.countWidth;
                    dialogCell4.mentionLeft = dp22 + (i46 != 0 ? i46 + AndroidUtilities.dp(17.0f) : 0);
                    dialogCell4.messageLeft += dp21;
                    dialogCell4.typingLeft += dp21;
                    dialogCell4.buttonLeft += dp21;
                    dialogCell4.messageNameLeft += dp21;
                }
                dialogCell4.drawMention = true;
            } else {
                dialogCell4.mentionWidth = 0;
            }
            if (dialogCell4.drawReactionMention) {
                int dp23 = AndroidUtilities.dp(25.0f);
                i14 -= dp23;
                if (!LocaleController.isRTL) {
                    int measuredWidth7 = getMeasuredWidth() - AndroidUtilities.dp(36.332f);
                    dialogCell4.reactionMentionLeft = measuredWidth7;
                    if (dialogCell4.drawMention) {
                        int i47 = dialogCell4.mentionWidth;
                        dialogCell4.reactionMentionLeft = measuredWidth7 - (i47 != 0 ? i47 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (dialogCell4.drawCount) {
                        int i48 = dialogCell4.reactionMentionLeft;
                        int i49 = dialogCell4.countWidth;
                        dialogCell4.reactionMentionLeft = i48 - (i49 != 0 ? i49 + AndroidUtilities.dp(17.0f) : 0);
                    }
                } else {
                    int dp24 = AndroidUtilities.dp(15.666f);
                    dialogCell4.reactionMentionLeft = dp24;
                    if (dialogCell4.drawMention) {
                        int i50 = dialogCell4.mentionWidth;
                        dialogCell4.reactionMentionLeft = dp24 + (i50 != 0 ? i50 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    if (dialogCell4.drawCount) {
                        int i51 = dialogCell4.reactionMentionLeft;
                        int i52 = dialogCell4.countWidth;
                        dialogCell4.reactionMentionLeft = i51 + (i52 != 0 ? i52 + AndroidUtilities.dp(17.0f) : 0);
                    }
                    dialogCell4.messageLeft += dp23;
                    dialogCell4.typingLeft += dp23;
                    dialogCell4.buttonLeft += dp23;
                    dialogCell4.messageNameLeft += dp23;
                }
            }
        } else if (dialogCell4.allowBotOpenButton && !isFolderCell() && !isForumCell() && !isDialogFolder() && UserObject.isBot(dialogCell4.user) && dialogCell4.user.bot_has_main_app) {
            dialogCell4.setOpenBotButton(true);
            int dp25 = (int) (AndroidUtilities.dp(26.0f) + dialogCell4.openButtonText.getCurrentWidth());
            int dp26 = AndroidUtilities.dp(13.0f);
            i14 -= dp25;
            if (dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                dp3 = AndroidUtilities.dp(40.0f);
            } else {
                dp3 = AndroidUtilities.dp(dialogCell4.isTopic ? 33.0f : 36.0f);
            }
            if (!LocaleController.isRTL) {
                dialogCell4.openButtonRect.set((getMeasuredWidth() - dp25) - AndroidUtilities.dp(13.0f), dp3, getMeasuredWidth() - AndroidUtilities.dp(13.0f), dp3 + AndroidUtilities.dp(28.0f));
            } else {
                dialogCell4.openButtonRect.set(AndroidUtilities.dp(13.0f), dp3, AndroidUtilities.dp(13.0f) + dp25, dp3 + AndroidUtilities.dp(28.0f));
                int i53 = dp25 + dp26;
                dialogCell4.messageLeft += i53;
                dialogCell4.typingLeft += i53;
                dialogCell4.buttonLeft += i53;
                dialogCell4.messageNameLeft += i53;
            }
            dialogCell4.drawCount = false;
            dialogCell4.drawMention = false;
        } else {
            dialogCell4.drawCount = false;
            dialogCell4.drawMention = false;
        }
        if (z14) {
            if (charSequence9 == null) {
                charSequence9 = "";
            }
            if (charSequence9.length() > 150) {
                charSequence9 = charSequence9.subSequence(0, 150);
            }
            if ((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence28 != null) {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceNewLines(charSequence9);
            } else {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceTwoNewLinesToOne(charSequence9);
            }
            charSequence9 = Emoji.replaceEmoji(replaceTwoNewLinesToOne, Theme.dialogs_messagePaint[dialogCell4.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject20 = dialogCell4.message;
            if (messageObject20 != null && (highlightText2 = AndroidUtilities.highlightText(charSequence9, messageObject20.highlightedWords, dialogCell4.resourcesProvider)) != null) {
                charSequence9 = highlightText2;
            }
        }
        int max = Math.max(AndroidUtilities.dp(12.0f), i14);
        dialogCell4.buttonTop = AndroidUtilities.dp((dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
            dialogCell4.buttonTop -= AndroidUtilities.dp(isForumCell() ? 10.0f : 12.0f);
        }
        if (isForumCell()) {
            dialogCell4.messageTop = AndroidUtilities.dp((dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
            int i54 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = dialogCell4.thumbImage;
                if (i54 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i54].setImageY(dialogCell4.buttonTop);
                i54++;
            }
        } else if ((dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && charSequence28 != null && (dialogCell4.currentDialogFolderId == 0 || dialogCell4.currentDialogFolderDialogsCount == 1)) {
            try {
                MessageObject messageObject21 = dialogCell4.message;
                if (messageObject21 != null && messageObject21.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(charSequence28, dialogCell4.message.highlightedWords, dialogCell4.resourcesProvider)) != null) {
                    charSequence28 = highlightText;
                }
                dialogCell4.messageNameLayout = StaticLayoutEx.createStaticLayout(charSequence28, Theme.dialogs_messageNamePaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, max, 1);
            } catch (Exception e4) {
                FileLog.e(e4);
            }
            dialogCell4.messageTop = AndroidUtilities.dp(51.0f);
            int dp27 = (dialogCell4.nameIsEllipsized && dialogCell4.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
            int i55 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = dialogCell4.thumbImage;
                if (i55 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i55].setImageY(i15 + dp27 + AndroidUtilities.dp(40.0f));
                i55++;
            }
        } else {
            dialogCell4.messageNameLayout = null;
            if (dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                dialogCell4.messageTop = AndroidUtilities.dp(32.0f);
                int dp28 = (dialogCell4.nameIsEllipsized && dialogCell4.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
                int i56 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = dialogCell4.thumbImage;
                    if (i56 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i56].setImageY(i15 + dp28 + AndroidUtilities.dp(21.0f));
                    i56++;
                }
            } else {
                dialogCell4.messageTop = AndroidUtilities.dp(39.0f);
            }
        }
        if (dialogCell4.twoLinesForName) {
            dialogCell4.messageTop += AndroidUtilities.dp(20.0f);
        }
        dialogCell4.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, dialogCell4, dialogCell4.animatedEmojiStack2, dialogCell4.messageNameLayout);
        try {
            dialogCell4.buttonCreated = false;
            if (!TextUtils.isEmpty(charSequence27)) {
                dialogCell4.buttonLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence27, dialogCell4.currentMessagePaint.getFontMetricsInt(), false), dialogCell4.currentMessagePaint, max - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), dialogCell4.currentMessagePaint, max - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                dialogCell4.spoilersPool2.addAll(dialogCell4.spoilers2);
                dialogCell4.spoilers2.clear();
                SpoilerEffect.addSpoilers(dialogCell4, dialogCell4.buttonLayout, dialogCell4.spoilersPool2, dialogCell4.spoilers2);
            } else {
                dialogCell4.buttonLayout = null;
            }
        } catch (Exception unused) {
        }
        dialogCell4.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, dialogCell4, dialogCell4.animatedEmojiStack3, dialogCell4.buttonLayout);
        try {
            if (!TextUtils.isEmpty(charSequence4)) {
                if (!dialogCell4.useForceThreeLines) {
                    if (SharedConfig.useThreeLinesLayout) {
                    }
                    dialogCell4.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence4, dialogCell4.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[dialogCell4.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                if (!hasTags()) {
                    dialogCell4.typingLayout = StaticLayoutEx.createStaticLayout(charSequence4, Theme.dialogs_messagePrintingPaint[dialogCell4.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, 1);
                }
                dialogCell4.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence4, dialogCell4.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[dialogCell4.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        } catch (Exception e5) {
            FileLog.e(e5);
        }
        try {
            if (charSequence9 instanceof Spannable) {
                try {
                    Spannable spannable = (Spannable) charSequence9;
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
                    StaticLayout staticLayout2 = null;
                    i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    i17 = 0;
                    dialogCell4.messageLayout = staticLayout2;
                    FileLog.e(e);
                    i18 = max;
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = dialogCell4.animatedEmojiStack;
                    Layout[] layoutArr = new Layout[1];
                    layoutArr[i17] = dialogCell4.messageLayout;
                    dialogCell4.animatedEmojiStack = AnimatedEmojiSpan.update(i17, dialogCell4, emojiGroupedSpans, layoutArr);
                    if (LocaleController.isRTL) {
                    }
                    staticLayout = dialogCell4.typingLayout;
                    if (staticLayout != null) {
                    }
                    updateThumbsPosition();
                }
            }
        } catch (Exception e7) {
            e = e7;
            i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            i17 = 0;
        }
        if ((dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && dialogCell4.currentDialogFolderId != 0 && dialogCell4.currentDialogFolderDialogsCount > 1) {
            dialogCell4.currentMessagePaint = Theme.dialogs_messagePaint[dialogCell4.paintIndex];
            charSequence29 = charSequence28;
            charSequence28 = null;
        } else {
            if ((!dialogCell4.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence28 != null || (ChatObject.isMonoForum(dialogCell4.chat) && ChatObject.canManageMonoForum(dialogCell4.currentAccount, dialogCell4.chat))) {
                if (!isForumCell()) {
                    try {
                    } catch (Exception e8) {
                        e = e8;
                        StaticLayout staticLayout22 = null;
                        i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        i17 = 0;
                        dialogCell4.messageLayout = staticLayout22;
                        FileLog.e(e);
                        i18 = max;
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = dialogCell4.animatedEmojiStack;
                        Layout[] layoutArr2 = new Layout[1];
                        layoutArr2[i17] = dialogCell4.messageLayout;
                        dialogCell4.animatedEmojiStack = AnimatedEmojiSpan.update(i17, dialogCell4, emojiGroupedSpans2, layoutArr2);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = dialogCell4.typingLayout;
                        if (staticLayout != null) {
                        }
                        updateThumbsPosition();
                    }
                    if (charSequence9 instanceof Spanned) {
                        if (((FixedWidthSpan[]) ((Spanned) charSequence9).getSpans(0, charSequence9.length(), FixedWidthSpan.class)).length <= 0) {
                            ellipsize = TextUtils.ellipsize(charSequence9, dialogCell4.currentMessagePaint, max - AndroidUtilities.dp((dialogCell4.thumbsCount * (dialogCell4.thumbSize + 2)) + 15), TextUtils.TruncateAt.END);
                            charSequence29 = ellipsize;
                            alignment = (dialogCell4.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                            if ((!dialogCell4.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                if (dialogCell4.thumbsCount > 0 && charSequence28 != null) {
                                    max += AndroidUtilities.dp(5.0f);
                                }
                                dialogCell4.messageLayout = StaticLayoutEx.createStaticLayout(charSequence29, dialogCell4.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence28 == null ? 1 : 2);
                            } else {
                                if (dialogCell4.thumbsCount > 0) {
                                    max += AndroidUtilities.dp((r0 * (dialogCell4.thumbSize + 2)) + 3);
                                    if (LocaleController.isRTL && !isForumCell()) {
                                        dialogCell4.messageLeft -= AndroidUtilities.dp((dialogCell4.thumbsCount * (dialogCell4.thumbSize + 2)) + 3);
                                    }
                                }
                                dialogCell4.messageLayout = new StaticLayout(charSequence29, dialogCell4.currentMessagePaint, max, alignment, 1.0f, 0.0f, false);
                            }
                            i18 = max;
                            dialogCell4.spoilersPool.addAll(dialogCell4.spoilers);
                            dialogCell4.spoilers.clear();
                            StaticLayout staticLayout3 = dialogCell4.messageLayout;
                            Stack stack = dialogCell4.spoilersPool;
                            List list = dialogCell4.spoilers;
                            i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            i17 = 0;
                            SpoilerEffect.addSpoilers(this, staticLayout3, -2, -2, stack, list);
                            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22 = dialogCell4.animatedEmojiStack;
                            Layout[] layoutArr22 = new Layout[1];
                            layoutArr22[i17] = dialogCell4.messageLayout;
                            dialogCell4.animatedEmojiStack = AnimatedEmojiSpan.update(i17, dialogCell4, emojiGroupedSpans22, layoutArr22);
                            if (LocaleController.isRTL) {
                                StaticLayout staticLayout4 = dialogCell4.nameLayout;
                                if (staticLayout4 != null && staticLayout4.getLineCount() > 0) {
                                    float lineLeft = dialogCell4.nameLayout.getLineLeft(i17);
                                    double ceil2 = Math.ceil(dialogCell4.nameLayout.getLineWidth(i17));
                                    int dp29 = dialogCell4.nameLeft + AndroidUtilities.dp(12.0f);
                                    dialogCell4.nameLeft = dp29;
                                    if (dialogCell4.drawBotVerified) {
                                        dialogCell4.nameLeft = dp29 + AndroidUtilities.dp(21.0f);
                                    }
                                    if (dialogCell4.nameLayoutEllipsizeByGradient) {
                                        ceil2 = Math.min(dialogCell4.nameWidth, ceil2);
                                    }
                                    if ((dialogCell4.dialogMuted || dialogCell4.drawUnmute) && !dialogCell4.drawVerified && dialogCell4.drawScam == 0) {
                                        dialogCell4.nameMuteLeft = (int) (((dialogCell4.nameLeft + (dialogCell4.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                                    } else if (dialogCell4.drawVerified) {
                                        dialogCell4.nameMuteLeft = (int) (((dialogCell4.nameLeft + (dialogCell4.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_verifiedDrawable.getIntrinsicWidth());
                                    } else if (dialogCell4.drawPremium) {
                                        dialogCell4.nameMuteLeft = (int) ((dialogCell4.nameLeft + ((dialogCell4.nameWidth - ceil2) - lineLeft)) - AndroidUtilities.dp(24.0f));
                                    } else if (dialogCell4.drawScam != 0) {
                                        dialogCell4.nameMuteLeft = (int) (((dialogCell4.nameLeft + (dialogCell4.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - (dialogCell4.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth());
                                    } else {
                                        dialogCell4.nameMuteLeft = (int) (((dialogCell4.nameLeft + (dialogCell4.nameWidth - ceil2)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                                    }
                                    if (lineLeft == 0.0f) {
                                        double d = dialogCell4.nameWidth;
                                        if (ceil2 < d) {
                                            dialogCell4.nameLeft = (int) (dialogCell4.nameLeft + (d - ceil2));
                                        }
                                    }
                                }
                                StaticLayout staticLayout5 = dialogCell4.messageLayout;
                                if (staticLayout5 != null && (lineCount6 = staticLayout5.getLineCount()) > 0) {
                                    int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    int i58 = 0;
                                    while (true) {
                                        if (i58 >= lineCount6) {
                                            i21 = i57;
                                            break;
                                        } else if (dialogCell4.messageLayout.getLineLeft(i58) != 0.0f) {
                                            i21 = 0;
                                            break;
                                        } else {
                                            i57 = Math.min(i57, (int) (i18 - Math.ceil(dialogCell4.messageLayout.getLineWidth(i58))));
                                            i58++;
                                        }
                                    }
                                    if (i21 != i16) {
                                        dialogCell4.messageLeft += i21;
                                    }
                                }
                                StaticLayout staticLayout6 = dialogCell4.typingLayout;
                                if (staticLayout6 != null && (lineCount5 = staticLayout6.getLineCount()) > 0) {
                                    int i59 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    int i60 = 0;
                                    while (true) {
                                        if (i60 >= lineCount5) {
                                            i20 = i59;
                                            break;
                                        } else if (dialogCell4.typingLayout.getLineLeft(i60) != 0.0f) {
                                            i20 = 0;
                                            break;
                                        } else {
                                            i59 = Math.min(i59, (int) (i18 - Math.ceil(dialogCell4.typingLayout.getLineWidth(i60))));
                                            i60++;
                                        }
                                    }
                                    if (i20 != i16) {
                                        dialogCell4.typingLeft += i20;
                                    }
                                }
                                StaticLayout staticLayout7 = dialogCell4.messageNameLayout;
                                if (staticLayout7 != null && staticLayout7.getLineCount() > 0 && dialogCell4.messageNameLayout.getLineLeft(i17) == 0.0f) {
                                    double ceil3 = Math.ceil(dialogCell4.messageNameLayout.getLineWidth(i17));
                                    double d2 = i18;
                                    if (ceil3 < d2) {
                                        dialogCell4.messageNameLeft = (int) (dialogCell4.messageNameLeft + (d2 - ceil3));
                                    }
                                }
                                StaticLayout staticLayout8 = dialogCell4.buttonLayout;
                                if (staticLayout8 != null && (lineCount4 = staticLayout8.getLineCount()) > 0) {
                                    int i61 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i62 = 0; i62 < lineCount4; i62++) {
                                        i61 = (int) Math.min(i61, dialogCell4.buttonLayout.getWidth() - dialogCell4.buttonLayout.getLineRight(i62));
                                    }
                                    dialogCell4.buttonLeft += i61;
                                }
                            } else {
                                StaticLayout staticLayout9 = dialogCell4.nameLayout;
                                if (staticLayout9 != null && staticLayout9.getLineCount() > 0) {
                                    float lineRight = dialogCell4.nameLayout.getLineRight(i17);
                                    if (dialogCell4.nameLayoutEllipsizeByGradient) {
                                        lineRight = Math.min(dialogCell4.nameWidth, lineRight);
                                    }
                                    if (lineRight == dialogCell4.nameWidth) {
                                        double ceil4 = Math.ceil(dialogCell4.nameLayout.getLineWidth(i17));
                                        if (dialogCell4.nameLayoutEllipsizeByGradient) {
                                            ceil4 = Math.min(dialogCell4.nameWidth, ceil4);
                                        }
                                        double d3 = dialogCell4.nameWidth;
                                        if (ceil4 < d3) {
                                            dialogCell4.nameLeft = (int) (dialogCell4.nameLeft - (d3 - ceil4));
                                        }
                                    }
                                    if (dialogCell4.drawBotVerified) {
                                        dialogCell4.nameLeft += AndroidUtilities.dp(21.0f);
                                    }
                                    dialogCell4.nameMuteLeft = (int) (dialogCell4.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
                                }
                                StaticLayout staticLayout10 = dialogCell4.messageLayout;
                                if (staticLayout10 != null && (lineCount3 = staticLayout10.getLineCount()) > 0) {
                                    float f3 = 2.14748365E9f;
                                    for (int i63 = 0; i63 < lineCount3; i63++) {
                                        f3 = Math.min(f3, dialogCell4.messageLayout.getLineLeft(i63));
                                    }
                                    dialogCell4.messageLeft = (int) (dialogCell4.messageLeft - f3);
                                }
                                StaticLayout staticLayout11 = dialogCell4.buttonLayout;
                                if (staticLayout11 != null && (lineCount2 = staticLayout11.getLineCount()) > 0) {
                                    float f4 = 2.14748365E9f;
                                    for (int i64 = 0; i64 < lineCount2; i64++) {
                                        f4 = Math.min(f4, dialogCell4.buttonLayout.getLineLeft(i64));
                                    }
                                    dialogCell4.buttonLeft = (int) (dialogCell4.buttonLeft - f4);
                                }
                                StaticLayout staticLayout12 = dialogCell4.typingLayout;
                                if (staticLayout12 != null && (lineCount = staticLayout12.getLineCount()) > 0) {
                                    float f5 = 2.14748365E9f;
                                    for (int i65 = 0; i65 < lineCount; i65++) {
                                        f5 = Math.min(f5, dialogCell4.typingLayout.getLineLeft(i65));
                                    }
                                    dialogCell4.typingLeft = (int) (dialogCell4.typingLeft - f5);
                                }
                                StaticLayout staticLayout13 = dialogCell4.messageNameLayout;
                                if (staticLayout13 != null && staticLayout13.getLineCount() > 0) {
                                    dialogCell4.messageNameLeft = (int) (dialogCell4.messageNameLeft - dialogCell4.messageNameLayout.getLineLeft(i17));
                                }
                            }
                            staticLayout = dialogCell4.typingLayout;
                            if (staticLayout != null && dialogCell4.printingStringType >= 0 && staticLayout.getText().length() > 0) {
                                if (i9 < 0 && (i19 = i9 + 1) < dialogCell4.typingLayout.getText().length()) {
                                    primaryHorizontal = dialogCell4.typingLayout.getPrimaryHorizontal(i9);
                                    primaryHorizontal2 = dialogCell4.typingLayout.getPrimaryHorizontal(i19);
                                } else {
                                    primaryHorizontal = dialogCell4.typingLayout.getPrimaryHorizontal(i17);
                                    primaryHorizontal2 = dialogCell4.typingLayout.getPrimaryHorizontal(1);
                                }
                                if (primaryHorizontal >= primaryHorizontal2) {
                                    dialogCell4.statusDrawableLeft = (int) (dialogCell4.typingLeft + primaryHorizontal);
                                } else {
                                    dialogCell4.statusDrawableLeft = (int) (dialogCell4.typingLeft + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
                                }
                            }
                            updateThumbsPosition();
                        }
                        ellipsize = TextUtils.ellipsize(charSequence9, dialogCell4.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                        charSequence29 = ellipsize;
                        alignment = (dialogCell4.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                        if (!dialogCell4.useForceThreeLines) {
                        }
                        if (dialogCell4.thumbsCount > 0) {
                            max += AndroidUtilities.dp(5.0f);
                        }
                        dialogCell4.messageLayout = StaticLayoutEx.createStaticLayout(charSequence29, dialogCell4.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence28 == null ? 1 : 2);
                        i18 = max;
                        dialogCell4.spoilersPool.addAll(dialogCell4.spoilers);
                        dialogCell4.spoilers.clear();
                        StaticLayout staticLayout32 = dialogCell4.messageLayout;
                        Stack stack2 = dialogCell4.spoilersPool;
                        List list2 = dialogCell4.spoilers;
                        i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        i17 = 0;
                        SpoilerEffect.addSpoilers(this, staticLayout32, -2, -2, stack2, list2);
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans222 = dialogCell4.animatedEmojiStack;
                        Layout[] layoutArr222 = new Layout[1];
                        layoutArr222[i17] = dialogCell4.messageLayout;
                        dialogCell4.animatedEmojiStack = AnimatedEmojiSpan.update(i17, dialogCell4, emojiGroupedSpans222, layoutArr222);
                        if (LocaleController.isRTL) {
                        }
                        staticLayout = dialogCell4.typingLayout;
                        if (staticLayout != null) {
                            if (i9 < 0) {
                            }
                            primaryHorizontal = dialogCell4.typingLayout.getPrimaryHorizontal(i17);
                            primaryHorizontal2 = dialogCell4.typingLayout.getPrimaryHorizontal(1);
                            if (primaryHorizontal >= primaryHorizontal2) {
                            }
                        }
                        updateThumbsPosition();
                    }
                }
                ellipsize = TextUtils.ellipsize(charSequence9, dialogCell4.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                charSequence29 = ellipsize;
                alignment = (dialogCell4.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                if (!dialogCell4.useForceThreeLines) {
                }
                if (dialogCell4.thumbsCount > 0) {
                }
                dialogCell4.messageLayout = StaticLayoutEx.createStaticLayout(charSequence29, dialogCell4.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence28 == null ? 1 : 2);
                i18 = max;
                dialogCell4.spoilersPool.addAll(dialogCell4.spoilers);
                dialogCell4.spoilers.clear();
                StaticLayout staticLayout322 = dialogCell4.messageLayout;
                Stack stack22 = dialogCell4.spoilersPool;
                List list22 = dialogCell4.spoilers;
                i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                i17 = 0;
                SpoilerEffect.addSpoilers(this, staticLayout322, -2, -2, stack22, list22);
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2222 = dialogCell4.animatedEmojiStack;
                Layout[] layoutArr2222 = new Layout[1];
                layoutArr2222[i17] = dialogCell4.messageLayout;
                dialogCell4.animatedEmojiStack = AnimatedEmojiSpan.update(i17, dialogCell4, emojiGroupedSpans2222, layoutArr2222);
                if (LocaleController.isRTL) {
                }
                staticLayout = dialogCell4.typingLayout;
                if (staticLayout != null) {
                }
                updateThumbsPosition();
            }
            charSequence29 = charSequence9;
        }
        alignment = (dialogCell4.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        if (!dialogCell4.useForceThreeLines) {
        }
        if (dialogCell4.thumbsCount > 0) {
        }
        dialogCell4.messageLayout = StaticLayoutEx.createStaticLayout(charSequence29, dialogCell4.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence28 == null ? 1 : 2);
        i18 = max;
        dialogCell4.spoilersPool.addAll(dialogCell4.spoilers);
        dialogCell4.spoilers.clear();
        StaticLayout staticLayout3222 = dialogCell4.messageLayout;
        Stack stack222 = dialogCell4.spoilersPool;
        List list222 = dialogCell4.spoilers;
        i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        i17 = 0;
        SpoilerEffect.addSpoilers(this, staticLayout3222, -2, -2, stack222, list222);
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22222 = dialogCell4.animatedEmojiStack;
        Layout[] layoutArr22222 = new Layout[1];
        layoutArr22222[i17] = dialogCell4.messageLayout;
        dialogCell4.animatedEmojiStack = AnimatedEmojiSpan.update(i17, dialogCell4, emojiGroupedSpans22222, layoutArr22222);
        if (LocaleController.isRTL) {
        }
        staticLayout = dialogCell4.typingLayout;
        if (staticLayout != null) {
        }
        updateThumbsPosition();
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
                    Theme.dialogs_clockDrawable.setAlpha(NotificationCenter.cameraInitied);
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
                        Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.cameraInitied);
                    }
                    if (z4 || f == 0.0f) {
                        return;
                    }
                    canvas.restore();
                    Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.cameraInitied);
                    Theme.dialogs_checkReadDrawable.setAlpha(NotificationCenter.cameraInitied);
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
                    Theme.dialogs_checkDrawable.setAlpha(NotificationCenter.cameraInitied);
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

    /* JADX WARN: Removed duplicated region for block: B:138:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x08c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x04d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean update(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        MessageObject messageObject;
        boolean z7;
        boolean z8;
        boolean z9;
        TLRPC.User user;
        int dp;
        TLRPC.Chat chat;
        boolean z10;
        boolean z11;
        int i2;
        TLRPC.Chat chat2;
        boolean z12;
        MessageObject messageObject2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TLRPC.Chat chat3;
        MessageObject messageObject3;
        long j2;
        boolean isForumCell = isForumCell();
        boolean z13 = false;
        this.drawAvatarSelector = false;
        this.ttlPeriod = 0;
        CustomDialog customDialog = this.customDialog;
        if (customDialog != null) {
            this.lastMessageDate = customDialog.date;
            int i8 = customDialog.unread_count;
            this.lastUnreadState = i8 != 0;
            this.unreadCount = i8;
            this.drawPin = customDialog.pinned;
            this.dialogMuted = customDialog.muted;
            this.hasUnmutedTopics = false;
            this.avatarDrawable.setInfo(customDialog.id, customDialog.name, null);
            if (this.isShareToStoryCell) {
                this.avatarImage.setImage(null, "50_50", this.repostStoryDrawable, null, 0L);
            } else {
                this.avatarImage.setImage(null, "50_50", this.avatarDrawable, null, 0L);
            }
            int i9 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                if (i9 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i9].setImageBitmap((Drawable) null);
                i9++;
            }
            this.drawMonoforumAvatar = false;
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(28.0f));
            this.drawUnmute = false;
            z6 = isForumCell;
            z7 = false;
            z8 = false;
        } else {
            int i10 = this.unreadCount;
            boolean z14 = this.reactionMentionCount != 0;
            boolean z15 = this.markUnread;
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
                        } else if (dialog instanceof TLRPC.TL_dialogFolder) {
                            this.unreadCount = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                            this.mentionCount = 0;
                            this.reactionMentionCount = 0;
                        } else {
                            this.unreadCount = dialog.unread_count;
                            this.mentionCount = dialog.unread_mentions_count;
                            this.reactionMentionCount = dialog.unread_reactions_count;
                        }
                        if (ChatObject.isMonoForum(chat4)) {
                            this.mentionCount = 0;
                        }
                        this.markUnread = dialog.unread_mark;
                        MessageObject messageObject5 = this.message;
                        this.currentEditDate = messageObject5 != null ? messageObject5.messageOwner.edit_date : 0;
                        this.lastMessageDate = dialog.last_message_date;
                        int i11 = this.dialogsType;
                        if (i11 == 7 || i11 == 8) {
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
                                z5 = true;
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
                                z5 = true;
                            }
                            if (j2 != 0) {
                                z12 = !this.drawBotVerified;
                                this.botVerification.set(j2, z);
                            } else {
                                z12 = this.drawBotVerified;
                                this.botVerification.set((Drawable) null, z);
                            }
                        } else {
                            z12 = false;
                        }
                        if ((this.isDialogCell || this.isTopic) && (i & MessagesController.UPDATE_MASK_USER_PRINT) != 0) {
                            CharSequence printingString = MessagesController.getInstance(this.currentAccount).getPrintingString(this.currentDialogId, getTopicId(), true);
                            CharSequence charSequence = this.lastPrintString;
                            if ((charSequence != null && printingString == null) || ((charSequence == null && printingString != null) || (charSequence != null && !charSequence.equals(printingString)))) {
                                z12 = true;
                            }
                        }
                        if (!z12 && (i & MessagesController.UPDATE_MASK_MESSAGE_TEXT) != 0 && (messageObject3 = this.message) != null && messageObject3.messageText != this.lastMessageString) {
                            z12 = true;
                        }
                        if (!z12 && (i & MessagesController.UPDATE_MASK_CHAT) != 0 && this.chat != null) {
                            TLRPC.Chat chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                            if ((chat6 != null && chat6.call_active && chat6.call_not_empty) != this.hasCall) {
                                z12 = true;
                            }
                        }
                        if (!z12 && (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && ((chat3 = this.chat) == null || (chat3.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat3)))) {
                            ForumFormattedNames forumFormattedNames = this.forumFormattedNames;
                            if (forumFormattedNames != null) {
                                forumFormattedNames.invalidateSpans();
                            }
                            z12 = true;
                        }
                        if (!z12 && (i & MessagesController.UPDATE_MASK_NAME) != 0 && this.chat == null) {
                            z12 = true;
                        }
                        if (!z12 && (i & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 && this.user == null) {
                            z12 = true;
                        }
                        if (!z12 && (i & MessagesController.UPDATE_MASK_CHAT_NAME) != 0 && this.user == null) {
                            z12 = true;
                        }
                        if (!z12) {
                            MessageObject messageObject7 = this.message;
                            if (messageObject7 != null && this.lastUnreadState != messageObject7.isUnread()) {
                                this.lastUnreadState = this.message.isUnread();
                                z12 = true;
                            }
                            if (this.isDialogCell) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) MessagesController.getInstance(this.currentAccount).dialogs_dict.get(this.currentDialogId);
                                TLRPC.Chat chat7 = dialog2 == null ? null : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog2.id));
                                if (chat7 != null && (chat7.forum || (chat7.monoforum && ChatObject.canManageMonoForum(this.currentAccount, chat7)))) {
                                    z6 = z2;
                                    int[] forumUnreadCount2 = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat7.id);
                                    i5 = forumUnreadCount2[0];
                                    i7 = forumUnreadCount2[1];
                                    int i12 = forumUnreadCount2[2];
                                    this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                    i6 = i12;
                                } else {
                                    z6 = z2;
                                    if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                        i5 = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                    } else if (dialog2 != null) {
                                        i5 = dialog2.unread_count;
                                        int i13 = dialog2.unread_mentions_count;
                                        i6 = dialog2.unread_reactions_count;
                                        i7 = i13;
                                    } else {
                                        i5 = 0;
                                    }
                                    i6 = 0;
                                    i7 = 0;
                                }
                                int i14 = ChatObject.isMonoForum(chat7) ? 0 : i7;
                                if (dialog2 != null && (this.unreadCount != i5 || this.markUnread != dialog2.unread_mark || this.mentionCount != i14 || this.reactionMentionCount != i6)) {
                                    this.unreadCount = i5;
                                    this.mentionCount = i14;
                                    this.markUnread = dialog2.unread_mark;
                                    this.reactionMentionCount = i6;
                                    z12 = true;
                                }
                                if (!z12 && (i & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject2 = this.message) != null) {
                                    i3 = this.lastSendState;
                                    i4 = messageObject2.messageOwner.send_state;
                                    if (i3 != i4) {
                                        this.lastSendState = i4;
                                        z12 = true;
                                    }
                                }
                                if (!z12) {
                                    invalidate();
                                    return z3;
                                }
                            }
                        }
                        z6 = z2;
                        if (!z12) {
                            i3 = this.lastSendState;
                            i4 = messageObject2.messageOwner.send_state;
                            if (i3 != i4) {
                            }
                        }
                        if (!z12) {
                        }
                    } else {
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
                                if (z || ((i10 == this.unreadCount && z15 == this.markUnread) || (this.isDialogCell && System.currentTimeMillis() - this.lastDialogChangedTime <= 100))) {
                                    z7 = z3;
                                    z8 = z4;
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
                                    if ((i10 == 0 || this.markUnread) && (this.markUnread || !z15)) {
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
                                        String format = String.format("%d", Integer.valueOf(i10));
                                        String format2 = String.format("%d", Integer.valueOf(this.unreadCount));
                                        if (format.length() == format2.length()) {
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                            int i15 = 0;
                                            while (i15 < format.length()) {
                                                if (format.charAt(i15) == format2.charAt(i15)) {
                                                    z10 = z3;
                                                    int i16 = i15 + 1;
                                                    spannableStringBuilder.setSpan(new EmptyStubSpan(), i15, i16, 0);
                                                    spannableStringBuilder2.setSpan(new EmptyStubSpan(), i15, i16, 0);
                                                    z11 = z4;
                                                    i2 = 1;
                                                } else {
                                                    z10 = z3;
                                                    z11 = z4;
                                                    i2 = 1;
                                                    spannableStringBuilder3.setSpan(new EmptyStubSpan(), i15, i15 + 1, 0);
                                                }
                                                i15 += i2;
                                                z3 = z10;
                                                z4 = z11;
                                            }
                                            z7 = z3;
                                            z8 = z4;
                                            int max = Math.max(AndroidUtilities.dp(8.0f), (int) Math.ceil(Theme.dialogs_countTextPaint2.measureText(format)));
                                            TextPaint textPaint = Theme.dialogs_countTextPaint2;
                                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                            this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                            this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, Theme.dialogs_countTextPaint2, max, alignment, 1.0f, 0.0f, false);
                                            this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, Theme.dialogs_countTextPaint2, max, alignment, 1.0f, 0.0f, false);
                                        } else {
                                            z7 = z3;
                                            z8 = z4;
                                            this.countOldLayout = this.countLayout;
                                        }
                                    } else {
                                        z7 = z3;
                                        z8 = z4;
                                    }
                                    this.countWidthOld = this.countWidth;
                                    this.countLeftOld = this.countLeft;
                                    this.countAnimationIncrement = this.unreadCount > i10;
                                    this.countAnimator.start();
                                }
                                boolean z16 = this.reactionMentionCount != 0;
                                if (!z && z16 != z14) {
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
                                z9 = isFolderCell() && (chat = this.chat) != null && chat.monoforum;
                                this.drawMonoforumAvatar = z9;
                                ImageReceiver imageReceiver = this.avatarImage;
                                if (z9) {
                                    dp = 1;
                                } else {
                                    TLRPC.Chat chat10 = this.chat;
                                    dp = AndroidUtilities.dp(((chat10 == null || !chat10.forum || this.currentDialogFolderId != 0 || this.useFromUserAsAvatar) && (this.isSavedDialog || (user = this.user) == null || !user.self || !MessagesController.getInstance(this.currentAccount).savedViewAsChats)) ? 28.0f : 16.0f);
                                }
                                imageReceiver.setRoundRadius(dp);
                                z13 = z5;
                            }
                        }
                    }
                    if (z) {
                    }
                    z7 = z3;
                    z8 = z4;
                    if (this.reactionMentionCount != 0) {
                    }
                    if (!z) {
                    }
                    if (isFolderCell()) {
                    }
                    this.drawMonoforumAvatar = z9;
                    ImageReceiver imageReceiver2 = this.avatarImage;
                    if (z9) {
                    }
                    imageReceiver2.setRoundRadius(dp);
                    z13 = z5;
                }
            } else {
                z2 = isForumCell;
            }
            z3 = false;
            z4 = false;
            z5 = false;
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
            z8 = z4;
            if (this.reactionMentionCount != 0) {
            }
            if (!z) {
            }
            if (isFolderCell()) {
            }
            this.drawMonoforumAvatar = z9;
            ImageReceiver imageReceiver22 = this.avatarImage;
            if (z9) {
            }
            imageReceiver22.setRoundRadius(dp);
            z13 = z5;
        }
        boolean z17 = (this.isTopic || (getMeasuredWidth() == 0 && getMeasuredHeight() == 0)) ? z8 : true;
        if (!z13) {
            int i17 = this.storyParams.currentState;
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
        if (z17) {
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

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0d33, code lost:
    
        if (r1.lastKnownTypingType >= 0) goto L423;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0ca8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0cda  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0cec  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0d25  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0ddc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0fe3  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x10c0  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1128  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x1134 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x118e  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x11b3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x11cb  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1391  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x13f3  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x162c  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x17ab  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x17db  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x17ef  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1814  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x182e  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x1875  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x18a3  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x18ae  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x18bf  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x191b  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1924  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x192b  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x197e  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x1a02  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x1a50  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x1aad  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x1ade  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x1b34  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x1b47  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x1b8b  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x1b93  */
    /* JADX WARN: Removed duplicated region for block: B:663:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x1b8d  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x1b6b  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x1b07  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x1ab5  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x1ac6  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x180e  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x1444  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x139b  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x1220  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x1191  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x1234  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x1286  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x10b4  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x0fde  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:874:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:880:0x0dd6  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v100 */
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
        float f;
        int i2;
        String str;
        RLottieDrawable rLottieDrawable;
        float f2;
        float f3;
        Canvas canvas2;
        ?? r10;
        float f4;
        int i3;
        float f5;
        boolean z;
        boolean z2;
        float f6;
        boolean z3;
        boolean z4;
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int i4;
        float f7;
        int i5;
        boolean z5;
        int i6;
        float f8;
        Object obj;
        int i7;
        int i8;
        Canvas canvas3;
        Object obj2;
        Canvas canvas4;
        int i9;
        int i10;
        float f9;
        int i11;
        int i12;
        float f10;
        boolean z6;
        int i13;
        boolean z7;
        int i14;
        DialogCellTags dialogCellTags;
        int i15;
        float dp;
        float f11;
        boolean z8;
        StaticLayout staticLayout;
        int i16;
        float f12;
        DialogUpdateHelper dialogUpdateHelper;
        float f13;
        StaticLayout staticLayout2;
        float f14;
        float f15;
        int i17;
        StaticLayout staticLayout3;
        StaticLayout staticLayout4;
        Drawable drawable;
        CustomDialog customDialog;
        int i18;
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
            int i19 = color2;
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
                canvas.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                if (this.currentRevealProgress == 0.0f) {
                    if (Theme.dialogs_archiveDrawableRecolored) {
                        Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                        Theme.dialogs_archiveDrawableRecolored = false;
                    }
                    if (Theme.dialogs_hidePsaDrawableRecolored) {
                        Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                        RLottieDrawable rLottieDrawable2 = Theme.dialogs_hidePsaDrawable;
                        int i20 = Theme.key_chats_archiveBackground;
                        rLottieDrawable2.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i20));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i20));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i20));
                        Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                        Theme.dialogs_hidePsaDrawableRecolored = false;
                    }
                }
            } else {
                f = measuredWidth;
                i2 = i;
                str = string;
            }
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.translationDrawable.getIntrinsicWidth() / 2);
            int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
            int intrinsicWidth = (this.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
            int intrinsicHeight = (this.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
            if (this.currentRevealProgress > 0.0f) {
                canvas.save();
                canvas.clipRect(f - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Theme.dialogs_pinnedPaint.setColor(i19);
                canvas.drawCircle(intrinsicWidth, intrinsicHeight, ((float) Math.sqrt((intrinsicWidth * intrinsicWidth) + ((intrinsicHeight - getMeasuredHeight()) * (intrinsicHeight - getMeasuredHeight())))) * AndroidUtilities.accelerateInterpolator.getInterpolation(this.currentRevealProgress), Theme.dialogs_pinnedPaint);
                canvas.restore();
                if (!Theme.dialogs_archiveDrawableRecolored) {
                    Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                    Theme.dialogs_archiveDrawableRecolored = true;
                }
                if (!Theme.dialogs_hidePsaDrawableRecolored) {
                    Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                    RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                    int i21 = Theme.key_chats_archivePinBackground;
                    rLottieDrawable3.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i21));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i21));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i21));
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
            int i22 = i2;
            if (this.swipeMessageTextId != i22 || this.swipeMessageWidth != getMeasuredWidth()) {
                this.swipeMessageTextId = i22;
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
                    i4 = 2;
                    i18 = canvas.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.rightFragmentOpenedProgress) * 255.0f), 31);
                } else {
                    i4 = 2;
                    int save = canvas.save();
                    canvas.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i18 = save;
                }
                canvas.translate((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress, 0.0f);
                f7 = f2 + ((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress);
                i5 = i18;
            } else {
                i4 = 2;
                f7 = f2;
                i5 = -1;
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
                        float[] fArr = new float[i4];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{-1, 0}, fArr, Shader.TileMode.CLAMP));
                        this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (this.fadePaintBack == null) {
                        Paint paint2 = new Paint();
                        this.fadePaintBack = paint2;
                        float[] fArr2 = new float[i4];
                        // fill-array-data instruction
                        fArr2[0] = 0.0f;
                        fArr2[1] = 1.0f;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, -1}, fArr2, Shader.TileMode.CLAMP));
                        this.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), NotificationCenter.cameraInitied, 31);
                    int i23 = this.nameLeft;
                    canvas.clipRect(i23, 0, this.nameWidth + i23, getMeasuredHeight());
                }
                if (this.currentDialogFolderId != 0) {
                    TextPaint textPaint2 = Theme.dialogs_namePaint[this.paintIndex];
                    int color3 = Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider);
                    textPaint2.linkColor = color3;
                    textPaint2.setColor(color3);
                } else if (this.encryptedChat != null || ((customDialog = this.customDialog) != null && customDialog.type == i4)) {
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
                f8 = 0.0f;
                i6 = i5;
                i8 = -1;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, this.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(0, staticLayout6.getPaint().getColor()));
                canvas.restore();
                if (!this.nameLayoutEllipsizeByGradient || this.nameLayoutFits) {
                    obj = null;
                    i7 = 2;
                } else {
                    canvas.save();
                    if (this.nameLayoutEllipsizeLeft) {
                        canvas.translate(this.nameLeft, 0.0f);
                        i7 = 2;
                        obj = null;
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaint);
                    } else {
                        obj = null;
                        i7 = 2;
                        canvas.translate((this.nameLeft + this.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaintBack);
                    }
                    canvas.restore();
                    canvas.restore();
                }
            } else {
                i6 = i5;
                f8 = 0.0f;
                obj = null;
                i7 = 2;
                i8 = -1;
            }
            if (this.timeLayout == null || this.currentDialogFolderId != 0) {
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
                        drawable = Theme.dialogs_pinnedDrawable2Accent;
                    } else {
                        drawable = Theme.dialogs_pinnedDrawable2;
                    }
                    Drawable drawable2 = drawable;
                    int dp4 = (int) (((AndroidUtilities.dp(17.0f) - drawable2.getIntrinsicHeight()) / 2.0f) + height);
                    int dp5 = ((int) f24) + AndroidUtilities.dp(4.0f);
                    drawable2.setBounds(dp5, dp4, drawable2.getIntrinsicWidth() + dp5, drawable2.getIntrinsicHeight() + dp4);
                    int alpha = timeTextPaint.getAlpha();
                    timeTextPaint.setAlpha(27);
                    canvas3 = canvas;
                    canvas.drawRoundRect(f24, height, width, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), timeTextPaint);
                    timeTextPaint.setAlpha(alpha);
                    drawable2.draw(canvas3);
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
                Theme.dialogs_lock2Drawable.setBounds(this.lock2Left, this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i7), this.lock2Left + Theme.dialogs_lock2Drawable.getIntrinsicWidth(), this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i7) + Theme.dialogs_lock2Drawable.getIntrinsicHeight());
                Theme.dialogs_lock2Drawable.draw(canvas3);
            }
            if (this.messageNameLayout == null || isForumCell()) {
                obj2 = obj;
                canvas4 = canvas3;
                i9 = 2;
                i10 = 0;
                f9 = 1.0f;
                i11 = 1;
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
                    i11 = 1;
                    try {
                        obj2 = obj;
                        f9 = 1.0f;
                        canvas4 = canvas3;
                        i10 = 0;
                        i9 = 2;
                    } catch (Exception e) {
                        e = e;
                        obj2 = obj;
                        canvas4 = canvas3;
                        i9 = 2;
                        i10 = 0;
                        f9 = 1.0f;
                    }
                } catch (Exception e2) {
                    e = e2;
                    obj2 = obj;
                    canvas4 = canvas3;
                    i9 = 2;
                    i10 = 0;
                    f9 = 1.0f;
                    i11 = 1;
                }
                try {
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, this.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(1, staticLayout4.getPaint().getColor()));
                } catch (Exception e3) {
                    e = e3;
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
                    if (this.dialogsType == i13) {
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
                    Theme.dialogs_reorderDrawable.draw(canvas2);
                    if (this.drawError) {
                    }
                    f4 = 1.0f;
                    i3 = 1;
                    if (this.thumbsCount > 0) {
                    }
                    i14 = -1;
                    dialogCellTags = this.tags;
                    if (dialogCellTags != null) {
                    }
                    i15 = i6;
                    if (i15 != i14) {
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
                    if (z10) {
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
                if (this.updateHelper.typingProgres != f9) {
                    canvas.save();
                    canvas4.translate(this.messageLeft, f12);
                    int alpha2 = this.messageLayout.getPaint().getAlpha();
                    this.messageLayout.getPaint().setAlpha((int) (alpha2 * (f9 - this.updateHelper.typingProgres)));
                    if (!this.spoilers.isEmpty()) {
                        try {
                            canvas.save();
                            SpoilerEffect.clipOutCanvas(canvas4, this.spoilers);
                            SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                            staticLayout3 = this.messageLayout;
                            i17 = alpha2;
                        } catch (Exception e4) {
                            e = e4;
                            i17 = alpha2;
                        }
                        try {
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, this.animatedEmojiStack, -0.075f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i9, staticLayout3.getPaint().getColor()));
                            canvas.restore();
                            for (int i24 = 0; i24 < this.spoilers.size(); i24 += i11) {
                                SpoilerEffect spoilerEffect = (SpoilerEffect) this.spoilers.get(i24);
                                spoilerEffect.setColor(this.messageLayout.getPaint().getColor());
                                spoilerEffect.draw(canvas4);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            FileLog.e(e);
                            this.messageLayout.getPaint().setAlpha(i17);
                            canvas.restore();
                            canvas.save();
                            dialogUpdateHelper = this.updateHelper;
                            if (!dialogUpdateHelper.typingOutToTop) {
                            }
                            if (!this.useForceThreeLines) {
                                f13 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                canvas4.translate(this.typingLeft, f13);
                                staticLayout2 = this.typingLayout;
                                if (staticLayout2 != null) {
                                }
                                canvas.restore();
                                if (this.typingLayout != null) {
                                }
                                i12 = 4;
                                if (this.buttonLayout == null) {
                                }
                                if (this.currentDialogFolderId == 0) {
                                }
                                if (this.drawBotVerified) {
                                }
                                if (this.drawUnmute) {
                                }
                                if (this.dialogsType == i13) {
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
                                Theme.dialogs_reorderDrawable.draw(canvas2);
                                if (this.drawError) {
                                }
                                f4 = 1.0f;
                                i3 = 1;
                                if (this.thumbsCount > 0) {
                                }
                                i14 = -1;
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null) {
                                }
                                i15 = i6;
                                if (i15 != i14) {
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
                                if (z10) {
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
                            staticLayout2 = this.typingLayout;
                            if (staticLayout2 != null) {
                            }
                            canvas.restore();
                            if (this.typingLayout != null) {
                            }
                            i12 = 4;
                            if (this.buttonLayout == null) {
                            }
                            if (this.currentDialogFolderId == 0) {
                            }
                            if (this.drawBotVerified) {
                            }
                            if (this.drawUnmute) {
                            }
                            if (this.dialogsType == i13) {
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
                            Theme.dialogs_reorderDrawable.draw(canvas2);
                            if (this.drawError) {
                            }
                            f4 = 1.0f;
                            i3 = 1;
                            if (this.thumbsCount > 0) {
                            }
                            i14 = -1;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                            }
                            i15 = i6;
                            if (i15 != i14) {
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
                            if (z10) {
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
                        i17 = alpha2;
                        SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                        StaticLayout staticLayout7 = this.messageLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout7, this.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i9, staticLayout7.getPaint().getColor()));
                    }
                    this.messageLayout.getPaint().setAlpha(i17);
                    canvas.restore();
                }
                canvas.save();
                dialogUpdateHelper = this.updateHelper;
                if (!dialogUpdateHelper.typingOutToTop) {
                    f13 = this.messageTop + ((f9 - dialogUpdateHelper.typingProgres) * dp6);
                } else {
                    f13 = this.messageTop - ((f9 - dialogUpdateHelper.typingProgres) * dp6);
                }
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    f13 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                }
                canvas4.translate(this.typingLeft, f13);
                staticLayout2 = this.typingLayout;
                if (staticLayout2 != null) {
                    f14 = 0.0f;
                    if (this.updateHelper.typingProgres > 0.0f) {
                        int alpha3 = staticLayout2.getPaint().getAlpha();
                        this.typingLayout.getPaint().setAlpha((int) (alpha3 * this.updateHelper.typingProgres));
                        this.typingLayout.draw(canvas4);
                        this.typingLayout.getPaint().setAlpha(alpha3);
                    }
                } else {
                    f14 = 0.0f;
                }
                canvas.restore();
                if (this.typingLayout != null) {
                    int i25 = this.printingStringType;
                    if (i25 < 0) {
                        DialogUpdateHelper dialogUpdateHelper3 = this.updateHelper;
                        if (dialogUpdateHelper3.typingProgres > f14) {
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
                            f15 = this.messageTop + (dp6 * (f9 - dialogUpdateHelper4.typingProgres));
                        } else {
                            f15 = this.messageTop - (dp6 * (f9 - dialogUpdateHelper4.typingProgres));
                        }
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            f15 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                        }
                        i12 = 4;
                        if (i25 == i11 || i25 == 4) {
                            canvas4.translate(this.statusDrawableLeft, f15 + (i25 == i11 ? AndroidUtilities.dp(f9) : 0));
                        } else {
                            canvas4.translate(this.statusDrawableLeft, f15 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
                        }
                        chatStatusDrawable.draw(canvas4);
                        invalidate();
                        canvas.restore();
                    }
                }
                i12 = 4;
            } else {
                i12 = 4;
            }
            if (this.buttonLayout == null) {
                canvas.save();
                if (this.buttonBackgroundPaint == null) {
                    this.buttonBackgroundPaint = new Paint(i11);
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
                if (this.lastTopicMessageUnread && this.topMessageTopicEndIndex != this.topMessageTopicStartIndex && ((i16 = this.dialogsType) == 0 || i16 == 7 || i16 == 8)) {
                    this.canvasButton.setColor(ColorUtils.setAlphaComponent(this.currentMessagePaint.getColor(), Theme.isCurrentThemeDark() ? 36 : 26));
                    if (!this.buttonCreated) {
                        this.canvasButton.rewind();
                        int i26 = this.topMessageTopicEndIndex;
                        if (i26 != this.topMessageTopicStartIndex && i26 > 0) {
                            float f25 = this.messageTop;
                            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                f25 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            }
                            RectF rectF = AndroidUtilities.rectTmp;
                            float dp7 = this.messageLeft + AndroidUtilities.dp(2.0f) + this.messageLayout.getPrimaryHorizontal(i10);
                            float f26 = this.messageLeft;
                            StaticLayout staticLayout8 = this.messageLayout;
                            rectF.set(dp7, f25, (f26 + staticLayout8.getPrimaryHorizontal(Math.min(staticLayout8.getText().length(), this.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), this.buttonTop - AndroidUtilities.dp(4.0f));
                            rectF.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                            if (rectF.right > rectF.left) {
                                this.canvasButton.addRect(rectF);
                            }
                        }
                        float lineLeft = this.buttonLayout.getLineLeft(i10);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(this.buttonLeft + lineLeft + AndroidUtilities.dp(2.0f), this.buttonTop + AndroidUtilities.dp(2.0f), this.buttonLeft + lineLeft + this.buttonLayout.getLineWidth(i10) + AndroidUtilities.dp(12.0f), this.buttonTop + this.buttonLayout.getHeight());
                        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                        this.canvasButton.addRect(rectF2);
                    }
                    this.canvasButton.draw(canvas4);
                    Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                    Drawable drawable3 = Theme.dialogs_forum_arrowDrawable;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    BaseCell.setDrawableBounds(drawable3, rectF3.right - AndroidUtilities.dp(18.0f), rectF3.top + ((rectF3.height() - Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight()) / 2.0f));
                    Theme.dialogs_forum_arrowDrawable.draw(canvas4);
                }
                canvas4.translate(this.buttonLeft, this.buttonTop);
                if (!this.spoilers2.isEmpty()) {
                    try {
                        canvas.save();
                        SpoilerEffect.clipOutCanvas(canvas4, this.spoilers2);
                        SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas4);
                        staticLayout = this.buttonLayout;
                    } catch (Exception e6) {
                        e = e6;
                    }
                    try {
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout, this.animatedEmojiStack3, -0.075f, this.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout.getPaint().getColor()));
                        canvas.restore();
                        for (int i27 = 0; i27 < this.spoilers2.size(); i27 += i11) {
                            SpoilerEffect spoilerEffect2 = (SpoilerEffect) this.spoilers2.get(i27);
                            spoilerEffect2.setColor(this.buttonLayout.getPaint().getColor());
                            spoilerEffect2.draw(canvas4);
                        }
                    } catch (Exception e7) {
                        e = e7;
                        FileLog.e(e);
                        canvas.restore();
                        if (this.currentDialogFolderId == 0) {
                        }
                        if (this.drawBotVerified) {
                        }
                        if (this.drawUnmute) {
                        }
                        if (this.dialogsType == i13) {
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
                        Theme.dialogs_reorderDrawable.draw(canvas2);
                        if (this.drawError) {
                        }
                        f4 = 1.0f;
                        i3 = 1;
                        if (this.thumbsCount > 0) {
                        }
                        i14 = -1;
                        dialogCellTags = this.tags;
                        if (dialogCellTags != null) {
                        }
                        i15 = i6;
                        if (i15 != i14) {
                        }
                        z2 = z5;
                        r10 = z6;
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
                        if (z10) {
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
                int i28 = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                int i29 = this.lastStatusDrawableParams;
                if (i29 >= 0 && i29 != i28 && !this.statusDrawableAnimationInProgress) {
                    createStatusDrawableAnimator(i29, i28);
                }
                boolean z12 = this.statusDrawableAnimationInProgress;
                if (z12) {
                    i28 = this.animateToStatusDrawableParams;
                }
                boolean z13 = (i28 & 1) != 0;
                boolean z14 = (i28 & 2) != 0;
                boolean z15 = (i28 & i12) != 0;
                if (z12) {
                    int i30 = this.animateFromStatusDrawableParams;
                    boolean z16 = (i30 & 1) != 0;
                    boolean z17 = (i30 & 2) != 0;
                    boolean z18 = (i30 & i12) != 0;
                    if (!z13 && !z16 && z18 && !z17 && z14 && z15) {
                        f5 = 0.0f;
                        f10 = 1.0f;
                        drawCheckStatus(canvas, z13, z14, z15, true, this.statusDrawableProgress);
                        canvas2 = canvas4;
                        z8 = false;
                        i13 = 2;
                    } else {
                        f10 = 1.0f;
                        f5 = 0.0f;
                        Canvas canvas5 = canvas4;
                        boolean z19 = z16;
                        i13 = 2;
                        boolean z20 = z17;
                        boolean z21 = z18;
                        z8 = false;
                        canvas2 = canvas5;
                        drawCheckStatus(canvas, z19, z20, z21, false, 1.0f - this.statusDrawableProgress);
                        drawCheckStatus(canvas, z13, z14, z15, false, this.statusDrawableProgress);
                    }
                } else {
                    canvas2 = canvas4;
                    f10 = 1.0f;
                    z8 = false;
                    i13 = 2;
                    f5 = 0.0f;
                    drawCheckStatus(canvas, z13, z14, z15, false, 1.0f);
                }
                this.lastStatusDrawableParams = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                z6 = z8;
            } else {
                canvas2 = canvas4;
                f10 = 1.0f;
                z6 = false;
                i13 = 2;
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
                    this.botVerification.draw(canvas2);
                }
            }
            boolean z22 = !this.drawUnmute || this.dialogMuted;
            if (this.dialogsType == i13 && ((z22 || this.dialogMutedProgress > f5) && !this.drawVerified && this.drawScam == 0 && !this.drawPremium)) {
                if (z22) {
                    float f27 = this.dialogMutedProgress;
                    if (f27 != f10) {
                        float f28 = f27 + 0.10666667f;
                        this.dialogMutedProgress = f28;
                        if (f28 > f10) {
                            this.dialogMutedProgress = f10;
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
                        if (this.dialogMutedProgress != f10) {
                            canvas.save();
                            float f29 = this.dialogMutedProgress;
                            canvas2.scale(f29, f29, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
                            if (this.drawUnmute) {
                                Theme.dialogs_unmuteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_unmuteDrawable.draw(canvas2);
                                Theme.dialogs_unmuteDrawable.setAlpha(NotificationCenter.cameraInitied);
                            } else {
                                Theme.dialogs_muteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_muteDrawable.draw(canvas2);
                                Theme.dialogs_muteDrawable.setAlpha(NotificationCenter.cameraInitied);
                            }
                            canvas.restore();
                        } else if (this.drawUnmute) {
                            Theme.dialogs_unmuteDrawable.draw(canvas2);
                        } else {
                            Theme.dialogs_muteDrawable.draw(canvas2);
                        }
                    }
                }
                if (!z22) {
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
                    if (this.dialogMutedProgress != f10) {
                    }
                }
                dp102 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp92, dp102);
                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp92, dp102);
                if (this.dialogMutedProgress != f10) {
                }
            } else if (this.drawVerified) {
                float dp11 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp11 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft - AndroidUtilities.dp(f10), dp11);
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft - AndroidUtilities.dp(f10), dp11);
                Theme.dialogs_verifiedDrawable.draw(canvas2);
                Theme.dialogs_verifiedCheckDrawable.draw(canvas2);
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
                        this.emojiStatus.draw(canvas2);
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    this.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                    z = z7;
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
                    if (this.drawError) {
                        Theme.dialogs_errorDrawable.setAlpha((int) ((f10 - this.reorderIconProgress) * 255.0f));
                        this.rect.set(this.errorLeft, this.errorTop, r2 + AndroidUtilities.dp(20.666f), this.errorTop + AndroidUtilities.dp(20.666f));
                        RectF rectF6 = this.rect;
                        float f32 = AndroidUtilities.density * 10.5f;
                        canvas2.drawRoundRect(rectF6, f32, f32, Theme.dialogs_errorPaint);
                        BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, this.errorLeft + AndroidUtilities.dp(4.5f), this.errorTop + AndroidUtilities.dp(5.0f));
                        Theme.dialogs_errorDrawable.draw(canvas2);
                    } else if (((this.drawCount || this.drawMention) && this.drawCount2) || this.countChangeProgress != f10 || this.drawReactionMention || this.reactionsMentionsChangeProgress != f10) {
                        boolean isCounterMuted2 = isCounterMuted();
                        f4 = 1.0f;
                        i3 = 1;
                        drawCounter(canvas, isCounterMuted2, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                        if (this.drawMention) {
                            Theme.dialogs_countPaint.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
                            this.rect.set(this.mentionLeft, this.countTop, r1 + this.mentionWidth + AndroidUtilities.dp(12.666f), this.countTop + AndroidUtilities.dp(20.666f));
                            Paint paint3 = (!isCounterMuted2 || this.folderId == 0) ? Theme.dialogs_countPaint : Theme.dialogs_countGrayPaint;
                            RectF rectF7 = this.rect;
                            canvas2.drawRoundRect(rectF7, rectF7.height() / 2.0f, this.rect.height() / 2.0f, paint3);
                            if (this.mentionLayout != null) {
                                Theme.dialogs_countTextPaint2.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
                                canvas.save();
                                canvas2.translate(this.mentionLeft + AndroidUtilities.dp(6.333f), this.countTop + AndroidUtilities.dp(4.0f));
                                this.mentionLayout.draw(canvas2);
                                canvas.restore();
                            } else {
                                Theme.dialogs_mentionDrawable.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_mentionDrawable, this.mentionLeft + AndroidUtilities.dp(2.3330002f), this.countTop + AndroidUtilities.dp(2.3330002f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                                Theme.dialogs_mentionDrawable.draw(canvas2);
                            }
                        }
                        if (this.drawReactionMention || this.reactionsMentionsChangeProgress != 1.0f) {
                            Theme.dialogs_reactionsCountPaint.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
                            this.rect.set(this.reactionMentionLeft, this.countTop, r1 + AndroidUtilities.dp(20.666f), this.countTop + AndroidUtilities.dp(20.666f));
                            Paint paint4 = Theme.dialogs_reactionsCountPaint;
                            canvas.save();
                            float f33 = this.reactionsMentionsChangeProgress;
                            if (f33 != 1.0f) {
                                if (!this.drawReactionMention) {
                                    f33 = 1.0f - f33;
                                }
                                canvas2.scale(f33, f33, this.rect.centerX(), this.rect.centerY());
                            }
                            RectF rectF8 = this.rect;
                            canvas2.drawRoundRect(rectF8, rectF8.height() / 2.0f, this.rect.height() / 2.0f, paint4);
                            Theme.dialogs_reactionsMentionDrawable.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reactionsMentionDrawable, this.reactionMentionLeft + AndroidUtilities.dp(2.3330002f), this.countTop + AndroidUtilities.dp(2.3330002f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                            Theme.dialogs_reactionsMentionDrawable.draw(canvas2);
                            canvas.restore();
                        }
                        if (this.thumbsCount > 0) {
                            float f34 = this.updateHelper.typingProgres;
                            if (f34 != f4) {
                                if (f34 > f5) {
                                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((f4 - f34) * 255.0f), 31);
                                    if (this.updateHelper.typingOutToTop) {
                                        dp = -AndroidUtilities.dp(14.0f);
                                        f11 = this.updateHelper.typingProgres;
                                    } else {
                                        dp = AndroidUtilities.dp(14.0f);
                                        f11 = this.updateHelper.typingProgres;
                                    }
                                    canvas2.translate(f5, dp * f11);
                                }
                                int i31 = 0;
                                while (i31 < this.thumbsCount) {
                                    if (this.thumbImageSeen[i31]) {
                                        if (this.thumbBackgroundPaint == null) {
                                            Paint paint5 = new Paint(i3);
                                            this.thumbBackgroundPaint = paint5;
                                            paint5.setShadowLayer(AndroidUtilities.dp(1.34f), f5, AndroidUtilities.dp(0.34f), 402653184);
                                            this.thumbBackgroundPaint.setColor(z6 ? 1 : 0);
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
                                            this.thumbPath.addRoundRect(rectF9, this.thumbImage[i31].getRoundRadius()[z6 ? 1 : 0], this.thumbImage[i31].getRoundRadius()[i3], Path.Direction.CW);
                                            canvas.save();
                                            canvas2.clipPath(this.thumbPath);
                                            if (this.thumbSpoiler == null) {
                                                this.thumbSpoiler = new SpoilerEffect();
                                            }
                                            this.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i8) * 0.325f)));
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
                                    i31 += i3;
                                    i8 = -1;
                                }
                                i14 = -1;
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
                                i15 = i6;
                                if (i15 != i14) {
                                    canvas2.restoreToCount(i15);
                                }
                                z2 = z5;
                                r10 = z6;
                            }
                        }
                        i14 = -1;
                        dialogCellTags = this.tags;
                        if (dialogCellTags != null) {
                            canvas.save();
                            canvas2.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                            this.tags.draw(canvas2, this.tagsRight - this.tagsLeft);
                            canvas.restore();
                        }
                        i15 = i6;
                        if (i15 != i14) {
                        }
                        z2 = z5;
                        r10 = z6;
                    } else if (this.openBot) {
                        canvas.save();
                        float scale = this.openButtonBounce.getScale(0.05f);
                        canvas2.scale(scale, scale, this.openButtonRect.centerX(), this.openButtonRect.centerY());
                        this.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                        RectF rectF10 = this.openButtonRect;
                        canvas2.drawRoundRect(rectF10, rectF10.height() / 2.0f, this.openButtonRect.height() / 2.0f, this.openButtonBackgroundPaint);
                        Text text = this.openButtonText;
                        if (text != null) {
                            text.draw(canvas, AndroidUtilities.dp(13.0f) + this.openButtonRect.left, this.openButtonRect.centerY(), Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider), 1.0f);
                        }
                        canvas.restore();
                    }
                    f4 = 1.0f;
                    i3 = 1;
                    if (this.thumbsCount > 0) {
                    }
                    i14 = -1;
                    dialogCellTags = this.tags;
                    if (dialogCellTags != null) {
                    }
                    i15 = i6;
                    if (i15 != i14) {
                    }
                    z2 = z5;
                    r10 = z6;
                } else {
                    Drawable drawable4 = PremiumGradient.getInstance().premiumStarDrawableMini;
                    int dp13 = this.nameMuteLeft - AndroidUtilities.dp(f10);
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f17 = 15.5f;
                    }
                    BaseCell.setDrawableBounds(drawable4, dp13, AndroidUtilities.dp(f17));
                    drawable4.draw(canvas2);
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
                (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).draw(canvas2);
                z = false;
                if (!this.drawReorder) {
                }
                if (!LocaleController.isRTL) {
                }
                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                Theme.dialogs_reorderDrawable.draw(canvas2);
                if (this.drawError) {
                }
                f4 = 1.0f;
                i3 = 1;
                if (this.thumbsCount > 0) {
                }
                i14 = -1;
                dialogCellTags = this.tags;
                if (dialogCellTags != null) {
                }
                i15 = i6;
                if (i15 != i14) {
                }
                z2 = z5;
                r10 = z6;
            }
            z = false;
            if (!this.drawReorder) {
            }
            if (!LocaleController.isRTL) {
            }
            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
            Theme.dialogs_reorderDrawable.draw(canvas2);
            if (this.drawError) {
            }
            f4 = 1.0f;
            i3 = 1;
            if (this.thumbsCount > 0) {
            }
            i14 = -1;
            dialogCellTags = this.tags;
            if (dialogCellTags != null) {
            }
            i15 = i6;
            if (i15 != i14) {
            }
            z2 = z5;
            r10 = z6;
        } else {
            canvas2 = canvas;
            r10 = 0;
            f4 = 1.0f;
            i3 = 1;
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
        if (this.drawAvatar && (!this.isTopic || (tL_forumTopic2 = this.forumTopic) == null || tL_forumTopic2.id != i3 || (pullForegroundDrawable = this.archivedChatsDrawable) == null || !pullForegroundDrawable.isDraw())) {
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
                boolean z23 = this.isShareToStoryCell;
                avatarStoryParams.drawHiddenStoriesAsSegments = z23 || this.currentDialogFolderId != 0;
                int i32 = avatarStoryParams.forceState;
                if (z23) {
                    avatarStoryParams.forceState = i3;
                }
                StoriesUtilities.drawAvatarWithStory(this.currentDialogId, canvas2, this.avatarImage, avatarStoryParams);
                if (this.storyParams.drawnLive) {
                    checkTtl();
                }
                this.storyParams.forceState = i32;
            }
        }
        if (this.animatingArchiveAvatar) {
            canvas.restore();
        }
        boolean z24 = (this.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) ? z2 : true;
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
        if (this.drawArchive && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == i3)) && this.translationX == f5 && this.archivedChatsDrawable != null)) {
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
                float f35 = this.rightFragmentOpenedProgress;
                if (f35 != f5) {
                    Theme.dividerPaint.setAlpha((int) (alpha4 * (f4 - f35)));
                }
                float measuredHeight2 = (getMeasuredHeight() - i3) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress);
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
        if (z10) {
            float f36 = f4 - pullProgress;
            int measuredHeight3 = (int) (getMeasuredHeight() * f36);
            int color13 = Theme.getColor(Theme.key_windowBackgroundWhite);
            if (this.archiveFadeGradientDrawable == null) {
                this.archiveFadeGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
            }
            if (this.archiveFadeGradientDrawableColor != color13) {
                this.archiveFadeGradientDrawableColor = color13;
                this.archiveFadeGradientDrawable.setColors(new int[]{color13, 16777215 & color13});
            }
            float clamp2 = MathUtils.clamp((f36 - 0.05f) * 10.0f, f5, f4);
            this.archiveFadeGradientDrawable.setBounds(r10, measuredHeight3, getMeasuredWidth(), AndroidUtilities.dp(6.0f) + measuredHeight3);
            this.archiveFadeGradientDrawable.setAlpha((int) (clamp2 * 255.0f));
            this.archiveFadeGradientDrawable.draw(canvas2);
            canvas.restore();
        }
        z3 = this.drawReorder;
        if (!z3 || this.reorderIconProgress != f5) {
            if (z3) {
                float f37 = this.reorderIconProgress;
                if (f37 < f4) {
                    float f38 = f37 + 0.09411765f;
                    this.reorderIconProgress = f38;
                    if (f38 > f4) {
                        this.reorderIconProgress = f4;
                    }
                    z4 = true;
                }
            } else {
                float f39 = this.reorderIconProgress;
                if (f39 > f5) {
                    float f40 = f39 - 0.09411765f;
                    this.reorderIconProgress = f40;
                    if (f40 < f5) {
                        this.reorderIconProgress = f5;
                    }
                    z4 = true;
                }
            }
            if (!this.archiveHidden) {
                float f41 = this.archiveBackgroundProgress;
                if (f41 > f5) {
                    float f42 = f41 - 0.069565214f;
                    this.archiveBackgroundProgress = f42;
                    if (f42 < f5) {
                        this.archiveBackgroundProgress = f5;
                    }
                    if (this.avatarDrawable.getAvatarType() == 2) {
                        this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                    }
                    z4 = true;
                }
                if (this.animatingArchiveAvatar) {
                    float f43 = this.animatingArchiveAvatarProgress + 16.0f;
                    this.animatingArchiveAvatarProgress = f43;
                    if (f43 >= f6) {
                        this.animatingArchiveAvatarProgress = f6;
                        this.animatingArchiveAvatar = r10;
                    }
                    z4 = true;
                }
                if (!this.drawRevealBackground) {
                    float f44 = this.currentRevealBounceProgress;
                    if (f44 < f4) {
                        float f45 = f44 + 0.09411765f;
                        this.currentRevealBounceProgress = f45;
                        if (f45 > f4) {
                            this.currentRevealBounceProgress = f4;
                            z4 = true;
                        }
                    }
                    float f46 = this.currentRevealProgress;
                    if (f46 < f4) {
                        float f47 = f46 + 0.053333335f;
                        this.currentRevealProgress = f47;
                        if (f47 > f4) {
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
                float f48 = this.currentRevealProgress;
                if (f48 > f5) {
                    float f49 = f48 - 0.053333335f;
                    this.currentRevealProgress = f49;
                    if (f49 < f5) {
                        this.currentRevealProgress = f5;
                    }
                    z4 = true;
                }
                this.emojiStatusView.setVisibility(!z ? 0 : 4);
                if (z4) {
                }
            } else {
                float f50 = this.archiveBackgroundProgress;
                if (f50 < f4) {
                    float f51 = f50 + 0.069565214f;
                    this.archiveBackgroundProgress = f51;
                    if (f51 > f4) {
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
        z4 = z24;
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
        int i4 = NotificationCenter.cameraInitied;
        if (z2) {
            if (this.counterPaintOutline == null) {
                Paint paint2 = new Paint();
                this.counterPaintOutline = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.counterPaintOutline.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.counterPaintOutline.setStrokeJoin(Paint.Join.ROUND);
                this.counterPaintOutline.setStrokeCap(Paint.Cap.ROUND);
            }
            this.counterPaintOutline.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_pinnedOverlay), NotificationCenter.cameraInitied), Color.alpha(r13) / 255.0f));
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
                    BubbleCounterPath.addBubbleRect(this.counterPath, this.counterPathRect, AndroidUtilities.dp(11.5f));
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
                    BubbleCounterPath.addBubbleRect(this.counterPath, this.counterPathRect, AndroidUtilities.dp(11.5f));
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
        if (this.currentDialogFolderId == 1) {
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
            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, charSequence6, spannableString, NotificationCenter.goingToPreviewTheme);
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
            MediaDataController.addTextStyleRuns(this.message, (Spannable) spannableString4, NotificationCenter.goingToPreviewTheme);
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

        /* JADX WARN: Code restructure failed: missing block: B:44:0x015a, code lost:
        
            if (org.telegram.messenger.MessagesController.getInstance(r19.this$0.currentAccount).getTopicsController().endIsReached(-r19.this$0.currentDialogId) != false) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x02cf  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x02d2  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0286  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x02d7  */
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
            long j = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0);
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
