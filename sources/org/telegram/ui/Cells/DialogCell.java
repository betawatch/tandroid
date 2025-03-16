package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
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
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import j$.util.Comparator$-CC;
import j$.util.function.ToIntFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
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
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BubbleCounterPath;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogCellTags;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TimerDrawable;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.VectorAvatarThumbDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.DialogsActivity;
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
    private Paint buttonBackgroundPaint;
    private boolean buttonCreated;
    private StaticLayout buttonLayout;
    private int buttonLeft;
    private int buttonTop;
    CanvasButton canvasButton;
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
    private boolean isForum;
    public boolean isSavedDialog;
    public boolean isSavedDialogCell;
    private boolean isSelected;
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
    private boolean nameIsEllipsized;
    private StaticLayout nameLayout;
    private boolean nameLayoutEllipsizeByGradient;
    private boolean nameLayoutEllipsizeLeft;
    private boolean nameLayoutFits;
    private float nameLayoutTranslateX;
    private int nameLeft;
    private int nameLockLeft;
    private int nameLockTop;
    private int nameMuteLeft;
    private int nameWidth;
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

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0130, code lost:
        
            if (org.telegram.messenger.MessagesController.getInstance(r19.this$0.currentAccount).getTopicsController().endIsReached(-r19.this$0.currentDialogId) != false) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:107:0x02a8  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0269  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02ac  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0275  */
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
            long j = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? 524288 : 0);
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
                        if (!DialogCell.this.isTopic) {
                            DialogCell dialogCell2 = DialogCell.this;
                            if (dialogCell2.isDialogCell) {
                                z = MediaDataController.getInstance(dialogCell2.currentAccount).getDraftVoice(DialogCell.this.currentDialogId, 0L) != null;
                                if (!z) {
                                    draft = MediaDataController.getInstance(DialogCell.this.currentAccount).getDraft(DialogCell.this.currentDialogId, 0L);
                                    if (draft != null) {
                                    }
                                    if (DialogCell.this.chat == null) {
                                    }
                                    boolean isTranslatingDialog = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
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
                                    this.lastDrawnHasCall = r8;
                                    this.lastDrawnTranslated = isTranslatingDialog;
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
                            this.lastDrawnHasCall = r8;
                            this.lastDrawnTranslated = isTranslatingDialog2;
                            return true;
                        }
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
                            boolean isTranslatingDialog22 = MessagesController.getInstance(DialogCell.this.currentAccount).getTranslateController().isTranslatingDialog(DialogCell.this.currentDialogId);
                            if (this.lastDrawnSizeHash != measuredWidth) {
                                i3 = measuredWidth;
                                if (this.lastDrawnMessageId == id && this.lastDrawnTranslated == isTranslatingDialog22 && this.lastDrawnDialogId == DialogCell.this.currentDialogId && this.lastDrawnDialogIsFolder == dialog.isFolder && this.lastDrawnReadState == j && Objects.equals(this.lastDrawnPrintingType, num) && this.lastTopicsCount == i && i2 == this.lastDrawnDraftHash && this.lastDrawnPinned == DialogCell.this.drawPin && this.lastDrawnHasCall == z3 && DialogCell.this.draftVoice == z) {
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
                                        z2 = true;
                                    }
                                    this.typingOutToTop = z2;
                                }
                                z2 = false;
                                if (this.lastDrawnMessageId == id) {
                                }
                                this.typingOutToTop = z2;
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
                            this.lastDrawnTranslated = isTranslatingDialog22;
                            return true;
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
                    if (!DialogCell.this.isTopic) {
                    }
                }
            }
            num = null;
            int measuredWidth2 = DialogCell.this.getMeasuredWidth() + (DialogCell.this.getMeasuredHeight() << 16);
            if (DialogCell.this.isForumCell()) {
            }
            i = 0;
            if (!DialogCell.this.isTopic) {
            }
        }

        public void updateAnimationValues() {
            float f;
            if (this.waitngNewMessageFroTypingAnimation) {
                if (System.currentTimeMillis() - this.startWaitingTime > 100) {
                    this.waitngNewMessageFroTypingAnimation = false;
                }
                DialogCell.this.invalidate();
                return;
            }
            if (this.lastDrawnPrintingType != null && DialogCell.this.typingLayout != null) {
                float f2 = this.typingProgres;
                if (f2 != 1.0f) {
                    f = f2 + 0.08f;
                    this.typingProgres = f;
                    DialogCell.this.invalidate();
                    this.typingProgres = Utilities.clamp(this.typingProgres, 1.0f, 0.0f);
                }
            }
            if (this.lastDrawnPrintingType == null) {
                float f3 = this.typingProgres;
                if (f3 != 0.0f) {
                    f = f3 - 0.08f;
                    this.typingProgres = f;
                    DialogCell.this.invalidate();
                }
            }
            this.typingProgres = Utilities.clamp(this.typingProgres, 1.0f, 0.0f);
        }
    }

    public static class FixedWidthSpan extends ReplacementSpan {
        private int width;

        public FixedWidthSpan(int i) {
            this.width = i;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
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

    /* JADX INFO: Access modifiers changed from: private */
    static class ForumFormattedNames {
        CharSequence formattedNames;
        boolean isLoadingState;
        int lastMessageId;
        boolean lastTopicMessageUnread;
        int topMessageTopicEndIndex;
        int topMessageTopicStartIndex;

        private ForumFormattedNames() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void formatTopicsNames(int i, MessageObject messageObject, TLRPC.Chat chat) {
            long j;
            boolean z;
            int i2;
            int id = (messageObject == null || chat == null) ? 0 : messageObject.getId();
            if (this.lastMessageId != id || this.isLoadingState) {
                this.topMessageTopicStartIndex = 0;
                this.topMessageTopicEndIndex = 0;
                this.lastTopicMessageUnread = false;
                this.isLoadingState = false;
                this.lastMessageId = id;
                TextPaint textPaint = Theme.dialogs_messagePaint[0];
                if (chat != null) {
                    ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(i).getTopicsController().getTopics(chat.id);
                    boolean z2 = true;
                    if (topics == null || topics.isEmpty()) {
                        if (MessagesController.getInstance(i).getTopicsController().endIsReached(chat.id)) {
                            this.formattedNames = "no created topics";
                            return;
                        }
                        MessagesController.getInstance(i).getTopicsController().preloadTopics(chat.id);
                        this.formattedNames = LocaleController.getString(R.string.Loading);
                        this.isLoadingState = true;
                        return;
                    }
                    ArrayList arrayList = new ArrayList(topics);
                    Collections.sort(arrayList, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.ui.Cells.DialogCell$ForumFormattedNames$$ExternalSyntheticLambda0
                        @Override // j$.util.function.ToIntFunction
                        public final int applyAsInt(Object obj) {
                            int lambda$formatTopicsNames$0;
                            lambda$formatTopicsNames$0 = DialogCell.ForumFormattedNames.lambda$formatTopicsNames$0((TLRPC.TL_forumTopic) obj);
                            return lambda$formatTopicsNames$0;
                        }
                    }));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (messageObject != null) {
                        j = MessageObject.getTopicId(i, messageObject.messageOwner, true);
                        TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i).getTopicsController().findTopic(chat.id, j);
                        if (findTopic != null) {
                            CharSequence topicSpannedName = ForumUtilities.getTopicSpannedName(findTopic, textPaint, false);
                            spannableStringBuilder.append(topicSpannedName);
                            i2 = findTopic.unread_count > 0 ? topicSpannedName.length() : 0;
                            this.topMessageTopicStartIndex = 0;
                            this.topMessageTopicEndIndex = topicSpannedName.length();
                            if (!messageObject.isOutOwner()) {
                                this.lastTopicMessageUnread = findTopic.unread_count > 0;
                                if (this.lastTopicMessageUnread) {
                                    z = false;
                                } else {
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.setSpan(new FixedWidthSpan(AndroidUtilities.dp(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                                    z = true;
                                }
                            }
                        } else {
                            i2 = 0;
                        }
                        this.lastTopicMessageUnread = false;
                        if (this.lastTopicMessageUnread) {
                        }
                    } else {
                        j = 0;
                        z = false;
                        i2 = 0;
                    }
                    for (int i3 = 0; i3 < Math.min(4, arrayList.size()); i3++) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i3)).id != j) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z2 && z) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(ForumUtilities.getTopicSpannedName((TLRPC.ForumTopic) arrayList.get(i3), textPaint, false));
                            z2 = false;
                        }
                    }
                    if (i2 > 0) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.key_chats_name, null), 0, Math.min(spannableStringBuilder.length(), i2 + 2), 0);
                    }
                    this.formattedNames = spannableStringBuilder;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$formatTopicsNames$0(TLRPC.TL_forumTopic tL_forumTopic) {
            return -tL_forumTopic.top_message;
        }
    }

    public static class SharedResources {
    }

    public DialogCell(DialogsActivity dialogsActivity, Context context, boolean z, boolean z2) {
        this(dialogsActivity, context, z, z2, UserConfig.selectedAccount, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogCell(DialogsActivity dialogsActivity, Context context, boolean z, boolean z2, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.drawArchive = true;
        this.drawAvatar = true;
        this.avatarStart = 10;
        this.messagePaddingStart = 72;
        this.heightDefault = 72;
        this.heightThreeLines = 78;
        this.addHeightForTags = 3;
        this.addForumHeightForTags = 11;
        this.chekBoxPaddingTop = 42.0f;
        int i2 = 0;
        StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams(0 == true ? 1 : 0) { // from class: org.telegram.ui.Cells.DialogCell.1
            @Override // org.telegram.ui.Stories.StoriesUtilities.AvatarStoryParams
            public void onLongPress() {
                DialogCell dialogCell = DialogCell.this;
                DialogCellDelegate dialogCellDelegate = dialogCell.delegate;
                if (dialogCellDelegate == null) {
                    return;
                }
                dialogCellDelegate.showChatPreview(dialogCell);
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
        this.avatarImage.setRoundRadius(AndroidUtilities.dp(28.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.thumbImage;
            if (i2 >= imageReceiverArr.length) {
                this.useForceThreeLines = z2;
                this.currentAccount = i;
                this.emojiStatus = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(22.0f));
                this.botVerification = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, AndroidUtilities.dp(17.0f));
                this.avatarImage.setAllowLoadingOnAttachedOnly(true);
                return;
            }
            imageReceiverArr[i2] = new ImageReceiver(this);
            ImageReceiver imageReceiver = this.thumbImage[i2];
            imageReceiver.ignoreNotifications = true;
            imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
            this.thumbImage[i2].setAllowLoadingOnAttachedOnly(true);
            i2++;
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

    private void checkChatTheme() {
        TLRPC.Message message;
        MessageObject messageObject = this.message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.lastUnreadState) {
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(this.currentDialogId, ((TLRPC.TL_messageActionSetChatTheme) messageAction).emoticon, false);
        }
    }

    private void checkGroupCall() {
        TLRPC.Chat chat = this.chat;
        boolean z = chat != null && chat.call_active && chat.call_not_empty;
        this.hasCall = z;
        this.chatCallProgress = z ? 1.0f : 0.0f;
    }

    private void checkOnline() {
        TLRPC.User user;
        if (this.user != null && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.user.id))) != null) {
            this.user = user;
        }
        this.onlineProgress = isOnline() ? 1.0f : 0.0f;
    }

    private void checkTtl() {
        CheckBox2 checkBox2;
        boolean z = this.ttlPeriod > 0 && !this.hasCall && !isOnline() && ((checkBox2 = this.checkBox) == null || !checkBox2.isChecked());
        this.showTtl = z;
        this.ttlProgress = z ? 1.0f : 0.0f;
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

    private int computeHeight() {
        if (!isForumCell() || this.isTransitionSupport || this.collapsed) {
            return getCollapsedHeight();
        }
        int dp = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 86.0f : 91.0f);
        if (this.useSeparator) {
            dp++;
        }
        return hasTags() ? dp + AndroidUtilities.dp(this.addForumHeightForTags) : dp;
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
                if (DialogCell.this.animateToStatusDrawableParams != i3) {
                    DialogCell dialogCell = DialogCell.this;
                    dialogCell.createStatusDrawableAnimator(dialogCell.animateToStatusDrawableParams, i3);
                } else {
                    DialogCell.this.statusDrawableAnimationInProgress = false;
                    DialogCell dialogCell2 = DialogCell.this;
                    dialogCell2.lastStatusDrawableParams = dialogCell2.animateToStatusDrawableParams;
                }
                DialogCell.this.invalidate();
            }
        });
        this.statusDrawableAnimationInProgress = true;
        this.statusDrawableAnimator.start();
    }

    private void drawCheckStatus(Canvas canvas, boolean z, boolean z2, boolean z3, boolean z4, float f) {
        Drawable drawable;
        if (f != 0.0f || z4) {
            float f2 = (f * 0.5f) + 0.5f;
            if (z) {
                BaseCell.setDrawableBounds(Theme.dialogs_clockDrawable, this.clockDrawLeft, this.checkDrawTop);
                if (f != 1.0f) {
                    canvas.save();
                    canvas.scale(f2, f2, Theme.dialogs_clockDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                    Theme.dialogs_clockDrawable.setAlpha((int) (255.0f * f));
                }
                Theme.dialogs_clockDrawable.draw(canvas);
                if (f != 1.0f) {
                    canvas.restore();
                    Theme.dialogs_clockDrawable.setAlpha(NotificationCenter.proxyCheckDone);
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
                        Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.proxyCheckDone);
                    }
                    if (z4 || f == 0.0f) {
                        return;
                    }
                    canvas.restore();
                    Theme.dialogs_halfCheckDrawable.setAlpha(NotificationCenter.proxyCheckDone);
                    drawable = Theme.dialogs_checkReadDrawable;
                } else {
                    BaseCell.setDrawableBounds(Theme.dialogs_checkDrawable, this.checkDrawLeft1, this.checkDrawTop);
                    if (f != 1.0f) {
                        canvas.save();
                        canvas.scale(f2, f2, Theme.dialogs_checkDrawable.getBounds().centerX(), Theme.dialogs_halfCheckDrawable.getBounds().centerY());
                        Theme.dialogs_checkDrawable.setAlpha((int) (255.0f * f));
                    }
                    Theme.dialogs_checkDrawable.draw(canvas);
                    if (f == 1.0f) {
                        return;
                    }
                    canvas.restore();
                    drawable = Theme.dialogs_checkDrawable;
                }
                drawable.setAlpha(NotificationCenter.proxyCheckDone);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawCounter(Canvas canvas, boolean z, int i, int i2, int i3, float f, boolean z2) {
        Paint paint;
        boolean z3;
        RectF rectF;
        float f2;
        float interpolation;
        StaticLayout staticLayout;
        RectF rectF2;
        boolean z4 = isForumCell() || isFolderCell();
        if (!(this.drawCount && this.drawCount2) && this.countChangeProgress == 1.0f) {
            return;
        }
        float f3 = (this.unreadCount != 0 || this.markUnread) ? this.countChangeProgress : 1.0f - this.countChangeProgress;
        int i4 = NotificationCenter.proxyCheckDone;
        if (z2) {
            if (this.counterPaintOutline == null) {
                Paint paint2 = new Paint();
                this.counterPaintOutline = paint2;
                paint2.setStyle(Paint.Style.STROKE);
                this.counterPaintOutline.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.counterPaintOutline.setStrokeJoin(Paint.Join.ROUND);
                this.counterPaintOutline.setStrokeCap(Paint.Cap.ROUND);
            }
            this.counterPaintOutline.setColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhite), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_pinnedOverlay), NotificationCenter.proxyCheckDone), Color.alpha(r13) / 255.0f));
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
        StaticLayout staticLayout2 = this.countOldLayout;
        if (staticLayout2 == null || this.unreadCount == 0) {
            if (this.unreadCount != 0) {
                staticLayout2 = this.countLayout;
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
            if (staticLayout2 != null) {
                canvas.save();
                canvas.translate(i2, i + AndroidUtilities.dp(4.0f));
                staticLayout2.draw(canvas);
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
                staticLayout = this.countAnimationInLayout;
            } else {
                if (this.countLayout != null) {
                    canvas.save();
                    canvas.translate(f8, ((this.countAnimationIncrement ? AndroidUtilities.dp(13.0f) : -AndroidUtilities.dp(13.0f)) * f7) + f9 + AndroidUtilities.dp(4.0f));
                    staticLayout = this.countLayout;
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
            staticLayout.draw(canvas);
            canvas.restore();
            if (this.countOldLayout != null) {
            }
            Theme.dialogs_countTextPaint.setAlpha(alpha);
            canvas.restore();
        }
        if (z3) {
            Theme.dialogs_countTextPaint.setColor(Theme.getColor(Theme.key_chats_unreadCounterText));
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4 A[EDGE_INSN: B:23:0x00d4->B:24:0x00d4 BREAK  A[LOOP:0: B:2:0x001d->B:34:0x00d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CharSequence formatArchivedDialogNames() {
        long j;
        TLRPC.User user;
        String string;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.currentDialogFolderId);
        this.currentDialogFolderDialogsCount = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Dialog dialog = dialogs.get(i);
            if (!messagesController.isHiddenByUndo(dialog.id)) {
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialog.id);
                TLRPC.Chat chat = null;
                long j2 = dialog.id;
                if (isEncryptedDialog) {
                    TLRPC.EncryptedChat encryptedChat = messagesController.getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j2)));
                    if (encryptedChat != null) {
                        j = encryptedChat.user_id;
                        user = messagesController.getUser(Long.valueOf(j));
                        if (chat == null) {
                            string = chat.title.replace('\n', ' ');
                        } else if (user == null) {
                            continue;
                        } else {
                            string = UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                        }
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        int length = spannableStringBuilder.length();
                        int length2 = string.length() + length;
                        spannableStringBuilder.append((CharSequence) string);
                        if (dialog.unread_count > 0) {
                            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold(), 0, Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider)), length, length2, 33);
                        }
                        if (spannableStringBuilder.length() <= 150) {
                            break;
                        }
                    } else {
                        user = null;
                        if (chat == null) {
                        }
                        if (spannableStringBuilder.length() > 0) {
                        }
                        int length3 = spannableStringBuilder.length();
                        int length22 = string.length() + length3;
                        spannableStringBuilder.append((CharSequence) string);
                        if (dialog.unread_count > 0) {
                        }
                        if (spannableStringBuilder.length() <= 150) {
                        }
                    }
                } else {
                    boolean isUserDialog = DialogObject.isUserDialog(j2);
                    j = dialog.id;
                    if (!isUserDialog) {
                        chat = messagesController.getChat(Long.valueOf(-j));
                        user = null;
                        if (chat == null) {
                        }
                        if (spannableStringBuilder.length() > 0) {
                        }
                        int length32 = spannableStringBuilder.length();
                        int length222 = string.length() + length32;
                        spannableStringBuilder.append((CharSequence) string);
                        if (dialog.unread_count > 0) {
                        }
                        if (spannableStringBuilder.length() <= 150) {
                        }
                    }
                    user = messagesController.getUser(Long.valueOf(j));
                    if (chat == null) {
                    }
                    if (spannableStringBuilder.length() > 0) {
                    }
                    int length322 = spannableStringBuilder.length();
                    int length2222 = string.length() + length322;
                    spannableStringBuilder.append((CharSequence) string);
                    if (dialog.unread_count > 0) {
                    }
                    if (spannableStringBuilder.length() <= 150) {
                    }
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

    private SpannableStringBuilder formatInternal(int i, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 1) {
            append = spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068");
        } else {
            if (i != 2) {
                if (i == 3) {
                    spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
                } else if (i == 4) {
                    spannableStringBuilder.append(charSequence);
                }
                return spannableStringBuilder;
            }
            append = spannableStringBuilder.append((CharSequence) "\u2068");
        }
        append.append(charSequence).append((CharSequence) "\u2069");
        return spannableStringBuilder;
    }

    private CharSequence formatTopicsNames() {
        ForumFormattedNames forumFormattedNames = new ForumFormattedNames();
        forumFormattedNames.formatTopicsNames(this.currentAccount, this.message, this.chat);
        this.topMessageTopicStartIndex = forumFormattedNames.topMessageTopicStartIndex;
        this.topMessageTopicEndIndex = forumFormattedNames.topMessageTopicEndIndex;
        this.lastTopicMessageUnread = forumFormattedNames.lastTopicMessageUnread;
        return forumFormattedNames.formattedNames;
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

    /* JADX INFO: Access modifiers changed from: private */
    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.forumTopic;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.id;
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createStatusDrawableAnimator$4(ValueAnimator valueAnimator) {
        this.statusDrawableProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPremiumBlocked$5(Object[] objArr) {
        updatePremiumBlocked(true);
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
        if (photoSize != null) {
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

    public DialogCell allowBotOpenButton(boolean z, Utilities.Callback callback) {
        this.allowBotOpenButton = z;
        this.onOpenButtonClick = callback;
        return this;
    }

    @Override // org.telegram.ui.Cells.BaseCell
    protected boolean allowCaching() {
        return this.rightFragmentOpenedProgress <= 0.0f;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public void buildLayout() {
        /*
            Method dump skipped, instructions count: 9356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.DialogCell.buildLayout():void");
    }

    public boolean checkCurrentDialogIndex(boolean z) {
        return false;
    }

    public void checkHeight() {
        if (getMeasuredHeight() <= 0 || getMeasuredHeight() == computeHeight()) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.isTopic && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.storyParams.checkOnTouchEvent(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0234, code lost:
    
        if (r3 > 0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0274  */
    @Override // org.telegram.ui.Stories.StoriesListPlaceProvider.AvatarOverlaysView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean drawAvatarOverlays(Canvas canvas) {
        boolean z;
        int dp;
        float dp2;
        float dp3;
        boolean z2;
        float dp4;
        int dp5;
        float dp6;
        int dp7;
        float f;
        boolean z3;
        float dp8;
        Paint paint;
        int color2;
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
            int dp9 = AndroidUtilities.dp(19.33f);
            Rect rect = AndroidUtilities.rectTmp2;
            int i = (int) imageX2;
            int i2 = (int) imageY2;
            int i3 = i2 - dp9;
            rect.set((AndroidUtilities.dp(1.66f) + i) - dp9, i3, AndroidUtilities.dp(1.66f) + i, i2);
            rect.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
            this.starBg.setBounds(rect);
            int i4 = (int) (progress * 255.0f);
            this.starBg.setAlpha(i4);
            this.starBg.draw(canvas);
            rect.set((AndroidUtilities.dp(1.66f) + i) - dp9, i3, i + AndroidUtilities.dp(1.66f), i2);
            this.starFg.setBounds(rect);
            this.starFg.setAlpha(i4);
            this.starFg.draw(canvas);
            z = true;
        }
        float f2 = this.premiumBlockedT.set(this.premiumBlocked && !z);
        float f3 = 10.0f;
        if (f2 > 0.0f) {
            float centerY = this.avatarImage.getCenterY() + AndroidUtilities.dp(18.0f);
            float centerX = this.avatarImage.getCenterX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * f2, Theme.dialogs_onlineCirclePaint);
            if (this.premiumGradient == null) {
                this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, this.resourcesProvider);
            }
            this.premiumGradient.gradientMatrix((int) (centerX - AndroidUtilities.dp(10.0f)), (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), (int) (AndroidUtilities.dp(10.0f) + centerY), 0.0f, 0.0f);
            canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * f2, this.premiumGradient.paint);
            if (this.lockDrawable == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.lockDrawable.setBounds((int) (centerX - (((r4.getIntrinsicWidth() / 2.0f) * 0.875f) * f2)), (int) (centerY - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f2)), (int) (centerX + ((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f2)), (int) (centerY + ((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f2)));
            this.lockDrawable.setAlpha((int) (f2 * 255.0f));
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
                    Paint paint2 = new Paint(1);
                    this.timerPaint2 = paint2;
                    paint2.setColor(838860800);
                }
                int imageY22 = (int) (this.avatarImage.getImageY2() - AndroidUtilities.dp(9.0f));
                int dp10 = (int) (!LocaleController.isRTL ? this.storyParams.originalAvatarRect.left + AndroidUtilities.dp(9.0f) : this.storyParams.originalAvatarRect.right - AndroidUtilities.dp(9.0f));
                this.timerDrawable.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
                this.timerDrawable.setTime(this.ttlPeriod);
                if (this.avatarImage.updateThumbShaderMatrix()) {
                    this.timerPaint.setShader(null);
                    if (this.avatarImage.getBitmap() != null && !this.avatarImage.getBitmap().isRecycled()) {
                        paint = this.timerPaint;
                        color2 = AndroidUtilities.getDominantColor(this.avatarImage.getBitmap());
                    } else if (this.avatarImage.getDrawable() instanceof VectorAvatarThumbDrawable) {
                        this.timerPaint.setColor(((VectorAvatarThumbDrawable) this.avatarImage.getDrawable()).gradientTools.getAverageColor());
                    } else {
                        paint = this.timerPaint;
                        color2 = this.avatarDrawable.getColor2();
                    }
                    paint.setColor(color2);
                } else {
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
                }
                canvas.save();
                float f4 = this.ttlProgress * (1.0f - this.rightFragmentOpenedProgress);
                checkBox2 = this.checkBox;
                if (checkBox2 != null) {
                    f4 *= 1.0f - checkBox2.getProgress();
                }
                float f5 = dp10;
                float f6 = imageY22;
                canvas.scale(f4, f4, f5, f6);
                canvas.drawCircle(f5, f6, AndroidUtilities.dpf2(11.0f), this.timerPaint);
                canvas.drawCircle(f5, f6, AndroidUtilities.dpf2(11.0f), this.timerPaint2);
                canvas.save();
                canvas.translate(f5 - AndroidUtilities.dpf2(11.0f), f6 - AndroidUtilities.dpf2(11.0f));
                this.timerDrawable.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            this.timerDrawable = TimerDrawable.getTtlIconForDialogs(this.ttlPeriod);
            if (this.timerPaint == null) {
            }
            int imageY222 = (int) (this.avatarImage.getImageY2() - AndroidUtilities.dp(9.0f));
            int dp102 = (int) (!LocaleController.isRTL ? this.storyParams.originalAvatarRect.left + AndroidUtilities.dp(9.0f) : this.storyParams.originalAvatarRect.right - AndroidUtilities.dp(9.0f));
            this.timerDrawable.setBounds(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            this.timerDrawable.setTime(this.ttlPeriod);
            if (this.avatarImage.updateThumbShaderMatrix()) {
            }
            canvas.save();
            float f42 = this.ttlProgress * (1.0f - this.rightFragmentOpenedProgress);
            checkBox2 = this.checkBox;
            if (checkBox2 != null) {
            }
            float f52 = dp102;
            float f62 = imageY222;
            canvas.scale(f42, f42, f52, f62);
            canvas.drawCircle(f52, f62, AndroidUtilities.dpf2(11.0f), this.timerPaint);
            canvas.drawCircle(f52, f62, AndroidUtilities.dpf2(11.0f), this.timerPaint2);
            canvas.save();
            canvas.translate(f52 - AndroidUtilities.dpf2(11.0f), f62 - AndroidUtilities.dpf2(11.0f));
            this.timerDrawable.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        TLRPC.User user = this.user;
        if (user != null && !MessagesController.isSupportUser(user) && !this.user.bot) {
            boolean isOnline = isOnline();
            this.wasDrawnOnline = isOnline;
            if (isOnline || this.onlineProgress != 0.0f) {
                int dp11 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    float f7 = this.storyParams.originalAvatarRect.left;
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f3 = 6.0f;
                    }
                    dp8 = f7 + AndroidUtilities.dp(f3);
                } else {
                    float f8 = this.storyParams.originalAvatarRect.right;
                    if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                        f3 = 6.0f;
                    }
                    dp8 = f8 - AndroidUtilities.dp(f3);
                }
                int i6 = (int) dp8;
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                float f9 = i6;
                float f10 = dp11;
                canvas.drawCircle(f9, f10, AndroidUtilities.dp(7.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                canvas.drawCircle(f9, f10, AndroidUtilities.dp(5.0f) * this.onlineProgress, Theme.dialogs_onlineCirclePaint);
                float f11 = this.onlineProgress;
                if (isOnline) {
                    if (f11 < 1.0f) {
                        float f12 = f11 + 0.10666667f;
                        this.onlineProgress = f12;
                        if (f12 > 1.0f) {
                            this.onlineProgress = 1.0f;
                        }
                        z2 = true;
                    }
                } else if (f11 > 0.0f) {
                    float f13 = f11 - 0.10666667f;
                    this.onlineProgress = f13;
                    if (f13 < 0.0f) {
                        this.onlineProgress = 0.0f;
                    }
                    z2 = true;
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
                int dp12 = (int) (this.storyParams.originalAvatarRect.bottom - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 6.0f : 8.0f));
                if (LocaleController.isRTL) {
                    dp = (int) (this.storyParams.originalAvatarRect.left + AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 6.0f));
                } else {
                    dp = (int) (this.storyParams.originalAvatarRect.right - AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 6.0f));
                }
                if (this.rightFragmentOpenedProgress != 0.0f) {
                    canvas.save();
                    float f14 = 1.0f - this.rightFragmentOpenedProgress;
                    canvas.scale(f14, f14, dp, dp12);
                }
                Paint paint3 = Theme.dialogs_onlineCirclePaint;
                int i7 = Theme.key_windowBackgroundWhite;
                paint3.setColor(Theme.getColor(i7, this.resourcesProvider));
                float f15 = dp;
                float f16 = dp12;
                canvas.drawCircle(f15, f16, AndroidUtilities.dp(11.0f) * this.chatCallProgress * progress2, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_chats_onlineCircle, this.resourcesProvider));
                canvas.drawCircle(f15, f16, AndroidUtilities.dp(9.0f) * this.chatCallProgress * progress2, Theme.dialogs_onlineCirclePaint);
                Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(i7, this.resourcesProvider));
                if (!LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                    this.innerProgress = 0.65f;
                }
                int i8 = this.progressStage;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                dp4 = AndroidUtilities.dp(3.0f);
                                dp5 = AndroidUtilities.dp(2.0f);
                            } else if (i8 != 4) {
                                if (i8 != 5) {
                                    if (i8 == 6) {
                                        dp6 = AndroidUtilities.dp(1.0f);
                                        dp7 = AndroidUtilities.dp(4.0f);
                                    } else {
                                        dp4 = AndroidUtilities.dp(5.0f);
                                        dp5 = AndroidUtilities.dp(4.0f);
                                    }
                                }
                            }
                            dp2 = dp4 - (dp5 * this.innerProgress);
                            dp3 = (AndroidUtilities.dp(2.0f) * this.innerProgress) + AndroidUtilities.dp(1.0f);
                            if (this.chatCallProgress >= 1.0f || progress2 < 1.0f) {
                                canvas.save();
                                float f17 = this.chatCallProgress * progress2;
                                canvas.scale(f17, f17, f15, f16);
                            }
                            this.rect.set(dp - AndroidUtilities.dp(1.0f), f16 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f16);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            float f18 = f16 - dp3;
                            float f19 = f16 + dp3;
                            this.rect.set(dp - AndroidUtilities.dp(5.0f), f18, dp - AndroidUtilities.dp(3.0f), f19);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            this.rect.set(AndroidUtilities.dp(3.0f) + dp, f18, dp + AndroidUtilities.dp(5.0f), f19);
                            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                            if (this.chatCallProgress >= 1.0f || progress2 < 1.0f) {
                                canvas.restore();
                            }
                            if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                                z2 = false;
                            } else {
                                float f20 = this.innerProgress + 0.04f;
                                this.innerProgress = f20;
                                if (f20 >= 1.0f) {
                                    this.innerProgress = 0.0f;
                                    int i9 = this.progressStage + 1;
                                    this.progressStage = i9;
                                    if (i9 >= 8) {
                                        this.progressStage = 0;
                                    }
                                }
                                z2 = true;
                            }
                            if (this.hasCall) {
                                float f21 = this.chatCallProgress;
                                if (f21 > 0.0f) {
                                    float f22 = f21 - 0.10666667f;
                                    this.chatCallProgress = f22;
                                    if (f22 < 0.0f) {
                                        this.chatCallProgress = 0.0f;
                                    }
                                }
                            } else {
                                float f23 = this.chatCallProgress;
                                if (f23 < 1.0f) {
                                    float f24 = f23 + 0.10666667f;
                                    this.chatCallProgress = f24;
                                    if (f24 > 1.0f) {
                                        this.chatCallProgress = 1.0f;
                                    }
                                }
                            }
                            if (this.rightFragmentOpenedProgress != 0.0f) {
                                canvas.restore();
                            }
                            if (this.showTtl) {
                                float f25 = this.ttlProgress;
                                if (f25 < 1.0f) {
                                    f = f25 + 0.10666667f;
                                    this.ttlProgress = f;
                                    z3 = true;
                                }
                                z3 = z2;
                            } else {
                                float f26 = this.ttlProgress;
                                if (f26 > 0.0f) {
                                    f = f26 - 0.10666667f;
                                    this.ttlProgress = f;
                                    z3 = true;
                                }
                                z3 = z2;
                            }
                            this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                            return z3;
                        }
                        dp6 = AndroidUtilities.dp(1.0f);
                        dp7 = AndroidUtilities.dp(2.0f);
                        dp2 = dp6 + (dp7 * this.innerProgress);
                        dp3 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                        if (this.chatCallProgress >= 1.0f) {
                        }
                        canvas.save();
                        float f172 = this.chatCallProgress * progress2;
                        canvas.scale(f172, f172, f15, f16);
                        this.rect.set(dp - AndroidUtilities.dp(1.0f), f16 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f16);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        float f182 = f16 - dp3;
                        float f192 = f16 + dp3;
                        this.rect.set(dp - AndroidUtilities.dp(5.0f), f182, dp - AndroidUtilities.dp(3.0f), f192);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        this.rect.set(AndroidUtilities.dp(3.0f) + dp, f182, dp + AndroidUtilities.dp(5.0f), f192);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                        if (this.chatCallProgress >= 1.0f) {
                        }
                        canvas.restore();
                        if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                        }
                        if (this.hasCall) {
                        }
                        if (this.rightFragmentOpenedProgress != 0.0f) {
                        }
                        if (this.showTtl) {
                        }
                        this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                        return z3;
                    }
                    dp2 = AndroidUtilities.dp(5.0f) - (AndroidUtilities.dp(4.0f) * this.innerProgress);
                    dp3 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.innerProgress);
                    if (this.chatCallProgress >= 1.0f) {
                    }
                    canvas.save();
                    float f1722 = this.chatCallProgress * progress2;
                    canvas.scale(f1722, f1722, f15, f16);
                    this.rect.set(dp - AndroidUtilities.dp(1.0f), f16 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f16);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    float f1822 = f16 - dp3;
                    float f1922 = f16 + dp3;
                    this.rect.set(dp - AndroidUtilities.dp(5.0f), f1822, dp - AndroidUtilities.dp(3.0f), f1922);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    this.rect.set(AndroidUtilities.dp(3.0f) + dp, f1822, dp + AndroidUtilities.dp(5.0f), f1922);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                    if (this.chatCallProgress >= 1.0f) {
                    }
                    canvas.restore();
                    if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                    }
                    if (this.hasCall) {
                    }
                    if (this.rightFragmentOpenedProgress != 0.0f) {
                    }
                    if (this.showTtl) {
                    }
                    this.ttlProgress = Utilities.clamp(this.ttlProgress, 1.0f, 0.0f);
                    return z3;
                }
                dp2 = AndroidUtilities.dp(1.0f) + (AndroidUtilities.dp(4.0f) * this.innerProgress);
                dp3 = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(2.0f) * this.innerProgress);
                if (this.chatCallProgress >= 1.0f) {
                }
                canvas.save();
                float f17222 = this.chatCallProgress * progress2;
                canvas.scale(f17222, f17222, f15, f16);
                this.rect.set(dp - AndroidUtilities.dp(1.0f), f16 - dp2, dp + AndroidUtilities.dp(1.0f), dp2 + f16);
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                float f18222 = f16 - dp3;
                float f19222 = f16 + dp3;
                this.rect.set(dp - AndroidUtilities.dp(5.0f), f18222, dp - AndroidUtilities.dp(3.0f), f19222);
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                this.rect.set(AndroidUtilities.dp(3.0f) + dp, f18222, dp + AndroidUtilities.dp(5.0f), f19222);
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Theme.dialogs_onlineCirclePaint);
                if (this.chatCallProgress >= 1.0f) {
                }
                canvas.restore();
                if (LiteMode.isEnabled(LiteMode.FLAGS_CHAT)) {
                }
                if (this.hasCall) {
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

    protected boolean drawLock2() {
        return false;
    }

    public float getClipProgress() {
        return this.clipProgress;
    }

    public int getCurrentDialogFolderId() {
        return this.currentDialogFolderId;
    }

    public long getDialogId() {
        return this.currentDialogId;
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

    public MessageObject getMessage() {
        return this.message;
    }

    public int getMessageId() {
        return this.messageId;
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
        return (messageObject4 == null || (message = messageObject4.messageOwner) == null || (messageFwdHeader = message.fwd_from) == null || (str2 = messageFwdHeader.from_name) == null) ? user != null ? (this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace("\n", "")) : AndroidUtilities.escape(UserObject.getFirstName(user).replace("\n", "")) : (chat == null || (str = chat.title) == null) ? "DELETED" : AndroidUtilities.escape(str.replace("\n", "")) : AndroidUtilities.escape(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x035b, code lost:
    
        if (r20 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0165, code lost:
    
        if (r20 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x035d, code lost:
    
        r3 = applyThumbs(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, org.telegram.ui.Cells.DialogCell] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v24, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpannableStringBuilder getMessageStringFormatted(int i, String str, CharSequence charSequence, boolean z) {
        ?? spannableString;
        TLRPC.Message message;
        CharSequence charSequence2;
        int i2;
        String formatPluralString;
        CharSequence charSequence3;
        SpannableStringBuilder valueOf;
        TLRPC.TL_forumTopic findTopic;
        MessageObject captionMessage = getCaptionMessage();
        MessageObject messageObject = this.message;
        CharSequence charSequence4 = messageObject != null ? messageObject.messageText : null;
        this.applyName = true;
        if (TextUtils.isEmpty(str)) {
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
                String str2 = !this.needEmoji ? "" : captionMessage.isVideo() ? "📹 " : captionMessage.isVoice() ? "🎤 " : captionMessage.isMusic() ? "🎧 " : captionMessage.isPhoto() ? "🖼 " : "📎 ";
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
                        charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.currentMessagePaint, NotificationCenter.walletSyncProgressChanged).toString();
                    }
                    return new SpannableStringBuilder(str2).append(charSequence7);
                }
                if (charSequence6.length() > 150) {
                    charSequence6 = charSequence6.subSequence(0, 150);
                }
                SpannableString spannableString2 = new SpannableString(charSequence6);
                captionMessage.spoilLoginCode();
                MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, charSequence6, spannableString2, NotificationCenter.screenStateChanged);
                TLRPC.Message message3 = captionMessage.messageOwner;
                if (message3 != null) {
                    ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                    TextPaint textPaint = this.currentMessagePaint;
                    MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString2, textPaint != null ? textPaint.getFontMetricsInt() : null);
                }
                spannableString = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString2));
            } else {
                if (message2.media != null && !messageObject2.isMediaEmpty()) {
                    this.currentMessagePaint = Theme.dialogs_messagePrintingPaint[this.paintIndex];
                    int i3 = Theme.key_chats_attachMessage;
                    MessageObject messageObject3 = this.message;
                    TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                        if (tL_textWithEntities == null || tL_textWithEntities.entities == null) {
                            charSequence2 = String.format("📊 \u2068%s\u2069", tL_textWithEntities.text);
                        } else {
                            SpannableString spannableString3 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString3);
                            MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString3, Theme.dialogs_messagePaint[this.paintIndex].getFontMetricsInt());
                            charSequence2 = new SpannableStringBuilder("📊 \u2068").append((CharSequence) spannableString3).append((CharSequence) "\u2069");
                        }
                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                        charSequence2 = String.format("🎮 \u2068%s\u2069", messageMedia.game.title);
                    } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                        charSequence2 = messageMedia.title;
                    } else if (messageObject3.type == 14) {
                        charSequence2 = String.format("🎧 \u2068%s - %s\u2069", messageObject3.getMusicAuthor(), this.message.getMusicTitle());
                    } else {
                        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                            int size = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                            if (this.hasVideoThumb) {
                                if (size > 1) {
                                    formatPluralString = LocaleController.formatPluralString("Media", size, new Object[0]);
                                    charSequence2 = StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, formatPluralString));
                                } else {
                                    i2 = R.string.AttachVideo;
                                    formatPluralString = LocaleController.getString(i2);
                                    charSequence2 = StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, formatPluralString));
                                }
                            } else if (size > 1) {
                                formatPluralString = LocaleController.formatPluralString("Photos", size, new Object[0]);
                                charSequence2 = StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, formatPluralString));
                            } else {
                                i2 = R.string.AttachPhoto;
                                formatPluralString = LocaleController.getString(i2);
                                charSequence2 = StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.AttachPaidMedia, formatPluralString));
                            }
                        } else if (this.thumbsCount <= 1) {
                            charSequence2 = charSequence4.toString();
                        } else if (this.hasVideoThumb) {
                            ArrayList arrayList2 = this.groupMessages;
                            charSequence2 = LocaleController.formatPluralString("Media", arrayList2 == null ? 0 : arrayList2.size(), new Object[0]);
                        } else {
                            ArrayList arrayList3 = this.groupMessages;
                            charSequence2 = LocaleController.formatPluralString("Photos", arrayList3 == null ? 0 : arrayList3.size(), new Object[0]);
                        }
                        i3 = Theme.key_chats_actionMessage;
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
                            formatInternal.setSpan(new ForegroundColorSpanThemable(i3, this.resourcesProvider), this.hasNameInMessage ? charSequence.length() + 2 : 0, formatInternal.length(), 33);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    return formatInternal;
                }
                MessageObject messageObject4 = this.message;
                CharSequence charSequence8 = messageObject4.messageOwner.message;
                if (charSequence8 == null) {
                    return new SpannableStringBuilder();
                }
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
                        charSequence8 = AndroidUtilities.ellipsizeCenterEnd(charSequence8, this.message.highlightedWords.get(0), measuredWidth2, this.currentMessagePaint, NotificationCenter.walletSyncProgressChanged).toString();
                    }
                } else {
                    if (charSequence8.length() > 150) {
                        charSequence8 = charSequence8.subSequence(0, 150);
                    }
                    charSequence8 = AndroidUtilities.replaceNewLines(charSequence8);
                }
                spannableString = new SpannableString(charSequence8);
                MessageObject messageObject5 = this.message;
                if (messageObject5 != null) {
                    messageObject5.spoilLoginCode();
                }
                MediaDataController.addTextStyleRuns(this.message, (Spannable) spannableString, NotificationCenter.screenStateChanged);
                MessageObject messageObject6 = this.message;
                if (messageObject6 != null && (message = messageObject6.messageOwner) != null) {
                    ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                    TextPaint textPaint2 = this.currentMessagePaint;
                    MediaDataController.addAnimatedEmojiSpans(arrayList4, spannableString, textPaint2 != null ? textPaint2.getFontMetricsInt() : null);
                }
            }
        } else {
            spannableString = str;
        }
        return formatInternal(i, spannableString, charSequence);
    }

    public long getStarsPrice() {
        return this.starsPriceBlocked;
    }

    @Override // android.view.View
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // org.telegram.ui.Cells.BaseCell, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean hasTags() {
        DialogCellTags dialogCellTags = this.tags;
        return (dialogCellTags == null || dialogCellTags.isEmpty()) ? false : true;
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

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.translationDrawable || drawable == Theme.dialogs_archiveAvatarDrawable) {
            invalidate(drawable.getBounds());
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    public boolean isDialogFolder() {
        return this.currentDialogFolderId > 0;
    }

    public boolean isFolderCell() {
        return this.currentDialogFolderId != 0;
    }

    public boolean isForumCell() {
        TLRPC.Chat chat;
        return (isDialogFolder() || (chat = this.chat) == null || !chat.forum || this.isTopic) ? false : true;
    }

    public boolean isMoving() {
        return this.moving;
    }

    public boolean isPointInsideAvatar(float f, float f2) {
        return !LocaleController.isRTL ? f >= 0.0f && f < ((float) AndroidUtilities.dp(60.0f)) : f >= ((float) (getMeasuredWidth() - AndroidUtilities.dp(60.0f))) && f < ((float) getMeasuredWidth());
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

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0bb5, code lost:
    
        if (r3.lastKnownTypingType >= 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x1859, code lost:
    
        if (r57.avatarDrawable.getAvatarType() == 2) goto L976;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x1875, code lost:
    
        r57.avatarDrawable.setArchivedAvatarHiddenProgress(org.telegram.ui.Components.CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(r57.archiveBackgroundProgress));
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x1873, code lost:
    
        if (r57.avatarDrawable.getAvatarType() == 2) goto L976;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x13ab, code lost:
    
        if (r57.reactionsMentionsChangeProgress != r14) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x082e, code lost:
    
        if (r1.type != 2) goto L266;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0e6a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0f16  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0f1e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0fa4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0ffb  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x1006  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x101d  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x1035  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x11e1  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x1437  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x15d2  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1602  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1613  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1638  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1654  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1656  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1664  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x166f  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x167e  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x1686  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x168a  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x16f3  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x16fc  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x1703  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x1745  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x17c2  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x1812  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x1842  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x1887  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x189a  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x18dc  */
    /* JADX WARN: Removed duplicated region for block: B:607:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:608:0x18be  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x185c  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x181a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x182b  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x1632  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x122c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x1309  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x13a7  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x13e2  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x1099  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x10e5  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0f20  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x0f18  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x0f25  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x0e64  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:897:0x1608  */
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
        RLottieDrawable rLottieDrawable;
        float f;
        float f2;
        int i2;
        float f3;
        String str;
        int i3;
        boolean z;
        boolean z2;
        RLottieDrawable rLottieDrawable2;
        int i4;
        float f4;
        Paint paint;
        int color3;
        int i5;
        float f5;
        Canvas canvas2;
        ?? r10;
        int i6;
        float f6;
        float f7;
        boolean z3;
        float f8;
        boolean z4;
        boolean z5;
        float f9;
        float measuredWidth;
        Paint paint2;
        TLRPC.TL_forumTopic tL_forumTopic;
        boolean z6;
        boolean z7;
        TLRPC.TL_forumTopic tL_forumTopic2;
        PullForegroundDrawable pullForegroundDrawable;
        float f10;
        int i7;
        Paint paint3;
        float alpha;
        float f11;
        float f12;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f13;
        int i13;
        int i14;
        Drawable drawable;
        boolean z9;
        boolean z10;
        float f14;
        Drawable drawable2;
        Canvas canvas3;
        int i15;
        boolean z11;
        DialogCellTags dialogCellTags;
        int i16;
        char c;
        int i17;
        Drawable drawable3;
        boolean z12;
        float f15;
        DialogCell dialogCell;
        Canvas canvas4;
        int i18;
        TextPaint textPaint;
        int i19;
        float f16;
        float f17;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        TextPaint textPaint2;
        int i20;
        StaticLayout staticLayout3;
        TextPaint textPaint3;
        int i21;
        float dp;
        float measuredHeight;
        Paint paint4;
        float f18;
        float f19;
        Canvas canvas5;
        Paint paint5;
        PorterDuffXfermode porterDuffXfermode;
        int i22;
        PullForegroundDrawable pullForegroundDrawable2;
        TLRPC.TL_forumTopic tL_forumTopic3;
        float f20 = 12.0f;
        float f21 = 12.5f;
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
        if (this.translationX == 0.0f && this.cornerProgress == 0.0f) {
            RLottieDrawable rLottieDrawable3 = this.translationDrawable;
            if (rLottieDrawable3 != null) {
                rLottieDrawable3.stop();
                this.translationDrawable.setProgress(0.0f);
                this.translationDrawable.setCallback(null);
                this.translationDrawable = null;
                this.translationAnimationStarted = false;
            }
            i4 = 1;
        } else {
            canvas.save();
            canvas.translate(0.0f, -this.translateY);
            if (this.overrideSwipeAction) {
                color = Theme.getColor(this.overrideSwipeActionBackgroundColorKey, this.resourcesProvider);
                color2 = Theme.getColor(this.overrideSwipeActionRevealBackgroundColorKey, this.resourcesProvider);
                String str2 = this.overrideSwipeActionStringKey;
                i = this.overrideSwipeActionStringId;
                string = LocaleController.getString(str2, i);
                rLottieDrawable = this.overrideSwipeActionDrawable;
            } else if (this.currentDialogFolderId != 0) {
                if (this.archiveHidden) {
                    color = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                    color2 = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                    i = R.string.UnhideFromTop;
                    string = LocaleController.getString(i);
                    rLottieDrawable = Theme.dialogs_unpinArchiveDrawable;
                } else {
                    color = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                    color2 = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                    i = R.string.HideOnTop;
                    string = LocaleController.getString(i);
                    rLottieDrawable = Theme.dialogs_pinArchiveDrawable;
                }
            } else if (this.promoDialog) {
                color = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                color2 = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                i = R.string.PsaHide;
                string = LocaleController.getString(i);
                rLottieDrawable = Theme.dialogs_hidePsaDrawable;
            } else if (this.folderId == 0) {
                color = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                color2 = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                if (SharedConfig.getChatSwipeAction(this.currentAccount) == 3) {
                    if (this.dialogMuted) {
                        i = R.string.SwipeUnmute;
                        string = LocaleController.getString(i);
                        rLottieDrawable = Theme.dialogs_swipeUnmuteDrawable;
                    } else {
                        i = R.string.SwipeMute;
                        string = LocaleController.getString(i);
                        rLottieDrawable = Theme.dialogs_swipeMuteDrawable;
                    }
                } else if (SharedConfig.getChatSwipeAction(this.currentAccount) == 4) {
                    i = R.string.SwipeDeleteChat;
                    string = LocaleController.getString(i);
                    color = Theme.getColor(Theme.key_dialogSwipeRemove, this.resourcesProvider);
                    rLottieDrawable = Theme.dialogs_swipeDeleteDrawable;
                } else if (SharedConfig.getChatSwipeAction(this.currentAccount) == 1) {
                    if (this.unreadCount > 0 || this.markUnread) {
                        i = R.string.SwipeMarkAsRead;
                        string = LocaleController.getString(i);
                        rLottieDrawable = Theme.dialogs_swipeReadDrawable;
                    } else {
                        i = R.string.SwipeMarkAsUnread;
                        string = LocaleController.getString(i);
                        rLottieDrawable = Theme.dialogs_swipeUnreadDrawable;
                    }
                } else if (SharedConfig.getChatSwipeAction(this.currentAccount) != 0) {
                    i = R.string.Archive;
                    string = LocaleController.getString(i);
                    rLottieDrawable = Theme.dialogs_archiveDrawable;
                } else if (getIsPinned()) {
                    i = R.string.SwipeUnpin;
                    string = LocaleController.getString(i);
                    rLottieDrawable = Theme.dialogs_swipeUnpinDrawable;
                } else {
                    i = R.string.SwipePin;
                    string = LocaleController.getString(i);
                    rLottieDrawable = Theme.dialogs_swipePinDrawable;
                }
            } else {
                color = Theme.getColor(Theme.key_chats_archivePinBackground, this.resourcesProvider);
                color2 = Theme.getColor(Theme.key_chats_archiveBackground, this.resourcesProvider);
                i = R.string.Unarchive;
                string = LocaleController.getString(i);
                rLottieDrawable = Theme.dialogs_unarchiveDrawable;
            }
            RLottieDrawable rLottieDrawable4 = rLottieDrawable;
            int i23 = color2;
            int i24 = i;
            String str3 = string;
            int i25 = i24;
            this.translationDrawable = rLottieDrawable4;
            if (!this.swipeCanceled || (rLottieDrawable2 = this.lastDrawTranslationDrawable) == null) {
                this.lastDrawTranslationDrawable = rLottieDrawable4;
                this.lastDrawSwipeMessageStringId = i25;
            } else {
                this.translationDrawable = rLottieDrawable2;
                i25 = this.lastDrawSwipeMessageStringId;
            }
            int i26 = i25;
            if (!this.translationAnimationStarted && Math.abs(this.translationX) > AndroidUtilities.dp(43.0f)) {
                this.translationAnimationStarted = true;
                this.translationDrawable.setProgress(0.0f);
                this.translationDrawable.setCallback(this);
                this.translationDrawable.start();
            }
            float measuredWidth2 = this.translationX + getMeasuredWidth();
            if (this.currentRevealProgress < 1.0f) {
                Theme.dialogs_pinnedPaint.setColor(color);
                f2 = 0.0f;
                f = measuredWidth2;
                canvas.drawRect(measuredWidth2 - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight(), Theme.dialogs_pinnedPaint);
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
                        RLottieDrawable rLottieDrawable5 = Theme.dialogs_hidePsaDrawable;
                        int i27 = Theme.key_chats_archiveBackground;
                        rLottieDrawable5.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i27));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i27));
                        Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i27));
                        Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                        Theme.dialogs_hidePsaDrawableRecolored = z2;
                    }
                }
            } else {
                f = measuredWidth2;
                f2 = 0.0f;
            }
            int measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.translationDrawable.getIntrinsicWidth() / 2);
            int measuredHeight2 = (getMeasuredHeight() - AndroidUtilities.dp(54.0f)) / 2;
            int intrinsicWidth = (this.translationDrawable.getIntrinsicWidth() / 2) + measuredWidth3;
            int intrinsicHeight = (this.translationDrawable.getIntrinsicHeight() / 2) + measuredHeight2;
            if (this.currentRevealProgress > f2) {
                canvas.save();
                f3 = f;
                i2 = i26;
                str = str3;
                canvas.clipRect(f3 - AndroidUtilities.dp(8.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Theme.dialogs_pinnedPaint.setColor(i23);
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
                    RLottieDrawable rLottieDrawable6 = Theme.dialogs_hidePsaDrawable;
                    int i28 = Theme.key_chats_archivePinBackground;
                    rLottieDrawable6.setLayerColor("Line 1.**", Theme.getNonAnimatedColor(i28));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 2.**", Theme.getNonAnimatedColor(i28));
                    Theme.dialogs_hidePsaDrawable.setLayerColor("Line 3.**", Theme.getNonAnimatedColor(i28));
                    Theme.dialogs_hidePsaDrawable.commitApplyLayerColors();
                    Theme.dialogs_hidePsaDrawableRecolored = z;
                    i3 = z;
                }
            } else {
                i2 = i26;
                f3 = f;
                str = str3;
                i3 = 1;
            }
            canvas.save();
            canvas.translate(measuredWidth3, measuredHeight2);
            float f22 = this.currentRevealBounceProgress;
            if (f22 != 0.0f && f22 != 1.0f) {
                float interpolation = this.interpolator.getInterpolation(f22) + 1.0f;
                canvas.scale(interpolation, interpolation, this.translationDrawable.getIntrinsicWidth() / 2, this.translationDrawable.getIntrinsicHeight() / 2);
            }
            BaseCell.setDrawableBounds((Drawable) this.translationDrawable, 0, 0);
            this.translationDrawable.draw(canvas);
            canvas.restore();
            canvas.clipRect(f3, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            String str4 = str;
            int ceil = (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(str4));
            int i29 = i2;
            if (this.swipeMessageTextId != i29 || this.swipeMessageWidth != getMeasuredWidth()) {
                this.swipeMessageTextId = i29;
                this.swipeMessageWidth = getMeasuredWidth();
                TextPaint textPaint4 = Theme.dialogs_archiveTextPaint;
                int min = Math.min(AndroidUtilities.dp(80.0f), ceil);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                StaticLayout staticLayout4 = new StaticLayout(str4, textPaint4, min, alignment, 1.0f, 0.0f, false);
                this.swipeMessageTextLayout = staticLayout4;
                if (staticLayout4.getLineCount() > i3) {
                    this.swipeMessageTextLayout = new StaticLayout(str4, Theme.dialogs_archiveTextPaintSmall, Math.min(AndroidUtilities.dp(82.0f), ceil), alignment, 1.0f, 0.0f, false);
                }
            }
            if (this.swipeMessageTextLayout != null) {
                canvas.save();
                canvas.translate((getMeasuredWidth() - AndroidUtilities.dp(43.0f)) - (this.swipeMessageTextLayout.getWidth() / 2.0f), measuredHeight2 + AndroidUtilities.dp(38.0f) + (this.swipeMessageTextLayout.getLineCount() > i3 ? -AndroidUtilities.dp(4.0f) : 0.0f));
                this.swipeMessageTextLayout.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            i4 = i3;
        }
        if (this.translationX != 0.0f) {
            canvas.save();
            canvas.translate(this.translationX, 0.0f);
        }
        float dp2 = AndroidUtilities.dp(8.0f) * this.cornerProgress;
        if (this.isSelected) {
            f4 = 0.0f;
            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.lerp(getMeasuredHeight(), getCollapsedHeight(), this.rightFragmentOpenedProgress));
            this.rect.offset(0.0f, (-this.translateY) + this.collapseOffset);
            canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
        } else {
            f4 = 0.0f;
        }
        canvas.save();
        canvas.translate(f4, (-this.rightFragmentOffset) * this.rightFragmentOpenedProgress);
        if (this.currentDialogFolderId != 0 && (!SharedConfig.archiveHidden || this.archiveBackgroundProgress != f4)) {
            paint = Theme.dialogs_pinnedPaint;
            color3 = AndroidUtilities.getOffsetColor(0, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, 1.0f);
        } else if (getIsPinned() || this.drawPinBackground) {
            paint = Theme.dialogs_pinnedPaint;
            color3 = Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider);
        } else {
            i5 = 0;
            canvas.restore();
            this.updateHelper.updateAnimationValues();
            if (this.collapseOffset != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, this.collapseOffset);
            }
            f5 = this.rightFragmentOpenedProgress;
            if (f5 == 1.0f) {
                if (f5 != 0.0f) {
                    float clamp = Utilities.clamp(f5 / 0.4f, 1.0f, 0.0f);
                    if (SharedConfig.getDevicePerformanceClass() >= 2) {
                        i22 = canvas.saveLayerAlpha(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + i4) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.rightFragmentOpenedProgress) * 255.0f), 31);
                    } else {
                        int save = canvas.save();
                        canvas.clipRect(AndroidUtilities.dp(RightSlidingDialogContainer.getRightPaddingSize() + i4) - (AndroidUtilities.dp(8.0f) * (1.0f - clamp)), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        i22 = save;
                    }
                    f10 = 0.0f;
                    canvas.translate((-(getMeasuredWidth() - AndroidUtilities.dp(74.0f))) * 0.7f * this.rightFragmentOpenedProgress, 0.0f);
                    i7 = i22;
                } else {
                    f10 = 0.0f;
                    i7 = -1;
                }
                if (this.translationX != f10 || this.cornerProgress != f10) {
                    canvas.save();
                    Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                    this.rect.set(getMeasuredWidth() - AndroidUtilities.dp(64.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.rect.offset(0.0f, -this.translateY);
                    canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_pinnedPaint);
                    if (this.isSelected) {
                        canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_tabletSeletedPaint);
                    }
                    if (this.currentDialogFolderId == 0 || (SharedConfig.archiveHidden && this.archiveBackgroundProgress == 0.0f)) {
                        if (getIsPinned() || this.drawPinBackground) {
                            Theme.dialogs_pinnedPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                            paint3 = Theme.dialogs_pinnedPaint;
                            alpha = paint3.getAlpha();
                            f11 = this.rightFragmentOpenedProgress;
                            f12 = 1.0f;
                        }
                        canvas.restore();
                    } else {
                        f12 = 1.0f;
                        Theme.dialogs_pinnedPaint.setColor(AndroidUtilities.getOffsetColor(i5, Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider), this.archiveBackgroundProgress, 1.0f));
                        paint3 = Theme.dialogs_pinnedPaint;
                        alpha = paint3.getAlpha();
                        f11 = this.rightFragmentOpenedProgress;
                    }
                    paint3.setAlpha((int) (alpha * (f12 - f11)));
                    canvas.drawRoundRect(this.rect, dp2, dp2, Theme.dialogs_pinnedPaint);
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
                int dp3 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 10.0f : 13.0f);
                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                    dp3 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                }
                if (this.nameLayout != null) {
                    if (this.nameLayoutEllipsizeByGradient && !this.nameLayoutFits) {
                        if (this.nameLayoutEllipsizeLeft && this.fadePaint == null) {
                            Paint paint6 = new Paint();
                            this.fadePaint = paint6;
                            paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{-1, i5}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                            paint5 = this.fadePaint;
                            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                        } else {
                            if (this.fadePaintBack == null) {
                                Paint paint7 = new Paint();
                                this.fadePaintBack = paint7;
                                paint7.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{i5, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                                paint5 = this.fadePaintBack;
                                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                            }
                            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), NotificationCenter.proxyCheckDone, 31);
                            int i30 = this.nameLeft;
                            canvas.clipRect(i30, i5, this.nameWidth + i30, getMeasuredHeight());
                        }
                        paint5.setXfermode(porterDuffXfermode);
                        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), NotificationCenter.proxyCheckDone, 31);
                        int i302 = this.nameLeft;
                        canvas.clipRect(i302, i5, this.nameWidth + i302, getMeasuredHeight());
                    }
                    if (this.currentDialogFolderId != 0) {
                        TextPaint textPaint5 = Theme.dialogs_namePaint[this.paintIndex];
                        int color4 = Theme.getColor(Theme.key_chats_nameArchived, this.resourcesProvider);
                        textPaint5.linkColor = color4;
                        textPaint5.setColor(color4);
                    } else {
                        if (this.encryptedChat == null) {
                            CustomDialog customDialog = this.customDialog;
                            if (customDialog != null) {
                            }
                            textPaint3 = Theme.dialogs_namePaint[this.paintIndex];
                            i21 = Theme.key_chats_name;
                            int color5 = Theme.getColor(i21, this.resourcesProvider);
                            textPaint3.linkColor = color5;
                            textPaint3.setColor(color5);
                        }
                        textPaint3 = Theme.dialogs_namePaint[this.paintIndex];
                        i21 = Theme.key_chats_secretName;
                        int color52 = Theme.getColor(i21, this.resourcesProvider);
                        textPaint3.linkColor = color52;
                        textPaint3.setColor(color52);
                    }
                    canvas.save();
                    canvas.translate(this.nameLeft + this.nameLayoutTranslateX, dp3);
                    SpoilerEffect.layoutDrawMaybe(this.nameLayout, canvas);
                    StaticLayout staticLayout5 = this.nameLayout;
                    i8 = i7;
                    i11 = -1;
                    i9 = 1;
                    AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout5, this.animatedEmojiStackName, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i5, staticLayout5.getPaint().getColor()));
                    canvas.restore();
                    if (!this.nameLayoutEllipsizeByGradient || this.nameLayoutFits) {
                        i10 = 2;
                    } else {
                        canvas.save();
                        if (this.nameLayoutEllipsizeLeft) {
                            canvas.translate(this.nameLeft, 0.0f);
                            dp = AndroidUtilities.dp(24.0f);
                            measuredHeight = getMeasuredHeight();
                            canvas5 = canvas;
                            i10 = 2;
                            f18 = 0.0f;
                            f19 = 0.0f;
                            paint4 = this.fadePaint;
                        } else {
                            i10 = 2;
                            canvas.translate((this.nameLeft + this.nameWidth) - AndroidUtilities.dp(24.0f), 0.0f);
                            dp = AndroidUtilities.dp(24.0f);
                            measuredHeight = getMeasuredHeight();
                            paint4 = this.fadePaintBack;
                            f18 = 0.0f;
                            f19 = 0.0f;
                            canvas5 = canvas;
                        }
                        canvas5.drawRect(f18, f19, dp, measuredHeight, paint4);
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
                    f13 = 0.0f;
                    i13 = 2;
                } else {
                    if (this.currentDialogFolderId != 0) {
                        textPaint2 = Theme.dialogs_messageNamePaint;
                        i20 = Theme.key_chats_nameMessageArchived_threeLines;
                    } else if (this.draftMessage != null) {
                        textPaint2 = Theme.dialogs_messageNamePaint;
                        i20 = Theme.key_chats_draft;
                    } else {
                        textPaint2 = Theme.dialogs_messageNamePaint;
                        i20 = Theme.key_chats_nameMessage_threeLines;
                    }
                    int color6 = Theme.getColor(i20, this.resourcesProvider);
                    textPaint2.linkColor = color6;
                    textPaint2.setColor(color6);
                    canvas.save();
                    canvas.translate(this.messageNameLeft, this.messageNameTop);
                    try {
                        SpoilerEffect.layoutDrawMaybe(this.messageNameLayout, canvas);
                        staticLayout3 = this.messageNameLayout;
                        i13 = 2;
                        f13 = 0.0f;
                        i12 = 4;
                    } catch (Exception e) {
                        e = e;
                        i12 = 4;
                        f13 = 0.0f;
                        i13 = 2;
                    }
                    try {
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, this.animatedEmojiStack2, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i9, staticLayout3.getPaint().getColor()));
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
                        if (this.dialogsType != i14) {
                        }
                        if (this.drawVerified) {
                        }
                        drawable.draw(canvas);
                        if (!this.drawReorder) {
                        }
                        Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                        BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                        Theme.dialogs_reorderDrawable.draw(canvas);
                        if (!this.drawError) {
                        }
                        drawable2.draw(canvas);
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
                        if (this.rightFragmentOpenedProgress > f7) {
                        }
                        if (this.collapseOffset != f7) {
                        }
                        if (this.translationX != f7) {
                        }
                        if (this.drawArchive) {
                        }
                        if (this.useSeparator) {
                        }
                        if (this.clipProgress != f7) {
                        }
                        z4 = this.drawReorder;
                        if (!z4) {
                        }
                        if (z4) {
                        }
                        if (this.archiveHidden) {
                        }
                        z5 = true;
                        if (this.animatingArchiveAvatar) {
                        }
                        if (this.drawRevealBackground) {
                        }
                    }
                    canvas.restore();
                }
                if (this.messageLayout != null) {
                    if (this.currentDialogFolderId == 0) {
                        textPaint = Theme.dialogs_messagePaint[this.paintIndex];
                        i19 = Theme.key_chats_message;
                    } else if (this.chat != null) {
                        textPaint = Theme.dialogs_messagePaint[this.paintIndex];
                        i19 = Theme.key_chats_nameMessageArchived;
                    } else {
                        textPaint = Theme.dialogs_messagePaint[this.paintIndex];
                        i19 = Theme.key_chats_messageArchived;
                    }
                    int color7 = Theme.getColor(i19, this.resourcesProvider);
                    textPaint.linkColor = color7;
                    textPaint.setColor(color7);
                    float dp4 = AndroidUtilities.dp(14.0f);
                    DialogUpdateHelper dialogUpdateHelper = this.updateHelper;
                    float f27 = dialogUpdateHelper.typingOutToTop ? this.messageTop - (dialogUpdateHelper.typingProgres * dp4) : this.messageTop + (dialogUpdateHelper.typingProgres * dp4);
                    if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                        f27 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                    }
                    if (this.updateHelper.typingProgres != 1.0f) {
                        canvas.save();
                        canvas.translate(this.messageLeft, f27);
                        int alpha2 = this.messageLayout.getPaint().getAlpha();
                        this.messageLayout.getPaint().setAlpha((int) (alpha2 * (1.0f - this.updateHelper.typingProgres)));
                        if (this.spoilers.isEmpty()) {
                            f16 = 1.0f;
                            SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas);
                            StaticLayout staticLayout6 = this.messageLayout;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout6, this.animatedEmojiStack, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i13, staticLayout6.getPaint().getColor()));
                        } else {
                            try {
                                canvas.save();
                                SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
                                SpoilerEffect.layoutDrawMaybe(this.messageLayout, canvas);
                                staticLayout2 = this.messageLayout;
                                f16 = 1.0f;
                            } catch (Exception e3) {
                                e = e3;
                                f16 = 1.0f;
                            }
                            try {
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout2, this.animatedEmojiStack, -0.075f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(i13, staticLayout2.getPaint().getColor()));
                                canvas.restore();
                                for (int i31 = 0; i31 < this.spoilers.size(); i31 += i9) {
                                    SpoilerEffect spoilerEffect = (SpoilerEffect) this.spoilers.get(i31);
                                    spoilerEffect.setColor(this.messageLayout.getPaint().getColor());
                                    spoilerEffect.draw(canvas);
                                }
                            } catch (Exception e4) {
                                e = e4;
                                FileLog.e(e);
                                this.messageLayout.getPaint().setAlpha(alpha2);
                                canvas.restore();
                                canvas.save();
                                DialogUpdateHelper dialogUpdateHelper2 = this.updateHelper;
                                if (!dialogUpdateHelper2.typingOutToTop) {
                                }
                                if (!this.useForceThreeLines) {
                                    f17 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                    canvas.translate(this.typingLeft, f17);
                                    staticLayout = this.typingLayout;
                                    if (staticLayout != null) {
                                        int alpha3 = staticLayout.getPaint().getAlpha();
                                        this.typingLayout.getPaint().setAlpha((int) (alpha3 * this.updateHelper.typingProgres));
                                        this.typingLayout.draw(canvas);
                                        this.typingLayout.getPaint().setAlpha(alpha3);
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
                                    if (this.dialogsType != i14) {
                                    }
                                    if (this.drawVerified) {
                                    }
                                    drawable.draw(canvas);
                                    if (!this.drawReorder) {
                                    }
                                    Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                    Theme.dialogs_reorderDrawable.draw(canvas);
                                    if (!this.drawError) {
                                    }
                                    drawable2.draw(canvas);
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
                                    if (this.rightFragmentOpenedProgress > f7) {
                                    }
                                    if (this.collapseOffset != f7) {
                                    }
                                    if (this.translationX != f7) {
                                    }
                                    if (this.drawArchive) {
                                    }
                                    if (this.useSeparator) {
                                    }
                                    if (this.clipProgress != f7) {
                                    }
                                    z4 = this.drawReorder;
                                    if (!z4) {
                                    }
                                    if (z4) {
                                    }
                                    if (this.archiveHidden) {
                                    }
                                    z5 = true;
                                    if (this.animatingArchiveAvatar) {
                                    }
                                    if (this.drawRevealBackground) {
                                    }
                                }
                                f17 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                canvas.translate(this.typingLeft, f17);
                                staticLayout = this.typingLayout;
                                if (staticLayout != null) {
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
                                if (this.dialogsType != i14) {
                                }
                                if (this.drawVerified) {
                                }
                                drawable.draw(canvas);
                                if (!this.drawReorder) {
                                }
                                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                Theme.dialogs_reorderDrawable.draw(canvas);
                                if (!this.drawError) {
                                }
                                drawable2.draw(canvas);
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
                                if (this.rightFragmentOpenedProgress > f7) {
                                }
                                if (this.collapseOffset != f7) {
                                }
                                if (this.translationX != f7) {
                                }
                                if (this.drawArchive) {
                                }
                                if (this.useSeparator) {
                                }
                                if (this.clipProgress != f7) {
                                }
                                z4 = this.drawReorder;
                                if (!z4) {
                                }
                                if (z4) {
                                }
                                if (this.archiveHidden) {
                                }
                                z5 = true;
                                if (this.animatingArchiveAvatar) {
                                }
                                if (this.drawRevealBackground) {
                                }
                            }
                        }
                        this.messageLayout.getPaint().setAlpha(alpha2);
                        canvas.restore();
                    } else {
                        f16 = 1.0f;
                    }
                    canvas.save();
                    DialogUpdateHelper dialogUpdateHelper22 = this.updateHelper;
                    f17 = !dialogUpdateHelper22.typingOutToTop ? this.messageTop + ((f16 - dialogUpdateHelper22.typingProgres) * dp4) : this.messageTop - ((f16 - dialogUpdateHelper22.typingProgres) * dp4);
                    if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                        f17 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                    }
                    canvas.translate(this.typingLeft, f17);
                    staticLayout = this.typingLayout;
                    if (staticLayout != null && this.updateHelper.typingProgres > f13) {
                        int alpha32 = staticLayout.getPaint().getAlpha();
                        this.typingLayout.getPaint().setAlpha((int) (alpha32 * this.updateHelper.typingProgres));
                        this.typingLayout.draw(canvas);
                        this.typingLayout.getPaint().setAlpha(alpha32);
                    }
                    canvas.restore();
                    if (this.typingLayout != null) {
                        int i32 = this.printingStringType;
                        if (i32 < 0) {
                            DialogUpdateHelper dialogUpdateHelper3 = this.updateHelper;
                            if (dialogUpdateHelper3.typingProgres > f13) {
                            }
                        }
                        if (i32 < 0) {
                            i32 = this.updateHelper.lastKnownTypingType;
                        }
                        StatusDrawable chatStatusDrawable = Theme.getChatStatusDrawable(i32);
                        if (chatStatusDrawable != null) {
                            canvas.save();
                            chatStatusDrawable.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chats_actionMessage), (int) (Color.alpha(r10) * this.updateHelper.typingProgres)));
                            DialogUpdateHelper dialogUpdateHelper4 = this.updateHelper;
                            float f28 = dialogUpdateHelper4.typingOutToTop ? this.messageTop + (dp4 * (f16 - dialogUpdateHelper4.typingProgres)) : this.messageTop - (dp4 * (f16 - dialogUpdateHelper4.typingProgres));
                            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                f28 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                            }
                            if (i32 == i9 || i32 == i12) {
                                canvas.translate(this.statusDrawableLeft, f28 + (i32 == i9 ? AndroidUtilities.dp(f16) : 0));
                            } else {
                                canvas.translate(this.statusDrawableLeft, f28 + ((AndroidUtilities.dp(18.0f) - chatStatusDrawable.getIntrinsicHeight()) / 2.0f));
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
                    if (this.lastTopicMessageUnread && this.topMessageTopicEndIndex != this.topMessageTopicStartIndex && ((i18 = this.dialogsType) == 0 || i18 == 7 || i18 == 8)) {
                        this.canvasButton.setColor(ColorUtils.setAlphaComponent(this.currentMessagePaint.getColor(), Theme.isCurrentThemeDark() ? 36 : 26));
                        if (!this.buttonCreated) {
                            this.canvasButton.rewind();
                            int i33 = this.topMessageTopicEndIndex;
                            if (i33 != this.topMessageTopicStartIndex && i33 > 0) {
                                float f29 = this.messageTop;
                                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                    f29 -= AndroidUtilities.dp(isForumCell() ? 10.0f : 11.0f);
                                }
                                RectF rectF = AndroidUtilities.rectTmp;
                                float dp5 = this.messageLeft + AndroidUtilities.dp(2.0f) + this.messageLayout.getPrimaryHorizontal(0);
                                float f30 = this.messageLeft;
                                StaticLayout staticLayout7 = this.messageLayout;
                                rectF.set(dp5, f29, (f30 + staticLayout7.getPrimaryHorizontal(Math.min(staticLayout7.getText().length(), this.topMessageTopicEndIndex))) - AndroidUtilities.dp(3.0f), this.buttonTop - AndroidUtilities.dp(4.0f));
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
                        this.canvasButton.draw(canvas);
                        Theme.dialogs_forum_arrowDrawable.setAlpha(125);
                        Drawable drawable4 = Theme.dialogs_forum_arrowDrawable;
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        BaseCell.setDrawableBounds(drawable4, rectF3.right - AndroidUtilities.dp(18.0f), rectF3.top + ((rectF3.height() - Theme.dialogs_forum_arrowDrawable.getIntrinsicHeight()) / 2.0f));
                        Theme.dialogs_forum_arrowDrawable.draw(canvas);
                    }
                    canvas.translate(this.buttonLeft, this.buttonTop);
                    if (this.spoilers2.isEmpty()) {
                        SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas);
                        StaticLayout staticLayout8 = this.buttonLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout8, this.animatedEmojiStack3, -0.075f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout8.getPaint().getColor()));
                    } else {
                        try {
                            canvas.save();
                            SpoilerEffect.clipOutCanvas(canvas, this.spoilers2);
                            SpoilerEffect.layoutDrawMaybe(this.buttonLayout, canvas);
                            StaticLayout staticLayout9 = this.buttonLayout;
                            try {
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout9, this.animatedEmojiStack3, -0.075f, this.spoilers2, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(3, staticLayout9.getPaint().getColor()));
                                canvas.restore();
                                for (int i34 = 0; i34 < this.spoilers2.size(); i34 += i9) {
                                    SpoilerEffect spoilerEffect2 = (SpoilerEffect) this.spoilers2.get(i34);
                                    spoilerEffect2.setColor(this.buttonLayout.getPaint().getColor());
                                    spoilerEffect2.draw(canvas);
                                }
                            } catch (Exception e5) {
                                e = e5;
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
                                if (this.drawVerified) {
                                }
                                drawable.draw(canvas);
                                if (!this.drawReorder) {
                                }
                                Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                Theme.dialogs_reorderDrawable.draw(canvas);
                                if (!this.drawError) {
                                }
                                drawable2.draw(canvas);
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
                                if (this.rightFragmentOpenedProgress > f7) {
                                }
                                if (this.collapseOffset != f7) {
                                }
                                if (this.translationX != f7) {
                                }
                                if (this.drawArchive) {
                                }
                                if (this.useSeparator) {
                                }
                                if (this.clipProgress != f7) {
                                }
                                z4 = this.drawReorder;
                                if (!z4) {
                                }
                                if (z4) {
                                }
                                if (this.archiveHidden) {
                                }
                                z5 = true;
                                if (this.animatingArchiveAvatar) {
                                }
                                if (this.drawRevealBackground) {
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                        }
                    }
                    canvas.restore();
                }
                if (this.currentDialogFolderId == 0) {
                    int i35 = (this.drawClock ? 1 : 0) + (this.drawCheck1 ? 2 : 0) + (this.drawCheck2 ? 4 : 0);
                    int i36 = this.lastStatusDrawableParams;
                    if (i36 >= 0 && i36 != i35 && !this.statusDrawableAnimationInProgress) {
                        createStatusDrawableAnimator(i36, i35);
                    }
                    boolean z13 = this.statusDrawableAnimationInProgress;
                    if (z13) {
                        i35 = this.animateToStatusDrawableParams;
                    }
                    boolean z14 = (i35 & 1) != 0;
                    boolean z15 = (i35 & 2) != 0;
                    boolean z16 = (i35 & i12) != 0;
                    if (z13) {
                        int i37 = this.animateFromStatusDrawableParams;
                        boolean z17 = (i37 & 1) != 0;
                        boolean z18 = (i37 & 2) != 0;
                        boolean z19 = (i37 & i12) != 0;
                        if (z14 || z17 || !z19 || z18 || !z15 || !z16) {
                            f6 = 1.0f;
                            f7 = 0.0f;
                            dialogCell = this;
                            canvas4 = canvas;
                            boolean z20 = z18;
                            i14 = 2;
                            boolean z21 = z19;
                            i6 = 1;
                            dialogCell.drawCheckStatus(canvas4, z17, z20, z21, false, 1.0f - this.statusDrawableProgress);
                            f15 = this.statusDrawableProgress;
                            z12 = false;
                        } else {
                            f7 = 0.0f;
                            f6 = 1.0f;
                            i6 = 1;
                            drawCheckStatus(canvas, z14, z15, z16, true, this.statusDrawableProgress);
                            i14 = 2;
                            this.lastStatusDrawableParams = (this.drawClock ? 1 : 0) + (!this.drawCheck1 ? 2 : 0) + (!this.drawCheck2 ? 4 : 0);
                        }
                    } else {
                        i14 = 2;
                        i6 = 1;
                        f6 = 1.0f;
                        f7 = 0.0f;
                        z12 = false;
                        f15 = 1.0f;
                        dialogCell = this;
                        canvas4 = canvas;
                    }
                    dialogCell.drawCheckStatus(canvas4, z14, z15, z16, z12, f15);
                    this.lastStatusDrawableParams = (this.drawClock ? 1 : 0) + (!this.drawCheck1 ? 2 : 0) + (!this.drawCheck2 ? 4 : 0);
                } else {
                    i14 = 2;
                    i6 = 1;
                    f6 = 1.0f;
                    f7 = 0.0f;
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
                boolean z22 = !this.drawUnmute || this.dialogMuted;
                if (this.dialogsType != i14 || ((!z22 && this.dialogMutedProgress <= f7) || this.drawVerified || this.drawScam != 0 || this.drawPremium)) {
                    if (this.drawVerified) {
                        if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                            r22 = 16.5f;
                        }
                        float dp7 = AndroidUtilities.dp(r22);
                        if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                            dp7 -= AndroidUtilities.dp(9.0f);
                        }
                        BaseCell.setDrawableBounds(Theme.dialogs_verifiedDrawable, this.nameMuteLeft - AndroidUtilities.dp(f6), dp7);
                        BaseCell.setDrawableBounds(Theme.dialogs_verifiedCheckDrawable, this.nameMuteLeft - AndroidUtilities.dp(f6), dp7);
                        Theme.dialogs_verifiedDrawable.draw(canvas);
                        drawable = Theme.dialogs_verifiedCheckDrawable;
                    } else {
                        if (this.drawPremium) {
                            int dp8 = AndroidUtilities.dp((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 12.5f : 15.5f);
                            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                dp8 -= AndroidUtilities.dp(9.0f);
                            }
                            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiStatus;
                            if (swapAnimatedEmojiDrawable2 != null) {
                                swapAnimatedEmojiDrawable2.setBounds(this.nameMuteLeft - AndroidUtilities.dp(2.0f), dp8 - AndroidUtilities.dp(4.0f), this.nameMuteLeft + AndroidUtilities.dp(20.0f), (dp8 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(22.0f));
                                this.emojiStatus.setColor(Integer.valueOf(Theme.getColor(Theme.key_chats_verifiedBackground, this.resourcesProvider)));
                                this.emojiStatus.draw(canvas);
                            } else {
                                drawable = PremiumGradient.getInstance().premiumStarDrawableMini;
                                int dp9 = this.nameMuteLeft - AndroidUtilities.dp(f6);
                                if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                                    f21 = 15.5f;
                                }
                                BaseCell.setDrawableBounds(drawable, dp9, AndroidUtilities.dp(f21));
                            }
                        } else if (this.drawScam != 0) {
                            if (!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) {
                                f20 = 15.0f;
                            }
                            int dp10 = AndroidUtilities.dp(f20);
                            if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                dp10 -= AndroidUtilities.dp(9.0f);
                            }
                            BaseCell.setDrawableBounds((Drawable) (this.drawScam == i6 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable), this.nameMuteLeft, dp10);
                            (this.drawScam == i6 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable).draw(canvas);
                        }
                        if (!this.drawReorder || this.reorderIconProgress != f7) {
                            Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                            Theme.dialogs_reorderDrawable.draw(canvas);
                        }
                        if (!this.drawError) {
                            Theme.dialogs_errorDrawable.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                            this.rect.set(this.errorLeft, this.errorTop, r1 + AndroidUtilities.dp(23.0f), this.errorTop + AndroidUtilities.dp(23.0f));
                            RectF rectF4 = this.rect;
                            float f31 = AndroidUtilities.density * 11.5f;
                            canvas.drawRoundRect(rectF4, f31, f31, Theme.dialogs_errorPaint);
                            BaseCell.setDrawableBounds(Theme.dialogs_errorDrawable, this.errorLeft + AndroidUtilities.dp(5.5f), this.errorTop + AndroidUtilities.dp(5.0f));
                            drawable2 = Theme.dialogs_errorDrawable;
                        } else if (((this.drawCount || this.drawMention) && this.drawCount2) || this.countChangeProgress != f6 || this.drawReactionMention || this.reactionsMentionsChangeProgress != f6) {
                            if (this.isTopic) {
                                z9 = this.topicMuted;
                            } else {
                                TLRPC.Chat chat = this.chat;
                                if (chat != null && chat.forum && this.forumTopic == null) {
                                    z10 = !this.hasUnmutedTopics;
                                    Canvas canvas6 = canvas;
                                    drawCounter(canvas, z10, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                                    if (this.drawMention) {
                                        Theme.dialogs_countPaint.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                        this.rect.set(this.mentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r1 + this.mentionWidth + AndroidUtilities.dp(11.0f), this.countTop + AndroidUtilities.dp(23.0f));
                                        Paint paint8 = (!z10 || this.folderId == 0) ? Theme.dialogs_countPaint : Theme.dialogs_countGrayPaint;
                                        RectF rectF5 = this.rect;
                                        float f32 = AndroidUtilities.density * 11.5f;
                                        canvas6.drawRoundRect(rectF5, f32, f32, paint8);
                                        if (this.mentionLayout != null) {
                                            Theme.dialogs_countTextPaint.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                            canvas.save();
                                            canvas6.translate(this.mentionLeft, this.countTop + AndroidUtilities.dp(4.0f));
                                            this.mentionLayout.draw(canvas6);
                                            canvas.restore();
                                        } else {
                                            Theme.dialogs_mentionDrawable.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                            BaseCell.setDrawableBounds(Theme.dialogs_mentionDrawable, this.mentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.2f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                                            Theme.dialogs_mentionDrawable.draw(canvas6);
                                        }
                                    }
                                    if (!this.drawReactionMention) {
                                        canvas3 = canvas6;
                                    }
                                    Theme.dialogs_reactionsCountPaint.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                    this.rect.set(this.reactionMentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r0 + AndroidUtilities.dp(23.0f), this.countTop + AndroidUtilities.dp(23.0f));
                                    Paint paint9 = Theme.dialogs_reactionsCountPaint;
                                    canvas.save();
                                    f14 = this.reactionsMentionsChangeProgress;
                                    if (f14 != f6) {
                                        if (!this.drawReactionMention) {
                                            f14 = f6 - f14;
                                        }
                                        canvas6.scale(f14, f14, this.rect.centerX(), this.rect.centerY());
                                    }
                                    RectF rectF6 = this.rect;
                                    float f33 = AndroidUtilities.density * 11.5f;
                                    canvas6.drawRoundRect(rectF6, f33, f33, paint9);
                                    Theme.dialogs_reactionsMentionDrawable.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                    BaseCell.setDrawableBounds(Theme.dialogs_reactionsMentionDrawable, this.reactionMentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.8f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                                    Theme.dialogs_reactionsMentionDrawable.draw(canvas6);
                                    canvas.restore();
                                    canvas3 = canvas6;
                                    if (this.thumbsCount > 0) {
                                        float f34 = this.updateHelper.typingProgres;
                                        if (f34 != f6) {
                                            if (f34 > f7) {
                                                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((f6 - f34) * 255.0f), 31);
                                                canvas3.translate(f7, (this.updateHelper.typingOutToTop ? -AndroidUtilities.dp(14.0f) : AndroidUtilities.dp(14.0f)) * this.updateHelper.typingProgres);
                                            }
                                            int i38 = 0;
                                            while (i38 < this.thumbsCount) {
                                                if (this.thumbImageSeen[i38]) {
                                                    if (this.thumbBackgroundPaint == null) {
                                                        Paint paint10 = new Paint(i6);
                                                        this.thumbBackgroundPaint = paint10;
                                                        paint10.setShadowLayer(AndroidUtilities.dp(1.34f), f7, AndroidUtilities.dp(0.34f), 402653184);
                                                        c = 0;
                                                        this.thumbBackgroundPaint.setColor(0);
                                                    } else {
                                                        c = 0;
                                                    }
                                                    RectF rectF7 = AndroidUtilities.rectTmp;
                                                    rectF7.set(this.thumbImage[i38].getImageX(), this.thumbImage[i38].getImageY(), this.thumbImage[i38].getImageX2(), this.thumbImage[i38].getImageY2());
                                                    canvas3.drawRoundRect(rectF7, this.thumbImage[i38].getRoundRadius()[c], this.thumbImage[i38].getRoundRadius()[i6], this.thumbBackgroundPaint);
                                                    this.thumbImage[i38].draw(canvas3);
                                                    if (this.drawSpoiler[i38]) {
                                                        Path path = this.thumbPath;
                                                        if (path == null) {
                                                            this.thumbPath = new Path();
                                                        } else {
                                                            path.rewind();
                                                        }
                                                        this.thumbPath.addRoundRect(rectF7, this.thumbImage[i38].getRoundRadius()[c], this.thumbImage[i38].getRoundRadius()[i6], Path.Direction.CW);
                                                        canvas.save();
                                                        canvas3.clipPath(this.thumbPath);
                                                        if (this.thumbSpoiler == null) {
                                                            this.thumbSpoiler = new SpoilerEffect();
                                                        }
                                                        this.thumbSpoiler.setColor(ColorUtils.setAlphaComponent(-1, (int) (Color.alpha(i11) * 0.325f)));
                                                        this.thumbSpoiler.setBounds((int) this.thumbImage[i38].getImageX(), (int) this.thumbImage[i38].getImageY(), (int) this.thumbImage[i38].getImageX2(), (int) this.thumbImage[i38].getImageY2());
                                                        this.thumbSpoiler.draw(canvas3);
                                                        invalidate();
                                                        canvas.restore();
                                                    }
                                                    if (this.drawPlay[i38]) {
                                                        BaseCell.setDrawableBounds(Theme.dialogs_playDrawable, (int) (this.thumbImage[i38].getCenterX() - (Theme.dialogs_playDrawable.getIntrinsicWidth() / 2)), (int) (this.thumbImage[i38].getCenterY() - (Theme.dialogs_playDrawable.getIntrinsicHeight() / 2)));
                                                        Theme.dialogs_playDrawable.draw(canvas3);
                                                    }
                                                }
                                                i38 += i6;
                                                i11 = -1;
                                            }
                                            i15 = -1;
                                            z11 = false;
                                            z11 = false;
                                            if (this.updateHelper.typingProgres > f7) {
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
                            Canvas canvas62 = canvas;
                            drawCounter(canvas, z10, this.countTop, this.countLeft, this.countLeftOld, 1.0f, false);
                            if (this.drawMention) {
                            }
                            if (!this.drawReactionMention) {
                            }
                            Theme.dialogs_reactionsCountPaint.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                            this.rect.set(this.reactionMentionLeft - AndroidUtilities.dp(5.5f), this.countTop, r0 + AndroidUtilities.dp(23.0f), this.countTop + AndroidUtilities.dp(23.0f));
                            Paint paint92 = Theme.dialogs_reactionsCountPaint;
                            canvas.save();
                            f14 = this.reactionsMentionsChangeProgress;
                            if (f14 != f6) {
                            }
                            RectF rectF62 = this.rect;
                            float f332 = AndroidUtilities.density * 11.5f;
                            canvas62.drawRoundRect(rectF62, f332, f332, paint92);
                            Theme.dialogs_reactionsMentionDrawable.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                            BaseCell.setDrawableBounds(Theme.dialogs_reactionsMentionDrawable, this.reactionMentionLeft - AndroidUtilities.dp(2.0f), this.countTop + AndroidUtilities.dp(3.8f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                            Theme.dialogs_reactionsMentionDrawable.draw(canvas62);
                            canvas.restore();
                            canvas3 = canvas62;
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
                            if (this.openBot) {
                                canvas.save();
                                float scale = this.openButtonBounce.getScale(0.05f);
                                canvas.scale(scale, scale, this.openButtonRect.centerX(), this.openButtonRect.centerY());
                                this.openButtonBackgroundPaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                                RectF rectF8 = this.openButtonRect;
                                canvas.drawRoundRect(rectF8, rectF8.height() / 2.0f, this.openButtonRect.height() / 2.0f, this.openButtonBackgroundPaint);
                                Text text = this.openButtonText;
                                if (text != null) {
                                    text.draw(canvas, this.openButtonRect.left + AndroidUtilities.dp(13.0f), this.openButtonRect.centerY(), Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider), 1.0f);
                                }
                                canvas.restore();
                            } else if (getIsPinned()) {
                                Theme.dialogs_pinnedDrawable.setAlpha((int) ((f6 - this.reorderIconProgress) * 255.0f));
                                BaseCell.setDrawableBounds(Theme.dialogs_pinnedDrawable, this.pinLeft, this.pinTop);
                                drawable2 = Theme.dialogs_pinnedDrawable;
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
                        }
                        drawable2.draw(canvas);
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
                    }
                    drawable.draw(canvas);
                    if (!this.drawReorder) {
                    }
                    Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                    Theme.dialogs_reorderDrawable.draw(canvas);
                    if (!this.drawError) {
                    }
                    drawable2.draw(canvas);
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
                    if (z22) {
                        float f35 = this.dialogMutedProgress;
                        if (f35 != f6) {
                            float f36 = f35 + 0.10666667f;
                            this.dialogMutedProgress = f36;
                            if (f36 > f6) {
                                this.dialogMutedProgress = f6;
                                float dp11 = this.nameMuteLeft - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                                float dp12 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                                if (((!this.useForceThreeLines && !SharedConfig.useThreeLinesLayout) || isForumCell()) && hasTags()) {
                                    dp12 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                                }
                                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp11, dp12);
                                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp11, dp12);
                                if (this.dialogMutedProgress == f6) {
                                    canvas.save();
                                    float f37 = this.dialogMutedProgress;
                                    canvas.scale(f37, f37, Theme.dialogs_muteDrawable.getBounds().centerX(), Theme.dialogs_muteDrawable.getBounds().centerY());
                                    if (this.drawUnmute) {
                                        Theme.dialogs_unmuteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                        Theme.dialogs_unmuteDrawable.draw(canvas);
                                        drawable3 = Theme.dialogs_unmuteDrawable;
                                        i17 = NotificationCenter.proxyCheckDone;
                                    } else {
                                        i17 = NotificationCenter.proxyCheckDone;
                                        Theme.dialogs_muteDrawable.setAlpha((int) (this.dialogMutedProgress * 255.0f));
                                        Theme.dialogs_muteDrawable.draw(canvas);
                                        drawable3 = Theme.dialogs_muteDrawable;
                                    }
                                    drawable3.setAlpha(i17);
                                    canvas.restore();
                                    if (!this.drawReorder) {
                                    }
                                    Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                    Theme.dialogs_reorderDrawable.draw(canvas);
                                    if (!this.drawError) {
                                    }
                                    drawable2.draw(canvas);
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
                                    drawable = this.drawUnmute ? Theme.dialogs_unmuteDrawable : Theme.dialogs_muteDrawable;
                                    drawable.draw(canvas);
                                    if (!this.drawReorder) {
                                    }
                                    Theme.dialogs_reorderDrawable.setAlpha((int) (this.reorderIconProgress * 255.0f));
                                    BaseCell.setDrawableBounds(Theme.dialogs_reorderDrawable, this.pinLeft, this.pinTop);
                                    Theme.dialogs_reorderDrawable.draw(canvas);
                                    if (!this.drawError) {
                                    }
                                    drawable2.draw(canvas);
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
                                }
                            }
                            invalidate();
                            float dp112 = this.nameMuteLeft - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                            float dp122 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                            if (!this.useForceThreeLines) {
                                dp122 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                                BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp112, dp122);
                                BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp112, dp122);
                                if (this.dialogMutedProgress == f6) {
                                }
                            }
                            dp122 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                            BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp112, dp122);
                            BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp112, dp122);
                            if (this.dialogMutedProgress == f6) {
                            }
                        }
                    }
                    if (!z22) {
                        float f38 = this.dialogMutedProgress;
                        if (f38 != f7) {
                            float f39 = f38 - 0.10666667f;
                            this.dialogMutedProgress = f39;
                            if (f39 < f7) {
                                this.dialogMutedProgress = f7;
                            }
                            invalidate();
                        }
                    }
                    float dp1122 = this.nameMuteLeft - AndroidUtilities.dp((!this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? 0.0f : 1.0f);
                    float dp1222 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 13.5f : 17.5f);
                    if (!this.useForceThreeLines) {
                    }
                    dp1222 -= AndroidUtilities.dp(isForumCell() ? 8.0f : 9.0f);
                    BaseCell.setDrawableBounds(Theme.dialogs_muteDrawable, dp1122, dp1222);
                    BaseCell.setDrawableBounds(Theme.dialogs_unmuteDrawable, dp1122, dp1222);
                    if (this.dialogMutedProgress == f6) {
                    }
                }
            } else {
                canvas2 = canvas;
                r10 = 0;
                i6 = 1;
                f6 = 1.0f;
                f7 = 0.0f;
                z3 = false;
            }
            if (this.animatingArchiveAvatar) {
                f8 = 170.0f;
            } else {
                canvas.save();
                f8 = 170.0f;
                float interpolation2 = this.interpolator.getInterpolation(this.animatingArchiveAvatarProgress / 170.0f) + f6;
                canvas2.scale(interpolation2, interpolation2, this.avatarImage.getCenterX(), this.avatarImage.getCenterY());
            }
            if (this.drawAvatar && (!this.isTopic || (tL_forumTopic2 = this.forumTopic) == null || tL_forumTopic2.id != i6 || (pullForegroundDrawable = this.archivedChatsDrawable) == null || !pullForegroundDrawable.isDraw())) {
                StoriesUtilities.AvatarStoryParams avatarStoryParams = this.storyParams;
                avatarStoryParams.drawHiddenStoriesAsSegments = this.currentDialogFolderId == 0;
                StoriesUtilities.drawAvatarWithStory(this.currentDialogId, canvas2, this.avatarImage, avatarStoryParams);
            }
            if (this.animatingArchiveAvatar) {
                canvas.restore();
            }
            boolean z23 = (this.avatarImage.getVisible() || !drawAvatarOverlays(canvas)) ? z3 : true;
            if (this.rightFragmentOpenedProgress > f7 && this.currentDialogFolderId == 0) {
                if (this.isTopic) {
                    TLRPC.Chat chat2 = this.chat;
                    if (chat2 != null && chat2.forum && this.forumTopic == null) {
                        z7 = !this.hasUnmutedTopics;
                        RectF rectF9 = this.storyParams.originalAvatarRect;
                        int width = (int) (((rectF9.left + rectF9.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
                        RectF rectF10 = this.storyParams.originalAvatarRect;
                        drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width, (int) (((rectF10.left + rectF10.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
                    } else {
                        z6 = this.dialogMuted;
                    }
                } else {
                    z6 = this.topicMuted;
                }
                z7 = z6;
                RectF rectF92 = this.storyParams.originalAvatarRect;
                int width2 = (int) (((rectF92.left + rectF92.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
                RectF rectF102 = this.storyParams.originalAvatarRect;
                drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width2, (int) (((rectF102.left + rectF102.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
            }
            if (this.collapseOffset != f7) {
                canvas.restore();
            }
            if (this.translationX != f7) {
                canvas.restore();
            }
            if (this.drawArchive && ((this.currentDialogFolderId != 0 || (this.isTopic && (tL_forumTopic = this.forumTopic) != null && tL_forumTopic.id == i6)) && this.translationX == f7 && this.archivedChatsDrawable != null)) {
                canvas.save();
                canvas2.translate(f7, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
                canvas2.clipRect((int) r10, (int) r10, getMeasuredWidth(), getMeasuredHeight());
                this.archivedChatsDrawable.draw(canvas2);
                canvas.restore();
            }
            if (this.useSeparator) {
                int dp13 = (this.fullSeparator || !(this.currentDialogFolderId == 0 || !this.archiveHidden || this.fullSeparator2) || (this.fullSeparator2 && !this.archiveHidden)) ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
                if (this.rightFragmentOpenedProgress != f6) {
                    int alpha4 = Theme.dividerPaint.getAlpha();
                    float f40 = this.rightFragmentOpenedProgress;
                    if (f40 != f7) {
                        Theme.dividerPaint.setAlpha((int) (alpha4 * (f6 - f40)));
                    }
                    float measuredHeight3 = (getMeasuredHeight() - i6) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress);
                    if (LocaleController.isRTL) {
                        measuredWidth = getMeasuredWidth() - dp13;
                        paint2 = Theme.dividerPaint;
                        f9 = 0.0f;
                    } else {
                        f9 = dp13;
                        measuredWidth = getMeasuredWidth();
                        paint2 = Theme.dividerPaint;
                    }
                    canvas.drawLine(f9, measuredHeight3, measuredWidth, measuredHeight3, paint2);
                    if (this.rightFragmentOpenedProgress != f7) {
                        Theme.dividerPaint.setAlpha(alpha4);
                    }
                }
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
            z4 = this.drawReorder;
            if (!z4 || this.reorderIconProgress != f7) {
                if (z4) {
                    float f41 = this.reorderIconProgress;
                    if (f41 > f7) {
                        float f42 = f41 - 0.09411765f;
                        this.reorderIconProgress = f42;
                        if (f42 < f7) {
                            this.reorderIconProgress = f7;
                        }
                        z5 = true;
                    }
                } else {
                    float f43 = this.reorderIconProgress;
                    if (f43 < f6) {
                        float f44 = f43 + 0.09411765f;
                        this.reorderIconProgress = f44;
                        if (f44 > f6) {
                            this.reorderIconProgress = f6;
                        }
                        z5 = true;
                    }
                }
                if (this.archiveHidden) {
                    float f45 = this.archiveBackgroundProgress;
                    if (f45 > f7) {
                        float f46 = f45 - 0.069565214f;
                        this.archiveBackgroundProgress = f46;
                        if (f46 < f7) {
                            this.archiveBackgroundProgress = f7;
                        }
                    }
                    if (this.animatingArchiveAvatar) {
                        float f47 = this.animatingArchiveAvatarProgress + 16.0f;
                        this.animatingArchiveAvatarProgress = f47;
                        if (f47 >= f8) {
                            this.animatingArchiveAvatarProgress = f8;
                            this.animatingArchiveAvatar = r10;
                        }
                        z5 = true;
                    }
                    if (this.drawRevealBackground) {
                        float f48 = this.currentRevealBounceProgress;
                        if (f48 < f6) {
                            float f49 = f48 + 0.09411765f;
                            this.currentRevealBounceProgress = f49;
                            if (f49 > f6) {
                                this.currentRevealBounceProgress = f6;
                                z5 = true;
                            }
                        }
                        float f50 = this.currentRevealProgress;
                        if (f50 < f6) {
                            float f51 = f50 + 0.053333335f;
                            this.currentRevealProgress = f51;
                            if (f51 > f6) {
                                this.currentRevealProgress = f6;
                            }
                            z5 = true;
                        }
                        if (z5) {
                            return;
                        }
                        invalidate();
                        return;
                    }
                    if (this.currentRevealBounceProgress == f6) {
                        this.currentRevealBounceProgress = f7;
                        z5 = true;
                    }
                    float f52 = this.currentRevealProgress;
                    if (f52 > f7) {
                        float f53 = f52 - 0.053333335f;
                        this.currentRevealProgress = f53;
                        if (f53 < f7) {
                            this.currentRevealProgress = f7;
                        }
                        z5 = true;
                    }
                    if (z5) {
                    }
                } else {
                    float f54 = this.archiveBackgroundProgress;
                    if (f54 < f6) {
                        float f55 = f54 + 0.069565214f;
                        this.archiveBackgroundProgress = f55;
                        if (f55 > f6) {
                            this.archiveBackgroundProgress = f6;
                        }
                    }
                    if (this.animatingArchiveAvatar) {
                    }
                    if (this.drawRevealBackground) {
                    }
                }
                z5 = true;
                if (this.animatingArchiveAvatar) {
                }
                if (this.drawRevealBackground) {
                }
            }
            z5 = z23;
            if (this.archiveHidden) {
            }
            z5 = true;
            if (this.animatingArchiveAvatar) {
            }
            if (this.drawRevealBackground) {
            }
        }
        paint.setColor(color3);
        Theme.dialogs_pinnedPaint.setAlpha((int) (r1.getAlpha() * (1.0f - this.rightFragmentOpenedProgress)));
        i5 = 0;
        canvas.drawRect(-this.xOffset, 0.0f, getMeasuredWidth(), getMeasuredHeight() - this.translateY, Theme.dialogs_pinnedPaint);
        canvas.restore();
        this.updateHelper.updateAnimationValues();
        if (this.collapseOffset != 0.0f) {
        }
        f5 = this.rightFragmentOpenedProgress;
        if (f5 == 1.0f) {
        }
        if (this.animatingArchiveAvatar) {
        }
        if (this.drawAvatar) {
            StoriesUtilities.AvatarStoryParams avatarStoryParams2 = this.storyParams;
            avatarStoryParams2.drawHiddenStoriesAsSegments = this.currentDialogFolderId == 0;
            StoriesUtilities.drawAvatarWithStory(this.currentDialogId, canvas2, this.avatarImage, avatarStoryParams2);
        }
        if (this.animatingArchiveAvatar) {
        }
        if (this.avatarImage.getVisible()) {
        }
        if (this.rightFragmentOpenedProgress > f7) {
            if (this.isTopic) {
            }
            z7 = z6;
            RectF rectF922 = this.storyParams.originalAvatarRect;
            int width22 = (int) (((rectF922.left + rectF922.width()) - this.countWidth) - AndroidUtilities.dp(5.0f));
            RectF rectF1022 = this.storyParams.originalAvatarRect;
            drawCounter(canvas, z7, (int) ((this.avatarImage.getImageY() + this.storyParams.originalAvatarRect.height()) - AndroidUtilities.dp(22.0f)), width22, (int) (((rectF1022.left + rectF1022.width()) - this.countWidthOld) - AndroidUtilities.dp(5.0f)), this.rightFragmentOpenedProgress, true);
        }
        if (this.collapseOffset != f7) {
        }
        if (this.translationX != f7) {
        }
        if (this.drawArchive) {
            canvas.save();
            canvas2.translate(f7, (-this.translateY) - (this.rightFragmentOffset * this.rightFragmentOpenedProgress));
            canvas2.clipRect((int) r10, (int) r10, getMeasuredWidth(), getMeasuredHeight());
            this.archivedChatsDrawable.draw(canvas2);
            canvas.restore();
        }
        if (this.useSeparator) {
        }
        if (this.clipProgress != f7) {
        }
        z4 = this.drawReorder;
        if (!z4) {
        }
        if (z4) {
        }
        if (this.archiveHidden) {
        }
        z5 = true;
        if (this.animatingArchiveAvatar) {
        }
        if (this.drawRevealBackground) {
        }
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
            if (!isFolderCell() && this.parentFragment != null && Build.VERSION.SDK_INT >= 21) {
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

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.rightFragmentOpenedProgress == 0.0f && !this.isTopic && this.storyParams.checkOnTouchEvent(motionEvent, this)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
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

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        if (this.isTopic) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) ? this.heightThreeLines : this.heightDefault) + ((!hasTags() || ((this.useForceThreeLines || SharedConfig.useThreeLinesLayout) && !isForumCell())) ? 0 : isForumCell() ? this.addForumHeightForTags : this.addHeightForTags)) + (this.useSeparator ? 1 : 0));
            checkTwoLinesForName();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), computeHeight());
        this.topClip = 0;
        this.bottomClip = getMeasuredHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String str;
        int i;
        int i2;
        int i3;
        MessageObject messageObject;
        int i4;
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb = new StringBuilder();
        if (this.currentDialogFolderId == 1) {
            str = LocaleController.getString(R.string.ArchivedChats);
        } else {
            if (this.encryptedChat != null) {
                sb.append(LocaleController.getString(R.string.AccDescrSecretChat));
                sb.append(". ");
            }
            if (!this.isTopic || this.forumTopic == null) {
                TLRPC.User user2 = this.user;
                if (user2 == null) {
                    TLRPC.Chat chat = this.chat;
                    if (chat != null) {
                        sb.append(LocaleController.getString(chat.broadcast ? R.string.AccDescrChannel : R.string.AccDescrGroup));
                        sb.append(". ");
                        str = this.chat.title;
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
                    i2 = this.unreadCount;
                    if (i2 > 0) {
                        sb.append(LocaleController.formatPluralString("NewMessages", i2, new Object[0]));
                        sb.append(". ");
                    }
                    i3 = this.mentionCount;
                    if (i3 > 0) {
                        sb.append(LocaleController.formatPluralString("AccDescrMentionCount", i3, new Object[0]));
                        sb.append(". ");
                    }
                    if (this.reactionMentionCount > 0) {
                        sb.append(LocaleController.getString(R.string.AccDescrMentionReaction));
                        sb.append(". ");
                    }
                    messageObject = this.message;
                    if (messageObject != null && this.currentDialogFolderId == 0) {
                        i4 = this.lastMessageDate;
                        if (i4 == 0) {
                            i4 = messageObject.messageOwner.date;
                        }
                        String formatDateAudio = LocaleController.formatDateAudio(i4, true);
                        sb.append(!this.message.isOut() ? LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio) : LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
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
                    }
                    accessibilityEvent.setContentDescription(sb);
                    setContentDescription(sb);
                }
                if (UserObject.isReplyUser(user2)) {
                    i = R.string.RepliesTitle;
                } else if (UserObject.isAnonymous(this.user)) {
                    i = R.string.AnonymousForward;
                } else {
                    if (this.user.bot) {
                        sb.append(LocaleController.getString(R.string.Bot));
                        sb.append(". ");
                    }
                    TLRPC.User user3 = this.user;
                    if (user3.self) {
                        i = R.string.SavedMessages;
                    } else {
                        str = ContactsController.formatName(user3.first_name, user3.last_name);
                    }
                }
                str = LocaleController.getString(i);
            } else {
                sb.append(LocaleController.getString(R.string.AccDescrTopic));
                sb.append(". ");
                str = this.forumTopic.title;
            }
        }
        sb.append(str);
        sb.append(". ");
        if (this.drawVerified) {
        }
        if (this.dialogMuted) {
        }
        if (isOnline()) {
        }
        i2 = this.unreadCount;
        if (i2 > 0) {
        }
        i3 = this.mentionCount;
        if (i3 > 0) {
        }
        if (this.reactionMentionCount > 0) {
        }
        messageObject = this.message;
        if (messageObject != null) {
            i4 = this.lastMessageDate;
            if (i4 == 0) {
            }
            String formatDateAudio2 = LocaleController.formatDateAudio(i4, true);
            sb.append(!this.message.isOut() ? LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio2) : LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio2));
            sb.append(". ");
            if (this.chat != null) {
                sb.append(ContactsController.formatName(user.first_name, user.last_name));
                sb.append(". ");
            }
            if (this.encryptedChat == null) {
            }
        }
        accessibilityEvent.setContentDescription(sb);
        setContentDescription(sb);
    }

    public void onReorderStateChanged(boolean z, boolean z2) {
        if ((getIsPinned() || !z) && this.drawReorder != z) {
            this.drawReorder = z;
            this.reorderIconProgress = (!z2 ? z : !z) ? 0.0f : 1.0f;
            invalidate();
        } else {
            if (getIsPinned()) {
                return;
            }
            this.drawReorder = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r6.getAction() == 3) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CanvasButton canvasButton;
        int i;
        if (this.rightFragmentOpenedProgress == 0.0f && !this.isTopic && this.storyParams.checkOnTouchEvent(motionEvent, this)) {
            return true;
        }
        DialogCellDelegate dialogCellDelegate = this.delegate;
        if (dialogCellDelegate == null || dialogCellDelegate.canClickButtonInside()) {
            if (this.openBot) {
                boolean contains = this.openButtonRect.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                    if (this.openButtonBounce.isPressed() && motionEvent.getAction() == 1) {
                        Utilities.Callback callback = this.onOpenButtonClick;
                        if (callback != null) {
                            callback.run(this.user);
                        }
                    } else if (this.openButtonBounce.isPressed()) {
                    }
                    this.openButtonBounce.setPressed(false);
                    return true;
                }
                this.openButtonBounce.setPressed(contains);
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

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        DialogsActivity dialogsActivity;
        if (i != R.id.acc_action_chat_preview || (dialogsActivity = this.parentFragment) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        dialogsActivity.showChatPreview(this);
        return true;
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

    public void setArchivedPullAnimation(PullForegroundDrawable pullForegroundDrawable) {
        this.archivedChatsDrawable = pullForegroundDrawable;
    }

    public void setBottomClip(int i) {
        this.bottomClip = i;
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

    public void setClipProgress(float f) {
        this.clipProgress = f;
        invalidate();
    }

    public void setCustomMessage(String str) {
        if (TextUtils.equals(this.customMessage, str)) {
            return;
        }
        this.customMessage = str;
        buildLayout();
        requestLayout();
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

    public void setDialogCellDelegate(DialogCellDelegate dialogCellDelegate) {
        this.delegate = dialogCellDelegate;
    }

    public void setDialogSelected(boolean z) {
        if (this.isSelected != z) {
            invalidate();
        }
        this.isSelected = z;
    }

    public void setForumTopic(TLRPC.TL_forumTopic tL_forumTopic, long j, MessageObject messageObject, boolean z, boolean z2) {
        PullForegroundDrawable pullForegroundDrawable;
        this.forumTopic = tL_forumTopic;
        this.isTopic = tL_forumTopic != null;
        if (this.currentDialogId != j) {
            this.lastStatusDrawableParams = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof ForumBubbleDrawable) {
            ((ForumBubbleDrawable) drawable).setColor(tL_forumTopic.icon_color);
        }
        this.currentDialogId = j;
        this.lastDialogChangedTime = System.currentTimeMillis();
        this.message = messageObject;
        this.isDialogCell = false;
        this.showTopicIconInName = z;
        TLRPC.Message message = messageObject.messageOwner;
        this.lastMessageDate = message.date;
        this.currentEditDate = message.edit_date;
        this.markUnread = false;
        this.messageId = messageObject.getId();
        this.lastUnreadState = messageObject.isUnread();
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

    public void setIsTransitionSupport(boolean z) {
        this.isTransitionSupport = z;
    }

    public void setMoving(boolean z) {
        this.moving = z;
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

    public void setPinForced(boolean z) {
        this.drawPinForced = z;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            buildLayout();
        }
        invalidate();
    }

    public void setPreloader(DialogsAdapter.DialogsPreloader dialogsPreloader) {
        this.preloader = dialogsPreloader;
    }

    public void setRightFragmentOpenedProgress(float f) {
        if (this.rightFragmentOpenedProgress != f) {
            this.rightFragmentOpenedProgress = f;
            invalidate();
        }
    }

    public void setSharedResources(SharedResources sharedResources) {
    }

    public void setSliding(boolean z) {
        this.isSliding = z;
    }

    public void setTopClip(int i) {
        this.topClip = i;
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

    public void setVisible(boolean z) {
        if (this.visibleOnScreen == z) {
            return;
        }
        this.visibleOnScreen = z;
        if (z) {
            invalidate();
        }
    }

    public void showPremiumBlocked(boolean z) {
        Runnable listen;
        Runnable runnable = this.unsubscribePremiumBlocked;
        if (z != (runnable != null)) {
            if (!z && runnable != null) {
                runnable.run();
                listen = null;
            } else if (!z) {
                return;
            } else {
                listen = NotificationCenter.getInstance(this.currentAccount).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new Utilities.Callback() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        DialogCell.this.lambda$showPremiumBlocked$5((Object[]) obj);
                    }
                });
            }
            this.unsubscribePremiumBlocked = listen;
        }
    }

    public void startOutAnimation() {
        PullForegroundDrawable pullForegroundDrawable;
        float bitmapWidth;
        PullForegroundDrawable pullForegroundDrawable2 = this.archivedChatsDrawable;
        if (pullForegroundDrawable2 != null) {
            if (this.isTopic) {
                pullForegroundDrawable2.outCy = AndroidUtilities.dp(24.0f);
                this.archivedChatsDrawable.outCx = AndroidUtilities.dp(24.0f);
                pullForegroundDrawable = this.archivedChatsDrawable;
                bitmapWidth = 0.0f;
                pullForegroundDrawable.outRadius = 0.0f;
            } else {
                pullForegroundDrawable2.outCy = this.storyParams.originalAvatarRect.centerY();
                this.archivedChatsDrawable.outCx = this.storyParams.originalAvatarRect.centerX();
                this.archivedChatsDrawable.outRadius = this.storyParams.originalAvatarRect.width() / 2.0f;
                if (MessagesController.getInstance(this.currentAccount).getStoriesController().hasHiddenStories()) {
                    this.archivedChatsDrawable.outRadius -= AndroidUtilities.dpf2(3.5f);
                }
                pullForegroundDrawable = this.archivedChatsDrawable;
                bitmapWidth = this.avatarImage.getBitmapWidth();
            }
            pullForegroundDrawable.outImageSize = bitmapWidth;
            this.archivedChatsDrawable.startOutAnimation();
        }
    }

    public boolean update(int i) {
        return update(i, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x015d, code lost:
    
        if (r8.pinned != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017b, code lost:
    
        if (r6.pinnedDialogs.indexOfKey(r8.id) >= 0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0493  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean update(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        ImageReceiver imageReceiver;
        TLObject tLObject;
        AvatarDrawable avatarDrawable;
        int i2;
        MessageObject messageObject;
        boolean z6;
        boolean z7;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        TimeInterpolator timeInterpolator;
        ValueAnimator valueAnimator2;
        TimeInterpolator overshootInterpolator;
        boolean z8;
        boolean z9;
        int i3;
        TLRPC.Chat chat;
        MessagesController messagesController;
        boolean z10;
        MessageObject messageObject2;
        int i4;
        int i5;
        int i6;
        MessageObject messageObject3;
        long j2;
        boolean z11;
        boolean isForumCell = isForumCell();
        boolean z12 = false;
        this.drawAvatarSelector = false;
        this.ttlPeriod = 0;
        CustomDialog customDialog = this.customDialog;
        if (customDialog != null) {
            this.lastMessageDate = customDialog.date;
            int i7 = customDialog.unread_count;
            this.lastUnreadState = i7 != 0;
            this.unreadCount = i7;
            this.drawPin = customDialog.pinned;
            this.dialogMuted = customDialog.muted;
            this.hasUnmutedTopics = false;
            this.avatarDrawable.setInfo(customDialog.id, customDialog.name, null);
            this.avatarImage.setImage(null, "50_50", this.avatarDrawable, null, 0L);
            int i8 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = this.thumbImage;
                if (i8 >= imageReceiverArr.length) {
                    break;
                }
                imageReceiverArr[i8].setImageBitmap((Drawable) null);
                i8++;
            }
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(28.0f));
            this.drawUnmute = false;
            z2 = isForumCell;
            z6 = false;
            z7 = false;
        } else {
            int i9 = this.unreadCount;
            boolean z13 = this.reactionMentionCount != 0;
            boolean z14 = this.markUnread;
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
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                        if (chat2 != null && chat2.forum) {
                            int[] forumUnreadCount = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat2.id);
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
                        this.markUnread = dialog.unread_mark;
                        MessageObject messageObject5 = this.message;
                        this.currentEditDate = messageObject5 != null ? messageObject5.messageOwner.edit_date : 0;
                        this.lastMessageDate = dialog.last_message_date;
                        int i10 = this.dialogsType;
                        if (i10 == 7 || i10 == 8) {
                            MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType == 8 ? (char) 1 : (char) 0];
                            if (dialogFilter != null) {
                            }
                            z11 = false;
                        } else {
                            if (this.currentDialogFolderId == 0) {
                            }
                            z11 = false;
                        }
                        this.drawPin = z11;
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
                    if (i != 0) {
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
                                if (user3 == null || DialogObject.getEmojiStatusDocumentId(user3.emoji_status) == 0) {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                    this.emojiStatus.setParticles(false, z);
                                } else {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.user.emoji_status), z);
                                    this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.user.emoji_status), z);
                                }
                                j2 = DialogObject.getBotVerificationIcon(this.user);
                                z5 = true;
                            } else {
                                j2 = 0;
                            }
                            if (this.chat != null) {
                                TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                                this.chat = chat3;
                                if (chat3 == null || DialogObject.getEmojiStatusDocumentId(chat3.emoji_status) == 0) {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(PremiumGradient.getInstance().premiumStarDrawableMini, z);
                                    this.emojiStatus.setParticles(false, z);
                                } else {
                                    this.nameLayoutEllipsizeByGradient = true;
                                    this.emojiStatus.set(DialogObject.getEmojiStatusDocumentId(this.chat.emoji_status), z);
                                    this.emojiStatus.setParticles(DialogObject.isEmojiStatusCollectible(this.chat.emoji_status), z);
                                }
                                j2 = DialogObject.getBotVerificationIcon(this.chat);
                                z5 = true;
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
                            TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.id));
                            if ((chat4 != null && chat4.call_active && chat4.call_not_empty) != this.hasCall) {
                                z10 = true;
                            }
                        }
                        if (!z10 && (i & MessagesController.UPDATE_MASK_AVATAR) != 0 && this.chat == null) {
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
                                TLRPC.Chat chat5 = dialog2 == null ? null : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog2.id));
                                if (chat5 == null || !chat5.forum) {
                                    if (dialog2 instanceof TLRPC.TL_dialogFolder) {
                                        i5 = MessagesStorage.getInstance(this.currentAccount).getArchiveUnreadCount();
                                        i4 = 0;
                                    } else if (dialog2 != null) {
                                        i5 = dialog2.unread_count;
                                        i6 = dialog2.unread_mentions_count;
                                        i4 = dialog2.unread_reactions_count;
                                    } else {
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    i6 = 0;
                                } else {
                                    int[] forumUnreadCount2 = MessagesController.getInstance(this.currentAccount).getTopicsController().getForumUnreadCount(chat5.id);
                                    i5 = forumUnreadCount2[0];
                                    i6 = forumUnreadCount2[1];
                                    int i11 = forumUnreadCount2[2];
                                    this.hasUnmutedTopics = forumUnreadCount2[3] != 0;
                                    i4 = i11;
                                }
                                if (dialog2 != null && (this.unreadCount != i5 || this.markUnread != dialog2.unread_mark || this.mentionCount != i6 || this.reactionMentionCount != i4)) {
                                    this.unreadCount = i5;
                                    this.mentionCount = i6;
                                    this.markUnread = dialog2.unread_mark;
                                    this.reactionMentionCount = i4;
                                    z10 = true;
                                }
                            }
                        }
                        if (!z10 && (i & MessagesController.UPDATE_MASK_SEND_STATE) != 0 && (messageObject2 = this.message) != null) {
                            int i12 = this.lastSendState;
                            int i13 = messageObject2.messageOwner.send_state;
                            if (i12 != i13) {
                                this.lastSendState = i13;
                                z10 = true;
                            }
                        }
                        if (!z10) {
                            invalidate();
                            return z3;
                        }
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
                                messagesController = MessagesController.getInstance(this.currentAccount);
                                j = this.encryptedChat.user_id;
                                this.user = messagesController.getUser(Long.valueOf(j));
                            }
                            if (this.useMeForMyMessages && this.user != null && this.message.isOutOwner()) {
                                this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
                            }
                        } else if (DialogObject.isUserDialog(j)) {
                            messagesController = MessagesController.getInstance(this.currentAccount);
                            this.user = messagesController.getUser(Long.valueOf(j));
                            if (this.useMeForMyMessages) {
                                this.user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
                            }
                        } else {
                            TLRPC.Chat chat6 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
                            this.chat = chat6;
                            if (!this.isDialogCell && chat6 != null && chat6.migrated_to != null && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chat.migrated_to.channel_id))) != null) {
                                this.chat = chat;
                            }
                            if (this.useMeForMyMessages) {
                            }
                        }
                    }
                    if (this.currentDialogFolderId == 0) {
                        Theme.dialogs_archiveAvatarDrawable.setCallback(this);
                        avatarDrawable = this.avatarDrawable;
                        i2 = 2;
                    } else {
                        if (!this.useFromUserAsAvatar || (messageObject = this.message) == null) {
                            TLRPC.User user4 = this.user;
                            if (user4 != null) {
                                this.avatarDrawable.setInfo(this.currentAccount, user4);
                                if (UserObject.isReplyUser(this.user)) {
                                    avatarDrawable = this.avatarDrawable;
                                    i2 = 12;
                                } else if (UserObject.isAnonymous(this.user)) {
                                    avatarDrawable = this.avatarDrawable;
                                    i2 = 21;
                                } else if (UserObject.isUserSelf(this.user) && this.isSavedDialog) {
                                    avatarDrawable = this.avatarDrawable;
                                    i2 = 22;
                                } else if (!UserObject.isUserSelf(this.user) || this.useMeForMyMessages) {
                                    this.avatarImage.setForUserOrChat(this.user, this.avatarDrawable, null, true, 1, false);
                                } else {
                                    avatarDrawable = this.avatarDrawable;
                                    i2 = 1;
                                }
                            } else {
                                TLRPC.Chat chat7 = this.chat;
                                if (chat7 != null) {
                                    this.avatarDrawable.setInfo(this.currentAccount, chat7);
                                    imageReceiver = this.avatarImage;
                                    tLObject = this.chat;
                                }
                            }
                            if (z || ((i9 == this.unreadCount && z14 == this.markUnread) || (this.isDialogCell && System.currentTimeMillis() - this.lastDialogChangedTime <= 100))) {
                                z6 = z3;
                                z7 = z4;
                            } else {
                                ValueAnimator valueAnimator3 = this.countAnimator;
                                if (valueAnimator3 != null) {
                                    valueAnimator3.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                this.countAnimator = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda0
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                                        DialogCell.this.lambda$update$0(valueAnimator4);
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
                                if ((i9 == 0 || this.markUnread) && (this.markUnread || !z14)) {
                                    this.countAnimator.setDuration(220L);
                                    valueAnimator2 = this.countAnimator;
                                    overshootInterpolator = new OvershootInterpolator();
                                } else {
                                    if (this.unreadCount == 0) {
                                        this.countAnimator.setDuration(150L);
                                    } else {
                                        this.countAnimator.setDuration(430L);
                                    }
                                    valueAnimator2 = this.countAnimator;
                                    overshootInterpolator = CubicBezierInterpolator.DEFAULT;
                                }
                                valueAnimator2.setInterpolator(overshootInterpolator);
                                if (this.drawCount && this.drawCount2 && this.countLayout != null) {
                                    String format = String.format("%d", Integer.valueOf(i9));
                                    String format2 = String.format("%d", Integer.valueOf(this.unreadCount));
                                    if (format.length() == format2.length()) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(format2);
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(format2);
                                        int i14 = 0;
                                        while (i14 < format.length()) {
                                            if (format.charAt(i14) == format2.charAt(i14)) {
                                                z8 = z3;
                                                int i15 = i14 + 1;
                                                spannableStringBuilder.setSpan(new EmptyStubSpan(), i14, i15, 0);
                                                spannableStringBuilder2.setSpan(new EmptyStubSpan(), i14, i15, 0);
                                                z9 = z4;
                                                i3 = 1;
                                            } else {
                                                z8 = z3;
                                                z9 = z4;
                                                i3 = 1;
                                                spannableStringBuilder3.setSpan(new EmptyStubSpan(), i14, i14 + 1, 0);
                                            }
                                            i14 += i3;
                                            z3 = z8;
                                            z4 = z9;
                                        }
                                        z6 = z3;
                                        z7 = z4;
                                        int max = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(Theme.dialogs_countTextPaint.measureText(format)));
                                        TextPaint textPaint = Theme.dialogs_countTextPaint;
                                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                        this.countOldLayout = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                                        this.countAnimationStableLayout = new StaticLayout(spannableStringBuilder3, Theme.dialogs_countTextPaint, max, alignment, 1.0f, 0.0f, false);
                                        this.countAnimationInLayout = new StaticLayout(spannableStringBuilder2, Theme.dialogs_countTextPaint, max, alignment, 1.0f, 0.0f, false);
                                    } else {
                                        z6 = z3;
                                        z7 = z4;
                                        this.countOldLayout = this.countLayout;
                                    }
                                } else {
                                    z6 = z3;
                                    z7 = z4;
                                }
                                this.countWidthOld = this.countWidth;
                                this.countLeftOld = this.countLeft;
                                this.countAnimationIncrement = this.unreadCount > i9;
                                this.countAnimator.start();
                            }
                            boolean z15 = this.reactionMentionCount == 0;
                            if (!z && z15 != z13) {
                                ValueAnimator valueAnimator4 = this.reactionsMentionsAnimator;
                                if (valueAnimator4 != null) {
                                    valueAnimator4.cancel();
                                }
                                this.reactionsMentionsChangeProgress = 0.0f;
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                this.reactionsMentionsAnimator = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda1
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                                        DialogCell.this.lambda$update$1(valueAnimator5);
                                    }
                                });
                                this.reactionsMentionsAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Cells.DialogCell.4
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator) {
                                        DialogCell.this.reactionsMentionsChangeProgress = 1.0f;
                                        DialogCell.this.invalidate();
                                    }
                                });
                                ValueAnimator valueAnimator5 = this.reactionsMentionsAnimator;
                                if (z15) {
                                    valueAnimator5.setDuration(220L);
                                    valueAnimator = this.reactionsMentionsAnimator;
                                    timeInterpolator = new OvershootInterpolator();
                                } else {
                                    valueAnimator5.setDuration(150L);
                                    valueAnimator = this.reactionsMentionsAnimator;
                                    timeInterpolator = CubicBezierInterpolator.DEFAULT;
                                }
                                valueAnimator.setInterpolator(timeInterpolator);
                                this.reactionsMentionsAnimator.start();
                            }
                            ImageReceiver imageReceiver2 = this.avatarImage;
                            TLRPC.Chat chat8 = this.chat;
                            imageReceiver2.setRoundRadius(AndroidUtilities.dp((!(chat8 == null && chat8.forum && this.currentDialogFolderId == 0 && !this.useFromUserAsAvatar) && (this.isSavedDialog || (user = this.user) == null || !user.self || !MessagesController.getInstance(this.currentAccount).savedViewAsChats)) ? 28.0f : 16.0f));
                            z12 = z5;
                        } else {
                            this.avatarDrawable.setInfo(this.currentAccount, messageObject.getFromPeerObject());
                            imageReceiver = this.avatarImage;
                            tLObject = this.message.getFromPeerObject();
                        }
                        imageReceiver.setForUserOrChat(tLObject, this.avatarDrawable);
                        if (z) {
                        }
                        z6 = z3;
                        z7 = z4;
                        if (this.reactionMentionCount == 0) {
                        }
                        if (!z) {
                        }
                        ImageReceiver imageReceiver22 = this.avatarImage;
                        TLRPC.Chat chat82 = this.chat;
                        imageReceiver22.setRoundRadius(AndroidUtilities.dp((!(chat82 == null && chat82.forum && this.currentDialogFolderId == 0 && !this.useFromUserAsAvatar) && (this.isSavedDialog || (user = this.user) == null || !user.self || !MessagesController.getInstance(this.currentAccount).savedViewAsChats)) ? 28.0f : 16.0f));
                        z12 = z5;
                    }
                    avatarDrawable.setAvatarType(i2);
                    this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
                    if (z) {
                    }
                    z6 = z3;
                    z7 = z4;
                    if (this.reactionMentionCount == 0) {
                    }
                    if (!z) {
                    }
                    ImageReceiver imageReceiver222 = this.avatarImage;
                    TLRPC.Chat chat822 = this.chat;
                    imageReceiver222.setRoundRadius(AndroidUtilities.dp((!(chat822 == null && chat822.forum && this.currentDialogFolderId == 0 && !this.useFromUserAsAvatar) && (this.isSavedDialog || (user = this.user) == null || !user.self || !MessagesController.getInstance(this.currentAccount).savedViewAsChats)) ? 28.0f : 16.0f));
                    z12 = z5;
                }
            } else {
                z2 = isForumCell;
            }
            z3 = false;
            z4 = false;
            z5 = false;
            if (i != 0) {
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
            avatarDrawable.setAvatarType(i2);
            this.avatarImage.setImage(null, null, this.avatarDrawable, null, this.user, 0);
            if (z) {
            }
            z6 = z3;
            z7 = z4;
            if (this.reactionMentionCount == 0) {
            }
            if (!z) {
            }
            ImageReceiver imageReceiver2222 = this.avatarImage;
            TLRPC.Chat chat8222 = this.chat;
            imageReceiver2222.setRoundRadius(AndroidUtilities.dp((!(chat8222 == null && chat8222.forum && this.currentDialogFolderId == 0 && !this.useFromUserAsAvatar) && (this.isSavedDialog || (user = this.user) == null || !user.self || !MessagesController.getInstance(this.currentAccount).savedViewAsChats)) ? 28.0f : 16.0f));
            z12 = z5;
        }
        boolean z16 = (this.isTopic || (getMeasuredWidth() == 0 && getMeasuredHeight() == 0)) ? z7 : true;
        if (!z12) {
            int i16 = this.storyParams.currentState;
            StoriesUtilities.getPredictiveUnreadState(MessagesController.getInstance(this.currentAccount).getStoriesController(), getDialogId());
        }
        if (!z) {
            this.dialogMutedProgress = (this.dialogMuted || this.drawUnmute) ? 1.0f : 0.0f;
            ValueAnimator valueAnimator6 = this.countAnimator;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
            }
        }
        invalidate();
        if (isForumCell() != z2) {
            z6 = true;
        }
        if (z16) {
            if (this.attachedToWindow) {
                buildLayout();
            } else {
                this.updateLayout = true;
            }
        }
        updatePremiumBlocked(z);
        return z6;
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
                @Override // j$.util.function.ToIntFunction
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
}
