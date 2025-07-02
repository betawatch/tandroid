package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.ChannelAdminLogActivity;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TopicSeparator;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.UploadingDotsSpannable;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PreviewView;

/* loaded from: classes4.dex */
public class ChatActionCell extends BaseCell implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    private static Map monthsToEmoticon;
    private int TAG;
    private SpannableStringBuilder accessibilityText;
    private int adaptiveEmojiColor;
    private ColorFilter adaptiveEmojiColorFilter;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private boolean attachedToWindow;
    private AvatarDrawable avatarDrawable;
    StoriesUtilities.AvatarStoryParams avatarStoryParams;
    private int backgroundButtonTop;
    private int backgroundHeight;
    private int backgroundLeft;
    private Path backgroundPath;
    private RectF backgroundRect;
    private int backgroundRectHeight;
    private int backgroundRight;
    private ButtonBounce bounce;
    private boolean buttonClickableAsImage;
    private boolean canDrawInParent;
    private Path clipPath;
    private int currentAccount;
    private MessageObject currentMessageObject;
    private ImageLocation currentVideoLocation;
    private int customDate;
    private CharSequence customText;
    private ChatActionCellDelegate delegate;
    private float dimAmount;
    private final Paint dimPaint;
    public boolean firstInChat;
    private boolean forceWasUnread;
    private boolean giftButtonPressed;
    private RectF giftButtonRect;
    private TLRPC.VideoSize giftEffectAnimation;
    private int giftPremiumAdditionalHeight;
    private StaticLayout giftPremiumButtonLayout;
    private float giftPremiumButtonWidth;
    private Text giftPremiumReleasedText;
    private StaticLayout giftPremiumSubtitleLayout;
    private TextLayout giftPremiumText;
    private GradientClip giftPremiumTextClip;
    private boolean giftPremiumTextCollapsed;
    private int giftPremiumTextCollapsedHeight;
    private AnimatedFloat giftPremiumTextExpandedAnimated;
    private Text giftPremiumTextMore;
    private int giftPremiumTextMoreH;
    private int giftPremiumTextMoreX;
    private int giftPremiumTextMoreY;
    private boolean giftPremiumTextUncollapsed;
    private StaticLayout giftPremiumTitleLayout;
    private boolean giftRectEmpty;
    private int giftRectSize;
    private Paint giftReleasedBackgroundPaint;
    private CornerPathEffect giftRibbonPaintEffect;
    private ColorMatrixColorFilter giftRibbonPaintFilter;
    private boolean giftRibbonPaintFilterDark;
    private Path giftRibbonPath;
    private Text giftRibbonText;
    private TLRPC.Document giftSticker;
    private ImageReceiver.ImageReceiverDelegate giftStickerDelegate;
    private TextPaint giftSubtitlePaint;
    private TextPaint giftTextPaint;
    private TextPaint giftTitlePaint;
    private boolean hasReplyMessage;
    private boolean imagePressed;
    private ImageReceiver imageReceiver;
    private boolean invalidateColors;
    private Runnable invalidateListener;
    private boolean invalidatePath;
    private View invalidateWithParent;
    private boolean invalidatesParent;
    public boolean isAllChats;
    public boolean isForum;
    public boolean isMonoForum;
    public boolean isSideMenuEnabled;
    public boolean isSideMenued;
    private boolean isSpoilerRevealing;
    private float lastTouchX;
    private float lastTouchY;
    private ArrayList lineHeights;
    private ArrayList lineWidths;
    private LoadingDrawable loadingDrawable;
    private int overriddenMaxWidth;
    private int overrideBackground;
    private Paint overrideBackgroundPaint;
    private int overrideText;
    private TextPaint overrideTextPaint;
    private URLSpan pressedLink;
    private int previousWidth;
    float progressToProgress;
    RadialProgressView progressView;
    private RadialProgress2 radialProgress;
    public final ReactionsLayoutInBubble reactionsLayoutInBubble;
    private RectF rect;
    private View rippleView;
    private StaticLayout settingWallpaperLayout;
    TextPaint settingWallpaperPaint;
    private float settingWallpaperProgress;
    private StaticLayout settingWallpaperProgressTextLayout;
    public boolean showTopicSeparator;
    public float sideMenuAlpha;
    public int sideMenuWidth;
    private SpoilerEffect spoilerPressed;
    public List spoilers;
    private Stack spoilersPool;
    public final StarGiftUniqueActionLayout starGiftLayout;
    public float starGiftLayoutX;
    public float starGiftLayoutY;
    private StarParticlesView.Drawable starParticlesDrawable;
    private Path starsPath;
    private int starsSize;
    private int stickerSize;
    private int textHeight;
    private StaticLayout textLayout;
    TextPaint textPaint;
    private boolean textPressed;
    private int textWidth;
    private int textX;
    private int textXLeft;
    private int textY;
    private Theme.ResourcesProvider themeDelegate;
    private int titleHeight;
    private StaticLayout titleLayout;
    private int titleXLeft;
    public TopicSeparator topicSeparator;
    private int topicSeparatorTopPadding;
    public final TransitionParams transitionParams;
    private float viewTop;
    private float viewTranslationX;
    private boolean visiblePartSet;
    private Drawable wallpaperPreviewDrawable;
    private boolean wasLayout;

    public interface ChatActionCellDelegate {

        public abstract /* synthetic */ class -CC {
            public static boolean $default$canDrawOutboundsContent(ChatActionCellDelegate chatActionCellDelegate) {
                return true;
            }

            public static void $default$didClickButton(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }

            public static void $default$didClickImage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }

            public static boolean $default$didLongPress(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, float f, float f2) {
                return false;
            }

            public static void $default$didOpenPremiumGift(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z) {
            }

            public static void $default$didOpenPremiumGiftChannel(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, String str, boolean z) {
            }

            public static void $default$didPressReaction(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
            }

            public static void $default$didPressReplyMessage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, int i) {
            }

            public static void $default$didPressTaskLink(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, int i, int i2) {
            }

            public static void $default$forceUpdate(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, boolean z) {
            }

            public static BaseFragment $default$getBaseFragment(ChatActionCellDelegate chatActionCellDelegate) {
                return null;
            }

            public static long $default$getDialogId(ChatActionCellDelegate chatActionCellDelegate) {
                return 0L;
            }

            public static long $default$getTopicId(ChatActionCellDelegate chatActionCellDelegate) {
                return 0L;
            }

            public static void $default$needOpenInviteLink(ChatActionCellDelegate chatActionCellDelegate, TLRPC.TL_chatInviteExported tL_chatInviteExported) {
            }

            public static void $default$needOpenUserProfile(ChatActionCellDelegate chatActionCellDelegate, long j) {
            }

            public static void $default$needShowEffectOverlay(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize) {
            }

            public static void $default$onTopicClick(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }
        }

        boolean canDrawOutboundsContent();

        void didClickButton(ChatActionCell chatActionCell);

        void didClickImage(ChatActionCell chatActionCell);

        boolean didLongPress(ChatActionCell chatActionCell, float f, float f2);

        void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str, boolean z);

        void didOpenPremiumGiftChannel(ChatActionCell chatActionCell, String str, boolean z);

        void didPressReaction(ChatActionCell chatActionCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2);

        void didPressReplyMessage(ChatActionCell chatActionCell, int i);

        void didPressTaskLink(ChatActionCell chatActionCell, int i, int i2);

        void forceUpdate(ChatActionCell chatActionCell, boolean z);

        BaseFragment getBaseFragment();

        long getDialogId();

        long getTopicId();

        void needOpenInviteLink(TLRPC.TL_chatInviteExported tL_chatInviteExported);

        void needOpenUserProfile(long j);

        void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC.Document document, TLRPC.VideoSize videoSize);

        void onTopicClick(ChatActionCell chatActionCell);
    }

    class TextLayout {
        public AnimatedEmojiSpan.EmojiGroupedSpans emoji;
        public StaticLayout layout;
        public TextPaint paint;
        public int width;
        public float x;
        public float y;
        public List spoilers = new ArrayList();
        public final AtomicReference patchedLayout = new AtomicReference();

        TextLayout() {
        }

        public void attach() {
            this.emoji = AnimatedEmojiSpan.update(0, (View) ChatActionCell.this, false, this.emoji, this.layout);
        }

        public void detach() {
            AnimatedEmojiSpan.release(ChatActionCell.this, this.emoji);
        }

        public void setText(CharSequence charSequence, TextPaint textPaint, int i) {
            this.paint = textPaint;
            this.width = i;
            this.layout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
            if (ChatActionCell.this.currentMessageObject == null || !ChatActionCell.this.currentMessageObject.isSpoilersRevealed) {
                SpoilerEffect.addSpoilers(ChatActionCell.this, this.layout, -1, i, null, this.spoilers);
            } else {
                List list = this.spoilers;
                if (list != null) {
                    list.clear();
                }
            }
            attach();
        }
    }

    public interface ThemeDelegate extends Theme.ResourcesProvider {

        public abstract /* synthetic */ class -CC {
        }
    }

    public class TransitionParams {
        public boolean animateChange;
        public float animateChangeProgress = 1.0f;
        public boolean wasDraw;

        public TransitionParams() {
        }

        public boolean animateChange() {
            if (this.wasDraw) {
                return ChatActionCell.this.reactionsLayoutInBubble.animateChange();
            }
            return false;
        }

        public void onDetach() {
            this.wasDraw = false;
        }

        public void recordDrawingState() {
            this.wasDraw = true;
            ChatActionCell.this.reactionsLayoutInBubble.recordDrawingState();
        }

        public void resetAnimation() {
            this.animateChange = false;
            this.animateChangeProgress = 1.0f;
        }

        public boolean supportChangeAnimation() {
            return true;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        monthsToEmoticon = hashMap;
        hashMap.put(1, "1⃣");
        monthsToEmoticon.put(3, "2⃣");
        monthsToEmoticon.put(6, "3⃣");
        monthsToEmoticon.put(12, "4⃣");
        monthsToEmoticon.put(24, "5⃣");
    }

    public ChatActionCell(Context context) {
        this(context, false, null);
    }

    public ChatActionCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.bounce = new ButtonBounce(this);
        this.currentAccount = UserConfig.selectedAccount;
        this.avatarStoryParams = new StoriesUtilities.AvatarStoryParams(false);
        this.showTopicSeparator = true;
        this.giftButtonRect = new RectF();
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack();
        this.reactionsLayoutInBubble = new ReactionsLayoutInBubble(this);
        this.overrideBackground = -1;
        this.overrideText = -1;
        this.lineWidths = new ArrayList();
        this.lineHeights = new ArrayList();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.invalidatePath = true;
        this.invalidateColors = false;
        this.giftPremiumTextUncollapsed = false;
        this.giftPremiumTextCollapsed = false;
        this.giftPremiumTextExpandedAnimated = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.buttonClickableAsImage = true;
        this.giftTitlePaint = new TextPaint(1);
        this.giftTextPaint = new TextPaint(1);
        this.giftSubtitlePaint = new TextPaint(1);
        this.radialProgress = new RadialProgress2(this);
        this.giftStickerDelegate = new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda3
            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public final void didSetImage(ImageReceiver imageReceiver, boolean z2, boolean z3, boolean z4) {
                ChatActionCell.this.lambda$new$0(imageReceiver, z2, z3, z4);
            }

            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public /* synthetic */ void didSetImageBitmap(int i, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.-CC.$default$didSetImageBitmap(this, i, str, drawable);
            }

            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.-CC.$default$onAnimationReady(this, imageReceiver);
            }
        };
        this.starsPath = new Path();
        this.dimPaint = new Paint(1);
        this.transitionParams = new TransitionParams();
        this.avatarStoryParams.drawSegments = false;
        this.canDrawInParent = z;
        this.themeDelegate = resourcesProvider;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.avatarDrawable = new AvatarDrawable();
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.starGiftLayout = new StarGiftUniqueActionLayout(this.currentAccount, this, resourcesProvider);
        this.giftTitlePaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.giftSubtitlePaint.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        this.giftTextPaint.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.rippleView = view;
        view.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(-16777216, 0.1f), 7, AndroidUtilities.dp(16.0f)));
        this.rippleView.setVisibility(8);
        addView(this.rippleView);
        StarParticlesView.Drawable drawable = new StarParticlesView.Drawable(10);
        this.starParticlesDrawable = drawable;
        drawable.type = 100;
        drawable.isCircle = false;
        drawable.roundEffect = true;
        drawable.useRotate = false;
        drawable.useBlur = true;
        drawable.checkBounds = true;
        drawable.size1 = 1;
        drawable.k3 = 0.98f;
        drawable.k2 = 0.98f;
        drawable.k1 = 0.98f;
        drawable.paused = false;
        drawable.speedScale = 0.0f;
        drawable.minLifeTime = 750L;
        drawable.randLifeTime = 750;
        drawable.init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r1v130, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void buildLayout() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence replaceTags;
        int i;
        CharSequence charSequence3;
        boolean z;
        String str;
        CharSequence charSequence4;
        boolean z2;
        int i2;
        String str2;
        String str3;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        Spannable spannable;
        CharSequence string;
        String string2;
        int i3;
        boolean z3;
        boolean z4;
        CharSequence charSequence5;
        SpannableStringBuilder spannableStringBuilder;
        boolean z5;
        String str4;
        int i4;
        String str5;
        ChatActionCell chatActionCell;
        String str6;
        String str7;
        ?? r8;
        String str8;
        boolean z6;
        int i5;
        String str9;
        int i6;
        String formatString;
        int i7;
        CharSequence formatPluralStringComma;
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        String publicUsername;
        char c;
        Object valueOf;
        int i8;
        boolean z7;
        boolean z8;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        boolean z9;
        String str10;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i9;
        TLRPC.MessageMedia messageMedia;
        int i10;
        this.giftRectEmpty = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            if (messageObject.isExpiredStory()) {
                charSequence = messageObject.messageOwner.media.user_id != UserConfig.getInstance(this.currentAccount).getClientUserId() ? StoriesUtilities.createExpiredStoryString(true, R.string.ExpiredStoryMention, new Object[0]) : StoriesUtilities.createExpiredStoryString(true, R.string.ExpiredStoryMentioned, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name);
            } else {
                ChatActionCellDelegate chatActionCellDelegate = this.delegate;
                charSequence = (chatActionCellDelegate != null && chatActionCellDelegate.getTopicId() == 0 && MessageObject.isTopicActionMessage(messageObject)) ? ForumUtilities.createActionTextWithTopic(MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true)), messageObject) : null;
            }
            if (charSequence == null) {
                TLRPC.Message message2 = messageObject.messageOwner;
                if (message2 != null && (messageMedia = message2.media) != null && messageMedia.ttl_seconds != 0) {
                    if (messageMedia.photo != null) {
                        i10 = R.string.AttachPhotoExpired;
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        if ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) {
                            i10 = messageMedia.voice ? R.string.AttachVoiceExpired : messageMedia.round ? R.string.AttachRoundExpired : R.string.AttachVideoExpired;
                        }
                    }
                    charSequence = LocaleController.getString(i10);
                }
                charSequence = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
            }
        } else {
            charSequence = this.customText;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && messageObject2.isRepostPreview) {
            charSequence = "";
        }
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i9 = R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i9 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i9 = 0;
            }
            if (i9 != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                spannableStringBuilder2.insert(0, (CharSequence) "i ");
                spannableStringBuilder2.setSpan(new ColoredImageSpan(i9), 0, 1, 33);
                charSequence2 = spannableStringBuilder2;
                createLayout(charSequence2, this.previousWidth);
                if (messageObject != null) {
                    TLRPC.Message message3 = messageObject.messageOwner;
                    if (message3 != null) {
                        TLRPC.MessageAction messageAction2 = message3.action;
                        if ((messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).balance_too_low) {
                            str10 = !ChatObject.canManageMonoForum(this.currentAccount, messageObject.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null;
                            i8 = this.giftRectSize;
                            z7 = false;
                            z8 = true;
                            charSequence6 = null;
                            charSequence7 = null;
                            charSequence8 = null;
                            z9 = false;
                            createGiftPremiumLayouts(charSequence6, charSequence7, charSequence8, charSequence2, z9, str10, 11, null, i8, z7, z8);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        }
                    }
                    if (message3 != null) {
                        TLRPC.MessageAction messageAction3 = message3.action;
                        if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).rejected) {
                            i8 = this.giftRectSize;
                            z7 = false;
                            z8 = true;
                            charSequence6 = null;
                            charSequence7 = null;
                            charSequence8 = null;
                            z9 = false;
                            str10 = null;
                            createGiftPremiumLayouts(charSequence6, charSequence7, charSequence8, charSequence2, z9, str10, 11, null, i8, z7, z8);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                            this.giftRectEmpty = true;
                        }
                    }
                    int i11 = messageObject.type;
                    if (i11 == 11) {
                        float dp = this.textHeight + AndroidUtilities.dp(19.0f);
                        float f = AndroidUtilities.roundMessageSize;
                        this.imageReceiver.setImageCoords((this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f, dp, f, f);
                    } else if (i11 == 25) {
                        createGiftPremiumChannelLayouts();
                    } else {
                        if (i11 == 30) {
                            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                            TLRPC.MessageAction messageAction4 = messageObject.messageOwner.action;
                            if (messageAction4 instanceof TLRPC.TL_messageActionGiftStars) {
                                String formatPluralStringComma2 = LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction4).stars);
                                string = AndroidUtilities.replaceTags(this.currentMessageObject.isOutOwner() ? LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user)) : LocaleController.getString(R.string.ActionGiftStarsSubtitleYou));
                                string2 = LocaleController.getString(R.string.ActionGiftStarsView);
                                i3 = this.giftRectSize;
                                z3 = true;
                                z4 = false;
                                charSequence5 = null;
                                spannableStringBuilder = null;
                                z5 = false;
                                str7 = formatPluralStringComma2;
                                i4 = 11;
                                str4 = null;
                                str6 = str7;
                                chatActionCell = this;
                                str5 = str6;
                            } else if ((messageAction4 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction4).refunded) {
                                long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                if (messageObject.isOutOwner() != (!((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).upgrade)) {
                                    clientUserId = messageObject.getDialogId();
                                }
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(clientUserId));
                                ?? spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append(LocaleController.getString(R.string.Gift2ActionTitle)).append((CharSequence) " ");
                                if (user2 != null && user2.photo != null) {
                                    spannableStringBuilder3.append("a ");
                                    AvatarSpan avatarSpan = new AvatarSpan(this, this.currentAccount, 18.0f);
                                    avatarSpan.setUser(user2);
                                    spannableStringBuilder3.setSpan(avatarSpan, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append(UserObject.getForcedFirstName(user2));
                                string = LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText);
                                string2 = LocaleController.getString(R.string.ActionGiftStarsView);
                                str4 = LocaleController.getString(R.string.Gift2UniqueRibbon);
                                i3 = this.giftRectSize;
                                z3 = true;
                                z4 = false;
                                charSequence5 = null;
                                spannableStringBuilder = null;
                                z5 = false;
                                i4 = 12;
                                str6 = spannableStringBuilder3;
                                chatActionCell = this;
                                str5 = str6;
                            } else if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction4;
                                long j = tL_messageActionStarGift.convert_stars;
                                long clientUserId2 = UserConfig.getInstance(this.currentAccount).getClientUserId();
                                boolean z10 = tL_messageActionStarGift.peer != null;
                                boolean z11 = messageObject.getDialogId() == clientUserId2 && !z10;
                                long fromChatId = messageObject.getFromChatId();
                                TLRPC.Peer peer = tL_messageActionStarGift.from_id;
                                if (peer != null) {
                                    fromChatId = DialogObject.getPeerDialogId(peer);
                                }
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId);
                                boolean z12 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > 0 && !tL_messageActionStarGift.upgraded;
                                if (z11) {
                                    spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                                    r8 = spannableStringBuilder4;
                                } else {
                                    spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitle)).append((CharSequence) " ");
                                    if (DialogObject.hasPhoto(userOrChat)) {
                                        spannableStringBuilder4.append((CharSequence) "a ");
                                        AvatarSpan avatarSpan2 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                        avatarSpan2.setObject(userOrChat);
                                        spannableStringBuilder4.setSpan(avatarSpan2, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                                    }
                                    r8 = spannableStringBuilder4;
                                    r8.append(DialogObject.getShortName(userOrChat));
                                }
                                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - messageObject.messageOwner.date);
                                if ((!messageObject.isOutOwner() || z11) && tL_messageActionStarGift.converted) {
                                    str8 = r8;
                                } else {
                                    str8 = r8;
                                    if (tL_messageActionStarGift.convert_stars > 0 && currentTime > 0 && !tL_messageActionStarGift.refunded) {
                                        z6 = true;
                                        if (tL_messageActionStarGift.refunded) {
                                            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                                MessageObject.addEntitiesToText(spannableStringBuilder5, tL_messageActionStarGift.message.entities, false, false, true, true);
                                                formatPluralStringComma = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder5, this.giftTextPaint.getFontMetricsInt(), false, (int[]) null), tL_messageActionStarGift.message.entities, this.giftTextPaint.getFontMetricsInt());
                                            } else if (z10) {
                                                if (!tL_messageActionStarGift.converted) {
                                                    if (!z6 || j <= 0) {
                                                        i7 = R.string.Gift2ActionInfoChannelNoConvert;
                                                        formatString = LocaleController.getString(i7);
                                                        formatPluralStringComma = AndroidUtilities.replaceTags(formatString);
                                                    } else {
                                                        i5 = (int) j;
                                                        str9 = "Gift2ActionInfoChannel";
                                                        formatString = LocaleController.formatPluralStringComma(str9, i5);
                                                        formatPluralStringComma = AndroidUtilities.replaceTags(formatString);
                                                    }
                                                }
                                                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else if (z11) {
                                                if (!tL_messageActionStarGift.converted || j <= 0) {
                                                    i7 = tL_messageActionStarGift.can_upgrade ? R.string.Gift2ActionSelfInfoUpgrade : R.string.Gift2ActionSelfInfoNoConvert;
                                                    formatString = LocaleController.getString(i7);
                                                    formatPluralStringComma = AndroidUtilities.replaceTags(formatString);
                                                }
                                                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                            } else {
                                                if (z12) {
                                                    if (messageObject.isOutOwner()) {
                                                        formatString = LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user));
                                                    } else {
                                                        i7 = R.string.Gift2ActionUpgrade;
                                                        formatString = LocaleController.getString(i7);
                                                    }
                                                } else if (messageObject.isOutOwner()) {
                                                    formatString = (!z6 || j <= 0) ? tL_messageActionStarGift.can_upgrade ? LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user)) : LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user)) : LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j, UserObject.getForcedFirstName(user));
                                                } else {
                                                    if (!tL_messageActionStarGift.converted) {
                                                        if (tL_messageActionStarGift.saved) {
                                                            i6 = !z6 ? R.string.Gift2ActionBotSavedInfo : R.string.Gift2ActionSavedInfo;
                                                        } else if (z6) {
                                                            i5 = (int) j;
                                                            str9 = "Gift2ActionInfo";
                                                            formatString = LocaleController.formatPluralStringComma(str9, i5);
                                                        } else {
                                                            i6 = R.string.Gift2ActionBotInfo;
                                                        }
                                                    }
                                                    formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                                }
                                                formatPluralStringComma = AndroidUtilities.replaceTags(formatString);
                                            }
                                            CharSequence charSequence9 = formatPluralStringComma;
                                            starGift = tL_messageActionStarGift.gift;
                                            if (starGift == null && starGift.limited) {
                                                int i12 = R.string.Gift2Limited1OfRibbon;
                                                int i13 = starGift.availability_total;
                                                if (i13 > 1500) {
                                                    c = 0;
                                                    valueOf = AndroidUtilities.formatWholeNumber(i13, 0);
                                                } else {
                                                    c = 0;
                                                    valueOf = Integer.valueOf(i13);
                                                }
                                                Object[] objArr = new Object[1];
                                                objArr[c] = valueOf;
                                                str4 = LocaleController.formatString(i12, objArr);
                                            } else {
                                                str4 = null;
                                            }
                                            String string3 = LocaleController.getString(R.string.ActionGiftStarsView);
                                            if ((messageObject.isOutOwner() || tL_messageActionStarGift.forceIn || z12) && !messageObject.isOutOwner() && z12) {
                                                ?? spannableStringBuilder6 = new SpannableStringBuilder();
                                                spannableStringBuilder6.append("^  ");
                                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.gift_unpack);
                                                coloredImageSpan.setScale(0.8f, 0.8f);
                                                spannableStringBuilder6.setSpan(coloredImageSpan, 0, 1, 33);
                                                spannableStringBuilder6.append(LocaleController.getString(R.string.Gift2Unpack));
                                                string2 = spannableStringBuilder6;
                                            } else {
                                                string2 = string3;
                                            }
                                            starGift2 = tL_messageActionStarGift.gift;
                                            if (starGift2 != null || starGift2.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                                                spannableStringBuilder = null;
                                            } else {
                                                spannableStringBuilder = StarGiftSheet.replaceSingleTagToLink(LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@" + publicUsername), null);
                                            }
                                            i3 = this.giftRectSize;
                                            z3 = true;
                                            z4 = false;
                                            charSequence5 = null;
                                            chatActionCell = this;
                                            str5 = str8;
                                            string = charSequence9;
                                            z5 = false;
                                            i4 = 11;
                                        } else {
                                            i6 = R.string.Gift2ActionConvertRefundedText;
                                        }
                                        formatPluralStringComma = LocaleController.getString(i6);
                                        CharSequence charSequence92 = formatPluralStringComma;
                                        starGift = tL_messageActionStarGift.gift;
                                        if (starGift == null) {
                                        }
                                        str4 = null;
                                        String string32 = LocaleController.getString(R.string.ActionGiftStarsView);
                                        if (messageObject.isOutOwner()) {
                                        }
                                        ?? spannableStringBuilder62 = new SpannableStringBuilder();
                                        spannableStringBuilder62.append("^  ");
                                        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.gift_unpack);
                                        coloredImageSpan2.setScale(0.8f, 0.8f);
                                        spannableStringBuilder62.setSpan(coloredImageSpan2, 0, 1, 33);
                                        spannableStringBuilder62.append(LocaleController.getString(R.string.Gift2Unpack));
                                        string2 = spannableStringBuilder62;
                                        starGift2 = tL_messageActionStarGift.gift;
                                        if (starGift2 != null) {
                                        }
                                        spannableStringBuilder = null;
                                        i3 = this.giftRectSize;
                                        z3 = true;
                                        z4 = false;
                                        charSequence5 = null;
                                        chatActionCell = this;
                                        str5 = str8;
                                        string = charSequence92;
                                        z5 = false;
                                        i4 = 11;
                                    }
                                }
                                z6 = false;
                                if (tL_messageActionStarGift.refunded) {
                                }
                                formatPluralStringComma = LocaleController.getString(i6);
                                CharSequence charSequence922 = formatPluralStringComma;
                                starGift = tL_messageActionStarGift.gift;
                                if (starGift == null) {
                                }
                                str4 = null;
                                String string322 = LocaleController.getString(R.string.ActionGiftStarsView);
                                if (messageObject.isOutOwner()) {
                                }
                                ?? spannableStringBuilder622 = new SpannableStringBuilder();
                                spannableStringBuilder622.append("^  ");
                                ColoredImageSpan coloredImageSpan22 = new ColoredImageSpan(R.drawable.gift_unpack);
                                coloredImageSpan22.setScale(0.8f, 0.8f);
                                spannableStringBuilder622.setSpan(coloredImageSpan22, 0, 1, 33);
                                spannableStringBuilder622.append(LocaleController.getString(R.string.Gift2Unpack));
                                string2 = spannableStringBuilder622;
                                starGift2 = tL_messageActionStarGift.gift;
                                if (starGift2 != null) {
                                }
                                spannableStringBuilder = null;
                                i3 = this.giftRectSize;
                                z3 = true;
                                z4 = false;
                                charSequence5 = null;
                                chatActionCell = this;
                                str5 = str8;
                                string = charSequence922;
                                z5 = false;
                                i4 = 11;
                            } else {
                                String string4 = LocaleController.getString(messageAction4 instanceof TLRPC.TL_messageActionGiftTon ? R.string.ActionGiftTonTitle : R.string.ActionStarGiveawayPrizeTitle);
                                charSequence4 = this.currentMessageObject.messageText;
                                str2 = LocaleController.getString(R.string.ActionGiftStarsView);
                                i2 = this.giftRectSize;
                                z2 = true;
                                str3 = string4;
                                createGiftPremiumLayouts(str3, null, null, charSequence4, false, str2, 11, null, i2, z2, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            }
                        } else if (i11 == 18) {
                            TLRPC.MessageAction messageAction5 = message3.action;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction5 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction5).message : messageAction5 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction5).message : null;
                            if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                spannable = null;
                            } else {
                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(tL_textWithEntities2.text);
                                this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                MessageObject.addEntitiesToText(spannableStringBuilder7, tL_textWithEntities2.entities, false, false, true, true);
                                spannable = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder7, this.giftTextPaint.getFontMetricsInt(), false, (int[]) null), tL_textWithEntities2.entities, this.giftTextPaint.getFontMetricsInt());
                            }
                            string = spannable == null ? LocaleController.getString(R.string.ActionGiftPremiumText) : spannable;
                            string2 = LocaleController.getString((!isGiftCode() || isSelfGiftCode()) ? R.string.ActionGiftPremiumView : R.string.GiftPremiumUseGiftBtn);
                            String formatPluralStringComma3 = LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months);
                            i3 = this.giftRectSize;
                            z3 = false;
                            z4 = false;
                            charSequence5 = null;
                            spannableStringBuilder = null;
                            z5 = true;
                            str7 = formatPluralStringComma3;
                            i4 = 11;
                            str4 = null;
                            str6 = str7;
                            chatActionCell = this;
                            str5 = str6;
                        } else {
                            if (i11 == 21) {
                                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                                TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.isOutOwner() ? 0L : messageObject.getDialogId()));
                                boolean z13 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                                if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                    TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId()));
                                    replaceTags = z13 ? LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user4.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                                } else {
                                    replaceTags = z13 ? LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user3.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                                }
                                i = (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? R.string.ViewVideoAction : R.string.ViewPhotoAction;
                            } else if (i11 == 22) {
                                TLRPC.User user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.isOutOwner() ? 0L : messageObject.getDialogId()));
                                if (messageObject.getDialogId() >= 0) {
                                    if (!messageObject.isOutOwner() && messageObject.isWallpaperForBoth() && messageObject.isCurrentWallpaper()) {
                                        charSequence3 = messageObject.messageText;
                                        str = LocaleController.getString(R.string.RemoveWallpaperAction);
                                        z = false;
                                    } else if (user5 == null || user5.id != UserConfig.getInstance(this.currentAccount).clientUserId) {
                                        charSequence3 = messageObject.messageText;
                                        str = LocaleController.getString(R.string.ViewWallpaperAction);
                                        z = true;
                                    }
                                    charSequence4 = charSequence3;
                                    z2 = z;
                                    i2 = this.giftRectSize;
                                    str2 = str;
                                    str3 = null;
                                    createGiftPremiumLayouts(str3, null, null, charSequence4, false, str2, 11, null, i2, z2, false);
                                    this.textLayout = null;
                                    this.textHeight = 0;
                                    this.titleLayout = null;
                                    this.titleHeight = 0;
                                    this.textY = 0;
                                }
                                charSequence3 = messageObject.messageText;
                                z = true;
                                str = null;
                                charSequence4 = charSequence3;
                                z2 = z;
                                i2 = this.giftRectSize;
                                str2 = str;
                                str3 = null;
                                createGiftPremiumLayouts(str3, null, null, charSequence4, false, str2, 11, null, i2, z2, false);
                                this.textLayout = null;
                                this.textHeight = 0;
                                this.titleLayout = null;
                                this.titleHeight = 0;
                                this.textY = 0;
                            } else if (messageObject.isStoryMention()) {
                                TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                                replaceTags = AndroidUtilities.replaceTags(user6.self ? LocaleController.formatString("StoryYouMentionedTitle", R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name) : LocaleController.formatString("StoryMentionedTitle", R.string.StoryMentionedTitle, user6.first_name));
                                i = R.string.StoryMentionedAction;
                            }
                            charSequence4 = replaceTags;
                            str2 = LocaleController.getString(i);
                            i2 = this.giftRectSize;
                            str3 = null;
                            z2 = true;
                            createGiftPremiumLayouts(str3, null, null, charSequence4, false, str2, 11, null, i2, z2, false);
                            this.textLayout = null;
                            this.textHeight = 0;
                            this.titleLayout = null;
                            this.titleHeight = 0;
                            this.textY = 0;
                        }
                        chatActionCell.createGiftPremiumLayouts(str5, charSequence5, spannableStringBuilder, string, z5, string2, i4, str4, i3, z3, z4);
                    }
                }
                this.reactionsLayoutInBubble.x = AndroidUtilities.dp(12.0f);
                this.reactionsLayoutInBubble.measure(this.previousWidth - AndroidUtilities.dp(24.0f), 1);
            }
        }
        charSequence2 = charSequence;
        createLayout(charSequence2, this.previousWidth);
        if (messageObject != null) {
        }
        this.reactionsLayoutInBubble.x = AndroidUtilities.dp(12.0f);
        this.reactionsLayoutInBubble.measure(this.previousWidth - AndroidUtilities.dp(24.0f), 1);
    }

    private void checkLeftRightBounds() {
        this.backgroundLeft = (int) Math.min(this.backgroundLeft, this.rect.left);
        this.backgroundRight = (int) Math.max(this.backgroundRight, this.rect.right);
    }

    private void createGiftPremiumChannelLayouts() {
        int i;
        String str;
        SpannableStringBuilder spannableStringBuilder;
        String formatString;
        int dp = this.giftRectSize - AndroidUtilities.dp(16.0f);
        this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action;
        int i2 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str2 = chat == null ? null : chat.title;
        boolean z = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            i = R.string.BoostingUnclaimedPrize;
            str = "BoostingUnclaimedPrize";
        } else {
            i = R.string.BoostingCongratulations;
            str = "BoostingCongratulations";
        }
        String string = LocaleController.getString(str, i);
        String formatPluralString = i2 == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i2, new Object[0]);
        if (!z) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(str2 == null ? LocaleController.getString("BoostingReceivedGiftNoName", R.string.BoostingReceivedGiftNoName) : LocaleController.formatString("BoostingReceivedGiftFrom", R.string.BoostingReceivedGiftFrom, str2)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            formatString = LocaleController.formatString("BoostingReceivedGiftDuration", R.string.BoostingReceivedGiftDuration, formatPluralString);
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingYouHaveUnclaimedPrize", R.string.BoostingYouHaveUnclaimedPrize, str2)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            formatString = LocaleController.formatString("BoostingUnclaimedPrizeDuration", R.string.BoostingUnclaimedPrizeDuration, formatPluralString);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingReceivedPrizeFrom", R.string.BoostingReceivedPrizeFrom, str2)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            formatString = LocaleController.formatString("BoostingReceivedPrizeDuration", R.string.BoostingReceivedPrizeDuration, formatPluralString);
        }
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(formatString));
        String string2 = LocaleController.getString("BoostingReceivedGiftOpenBtn", R.string.BoostingReceivedGiftOpenBtn);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        valueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        TextPaint textPaint = this.giftTitlePaint;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.giftPremiumTitleLayout = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.giftPremiumSubtitleLayout = null;
        this.giftPremiumReleasedText = null;
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            textLayout.detach();
        }
        TextLayout textLayout2 = new TextLayout();
        this.giftPremiumText = textLayout2;
        textLayout2.setText(spannableStringBuilder, this.giftTextPaint, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.giftPremiumTextCollapsed = false;
        this.giftPremiumTextCollapsedHeight = 0;
        this.giftPremiumTextMore = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) getThemedPaint("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.giftPremiumButtonLayout = staticLayout;
        this.buttonClickableAsImage = true;
        this.giftPremiumButtonWidth = measureLayoutWidth(staticLayout);
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.graphics.Path, android.text.StaticLayout, org.telegram.ui.Cells.ChatActionCell$TextLayout, org.telegram.ui.Components.Text] */
    /* JADX WARN: Type inference failed for: r6v5 */
    private void createGiftPremiumLayouts(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, CharSequence charSequence5, int i, CharSequence charSequence6, int i2, boolean z2, boolean z3) {
        ?? r6;
        TextPaint textPaint;
        float f;
        int i3;
        float f2;
        int cutInFancyHalf;
        int i4;
        CharSequence charSequence7 = charSequence4;
        int dp = i2 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        if (charSequence != null) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 == null || messageObject2.type != 30) {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(16.0f));
            } else {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r6 = 0;
            this.giftPremiumTitleLayout = new StaticLayout(valueOf, this.giftTitlePaint, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r6 = 0;
            this.giftPremiumTitleLayout = null;
        }
        if (charSequence2 != null) {
            this.giftSubtitlePaint.setTextSize(AndroidUtilities.dp(13.0f));
            this.giftPremiumSubtitleLayout = new StaticLayout(charSequence2, this.giftSubtitlePaint, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            this.giftPremiumSubtitleLayout = r6;
        }
        if (charSequence3 != null) {
            Text text = new Text(charSequence3, 10.0f);
            this.giftPremiumReleasedText = text;
            text.paint.linkColor = -1;
        } else {
            this.giftPremiumReleasedText = r6;
        }
        if (this.currentMessageObject == null || !(isNewStyleButtonLayout() || (i4 = this.currentMessageObject.type) == 30 || i4 == 18)) {
            textPaint = this.giftTextPaint;
            f = 15.0f;
        } else {
            textPaint = this.giftTextPaint;
            f = 13.0f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(f));
        int dp2 = dp - AndroidUtilities.dp(12.0f);
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null && messageObject3.type == 22 && messageObject3.getDialogId() >= 0 && (cutInFancyHalf = HintView2.cutInFancyHalf(charSequence7, this.giftTextPaint)) < dp2 && cutInFancyHalf > dp2 / 5.0f) {
            dp2 = cutInFancyHalf;
        }
        if (charSequence7 == null) {
            TextLayout textLayout = this.giftPremiumText;
            if (textLayout != null) {
                textLayout.detach();
                this.giftPremiumText = r6;
            }
            this.giftPremiumTextCollapsed = false;
            i3 = 0;
        } else {
            if (this.giftPremiumText == null) {
                this.giftPremiumText = new TextLayout();
            }
            try {
                charSequence7 = Emoji.replaceEmoji(charSequence7, this.giftTextPaint.getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            this.giftPremiumText.setText(charSequence7, this.giftTextPaint, dp2);
            if (!z || this.giftPremiumText.layout.getLineCount() <= 3) {
                i3 = 0;
                this.giftPremiumTextCollapsed = false;
                this.giftPremiumTextExpandedAnimated.set(true, true);
                this.giftPremiumTextCollapsedHeight = 0;
            } else {
                this.giftPremiumTextCollapsed = !this.giftPremiumTextUncollapsed;
                this.giftPremiumTextCollapsedHeight = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMore = new Text(LocaleController.getString(R.string.Gift2CaptionMore), this.giftTextPaint.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMoreY = lineBottom;
                this.giftPremiumTextMoreH = lineBottom - this.giftPremiumText.layout.getLineTop(2);
                this.giftPremiumTextMoreX = (int) this.giftPremiumText.layout.getLineRight(2);
                i3 = 0;
            }
            if (this.giftPremiumTextCollapsed) {
                this.giftPremiumText.setText(charSequence7.subSequence(i3, this.giftPremiumText.layout.getLineEnd(2) - 1), this.giftTextPaint, dp2);
            }
        }
        if (charSequence5 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
            valueOf2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), i3, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) getThemedPaint("paintChatActionText"), dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.giftPremiumButtonLayout = staticLayout;
            this.buttonClickableAsImage = z2 && !this.giftPremiumTextCollapsed;
            f2 = measureLayoutWidth(staticLayout);
        } else {
            this.giftPremiumButtonLayout = r6;
            this.buttonClickableAsImage = false;
            f2 = 0.0f;
        }
        this.giftPremiumButtonWidth = f2;
        if (charSequence6 == null) {
            this.giftRibbonPath = r6;
            this.giftRibbonText = r6;
            return;
        }
        if (this.giftRibbonPaintEffect == null) {
            this.giftRibbonPaintEffect = new CornerPathEffect(AndroidUtilities.dp(5.0f));
        }
        if (this.giftRibbonPath == null) {
            Path path = new Path();
            this.giftRibbonPath = path;
            GiftSheet.RibbonDrawable.fillRibbonPath(path, 1.35f);
        }
        Text text2 = new Text(charSequence6, i, AndroidUtilities.bold());
        this.giftRibbonText = text2;
        text2.ellipsize(AndroidUtilities.dp(62.0f));
    }

    private void createLayout(CharSequence charSequence, int i) {
        String str;
        ChatActionCellDelegate chatActionCellDelegate;
        TLRPC.Message message;
        CharSequence charSequence2 = charSequence;
        int dp = i - AndroidUtilities.dp(30.0f);
        if (this.isSideMenued) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (isMessageActionSuggestedPostApproval()) {
            dp = Math.min(dp - AndroidUtilities.dp(this.isSideMenued ? 28.0f : 82.0f), AndroidUtilities.dp(272.0f));
        }
        if (dp < 0) {
            return;
        }
        int i2 = this.overriddenMaxWidth;
        if (i2 > 0) {
            dp = Math.min(i2, dp);
        }
        int i3 = dp;
        this.invalidatePath = true;
        if (isMessageActionSuggestedPostApproval()) {
            str = "paintChatActionText3";
        } else {
            MessageObject messageObject = this.currentMessageObject;
            str = (messageObject == null || !messageObject.drawServiceWithDefaultTypeface) ? "paintChatActionText" : "paintChatActionText2";
        }
        TextPaint textPaint = (TextPaint) getThemedPaint(str);
        textPaint.linkColor = textPaint.getColor();
        if (isMessageActionSuggestedPostApproval()) {
            if (charSequence2 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence2;
                for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                    spannable.removeSpan(emojiSpan);
                }
            }
            charSequence2 = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f);
        }
        CharSequence charSequence3 = charSequence2;
        this.textLayout = new StaticLayout(charSequence3, textPaint, i3, isMessageActionSuggestedPostApproval() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.titleLayout = null;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.titleLayout = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint.getFontMetricsInt(), false, null, 0, 1.0f), textPaint, i3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        this.textHeight = 0;
        this.textWidth = 0;
        this.titleHeight = 0;
        StaticLayout staticLayout = this.titleLayout;
        if (staticLayout != null) {
            int height = staticLayout.getHeight();
            this.titleHeight = height;
            this.titleHeight = height + AndroidUtilities.dp(12.0f);
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 == null || !messageObject3.isRepostPreview) {
            try {
                int lineCount = this.textLayout.getLineCount();
                for (int i4 = 0; i4 < lineCount; i4++) {
                    try {
                        float lineWidth = this.textLayout.getLineWidth(i4);
                        float f = i3;
                        if (lineWidth > f) {
                            lineWidth = f;
                        }
                        this.textHeight = (int) Math.max(this.textHeight, Math.ceil(this.textLayout.getLineBottom(i4)));
                        this.textWidth = (int) Math.max(this.textWidth, Math.ceil(lineWidth));
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        this.textX = (i - this.textWidth) / 2;
        int dp2 = AndroidUtilities.dp(7.0f);
        this.textY = dp2;
        if (this.titleLayout != null) {
            this.textY = dp2 + this.titleHeight + AndroidUtilities.dp(11.0f);
        }
        this.textXLeft = (i - (isMessageActionSuggestedPostApproval() ? this.textWidth : this.textLayout.getWidth())) / 2;
        this.titleXLeft = (i - i3) / 2;
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout2 = this.textLayout;
            int i5 = this.textX;
            SpoilerEffect.addSpoilers(this, staticLayout2, i5, i5 + this.textWidth, (Spannable) charSequence3, this.spoilersPool, this.spoilers, null);
        }
    }

    private ColorFilter getAdaptiveEmojiColorFilter(int i) {
        if (i != this.adaptiveEmojiColor || this.adaptiveEmojiColorFilter == null) {
            this.adaptiveEmojiColor = i;
            this.adaptiveEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        return this.adaptiveEmojiColorFilter;
    }

    private int getImageSize(MessageObject messageObject) {
        int i = this.stickerSize;
        if (messageObject.type == 21 || isNewStyleButtonLayout()) {
            i = AndroidUtilities.dp(78.0f);
        }
        if (isMessageActionSuggestedPostApproval()) {
            return 0;
        }
        return i;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.themeDelegate);
    }

    private float getUploadingInfoProgress(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject == null) {
            return 1.0f;
        }
        try {
            if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.currentAccount)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                return messagesController.uploadingWallpaperInfo.uploadingProgress;
            }
            return 1.0f;
        } catch (Exception e) {
            FileLog.e(e);
            return 1.0f;
        }
    }

    private boolean isButtonLayout(MessageObject messageObject) {
        int i;
        return messageObject != null && ((i = messageObject.type) == 30 || i == 18 || i == 25 || isNewStyleButtonLayout());
    }

    private boolean isGiftChannel(MessageObject messageObject) {
        return messageObject != null && messageObject.type == 25;
    }

    private boolean isGiftCode() {
        MessageObject messageObject = this.currentMessageObject;
        return messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGiftCode);
    }

    private boolean isMessageActionSuggestedPostApproval() {
        TLRPC.Message message;
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    private boolean isNewStyleButtonLayout() {
        MessageObject messageObject;
        int i;
        if (!this.starGiftLayout.has() && (i = (messageObject = this.currentMessageObject).type) != 21 && i != 22 && !messageObject.isStoryMention()) {
            TLRPC.Message message = this.currentMessageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (tL_messageActionSuggestedPostApproval.balance_too_low || tL_messageActionSuggestedPostApproval.rejected) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    private boolean isSelfGiftCode() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return UserObject.isUserSelf(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.messageOwner.from_id.user_id)));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        ChatActionCellDelegate chatActionCellDelegate;
        if (!z || (lottieAnimation = this.imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.playedGiftAnimation) {
            if (lottieAnimation.getCurrentFrame() < 1) {
                lottieAnimation.stop();
                lottieAnimation.setCurrentFrame(lottieAnimation.getFramesCount() - 1, false);
                return;
            }
            return;
        }
        messageObject.playedGiftAnimation = true;
        lottieAnimation.setCurrentFrame(0, false);
        AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(lottieAnimation));
        if (messageObject.wasUnread || this.forceWasUnread) {
            messageObject.wasUnread = false;
            this.forceWasUnread = false;
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (getContext() instanceof LaunchActivity) {
                ((LaunchActivity) getContext()).getFireworksOverlay().start();
            }
            TLRPC.VideoSize videoSize = this.giftEffectAnimation;
            if (videoSize == null || (chatActionCellDelegate = this.delegate) == null) {
                return;
            }
            chatActionCellDelegate.needShowEffectOverlay(this, this.giftSticker, videoSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTouchEvent$2() {
        this.isSpoilerRevealing = false;
        getMessageObject().isSpoilersRevealed = true;
        List list = this.giftPremiumText.spoilers;
        if (list != null) {
            list.clear();
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTouchEvent$3() {
        post(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                ChatActionCell.this.lambda$onTouchEvent$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openPremiumGiftChannel$4(TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode) {
        this.delegate.didOpenPremiumGiftChannel(this, tL_messageActionGiftCode.slug, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openPremiumGiftPreview$5(TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        this.delegate.didOpenPremiumGift(this, tL_premiumGiftOption, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMessageObject$1() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            chatActionCellDelegate.onTopicClick(this);
        }
    }

    private float measureLayoutWidth(Layout layout) {
        float f = 0.0f;
        for (int i = 0; i < layout.getLineCount(); i++) {
            float ceil = (int) Math.ceil(layout.getLineWidth(i));
            if (ceil > f) {
                f = ceil;
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openLink(CharacterStyle characterStyle) {
        if (this.delegate == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.delegate.didPressTaskLink(this, this.currentMessageObject.getReplyMsgId(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.pressedLink;
            if (uRLSpan instanceof URLSpanNoUnderline) {
                TLObject object = ((URLSpanNoUnderline) uRLSpan).getObject();
                if (object instanceof TLRPC.TL_forumTopic) {
                    ForumUtilities.openTopic(this.delegate.getBaseFragment(), -this.delegate.getDialogId(), (TLRPC.TL_forumTopic) object, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.pressedLink;
            if (uRLSpan2 instanceof URLSpanNoUnderline) {
                TLObject object2 = ((URLSpanNoUnderline) uRLSpan2).getObject();
                if (object2 instanceof TLRPC.TL_chatInviteExported) {
                    this.delegate.needOpenInviteLink((TLRPC.TL_chatInviteExported) object2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.delegate.didPressReplyMessage(this, this.currentMessageObject.getReplyMsgId());
        } else if (url.startsWith("http")) {
            Browser.openUrl(getContext(), url);
        } else {
            this.delegate.needOpenUserProfile(Long.parseLong(url));
        }
    }

    private void openPremiumGiftChannel() {
        if (this.delegate != null) {
            final TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    ChatActionCell.this.lambda$openPremiumGiftChannel$4(tL_messageActionGiftCode);
                }
            });
        }
    }

    private void openPremiumGiftPreview() {
        final TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        TLRPC.MessageAction messageAction = this.currentMessageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        final String str = (!isGiftCode() || isSelfGiftCode()) ? null : ((TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action).slug;
        if (this.delegate != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    ChatActionCell.this.lambda$openPremiumGiftPreview$5(tL_premiumGiftOption, str);
                }
            });
        }
    }

    private void openStarsGiftTransaction() {
        TLRPC.Message message;
        StarGiftSheet starGiftSheet;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionGiftStars) {
            Context context = getContext();
            int i = this.currentAccount;
            TLRPC.Message message2 = this.currentMessageObject.messageOwner;
            StarsIntroActivity.showTransactionSheet(context, i, message2.date, message2.from_id, message2.peer_id, (TLRPC.TL_messageActionGiftStars) message2.action, this.avatarStoryParams.resourcesProvider);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            int i2 = this.currentAccount;
            TLRPC.Message message3 = this.currentMessageObject.messageOwner;
            StarsIntroActivity.showTransactionSheet(context2, i2, message3.date, message3.from_id, message3.peer_id, (TLRPC.TL_messageActionPrizeStars) message3.action, this.avatarStoryParams.resourcesProvider);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            int i3 = this.currentAccount;
            TLRPC.Message message4 = this.currentMessageObject.messageOwner;
            StarsIntroActivity.showTransactionSheet(context3, i3, message4.date, message4.from_id, message4.peer_id, (TLRPC.TL_messageActionGiftTon) message4.action, this.avatarStoryParams.resourcesProvider);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            } else {
                starGiftSheet = new StarGiftSheet(getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.themeDelegate);
            }
        } else if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return;
        } else {
            starGiftSheet = new StarGiftSheet(getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.themeDelegate);
        }
        starGiftSheet.set(this.currentMessageObject).show();
    }

    private void openStarsNeedSheet() {
        MessageSuggestionParams obtainSuggestionOffer = this.currentMessageObject.obtainSuggestionOffer();
        AmountUtils$Amount amountUtils$Amount = obtainSuggestionOffer.amount;
        if (amountUtils$Amount == null || amountUtils$Amount.currency != AmountUtils$Currency.STARS) {
            return;
        }
        new StarsIntroActivity.StarsNeededSheet(getContext(), this.themeDelegate, obtainSuggestionOffer.amount.asDecimal(), 13, ForumUtilities.getMonoForumTitle(this.currentAccount, this.currentMessageObject.getDialogId(), true), null).show();
    }

    private void setStarsPaused(boolean z) {
        StarParticlesView.Drawable drawable = this.starParticlesDrawable;
        if (z == drawable.paused) {
            return;
        }
        drawable.paused = z;
        if (z) {
            drawable.pausedTime = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < this.starParticlesDrawable.particles.size(); i++) {
            ((StarParticlesView.Drawable.Particle) this.starParticlesDrawable.particles.get(i)).lifeTime += System.currentTimeMillis() - this.starParticlesDrawable.pausedTime;
        }
        invalidate();
    }

    private void updateTextInternal(boolean z) {
        if (getMeasuredWidth() != 0) {
            createLayout(this.customText, getMeasuredWidth());
            invalidate();
        }
        if (this.wasLayout) {
            buildLayout();
        } else if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    ChatActionCell.this.requestLayout();
                }
            });
        } else {
            requestLayout();
        }
    }

    public boolean checkUnreadReactions(float f, int i) {
        if (!this.reactionsLayoutInBubble.hasUnreadReactions) {
            return false;
        }
        float y = getY();
        float f2 = y + r2.y;
        return f2 > f && (f2 + ((float) this.reactionsLayoutInBubble.height)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageObject messageObject;
        if (i == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i == NotificationCenter.didUpdatePremiumGiftStickers || i == NotificationCenter.starGiftsLoaded || i == NotificationCenter.didUpdateTonGiftStickers) {
            messageObject = this.currentMessageObject;
            if (messageObject == null) {
                return;
            }
        } else if (i != NotificationCenter.diceStickersDidLoad || !Objects.equals(objArr[0], UserConfig.getInstance(this.currentAccount).premiumGiftsStickerPack) || (messageObject = this.currentMessageObject) == null) {
            return;
        }
        setMessageObject(messageObject, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x046a, code lost:
    
        if (isFloating() != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0495, code lost:
    
        r1 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0497, code lost:
    
        r1 = (int) (r5 * r1);
        r5 = r20;
        r5.setAlpha(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x055a, code lost:
    
        if (hasGradientService() != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x05fb, code lost:
    
        r7.drawRoundRect(r28.backgroundRect, org.telegram.messenger.AndroidUtilities.dp(16.0f), org.telegram.messenger.AndroidUtilities.dp(16.0f), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05f9, code lost:
    
        if (hasGradientService() != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0492, code lost:
    
        if (isFloating() != false) goto L162;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawBackground(Canvas canvas, boolean z) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        int i;
        int i2;
        float f;
        Canvas canvas2;
        float f2;
        TextLayout textLayout;
        float f3;
        Paint paint5;
        Paint paint6;
        int i3;
        float f4;
        int i4;
        float f5;
        int i5;
        int i6;
        int i7;
        float f6;
        Path path;
        RectF rectF;
        float f7;
        float f8;
        int i8;
        if (this.canDrawInParent) {
            if (hasGradientService() && !z) {
                return;
            }
            if (!hasGradientService() && z) {
                return;
            }
        }
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        Paint themedPaint2 = getThemedPaint("paintChatActionBackgroundDarken");
        this.textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        int i9 = this.overrideBackground;
        if (i9 >= 0) {
            int themedColor = getThemedColor(i9);
            if (this.overrideBackgroundPaint == null) {
                Paint paint7 = new Paint(1);
                this.overrideBackgroundPaint = paint7;
                paint7.setColor(themedColor);
                TextPaint textPaint = new TextPaint(1);
                this.overrideTextPaint = textPaint;
                textPaint.setTypeface(AndroidUtilities.bold());
                this.overrideTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                this.overrideTextPaint.setColor(getThemedColor(this.overrideText));
            }
            themedPaint = this.overrideBackgroundPaint;
            this.textPaint = this.overrideTextPaint;
        }
        if (this.invalidatePath) {
            this.invalidatePath = false;
            this.backgroundLeft = getWidth();
            this.backgroundRight = 0;
            this.lineWidths.clear();
            StaticLayout staticLayout = this.textLayout;
            int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
            int dp = AndroidUtilities.dp(11.0f);
            int dp2 = AndroidUtilities.dp(8.0f);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                f3 = 1.5f;
                if (i10 >= lineCount) {
                    break;
                }
                int ceil = (int) Math.ceil(this.textLayout.getLineWidth(i10));
                if (i10 == 0 || (i8 = i11 - ceil) <= 0 || i8 > (dp * 1.5f) + dp2) {
                    i11 = ceil;
                }
                this.lineWidths.add(Integer.valueOf(i11));
                i10++;
            }
            int i12 = lineCount - 2;
            while (i12 >= 0) {
                int intValue = ((Integer) this.lineWidths.get(i12)).intValue();
                int i13 = i11 - intValue;
                if (i13 <= 0 || i13 > (dp * f3) + dp2) {
                    i11 = intValue;
                }
                this.lineWidths.set(i12, Integer.valueOf(i11));
                i12--;
                f3 = 1.5f;
            }
            int dp3 = AndroidUtilities.dp(4.0f);
            int measuredWidth = getMeasuredWidth() / 2;
            int dp4 = AndroidUtilities.dp(3.0f);
            int dp5 = AndroidUtilities.dp(6.0f);
            int i14 = dp - dp4;
            this.lineHeights.clear();
            this.backgroundPath.reset();
            float f9 = measuredWidth;
            this.backgroundPath.moveTo(f9, dp3);
            int i15 = 0;
            int i16 = 0;
            while (i15 < lineCount) {
                int intValue2 = ((Integer) this.lineWidths.get(i15)).intValue();
                int i17 = dp5;
                int lineBottom = this.textLayout.getLineBottom(i15);
                int i18 = lineCount - 1;
                if (i15 < i18) {
                    paint6 = themedPaint2;
                    paint5 = themedPaint;
                    i3 = ((Integer) this.lineWidths.get(i15 + 1)).intValue();
                } else {
                    paint5 = themedPaint;
                    paint6 = themedPaint2;
                    i3 = 0;
                }
                int i19 = lineBottom - i16;
                if (i15 == 0 || intValue2 > i11) {
                    f4 = 3.0f;
                    i19 += AndroidUtilities.dp(3.0f);
                } else {
                    f4 = 3.0f;
                }
                if (i15 == i18 || intValue2 > i3) {
                    i19 += AndroidUtilities.dp(f4);
                }
                float f10 = (intValue2 / 2.0f) + f9;
                int i20 = (i15 == i18 || intValue2 >= i3 || i15 == 0 || intValue2 >= i11) ? dp2 : i17;
                if (i15 == 0 || intValue2 > i11) {
                    i4 = measuredWidth;
                    f5 = f9;
                    i5 = lineCount;
                    i6 = i11;
                    i7 = lineBottom;
                    this.rect.set((f10 - dp4) - dp, dp3, i14 + f10, (dp * 2) + dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, 90.0f);
                } else if (intValue2 < i11) {
                    i7 = lineBottom;
                    f5 = f9;
                    float f11 = i14 + f10;
                    i4 = measuredWidth;
                    i5 = lineCount;
                    i6 = i11;
                    this.rect.set(f11, dp3, (i20 * 2) + f11, r10 + dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, -90.0f);
                } else {
                    i4 = measuredWidth;
                    f5 = f9;
                    i5 = lineCount;
                    i6 = i11;
                    i7 = lineBottom;
                }
                dp3 += i19;
                if (i15 == i18 || intValue2 >= i3) {
                    f6 = 3.0f;
                } else {
                    f6 = 3.0f;
                    dp3 -= AndroidUtilities.dp(3.0f);
                    i19 -= AndroidUtilities.dp(3.0f);
                }
                if (i15 != 0 && intValue2 < i6) {
                    dp3 -= AndroidUtilities.dp(f6);
                    i19 -= AndroidUtilities.dp(f6);
                }
                this.lineHeights.add(Integer.valueOf(i19));
                if (i15 == i18 || intValue2 > i3) {
                    this.rect.set((f10 - dp4) - dp, dp3 - (dp * 2), f10 + i14, dp3);
                    checkLeftRightBounds();
                    path = this.backgroundPath;
                    rectF = this.rect;
                    f7 = 0.0f;
                    f8 = 90.0f;
                } else if (intValue2 < i3) {
                    float f12 = f10 + i14;
                    this.rect.set(f12, dp3 - r2, (i20 * 2) + f12, dp3);
                    checkLeftRightBounds();
                    path = this.backgroundPath;
                    rectF = this.rect;
                    f7 = 180.0f;
                    f8 = -90.0f;
                } else {
                    i15++;
                    i11 = intValue2;
                    dp5 = i17;
                    themedPaint2 = paint6;
                    themedPaint = paint5;
                    i16 = i7;
                    f9 = f5;
                    measuredWidth = i4;
                    lineCount = i5;
                }
                path.arcTo(rectF, f7, f8);
                i15++;
                i11 = intValue2;
                dp5 = i17;
                themedPaint2 = paint6;
                themedPaint = paint5;
                i16 = i7;
                f9 = f5;
                measuredWidth = i4;
                lineCount = i5;
            }
            paint = themedPaint;
            paint2 = themedPaint2;
            int i21 = measuredWidth;
            float f13 = f9;
            int i22 = dp5;
            int i23 = lineCount - 1;
            int i24 = i23;
            while (i24 >= 0) {
                int intValue3 = i24 != 0 ? ((Integer) this.lineWidths.get(i24 - 1)).intValue() : 0;
                int intValue4 = ((Integer) this.lineWidths.get(i24)).intValue();
                int intValue5 = i24 != i23 ? ((Integer) this.lineWidths.get(i24 + 1)).intValue() : 0;
                this.textLayout.getLineBottom(i24);
                float f14 = i21 - (intValue4 / 2);
                int i25 = (i24 == i23 || intValue4 >= intValue5 || i24 == 0 || intValue4 >= intValue3) ? dp2 : i22;
                if (i24 == i23 || intValue4 > intValue5) {
                    this.rect.set(f14 - i14, dp3 - (dp * 2), dp4 + f14 + dp, dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, 90.0f);
                } else if (intValue4 < intValue5) {
                    float f15 = f14 - i14;
                    this.rect.set(f15 - (i25 * 2), dp3 - r12, f15, dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, -90.0f);
                }
                dp3 -= ((Integer) this.lineHeights.get(i24)).intValue();
                if (i24 == 0 || intValue4 > intValue3) {
                    this.rect.set(f14 - i14, dp3, f14 + dp4 + dp, (dp * 2) + dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, 90.0f);
                } else if (intValue4 < intValue3) {
                    float f16 = f14 - i14;
                    this.rect.set(f16 - (i25 * 2), dp3, f16, r7 + dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, -90.0f);
                }
                i24--;
            }
            this.backgroundPath.close();
            if (isMessageActionSuggestedPostApproval() && !isNewStyleButtonLayout()) {
                this.rect.left = (f13 - (this.textWidth / 2.0f)) - AndroidUtilities.dp(17.0f);
                RectF rectF2 = this.rect;
                rectF2.top = dp3;
                rectF2.right = f13 + (this.textWidth / 2.0f) + AndroidUtilities.dp(17.0f);
                this.rect.bottom = dp3 + this.textHeight + this.titleHeight + AndroidUtilities.dp(28.0f);
                this.backgroundPath.reset();
                this.backgroundPath.addRoundRect(this.rect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                this.backgroundPath.close();
            }
        } else {
            paint = themedPaint;
            paint2 = themedPaint2;
        }
        if (!this.visiblePartSet) {
            this.backgroundHeight = ((ViewGroup) getParent()).getMeasuredHeight();
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        float f17 = 0.75f;
        if (!z || (getAlpha() == 1.0f && !isFloating())) {
            paint3 = paint;
            if (isFloating()) {
                i = paint3.getAlpha();
                i2 = paint2.getAlpha();
                paint3.setAlpha((int) (i * (isFloating() ? 0.75f : 1.0f)));
                f = i2;
            } else {
                paint4 = paint2;
                i = -1;
                i2 = -1;
            }
        } else {
            i = paint.getAlpha();
            i2 = paint2.getAlpha();
            paint3 = paint;
            paint3.setAlpha((int) (i * getAlpha() * (isFloating() ? 0.75f : 1.0f)));
            f = i2 * getAlpha();
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isRepostPreview) {
            canvas2 = canvas;
            canvas2.drawPath(this.backgroundPath, paint3);
            if (hasGradientService()) {
                canvas2.drawPath(this.backgroundPath, paint4);
            }
            f2 = 0.0f;
            if (this.dimAmount > 0.0f) {
                int alpha = this.dimPaint.getAlpha();
                if (z) {
                    this.dimPaint.setAlpha((int) (alpha * getAlpha()));
                }
                canvas2.drawPath(this.backgroundPath, this.dimPaint);
                this.dimPaint.setAlpha(alpha);
            }
        } else {
            canvas2 = canvas;
            f2 = 0.0f;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (this.starGiftLayout.has()) {
            float width = this.starGiftLayout.getWidth() + AndroidUtilities.dp(8.0f);
            float width2 = (getWidth() - width) / 2.0f;
            if (!this.starGiftLayout.repost) {
                f2 = this.textY + this.textHeight + AndroidUtilities.dp(12.0f);
            }
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(width2, f2, width + width2, this.starGiftLayout.getHeight() + f2 + AndroidUtilities.dp(8.0f));
            if (this.backgroundRect == null) {
                this.backgroundRect = new RectF();
            }
            this.backgroundRect.set(rectF3);
            canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
        } else if (isButtonLayout(messageObject2)) {
            float width3 = (getWidth() - this.giftRectSize) / 2.0f;
            float f18 = this.textY + this.textHeight;
            if (isNewStyleButtonLayout()) {
                float dp6 = f18 + AndroidUtilities.dp(4.0f);
                AndroidUtilities.rectTmp.set(width3, dp6, this.giftRectSize + width3, this.backgroundRectHeight + dp6);
            } else {
                float dp7 = f18 + AndroidUtilities.dp(12.0f);
                RectF rectF4 = AndroidUtilities.rectTmp;
                float f19 = this.giftRectSize;
                rectF4.set(width3, dp7, width3 + f19, f19 + dp7 + this.giftPremiumAdditionalHeight);
            }
            if (messageObject2 != null && messageObject2.type == 18 && !this.giftPremiumTextCollapsed && (textLayout = this.giftPremiumText) != null && this.giftPremiumTextCollapsedHeight > 0) {
                AndroidUtilities.rectTmp.bottom -= (textLayout.layout.getHeight() - this.giftPremiumTextCollapsedHeight) * (1.0f - this.giftPremiumTextExpandedAnimated.get());
            }
            if (this.backgroundRect == null) {
                this.backgroundRect = new RectF();
            }
            this.backgroundRect.set(AndroidUtilities.rectTmp);
            canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
        }
        if (i >= 0) {
            paint3.setAlpha(i);
            paint4.setAlpha(i2);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.rippleView) {
            return super.drawChild(canvas, view, j);
        }
        float scale = this.bounce.getScale(0.02f);
        canvas.save();
        canvas.scale(scale, scale, view.getX() + (view.getMeasuredWidth() / 2.0f), view.getY() + (view.getMeasuredHeight() / 2.0f));
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public void drawOutboundsContent(Canvas canvas) {
        canvas.save();
        canvas.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        canvas.save();
        canvas.translate(this.textXLeft, this.textY);
        StaticLayout staticLayout = this.textLayout;
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? getAdaptiveEmojiColorFilter(staticLayout.getPaint().getColor()) : null);
        canvas.restore();
        if (this.starGiftLayout.has()) {
            canvas.save();
            canvas.translate((getWidth() - this.starGiftLayout.getWidth()) / 2.0f, this.starGiftLayout.repost ? AndroidUtilities.dp(4.0f) : this.textY + this.textHeight + AndroidUtilities.dp(16.0f));
            this.starGiftLayout.drawOutbounds(canvas);
            canvas.restore();
        }
        canvas.restore();
        if (this.topicSeparator != null) {
            float alpha = getAlpha();
            Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
            if (resourcesProvider != null) {
                resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + 0.0f);
            } else {
                Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + 0.0f);
            }
            this.topicSeparator.draw(canvas, getWidth(), this.sideMenuWidth, 0.0f, 1.0f, alpha, this.showTopicSeparator);
        }
    }

    public void drawReactions(Canvas canvas, boolean z, Integer num) {
        if (this.canDrawInParent) {
            if (hasGradientService() && !z) {
                return;
            }
            if (!hasGradientService() && z) {
                return;
            }
        }
        drawReactionsLayout(canvas, z, num);
    }

    public void drawReactionsLayout(Canvas canvas, boolean z, Integer num) {
        float alpha = z ? getAlpha() : 1.0f;
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isSmall || (this.transitionParams.animateChange && reactionsLayoutInBubble.animateHeight)) {
            reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f;
            if (alpha < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (255.0f * alpha), 31);
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble2.draw(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f, num);
            if (alpha < 1.0f) {
                canvas.restore();
            }
        }
    }

    public void drawReactionsLayoutOverlay(Canvas canvas, boolean z) {
        float alpha = z ? getAlpha() : 1.0f;
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
        if (!reactionsLayoutInBubble.isSmall || (this.transitionParams.animateChange && reactionsLayoutInBubble.animateHeight)) {
            reactionsLayoutInBubble.drawServiceShaderBackground = 1.0f;
            if (alpha < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (255.0f * alpha), 31);
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble2.drawOverlay(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f);
            if (alpha < 1.0f) {
                canvas.restore();
            }
        }
    }

    public void drawScrimReaction(Canvas canvas, Integer num, float f, boolean z) {
        if (this.reactionsLayoutInBubble.isSmall) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        this.reactionsLayoutInBubble.setScrimProgress(f, z);
        this.reactionsLayoutInBubble.draw(canvas, this.transitionParams.animateChangeProgress, num);
    }

    public void drawScrimReactionPreview(View view, Canvas canvas, int i, Integer num, float f) {
        if (this.reactionsLayoutInBubble.isSmall) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        this.reactionsLayoutInBubble.setScrimProgress(f);
        this.reactionsLayoutInBubble.drawPreview(view, canvas, i, num);
    }

    @Override // org.telegram.ui.Cells.BaseCell
    public int getBoundsLeft() {
        if (this.starGiftLayout.has()) {
            int width = ((int) (getWidth() - (this.starGiftLayout.getWidth() + AndroidUtilities.dp(8.0f)))) / 2;
            return this.starGiftLayout.repost ? width : Math.min(this.backgroundLeft, width);
        }
        if (isButtonLayout(this.currentMessageObject)) {
            return (this.sideMenuWidth / 2) + ((getWidth() - this.giftRectSize) / 2);
        }
        int i = this.backgroundLeft;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            i = Math.min((int) this.imageReceiver.getImageX(), i);
        }
        return (this.sideMenuWidth / 2) + i;
    }

    @Override // org.telegram.ui.Cells.BaseCell
    public int getBoundsRight() {
        if (this.starGiftLayout.has()) {
            int width = ((int) (getWidth() + (this.starGiftLayout.getWidth() + AndroidUtilities.dp(8.0f)))) / 2;
            return this.starGiftLayout.repost ? width : Math.max(this.backgroundRight, width);
        }
        if (isButtonLayout(this.currentMessageObject)) {
            return (this.sideMenuWidth / 2) + ((getWidth() + this.giftRectSize) / 2);
        }
        int i = this.backgroundRight;
        ImageReceiver imageReceiver = this.imageReceiver;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            i = Math.max((int) this.imageReceiver.getImageX2(), i);
        }
        return (this.sideMenuWidth / 2) + i;
    }

    public int getCustomDate() {
        return this.customDate;
    }

    public ChatActionCellDelegate getDelegate() {
        return this.delegate;
    }

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.TAG;
    }

    public ImageReceiver getPhotoImage() {
        return this.imageReceiver;
    }

    public ReactionsLayoutInBubble.ReactionButton getReactionButton(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        return this.reactionsLayoutInBubble.getReactionButton(visibleReaction);
    }

    protected Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public TransitionParams getTransitionParams() {
        return this.transitionParams;
    }

    public boolean hasButton() {
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || !isButtonLayout(messageObject) || this.giftPremiumButtonLayout == null) ? false : true;
    }

    public boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider;
        return this.overrideBackgroundPaint == null && ((resourcesProvider = this.themeDelegate) == null ? Theme.hasGradientService() : resourcesProvider.hasGradientService());
    }

    @Override // org.telegram.ui.Cells.BaseCell, android.view.View
    public void invalidate() {
        super.invalidate();
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.invalidateListener;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.invalidatesParent || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
        if (!this.invalidatesParent || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
        if (!this.invalidatesParent || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    public void invalidateOutbounds() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null && chatActionCellDelegate.canDrawOutboundsContent()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public boolean isCellAttachedToWindow() {
        return this.attachedToWindow;
    }

    public boolean isFloating() {
        return false;
    }

    public void markReactionsAsRead() {
        this.reactionsLayoutInBubble.hasUnreadReactions = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.markReactionsAsRead();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ChatActionCellDelegate chatActionCellDelegate;
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.imageReceiver.onAttachedToWindow();
        setStarsPaused(false);
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            textLayout.attach();
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 21) {
            setMessageObject(messageObject, true);
        }
        this.starGiftLayout.attach();
        this.reactionsLayoutInBubble.onAttachToWindow();
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null) {
            topicSeparator.attach();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        this.imageReceiver.onDetachedFromWindow();
        setStarsPaused(true);
        this.wasLayout = false;
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
        TextLayout textLayout = this.giftPremiumText;
        if (textLayout != null) {
            textLayout.detach();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        this.avatarStoryParams.onDetachFromWindow();
        this.transitionParams.onDetach();
        this.starGiftLayout.detach();
        this.reactionsLayoutInBubble.onDetachFromWindow();
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null) {
            topicSeparator.detach();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:354:0x0328, code lost:
    
        if (r0.getCurrentImageProgress() == 1.0f) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0365, code lost:
    
        r35.radialProgress.setIcon(3, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x035e, code lost:
    
        r35.radialProgress.setIcon(4, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x035c, code lost:
    
        if (r0 == 1.0f) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0b42  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b88  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0c26  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0c9e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0de5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0e4e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0e14  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0e20  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0e24  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0e18  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0dea  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0c35  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        int i;
        float f;
        float dp;
        int dp2;
        float dp3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Text text;
        TextLayout textLayout;
        StaticLayout staticLayout;
        Theme.ResourcesProvider resourcesProvider;
        boolean z;
        float clamp;
        Paint themedPaint;
        Theme.ResourcesProvider resourcesProvider2;
        boolean isDark;
        ColorMatrix colorMatrix;
        int i2;
        int i3;
        int i4;
        Text text2;
        ImageReceiver imageReceiver;
        float f7;
        float f8;
        int dp4;
        float f9;
        canvas.save();
        canvas.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        MessageObject messageObject = this.currentMessageObject;
        float f10 = this.giftPremiumTextExpandedAnimated.set(!this.giftPremiumTextCollapsed);
        int i5 = this.stickerSize;
        if (!this.starGiftLayout.has() && isButtonLayout(messageObject)) {
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (isNewStyleButtonLayout()) {
                i5 = getImageSize(messageObject);
                float f11 = (this.previousWidth - i5) / 2.0f;
                float dp5 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f);
                if (messageObject.isStoryMention()) {
                    this.avatarStoryParams.storyItem = messageObject.messageOwner.media.storyItem;
                }
                float f12 = i5;
                this.avatarStoryParams.originalAvatarRect.set(f11, dp5, f11 + f12, dp5 + f12);
                this.imageReceiver.setImageCoords(f11, dp5, f12, f12);
            } else {
                int i6 = messageObject.type;
                if (i6 == 11) {
                    ImageReceiver imageReceiver2 = this.imageReceiver;
                    int i7 = this.previousWidth;
                    float f13 = this.stickerSize;
                    imageReceiver2.setImageCoords((i7 - r4) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f), f13, f13);
                } else {
                    if (i6 == 25) {
                        i5 = (int) (this.stickerSize * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                    } else {
                        if (messageObject.isStarGiftAction()) {
                            imageReceiver = this.imageReceiver;
                            f7 = (this.previousWidth - i5) / 2.0f;
                            f9 = this.textY + this.textHeight + (this.giftRectSize * 0.075f) + AndroidUtilities.dp(2.0f);
                        } else {
                            if (messageObject.type == 30) {
                                i5 = (int) (this.stickerSize * 1.1f);
                                TLRPC.Message message = messageObject.messageOwner;
                                if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                                    imageReceiver = this.imageReceiver;
                                    f7 = (this.previousWidth - i5) / 2.0f;
                                    f8 = this.textY + this.textHeight + (this.giftRectSize * 0.075f);
                                    dp4 = AndroidUtilities.dp(12.0f);
                                }
                            } else {
                                i5 = (int) (this.stickerSize * 1.0f);
                                imageReceiver = this.imageReceiver;
                                f7 = (this.previousWidth - i5) / 2.0f;
                                f8 = this.textY + this.textHeight + (this.giftRectSize * 0.075f);
                                dp4 = AndroidUtilities.dp(4.0f);
                            }
                            f9 = f8 - dp4;
                        }
                        float f14 = i5;
                        imageReceiver.setImageCoords(f7, f9, f14, f14);
                    }
                    float f15 = i5;
                    this.imageReceiver.setImageCoords((this.previousWidth - i5) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(22.0f), f15, f15);
                }
            }
            TextPaint textPaint = (TextPaint) getThemedPaint("paintChatActionText");
            this.textPaint = textPaint;
            if (textPaint != null) {
                TextPaint textPaint2 = this.giftTitlePaint;
                if (textPaint2 != null && textPaint2.getColor() != this.textPaint.getColor()) {
                    this.giftTitlePaint.setColor(this.textPaint.getColor());
                }
                TextPaint textPaint3 = this.giftSubtitlePaint;
                if (textPaint3 != null && textPaint3.getColor() != this.textPaint.getColor()) {
                    this.giftSubtitlePaint.setColor(this.textPaint.getColor());
                    this.giftSubtitlePaint.linkColor = this.textPaint.getColor();
                }
                TextPaint textPaint4 = this.giftTextPaint;
                if (textPaint4 != null && textPaint4.getColor() != this.textPaint.getColor()) {
                    this.giftTextPaint.setColor(this.textPaint.getColor());
                    this.giftTextPaint.linkColor = this.textPaint.getColor();
                }
            }
        }
        int i8 = i5;
        drawBackground(canvas, false);
        if (this.starGiftLayout.has()) {
            canvas.save();
            float width = (getWidth() - this.starGiftLayout.getWidth()) / 2.0f;
            this.starGiftLayoutX = width;
            float dp6 = this.starGiftLayout.repost ? AndroidUtilities.dp(4.0f) : this.textY + this.textHeight + AndroidUtilities.dp(16.0f);
            this.starGiftLayoutY = dp6;
            canvas.translate(width, dp6);
            this.starGiftLayout.draw(canvas);
            ChatActionCellDelegate chatActionCellDelegate = this.delegate;
            if (chatActionCellDelegate == null || chatActionCellDelegate.canDrawOutboundsContent()) {
                this.starGiftLayout.drawOutbounds(canvas);
            }
            canvas.restore();
        } else if (isButtonLayout(messageObject) || (messageObject != null && messageObject.type == 11)) {
            if (this.wallpaperPreviewDrawable != null) {
                canvas.save();
                canvas.translate(this.imageReceiver.getImageX(), this.imageReceiver.getImageY());
                Path path = this.clipPath;
                if (path == null) {
                    this.clipPath = new Path();
                } else {
                    path.rewind();
                }
                this.clipPath.addCircle(this.imageReceiver.getImageWidth() / 2.0f, this.imageReceiver.getImageHeight() / 2.0f, this.imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                this.wallpaperPreviewDrawable.setBounds(0, 0, (int) this.imageReceiver.getImageWidth(), (int) this.imageReceiver.getImageHeight());
                this.wallpaperPreviewDrawable.draw(canvas);
                canvas.restore();
            } else if (messageObject.isStoryMention()) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                long j = messageMedia.user_id;
                StoriesUtilities.AvatarStoryParams avatarStoryParams = this.avatarStoryParams;
                avatarStoryParams.storyId = messageMedia.id;
                StoriesUtilities.drawAvatarWithStory(j, canvas, this.imageReceiver, avatarStoryParams);
            } else {
                this.imageReceiver.draw(canvas);
            }
            this.radialProgress.setProgressRect(this.imageReceiver.getImageX(), this.imageReceiver.getImageY(), this.imageReceiver.getImageX() + this.imageReceiver.getImageWidth(), this.imageReceiver.getImageY() + this.imageReceiver.getImageHeight());
            int i9 = messageObject.type;
            if (i9 == 21) {
                ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id);
                if (imageUpdater != null) {
                    this.radialProgress.setProgress(imageUpdater.getCurrentImageProgress(), true);
                    this.radialProgress.setCircleRadius(((int) (this.imageReceiver.getImageWidth() * 0.5f)) + 1);
                    this.radialProgress.setMaxIconSize(AndroidUtilities.dp(24.0f));
                    this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                }
            } else if (i9 == 22) {
                float uploadingInfoProgress = getUploadingInfoProgress(messageObject);
                this.radialProgress.setProgress(uploadingInfoProgress, true);
                this.radialProgress.setCircleRadius(AndroidUtilities.dp(26.0f));
                this.radialProgress.setMaxIconSize(AndroidUtilities.dp(24.0f));
                this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
            }
            this.radialProgress.draw(canvas);
        }
        if (this.textPaint == null || this.textLayout == null) {
            i = 22;
            f = 16.0f;
        } else {
            canvas.save();
            canvas.translate(this.textXLeft, this.textY);
            if (this.textLayout.getPaint() != this.textPaint) {
                buildLayout();
            }
            canvas.save();
            SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
            SpoilerEffect.layoutDrawMaybe(this.textLayout, canvas);
            ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
            if (chatActionCellDelegate2 == null || chatActionCellDelegate2.canDrawOutboundsContent()) {
                StaticLayout staticLayout2 = this.textLayout;
                i = 22;
                f = 16.0f;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout2, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout2 == null ? null : getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor()));
            } else {
                i = 22;
                f = 16.0f;
            }
            canvas.restore();
            for (SpoilerEffect spoilerEffect : this.spoilers) {
                spoilerEffect.setColor(this.textLayout.getPaint().getColor());
                spoilerEffect.draw(canvas);
            }
            canvas.restore();
        }
        if (this.textPaint != null && this.titleLayout != null) {
            canvas.save();
            canvas.translate(this.titleXLeft, this.textY - this.titleHeight);
            if (this.titleLayout.getPaint() != this.textPaint) {
                buildLayout();
            }
            canvas.save();
            SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
            SpoilerEffect.layoutDrawMaybe(this.titleLayout, canvas);
            ChatActionCellDelegate chatActionCellDelegate3 = this.delegate;
            if (chatActionCellDelegate3 == null || chatActionCellDelegate3.canDrawOutboundsContent()) {
                StaticLayout staticLayout3 = this.titleLayout;
                AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                List list = this.spoilers;
                StaticLayout staticLayout4 = this.textLayout;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, emojiGroupedSpans, 0.0f, list, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout4 == null ? null : getAdaptiveEmojiColorFilter(staticLayout4.getPaint().getColor()));
            }
            canvas.restore();
            for (SpoilerEffect spoilerEffect2 : this.spoilers) {
                spoilerEffect2.setColor(this.titleLayout.getPaint().getColor());
                spoilerEffect2.draw(canvas);
            }
            canvas.restore();
        }
        if (!this.starGiftLayout.has() && isButtonLayout(messageObject)) {
            canvas.save();
            float f16 = (this.previousWidth - this.giftRectSize) / 2.0f;
            if (messageObject.type != i) {
                f16 += AndroidUtilities.dp(8.0f);
            }
            float f17 = f16;
            if (isNewStyleButtonLayout()) {
                RectF rectF = this.backgroundRect;
                dp = rectF != null ? rectF.top : this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                dp2 = AndroidUtilities.dp(f);
                if (i8 > 0) {
                    dp2 = (dp2 * 2) + i8;
                }
            } else {
                float f18 = this.textY + this.textHeight + (this.giftRectSize * 0.075f);
                if (messageObject.type != 21) {
                    i8 = this.stickerSize;
                }
                dp = f18 + i8 + AndroidUtilities.dp(4.0f);
                if (messageObject.type == 21) {
                    dp += AndroidUtilities.dp(f);
                }
                if (messageObject.isStarGiftAction()) {
                    dp2 = AndroidUtilities.dp(12.0f);
                } else {
                    if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                        dp -= AndroidUtilities.dp(3.66f);
                    }
                    canvas.translate(f17, dp);
                    if (this.giftPremiumTitleLayout == null) {
                        canvas.save();
                        canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumTitleLayout.getWidth()) / 2.0f, 0.0f);
                        this.giftPremiumTitleLayout.draw(canvas);
                        canvas.restore();
                        float height = this.giftPremiumTitleLayout.getHeight() + dp;
                        if (this.giftPremiumSubtitleLayout != null) {
                            canvas.save();
                            canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumSubtitleLayout.getWidth()) / 2.0f, this.giftPremiumTitleLayout.getHeight() + AndroidUtilities.dp(4.0f));
                            this.giftPremiumSubtitleLayout.draw(canvas);
                            canvas.restore();
                            height += this.giftPremiumSubtitleLayout.getHeight() + AndroidUtilities.dp(10.0f);
                        }
                        dp3 = height + AndroidUtilities.dp(messageObject.type == 25 ? 6.0f : 0.0f);
                    } else {
                        dp3 = dp - AndroidUtilities.dp(4.0f);
                    }
                    f2 = dp3;
                    canvas.restore();
                    if (this.giftPremiumTitleLayout != null && (text2 = this.giftPremiumReleasedText) != null) {
                        float width2 = text2.getWidth() + AndroidUtilities.dp(12.0f);
                        float dp7 = (((this.giftRectSize - AndroidUtilities.dp(f)) - width2) / 2.0f) + f17;
                        float dp8 = AndroidUtilities.dp(14.0f) + dp + this.giftPremiumTitleLayout.getHeight();
                        if (this.giftReleasedBackgroundPaint == null) {
                            this.giftReleasedBackgroundPaint = new Paint(1);
                        }
                        this.giftReleasedBackgroundPaint.setColor(!Theme.isCurrentThemeDark() ? 285212671 : TLRPC.FLAG_28);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dp7, dp8 - AndroidUtilities.dp(8.0f), width2 + dp7, AndroidUtilities.dp(8.0f) + dp8);
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                        this.giftPremiumReleasedText.draw(canvas, dp7 + AndroidUtilities.dp(6.0f), dp8, -855638017, 1.0f);
                        f2 += AndroidUtilities.dp(24.0f);
                    }
                    float dp9 = f2 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 18) {
                        dp9 += AndroidUtilities.dp(2.0f);
                    }
                    canvas.save();
                    canvas.translate(f17, dp9);
                    if (messageObject.type != i) {
                        if (this.radialProgress.getTransitionProgress() == 1.0f) {
                            i2 = 4;
                            if (this.radialProgress.getIcon() != 4) {
                                f4 = f17;
                            } else if (this.giftPremiumText != null) {
                                canvas.save();
                                canvas.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                this.giftPremiumText.x = ((this.giftRectSize - r0.layout.getWidth()) / 2.0f) + f17;
                                this.giftPremiumText.y = dp9;
                                int color = this.giftTextPaint.getColor();
                                TextLayout textLayout2 = this.giftPremiumText;
                                f4 = f17;
                                SpoilerEffect.renderWithRipple(this, false, color, 0, textLayout2.patchedLayout, 1, textLayout2.layout, textLayout2.spoilers, canvas, false);
                                TextLayout textLayout3 = this.giftPremiumText;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout3.layout, textLayout3.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                canvas.restore();
                                f6 = 1.0f;
                                f5 = 0.0f;
                                canvas.restore();
                                if (this.giftPremiumTitleLayout == null) {
                                    AndroidUtilities.dp(8.0f);
                                }
                                textLayout = this.giftPremiumText;
                                if (textLayout != null) {
                                    AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, textLayout.layout.getHeight(), f10);
                                }
                                staticLayout = this.giftPremiumButtonLayout;
                                if (staticLayout != null) {
                                    staticLayout.getHeight();
                                }
                                getHeight();
                                AndroidUtilities.dp(8.0f);
                                resourcesProvider = this.themeDelegate;
                                if (resourcesProvider == null) {
                                    resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
                                } else {
                                    Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
                                }
                                float scale = this.bounce.getScale(0.02f);
                                canvas.save();
                                canvas.scale(scale, scale, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                if (this.giftPremiumButtonLayout != null) {
                                    canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(f), AndroidUtilities.dp(f), getThemedPaint("paintChatActionBackgroundSelected"));
                                    if (hasGradientService()) {
                                        canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(f), AndroidUtilities.dp(f), getThemedPaint("paintChatActionBackgroundDarken"));
                                    }
                                    if (this.dimAmount > f5) {
                                        canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(f), AndroidUtilities.dp(f), this.dimPaint);
                                    }
                                    if (getMessageObject().type == 21 || getMessageObject().type == 22 || getMessageObject().type == 24) {
                                        invalidate();
                                    } else {
                                        this.starsPath.rewind();
                                        this.starsPath.addRoundRect(this.giftButtonRect, AndroidUtilities.dp(f), AndroidUtilities.dp(f), Path.Direction.CW);
                                        canvas.save();
                                        canvas.clipPath(this.starsPath);
                                        this.starParticlesDrawable.onDraw(canvas);
                                        if (!this.starParticlesDrawable.paused) {
                                            invalidate();
                                        }
                                        canvas.restore();
                                    }
                                }
                                z = messageObject.settingAvatar;
                                if (z) {
                                    float f19 = this.progressToProgress;
                                    if (f19 != f6) {
                                        this.progressToProgress = f19 + 0.10666667f;
                                        clamp = Utilities.clamp(this.progressToProgress, f6, f5);
                                        this.progressToProgress = clamp;
                                        if (clamp != f5) {
                                            if (this.progressView == null) {
                                                this.progressView = new RadialProgressView(getContext());
                                            }
                                            int dp10 = AndroidUtilities.dp(f);
                                            canvas.save();
                                            float f20 = this.progressToProgress;
                                            canvas.scale(f20, f20, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                            this.progressView.setSize(dp10);
                                            this.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                                            this.progressView.draw(canvas, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                            canvas.restore();
                                        }
                                        if (this.progressToProgress != f6 && this.giftPremiumButtonLayout != null) {
                                            canvas.save();
                                            float f21 = f6 - this.progressToProgress;
                                            canvas.scale(f21, f21, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                            canvas.translate(f4, this.giftButtonRect.top + AndroidUtilities.dp(8.0f));
                                            canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumButtonLayout.getWidth()) / 2.0f, f5);
                                            this.giftPremiumButtonLayout.draw(canvas);
                                            canvas.restore();
                                        }
                                        if (messageObject.flickerLoading) {
                                            if (this.loadingDrawable == null) {
                                                LoadingDrawable loadingDrawable = new LoadingDrawable(this.themeDelegate);
                                                this.loadingDrawable = loadingDrawable;
                                                loadingDrawable.setGradientScale(2.0f);
                                                this.loadingDrawable.setAppearByGradient(true);
                                                this.loadingDrawable.setColors(Theme.multAlpha(-1, 0.08f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.7f));
                                                this.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(f6));
                                            }
                                            this.loadingDrawable.resetDisappear();
                                            this.loadingDrawable.setBounds(this.giftButtonRect);
                                            this.loadingDrawable.setRadiiDp(16.0f);
                                            this.loadingDrawable.draw(canvas);
                                        } else {
                                            LoadingDrawable loadingDrawable2 = this.loadingDrawable;
                                            if (loadingDrawable2 != null) {
                                                loadingDrawable2.setBounds(this.giftButtonRect);
                                                this.loadingDrawable.setRadiiDp(16.0f);
                                                this.loadingDrawable.disappear();
                                                this.loadingDrawable.draw(canvas);
                                                if (this.loadingDrawable.isDisappeared()) {
                                                    this.loadingDrawable.reset();
                                                }
                                            }
                                        }
                                        canvas.restore();
                                        if (this.backgroundRect != null && this.giftRibbonPath != null && this.giftRibbonText != null) {
                                            themedPaint = getThemedPaint("paintChatActionBackground");
                                            Paint themedPaint2 = getThemedPaint("paintChatActionBackgroundDarken");
                                            float dp11 = (this.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                            float dp12 = this.backgroundRect.top - AndroidUtilities.dp(2.0f);
                                            resourcesProvider2 = this.themeDelegate;
                                            if (resourcesProvider2 == null) {
                                                resourcesProvider2.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX + dp11, this.viewTop + AndroidUtilities.dp(4.0f) + dp12);
                                            } else {
                                                Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX + dp11, this.viewTop + AndroidUtilities.dp(4.0f) + dp12);
                                            }
                                            canvas.save();
                                            canvas.translate(dp11, dp12);
                                            ColorFilter colorFilter = themedPaint.getColorFilter();
                                            PathEffect pathEffect = themedPaint.getPathEffect();
                                            Theme.ResourcesProvider resourcesProvider3 = this.themeDelegate;
                                            isDark = resourcesProvider3 == null ? resourcesProvider3.isDark() : Theme.isCurrentThemeDark();
                                            if (this.giftRibbonPaintFilter != null || this.giftRibbonPaintFilterDark != isDark) {
                                                colorMatrix = new ColorMatrix();
                                                if ((themedPaint.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                                    ((ColorMatrixColorFilter) themedPaint.getColorFilter()).getColorMatrix(colorMatrix);
                                                }
                                                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !isDark ? 0.1f : -0.08f);
                                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !isDark ? 0.15f : 0.1f);
                                                this.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                                                this.giftRibbonPaintFilterDark = isDark;
                                            }
                                            themedPaint.setColorFilter(this.giftRibbonPaintFilter);
                                            themedPaint.setPathEffect(this.giftRibbonPaintEffect);
                                            canvas.drawPath(this.giftRibbonPath, themedPaint);
                                            themedPaint.setColorFilter(colorFilter);
                                            themedPaint.setPathEffect(pathEffect);
                                            if (hasGradientService()) {
                                                PathEffect pathEffect2 = themedPaint2.getPathEffect();
                                                themedPaint2.setPathEffect(this.giftRibbonPaintEffect);
                                                canvas.drawPath(this.giftRibbonPath, themedPaint2);
                                                themedPaint2.setPathEffect(pathEffect2);
                                            }
                                            canvas.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                            this.giftRibbonText.draw(canvas, AndroidUtilities.dp(40.43f) - (this.giftRibbonText.getCurrentWidth() / 2.0f), AndroidUtilities.dp(26.0f), -1, 1.0f);
                                            canvas.restore();
                                        }
                                    }
                                }
                                if (!z) {
                                    float f22 = this.progressToProgress;
                                    if (f22 != f5) {
                                        this.progressToProgress = f22 - 0.10666667f;
                                    }
                                }
                                clamp = Utilities.clamp(this.progressToProgress, f6, f5);
                                this.progressToProgress = clamp;
                                if (clamp != f5) {
                                }
                                if (this.progressToProgress != f6) {
                                    canvas.save();
                                    float f212 = f6 - this.progressToProgress;
                                    canvas.scale(f212, f212, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                    canvas.translate(f4, this.giftButtonRect.top + AndroidUtilities.dp(8.0f));
                                    canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumButtonLayout.getWidth()) / 2.0f, f5);
                                    this.giftPremiumButtonLayout.draw(canvas);
                                    canvas.restore();
                                }
                                if (messageObject.flickerLoading) {
                                }
                                canvas.restore();
                                if (this.backgroundRect != null) {
                                    themedPaint = getThemedPaint("paintChatActionBackground");
                                    Paint themedPaint22 = getThemedPaint("paintChatActionBackgroundDarken");
                                    float dp112 = (this.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                    float dp122 = this.backgroundRect.top - AndroidUtilities.dp(2.0f);
                                    resourcesProvider2 = this.themeDelegate;
                                    if (resourcesProvider2 == null) {
                                    }
                                    canvas.save();
                                    canvas.translate(dp112, dp122);
                                    ColorFilter colorFilter2 = themedPaint.getColorFilter();
                                    PathEffect pathEffect3 = themedPaint.getPathEffect();
                                    Theme.ResourcesProvider resourcesProvider32 = this.themeDelegate;
                                    if (resourcesProvider32 == null) {
                                    }
                                    if (this.giftRibbonPaintFilter != null) {
                                    }
                                    colorMatrix = new ColorMatrix();
                                    if (themedPaint.getColorFilter() instanceof ColorMatrixColorFilter) {
                                        ((ColorMatrixColorFilter) themedPaint.getColorFilter()).getColorMatrix(colorMatrix);
                                    }
                                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !isDark ? 0.1f : -0.08f);
                                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !isDark ? 0.15f : 0.1f);
                                    this.giftRibbonPaintFilter = new ColorMatrixColorFilter(colorMatrix);
                                    this.giftRibbonPaintFilterDark = isDark;
                                    themedPaint.setColorFilter(this.giftRibbonPaintFilter);
                                    themedPaint.setPathEffect(this.giftRibbonPaintEffect);
                                    canvas.drawPath(this.giftRibbonPath, themedPaint);
                                    themedPaint.setColorFilter(colorFilter2);
                                    themedPaint.setPathEffect(pathEffect3);
                                    if (hasGradientService()) {
                                    }
                                    canvas.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                    this.giftRibbonText.draw(canvas, AndroidUtilities.dp(40.43f) - (this.giftRibbonText.getCurrentWidth() / 2.0f), AndroidUtilities.dp(26.0f), -1, 1.0f);
                                    canvas.restore();
                                }
                            } else {
                                f4 = f17;
                                f6 = 1.0f;
                                f5 = 0.0f;
                                canvas.restore();
                                if (this.giftPremiumTitleLayout == null) {
                                }
                                textLayout = this.giftPremiumText;
                                if (textLayout != null) {
                                }
                                staticLayout = this.giftPremiumButtonLayout;
                                if (staticLayout != null) {
                                }
                                getHeight();
                                AndroidUtilities.dp(8.0f);
                                resourcesProvider = this.themeDelegate;
                                if (resourcesProvider == null) {
                                }
                                float scale2 = this.bounce.getScale(0.02f);
                                canvas.save();
                                canvas.scale(scale2, scale2, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                if (this.giftPremiumButtonLayout != null) {
                                }
                                z = messageObject.settingAvatar;
                                if (z) {
                                }
                                if (!z) {
                                }
                                clamp = Utilities.clamp(this.progressToProgress, f6, f5);
                                this.progressToProgress = clamp;
                                if (clamp != f5) {
                                }
                                if (this.progressToProgress != f6) {
                                }
                                if (messageObject.flickerLoading) {
                                }
                                canvas.restore();
                                if (this.backgroundRect != null) {
                                }
                            }
                        } else {
                            f4 = f17;
                            i2 = 4;
                        }
                        if (this.settingWallpaperLayout == null) {
                            TextPaint textPaint5 = new TextPaint();
                            this.settingWallpaperPaint = textPaint5;
                            textPaint5.setTextSize(AndroidUtilities.dp(13.0f));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                            int indexOf = spannableStringBuilder.toString().indexOf("...");
                            if (indexOf < 0) {
                                indexOf = spannableStringBuilder.toString().indexOf("…");
                                i4 = 1;
                            } else {
                                i4 = 3;
                            }
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString("…");
                                UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                                uploadingDotsSpannable.fixTop = true;
                                uploadingDotsSpannable.setParent(this, false);
                                spannableString.setSpan(uploadingDotsSpannable, 0, spannableString.length(), 33);
                                spannableStringBuilder.replace(indexOf, i4 + indexOf, (CharSequence) spannableString);
                            }
                            TextPaint textPaint6 = this.settingWallpaperPaint;
                            TextLayout textLayout4 = this.giftPremiumText;
                            this.settingWallpaperLayout = new StaticLayout(spannableStringBuilder, textPaint6, textLayout4 == null ? 1 : textLayout4.width, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        float uploadingInfoProgress2 = getUploadingInfoProgress(messageObject);
                        if (this.settingWallpaperProgressTextLayout == null || this.settingWallpaperProgress != uploadingInfoProgress2) {
                            this.settingWallpaperProgress = uploadingInfoProgress2;
                            String str = ((int) (uploadingInfoProgress2 * 100.0f)) + "%";
                            TextPaint textPaint7 = this.giftTextPaint;
                            TextLayout textLayout5 = this.giftPremiumText;
                            this.settingWallpaperProgressTextLayout = new StaticLayout(str, textPaint7, textLayout5 == null ? 1 : textLayout5.width, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        this.settingWallpaperPaint.setColor(this.giftTextPaint.getColor());
                        if (this.radialProgress.getIcon() == i2) {
                            float transitionProgress = this.radialProgress.getTransitionProgress();
                            int color2 = this.giftTextPaint.getColor();
                            float f23 = 1.0f - transitionProgress;
                            this.settingWallpaperPaint.setAlpha((int) (Color.alpha(color2) * f23));
                            this.giftTextPaint.setAlpha((int) (Color.alpha(color2) * transitionProgress));
                            TextPaint textPaint8 = this.giftTextPaint;
                            textPaint8.linkColor = textPaint8.getColor();
                            if (this.giftPremiumText != null) {
                                float f24 = (transitionProgress * 0.2f) + 0.8f;
                                canvas.save();
                                canvas.scale(f24, f24, this.giftRectSize / 2.0f, this.giftPremiumText.layout.getHeight() / 2.0f);
                                canvas.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                float f25 = f4;
                                this.giftPremiumText.x = ((this.giftRectSize - r0.layout.getWidth()) / 2.0f) + f25;
                                this.giftPremiumText.y = dp9;
                                int color3 = this.giftTextPaint.getColor();
                                TextLayout textLayout6 = this.giftPremiumText;
                                f3 = f25;
                                i3 = color2;
                                SpoilerEffect.renderWithRipple(this, false, color3, 0, textLayout6.patchedLayout, 1, textLayout6.layout, textLayout6.spoilers, canvas, false);
                                TextLayout textLayout7 = this.giftPremiumText;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout7.layout, textLayout7.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                canvas.restore();
                            } else {
                                i3 = color2;
                                f3 = f4;
                            }
                            this.giftTextPaint.setAlpha((int) (Color.alpha(i3) * f23));
                            TextPaint textPaint9 = this.giftTextPaint;
                            textPaint9.linkColor = textPaint9.getColor();
                            float f26 = (f23 * 0.2f) + 0.8f;
                            canvas.save();
                            canvas.scale(f26, f26, this.giftRectSize / 2.0f, this.settingWallpaperLayout.getHeight() / 2.0f);
                            canvas.translate((this.giftRectSize - this.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                            SpoilerEffect.layoutDrawMaybe(this.settingWallpaperLayout, canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(0.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                            canvas.scale(f26, f26, this.giftRectSize / 2.0f, this.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                            canvas.translate((this.giftRectSize - this.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, 0.0f);
                            SpoilerEffect.layoutDrawMaybe(this.settingWallpaperProgressTextLayout, canvas);
                            canvas.restore();
                            int i10 = i3;
                            this.giftTextPaint.setColor(i10);
                            this.giftTextPaint.linkColor = i10;
                        } else {
                            canvas.save();
                            canvas.translate((this.giftRectSize - this.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                            this.settingWallpaperLayout.draw(canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate((this.giftRectSize - this.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                            SpoilerEffect.layoutDrawMaybe(this.settingWallpaperProgressTextLayout, canvas);
                            canvas.restore();
                            f6 = 1.0f;
                            f5 = 0.0f;
                            canvas.restore();
                            if (this.giftPremiumTitleLayout == null) {
                            }
                            textLayout = this.giftPremiumText;
                            if (textLayout != null) {
                            }
                            staticLayout = this.giftPremiumButtonLayout;
                            if (staticLayout != null) {
                            }
                            getHeight();
                            AndroidUtilities.dp(8.0f);
                            resourcesProvider = this.themeDelegate;
                            if (resourcesProvider == null) {
                            }
                            float scale22 = this.bounce.getScale(0.02f);
                            canvas.save();
                            canvas.scale(scale22, scale22, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                            if (this.giftPremiumButtonLayout != null) {
                            }
                            z = messageObject.settingAvatar;
                            if (z) {
                            }
                            if (!z) {
                            }
                            clamp = Utilities.clamp(this.progressToProgress, f6, f5);
                            this.progressToProgress = clamp;
                            if (clamp != f5) {
                            }
                            if (this.progressToProgress != f6) {
                            }
                            if (messageObject.flickerLoading) {
                            }
                            canvas.restore();
                            if (this.backgroundRect != null) {
                            }
                        }
                    } else {
                        f3 = f17;
                        TextLayout textLayout8 = this.giftPremiumText;
                        if (textLayout8 != null) {
                            float height2 = textLayout8.layout.getHeight();
                            if (f10 < 1.0f) {
                                height2 = AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, height2, f10);
                                RectF rectF3 = AndroidUtilities.rectTmp;
                                rectF3.set(0.0f, -AndroidUtilities.dp(20.0f), getWidth(), height2);
                                canvas.saveLayerAlpha(rectF3, NotificationCenter.reloadInterface, 31);
                            } else {
                                canvas.save();
                            }
                            float f27 = height2;
                            canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                            this.giftPremiumText.x = f3 + (((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth()) / 2.0f);
                            TextLayout textLayout9 = this.giftPremiumText;
                            textLayout9.y = dp9;
                            int color4 = textLayout9.paint.getColor();
                            TextLayout textLayout10 = this.giftPremiumText;
                            f4 = f3;
                            f5 = 0.0f;
                            SpoilerEffect.renderWithRipple(this, false, color4, 0, textLayout10.patchedLayout, 1, textLayout10.layout, textLayout10.spoilers, canvas, false);
                            TextLayout textLayout11 = this.giftPremiumText;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout11.layout, textLayout11.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                            f6 = 1.0f;
                            if (f10 < 1.0f && this.giftPremiumTextMore != null) {
                                canvas.save();
                                if (this.giftPremiumTextClip == null) {
                                    this.giftPremiumTextClip = new GradientClip();
                                }
                                canvas.translate((-((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth())) / 2.0f, 0.0f);
                                RectF rectF4 = AndroidUtilities.rectTmp;
                                rectF4.set((this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), (this.giftPremiumTextMoreY - this.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), this.giftPremiumTextMoreX + AndroidUtilities.dp(6.0f), this.giftPremiumTextMoreY);
                                float f28 = 1.0f - f10;
                                this.giftPremiumTextClip.clipOut(canvas, rectF4, f28);
                                rectF4.set((this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(f), (this.giftPremiumTextMoreY - this.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), this.giftPremiumTextMoreY);
                                this.giftPremiumTextClip.draw(canvas, rectF4, 2, f28);
                                rectF4.set(0.0f, f27 - AndroidUtilities.dp(12.0f), getWidth(), f27);
                                this.giftPremiumTextClip.draw(canvas, rectF4, 3, f28 * 4.0f * (1.0f - f28));
                                canvas.restore();
                            }
                            canvas.restore();
                            if (f10 < 1.0f && (text = this.giftPremiumTextMore) != null) {
                                text.draw(canvas, AndroidUtilities.dp(5.0f) + (this.giftPremiumTextMoreX - text.getCurrentWidth()), (this.giftPremiumTextMoreY - (this.giftPremiumTextMoreH / 2.0f)) - AndroidUtilities.dp(1.0f), this.giftPremiumText.paint.getColor(), 1.0f - f10);
                            }
                            canvas.restore();
                            if (this.giftPremiumTitleLayout == null) {
                            }
                            textLayout = this.giftPremiumText;
                            if (textLayout != null) {
                            }
                            staticLayout = this.giftPremiumButtonLayout;
                            if (staticLayout != null) {
                            }
                            getHeight();
                            AndroidUtilities.dp(8.0f);
                            resourcesProvider = this.themeDelegate;
                            if (resourcesProvider == null) {
                            }
                            float scale222 = this.bounce.getScale(0.02f);
                            canvas.save();
                            canvas.scale(scale222, scale222, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                            if (this.giftPremiumButtonLayout != null) {
                            }
                            z = messageObject.settingAvatar;
                            if (z) {
                            }
                            if (!z) {
                            }
                            clamp = Utilities.clamp(this.progressToProgress, f6, f5);
                            this.progressToProgress = clamp;
                            if (clamp != f5) {
                            }
                            if (this.progressToProgress != f6) {
                            }
                            if (messageObject.flickerLoading) {
                            }
                            canvas.restore();
                            if (this.backgroundRect != null) {
                            }
                        }
                    }
                    f4 = f3;
                    f6 = 1.0f;
                    f5 = 0.0f;
                    canvas.restore();
                    if (this.giftPremiumTitleLayout == null) {
                    }
                    textLayout = this.giftPremiumText;
                    if (textLayout != null) {
                    }
                    staticLayout = this.giftPremiumButtonLayout;
                    if (staticLayout != null) {
                    }
                    getHeight();
                    AndroidUtilities.dp(8.0f);
                    resourcesProvider = this.themeDelegate;
                    if (resourcesProvider == null) {
                    }
                    float scale2222 = this.bounce.getScale(0.02f);
                    canvas.save();
                    canvas.scale(scale2222, scale2222, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                    if (this.giftPremiumButtonLayout != null) {
                    }
                    z = messageObject.settingAvatar;
                    if (z) {
                    }
                    if (!z) {
                    }
                    clamp = Utilities.clamp(this.progressToProgress, f6, f5);
                    this.progressToProgress = clamp;
                    if (clamp != f5) {
                    }
                    if (this.progressToProgress != f6) {
                    }
                    if (messageObject.flickerLoading) {
                    }
                    canvas.restore();
                    if (this.backgroundRect != null) {
                    }
                }
            }
            dp += dp2;
            canvas.translate(f17, dp);
            if (this.giftPremiumTitleLayout == null) {
            }
            f2 = dp3;
            canvas.restore();
            if (this.giftPremiumTitleLayout != null) {
                float width22 = text2.getWidth() + AndroidUtilities.dp(12.0f);
                float dp72 = (((this.giftRectSize - AndroidUtilities.dp(f)) - width22) / 2.0f) + f17;
                float dp82 = AndroidUtilities.dp(14.0f) + dp + this.giftPremiumTitleLayout.getHeight();
                if (this.giftReleasedBackgroundPaint == null) {
                }
                this.giftReleasedBackgroundPaint.setColor(!Theme.isCurrentThemeDark() ? 285212671 : TLRPC.FLAG_28);
                RectF rectF22 = AndroidUtilities.rectTmp;
                rectF22.set(dp72, dp82 - AndroidUtilities.dp(8.0f), width22 + dp72, AndroidUtilities.dp(8.0f) + dp82);
                canvas.drawRoundRect(rectF22, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                this.giftPremiumReleasedText.draw(canvas, dp72 + AndroidUtilities.dp(6.0f), dp82, -855638017, 1.0f);
                f2 += AndroidUtilities.dp(24.0f);
            }
            float dp92 = f2 + AndroidUtilities.dp(4.0f);
            if (messageObject.type == 18) {
            }
            canvas.save();
            canvas.translate(f17, dp92);
            if (messageObject.type != i) {
            }
            f4 = f3;
            f6 = 1.0f;
            f5 = 0.0f;
            canvas.restore();
            if (this.giftPremiumTitleLayout == null) {
            }
            textLayout = this.giftPremiumText;
            if (textLayout != null) {
            }
            staticLayout = this.giftPremiumButtonLayout;
            if (staticLayout != null) {
            }
            getHeight();
            AndroidUtilities.dp(8.0f);
            resourcesProvider = this.themeDelegate;
            if (resourcesProvider == null) {
            }
            float scale22222 = this.bounce.getScale(0.02f);
            canvas.save();
            canvas.scale(scale22222, scale22222, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
            if (this.giftPremiumButtonLayout != null) {
            }
            z = messageObject.settingAvatar;
            if (z) {
            }
            if (!z) {
            }
            clamp = Utilities.clamp(this.progressToProgress, f6, f5);
            this.progressToProgress = clamp;
            if (clamp != f5) {
            }
            if (this.progressToProgress != f6) {
            }
            if (messageObject.flickerLoading) {
            }
            canvas.restore();
            if (this.backgroundRect != null) {
            }
        }
        drawReactions(canvas, false, null);
        this.transitionParams.recordDrawingState();
        canvas.restore();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public void onFailedDownload(String str, boolean z) {
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.currentMessageObject;
        if (TextUtils.isEmpty(this.customText) && messageObject == null) {
            return;
        }
        if (this.accessibilityText == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.customText) ? this.customText : messageObject.messageText);
            for (final CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: org.telegram.ui.Cells.ChatActionCell.1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        if (ChatActionCell.this.delegate != null) {
                            ChatActionCell.this.openLink(characterStyle);
                        }
                    }
                }, spanStart, spanEnd, 33);
            }
            this.accessibilityText = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.accessibilityText.toString());
        } else {
            accessibilityNodeInfo.setText(this.accessibilityText);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.rippleView;
        RectF rectF = this.giftButtonRect;
        view.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // org.telegram.ui.Cells.BaseCell
    protected boolean onLongPress() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            return chatActionCellDelegate.didLongPress(this, this.lastTouchX, this.lastTouchY);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0413, code lost:
    
        if (r3.isEmpty != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        if (r3.isEmpty == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0415, code lost:
    
        r3.totalHeight = r3.height + org.telegram.messenger.AndroidUtilities.dp(8.0f);
        r7 = r7 + r21.reactionsLayoutInBubble.totalHeight;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        float dp;
        float dp2;
        int i4;
        float f;
        int dp3;
        int i5;
        TLRPC.Message message;
        int dp4;
        ReactionsLayoutInBubble reactionsLayoutInBubble;
        int i6;
        int dp5;
        int i7;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null && this.customText == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.topicSeparatorTopPadding + this.textHeight + AndroidUtilities.dp(14.0f));
            return;
        }
        if (isButtonLayout(messageObject)) {
            this.giftRectSize = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if (!AndroidUtilities.isTablet() && ((i7 = messageObject.type) == 18 || i7 == 30 || isMessageActionSuggestedPostApproval())) {
                this.giftRectSize = (int) (this.giftRectSize * 1.2f);
            }
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (isNewStyleButtonLayout()) {
                this.imageReceiver.setRoundRadius(this.stickerSize / 2);
            } else {
                this.imageReceiver.setRoundRadius(0);
            }
        }
        int max = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i));
        if (this.previousWidth != max) {
            this.wasLayout = true;
            this.previousWidth = max;
            buildLayout();
        }
        if (messageObject != null) {
            if (messageObject.type == 11) {
                i6 = AndroidUtilities.roundMessageSize;
                dp5 = AndroidUtilities.dp(10.0f);
            } else if (isButtonLayout(messageObject)) {
                i6 = this.giftRectSize;
                dp5 = AndroidUtilities.dp(12.0f);
            }
            i3 = i6 + dp5;
            if (!this.starGiftLayout.has()) {
                r7 = (this.starGiftLayout.repost ? 0 : this.textY + this.textHeight + AndroidUtilities.dp(16.0f)) + ((int) this.starGiftLayout.getHeight()) + AndroidUtilities.dp(8.0f);
                reactionsLayoutInBubble = this.reactionsLayoutInBubble;
            } else if (isButtonLayout(messageObject)) {
                boolean isGiftChannel = isGiftChannel(messageObject);
                int imageSize = getImageSize(messageObject);
                boolean isNewStyleButtonLayout = isNewStyleButtonLayout();
                int i8 = this.textY + this.textHeight;
                if (isNewStyleButtonLayout) {
                    int dp6 = i8 + AndroidUtilities.dp(4.0f);
                    int dp7 = AndroidUtilities.dp(16.0f);
                    if (imageSize > 0) {
                        dp7 = (dp7 * 2) + imageSize;
                    }
                    int i9 = dp6 + dp7;
                    TextLayout textLayout = this.giftPremiumText;
                    dp = i9 + (textLayout == null ? 0 : textLayout.layout.getHeight() + AndroidUtilities.dp(4.0f));
                } else {
                    dp = i8 + (this.giftRectSize * 0.075f) + imageSize + AndroidUtilities.dp(4.0f) + (this.giftPremiumText == null ? 0 : r5.layout.getHeight() + AndroidUtilities.dp(4.0f));
                }
                this.giftPremiumAdditionalHeight = 0;
                if (this.giftPremiumTitleLayout != null) {
                    float height = dp + r5.getHeight();
                    if (this.giftPremiumTitleLayout.getLineCount() > 1) {
                        this.giftPremiumAdditionalHeight += this.giftPremiumTitleLayout.getHeight() - this.giftPremiumTitleLayout.getLineTop(1);
                    }
                    dp2 = height + AndroidUtilities.dp(isGiftChannel ? 6.0f : 0.0f);
                    if (this.giftPremiumSubtitleLayout != null) {
                        dp2 += r3.getHeight() + AndroidUtilities.dp(9.0f);
                    }
                    if (this.giftPremiumReleasedText != null) {
                        dp2 += AndroidUtilities.dp(24.0f);
                    }
                } else {
                    dp2 = dp - AndroidUtilities.dp(12.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(30.0f);
                }
                TextLayout textLayout2 = this.giftPremiumText;
                int height2 = textLayout2 == null ? 0 : textLayout2.layout.getHeight();
                if (this.giftPremiumText == null) {
                    this.giftPremiumAdditionalHeight = 0;
                } else {
                    if (this.giftPremiumSubtitleLayout != null) {
                        i4 = this.giftPremiumAdditionalHeight;
                        dp3 = AndroidUtilities.dp(10.0f) + height2;
                    } else {
                        MessageObject messageObject2 = this.currentMessageObject;
                        if (messageObject2.type == 18 || messageObject2.isStarGiftAction()) {
                            i4 = this.giftPremiumAdditionalHeight;
                            f = this.giftPremiumButtonLayout == null ? 0.0f : 10.0f;
                        } else if (this.currentMessageObject.type == 30) {
                            i4 = this.giftPremiumAdditionalHeight;
                            f = 20.0f;
                        } else if (this.giftPremiumTextCollapsed) {
                            i5 = this.giftPremiumAdditionalHeight + height2;
                            this.giftPremiumAdditionalHeight = i5;
                        } else if (this.giftPremiumText.layout.getLineCount() > 2) {
                            i4 = this.giftPremiumAdditionalHeight;
                            dp3 = ((this.giftPremiumText.layout.getLineBottom(0) - this.giftPremiumText.layout.getLineTop(0)) * this.giftPremiumText.layout.getLineCount()) - 2;
                        }
                        dp3 = height2 - AndroidUtilities.dp(f);
                    }
                    i5 = i4 + dp3;
                    this.giftPremiumAdditionalHeight = i5;
                }
                if (this.giftPremiumReleasedText != null) {
                    this.giftPremiumAdditionalHeight += AndroidUtilities.dp(24.0f);
                }
                int dp8 = this.giftPremiumAdditionalHeight - AndroidUtilities.dp(isGiftChannel ? 14.0f : 0.0f);
                this.giftPremiumAdditionalHeight = dp8;
                i3 += dp8;
                int dp9 = this.textHeight + i3 + AndroidUtilities.dp(14.0f);
                if (this.giftPremiumButtonLayout != null) {
                    float height3 = dp2 + ((((dp9 - dp2) - r9.getHeight()) - AndroidUtilities.dp(8.0f)) / 2.0f);
                    if (this.currentMessageObject.isStarGiftAction()) {
                        height3 += AndroidUtilities.dp(4.0f);
                    }
                    float f2 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    this.giftButtonRect.set(f2 - AndroidUtilities.dp(18.0f), height3 - AndroidUtilities.dp(8.0f), f2 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), height3 + (this.giftPremiumButtonLayout != null ? r11.getHeight() : 0) + AndroidUtilities.dp(8.0f));
                } else {
                    i3 -= AndroidUtilities.dp(40.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(40.0f);
                    MessageObject messageObject3 = this.currentMessageObject;
                    if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        i3 -= AndroidUtilities.dp(8.0f);
                        this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(8.0f);
                    }
                }
                int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                this.starParticlesDrawable.rect.set(this.giftButtonRect);
                this.starParticlesDrawable.rect2.set(this.giftButtonRect);
                if (this.starsSize != measuredWidth) {
                    this.starsSize = measuredWidth;
                    this.starParticlesDrawable.resetPositions();
                }
                if (isNewStyleButtonLayout()) {
                    int dp10 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                    this.backgroundRectHeight = 0;
                    int dp11 = AndroidUtilities.dp(16.0f);
                    if (imageSize > 0) {
                        dp11 = (dp11 * 2) + imageSize;
                    }
                    this.backgroundRectHeight = dp11;
                    StaticLayout staticLayout = this.giftPremiumSubtitleLayout;
                    if (staticLayout != null) {
                        this.backgroundRectHeight = dp11 + staticLayout.getHeight() + AndroidUtilities.dp(10.0f);
                    }
                    if (this.giftPremiumReleasedText != null) {
                        this.backgroundRectHeight += AndroidUtilities.dp(24.0f);
                    }
                    int i10 = this.backgroundRectHeight + height2;
                    this.backgroundRectHeight = i10;
                    float f3 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    if (this.giftPremiumButtonLayout != null) {
                        this.backgroundButtonTop = i10 + dp10 + AndroidUtilities.dp(10.0f);
                        this.giftButtonRect.set(f3 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f3 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + this.giftPremiumButtonLayout.getHeight() + (AndroidUtilities.dp(8.0f) * 2));
                        dp4 = (int) (this.backgroundRectHeight + AndroidUtilities.dp(10.0f) + this.giftButtonRect.height());
                    } else {
                        if (!isMessageActionSuggestedPostApproval()) {
                            this.giftButtonRect.set(f3 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f3 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + AndroidUtilities.dp(17.0f) + (AndroidUtilities.dp(8.0f) * 2));
                            dp4 = this.backgroundRectHeight + AndroidUtilities.dp(17.0f);
                        }
                        int dp12 = this.backgroundRectHeight + AndroidUtilities.dp(16.0f);
                        this.backgroundRectHeight = dp12;
                        r7 = dp10 + dp12 + AndroidUtilities.dp(6.0f);
                        reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                    }
                    this.backgroundRectHeight = dp4;
                    int dp122 = this.backgroundRectHeight + AndroidUtilities.dp(16.0f);
                    this.backgroundRectHeight = dp122;
                    r7 = dp10 + dp122 + AndroidUtilities.dp(6.0f);
                    reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                }
            }
            if (this.currentMessageObject != null) {
                ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
                if (!reactionsLayoutInBubble2.isEmpty) {
                    reactionsLayoutInBubble2.totalHeight = reactionsLayoutInBubble2.height + AndroidUtilities.dp(8.0f);
                    i3 += this.reactionsLayoutInBubble.totalHeight;
                }
            }
            if (isMessageActionSuggestedPostApproval()) {
                i3 += this.titleHeight + AndroidUtilities.dp(24.0f);
            }
            setMeasuredDimension(max, (messageObject == null && isNewStyleButtonLayout()) ? this.topicSeparatorTopPadding + r7 : this.topicSeparatorTopPadding + this.textHeight + i3 + AndroidUtilities.dp(14.0f));
            this.reactionsLayoutInBubble.y = (getMeasuredHeight() - getPaddingTop()) - this.reactionsLayoutInBubble.totalHeight;
        }
        i3 = 0;
        if (!this.starGiftLayout.has()) {
        }
        if (this.currentMessageObject != null) {
        }
        if (isMessageActionSuggestedPostApproval()) {
        }
        setMeasuredDimension(max, (messageObject == null && isNewStyleButtonLayout()) ? this.topicSeparatorTopPadding + r7 : this.topicSeparatorTopPadding + this.textHeight + i3 + AndroidUtilities.dp(14.0f));
        this.reactionsLayoutInBubble.y = (getMeasuredHeight() - getPaddingTop()) - this.reactionsLayoutInBubble.totalHeight;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public void onProgressDownload(String str, long j, long j2) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.type != 11) {
            return;
        }
        int size = messageObject.photoThumbs.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                photoSize = null;
                break;
            }
            photoSize = messageObject.photoThumbs.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i++;
            }
        }
        this.imageReceiver.setImage(this.currentVideoLocation, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.avatarDrawable, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0170, code lost:
    
        if (r3.contains(r8, r9) == false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ImageUpdater imageUpdater;
        TextLayout textLayout;
        boolean z;
        TextLayout textLayout2;
        TLRPC.Message message;
        boolean z2;
        StaticLayout staticLayout;
        List list;
        boolean z3;
        TLRPC.Message message2;
        int i;
        boolean z4 = true;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return super.onTouchEvent(motionEvent);
        }
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null && topicSeparator.onTouchEvent(motionEvent, false)) {
            return true;
        }
        if ((this.starGiftLayout.has() && this.starGiftLayout.onTouchEvent(this.starGiftLayoutX, this.starGiftLayoutY, motionEvent)) || this.reactionsLayoutInBubble.checkTouchEvent(motionEvent)) {
            return true;
        }
        float x = motionEvent.getX() - (this.sideMenuWidth / 2.0f);
        this.lastTouchX = x;
        float y = motionEvent.getY() + getPaddingTop();
        this.lastTouchY = y;
        if (motionEvent.getAction() == 0) {
            if (this.delegate != null) {
                if ((messageObject.type == 11 || isButtonLayout(messageObject)) && this.imageReceiver.isInsideImage(x, y)) {
                    this.imagePressed = true;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.radialProgress.getIcon() == 4 && (((i = messageObject.type) == 21 || i == 22) && this.backgroundRect.contains(x, y))) {
                    this.imagePressed = true;
                    z3 = true;
                }
                TextLayout textLayout3 = this.giftPremiumText;
                if (textLayout3 != null && this.giftPremiumTextCollapsed) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f = textLayout3.x;
                    rectF.set(f, textLayout3.y, textLayout3.layout.getWidth() + f, this.giftPremiumText.y + r14.layout.getHeight());
                    if (rectF.contains(x, y)) {
                        this.textPressed = true;
                        z3 = true;
                    }
                }
                if (isButtonLayout(messageObject) && this.giftPremiumButtonLayout != null && (this.giftButtonRect.contains(x, y) || (this.buttonClickableAsImage && this.backgroundRect.contains(x, y)))) {
                    View view = this.rippleView;
                    this.giftButtonPressed = true;
                    view.setPressed(true);
                    this.bounce.setPressed(true);
                    z3 = true;
                }
                if (!z3 && isMessageActionSuggestedPostApproval()) {
                    this.textPressed = true;
                    z3 = true;
                }
                if (!z3) {
                    MessageObject messageObject2 = this.currentMessageObject;
                    if (TlUtils.isInstance((messageObject2 == null || (message2 = messageObject2.messageOwner) == null) ? null : message2.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                        this.textPressed = true;
                        z3 = true;
                    }
                }
                if (z3) {
                    startCheckLongPress();
                }
                z2 = z3;
            }
            z2 = false;
        } else {
            if (motionEvent.getAction() != 2) {
                cancelCheckLongPress();
            }
            if (this.textPressed) {
                int action = motionEvent.getAction();
                if (action == 1) {
                    View view2 = this.rippleView;
                    this.textPressed = false;
                    view2.setPressed(false);
                    this.bounce.setPressed(false);
                    if (this.delegate != null && messageObject.replyMessageObject != null && (message = messageObject.messageOwner) != null && TlUtils.isInstance(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                        this.delegate.didPressReplyMessage(this, this.currentMessageObject.getReplyMsgId());
                    } else if (this.giftPremiumTextCollapsed && !this.giftPremiumTextUncollapsed && (textLayout2 = this.giftPremiumText) != null) {
                        int height = textLayout2.layout.getHeight() - this.giftPremiumTextCollapsedHeight;
                        this.giftPremiumTextUncollapsed = true;
                        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
                        if (chatActionCellDelegate != null) {
                            chatActionCellDelegate.forceUpdate(this, false);
                            if (getParent() instanceof RecyclerListView) {
                                ((RecyclerListView) getParent()).smoothScrollBy(0, height + AndroidUtilities.dp(24.0f));
                            }
                        }
                        return true;
                    }
                } else if (action == 2) {
                    TextLayout textLayout4 = this.giftPremiumText;
                    if (textLayout4 != null && this.giftPremiumTextCollapsed) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f2 = textLayout4.x;
                        rectF2.set(f2, textLayout4.y, textLayout4.layout.getWidth() + f2, this.giftPremiumText.y + r10.layout.getHeight());
                    }
                    this.textPressed = false;
                    z2 = true;
                } else if (action == 3) {
                    z = false;
                    this.textPressed = false;
                    this.bounce.setPressed(z);
                }
                z2 = false;
            } else if (this.giftButtonPressed) {
                int action2 = motionEvent.getAction();
                if (action2 == 1) {
                    this.imagePressed = false;
                    View view3 = this.rippleView;
                    this.giftButtonPressed = false;
                    view3.setPressed(false);
                    this.bounce.setPressed(false);
                    if (this.delegate != null) {
                        int i2 = messageObject.type;
                        if (i2 == 25) {
                            playSoundEffect(0);
                            openPremiumGiftChannel();
                        } else if (i2 == 18) {
                            playSoundEffect(0);
                            openPremiumGiftPreview();
                        } else if (i2 == 30) {
                            playSoundEffect(0);
                            openStarsGiftTransaction();
                        } else {
                            TLRPC.Message message3 = messageObject.messageOwner;
                            if (message3 != null) {
                                TLRPC.MessageAction messageAction = message3.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                    playSoundEffect(0);
                                    openStarsNeedSheet();
                                }
                            }
                            if (MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id) == null) {
                                if (this.buttonClickableAsImage) {
                                    this.delegate.didClickImage(this);
                                } else {
                                    this.delegate.didClickButton(this);
                                }
                            }
                        }
                    }
                } else if (action2 != 2) {
                    if (action2 == 3) {
                        z = false;
                        this.imagePressed = false;
                        View view4 = this.rippleView;
                        this.giftButtonPressed = false;
                        view4.setPressed(false);
                        this.bounce.setPressed(z);
                    }
                } else if (!isButtonLayout(messageObject) || (!this.giftButtonRect.contains(x, y) && !this.backgroundRect.contains(x, y))) {
                    View view5 = this.rippleView;
                    this.giftButtonPressed = false;
                    view5.setPressed(false);
                    this.bounce.setPressed(false);
                }
                z2 = false;
            } else {
                if (this.imagePressed) {
                    int action3 = motionEvent.getAction();
                    if (action3 == 1) {
                        this.imagePressed = false;
                        if (this.giftPremiumTextCollapsed && !this.giftPremiumTextUncollapsed && (textLayout = this.giftPremiumText) != null) {
                            int height2 = textLayout.layout.getHeight() - this.giftPremiumTextCollapsedHeight;
                            this.giftPremiumTextUncollapsed = true;
                            ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
                            if (chatActionCellDelegate2 != null) {
                                chatActionCellDelegate2.forceUpdate(this, false);
                                if (getParent() instanceof RecyclerListView) {
                                    ((RecyclerListView) getParent()).smoothScrollBy(0, height2 + AndroidUtilities.dp(16.0f));
                                }
                            }
                            return true;
                        }
                        int i3 = messageObject.type;
                        if (i3 != 25) {
                            if (i3 != 18) {
                                if (i3 != 30) {
                                    if (this.delegate != null) {
                                        if (i3 != 21 || (imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id)) == null) {
                                            this.delegate.didClickImage(this);
                                            playSoundEffect(0);
                                        } else {
                                            imageUpdater.cancel();
                                        }
                                    }
                                }
                                openStarsGiftTransaction();
                            }
                            openPremiumGiftPreview();
                        }
                        openPremiumGiftChannel();
                    } else if (action3 == 2 ? !(!isNewStyleButtonLayout() ? this.imageReceiver.isInsideImage(x, y) : this.backgroundRect.contains(x, y)) : action3 == 3) {
                        this.imagePressed = false;
                    }
                }
                z2 = false;
            }
        }
        if (!z2 && (motionEvent.getAction() == 0 || ((this.pressedLink != null || this.spoilerPressed != null) && motionEvent.getAction() == 1))) {
            TextLayout textLayout5 = this.giftPremiumText;
            if (textLayout5 != null && (list = textLayout5.spoilers) != null && !list.isEmpty() && !this.isSpoilerRevealing) {
                Iterator it = this.giftPremiumText.spoilers.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SpoilerEffect spoilerEffect = (SpoilerEffect) it.next();
                    Rect bounds = spoilerEffect.getBounds();
                    TextLayout textLayout6 = this.giftPremiumText;
                    if (bounds.contains((int) (x - textLayout6.x), (int) (y - textLayout6.y))) {
                        this.pressedLink = null;
                        if (motionEvent.getAction() == 0) {
                            this.spoilerPressed = spoilerEffect;
                        } else {
                            SpoilerEffect spoilerEffect2 = this.spoilerPressed;
                            if (spoilerEffect == spoilerEffect2) {
                                this.isSpoilerRevealing = true;
                                spoilerEffect2.setOnRippleEndCallback(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ChatActionCell.this.lambda$onTouchEvent$3();
                                    }
                                });
                                float sqrt = (float) Math.sqrt(Math.pow(this.giftPremiumText.layout.getWidth(), 2.0d) + Math.pow(this.giftPremiumText.layout.getHeight(), 2.0d));
                                SpoilerEffect spoilerEffect3 = this.spoilerPressed;
                                TextLayout textLayout7 = this.giftPremiumText;
                                spoilerEffect3.startRipple((int) (x - textLayout7.x), (int) (y - textLayout7.y), sqrt);
                                invalidate();
                            }
                        }
                        z2 = true;
                    }
                }
            }
            if (!z2 && (staticLayout = this.textLayout) != null) {
                if (x >= this.textX) {
                    float f3 = this.textY;
                    if (y >= f3 && x <= r3 + this.textWidth && y <= r4 + this.textHeight) {
                        float f4 = y - f3;
                        float f5 = x - this.textXLeft;
                        if (!z2) {
                            int lineForVertical = staticLayout.getLineForVertical((int) f4);
                            int offsetForHorizontal = this.textLayout.getOffsetForHorizontal(lineForVertical, f5);
                            float lineLeft = this.textLayout.getLineLeft(lineForVertical);
                            if (lineLeft <= f5 && lineLeft + this.textLayout.getLineWidth(lineForVertical) >= f5) {
                                CharSequence charSequence = messageObject.messageText;
                                if (charSequence instanceof Spannable) {
                                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                    if (uRLSpanArr.length != 0) {
                                        if (motionEvent.getAction() == 0) {
                                            this.pressedLink = uRLSpanArr[0];
                                        } else {
                                            URLSpan uRLSpan = uRLSpanArr[0];
                                            URLSpan uRLSpan2 = this.pressedLink;
                                            if (uRLSpan == uRLSpan2) {
                                                openLink(uRLSpan2);
                                            }
                                        }
                                        return z4 ? super.onTouchEvent(motionEvent) : z4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.pressedLink = null;
        }
        z4 = z2;
        if (z4) {
        }
    }

    public void setCustomDate(int i, boolean z, boolean z2) {
        int i2 = this.customDate;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        String string = z ? i == 2147483646 ? LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline) : LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i)) : LocaleController.formatDateChat(i);
        this.customDate = i;
        CharSequence charSequence = this.customText;
        if (charSequence == null || !TextUtils.equals(string, charSequence)) {
            this.customText = string;
            this.accessibilityText = null;
            updateTextInternal(z2);
        }
    }

    public void setCustomText(CharSequence charSequence) {
        this.customText = charSequence;
        if (charSequence != null) {
            updateTextInternal(false);
        }
    }

    public void setDelegate(ChatActionCellDelegate chatActionCellDelegate) {
        this.delegate = chatActionCellDelegate;
    }

    public void setInvalidateColors(boolean z) {
        if (this.invalidateColors == z) {
            return;
        }
        this.invalidateColors = z;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.invalidateListener = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.invalidateWithParent = view;
    }

    public void setInvalidatesParent(boolean z) {
        this.invalidatesParent = z;
    }

    public void setMessageObject(MessageObject messageObject) {
        setMessageObject(messageObject, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x06e8, code lost:
    
        if (r1 != null) goto L320;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06f3  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v64, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r2v148 */
    /* JADX WARN: Type inference failed for: r2v149 */
    /* JADX WARN: Type inference failed for: r2v34, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMessageObject(MessageObject messageObject, boolean z) {
        TLRPC.TL_messageReactions tL_messageReactions;
        int i;
        String str;
        TLRPC.Document document;
        MessageObject messageObject2;
        TLRPC.Document document2;
        String str2;
        Object obj;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize videoSize;
        ImageLocation forObject;
        BitmapDrawable bitmapDrawable;
        String str3;
        int i2;
        ImageReceiver imageReceiver;
        ImageLocation imageLocation;
        String str4;
        String str5;
        long j;
        TLRPC.PhotoSize photoSize2;
        boolean z2;
        ?? r15;
        float f;
        boolean z3;
        RadialProgress2 radialProgress2;
        int i3;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        ImageReceiver imageReceiver2;
        ImageLocation forDocument;
        StringBuilder sb;
        String str6;
        TopicSeparator topicSeparator;
        int paddingTop;
        int i4;
        StaticLayout staticLayout;
        if (messageObject == null) {
            return;
        }
        if (this.currentMessageObject != messageObject || (!((staticLayout = this.textLayout) == null || TextUtils.equals(staticLayout.getText(), messageObject.messageText)) || (!(this.hasReplyMessage || messageObject.replyMessageObject == null) || z || messageObject.type == 21 || messageObject.forceUpdate))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            this.accessibilityText = null;
            MessageObject messageObject3 = this.currentMessageObject;
            boolean z4 = messageObject3 == null || messageObject3.stableId != messageObject.stableId;
            if (messageObject3 != null) {
                messageObject.playedGiftAnimation = messageObject3.playedGiftAnimation;
            }
            this.currentMessageObject = messageObject;
            messageObject.forceUpdate = false;
            this.hasReplyMessage = messageObject.replyMessageObject != null;
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.previousWidth = 0;
            this.isSpoilerRevealing = false;
            TextLayout textLayout = this.giftPremiumText;
            if (textLayout != null && z4) {
                textLayout.detach();
                this.giftPremiumText = null;
                this.giftPremiumTextUncollapsed = false;
            }
            if (z4 || messageObject.reactionsChanged) {
                messageObject.reactionsChanged = false;
                TLRPC.Message message = messageObject.messageOwner;
                boolean z5 = (message == null || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                if (messageObject.shouldDrawReactions()) {
                    this.reactionsLayoutInBubble.setMessage(messageObject, !messageObject.shouldDrawReactionsInLayout(), z5, this.themeDelegate);
                } else {
                    this.reactionsLayoutInBubble.setMessage(null, false, false, this.themeDelegate);
                }
            }
            boolean z6 = !z4;
            this.starGiftLayout.set(messageObject, z6);
            this.imageReceiver.setAutoRepeatCount(0);
            this.imageReceiver.clearDecorators();
            if (messageObject.type != 22) {
                this.wallpaperPreviewDrawable = null;
            }
            if (messageObject.actionDeleteGroupEventId != -1) {
                ScaleStateListAnimator.apply(this, 0.02f, 1.2f);
                this.overriddenMaxWidth = Math.max(AndroidUtilities.dp(250.0f), HintView2.cutInFancyHalf(messageObject.messageText, (TextPaint) getThemedPaint("paintChatActionText")));
                ProfileActivity.ShowDrawable findDrawable = ChannelAdminLogActivity.findDrawable(messageObject.messageText);
                if (findDrawable != null) {
                    findDrawable.setView(this);
                }
            } else {
                ScaleStateListAnimator.reset(this);
                this.overriddenMaxWidth = 0;
            }
            if (messageObject.isStoryMention()) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                this.avatarDrawable.setInfo(this.currentAccount, user);
                TL_stories.StoryItem storyItem = messageObject.messageOwner.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    StoriesUtilities.setImage(this.imageReceiver, storyItem);
                } else {
                    this.imageReceiver.setForUserOrChat(user, this.avatarDrawable, null, true, 0, true);
                }
                this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                i = 0;
            } else {
                int i5 = messageObject.type;
                int i6 = 4;
                if (i5 == 22) {
                    if (messageObject.strippedThumb == null) {
                        int size = messageObject.photoThumbs.size();
                        for (int i7 = 0; i7 < size && !(messageObject.photoThumbs.get(i7) instanceof TLRPC.TL_photoStrippedSize); i7++) {
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                            if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                                Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
                                boolean isDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.isCurrentThemeDark();
                                this.imageReceiver.clearImage();
                                Drawable backgroundDrawableFromTheme = PreviewView.getBackgroundDrawableFromTheme(this.currentAccount, ChatThemeController.getWallpaperEmoticon(wallPaper), isDark, false);
                                this.wallpaperPreviewDrawable = backgroundDrawableFromTheme;
                                if (backgroundDrawableFromTheme != null) {
                                    backgroundDrawableFromTheme.setCallback(this);
                                }
                            } else {
                                if (wallPaper == null || (str6 = wallPaper.uploadingImage) == null) {
                                    if (wallPaper != null) {
                                        TLObject tLObject = messageObject.photoThumbsObject;
                                        TLRPC.Document document3 = tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document;
                                        imageReceiver2 = this.imageReceiver;
                                        forDocument = ImageLocation.getForDocument(document3);
                                        sb = new StringBuilder();
                                    }
                                    this.wallpaperPreviewDrawable = null;
                                } else {
                                    imageReceiver2 = this.imageReceiver;
                                    forDocument = ImageLocation.getForPath(str6);
                                    sb = new StringBuilder();
                                }
                                sb.append("150_150_wallpaper");
                                sb.append(wallPaper.id);
                                sb.append(ChatBackgroundDrawable.hash(wallPaper.settings));
                                imageReceiver2.setImage(forDocument, sb.toString(), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                                this.wallpaperPreviewDrawable = null;
                            }
                            this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                            if (getUploadingInfoProgress(messageObject) != 1.0f) {
                                this.radialProgress.setProgress(1.0f, z6);
                                radialProgress2 = this.radialProgress;
                                z3 = z6;
                            } else {
                                radialProgress2 = this.radialProgress;
                                z3 = z6;
                                i6 = 3;
                            }
                            i3 = 0;
                        }
                    }
                    TLRPC.Message message2 = messageObject.messageOwner;
                    wallPaper = (message2 == null || (messageAction = message2.action) == null) ? null : messageAction.wallpaper;
                    if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                    }
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    if (getUploadingInfoProgress(messageObject) != 1.0f) {
                    }
                    i3 = 0;
                } else if (i5 == 21) {
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    this.imageReceiver.setAllowStartLottieAnimation(true);
                    this.imageReceiver.setDelegate(null);
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject.messageOwner.action;
                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                    ArrayList<TLRPC.VideoSize> arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    ImageLocation forPhoto = (arrayList == null || arrayList.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = messageObject.messageOwner.action.photo;
                    if (messageObject.strippedThumb == null) {
                        int size2 = messageObject.photoThumbs.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            photoSize2 = messageObject.photoThumbs.get(i8);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                    if (closestPhotoSizeWithSize == null) {
                        z2 = z6;
                        r15 = 0;
                    } else if (closestVideoSizeWithSize != null) {
                        z2 = z6;
                        r15 = 0;
                        this.imageReceiver.setImage(forPhoto, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 0);
                    } else {
                        z2 = z6;
                        r15 = 0;
                        this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 0);
                    }
                    this.imageReceiver.setAllowStartLottieAnimation(r15);
                    ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id);
                    if (imageUpdater != null) {
                        f = 1.0f;
                        if (imageUpdater.getCurrentImageProgress() != 1.0f) {
                            radialProgress2 = this.radialProgress;
                            z3 = z2;
                            i6 = 3;
                            i3 = r15;
                        }
                    } else {
                        f = 1.0f;
                    }
                    z3 = z2;
                    this.radialProgress.setProgress(f, z3);
                    radialProgress2 = this.radialProgress;
                    i6 = 4;
                    i3 = r15;
                } else {
                    i = 0;
                    i = 0;
                    i = 0;
                    i = 0;
                    i = 0;
                    i = 0;
                    if (i5 == 30 || i5 == 18 || i5 == 25) {
                        String str7 = null;
                        this.imageReceiver.setRoundRadius(0);
                        TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                            if (starGift != null) {
                                document = starGift.sticker;
                                obj = null;
                                messageObject2 = messageObject;
                                this.forceWasUnread = messageObject.wasUnread;
                                this.giftSticker = document;
                                if (document != null) {
                                    this.imageReceiver.setAllowStartLottieAnimation(true);
                                    this.imageReceiver.setDelegate(this.giftStickerDelegate);
                                    this.giftEffectAnimation = null;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= document.video_thumbs.size()) {
                                            break;
                                        }
                                        if ("f".equals(document.video_thumbs.get(i9).type)) {
                                            this.giftEffectAnimation = document.video_thumbs.get(i9);
                                            break;
                                        }
                                        i9++;
                                    }
                                    if (z4 || messageObject.type != 18) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
                                        this.imageReceiver.setAutoRepeat(0);
                                        this.imageReceiver.setImage(ImageLocation.getForDocument(document), String.format(Locale.US, "%d_%d_nr_messageId=%d", Integer.valueOf(NotificationCenter.audioRecordTooShort), Integer.valueOf(NotificationCenter.audioRecordTooShort), Integer.valueOf(messageObject.stableId)), svgThumb, "tgs", messageObject2, 1);
                                    }
                                } else if (str7 != null) {
                                    MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(str7, false, obj == null);
                                }
                            }
                            document = null;
                            obj = null;
                            messageObject2 = messageObject;
                            this.forceWasUnread = messageObject.wasUnread;
                            this.giftSticker = document;
                            if (document != null) {
                            }
                        } else {
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                if (tL_messageActionStarGiftUnique.refunded) {
                                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                                    if (starGift2 != null) {
                                        document = starGift2.getDocument();
                                        obj = null;
                                        messageObject2 = messageObject;
                                        this.forceWasUnread = messageObject.wasUnread;
                                        this.giftSticker = document;
                                        if (document != null) {
                                        }
                                    }
                                    document = null;
                                    obj = null;
                                    messageObject2 = messageObject;
                                    this.forceWasUnread = messageObject.wasUnread;
                                    this.giftSticker = document;
                                    if (document != null) {
                                    }
                                }
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                str = UserConfig.getInstance(this.currentAccount).premiumTonStickerPack;
                                if (str == null) {
                                    MediaDataController.getInstance(this.currentAccount).checkTonGiftStickers();
                                    return;
                                }
                            } else {
                                str = UserConfig.getInstance(this.currentAccount).premiumGiftsStickerPack;
                                if (str == null) {
                                    MediaDataController.getInstance(this.currentAccount).checkPremiumGiftStickers();
                                    return;
                                }
                            }
                            String str8 = str;
                            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str8);
                            ?? r2 = stickerSetByName;
                            if (stickerSetByName == null) {
                                r2 = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str8);
                            }
                            if (r2 != 0) {
                                TLRPC.MessageAction messageAction3 = messageObject.messageOwner.action;
                                int i10 = messageAction3.months;
                                if (messageObject.type != 30) {
                                    String str9 = (String) monthsToEmoticon.get(Integer.valueOf(i10));
                                    Iterator<TLRPC.TL_stickerPack> it = r2.packs.iterator();
                                    document2 = null;
                                    while (it.hasNext()) {
                                        TLRPC.TL_stickerPack next = it.next();
                                        if (Objects.equals(next.emoticon, str9)) {
                                            Iterator<Long> it2 = next.documents.iterator();
                                            while (it2.hasNext()) {
                                                long longValue = it2.next().longValue();
                                                Iterator<TLRPC.Document> it3 = r2.documents.iterator();
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        break;
                                                    }
                                                    TLRPC.Document next2 = it3.next();
                                                    if (next2.id == longValue) {
                                                        document2 = next2;
                                                        break;
                                                    }
                                                }
                                                if (document2 != null) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (document2 != null) {
                                            break;
                                        }
                                    }
                                } else {
                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                        str2 = StarsIntroActivity.getTonGiftEmoji(messageAction3.cryptoAmount);
                                    } else {
                                        long j2 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                        str2 = j2 <= 1000 ? "2⃣" : j2 < 2500 ? "3⃣" : "4⃣";
                                    }
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= r2.packs.size()) {
                                            break;
                                        }
                                        TLRPC.TL_stickerPack tL_stickerPack = r2.packs.get(i11);
                                        if (TextUtils.equals(tL_stickerPack.emoticon, str2) && !tL_stickerPack.documents.isEmpty()) {
                                            long longValue2 = tL_stickerPack.documents.get(0).longValue();
                                            for (int i12 = 0; i12 < r2.documents.size(); i12++) {
                                                TLRPC.Document document4 = r2.documents.get(i12);
                                                if (document4 != null && document4.id == longValue2) {
                                                    document2 = document4;
                                                    break;
                                                }
                                            }
                                        } else {
                                            i11++;
                                        }
                                    }
                                    document2 = null;
                                }
                                if (document2 != null || r2.documents.isEmpty()) {
                                    messageObject2 = r2;
                                    str7 = str8;
                                    document = document2;
                                    obj = r2;
                                } else {
                                    messageObject2 = r2;
                                    str7 = str8;
                                    document = r2.documents.get(0);
                                    obj = r2;
                                }
                            } else {
                                str7 = str8;
                                document = null;
                                messageObject2 = null;
                                obj = r2;
                            }
                            this.forceWasUnread = messageObject.wasUnread;
                            this.giftSticker = document;
                            if (document != null) {
                            }
                        }
                    } else if (i5 == 11) {
                        this.imageReceiver.setAllowStartLottieAnimation(true);
                        this.imageReceiver.setDelegate(null);
                        this.imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                        this.imageReceiver.setAutoRepeatCount(1);
                        this.avatarDrawable.setInfo(messageObject.getDialogId(), null, null);
                        if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                            this.imageReceiver.setImage(null, null, this.avatarDrawable, null, messageObject, 0);
                        } else {
                            if (messageObject.strippedThumb == null) {
                                int size3 = messageObject.photoThumbs.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    photoSize = messageObject.photoThumbs.get(i13);
                                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                        break;
                                    }
                                }
                            }
                            photoSize = null;
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
                            if (closestPhotoSizeWithSize2 != null) {
                                TLRPC.Photo photo2 = messageObject.messageOwner.action.photo;
                                if (!photo2.video_sizes.isEmpty() && SharedConfig.isAutoplayGifs()) {
                                    videoSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                    if (!messageObject.mediaExists && !DownloadController.getInstance(this.currentAccount).canDownloadMedia(4, videoSize.size)) {
                                        this.currentVideoLocation = ImageLocation.getForPhoto(videoSize, photo2);
                                        DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(videoSize), messageObject, this);
                                    }
                                    if (videoSize == null) {
                                        imageReceiver = this.imageReceiver;
                                        imageLocation = ImageLocation.getForPhoto(videoSize, photo2);
                                        forObject = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
                                        bitmapDrawable = messageObject.strippedThumb;
                                        str3 = null;
                                        i2 = 1;
                                        str4 = ImageLoader.AUTOPLAY_FILTER;
                                        str5 = "50_50_b";
                                        j = 0;
                                    } else {
                                        ImageReceiver imageReceiver3 = this.imageReceiver;
                                        ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                        forObject = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
                                        bitmapDrawable = messageObject.strippedThumb;
                                        str3 = null;
                                        i2 = 1;
                                        imageReceiver = imageReceiver3;
                                        imageLocation = forObject2;
                                        str4 = "150_150";
                                        str5 = "50_50_b";
                                        j = 0;
                                    }
                                    imageReceiver.setImage(imageLocation, str4, forObject, str5, bitmapDrawable, j, str3, messageObject, i2);
                                }
                                videoSize = null;
                                if (videoSize == null) {
                                }
                                imageReceiver.setImage(imageLocation, str4, forObject, str5, bitmapDrawable, j, str3, messageObject, i2);
                            } else {
                                this.imageReceiver.setImageBitmap(this.avatarDrawable);
                            }
                        }
                        this.imageReceiver.setVisible(!PhotoViewer.isShowingImage(messageObject), false);
                    } else {
                        this.imageReceiver.setAllowStartLottieAnimation(true);
                        this.imageReceiver.setDelegate(null);
                        this.imageReceiver.setImageBitmap((Bitmap) null);
                    }
                }
                radialProgress2.setIcon(i6, z3, z3);
                i = i3;
            }
            if (this.firstInChat && this.isAllChats && this.isSideMenued && (this.isForum || this.isMonoForum)) {
                this.topicSeparatorTopPadding = AndroidUtilities.dp(33.0f);
                if (this.topicSeparator == null) {
                    TopicSeparator topicSeparator2 = new TopicSeparator(this.currentAccount, this, this.themeDelegate, true);
                    this.topicSeparator = topicSeparator2;
                    topicSeparator2.setOnClickListener(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatActionCell.this.lambda$setMessageObject$1();
                        }
                    });
                }
                if (this.topicSeparator.update(this.currentMessageObject)) {
                    if (this.attachedToWindow) {
                        this.topicSeparator.attach();
                    }
                    paddingTop = getPaddingTop();
                    i4 = this.topicSeparatorTopPadding;
                    if (paddingTop != i4) {
                        setPadding(i, i4, i, i);
                    }
                    this.rippleView.setVisibility((isButtonLayout(messageObject) || this.starGiftLayout.has()) ? 8 : 0);
                    ForumUtilities.applyTopicToMessage(messageObject);
                    requestLayout();
                }
                topicSeparator = this.topicSeparator;
            } else {
                topicSeparator = this.topicSeparator;
            }
            topicSeparator.detach();
            this.topicSeparator = null;
            this.topicSeparatorTopPadding = i;
            paddingTop = getPaddingTop();
            i4 = this.topicSeparatorTopPadding;
            if (paddingTop != i4) {
            }
            this.rippleView.setVisibility((isButtonLayout(messageObject) || this.starGiftLayout.has()) ? 8 : 0);
            ForumUtilities.applyTopicToMessage(messageObject);
            requestLayout();
        }
    }

    public void setOverrideColor(int i, int i2) {
        this.overrideBackground = i;
        this.overrideText = i2;
    }

    public void setOverrideTextMaxWidth(int i) {
        this.overriddenMaxWidth = i;
    }

    public void setScrimReaction(Integer num) {
        this.reactionsLayoutInBubble.setScrimReaction(num);
    }

    public void setShowTopic(boolean z) {
        if (this.showTopicSeparator != z) {
            this.showTopicSeparator = z;
            invalidateOutbounds();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        Iterator it = this.spoilers.iterator();
        while (it.hasNext()) {
            ((SpoilerEffect) it.next()).setSuppressUpdates(z);
        }
    }

    public void setVisiblePart(float f, float f2, int i, float f3) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = f2;
        this.dimAmount = f3;
        this.dimPaint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (f3 * 255.0f)));
        invalidate();
    }

    public void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = 0.0f;
    }

    public boolean showingCancelButton() {
        RadialProgress2 radialProgress2 = this.radialProgress;
        return radialProgress2 != null && radialProgress2.getIcon() == 3;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.wallpaperPreviewDrawable || super.verifyDrawable(drawable);
    }
}
