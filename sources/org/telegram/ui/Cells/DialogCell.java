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
    public boolean drawingForBlur;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiStatus;
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
        this.avatarStart = 10;
        this.messagePaddingStart = 72;
        this.heightDefault = 72;
        this.heightThreeLines = 78;
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
                this.emojiStatus = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(22.0f));
                this.botVerification = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(17.0f));
                this.avatarImage.setAllowLoadingOnAttachedOnly(true);
                return;
            }
        }
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
        if (!isForumCell() && (user = this.user) != null && !user.self) {
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
        boolean z = this.ttlPeriod > 0 && !this.hasCall && !isOnline() && ((checkBox2 = this.checkBox) == null || !checkBox2.isChecked());
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
        int dp = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault);
        if (this.useSeparator) {
            dp++;
        }
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

    /* JADX WARN: Can't wrap try/catch for region: R(124:14|(1:1844)(1:18)|19|(2:1842|1843)(1:25)|26|(1:1841)(1:30)|31|(1:33)|34|(1:1840)(1:38)|39|(1:41)|42|(1:44)(1:1833)|45|(7:47|(1:49)|50|51|(1:53)|54|55)|56|(1:58)(1:1832)|59|(9:61|(2:63|(2:845|(1:847)(1:848))(2:67|(1:69)(1:844)))(4:849|(1:866)(1:853)|854|(2:862|(1:864)(1:865))(2:858|(1:860)(1:861)))|70|(3:72|(1:74)(4:831|(1:833)|834|(1:839)(1:838))|75)(3:840|(1:842)|843)|76|(1:78)(1:830)|79|(1:81)(1:(1:826)(1:(1:828)(1:829)))|82)(38:867|(2:1828|(1:1830)(1:1831))(2:871|(1:873)(1:1827))|874|(2:876|(2:878|(2:886|(1:888)(1:889))(2:882|(1:884)(1:885))))(2:1754|(31:1756|(4:1758|(1:1760)(2:1768|(1:1770)(3:1771|(1:1773)(5:1774|(1:1786)(1:1778)|1779|(1:1785)(1:1783)|1784)|1762))|1761|1762)(2:1787|(8:1789|(1:1791)(2:1808|(1:1810)(5:1811|(1:1825)(1:1815)|1816|(1:1824)(1:1822)|1823))|1792|(2:1794|(4:1798|1799|(2:1801|(1:1803)(1:1805))(1:1806)|1804))|1807|1799|(0)(0)|1804)(1:1826))|1763|(1:1767)|891|(1:895)|896|(6:898|(1:900)(1:1739)|901|(1:903)(1:1738)|904|(1:908))(2:1740|(5:1745|(1:1747)(1:1753)|1748|(1:1750)(1:1752)|1751)(1:1744))|909|(4:913|(2:915|(2:917|(2:919|(1:1708))))|1710|(20:1722|923|(11:925|(1:927)(1:1170)|928|(4:930|(1:932)|933|(1:935))|936|(1:938)(1:1169)|939|(1:941)(1:1168)|942|(2:944|(1:947))|948)(2:1171|(1:1173)(3:(6:1175|(1:1177)(1:1706)|1178|(1:1180)(1:1705)|(1:1182)(1:1704)|1183)(1:1707)|1184|(5:1658|1659|(7:1672|(1:1674)(2:1698|(2:1700|(1:1702))(1:1703))|1675|(2:1677|(3:1681|(1:1683)(1:1685)|1684))(2:1695|(1:1697))|1686|(1:1694)(1:1690)|1691)(2:1663|(2:1671|1216)(1:1667))|1668|1192)(4:1188|(1:1190)(2:1193|(2:1195|(1:1197)(4:1198|(2:1200|(1:1202)(2:1203|(1:1205)(2:1206|(1:1208)(2:1209|(2:1211|(1:1213)(1:1214))))))(2:1217|(3:1221|(1:1227)(1:1225)|1226))|1215|1216))(11:1228|(1:1230)(1:1657)|1231|(2:1245|(8:1247|(8:1251|(1:1253)(3:1650|(1:1652)(1:1654)|1653)|1254|(1:1256)(5:1263|(4:1265|(4:1267|(2:1269|(2:1271|(1:1273)(2:1277|(1:1279)(1:1280))))|1281|(1:1283)(2:1284|(1:1286)(2:1287|(1:1289)(1:1290))))(1:1291)|1274|1275)(2:1292|(5:1303|(5:1310|(20:1330|(1:1649)(1:1338)|1339|(4:1409|(2:1411|(4:(1:1414)|1416|(1:1418)|1420))|1422|(8:1430|(2:1432|(5:1434|(1:1446)|1440|1441|(2:1443|(1:1445)))(2:1447|(4:1454|(2:1456|(2:1461|(1:1463)(2:1464|(1:1466)(1:1467))))|1468|(4:1470|(1:1472)(2:1496|(1:1498)(2:1499|(1:1501)(2:1502|(1:1504)(2:1505|(1:1507)(1:1508)))))|1473|(3:1488|(3:1490|(1:1492)(1:1494)|1493)|1495)(4:1477|(2:1479|(1:1481)(1:1482))|(1:1486)|1487))(2:1509|(3:1511|(1:(1:1514)(1:1516))(2:1517|(1:1519)(1:1520))|1515)(2:1521|(3:1523|(3:1525|(1:1527)(1:1530)|1528)(3:1531|(1:1533)(1:1535)|1534)|1529)(5:1536|(5:1538|(2:1540|(3:1542|(1:1544)(1:1552)|1545))|1553|(0)(0)|1545)(2:1554|(1:1556)(2:1557|(2:1559|(1:1564)(1:1563))(2:1565|(2:1567|(1:1572)(1:1571))(2:1573|(1:1575)(2:1576|(1:1578)(2:1579|(1:1581)(2:1582|(3:1596|(4:1604|(1:1606)|1607|(2:1609|(3:1611|(1:1613)(1:1615)|1614)))(2:1600|(1:1602))|1603)(2:1586|(3:1588|(2:1590|(1:1592))(1:1594)|1593)(1:1595)))))))))|1546|1547|(2:1549|(1:1551))))))(1:1453)))|1616|(1:1618)(1:1648)|1619|(7:1621|(3:1638|(1:1640)|1641)(2:1625|(1:1627))|1628|(1:1630)(1:1637)|1631|(2:1633|(1:1635))|1636)|1642|(1:1647)(1:1646)))|1349|(1:1351)|1352|(2:1360|(13:1362|(1:1406)(1:1366)|1367|1368|1369|(1:1405)(5:1375|1376|1377|1378|1379)|1380|(1:1384)|1385|(4:1387|(1:1389)|1390|(1:1392)(1:1393))|1394|1259|(1:1261)(1:1262)))|1407|1368|1369|(2:1371|1401)|1405|1380|(2:1382|1384)|1385|(0)|1394|1259|(0)(0))(4:1316|(2:1326|(1:1328)(1:1329))(1:1320)|1321|(1:1323)(1:1325))|1324|1259|(0)(0))(1:1309)|1258|1259|(0)(0))(3:1296|(1:1302)(1:1300)|1301))|1276|1259|(0)(0))|1257|1258|1259|(0)(0))|1655|(0)(0)|1257|1258|1259|(0)(0)))|1656|1655|(0)(0)|1257|1258|1259|(0)(0)))|1191|1192)))|949|(3:965|(1:969)|970)|971|(9:1159|(1:1161)(2:1162|(1:1164)(2:1165|(1:1167)))|974|(4:1149|1150|(1:1158)(1:1156)|1157)(5:978|(4:980|(1:(1:983)(2:1122|985))(1:1123)|984|985)(7:1124|(1:1126)(2:1136|(3:1144|1145|(1:1147)(1:1148))(1:1143))|1127|(1:1129)(1:1135)|1130|(1:1132)(1:1134)|1133)|986|(2:991|(2:993|(1:995)(2:1083|(1:1085)(2:1086|(3:1088|(3:1090|(1:1092)(1:1095)|1093)(2:1096|(3:1098|(1:1110)(1:1102)|1103)(3:1111|(1:1119)(1:1117)|1118))|1094)(1:1120)))))|1121)|996|(2:998|(2:1000|(3:1002|1003|(1:1005)(2:1006|(5:1008|(3:1010|(1:1012)|1013)(2:1022|(5:1024|(1:1026)|1027|(1:1029)(1:1031)|1030)(4:1032|(1:1040)(2:1036|(1:1038)(1:1039))|(1:1019)|1020))|1021|(2:1017|1019)|1020)(5:1041|(4:1043|(1:1045)(2:1046|(1:1048)(2:1049|(2:1063|(4:1065|(1:1067)|1068|(1:1070)(1:1071))(1:1072))(2:1053|(1:1055)(2:1056|(1:1058)(3:1059|(1:1061)|1062)))))|(0)|1020)|1015|(0)|1020)))(2:1073|(4:1075|(1:1077)|1078|(1:1080)))))(1:1082)|1081|1003|(0)(0))|973|974|(1:976)|1149|1150|(1:1152)|1158|1157|996|(0)(0)|1081|1003|(0)(0)))|921|922|923|(0)(0)|949|(10:951|953|955|957|959|961|963|965|(2:967|969)|970)|971|(0)|973|974|(0)|1149|1150|(0)|1158|1157|996|(0)(0)|1081|1003|(0)(0)))|890|891|(2:893|895)|896|(0)(0)|909|(27:911|913|(0)|1710|(2:1712|1714)|1716|1718|1722|923|(0)(0)|949|(0)|971|(0)|973|974|(0)|1149|1150|(0)|1158|1157|996|(0)(0)|1081|1003|(0)(0))|1732|913|(0)|1710|(0)|1716|1718|1722|923|(0)(0)|949|(0)|971|(0)|973|974|(0)|1149|1150|(0)|1158|1157|996|(0)(0)|1081|1003|(0)(0))|(2:84|(1:86)(1:823))(1:824)|87|(3:89|(1:91)(1:821)|92)(1:822)|93|(1:95)(1:820)|96|(3:98|(1:100)|101)|102|(2:104|(1:106)(1:807))(2:808|(2:810|(2:812|(1:814)(1:815))(2:816|(1:818)(1:819))))|107|108|(2:777|(2:804|(1:806))(2:781|(2:783|(1:785))(2:786|(2:788|(1:790))(2:791|(4:793|(1:795)(1:799)|796|(1:798))))))(2:112|(1:114))|115|(1:117)|118|(2:120|(1:122))|123|124|125|(1:127)|128|(1:130)|131|(3:133|(1:135)(1:766)|136)(2:767|(3:769|(1:771)(1:773)|772))|137|138|(1:140)(1:765)|141|(1:143)|144|(1:764)(1:150)|151|(1:153)(1:763)|154|(1:762)(1:158)|159|160|(5:735|(1:737)(1:760)|738|(2:739|(5:741|(1:743)(1:757)|744|(2:755|756)(2:752|753)|754)(1:758))|759)(9:164|(1:166)(1:734)|167|(1:169)(1:733)|170|(1:172)(1:732)|173|(2:174|(5:176|(1:178)(1:192)|179|(2:190|191)(2:187|188)|189)(1:193))|194)|195|196|(1:198)(1:731)|199|(1:201)|202|(1:210)|211|(2:213|(1:215)(1:216))|217|(2:219|(1:221)(1:629))(1:(4:(4:669|(1:671)(1:727)|672|673)(1:728)|(6:675|(1:677)(1:725)|678|(3:680|(1:682)(1:719)|683)(3:720|(1:722)(1:724)|723)|684|685)(1:726)|686|(2:688|(4:690|(3:692|(1:694)(1:696)|695)|697|(3:699|(1:701)(1:703)|702))(5:704|(3:706|(1:708)(1:710)|709)|711|(3:713|(1:715)(1:717)|716)|718)))(2:634|(3:662|(2:664|(1:666))|667)(6:646|(1:661)(3:650|(1:652)(1:660)|653)|654|(1:656)(1:659)|657|658)))|(7:(1:224)|225|(1:227)|228|(1:241)(1:232)|233|(1:237))|242|(1:628)(1:246)|247|(3:253|(1:255)(1:257)|256)|258|(4:260|(1:573)|264|(2:265|(1:267)(1:268)))(2:574|(8:602|603|(1:609)|610|611|(1:621)(1:615)|616|(2:617|(1:619)(1:620)))(3:578|579|(4:584|(1:594)(1:588)|589|(2:590|(1:592)(1:593)))(1:583)))|269|270|(1:272)|273|274|275|(1:277)(1:571)|278|279|(3:280|281|(5:283|(3:285|(1:287)|288)|289|(1:291)|288))|292|293|(4:537|538|(5:540|(2:542|(4:544|(2:546|(1:548))|549|(2:551|(2:553|(4:555|(1:559)|560|561)))))|562|560|561)|563)|295|(3:525|526|(30:528|529|(19:531|532|313|(1:514)(1:317)|318|319|(5:505|(1:508)|509|(1:511)(1:513)|512)(3:323|(2:325|(1:329))|330)|331|332|333|334|335|336|337|(10:339|(8:343|(1:345)|346|(1:348)|349|(1:376)(2:353|(1:355)(2:361|(1:363)(2:364|(3:366|(1:368)(1:370)|369)(1:371))))|356|(2:358|(1:360)))|377|(3:381|(1:(2:383|(1:385)(2:386|387))(2:390|391))|(1:389))|392|(1:442)(3:396|(1:(2:398|(1:400)(2:401|402))(2:440|441))|(1:404))|405|(2:411|(1:413))|414|(4:418|(1:420)|421|422))(10:443|(7:447|(1:449)|450|(4:452|(1:454)|455|(1:457))|458|(1:460)|461)|462|(4:466|(1:468)|469|470)|471|(4:475|(1:477)|478|479)|480|(4:484|(1:486)|487|488)|489|(1:493))|423|(3:(1:437)(1:432)|433|(1:435)(1:436))|438|439)|300|(3:304|(1:515)(1:310)|311)|312|313|(1:315)|514|318|319|(1:321)|503|505|(1:508)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(6:425|427|(1:430)|437|433|(0)(0))|438|439))|299|300|(30:302|304|(1:306)|515|311|312|313|(0)|514|318|319|(0)|503|505|(0)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(0)|438|439)|516|304|(0)|515|311|312|313|(0)|514|318|319|(0)|503|505|(0)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(0)|438|439) */
    /* JADX WARN: Can't wrap try/catch for region: R(126:14|(1:1844)(1:18)|19|(2:1842|1843)(1:25)|26|(1:1841)(1:30)|31|(1:33)|34|(1:1840)(1:38)|39|(1:41)|42|(1:44)(1:1833)|45|(7:47|(1:49)|50|51|(1:53)|54|55)|56|(1:58)(1:1832)|59|(9:61|(2:63|(2:845|(1:847)(1:848))(2:67|(1:69)(1:844)))(4:849|(1:866)(1:853)|854|(2:862|(1:864)(1:865))(2:858|(1:860)(1:861)))|70|(3:72|(1:74)(4:831|(1:833)|834|(1:839)(1:838))|75)(3:840|(1:842)|843)|76|(1:78)(1:830)|79|(1:81)(1:(1:826)(1:(1:828)(1:829)))|82)(38:867|(2:1828|(1:1830)(1:1831))(2:871|(1:873)(1:1827))|874|(2:876|(2:878|(2:886|(1:888)(1:889))(2:882|(1:884)(1:885))))(2:1754|(31:1756|(4:1758|(1:1760)(2:1768|(1:1770)(3:1771|(1:1773)(5:1774|(1:1786)(1:1778)|1779|(1:1785)(1:1783)|1784)|1762))|1761|1762)(2:1787|(8:1789|(1:1791)(2:1808|(1:1810)(5:1811|(1:1825)(1:1815)|1816|(1:1824)(1:1822)|1823))|1792|(2:1794|(4:1798|1799|(2:1801|(1:1803)(1:1805))(1:1806)|1804))|1807|1799|(0)(0)|1804)(1:1826))|1763|(1:1767)|891|(1:895)|896|(6:898|(1:900)(1:1739)|901|(1:903)(1:1738)|904|(1:908))(2:1740|(5:1745|(1:1747)(1:1753)|1748|(1:1750)(1:1752)|1751)(1:1744))|909|(4:913|(2:915|(2:917|(2:919|(1:1708))))|1710|(20:1722|923|(11:925|(1:927)(1:1170)|928|(4:930|(1:932)|933|(1:935))|936|(1:938)(1:1169)|939|(1:941)(1:1168)|942|(2:944|(1:947))|948)(2:1171|(1:1173)(3:(6:1175|(1:1177)(1:1706)|1178|(1:1180)(1:1705)|(1:1182)(1:1704)|1183)(1:1707)|1184|(5:1658|1659|(7:1672|(1:1674)(2:1698|(2:1700|(1:1702))(1:1703))|1675|(2:1677|(3:1681|(1:1683)(1:1685)|1684))(2:1695|(1:1697))|1686|(1:1694)(1:1690)|1691)(2:1663|(2:1671|1216)(1:1667))|1668|1192)(4:1188|(1:1190)(2:1193|(2:1195|(1:1197)(4:1198|(2:1200|(1:1202)(2:1203|(1:1205)(2:1206|(1:1208)(2:1209|(2:1211|(1:1213)(1:1214))))))(2:1217|(3:1221|(1:1227)(1:1225)|1226))|1215|1216))(11:1228|(1:1230)(1:1657)|1231|(2:1245|(8:1247|(8:1251|(1:1253)(3:1650|(1:1652)(1:1654)|1653)|1254|(1:1256)(5:1263|(4:1265|(4:1267|(2:1269|(2:1271|(1:1273)(2:1277|(1:1279)(1:1280))))|1281|(1:1283)(2:1284|(1:1286)(2:1287|(1:1289)(1:1290))))(1:1291)|1274|1275)(2:1292|(5:1303|(5:1310|(20:1330|(1:1649)(1:1338)|1339|(4:1409|(2:1411|(4:(1:1414)|1416|(1:1418)|1420))|1422|(8:1430|(2:1432|(5:1434|(1:1446)|1440|1441|(2:1443|(1:1445)))(2:1447|(4:1454|(2:1456|(2:1461|(1:1463)(2:1464|(1:1466)(1:1467))))|1468|(4:1470|(1:1472)(2:1496|(1:1498)(2:1499|(1:1501)(2:1502|(1:1504)(2:1505|(1:1507)(1:1508)))))|1473|(3:1488|(3:1490|(1:1492)(1:1494)|1493)|1495)(4:1477|(2:1479|(1:1481)(1:1482))|(1:1486)|1487))(2:1509|(3:1511|(1:(1:1514)(1:1516))(2:1517|(1:1519)(1:1520))|1515)(2:1521|(3:1523|(3:1525|(1:1527)(1:1530)|1528)(3:1531|(1:1533)(1:1535)|1534)|1529)(5:1536|(5:1538|(2:1540|(3:1542|(1:1544)(1:1552)|1545))|1553|(0)(0)|1545)(2:1554|(1:1556)(2:1557|(2:1559|(1:1564)(1:1563))(2:1565|(2:1567|(1:1572)(1:1571))(2:1573|(1:1575)(2:1576|(1:1578)(2:1579|(1:1581)(2:1582|(3:1596|(4:1604|(1:1606)|1607|(2:1609|(3:1611|(1:1613)(1:1615)|1614)))(2:1600|(1:1602))|1603)(2:1586|(3:1588|(2:1590|(1:1592))(1:1594)|1593)(1:1595)))))))))|1546|1547|(2:1549|(1:1551))))))(1:1453)))|1616|(1:1618)(1:1648)|1619|(7:1621|(3:1638|(1:1640)|1641)(2:1625|(1:1627))|1628|(1:1630)(1:1637)|1631|(2:1633|(1:1635))|1636)|1642|(1:1647)(1:1646)))|1349|(1:1351)|1352|(2:1360|(13:1362|(1:1406)(1:1366)|1367|1368|1369|(1:1405)(5:1375|1376|1377|1378|1379)|1380|(1:1384)|1385|(4:1387|(1:1389)|1390|(1:1392)(1:1393))|1394|1259|(1:1261)(1:1262)))|1407|1368|1369|(2:1371|1401)|1405|1380|(2:1382|1384)|1385|(0)|1394|1259|(0)(0))(4:1316|(2:1326|(1:1328)(1:1329))(1:1320)|1321|(1:1323)(1:1325))|1324|1259|(0)(0))(1:1309)|1258|1259|(0)(0))(3:1296|(1:1302)(1:1300)|1301))|1276|1259|(0)(0))|1257|1258|1259|(0)(0))|1655|(0)(0)|1257|1258|1259|(0)(0)))|1656|1655|(0)(0)|1257|1258|1259|(0)(0)))|1191|1192)))|949|(3:965|(1:969)|970)|971|(9:1159|(1:1161)(2:1162|(1:1164)(2:1165|(1:1167)))|974|(4:1149|1150|(1:1158)(1:1156)|1157)(5:978|(4:980|(1:(1:983)(2:1122|985))(1:1123)|984|985)(7:1124|(1:1126)(2:1136|(3:1144|1145|(1:1147)(1:1148))(1:1143))|1127|(1:1129)(1:1135)|1130|(1:1132)(1:1134)|1133)|986|(2:991|(2:993|(1:995)(2:1083|(1:1085)(2:1086|(3:1088|(3:1090|(1:1092)(1:1095)|1093)(2:1096|(3:1098|(1:1110)(1:1102)|1103)(3:1111|(1:1119)(1:1117)|1118))|1094)(1:1120)))))|1121)|996|(2:998|(2:1000|(3:1002|1003|(1:1005)(2:1006|(5:1008|(3:1010|(1:1012)|1013)(2:1022|(5:1024|(1:1026)|1027|(1:1029)(1:1031)|1030)(4:1032|(1:1040)(2:1036|(1:1038)(1:1039))|(1:1019)|1020))|1021|(2:1017|1019)|1020)(5:1041|(4:1043|(1:1045)(2:1046|(1:1048)(2:1049|(2:1063|(4:1065|(1:1067)|1068|(1:1070)(1:1071))(1:1072))(2:1053|(1:1055)(2:1056|(1:1058)(3:1059|(1:1061)|1062)))))|(0)|1020)|1015|(0)|1020)))(2:1073|(4:1075|(1:1077)|1078|(1:1080)))))(1:1082)|1081|1003|(0)(0))|973|974|(1:976)|1149|1150|(1:1152)|1158|1157|996|(0)(0)|1081|1003|(0)(0)))|921|922|923|(0)(0)|949|(10:951|953|955|957|959|961|963|965|(2:967|969)|970)|971|(0)|973|974|(0)|1149|1150|(0)|1158|1157|996|(0)(0)|1081|1003|(0)(0)))|890|891|(2:893|895)|896|(0)(0)|909|(27:911|913|(0)|1710|(2:1712|1714)|1716|1718|1722|923|(0)(0)|949|(0)|971|(0)|973|974|(0)|1149|1150|(0)|1158|1157|996|(0)(0)|1081|1003|(0)(0))|1732|913|(0)|1710|(0)|1716|1718|1722|923|(0)(0)|949|(0)|971|(0)|973|974|(0)|1149|1150|(0)|1158|1157|996|(0)(0)|1081|1003|(0)(0))|(2:84|(1:86)(1:823))(1:824)|87|(3:89|(1:91)(1:821)|92)(1:822)|93|(1:95)(1:820)|96|(3:98|(1:100)|101)|102|(2:104|(1:106)(1:807))(2:808|(2:810|(2:812|(1:814)(1:815))(2:816|(1:818)(1:819))))|107|108|(2:777|(2:804|(1:806))(2:781|(2:783|(1:785))(2:786|(2:788|(1:790))(2:791|(4:793|(1:795)(1:799)|796|(1:798))))))(2:112|(1:114))|115|(1:117)|118|(2:120|(1:122))|123|124|125|(1:127)|128|(1:130)|131|(3:133|(1:135)(1:766)|136)(2:767|(3:769|(1:771)(1:773)|772))|137|138|(1:140)(1:765)|141|(1:143)|144|(1:764)(1:150)|151|(1:153)(1:763)|154|(1:762)(1:158)|159|160|(5:735|(1:737)(1:760)|738|(2:739|(5:741|(1:743)(1:757)|744|(2:755|756)(2:752|753)|754)(1:758))|759)(9:164|(1:166)(1:734)|167|(1:169)(1:733)|170|(1:172)(1:732)|173|(2:174|(5:176|(1:178)(1:192)|179|(2:190|191)(2:187|188)|189)(1:193))|194)|195|196|(1:198)(1:731)|199|(1:201)|202|(1:210)|211|(2:213|(1:215)(1:216))|217|(2:219|(1:221)(1:629))(1:(4:(4:669|(1:671)(1:727)|672|673)(1:728)|(6:675|(1:677)(1:725)|678|(3:680|(1:682)(1:719)|683)(3:720|(1:722)(1:724)|723)|684|685)(1:726)|686|(2:688|(4:690|(3:692|(1:694)(1:696)|695)|697|(3:699|(1:701)(1:703)|702))(5:704|(3:706|(1:708)(1:710)|709)|711|(3:713|(1:715)(1:717)|716)|718)))(2:634|(3:662|(2:664|(1:666))|667)(6:646|(1:661)(3:650|(1:652)(1:660)|653)|654|(1:656)(1:659)|657|658)))|(7:(1:224)|225|(1:227)|228|(1:241)(1:232)|233|(1:237))|242|(1:628)(1:246)|247|(3:253|(1:255)(1:257)|256)|258|(4:260|(1:573)|264|(2:265|(1:267)(1:268)))(2:574|(8:602|603|(1:609)|610|611|(1:621)(1:615)|616|(2:617|(1:619)(1:620)))(3:578|579|(4:584|(1:594)(1:588)|589|(2:590|(1:592)(1:593)))(1:583)))|269|270|(1:272)|273|274|275|(1:277)(1:571)|278|279|280|281|(5:283|(3:285|(1:287)|288)|289|(1:291)|288)|292|293|(4:537|538|(5:540|(2:542|(4:544|(2:546|(1:548))|549|(2:551|(2:553|(4:555|(1:559)|560|561)))))|562|560|561)|563)|295|(3:525|526|(30:528|529|(19:531|532|313|(1:514)(1:317)|318|319|(5:505|(1:508)|509|(1:511)(1:513)|512)(3:323|(2:325|(1:329))|330)|331|332|333|334|335|336|337|(10:339|(8:343|(1:345)|346|(1:348)|349|(1:376)(2:353|(1:355)(2:361|(1:363)(2:364|(3:366|(1:368)(1:370)|369)(1:371))))|356|(2:358|(1:360)))|377|(3:381|(1:(2:383|(1:385)(2:386|387))(2:390|391))|(1:389))|392|(1:442)(3:396|(1:(2:398|(1:400)(2:401|402))(2:440|441))|(1:404))|405|(2:411|(1:413))|414|(4:418|(1:420)|421|422))(10:443|(7:447|(1:449)|450|(4:452|(1:454)|455|(1:457))|458|(1:460)|461)|462|(4:466|(1:468)|469|470)|471|(4:475|(1:477)|478|479)|480|(4:484|(1:486)|487|488)|489|(1:493))|423|(3:(1:437)(1:432)|433|(1:435)(1:436))|438|439)|300|(3:304|(1:515)(1:310)|311)|312|313|(1:315)|514|318|319|(1:321)|503|505|(1:508)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(6:425|427|(1:430)|437|433|(0)(0))|438|439))|299|300|(30:302|304|(1:306)|515|311|312|313|(0)|514|318|319|(0)|503|505|(0)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(0)|438|439)|516|304|(0)|515|311|312|313|(0)|514|318|319|(0)|503|505|(0)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(0)|438|439) */
    /* JADX WARN: Can't wrap try/catch for region: R(159:1396|1397|1380|(0)|1385|(0)|1394|1259|(0)(0)|949|(0)|971|(0)|973|974|(0)|1149|1150|(0)|1158|1157|996|(0)(0)|1081|1003|(0)(0)|(0)(0)|87|(0)(0)|93|(0)(0)|96|(0)|102|(0)(0)|107|108|(1:110)|777|(1:779)|800|802|804|(0)|115|(0)|118|(0)|123|124|125|(0)|128|(0)|131|(0)(0)|137|138|(0)(0)|141|(0)|144|(1:146)|764|151|(0)(0)|154|(1:156)|762|159|160|(1:162)|735|(0)(0)|738|(3:739|(0)(0)|754)|759|195|196|(0)(0)|199|(0)|202|(75:204|206|208|210|211|(0)|217|(0)(0)|(0)|242|(1:244)|628|247|(61:249|251|253|(0)(0)|256|258|(0)(0)|269|270|(0)|273|274|275|(0)(0)|278|279|280|281|(0)|292|293|(0)|295|(1:297)|523|525|526|(0)|299|300|(0)|516|304|(0)|515|311|312|313|(0)|514|318|319|(0)|503|505|(0)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(0)|438|439)|626|251|253|(0)(0)|256|258|(0)(0)|269|270|(0)|273|274|275|(0)(0)|278|279|280|281|(0)|292|293|(0)|295|(0)|523|525|526|(0)|299|300|(0)|516|304|(0)|515|311|312|313|(0)|514|318|319|(0)|503|505|(0)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(0)|438|439)|729|206|208|210|211|(0)|217|(0)(0)|(0)|242|(0)|628|247|(0)|626|251|253|(0)(0)|256|258|(0)(0)|269|270|(0)|273|274|275|(0)(0)|278|279|280|281|(0)|292|293|(0)|295|(0)|523|525|526|(0)|299|300|(0)|516|304|(0)|515|311|312|313|(0)|514|318|319|(0)|503|505|(0)|509|(0)(0)|512|331|332|333|334|335|336|337|(0)(0)|423|(0)|438|439) */
    /* JADX WARN: Code restructure failed: missing block: B:1014:0x156b, code lost:
    
        if (r6 == null) goto L1060;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1415:0x0b1f, code lost:
    
        if (r37.id != r8) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1419:0x0b2d, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r50.chat) != false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1421:0x0b35, code lost:
    
        if (org.telegram.ui.Components.Forum.ForumUtilities.isTopicCreateMessage(r50.message) == false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1709:0x0680, code lost:
    
        if (r0.post_messages == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x23e1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x23e2, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x23e3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x23e5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x23e6, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x22b9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x152e  */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x153d  */
    /* JADX WARN: Removed duplicated region for block: B:1017:0x169e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x1782  */
    /* JADX WARN: Removed duplicated region for block: B:1082:0x1528  */
    /* JADX WARN: Removed duplicated region for block: B:1152:0x14a6  */
    /* JADX WARN: Removed duplicated region for block: B:1159:0x1323  */
    /* JADX WARN: Removed duplicated region for block: B:1171:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x18f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x1906  */
    /* JADX WARN: Removed duplicated region for block: B:1256:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:1261:0x11b5  */
    /* JADX WARN: Removed duplicated region for block: B:1262:0x11c4  */
    /* JADX WARN: Removed duplicated region for block: B:1263:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x1920  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x1925 A[Catch: Exception -> 0x1930, TryCatch #0 {Exception -> 0x1930, blocks: (B:125:0x1916, B:128:0x1921, B:130:0x1925, B:131:0x1933, B:133:0x1937, B:136:0x1951, B:138:0x1981, B:141:0x1997, B:143:0x199d, B:144:0x19a9, B:146:0x19bc, B:148:0x19c2, B:151:0x19d3, B:153:0x19d7, B:154:0x1a15, B:156:0x1a19, B:158:0x1a22, B:159:0x1a2a, B:763:0x19f8, B:767:0x1960, B:769:0x1964, B:772:0x197e), top: B:124:0x1916 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x1937 A[Catch: Exception -> 0x1930, TryCatch #0 {Exception -> 0x1930, blocks: (B:125:0x1916, B:128:0x1921, B:130:0x1925, B:131:0x1933, B:133:0x1937, B:136:0x1951, B:138:0x1981, B:141:0x1997, B:143:0x199d, B:144:0x19a9, B:146:0x19bc, B:148:0x19c2, B:151:0x19d3, B:153:0x19d7, B:154:0x1a15, B:156:0x1a19, B:158:0x1a22, B:159:0x1a2a, B:763:0x19f8, B:767:0x1960, B:769:0x1964, B:772:0x197e), top: B:124:0x1916 }] */
    /* JADX WARN: Removed duplicated region for block: B:1382:0x1148  */
    /* JADX WARN: Removed duplicated region for block: B:1387:0x1159  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1994  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x199d A[Catch: Exception -> 0x1930, TryCatch #0 {Exception -> 0x1930, blocks: (B:125:0x1916, B:128:0x1921, B:130:0x1925, B:131:0x1933, B:133:0x1937, B:136:0x1951, B:138:0x1981, B:141:0x1997, B:143:0x199d, B:144:0x19a9, B:146:0x19bc, B:148:0x19c2, B:151:0x19d3, B:153:0x19d7, B:154:0x1a15, B:156:0x1a19, B:158:0x1a22, B:159:0x1a2a, B:763:0x19f8, B:767:0x1960, B:769:0x1964, B:772:0x197e), top: B:124:0x1916 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x19d7 A[Catch: Exception -> 0x1930, TryCatch #0 {Exception -> 0x1930, blocks: (B:125:0x1916, B:128:0x1921, B:130:0x1925, B:131:0x1933, B:133:0x1937, B:136:0x1951, B:138:0x1981, B:141:0x1997, B:143:0x199d, B:144:0x19a9, B:146:0x19bc, B:148:0x19c2, B:151:0x19d3, B:153:0x19d7, B:154:0x1a15, B:156:0x1a19, B:158:0x1a22, B:159:0x1a2a, B:763:0x19f8, B:767:0x1960, B:769:0x1964, B:772:0x197e), top: B:124:0x1916 }] */
    /* JADX WARN: Removed duplicated region for block: B:1544:0x0d77  */
    /* JADX WARN: Removed duplicated region for block: B:1552:0x0d7a  */
    /* JADX WARN: Removed duplicated region for block: B:1712:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:1740:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:1801:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:1806:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x1c83  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x1caf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1cec  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1d11  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1fd1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x2026  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x203a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x2052  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x2055  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x2064  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x2152  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x2175 A[Catch: Exception -> 0x21c6, TryCatch #7 {Exception -> 0x21c6, blocks: (B:275:0x216d, B:277:0x2175, B:571:0x21c3), top: B:274:0x216d }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x21dc A[Catch: Exception -> 0x21e5, TryCatch #9 {Exception -> 0x21e5, blocks: (B:281:0x21d6, B:283:0x21dc, B:285:0x21e0, B:288:0x2213, B:289:0x21e7, B:291:0x21ed), top: B:280:0x21d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x2296 A[Catch: Exception -> 0x226a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x226a, blocks: (B:538:0x2243, B:540:0x2255, B:542:0x225b, B:544:0x225f, B:546:0x2265, B:549:0x226f, B:551:0x2273, B:553:0x2277, B:555:0x227b, B:557:0x227f, B:562:0x228c, B:297:0x2296, B:302:0x22c0, B:306:0x22e8, B:308:0x22ec, B:310:0x22ff, B:315:0x232f, B:317:0x2333, B:321:0x233f, B:325:0x2384, B:327:0x2396, B:329:0x239c, B:505:0x2349, B:508:0x234f, B:509:0x2356, B:512:0x2368, B:519:0x22cc, B:521:0x22d4, B:531:0x22ac), top: B:537:0x2243 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x22c0 A[Catch: Exception -> 0x226a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x226a, blocks: (B:538:0x2243, B:540:0x2255, B:542:0x225b, B:544:0x225f, B:546:0x2265, B:549:0x226f, B:551:0x2273, B:553:0x2277, B:555:0x227b, B:557:0x227f, B:562:0x228c, B:297:0x2296, B:302:0x22c0, B:306:0x22e8, B:308:0x22ec, B:310:0x22ff, B:315:0x232f, B:317:0x2333, B:321:0x233f, B:325:0x2384, B:327:0x2396, B:329:0x239c, B:505:0x2349, B:508:0x234f, B:509:0x2356, B:512:0x2368, B:519:0x22cc, B:521:0x22d4, B:531:0x22ac), top: B:537:0x2243 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x22e8 A[Catch: Exception -> 0x226a, TRY_ENTER, TryCatch #3 {Exception -> 0x226a, blocks: (B:538:0x2243, B:540:0x2255, B:542:0x225b, B:544:0x225f, B:546:0x2265, B:549:0x226f, B:551:0x2273, B:553:0x2277, B:555:0x227b, B:557:0x227f, B:562:0x228c, B:297:0x2296, B:302:0x22c0, B:306:0x22e8, B:308:0x22ec, B:310:0x22ff, B:315:0x232f, B:317:0x2333, B:321:0x233f, B:325:0x2384, B:327:0x2396, B:329:0x239c, B:505:0x2349, B:508:0x234f, B:509:0x2356, B:512:0x2368, B:519:0x22cc, B:521:0x22d4, B:531:0x22ac), top: B:537:0x2243 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x232f A[Catch: Exception -> 0x226a, TRY_ENTER, TryCatch #3 {Exception -> 0x226a, blocks: (B:538:0x2243, B:540:0x2255, B:542:0x225b, B:544:0x225f, B:546:0x2265, B:549:0x226f, B:551:0x2273, B:553:0x2277, B:555:0x227b, B:557:0x227f, B:562:0x228c, B:297:0x2296, B:302:0x22c0, B:306:0x22e8, B:308:0x22ec, B:310:0x22ff, B:315:0x232f, B:317:0x2333, B:321:0x233f, B:325:0x2384, B:327:0x2396, B:329:0x239c, B:505:0x2349, B:508:0x234f, B:509:0x2356, B:512:0x2368, B:519:0x22cc, B:521:0x22d4, B:531:0x22ac), top: B:537:0x2243 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x233f A[Catch: Exception -> 0x226a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x226a, blocks: (B:538:0x2243, B:540:0x2255, B:542:0x225b, B:544:0x225f, B:546:0x2265, B:549:0x226f, B:551:0x2273, B:553:0x2277, B:555:0x227b, B:557:0x227f, B:562:0x228c, B:297:0x2296, B:302:0x22c0, B:306:0x22e8, B:308:0x22ec, B:310:0x22ff, B:315:0x232f, B:317:0x2333, B:321:0x233f, B:325:0x2384, B:327:0x2396, B:329:0x239c, B:505:0x2349, B:508:0x234f, B:509:0x2356, B:512:0x2368, B:519:0x22cc, B:521:0x22d4, B:531:0x22ac), top: B:537:0x2243 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x2404  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x26bd  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x26f9  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x2701  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x25d4  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x234d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x2363  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x2366  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x22a7 A[Catch: Exception -> 0x22b9, TRY_LEAVE, TryCatch #4 {Exception -> 0x22b9, blocks: (B:526:0x22a3, B:528:0x22a7), top: B:525:0x22a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x2243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x21c3 A[Catch: Exception -> 0x21c6, TRY_LEAVE, TryCatch #7 {Exception -> 0x21c6, blocks: (B:275:0x216d, B:277:0x2175, B:571:0x21c3), top: B:274:0x216d }] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x2085  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x1d49  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x1c9a  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x1bbf  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x1c24  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x1c79 A[EDGE_INSN: B:758:0x1c79->B:759:0x1c79 BREAK  A[LOOP:13: B:739:0x1c1f->B:754:0x1c62], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:760:0x1be2  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x19f8 A[Catch: Exception -> 0x1930, TryCatch #0 {Exception -> 0x1930, blocks: (B:125:0x1916, B:128:0x1921, B:130:0x1925, B:131:0x1933, B:133:0x1937, B:136:0x1951, B:138:0x1981, B:141:0x1997, B:143:0x199d, B:144:0x19a9, B:146:0x19bc, B:148:0x19c2, B:151:0x19d3, B:153:0x19d7, B:154:0x1a15, B:156:0x1a19, B:158:0x1a22, B:159:0x1a2a, B:763:0x19f8, B:767:0x1960, B:769:0x1964, B:772:0x197e), top: B:124:0x1916 }] */
    /* JADX WARN: Removed duplicated region for block: B:765:0x1996  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x1960 A[Catch: Exception -> 0x1930, TryCatch #0 {Exception -> 0x1930, blocks: (B:125:0x1916, B:128:0x1921, B:130:0x1925, B:131:0x1933, B:133:0x1937, B:136:0x1951, B:138:0x1981, B:141:0x1997, B:143:0x199d, B:144:0x19a9, B:146:0x19bc, B:148:0x19c2, B:151:0x19d3, B:153:0x19d7, B:154:0x1a15, B:156:0x1a19, B:158:0x1a22, B:159:0x1a2a, B:763:0x19f8, B:767:0x1960, B:769:0x1964, B:772:0x197e), top: B:124:0x1916 }] */
    /* JADX WARN: Removed duplicated region for block: B:806:0x1884  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x17af  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x1749  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x172f  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x16f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x16b7  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x16ff  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:925:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x12a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x1736  */
    /* JADX WARN: Removed duplicated region for block: B:976:0x134a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x1766  */
    /* JADX WARN: Removed duplicated region for block: B:998:0x14d8  */
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
        boolean z2;
        long j;
        boolean z3;
        int i2;
        CharSequence charSequence3;
        boolean z4;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.InputReplyTo inputReplyTo;
        TLRPC.DraftMessage draftMessage3;
        boolean z5;
        CharSequence charSequence4;
        boolean z6;
        int i3;
        boolean z7;
        CharSequence charSequence5;
        CharSequence string;
        String str3;
        boolean z8;
        ArrayList<TLRPC.MessageEntity> arrayList;
        CharSequence charSequence6;
        boolean z9;
        boolean z10;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        CharSequence charSequence11;
        boolean z11;
        CharSequence charSequence12;
        boolean z12;
        CharSequence charSequence13;
        CharSequence replaceNewLines;
        CharSequence charSequence14;
        char c;
        String str4;
        CharSequence charSequence15;
        boolean isChannelAndNotMegaGroup;
        CharSequence formatPluralString;
        int size;
        int i4;
        char c2;
        String formatPluralString2;
        String str5;
        MessageObject messageObject;
        CharSequence charSequence16;
        int i5;
        CharSequence highlightText;
        Object foregroundColorSpanThemable;
        TLRPC.User user;
        MessageObject messageObject2;
        TLRPC.User user2;
        CharSequence charSequence17;
        CharSequence charSequence18;
        CharSequence charSequence19;
        CharSequence string2;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence charSequence20;
        String stringForMessageListDate;
        MessageObject messageObject3;
        boolean z13;
        String str6;
        String str7;
        String str8;
        String str9;
        CharSequence charSequence21;
        CharSequence escape;
        CharSequence charSequence22;
        CharSequence charSequence23;
        String str10;
        CharSequence charSequence24;
        boolean z14;
        CharSequence topicSpannedName;
        boolean z15;
        String str11;
        boolean z16;
        MessageObject messageObject4;
        TLRPC.Message message;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Chat chat3;
        MessageObject messageObject5;
        int i6;
        float f;
        int i7;
        int i8;
        int dp;
        int dp2;
        int dp3;
        int i9;
        int i10;
        ImageReceiver[] imageReceiverArr;
        int i11;
        DialogCellTags dialogCellTags;
        int dp4;
        CharSequence highlightText2;
        int i12;
        int i13;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i14;
        int lineCount4;
        int lineCount5;
        int i15;
        int lineCount6;
        int i16;
        CharSequence charSequence25;
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
        CharSequence charSequence26;
        SpannableStringBuilder formatInternal;
        if (this.isTransitionSupport) {
            return;
        }
        if (this.isDialogCell && !this.updateHelper.update() && this.currentDialogFolderId == 0 && this.encryptedChat == null) {
            return;
        }
        if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
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
        } else {
            Theme.dialogs_namePaint[0].setTextSize(AndroidUtilities.dp(17.0f));
            Theme.dialogs_nameEncryptedPaint[0].setTextSize(AndroidUtilities.dp(17.0f));
            Theme.dialogs_messagePaint[0].setTextSize(AndroidUtilities.dp(16.0f));
            Theme.dialogs_messagePrintingPaint[0].setTextSize(AndroidUtilities.dp(16.0f));
            TextPaint textPaint2 = Theme.dialogs_messagePaint[0];
            int color2 = Theme.getColor(Theme.key_chats_message, this.resourcesProvider);
            textPaint2.linkColor = color2;
            textPaint2.setColor(color2);
            this.paintIndex = 0;
            this.thumbSize = 19;
        }
        this.currentDialogFolderDialogsCount = 0;
        if (isForumCell() || (!this.isDialogCell && !this.isTopic)) {
            charSequence = "d ";
            str = "**reaction**";
            charSequence2 = null;
        } else {
            charSequence = "d ";
            str = "**reaction**";
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
        CharSequence charSequence27 = messageObject7 != null ? messageObject7.messageText : null;
        if (charSequence27 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence27);
            for (URLSpanNoUnderlineBold uRLSpanNoUnderlineBold : (URLSpanNoUnderlineBold[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderlineBold.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderlineBold);
            }
            for (URLSpanNoUnderline uRLSpanNoUnderline : (URLSpanNoUnderline[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderline.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderline);
            }
            charSequence27 = spannableStringBuilder;
        }
        this.lastMessageString = charSequence27;
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
                charSequence26 = LocaleController.getString(R.string.FromYou);
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
                        formatInternal = formatInternal(i, str12, charSequence26);
                    } else {
                        formatInternal = formatInternal(i, str12.replace('\n', ' '), charSequence26);
                    }
                }
                charSequence9 = Emoji.replaceEmoji(formatInternal, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                z14 = false;
            } else {
                charSequence9 = customDialog2.message;
                if (customDialog2.isMedia) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                }
                charSequence26 = null;
                z14 = true;
            }
            String stringForMessageListDate2 = LocaleController.stringForMessageListDate(this.customDialog.date);
            int i17 = this.customDialog.unread_count;
            if (i17 != 0) {
                this.drawCount = true;
                str6 = String.format("%d", Integer.valueOf(i17));
            } else {
                this.drawCount = false;
                str6 = null;
            }
            CustomDialog customDialog4 = this.customDialog;
            int i18 = customDialog4.sent;
            if (i18 == 0) {
                this.drawClock = true;
                this.drawCheck1 = false;
                this.drawCheck2 = false;
            } else if (i18 == 2) {
                this.drawCheck1 = true;
                this.drawCheck2 = true;
                this.drawClock = false;
            } else if (i18 == 1) {
                this.drawCheck1 = false;
                this.drawCheck2 = true;
                this.drawClock = false;
            } else {
                this.drawClock = false;
                this.drawCheck1 = false;
                this.drawCheck2 = false;
            }
            this.drawError = false;
            charSequence22 = charSequence26;
            str10 = stringForMessageListDate2;
            charSequence23 = customDialog4.name;
            charSequence24 = "";
            charSequence7 = null;
            i3 = -1;
            str8 = null;
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
            CharSequence charSequence28 = charSequence27;
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
                TLRPC.Chat chat4 = this.chat;
                if (chat4 != null) {
                    long botVerificationIcon = DialogObject.getBotVerificationIcon(chat4);
                    TLRPC.Chat chat5 = this.chat;
                    if (chat5.scam) {
                        this.drawScam = 1;
                        Theme.dialogs_scamDrawable.checkText();
                    } else if (chat5.fake) {
                        this.drawScam = 2;
                        Theme.dialogs_fakeDrawable.checkText();
                    } else {
                        if (DialogObject.getEmojiStatusDocumentId(chat5.emoji_status) != 0) {
                            this.drawPremium = true;
                            this.nameLayoutEllipsizeByGradient = true;
                            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatus;
                            swapAnimatedEmojiDrawable.center = LocaleController.isRTL;
                            str2 = "%d";
                            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), false);
                            this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), false);
                        } else {
                            str2 = "%d";
                            boolean z18 = this.forbidVerified;
                            this.drawVerified = !z18 && this.chat.verified;
                            this.drawBotVerified = (z18 || this.chat.bot_verification_icon == 0) ? false : true;
                        }
                        j = botVerificationIcon;
                        z2 = false;
                    }
                    str2 = "%d";
                    j = botVerificationIcon;
                    z2 = false;
                } else {
                    str2 = "%d";
                    TLRPC.User user3 = this.user;
                    if (user3 != null) {
                        long botVerificationIcon2 = DialogObject.getBotVerificationIcon(user3);
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
                            long j3 = this.user.id;
                            if (j2 != j3 && j3 != 0) {
                                z3 = true;
                                this.drawPremium = z3;
                                if (z3) {
                                    z2 = false;
                                } else {
                                    Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(this.user);
                                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiStatus;
                                    swapAnimatedEmojiDrawable2.center = LocaleController.isRTL;
                                    if (emojiStatusDocumentId != null) {
                                        this.nameLayoutEllipsizeByGradient = true;
                                        z2 = false;
                                        swapAnimatedEmojiDrawable2.set(emojiStatusDocumentId.longValue(), false);
                                        this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), false);
                                    } else {
                                        z2 = false;
                                        this.nameLayoutEllipsizeByGradient = true;
                                        swapAnimatedEmojiDrawable2.set(PremiumGradient.getInstance().premiumStarDrawableMini, false);
                                        this.emojiStatus.setParticles(false, false);
                                    }
                                }
                                j = botVerificationIcon2;
                            }
                        }
                        z3 = false;
                        this.drawPremium = z3;
                        if (z3) {
                        }
                        j = botVerificationIcon2;
                    } else {
                        z2 = false;
                        j = 0;
                    }
                }
                if (j != 0 && this.drawBotVerified) {
                    this.botVerification.set(j, z2);
                }
                i2 = this.lastMessageDate;
                if (i2 == 0 && (messageObject5 = this.message) != null) {
                    i2 = messageObject5.messageOwner.date;
                }
                if (!this.isTopic) {
                    charSequence3 = charSequence;
                    boolean z20 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                    this.draftVoice = z20;
                    TLRPC.DraftMessage draft = !z20 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, getTopicId()) : null;
                    this.draftMessage = draft;
                    if (draft != null && TextUtils.isEmpty(draft.message)) {
                        this.draftMessage = null;
                    }
                } else {
                    charSequence3 = charSequence;
                    if (this.isDialogCell || this.isSavedDialogCell) {
                        boolean z21 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                        this.draftVoice = z21;
                        this.draftMessage = !z21 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, 0L) : null;
                    } else {
                        this.draftVoice = false;
                        this.draftMessage = null;
                    }
                }
                z4 = this.draftVoice;
                if ((!z4 && this.draftMessage == null) || ((z4 || (draftMessage2 = this.draftMessage) == null || !TextUtils.isEmpty(draftMessage2.message) || ((inputReplyTo = this.draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0)) && ((draftMessage = this.draftMessage) == null || i2 <= draftMessage.date || this.unreadCount == 0))) {
                    if (ChatObject.isChannel(this.chat)) {
                        TLRPC.Chat chat6 = this.chat;
                        if (!chat6.megagroup) {
                            if (!chat6.creator) {
                                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat6.admin_rights;
                                if (tL_chatAdminRights != null) {
                                }
                            }
                        }
                    }
                    chat3 = this.chat;
                    if ((chat3 != null || (!chat3.left && !chat3.kicked)) && !this.forbidDraft && (!ChatObject.isForum(chat3) || this.isTopic)) {
                        z5 = false;
                        draftMessage3 = null;
                        if (!isForumCell()) {
                            this.draftMessage = draftMessage3;
                            this.draftVoice = z5;
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
                            charSequence9 = formatTopicsNames();
                            MessageObject messageObject8 = this.message;
                            String messageStringFormatted = this.message != null ? getMessageStringFormatted(i, messageObject8 != null ? MessagesController.getInstance(messageObject8.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason) : null, string, true) : "";
                            CharSequence charSequence29 = messageStringFormatted;
                            if (this.applyName) {
                                int length = messageStringFormatted.length();
                                charSequence29 = messageStringFormatted;
                                charSequence29 = messageStringFormatted;
                                if (length >= 0 && string != null) {
                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(messageStringFormatted);
                                    valueOf.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_name, this.resourcesProvider), 0, Math.min(valueOf.length(), string.length() + 1), 0);
                                    charSequence29 = valueOf;
                                }
                            }
                            this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                            charSequence7 = charSequence29;
                            z7 = z;
                            charSequence5 = charSequence3;
                            z9 = true;
                            i3 = -1;
                            z10 = z17;
                            charSequence8 = "";
                        } else if (!TextUtils.isEmpty(this.customMessage)) {
                            this.draftMessage = null;
                            this.draftVoice = false;
                            charSequence9 = this.customMessage;
                            this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                            z10 = z17;
                            z7 = z;
                            charSequence8 = "";
                            charSequence5 = charSequence3;
                            string = null;
                            z9 = true;
                            charSequence7 = null;
                            i3 = -1;
                        } else {
                            if (charSequence2 != null) {
                                this.lastPrintString = charSequence2;
                                int intValue = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.currentDialogId, getTopicId()).intValue();
                                this.printingStringType = intValue;
                                StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(intValue);
                                int dp8 = chatStatusDrawable != null ? AndroidUtilities.dp(3.0f) + chatStatusDrawable.getIntrinsicWidth() : 0;
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                CharSequence replace = TextUtils.replace(charSequence2, new String[]{"..."}, new String[]{""});
                                int indexOf = this.printingStringType == 5 ? replace.toString().indexOf("**oo**") : -1;
                                if (indexOf >= 0) {
                                    spannableStringBuilder2.append(replace).setSpan(new FixedWidthSpan(Theme.getChatStatusDrawable(this.printingStringType).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                } else {
                                    spannableStringBuilder2.append((CharSequence) " ").append(replace).setSpan(new FixedWidthSpan(dp8), 0, 1, 0);
                                }
                                charSequence4 = spannableStringBuilder2;
                                i3 = indexOf;
                                z6 = false;
                            } else {
                                this.lastPrintString = null;
                                this.printingStringType = -1;
                                charSequence4 = "";
                                z6 = true;
                                i3 = -1;
                            }
                            if (this.draftVoice || this.draftMessage != null) {
                                z7 = z;
                                charSequence5 = charSequence3;
                                string = LocaleController.getString(R.string.Draft);
                                TLRPC.DraftMessage draftMessage4 = this.draftMessage;
                                if (draftMessage4 != null && TextUtils.isEmpty(draftMessage4.message)) {
                                    if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                        z10 = z17;
                                        z9 = false;
                                        charSequence7 = null;
                                        charSequence8 = charSequence4;
                                        charSequence9 = "";
                                    } else {
                                        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                                        valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string.length(), 33);
                                        charSequence6 = valueOf2;
                                    }
                                } else {
                                    if (this.draftVoice) {
                                        str3 = LocaleController.getString(R.string.AttachAudio);
                                    } else {
                                        TLRPC.DraftMessage draftMessage5 = this.draftMessage;
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
                                    TLRPC.DraftMessage draftMessage6 = this.draftMessage;
                                    if (draftMessage6 != null) {
                                        MediaDataController.addTextStyleRuns(draftMessage6, spannableString, NotificationCenter.suggestedLangpack);
                                        TLRPC.DraftMessage draftMessage7 = this.draftMessage;
                                        if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                            TextPaint textPaint3 = this.currentMessagePaint;
                                            MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint3 == null ? null : textPaint3.getFontMetricsInt());
                                        }
                                    } else if (this.draftVoice) {
                                        spannableString.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, this.resourcesProvider), 0, spannableString.length(), 33);
                                    }
                                    SpannableStringBuilder formatInternal2 = formatInternal(i, AndroidUtilities.replaceNewLines(spannableString), string);
                                    if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                        formatInternal2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string.length() + 1, 33);
                                    }
                                    charSequence6 = Emoji.replaceEmoji(formatInternal2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), z8);
                                }
                                z9 = false;
                                charSequence10 = charSequence6;
                                charSequence7 = null;
                                boolean z22 = z17;
                                charSequence8 = charSequence4;
                                charSequence9 = charSequence10;
                                z10 = z22;
                            } else {
                                if (this.clearingDialog) {
                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                    charSequence20 = LocaleController.getString(R.string.HistoryCleared);
                                } else {
                                    MessageObject messageObject9 = this.message;
                                    if (messageObject9 == null) {
                                        if (this.currentDialogFolderId != 0) {
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
                                                DialogsActivity dialogsActivity = this.parentFragment;
                                                CharSequence string3 = LocaleController.getString((dialogsActivity == null || !dialogsActivity.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                z9 = z6;
                                                charSequence5 = charSequence3;
                                                string = null;
                                                z10 = false;
                                                charSequence7 = null;
                                                z7 = false;
                                                charSequence8 = charSequence4;
                                                charSequence9 = string3;
                                            }
                                            z9 = z6;
                                            z10 = z17;
                                            z7 = z;
                                            charSequence5 = charSequence3;
                                            string = null;
                                            charSequence7 = null;
                                            charSequence8 = charSequence4;
                                            charSequence9 = "";
                                        }
                                    } else {
                                        String restrictionReason = MessagesController.getInstance(messageObject9.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
                                        long fromChatId = this.message.getFromChatId();
                                        if (DialogObject.isUserDialog(fromChatId)) {
                                            MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(fromChatId));
                                            chat = null;
                                        } else {
                                            chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-fromChatId));
                                        }
                                        this.drawCount2 = true;
                                        z7 = z;
                                        if (this.dialogsType == 0 && this.currentDialogId > 0 && this.message.isOutOwner() && (tL_messageReactions = this.message.messageOwner.reactions) != null && (arrayList2 = tL_messageReactions.recent_reactions) != null && !arrayList2.isEmpty() && this.reactionMentionCount > 0) {
                                            TLRPC.MessagePeerReaction messagePeerReaction = this.message.messageOwner.reactions.recent_reactions.get(0);
                                            if (messagePeerReaction.unread) {
                                                chat2 = chat;
                                                long j4 = messagePeerReaction.peer_id.user_id;
                                                if (j4 != 0 && j4 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                    ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(messagePeerReaction.reaction);
                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                    String str13 = fromTL.emojicon;
                                                    if (str13 != null) {
                                                        charSequence11 = LocaleController.formatString(R.string.ReactionInDialog, str13);
                                                    } else {
                                                        String formatString = LocaleController.formatString(R.string.ReactionInDialog, str);
                                                        String str14 = str;
                                                        int indexOf2 = formatString.indexOf(str14);
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(formatString.replace(str14, "d"));
                                                        long j5 = fromTL.documentId;
                                                        TextPaint textPaint4 = this.currentMessagePaint;
                                                        spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(j5, textPaint4 == null ? null : textPaint4.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                        charSequence11 = spannableStringBuilder3;
                                                    }
                                                    z11 = true;
                                                    if (z11) {
                                                        z12 = z6;
                                                        charSequence13 = charSequence11;
                                                    } else {
                                                        int i19 = this.dialogsType;
                                                        if (i19 == 2) {
                                                            TLRPC.Chat chat7 = this.chat;
                                                            if (chat7 != null) {
                                                                if (ChatObject.isChannel(chat7)) {
                                                                    TLRPC.Chat chat8 = this.chat;
                                                                    if (!chat8.megagroup) {
                                                                        int i20 = chat8.participants_count;
                                                                        if (i20 != 0) {
                                                                            string2 = LocaleController.formatPluralStringComma("Subscribers", i20);
                                                                        } else if (!ChatObject.isPublic(chat8)) {
                                                                            string2 = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                                                        } else {
                                                                            string2 = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                        }
                                                                    }
                                                                }
                                                                TLRPC.Chat chat9 = this.chat;
                                                                int i21 = chat9.participants_count;
                                                                if (i21 != 0) {
                                                                    string2 = LocaleController.formatPluralStringComma("Members", i21);
                                                                } else if (chat9.has_geo) {
                                                                    string2 = LocaleController.getString(R.string.MegaLocation);
                                                                } else if (!ChatObject.isPublic(chat9)) {
                                                                    string2 = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                                                } else {
                                                                    string2 = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                }
                                                            } else {
                                                                string2 = "";
                                                            }
                                                            this.drawCount2 = false;
                                                        } else if (i19 == 3 && UserObject.isUserSelf(this.user)) {
                                                            DialogsActivity dialogsActivity2 = this.parentFragment;
                                                            string2 = LocaleController.getString((dialogsActivity2 == null || !dialogsActivity2.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                        } else {
                                                            if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout && this.currentDialogFolderId != 0) {
                                                                charSequence13 = formatArchivedDialogNames();
                                                                charSequence5 = charSequence3;
                                                                z12 = false;
                                                            } else {
                                                                MessageObject messageObject10 = this.message;
                                                                if ((messageObject10.messageOwner instanceof TLRPC.TL_messageService) && (!MessageObject.isTopicActionMessage(messageObject10) || (this.message.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                    if (ChatObject.isChannelAndNotMegaGroup(this.chat) && (this.message.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                        charSequence19 = "";
                                                                        z17 = false;
                                                                    } else {
                                                                        CharSequence charSequence30 = this.message.messageTextShort;
                                                                        charSequence19 = charSequence30 != null ? charSequence30 : charSequence28;
                                                                    }
                                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                    if (this.message.type == 21) {
                                                                        updateMessageThumbs();
                                                                        charSequence5 = charSequence3;
                                                                        charSequence17 = applyThumbs(charSequence19);
                                                                    } else {
                                                                        z12 = z6;
                                                                        charSequence13 = charSequence19;
                                                                    }
                                                                } else {
                                                                    this.needEmoji = true;
                                                                    updateMessageThumbs();
                                                                    String escape2 = (this.isSavedDialog || (user2 = this.user) == null || !user2.self || this.message.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                    if ((!this.isSavedDialog || (user = this.user) == null || user.self || (messageObject2 = this.message) == null || !messageObject2.isOutOwner()) && escape2 == null) {
                                                                        TLRPC.Chat chat10 = this.chat;
                                                                        if (chat10 != null) {
                                                                            long j6 = chat10.id;
                                                                            if (j6 > 0) {
                                                                                if (chat2 != null) {
                                                                                }
                                                                                if (ChatObject.isChannel(chat10)) {
                                                                                }
                                                                            }
                                                                        }
                                                                        TLRPC.User user5 = this.user;
                                                                        if (user5 == null || user5.id != UserObject.VERIFY || (messageObject = this.message) == null || messageObject.getForwardedFromId() == null) {
                                                                            boolean isEmpty = TextUtils.isEmpty(restrictionReason);
                                                                            CharSequence charSequence31 = restrictionReason;
                                                                            if (isEmpty) {
                                                                                if (MessageObject.isTopicActionMessage(this.message)) {
                                                                                    MessageObject messageObject11 = this.message;
                                                                                    CharSequence charSequence32 = messageObject11.messageTextShort;
                                                                                    if (charSequence32 == null || ((messageObject11.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.isTopic)) {
                                                                                        charSequence32 = messageObject11.messageText;
                                                                                    }
                                                                                    CharSequence charSequence33 = charSequence32;
                                                                                    charSequence31 = charSequence33;
                                                                                    if (messageObject11.topicIconDrawable[0] instanceof ForumBubbleDrawable) {
                                                                                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-this.message.getDialogId(), MessageObject.getTopicId(this.currentAccount, this.message.messageOwner, true));
                                                                                        charSequence31 = charSequence33;
                                                                                        if (findTopic != null) {
                                                                                            ((ForumBubbleDrawable) this.message.topicIconDrawable[0]).setColor(findTopic.icon_color);
                                                                                            charSequence31 = charSequence33;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    TLRPC.MessageMedia messageMedia = this.message.messageOwner.media;
                                                                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                                                        charSequence31 = LocaleController.getString(R.string.AttachPhotoExpired);
                                                                                    } else {
                                                                                        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                                                            TLRPC.Document document = messageMedia.document;
                                                                                            if (((document instanceof TLRPC.TL_documentEmpty) || document == null) && messageMedia.ttl_seconds != 0) {
                                                                                                if (messageMedia.voice) {
                                                                                                    charSequence31 = LocaleController.getString(R.string.AttachVoiceExpired);
                                                                                                } else if (messageMedia.round) {
                                                                                                    charSequence31 = LocaleController.getString(R.string.AttachRoundExpired);
                                                                                                } else {
                                                                                                    charSequence31 = LocaleController.getString(R.string.AttachVideoExpired);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (getCaptionMessage() != null) {
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
                                                                                                CharSequence charSequence34 = captionMessage.messageTrimmedToHighlight;
                                                                                                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 47);
                                                                                                if (this.hasNameInMessage) {
                                                                                                    if (!TextUtils.isEmpty(null)) {
                                                                                                        throw null;
                                                                                                    }
                                                                                                    measuredWidth = (int) (measuredWidth - this.currentMessagePaint.measureText(": "));
                                                                                                }
                                                                                                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                    charSequence34 = AndroidUtilities.ellipsizeCenterEnd(charSequence34, captionMessage.highlightedWords.get(0), measuredWidth, this.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                                                                                                }
                                                                                                charSequence31 = new SpannableStringBuilder(str5).append(charSequence34);
                                                                                            } else {
                                                                                                SpannableString spannableString2 = new SpannableString(captionMessage.caption);
                                                                                                if (captionMessage.messageOwner != null) {
                                                                                                    captionMessage.spoilLoginCode();
                                                                                                    MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString2, NotificationCenter.suggestedLangpack);
                                                                                                    ArrayList<TLRPC.MessageEntity> arrayList3 = captionMessage.messageOwner.entities;
                                                                                                    TextPaint textPaint5 = this.currentMessagePaint;
                                                                                                    MediaDataController.addAnimatedEmojiSpans(arrayList3, spannableString2, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                }
                                                                                                charSequence31 = new SpannableStringBuilder(str5).append((CharSequence) spannableString2);
                                                                                            }
                                                                                        } else {
                                                                                            MessageObject messageObject12 = this.message;
                                                                                            TLRPC.Message message2 = messageObject12.messageOwner;
                                                                                            TLRPC.MessageMedia messageMedia2 = message2.media;
                                                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPaidMedia) {
                                                                                                int size2 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia2).extended_media.size();
                                                                                                if (!this.hasVideoThumb) {
                                                                                                    c2 = 0;
                                                                                                    formatPluralString2 = size2 > 1 ? LocaleController.formatPluralString("Photos", size2, new Object[0]) : LocaleController.getString(R.string.AttachPhoto);
                                                                                                } else if (size2 > 1) {
                                                                                                    c2 = 0;
                                                                                                    formatPluralString2 = LocaleController.formatPluralString("Media", size2, new Object[0]);
                                                                                                } else {
                                                                                                    c2 = 0;
                                                                                                    formatPluralString2 = LocaleController.getString(R.string.AttachVideo);
                                                                                                }
                                                                                                int i22 = R.string.AttachPaidMedia;
                                                                                                Object[] objArr = new Object[1];
                                                                                                objArr[c2] = formatPluralString2;
                                                                                                CharSequence replaceStars = StarsIntroActivity.replaceStars(LocaleController.formatString(i22, objArr));
                                                                                                this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                charSequence31 = replaceStars;
                                                                                            } else if (this.thumbsCount > 1) {
                                                                                                if (this.hasVideoThumb) {
                                                                                                    ArrayList arrayList4 = this.groupMessages;
                                                                                                    if (arrayList4 == null) {
                                                                                                        i4 = 0;
                                                                                                        size = 0;
                                                                                                    } else {
                                                                                                        size = arrayList4.size();
                                                                                                        i4 = 0;
                                                                                                    }
                                                                                                    formatPluralString = LocaleController.formatPluralString("Media", size, new Object[i4]);
                                                                                                } else {
                                                                                                    ArrayList arrayList5 = this.groupMessages;
                                                                                                    formatPluralString = LocaleController.formatPluralString("Photos", arrayList5 == null ? 0 : arrayList5.size(), new Object[0]);
                                                                                                }
                                                                                                this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                charSequence31 = formatPluralString;
                                                                                            } else {
                                                                                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                    TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                                                                                                    if (messageFwdHeader != null) {
                                                                                                        TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                        if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                            isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, this.currentAccount);
                                                                                                            charSequence15 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                        }
                                                                                                    }
                                                                                                    isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.chat);
                                                                                                    charSequence15 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                    charSequence15 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                    if (tL_textWithEntities2 == null || tL_textWithEntities2.entities == null) {
                                                                                                        charSequence15 = "📊 " + tL_messageMediaPoll.poll.question.text;
                                                                                                    } else {
                                                                                                        SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaPoll.poll.question;
                                                                                                        MediaDataController.addTextStyleRuns(tL_textWithEntities3.entities, tL_textWithEntities3.text, spannableString3);
                                                                                                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                        charSequence15 = new SpannableStringBuilder("📊 ").append((CharSequence) spannableString3);
                                                                                                    }
                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                    TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                    if (tL_textWithEntities4 == null || tL_textWithEntities4.entities == null) {
                                                                                                        charSequence15 = "✅ " + tL_messageMediaToDo.todo.title.text;
                                                                                                    } else {
                                                                                                        SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageMediaToDo.todo.title;
                                                                                                        MediaDataController.addTextStyleRuns(tL_textWithEntities5.entities, tL_textWithEntities5.text, spannableString4);
                                                                                                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                        charSequence15 = new SpannableStringBuilder("✅ ").append((CharSequence) spannableString4);
                                                                                                    }
                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                    charSequence15 = "🎮 " + this.message.messageOwner.media.game.title;
                                                                                                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                    charSequence15 = messageMedia2.title;
                                                                                                } else if (messageObject12.type == 14) {
                                                                                                    charSequence15 = String.format("🎧 %s - %s", messageObject12.getMusicAuthor(), this.message.getMusicTitle());
                                                                                                } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaStory) && messageMedia2.via_mention) {
                                                                                                    if (messageObject12.isOut()) {
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
                                                                                                        int i23 = R.string.StoryYouMentionInDialog;
                                                                                                        Object[] objArr2 = new Object[1];
                                                                                                        objArr2[c] = str4;
                                                                                                        charSequence15 = LocaleController.formatString(i23, objArr2);
                                                                                                    } else {
                                                                                                        charSequence15 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                    }
                                                                                                } else {
                                                                                                    if (messageObject12.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                                        CharSequence charSequence35 = this.message.messageTrimmedToHighlight;
                                                                                                        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 23);
                                                                                                        MessageObject messageObject13 = this.message;
                                                                                                        charSequence14 = charSequence35;
                                                                                                        if (messageObject13.messageTrimmedToHighlightCut) {
                                                                                                            charSequence14 = AndroidUtilities.ellipsizeCenterEnd(charSequence35, messageObject13.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, NotificationCenter.dialogTranslate);
                                                                                                        }
                                                                                                    } else {
                                                                                                        SpannableString spannableString5 = new SpannableString(charSequence28);
                                                                                                        MessageObject messageObject14 = this.message;
                                                                                                        if (messageObject14 != null) {
                                                                                                            messageObject14.spoilLoginCode();
                                                                                                        }
                                                                                                        MediaDataController.addTextStyleRuns(this.message, spannableString5, NotificationCenter.suggestedLangpack);
                                                                                                        MessageObject messageObject15 = this.message;
                                                                                                        charSequence14 = spannableString5;
                                                                                                        if (messageObject15 != null) {
                                                                                                            TLRPC.Message message3 = messageObject15.messageOwner;
                                                                                                            charSequence14 = spannableString5;
                                                                                                            if (message3 != null) {
                                                                                                                ArrayList<TLRPC.MessageEntity> arrayList6 = message3.entities;
                                                                                                                TextPaint textPaint6 = this.currentMessagePaint;
                                                                                                                MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint6 == null ? null : textPaint6.getFontMetricsInt());
                                                                                                                charSequence14 = spannableString5;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    AndroidUtilities.highlightText(charSequence14, this.message.highlightedWords, this.resourcesProvider);
                                                                                                    charSequence15 = charSequence14;
                                                                                                }
                                                                                                CharSequence charSequence36 = charSequence15;
                                                                                                MessageObject messageObject16 = this.message;
                                                                                                charSequence31 = charSequence36;
                                                                                                if (messageObject16.messageOwner.media != null) {
                                                                                                    charSequence31 = charSequence36;
                                                                                                    if (!messageObject16.isMediaEmpty()) {
                                                                                                        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                        charSequence31 = charSequence36;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (this.message.isReplyToStory()) {
                                                                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence31);
                                                                                charSequence5 = charSequence3;
                                                                                spannableStringBuilder4.insert(0, charSequence5);
                                                                                spannableStringBuilder4.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                charSequence12 = spannableStringBuilder4;
                                                                            } else {
                                                                                charSequence5 = charSequence3;
                                                                                charSequence12 = charSequence31;
                                                                            }
                                                                            CharSequence charSequence37 = charSequence12;
                                                                            if (this.thumbsCount > 0) {
                                                                                if (this.message.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                    replaceNewLines = this.message.messageTrimmedToHighlight;
                                                                                    int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(((this.messagePaddingStart + 23) + ((this.thumbSize + 2) * this.thumbsCount)) + 3);
                                                                                    MessageObject messageObject17 = this.message;
                                                                                    if (messageObject17.messageTrimmedToHighlightCut) {
                                                                                        replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject17.highlightedWords.get(0), measuredWidth3, this.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                                                                                    }
                                                                                } else {
                                                                                    int length2 = charSequence12.length();
                                                                                    CharSequence charSequence38 = charSequence12;
                                                                                    if (length2 > 150) {
                                                                                        charSequence38 = charSequence12.subSequence(0, 150);
                                                                                    }
                                                                                    replaceNewLines = AndroidUtilities.replaceNewLines(charSequence38);
                                                                                }
                                                                                CharSequence spannableStringBuilder5 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                SpannableStringBuilder spannableStringBuilder6 = (SpannableStringBuilder) spannableStringBuilder5;
                                                                                spannableStringBuilder6.insert(0, (CharSequence) " ");
                                                                                spannableStringBuilder6.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 3)), 0, 1, 33);
                                                                                Emoji.replaceEmoji(spannableStringBuilder6, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                CharSequence charSequence39 = spannableStringBuilder5;
                                                                                if (this.message.hasHighlightedWords()) {
                                                                                    CharSequence highlightText5 = AndroidUtilities.highlightText(spannableStringBuilder6, this.message.highlightedWords, this.resourcesProvider);
                                                                                    charSequence39 = spannableStringBuilder5;
                                                                                    if (highlightText5 != null) {
                                                                                        charSequence39 = highlightText5;
                                                                                    }
                                                                                }
                                                                                z6 = false;
                                                                                charSequence37 = charSequence39;
                                                                            }
                                                                            if (this.message.isForwarded() && this.message.needDrawForwarded()) {
                                                                                this.drawForwardIcon = true;
                                                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence37);
                                                                                spannableStringBuilder7.insert(0, charSequence5);
                                                                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                coloredImageSpan.setAlpha(0.9f);
                                                                                spannableStringBuilder7.setSpan(coloredImageSpan, 0, 1, 0);
                                                                                charSequence17 = spannableStringBuilder7;
                                                                            } else {
                                                                                z12 = z6;
                                                                                charSequence13 = charSequence37;
                                                                            }
                                                                        }
                                                                    }
                                                                    charSequence5 = charSequence3;
                                                                    if (escape2 == null) {
                                                                        escape2 = getMessageNameString();
                                                                    }
                                                                    CharSequence escape3 = AndroidUtilities.escape(escape2);
                                                                    TLRPC.Chat chat11 = this.chat;
                                                                    if (chat11 != null && chat11.forum && !this.isTopic && !this.useFromUserAsAvatar) {
                                                                        CharSequence topicIconName = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint);
                                                                        if (!TextUtils.isEmpty(topicIconName)) {
                                                                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("-");
                                                                            ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                            coloredImageSpan2.setColorKey((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? -1 : Theme.key_chats_nameMessage);
                                                                            spannableStringBuilder8.setSpan(coloredImageSpan2, 0, 1, 0);
                                                                            SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                                                                            spannableStringBuilder9.append(escape3).append((CharSequence) spannableStringBuilder8).append(topicIconName);
                                                                            charSequence16 = spannableStringBuilder9;
                                                                            SpannableStringBuilder messageStringFormatted2 = getMessageStringFormatted(i, restrictionReason, charSequence16, false);
                                                                            if (!this.useFromUserAsAvatar || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && (this.currentDialogFolderId == 0 || messageStringFormatted2.length() <= 0))) {
                                                                                i5 = 0;
                                                                            } else {
                                                                                try {
                                                                                    foregroundColorSpanThemable = new ForegroundColorSpanThemable(Theme.key_chats_nameMessage, this.resourcesProvider);
                                                                                    i5 = charSequence16.length() + 1;
                                                                                } catch (Exception e) {
                                                                                    e = e;
                                                                                    i5 = 0;
                                                                                }
                                                                                try {
                                                                                    messageStringFormatted2.setSpan(foregroundColorSpanThemable, 0, i5, 33);
                                                                                } catch (Exception e2) {
                                                                                    e = e2;
                                                                                    FileLog.e(e);
                                                                                    charSequence13 = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                    if (this.message.hasHighlightedWords()) {
                                                                                    }
                                                                                    if (this.thumbsCount > 0) {
                                                                                    }
                                                                                    z12 = false;
                                                                                    charSequence18 = charSequence16;
                                                                                    if (this.currentDialogFolderId != 0) {
                                                                                    }
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
                                                                                    z13 = false;
                                                                                    this.drawCount = false;
                                                                                    this.drawMention = false;
                                                                                    this.drawReactionMention = false;
                                                                                    this.drawError = false;
                                                                                    str6 = null;
                                                                                    str7 = null;
                                                                                    this.promoDialog = z13;
                                                                                    MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                                                                                    if (this.dialogsType != 0) {
                                                                                    }
                                                                                    str9 = stringForMessageListDate;
                                                                                    if (this.currentDialogFolderId != 0) {
                                                                                    }
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
                                                                                    if (!this.drawPremium) {
                                                                                    }
                                                                                    if (!this.dialogMuted) {
                                                                                    }
                                                                                    int dp9 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
                                                                                    this.nameWidth -= dp9;
                                                                                    this.nameAdditionalsForChannelSubscriber += dp9;
                                                                                    if (LocaleController.isRTL) {
                                                                                    }
                                                                                    if (this.drawBotVerified) {
                                                                                    }
                                                                                    i8 = this.namePaddingEnd;
                                                                                    if (i8 > 0) {
                                                                                    }
                                                                                    dp7 = this.nameWidth - AndroidUtilities.dp(12.0f);
                                                                                    if (dp7 < 0) {
                                                                                    }
                                                                                    if (charSequence23 instanceof String) {
                                                                                    }
                                                                                    if (!this.nameLayoutEllipsizeByGradient) {
                                                                                    }
                                                                                    int i24 = dp7;
                                                                                    float f2 = i24;
                                                                                    this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(charSequence23.toString()) <= f2;
                                                                                    if (!this.twoLinesForName) {
                                                                                    }
                                                                                    CharSequence replaceEmoji = Emoji.replaceEmoji(charSequence23, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                    MessageObject messageObject18 = this.message;
                                                                                    if (messageObject18 == null) {
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
                                                                                    this.errorTop = AndroidUtilities.dp(43.0f);
                                                                                    this.pinTop = AndroidUtilities.dp(43.0f);
                                                                                    this.countTop = AndroidUtilities.dp(43.0f);
                                                                                    this.checkDrawTop = AndroidUtilities.dp(13.0f);
                                                                                    int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
                                                                                    if (!LocaleController.isRTL) {
                                                                                    }
                                                                                    i9 = measuredWidth4;
                                                                                    this.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(56.0f));
                                                                                    i10 = 0;
                                                                                    while (true) {
                                                                                        imageReceiverArr = this.thumbImage;
                                                                                        if (i10 < imageReceiverArr.length) {
                                                                                        }
                                                                                        imageReceiverArr[i10].setImageCoords(((this.thumbSize + 2) * i10) + dp3, ((dp + AndroidUtilities.dp(31.0f)) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                                                                        i10++;
                                                                                        dp = dp;
                                                                                    }
                                                                                    i11 = dp;
                                                                                    int i25 = i9;
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
                                                                                        if (z14) {
                                                                                        }
                                                                                        int max = Math.max(AndroidUtilities.dp(12.0f), i25);
                                                                                        this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                        if (!this.useForceThreeLines) {
                                                                                            this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
                                                                                            if (!isForumCell()) {
                                                                                            }
                                                                                            CharSequence charSequence40 = charSequence22;
                                                                                            if (this.twoLinesForName) {
                                                                                            }
                                                                                            this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                            this.buttonCreated = false;
                                                                                            if (TextUtils.isEmpty(charSequence7)) {
                                                                                            }
                                                                                            this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                            if (!TextUtils.isEmpty(charSequence24)) {
                                                                                            }
                                                                                            if (charSequence9 instanceof Spannable) {
                                                                                            }
                                                                                            if (!this.useForceThreeLines) {
                                                                                            }
                                                                                            if (this.currentDialogFolderId != 0) {
                                                                                            }
                                                                                            if (!this.useForceThreeLines) {
                                                                                            }
                                                                                            if (isForumCell()) {
                                                                                            }
                                                                                            ellipsize = TextUtils.ellipsize(charSequence9, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                                                                                            charSequence9 = ellipsize;
                                                                                            charSequence25 = charSequence9;
                                                                                            alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                            if (!this.useForceThreeLines) {
                                                                                            }
                                                                                            if (this.thumbsCount > 0) {
                                                                                            }
                                                                                            this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence25, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence40 != null ? 1 : 2);
                                                                                            i13 = max;
                                                                                            this.spoilersPool.addAll(this.spoilers);
                                                                                            this.spoilers.clear();
                                                                                            i12 = 1;
                                                                                            SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                                                                                            Layout[] layoutArr = new Layout[i12];
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
                                                                                        CharSequence charSequence402 = charSequence22;
                                                                                        if (this.twoLinesForName) {
                                                                                        }
                                                                                        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                        this.buttonCreated = false;
                                                                                        if (TextUtils.isEmpty(charSequence7)) {
                                                                                        }
                                                                                        this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                        if (!TextUtils.isEmpty(charSequence24)) {
                                                                                        }
                                                                                        if (charSequence9 instanceof Spannable) {
                                                                                        }
                                                                                        if (!this.useForceThreeLines) {
                                                                                        }
                                                                                        if (this.currentDialogFolderId != 0) {
                                                                                        }
                                                                                        if (!this.useForceThreeLines) {
                                                                                        }
                                                                                        if (isForumCell()) {
                                                                                        }
                                                                                        ellipsize = TextUtils.ellipsize(charSequence9, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                                                                                        charSequence9 = ellipsize;
                                                                                        charSequence25 = charSequence9;
                                                                                        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                        if (!this.useForceThreeLines) {
                                                                                        }
                                                                                        if (this.thumbsCount > 0) {
                                                                                        }
                                                                                        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence25, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence402 != null ? 1 : 2);
                                                                                        i13 = max;
                                                                                        this.spoilersPool.addAll(this.spoilers);
                                                                                        this.spoilers.clear();
                                                                                        i12 = 1;
                                                                                        SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = this.animatedEmojiStack;
                                                                                        Layout[] layoutArr2 = new Layout[i12];
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
                                                                                    if (z14) {
                                                                                    }
                                                                                    int max2 = Math.max(AndroidUtilities.dp(12.0f), i25);
                                                                                    this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                    if (!this.useForceThreeLines) {
                                                                                    }
                                                                                    this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
                                                                                    if (!isForumCell()) {
                                                                                    }
                                                                                    CharSequence charSequence4022 = charSequence22;
                                                                                    if (this.twoLinesForName) {
                                                                                    }
                                                                                    this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                    this.buttonCreated = false;
                                                                                    if (TextUtils.isEmpty(charSequence7)) {
                                                                                    }
                                                                                    this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                    if (!TextUtils.isEmpty(charSequence24)) {
                                                                                    }
                                                                                    if (charSequence9 instanceof Spannable) {
                                                                                    }
                                                                                    if (!this.useForceThreeLines) {
                                                                                    }
                                                                                    if (this.currentDialogFolderId != 0) {
                                                                                    }
                                                                                    if (!this.useForceThreeLines) {
                                                                                    }
                                                                                    if (isForumCell()) {
                                                                                    }
                                                                                    ellipsize = TextUtils.ellipsize(charSequence9, this.currentMessagePaint, max2 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                                                                                    charSequence9 = ellipsize;
                                                                                    charSequence25 = charSequence9;
                                                                                    alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                    if (!this.useForceThreeLines) {
                                                                                    }
                                                                                    if (this.thumbsCount > 0) {
                                                                                    }
                                                                                    this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence25, this.currentMessagePaint, max2, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max2, charSequence4022 != null ? 1 : 2);
                                                                                    i13 = max2;
                                                                                    this.spoilersPool.addAll(this.spoilers);
                                                                                    this.spoilers.clear();
                                                                                    i12 = 1;
                                                                                    SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22 = this.animatedEmojiStack;
                                                                                    Layout[] layoutArr22 = new Layout[i12];
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
                                                                            charSequence13 = Emoji.replaceEmoji(messageStringFormatted2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                            if (this.message.hasHighlightedWords() && (highlightText = AndroidUtilities.highlightText(charSequence13, this.message.highlightedWords, this.resourcesProvider)) != null) {
                                                                                charSequence13 = highlightText;
                                                                            }
                                                                            if (this.thumbsCount > 0) {
                                                                                if (!(charSequence13 instanceof SpannableStringBuilder)) {
                                                                                    charSequence13 = new SpannableStringBuilder(charSequence13);
                                                                                }
                                                                                SpannableStringBuilder spannableStringBuilder10 = (SpannableStringBuilder) charSequence13;
                                                                                if (i5 >= spannableStringBuilder10.length()) {
                                                                                    spannableStringBuilder10.append((CharSequence) " ");
                                                                                    spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), spannableStringBuilder10.length() - 1, spannableStringBuilder10.length(), 33);
                                                                                } else {
                                                                                    spannableStringBuilder10.insert(i5, (CharSequence) " ");
                                                                                    spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), i5, i5 + 1, 33);
                                                                                }
                                                                            }
                                                                            z12 = false;
                                                                            charSequence18 = charSequence16;
                                                                            if (this.currentDialogFolderId != 0) {
                                                                                charSequence7 = null;
                                                                                CharSequence charSequence41 = charSequence4;
                                                                                charSequence9 = charSequence13;
                                                                                string = formatArchivedDialogNames();
                                                                                z9 = z12;
                                                                                z10 = z17;
                                                                                charSequence8 = charSequence41;
                                                                            } else {
                                                                                z9 = z12;
                                                                                charSequence7 = null;
                                                                                z10 = z17;
                                                                                charSequence8 = charSequence4;
                                                                                charSequence9 = charSequence13;
                                                                                string = charSequence18;
                                                                            }
                                                                        }
                                                                    }
                                                                    charSequence16 = escape3;
                                                                    SpannableStringBuilder messageStringFormatted22 = getMessageStringFormatted(i, restrictionReason, charSequence16, false);
                                                                    if (this.useFromUserAsAvatar) {
                                                                    }
                                                                    i5 = 0;
                                                                    charSequence13 = Emoji.replaceEmoji(messageStringFormatted22, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                    if (this.message.hasHighlightedWords()) {
                                                                        charSequence13 = highlightText;
                                                                    }
                                                                    if (this.thumbsCount > 0) {
                                                                    }
                                                                    z12 = false;
                                                                    charSequence18 = charSequence16;
                                                                    if (this.currentDialogFolderId != 0) {
                                                                    }
                                                                }
                                                                charSequence18 = null;
                                                                CharSequence charSequence42 = charSequence17;
                                                                z12 = z6;
                                                                charSequence13 = charSequence42;
                                                                if (this.currentDialogFolderId != 0) {
                                                                }
                                                            }
                                                            charSequence18 = null;
                                                            if (this.currentDialogFolderId != 0) {
                                                            }
                                                        }
                                                        z12 = z6;
                                                        charSequence13 = string2;
                                                        charSequence5 = charSequence3;
                                                        z17 = false;
                                                        charSequence18 = null;
                                                        z7 = false;
                                                        if (this.currentDialogFolderId != 0) {
                                                        }
                                                    }
                                                    charSequence5 = charSequence3;
                                                    charSequence18 = null;
                                                    if (this.currentDialogFolderId != 0) {
                                                    }
                                                }
                                                charSequence11 = "";
                                                z11 = false;
                                                if (z11) {
                                                }
                                                charSequence5 = charSequence3;
                                                charSequence18 = null;
                                                if (this.currentDialogFolderId != 0) {
                                                }
                                            }
                                        }
                                        chat2 = chat;
                                        charSequence11 = "";
                                        z11 = false;
                                        if (z11) {
                                        }
                                        charSequence5 = charSequence3;
                                        charSequence18 = null;
                                        if (this.currentDialogFolderId != 0) {
                                        }
                                    }
                                }
                                z9 = z6;
                                z7 = z;
                                charSequence5 = charSequence3;
                                string = null;
                                charSequence10 = charSequence20;
                                charSequence7 = null;
                                boolean z222 = z17;
                                charSequence8 = charSequence4;
                                charSequence9 = charSequence10;
                                z10 = z222;
                            }
                        }
                        if (!this.drawForwardIcon && !isFolderCell() && !isForumCell() && !isDialogFolder() && this.draftMessage == null && (messageObject4 = this.message) != null && (message = messageObject4.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            this.drawGiftIcon = true;
                            SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(charSequence9);
                            spannableStringBuilder11.insert(0, charSequence5);
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
                                stringForMessageListDate = LocaleController.stringForMessageListDate(r6.date);
                            } else {
                                int i26 = this.lastMessageDate;
                                if (i26 != 0) {
                                    stringForMessageListDate = LocaleController.stringForMessageListDate(i26);
                                } else {
                                    if (this.message != null) {
                                        stringForMessageListDate = LocaleController.stringForMessageListDate(r6.messageOwner.date);
                                    }
                                }
                            }
                            messageObject3 = this.message;
                            if (messageObject3 != null || this.isSavedDialog) {
                                this.drawCheck1 = false;
                                this.drawCheck2 = false;
                                this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                                z13 = false;
                                this.drawCount = false;
                                this.drawMention = false;
                                this.drawReactionMention = false;
                                this.drawError = false;
                                str6 = null;
                                str7 = null;
                            } else {
                                if (this.currentDialogFolderId != 0) {
                                    int i27 = this.unreadCount;
                                    int i28 = this.mentionCount;
                                    int i29 = i27 + i28;
                                    if (i29 <= 0) {
                                        z16 = false;
                                        this.drawCount = false;
                                        this.drawMention = false;
                                        str6 = null;
                                    } else if (i27 > i28) {
                                        this.drawCount = true;
                                        z16 = false;
                                        this.drawMention = false;
                                        str6 = String.format(str2, Integer.valueOf(i29));
                                    } else {
                                        z16 = false;
                                        this.drawCount = false;
                                        this.drawMention = true;
                                        str7 = String.format(str2, Integer.valueOf(i29));
                                        str6 = null;
                                        this.drawReactionMention = z16;
                                    }
                                    str7 = null;
                                    this.drawReactionMention = z16;
                                } else {
                                    String str15 = str2;
                                    if (this.clearingDialog) {
                                        this.drawCount = false;
                                        z10 = false;
                                        str6 = null;
                                        z15 = false;
                                    } else {
                                        int i30 = this.unreadCount;
                                        if (i30 != 0 && (i30 != 1 || i30 != this.mentionCount || !messageObject3.messageOwner.mentioned)) {
                                            this.drawCount = true;
                                            Integer valueOf3 = Integer.valueOf(i30);
                                            z15 = false;
                                            str6 = String.format(str15, valueOf3);
                                        } else {
                                            z15 = false;
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
                                        this.drawMention = true;
                                        str11 = "@";
                                    } else {
                                        this.drawMention = z15;
                                        str11 = null;
                                    }
                                    if (this.reactionMentionCount > 0) {
                                        this.drawReactionMention = true;
                                    } else {
                                        this.drawReactionMention = z15;
                                    }
                                    str7 = str11;
                                }
                                if (this.message.isOut() && this.draftMessage == null && z10) {
                                    MessageObject messageObject19 = this.message;
                                    if (!(messageObject19.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                        if (messageObject19.isSending()) {
                                            z13 = false;
                                            this.drawCheck1 = false;
                                            this.drawCheck2 = false;
                                            this.drawClock = true;
                                            this.drawError = false;
                                        } else {
                                            z13 = false;
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
                                                    int i31 = this.readOutboxMaxId;
                                                    this.drawCheck1 = (i31 > 0 && i31 >= this.message.getId()) || !this.message.isUnread() || (ChatObject.isChannel(this.chat) && !this.chat.megagroup);
                                                } else {
                                                    this.drawCheck1 = !this.message.isUnread() || (ChatObject.isChannel(this.chat) && !this.chat.megagroup);
                                                }
                                                this.drawCheck2 = true;
                                                z13 = false;
                                                this.drawClock = false;
                                                this.drawError = false;
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                    }
                                }
                                z13 = false;
                                this.drawCheck1 = false;
                                this.drawCheck2 = false;
                                this.drawClock = false;
                                this.drawError = false;
                            }
                            this.promoDialog = z13;
                            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                            if (this.dialogsType != 0) {
                                str8 = str7;
                                if (messagesController2.isPromoDialog(this.currentDialogId, true)) {
                                    this.drawPinBackground = true;
                                    this.promoDialog = true;
                                    int i32 = messagesController2.promoDialogType;
                                    if (i32 == MessagesController.PROMO_TYPE_PROXY) {
                                        str9 = LocaleController.getString(R.string.UseProxySponsor);
                                        if (this.currentDialogFolderId != 0) {
                                            charSequence22 = string;
                                            str10 = str9;
                                            charSequence24 = charSequence8;
                                            z14 = z9;
                                            charSequence23 = LocaleController.getString(R.string.ArchivedChats);
                                            z = z7;
                                        } else {
                                            TLRPC.Chat chat12 = this.chat;
                                            if (chat12 != null) {
                                                if (this.useFromUserAsAvatar) {
                                                    if (this.topicIconInName == null) {
                                                        this.topicIconInName = new Drawable[1];
                                                    }
                                                    this.topicIconInName[0] = null;
                                                    topicSpannedName = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint, this.topicIconInName);
                                                    charSequence21 = string;
                                                } else if (this.isTopic) {
                                                    if (this.topicIconInName == null) {
                                                        this.topicIconInName = new Drawable[1];
                                                    }
                                                    Drawable[] drawableArr = this.topicIconInName;
                                                    drawableArr[0] = null;
                                                    topicSpannedName = this.showTopicIconInName ? ForumUtilities.getTopicSpannedName(this.forumTopic, Theme.dialogs_namePaint[this.paintIndex], drawableArr, false) : AndroidUtilities.escape(this.forumTopic.title);
                                                    charSequence21 = string;
                                                } else {
                                                    if (chat12.monoforum && chat12.linked_monoforum_id != 0) {
                                                        TLRPC.Chat chat13 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.linked_monoforum_id));
                                                        if (chat13 != null) {
                                                            SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(AndroidUtilities.escape(chat13.title));
                                                            spannableStringBuilder12.append((CharSequence) " ");
                                                            int length3 = spannableStringBuilder12.length();
                                                            int i33 = R.string.MonoforumSpan;
                                                            spannableStringBuilder12.append((CharSequence) LocaleController.getString(i33));
                                                            charSequence21 = string;
                                                            spannableStringBuilder12.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i33), 9.33f, Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider), length3, spannableStringBuilder12.length(), 33);
                                                            escape = spannableStringBuilder12;
                                                        } else {
                                                            charSequence21 = string;
                                                            escape = AndroidUtilities.escape(this.chat.title);
                                                        }
                                                    } else {
                                                        charSequence21 = string;
                                                        escape = AndroidUtilities.escape(chat12.title);
                                                    }
                                                    if (escape != null && escape.length() == 0) {
                                                        escape = LocaleController.getString(R.string.HiddenName);
                                                    }
                                                    charSequence22 = charSequence21;
                                                    z = z7;
                                                    boolean z23 = z9;
                                                    charSequence23 = escape;
                                                    str10 = str9;
                                                    charSequence24 = charSequence8;
                                                    z14 = z23;
                                                }
                                                escape = topicSpannedName;
                                                if (escape != null) {
                                                    escape = LocaleController.getString(R.string.HiddenName);
                                                }
                                                charSequence22 = charSequence21;
                                                z = z7;
                                                boolean z232 = z9;
                                                charSequence23 = escape;
                                                str10 = str9;
                                                charSequence24 = charSequence8;
                                                z14 = z232;
                                            } else {
                                                charSequence21 = string;
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
                                                    if (escape != null) {
                                                    }
                                                    charSequence22 = charSequence21;
                                                    z = z7;
                                                    boolean z2322 = z9;
                                                    charSequence23 = escape;
                                                    str10 = str9;
                                                    charSequence24 = charSequence8;
                                                    z14 = z2322;
                                                }
                                                escape = "";
                                                if (escape != null) {
                                                }
                                                charSequence22 = charSequence21;
                                                z = z7;
                                                boolean z23222 = z9;
                                                charSequence23 = escape;
                                                str10 = str9;
                                                charSequence24 = charSequence8;
                                                z14 = z23222;
                                            }
                                        }
                                    } else if (i32 == MessagesController.PROMO_TYPE_PSA) {
                                        stringForMessageListDate = LocaleController.getString("PsaType_" + messagesController2.promoPsaType);
                                        if (TextUtils.isEmpty(stringForMessageListDate)) {
                                            stringForMessageListDate = LocaleController.getString(R.string.PsaTypeDefault);
                                        }
                                        if (!TextUtils.isEmpty(messagesController2.promoPsaMessage)) {
                                            charSequence9 = messagesController2.promoPsaMessage;
                                            this.thumbsCount = 0;
                                        }
                                    }
                                }
                            } else {
                                str8 = str7;
                            }
                            str9 = stringForMessageListDate;
                            if (this.currentDialogFolderId != 0) {
                            }
                        }
                        stringForMessageListDate = "";
                        messageObject3 = this.message;
                        if (messageObject3 != null) {
                        }
                        this.drawCheck1 = false;
                        this.drawCheck2 = false;
                        this.drawClock = messageObject3 == null && messageObject3.isSending() && this.currentDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId();
                        z13 = false;
                        this.drawCount = false;
                        this.drawMention = false;
                        this.drawReactionMention = false;
                        this.drawError = false;
                        str6 = null;
                        str7 = null;
                        this.promoDialog = z13;
                        MessagesController messagesController22 = MessagesController.getInstance(this.currentAccount);
                        if (this.dialogsType != 0) {
                        }
                        str9 = stringForMessageListDate;
                        if (this.currentDialogFolderId != 0) {
                        }
                    }
                }
                draftMessage3 = null;
                this.draftMessage = null;
                z5 = false;
                this.draftVoice = false;
                if (!isForumCell()) {
                }
                if (!this.drawForwardIcon) {
                    this.drawGiftIcon = true;
                    SpannableStringBuilder spannableStringBuilder112 = new SpannableStringBuilder(charSequence9);
                    spannableStringBuilder112.insert(0, charSequence5);
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
                z13 = false;
                this.drawCount = false;
                this.drawMention = false;
                this.drawReactionMention = false;
                this.drawError = false;
                str6 = null;
                str7 = null;
                this.promoDialog = z13;
                MessagesController messagesController222 = MessagesController.getInstance(this.currentAccount);
                if (this.dialogsType != 0) {
                }
                str9 = stringForMessageListDate;
                if (this.currentDialogFolderId != 0) {
                }
            }
            str2 = "%d";
            i2 = this.lastMessageDate;
            if (i2 == 0) {
                i2 = messageObject5.messageOwner.date;
            }
            if (!this.isTopic) {
            }
            z4 = this.draftVoice;
            if (!z4) {
                if (ChatObject.isChannel(this.chat)) {
                }
                chat3 = this.chat;
                if (chat3 != null) {
                }
                z5 = false;
                draftMessage3 = null;
                if (!isForumCell()) {
                }
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
                z13 = false;
                this.drawCount = false;
                this.drawMention = false;
                this.drawReactionMention = false;
                this.drawError = false;
                str6 = null;
                str7 = null;
                this.promoDialog = z13;
                MessagesController messagesController2222 = MessagesController.getInstance(this.currentAccount);
                if (this.dialogsType != 0) {
                }
                str9 = stringForMessageListDate;
                if (this.currentDialogFolderId != 0) {
                }
            }
            if (ChatObject.isChannel(this.chat)) {
            }
            chat3 = this.chat;
            if (chat3 != null) {
            }
            z5 = false;
            draftMessage3 = null;
            if (!isForumCell()) {
            }
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
            z13 = false;
            this.drawCount = false;
            this.drawMention = false;
            this.drawReactionMention = false;
            this.drawError = false;
            str6 = null;
            str7 = null;
            this.promoDialog = z13;
            MessagesController messagesController22222 = MessagesController.getInstance(this.currentAccount);
            if (this.dialogsType != 0) {
            }
            str9 = stringForMessageListDate;
            if (this.currentDialogFolderId != 0) {
            }
        }
        if (!z) {
            i6 = (int) Math.ceil(Theme.dialogs_timePaint.measureText(str10));
            this.timeLayout = new StaticLayout(str10, Theme.dialogs_timePaint, i6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (!LocaleController.isRTL) {
                this.timeLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.0f)) - i6;
            } else {
                this.timeLeft = AndroidUtilities.dp(15.0f);
            }
        } else {
            this.timeLayout = null;
            this.timeLeft = 0;
            i6 = 0;
        }
        if (drawLock2()) {
            f = 4.0f;
            i7 = 0;
        } else {
            if (LocaleController.isRTL) {
                f = 4.0f;
                this.lock2Left = this.timeLeft + i6 + AndroidUtilities.dp(4.0f);
            } else {
                f = 4.0f;
                this.lock2Left = (this.timeLeft - Theme.dialogs_lock2Drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i7 = Theme.dialogs_lock2Drawable.getIntrinsicWidth() + AndroidUtilities.dp(f);
            i6 += i7;
        }
        if (LocaleController.isRTL) {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(22.0f)) - i6;
        } else {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(this.messagePaddingStart + 13)) - i6;
            this.nameLeft += i6;
        }
        if (this.drawNameLock) {
            int i34 = this.nameWidth;
            if (LocaleController.isRTL) {
                f = 8.0f;
            }
            this.nameWidth = i34 - (AndroidUtilities.dp(f) + Theme.dialogs_lockDrawable.getIntrinsicWidth());
        }
        if (!this.drawClock) {
            int intrinsicWidth = Theme.dialogs_clockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            this.nameWidth -= intrinsicWidth;
            if (!LocaleController.isRTL) {
                this.clockDrawLeft = (this.timeLeft - i7) - intrinsicWidth;
            } else {
                this.clockDrawLeft = this.timeLeft + i6 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth;
            }
        } else if (this.drawCheck2) {
            int intrinsicWidth2 = Theme.dialogs_checkDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            int i35 = this.nameWidth - intrinsicWidth2;
            this.nameWidth = i35;
            if (this.drawCheck1) {
                this.nameWidth = i35 - (Theme.dialogs_halfCheckDrawable.getIntrinsicWidth() - AndroidUtilities.dp(8.0f));
                if (!LocaleController.isRTL) {
                    int i36 = (this.timeLeft - i7) - intrinsicWidth2;
                    this.halfCheckDrawLeft = i36;
                    this.checkDrawLeft = i36 - AndroidUtilities.dp(5.5f);
                } else {
                    int dp10 = this.timeLeft + i6 + AndroidUtilities.dp(5.0f);
                    this.checkDrawLeft = dp10;
                    this.halfCheckDrawLeft = dp10 + AndroidUtilities.dp(5.5f);
                    this.nameLeft += (intrinsicWidth2 + Theme.dialogs_halfCheckDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(8.0f);
                }
            } else if (!LocaleController.isRTL) {
                this.checkDrawLeft1 = (this.timeLeft - i7) - intrinsicWidth2;
            } else {
                this.checkDrawLeft1 = this.timeLeft + i6 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth2;
            }
        }
        this.nameAdditionalsForChannelSubscriber = 0;
        if (!this.drawPremium && this.emojiStatus.getDrawable() != null) {
            int dp11 = AndroidUtilities.dp(36.0f);
            this.nameWidth -= dp11;
            this.nameAdditionalsForChannelSubscriber += dp11;
            if (LocaleController.isRTL) {
                this.nameLeft += dp11;
            }
        } else if ((!this.dialogMuted || this.drawUnmute) && !this.drawVerified && this.drawScam == 0) {
            int dp92 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            this.nameWidth -= dp92;
            this.nameAdditionalsForChannelSubscriber += dp92;
            if (LocaleController.isRTL) {
                this.nameLeft += dp92;
            }
        } else if (this.drawVerified) {
            int dp12 = AndroidUtilities.dp(6.0f) + Theme.dialogs_verifiedDrawable.getIntrinsicWidth();
            this.nameWidth -= dp12;
            this.nameAdditionalsForChannelSubscriber += dp12;
            if (LocaleController.isRTL) {
                this.nameLeft += dp12;
            }
        } else if (this.drawPremium) {
            int dp13 = AndroidUtilities.dp(36.0f);
            this.nameWidth -= dp13;
            this.nameAdditionalsForChannelSubscriber += dp13;
            if (LocaleController.isRTL) {
                this.nameLeft += dp13;
            }
        } else if (this.drawScam != 0) {
            int dp14 = AndroidUtilities.dp(6.0f) + (this.drawScam == 1 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth();
            this.nameWidth -= dp14;
            this.nameAdditionalsForChannelSubscriber += dp14;
            if (LocaleController.isRTL) {
                this.nameLeft += dp14;
            }
        }
        if (this.drawBotVerified) {
            this.nameWidth -= AndroidUtilities.dp(21.0f);
        }
        i8 = this.namePaddingEnd;
        if (i8 > 0) {
            this.nameWidth -= i8;
            if (LocaleController.isRTL) {
                this.nameLeft += i8;
            }
        }
        try {
            dp7 = this.nameWidth - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
                dp7 = 0;
            }
            if (charSequence23 instanceof String) {
                charSequence23 = ((String) charSequence23).replace('\n', ' ');
            }
            if (!this.nameLayoutEllipsizeByGradient) {
                this.nameLayoutFits = charSequence23.length() == TextUtils.ellipsize(charSequence23, Theme.dialogs_namePaint[this.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
                dp7 += AndroidUtilities.dp(48.0f);
                this.channelShouldUseLineWidth = this.nameLayoutFits;
            } else if (this.isForChannelSubscriberCell) {
                this.channelShouldUseLineWidth = charSequence23.length() == TextUtils.ellipsize(charSequence23, Theme.dialogs_namePaint[this.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
            }
            int i242 = dp7;
            float f22 = i242;
            this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(charSequence23.toString()) <= f22;
            if (!this.twoLinesForName) {
                charSequence23 = TextUtils.ellipsize(charSequence23, Theme.dialogs_namePaint[this.paintIndex], f22, TextUtils.TruncateAt.END);
            }
            CharSequence replaceEmoji2 = Emoji.replaceEmoji(charSequence23, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject182 = this.message;
            CharSequence charSequence43 = (messageObject182 == null && messageObject182.hasHighlightedWords() && (highlightText4 = AndroidUtilities.highlightText(replaceEmoji2, this.message.highlightedWords, this.resourcesProvider)) != null) ? highlightText4 : replaceEmoji2;
            if (!this.twoLinesForName) {
                this.nameLayout = StaticLayoutEx.createStaticLayout(charSequence43, Theme.dialogs_namePaint[this.paintIndex], i242, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i242, 2);
            } else {
                this.nameLayout = new StaticLayout(charSequence43, Theme.dialogs_namePaint[this.paintIndex], Math.max(i242, this.nameWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            this.errorTop = AndroidUtilities.dp(43.0f);
            this.pinTop = AndroidUtilities.dp(43.0f);
            this.countTop = AndroidUtilities.dp(43.0f);
            this.checkDrawTop = AndroidUtilities.dp(13.0f);
            int measuredWidth42 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
            if (!LocaleController.isRTL) {
                int dp15 = AndroidUtilities.dp(16.0f);
                this.messageNameLeft = dp15;
                this.messageLeft = dp15;
                this.typingLeft = dp15;
                this.buttonLeft = dp15;
                dp2 = getMeasuredWidth() - AndroidUtilities.dp(this.avatarStart + 56);
                dp3 = dp2 - AndroidUtilities.dp(31.0f);
            } else {
                int dp16 = AndroidUtilities.dp(this.messagePaddingStart + 6);
                this.messageNameLeft = dp16;
                this.messageLeft = dp16;
                this.typingLeft = dp16;
                this.buttonLeft = dp16;
                dp2 = AndroidUtilities.dp(this.avatarStart);
                dp3 = AndroidUtilities.dp(69.0f) + dp2;
            }
            i9 = measuredWidth42;
            this.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(56.0f));
            i10 = 0;
            while (true) {
                imageReceiverArr = this.thumbImage;
                if (i10 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i10].setImageCoords(((this.thumbSize + 2) * i10) + dp3, ((dp + AndroidUtilities.dp(31.0f)) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i10++;
                dp = dp;
            }
            i11 = dp;
        } else {
            int dp17 = AndroidUtilities.dp(9.0f);
            this.messageNameTop = AndroidUtilities.dp(31.0f);
            this.timeTop = AndroidUtilities.dp(16.0f);
            this.errorTop = AndroidUtilities.dp(39.0f);
            this.pinTop = AndroidUtilities.dp(39.0f);
            this.countTop = this.isTopic ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(39.0f);
            this.checkDrawTop = AndroidUtilities.dp(17.0f);
            int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp((this.messagePaddingStart + 23) - (LocaleController.isRTL ? 0 : 12));
            if (LocaleController.isRTL) {
                int dp18 = AndroidUtilities.dp(22.0f);
                this.messageNameLeft = dp18;
                this.messageLeft = dp18;
                this.typingLeft = dp18;
                this.buttonLeft = dp18;
                dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.avatarStart + 54);
                dp6 = dp5 - AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 9);
            } else {
                int dp19 = AndroidUtilities.dp(this.messagePaddingStart + 4);
                this.messageNameLeft = dp19;
                this.messageLeft = dp19;
                this.typingLeft = dp19;
                this.buttonLeft = dp19;
                dp5 = AndroidUtilities.dp(this.avatarStart);
                dp6 = AndroidUtilities.dp(67.0f) + dp5;
            }
            i9 = measuredWidth5;
            this.storyParams.originalAvatarRect.set(dp5, dp17, dp5 + AndroidUtilities.dp(54.0f), dp17 + AndroidUtilities.dp(54.0f));
            int i37 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr2 = this.thumbImage;
                if (i37 >= imageReceiverArr2.length) {
                    break;
                }
                imageReceiverArr2[i37].setImageCoords(((this.thumbSize + 2) * i37) + dp6, ((AndroidUtilities.dp(30.0f) + dp17) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags3 = this.tags) == null || dialogCellTags3.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.thumbSize), AndroidUtilities.dp(this.thumbSize));
                i37++;
                dp17 = dp17;
            }
            i11 = dp17;
        }
        int i252 = i9;
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
            int dp20 = AndroidUtilities.dp(31.0f);
            i252 -= dp20;
            if (!LocaleController.isRTL) {
                this.errorLeft = getMeasuredWidth() - AndroidUtilities.dp(34.0f);
            } else {
                this.errorLeft = AndroidUtilities.dp(11.0f);
                this.messageLeft += dp20;
                this.typingLeft += dp20;
                this.buttonLeft += dp20;
                this.messageNameLeft += dp20;
            }
        } else if (str6 != null || str8 != null || this.drawReactionMention) {
            if (str6 != null) {
                this.countWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(str6)));
                this.countLayout = new StaticLayout(str6, Theme.dialogs_countTextPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp21 = this.countWidth + AndroidUtilities.dp(18.0f);
                i252 -= dp21;
                if (!LocaleController.isRTL) {
                    this.countLeft = (getMeasuredWidth() - this.countWidth) - AndroidUtilities.dp(20.0f);
                } else {
                    this.countLeft = AndroidUtilities.dp(20.0f);
                    this.messageLeft += dp21;
                    this.typingLeft += dp21;
                    this.buttonLeft += dp21;
                    this.messageNameLeft += dp21;
                }
                this.drawCount = true;
            } else {
                this.countWidth = 0;
            }
            if (str8 != null) {
                if (this.currentDialogFolderId != 0) {
                    this.mentionWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(str8)));
                    this.mentionLayout = new StaticLayout(str8, Theme.dialogs_countTextPaint, this.mentionWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.mentionWidth = AndroidUtilities.dp(12.0f);
                }
                int dp22 = this.mentionWidth + AndroidUtilities.dp(18.0f);
                i252 -= dp22;
                if (!LocaleController.isRTL) {
                    int measuredWidth6 = (getMeasuredWidth() - this.mentionWidth) - AndroidUtilities.dp(20.0f);
                    int i38 = this.countWidth;
                    this.mentionLeft = measuredWidth6 - (i38 != 0 ? i38 + AndroidUtilities.dp(18.0f) : 0);
                } else {
                    int dp23 = AndroidUtilities.dp(20.0f);
                    int i39 = this.countWidth;
                    this.mentionLeft = dp23 + (i39 != 0 ? i39 + AndroidUtilities.dp(18.0f) : 0);
                    this.messageLeft += dp22;
                    this.typingLeft += dp22;
                    this.buttonLeft += dp22;
                    this.messageNameLeft += dp22;
                }
                this.drawMention = true;
            } else {
                this.mentionWidth = 0;
            }
            if (this.drawReactionMention) {
                int dp24 = AndroidUtilities.dp(24.0f);
                i252 -= dp24;
                if (!LocaleController.isRTL) {
                    int measuredWidth7 = getMeasuredWidth() - AndroidUtilities.dp(32.0f);
                    this.reactionMentionLeft = measuredWidth7;
                    if (this.drawMention) {
                        int i40 = this.mentionWidth;
                        this.reactionMentionLeft = measuredWidth7 - (i40 != 0 ? i40 + AndroidUtilities.dp(18.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i41 = this.reactionMentionLeft;
                        int i42 = this.countWidth;
                        this.reactionMentionLeft = i41 - (i42 != 0 ? i42 + AndroidUtilities.dp(18.0f) : 0);
                    }
                } else {
                    int dp25 = AndroidUtilities.dp(20.0f);
                    this.reactionMentionLeft = dp25;
                    if (this.drawMention) {
                        int i43 = this.mentionWidth;
                        this.reactionMentionLeft = dp25 + (i43 != 0 ? i43 + AndroidUtilities.dp(18.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i44 = this.reactionMentionLeft;
                        int i45 = this.countWidth;
                        this.reactionMentionLeft = i44 + (i45 != 0 ? i45 + AndroidUtilities.dp(18.0f) : 0);
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
            i252 -= dp26;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                dp4 = AndroidUtilities.dp(40.0f);
            } else {
                dp4 = AndroidUtilities.dp(this.isTopic ? 33.0f : 36.0f);
            }
            if (!LocaleController.isRTL) {
                this.openButtonRect.set((getMeasuredWidth() - dp26) - AndroidUtilities.dp(13.0f), dp4, getMeasuredWidth() - AndroidUtilities.dp(13.0f), dp4 + AndroidUtilities.dp(28.0f));
            } else {
                this.openButtonRect.set(AndroidUtilities.dp(13.0f), dp4, AndroidUtilities.dp(13.0f) + dp26, dp4 + AndroidUtilities.dp(28.0f));
                int i46 = dp26 + dp27;
                this.messageLeft += i46;
                this.typingLeft += i46;
                this.buttonLeft += i46;
                this.messageNameLeft += i46;
            }
            this.drawCount = false;
            this.drawMention = false;
        } else {
            if (getIsPinned()) {
                int intrinsicWidth3 = Theme.dialogs_pinnedDrawable.getIntrinsicWidth() + AndroidUtilities.dp(8.0f);
                i252 -= intrinsicWidth3;
                if (LocaleController.isRTL) {
                    this.messageLeft += intrinsicWidth3;
                    this.typingLeft += intrinsicWidth3;
                    this.buttonLeft += intrinsicWidth3;
                    this.messageNameLeft += intrinsicWidth3;
                }
            }
            this.drawCount = false;
            this.drawMention = false;
        }
        if (z14) {
            if (charSequence9 == null) {
                charSequence9 = "";
            }
            if (charSequence9.length() > 150) {
                charSequence9 = charSequence9.subSequence(0, 150);
            }
            if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence22 != null) {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceNewLines(charSequence9);
            } else {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceTwoNewLinesToOne(charSequence9);
            }
            charSequence9 = Emoji.replaceEmoji(replaceTwoNewLinesToOne, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject20 = this.message;
            if (messageObject20 != null && (highlightText3 = AndroidUtilities.highlightText(charSequence9, messageObject20.highlightedWords, this.resourcesProvider)) != null) {
                charSequence9 = highlightText3;
            }
        }
        int max22 = Math.max(AndroidUtilities.dp(12.0f), i252);
        this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
            this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
        }
        if (!isForumCell()) {
            this.messageTop = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
            int i47 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.thumbImage;
                if (i47 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i47].setImageY(this.buttonTop);
                i47++;
            }
        } else if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && charSequence22 != null && (this.currentDialogFolderId == 0 || this.currentDialogFolderDialogsCount == 1)) {
            try {
                MessageObject messageObject21 = this.message;
                if (messageObject21 != null && messageObject21.hasHighlightedWords() && (highlightText2 = AndroidUtilities.highlightText(charSequence22, this.message.highlightedWords, this.resourcesProvider)) != null) {
                    charSequence22 = highlightText2;
                }
                this.messageNameLayout = StaticLayoutEx.createStaticLayout(charSequence22, Theme.dialogs_messageNamePaint, max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, max22, 1);
            } catch (Exception e4) {
                FileLog.e(e4);
            }
            this.messageTop = AndroidUtilities.dp(51.0f);
            int dp28 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
            int i48 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.thumbImage;
                if (i48 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i48].setImageY(i11 + dp28 + AndroidUtilities.dp(40.0f));
                i48++;
            }
        } else {
            this.messageNameLayout = null;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                this.messageTop = AndroidUtilities.dp(32.0f);
                int dp29 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
                int i49 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.thumbImage;
                    if (i49 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i49].setImageY(i11 + dp29 + AndroidUtilities.dp(21.0f));
                    i49++;
                }
            } else {
                this.messageTop = AndroidUtilities.dp(39.0f);
            }
        }
        CharSequence charSequence40222 = charSequence22;
        if (this.twoLinesForName) {
            this.messageTop += AndroidUtilities.dp(20.0f);
        }
        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
        try {
            this.buttonCreated = false;
            if (TextUtils.isEmpty(charSequence7)) {
                this.buttonLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence7, this.currentMessagePaint.getFontMetricsInt(), false), this.currentMessagePaint, max22 - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.currentMessagePaint, max22 - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            if (!TextUtils.isEmpty(charSequence24)) {
                if (!this.useForceThreeLines) {
                    if (!SharedConfig.useThreeLinesLayout) {
                    }
                    this.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence24, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                if (!hasTags()) {
                    this.typingLayout = StaticLayoutEx.createStaticLayout(charSequence24, Theme.dialogs_messagePrintingPaint[this.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, 1);
                }
                this.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence24, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max22, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
                    i12 = 1;
                    this.messageLayout = staticLayout2;
                    FileLog.e(e);
                    i13 = max22;
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans222 = this.animatedEmojiStack;
                    Layout[] layoutArr222 = new Layout[i12];
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
            i12 = 1;
        }
        if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
            if (this.currentDialogFolderId != 0) {
                if (this.currentDialogFolderDialogsCount > 1) {
                    this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                    charSequence25 = charSequence40222;
                    charSequence40222 = null;
                    alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                        if (this.thumbsCount > 0 && charSequence40222 != null) {
                            max22 += AndroidUtilities.dp(5.0f);
                        }
                        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence25, this.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence40222 != null ? 1 : 2);
                    } else {
                        if (this.thumbsCount > 0) {
                            max22 += AndroidUtilities.dp((r0 * (this.thumbSize + 2)) + 3);
                            if (LocaleController.isRTL && !isForumCell()) {
                                this.messageLeft -= AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3);
                            }
                        }
                        this.messageLayout = new StaticLayout(charSequence25, this.currentMessagePaint, max22, alignment, 1.0f, 0.0f, false);
                    }
                    i13 = max22;
                    this.spoilersPool.addAll(this.spoilers);
                    this.spoilers.clear();
                    i12 = 1;
                    SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2222 = this.animatedEmojiStack;
                    Layout[] layoutArr2222 = new Layout[i12];
                    layoutArr2222[0] = this.messageLayout;
                    this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans2222, layoutArr2222);
                    if (!LocaleController.isRTL) {
                        StaticLayout staticLayout3 = this.nameLayout;
                        if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                            float lineLeft = this.nameLayout.getLineLeft(0);
                            double ceil = Math.ceil(this.nameLayout.getLineWidth(0));
                            int dp30 = this.nameLeft + AndroidUtilities.dp(12.0f);
                            this.nameLeft = dp30;
                            if (this.drawBotVerified) {
                                this.nameLeft = dp30 + AndroidUtilities.dp(21.0f);
                            }
                            if (this.nameLayoutEllipsizeByGradient) {
                                ceil = Math.min(this.nameWidth, ceil);
                            }
                            if ((this.dialogMuted || this.drawUnmute) && !this.drawVerified && this.drawScam == 0) {
                                this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                            } else if (this.drawVerified) {
                                this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_verifiedDrawable.getIntrinsicWidth());
                            } else if (this.drawPremium) {
                                this.nameMuteLeft = (int) ((this.nameLeft + ((this.nameWidth - ceil) - lineLeft)) - AndroidUtilities.dp(24.0f));
                            } else if (this.drawScam != 0) {
                                this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil)) - AndroidUtilities.dp(6.0f)) - (this.drawScam == i12 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).getIntrinsicWidth());
                            } else {
                                this.nameMuteLeft = (int) (((this.nameLeft + (this.nameWidth - ceil)) - AndroidUtilities.dp(6.0f)) - Theme.dialogs_muteDrawable.getIntrinsicWidth());
                            }
                            if (lineLeft == 0.0f) {
                                double d = this.nameWidth;
                                if (ceil < d) {
                                    this.nameLeft = (int) (this.nameLeft + (d - ceil));
                                }
                            }
                        }
                        StaticLayout staticLayout4 = this.messageLayout;
                        if (staticLayout4 != null && (lineCount6 = staticLayout4.getLineCount()) > 0) {
                            int i50 = 0;
                            int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            while (true) {
                                if (i50 >= lineCount6) {
                                    i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    break;
                                } else if (this.messageLayout.getLineLeft(i50) != 0.0f) {
                                    i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    i51 = 0;
                                    break;
                                } else {
                                    i51 = Math.min(i51, (int) (i13 - Math.ceil(this.messageLayout.getLineWidth(i50))));
                                    i50 += i12;
                                }
                            }
                            if (i51 != i16) {
                                this.messageLeft += i51;
                            }
                        }
                        StaticLayout staticLayout5 = this.typingLayout;
                        if (staticLayout5 != null && (lineCount5 = staticLayout5.getLineCount()) > 0) {
                            int i52 = 0;
                            int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            while (true) {
                                if (i52 >= lineCount5) {
                                    i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    break;
                                } else if (this.typingLayout.getLineLeft(i52) != 0.0f) {
                                    i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    i53 = 0;
                                    break;
                                } else {
                                    i53 = Math.min(i53, (int) (i13 - Math.ceil(this.typingLayout.getLineWidth(i52))));
                                    i52 += i12;
                                }
                            }
                            if (i53 != i15) {
                                this.typingLeft += i53;
                            }
                        }
                        StaticLayout staticLayout6 = this.messageNameLayout;
                        if (staticLayout6 != null && staticLayout6.getLineCount() > 0 && this.messageNameLayout.getLineLeft(0) == 0.0f) {
                            double ceil2 = Math.ceil(this.messageNameLayout.getLineWidth(0));
                            double d2 = i13;
                            if (ceil2 < d2) {
                                this.messageNameLeft = (int) (this.messageNameLeft + (d2 - ceil2));
                            }
                        }
                        StaticLayout staticLayout7 = this.buttonLayout;
                        if (staticLayout7 != null && (lineCount4 = staticLayout7.getLineCount()) > 0) {
                            int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            for (int i55 = 0; i55 < lineCount4; i55 += i12) {
                                i54 = (int) Math.min(i54, this.buttonLayout.getWidth() - this.buttonLayout.getLineRight(i55));
                            }
                            this.buttonLeft += i54;
                        }
                    } else {
                        StaticLayout staticLayout8 = this.nameLayout;
                        if (staticLayout8 != null && staticLayout8.getLineCount() > 0) {
                            float lineRight = this.nameLayout.getLineRight(0);
                            if (this.nameLayoutEllipsizeByGradient) {
                                lineRight = Math.min(this.nameWidth, lineRight);
                            }
                            if (lineRight == this.nameWidth) {
                                double ceil3 = Math.ceil(this.nameLayout.getLineWidth(0));
                                if (this.nameLayoutEllipsizeByGradient) {
                                    ceil3 = Math.min(this.nameWidth, ceil3);
                                }
                                double d3 = this.nameWidth;
                                if (ceil3 < d3) {
                                    this.nameLeft = (int) (this.nameLeft - (d3 - ceil3));
                                }
                            }
                            if (this.drawBotVerified) {
                                this.nameLeft += AndroidUtilities.dp(21.0f);
                            }
                            this.nameMuteLeft = (int) (this.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
                        }
                        StaticLayout staticLayout9 = this.messageLayout;
                        if (staticLayout9 != null && (lineCount3 = staticLayout9.getLineCount()) > 0) {
                            float f3 = 2.14748365E9f;
                            for (int i56 = 0; i56 < lineCount3; i56 += i12) {
                                f3 = Math.min(f3, this.messageLayout.getLineLeft(i56));
                            }
                            this.messageLeft = (int) (this.messageLeft - f3);
                        }
                        StaticLayout staticLayout10 = this.buttonLayout;
                        if (staticLayout10 != null && (lineCount2 = staticLayout10.getLineCount()) > 0) {
                            float f4 = 2.14748365E9f;
                            for (int i57 = 0; i57 < lineCount2; i57 += i12) {
                                f4 = Math.min(f4, this.buttonLayout.getLineLeft(i57));
                            }
                            this.buttonLeft = (int) (this.buttonLeft - f4);
                        }
                        StaticLayout staticLayout11 = this.typingLayout;
                        if (staticLayout11 != null && (lineCount = staticLayout11.getLineCount()) > 0) {
                            float f5 = 2.14748365E9f;
                            for (int i58 = 0; i58 < lineCount; i58 += i12) {
                                f5 = Math.min(f5, this.typingLayout.getLineLeft(i58));
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
                        if (i3 < 0 && (i14 = i3 + 1) < this.typingLayout.getText().length()) {
                            primaryHorizontal = this.typingLayout.getPrimaryHorizontal(i3);
                            primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(i14);
                        } else {
                            primaryHorizontal = this.typingLayout.getPrimaryHorizontal(0);
                            primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(i12);
                        }
                        if (primaryHorizontal >= primaryHorizontal2) {
                            this.statusDrawableLeft = (int) (this.typingLeft + primaryHorizontal);
                        } else {
                            this.statusDrawableLeft = (int) (this.typingLeft + primaryHorizontal2 + AndroidUtilities.dp(3.0f));
                        }
                    }
                    updateThumbsPosition();
                }
                if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence40222 != null || (ChatObject.isMonoForum(this.chat) && ChatObject.canManageMonoForum(this.currentAccount, this.chat))) {
                    if (isForumCell() && (charSequence9 instanceof Spanned) && ((FixedWidthSpan[]) ((Spanned) charSequence9).getSpans(0, charSequence9.length(), FixedWidthSpan.class)).length <= 0) {
                        ellipsize = TextUtils.ellipsize(charSequence9, this.currentMessagePaint, max22 - AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 15), TextUtils.TruncateAt.END);
                    } else {
                        ellipsize = TextUtils.ellipsize(charSequence9, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                    }
                    charSequence9 = ellipsize;
                }
                charSequence25 = charSequence9;
                alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                if (!this.useForceThreeLines) {
                }
                if (this.thumbsCount > 0) {
                    max22 += AndroidUtilities.dp(5.0f);
                }
                this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence25, this.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence40222 != null ? 1 : 2);
                i13 = max22;
                this.spoilersPool.addAll(this.spoilers);
                this.spoilers.clear();
                i12 = 1;
                SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans22222 = this.animatedEmojiStack;
                Layout[] layoutArr22222 = new Layout[i12];
                layoutArr22222[0] = this.messageLayout;
                this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans22222, layoutArr22222);
                if (!LocaleController.isRTL) {
                }
                staticLayout = this.typingLayout;
                if (staticLayout != null) {
                    if (i3 < 0) {
                    }
                    primaryHorizontal = this.typingLayout.getPrimaryHorizontal(0);
                    primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(i12);
                    if (primaryHorizontal >= primaryHorizontal2) {
                    }
                }
                updateThumbsPosition();
            }
        }
        if (!this.useForceThreeLines) {
            if (isForumCell()) {
            }
            ellipsize = TextUtils.ellipsize(charSequence9, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
            charSequence9 = ellipsize;
            charSequence25 = charSequence9;
            alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            if (!this.useForceThreeLines) {
            }
            if (this.thumbsCount > 0) {
            }
            this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence25, this.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence40222 != null ? 1 : 2);
            i13 = max22;
            this.spoilersPool.addAll(this.spoilers);
            this.spoilers.clear();
            i12 = 1;
            SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans222222 = this.animatedEmojiStack;
            Layout[] layoutArr222222 = new Layout[i12];
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
        ellipsize = TextUtils.ellipsize(charSequence9, this.currentMessagePaint, max22 - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
        charSequence9 = ellipsize;
        charSequence25 = charSequence9;
        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        if (!this.useForceThreeLines) {
        }
        if (this.thumbsCount > 0) {
        }
        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence25, this.currentMessagePaint, max22, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max22, charSequence40222 != null ? 1 : 2);
        i13 = max22;
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        i12 = 1;
        SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2222222 = this.animatedEmojiStack;
        Layout[] layoutArr2222222 = new Layout[i12];
        layoutArr2222222[0] = this.messageLayout;
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, emojiGroupedSpans2222222, layoutArr2222222);
        if (!LocaleController.isRTL) {
        }
        staticLayout = this.typingLayout;
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
                    Theme.dialogs_clockDrawable.setAlpha(NotificationCenter.didApplyNewTheme);
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
                        Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.didApplyNewTheme);
                    }
                    if (z4 || f == 0.0f) {
                        return;
                    }
                    canvas.restore();
                    Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.didApplyNewTheme);
                    Theme.dialogs_checkReadDrawable.setAlpha(NotificationCenter.didApplyNewTheme);
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
                    Theme.dialogs_checkDrawable.setAlpha(NotificationCenter.didApplyNewTheme);
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
                CheckBox2 checkBox22 = new CheckBox2(getContext(), 21, this.resourcesProvider) { // from class: org.telegram.ui.Cells.DialogCell.2
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
                                    this.countAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.DialogCell.3
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
                                            int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(format)));
                                            TextPaint textPaint = Theme.dialogs_countTextPaint;
                                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                            this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                            this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, Theme.dialogs_countTextPaint, max, alignment, 1.0f, 0.0f, false);
                                            this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, Theme.dialogs_countTextPaint, max, alignment, 1.0f, 0.0f, false);
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
                                    this.reactionsMentionsAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.DialogCell.4
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

    /* JADX WARN: Code restructure failed: missing block: B:203:0x0c2e, code lost:
    
        if (r3.lastKnownTypingType >= 0) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x143d, code lost:
    
        if (r55.reactionsMentionsChangeProgress != r14) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0871, code lost:
    
        if (r1.type != 2) goto L261;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0cd2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0ee3  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0fae  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x1016  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x1022 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x107d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x10b7  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x124c  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x1270  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x14c9  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x1669  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1699  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x16aa  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x16cf  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x16e9  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1730  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1755  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x1760  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x176f  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x1777  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x177b  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x17e4  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x17ed  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x17f4  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1836  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x18ba  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x190a  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x193a  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x198c  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x199f  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x19e1  */
    /* JADX WARN: Removed duplicated region for block: B:610:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x19c3  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x1961  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x1912  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x1923  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x16c9  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x12bb  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x139b  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x1439  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x1474  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x110b  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x1121  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x1171  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x0fa3  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0edd  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x0ccc  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v58 */
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
        String str;
        int i3;
        boolean z;
        boolean z2;
        RLottieDrawable rLottieDrawable;
        int i4;
        float f2;
        int i5;
        Canvas canvas2;
        ?? r10;
        int i6;
        float f3;
        float f4;
        boolean z3;
        float f5;
        boolean z4;
        boolean z5;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z6;
        boolean z7;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        float f6;
        int i7;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        boolean z9;
        boolean z10;
        float f8;
        Canvas canvas3;
        int i15;
        boolean z11;
        DialogCellTags dialogCellTags;
        int i16;
        char c;
        float dp;
        float f9;
        StaticLayout staticLayout;
        int i17;
        float f10;
        float f11;
        DialogUpdateHelper dialogUpdateHelper;
        float f12;
        StaticLayout staticLayout2;
        float f13;
        StaticLayout staticLayout3;
        StaticLayout staticLayout4;
        int i18;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic3;
        float f14 = 12.0f;
        float f15 = 12.5f;
        if (this.currentDialogId == 0 && this.customDialog == null) {
            return;
        }
        if (!this.visibleOnScreen && !this.drawingForBlur) {
            return;
        }
        if (this.drawArchive && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic3 = this.forumTopic) != null && tL_forumTopic3.id == 1)) && (pullForegroundDrawable2 = this.archivedChatsDrawable) != null && pullForegroundDrawable2.outProgress == 0.0f && this.translationX == 0.0f)) {
            if (this.drawingForBlur) {
                return;
            }
            canvas.save();
            canvas.translate(0.0f, (-this.translateY) - this.rightFragmentOffset);
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas);
            canvas.restore();
            return;
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
            int i20 = i;
            String str3 = string;
            if (this.swipeCanceled && (rLottieDrawable = this.lastDrawTranslationDrawable) != null) {
                this.translationDrawable = rLottieDrawable;
                i20 = this.lastDrawSwipeMessageStringId;
            } else {
                this.lastDrawTranslationDrawable = this.translationDrawable;
                this.lastDrawSwipeMessageStringId = i20;
            }
            int i21 = i20;
            if (!this.translationAnimationStarted && Math.abs(this.translationX) > AndroidUtilities.dp(43.0f)) {
                this.translationAnimationStarted = true;
                this.translationDrawable.setProgress(0.0f);
                this.translationDrawable.setCallback(this);
                this.translationDrawable.start();
            }
            float measuredWidth = this.translationX + getMeasuredWidth();
            if (this.currentRevealProgress < 1.0f) {
                Theme.dialogs_pinnedPaint.setColor(color);
                f = 0.0f;
                i2 = i21;
                canvas.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                if (this.currentRevealProgress == 0.0f) {
                    if (Theme.dialogs_archiveDrawableRecolored) {
                        Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                        z2 = false;
                        Theme.dialogs_archiveDrawableRecolored = false;
                    } else {
                        z2 = false;
                    }
                    if (Theme.dialogs_hidePsaDrawableRecolored) {
                        Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                        RLottieDrawable rLottieDrawable2 = Theme.dialogs_hidePsaDrawable;
                        int i22 = Theme.key_chats_archiveBackground;
                        rLottieDrawable2.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i22));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i22));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i22));
                        Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                        Theme.dialogs_hidePsaDrawableRecolored = z2;
                    }
                }
            } else {
                i2 = i21;
                f = 0.0f;
            }
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.translationDrawable.getIntrinsicWidth() / 2);
            int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(54.0f)) / 2;
            int intrinsicWidth = (this.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
            int intrinsicHeight = (this.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
            if (this.currentRevealProgress > f) {
                canvas.save();
                str = str3;
                canvas.clipRect(measuredWidth - AndroidUtilities.dp(8.0f), f, getMeasuredWidth(), getMeasuredHeight());
                Theme.dialogs_pinnedPaint.setColor(i19);
                canvas.drawCircle(intrinsicWidth, intrinsicHeight, ((float) Math.sqrt((intrinsicWidth * intrinsicWidth) + ((intrinsicHeight - getMeasuredHeight()) * (intrinsicHeight - getMeasuredHeight())))) * AndroidUtilities.accelerateInterpolator.getInterpolation(this.currentRevealProgress), Theme.dialogs_pinnedPaint);
                canvas.restore();
                if (Theme.dialogs_archiveDrawableRecolored) {
                    z = 1;
                } else {
                    Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archivePinBackground));
                    z = 1;
                    Theme.dialogs_archiveDrawableRecolored = true;
                }
                i3 = z;
                if (!Theme.dialogs_hidePsaDrawableRecolored) {
                    Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                    RLottieDrawable rLottieDrawable3 = Theme.dialogs_hidePsaDrawable;
                    int i23 = Theme.key_chats_archivePinBackground;
                    rLottieDrawable3.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i23));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i23));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i23));
                    Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                    Theme.dialogs_hidePsaDrawableRecolored = z;
                    i3 = z;
                }
            } else {
                str = str3;
                i3 = 1;
            }
            canvas.save();
            canvas.translate(measuredWidth2, measuredHeight);
            float f16 = this.currentRevealBounceProgress;
            if (f16 != 0.0f && f16 != 1.0f) {
                float interpolation = this.interpolator.getInterpolation(f16) + 1.0f;
                canvas.scale(interpolation, interpolation, this.translationDrawable.getIntrinsicWidth() / 2, this.translationDrawable.getIntrinsicHeight() / 2);
            }
            BaseCell.setDrawableBounds((Drawable) this.translationDrawable, 0, 0);
            this.translationDrawable.draw(canvas);
            canvas.restore();
            canvas.clipRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            String str4 = str;
            int ceil = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(str4));
            int i24 = i2;
            if (this.swipeMessageTextId != i24 || this.swipeMessageWidth != getMeasuredWidth()) {
                this.swipeMessageTextId = i24;
                this.swipeMessageWidth = getMeasuredWidth();
                TextPaint textPaint = Theme.dialogs_archiveTextPaint;
                int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                StaticLayout staticLayout5 = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                this.swipeMessageTextLayout = staticLayout5;
                if (staticLayout5.getLineCount() > i3) {
                    this.swipeMessageTextLayout = new StaticLayout(str4, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                }
            }
            if (this.swipeMessageTextLayout != null) {
                canvas.save();
                canvas.translate((getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.swipeMessageTextLayout.getWidth() / 2.0f), measuredHeight + AndroidUtilities.dp(38.0f) + (this.swipeMessageTextLayout.getLineCount() > i3 ? -AndroidUtilities.dp(4.0f) : 0.0f));
                this.swipeMessageTextLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            i4 = i3;
        } else {
            RLottieDrawable rLottieDrawable4 = this.translationDrawable;
            if (rLottieDrawable4 != null) {
                rLottieDrawable4.stop();
                this.translationDrawable.setProgress(0.0f);
                this.translationDrawable.setCallback(null);
                this.translationDrawable = null;
                this.translationAnimationStarted = false;
            }
            i4 = 1;
        }
        if (this.translationX != 0.0f) {
            canvas.save();
            canvas.translate(this.translationX, 0.0f);
        }
        float dp2 = AndroidUtilities.dp(8.0f) * this.cornerProgress;
        if (this.isSelected) {
            f2 = 0.0f;
            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), getCollapsedHeight(), this.rightFragmentOpenedProgress));
            this.rect.offset(0.0f, (-this.translateY) + this.collapseOffset);
            canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
        } else {
            f2 = 0.0f;
        }
        canvas.save();
        canvas.translate(f2, (-this.rightFragmentOffset) * this.rightFragmentOpenedProgress);
        if (this.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || this.archiveBackgroundProgress != f2)) {
            Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, 1.0f));
            Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
            i5 = 0;
            canvas.drawRect(-this.xOffset, 0.0f, getMeasuredWidth(), getMeasuredHeight() - this.translateY, Theme.dialogs_pinnedPaint);
        } else {
            i5 = 0;
            if (getIsPinned() || this.drawPinBackground) {
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
                canvas.drawRect(-this.xOffset, 0.0f, getMeasuredWidth(), getMeasuredHeight() - this.translateY, Theme.dialogs_pinnedPaint);
            }
        }
        canvas.restore();
        this.updateHelper.updateAnimationValues();
        if (this.collapseOffset != 0.0f) {
            canvas.save();
            canvas.translate(0.0f, this.collapseOffset);
        }
        float f17 = this.rightFragmentOpenedProgress;
        if (f17 != 1.0f) {
            if (f17 != 0.0f) {
                float clamp = Utilities.clamp(f17 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    i18 = canvas.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + i4) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.rightFragmentOpenedProgress) * 255.0f), 31);
                } else {
                    int save = canvas.save();
                    canvas.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + i4) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i18 = save;
                }
                f6 = 0.0f;
                canvas.translate((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress, 0.0f);
                i7 = i18;
            } else {
                f6 = 0.0f;
                i7 = -1;
            }
            if (this.translationX != f6 || this.cornerProgress != f6) {
                canvas.save();
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                this.rect.set(getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.rect.offset(0.0f, -this.translateY);
                canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_pinnedPaint);
                if (this.isSelected) {
                    canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
                }
                if (this.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || this.archiveBackgroundProgress != 0.0f)) {
                    Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(i5, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, 1.0f));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
                    canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_pinnedPaint);
                } else if (getIsPinned() || this.drawPinBackground) {
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
                    canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_pinnedPaint);
                }
                canvas.restore();
            }
            if (this.translationX != 0.0f) {
                float f18 = this.cornerProgress;
                if (f18 < 1.0f) {
                    float f19 = f18 + 0.10666667f;
                    this.cornerProgress = f19;
                    if (f19 > 1.0f) {
                        this.cornerProgress = 1.0f;
                    }
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                float f20 = this.cornerProgress;
                if (f20 > 0.0f) {
                    float f21 = f20 - 0.10666667f;
                    this.cornerProgress = f21;
                    if (f21 < 0.0f) {
                        this.cornerProgress = 0.0f;
                    }
                    z8 = true;
                }
                z8 = false;
            }
            if (this.drawNameLock) {
                BaseCell.setDrawableBounds(Theme.dialogs_lockDrawable, this.nameLockLeft, this.nameLockTop);
                Theme.dialogs_lockDrawable.draw(canvas);
            }
            int dp3 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 13.0f);
            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                dp3 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
            }
            if (this.nameLayout != null) {
                if (this.nameLayoutEllipsizeByGradient && !this.nameLayoutFits) {
                    if (this.nameLayoutEllipsizeLeft && this.fadePaint == null) {
                        Paint paint = new Paint();
                        this.fadePaint = paint;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{-1, i5}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (this.fadePaintBack == null) {
                        Paint paint2 = new Paint();
                        this.fadePaintBack = paint2;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{i5, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        this.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), NotificationCenter.didApplyNewTheme, 31);
                    int i25 = this.nameLeft;
                    canvas.clipRect(i25, i5, this.nameWidth + i25, getMeasuredHeight());
                }
                if (this.currentDialogFolderId != 0) {
                    TextPaint textPaint2 = Theme.dialogs_namePaint[this.paintIndex];
                    int color3 = Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider);
                    textPaint2.linkColor = color3;
                    textPaint2.setColor(color3);
                } else {
                    if (this.encryptedChat == null) {
                        CustomDialog customDialog = this.customDialog;
                        if (customDialog != null) {
                        }
                        TextPaint textPaint3 = Theme.dialogs_namePaint[this.paintIndex];
                        int color4 = Theme.getColor(Theme.key_chats_name, this.resourcesProvider);
                        textPaint3.linkColor = color4;
                        textPaint3.setColor(color4);
                    }
                    TextPaint textPaint4 = Theme.dialogs_namePaint[this.paintIndex];
                    int color5 = Theme.getColor(Theme.key_chats_secretName, this.resourcesProvider);
                    textPaint4.linkColor = color5;
                    textPaint4.setColor(color5);
                }
                canvas.save();
                canvas.translate(this.nameLeft + this.nameLayoutTranslateX, dp3);
                SpoilerEffect.layoutDrawMaybe(this.nameLayout, canvas);
                StaticLayout staticLayout6 = this.nameLayout;
                i8 = i7;
                i11 = -1;
                i9 = 1;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, this.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i5, staticLayout6.getPaint().getColor()));
                canvas.restore();
                if (!this.nameLayoutEllipsizeByGradient || this.nameLayoutFits) {
                    i10 = 2;
                } else {
                    canvas.save();
                    if (this.nameLayoutEllipsizeLeft) {
                        canvas.translate(this.nameLeft, 0.0f);
                        i10 = 2;
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaint);
                    } else {
                        i10 = 2;
                        canvas.translate((this.nameLeft + this.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaintBack);
                    }
                    canvas.restore();
                    canvas.restore();
                }
            } else {
                i8 = i7;
                i9 = 1;
                i10 = 2;
                i11 = -1;
            }
            if (this.timeLayout != null && this.currentDialogFolderId == 0) {
                canvas.save();
                canvas.translate(this.timeLeft, this.timeTop);
                SpoilerEffect.layoutDrawMaybe(this.timeLayout, canvas);
                canvas.restore();
            }
            if (drawLock2()) {
                Theme.dialogs_lock2Drawable.setBounds(this.lock2Left, this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i10), this.lock2Left + Theme.dialogs_lock2Drawable.getIntrinsicWidth(), this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i10) + Theme.dialogs_lock2Drawable.getIntrinsicHeight());
                Theme.dialogs_lock2Drawable.draw(canvas);
            }
            if (this.messageNameLayout == null || isForumCell()) {
                i12 = 4;
                f7 = 0.0f;
                i13 = 2;
            } else {
                if (this.currentDialogFolderId != 0) {
                    TextPaint textPaint5 = Theme.dialogs_messageNamePaint;
                    int color6 = Theme.getColor(Theme.key_chats_nameMessageArchived_threeLines, this.resourcesProvider);
                    textPaint5.linkColor = color6;
                    textPaint5.setColor(color6);
                } else if (this.draftMessage != null) {
                    TextPaint textPaint6 = Theme.dialogs_messageNamePaint;
                    int color7 = Theme.getColor(Theme.key_chats_draft, this.resourcesProvider);
                    textPaint6.linkColor = color7;
                    textPaint6.setColor(color7);
                } else {
                    TextPaint textPaint7 = Theme.dialogs_messageNamePaint;
                    int color8 = Theme.getColor(Theme.key_chats_nameMessage_threeLines, this.resourcesProvider);
                    textPaint7.linkColor = color8;
                    textPaint7.setColor(color8);
                }
                canvas.save();
                canvas.translate(this.messageNameLeft, this.messageNameTop);
                try {
                    SpoilerEffect.layoutDrawMaybe(this.messageNameLayout, canvas);
                    staticLayout4 = this.messageNameLayout;
                    i13 = 2;
                    f7 = 0.0f;
                    i12 = 4;
                } catch (Exception e) {
                    e = e;
                    i12 = 4;
                    f7 = 0.0f;
                    i13 = 2;
                }
                try {
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, this.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i9, staticLayout4.getPaint().getColor()));
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                    canvas.restore();
                    if (this.messageLayout != null) {
                    }
                    if (this.buttonLayout == null) {
                    }
                    if (this.currentDialogFolderId == 0) {
                    }
                    if (this.drawBotVerified) {
                    }
                    if (this.drawUnmute) {
                    }
                    if (this.dialogsType == i14) {
                    }
                    if (this.drawVerified) {
                    }
                    if (!this.drawReorder) {
                    }
                    Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                    Theme.dialogs_reorderDrawable.draw(canvas);
                    if (this.drawError) {
                    }
                    canvas3 = canvas;
                    if (this.thumbsCount > 0) {
                    }
                    i15 = -1;
                    z11 = false;
                    dialogCellTags = this.tags;
                    if (dialogCellTags != null) {
                    }
                    i16 = i8;
                    if (i16 != i15) {
                    }
                    z3 = z8;
                    r10 = z11;
                    canvas2 = canvas3;
                    if (this.animatingArchiveAvatar) {
                    }
                    if (this.drawAvatar) {
                    }
                    if (this.animatingArchiveAvatar) {
                    }
                    if (this.avatarImage.getVisible()) {
                    }
                    if (this.rightFragmentOpenedProgress > f4) {
                    }
                    if (this.collapseOffset != f4) {
                    }
                    if (this.translationX != f4) {
                    }
                    if (this.drawArchive) {
                    }
                    if (this.useSeparator) {
                    }
                    if (this.clipProgress != f4) {
                    }
                    z4 = this.drawReorder;
                    if (!z4) {
                    }
                    if (z4) {
                    }
                    if (!this.archiveHidden) {
                    }
                }
                canvas.restore();
            }
            if (this.messageLayout != null) {
                if (this.currentDialogFolderId != 0) {
                    if (this.chat != null) {
                        TextPaint textPaint8 = Theme.dialogs_messagePaint[this.paintIndex];
                        int color9 = Theme.getColor(Theme.key_chats_nameMessageArchived, this.resourcesProvider);
                        textPaint8.linkColor = color9;
                        textPaint8.setColor(color9);
                    } else {
                        TextPaint textPaint9 = Theme.dialogs_messagePaint[this.paintIndex];
                        int color10 = Theme.getColor(Theme.key_chats_messageArchived, this.resourcesProvider);
                        textPaint9.linkColor = color10;
                        textPaint9.setColor(color10);
                    }
                } else {
                    TextPaint textPaint10 = Theme.dialogs_messagePaint[this.paintIndex];
                    int color11 = Theme.getColor(Theme.key_chats_message, this.resourcesProvider);
                    textPaint10.linkColor = color11;
                    textPaint10.setColor(color11);
                }
                float dp4 = AndroidUtilities.dp(14.0f);
                DialogUpdateHelper dialogUpdateHelper2 = this.updateHelper;
                if (dialogUpdateHelper2.typingOutToTop) {
                    f10 = this.messageTop - (dialogUpdateHelper2.typingProgres * dp4);
                } else {
                    f10 = this.messageTop + (dialogUpdateHelper2.typingProgres * dp4);
                }
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    f10 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                }
                if (this.updateHelper.typingProgres != 1.0f) {
                    canvas.save();
                    canvas.translate(this.messageLeft, f10);
                    int alpha = this.messageLayout.getPaint().getAlpha();
                    this.messageLayout.getPaint().setAlpha((int) (alpha * (1.0f - this.updateHelper.typingProgres)));
                    if (!this.spoilers.isEmpty()) {
                        try {
                            canvas.save();
                            SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
                            SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas);
                            staticLayout3 = this.messageLayout;
                            f11 = 1.0f;
                        } catch (Exception e3) {
                            e = e3;
                            f11 = 1.0f;
                        }
                        try {
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, this.animatedEmojiStack, -0.075f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i13, staticLayout3.getPaint().getColor()));
                            canvas.restore();
                            for (int i26 = 0; i26 < this.spoilers.size(); i26 += i9) {
                                SpoilerEffect spoilerEffect = (SpoilerEffect) this.spoilers.get(i26);
                                spoilerEffect.setColor(this.messageLayout.getPaint().getColor());
                                spoilerEffect.draw(canvas);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            FileLog.e(e);
                            this.messageLayout.getPaint().setAlpha(alpha);
                            canvas.restore();
                            canvas.save();
                            dialogUpdateHelper = this.updateHelper;
                            if (!dialogUpdateHelper.typingOutToTop) {
                            }
                            if (!this.useForceThreeLines) {
                                f12 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                canvas.translate(this.typingLeft, f12);
                                staticLayout2 = this.typingLayout;
                                if (staticLayout2 != null) {
                                    int alpha2 = staticLayout2.getPaint().getAlpha();
                                    this.typingLayout.getPaint().setAlpha((int) (alpha2 * this.updateHelper.typingProgres));
                                    this.typingLayout.draw(canvas);
                                    this.typingLayout.getPaint().setAlpha(alpha2);
                                }
                                canvas.restore();
                                if (this.typingLayout != null) {
                                }
                                if (this.buttonLayout == null) {
                                }
                                if (this.currentDialogFolderId == 0) {
                                }
                                if (this.drawBotVerified) {
                                }
                                if (this.drawUnmute) {
                                }
                                if (this.dialogsType == i14) {
                                }
                                if (this.drawVerified) {
                                }
                                if (!this.drawReorder) {
                                }
                                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                Theme.dialogs_reorderDrawable.draw(canvas);
                                if (this.drawError) {
                                }
                                canvas3 = canvas;
                                if (this.thumbsCount > 0) {
                                }
                                i15 = -1;
                                z11 = false;
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null) {
                                }
                                i16 = i8;
                                if (i16 != i15) {
                                }
                                z3 = z8;
                                r10 = z11;
                                canvas2 = canvas3;
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
                                if (this.rightFragmentOpenedProgress > f4) {
                                    if (!this.isTopic) {
                                    }
                                    z7 = z6;
                                    RectF rectF = this.storyParams.originalAvatarRect;
                                    int width = (int) (((rectF.left + rectF.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
                                    RectF rectF2 = this.storyParams.originalAvatarRect;
                                    drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width, (int) (((rectF2.left + rectF2.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
                                }
                                if (this.collapseOffset != f4) {
                                }
                                if (this.translationX != f4) {
                                }
                                if (this.drawArchive) {
                                    canvas.save();
                                    canvas2.translate(f4, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
                                    canvas2.clipRect((int) r10, (int) r10, getMeasuredWidth(), getMeasuredHeight());
                                    this.archivedChatsDrawable.draw(canvas2);
                                    canvas.restore();
                                }
                                if (this.useSeparator) {
                                }
                                if (this.clipProgress != f4) {
                                }
                                z4 = this.drawReorder;
                                if (!z4) {
                                }
                                if (z4) {
                                }
                                if (!this.archiveHidden) {
                                }
                            }
                            f12 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            canvas.translate(this.typingLeft, f12);
                            staticLayout2 = this.typingLayout;
                            if (staticLayout2 != null) {
                            }
                            canvas.restore();
                            if (this.typingLayout != null) {
                            }
                            if (this.buttonLayout == null) {
                            }
                            if (this.currentDialogFolderId == 0) {
                            }
                            if (this.drawBotVerified) {
                            }
                            if (this.drawUnmute) {
                            }
                            if (this.dialogsType == i14) {
                            }
                            if (this.drawVerified) {
                            }
                            if (!this.drawReorder) {
                            }
                            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                            Theme.dialogs_reorderDrawable.draw(canvas);
                            if (this.drawError) {
                            }
                            canvas3 = canvas;
                            if (this.thumbsCount > 0) {
                            }
                            i15 = -1;
                            z11 = false;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                            }
                            i16 = i8;
                            if (i16 != i15) {
                            }
                            z3 = z8;
                            r10 = z11;
                            canvas2 = canvas3;
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.drawAvatar) {
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.avatarImage.getVisible()) {
                            }
                            if (this.rightFragmentOpenedProgress > f4) {
                            }
                            if (this.collapseOffset != f4) {
                            }
                            if (this.translationX != f4) {
                            }
                            if (this.drawArchive) {
                            }
                            if (this.useSeparator) {
                            }
                            if (this.clipProgress != f4) {
                            }
                            z4 = this.drawReorder;
                            if (!z4) {
                            }
                            if (z4) {
                            }
                            if (!this.archiveHidden) {
                            }
                        }
                    } else {
                        f11 = 1.0f;
                        SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas);
                        StaticLayout staticLayout7 = this.messageLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout7, this.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i13, staticLayout7.getPaint().getColor()));
                    }
                    this.messageLayout.getPaint().setAlpha(alpha);
                    canvas.restore();
                } else {
                    f11 = 1.0f;
                }
                canvas.save();
                dialogUpdateHelper = this.updateHelper;
                if (!dialogUpdateHelper.typingOutToTop) {
                    f12 = this.messageTop + ((f11 - dialogUpdateHelper.typingProgres) * dp4);
                } else {
                    f12 = this.messageTop - ((f11 - dialogUpdateHelper.typingProgres) * dp4);
                }
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    f12 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                }
                canvas.translate(this.typingLeft, f12);
                staticLayout2 = this.typingLayout;
                if (staticLayout2 != null && this.updateHelper.typingProgres > f7) {
                    int alpha22 = staticLayout2.getPaint().getAlpha();
                    this.typingLayout.getPaint().setAlpha((int) (alpha22 * this.updateHelper.typingProgres));
                    this.typingLayout.draw(canvas);
                    this.typingLayout.getPaint().setAlpha(alpha22);
                }
                canvas.restore();
                if (this.typingLayout != null) {
                    int i27 = this.printingStringType;
                    if (i27 < 0) {
                        DialogUpdateHelper dialogUpdateHelper3 = this.updateHelper;
                        if (dialogUpdateHelper3.typingProgres > f7) {
                        }
                    }
                    if (i27 < 0) {
                        i27 = this.updateHelper.lastKnownTypingType;
                    }
                    StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(i27);
                    if (chatStatusDrawable != null) {
                        canvas.save();
                        chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_actionMessage), (int) (Color.alpha(r10) * this.updateHelper.typingProgres)));
                        DialogUpdateHelper dialogUpdateHelper4 = this.updateHelper;
                        if (dialogUpdateHelper4.typingOutToTop) {
                            f13 = this.messageTop + (dp4 * (f11 - dialogUpdateHelper4.typingProgres));
                        } else {
                            f13 = this.messageTop - (dp4 * (f11 - dialogUpdateHelper4.typingProgres));
                        }
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            f13 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                        }
                        if (i27 == i9 || i27 == i12) {
                            canvas.translate(this.statusDrawableLeft, f13 + (i27 == i9 ? AndroidUtilities.dp(f11) : 0));
                        } else {
                            canvas.translate(this.statusDrawableLeft, f13 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
                        }
                        chatStatusDrawable.draw(canvas);
                        invalidate();
                        canvas.restore();
                    }
                }
            }
            if (this.buttonLayout == null) {
                canvas.save();
                if (this.buttonBackgroundPaint == null) {
                    this.buttonBackgroundPaint = new Paint(i9);
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
                if (this.lastTopicMessageUnread && this.topMessageTopicEndIndex != this.topMessageTopicStartIndex && ((i17 = this.dialogsType) == 0 || i17 == 7 || i17 == 8)) {
                    this.canvasButton.setColor(ColorUtils.setAlphaComponent(this.currentMessagePaint.getColor(), Theme.isCurrentThemeDark() ? 36 : 26));
                    if (!this.buttonCreated) {
                        this.canvasButton.rewind();
                        int i28 = this.topMessageTopicEndIndex;
                        if (i28 != this.topMessageTopicStartIndex && i28 > 0) {
                            float f22 = this.messageTop;
                            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                f22 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            }
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            float dp5 = this.messageLeft + AndroidUtilities.dp(2.0f) + this.messageLayout.getPrimaryHorizontal(0);
                            float f23 = this.messageLeft;
                            StaticLayout staticLayout8 = this.messageLayout;
                            rectF3.set(dp5, f22, (f23 + staticLayout8.getPrimaryHorizontal(Math.min(staticLayout8.getText().length(), this.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), this.buttonTop - AndroidUtilities.dp(4.0f));
                            rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                            if (rectF3.right > rectF3.left) {
                                this.canvasButton.addRect(rectF3);
                            }
                        }
                        float lineLeft = this.buttonLayout.getLineLeft(0);
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(this.buttonLeft + lineLeft + AndroidUtilities.dp(2.0f), this.buttonTop + AndroidUtilities.dp(2.0f), this.buttonLeft + lineLeft + this.buttonLayout.getLineWidth(0) + AndroidUtilities.dp(12.0f), this.buttonTop + this.buttonLayout.getHeight());
                        rectF4.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                        this.canvasButton.addRect(rectF4);
                    }
                    this.canvasButton.draw(canvas);
                    Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                    Drawable drawable = Theme.dialogs_forum_arrowDrawable;
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    BaseCell.setDrawableBounds(drawable, rectF5.right - AndroidUtilities.dp(18.0f), rectF5.top + ((rectF5.height() - Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight()) / 2.0f));
                    Theme.dialogs_forum_arrowDrawable.draw(canvas);
                }
                canvas.translate(this.buttonLeft, this.buttonTop);
                if (!this.spoilers2.isEmpty()) {
                    try {
                        canvas.save();
                        SpoilerEffect.clipOutCanvas(canvas, this.spoilers2);
                        SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas);
                        staticLayout = this.buttonLayout;
                    } catch (Exception e5) {
                        e = e5;
                    }
                    try {
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout, this.animatedEmojiStack3, -0.075f, this.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout.getPaint().getColor()));
                        canvas.restore();
                        for (int i29 = 0; i29 < this.spoilers2.size(); i29 += i9) {
                            SpoilerEffect spoilerEffect2 = (SpoilerEffect) this.spoilers2.get(i29);
                            spoilerEffect2.setColor(this.buttonLayout.getPaint().getColor());
                            spoilerEffect2.draw(canvas);
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
                        if (this.dialogsType == i14) {
                        }
                        if (this.drawVerified) {
                        }
                        if (!this.drawReorder) {
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas);
                        if (this.drawError) {
                        }
                        canvas3 = canvas;
                        if (this.thumbsCount > 0) {
                        }
                        i15 = -1;
                        z11 = false;
                        dialogCellTags = this.tags;
                        if (dialogCellTags != null) {
                        }
                        i16 = i8;
                        if (i16 != i15) {
                        }
                        z3 = z8;
                        r10 = z11;
                        canvas2 = canvas3;
                        if (this.animatingArchiveAvatar) {
                        }
                        if (this.drawAvatar) {
                        }
                        if (this.animatingArchiveAvatar) {
                        }
                        if (this.avatarImage.getVisible()) {
                        }
                        if (this.rightFragmentOpenedProgress > f4) {
                        }
                        if (this.collapseOffset != f4) {
                        }
                        if (this.translationX != f4) {
                        }
                        if (this.drawArchive) {
                        }
                        if (this.useSeparator) {
                        }
                        if (this.clipProgress != f4) {
                        }
                        z4 = this.drawReorder;
                        if (!z4) {
                        }
                        if (z4) {
                        }
                        if (!this.archiveHidden) {
                        }
                    }
                } else {
                    SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas);
                    StaticLayout staticLayout9 = this.buttonLayout;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout9, this.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout9.getPaint().getColor()));
                }
                canvas.restore();
            }
            if (this.currentDialogFolderId == 0) {
                int i30 = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                int i31 = this.lastStatusDrawableParams;
                if (i31 >= 0 && i31 != i30 && !this.statusDrawableAnimationInProgress) {
                    createStatusDrawableAnimator(i31, i30);
                }
                boolean z12 = this.statusDrawableAnimationInProgress;
                if (z12) {
                    i30 = this.animateToStatusDrawableParams;
                }
                boolean z13 = (i30 & 1) != 0;
                boolean z14 = (i30 & 2) != 0;
                boolean z15 = (i30 & i12) != 0;
                if (z12) {
                    int i32 = this.animateFromStatusDrawableParams;
                    boolean z16 = (i32 & 1) != 0;
                    boolean z17 = (i32 & 2) != 0;
                    boolean z18 = (i32 & i12) != 0;
                    if (!z13 && !z16 && z18 && !z17 && z14 && z15) {
                        f4 = 0.0f;
                        f3 = 1.0f;
                        i6 = 1;
                        drawCheckStatus(canvas, z13, z14, z15, true, this.statusDrawableProgress);
                        i14 = 2;
                    } else {
                        f3 = 1.0f;
                        f4 = 0.0f;
                        boolean z19 = z17;
                        i14 = 2;
                        boolean z20 = z18;
                        i6 = 1;
                        drawCheckStatus(canvas, z16, z19, z20, false, 1.0f - this.statusDrawableProgress);
                        drawCheckStatus(canvas, z13, z14, z15, false, this.statusDrawableProgress);
                    }
                } else {
                    i14 = 2;
                    i6 = 1;
                    f3 = 1.0f;
                    f4 = 0.0f;
                    drawCheckStatus(canvas, z13, z14, z15, false, 1.0f);
                }
                this.lastStatusDrawableParams = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
            } else {
                i14 = 2;
                i6 = 1;
                f3 = 1.0f;
                f4 = 0.0f;
            }
            if (this.drawBotVerified) {
                int dp6 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp6 -= AndroidUtilities.dp(9.0f);
                }
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.botVerification;
                if (swapAnimatedEmojiDrawable != null) {
                    swapAnimatedEmojiDrawable.setBounds(this.nameLeft - AndroidUtilities.dp(19.0f), AndroidUtilities.dp(-1.0f) + dp6, this.nameLeft - AndroidUtilities.dp(2.0f), dp6 + AndroidUtilities.dp(16.0f));
                    this.botVerification.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                    this.botVerification.draw(canvas);
                }
            }
            boolean z21 = !this.drawUnmute || this.dialogMuted;
            if (this.dialogsType == i14 && ((z21 || this.dialogMutedProgress > f4) && !this.drawVerified && this.drawScam == 0 && !this.drawPremium)) {
                if (z21) {
                    float f24 = this.dialogMutedProgress;
                    if (f24 != f3) {
                        float f25 = f24 + 0.10666667f;
                        this.dialogMutedProgress = f25;
                        if (f25 > f3) {
                            this.dialogMutedProgress = f3;
                        } else {
                            invalidate();
                        }
                        float dp7 = this.nameMuteLeft - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                        float dp8 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            dp8 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                        }
                        BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp7, dp8);
                        BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp7, dp8);
                        if (this.dialogMutedProgress != f3) {
                            canvas.save();
                            float f26 = this.dialogMutedProgress;
                            canvas.scale(f26, f26, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
                            if (this.drawUnmute) {
                                Theme.dialogs_unmuteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_unmuteDrawable.draw(canvas);
                                Theme.dialogs_unmuteDrawable.setAlpha(NotificationCenter.didApplyNewTheme);
                            } else {
                                Theme.dialogs_muteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                Theme.dialogs_muteDrawable.draw(canvas);
                                Theme.dialogs_muteDrawable.setAlpha(NotificationCenter.didApplyNewTheme);
                            }
                            canvas.restore();
                        } else if (this.drawUnmute) {
                            Theme.dialogs_unmuteDrawable.draw(canvas);
                        } else {
                            Theme.dialogs_muteDrawable.draw(canvas);
                        }
                    }
                }
                if (!z21) {
                    float f27 = this.dialogMutedProgress;
                    if (f27 != f4) {
                        float f28 = f27 - 0.10666667f;
                        this.dialogMutedProgress = f28;
                        if (f28 < f4) {
                            this.dialogMutedProgress = f4;
                        } else {
                            invalidate();
                        }
                    }
                }
                float dp72 = this.nameMuteLeft - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                float dp82 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                if (!this.useForceThreeLines) {
                    dp82 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                    BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp72, dp82);
                    BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp72, dp82);
                    if (this.dialogMutedProgress != f3) {
                    }
                }
                dp82 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp72, dp82);
                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp72, dp82);
                if (this.dialogMutedProgress != f3) {
                }
            } else if (this.drawVerified) {
                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                    r22 = 16.5f;
                }
                float dp9 = AndroidUtilities.dp(r22);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp9 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft - AndroidUtilities.dp(f3), dp9);
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft - AndroidUtilities.dp(f3), dp9);
                Theme.dialogs_verifiedDrawable.draw(canvas);
                Theme.dialogs_verifiedCheckDrawable.draw(canvas);
            } else if (this.drawPremium) {
                int dp10 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp10 -= AndroidUtilities.dp(9.0f);
                }
                AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiStatus;
                if (swapAnimatedEmojiDrawable2 != null) {
                    swapAnimatedEmojiDrawable2.setBounds(this.nameMuteLeft - AndroidUtilities.dp(2.0f), dp10 - AndroidUtilities.dp(4.0f), this.nameMuteLeft + AndroidUtilities.dp(20.0f), (dp10 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(22.0f));
                    this.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                    this.emojiStatus.draw(canvas);
                } else {
                    Drawable drawable2 = PremiumGradient.getInstance().premiumStarDrawableMini;
                    int dp11 = this.nameMuteLeft - AndroidUtilities.dp(f3);
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f15 = 15.5f;
                    }
                    BaseCell.setDrawableBounds(drawable2, dp11, AndroidUtilities.dp(f15));
                    drawable2.draw(canvas);
                }
            } else if (this.drawScam != 0) {
                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                    f14 = 15.0f;
                }
                int dp12 = AndroidUtilities.dp(f14);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp12 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds((Drawable) (this.drawScam == i6 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable), this.nameMuteLeft, dp12);
                (this.drawScam == i6 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).draw(canvas);
            }
            if (!this.drawReorder || this.reorderIconProgress != f4) {
                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                Theme.dialogs_reorderDrawable.draw(canvas);
            }
            if (this.drawError) {
                Theme.dialogs_errorDrawable.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                this.rect.set(this.errorLeft, this.errorTop, r1 + AndroidUtilities.dp(23.0f), this.errorTop + AndroidUtilities.dp(23.0f));
                RectF rectF6 = this.rect;
                float f29 = AndroidUtilities.density * 11.5f;
                canvas.drawRoundRect(rectF6, f29, f29, Theme.dialogs_errorPaint);
                BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, this.errorLeft + AndroidUtilities.dp(5.5f), this.errorTop + AndroidUtilities.dp(5.0f));
                Theme.dialogs_errorDrawable.draw(canvas);
            } else if (((this.drawCount || this.drawMention) && this.drawCount2) || this.countChangeProgress != f3 || this.drawReactionMention || this.reactionsMentionsChangeProgress != f3) {
                if (this.isTopic) {
                    z9 = this.topicMuted;
                } else {
                    TLRPC.Chat chat = this.chat;
                    if (chat != null && chat.forum && this.forumTopic == null) {
                        z10 = !this.hasUnmutedTopics;
                        Canvas canvas4 = canvas;
                        drawCounter(canvas, z10, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                        if (this.drawMention) {
                            Theme.dialogs_countPaint.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                            this.rect.set(this.mentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r1 + this.mentionWidth + AndroidUtilities.dp(11.0f), this.countTop + AndroidUtilities.dp(23.0f));
                            Paint paint3 = (!z10 || this.folderId == 0) ? Theme.dialogs_countPaint : Theme.dialogs_countGrayPaint;
                            RectF rectF7 = this.rect;
                            float f30 = AndroidUtilities.density * 11.5f;
                            canvas4.drawRoundRect(rectF7, f30, f30, paint3);
                            if (this.mentionLayout != null) {
                                Theme.dialogs_countTextPaint.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                                canvas.save();
                                canvas4.translate(this.mentionLeft, this.countTop + AndroidUtilities.dp(4.0f));
                                this.mentionLayout.draw(canvas4);
                                canvas.restore();
                            } else {
                                Theme.dialogs_mentionDrawable.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_mentionDrawable, this.mentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.2f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                                Theme.dialogs_mentionDrawable.draw(canvas4);
                            }
                        }
                        if (!this.drawReactionMention) {
                            canvas3 = canvas4;
                        }
                        Theme.dialogs_reactionsCountPaint.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                        this.rect.set(this.reactionMentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r0 + AndroidUtilities.dp(23.0f), this.countTop + AndroidUtilities.dp(23.0f));
                        Paint paint4 = Theme.dialogs_reactionsCountPaint;
                        canvas.save();
                        f8 = this.reactionsMentionsChangeProgress;
                        if (f8 != f3) {
                            if (!this.drawReactionMention) {
                                f8 = f3 - f8;
                            }
                            canvas4.scale(f8, f8, this.rect.centerX(), this.rect.centerY());
                        }
                        RectF rectF8 = this.rect;
                        float f31 = AndroidUtilities.density * 11.5f;
                        canvas4.drawRoundRect(rectF8, f31, f31, paint4);
                        Theme.dialogs_reactionsMentionDrawable.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reactionsMentionDrawable, this.reactionMentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.8f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        Theme.dialogs_reactionsMentionDrawable.draw(canvas4);
                        canvas.restore();
                        canvas3 = canvas4;
                        if (this.thumbsCount > 0) {
                            float f32 = this.updateHelper.typingProgres;
                            if (f32 != f3) {
                                if (f32 > f4) {
                                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((f3 - f32) * 255.0f), 31);
                                    if (this.updateHelper.typingOutToTop) {
                                        dp = -AndroidUtilities.dp(14.0f);
                                        f9 = this.updateHelper.typingProgres;
                                    } else {
                                        dp = AndroidUtilities.dp(14.0f);
                                        f9 = this.updateHelper.typingProgres;
                                    }
                                    canvas3.translate(f4, dp * f9);
                                }
                                int i33 = 0;
                                while (i33 < this.thumbsCount) {
                                    if (this.thumbImageSeen[i33]) {
                                        if (this.thumbBackgroundPaint == null) {
                                            Paint paint5 = new Paint(i6);
                                            this.thumbBackgroundPaint = paint5;
                                            paint5.setShadowLayer(AndroidUtilities.dp(1.34f), f4, AndroidUtilities.dp(0.34f), 402653184);
                                            c = 0;
                                            this.thumbBackgroundPaint.setColor(0);
                                        } else {
                                            c = 0;
                                        }
                                        RectF rectF9 = AndroidUtilities.rectTmp;
                                        rectF9.set(this.thumbImage[i33].getImageX(), this.thumbImage[i33].getImageY(), this.thumbImage[i33].getImageX2(), this.thumbImage[i33].getImageY2());
                                        canvas3.drawRoundRect(rectF9, this.thumbImage[i33].getRoundRadius()[c], this.thumbImage[i33].getRoundRadius()[i6], this.thumbBackgroundPaint);
                                        this.thumbImage[i33].draw(canvas3);
                                        if (this.drawSpoiler[i33]) {
                                            Path path = this.thumbPath;
                                            if (path == null) {
                                                this.thumbPath = new Path();
                                            } else {
                                                path.rewind();
                                            }
                                            this.thumbPath.addRoundRect(rectF9, this.thumbImage[i33].getRoundRadius()[c], this.thumbImage[i33].getRoundRadius()[i6], Path.Direction.CW);
                                            canvas.save();
                                            canvas3.clipPath(this.thumbPath);
                                            if (this.thumbSpoiler == null) {
                                                this.thumbSpoiler = new SpoilerEffect();
                                            }
                                            this.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                            this.thumbSpoiler.setBounds((int) this.thumbImage[i33].getImageX(), (int) this.thumbImage[i33].getImageY(), (int) this.thumbImage[i33].getImageX2(), (int) this.thumbImage[i33].getImageY2());
                                            this.thumbSpoiler.draw(canvas3);
                                            invalidate();
                                            canvas.restore();
                                        }
                                        if (this.drawPlay[i33]) {
                                            BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (this.thumbImage[i33].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (this.thumbImage[i33].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)));
                                            Theme.dialogs_playDrawable.draw(canvas3);
                                        }
                                    }
                                    i33 += i6;
                                    i11 = -1;
                                }
                                i15 = -1;
                                z11 = false;
                                z11 = false;
                                if (this.updateHelper.typingProgres > f4) {
                                    canvas.restore();
                                }
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null && !dialogCellTags.isEmpty()) {
                                    canvas.save();
                                    canvas3.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                                    this.tags.draw(canvas3, this.tagsRight - this.tagsLeft);
                                    canvas.restore();
                                }
                                i16 = i8;
                                if (i16 != i15) {
                                    canvas3.restoreToCount(i16);
                                }
                                z3 = z8;
                                r10 = z11;
                                canvas2 = canvas3;
                            }
                        }
                        i15 = -1;
                        z11 = false;
                        dialogCellTags = this.tags;
                        if (dialogCellTags != null) {
                            canvas.save();
                            canvas3.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                            this.tags.draw(canvas3, this.tagsRight - this.tagsLeft);
                            canvas.restore();
                        }
                        i16 = i8;
                        if (i16 != i15) {
                        }
                        z3 = z8;
                        r10 = z11;
                        canvas2 = canvas3;
                    } else {
                        z9 = this.dialogMuted;
                    }
                }
                z10 = z9;
                Canvas canvas42 = canvas;
                drawCounter(canvas, z10, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                if (this.drawMention) {
                }
                if (!this.drawReactionMention) {
                }
                Theme.dialogs_reactionsCountPaint.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                this.rect.set(this.reactionMentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r0 + AndroidUtilities.dp(23.0f), this.countTop + AndroidUtilities.dp(23.0f));
                Paint paint42 = Theme.dialogs_reactionsCountPaint;
                canvas.save();
                f8 = this.reactionsMentionsChangeProgress;
                if (f8 != f3) {
                }
                RectF rectF82 = this.rect;
                float f312 = AndroidUtilities.density * 11.5f;
                canvas42.drawRoundRect(rectF82, f312, f312, paint42);
                Theme.dialogs_reactionsMentionDrawable.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                BaseCell.setDrawableBounds(Theme.dialogs_reactionsMentionDrawable, this.reactionMentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.8f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                Theme.dialogs_reactionsMentionDrawable.draw(canvas42);
                canvas.restore();
                canvas3 = canvas42;
                if (this.thumbsCount > 0) {
                }
                i15 = -1;
                z11 = false;
                dialogCellTags = this.tags;
                if (dialogCellTags != null) {
                }
                i16 = i8;
                if (i16 != i15) {
                }
                z3 = z8;
                r10 = z11;
                canvas2 = canvas3;
            } else if (this.openBot) {
                canvas.save();
                float scale = this.openButtonBounce.getScale(0.05f);
                canvas.scale(scale, scale, this.openButtonRect.centerX(), this.openButtonRect.centerY());
                this.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                RectF rectF10 = this.openButtonRect;
                canvas.drawRoundRect(rectF10, rectF10.height() / 2.0f, this.openButtonRect.height() / 2.0f, this.openButtonBackgroundPaint);
                Text text = this.openButtonText;
                if (text != null) {
                    text.draw(canvas, this.openButtonRect.left + AndroidUtilities.dp(13.0f), this.openButtonRect.centerY(), Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider), 1.0f);
                }
                canvas.restore();
            } else if (getIsPinned()) {
                Theme.dialogs_pinnedDrawable.setAlpha((int) ((f3 - this.reorderIconProgress) * 255.0f));
                BaseCell.setDrawableBounds(Theme.dialogs_pinnedDrawable, this.pinLeft, this.pinTop);
                Theme.dialogs_pinnedDrawable.draw(canvas);
            }
            canvas3 = canvas;
            if (this.thumbsCount > 0) {
            }
            i15 = -1;
            z11 = false;
            dialogCellTags = this.tags;
            if (dialogCellTags != null) {
            }
            i16 = i8;
            if (i16 != i15) {
            }
            z3 = z8;
            r10 = z11;
            canvas2 = canvas3;
        } else {
            canvas2 = canvas;
            r10 = 0;
            i6 = 1;
            f3 = 1.0f;
            f4 = 0.0f;
            z3 = false;
        }
        if (this.animatingArchiveAvatar) {
            canvas.save();
            f5 = 170.0f;
            float interpolation2 = this.interpolator.getInterpolation(this.animatingArchiveAvatarProgress / 170.0f) + f3;
            canvas2.scale(interpolation2, interpolation2, this.avatarImage.getCenterX(), this.avatarImage.getCenterY());
        } else {
            f5 = 170.0f;
        }
        if (this.drawAvatar && (!this.isTopic || (tL_forumTopic2 = this.forumTopic) == null || tL_forumTopic2.id != i6 || (pullForegroundDrawable = this.archivedChatsDrawable) == null || !pullForegroundDrawable.isDraw())) {
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
                int i34 = avatarStoryParams.forceState;
                if (z22) {
                    avatarStoryParams.forceState = i6;
                }
                StoriesUtilities.drawAvatarWithStory(this.currentDialogId, canvas2, this.avatarImage, avatarStoryParams);
                this.storyParams.forceState = i34;
            }
        }
        if (this.animatingArchiveAvatar) {
            canvas.restore();
        }
        boolean z23 = (this.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) ? z3 : true;
        if (this.rightFragmentOpenedProgress > f4 && this.currentDialogFolderId == 0) {
            if (!this.isTopic) {
                z6 = this.topicMuted;
            } else {
                TLRPC.Chat chat2 = this.chat;
                if (chat2 != null && chat2.forum && this.forumTopic == null) {
                    z7 = !this.hasUnmutedTopics;
                    RectF rectF11 = this.storyParams.originalAvatarRect;
                    int width2 = (int) (((rectF11.left + rectF11.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
                    RectF rectF22 = this.storyParams.originalAvatarRect;
                    drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width2, (int) (((rectF22.left + rectF22.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
                } else {
                    z6 = this.dialogMuted;
                }
            }
            z7 = z6;
            RectF rectF112 = this.storyParams.originalAvatarRect;
            int width22 = (int) (((rectF112.left + rectF112.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
            RectF rectF222 = this.storyParams.originalAvatarRect;
            drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width22, (int) (((rectF222.left + rectF222.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
        }
        if (this.collapseOffset != f4) {
            canvas.restore();
        }
        if (this.translationX != f4) {
            canvas.restore();
        }
        if (this.drawArchive && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == i6)) && this.translationX == f4 && this.archivedChatsDrawable != null)) {
            canvas.save();
            canvas2.translate(f4, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
            canvas2.clipRect((int) r10, (int) r10, getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas2);
            canvas.restore();
        }
        if (this.useSeparator) {
            int dp13 = (this.fullSeparator || !(this.currentDialogFolderId == 0 || !this.archiveHidden || this.fullSeparator2) || (this.fullSeparator2 && !this.archiveHidden)) ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
            if (this.rightFragmentOpenedProgress != f3) {
                int alpha3 = Theme.dividerPaint.getAlpha();
                float f33 = this.rightFragmentOpenedProgress;
                if (f33 != f4) {
                    Theme.dividerPaint.setAlpha((int) (alpha3 * (f3 - f33)));
                }
                float measuredHeight2 = (getMeasuredHeight() - i6) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight2, getMeasuredWidth() - dp13, measuredHeight2, Theme.dividerPaint);
                } else {
                    canvas.drawLine(dp13, measuredHeight2, getMeasuredWidth(), measuredHeight2, Theme.dividerPaint);
                }
                if (this.rightFragmentOpenedProgress != f4) {
                    Theme.dividerPaint.setAlpha(alpha3);
                }
            }
        }
        if (this.clipProgress != f4) {
            if (Build.VERSION.SDK_INT != 24) {
                canvas.restore();
            } else {
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.topClip * this.clipProgress, Theme.dialogs_pinnedPaint);
                canvas.drawRect(0.0f, getMeasuredHeight() - ((int) (this.bottomClip * this.clipProgress)), getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
            }
        }
        z4 = this.drawReorder;
        if (!z4 || this.reorderIconProgress != f4) {
            if (z4) {
                float f34 = this.reorderIconProgress;
                if (f34 < f3) {
                    float f35 = f34 + 0.09411765f;
                    this.reorderIconProgress = f35;
                    if (f35 > f3) {
                        this.reorderIconProgress = f3;
                    }
                    z5 = true;
                }
            } else {
                float f36 = this.reorderIconProgress;
                if (f36 > f4) {
                    float f37 = f36 - 0.09411765f;
                    this.reorderIconProgress = f37;
                    if (f37 < f4) {
                        this.reorderIconProgress = f4;
                    }
                    z5 = true;
                }
            }
            if (!this.archiveHidden) {
                float f38 = this.archiveBackgroundProgress;
                if (f38 > f4) {
                    float f39 = f38 - 0.069565214f;
                    this.archiveBackgroundProgress = f39;
                    if (f39 < f4) {
                        this.archiveBackgroundProgress = f4;
                    }
                    if (this.avatarDrawable.getAvatarType() == 2) {
                        this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                    }
                    z5 = true;
                }
                if (this.animatingArchiveAvatar) {
                    float f40 = this.animatingArchiveAvatarProgress + 16.0f;
                    this.animatingArchiveAvatarProgress = f40;
                    if (f40 >= f5) {
                        this.animatingArchiveAvatarProgress = f5;
                        this.animatingArchiveAvatar = r10;
                    }
                    z5 = true;
                }
                if (!this.drawRevealBackground) {
                    float f41 = this.currentRevealBounceProgress;
                    if (f41 < f3) {
                        float f42 = f41 + 0.09411765f;
                        this.currentRevealBounceProgress = f42;
                        if (f42 > f3) {
                            this.currentRevealBounceProgress = f3;
                            z5 = true;
                        }
                    }
                    float f43 = this.currentRevealProgress;
                    if (f43 < f3) {
                        float f44 = f43 + 0.053333335f;
                        this.currentRevealProgress = f44;
                        if (f44 > f3) {
                            this.currentRevealProgress = f3;
                        }
                        z5 = true;
                    }
                    if (z5) {
                        return;
                    }
                    invalidate();
                    return;
                }
                if (this.currentRevealBounceProgress == f3) {
                    this.currentRevealBounceProgress = f4;
                    z5 = true;
                }
                float f45 = this.currentRevealProgress;
                if (f45 > f4) {
                    float f46 = f45 - 0.053333335f;
                    this.currentRevealProgress = f46;
                    if (f46 < f4) {
                        this.currentRevealProgress = f4;
                    }
                    z5 = true;
                }
                if (z5) {
                }
            } else {
                float f47 = this.archiveBackgroundProgress;
                if (f47 < f3) {
                    float f48 = f47 + 0.069565214f;
                    this.archiveBackgroundProgress = f48;
                    if (f48 > f3) {
                        this.archiveBackgroundProgress = f3;
                    }
                    if (this.avatarDrawable.getAvatarType() == 2) {
                        this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                    }
                    z5 = true;
                }
                if (this.animatingArchiveAvatar) {
                }
                if (!this.drawRevealBackground) {
                }
            }
        }
        z5 = z23;
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

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0234, code lost:
    
        if (r3 > 0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0274  */
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
        boolean z4 = (this.ttlPeriod <= 0 || isOnline() || this.hasCall) ? false : true;
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
        int i4 = NotificationCenter.didApplyNewTheme;
        if (z2) {
            if (this.counterPaintOutline == null) {
                Paint paint2 = new Paint();
                this.counterPaintOutline = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.counterPaintOutline.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.counterPaintOutline.setStrokeJoin(Paint.Join.ROUND);
                this.counterPaintOutline.setStrokeCap(Paint.Cap.ROUND);
            }
            this.counterPaintOutline.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_pinnedOverlay), NotificationCenter.didApplyNewTheme), Color.alpha(r13) / 255.0f));
        }
        if (this.isTopic && this.forumTopic.read_inbox_max_id == 0) {
            if (this.topicCounterPaint == null) {
                this.topicCounterPaint = new Paint();
            }
            paint = this.topicCounterPaint;
            int color = Theme.getColor(z ? Theme.key_topics_unreadCounterMuted : Theme.key_topics_unreadCounter, this.resourcesProvider);
            paint.setColor(color);
            Theme.dialogs_countTextPaint.setColor(color);
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
            Theme.dialogs_countTextPaint.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
            this.rect.set(i2 - AndroidUtilities.dp(5.5f), i, r9 + this.countWidth + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + i);
            int save = canvas.save();
            if (f != 1.0f) {
                canvas.scale(f, f, this.rect.centerX(), this.rect.centerY());
            }
            if (f3 != 1.0f) {
                if (getIsPinned()) {
                    Theme.dialogs_pinnedDrawable.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
                    BaseCell.setDrawableBounds(Theme.dialogs_pinnedDrawable, this.pinLeft, this.pinTop);
                    canvas.save();
                    float f4 = 1.0f - f3;
                    canvas.scale(f4, f4, Theme.dialogs_pinnedDrawable.getBounds().centerX(), Theme.dialogs_pinnedDrawable.getBounds().centerY());
                    Theme.dialogs_pinnedDrawable.draw(canvas);
                    canvas.restore();
                }
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
                canvas.translate(i2, i + AndroidUtilities.dp(4.0f));
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((1.0f - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
            float f5 = f3 * 2.0f;
            float f6 = f5 > 1.0f ? 1.0f : f5;
            float f7 = 1.0f - f6;
            float f8 = (i2 * f6) + (i3 * f7);
            float dp = f8 - AndroidUtilities.dp(5.5f);
            float f9 = i;
            this.rect.set(dp, f9, (this.countWidth * f6) + dp + (this.countWidthOld * f7) + AndroidUtilities.dp(11.0f), AndroidUtilities.dp(23.0f) + i);
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
                canvas.translate(f8, i + AndroidUtilities.dp(4.0f));
                this.countAnimationStableLayout.draw(canvas);
                canvas.restore();
            }
            int alpha = Theme.dialogs_countTextPaint.getAlpha();
            float f12 = alpha;
            Theme.dialogs_countTextPaint.setAlpha((int) (f12 * f6));
            if (this.countAnimationInLayout != null) {
                canvas.save();
                canvas.translate(f8, ((this.countAnimationIncrement ? AndroidUtilities.dp(13.0f) : -AndroidUtilities.dp(13.0f)) * f7) + f9 + AndroidUtilities.dp(4.0f));
                this.countAnimationInLayout.draw(canvas);
                canvas.restore();
            } else if (this.countLayout != null) {
                canvas.save();
                canvas.translate(f8, ((this.countAnimationIncrement ? AndroidUtilities.dp(13.0f) : -AndroidUtilities.dp(13.0f)) * f7) + f9 + AndroidUtilities.dp(4.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countOldLayout != null) {
                Theme.dialogs_countTextPaint.setAlpha((int) (f12 * f7));
                canvas.save();
                canvas.translate(f8, ((this.countAnimationIncrement ? -AndroidUtilities.dp(13.0f) : AndroidUtilities.dp(13.0f)) * f6) + f9 + AndroidUtilities.dp(4.0f));
                this.countOldLayout.draw(canvas);
                canvas.restore();
            }
            Theme.dialogs_countTextPaint.setAlpha(alpha);
            canvas.restore();
        }
        if (z3) {
            Theme.dialogs_countTextPaint.setColor(Theme.getColor(Theme.key_chats_unreadCounterText));
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
        this.statusDrawableAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.DialogCell.5
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
        if (isFolderCell() && (pullForegroundDrawable = this.archivedChatsDrawable) != null && SharedConfig.archiveHidden && pullForegroundDrawable.pullProgress == 0.0f) {
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
            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, charSequence6, spannableString, NotificationCenter.suggestedLangpack);
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
            MediaDataController.addTextStyleRuns(this.message, (Spannable) spannableString4, NotificationCenter.suggestedLangpack);
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
            long j = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? TLObject.FLAG_18 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0);
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
