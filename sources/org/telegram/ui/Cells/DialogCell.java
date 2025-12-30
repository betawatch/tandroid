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

    /* JADX WARN: Can't wrap try/catch for region: R(148:1375|1376|1359|(0)|1364|(0)|1373|1238|(0)|1241|1242|930|(0)|952|(0)|954|955|(0)|1130|1131|(0)|1139|1138|977|(0)|992|993|(0)(0)|81|(0)(0)|89|(0)(0)|95|(0)(0)|98|(0)|104|(0)(0)|109|110|(1:112)|757|(1:759)|780|782|784|(0)|117|(0)|120|(0)|125|126|127|(0)|130|(0)|133|(0)(0)|139|(0)(0)|142|(0)|145|(1:147)|744|152|(0)(0)|155|(1:157)|742|160|161|(1:163)|716|(0)(0)|719|(3:720|(0)(0)|735)|196|197|(0)(0)|200|(0)|203|(63:205|207|209|211|212|(0)|218|(0)(0)|(0)|243|(1:245)|614|248|(49:250|252|254|(0)(0)|257|259|(0)(0)|271|272|(0)|275|276|277|(0)(0)|280|281|282|283|(0)|294|295|(0)|323|(1:325)|545|547|549|551|340|(1:342)|535|345|346|(1:348)|524|526|(1:529)|530|(0)(0)|533|358|359|360|361|(0)(0)|448|(0)|463|464)|612|252|254|(0)(0)|257|259|(0)(0)|271|272|(0)|275|276|277|(0)(0)|280|281|282|283|(0)|294|295|(0)|323|(0)|545|547|549|551|340|(0)|535|345|346|(0)|524|526|(0)|530|(0)(0)|533|358|359|360|361|(0)(0)|448|(0)|463|464)|710|207|209|211|212|(0)|218|(0)(0)|(0)|243|(0)|614|248|(0)|612|252|254|(0)(0)|257|259|(0)(0)|271|272|(0)|275|276|277|(0)(0)|280|281|282|283|(0)|294|295|(0)|323|(0)|545|547|549|551|340|(0)|535|345|346|(0)|524|526|(0)|530|(0)(0)|533|358|359|360|361|(0)(0)|448|(0)|463|464) */
    /* JADX WARN: Code restructure failed: missing block: B:1004:0x1509, code lost:
    
        if (r5 == null) goto L1059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1394:0x0aa6, code lost:
    
        if (r1.id != r11) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1398:0x0ab4, code lost:
    
        if (org.telegram.messenger.ChatObject.isMegagroup(r48.chat) != false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1400:0x0abc, code lost:
    
        if (org.telegram.ui.Components.Forum.ForumUtilities.isTopicCreateMessage(r48.message) == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1692:0x0630, code lost:
    
        if (r1.post_messages == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x224b, code lost:
    
        if (org.telegram.messenger.SharedConfig.useThreeLinesLayout == false) goto L1629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x236b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x236c, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x236f, code lost:
    
        r48.messageLayout = null;
        org.telegram.messenger.FileLog.e(r0);
        r8 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:1007:0x1647  */
    /* JADX WARN: Removed duplicated region for block: B:100:0x1715  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x1731  */
    /* JADX WARN: Removed duplicated region for block: B:1133:0x143f  */
    /* JADX WARN: Removed duplicated region for block: B:1140:0x12b3  */
    /* JADX WARN: Removed duplicated region for block: B:1152:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x18a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x18b7  */
    /* JADX WARN: Removed duplicated region for block: B:1240:0x1149  */
    /* JADX WARN: Removed duplicated region for block: B:1243:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x18d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x18d5 A[Catch: Exception -> 0x18e0, TryCatch #0 {Exception -> 0x18e0, blocks: (B:127:0x18c7, B:130:0x18d1, B:132:0x18d5, B:133:0x18e3, B:135:0x18e7, B:138:0x1901, B:139:0x192f, B:142:0x1945, B:144:0x194b, B:145:0x1957, B:147:0x196a, B:149:0x1970, B:152:0x1981, B:154:0x1985, B:155:0x19c3, B:157:0x19c7, B:159:0x19d0, B:160:0x19da, B:743:0x19a6, B:747:0x190f, B:749:0x1913, B:752:0x192d), top: B:126:0x18c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x18e7 A[Catch: Exception -> 0x18e0, TryCatch #0 {Exception -> 0x18e0, blocks: (B:127:0x18c7, B:130:0x18d1, B:132:0x18d5, B:133:0x18e3, B:135:0x18e7, B:138:0x1901, B:139:0x192f, B:142:0x1945, B:144:0x194b, B:145:0x1957, B:147:0x196a, B:149:0x1970, B:152:0x1981, B:154:0x1985, B:155:0x19c3, B:157:0x19c7, B:159:0x19d0, B:160:0x19da, B:743:0x19a6, B:747:0x190f, B:749:0x1913, B:752:0x192d), top: B:126:0x18c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:1361:0x10d9  */
    /* JADX WARN: Removed duplicated region for block: B:1366:0x10ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x1942  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x194b A[Catch: Exception -> 0x18e0, TryCatch #0 {Exception -> 0x18e0, blocks: (B:127:0x18c7, B:130:0x18d1, B:132:0x18d5, B:133:0x18e3, B:135:0x18e7, B:138:0x1901, B:139:0x192f, B:142:0x1945, B:144:0x194b, B:145:0x1957, B:147:0x196a, B:149:0x1970, B:152:0x1981, B:154:0x1985, B:155:0x19c3, B:157:0x19c7, B:159:0x19d0, B:160:0x19da, B:743:0x19a6, B:747:0x190f, B:749:0x1913, B:752:0x192d), top: B:126:0x18c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:1526:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:1534:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x1985 A[Catch: Exception -> 0x18e0, TryCatch #0 {Exception -> 0x18e0, blocks: (B:127:0x18c7, B:130:0x18d1, B:132:0x18d5, B:133:0x18e3, B:135:0x18e7, B:138:0x1901, B:139:0x192f, B:142:0x1945, B:144:0x194b, B:145:0x1957, B:147:0x196a, B:149:0x1970, B:152:0x1981, B:154:0x1985, B:155:0x19c3, B:157:0x19c7, B:159:0x19d0, B:160:0x19da, B:743:0x19a6, B:747:0x190f, B:749:0x1913, B:752:0x192d), top: B:126:0x18c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:1695:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:1723:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:1784:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:1789:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1c2b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x1c57  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1c94  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x1cb9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1f57  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x1fae  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1fc2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x1fda  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x1fdd  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x1fec  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x20e0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x2103 A[Catch: Exception -> 0x2154, TryCatch #6 {Exception -> 0x2154, blocks: (B:277:0x20fb, B:279:0x2103, B:557:0x2151), top: B:276:0x20fb }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x216a A[Catch: Exception -> 0x2173, TryCatch #7 {Exception -> 0x2173, blocks: (B:283:0x2164, B:285:0x216a, B:287:0x216e, B:290:0x21a1, B:291:0x2175, B:293:0x217b), top: B:282:0x2164 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x21d3 A[Catch: Exception -> 0x21fa, TryCatch #3 {Exception -> 0x21fa, blocks: (B:295:0x21cf, B:297:0x21d3, B:299:0x21e5, B:301:0x21eb, B:303:0x21ef, B:305:0x21f5, B:308:0x21fe, B:310:0x2202, B:312:0x2206, B:314:0x220a, B:316:0x220e, B:320:0x221f, B:321:0x221b, B:323:0x2221, B:325:0x2225, B:327:0x2245, B:329:0x2249, B:331:0x226b, B:333:0x2271, B:335:0x2275, B:337:0x2288, B:340:0x22b6, B:342:0x22ba, B:344:0x22be, B:346:0x22c6, B:348:0x22ca, B:350:0x230b, B:352:0x230f, B:354:0x2321, B:356:0x2327, B:357:0x233b, B:524:0x22ce, B:526:0x22d4, B:529:0x22da, B:530:0x22e1, B:533:0x22f3, B:535:0x22c3, B:536:0x22a4, B:537:0x224d, B:540:0x2255, B:542:0x225d, B:545:0x2229, B:547:0x222f, B:549:0x2233, B:551:0x2238), top: B:294:0x21cf }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x2225 A[Catch: Exception -> 0x21fa, TryCatch #3 {Exception -> 0x21fa, blocks: (B:295:0x21cf, B:297:0x21d3, B:299:0x21e5, B:301:0x21eb, B:303:0x21ef, B:305:0x21f5, B:308:0x21fe, B:310:0x2202, B:312:0x2206, B:314:0x220a, B:316:0x220e, B:320:0x221f, B:321:0x221b, B:323:0x2221, B:325:0x2225, B:327:0x2245, B:329:0x2249, B:331:0x226b, B:333:0x2271, B:335:0x2275, B:337:0x2288, B:340:0x22b6, B:342:0x22ba, B:344:0x22be, B:346:0x22c6, B:348:0x22ca, B:350:0x230b, B:352:0x230f, B:354:0x2321, B:356:0x2327, B:357:0x233b, B:524:0x22ce, B:526:0x22d4, B:529:0x22da, B:530:0x22e1, B:533:0x22f3, B:535:0x22c3, B:536:0x22a4, B:537:0x224d, B:540:0x2255, B:542:0x225d, B:545:0x2229, B:547:0x222f, B:549:0x2233, B:551:0x2238), top: B:294:0x21cf }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x22ba A[Catch: Exception -> 0x21fa, TryCatch #3 {Exception -> 0x21fa, blocks: (B:295:0x21cf, B:297:0x21d3, B:299:0x21e5, B:301:0x21eb, B:303:0x21ef, B:305:0x21f5, B:308:0x21fe, B:310:0x2202, B:312:0x2206, B:314:0x220a, B:316:0x220e, B:320:0x221f, B:321:0x221b, B:323:0x2221, B:325:0x2225, B:327:0x2245, B:329:0x2249, B:331:0x226b, B:333:0x2271, B:335:0x2275, B:337:0x2288, B:340:0x22b6, B:342:0x22ba, B:344:0x22be, B:346:0x22c6, B:348:0x22ca, B:350:0x230b, B:352:0x230f, B:354:0x2321, B:356:0x2327, B:357:0x233b, B:524:0x22ce, B:526:0x22d4, B:529:0x22da, B:530:0x22e1, B:533:0x22f3, B:535:0x22c3, B:536:0x22a4, B:537:0x224d, B:540:0x2255, B:542:0x225d, B:545:0x2229, B:547:0x222f, B:549:0x2233, B:551:0x2238), top: B:294:0x21cf }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x22ca A[Catch: Exception -> 0x21fa, TryCatch #3 {Exception -> 0x21fa, blocks: (B:295:0x21cf, B:297:0x21d3, B:299:0x21e5, B:301:0x21eb, B:303:0x21ef, B:305:0x21f5, B:308:0x21fe, B:310:0x2202, B:312:0x2206, B:314:0x220a, B:316:0x220e, B:320:0x221f, B:321:0x221b, B:323:0x2221, B:325:0x2225, B:327:0x2245, B:329:0x2249, B:331:0x226b, B:333:0x2271, B:335:0x2275, B:337:0x2288, B:340:0x22b6, B:342:0x22ba, B:344:0x22be, B:346:0x22c6, B:348:0x22ca, B:350:0x230b, B:352:0x230f, B:354:0x2321, B:356:0x2327, B:357:0x233b, B:524:0x22ce, B:526:0x22d4, B:529:0x22da, B:530:0x22e1, B:533:0x22f3, B:535:0x22c3, B:536:0x22a4, B:537:0x224d, B:540:0x2255, B:542:0x225d, B:545:0x2229, B:547:0x222f, B:549:0x2233, B:551:0x2238), top: B:294:0x21cf }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x2389  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x264d  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x268b  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x2693  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x2561  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x22d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x22ee  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x22f1  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x2151 A[Catch: Exception -> 0x2154, TRY_LEAVE, TryCatch #6 {Exception -> 0x2154, blocks: (B:277:0x20fb, B:279:0x2103, B:557:0x2151), top: B:276:0x20fb }] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x2011  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x1cf1  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x1c42  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x1b70  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x1bd7  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x1b22 A[EDGE_INSN: B:739:0x1b22->B:196:0x1b22 BREAK  A[LOOP:13: B:720:0x1bd2->B:735:0x1c11], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:740:0x1b95  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x19a6 A[Catch: Exception -> 0x18e0, TryCatch #0 {Exception -> 0x18e0, blocks: (B:127:0x18c7, B:130:0x18d1, B:132:0x18d5, B:133:0x18e3, B:135:0x18e7, B:138:0x1901, B:139:0x192f, B:142:0x1945, B:144:0x194b, B:145:0x1957, B:147:0x196a, B:149:0x1970, B:152:0x1981, B:154:0x1985, B:155:0x19c3, B:157:0x19c7, B:159:0x19d0, B:160:0x19da, B:743:0x19a6, B:747:0x190f, B:749:0x1913, B:752:0x192d), top: B:126:0x18c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:745:0x1944  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x190f A[Catch: Exception -> 0x18e0, TryCatch #0 {Exception -> 0x18e0, blocks: (B:127:0x18c7, B:130:0x18d1, B:132:0x18d5, B:133:0x18e3, B:135:0x18e7, B:138:0x1901, B:139:0x192f, B:142:0x1945, B:144:0x194b, B:145:0x1957, B:147:0x196a, B:149:0x1970, B:152:0x1981, B:154:0x1985, B:155:0x19c3, B:157:0x19c7, B:159:0x19d0, B:160:0x19da, B:743:0x19a6, B:747:0x190f, B:749:0x1913, B:752:0x192d), top: B:126:0x18c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:786:0x1833  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x175e  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x16f8  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x16e1  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x16a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x165d  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x16b5  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x1234  */
    /* JADX WARN: Removed duplicated region for block: B:957:0x12da  */
    /* JADX WARN: Removed duplicated region for block: B:979:0x1471  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x16e6  */
    /* JADX WARN: Removed duplicated region for block: B:995:0x14c9  */
    /* JADX WARN: Removed duplicated region for block: B:996:0x14d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildLayout() {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        int i2;
        CharSequence charSequence3;
        boolean z6;
        TLRPC.DraftMessage draftMessage;
        TLRPC.DraftMessage draftMessage2;
        TLRPC.InputReplyTo inputReplyTo;
        boolean z7;
        TLRPC.DraftMessage draftMessage3;
        CharSequence charSequence4;
        boolean z8;
        int i3;
        CharSequence charSequence5;
        String str;
        boolean z9;
        ArrayList<TLRPC.MessageEntity> arrayList;
        CharSequence charSequence6;
        int i4;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        TLRPC.Chat chat;
        CharSequence charSequence12;
        CharSequence charSequence13;
        boolean z10;
        CharSequence charSequence14;
        CharSequence charSequence15;
        CharSequence replaceNewLines;
        CharSequence charSequence16;
        char c;
        String str2;
        CharSequence charSequence17;
        boolean isChannelAndNotMegaGroup;
        CharSequence formatPluralString;
        char c2;
        int i5;
        String formatPluralString2;
        String str3;
        MessageObject messageObject;
        CharSequence charSequence18;
        int i6;
        CharSequence replaceEmoji;
        CharSequence charSequence19;
        CharSequence highlightText;
        Object foregroundColorSpanThemable;
        TLRPC.User user;
        MessageObject messageObject2;
        TLRPC.User user2;
        CharSequence string;
        CharSequence charSequence20;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessagePeerReaction> arrayList2;
        CharSequence string2;
        CharSequence charSequence21;
        CharSequence string3;
        CharSequence charSequence22;
        CharSequence charSequence23;
        CharSequence charSequence24;
        CharSequence charSequence25;
        String stringForMessageListDate;
        MessageObject messageObject3;
        boolean z11;
        String str4;
        String str5;
        CharSequence charSequence26;
        boolean z12;
        CharSequence charSequence27;
        CharSequence escape;
        CharSequence charSequence28;
        String str6;
        boolean z13;
        CharSequence topicSpannedName;
        boolean z14;
        boolean z15;
        String str7;
        boolean z16;
        String str8;
        String str9;
        TLRPC.Chat chat2;
        MessageObject messageObject4;
        CharSequence charSequence29;
        CharSequence charSequence30;
        int i7;
        int i8;
        int i9;
        int dp;
        int dp2;
        int dp3;
        int i10;
        int i11;
        ImageReceiver[] imageReceiverArr;
        DialogCellTags dialogCellTags;
        int dp4;
        int max;
        CharSequence charSequence31;
        int i12;
        int lineCount;
        int lineCount2;
        int lineCount3;
        StaticLayout staticLayout;
        float primaryHorizontal;
        float primaryHorizontal2;
        int i13;
        int lineCount4;
        int lineCount5;
        int i14;
        int lineCount6;
        CharSequence charSequence32;
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
        CharSequence charSequence33;
        String str10;
        SpannableStringBuilder formatInternal;
        if (this.isTransitionSupport) {
            return;
        }
        if (this.isDialogCell && !this.updateHelper.update() && this.currentDialogFolderId == 0 && this.encryptedChat == null) {
            return;
        }
        if (!this.useForceThreeLines) {
            int i15 = SharedConfig.PASSCODE_TYPE_PIN;
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
        if (isForumCell() || (!this.isDialogCell && !this.isTopic)) {
            charSequence = "d ";
            charSequence2 = null;
        } else {
            charSequence = "d ";
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
        MessageObject messageObject5 = this.message;
        if (messageObject5 != null) {
            messageObject5.updateTranslation();
        }
        MessageObject messageObject6 = this.message;
        CharSequence charSequence34 = messageObject6 != null ? messageObject6.messageText : null;
        if (charSequence34 instanceof Spannable) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence34);
            for (URLSpanNoUnderlineBold uRLSpanNoUnderlineBold : (URLSpanNoUnderlineBold[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderlineBold.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderlineBold);
            }
            for (URLSpanNoUnderline uRLSpanNoUnderline : (URLSpanNoUnderline[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpanNoUnderline.class)) {
                spannableStringBuilder.removeSpan(uRLSpanNoUnderline);
            }
            charSequence34 = spannableStringBuilder;
        }
        this.lastMessageString = charSequence34;
        if (this.isShareToStoryCell) {
            this.drawPinBackground = true;
            z = false;
            z2 = false;
        } else {
            z = z17;
            z2 = true;
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
                charSequence33 = LocaleController.getString(R.string.FromYou);
                CustomDialog customDialog3 = this.customDialog;
                if (customDialog3.isMedia) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                    formatInternal = formatInternal(i, this.message.messageText, null);
                    formatInternal.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_attachMessage, this.resourcesProvider), 0, formatInternal.length(), 33);
                } else {
                    String str11 = customDialog3.message;
                    if (str11.length() > 150) {
                        str11 = str11.substring(0, 150);
                    }
                    if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                        formatInternal = formatInternal(i, str11, charSequence33);
                    } else {
                        formatInternal = formatInternal(i, str11.replace('\n', ' '), charSequence33);
                    }
                }
                charSequence26 = Emoji.replaceEmoji(formatInternal, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                z13 = false;
            } else {
                charSequence26 = customDialog2.message;
                if (customDialog2.isMedia) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                }
                charSequence33 = null;
                z13 = true;
            }
            str6 = LocaleController.stringForMessageListDate(this.customDialog.date);
            int i16 = this.customDialog.unread_count;
            if (i16 != 0) {
                this.drawCount = true;
                str10 = String.format("%d", Integer.valueOf(i16));
            } else {
                this.drawCount = false;
                str10 = null;
            }
            CustomDialog customDialog4 = this.customDialog;
            int i17 = customDialog4.sent;
            if (i17 == 0) {
                this.drawClock = true;
                this.drawCheck1 = false;
                this.drawCheck2 = false;
            } else if (i17 == 2) {
                this.drawCheck1 = true;
                this.drawCheck2 = true;
                this.drawClock = false;
            } else if (i17 == 1) {
                this.drawCheck1 = false;
                this.drawCheck2 = true;
                this.drawClock = false;
            } else {
                this.drawClock = false;
                this.drawCheck1 = false;
                this.drawCheck2 = false;
            }
            this.drawError = false;
            charSequence29 = charSequence33;
            escape = customDialog4.name;
            charSequence30 = "";
            i4 = -1;
            str5 = null;
            str4 = str10;
            charSequence28 = null;
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
                    long botVerificationIcon = DialogObject.getBotVerificationIcon(chat3);
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
                            z3 = z2;
                            swapAnimatedEmojiDrawable.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), false);
                            this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), false);
                        } else {
                            z3 = z2;
                            boolean z18 = this.forbidVerified;
                            this.drawVerified = !z18 && this.chat.verified;
                            this.drawBotVerified = (z18 || this.chat.bot_verification_icon == 0) ? false : true;
                        }
                        j = botVerificationIcon;
                        z4 = false;
                    }
                    z3 = z2;
                    j = botVerificationIcon;
                    z4 = false;
                } else {
                    z3 = z2;
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
                                z5 = true;
                                this.drawPremium = z5;
                                if (z5) {
                                    z4 = false;
                                } else {
                                    Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(this.user);
                                    AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiStatus;
                                    swapAnimatedEmojiDrawable2.center = LocaleController.isRTL;
                                    if (emojiStatusDocumentId != null) {
                                        this.nameLayoutEllipsizeByGradient = true;
                                        long longValue = emojiStatusDocumentId.longValue();
                                        z4 = false;
                                        swapAnimatedEmojiDrawable2.set(longValue, false);
                                        this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), false);
                                    } else {
                                        z4 = false;
                                        this.nameLayoutEllipsizeByGradient = true;
                                        swapAnimatedEmojiDrawable2.set(PremiumGradient.getInstance().premiumStarDrawableMini, false);
                                        this.emojiStatus.setParticles(false, false);
                                    }
                                }
                                j = botVerificationIcon2;
                            }
                        }
                        z5 = false;
                        this.drawPremium = z5;
                        if (z5) {
                        }
                        j = botVerificationIcon2;
                    } else {
                        z4 = false;
                        j = 0;
                    }
                }
                if (j != 0 && this.drawBotVerified) {
                    this.botVerification.set(j, z4);
                }
                i2 = this.lastMessageDate;
                if (i2 == 0 && (messageObject4 = this.message) != null) {
                    i2 = messageObject4.messageOwner.date;
                }
                if (!this.isTopic) {
                    charSequence3 = charSequence34;
                    boolean z20 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                    this.draftVoice = z20;
                    TLRPC.DraftMessage draft = !z20 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, getTopicId()) : null;
                    this.draftMessage = draft;
                    if (draft != null && TextUtils.isEmpty(draft.message)) {
                        this.draftMessage = null;
                    }
                } else {
                    charSequence3 = charSequence34;
                    if (this.isDialogCell || this.isSavedDialogCell) {
                        boolean z21 = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.currentDialogId, (long) getTopicId()) != null;
                        this.draftVoice = z21;
                        this.draftMessage = !z21 ? MediaDataController.getInstance(this.currentAccount).getDraft(this.currentDialogId, 0L) : null;
                    } else {
                        this.draftVoice = false;
                        this.draftMessage = null;
                    }
                }
                z6 = this.draftVoice;
                if ((!z6 && this.draftMessage == null) || ((z6 || (draftMessage2 = this.draftMessage) == null || !TextUtils.isEmpty(draftMessage2.message) || ((inputReplyTo = this.draftMessage.reply_to) != null && inputReplyTo.reply_to_msg_id != 0)) && ((draftMessage = this.draftMessage) == null || i2 <= draftMessage.date || this.unreadCount == 0))) {
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
                        z7 = false;
                        if (!isForumCell()) {
                            this.draftMessage = draftMessage3;
                            this.draftVoice = z7;
                            this.needEmoji = true;
                            updateMessageThumbs();
                            CharSequence escape2 = ChatObject.isMonoForum(this.chat) ? null : AndroidUtilities.escape(getMessageNameString());
                            if (ChatObject.isMonoForum(this.chat)) {
                                if (i == 1) {
                                    i = 2;
                                }
                                escape2 = null;
                                if (i == 3) {
                                    i = 4;
                                }
                            }
                            CharSequence formatTopicsNames = formatTopicsNames();
                            MessageObject messageObject7 = this.message;
                            String messageStringFormatted = this.message != null ? getMessageStringFormatted(i, messageObject7 != null ? MessagesController.getInstance(messageObject7.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason) : null, escape2, true) : "";
                            CharSequence charSequence35 = messageStringFormatted;
                            if (this.applyName) {
                                int length = messageStringFormatted.length();
                                charSequence35 = messageStringFormatted;
                                charSequence35 = messageStringFormatted;
                                if (length >= 0 && escape2 != null) {
                                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(messageStringFormatted);
                                    valueOf.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_name, this.resourcesProvider), 0, Math.min(valueOf.length(), escape2.length() + 1), 0);
                                    charSequence35 = valueOf;
                                }
                            }
                            this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                            charSequence23 = escape2;
                            charSequence11 = charSequence35;
                            charSequence5 = charSequence;
                            charSequence24 = "";
                            z2 = z3;
                            z8 = true;
                            i4 = -1;
                            charSequence25 = formatTopicsNames;
                        } else {
                            if (!TextUtils.isEmpty(this.customMessage)) {
                                this.draftMessage = null;
                                this.draftVoice = false;
                                CharSequence charSequence36 = this.customMessage;
                                this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                string2 = charSequence36;
                                charSequence5 = charSequence;
                                charSequence22 = "";
                                z2 = z3;
                                z8 = true;
                                charSequence11 = null;
                                i4 = -1;
                            } else {
                                if (charSequence2 != null) {
                                    this.lastPrintString = charSequence2;
                                    int intValue = MessagesController.getInstance(this.currentAccount).getPrintingStringType(this.currentDialogId, getTopicId()).intValue();
                                    this.printingStringType = intValue;
                                    StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(intValue);
                                    int intrinsicWidth = chatStatusDrawable != null ? chatStatusDrawable.getIntrinsicWidth() + AndroidUtilities.dp(3.0f) : 0;
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    CharSequence replace = TextUtils.replace(charSequence2, new String[]{"..."}, new String[]{""});
                                    int indexOf = this.printingStringType == 5 ? replace.toString().indexOf("**oo**") : -1;
                                    if (indexOf >= 0) {
                                        spannableStringBuilder2.append(replace).setSpan(new FixedWidthSpan(Theme.getChatStatusDrawable(this.printingStringType).getIntrinsicWidth()), indexOf, indexOf + 6, 0);
                                    } else {
                                        spannableStringBuilder2.append((CharSequence) " ").append(replace).setSpan(new FixedWidthSpan(intrinsicWidth), 0, 1, 0);
                                    }
                                    i3 = indexOf;
                                    z8 = false;
                                    charSequence4 = spannableStringBuilder2;
                                } else {
                                    this.lastPrintString = null;
                                    this.printingStringType = -1;
                                    charSequence4 = "";
                                    z8 = true;
                                    i3 = -1;
                                }
                                if (this.draftVoice || this.draftMessage != null) {
                                    charSequence5 = charSequence;
                                    CharSequence string4 = LocaleController.getString(R.string.Draft);
                                    TLRPC.DraftMessage draftMessage4 = this.draftMessage;
                                    if (draftMessage4 != null && TextUtils.isEmpty(draftMessage4.message)) {
                                        if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                            charSequence6 = string4;
                                            i4 = i3;
                                            charSequence7 = "";
                                            z2 = z3;
                                            z8 = false;
                                            charSequence10 = charSequence7;
                                            charSequence9 = charSequence6;
                                        } else {
                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string4);
                                            valueOf2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string4.length(), 33);
                                            charSequence8 = valueOf2;
                                        }
                                    } else {
                                        if (this.draftVoice) {
                                            str = LocaleController.getString(R.string.AttachAudio);
                                        } else {
                                            TLRPC.DraftMessage draftMessage5 = this.draftMessage;
                                            if (draftMessage5 != null) {
                                                str = draftMessage5.message;
                                                if (str.length() > 150) {
                                                    str = str.substring(0, 150);
                                                }
                                            } else {
                                                str = "";
                                            }
                                        }
                                        SpannableString spannableString = new SpannableString(str);
                                        TLRPC.DraftMessage draftMessage6 = this.draftMessage;
                                        if (draftMessage6 != null) {
                                            MediaDataController.addTextStyleRuns(draftMessage6, spannableString, NotificationCenter.goingToPreviewTheme);
                                            TLRPC.DraftMessage draftMessage7 = this.draftMessage;
                                            if (draftMessage7 != null && (arrayList = draftMessage7.entities) != null) {
                                                TextPaint textPaint2 = this.currentMessagePaint;
                                                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, textPaint2 == null ? null : textPaint2.getFontMetricsInt());
                                            }
                                        } else if (this.draftVoice) {
                                            spannableString.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_actionMessage, this.resourcesProvider), 0, spannableString.length(), 33);
                                        }
                                        SpannableStringBuilder formatInternal2 = formatInternal(i, AndroidUtilities.replaceNewLines(spannableString), string4);
                                        if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                            formatInternal2.setSpan(new ForegroundColorSpanThemable(Theme.key_chats_draft, this.resourcesProvider), 0, string4.length() + 1, 33);
                                        }
                                        charSequence8 = Emoji.replaceEmoji(formatInternal2, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), z9);
                                    }
                                    charSequence6 = string4;
                                    i4 = i3;
                                    charSequence7 = charSequence8;
                                    z2 = z3;
                                    z8 = false;
                                    charSequence10 = charSequence7;
                                    charSequence9 = charSequence6;
                                } else {
                                    if (this.clearingDialog) {
                                        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                        string3 = LocaleController.getString(R.string.HistoryCleared);
                                    } else {
                                        MessageObject messageObject8 = this.message;
                                        if (messageObject8 == null) {
                                            if (this.currentDialogFolderId != 0) {
                                                string3 = formatArchivedDialogNames();
                                            } else {
                                                TLRPC.EncryptedChat encryptedChat = this.encryptedChat;
                                                if (encryptedChat != null) {
                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                                                        string3 = LocaleController.getString(R.string.EncryptionProcessing);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                                                        string3 = LocaleController.formatString(R.string.AwaitingEncryption, UserObject.getFirstName(this.user));
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                                                        string3 = LocaleController.getString(R.string.EncryptionRejected);
                                                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                                                        if (encryptedChat.admin_id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                                                            string3 = LocaleController.formatString(R.string.EncryptedChatStartedOutgoing, UserObject.getFirstName(this.user));
                                                        } else {
                                                            string3 = LocaleController.getString(R.string.EncryptedChatStartedIncoming);
                                                        }
                                                    }
                                                } else if (this.dialogsType == 3 && UserObject.isUserSelf(this.user)) {
                                                    DialogsActivity dialogsActivity = this.parentFragment;
                                                    string2 = LocaleController.getString((dialogsActivity == null || !dialogsActivity.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                    i4 = i3;
                                                    charSequence5 = charSequence;
                                                    charSequence11 = null;
                                                    z = false;
                                                    z2 = false;
                                                    charSequence22 = charSequence4;
                                                }
                                                i4 = i3;
                                                charSequence5 = charSequence;
                                                charSequence21 = "";
                                                z2 = z3;
                                                charSequence11 = null;
                                                string2 = charSequence21;
                                                charSequence22 = charSequence4;
                                            }
                                        } else {
                                            String restrictionReason = MessagesController.getInstance(messageObject8.currentAccount).getRestrictionReason(this.message.messageOwner.restriction_reason);
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
                                                    charSequence12 = charSequence;
                                                    long j4 = messagePeerReaction.peer_id.user_id;
                                                    if (j4 != 0 && j4 != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                                        ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(messagePeerReaction.reaction);
                                                        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                        String str12 = fromTL.emojicon;
                                                        if (str12 != null) {
                                                            z10 = true;
                                                            charSequence13 = LocaleController.formatString(R.string.ReactionInDialog, str12);
                                                        } else {
                                                            String formatString = LocaleController.formatString(R.string.ReactionInDialog, "**reaction**");
                                                            int indexOf2 = formatString.indexOf("**reaction**");
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(formatString.replace("**reaction**", "d"));
                                                            long j5 = fromTL.documentId;
                                                            TextPaint textPaint3 = this.currentMessagePaint;
                                                            spannableStringBuilder3.setSpan(new AnimatedEmojiSpan(j5, textPaint3 == null ? null : textPaint3.getFontMetricsInt()), indexOf2, indexOf2 + 1, 0);
                                                            charSequence13 = spannableStringBuilder3;
                                                            z10 = true;
                                                        }
                                                        if (!z10) {
                                                            int i18 = this.dialogsType;
                                                            if (i18 == 2) {
                                                                TLRPC.Chat chat6 = this.chat;
                                                                if (chat6 != null) {
                                                                    if (ChatObject.isChannel(chat6)) {
                                                                        TLRPC.Chat chat7 = this.chat;
                                                                        if (!chat7.megagroup) {
                                                                            int i19 = chat7.participants_count;
                                                                            if (i19 != 0) {
                                                                                string = LocaleController.formatPluralStringComma("Subscribers", i19);
                                                                            } else if (!ChatObject.isPublic(chat7)) {
                                                                                string = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                                                                            } else {
                                                                                string = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                                                                            }
                                                                        }
                                                                    }
                                                                    TLRPC.Chat chat8 = this.chat;
                                                                    int i20 = chat8.participants_count;
                                                                    if (i20 != 0) {
                                                                        string = LocaleController.formatPluralStringComma("Members", i20);
                                                                    } else if (chat8.has_geo) {
                                                                        string = LocaleController.getString(R.string.MegaLocation);
                                                                    } else if (!ChatObject.isPublic(chat8)) {
                                                                        string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                                                                    } else {
                                                                        string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                                                                    }
                                                                } else {
                                                                    string = "";
                                                                }
                                                                this.drawCount2 = false;
                                                            } else if (i18 == 3 && UserObject.isUserSelf(this.user)) {
                                                                DialogsActivity dialogsActivity2 = this.parentFragment;
                                                                string = LocaleController.getString((dialogsActivity2 == null || !dialogsActivity2.isQuote) ? R.string.SavedMessagesInfo : R.string.SavedMessagesInfoQuote);
                                                            } else {
                                                                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout && this.currentDialogFolderId != 0) {
                                                                    charSequence15 = formatArchivedDialogNames();
                                                                    charSequence5 = charSequence12;
                                                                    z8 = false;
                                                                } else {
                                                                    MessageObject messageObject9 = this.message;
                                                                    if ((messageObject9.messageOwner instanceof TLRPC.TL_messageService) && (!MessageObject.isTopicActionMessage(messageObject9) || (this.message.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate))) {
                                                                        if (ChatObject.isChannelAndNotMegaGroup(this.chat) && (this.message.messageOwner.action instanceof TLRPC.TL_messageActionChannelMigrateFrom)) {
                                                                            charSequence13 = "";
                                                                            z = false;
                                                                        } else {
                                                                            CharSequence charSequence37 = this.message.messageTextShort;
                                                                            charSequence13 = charSequence37 != null ? charSequence37 : charSequence3;
                                                                        }
                                                                        this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                        if (this.message.type == 21) {
                                                                            updateMessageThumbs();
                                                                            charSequence13 = applyThumbs(charSequence13);
                                                                        }
                                                                    } else {
                                                                        this.needEmoji = true;
                                                                        updateMessageThumbs();
                                                                        String escape3 = (this.isSavedDialog || (user2 = this.user) == null || !user2.self || this.message.isOutOwner()) ? null : AndroidUtilities.escape(getMessageNameString());
                                                                        if ((!this.isSavedDialog || (user = this.user) == null || user.self || (messageObject2 = this.message) == null || !messageObject2.isOutOwner()) && escape3 == null) {
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
                                                                                CharSequence charSequence38 = restrictionReason;
                                                                                if (isEmpty) {
                                                                                    if (MessageObject.isTopicActionMessage(this.message)) {
                                                                                        MessageObject messageObject10 = this.message;
                                                                                        CharSequence charSequence39 = messageObject10.messageTextShort;
                                                                                        if (charSequence39 == null || ((messageObject10.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate) && this.isTopic)) {
                                                                                            charSequence39 = messageObject10.messageText;
                                                                                        }
                                                                                        CharSequence charSequence40 = charSequence39;
                                                                                        charSequence38 = charSequence40;
                                                                                        if (messageObject10.topicIconDrawable[0] instanceof ForumBubbleDrawable) {
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
                                                                                            if (getCaptionMessage() != null) {
                                                                                                MessageObject captionMessage = getCaptionMessage();
                                                                                                if (!this.needEmoji) {
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
                                                                                                    CharSequence charSequence41 = captionMessage.messageTrimmedToHighlight;
                                                                                                    int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 47);
                                                                                                    if (this.hasNameInMessage) {
                                                                                                        if (!TextUtils.isEmpty(null)) {
                                                                                                            throw null;
                                                                                                        }
                                                                                                        measuredWidth = (int) (measuredWidth - this.currentMessagePaint.measureText(": "));
                                                                                                    }
                                                                                                    if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                                                                                                        charSequence41 = AndroidUtilities.ellipsizeCenterEnd(charSequence41, captionMessage.highlightedWords.get(0), measuredWidth, this.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                                                                                                    }
                                                                                                    charSequence38 = new SpannableStringBuilder(str3).append(charSequence41);
                                                                                                } else {
                                                                                                    SpannableString spannableString2 = new SpannableString(captionMessage.caption);
                                                                                                    if (captionMessage.messageOwner != null) {
                                                                                                        captionMessage.spoilLoginCode();
                                                                                                        MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, captionMessage.caption, spannableString2, NotificationCenter.goingToPreviewTheme);
                                                                                                        ArrayList<TLRPC.MessageEntity> arrayList3 = captionMessage.messageOwner.entities;
                                                                                                        TextPaint textPaint4 = this.currentMessagePaint;
                                                                                                        MediaDataController.addAnimatedEmojiSpans(arrayList3, spannableString2, textPaint4 == null ? null : textPaint4.getFontMetricsInt());
                                                                                                    }
                                                                                                    charSequence38 = new SpannableStringBuilder(str3).append((CharSequence) spannableString2);
                                                                                                }
                                                                                            } else {
                                                                                                MessageObject messageObject11 = this.message;
                                                                                                TLRPC.Message message = messageObject11.messageOwner;
                                                                                                TLRPC.MessageMedia messageMedia2 = message.media;
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
                                                                                                    int i21 = R.string.AttachPaidMedia;
                                                                                                    Object[] objArr = new Object[i5];
                                                                                                    objArr[c2] = formatPluralString2;
                                                                                                    CharSequence replaceStars = StarsIntroActivity.replaceStars(LocaleController.formatString(i21, objArr));
                                                                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                    charSequence38 = replaceStars;
                                                                                                } else if (this.thumbsCount > 1) {
                                                                                                    if (this.hasVideoThumb) {
                                                                                                        ArrayList arrayList4 = this.groupMessages;
                                                                                                        formatPluralString = LocaleController.formatPluralString("Media", arrayList4 == null ? 0 : arrayList4.size(), new Object[0]);
                                                                                                    } else {
                                                                                                        ArrayList arrayList5 = this.groupMessages;
                                                                                                        formatPluralString = LocaleController.formatPluralString("Photos", arrayList5 == null ? 0 : arrayList5.size(), new Object[0]);
                                                                                                    }
                                                                                                    charSequence38 = formatPluralString;
                                                                                                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                } else {
                                                                                                    if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                                                                                        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
                                                                                                        if (messageFwdHeader != null) {
                                                                                                            TLRPC.Peer peer = messageFwdHeader.from_id;
                                                                                                            if (peer instanceof TLRPC.TL_peerChannel) {
                                                                                                                isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(peer.channel_id, this.currentAccount);
                                                                                                                charSequence17 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                            }
                                                                                                        }
                                                                                                        isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.chat);
                                                                                                        charSequence17 = LocaleController.getString(!isChannelAndNotMegaGroup ? R.string.BoostingGiveawayChannelStarted : R.string.BoostingGiveawayGroupStarted);
                                                                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                                                                                        charSequence17 = LocaleController.getString(R.string.BoostingGiveawayResults);
                                                                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                                                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                                                                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                                                                                                        if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                                                                                                            charSequence17 = "📊 " + tL_messageMediaPoll.poll.question.text;
                                                                                                        } else {
                                                                                                            SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text);
                                                                                                            TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                                                                                                            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                                                                                                            MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                            charSequence17 = new SpannableStringBuilder("📊 ").append((CharSequence) spannableString3);
                                                                                                        }
                                                                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                                                                                        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia2;
                                                                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                                                                                                        if (tL_textWithEntities3 == null || tL_textWithEntities3.entities == null) {
                                                                                                            charSequence17 = "✅ " + tL_messageMediaToDo.todo.title.text;
                                                                                                        } else {
                                                                                                            SpannableString spannableString4 = new SpannableString(tL_messageMediaToDo.todo.title.text);
                                                                                                            TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                                                                                                            MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString4);
                                                                                                            MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString4, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                                                                                                            charSequence17 = new SpannableStringBuilder("✅ ").append((CharSequence) spannableString4);
                                                                                                        }
                                                                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                                                        charSequence17 = "🎮 " + this.message.messageOwner.media.game.title;
                                                                                                    } else if (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice) {
                                                                                                        charSequence17 = messageMedia2.title;
                                                                                                    } else if (messageObject11.type == 14) {
                                                                                                        charSequence17 = String.format("🎧 %s - %s", messageObject11.getMusicAuthor(), this.message.getMusicTitle());
                                                                                                    } else if ((messageMedia2 instanceof TLRPC.TL_messageMediaStory) && messageMedia2.via_mention) {
                                                                                                        if (messageObject11.isOut()) {
                                                                                                            TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.message.getDialogId()));
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
                                                                                                            int i22 = R.string.StoryYouMentionInDialog;
                                                                                                            Object[] objArr2 = new Object[1];
                                                                                                            objArr2[c] = str2;
                                                                                                            charSequence17 = LocaleController.formatString(i22, objArr2);
                                                                                                        } else {
                                                                                                            charSequence17 = LocaleController.getString(R.string.StoryMentionInDialog);
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (messageObject11.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                                            CharSequence charSequence42 = this.message.messageTrimmedToHighlight;
                                                                                                            int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 23);
                                                                                                            MessageObject messageObject12 = this.message;
                                                                                                            charSequence16 = charSequence42;
                                                                                                            if (messageObject12.messageTrimmedToHighlightCut) {
                                                                                                                charSequence16 = AndroidUtilities.ellipsizeCenterEnd(charSequence42, messageObject12.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, NotificationCenter.dialogTranslate);
                                                                                                            }
                                                                                                        } else {
                                                                                                            SpannableString spannableString5 = new SpannableString(charSequence3);
                                                                                                            MessageObject messageObject13 = this.message;
                                                                                                            if (messageObject13 != null) {
                                                                                                                messageObject13.spoilLoginCode();
                                                                                                            }
                                                                                                            MediaDataController.addTextStyleRuns(this.message, spannableString5, NotificationCenter.goingToPreviewTheme);
                                                                                                            MessageObject messageObject14 = this.message;
                                                                                                            charSequence16 = spannableString5;
                                                                                                            if (messageObject14 != null) {
                                                                                                                TLRPC.Message message2 = messageObject14.messageOwner;
                                                                                                                charSequence16 = spannableString5;
                                                                                                                if (message2 != null) {
                                                                                                                    ArrayList<TLRPC.MessageEntity> arrayList6 = message2.entities;
                                                                                                                    TextPaint textPaint5 = this.currentMessagePaint;
                                                                                                                    MediaDataController.addAnimatedEmojiSpans(arrayList6, spannableString5, textPaint5 == null ? null : textPaint5.getFontMetricsInt());
                                                                                                                    charSequence16 = spannableString5;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        AndroidUtilities.highlightText(charSequence16, this.message.highlightedWords, this.resourcesProvider);
                                                                                                        charSequence17 = charSequence16;
                                                                                                    }
                                                                                                    CharSequence charSequence43 = charSequence17;
                                                                                                    MessageObject messageObject15 = this.message;
                                                                                                    charSequence38 = charSequence43;
                                                                                                    if (messageObject15.messageOwner.media != null) {
                                                                                                        charSequence38 = charSequence43;
                                                                                                        if (!messageObject15.isMediaEmpty()) {
                                                                                                            this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                                                                                                            charSequence38 = charSequence43;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (this.message.isReplyToStory()) {
                                                                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(charSequence38);
                                                                                    charSequence5 = charSequence12;
                                                                                    spannableStringBuilder4.insert(0, charSequence5);
                                                                                    spannableStringBuilder4.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.msg_mini_replystory).mutate()), 0, 1, 0);
                                                                                    charSequence14 = spannableStringBuilder4;
                                                                                } else {
                                                                                    charSequence5 = charSequence12;
                                                                                    charSequence14 = charSequence38;
                                                                                }
                                                                                CharSequence charSequence44 = charSequence14;
                                                                                if (this.thumbsCount > 0) {
                                                                                    if (this.message.hasHighlightedWords() && !TextUtils.isEmpty(this.message.messageOwner.message)) {
                                                                                        replaceNewLines = this.message.messageTrimmedToHighlight;
                                                                                        int measuredWidth3 = getMeasuredWidth() - AndroidUtilities.dp(((this.messagePaddingStart + 23) + ((this.thumbSize + 2) * this.thumbsCount)) + 3);
                                                                                        MessageObject messageObject16 = this.message;
                                                                                        if (messageObject16.messageTrimmedToHighlightCut) {
                                                                                            replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, messageObject16.highlightedWords.get(0), measuredWidth3, this.currentMessagePaint, NotificationCenter.dialogTranslate).toString();
                                                                                        }
                                                                                    } else {
                                                                                        int length2 = charSequence14.length();
                                                                                        CharSequence charSequence45 = charSequence14;
                                                                                        if (length2 > 150) {
                                                                                            charSequence45 = charSequence14.subSequence(0, 150);
                                                                                        }
                                                                                        replaceNewLines = AndroidUtilities.replaceNewLines(charSequence45);
                                                                                    }
                                                                                    CharSequence spannableStringBuilder5 = !(replaceNewLines instanceof SpannableStringBuilder) ? new SpannableStringBuilder(replaceNewLines) : replaceNewLines;
                                                                                    SpannableStringBuilder spannableStringBuilder6 = (SpannableStringBuilder) spannableStringBuilder5;
                                                                                    spannableStringBuilder6.insert(0, (CharSequence) " ");
                                                                                    spannableStringBuilder6.setSpan(new FixedWidthSpan(AndroidUtilities.dp(((this.thumbSize + 2) * this.thumbsCount) + 3)), 0, 1, 33);
                                                                                    Emoji.replaceEmoji(spannableStringBuilder6, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                    CharSequence charSequence46 = spannableStringBuilder5;
                                                                                    if (this.message.hasHighlightedWords()) {
                                                                                        CharSequence highlightText4 = AndroidUtilities.highlightText(spannableStringBuilder6, this.message.highlightedWords, this.resourcesProvider);
                                                                                        charSequence46 = spannableStringBuilder5;
                                                                                        if (highlightText4 != null) {
                                                                                            charSequence46 = highlightText4;
                                                                                        }
                                                                                    }
                                                                                    z8 = false;
                                                                                    charSequence44 = charSequence46;
                                                                                }
                                                                                if (this.message.isForwarded() && this.message.needDrawForwarded()) {
                                                                                    this.drawForwardIcon = true;
                                                                                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(charSequence44);
                                                                                    spannableStringBuilder7.insert(0, charSequence5);
                                                                                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_forwarded).mutate());
                                                                                    coloredImageSpan.setAlpha(0.9f);
                                                                                    spannableStringBuilder7.setSpan(coloredImageSpan, 0, 1, 0);
                                                                                    charSequence15 = spannableStringBuilder7;
                                                                                } else {
                                                                                    charSequence15 = charSequence44;
                                                                                }
                                                                            }
                                                                        }
                                                                        charSequence5 = charSequence12;
                                                                        if (escape3 == null) {
                                                                            escape3 = getMessageNameString();
                                                                        }
                                                                        CharSequence escape4 = AndroidUtilities.escape(escape3);
                                                                        TLRPC.Chat chat10 = this.chat;
                                                                        if (chat10 != null && chat10.forum && !this.isTopic && !this.useFromUserAsAvatar) {
                                                                            CharSequence topicIconName = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint);
                                                                            if (!TextUtils.isEmpty(topicIconName)) {
                                                                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder("-");
                                                                                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(ContextCompat.getDrawable(ApplicationLoader.applicationContext, R.drawable.msg_mini_forumarrow).mutate());
                                                                                coloredImageSpan2.setColorKey((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? -1 : Theme.key_chats_nameMessage);
                                                                                spannableStringBuilder8.setSpan(coloredImageSpan2, 0, 1, 0);
                                                                                SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                                                                                spannableStringBuilder9.append(escape4).append((CharSequence) spannableStringBuilder8).append(topicIconName);
                                                                                charSequence18 = spannableStringBuilder9;
                                                                                SpannableStringBuilder messageStringFormatted2 = getMessageStringFormatted(i, restrictionReason, charSequence18, false);
                                                                                if (!this.useFromUserAsAvatar || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && (this.currentDialogFolderId == 0 || messageStringFormatted2.length() <= 0))) {
                                                                                    i6 = 0;
                                                                                } else {
                                                                                    try {
                                                                                        foregroundColorSpanThemable = new ForegroundColorSpanThemable(Theme.key_chats_nameMessage, this.resourcesProvider);
                                                                                        i6 = charSequence18.length() + 1;
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
                                                                                        charSequence19 = replaceEmoji;
                                                                                        z8 = false;
                                                                                        charSequence20 = charSequence18;
                                                                                        CharSequence charSequence47 = charSequence20;
                                                                                        if (this.currentDialogFolderId != 0) {
                                                                                        }
                                                                                        charSequence10 = charSequence19;
                                                                                        i4 = i3;
                                                                                        z2 = z3;
                                                                                        charSequence9 = charSequence47;
                                                                                        charSequence11 = null;
                                                                                        charSequence25 = charSequence10;
                                                                                        charSequence24 = charSequence4;
                                                                                        charSequence23 = charSequence9;
                                                                                        CharSequence charSequence48 = charSequence25;
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
                                                                                        this.drawError = false;
                                                                                        str4 = null;
                                                                                        str5 = null;
                                                                                        this.promoDialog = z11;
                                                                                        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                                                                                        CharSequence charSequence49 = charSequence48;
                                                                                        if (this.dialogsType == 0) {
                                                                                        }
                                                                                        CharSequence charSequence50 = charSequence49;
                                                                                        String str13 = stringForMessageListDate;
                                                                                        charSequence26 = charSequence50;
                                                                                        if (this.currentDialogFolderId == 0) {
                                                                                        }
                                                                                        if (!z2) {
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
                                                                                        int dp8 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
                                                                                        this.nameWidth -= dp8;
                                                                                        this.nameAdditionalsForChannelSubscriber += dp8;
                                                                                        if (LocaleController.isRTL) {
                                                                                        }
                                                                                        if (this.drawBotVerified) {
                                                                                        }
                                                                                        i9 = this.namePaddingEnd;
                                                                                        if (i9 > 0) {
                                                                                        }
                                                                                        dp7 = this.nameWidth - AndroidUtilities.dp(12.0f);
                                                                                        if (dp7 < 0) {
                                                                                        }
                                                                                        if (escape instanceof String) {
                                                                                        }
                                                                                        if (!this.nameLayoutEllipsizeByGradient) {
                                                                                        }
                                                                                        float f = dp7;
                                                                                        this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(escape.toString()) <= f;
                                                                                        if (!this.twoLinesForName) {
                                                                                        }
                                                                                        CharSequence replaceEmoji2 = Emoji.replaceEmoji(escape, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                                        MessageObject messageObject17 = this.message;
                                                                                        if (messageObject17 == null) {
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
                                                                                        this.countTop = AndroidUtilities.dp(42.33f);
                                                                                        this.checkDrawTop = AndroidUtilities.dp(13.0f);
                                                                                        int measuredWidth4 = getMeasuredWidth() - AndroidUtilities.dp(this.messagePaddingStart + 21);
                                                                                        if (!LocaleController.isRTL) {
                                                                                        }
                                                                                        i10 = measuredWidth4;
                                                                                        this.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(56.0f));
                                                                                        i11 = 0;
                                                                                        while (true) {
                                                                                            imageReceiverArr = this.thumbImage;
                                                                                            if (i11 < imageReceiverArr.length) {
                                                                                            }
                                                                                            imageReceiverArr[i11].setImageCoords(((this.thumbSize + 2) * i11) + dp3, ((AndroidUtilities.dp(31.0f) + dp) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                                                                                            i11++;
                                                                                            dp = dp;
                                                                                        }
                                                                                        int i23 = dp;
                                                                                        int i24 = i10;
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
                                                                                            if (z13) {
                                                                                            }
                                                                                            max = Math.max(AndroidUtilities.dp(12.0f), i24);
                                                                                            this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                            if (!this.useForceThreeLines) {
                                                                                                this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
                                                                                                if (!isForumCell()) {
                                                                                                }
                                                                                                charSequence31 = charSequence29;
                                                                                                if (this.twoLinesForName) {
                                                                                                }
                                                                                                this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                                this.buttonCreated = false;
                                                                                                if (TextUtils.isEmpty(charSequence28)) {
                                                                                                }
                                                                                                this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                                if (!TextUtils.isEmpty(charSequence30)) {
                                                                                                }
                                                                                                if (charSequence26 instanceof Spannable) {
                                                                                                }
                                                                                                if (!this.useForceThreeLines) {
                                                                                                }
                                                                                                this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                                                                                charSequence32 = charSequence31;
                                                                                                charSequence31 = null;
                                                                                                alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                                if (!this.useForceThreeLines) {
                                                                                                }
                                                                                                if (this.thumbsCount > 0) {
                                                                                                    max += AndroidUtilities.dp(5.0f);
                                                                                                }
                                                                                                this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence32, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence31 == null ? 1 : 2);
                                                                                                i12 = max;
                                                                                                this.spoilersPool.addAll(this.spoilers);
                                                                                                this.spoilers.clear();
                                                                                                SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                                this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack, this.messageLayout);
                                                                                                if (LocaleController.isRTL) {
                                                                                                }
                                                                                                staticLayout = this.typingLayout;
                                                                                                if (staticLayout != null) {
                                                                                                }
                                                                                                updateThumbsPosition();
                                                                                            }
                                                                                            this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
                                                                                            if (!isForumCell()) {
                                                                                            }
                                                                                            charSequence31 = charSequence29;
                                                                                            if (this.twoLinesForName) {
                                                                                            }
                                                                                            this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                            this.buttonCreated = false;
                                                                                            if (TextUtils.isEmpty(charSequence28)) {
                                                                                            }
                                                                                            this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                            if (!TextUtils.isEmpty(charSequence30)) {
                                                                                            }
                                                                                            if (charSequence26 instanceof Spannable) {
                                                                                            }
                                                                                            if (!this.useForceThreeLines) {
                                                                                            }
                                                                                            this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                                                                            charSequence32 = charSequence31;
                                                                                            charSequence31 = null;
                                                                                            alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                            if (!this.useForceThreeLines) {
                                                                                            }
                                                                                            if (this.thumbsCount > 0) {
                                                                                            }
                                                                                            this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence32, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence31 == null ? 1 : 2);
                                                                                            i12 = max;
                                                                                            this.spoilersPool.addAll(this.spoilers);
                                                                                            this.spoilers.clear();
                                                                                            SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                            this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack, this.messageLayout);
                                                                                            if (LocaleController.isRTL) {
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
                                                                                        if (z13) {
                                                                                        }
                                                                                        max = Math.max(AndroidUtilities.dp(12.0f), i24);
                                                                                        this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
                                                                                        if (!this.useForceThreeLines) {
                                                                                        }
                                                                                        this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
                                                                                        if (!isForumCell()) {
                                                                                        }
                                                                                        charSequence31 = charSequence29;
                                                                                        if (this.twoLinesForName) {
                                                                                        }
                                                                                        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
                                                                                        this.buttonCreated = false;
                                                                                        if (TextUtils.isEmpty(charSequence28)) {
                                                                                        }
                                                                                        this.animatedEmojiStack3 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack3, this.buttonLayout);
                                                                                        if (!TextUtils.isEmpty(charSequence30)) {
                                                                                        }
                                                                                        if (charSequence26 instanceof Spannable) {
                                                                                        }
                                                                                        if (!this.useForceThreeLines) {
                                                                                        }
                                                                                        this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                                                                        charSequence32 = charSequence31;
                                                                                        charSequence31 = null;
                                                                                        alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                                                                                        if (!this.useForceThreeLines) {
                                                                                        }
                                                                                        if (this.thumbsCount > 0) {
                                                                                        }
                                                                                        this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence32, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence31 == null ? 1 : 2);
                                                                                        i12 = max;
                                                                                        this.spoilersPool.addAll(this.spoilers);
                                                                                        this.spoilers.clear();
                                                                                        SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
                                                                                        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack, this.messageLayout);
                                                                                        if (LocaleController.isRTL) {
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
                                                                                    SpannableStringBuilder spannableStringBuilder10 = (SpannableStringBuilder) replaceEmoji;
                                                                                    if (i6 >= spannableStringBuilder10.length()) {
                                                                                        spannableStringBuilder10.append((CharSequence) " ");
                                                                                        spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), spannableStringBuilder10.length() - 1, spannableStringBuilder10.length(), 33);
                                                                                    } else {
                                                                                        spannableStringBuilder10.insert(i6, (CharSequence) " ");
                                                                                        spannableStringBuilder10.setSpan(new FixedWidthSpan(AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3)), i6, i6 + 1, 33);
                                                                                    }
                                                                                }
                                                                                charSequence19 = replaceEmoji;
                                                                                z8 = false;
                                                                                charSequence20 = charSequence18;
                                                                                CharSequence charSequence472 = charSequence20;
                                                                                if (this.currentDialogFolderId != 0) {
                                                                                    charSequence472 = formatArchivedDialogNames();
                                                                                }
                                                                                charSequence10 = charSequence19;
                                                                                i4 = i3;
                                                                                z2 = z3;
                                                                                charSequence9 = charSequence472;
                                                                            }
                                                                        }
                                                                        charSequence18 = escape4;
                                                                        SpannableStringBuilder messageStringFormatted22 = getMessageStringFormatted(i, restrictionReason, charSequence18, false);
                                                                        if (this.useFromUserAsAvatar) {
                                                                        }
                                                                        i6 = 0;
                                                                        replaceEmoji = Emoji.replaceEmoji(messageStringFormatted22, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
                                                                        if (this.message.hasHighlightedWords()) {
                                                                            replaceEmoji = highlightText;
                                                                        }
                                                                        if (this.thumbsCount > 0) {
                                                                        }
                                                                        charSequence19 = replaceEmoji;
                                                                        z8 = false;
                                                                        charSequence20 = charSequence18;
                                                                        CharSequence charSequence4722 = charSequence20;
                                                                        if (this.currentDialogFolderId != 0) {
                                                                        }
                                                                        charSequence10 = charSequence19;
                                                                        i4 = i3;
                                                                        z2 = z3;
                                                                        charSequence9 = charSequence4722;
                                                                    }
                                                                }
                                                                charSequence20 = null;
                                                                charSequence19 = charSequence15;
                                                                CharSequence charSequence47222 = charSequence20;
                                                                if (this.currentDialogFolderId != 0) {
                                                                }
                                                                charSequence10 = charSequence19;
                                                                i4 = i3;
                                                                z2 = z3;
                                                                charSequence9 = charSequence47222;
                                                            }
                                                            charSequence19 = string;
                                                            charSequence5 = charSequence12;
                                                            z = false;
                                                            charSequence20 = null;
                                                            z3 = false;
                                                            CharSequence charSequence472222 = charSequence20;
                                                            if (this.currentDialogFolderId != 0) {
                                                            }
                                                            charSequence10 = charSequence19;
                                                            i4 = i3;
                                                            z2 = z3;
                                                            charSequence9 = charSequence472222;
                                                        }
                                                        charSequence5 = charSequence12;
                                                        charSequence15 = charSequence13;
                                                        charSequence20 = null;
                                                        charSequence19 = charSequence15;
                                                        CharSequence charSequence4722222 = charSequence20;
                                                        if (this.currentDialogFolderId != 0) {
                                                        }
                                                        charSequence10 = charSequence19;
                                                        i4 = i3;
                                                        z2 = z3;
                                                        charSequence9 = charSequence4722222;
                                                    }
                                                    charSequence13 = "";
                                                    z10 = false;
                                                    if (!z10) {
                                                    }
                                                    charSequence5 = charSequence12;
                                                    charSequence15 = charSequence13;
                                                    charSequence20 = null;
                                                    charSequence19 = charSequence15;
                                                    CharSequence charSequence47222222 = charSequence20;
                                                    if (this.currentDialogFolderId != 0) {
                                                    }
                                                    charSequence10 = charSequence19;
                                                    i4 = i3;
                                                    z2 = z3;
                                                    charSequence9 = charSequence47222222;
                                                }
                                            }
                                            charSequence12 = charSequence;
                                            charSequence13 = "";
                                            z10 = false;
                                            if (!z10) {
                                            }
                                            charSequence5 = charSequence12;
                                            charSequence15 = charSequence13;
                                            charSequence20 = null;
                                            charSequence19 = charSequence15;
                                            CharSequence charSequence472222222 = charSequence20;
                                            if (this.currentDialogFolderId != 0) {
                                            }
                                            charSequence10 = charSequence19;
                                            i4 = i3;
                                            z2 = z3;
                                            charSequence9 = charSequence472222222;
                                        }
                                    }
                                    charSequence21 = string3;
                                    i4 = i3;
                                    charSequence5 = charSequence;
                                    z2 = z3;
                                    charSequence11 = null;
                                    string2 = charSequence21;
                                    charSequence22 = charSequence4;
                                }
                                charSequence11 = null;
                                charSequence25 = charSequence10;
                                charSequence24 = charSequence4;
                                charSequence23 = charSequence9;
                            }
                            charSequence23 = null;
                            charSequence25 = string2;
                            charSequence24 = charSequence22;
                        }
                        CharSequence charSequence482 = charSequence25;
                        if (!this.drawForwardIcon) {
                            charSequence482 = charSequence25;
                            if (!isFolderCell()) {
                                charSequence482 = charSequence25;
                                if (!isForumCell()) {
                                    charSequence482 = charSequence25;
                                    if (!isDialogFolder()) {
                                        charSequence482 = charSequence25;
                                        if (this.draftMessage == null) {
                                            MessageObject messageObject18 = this.message;
                                            charSequence482 = charSequence25;
                                            if (messageObject18 != null) {
                                                TLRPC.Message message3 = messageObject18.messageOwner;
                                                charSequence482 = charSequence25;
                                                if (message3 != null) {
                                                    charSequence482 = charSequence25;
                                                    if (message3.action instanceof TLRPC.TL_messageActionStarGift) {
                                                        this.drawGiftIcon = true;
                                                        SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(charSequence25);
                                                        spannableStringBuilder11.insert(0, charSequence5);
                                                        ColoredImageSpan coloredImageSpan3 = new ColoredImageSpan(ContextCompat.getDrawable(getContext(), R.drawable.mini_gift).mutate());
                                                        coloredImageSpan3.setScale(1.25f, 1.25f);
                                                        coloredImageSpan3.spaceScaleX = 0.9f;
                                                        coloredImageSpan3.setAlpha(0.9f);
                                                        spannableStringBuilder11.setSpan(coloredImageSpan3, 0, 1, 0);
                                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = ((TLRPC.TL_messageActionStarGift) this.message.messageOwner.action).message;
                                                        if (tL_textWithEntities5 != null && !TextUtils.isEmpty(tL_textWithEntities5.text)) {
                                                            this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                                                        }
                                                        charSequence482 = spannableStringBuilder11;
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
                                stringForMessageListDate = LocaleController.stringForMessageListDate(r1.date);
                            } else {
                                int i25 = this.lastMessageDate;
                                if (i25 != 0) {
                                    stringForMessageListDate = LocaleController.stringForMessageListDate(i25);
                                } else {
                                    if (this.message != null) {
                                        stringForMessageListDate = LocaleController.stringForMessageListDate(r1.messageOwner.date);
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
                                this.drawError = false;
                                str4 = null;
                                str5 = null;
                            } else {
                                if (this.currentDialogFolderId != 0) {
                                    int i26 = this.unreadCount;
                                    int i27 = this.mentionCount;
                                    int i28 = i26 + i27;
                                    if (i28 <= 0) {
                                        z16 = false;
                                        this.drawCount = false;
                                        this.drawMention = false;
                                        str8 = null;
                                    } else if (i26 > i27) {
                                        this.drawCount = true;
                                        z16 = false;
                                        this.drawMention = false;
                                        str9 = String.format("%d", Integer.valueOf(i28));
                                        str8 = null;
                                        this.drawReactionMention = z16;
                                        str5 = str8;
                                        str7 = str9;
                                    } else {
                                        z16 = false;
                                        this.drawCount = false;
                                        this.drawMention = true;
                                        str8 = String.format("%d", Integer.valueOf(i28));
                                    }
                                    str9 = null;
                                    this.drawReactionMention = z16;
                                    str5 = str8;
                                    str7 = str9;
                                } else {
                                    if (this.clearingDialog) {
                                        this.drawCount = false;
                                        str7 = null;
                                        z = false;
                                        z14 = true;
                                        z15 = false;
                                    } else {
                                        int i29 = this.unreadCount;
                                        z14 = true;
                                        if (i29 != 0 && (i29 != 1 || i29 != this.mentionCount || !messageObject3.messageOwner.mentioned)) {
                                            this.drawCount = true;
                                            z15 = false;
                                            str7 = String.format("%d", Integer.valueOf(i29));
                                        } else {
                                            z15 = false;
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
                                        this.drawMention = z14;
                                        str5 = "@";
                                    } else {
                                        this.drawMention = z15;
                                        str5 = null;
                                    }
                                    if (this.reactionMentionCount > 0) {
                                        this.drawReactionMention = z14;
                                    } else {
                                        this.drawReactionMention = z15;
                                    }
                                }
                                if (this.message.isOut() && this.draftMessage == null && z) {
                                    MessageObject messageObject19 = this.message;
                                    if (!(messageObject19.messageOwner.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                                        if (messageObject19.isSending()) {
                                            this.drawCheck1 = false;
                                            this.drawCheck2 = false;
                                            this.drawClock = true;
                                            this.drawError = false;
                                        } else if (this.message.isSendError()) {
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
                                                int i30 = this.readOutboxMaxId;
                                                this.drawCheck1 = (i30 > 0 && i30 >= this.message.getId()) || !this.message.isUnread() || (ChatObject.isChannel(this.chat) && !this.chat.megagroup);
                                            } else {
                                                this.drawCheck1 = !this.message.isUnread() || (ChatObject.isChannel(this.chat) && !this.chat.megagroup);
                                            }
                                            this.drawCheck2 = true;
                                            this.drawClock = false;
                                            this.drawError = false;
                                        }
                                        str4 = str7;
                                        z11 = false;
                                    }
                                }
                                this.drawCheck1 = false;
                                this.drawCheck2 = false;
                                this.drawClock = false;
                                this.drawError = false;
                                str4 = str7;
                                z11 = false;
                            }
                            this.promoDialog = z11;
                            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                            CharSequence charSequence492 = charSequence482;
                            if (this.dialogsType == 0) {
                                charSequence492 = charSequence482;
                                if (messagesController2.isPromoDialog(this.currentDialogId, true)) {
                                    this.drawPinBackground = true;
                                    this.promoDialog = true;
                                    int i31 = messagesController2.promoDialogType;
                                    if (i31 == MessagesController.PROMO_TYPE_PROXY) {
                                        stringForMessageListDate = LocaleController.getString(R.string.UseProxySponsor);
                                        charSequence492 = charSequence482;
                                    } else {
                                        charSequence492 = charSequence482;
                                        if (i31 == MessagesController.PROMO_TYPE_PSA) {
                                            stringForMessageListDate = LocaleController.getString("PsaType_" + messagesController2.promoPsaType);
                                            if (TextUtils.isEmpty(stringForMessageListDate)) {
                                                stringForMessageListDate = LocaleController.getString(R.string.PsaTypeDefault);
                                            }
                                            charSequence492 = charSequence482;
                                            if (!TextUtils.isEmpty(messagesController2.promoPsaMessage)) {
                                                CharSequence charSequence51 = messagesController2.promoPsaMessage;
                                                this.thumbsCount = 0;
                                                charSequence492 = charSequence51;
                                            }
                                        }
                                    }
                                }
                            }
                            CharSequence charSequence502 = charSequence492;
                            String str132 = stringForMessageListDate;
                            charSequence26 = charSequence502;
                            if (this.currentDialogFolderId == 0) {
                                z13 = z8;
                                escape = LocaleController.getString(R.string.ArchivedChats);
                                charSequence28 = charSequence11;
                                str6 = str132;
                                charSequence30 = charSequence24;
                                charSequence29 = charSequence23;
                            } else {
                                TLRPC.Chat chat11 = this.chat;
                                if (chat11 != null) {
                                    if (this.useFromUserAsAvatar) {
                                        if (this.topicIconInName == null) {
                                            this.topicIconInName = new Drawable[1];
                                        }
                                        this.topicIconInName[0] = null;
                                        topicSpannedName = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopicIconName(this.chat, this.message, this.currentMessagePaint, this.topicIconInName);
                                        z12 = z8;
                                        charSequence27 = charSequence26;
                                    } else if (this.isTopic) {
                                        if (this.topicIconInName == null) {
                                            this.topicIconInName = new Drawable[1];
                                        }
                                        Drawable[] drawableArr = this.topicIconInName;
                                        drawableArr[0] = null;
                                        topicSpannedName = this.showTopicIconInName ? ForumUtilities.getTopicSpannedName(this.forumTopic, Theme.dialogs_namePaint[this.paintIndex], drawableArr, false) : AndroidUtilities.escape(this.forumTopic.title);
                                        z12 = z8;
                                        charSequence27 = charSequence26;
                                    } else {
                                        if (chat11.monoforum && chat11.linked_monoforum_id != 0) {
                                            TLRPC.Chat chat12 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.linked_monoforum_id));
                                            if (chat12 != null) {
                                                SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(AndroidUtilities.escape(chat12.title));
                                                spannableStringBuilder12.append((CharSequence) " ");
                                                int length3 = spannableStringBuilder12.length();
                                                int i32 = R.string.MonoforumSpan;
                                                spannableStringBuilder12.append((CharSequence) LocaleController.getString(i32));
                                                z12 = z8;
                                                charSequence27 = charSequence26;
                                                spannableStringBuilder12.setSpan(new FilterCreateActivity.TextSpan(LocaleController.getString(i32), 9.33f, Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider), length3, spannableStringBuilder12.length(), 33);
                                                escape = spannableStringBuilder12;
                                            } else {
                                                z12 = z8;
                                                charSequence27 = charSequence26;
                                                escape = AndroidUtilities.escape(this.chat.title);
                                            }
                                        } else {
                                            z12 = z8;
                                            charSequence27 = charSequence26;
                                            escape = AndroidUtilities.escape(chat11.title);
                                        }
                                        if (escape != null && escape.length() == 0) {
                                            escape = LocaleController.getString(R.string.HiddenName);
                                        }
                                        charSequence28 = charSequence11;
                                        charSequence26 = charSequence27;
                                        str6 = str132;
                                        z13 = z12;
                                        charSequence30 = charSequence24;
                                        charSequence29 = charSequence23;
                                    }
                                    escape = topicSpannedName;
                                    if (escape != null) {
                                        escape = LocaleController.getString(R.string.HiddenName);
                                    }
                                    charSequence28 = charSequence11;
                                    charSequence26 = charSequence27;
                                    str6 = str132;
                                    z13 = z12;
                                    charSequence30 = charSequence24;
                                    charSequence29 = charSequence23;
                                } else {
                                    z12 = z8;
                                    charSequence27 = charSequence26;
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
                                        charSequence28 = charSequence11;
                                        charSequence26 = charSequence27;
                                        str6 = str132;
                                        z13 = z12;
                                        charSequence30 = charSequence24;
                                        charSequence29 = charSequence23;
                                    }
                                    escape = "";
                                    if (escape != null) {
                                    }
                                    charSequence28 = charSequence11;
                                    charSequence26 = charSequence27;
                                    str6 = str132;
                                    z13 = z12;
                                    charSequence30 = charSequence24;
                                    charSequence29 = charSequence23;
                                }
                            }
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
                        this.drawError = false;
                        str4 = null;
                        str5 = null;
                        this.promoDialog = z11;
                        MessagesController messagesController22 = MessagesController.getInstance(this.currentAccount);
                        CharSequence charSequence4922 = charSequence482;
                        if (this.dialogsType == 0) {
                        }
                        CharSequence charSequence5022 = charSequence4922;
                        String str1322 = stringForMessageListDate;
                        charSequence26 = charSequence5022;
                        if (this.currentDialogFolderId == 0) {
                        }
                    }
                }
                draftMessage3 = null;
                this.draftMessage = null;
                z7 = false;
                this.draftVoice = false;
                if (!isForumCell()) {
                }
                CharSequence charSequence4822 = charSequence25;
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
                this.drawError = false;
                str4 = null;
                str5 = null;
                this.promoDialog = z11;
                MessagesController messagesController222 = MessagesController.getInstance(this.currentAccount);
                CharSequence charSequence49222 = charSequence4822;
                if (this.dialogsType == 0) {
                }
                CharSequence charSequence50222 = charSequence49222;
                String str13222 = stringForMessageListDate;
                charSequence26 = charSequence50222;
                if (this.currentDialogFolderId == 0) {
                }
            }
            z3 = z2;
            i2 = this.lastMessageDate;
            if (i2 == 0) {
                i2 = messageObject4.messageOwner.date;
            }
            if (!this.isTopic) {
            }
            z6 = this.draftVoice;
            if (!z6) {
                if (ChatObject.isChannel(this.chat)) {
                }
                chat2 = this.chat;
                if (chat2 != null) {
                }
                draftMessage3 = null;
                z7 = false;
                if (!isForumCell()) {
                }
                CharSequence charSequence48222 = charSequence25;
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
                this.drawError = false;
                str4 = null;
                str5 = null;
                this.promoDialog = z11;
                MessagesController messagesController2222 = MessagesController.getInstance(this.currentAccount);
                CharSequence charSequence492222 = charSequence48222;
                if (this.dialogsType == 0) {
                }
                CharSequence charSequence502222 = charSequence492222;
                String str132222 = stringForMessageListDate;
                charSequence26 = charSequence502222;
                if (this.currentDialogFolderId == 0) {
                }
            }
            if (ChatObject.isChannel(this.chat)) {
            }
            chat2 = this.chat;
            if (chat2 != null) {
            }
            draftMessage3 = null;
            z7 = false;
            if (!isForumCell()) {
            }
            CharSequence charSequence482222 = charSequence25;
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
            this.drawError = false;
            str4 = null;
            str5 = null;
            this.promoDialog = z11;
            MessagesController messagesController22222 = MessagesController.getInstance(this.currentAccount);
            CharSequence charSequence4922222 = charSequence482222;
            if (this.dialogsType == 0) {
            }
            CharSequence charSequence5022222 = charSequence4922222;
            String str1322222 = stringForMessageListDate;
            charSequence26 = charSequence5022222;
            if (this.currentDialogFolderId == 0) {
            }
        }
        if (!z2) {
            int ceil = (int) Math.ceil(Theme.dialogs_timePaint.measureText(str6));
            this.timeLayout = new StaticLayout(str6, Theme.dialogs_timePaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i7 = AndroidUtilities.dp(getIsPinned() ? 24.0f : 4.0f) + ceil;
            if (!LocaleController.isRTL) {
                this.timeLeft = (getMeasuredWidth() - AndroidUtilities.dp(15.0f)) - i7;
            } else {
                this.timeLeft = AndroidUtilities.dp(15.0f);
            }
        } else {
            this.timeLayout = null;
            this.timeLeft = 0;
            i7 = 0;
        }
        if (drawLock2()) {
            i8 = 0;
        } else {
            if (LocaleController.isRTL) {
                this.lock2Left = this.timeLeft + i7 + AndroidUtilities.dp(4.0f);
            } else {
                this.lock2Left = (this.timeLeft - Theme.dialogs_lock2Drawable.getIntrinsicWidth()) - AndroidUtilities.dp(4.0f);
            }
            i8 = Theme.dialogs_lock2Drawable.getIntrinsicWidth() + AndroidUtilities.dp(4.0f);
            i7 += i8;
        }
        if (LocaleController.isRTL) {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(22.0f)) - i7;
        } else {
            this.nameWidth = ((getMeasuredWidth() - this.nameLeft) - AndroidUtilities.dp(this.messagePaddingStart + 13)) - i7;
            this.nameLeft += i7;
        }
        if (this.drawNameLock) {
            this.nameWidth -= AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 4.0f) + Theme.dialogs_lockDrawable.getIntrinsicWidth();
        }
        if (!this.drawClock) {
            int intrinsicWidth2 = Theme.dialogs_clockDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            this.nameWidth -= intrinsicWidth2;
            if (!LocaleController.isRTL) {
                this.clockDrawLeft = (this.timeLeft - i8) - intrinsicWidth2;
            } else {
                this.clockDrawLeft = this.timeLeft + i7 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth2;
            }
        } else if (this.drawCheck2) {
            int intrinsicWidth3 = Theme.dialogs_checkDrawable.getIntrinsicWidth() + AndroidUtilities.dp(5.0f);
            int i33 = this.nameWidth - intrinsicWidth3;
            this.nameWidth = i33;
            if (this.drawCheck1) {
                this.nameWidth = i33 - (Theme.dialogs_halfCheckDrawable.getIntrinsicWidth() - AndroidUtilities.dp(8.0f));
                if (!LocaleController.isRTL) {
                    int i34 = (this.timeLeft - i8) - intrinsicWidth3;
                    this.halfCheckDrawLeft = i34;
                    this.checkDrawLeft = i34 - AndroidUtilities.dp(5.5f);
                } else {
                    int dp9 = this.timeLeft + i7 + AndroidUtilities.dp(5.0f);
                    this.checkDrawLeft = dp9;
                    this.halfCheckDrawLeft = dp9 + AndroidUtilities.dp(5.5f);
                    this.nameLeft += (intrinsicWidth3 + Theme.dialogs_halfCheckDrawable.getIntrinsicWidth()) - AndroidUtilities.dp(8.0f);
                }
            } else if (!LocaleController.isRTL) {
                this.checkDrawLeft1 = (this.timeLeft - i8) - intrinsicWidth3;
            } else {
                this.checkDrawLeft1 = this.timeLeft + i7 + AndroidUtilities.dp(5.0f);
                this.nameLeft += intrinsicWidth3;
            }
        }
        this.nameAdditionalsForChannelSubscriber = 0;
        if (!this.drawPremium && this.emojiStatus.getDrawable() != null) {
            int dp10 = AndroidUtilities.dp(36.0f);
            this.nameWidth -= dp10;
            this.nameAdditionalsForChannelSubscriber += dp10;
            if (LocaleController.isRTL) {
                this.nameLeft += dp10;
            }
        } else if ((!this.dialogMuted || this.drawUnmute) && !this.drawVerified && this.drawScam == 0) {
            int dp82 = AndroidUtilities.dp(6.0f) + Theme.dialogs_muteDrawable.getIntrinsicWidth();
            this.nameWidth -= dp82;
            this.nameAdditionalsForChannelSubscriber += dp82;
            if (LocaleController.isRTL) {
                this.nameLeft += dp82;
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
        i9 = this.namePaddingEnd;
        if (i9 > 0) {
            this.nameWidth -= i9;
            if (LocaleController.isRTL) {
                this.nameLeft += i9;
            }
        }
        try {
            dp7 = this.nameWidth - AndroidUtilities.dp(12.0f);
            if (dp7 < 0) {
                dp7 = 0;
            }
            if (escape instanceof String) {
                escape = ((String) escape).replace('\n', ' ');
            }
            if (!this.nameLayoutEllipsizeByGradient) {
                this.nameLayoutFits = escape.length() == TextUtils.ellipsize(escape, Theme.dialogs_namePaint[this.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
                dp7 += AndroidUtilities.dp(48.0f);
                this.channelShouldUseLineWidth = this.nameLayoutFits;
            } else if (this.isForChannelSubscriberCell) {
                this.channelShouldUseLineWidth = escape.length() == TextUtils.ellipsize(escape, Theme.dialogs_namePaint[this.paintIndex], (float) dp7, TextUtils.TruncateAt.END).length();
            }
            float f2 = dp7;
            this.nameIsEllipsized = Theme.dialogs_namePaint[this.paintIndex].measureText(escape.toString()) <= f2;
            if (!this.twoLinesForName) {
                escape = TextUtils.ellipsize(escape, Theme.dialogs_namePaint[this.paintIndex], f2, TextUtils.TruncateAt.END);
            }
            CharSequence replaceEmoji22 = Emoji.replaceEmoji(escape, Theme.dialogs_namePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject172 = this.message;
            CharSequence charSequence52 = (messageObject172 == null && messageObject172.hasHighlightedWords() && (highlightText3 = AndroidUtilities.highlightText(replaceEmoji22, this.message.highlightedWords, this.resourcesProvider)) != null) ? highlightText3 : replaceEmoji22;
            if (!this.twoLinesForName) {
                this.nameLayout = StaticLayoutEx.createStaticLayout(charSequence52, Theme.dialogs_namePaint[this.paintIndex], dp7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, dp7, 2);
            } else {
                this.nameLayout = new StaticLayout(charSequence52, Theme.dialogs_namePaint[this.paintIndex], Math.max(dp7, this.nameWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            i10 = measuredWidth42;
            this.storyParams.originalAvatarRect.set(dp2, dp, dp2 + AndroidUtilities.dp(56.0f), dp + AndroidUtilities.dp(56.0f));
            i11 = 0;
            while (true) {
                imageReceiverArr = this.thumbImage;
                if (i11 < imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i11].setImageCoords(((this.thumbSize + 2) * i11) + dp3, ((AndroidUtilities.dp(31.0f) + dp) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags = this.tags) == null || dialogCellTags.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                i11++;
                dp = dp;
            }
        } else {
            dp = AndroidUtilities.dp(9.0f);
            this.messageNameTop = AndroidUtilities.dp(31.0f);
            this.timeTop = AndroidUtilities.dp(16.0f);
            this.errorTop = AndroidUtilities.dp(39.0f);
            this.pinTop = AndroidUtilities.dp(39.0f);
            this.countTop = AndroidUtilities.dp(this.isTopic ? 35.0f : 38.0f);
            this.checkDrawTop = AndroidUtilities.dp(17.0f);
            int measuredWidth5 = getMeasuredWidth() - AndroidUtilities.dp((this.messagePaddingStart + 23) - (LocaleController.isRTL ? 0 : 12));
            if (LocaleController.isRTL) {
                int dp16 = AndroidUtilities.dp(22.0f);
                this.messageNameLeft = dp16;
                this.messageLeft = dp16;
                this.typingLeft = dp16;
                this.buttonLeft = dp16;
                dp5 = getMeasuredWidth() - AndroidUtilities.dp(this.avatarStart + 52);
                dp6 = dp5 - AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 9);
            } else {
                int dp17 = AndroidUtilities.dp(this.messagePaddingStart + 4);
                this.messageNameLeft = dp17;
                this.messageLeft = dp17;
                this.typingLeft = dp17;
                this.buttonLeft = dp17;
                dp5 = AndroidUtilities.dp(this.avatarStart);
                dp6 = AndroidUtilities.dp(67.0f) + dp5;
            }
            i10 = measuredWidth5;
            this.storyParams.originalAvatarRect.set(dp5, dp, dp5 + AndroidUtilities.dp(52.0f), dp + AndroidUtilities.dp(52.0f));
            int i35 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr2 = this.thumbImage;
                if (i35 >= imageReceiverArr2.length) {
                    break;
                }
                imageReceiverArr2[i35].setImageCoords(((this.thumbSize + 2) * i35) + dp6, ((AndroidUtilities.dp(30.0f) + dp) + (this.twoLinesForName ? AndroidUtilities.dp(20.0f) : 0)) - ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout || (dialogCellTags3 = this.tags) == null || dialogCellTags3.isEmpty()) ? 0 : AndroidUtilities.dp(9.0f)), AndroidUtilities.dp(this.thumbSize), AndroidUtilities.dp(this.thumbSize));
                i35++;
                dp = dp;
            }
        }
        int i232 = dp;
        int i242 = i10;
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
            int dp18 = AndroidUtilities.dp(31.0f);
            i242 -= dp18;
            if (!LocaleController.isRTL) {
                this.errorLeft = getMeasuredWidth() - AndroidUtilities.dp(34.0f);
            } else {
                this.errorLeft = AndroidUtilities.dp(11.0f);
                this.messageLeft += dp18;
                this.typingLeft += dp18;
                this.buttonLeft += dp18;
                this.messageNameLeft += dp18;
            }
        } else if (str4 != null || str5 != null || this.drawReactionMention) {
            if (str4 != null) {
                this.countWidth = Math.max(AndroidUtilities.dp(5.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(str4)));
                this.countLayout = new StaticLayout(str4, Theme.dialogs_countTextPaint, this.countWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp19 = this.countWidth + AndroidUtilities.dp(14.0f);
                i242 -= dp19;
                if (!LocaleController.isRTL) {
                    this.countLeft = (getMeasuredWidth() - this.countWidth) - AndroidUtilities.dp(22.66f);
                } else {
                    this.countLeft = AndroidUtilities.dp(22.66f);
                    this.messageLeft += dp19;
                    this.typingLeft += dp19;
                    this.buttonLeft += dp19;
                    this.messageNameLeft += dp19;
                }
                this.drawCount = true;
            } else {
                this.countWidth = 0;
            }
            if (str5 != null) {
                if (this.currentDialogFolderId != 0) {
                    this.mentionWidth = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(str5)));
                    this.mentionLayout = new StaticLayout(str5, Theme.dialogs_countTextPaint, this.mentionWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                } else {
                    this.mentionWidth = AndroidUtilities.dp(12.0f);
                }
                int dp20 = this.mentionWidth + AndroidUtilities.dp(18.0f);
                i242 -= dp20;
                if (!LocaleController.isRTL) {
                    int measuredWidth6 = (getMeasuredWidth() - this.mentionWidth) - AndroidUtilities.dp(20.0f);
                    int i36 = this.countWidth;
                    this.mentionLeft = measuredWidth6 - (i36 != 0 ? i36 + AndroidUtilities.dp(18.0f) : 0);
                } else {
                    int dp21 = AndroidUtilities.dp(20.0f);
                    int i37 = this.countWidth;
                    this.mentionLeft = dp21 + (i37 != 0 ? i37 + AndroidUtilities.dp(18.0f) : 0);
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
                int dp22 = AndroidUtilities.dp(24.0f);
                i242 -= dp22;
                if (!LocaleController.isRTL) {
                    int measuredWidth7 = getMeasuredWidth() - AndroidUtilities.dp(32.0f);
                    this.reactionMentionLeft = measuredWidth7;
                    if (this.drawMention) {
                        int i38 = this.mentionWidth;
                        this.reactionMentionLeft = measuredWidth7 - (i38 != 0 ? i38 + AndroidUtilities.dp(18.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i39 = this.reactionMentionLeft;
                        int i40 = this.countWidth;
                        this.reactionMentionLeft = i39 - (i40 != 0 ? i40 + AndroidUtilities.dp(18.0f) : 0);
                    }
                } else {
                    int dp23 = AndroidUtilities.dp(20.0f);
                    this.reactionMentionLeft = dp23;
                    if (this.drawMention) {
                        int i41 = this.mentionWidth;
                        this.reactionMentionLeft = dp23 + (i41 != 0 ? i41 + AndroidUtilities.dp(18.0f) : 0);
                    }
                    if (this.drawCount) {
                        int i42 = this.reactionMentionLeft;
                        int i43 = this.countWidth;
                        this.reactionMentionLeft = i42 + (i43 != 0 ? i43 + AndroidUtilities.dp(18.0f) : 0);
                    }
                    this.messageLeft += dp22;
                    this.typingLeft += dp22;
                    this.buttonLeft += dp22;
                    this.messageNameLeft += dp22;
                }
            }
        } else if (this.allowBotOpenButton && !isFolderCell() && !isForumCell() && !isDialogFolder() && UserObject.isBot(this.user) && this.user.bot_has_main_app) {
            setOpenBotButton(true);
            int dp24 = (int) (AndroidUtilities.dp(26.0f) + this.openButtonText.getCurrentWidth());
            int dp25 = AndroidUtilities.dp(13.0f);
            i242 -= dp24;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                dp4 = AndroidUtilities.dp(40.0f);
            } else {
                dp4 = AndroidUtilities.dp(this.isTopic ? 33.0f : 36.0f);
            }
            if (!LocaleController.isRTL) {
                this.openButtonRect.set((getMeasuredWidth() - dp24) - AndroidUtilities.dp(13.0f), dp4, getMeasuredWidth() - AndroidUtilities.dp(13.0f), dp4 + AndroidUtilities.dp(28.0f));
            } else {
                this.openButtonRect.set(AndroidUtilities.dp(13.0f), dp4, AndroidUtilities.dp(13.0f) + dp24, dp4 + AndroidUtilities.dp(28.0f));
                int i44 = dp24 + dp25;
                this.messageLeft += i44;
                this.typingLeft += i44;
                this.buttonLeft += i44;
                this.messageNameLeft += i44;
            }
            this.drawCount = false;
            this.drawMention = false;
        } else {
            this.drawCount = false;
            this.drawMention = false;
        }
        if (z13) {
            if (charSequence26 == null) {
                charSequence26 = "";
            }
            if (charSequence26.length() > 150) {
                charSequence26 = charSequence26.subSequence(0, 150);
            }
            if ((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || hasTags() || charSequence29 != null) {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceNewLines(charSequence26);
            } else {
                replaceTwoNewLinesToOne = AndroidUtilities.replaceTwoNewLinesToOne(charSequence26);
            }
            charSequence26 = Emoji.replaceEmoji(replaceTwoNewLinesToOne, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt(), false);
            MessageObject messageObject20 = this.message;
            if (messageObject20 != null && (highlightText2 = AndroidUtilities.highlightText(charSequence26, messageObject20.highlightedWords, this.resourcesProvider)) != null) {
                charSequence26 = highlightText2;
            }
        }
        max = Math.max(AndroidUtilities.dp(12.0f), i242);
        this.buttonTop = AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 58.0f : 62.0f);
        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
            this.buttonTop -= AndroidUtilities.dp(!isForumCell() ? 10.0f : 12.0f);
        }
        if (!isForumCell()) {
            this.messageTop = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 34.0f : 39.0f);
            int i45 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr3 = this.thumbImage;
                if (i45 >= imageReceiverArr3.length) {
                    break;
                }
                imageReceiverArr3[i45].setImageY(this.buttonTop);
                i45++;
            }
        } else if ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && charSequence29 != null && (this.currentDialogFolderId == 0 || this.currentDialogFolderDialogsCount == 1)) {
            try {
                MessageObject messageObject21 = this.message;
                charSequence29 = charSequence29;
                if (messageObject21 != null) {
                    charSequence29 = charSequence29;
                    if (messageObject21.hasHighlightedWords()) {
                        CharSequence highlightText5 = AndroidUtilities.highlightText(charSequence29, this.message.highlightedWords, this.resourcesProvider);
                        charSequence29 = charSequence29;
                        if (highlightText5 != null) {
                            charSequence29 = highlightText5;
                        }
                    }
                }
                this.messageNameLayout = StaticLayoutEx.createStaticLayout(charSequence29, Theme.dialogs_messageNamePaint, max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, max, 1);
                charSequence29 = charSequence29;
            } catch (Exception e4) {
                FileLog.e(e4);
                charSequence29 = charSequence29;
            }
            this.messageTop = AndroidUtilities.dp(51.0f);
            int dp26 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
            int i46 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr4 = this.thumbImage;
                if (i46 >= imageReceiverArr4.length) {
                    break;
                }
                imageReceiverArr4[i46].setImageY(i232 + dp26 + AndroidUtilities.dp(40.0f));
                i46++;
            }
        } else {
            this.messageNameLayout = null;
            if (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) {
                this.messageTop = AndroidUtilities.dp(32.0f);
                int dp27 = (this.nameIsEllipsized && this.isTopic) ? AndroidUtilities.dp(20.0f) : 0;
                int i47 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr5 = this.thumbImage;
                    if (i47 >= imageReceiverArr5.length) {
                        break;
                    }
                    imageReceiverArr5[i47].setImageY(i232 + dp27 + AndroidUtilities.dp(21.0f));
                    i47++;
                }
            } else {
                this.messageTop = AndroidUtilities.dp(39.0f);
            }
        }
        charSequence31 = charSequence29;
        if (this.twoLinesForName) {
            this.messageTop += AndroidUtilities.dp(20.0f);
        }
        this.animatedEmojiStack2 = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack2, this.messageNameLayout);
        try {
            this.buttonCreated = false;
            if (TextUtils.isEmpty(charSequence28)) {
                this.buttonLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(charSequence28, this.currentMessagePaint.getFontMetricsInt(), false), this.currentMessagePaint, max - AndroidUtilities.dp(26.0f), TextUtils.TruncateAt.END), this.currentMessagePaint, max - AndroidUtilities.dp(20.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            if (!TextUtils.isEmpty(charSequence30)) {
                if (!this.useForceThreeLines) {
                    if (!SharedConfig.useThreeLinesLayout) {
                    }
                    this.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence30, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                if (!hasTags()) {
                    this.typingLayout = StaticLayoutEx.createStaticLayout(charSequence30, Theme.dialogs_messagePrintingPaint[this.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, 1);
                }
                this.typingLayout = new StaticLayout(TextUtils.ellipsize(charSequence30, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END), Theme.dialogs_messagePrintingPaint[this.paintIndex], max, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        } catch (Exception e5) {
            FileLog.e(e5);
        }
        try {
            if (charSequence26 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence26;
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
            }
            if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags() && this.currentDialogFolderId != 0 && this.currentDialogFolderDialogsCount > 1) {
                this.currentMessagePaint = Theme.dialogs_messagePaint[this.paintIndex];
                charSequence32 = charSequence31;
                charSequence31 = null;
            } else {
                if (!this.useForceThreeLines) {
                }
                if (!hasTags()) {
                    if (charSequence31 == null) {
                        if (ChatObject.isMonoForum(this.chat) && ChatObject.canManageMonoForum(this.currentAccount, this.chat)) {
                        }
                        charSequence32 = charSequence26;
                    }
                }
                if (!isForumCell() && (charSequence26 instanceof Spanned) && ((FixedWidthSpan[]) ((Spanned) charSequence26).getSpans(0, charSequence26.length(), FixedWidthSpan.class)).length <= 0) {
                    ellipsize = TextUtils.ellipsize(charSequence26, this.currentMessagePaint, max - AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 15), TextUtils.TruncateAt.END);
                } else {
                    ellipsize = TextUtils.ellipsize(charSequence26, this.currentMessagePaint, max - AndroidUtilities.dp(12.0f), TextUtils.TruncateAt.END);
                }
                charSequence26 = ellipsize;
                charSequence32 = charSequence26;
            }
            alignment = (this.isForum || !LocaleController.isRTL) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            if ((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !hasTags()) {
                if (this.thumbsCount > 0 && charSequence31 != null) {
                    max += AndroidUtilities.dp(5.0f);
                }
                this.messageLayout = StaticLayoutEx.createStaticLayout(charSequence32, this.currentMessagePaint, max, alignment, 1.0f, AndroidUtilities.dp(1.0f), false, TextUtils.TruncateAt.END, max, charSequence31 == null ? 1 : 2);
            } else {
                if (this.thumbsCount > 0) {
                    max += AndroidUtilities.dp((r0 * (this.thumbSize + 2)) + 3);
                    if (LocaleController.isRTL && !isForumCell()) {
                        this.messageLeft -= AndroidUtilities.dp((this.thumbsCount * (this.thumbSize + 2)) + 3);
                    }
                }
                this.messageLayout = new StaticLayout(charSequence32, this.currentMessagePaint, max, alignment, 1.0f, 0.0f, false);
            }
            i12 = max;
            this.spoilersPool.addAll(this.spoilers);
            this.spoilers.clear();
            SpoilerEffect.addSpoilers(this, this.messageLayout, -2, -2, this.spoilersPool, this.spoilers);
        } catch (Exception e6) {
            e = e6;
        }
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, this.animatedEmojiStack, this.messageLayout);
        if (LocaleController.isRTL) {
            StaticLayout staticLayout2 = this.nameLayout;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                float lineLeft = this.nameLayout.getLineLeft(0);
                double ceil2 = Math.ceil(this.nameLayout.getLineWidth(0));
                int dp28 = this.nameLeft + AndroidUtilities.dp(12.0f);
                this.nameLeft = dp28;
                if (this.drawBotVerified) {
                    this.nameLeft = dp28 + AndroidUtilities.dp(21.0f);
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
            StaticLayout staticLayout3 = this.messageLayout;
            if (staticLayout3 != null && (lineCount6 = staticLayout3.getLineCount()) > 0) {
                int i48 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i49 = 0;
                while (true) {
                    if (i49 >= lineCount6) {
                        break;
                    }
                    if (this.messageLayout.getLineLeft(i49) != 0.0f) {
                        i48 = 0;
                        break;
                    } else {
                        i48 = Math.min(i48, (int) (i12 - Math.ceil(this.messageLayout.getLineWidth(i49))));
                        i49++;
                    }
                }
                if (i48 != Integer.MAX_VALUE) {
                    this.messageLeft += i48;
                }
            }
            StaticLayout staticLayout4 = this.typingLayout;
            if (staticLayout4 != null && (lineCount5 = staticLayout4.getLineCount()) > 0) {
                int i50 = 0;
                int i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (true) {
                    if (i50 >= lineCount5) {
                        i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        break;
                    } else if (this.typingLayout.getLineLeft(i50) != 0.0f) {
                        i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        i51 = 0;
                        break;
                    } else {
                        i51 = Math.min(i51, (int) (i12 - Math.ceil(this.typingLayout.getLineWidth(i50))));
                        i50++;
                    }
                }
                if (i51 != i14) {
                    this.typingLeft += i51;
                }
            }
            StaticLayout staticLayout5 = this.messageNameLayout;
            if (staticLayout5 != null && staticLayout5.getLineCount() > 0 && this.messageNameLayout.getLineLeft(0) == 0.0f) {
                double ceil3 = Math.ceil(this.messageNameLayout.getLineWidth(0));
                double d2 = i12;
                if (ceil3 < d2) {
                    this.messageNameLeft = (int) (this.messageNameLeft + (d2 - ceil3));
                }
            }
            StaticLayout staticLayout6 = this.buttonLayout;
            if (staticLayout6 != null && (lineCount4 = staticLayout6.getLineCount()) > 0) {
                int i52 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                for (int i53 = 0; i53 < lineCount4; i53++) {
                    i52 = (int) Math.min(i52, this.buttonLayout.getWidth() - this.buttonLayout.getLineRight(i53));
                }
                this.buttonLeft += i52;
            }
        } else {
            StaticLayout staticLayout7 = this.nameLayout;
            if (staticLayout7 != null && staticLayout7.getLineCount() > 0) {
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
                this.nameMuteLeft = (int) (this.nameLeft + lineRight + AndroidUtilities.dp(6.0f));
            }
            StaticLayout staticLayout8 = this.messageLayout;
            if (staticLayout8 != null && (lineCount3 = staticLayout8.getLineCount()) > 0) {
                float f3 = 2.14748365E9f;
                for (int i54 = 0; i54 < lineCount3; i54++) {
                    f3 = Math.min(f3, this.messageLayout.getLineLeft(i54));
                }
                this.messageLeft = (int) (this.messageLeft - f3);
            }
            StaticLayout staticLayout9 = this.buttonLayout;
            if (staticLayout9 != null && (lineCount2 = staticLayout9.getLineCount()) > 0) {
                float f4 = 2.14748365E9f;
                for (int i55 = 0; i55 < lineCount2; i55++) {
                    f4 = Math.min(f4, this.buttonLayout.getLineLeft(i55));
                }
                this.buttonLeft = (int) (this.buttonLeft - f4);
            }
            StaticLayout staticLayout10 = this.typingLayout;
            if (staticLayout10 != null && (lineCount = staticLayout10.getLineCount()) > 0) {
                float f5 = 2.14748365E9f;
                for (int i56 = 0; i56 < lineCount; i56++) {
                    f5 = Math.min(f5, this.typingLayout.getLineLeft(i56));
                }
                this.typingLeft = (int) (this.typingLeft - f5);
            }
            StaticLayout staticLayout11 = this.messageNameLayout;
            if (staticLayout11 != null && staticLayout11.getLineCount() > 0) {
                this.messageNameLeft = (int) (this.messageNameLeft - this.messageNameLayout.getLineLeft(0));
            }
        }
        staticLayout = this.typingLayout;
        if (staticLayout != null && this.printingStringType >= 0 && staticLayout.getText().length() > 0) {
            if (i4 < 0 && (i13 = i4 + 1) < this.typingLayout.getText().length()) {
                primaryHorizontal = this.typingLayout.getPrimaryHorizontal(i4);
                primaryHorizontal2 = this.typingLayout.getPrimaryHorizontal(i13);
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

    public boolean isDrawArchive() {
        TLRPC.TL_forumTopic tL_forumTopic;
        return this.drawArchive && (this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == 1)) && this.translationX == 0.0f && this.archivedChatsDrawable != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0cc1, code lost:
    
        if (r3.lastKnownTypingType >= 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0da9, code lost:
    
        if (r0 == 8) goto L444;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0d6b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0f72  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x104a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x10b2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x10be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x1118  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x113d  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1155  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x131d  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x1341  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x157a  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x1717  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x1747  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x175a  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x177f  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1799  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x17e0  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x180e  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1819  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x1828  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1830  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1834  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x189f  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x18a8  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x18af  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x18f2  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1976  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x19c6  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x19f6  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1a4c  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x1a64  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x1aa8  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x1ab1  */
    /* JADX WARN: Removed duplicated region for block: B:590:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x1aaa  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x1a88  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x1a5f  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x1a1f  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x19ce  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x19df  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x1779  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x138c  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x144c  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x1525  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x11a9  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x111b  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x11bf  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x1212  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x103f  */
    /* JADX WARN: Removed duplicated region for block: B:825:0x0f6c  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:860:0x0d64  */
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
        float f2;
        int i3;
        String str;
        float f3;
        boolean z;
        RLottieDrawable rLottieDrawable;
        float f4;
        float f5;
        float f6;
        Canvas canvas2;
        int i4;
        float f7;
        float f8;
        boolean z2;
        boolean z3;
        float f9;
        boolean z4;
        boolean z5;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z6;
        boolean z7;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        int i5;
        int i6;
        float f10;
        int i7;
        boolean z8;
        int i8;
        float f11;
        int i9;
        Canvas canvas3;
        Canvas canvas4;
        int i10;
        int i11;
        float f12;
        int i12;
        int i13;
        int i14;
        boolean z9;
        boolean z10;
        boolean z11;
        float f13;
        int i15;
        DialogCellTags dialogCellTags;
        int i16;
        float dp;
        float f14;
        float f15;
        float f16;
        DialogUpdateHelper dialogUpdateHelper;
        float f17;
        StaticLayout staticLayout;
        float f18;
        StaticLayout staticLayout2;
        CustomDialog customDialog;
        float f19;
        int i17;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic3;
        float f20 = 12.5f;
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
            String str3 = string;
            int i18 = i;
            int i19 = color2;
            int i20 = i18;
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
                f2 = 0.0f;
                i2 = i21;
                f = measuredWidth;
                canvas.drawRect(measuredWidth - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
                if (this.currentRevealProgress == 0.0f) {
                    if (Theme.dialogs_archiveDrawableRecolored) {
                        Theme.dialogs_archiveDrawable.setLayerColor("Arrow.**", Theme.getNonAnimatedColor(Theme.key_chats_archiveBackground));
                        z = false;
                        Theme.dialogs_archiveDrawableRecolored = false;
                    } else {
                        z = false;
                    }
                    if (Theme.dialogs_hidePsaDrawableRecolored) {
                        Theme.dialogs_hidePsaDrawable.beginApplyLayerColors();
                        RLottieDrawable rLottieDrawable2 = Theme.dialogs_hidePsaDrawable;
                        int i22 = Theme.key_chats_archiveBackground;
                        rLottieDrawable2.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i22));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i22));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i22));
                        Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                        Theme.dialogs_hidePsaDrawableRecolored = z;
                    }
                }
            } else {
                i2 = i21;
                f = measuredWidth;
                f2 = 0.0f;
            }
            int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.translationDrawable.getIntrinsicWidth() / 2);
            int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(52.0f)) / 2;
            int intrinsicWidth = (this.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth2;
            int intrinsicHeight = (this.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight;
            if (this.currentRevealProgress > f2) {
                canvas.save();
                f3 = f;
                i3 = i2;
                str = str3;
                canvas.clipRect(f3 - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
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
                    int i23 = Theme.key_chats_archivePinBackground;
                    rLottieDrawable3.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i23));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i23));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i23));
                    Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                    Theme.dialogs_hidePsaDrawableRecolored = true;
                }
            } else {
                i3 = i2;
                str = str3;
                f3 = f;
            }
            canvas.save();
            canvas.translate(measuredWidth2, measuredHeight);
            float f21 = this.currentRevealBounceProgress;
            if (f21 != 0.0f && f21 != 1.0f) {
                float interpolation = this.interpolator.getInterpolation(f21) + 1.0f;
                canvas.scale(interpolation, interpolation, this.translationDrawable.getIntrinsicWidth() / 2, this.translationDrawable.getIntrinsicHeight() / 2);
            }
            BaseCell.setDrawableBounds((Drawable) this.translationDrawable, 0, 0);
            this.translationDrawable.draw(canvas);
            canvas.restore();
            canvas.clipRect(f3, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            String str4 = str;
            int ceil = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(str4));
            int i24 = i3;
            if (this.swipeMessageTextId != i24 || this.swipeMessageWidth != getMeasuredWidth()) {
                this.swipeMessageTextId = i24;
                this.swipeMessageWidth = getMeasuredWidth();
                TextPaint textPaint = Theme.dialogs_archiveTextPaint;
                int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                StaticLayout staticLayout3 = new StaticLayout(str4, textPaint, min, alignment, 1.0f, 0.0f, false);
                this.swipeMessageTextLayout = staticLayout3;
                if (staticLayout3.getLineCount() > 1) {
                    this.swipeMessageTextLayout = new StaticLayout(str4, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
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
            f4 = 0.0f + this.translationX;
        } else {
            f4 = 0.0f;
        }
        float dp2 = AndroidUtilities.dp(8.0f) * this.cornerProgress;
        if (this.isSelected) {
            f5 = 0.0f;
            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), getCollapsedHeight(), this.rightFragmentOpenedProgress));
            this.rect.offset(0.0f, (-this.translateY) + this.collapseOffset);
            canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
        } else {
            f5 = 0.0f;
        }
        canvas.save();
        canvas.translate(f5, (-this.rightFragmentOffset) * this.rightFragmentOpenedProgress);
        if (this.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || this.archiveBackgroundProgress != f5)) {
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
            f6 = 0.0f + this.collapseOffset;
        } else {
            f6 = 0.0f;
        }
        float f22 = this.rightFragmentOpenedProgress;
        if (f22 != 1.0f) {
            if (f22 != 0.0f) {
                float clamp = Utilities.clamp(f22 / 0.4f, 1.0f, 0.0f);
                if (SharedConfig.getDevicePerformanceClass() >= 2) {
                    i6 = 2;
                    i5 = 0;
                    i17 = canvas.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.rightFragmentOpenedProgress) * 255.0f), 31);
                    f19 = 0.0f;
                } else {
                    i5 = 0;
                    i6 = 2;
                    int save = canvas.save();
                    f19 = 0.0f;
                    canvas.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + 1) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    i17 = save;
                }
                canvas.translate((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress, f19);
                f10 = f4 + ((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress);
                i7 = i17;
            } else {
                i5 = 0;
                i6 = 2;
                f10 = f4;
                i7 = -1;
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
                    Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(i5, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, 1.0f));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r0.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
                } else if (getIsPinned() || this.drawPinBackground) {
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                    Theme.dialogs_pinnedPaint.setAlpha((int) (r0.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
                }
                canvas.restore();
            }
            if (this.translationX != 0.0f) {
                float f23 = this.cornerProgress;
                if (f23 < 1.0f) {
                    float f24 = f23 + 0.10666667f;
                    this.cornerProgress = f24;
                    if (f24 > 1.0f) {
                        this.cornerProgress = 1.0f;
                    }
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                float f25 = this.cornerProgress;
                if (f25 > 0.0f) {
                    float f26 = f25 - 0.10666667f;
                    this.cornerProgress = f26;
                    if (f26 < 0.0f) {
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
            int dp3 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 14.0f);
            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                dp3 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
            }
            if (this.nameLayout != null) {
                if (this.nameLayoutEllipsizeByGradient && !this.nameLayoutFits) {
                    if (this.nameLayoutEllipsizeLeft && this.fadePaint == null) {
                        Paint paint = new Paint();
                        this.fadePaint = paint;
                        float[] fArr = new float[i6];
                        // fill-array-data instruction
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{-1, i5}, fArr, Shader.TileMode.CLAMP));
                        this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    } else if (this.fadePaintBack == null) {
                        Paint paint2 = new Paint();
                        this.fadePaintBack = paint2;
                        float[] fArr2 = new float[i6];
                        // fill-array-data instruction
                        fArr2[0] = 0.0f;
                        fArr2[1] = 1.0f;
                        paint2.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{i5, -1}, fArr2, Shader.TileMode.CLAMP));
                        this.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), NotificationCenter.cameraInitied, 31);
                    int i25 = this.nameLeft;
                    canvas.clipRect(i25, i5, this.nameWidth + i25, getMeasuredHeight());
                }
                if (this.currentDialogFolderId != 0) {
                    TextPaint textPaint2 = Theme.dialogs_namePaint[this.paintIndex];
                    int color3 = Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider);
                    textPaint2.linkColor = color3;
                    textPaint2.setColor(color3);
                } else if (this.encryptedChat != null || ((customDialog = this.customDialog) != null && customDialog.type == i6)) {
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
                StaticLayout staticLayout4 = this.nameLayout;
                i8 = i7;
                i9 = -1;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout4, this.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i5, staticLayout4.getPaint().getColor()));
                canvas.restore();
                if (!this.nameLayoutEllipsizeByGradient || this.nameLayoutFits) {
                    f11 = 0.0f;
                    i6 = 2;
                } else {
                    canvas.save();
                    if (this.nameLayoutEllipsizeLeft) {
                        canvas.translate(this.nameLeft, 0.0f);
                        i6 = 2;
                        f11 = 0.0f;
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaint);
                    } else {
                        f11 = 0.0f;
                        i6 = 2;
                        canvas.translate((this.nameLeft + this.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                        canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(24.0f), getMeasuredHeight(), this.fadePaintBack);
                    }
                    canvas.restore();
                    canvas.restore();
                }
            } else {
                i8 = i7;
                f11 = 0.0f;
                i9 = -1;
            }
            if (this.timeLayout == null || this.currentDialogFolderId != 0) {
                canvas3 = canvas;
            } else {
                canvas.save();
                canvas.translate(this.timeLeft, this.timeTop);
                if (getIsPinned()) {
                    canvas.translate(AndroidUtilities.dp(20.0f), f11);
                    float height = (this.timeLayout.getHeight() / 2.0f) - AndroidUtilities.dp(8.5f);
                    float f27 = -AndroidUtilities.dp(20.0f);
                    float width = this.timeLayout.getWidth() + AndroidUtilities.dp(6.0f);
                    int dp4 = (int) (((AndroidUtilities.dp(17.0f) - Theme.dialogs_pinnedDrawable2.getIntrinsicHeight()) / 2.0f) + height);
                    int dp5 = ((int) f27) + AndroidUtilities.dp(4.0f);
                    Drawable drawable = Theme.dialogs_pinnedDrawable2;
                    drawable.setBounds(dp5, dp4, drawable.getIntrinsicWidth() + dp5, Theme.dialogs_pinnedDrawable2.getIntrinsicHeight() + dp4);
                    int alpha = Theme.dialogs_timePaint.getAlpha();
                    Theme.dialogs_timePaint.setAlpha(30);
                    canvas3 = canvas;
                    canvas.drawRoundRect(f27, height, width, height + AndroidUtilities.dp(17.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), Theme.dialogs_timePaint);
                    Theme.dialogs_timePaint.setAlpha(alpha);
                    Theme.dialogs_pinnedDrawable2.draw(canvas3);
                } else {
                    canvas3 = canvas;
                }
                SpoilerEffect.layoutDrawMaybe(this.timeLayout, canvas3);
                canvas.restore();
            }
            if (drawLock2()) {
                Theme.dialogs_lock2Drawable.setBounds(this.lock2Left, this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i6), this.lock2Left + Theme.dialogs_lock2Drawable.getIntrinsicWidth(), this.timeTop + ((this.timeLayout.getHeight() - Theme.dialogs_lock2Drawable.getIntrinsicHeight()) / i6) + Theme.dialogs_lock2Drawable.getIntrinsicHeight());
                Theme.dialogs_lock2Drawable.draw(canvas3);
            }
            if (this.messageNameLayout == null || isForumCell()) {
                canvas4 = canvas3;
                i10 = 0;
                i11 = 2;
                f12 = 0.0f;
                i12 = 1;
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
                canvas3.translate(this.messageNameLeft, this.messageNameTop);
                try {
                    SpoilerEffect.layoutDrawMaybe(this.messageNameLayout, canvas3);
                    StaticLayout staticLayout5 = this.messageNameLayout;
                    i12 = 1;
                    try {
                        canvas4 = canvas3;
                        f12 = 0.0f;
                        i11 = 2;
                        i10 = 0;
                    } catch (Exception e) {
                        e = e;
                        canvas4 = canvas3;
                        i10 = 0;
                        i11 = 2;
                        f12 = 0.0f;
                    }
                    try {
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout5, this.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(1, staticLayout5.getPaint().getColor()));
                    } catch (Exception e2) {
                        e = e2;
                        FileLog.e(e);
                        canvas.restore();
                        if (this.messageLayout == null) {
                        }
                        if (this.buttonLayout == null) {
                        }
                        if (this.currentDialogFolderId != 0) {
                        }
                        if (this.drawBotVerified) {
                        }
                        if (this.drawUnmute) {
                        }
                        if (this.dialogsType == i14) {
                        }
                        if (!this.drawVerified) {
                        }
                        z2 = false;
                        if (!this.drawReorder) {
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas2);
                        if (this.drawError) {
                        }
                        i4 = 1;
                        if (this.thumbsCount > 0) {
                        }
                        i15 = -1;
                        dialogCellTags = this.tags;
                        if (dialogCellTags != null) {
                        }
                        i16 = i8;
                        if (i16 != i15) {
                        }
                        z3 = z8;
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
                        if (this.rightFragmentOpenedProgress > f8) {
                            if (!this.isTopic) {
                            }
                            z7 = z6;
                            RectF rectF = this.storyParams.originalAvatarRect;
                            int width2 = (int) (((rectF.left + rectF.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
                            RectF rectF2 = this.storyParams.originalAvatarRect;
                            drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width2, (int) (((rectF2.left + rectF2.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
                        }
                        if (this.collapseOffset != f8) {
                        }
                        if (this.translationX != f8) {
                        }
                        if (this.drawArchive) {
                            canvas.save();
                            canvas2.translate(f8, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
                            canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            this.archivedChatsDrawable.draw(canvas2);
                            canvas.restore();
                        }
                        if (this.useSeparator) {
                        }
                        if (this.clipProgress != f8) {
                        }
                        z4 = this.drawReorder;
                        if (!z4) {
                        }
                        if (!z4) {
                        }
                        if (this.archiveHidden) {
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    canvas4 = canvas3;
                    i10 = 0;
                    i11 = 2;
                    f12 = 0.0f;
                    i12 = 1;
                }
                canvas.restore();
            }
            if (this.messageLayout == null) {
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
                float dp6 = AndroidUtilities.dp(14.0f);
                DialogUpdateHelper dialogUpdateHelper2 = this.updateHelper;
                if (dialogUpdateHelper2.typingOutToTop) {
                    f15 = this.messageTop - (dialogUpdateHelper2.typingProgres * dp6);
                } else {
                    f15 = this.messageTop + (dialogUpdateHelper2.typingProgres * dp6);
                }
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    f15 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                }
                if (this.updateHelper.typingProgres != 1.0f) {
                    canvas.save();
                    canvas4.translate(this.messageLeft, f15);
                    int alpha2 = this.messageLayout.getPaint().getAlpha();
                    this.messageLayout.getPaint().setAlpha((int) (alpha2 * (1.0f - this.updateHelper.typingProgres)));
                    if (!this.spoilers.isEmpty()) {
                        try {
                            canvas.save();
                            SpoilerEffect.clipOutCanvas(canvas4, this.spoilers);
                            SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                            staticLayout2 = this.messageLayout;
                            f16 = 1.0f;
                        } catch (Exception e4) {
                            e = e4;
                            f16 = 1.0f;
                        }
                        try {
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout2, this.animatedEmojiStack, -0.075f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i11, staticLayout2.getPaint().getColor()));
                            canvas.restore();
                            for (int i26 = 0; i26 < this.spoilers.size(); i26 += i12) {
                                SpoilerEffect spoilerEffect = (SpoilerEffect) this.spoilers.get(i26);
                                spoilerEffect.setColor(this.messageLayout.getPaint().getColor());
                                spoilerEffect.draw(canvas4);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            FileLog.e(e);
                            this.messageLayout.getPaint().setAlpha(alpha2);
                            canvas.restore();
                            canvas.save();
                            dialogUpdateHelper = this.updateHelper;
                            if (!dialogUpdateHelper.typingOutToTop) {
                            }
                            if (!this.useForceThreeLines) {
                                f17 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                canvas4.translate(this.typingLeft, f17);
                                staticLayout = this.typingLayout;
                                if (staticLayout != null) {
                                    int alpha3 = staticLayout.getPaint().getAlpha();
                                    this.typingLayout.getPaint().setAlpha((int) (alpha3 * this.updateHelper.typingProgres));
                                    this.typingLayout.draw(canvas4);
                                    this.typingLayout.getPaint().setAlpha(alpha3);
                                }
                                canvas.restore();
                                if (this.typingLayout != null) {
                                }
                                i13 = 4;
                                if (this.buttonLayout == null) {
                                }
                                if (this.currentDialogFolderId != 0) {
                                }
                                if (this.drawBotVerified) {
                                }
                                if (this.drawUnmute) {
                                }
                                if (this.dialogsType == i14) {
                                }
                                if (!this.drawVerified) {
                                }
                                z2 = false;
                                if (!this.drawReorder) {
                                }
                                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                Theme.dialogs_reorderDrawable.draw(canvas2);
                                if (this.drawError) {
                                }
                                i4 = 1;
                                if (this.thumbsCount > 0) {
                                }
                                i15 = -1;
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null) {
                                }
                                i16 = i8;
                                if (i16 != i15) {
                                }
                                z3 = z8;
                                if (this.animatingArchiveAvatar) {
                                }
                                if (this.drawAvatar) {
                                }
                                if (this.animatingArchiveAvatar) {
                                }
                                if (this.avatarImage.getVisible()) {
                                }
                                if (this.rightFragmentOpenedProgress > f8) {
                                }
                                if (this.collapseOffset != f8) {
                                }
                                if (this.translationX != f8) {
                                }
                                if (this.drawArchive) {
                                }
                                if (this.useSeparator) {
                                }
                                if (this.clipProgress != f8) {
                                }
                                z4 = this.drawReorder;
                                if (!z4) {
                                }
                                if (!z4) {
                                }
                                if (this.archiveHidden) {
                                }
                            }
                            f17 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            canvas4.translate(this.typingLeft, f17);
                            staticLayout = this.typingLayout;
                            if (staticLayout != null) {
                            }
                            canvas.restore();
                            if (this.typingLayout != null) {
                            }
                            i13 = 4;
                            if (this.buttonLayout == null) {
                            }
                            if (this.currentDialogFolderId != 0) {
                            }
                            if (this.drawBotVerified) {
                            }
                            if (this.drawUnmute) {
                            }
                            if (this.dialogsType == i14) {
                            }
                            if (!this.drawVerified) {
                            }
                            z2 = false;
                            if (!this.drawReorder) {
                            }
                            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                            Theme.dialogs_reorderDrawable.draw(canvas2);
                            if (this.drawError) {
                            }
                            i4 = 1;
                            if (this.thumbsCount > 0) {
                            }
                            i15 = -1;
                            dialogCellTags = this.tags;
                            if (dialogCellTags != null) {
                            }
                            i16 = i8;
                            if (i16 != i15) {
                            }
                            z3 = z8;
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.drawAvatar) {
                            }
                            if (this.animatingArchiveAvatar) {
                            }
                            if (this.avatarImage.getVisible()) {
                            }
                            if (this.rightFragmentOpenedProgress > f8) {
                            }
                            if (this.collapseOffset != f8) {
                            }
                            if (this.translationX != f8) {
                            }
                            if (this.drawArchive) {
                            }
                            if (this.useSeparator) {
                            }
                            if (this.clipProgress != f8) {
                            }
                            z4 = this.drawReorder;
                            if (!z4) {
                            }
                            if (!z4) {
                            }
                            if (this.archiveHidden) {
                            }
                        }
                    } else {
                        f16 = 1.0f;
                        SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas4);
                        StaticLayout staticLayout6 = this.messageLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, this.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i11, staticLayout6.getPaint().getColor()));
                    }
                    this.messageLayout.getPaint().setAlpha(alpha2);
                    canvas.restore();
                } else {
                    f16 = 1.0f;
                }
                canvas.save();
                dialogUpdateHelper = this.updateHelper;
                if (!dialogUpdateHelper.typingOutToTop) {
                    f17 = this.messageTop + ((f16 - dialogUpdateHelper.typingProgres) * dp6);
                } else {
                    f17 = this.messageTop - ((f16 - dialogUpdateHelper.typingProgres) * dp6);
                }
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    f17 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                }
                canvas4.translate(this.typingLeft, f17);
                staticLayout = this.typingLayout;
                if (staticLayout != null && this.updateHelper.typingProgres > f12) {
                    int alpha32 = staticLayout.getPaint().getAlpha();
                    this.typingLayout.getPaint().setAlpha((int) (alpha32 * this.updateHelper.typingProgres));
                    this.typingLayout.draw(canvas4);
                    this.typingLayout.getPaint().setAlpha(alpha32);
                }
                canvas.restore();
                if (this.typingLayout != null) {
                    int i27 = this.printingStringType;
                    if (i27 < 0) {
                        DialogUpdateHelper dialogUpdateHelper3 = this.updateHelper;
                        if (dialogUpdateHelper3.typingProgres > f12) {
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
                            f18 = this.messageTop + (dp6 * (f16 - dialogUpdateHelper4.typingProgres));
                        } else {
                            f18 = this.messageTop - (dp6 * (f16 - dialogUpdateHelper4.typingProgres));
                        }
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            f18 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                        }
                        i13 = 4;
                        if (i27 == i12 || i27 == 4) {
                            canvas4.translate(this.statusDrawableLeft, f18 + (i27 == i12 ? AndroidUtilities.dp(f16) : 0));
                        } else {
                            canvas4.translate(this.statusDrawableLeft, f18 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
                        }
                        chatStatusDrawable.draw(canvas4);
                        invalidate();
                        canvas.restore();
                    }
                }
                i13 = 4;
            } else {
                i13 = 4;
            }
            if (this.buttonLayout == null) {
                canvas.save();
                if (this.buttonBackgroundPaint == null) {
                    this.buttonBackgroundPaint = new Paint(i12);
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
                if (this.lastTopicMessageUnread && this.topMessageTopicEndIndex != this.topMessageTopicStartIndex) {
                    int i28 = this.dialogsType;
                    if (i28 == 0 || i28 == 7) {
                    }
                    this.canvasButton.setColor(ColorUtils.setAlphaComponent(this.currentMessagePaint.getColor(), Theme.isCurrentThemeDark() ? 36 : 26));
                    if (!this.buttonCreated) {
                        this.canvasButton.rewind();
                        int i29 = this.topMessageTopicEndIndex;
                        if (i29 != this.topMessageTopicStartIndex && i29 > 0) {
                            float f28 = this.messageTop;
                            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                f28 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            }
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            float dp7 = this.messageLeft + AndroidUtilities.dp(2.0f) + this.messageLayout.getPrimaryHorizontal(i10);
                            float f29 = this.messageLeft;
                            StaticLayout staticLayout7 = this.messageLayout;
                            rectF3.set(dp7, f28, (f29 + staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), this.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), this.buttonTop - AndroidUtilities.dp(4.0f));
                            rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(4.0f));
                            if (rectF3.right > rectF3.left) {
                                this.canvasButton.addRect(rectF3);
                            }
                        }
                        float lineLeft = this.buttonLayout.getLineLeft(i10);
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(this.buttonLeft + lineLeft + AndroidUtilities.dp(2.0f), this.buttonTop + AndroidUtilities.dp(2.0f), this.buttonLeft + lineLeft + this.buttonLayout.getLineWidth(i10) + AndroidUtilities.dp(12.0f), this.buttonTop + this.buttonLayout.getHeight());
                        rectF4.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(3.0f));
                        this.canvasButton.addRect(rectF4);
                    }
                    this.canvasButton.draw(canvas4);
                    Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                    Drawable drawable2 = Theme.dialogs_forum_arrowDrawable;
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    BaseCell.setDrawableBounds(drawable2, rectF5.right - AndroidUtilities.dp(18.0f), rectF5.top + ((rectF5.height() - Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight()) / 2.0f));
                    Theme.dialogs_forum_arrowDrawable.draw(canvas4);
                }
                canvas4.translate(this.buttonLeft, this.buttonTop);
                if (!this.spoilers2.isEmpty()) {
                    try {
                        canvas.save();
                        SpoilerEffect.clipOutCanvas(canvas4, this.spoilers2);
                        SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas4);
                        StaticLayout staticLayout8 = this.buttonLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout8, this.animatedEmojiStack3, -0.075f, this.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout8.getPaint().getColor()));
                        canvas.restore();
                        for (int i30 = 0; i30 < this.spoilers2.size(); i30 += i12) {
                            SpoilerEffect spoilerEffect2 = (SpoilerEffect) this.spoilers2.get(i30);
                            spoilerEffect2.setColor(this.buttonLayout.getPaint().getColor());
                            spoilerEffect2.draw(canvas4);
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                } else {
                    SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas4);
                    StaticLayout staticLayout9 = this.buttonLayout;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout9, this.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout9.getPaint().getColor()));
                }
                canvas.restore();
            }
            if (this.currentDialogFolderId != 0) {
                int i31 = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                int i32 = this.lastStatusDrawableParams;
                if (i32 >= 0 && i32 != i31 && !this.statusDrawableAnimationInProgress) {
                    createStatusDrawableAnimator(i32, i31);
                }
                boolean z12 = this.statusDrawableAnimationInProgress;
                if (z12) {
                    i31 = this.animateToStatusDrawableParams;
                }
                boolean z13 = (i31 & 1) != 0;
                boolean z14 = (i31 & 2) != 0;
                boolean z15 = (i31 & i13) != 0;
                if (z12) {
                    int i33 = this.animateFromStatusDrawableParams;
                    boolean z16 = (i33 & 1) != 0;
                    boolean z17 = (i33 & 2) != 0;
                    boolean z18 = (i33 & i13) != 0;
                    if (!z13 && !z16 && z18 && !z17 && z14 && z15) {
                        f8 = 0.0f;
                        drawCheckStatus(canvas, z13, z14, z15, true, this.statusDrawableProgress);
                        canvas2 = canvas4;
                        i14 = 2;
                        f7 = 1.0f;
                    } else {
                        f8 = 0.0f;
                        boolean z19 = z16;
                        i14 = 2;
                        boolean z20 = z17;
                        f7 = 1.0f;
                        boolean z21 = z18;
                        canvas2 = canvas4;
                        drawCheckStatus(canvas, z19, z20, z21, false, 1.0f - this.statusDrawableProgress);
                        drawCheckStatus(canvas, z13, z14, z15, false, this.statusDrawableProgress);
                    }
                } else {
                    canvas2 = canvas4;
                    i14 = 2;
                    f7 = 1.0f;
                    f8 = 0.0f;
                    drawCheckStatus(canvas, z13, z14, z15, false, 1.0f);
                }
                this.lastStatusDrawableParams = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
            } else {
                canvas2 = canvas4;
                i14 = 2;
                f7 = 1.0f;
                f8 = 0.0f;
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
            if (this.dialogsType == i14 && ((z22 || this.dialogMutedProgress > f8) && !this.drawVerified && this.drawScam == 0 && !this.drawPremium)) {
                if (z22) {
                    float f30 = this.dialogMutedProgress;
                    if (f30 != f7) {
                        float f31 = f30 + 0.10666667f;
                        this.dialogMutedProgress = f31;
                        if (f31 > f7) {
                            this.dialogMutedProgress = f7;
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
                        if (this.dialogMutedProgress != f7) {
                            canvas.save();
                            float f32 = this.dialogMutedProgress;
                            canvas2.scale(f32, f32, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
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
                    float f33 = this.dialogMutedProgress;
                    if (f33 != f8) {
                        float f34 = f33 - 0.10666667f;
                        this.dialogMutedProgress = f34;
                        if (f34 < f8) {
                            this.dialogMutedProgress = f8;
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
                    if (this.dialogMutedProgress != f7) {
                    }
                }
                dp102 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp92, dp102);
                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp92, dp102);
                if (this.dialogMutedProgress != f7) {
                }
            } else if (!this.drawVerified) {
                float dp11 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 13.5f : 16.5f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp11 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft - AndroidUtilities.dp(f7), dp11);
                BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft - AndroidUtilities.dp(f7), dp11);
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
                    if (this.rightFragmentOpenedProgress > f8) {
                        this.emojiStatus.setBounds(this.nameMuteLeft - AndroidUtilities.dp(2.0f), dp12 - AndroidUtilities.dp(4.0f), this.nameMuteLeft + AndroidUtilities.dp(20.0f), (dp12 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(22.0f));
                        this.emojiStatus.draw(canvas2);
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    this.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                    z2 = z9;
                    if (!this.drawReorder || this.reorderIconProgress != f8) {
                        Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas2);
                    }
                    if (this.drawError) {
                        Theme.dialogs_errorDrawable.setAlpha((int) ((f7 - this.reorderIconProgress) * 255.0f));
                        this.rect.set(this.errorLeft, this.errorTop, r2 + AndroidUtilities.dp(23.0f), this.errorTop + AndroidUtilities.dp(23.0f));
                        RectF rectF6 = this.rect;
                        float f35 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF6, f35, f35, Theme.dialogs_errorPaint);
                        BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, this.errorLeft + AndroidUtilities.dp(5.5f), this.errorTop + AndroidUtilities.dp(5.0f));
                        Theme.dialogs_errorDrawable.draw(canvas2);
                    } else if (((this.drawCount || this.drawMention) && this.drawCount2) || this.countChangeProgress != f7 || this.drawReactionMention || this.reactionsMentionsChangeProgress != f7) {
                        if (this.isTopic) {
                            z10 = this.topicMuted;
                        } else {
                            TLRPC.Chat chat = this.chat;
                            if (chat != null && chat.forum && this.forumTopic == null) {
                                z11 = !this.hasUnmutedTopics;
                                i4 = 1;
                                drawCounter(canvas, z11, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                                if (this.drawMention) {
                                    Theme.dialogs_countPaint.setAlpha((int) ((f7 - this.reorderIconProgress) * 255.0f));
                                    this.rect.set(this.mentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r1 + this.mentionWidth + AndroidUtilities.dp(11.0f), this.countTop + AndroidUtilities.dp(23.0f));
                                    Paint paint3 = (!z11 || this.folderId == 0) ? Theme.dialogs_countPaint : Theme.dialogs_countGrayPaint;
                                    RectF rectF7 = this.rect;
                                    float f36 = AndroidUtilities.density * 11.5f;
                                    canvas2.drawRoundRect(rectF7, f36, f36, paint3);
                                    if (this.mentionLayout != null) {
                                        Theme.dialogs_countTextPaint.setAlpha((int) ((f7 - this.reorderIconProgress) * 255.0f));
                                        canvas.save();
                                        canvas2.translate(this.mentionLeft, this.countTop + AndroidUtilities.dp(4.0f));
                                        this.mentionLayout.draw(canvas2);
                                        canvas.restore();
                                    } else {
                                        Theme.dialogs_mentionDrawable.setAlpha((int) ((f7 - this.reorderIconProgress) * 255.0f));
                                        BaseCell.setDrawableBounds(Theme.dialogs_mentionDrawable, this.mentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.2f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                                        Theme.dialogs_mentionDrawable.draw(canvas2);
                                    }
                                }
                                if (!this.drawReactionMention || this.reactionsMentionsChangeProgress != f7) {
                                    Theme.dialogs_reactionsCountPaint.setAlpha((int) ((f7 - this.reorderIconProgress) * 255.0f));
                                    this.rect.set(this.reactionMentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r1 + AndroidUtilities.dp(23.0f), this.countTop + AndroidUtilities.dp(23.0f));
                                    Paint paint4 = Theme.dialogs_reactionsCountPaint;
                                    canvas.save();
                                    f13 = this.reactionsMentionsChangeProgress;
                                    if (f13 != f7) {
                                        if (!this.drawReactionMention) {
                                            f13 = f7 - f13;
                                        }
                                        canvas2.scale(f13, f13, this.rect.centerX(), this.rect.centerY());
                                    }
                                    RectF rectF8 = this.rect;
                                    float f37 = AndroidUtilities.density * 11.5f;
                                    canvas2.drawRoundRect(rectF8, f37, f37, paint4);
                                    Theme.dialogs_reactionsMentionDrawable.setAlpha((int) ((f7 - this.reorderIconProgress) * 255.0f));
                                    BaseCell.setDrawableBounds(Theme.dialogs_reactionsMentionDrawable, this.reactionMentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.8f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                                    Theme.dialogs_reactionsMentionDrawable.draw(canvas2);
                                    canvas.restore();
                                }
                                if (this.thumbsCount > 0) {
                                    float f38 = this.updateHelper.typingProgres;
                                    if (f38 != f7) {
                                        if (f38 > f8) {
                                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((f7 - f38) * 255.0f), 31);
                                            if (this.updateHelper.typingOutToTop) {
                                                dp = -AndroidUtilities.dp(14.0f);
                                                f14 = this.updateHelper.typingProgres;
                                            } else {
                                                dp = AndroidUtilities.dp(14.0f);
                                                f14 = this.updateHelper.typingProgres;
                                            }
                                            canvas2.translate(f8, dp * f14);
                                        }
                                        int i34 = 0;
                                        while (i34 < this.thumbsCount) {
                                            if (this.thumbImageSeen[i34]) {
                                                if (this.thumbBackgroundPaint == null) {
                                                    Paint paint5 = new Paint(i4);
                                                    this.thumbBackgroundPaint = paint5;
                                                    paint5.setShadowLayer(AndroidUtilities.dp(1.34f), f8, AndroidUtilities.dp(0.34f), 402653184);
                                                    this.thumbBackgroundPaint.setColor(0);
                                                }
                                                RectF rectF9 = AndroidUtilities.rectTmp;
                                                rectF9.set(this.thumbImage[i34].getImageX(), this.thumbImage[i34].getImageY(), this.thumbImage[i34].getImageX2(), this.thumbImage[i34].getImageY2());
                                                canvas2.drawRoundRect(rectF9, this.thumbImage[i34].getRoundRadius()[0], this.thumbImage[i34].getRoundRadius()[i4], this.thumbBackgroundPaint);
                                                this.thumbImage[i34].draw(canvas2);
                                                if (this.drawSpoiler[i34]) {
                                                    Path path = this.thumbPath;
                                                    if (path == null) {
                                                        this.thumbPath = new Path();
                                                    } else {
                                                        path.rewind();
                                                    }
                                                    this.thumbPath.addRoundRect(rectF9, this.thumbImage[i34].getRoundRadius()[0], this.thumbImage[i34].getRoundRadius()[i4], Path.Direction.CW);
                                                    canvas.save();
                                                    canvas2.clipPath(this.thumbPath);
                                                    if (this.thumbSpoiler == null) {
                                                        this.thumbSpoiler = new SpoilerEffect();
                                                    }
                                                    this.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i9) * 0.325f)));
                                                    this.thumbSpoiler.setBounds((int) this.thumbImage[i34].getImageX(), (int) this.thumbImage[i34].getImageY(), (int) this.thumbImage[i34].getImageX2(), (int) this.thumbImage[i34].getImageY2());
                                                    this.thumbSpoiler.draw(canvas2);
                                                    invalidate();
                                                    canvas.restore();
                                                }
                                                if (this.drawPlay[i34]) {
                                                    BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (this.thumbImage[i34].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (this.thumbImage[i34].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)));
                                                    Theme.dialogs_playDrawable.draw(canvas2);
                                                }
                                            }
                                            i34 += i4;
                                            i9 = -1;
                                        }
                                        i15 = -1;
                                        if (this.updateHelper.typingProgres > f8) {
                                            canvas.restore();
                                        }
                                        dialogCellTags = this.tags;
                                        if (dialogCellTags != null && !dialogCellTags.isEmpty()) {
                                            canvas.save();
                                            canvas2.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                                            this.tags.draw(canvas2, this.tagsRight - this.tagsLeft);
                                            canvas.restore();
                                        }
                                        i16 = i8;
                                        if (i16 != i15) {
                                            canvas2.restoreToCount(i16);
                                        }
                                        z3 = z8;
                                    }
                                }
                                i15 = -1;
                                dialogCellTags = this.tags;
                                if (dialogCellTags != null) {
                                    canvas.save();
                                    canvas2.translate(this.tagsLeft, (getMeasuredHeight() - AndroidUtilities.dp(21.66f)) - (this.useSeparator ? 1 : 0));
                                    this.tags.draw(canvas2, this.tagsRight - this.tagsLeft);
                                    canvas.restore();
                                }
                                i16 = i8;
                                if (i16 != i15) {
                                }
                                z3 = z8;
                            } else {
                                z10 = this.dialogMuted;
                            }
                        }
                        z11 = z10;
                        i4 = 1;
                        drawCounter(canvas, z11, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                        if (this.drawMention) {
                        }
                        if (!this.drawReactionMention) {
                        }
                        Theme.dialogs_reactionsCountPaint.setAlpha((int) ((f7 - this.reorderIconProgress) * 255.0f));
                        this.rect.set(this.reactionMentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r1 + AndroidUtilities.dp(23.0f), this.countTop + AndroidUtilities.dp(23.0f));
                        Paint paint42 = Theme.dialogs_reactionsCountPaint;
                        canvas.save();
                        f13 = this.reactionsMentionsChangeProgress;
                        if (f13 != f7) {
                        }
                        RectF rectF82 = this.rect;
                        float f372 = AndroidUtilities.density * 11.5f;
                        canvas2.drawRoundRect(rectF82, f372, f372, paint42);
                        Theme.dialogs_reactionsMentionDrawable.setAlpha((int) ((f7 - this.reorderIconProgress) * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reactionsMentionDrawable, this.reactionMentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.8f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                        Theme.dialogs_reactionsMentionDrawable.draw(canvas2);
                        canvas.restore();
                        if (this.thumbsCount > 0) {
                        }
                        i15 = -1;
                        dialogCellTags = this.tags;
                        if (dialogCellTags != null) {
                        }
                        i16 = i8;
                        if (i16 != i15) {
                        }
                        z3 = z8;
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
                    i4 = 1;
                    if (this.thumbsCount > 0) {
                    }
                    i15 = -1;
                    dialogCellTags = this.tags;
                    if (dialogCellTags != null) {
                    }
                    i16 = i8;
                    if (i16 != i15) {
                    }
                    z3 = z8;
                } else {
                    Drawable drawable3 = PremiumGradient.getInstance().premiumStarDrawableMini;
                    int dp13 = this.nameMuteLeft - AndroidUtilities.dp(f7);
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f20 = 15.5f;
                    }
                    BaseCell.setDrawableBounds(drawable3, dp13, AndroidUtilities.dp(f20));
                    drawable3.draw(canvas2);
                }
            } else if (this.drawScam != 0) {
                int dp14 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.0f : 15.0f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp14 -= AndroidUtilities.dp(9.0f);
                }
                BaseCell.setDrawableBounds((Drawable) (this.drawScam == i12 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable), this.nameMuteLeft, dp14);
                (this.drawScam == i12 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).draw(canvas2);
            }
            z2 = false;
            if (!this.drawReorder) {
            }
            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
            Theme.dialogs_reorderDrawable.draw(canvas2);
            if (this.drawError) {
            }
            i4 = 1;
            if (this.thumbsCount > 0) {
            }
            i15 = -1;
            dialogCellTags = this.tags;
            if (dialogCellTags != null) {
            }
            i16 = i8;
            if (i16 != i15) {
            }
            z3 = z8;
        } else {
            canvas2 = canvas;
            i4 = 1;
            f7 = 1.0f;
            f8 = 0.0f;
            z2 = false;
            z3 = false;
        }
        if (this.animatingArchiveAvatar) {
            f9 = 170.0f;
        } else {
            canvas.save();
            f9 = 170.0f;
            float interpolation2 = this.interpolator.getInterpolation(this.animatingArchiveAvatarProgress / 170.0f) + f7;
            canvas2.scale(interpolation2, interpolation2, this.avatarImage.getCenterX(), this.avatarImage.getCenterY());
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
                boolean z23 = this.isShareToStoryCell;
                avatarStoryParams.drawHiddenStoriesAsSegments = z23 || this.currentDialogFolderId != 0;
                int i35 = avatarStoryParams.forceState;
                if (z23) {
                    avatarStoryParams.forceState = i4;
                }
                StoriesUtilities.drawAvatarWithStory(this.currentDialogId, canvas2, this.avatarImage, avatarStoryParams);
                if (this.storyParams.drawnLive) {
                    checkTtl();
                }
                this.storyParams.forceState = i35;
            }
        }
        if (this.animatingArchiveAvatar) {
            canvas.restore();
        }
        boolean z24 = (this.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) ? z3 : true;
        if (this.rightFragmentOpenedProgress > f8 && this.currentDialogFolderId == 0) {
            if (!this.isTopic) {
                z6 = this.topicMuted;
            } else {
                TLRPC.Chat chat2 = this.chat;
                if (chat2 != null && chat2.forum && this.forumTopic == null) {
                    z7 = !this.hasUnmutedTopics;
                    RectF rectF11 = this.storyParams.originalAvatarRect;
                    int width22 = (int) (((rectF11.left + rectF11.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
                    RectF rectF22 = this.storyParams.originalAvatarRect;
                    drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width22, (int) (((rectF22.left + rectF22.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
                } else {
                    z6 = this.dialogMuted;
                }
            }
            z7 = z6;
            RectF rectF112 = this.storyParams.originalAvatarRect;
            int width222 = (int) (((rectF112.left + rectF112.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
            RectF rectF222 = this.storyParams.originalAvatarRect;
            drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width222, (int) (((rectF222.left + rectF222.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
        }
        if (this.collapseOffset != f8) {
            canvas.restore();
        }
        if (this.translationX != f8) {
            canvas.restore();
        }
        if (this.drawArchive && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == i4)) && this.translationX == f8 && this.archivedChatsDrawable != null)) {
            canvas.save();
            canvas2.translate(f8, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
            canvas2.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas2);
            canvas.restore();
        }
        if (this.useSeparator) {
            int dp15 = (this.fullSeparator || !(this.currentDialogFolderId == 0 || !this.archiveHidden || this.fullSeparator2) || (this.fullSeparator2 && !this.archiveHidden)) ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
            if (this.rightFragmentOpenedProgress != f7) {
                int alpha4 = Theme.dividerPaint.getAlpha();
                float f39 = this.rightFragmentOpenedProgress;
                if (f39 != f8) {
                    Theme.dividerPaint.setAlpha((int) (alpha4 * (f7 - f39)));
                }
                float measuredHeight2 = (getMeasuredHeight() - i4) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f, measuredHeight2, getMeasuredWidth() - dp15, measuredHeight2, Theme.dividerPaint);
                } else {
                    canvas.drawLine(dp15, measuredHeight2, getMeasuredWidth(), measuredHeight2, Theme.dividerPaint);
                }
                if (this.rightFragmentOpenedProgress != f8) {
                    Theme.dividerPaint.setAlpha(alpha4);
                }
            }
        }
        if (this.clipProgress != f8) {
            if (Build.VERSION.SDK_INT != 24) {
                canvas.restore();
            } else {
                Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.topClip * this.clipProgress, Theme.dialogs_pinnedPaint);
                canvas.drawRect(0.0f, getMeasuredHeight() - ((int) (this.bottomClip * this.clipProgress)), getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
            }
        }
        z4 = this.drawReorder;
        if (!z4 || this.reorderIconProgress != f8) {
            if (!z4) {
                float f40 = this.reorderIconProgress;
                if (f40 < f7) {
                    float f41 = f40 + 0.09411765f;
                    this.reorderIconProgress = f41;
                    if (f41 > f7) {
                        this.reorderIconProgress = f7;
                    }
                    z5 = true;
                }
            } else {
                float f42 = this.reorderIconProgress;
                if (f42 > f8) {
                    float f43 = f42 - 0.09411765f;
                    this.reorderIconProgress = f43;
                    if (f43 < f8) {
                        this.reorderIconProgress = f8;
                    }
                    z5 = true;
                }
            }
            if (this.archiveHidden) {
                float f44 = this.archiveBackgroundProgress;
                if (f44 > f8) {
                    float f45 = f44 - 0.069565214f;
                    this.archiveBackgroundProgress = f45;
                    if (f45 < f8) {
                        this.archiveBackgroundProgress = f8;
                    }
                    if (this.avatarDrawable.getAvatarType() == 2) {
                        this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                    }
                    z5 = true;
                }
                if (!this.animatingArchiveAvatar) {
                    float f46 = this.animatingArchiveAvatarProgress + 16.0f;
                    this.animatingArchiveAvatarProgress = f46;
                    if (f46 >= f9) {
                        this.animatingArchiveAvatarProgress = f9;
                        this.animatingArchiveAvatar = false;
                    }
                    z5 = true;
                }
                if (!this.drawRevealBackground) {
                    float f47 = this.currentRevealBounceProgress;
                    if (f47 < f7) {
                        float f48 = f47 + 0.09411765f;
                        this.currentRevealBounceProgress = f48;
                        if (f48 > f7) {
                            this.currentRevealBounceProgress = f7;
                            z5 = true;
                        }
                    }
                    float f49 = this.currentRevealProgress;
                    if (f49 < f7) {
                        float f50 = f49 + 0.053333335f;
                        this.currentRevealProgress = f50;
                        if (f50 > f7) {
                            this.currentRevealProgress = f7;
                        }
                        z5 = true;
                    }
                    this.emojiStatusView.setVisibility(!z2 ? 0 : 8);
                    if (z5) {
                        return;
                    }
                    invalidate();
                    return;
                }
                if (this.currentRevealBounceProgress == f7) {
                    this.currentRevealBounceProgress = f8;
                    z5 = true;
                }
                float f51 = this.currentRevealProgress;
                if (f51 > f8) {
                    float f52 = f51 - 0.053333335f;
                    this.currentRevealProgress = f52;
                    if (f52 < f8) {
                        this.currentRevealProgress = f8;
                    }
                    z5 = true;
                }
                this.emojiStatusView.setVisibility(!z2 ? 0 : 8);
                if (z5) {
                }
            } else {
                float f53 = this.archiveBackgroundProgress;
                if (f53 < f7) {
                    float f54 = f53 + 0.069565214f;
                    this.archiveBackgroundProgress = f54;
                    if (f54 > f7) {
                        this.archiveBackgroundProgress = f7;
                    }
                    if (this.avatarDrawable.getAvatarType() == 2) {
                        this.avatarDrawable.setArchivedAvatarHiddenProgress(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.archiveBackgroundProgress));
                    }
                    z5 = true;
                }
                if (!this.animatingArchiveAvatar) {
                }
                if (!this.drawRevealBackground) {
                }
            }
        }
        z5 = z24;
        if (this.archiveHidden) {
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
            this.rect.set(i2 - AndroidUtilities.dp(7.0f), i, r9 + this.countWidth + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(20.66f) + i);
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
                canvas.translate(i2, i + AndroidUtilities.dp(4.0f));
                staticLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restoreToCount(save);
        } else {
            paint.setAlpha((int) ((1.0f - this.reorderIconProgress) * i4));
            Theme.dialogs_countTextPaint.setAlpha((int) ((1.0f - this.reorderIconProgress) * 255.0f));
            float f4 = f3 * 2.0f;
            float f5 = f4 > 1.0f ? 1.0f : f4;
            float f6 = 1.0f - f5;
            float f7 = (i2 * f5) + (i3 * f6);
            float dp = f7 - AndroidUtilities.dp(7.0f);
            float f8 = i;
            this.rect.set(dp, f8, (this.countWidth * f5) + dp + (this.countWidthOld * f6) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(20.66f) + i);
            if (f3 <= 0.5f) {
                interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f4) * 0.1f;
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
                interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(1.0f - ((f3 - 0.5f) * 2.0f)) * 0.1f;
            }
            float f9 = interpolation + f2;
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
                canvas.translate(f7, i + AndroidUtilities.dp(4.0f));
                this.countAnimationStableLayout.draw(canvas);
                canvas.restore();
            }
            int alpha = Theme.dialogs_countTextPaint.getAlpha();
            float f11 = alpha;
            Theme.dialogs_countTextPaint.setAlpha((int) (f11 * f5));
            if (this.countAnimationInLayout != null) {
                canvas.save();
                canvas.translate(f7, ((this.countAnimationIncrement ? AndroidUtilities.dp(13.0f) : -AndroidUtilities.dp(13.0f)) * f6) + f8 + AndroidUtilities.dp(4.0f));
                this.countAnimationInLayout.draw(canvas);
                canvas.restore();
            } else if (this.countLayout != null) {
                canvas.save();
                canvas.translate(f7, ((this.countAnimationIncrement ? AndroidUtilities.dp(13.0f) : -AndroidUtilities.dp(13.0f)) * f6) + f8 + AndroidUtilities.dp(4.0f));
                this.countLayout.draw(canvas);
                canvas.restore();
            }
            if (this.countOldLayout != null) {
                Theme.dialogs_countTextPaint.setAlpha((int) (f11 * f6));
                canvas.save();
                canvas.translate(f7, ((this.countAnimationIncrement ? -AndroidUtilities.dp(13.0f) : AndroidUtilities.dp(13.0f)) * f5) + f8 + AndroidUtilities.dp(4.0f));
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
