package org.telegram.ui.Cells;

import android.R;
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
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.ColorUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
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
import org.telegram.tgnet.tl.TL_payments;
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
import org.telegram.ui.Components.SuggestBirthdayActionLayout;
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
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
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
    private final Path backgroundPath2;
    private RectF backgroundRect;
    private int backgroundRectHeight;
    private int backgroundRight;
    public SuggestBirthdayActionLayout birthdayLayout;
    private final Path botButtonPath;
    private final float[] botButtonRadii;
    private ArrayList botButtons;
    private final ButtonBounce bounce;
    private boolean buttonClickableAsImage;
    private boolean canDrawInParent;
    private GiftSheet.CardBackground cardBackground;
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
    private int pressedBotButton;
    private URLSpan pressedLink;
    private final int[] pressedState;
    private int previousWidth;
    float progressToProgress;
    RadialProgressView progressView;
    private RadialProgress2 radialProgress;
    private final float[] radii;
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

    public boolean isFloating() {
        return false;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public void onFailedDownload(String str, boolean z) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public void onProgressDownload(String str, long j, long j2) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public void onProgressUpload(String str, long j, long j2, boolean z) {
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
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null) {
                setMessageObject(messageObject2, true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.currentAccount).premiumGiftsStickerPack) && (messageObject = this.currentMessageObject) != null) {
            setMessageObject(messageObject, true);
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        Iterator it = this.spoilers.iterator();
        while (it.hasNext()) {
            ((SpoilerEffect) it.next()).setSuppressUpdates(z);
        }
    }

    public void setInvalidateWithParent(View view) {
        this.invalidateWithParent = view;
    }

    public boolean hasButton() {
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || !isButtonLayout(messageObject) || this.giftPremiumButtonLayout == null) ? false : true;
    }

    public void setShowTopic(boolean z) {
        if (this.showTopicSeparator != z) {
            this.showTopicSeparator = z;
            invalidateOutbounds();
            invalidate();
        }
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

        public void attach() {
            this.emoji = AnimatedEmojiSpan.update(0, (View) ChatActionCell.this, false, this.emoji, this.layout);
        }

        public void detach() {
            AnimatedEmojiSpan.release(ChatActionCell.this, this.emoji);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        ChatActionCellDelegate chatActionCellDelegate;
        if (!z || (lottieAnimation = this.imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && !messageObject.playedGiftAnimation) {
            messageObject.playedGiftAnimation = true;
            lottieAnimation.setCurrentFrame(0, false);
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda10(lottieAnimation));
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
                return;
            }
            return;
        }
        if (lottieAnimation.getCurrentFrame() < 1) {
            lottieAnimation.stop();
            lottieAnimation.setCurrentFrame(lottieAnimation.getFramesCount() - 1, false);
        }
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
        this.giftStickerDelegate = new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda4
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
        this.botButtons = new ArrayList();
        this.dimPaint = new Paint(1);
        this.backgroundPath2 = new Path();
        this.radii = new float[8];
        this.botButtonRadii = new float[8];
        this.botButtonPath = new Path();
        this.pressedState = new int[]{R.attr.state_enabled, R.attr.state_pressed};
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

    public void setDelegate(ChatActionCellDelegate chatActionCellDelegate) {
        this.delegate = chatActionCellDelegate;
    }

    public ChatActionCellDelegate getDelegate() {
        return this.delegate;
    }

    public void setCustomDate(int i, boolean z, boolean z2) {
        String formatDateChat;
        int i2 = this.customDate;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        if (!z) {
            formatDateChat = LocaleController.formatDateChat(i);
        } else if (i == 2147483646) {
            formatDateChat = LocaleController.getString("MessageScheduledUntilOnline", org.telegram.messenger.R.string.MessageScheduledUntilOnline);
        } else {
            formatDateChat = LocaleController.formatString("MessageScheduledOn", org.telegram.messenger.R.string.MessageScheduledOn, LocaleController.formatDateChat(i));
        }
        this.customDate = i;
        CharSequence charSequence = this.customText;
        if (charSequence == null || !TextUtils.equals(formatDateChat, charSequence)) {
            this.customText = formatDateChat;
            this.accessibilityText = null;
            updateTextInternal(z2);
        }
    }

    private void updateTextInternal(boolean z) {
        if (getMeasuredWidth() != 0) {
            createLayout(this.customText, getMeasuredWidth());
            invalidate();
        }
        if (this.wasLayout) {
            buildLayout();
        } else if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    ChatActionCell.this.requestLayout();
                }
            });
        } else {
            requestLayout();
        }
    }

    public void setCustomText(CharSequence charSequence) {
        this.customText = charSequence;
        if (charSequence != null) {
            updateTextInternal(false);
        }
    }

    public void setOverrideColor(int i, int i2) {
        this.overrideBackground = i;
        this.overrideText = i2;
    }

    public void setMessageObject(MessageObject messageObject) {
        setMessageObject(messageObject, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0880  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v36, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r2v183 */
    /* JADX WARN: Type inference failed for: r2v184 */
    /* JADX WARN: Type inference failed for: r2v37, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMessageObject(MessageObject messageObject, boolean z) {
        TLRPC.TL_messageReactions tL_messageReactions;
        int i;
        String str;
        MessageObject messageObject2;
        String str2;
        TLRPC.Document document;
        MessageObject messageObject3;
        TLRPC.Document document2;
        long j;
        String str3;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z2;
        ?? r15;
        boolean z3;
        float f;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        TLRPC.Document document3;
        String str4;
        TopicSeparator topicSeparator;
        int paddingTop;
        int i2;
        StaticLayout staticLayout;
        if (messageObject == null) {
            return;
        }
        if (this.currentMessageObject != messageObject || (!((staticLayout = this.textLayout) == null || TextUtils.equals(staticLayout.getText(), messageObject.messageText)) || (!(this.hasReplyMessage || messageObject.replyMessageObject == null) || z || messageObject.type == 21 || messageObject.forceUpdate))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            this.botButtons.clear();
            this.accessibilityText = null;
            MessageObject messageObject4 = this.currentMessageObject;
            boolean z4 = messageObject4 == null || messageObject4.stableId != messageObject.stableId;
            if (messageObject4 != null) {
                messageObject.playedGiftAnimation = messageObject4.playedGiftAnimation;
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
            if (messageObject.type == 32) {
                if (this.birthdayLayout == null) {
                    this.birthdayLayout = new SuggestBirthdayActionLayout(this.currentAccount, this, this.themeDelegate);
                    if (isCellAttachedToWindow()) {
                        this.birthdayLayout.attach();
                    }
                }
                this.birthdayLayout.set(messageObject);
            } else {
                SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
                if (suggestBirthdayActionLayout != null) {
                    suggestBirthdayActionLayout.detach();
                    this.birthdayLayout = null;
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
                if (storyItem != null && storyItem.noforwards) {
                    this.imageReceiver.setForUserOrChat(user, this.avatarDrawable, null, true, 0, true);
                } else {
                    StoriesUtilities.setImage(this.imageReceiver, storyItem);
                }
                this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
            } else {
                int i3 = messageObject.type;
                if (i3 == 22) {
                    if (messageObject.strippedThumb == null) {
                        int size = messageObject.photoThumbs.size();
                        for (int i4 = 0; i4 < size && !(messageObject.photoThumbs.get(i4) instanceof TLRPC.TL_photoStrippedSize); i4++) {
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
                            } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                                this.imageReceiver.setImage(ImageLocation.getForPath(str4), "150_150_wallpaper" + wallPaper.id + ChatBackgroundDrawable.hash(wallPaper.settings), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                                this.wallpaperPreviewDrawable = null;
                            } else if (wallPaper != null) {
                                TLObject tLObject = messageObject.photoThumbsObject;
                                if (tLObject instanceof TLRPC.Document) {
                                    document3 = (TLRPC.Document) tLObject;
                                } else {
                                    document3 = wallPaper.document;
                                }
                                this.imageReceiver.setImage(ImageLocation.getForDocument(document3), "150_150_wallpaper" + wallPaper.id + ChatBackgroundDrawable.hash(wallPaper.settings), null, null, ChatBackgroundDrawable.createThumb(wallPaper), 0L, null, wallPaper, 1);
                                this.wallpaperPreviewDrawable = null;
                            } else {
                                this.wallpaperPreviewDrawable = null;
                            }
                            this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                            if (getUploadingInfoProgress(messageObject) != 1.0f) {
                                this.radialProgress.setProgress(1.0f, z6);
                                this.radialProgress.setIcon(4, z6, z6);
                            } else {
                                this.radialProgress.setIcon(3, z6, z6);
                            }
                        }
                    }
                    TLRPC.Message message2 = messageObject.messageOwner;
                    wallPaper = (message2 == null || (messageAction = message2.action) == null) ? null : messageAction.wallpaper;
                    if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                    }
                    this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                    if (getUploadingInfoProgress(messageObject) != 1.0f) {
                    }
                } else {
                    if (i3 == 21) {
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
                            for (int i5 = 0; i5 < size2; i5++) {
                                photoSize2 = messageObject.photoThumbs.get(i5);
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
                            if (imageUpdater.getCurrentImageProgress() == 1.0f) {
                                z3 = z2;
                            } else {
                                boolean z7 = z2;
                                this.radialProgress.setIcon(3, z7, z7);
                                i = r15;
                            }
                        } else {
                            z3 = z2;
                            f = 1.0f;
                        }
                        this.radialProgress.setProgress(f, z3);
                        this.radialProgress.setIcon(4, z3, z3);
                        i = r15;
                    } else {
                        i = 0;
                        i = 0;
                        i = 0;
                        i = 0;
                        i = 0;
                        i = 0;
                        if (i3 == 31 || i3 == 33 || i3 == 30 || i3 == 18 || i3 == 25) {
                            this.imageReceiver.setRoundRadius(0);
                            TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                if (starGift != null) {
                                    document2 = TlUtils.getGiftDocument(starGift);
                                    if (this.cardBackground == null) {
                                        this.cardBackground = new GiftSheet.CardBackground(this, this.themeDelegate, false);
                                    }
                                    this.cardBackground.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                    this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                } else {
                                    document2 = null;
                                }
                                if (!messageObject.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined) {
                                    BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                                    builder.addGiftOfferKeyboard();
                                    BotInlineKeyboard.Source build = builder.build();
                                    int i6 = 0;
                                    while (i6 < 2) {
                                        BotInlineKeyboard.Button button = build.getButton(0, i6);
                                        BotButton botButton = new BotButton(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ChatActionCell.this.invalidateOutbounds();
                                            }
                                        });
                                        botButton.buttonCustom = (BotInlineKeyboard.ButtonCustom) button;
                                        int icon = button.getIcon();
                                        if (icon != 0) {
                                            Drawable drawable = getResources().getDrawable(icon);
                                            botButton.iconDrawable = drawable;
                                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                        }
                                        botButton.height = AndroidUtilities.dp(40.0f);
                                        int i7 = botButton.positionFlags | 8;
                                        botButton.positionFlags = i7;
                                        int flag = BitwiseUtils.setFlag(i7, 1, i6 == 0);
                                        botButton.positionFlags = flag;
                                        botButton.positionFlags = BitwiseUtils.setFlag(flag, 2, i6 == 1);
                                        botButton.title = new Text(button.getText(), (TextPaint) getThemedPaint("paintChatBotButton"));
                                        this.botButtons.add(botButton);
                                        i6++;
                                    }
                                }
                            } else {
                                if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                    TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                                    if (starGift2 != null) {
                                        document2 = TlUtils.getGiftDocument(starGift2);
                                        if (this.cardBackground == null) {
                                            this.cardBackground = new GiftSheet.CardBackground(this, this.themeDelegate, false);
                                        }
                                        this.cardBackground.setBackdrop((TL_stars.starGiftAttributeBackdrop) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        this.cardBackground.setPattern((TL_stars.starGiftAttributePattern) StarsController.findAttribute(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                                    } else {
                                        str2 = null;
                                        messageObject2 = null;
                                    }
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                                    TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                                    if (starGift3 != null) {
                                        document2 = starGift3.sticker;
                                        messageObject3 = messageObject;
                                        str2 = null;
                                        messageObject2 = null;
                                        this.forceWasUnread = messageObject.wasUnread;
                                        this.giftSticker = document2;
                                        if (document2 != null) {
                                            this.imageReceiver.setAllowStartLottieAnimation(true);
                                            int i8 = messageObject.type;
                                            if (i8 != 31 && i8 != 33) {
                                                this.imageReceiver.setDelegate(this.giftStickerDelegate);
                                            }
                                            this.giftEffectAnimation = null;
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= document2.video_thumbs.size()) {
                                                    break;
                                                }
                                                if ("f".equals(document2.video_thumbs.get(i9).type)) {
                                                    this.giftEffectAnimation = document2.video_thumbs.get(i9);
                                                    break;
                                                }
                                                i9++;
                                            }
                                            if (z4 || messageObject.type != 18) {
                                                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document2, Theme.key_windowBackgroundGray, 0.3f);
                                                this.imageReceiver.setAutoRepeat(0);
                                                this.imageReceiver.setImage(ImageLocation.getForDocument(document2), String.format(Locale.US, "%d_%d_nr_messageId=%d", Integer.valueOf(NotificationCenter.albumsDidLoad), Integer.valueOf(NotificationCenter.albumsDidLoad), Integer.valueOf(messageObject.stableId)), svgThumb, "tgs", messageObject3, 1);
                                            }
                                        } else if (str2 != null) {
                                            MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(str2, false, messageObject2 == null);
                                        }
                                    }
                                    document2 = null;
                                    messageObject3 = messageObject;
                                    str2 = null;
                                    messageObject2 = null;
                                    this.forceWasUnread = messageObject.wasUnread;
                                    this.giftSticker = document2;
                                    if (document2 != null) {
                                    }
                                } else {
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                        if (tL_messageActionStarGiftUnique.refunded) {
                                            TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                            if (starGift4 != null) {
                                                document2 = starGift4.getDocument();
                                                messageObject3 = messageObject;
                                                str2 = null;
                                                messageObject2 = null;
                                                this.forceWasUnread = messageObject.wasUnread;
                                                this.giftSticker = document2;
                                                if (document2 != null) {
                                                }
                                            }
                                            document2 = null;
                                            messageObject3 = messageObject;
                                            str2 = null;
                                            messageObject2 = null;
                                            this.forceWasUnread = messageObject.wasUnread;
                                            this.giftSticker = document2;
                                            if (document2 != null) {
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
                                    String str5 = str;
                                    TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str5);
                                    ?? r2 = stickerSetByName;
                                    if (stickerSetByName == null) {
                                        r2 = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str5);
                                    }
                                    if (r2 != 0) {
                                        TLRPC.MessageAction messageAction3 = messageObject.messageOwner.action;
                                        int i10 = messageAction3.months;
                                        if (messageObject.type == 30) {
                                            if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                                str3 = StarsIntroActivity.getTonGiftEmoji(messageAction3.cryptoAmount);
                                            } else {
                                                if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                                    j = ((TLRPC.TL_messageActionGiftStars) messageAction3).stars;
                                                } else {
                                                    j = ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                                }
                                                if (j <= 1000) {
                                                    str3 = "2⃣";
                                                } else if (j < 2500) {
                                                    str3 = "3⃣";
                                                } else {
                                                    str3 = "4⃣";
                                                }
                                            }
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 >= r2.packs.size()) {
                                                    break;
                                                }
                                                TLRPC.TL_stickerPack tL_stickerPack = r2.packs.get(i11);
                                                if (TextUtils.equals(tL_stickerPack.emoticon, str3) && !tL_stickerPack.documents.isEmpty()) {
                                                    long longValue = tL_stickerPack.documents.get(0).longValue();
                                                    for (int i12 = 0; i12 < r2.documents.size(); i12++) {
                                                        TLRPC.Document document4 = r2.documents.get(i12);
                                                        if (document4 != null && document4.id == longValue) {
                                                            document = document4;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    i11++;
                                                }
                                            }
                                            document = null;
                                        } else {
                                            String str6 = (String) monthsToEmoticon.get(Integer.valueOf(i10));
                                            Iterator<TLRPC.TL_stickerPack> it = r2.packs.iterator();
                                            document = null;
                                            while (it.hasNext()) {
                                                TLRPC.TL_stickerPack next = it.next();
                                                if (Objects.equals(next.emoticon, str6)) {
                                                    Iterator<Long> it2 = next.documents.iterator();
                                                    while (it2.hasNext()) {
                                                        long longValue2 = it2.next().longValue();
                                                        Iterator<TLRPC.Document> it3 = r2.documents.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                break;
                                                            }
                                                            TLRPC.Document next2 = it3.next();
                                                            if (next2.id == longValue2) {
                                                                document = next2;
                                                                break;
                                                            }
                                                        }
                                                        if (document != null) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                if (document != null) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (document != null || r2.documents.isEmpty()) {
                                            messageObject2 = r2;
                                            messageObject3 = messageObject2;
                                            str2 = str5;
                                            document2 = document;
                                        } else {
                                            TLRPC.Document document5 = r2.documents.get(0);
                                            messageObject3 = r2;
                                            str2 = str5;
                                            document2 = document5;
                                            messageObject2 = messageObject3;
                                        }
                                        this.forceWasUnread = messageObject.wasUnread;
                                        this.giftSticker = document2;
                                        if (document2 != null) {
                                        }
                                    } else {
                                        messageObject2 = r2;
                                        str2 = str5;
                                    }
                                }
                                document2 = null;
                                messageObject3 = null;
                                this.forceWasUnread = messageObject.wasUnread;
                                this.giftSticker = document2;
                                if (document2 != null) {
                                }
                            }
                            str2 = null;
                            messageObject2 = null;
                            messageObject3 = null;
                            this.forceWasUnread = messageObject.wasUnread;
                            this.giftSticker = document2;
                            if (document2 != null) {
                            }
                        } else if (i3 == 11) {
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
                                            this.imageReceiver.setImage(ImageLocation.getForPhoto(videoSize, photo2), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 1);
                                        } else {
                                            this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "150_150", ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 1);
                                        }
                                    }
                                    videoSize = null;
                                    if (videoSize == null) {
                                    }
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
                    if (!this.firstInChat && this.isAllChats && this.isSideMenued && (this.isForum || this.isMonoForum)) {
                        this.topicSeparatorTopPadding = AndroidUtilities.dp(33.0f);
                        if (this.topicSeparator == null) {
                            TopicSeparator topicSeparator2 = new TopicSeparator(this.currentAccount, this, this.themeDelegate, true);
                            this.topicSeparator = topicSeparator2;
                            topicSeparator2.setOnClickListener(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ChatActionCell.this.lambda$setMessageObject$1();
                                }
                            });
                        }
                        if (!this.topicSeparator.update(this.currentMessageObject)) {
                            this.topicSeparator.detach();
                            this.topicSeparator = null;
                            this.topicSeparatorTopPadding = i;
                        } else if (this.attachedToWindow) {
                            this.topicSeparator.attach();
                        }
                    } else {
                        topicSeparator = this.topicSeparator;
                        if (topicSeparator != null) {
                            topicSeparator.detach();
                            this.topicSeparator = null;
                        }
                        this.topicSeparatorTopPadding = i;
                    }
                    paddingTop = getPaddingTop();
                    i2 = this.topicSeparatorTopPadding;
                    if (paddingTop != i2) {
                        setPadding(i, i2, i, i);
                    }
                    this.rippleView.setVisibility((isButtonLayout(messageObject) || this.starGiftLayout.has()) ? 8 : 0);
                    ForumUtilities.applyTopicToMessage(messageObject);
                    requestLayout();
                }
            }
            i = 0;
            if (!this.firstInChat) {
            }
            topicSeparator = this.topicSeparator;
            if (topicSeparator != null) {
            }
            this.topicSeparatorTopPadding = i;
            paddingTop = getPaddingTop();
            i2 = this.topicSeparatorTopPadding;
            if (paddingTop != i2) {
            }
            this.rippleView.setVisibility((isButtonLayout(messageObject) || this.starGiftLayout.has()) ? 8 : 0);
            ForumUtilities.applyTopicToMessage(messageObject);
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMessageObject$1() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            chatActionCellDelegate.onTopicClick(this);
        }
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

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    public ImageReceiver getPhotoImage() {
        return this.imageReceiver;
    }

    public void setVisiblePart(float f, int i) {
        this.visiblePartSet = true;
        this.backgroundHeight = i;
        this.viewTop = f;
        this.viewTranslationX = 0.0f;
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

    @Override // org.telegram.ui.Cells.BaseCell
    protected boolean onLongPress() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate != null) {
            return chatActionCellDelegate.didLongPress(this, this.lastTouchX, this.lastTouchY);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.rippleView;
        RectF rectF = this.giftButtonRect;
        view.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
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
        SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
        if (suggestBirthdayActionLayout != null) {
            suggestBirthdayActionLayout.detach();
        }
    }

    public boolean isCellAttachedToWindow() {
        return this.attachedToWindow;
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
        SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
        if (suggestBirthdayActionLayout != null) {
            suggestBirthdayActionLayout.attach();
        }
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

    /* JADX WARN: Removed duplicated region for block: B:134:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ImageUpdater imageUpdater;
        TextLayout textLayout;
        TextLayout textLayout2;
        TLRPC.Message message;
        boolean z;
        StaticLayout staticLayout;
        List list;
        boolean z2;
        TLRPC.Message message2;
        int i;
        boolean z3 = true;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return super.onTouchEvent(motionEvent);
        }
        TopicSeparator topicSeparator = this.topicSeparator;
        if (topicSeparator != null && topicSeparator.onTouchEvent(motionEvent, false)) {
            return true;
        }
        SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
        if (suggestBirthdayActionLayout != null && suggestBirthdayActionLayout.onTouchEvent(motionEvent)) {
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
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.radialProgress.getIcon() == 4 && (((i = messageObject.type) == 21 || i == 22) && this.backgroundRect.contains(x, y))) {
                    this.imagePressed = true;
                    z2 = true;
                }
                TextLayout textLayout3 = this.giftPremiumText;
                if (textLayout3 != null && this.giftPremiumTextCollapsed) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f = textLayout3.x;
                    rectF.set(f, textLayout3.y, textLayout3.layout.getWidth() + f, this.giftPremiumText.y + r14.layout.getHeight());
                    if (rectF.contains(x, y)) {
                        this.textPressed = true;
                        z2 = true;
                    }
                }
                if (isButtonLayout(messageObject) && this.giftPremiumButtonLayout != null && (this.giftButtonRect.contains(x, y) || (this.buttonClickableAsImage && this.backgroundRect.contains(x, y)))) {
                    View view = this.rippleView;
                    this.giftButtonPressed = true;
                    view.setPressed(true);
                    this.bounce.setPressed(true);
                    z2 = true;
                }
                if (!z2 && isMessageActionSuggestedPostApproval()) {
                    this.textPressed = true;
                    z2 = true;
                }
                if (!z2) {
                    MessageObject messageObject2 = this.currentMessageObject;
                    if (TlUtils.isInstance((messageObject2 == null || (message2 = messageObject2.messageOwner) == null) ? null : message2.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                        this.textPressed = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    startCheckLongPress();
                }
                z = z2;
            }
            z = false;
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
                    } else {
                        if (this.giftPremiumTextCollapsed && !this.giftPremiumTextUncollapsed && (textLayout2 = this.giftPremiumText) != null) {
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
                        if (this.birthdayLayout != null && this.backgroundRect.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.birthdayLayout.open();
                            return true;
                        }
                    }
                } else if (action == 2) {
                    TextLayout textLayout4 = this.giftPremiumText;
                    if (textLayout4 == null || !this.giftPremiumTextCollapsed) {
                        this.textPressed = false;
                    } else {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f2 = textLayout4.x;
                        rectF2.set(f2, textLayout4.y, textLayout4.layout.getWidth() + f2, this.giftPremiumText.y + r10.layout.getHeight());
                        if (!rectF2.contains(x, y)) {
                            this.textPressed = false;
                        }
                    }
                    z = true;
                } else if (action == 3) {
                    this.textPressed = false;
                    this.bounce.setPressed(false);
                }
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
                        if (i2 == 31) {
                            playSoundEffect(0);
                            openStarsGiftTransaction();
                        } else if (i2 == 25) {
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
                        this.imagePressed = false;
                        View view4 = this.rippleView;
                        this.giftButtonPressed = false;
                        view4.setPressed(false);
                        this.bounce.setPressed(false);
                    }
                } else if (!isButtonLayout(messageObject) || (!this.giftButtonRect.contains(x, y) && !this.backgroundRect.contains(x, y))) {
                    View view5 = this.rippleView;
                    this.giftButtonPressed = false;
                    view5.setPressed(false);
                    this.bounce.setPressed(false);
                }
            } else if (this.imagePressed) {
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
                    if (i3 == 31) {
                        openStarsGiftTransaction();
                    } else if (i3 == 25) {
                        openPremiumGiftChannel();
                    } else if (i3 == 18) {
                        openPremiumGiftPreview();
                    } else if (i3 == 30) {
                        openStarsGiftTransaction();
                    } else if (this.delegate != null) {
                        if (i3 == 21 && (imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id)) != null) {
                            imageUpdater.cancel();
                        } else {
                            this.delegate.didClickImage(this);
                            playSoundEffect(0);
                        }
                    }
                } else if (action3 != 2) {
                    if (action3 == 3) {
                        this.imagePressed = false;
                    }
                } else if (isNewStyleButtonLayout()) {
                    if (!this.backgroundRect.contains(x, y)) {
                        this.imagePressed = false;
                    }
                } else if (!this.imageReceiver.isInsideImage(x, y)) {
                    this.imagePressed = false;
                }
            }
            z = false;
        }
        if (!z && (motionEvent.getAction() == 0 || ((this.pressedLink != null || this.spoilerPressed != null) && motionEvent.getAction() == 1))) {
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
                                spoilerEffect2.setOnRippleEndCallback(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda3
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
                        z = true;
                    }
                }
            }
            if (!z && (staticLayout = this.textLayout) != null) {
                if (x >= this.textX) {
                    float f3 = this.textY;
                    if (y >= f3 && x <= r3 + this.textWidth && y <= r4 + this.textHeight) {
                        float f4 = y - f3;
                        float f5 = x - this.textXLeft;
                        if (!z) {
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
                                        if (!z3) {
                                            z3 = checkBotButtonMotionEvent(motionEvent);
                                        }
                                        return z3 ? super.onTouchEvent(motionEvent) : z3;
                                    }
                                    this.pressedLink = null;
                                }
                            }
                            this.pressedLink = null;
                        }
                    }
                }
            }
            this.pressedLink = null;
        }
        z3 = z;
        if (!z3) {
        }
        if (z3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTouchEvent$3() {
        post(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ChatActionCell.this.lambda$onTouchEvent$2();
            }
        });
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

    private void openPremiumGiftChannel() {
        if (this.delegate != null) {
            final TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    ChatActionCell.this.lambda$openPremiumGiftChannel$4(tL_messageActionGiftCode);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openPremiumGiftChannel$4(TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode) {
        this.delegate.didOpenPremiumGiftChannel(this, tL_messageActionGiftCode.slug, false);
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

    private boolean isGiftCode() {
        MessageObject messageObject = this.currentMessageObject;
        return messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGiftCode);
    }

    private void openPremiumGiftPreview() {
        final TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        TLRPC.MessageAction messageAction = this.currentMessageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        final String str = (!isGiftCode() || isSelfGiftCode()) ? null : ((TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action).slug;
        if (this.delegate != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    ChatActionCell.this.lambda$openPremiumGiftPreview$5(tL_premiumGiftOption, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openPremiumGiftPreview$5(TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        this.delegate.didOpenPremiumGift(this, tL_premiumGiftOption, str, false);
    }

    private void openStarsGiftTransaction() {
        TLRPC.Message message;
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
            }
            new StarGiftSheet(getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.themeDelegate).set(this.currentMessageObject).show();
        } else {
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                new StarGiftSheet(getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.themeDelegate).set(this.currentMessageObject).show();
                return;
            }
            if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        new StarGiftSheet(getContext(), this.currentAccount, this.currentMessageObject.getDialogId(), this.themeDelegate).set(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null).show();
                    }
                }
            }
        }
    }

    private void openStarsNeedSheet() {
        MessageSuggestionParams obtainSuggestionOffer = this.currentMessageObject.obtainSuggestionOffer();
        AmountUtils$Amount amountUtils$Amount = obtainSuggestionOffer.amount;
        if (amountUtils$Amount == null || amountUtils$Amount.currency != AmountUtils$Currency.STARS) {
            return;
        }
        new StarsIntroActivity.StarsNeededSheet(getContext(), this.themeDelegate, obtainSuggestionOffer.amount.asDecimal(), 13, ForumUtilities.getMonoForumTitle(this.currentAccount, this.currentMessageObject.getDialogId(), true), null, this.currentMessageObject.getDialogId()).show();
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

    public void setOverrideTextMaxWidth(int i) {
        this.overriddenMaxWidth = i;
    }

    private boolean isMessageActionSuggestedPostApproval() {
        TLRPC.Message message;
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    private void createLayout(CharSequence charSequence, int i) {
        TextPaint textPaint;
        ChatActionCellDelegate chatActionCellDelegate;
        TLRPC.Message message;
        MessageObject messageObject;
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
        if (isMessageActionSuggestedPostApproval() || ((messageObject = this.currentMessageObject) != null && messageObject.type == 34)) {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText3");
        } else if (messageObject != null && messageObject.drawServiceWithDefaultTypeface) {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText2");
        } else {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        }
        TextPaint textPaint2 = textPaint;
        textPaint2.linkColor = textPaint2.getColor();
        if (isMessageActionSuggestedPostApproval()) {
            if (charSequence2 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence2;
                for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                    spannable.removeSpan(emojiSpan);
                }
            }
            charSequence2 = Emoji.replaceEmoji(charSequence, textPaint2.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        }
        CharSequence charSequence3 = charSequence2;
        this.textLayout = new StaticLayout(charSequence3, textPaint2, i3, isMessageActionSuggestedPostApproval() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.titleLayout = null;
        MessageObject messageObject2 = this.currentMessageObject;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.titleLayout = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.SuggestionAgreementReached)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        float dp;
        float dp2;
        TLRPC.Message message;
        int i4;
        int i5;
        int i6;
        int dp3;
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
            if (messageObject.type == 31) {
                this.giftRectSize = Math.min(this.giftRectSize, AndroidUtilities.dp(192.0f));
                this.stickerSize = AndroidUtilities.dp(78.0f);
            }
            if (messageObject.type == 33) {
                this.giftRectSize = Math.min(this.giftRectSize, AndroidUtilities.dp(220.0f));
                this.stickerSize = AndroidUtilities.dp(78.0f);
            }
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
                dp3 = AndroidUtilities.dp(10.0f);
            } else if (isButtonLayout(messageObject)) {
                i6 = this.giftRectSize;
                dp3 = AndroidUtilities.dp(12.0f);
            }
            i3 = i6 + dp3;
            if (!this.starGiftLayout.has()) {
                r8 = (this.starGiftLayout.repost ? 0 : this.textY + this.textHeight + AndroidUtilities.dp(16.0f)) + ((int) this.starGiftLayout.getHeight()) + AndroidUtilities.dp(8.0f);
                ReactionsLayoutInBubble reactionsLayoutInBubble = this.reactionsLayoutInBubble;
                if (!reactionsLayoutInBubble.isEmpty) {
                    reactionsLayoutInBubble.totalHeight = reactionsLayoutInBubble.height + AndroidUtilities.dp(8.0f);
                    i5 = this.reactionsLayoutInBubble.totalHeight;
                    r8 += i5;
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
                if (messageObject == null && isNewStyleButtonLayout()) {
                    setMeasuredDimension(max, this.topicSeparatorTopPadding + r8);
                } else {
                    setMeasuredDimension(max, this.topicSeparatorTopPadding + this.textHeight + i3 + AndroidUtilities.dp(14.0f));
                }
                this.reactionsLayoutInBubble.y = (getMeasuredHeight() - getPaddingTop()) - this.reactionsLayoutInBubble.totalHeight;
                return;
            }
            SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
            if (suggestBirthdayActionLayout != null) {
                r8 = suggestBirthdayActionLayout.height() + AndroidUtilities.dp(12.0f);
                ReactionsLayoutInBubble reactionsLayoutInBubble3 = this.reactionsLayoutInBubble;
                if (!reactionsLayoutInBubble3.isEmpty) {
                    reactionsLayoutInBubble3.totalHeight = reactionsLayoutInBubble3.height + AndroidUtilities.dp(8.0f);
                    i5 = this.reactionsLayoutInBubble.totalHeight;
                    r8 += i5;
                }
            } else if (isButtonLayout(messageObject)) {
                boolean isGiftChannel = isGiftChannel(messageObject);
                int imageSize = getImageSize(messageObject);
                if (isNewStyleButtonLayout()) {
                    int dp4 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                    int dp5 = AndroidUtilities.dp(16.0f);
                    if (imageSize > 0) {
                        dp5 = (dp5 * 2) + imageSize;
                    }
                    int i8 = dp4 + dp5;
                    TextLayout textLayout = this.giftPremiumText;
                    dp = i8 + (textLayout == null ? 0 : textLayout.layout.getHeight() + AndroidUtilities.dp(4.0f));
                } else {
                    dp = this.textY + this.textHeight + (this.giftRectSize * 0.075f) + imageSize + AndroidUtilities.dp(4.0f) + (this.giftPremiumText == null ? 0 : r4.layout.getHeight() + AndroidUtilities.dp(4.0f));
                }
                this.giftPremiumAdditionalHeight = 0;
                if (this.giftPremiumTitleLayout != null) {
                    float height = dp + r4.getHeight();
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
                } else if (this.giftPremiumSubtitleLayout != null) {
                    this.giftPremiumAdditionalHeight += AndroidUtilities.dp(10.0f) + height2;
                } else {
                    MessageObject messageObject2 = this.currentMessageObject;
                    if (messageObject2.type == 18 || messageObject2.isStarGiftAction()) {
                        this.giftPremiumAdditionalHeight += height2 - AndroidUtilities.dp(this.giftPremiumButtonLayout == null ? 0.0f : 10.0f);
                    } else if (this.currentMessageObject.type == 30) {
                        this.giftPremiumAdditionalHeight += height2 - AndroidUtilities.dp(20.0f);
                    } else if (this.giftPremiumTextCollapsed) {
                        this.giftPremiumAdditionalHeight += height2;
                    } else if (this.giftPremiumText.layout.getLineCount() > 2) {
                        this.giftPremiumAdditionalHeight += ((this.giftPremiumText.layout.getLineBottom(0) - this.giftPremiumText.layout.getLineTop(0)) * this.giftPremiumText.layout.getLineCount()) - 2;
                    }
                }
                if (this.giftPremiumReleasedText != null) {
                    this.giftPremiumAdditionalHeight += AndroidUtilities.dp(24.0f);
                }
                int dp6 = this.giftPremiumAdditionalHeight - AndroidUtilities.dp(isGiftChannel ? 14.0f : 0.0f);
                this.giftPremiumAdditionalHeight = dp6;
                i3 += dp6;
                int dp7 = this.textHeight + i3 + AndroidUtilities.dp(14.0f);
                if (this.giftPremiumButtonLayout != null) {
                    float height3 = dp2 + ((((dp7 - dp2) - r5.getHeight()) - AndroidUtilities.dp(8.0f)) / 2.0f);
                    if (this.currentMessageObject.isStarGiftAction()) {
                        height3 += AndroidUtilities.dp(4.0f);
                    }
                    float f = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    this.giftButtonRect.set(f - AndroidUtilities.dp(18.0f), height3 - AndroidUtilities.dp(8.0f), f + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), height3 + (this.giftPremiumButtonLayout != null ? r15.getHeight() : 0) + AndroidUtilities.dp(8.0f));
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
                    int dp8 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f);
                    this.backgroundRectHeight = 0;
                    int dp9 = imageSize > 0 ? (AndroidUtilities.dp(16.0f) * 2) + imageSize : AndroidUtilities.dp(16.0f);
                    this.backgroundRectHeight = dp9;
                    StaticLayout staticLayout = this.giftPremiumSubtitleLayout;
                    if (staticLayout != null) {
                        this.backgroundRectHeight = dp9 + staticLayout.getHeight() + AndroidUtilities.dp(10.0f);
                    }
                    if (this.giftPremiumReleasedText != null) {
                        this.backgroundRectHeight += AndroidUtilities.dp(24.0f);
                    }
                    int i9 = this.backgroundRectHeight + height2;
                    this.backgroundRectHeight = i9;
                    float f2 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    if (this.giftPremiumButtonLayout != null) {
                        this.backgroundButtonTop = i9 + dp8 + AndroidUtilities.dp(10.0f);
                        this.giftButtonRect.set(f2 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f2 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + this.giftPremiumButtonLayout.getHeight() + (AndroidUtilities.dp(8.0f) * 2));
                        this.backgroundRectHeight = (int) (this.backgroundRectHeight + AndroidUtilities.dp(10.0f) + this.giftButtonRect.height());
                    } else if (!isMessageActionSuggestedPostApproval() && (messageObject == null || ((i4 = messageObject.type) != 34 && i4 != 33))) {
                        this.giftButtonRect.set(f2 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f2 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + AndroidUtilities.dp(17.0f) + (AndroidUtilities.dp(8.0f) * 2));
                        this.backgroundRectHeight += AndroidUtilities.dp(17.0f);
                    }
                    int dp10 = this.backgroundRectHeight + AndroidUtilities.dp(16.0f);
                    this.backgroundRectHeight = dp10;
                    int dp11 = dp8 + dp10 + AndroidUtilities.dp(6.0f);
                    ReactionsLayoutInBubble reactionsLayoutInBubble4 = this.reactionsLayoutInBubble;
                    if (!reactionsLayoutInBubble4.isEmpty) {
                        reactionsLayoutInBubble4.totalHeight = reactionsLayoutInBubble4.height + AndroidUtilities.dp(8.0f);
                        dp11 += this.reactionsLayoutInBubble.totalHeight;
                    }
                    r8 = dp11;
                    if (messageObject != null && !messageObject.isOut() && messageObject.type == 33) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageObject.messageOwner.action;
                        if (!tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined) {
                            r8 += AndroidUtilities.dp(44.0f);
                        }
                    }
                }
            }
            if (this.currentMessageObject != null) {
            }
            if (isMessageActionSuggestedPostApproval()) {
            }
            if (messageObject == null) {
            }
            setMeasuredDimension(max, this.topicSeparatorTopPadding + this.textHeight + i3 + AndroidUtilities.dp(14.0f));
            this.reactionsLayoutInBubble.y = (getMeasuredHeight() - getPaddingTop()) - this.reactionsLayoutInBubble.totalHeight;
            return;
        }
        i3 = 0;
        if (!this.starGiftLayout.has()) {
        }
    }

    private boolean isNewStyleButtonLayout() {
        MessageObject messageObject;
        int i;
        if (!this.starGiftLayout.has() && this.birthdayLayout == null && (i = (messageObject = this.currentMessageObject).type) != 31 && i != 33 && i != 34 && i != 21 && i != 22 && !messageObject.isStoryMention()) {
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

    private int getImageSize(MessageObject messageObject) {
        int i = this.stickerSize;
        if (messageObject.type == 21 || isNewStyleButtonLayout()) {
            i = AndroidUtilities.dp(78.0f);
        }
        if (isMessageActionSuggestedPostApproval() || messageObject.type == 34) {
            return 0;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x060c, code lost:
    
        if (r8 == false) goto L271;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void buildLayout() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence string;
        CharSequence charSequence3;
        boolean z;
        CharSequence formatString;
        CharSequence string2;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        CharSequence charSequence4;
        String formatString2;
        long j;
        long j2;
        boolean z2;
        TL_stars.StarGift starGift;
        String str;
        CharSequence replaceTags;
        TL_stars.StarGift starGift2;
        CharSequence charSequence5;
        CharSequence charSequence6;
        TL_stars.StarGift starGift3;
        CharSequence charSequence7;
        String publicUsername;
        char c;
        Object valueOf;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i;
        TLRPC.MessageMedia messageMedia;
        this.giftRectEmpty = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            if (!messageObject.isExpiredStory()) {
                ChatActionCellDelegate chatActionCellDelegate = this.delegate;
                charSequence = (chatActionCellDelegate != null && chatActionCellDelegate.getTopicId() == 0 && MessageObject.isTopicActionMessage(messageObject)) ? ForumUtilities.createActionTextWithTopic(MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true)), messageObject) : null;
            } else if (messageObject.messageOwner.media.user_id != UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                charSequence = StoriesUtilities.createExpiredStoryString(true, org.telegram.messenger.R.string.ExpiredStoryMention, new Object[0]);
            } else {
                charSequence = StoriesUtilities.createExpiredStoryString(true, org.telegram.messenger.R.string.ExpiredStoryMentioned, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name);
            }
            if (charSequence == null) {
                TLRPC.Message message2 = messageObject.messageOwner;
                if (message2 != null && (messageMedia = message2.media) != null && messageMedia.ttl_seconds != 0) {
                    if (messageMedia.photo != null) {
                        charSequence = LocaleController.getString(org.telegram.messenger.R.string.AttachPhotoExpired);
                    } else {
                        TLRPC.Document document = messageMedia.document;
                        if ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) {
                            if (messageMedia.voice) {
                                charSequence = LocaleController.getString(org.telegram.messenger.R.string.AttachVoiceExpired);
                            } else if (messageMedia.round) {
                                charSequence = LocaleController.getString(org.telegram.messenger.R.string.AttachRoundExpired);
                            } else {
                                charSequence = LocaleController.getString(org.telegram.messenger.R.string.AttachVideoExpired);
                            }
                        } else {
                            charSequence = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
                        }
                    }
                } else {
                    charSequence = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
                }
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
                i = org.telegram.messenger.R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                if (tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size()) {
                    i = org.telegram.messenger.R.drawable.mini_checklist_undone;
                } else {
                    i = org.telegram.messenger.R.drawable.mini_checklist_done;
                }
            } else {
                i = 0;
            }
            if (i != 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.insert(0, (CharSequence) "i ");
                spannableStringBuilder.setSpan(new ColoredImageSpan(i), 0, 1, 33);
                charSequence = spannableStringBuilder;
            }
        }
        createLayout(charSequence, this.previousWidth);
        if (this.birthdayLayout != null) {
            this.textLayout = null;
            this.textHeight = 0;
            this.titleLayout = null;
            this.titleHeight = 0;
            this.textY = 0;
        }
        if (messageObject != null) {
            TLRPC.Message message3 = messageObject.messageOwner;
            if (message3 != null) {
                TLRPC.MessageAction messageAction2 = message3.action;
                if ((messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction2).balance_too_low) {
                    createGiftPremiumLayouts(null, null, null, charSequence, false, !ChatObject.canManageMonoForum(this.currentAccount, messageObject.getDialogId()) ? LocaleController.getString(org.telegram.messenger.R.string.StarsBuy) : null, 11, null, this.giftRectSize, false, true);
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
                    createGiftPremiumLayouts(null, null, null, charSequence, false, null, 11, null, this.giftRectSize, false, true);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                    this.giftRectEmpty = true;
                }
            }
            int i2 = messageObject.type;
            if (i2 == 11) {
                float dp = this.textHeight + AndroidUtilities.dp(19.0f);
                float f = AndroidUtilities.roundMessageSize;
                this.imageReceiver.setImageCoords((this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f, dp, f, f);
            } else if (i2 == 25) {
                createGiftPremiumChannelLayouts();
            } else if (i2 == 30) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.currentMessageObject.getDialogId()));
                TLRPC.MessageAction messageAction4 = messageObject.messageOwner.action;
                if (messageAction4 instanceof TLRPC.TL_messageActionGiftStars) {
                    createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction4).stars), null, null, AndroidUtilities.replaceTags(this.currentMessageObject.isOutOwner() ? LocaleController.formatString(org.telegram.messenger.R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user)) : LocaleController.getString(org.telegram.messenger.R.string.ActionGiftStarsSubtitleYou)), false, LocaleController.getString(org.telegram.messenger.R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                } else if ((messageAction4 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction4).refunded) {
                    long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action;
                    if (messageObject.isOutOwner() != (!tL_messageActionStarGiftUnique.upgrade)) {
                        clientUserId = messageObject.getDialogId();
                    }
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(clientUserId));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(tL_messageActionStarGiftUnique.prepaid_upgrade ? org.telegram.messenger.R.string.Gift2ActionUpgradeTitle : org.telegram.messenger.R.string.Gift2ActionTitle)).append((CharSequence) " ");
                    if (user2 != null && user2.photo != null) {
                        spannableStringBuilder2.append((CharSequence) "a ");
                        AvatarSpan avatarSpan = new AvatarSpan(this, this.currentAccount, 18.0f);
                        avatarSpan.setUser(user2);
                        spannableStringBuilder2.setSpan(avatarSpan, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) UserObject.getForcedFirstName(user2));
                    createGiftPremiumLayouts(spannableStringBuilder2, null, null, LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(org.telegram.messenger.R.string.ActionGiftStarsView), 12, LocaleController.getString(org.telegram.messenger.R.string.Gift2UniqueRibbon), this.giftRectSize, true, false);
                } else if (messageAction4 instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction4;
                    long j3 = tL_messageActionStarGift.convert_stars;
                    long clientUserId2 = UserConfig.getInstance(this.currentAccount).getClientUserId();
                    TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                    boolean z3 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                    boolean z4 = messageObject.getDialogId() == clientUserId2 && !z3;
                    long fromChatId = messageObject.getFromChatId();
                    if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                        fromChatId = DialogObject.getPeerDialogId(peer);
                    }
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(fromChatId);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                    TLObject userOrChat2 = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId);
                    if (!tL_messageActionStarGift.can_upgrade || tL_messageActionStarGift.converted) {
                        j = j3;
                        j2 = 0;
                    } else {
                        j = j3;
                        j2 = 0;
                        if (tL_messageActionStarGift.upgrade_stars > 0 && !tL_messageActionStarGift.upgraded) {
                            z2 = true;
                            if (peerDialogId == j2 && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                                if (DialogObject.hasPhoto(userOrChat2)) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    AvatarSpan avatarSpan2 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                    avatarSpan2.setObject(userOrChat2);
                                    spannableStringBuilder3.setSpan(avatarSpan2, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat2));
                            } else if (!z4) {
                                if (tL_messageActionStarGift.gift_num > 0 && (starGift = tL_messageActionStarGift.gift) != null && (str = starGift.title) != null) {
                                    spannableStringBuilder3.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                                } else {
                                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionSelfTitle));
                                }
                            } else {
                                spannableStringBuilder3.append((CharSequence) LocaleController.getString(tL_messageActionStarGift.prepaid_upgrade ? org.telegram.messenger.R.string.Gift2ActionUpgradeTitle : org.telegram.messenger.R.string.Gift2ActionTitle)).append((CharSequence) " ");
                                if (DialogObject.hasPhoto(userOrChat)) {
                                    spannableStringBuilder3.append((CharSequence) "a ");
                                    AvatarSpan avatarSpan3 = new AvatarSpan(this, this.currentAccount, 18.0f);
                                    avatarSpan3.setObject(userOrChat);
                                    spannableStringBuilder3.setSpan(avatarSpan3, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                                }
                                spannableStringBuilder3.append((CharSequence) DialogObject.getShortName(userOrChat));
                            }
                            boolean z5 = !((messageObject.isOutOwner() || z4) && tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - messageObject.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
                            if (!tL_messageActionStarGift.refunded) {
                                replaceTags = LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionConvertRefundedText);
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                                if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                    this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                    MessageObject.addEntitiesToText(spannableStringBuilder4, tL_messageActionStarGift.message.entities, false, false, true, true);
                                    replaceTags = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder4, this.giftTextPaint.getFontMetricsInt(), false, (int[]) null), tL_messageActionStarGift.message.entities, this.giftTextPaint.getFontMetricsInt());
                                } else if (tL_messageActionStarGift.auction_acquired) {
                                    replaceTags = LocaleController.formatString(org.telegram.messenger.R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars, ','));
                                } else if (!z3) {
                                    long j4 = j;
                                    if (z4) {
                                        if (tL_messageActionStarGift.converted && j4 > 0) {
                                            replaceTags = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                        } else if (tL_messageActionStarGift.can_upgrade) {
                                            replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionSelfInfoUpgrade));
                                        } else {
                                            replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionSelfInfoNoConvert));
                                        }
                                    } else if (z2) {
                                        replaceTags = AndroidUtilities.replaceTags(messageObject.isOutOwner() ? LocaleController.formatString(org.telegram.messenger.R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user)) : LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionUpgrade));
                                    } else if (messageObject.isOutOwner()) {
                                        if (!z5 || j4 <= 0) {
                                            replaceTags = tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user))) : AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user)));
                                        } else {
                                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j4, UserObject.getForcedFirstName(user)));
                                        }
                                    } else if (tL_messageActionStarGift.converted) {
                                        replaceTags = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j4);
                                    } else if (tL_messageActionStarGift.saved) {
                                        if (!z5) {
                                            replaceTags = LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionBotSavedInfo);
                                        } else {
                                            replaceTags = LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionSavedInfo);
                                        }
                                    } else if (!z5) {
                                        replaceTags = LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionBotInfo);
                                    } else {
                                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j4));
                                    }
                                } else if (tL_messageActionStarGift.converted) {
                                    replaceTags = LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j);
                                } else {
                                    long j5 = j;
                                    if (z5 && j5 > 0) {
                                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j5));
                                    } else {
                                        replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.Gift2ActionInfoChannelNoConvert));
                                    }
                                }
                            }
                            CharSequence charSequence8 = replaceTags;
                            starGift2 = tL_messageActionStarGift.gift;
                            if (starGift2 == null && starGift2.limited) {
                                int i3 = org.telegram.messenger.R.string.Gift2Limited1OfRibbon;
                                int i4 = starGift2.availability_total;
                                if (i4 > 1500) {
                                    c = 0;
                                    valueOf = AndroidUtilities.formatWholeNumber(i4, 0);
                                } else {
                                    c = 0;
                                    valueOf = Integer.valueOf(i4);
                                }
                                Object[] objArr = new Object[1];
                                objArr[c] = valueOf;
                                charSequence5 = LocaleController.formatString(i3, objArr);
                            } else {
                                charSequence5 = null;
                            }
                            CharSequence string3 = LocaleController.getString(org.telegram.messenger.R.string.ActionGiftStarsView);
                            if (messageObject.isOutOwner()) {
                                charSequence6 = string3;
                                if (!tL_messageActionStarGift.forceIn) {
                                }
                            }
                            charSequence6 = string3;
                            charSequence6 = string3;
                            if (!messageObject.isOutOwner() && z2) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append("^  ");
                                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(org.telegram.messenger.R.drawable.gift_unpack);
                                coloredImageSpan.setScale(0.8f, 0.8f);
                                spannableStringBuilder5.setSpan(coloredImageSpan, 0, 1, 33);
                                spannableStringBuilder5.append(LocaleController.getString(org.telegram.messenger.R.string.Gift2Unpack));
                                charSequence6 = spannableStringBuilder5;
                            }
                            CharSequence charSequence9 = charSequence6;
                            starGift3 = tL_messageActionStarGift.gift;
                            if (starGift3 != null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                                charSequence7 = null;
                            } else {
                                charSequence7 = StarGiftSheet.replaceSingleTagToLink(LocaleController.formatString(org.telegram.messenger.R.string.Gift2ActionReleasedBy, "@" + publicUsername), null);
                            }
                            createGiftPremiumLayouts(spannableStringBuilder3, null, charSequence7, charSequence8, false, charSequence9, 11, charSequence5, this.giftRectSize, true, false);
                        }
                    }
                    z2 = false;
                    if (peerDialogId == j2) {
                    }
                    if (!z4) {
                    }
                    if (messageObject.isOutOwner()) {
                    }
                    if (!tL_messageActionStarGift.refunded) {
                    }
                    CharSequence charSequence82 = replaceTags;
                    starGift2 = tL_messageActionStarGift.gift;
                    if (starGift2 == null) {
                    }
                    charSequence5 = null;
                    CharSequence string32 = LocaleController.getString(org.telegram.messenger.R.string.ActionGiftStarsView);
                    if (messageObject.isOutOwner()) {
                    }
                    charSequence6 = string32;
                    charSequence6 = string32;
                    if (!messageObject.isOutOwner()) {
                        SpannableStringBuilder spannableStringBuilder52 = new SpannableStringBuilder();
                        spannableStringBuilder52.append("^  ");
                        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(org.telegram.messenger.R.drawable.gift_unpack);
                        coloredImageSpan2.setScale(0.8f, 0.8f);
                        spannableStringBuilder52.setSpan(coloredImageSpan2, 0, 1, 33);
                        spannableStringBuilder52.append(LocaleController.getString(org.telegram.messenger.R.string.Gift2Unpack));
                        charSequence6 = spannableStringBuilder52;
                    }
                    CharSequence charSequence92 = charSequence6;
                    starGift3 = tL_messageActionStarGift.gift;
                    if (starGift3 != null) {
                    }
                    charSequence7 = null;
                    createGiftPremiumLayouts(spannableStringBuilder3, null, charSequence7, charSequence82, false, charSequence92, 11, charSequence5, this.giftRectSize, true, false);
                } else if (messageAction4 instanceof TLRPC.TL_messageActionGiftTon) {
                    createGiftPremiumLayouts(LocaleController.getString(org.telegram.messenger.R.string.ActionGiftTonTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(org.telegram.messenger.R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                } else {
                    createGiftPremiumLayouts(LocaleController.getString(org.telegram.messenger.R.string.ActionStarGiveawayPrizeTitle), null, null, this.currentMessageObject.messageText, false, LocaleController.getString(org.telegram.messenger.R.string.ActionGiftStarsView), 11, null, this.giftRectSize, true, false);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                }
            } else if (i2 == 33) {
                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(charSequence);
                spannableStringBuilder6.append((CharSequence) "\n\n");
                if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                    spannableStringBuilder6.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.GiftOfferStatusAccepted)));
                } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                    spannableStringBuilder6.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.GiftOfferStatusRejected)));
                } else {
                    int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
                    if (max == 0) {
                        spannableStringBuilder6.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(org.telegram.messenger.R.string.GiftOfferStatusExpired)));
                    } else {
                        spannableStringBuilder6.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.GiftOfferStatusPending, LocaleController.formatShortDuration2(max))));
                    }
                }
                createGiftPremiumLayouts(null, null, null, spannableStringBuilder6, false, null, 11, null, this.giftRectSize, false, false);
                this.textLayout = null;
                this.textHeight = 0;
                this.titleLayout = null;
                this.titleHeight = 0;
                this.textY = 0;
                this.giftRectEmpty = false;
            } else if (i2 == 34) {
                createGiftPremiumLayouts(null, null, null, charSequence, false, null, 11, null, this.giftRectSize, false, true);
                this.textLayout = null;
                this.textHeight = 0;
                this.titleLayout = null;
                this.titleHeight = 0;
                this.textY = 0;
                this.giftRectEmpty = true;
            } else if (i2 == 31) {
                String str2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift.title + " #" + LocaleController.formatNumber(r0.num, ',');
                long fromChatId2 = messageObject.getFromChatId();
                if (UserConfig.getInstance(this.currentAccount).getClientUserId() == fromChatId2) {
                    formatString2 = LocaleController.formatString(org.telegram.messenger.R.string.GiftThemesSetByYou, str2);
                } else {
                    formatString2 = LocaleController.formatString(org.telegram.messenger.R.string.GiftThemesSetByOther, DialogObject.getShortName(this.currentAccount, fromChatId2), str2);
                }
                createGiftPremiumLayouts(null, null, null, AndroidUtilities.replaceTags(formatString2), false, LocaleController.getString(org.telegram.messenger.R.string.GiftThemesSetActionView), 11, null, this.giftRectSize, true, false);
                this.textLayout = null;
                this.textHeight = 0;
                this.titleLayout = null;
                this.titleHeight = 0;
                this.textY = 0;
            } else if (i2 == 18) {
                TLRPC.MessageAction messageAction5 = message3.action;
                if (messageAction5 instanceof TLRPC.TL_messageActionGiftPremium) {
                    tL_textWithEntities = ((TLRPC.TL_messageActionGiftPremium) messageAction5).message;
                } else {
                    tL_textWithEntities = messageAction5 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction5).message : null;
                }
                if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
                    charSequence4 = null;
                } else {
                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(tL_textWithEntities.text);
                    this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
                    MessageObject.addEntitiesToText(spannableStringBuilder7, tL_textWithEntities.entities, false, false, true, true);
                    charSequence4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder7, this.giftTextPaint.getFontMetricsInt(), false, (int[]) null), tL_textWithEntities.entities, this.giftTextPaint.getFontMetricsInt());
                }
                createGiftPremiumLayouts(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, null, charSequence4 == null ? LocaleController.getString(org.telegram.messenger.R.string.ActionGiftPremiumText) : charSequence4, true, LocaleController.getString((!isGiftCode() || isSelfGiftCode()) ? org.telegram.messenger.R.string.ActionGiftPremiumView : org.telegram.messenger.R.string.GiftPremiumUseGiftBtn), 11, null, this.giftRectSize, false, false);
            } else if (i2 == 21) {
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.isOutOwner() ? 0L : messageObject.getDialogId()));
                boolean z6 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                if (user3.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId()));
                    if (z6) {
                        formatString = LocaleController.formatString(org.telegram.messenger.R.string.ActionSuggestVideoFromYouDescription, user4.first_name);
                    } else {
                        formatString = LocaleController.formatString(org.telegram.messenger.R.string.ActionSuggestPhotoFromYouDescription, user4.first_name);
                    }
                } else if (z6) {
                    formatString = LocaleController.formatString(org.telegram.messenger.R.string.ActionSuggestVideoToYouDescription, user3.first_name);
                } else {
                    formatString = LocaleController.formatString(org.telegram.messenger.R.string.ActionSuggestPhotoToYouDescription, user3.first_name);
                }
                CharSequence charSequence10 = formatString;
                if (tL_messageActionSuggestProfilePhoto.video || ((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) != null && !arrayList.isEmpty())) {
                    string2 = LocaleController.getString(org.telegram.messenger.R.string.ViewVideoAction);
                } else {
                    string2 = LocaleController.getString(org.telegram.messenger.R.string.ViewPhotoAction);
                }
                createGiftPremiumLayouts(null, null, null, charSequence10, false, string2, 11, null, this.giftRectSize, true, false);
                this.textLayout = null;
                this.textHeight = 0;
                this.titleLayout = null;
                this.titleHeight = 0;
                this.textY = 0;
            } else if (i2 == 22) {
                TLRPC.User user5 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.isOutOwner() ? 0L : messageObject.getDialogId()));
                if (messageObject.getDialogId() < 0) {
                    charSequence3 = messageObject.messageText;
                } else if (!messageObject.isOutOwner() && messageObject.isWallpaperForBoth() && messageObject.isCurrentWallpaper()) {
                    charSequence2 = messageObject.messageText;
                    string = LocaleController.getString(org.telegram.messenger.R.string.RemoveWallpaperAction);
                    z = false;
                    createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                } else if (user5 != null && user5.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    charSequence3 = messageObject.messageText;
                } else {
                    charSequence2 = messageObject.messageText;
                    string = LocaleController.getString(org.telegram.messenger.R.string.ViewWallpaperAction);
                    z = true;
                    createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                    this.textLayout = null;
                    this.textHeight = 0;
                    this.titleLayout = null;
                    this.titleHeight = 0;
                    this.textY = 0;
                }
                charSequence2 = charSequence3;
                string = null;
                z = true;
                createGiftPremiumLayouts(null, null, null, charSequence2, false, string, 11, null, this.giftRectSize, z, false);
                this.textLayout = null;
                this.textHeight = 0;
                this.titleLayout = null;
                this.titleHeight = 0;
                this.textY = 0;
            } else if (messageObject.isStoryMention()) {
                TLRPC.User user6 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                createGiftPremiumLayouts(null, null, null, user6.self ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryYouMentionedTitle", org.telegram.messenger.R.string.StoryYouMentionedTitle, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId())).first_name)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoryMentionedTitle", org.telegram.messenger.R.string.StoryMentionedTitle, user6.first_name)), false, LocaleController.getString(org.telegram.messenger.R.string.StoryMentionedAction), 11, null, this.giftRectSize, true, false);
                this.textLayout = null;
                this.textHeight = 0;
                this.titleLayout = null;
                this.titleHeight = 0;
                this.textY = 0;
            }
        }
        this.reactionsLayoutInBubble.x = AndroidUtilities.dp(12.0f);
        this.reactionsLayoutInBubble.measure(this.previousWidth - AndroidUtilities.dp(24.0f), 1);
    }

    private void createGiftPremiumChannelLayouts() {
        String string;
        SpannableStringBuilder spannableStringBuilder;
        int dp = this.giftRectSize - AndroidUtilities.dp(16.0f);
        this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.currentMessageObject.messageOwner.action;
        int i = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str = chat == null ? null : chat.title;
        boolean z = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            string = LocaleController.getString("BoostingUnclaimedPrize", org.telegram.messenger.R.string.BoostingUnclaimedPrize);
        } else {
            string = LocaleController.getString("BoostingCongratulations", org.telegram.messenger.R.string.BoostingCongratulations);
        }
        String formatPluralString = i == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i, new Object[0]);
        if (z) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.BoostingYouHaveUnclaimedPrize, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.BoostingUnclaimedPrizeDuration, formatPluralString)));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.BoostingReceivedPrizeFrom, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.BoostingReceivedPrizeDuration, formatPluralString)));
            }
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(str == null ? LocaleController.getString(org.telegram.messenger.R.string.BoostingReceivedGiftNoName) : LocaleController.formatString("BoostingReceivedGiftFrom", org.telegram.messenger.R.string.BoostingReceivedGiftFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(org.telegram.messenger.R.string.BoostingReceivedGiftDuration, formatPluralString)));
        }
        String string2 = LocaleController.getString("BoostingReceivedGiftOpenBtn", org.telegram.messenger.R.string.BoostingReceivedGiftOpenBtn);
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
    /* JADX WARN: Type inference failed for: r6v4 */
    private void createGiftPremiumLayouts(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z, CharSequence charSequence5, int i, CharSequence charSequence6, int i2, boolean z2, boolean z3) {
        ?? r6;
        int i3;
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
            if (messageObject2 != null && messageObject2.type == 30) {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                this.giftTitlePaint.setTextSize(AndroidUtilities.dp(16.0f));
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
        if (this.currentMessageObject != null && (isNewStyleButtonLayout() || (i4 = this.currentMessageObject.type) == 30 || i4 == 18 || i4 == 31 || i4 == 33)) {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            this.giftTextPaint.setTextSize(AndroidUtilities.dp(15.0f));
        }
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
            i3 = 0;
            this.giftPremiumTextCollapsed = false;
        } else {
            i3 = 0;
            if (this.giftPremiumText == null) {
                this.giftPremiumText = new TextLayout();
            }
            try {
                charSequence7 = Emoji.replaceEmoji(charSequence7, this.giftTextPaint.getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            this.giftPremiumText.setText(charSequence7, this.giftTextPaint, dp2);
            if (z && this.giftPremiumText.layout.getLineCount() > 3) {
                this.giftPremiumTextCollapsed = !this.giftPremiumTextUncollapsed;
                this.giftPremiumTextCollapsedHeight = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMore = new Text(LocaleController.getString(org.telegram.messenger.R.string.Gift2CaptionMore), this.giftTextPaint.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = this.giftPremiumText.layout.getLineBottom(2);
                this.giftPremiumTextMoreY = lineBottom;
                this.giftPremiumTextMoreH = lineBottom - this.giftPremiumText.layout.getLineTop(2);
                this.giftPremiumTextMoreX = (int) this.giftPremiumText.layout.getLineRight(2);
            } else {
                this.giftPremiumTextCollapsed = false;
                this.giftPremiumTextExpandedAnimated.set(true, true);
                this.giftPremiumTextCollapsedHeight = 0;
            }
            if (this.giftPremiumTextCollapsed) {
                this.giftPremiumText.setText(charSequence7.subSequence(0, this.giftPremiumText.layout.getLineEnd(2) - 1), this.giftTextPaint, dp2);
            }
        }
        if (charSequence5 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
            valueOf2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), i3, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) getThemedPaint("paintChatActionText"), dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.giftPremiumButtonLayout = staticLayout;
            this.buttonClickableAsImage = z2 && !this.giftPremiumTextCollapsed;
            this.giftPremiumButtonWidth = measureLayoutWidth(staticLayout);
        } else {
            this.giftPremiumButtonLayout = r6;
            this.buttonClickableAsImage = false;
            this.giftPremiumButtonWidth = 0.0f;
        }
        if (charSequence6 != null) {
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
            return;
        }
        this.giftRibbonPath = r6;
        this.giftRibbonText = r6;
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

    public boolean showingCancelButton() {
        RadialProgress2 radialProgress2 = this.radialProgress;
        return radialProgress2 != null && radialProgress2.getIcon() == 3;
    }

    public int getCustomDate() {
        return this.customDate;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0568 A[LOOP:1: B:100:0x0562->B:102:0x0568, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0c24  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0d8a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0e4d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0ed7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0f0d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0f4a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0fb3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0f79  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0f89  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0f7d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0f4f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0f23  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0ea9  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0d9a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x051a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        int i;
        float f;
        float dp;
        int i2;
        float dp2;
        float f2;
        float f3;
        float f4;
        Text text;
        TextLayout textLayout;
        StaticLayout staticLayout;
        Theme.ResourcesProvider resourcesProvider;
        boolean z;
        float f5;
        float clamp;
        Paint themedPaint;
        Theme.ResourcesProvider resourcesProvider2;
        boolean isDark;
        ColorMatrix colorMatrix;
        float f6;
        int i3;
        int i4;
        int i5;
        Text text2;
        ChatActionCellDelegate chatActionCellDelegate;
        canvas.save();
        canvas.translate(this.sideMenuWidth / 2.0f, getPaddingTop());
        MessageObject messageObject = this.currentMessageObject;
        float f7 = this.giftPremiumTextExpandedAnimated.set(!this.giftPremiumTextCollapsed);
        int i6 = this.stickerSize;
        if (!this.starGiftLayout.has() && this.birthdayLayout == null && isButtonLayout(messageObject)) {
            this.stickerSize = this.giftRectSize - AndroidUtilities.dp(106.0f);
            if (isNewStyleButtonLayout()) {
                int imageSize = getImageSize(messageObject);
                float f8 = (this.previousWidth - imageSize) / 2.0f;
                float dp3 = this.textY + this.textHeight + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f);
                if (messageObject.isStoryMention()) {
                    this.avatarStoryParams.storyItem = messageObject.messageOwner.media.storyItem;
                }
                float f9 = imageSize;
                this.avatarStoryParams.originalAvatarRect.set(f8, dp3, f8 + f9, f9 + dp3);
                int i7 = messageObject.type;
                if (i7 == 31 || i7 == 33 || i7 == 34) {
                    f8 += AndroidUtilities.dp(10.0f);
                    dp3 += AndroidUtilities.dp(10.0f);
                    imageSize -= AndroidUtilities.dp(20.0f);
                }
                this.imageReceiver.setImageCoords(f8, dp3, Math.max(0, imageSize), Math.max(0, imageSize));
                i6 = imageSize + AndroidUtilities.dp(20.0f);
            } else {
                int i8 = messageObject.type;
                if (i8 == 11) {
                    ImageReceiver imageReceiver = this.imageReceiver;
                    int i9 = this.previousWidth;
                    float f10 = this.stickerSize;
                    imageReceiver.setImageCoords((i9 - r3) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f), f10, f10);
                } else if (i8 == 25) {
                    i6 = (int) (this.stickerSize * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                    float f11 = i6;
                    this.imageReceiver.setImageCoords((this.previousWidth - i6) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(22.0f), f11, f11);
                } else if (messageObject.isStarGiftAction()) {
                    float f12 = i6;
                    this.imageReceiver.setImageCoords((this.previousWidth - i6) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f) + AndroidUtilities.dp(2.0f), f12, f12);
                } else if (messageObject.type == 30) {
                    i6 = (int) (this.stickerSize * 1.1f);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null && !(message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        float f13 = i6;
                        this.imageReceiver.setImageCoords((this.previousWidth - i6) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(22.0f), f13, f13);
                    } else {
                        float f14 = i6;
                        this.imageReceiver.setImageCoords((this.previousWidth - i6) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(12.0f), f14, f14);
                    }
                } else {
                    i6 = (int) (this.stickerSize * 1.0f);
                    float f15 = i6;
                    this.imageReceiver.setImageCoords((this.previousWidth - i6) / 2.0f, ((this.textY + this.textHeight) + (this.giftRectSize * 0.075f)) - AndroidUtilities.dp(4.0f), f15, f15);
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
        int i10 = i6;
        drawBackground(canvas, false);
        if (this.starGiftLayout.has()) {
            canvas.save();
            float width = (getWidth() - this.starGiftLayout.getWidth()) / 2.0f;
            this.starGiftLayoutX = width;
            float dp4 = this.starGiftLayout.repost ? AndroidUtilities.dp(4.0f) : this.textY + this.textHeight + AndroidUtilities.dp(16.0f);
            this.starGiftLayoutY = dp4;
            canvas.translate(width, dp4);
            this.starGiftLayout.draw(canvas);
            ChatActionCellDelegate chatActionCellDelegate2 = this.delegate;
            if (chatActionCellDelegate2 == null || chatActionCellDelegate2.canDrawOutboundsContent()) {
                this.starGiftLayout.drawOutbounds(canvas);
            }
            canvas.restore();
        } else if (this.birthdayLayout != null) {
            canvas.save();
            this.birthdayLayout.draw(canvas);
            canvas.restore();
        } else if (isButtonLayout(messageObject) || (messageObject != null && messageObject.type == 11)) {
            GiftSheet.CardBackground cardBackground = this.cardBackground;
            if (cardBackground != null && ((i = messageObject.type) == 31 || i == 33)) {
                cardBackground.setBounds((int) (this.imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (this.imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (this.imageReceiver.getImageX() + this.imageReceiver.getImageWidth() + AndroidUtilities.dp(13.33f)), (int) (this.imageReceiver.getImageY() + this.imageReceiver.getImageHeight() + AndroidUtilities.dp(14.0f)));
                this.cardBackground.draw(canvas);
            }
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
            int i11 = messageObject.type;
            if (i11 == 21) {
                ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id);
                if (imageUpdater != null) {
                    this.radialProgress.setProgress(imageUpdater.getCurrentImageProgress(), true);
                    this.radialProgress.setCircleRadius(((int) (this.imageReceiver.getImageWidth() * 0.5f)) + 1);
                    this.radialProgress.setMaxIconSize(AndroidUtilities.dp(24.0f));
                    this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                    if (imageUpdater.getCurrentImageProgress() == 1.0f) {
                        this.radialProgress.setIcon(4, true, true);
                    } else {
                        this.radialProgress.setIcon(3, true, true);
                    }
                }
                this.radialProgress.draw(canvas);
            } else {
                if (i11 == 22) {
                    float uploadingInfoProgress = getUploadingInfoProgress(messageObject);
                    this.radialProgress.setProgress(uploadingInfoProgress, true);
                    this.radialProgress.setCircleRadius(AndroidUtilities.dp(26.0f));
                    this.radialProgress.setMaxIconSize(AndroidUtilities.dp(24.0f));
                    this.radialProgress.setColorKeys(Theme.key_chat_mediaLoaderPhoto, Theme.key_chat_mediaLoaderPhotoSelected, Theme.key_chat_mediaLoaderPhotoIcon, Theme.key_chat_mediaLoaderPhotoIconSelected);
                    if (uploadingInfoProgress == 1.0f) {
                        this.radialProgress.setIcon(4, true, true);
                    } else {
                        this.radialProgress.setIcon(3, true, true);
                    }
                    this.radialProgress.draw(canvas);
                }
                if (this.textPaint != null || this.textLayout == null) {
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
                    ChatActionCellDelegate chatActionCellDelegate3 = this.delegate;
                    if (chatActionCellDelegate3 == null || chatActionCellDelegate3.canDrawOutboundsContent()) {
                        StaticLayout staticLayout2 = this.textLayout;
                        f = 16.0f;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout2, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout2 == null ? null : getAdaptiveEmojiColorFilter(staticLayout2.getPaint().getColor()));
                    } else {
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
                    chatActionCellDelegate = this.delegate;
                    if (chatActionCellDelegate != null || chatActionCellDelegate.canDrawOutboundsContent()) {
                        StaticLayout staticLayout3 = this.titleLayout;
                        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.animatedEmojiStack;
                        List list = this.spoilers;
                        StaticLayout staticLayout4 = this.textLayout;
                        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout3, emojiGroupedSpans, 0.0f, list, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout4 != null ? null : getAdaptiveEmojiColorFilter(staticLayout4.getPaint().getColor()));
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
                    if (messageObject.type != 22) {
                        f16 += AndroidUtilities.dp(8.0f);
                    }
                    float f17 = f16;
                    if (!isNewStyleButtonLayout()) {
                        RectF rectF = this.backgroundRect;
                        dp = (rectF != null ? rectF.top : this.textY + this.textHeight + AndroidUtilities.dp(4.0f)) + (i10 > 0 ? (AndroidUtilities.dp(f) * 2) + i10 : AndroidUtilities.dp(f));
                    } else {
                        float f18 = this.textY + this.textHeight + (this.giftRectSize * 0.075f);
                        if (messageObject.type != 21) {
                            i10 = this.stickerSize;
                        }
                        dp = f18 + i10 + AndroidUtilities.dp(4.0f);
                        if (messageObject.type == 21) {
                            dp += AndroidUtilities.dp(f);
                        }
                        if (messageObject.isStarGiftAction()) {
                            dp += AndroidUtilities.dp(12.0f);
                        } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                            dp -= AndroidUtilities.dp(3.66f);
                        }
                    }
                    i2 = messageObject.type;
                    if (i2 != 31 || i2 == 33) {
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
                        dp2 = height + AndroidUtilities.dp(messageObject.type == 25 ? 6.0f : 0.0f);
                    } else {
                        dp2 = dp - AndroidUtilities.dp(4.0f);
                    }
                    float f19 = dp2;
                    canvas.restore();
                    if (this.giftPremiumTitleLayout != null || (text2 = this.giftPremiumReleasedText) == null) {
                        f2 = 0.0f;
                    } else {
                        float width2 = text2.getWidth() + AndroidUtilities.dp(12.0f);
                        float dp5 = (((this.giftRectSize - AndroidUtilities.dp(f)) - width2) / 2.0f) + f17;
                        float dp6 = AndroidUtilities.dp(14.0f) + dp + this.giftPremiumTitleLayout.getHeight();
                        if (this.giftReleasedBackgroundPaint == null) {
                            this.giftReleasedBackgroundPaint = new Paint(1);
                        }
                        this.giftReleasedBackgroundPaint.setColor(Theme.isCurrentThemeDark() ? 285212671 : TLObject.FLAG_28);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dp5, dp6 - AndroidUtilities.dp(8.0f), width2 + dp5, AndroidUtilities.dp(8.0f) + dp6);
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.giftReleasedBackgroundPaint);
                        f2 = 0.0f;
                        this.giftPremiumReleasedText.draw(canvas, dp5 + AndroidUtilities.dp(6.0f), dp6, -855638017, 1.0f);
                        f19 += AndroidUtilities.dp(24.0f);
                    }
                    float dp7 = f19 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 18) {
                        dp7 += AndroidUtilities.dp(2.0f);
                    }
                    float f20 = dp7;
                    canvas.save();
                    canvas.translate(f17, f20);
                    if (messageObject.type != 22) {
                        if (this.radialProgress.getTransitionProgress() == 1.0f) {
                            i3 = 4;
                            if (this.radialProgress.getIcon() != 4) {
                                f6 = f17;
                            } else if (this.giftPremiumText != null) {
                                canvas.save();
                                canvas.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, f2);
                                this.giftPremiumText.x = ((this.giftRectSize - r1.layout.getWidth()) / 2.0f) + f17;
                                this.giftPremiumText.y = f20;
                                int color = this.giftTextPaint.getColor();
                                TextLayout textLayout2 = this.giftPremiumText;
                                f4 = 1.0f;
                                SpoilerEffect.renderWithRipple(this, false, color, 0, textLayout2.patchedLayout, 1, textLayout2.layout, textLayout2.spoilers, canvas, false);
                                TextLayout textLayout3 = this.giftPremiumText;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout3.layout, textLayout3.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                canvas.restore();
                                f3 = f17;
                            } else {
                                f4 = 1.0f;
                                f3 = f17;
                            }
                        } else {
                            f6 = f17;
                            i3 = 4;
                        }
                        f4 = 1.0f;
                        if (this.settingWallpaperLayout == null) {
                            TextPaint textPaint5 = new TextPaint();
                            this.settingWallpaperPaint = textPaint5;
                            textPaint5.setTextSize(AndroidUtilities.dp(13.0f));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(org.telegram.messenger.R.string.ActionSettingWallpaper));
                            int indexOf = spannableStringBuilder.toString().indexOf("...");
                            if (indexOf < 0) {
                                indexOf = spannableStringBuilder.toString().indexOf("…");
                                i5 = 1;
                            } else {
                                i5 = 3;
                            }
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString("…");
                                UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                                uploadingDotsSpannable.fixTop = true;
                                uploadingDotsSpannable.setParent(this, false);
                                spannableString.setSpan(uploadingDotsSpannable, 0, spannableString.length(), 33);
                                spannableStringBuilder.replace(indexOf, indexOf + i5, (CharSequence) spannableString);
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
                        if (this.radialProgress.getIcon() == i3) {
                            float transitionProgress = this.radialProgress.getTransitionProgress();
                            int color2 = this.giftTextPaint.getColor();
                            float f21 = 1.0f - transitionProgress;
                            this.settingWallpaperPaint.setAlpha((int) (Color.alpha(color2) * f21));
                            this.giftTextPaint.setAlpha((int) (Color.alpha(color2) * transitionProgress));
                            TextPaint textPaint8 = this.giftTextPaint;
                            textPaint8.linkColor = textPaint8.getColor();
                            if (this.giftPremiumText != null) {
                                float f22 = (transitionProgress * 0.2f) + 0.8f;
                                canvas.save();
                                canvas.scale(f22, f22, this.giftRectSize / 2.0f, this.giftPremiumText.layout.getHeight() / 2.0f);
                                canvas.translate((this.giftRectSize - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                                float f23 = f6;
                                this.giftPremiumText.x = ((this.giftRectSize - r1.layout.getWidth()) / 2.0f) + f23;
                                this.giftPremiumText.y = f20;
                                int color3 = this.giftTextPaint.getColor();
                                TextLayout textLayout6 = this.giftPremiumText;
                                f3 = f23;
                                i4 = color2;
                                SpoilerEffect.renderWithRipple(this, false, color3, 0, textLayout6.patchedLayout, 1, textLayout6.layout, textLayout6.spoilers, canvas, false);
                                TextLayout textLayout7 = this.giftPremiumText;
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout7.layout, textLayout7.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                                canvas.restore();
                            } else {
                                i4 = color2;
                                f3 = f6;
                            }
                            this.giftTextPaint.setAlpha((int) (Color.alpha(i4) * f21));
                            TextPaint textPaint9 = this.giftTextPaint;
                            textPaint9.linkColor = textPaint9.getColor();
                            float f24 = (f21 * 0.2f) + 0.8f;
                            canvas.save();
                            canvas.scale(f24, f24, this.giftRectSize / 2.0f, this.settingWallpaperLayout.getHeight() / 2.0f);
                            canvas.translate((this.giftRectSize - this.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                            SpoilerEffect.layoutDrawMaybe(this.settingWallpaperLayout, canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(0.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                            canvas.scale(f24, f24, this.giftRectSize / 2.0f, this.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                            canvas.translate((this.giftRectSize - this.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, 0.0f);
                            SpoilerEffect.layoutDrawMaybe(this.settingWallpaperProgressTextLayout, canvas);
                            canvas.restore();
                            int i12 = i4;
                            this.giftTextPaint.setColor(i12);
                            this.giftTextPaint.linkColor = i12;
                        } else {
                            f3 = f6;
                            canvas.save();
                            canvas.translate((this.giftRectSize - this.settingWallpaperLayout.getWidth()) / 2.0f, 0.0f);
                            this.settingWallpaperLayout.draw(canvas);
                            canvas.restore();
                            canvas.save();
                            canvas.translate((this.giftRectSize - this.settingWallpaperProgressTextLayout.getWidth()) / 2.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                            SpoilerEffect.layoutDrawMaybe(this.settingWallpaperProgressTextLayout, canvas);
                            canvas.restore();
                        }
                    } else {
                        f3 = f17;
                        f4 = 1.0f;
                        TextLayout textLayout8 = this.giftPremiumText;
                        if (textLayout8 != null) {
                            float height2 = textLayout8.layout.getHeight();
                            if (f7 < 1.0f) {
                                height2 = AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, height2, f7);
                                RectF rectF3 = AndroidUtilities.rectTmp;
                                rectF3.set(0.0f, -AndroidUtilities.dp(20.0f), getWidth(), height2);
                                canvas.saveLayerAlpha(rectF3, NotificationCenter.cameraInitied, 31);
                            } else {
                                canvas.save();
                            }
                            float f25 = height2;
                            canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth()) / 2.0f, 0.0f);
                            this.giftPremiumText.x = f3 + (((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth()) / 2.0f);
                            TextLayout textLayout9 = this.giftPremiumText;
                            textLayout9.y = f20;
                            int color4 = textLayout9.paint.getColor();
                            TextLayout textLayout10 = this.giftPremiumText;
                            SpoilerEffect.renderWithRipple(this, false, color4, 0, textLayout10.patchedLayout, 1, textLayout10.layout, textLayout10.spoilers, canvas, false);
                            TextLayout textLayout11 = this.giftPremiumText;
                            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, textLayout11.layout, textLayout11.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, getAdaptiveEmojiColorFilter(this.giftTextPaint.getColor()));
                            if (f7 < 1.0f && this.giftPremiumTextMore != null) {
                                canvas.save();
                                if (this.giftPremiumTextClip == null) {
                                    this.giftPremiumTextClip = new GradientClip();
                                }
                                canvas.translate((-((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumText.layout.getWidth())) / 2.0f, 0.0f);
                                RectF rectF4 = AndroidUtilities.rectTmp;
                                rectF4.set((this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), (this.giftPremiumTextMoreY - this.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), this.giftPremiumTextMoreX + AndroidUtilities.dp(6.0f), this.giftPremiumTextMoreY);
                                float f26 = 1.0f - f7;
                                this.giftPremiumTextClip.clipOut(canvas, rectF4, f26);
                                rectF4.set((this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) - AndroidUtilities.dp(f), (this.giftPremiumTextMoreY - this.giftPremiumTextMoreH) - AndroidUtilities.dp(6.0f), (this.giftPremiumTextMoreX - this.giftPremiumTextMore.getCurrentWidth()) + AndroidUtilities.dp(8.0f), this.giftPremiumTextMoreY);
                                this.giftPremiumTextClip.draw(canvas, rectF4, 2, f26);
                                rectF4.set(0.0f, f25 - AndroidUtilities.dp(12.0f), getWidth(), f25);
                                this.giftPremiumTextClip.draw(canvas, rectF4, 3, f26 * 4.0f * (1.0f - f26));
                                canvas.restore();
                            }
                            canvas.restore();
                            if (f7 < 1.0f && (text = this.giftPremiumTextMore) != null) {
                                text.draw(canvas, AndroidUtilities.dp(5.0f) + (this.giftPremiumTextMoreX - text.getCurrentWidth()), (this.giftPremiumTextMoreY - (this.giftPremiumTextMoreH / 2.0f)) - AndroidUtilities.dp(1.0f), this.giftPremiumText.paint.getColor(), 1.0f - f7);
                            }
                        }
                    }
                    canvas.restore();
                    if (this.giftPremiumTitleLayout == null) {
                        AndroidUtilities.dp(8.0f);
                    }
                    textLayout = this.giftPremiumText;
                    if (textLayout != null) {
                        AndroidUtilities.lerp(this.giftPremiumTextCollapsedHeight, textLayout.layout.getHeight(), f7);
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
                        if (this.dimAmount > 0.0f) {
                            canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(f), AndroidUtilities.dp(f), this.dimPaint);
                        }
                        if (getMessageObject().type == 31 || getMessageObject().type == 33) {
                            Theme.ResourcesProvider resourcesProvider3 = this.themeDelegate;
                            boolean isDark2 = resourcesProvider3 != null ? resourcesProvider3.isDark() : Theme.isCurrentThemeDark();
                            int color5 = this.dimPaint.getColor();
                            this.dimPaint.setColor(isDark2 ? 620756991 : TLObject.FLAG_28);
                            canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(f), AndroidUtilities.dp(f), this.dimPaint);
                            this.dimPaint.setColor(color5);
                        }
                        if (getMessageObject().type != 31 && getMessageObject().type != 33 && getMessageObject().type != 21 && getMessageObject().type != 22 && getMessageObject().type != 24) {
                            this.starsPath.rewind();
                            this.starsPath.addRoundRect(this.giftButtonRect, AndroidUtilities.dp(f), AndroidUtilities.dp(f), Path.Direction.CW);
                            canvas.save();
                            canvas.clipPath(this.starsPath);
                            this.starParticlesDrawable.onDraw(canvas);
                            if (!this.starParticlesDrawable.paused) {
                                invalidate();
                            }
                            canvas.restore();
                        } else {
                            invalidate();
                        }
                    }
                    z = messageObject.settingAvatar;
                    if (z) {
                        float f27 = this.progressToProgress;
                        if (f27 != f4) {
                            this.progressToProgress = f27 + 0.10666667f;
                            f5 = 0.0f;
                            clamp = Utilities.clamp(this.progressToProgress, f4, f5);
                            this.progressToProgress = clamp;
                            if (clamp != f5) {
                                if (this.progressView == null) {
                                    this.progressView = new RadialProgressView(getContext());
                                }
                                int dp8 = AndroidUtilities.dp(f);
                                canvas.save();
                                float f28 = this.progressToProgress;
                                canvas.scale(f28, f28, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                this.progressView.setSize(dp8);
                                this.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                                this.progressView.draw(canvas, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                canvas.restore();
                            }
                            if (this.progressToProgress != f4 && this.giftPremiumButtonLayout != null) {
                                canvas.save();
                                float f29 = f4 - this.progressToProgress;
                                canvas.scale(f29, f29, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                                canvas.translate(f3, this.giftButtonRect.top + AndroidUtilities.dp(8.0f));
                                canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumButtonLayout.getWidth()) / 2.0f, 0.0f);
                                this.giftPremiumButtonLayout.draw(canvas);
                                canvas.restore();
                            }
                            if (!messageObject.flickerLoading) {
                                if (this.loadingDrawable == null) {
                                    LoadingDrawable loadingDrawable = new LoadingDrawable(this.themeDelegate);
                                    this.loadingDrawable = loadingDrawable;
                                    loadingDrawable.setGradientScale(2.0f);
                                    this.loadingDrawable.setAppearByGradient(true);
                                    this.loadingDrawable.setColors(Theme.multAlpha(-1, 0.08f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.7f));
                                    this.loadingDrawable.strokePaint.setStrokeWidth(AndroidUtilities.dp(f4));
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
                                float dp9 = (this.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                float dp10 = this.backgroundRect.top - AndroidUtilities.dp(2.0f);
                                resourcesProvider2 = this.themeDelegate;
                                if (resourcesProvider2 == null) {
                                    resourcesProvider2.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX + dp9, this.viewTop + AndroidUtilities.dp(4.0f) + dp10);
                                } else {
                                    Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX + dp9, this.viewTop + AndroidUtilities.dp(4.0f) + dp10);
                                }
                                canvas.save();
                                canvas.translate(dp9, dp10);
                                ColorFilter colorFilter = themedPaint.getColorFilter();
                                PathEffect pathEffect = themedPaint.getPathEffect();
                                Theme.ResourcesProvider resourcesProvider4 = this.themeDelegate;
                                isDark = resourcesProvider4 == null ? resourcesProvider4.isDark() : Theme.isCurrentThemeDark();
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
                        float f30 = this.progressToProgress;
                        f5 = 0.0f;
                        if (f30 != 0.0f) {
                            this.progressToProgress = f30 - 0.10666667f;
                        }
                        clamp = Utilities.clamp(this.progressToProgress, f4, f5);
                        this.progressToProgress = clamp;
                        if (clamp != f5) {
                        }
                        if (this.progressToProgress != f4) {
                            canvas.save();
                            float f292 = f4 - this.progressToProgress;
                            canvas.scale(f292, f292, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                            canvas.translate(f3, this.giftButtonRect.top + AndroidUtilities.dp(8.0f));
                            canvas.translate(((this.giftRectSize - AndroidUtilities.dp(f)) - this.giftPremiumButtonLayout.getWidth()) / 2.0f, 0.0f);
                            this.giftPremiumButtonLayout.draw(canvas);
                            canvas.restore();
                        }
                        if (!messageObject.flickerLoading) {
                        }
                        canvas.restore();
                        if (this.backgroundRect != null) {
                            themedPaint = getThemedPaint("paintChatActionBackground");
                            Paint themedPaint22 = getThemedPaint("paintChatActionBackgroundDarken");
                            float dp92 = (this.backgroundRect.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                            float dp102 = this.backgroundRect.top - AndroidUtilities.dp(2.0f);
                            resourcesProvider2 = this.themeDelegate;
                            if (resourcesProvider2 == null) {
                            }
                            canvas.save();
                            canvas.translate(dp92, dp102);
                            ColorFilter colorFilter2 = themedPaint.getColorFilter();
                            PathEffect pathEffect3 = themedPaint.getPathEffect();
                            Theme.ResourcesProvider resourcesProvider42 = this.themeDelegate;
                            if (resourcesProvider42 == null) {
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
                    }
                    f5 = 0.0f;
                    clamp = Utilities.clamp(this.progressToProgress, f4, f5);
                    this.progressToProgress = clamp;
                    if (clamp != f5) {
                    }
                    if (this.progressToProgress != f4) {
                    }
                    if (!messageObject.flickerLoading) {
                    }
                    canvas.restore();
                    if (this.backgroundRect != null) {
                    }
                }
                drawReactions(canvas, false, null);
                this.transitionParams.recordDrawingState();
                canvas.restore();
            }
        }
        if (this.textPaint != null) {
        }
        f = 16.0f;
        if (this.textPaint != null) {
            canvas.save();
            canvas.translate(this.titleXLeft, this.textY - this.titleHeight);
            if (this.titleLayout.getPaint() != this.textPaint) {
            }
            canvas.save();
            SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
            SpoilerEffect.layoutDrawMaybe(this.titleLayout, canvas);
            chatActionCellDelegate = this.delegate;
            if (chatActionCellDelegate != null) {
            }
            StaticLayout staticLayout32 = this.titleLayout;
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = this.animatedEmojiStack;
            List list2 = this.spoilers;
            StaticLayout staticLayout42 = this.textLayout;
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, staticLayout32, emojiGroupedSpans2, 0.0f, list2, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout42 != null ? null : getAdaptiveEmojiColorFilter(staticLayout42.getPaint().getColor()));
            canvas.restore();
            while (r0.hasNext()) {
            }
            canvas.restore();
        }
        if (!this.starGiftLayout.has()) {
            canvas.save();
            float f162 = (this.previousWidth - this.giftRectSize) / 2.0f;
            if (messageObject.type != 22) {
            }
            float f172 = f162;
            if (!isNewStyleButtonLayout()) {
            }
            i2 = messageObject.type;
            if (i2 != 31) {
            }
            dp -= AndroidUtilities.dp(3.66f);
            canvas.translate(f172, dp);
            if (this.giftPremiumTitleLayout == null) {
            }
            float f192 = dp2;
            canvas.restore();
            if (this.giftPremiumTitleLayout != null) {
            }
            f2 = 0.0f;
            float dp72 = f192 + AndroidUtilities.dp(4.0f);
            if (messageObject.type == 18) {
            }
            float f202 = dp72;
            canvas.save();
            canvas.translate(f172, f202);
            if (messageObject.type != 22) {
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
            f5 = 0.0f;
            clamp = Utilities.clamp(this.progressToProgress, f4, f5);
            this.progressToProgress = clamp;
            if (clamp != f5) {
            }
            if (this.progressToProgress != f4) {
            }
            if (!messageObject.flickerLoading) {
            }
            canvas.restore();
            if (this.backgroundRect != null) {
            }
        }
        drawReactions(canvas, false, null);
        this.transitionParams.recordDrawingState();
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.rippleView) {
            float scale = this.bounce.getScale(0.02f);
            canvas.save();
            canvas.scale(scale, scale, view.getX() + (view.getMeasuredWidth() / 2.0f), view.getY() + (view.getMeasuredHeight() / 2.0f));
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    private void checkLeftRightBounds() {
        this.backgroundLeft = (int) Math.min(this.backgroundLeft, this.rect.left);
        this.backgroundRight = (int) Math.max(this.backgroundRight, this.rect.right);
    }

    public void drawBackground(Canvas canvas, boolean z) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        int i;
        int i2;
        Canvas canvas2;
        float f;
        TextLayout textLayout;
        Paint paint5;
        Paint paint6;
        int i3;
        float f2;
        int i4;
        float f3;
        int i5;
        int i6;
        int i7;
        float f4;
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
            for (int i11 = 0; i11 < lineCount; i11++) {
                int ceil = (int) Math.ceil(this.textLayout.getLineWidth(i11));
                if (i11 == 0 || (i8 = i10 - ceil) <= 0 || i8 > (dp * 1.5f) + dp2) {
                    i10 = ceil;
                }
                this.lineWidths.add(Integer.valueOf(i10));
            }
            for (int i12 = lineCount - 2; i12 >= 0; i12--) {
                int intValue = ((Integer) this.lineWidths.get(i12)).intValue();
                int i13 = i10 - intValue;
                if (i13 <= 0 || i13 > (dp * 1.5f) + dp2) {
                    i10 = intValue;
                }
                this.lineWidths.set(i12, Integer.valueOf(i10));
            }
            int dp3 = AndroidUtilities.dp(4.0f);
            int measuredWidth = getMeasuredWidth() / 2;
            int dp4 = AndroidUtilities.dp(3.0f);
            int dp5 = AndroidUtilities.dp(6.0f);
            int i14 = dp - dp4;
            this.lineHeights.clear();
            this.backgroundPath.reset();
            float f5 = measuredWidth;
            this.backgroundPath.moveTo(f5, dp3);
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
                if (i15 == 0 || intValue2 > i10) {
                    f2 = 3.0f;
                    i19 += AndroidUtilities.dp(3.0f);
                } else {
                    f2 = 3.0f;
                }
                if (i15 == i18 || intValue2 > i3) {
                    i19 += AndroidUtilities.dp(f2);
                }
                float f6 = (intValue2 / 2.0f) + f5;
                int i20 = (i15 == i18 || intValue2 >= i3 || i15 == 0 || intValue2 >= i10) ? dp2 : i17;
                if (i15 == 0 || intValue2 > i10) {
                    i4 = measuredWidth;
                    f3 = f5;
                    i5 = lineCount;
                    i6 = lineBottom;
                    i7 = i10;
                    this.rect.set((f6 - dp4) - dp, dp3, i14 + f6, (dp * 2) + dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, 90.0f);
                } else if (intValue2 < i10) {
                    i6 = lineBottom;
                    f3 = f5;
                    float f7 = i14 + f6;
                    i4 = measuredWidth;
                    i5 = lineCount;
                    i7 = i10;
                    this.rect.set(f7, dp3, (i20 * 2) + f7, r11 + dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, -90.0f, -90.0f);
                } else {
                    i4 = measuredWidth;
                    f3 = f5;
                    i5 = lineCount;
                    i6 = lineBottom;
                    i7 = i10;
                }
                dp3 += i19;
                if (i15 == i18 || intValue2 >= i3) {
                    f4 = 3.0f;
                } else {
                    f4 = 3.0f;
                    dp3 -= AndroidUtilities.dp(3.0f);
                    i19 -= AndroidUtilities.dp(3.0f);
                }
                if (i15 != 0 && intValue2 < i7) {
                    dp3 -= AndroidUtilities.dp(f4);
                    i19 -= AndroidUtilities.dp(f4);
                }
                this.lineHeights.add(Integer.valueOf(i19));
                if (i15 == i18 || intValue2 > i3) {
                    this.rect.set((f6 - dp4) - dp, dp3 - (dp * 2), f6 + i14, dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, 90.0f);
                } else if (intValue2 < i3) {
                    float f8 = f6 + i14;
                    this.rect.set(f8, dp3 - r2, (i20 * 2) + f8, dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, -90.0f);
                }
                i15++;
                i10 = intValue2;
                dp5 = i17;
                themedPaint2 = paint6;
                themedPaint = paint5;
                i16 = i6;
                f5 = f3;
                measuredWidth = i4;
                lineCount = i5;
            }
            paint = themedPaint;
            paint2 = themedPaint2;
            int i21 = measuredWidth;
            float f9 = f5;
            int i22 = dp5;
            int i23 = lineCount - 1;
            int i24 = i23;
            while (i24 >= 0) {
                int intValue3 = i24 != 0 ? ((Integer) this.lineWidths.get(i24 - 1)).intValue() : 0;
                int intValue4 = ((Integer) this.lineWidths.get(i24)).intValue();
                int intValue5 = i24 != i23 ? ((Integer) this.lineWidths.get(i24 + 1)).intValue() : 0;
                this.textLayout.getLineBottom(i24);
                float f10 = i21 - (intValue4 / 2);
                int i25 = (i24 == i23 || intValue4 >= intValue5 || i24 == 0 || intValue4 >= intValue3) ? dp2 : i22;
                if (i24 == i23 || intValue4 > intValue5) {
                    this.rect.set(f10 - i14, dp3 - (dp * 2), dp4 + f10 + dp, dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, 90.0f);
                } else if (intValue4 < intValue5) {
                    float f11 = f10 - i14;
                    this.rect.set(f11 - (i25 * 2), dp3 - r13, f11, dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 90.0f, -90.0f);
                }
                dp3 -= ((Integer) this.lineHeights.get(i24)).intValue();
                if (i24 == 0 || intValue4 > intValue3) {
                    this.rect.set(f10 - i14, dp3, f10 + dp4 + dp, (dp * 2) + dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 180.0f, 90.0f);
                } else if (intValue4 < intValue3) {
                    float f12 = f10 - i14;
                    this.rect.set(f12 - (i25 * 2), dp3, f12, r9 + dp3);
                    checkLeftRightBounds();
                    this.backgroundPath.arcTo(this.rect, 0.0f, -90.0f);
                }
                i24--;
            }
            this.backgroundPath.close();
            if (isMessageActionSuggestedPostApproval() && !isNewStyleButtonLayout()) {
                this.rect.left = (f9 - (this.textWidth / 2.0f)) - AndroidUtilities.dp(17.0f);
                RectF rectF = this.rect;
                rectF.top = dp3;
                rectF.right = f9 + (this.textWidth / 2.0f) + AndroidUtilities.dp(17.0f);
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
        if (z && (getAlpha() != 1.0f || isFloating())) {
            i = paint.getAlpha();
            i2 = paint2.getAlpha();
            paint4 = paint;
            paint4.setAlpha((int) (i * getAlpha() * (isFloating() ? 0.75f : 1.0f)));
            paint3 = paint2;
            paint3.setAlpha((int) (i2 * getAlpha() * (isFloating() ? 0.75f : 1.0f)));
        } else {
            paint3 = paint2;
            paint4 = paint;
            if (isFloating()) {
                i = paint4.getAlpha();
                i2 = paint3.getAlpha();
                paint4.setAlpha((int) (i * (isFloating() ? 0.75f : 1.0f)));
                paint3.setAlpha((int) (i2 * (isFloating() ? 0.75f : 1.0f)));
            } else {
                i = -1;
                i2 = -1;
            }
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isRepostPreview) {
            canvas2 = canvas;
            canvas2.drawPath(this.backgroundPath, paint4);
            if (hasGradientService()) {
                canvas2.drawPath(this.backgroundPath, paint3);
            }
            f = 0.0f;
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
            f = 0.0f;
        }
        MessageObject messageObject2 = this.currentMessageObject;
        if (this.starGiftLayout.has()) {
            float width = this.starGiftLayout.getWidth() + AndroidUtilities.dp(8.0f);
            float width2 = (getWidth() - width) / 2.0f;
            if (!this.starGiftLayout.repost) {
                f = this.textY + this.textHeight + AndroidUtilities.dp(12.0f);
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(width2, f, width + width2, this.starGiftLayout.getHeight() + f + AndroidUtilities.dp(8.0f));
            if (this.backgroundRect == null) {
                this.backgroundRect = new RectF();
            }
            this.backgroundRect.set(rectF2);
            canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
            if (hasGradientService()) {
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
            }
        } else {
            SuggestBirthdayActionLayout suggestBirthdayActionLayout = this.birthdayLayout;
            if (suggestBirthdayActionLayout != null) {
                float width3 = suggestBirthdayActionLayout.width();
                float height = this.birthdayLayout.height();
                float width4 = (getWidth() - width3) / 2.0f;
                if (this.backgroundRect == null) {
                    this.backgroundRect = new RectF();
                }
                this.backgroundRect.set(width4, AndroidUtilities.dp(4.0f), width3 + width4, AndroidUtilities.dp(4.0f) + height);
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (hasGradientService()) {
                    canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (isButtonLayout(messageObject2)) {
                float width5 = (getWidth() - this.giftRectSize) / 2.0f;
                float f13 = this.textY + this.textHeight;
                if (isNewStyleButtonLayout()) {
                    float dp6 = f13 + AndroidUtilities.dp(4.0f);
                    AndroidUtilities.rectTmp.set(width5, dp6, this.giftRectSize + width5, this.backgroundRectHeight + dp6);
                } else {
                    float dp7 = f13 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f14 = this.giftRectSize;
                    rectF3.set(width5, dp7, width5 + f14, f14 + dp7 + this.giftPremiumAdditionalHeight);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !this.giftPremiumTextCollapsed && (textLayout = this.giftPremiumText) != null && this.giftPremiumTextCollapsedHeight > 0) {
                    AndroidUtilities.rectTmp.bottom -= (textLayout.layout.getHeight() - this.giftPremiumTextCollapsedHeight) * (1.0f - this.giftPremiumTextExpandedAnimated.get());
                }
                if (this.backgroundRect == null) {
                    this.backgroundRect = new RectF();
                }
                this.backgroundRect.set(AndroidUtilities.rectTmp);
                if (messageObject2 != null && !messageObject2.isOut() && messageObject2.type == 33) {
                    TLRPC.MessageAction messageAction = messageObject2.messageOwner.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction;
                        if (!tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined) {
                            Arrays.fill(this.radii, AndroidUtilities.dp(16.0f));
                            float[] fArr = this.radii;
                            float dp8 = AndroidUtilities.dp(6.0f);
                            fArr[7] = dp8;
                            fArr[6] = dp8;
                            fArr[5] = dp8;
                            fArr[4] = dp8;
                            this.backgroundPath2.rewind();
                            this.backgroundPath2.addRoundRect(this.backgroundRect, this.radii, Path.Direction.CW);
                            canvas2.drawPath(this.backgroundPath2, paint4);
                            if (hasGradientService()) {
                                canvas2.drawPath(this.backgroundPath2, paint3);
                            }
                        }
                    }
                }
                canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (hasGradientService()) {
                    canvas2.drawRoundRect(this.backgroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            }
        }
        if (i >= 0) {
            paint4.setAlpha(i);
            paint3.setAlpha(i2);
        }
    }

    private void drawBotButtons(Canvas canvas, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        float f = 4.0f;
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, this.viewTranslationX, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        float width = (getWidth() - this.giftRectSize) / 2.0f;
        float dp = this.textY + this.textHeight + AndroidUtilities.dp(4.0f) + this.backgroundRectHeight + AndroidUtilities.dp(4.0f);
        float dp2 = (this.giftRectSize - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i = 0;
        while (i < arrayList.size()) {
            BotButton botButton = (BotButton) arrayList.get(i);
            float pressScale = botButton.getPressScale();
            float dp3 = ((AndroidUtilities.dp(f) + dp2) * i) + width;
            float f2 = dp3 + dp2;
            this.rect.set(dp3, dp, f2, botButton.height + dp);
            canvas.save();
            if (pressScale != 1.0f) {
                canvas.scale(pressScale, pressScale, this.rect.centerX(), this.rect.centerY());
            }
            Arrays.fill(this.botButtonRadii, AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius)));
            if (botButton.hasPositionFlag(9)) {
                float[] fArr = this.botButtonRadii;
                float dp4 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[7] = dp4;
                fArr[6] = dp4;
            }
            if (botButton.hasPositionFlag(10)) {
                float[] fArr2 = this.botButtonRadii;
                float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr2[5] = dp5;
                fArr2[4] = dp5;
            }
            this.botButtonPath.rewind();
            this.botButtonPath.addRoundRect(this.rect, this.botButtonRadii, Path.Direction.CW);
            canvas.drawPath(this.botButtonPath, getThemedPaint("paintChatActionBackground"));
            if (hasGradientService()) {
                canvas.drawPath(this.botButtonPath, Theme.chat_actionBackgroundGradientDarkenPaint);
            }
            canvas.save();
            canvas.clipPath(this.botButtonPath);
            Drawable drawable = botButton.selectorDrawable;
            if (drawable != null) {
                int i2 = (int) dp;
                drawable.setBounds((int) dp3, i2, (int) f2, botButton.height + i2);
                botButton.selectorDrawable.setAlpha(NotificationCenter.cameraInitied);
                botButton.selectorDrawable.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            float dp6 = botButton.iconDrawable != null ? AndroidUtilities.dp(26.0f) : 0;
            float width2 = dp3 + (((dp2 - (botButton.title.getWidth() + (botButton.iconDrawable != null ? AndroidUtilities.dp(f) : 0))) - dp6) / 2.0f);
            Drawable drawable2 = botButton.iconDrawable;
            if (drawable2 != null) {
                int i3 = (int) width2;
                drawable2.setBounds(i3, (int) (((botButton.height - AndroidUtilities.dp(24.0f)) / 2.0f) + dp), i3 + AndroidUtilities.dp(24.0f), ((int) (((botButton.height - AndroidUtilities.dp(24.0f)) / 2.0f) + dp)) + AndroidUtilities.dp(24.0f));
                botButton.iconDrawable.setAlpha(botButton.isLocked ? 128 : NotificationCenter.cameraInitied);
                botButton.iconDrawable.draw(canvas);
                width2 += dp6;
            }
            botButton.title.ellipsize(Math.max(1, (((int) dp2) - AndroidUtilities.dp(15.0f)) - r5));
            botButton.title.draw(canvas, width2, (AndroidUtilities.dp(40.0f) / 2.0f) + dp, botButton.isLocked ? 0.5f : 1.0f);
            canvas.restore();
            canvas.restore();
            i++;
            f = 4.0f;
        }
    }

    private boolean checkBotButtonMotionEvent(MotionEvent motionEvent) {
        int i;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        if (this.botButtons.isEmpty()) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        float width = (getWidth() - this.giftRectSize) / 2.0f;
        float dp = this.textY + this.textHeight + AndroidUtilities.dp(4.0f) + this.backgroundRectHeight + AndroidUtilities.dp(4.0f);
        float dp2 = (this.giftRectSize - AndroidUtilities.dp(4.0f)) / 2.0f;
        if (motionEvent.getAction() == 0) {
            this.pressedBotButton = -1;
            for (int i2 = 0; i2 < this.botButtons.size(); i2++) {
                BotButton botButton = (BotButton) this.botButtons.get(i2);
                float dp3 = ((AndroidUtilities.dp(4.0f) + dp2) * i2) + width;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp3, dp, dp3 + dp2, botButton.height + dp);
                float f = x;
                float f2 = y;
                if (rectF.contains(f, f2)) {
                    this.pressedBotButton = i2;
                    invalidateOutbounds();
                    if (botButton.selectorDrawable == null) {
                        Drawable createRadSelectorDrawable = Theme.createRadSelectorDrawable(getThemedColor(Theme.key_chat_serviceBackgroundSelector), 6, 6);
                        botButton.selectorDrawable = createRadSelectorDrawable;
                        createRadSelectorDrawable.setCallback(this);
                    }
                    botButton.selectorDrawable.setHotspot(f, f2);
                    botButton.selectorDrawable.setState(this.pressedState);
                    botButton.setPressed(!botButton.isLocked);
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.pressedBotButton == -1) {
                return false;
            }
            playSoundEffect(0);
            BotButton botButton2 = (BotButton) this.botButtons.get(this.pressedBotButton);
            Drawable drawable = botButton2.selectorDrawable;
            if (drawable != null) {
                drawable.setState(StateSet.NOTHING);
            }
            botButton2.setPressed(false);
            if (this.delegate != null && !botButton2.isLocked && (buttonCustom = botButton2.buttonCustom) != null) {
                didPressCustomBotButton(buttonCustom);
            }
            this.pressedBotButton = -1;
            invalidateOutbounds();
            return false;
        }
        if (motionEvent.getAction() != 3 || (i = this.pressedBotButton) == -1) {
            return false;
        }
        BotButton botButton3 = (BotButton) this.botButtons.get(i);
        Drawable drawable2 = botButton3.selectorDrawable;
        if (drawable2 != null) {
            drawable2.setState(StateSet.NOTHING);
        }
        botButton3.setPressed(false);
        this.pressedBotButton = -1;
        invalidateOutbounds();
        return false;
    }

    private void didPressCustomBotButton(BotInlineKeyboard.ButtonCustom buttonCustom) {
        MessageObject messageObject;
        TLRPC.Message message;
        if (getMessageObject() == null) {
            return;
        }
        int i = buttonCustom.id;
        if (i == 5) {
            TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
            tL_resolveStarGiftOffer.offer_msg_id = getMessageObject().getId();
            tL_resolveStarGiftOffer.decline = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_resolveStarGiftOffer, new Utilities.Callback2() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda9
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    ChatActionCell.this.lambda$didPressCustomBotButton$6((TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                }
            });
            return;
        }
        if (i != 6 || (messageObject = this.currentMessageObject) == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
            GiftOfferSheet.openOfferAcceptAlert(LaunchActivity.getLastFragment(), getContext(), this.themeDelegate, this.currentAccount, this.currentMessageObject.getDialogId(), this.currentMessageObject.getId(), (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didPressCustomBotButton$6(TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        if (updates != null) {
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
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
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
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
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            }
            ReactionsLayoutInBubble reactionsLayoutInBubble2 = this.reactionsLayoutInBubble;
            TransitionParams transitionParams = this.transitionParams;
            reactionsLayoutInBubble2.drawOverlay(canvas, transitionParams.animateChange ? transitionParams.animateChangeProgress : 1.0f);
            if (alpha < 1.0f) {
                canvas.restore();
            }
        }
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

    public boolean hasGradientService() {
        Theme.ResourcesProvider resourcesProvider;
        return this.overrideBackgroundPaint == null && ((resourcesProvider = this.themeDelegate) == null ? Theme.hasGradientService() : resourcesProvider.hasGradientService());
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

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.TAG;
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

    public void setInvalidateColors(boolean z) {
        if (this.invalidateColors == z) {
            return;
        }
        this.invalidateColors = z;
        invalidate();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.themeDelegate);
    }

    protected Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.themeDelegate;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
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
        drawBotButtons(canvas, this.botButtons);
    }

    private boolean isButtonLayout(MessageObject messageObject) {
        int i;
        return messageObject != null && ((i = messageObject.type) == 30 || i == 18 || i == 25 || isNewStyleButtonLayout());
    }

    private boolean isGiftChannel(MessageObject messageObject) {
        return messageObject != null && messageObject.type == 25;
    }

    public void setInvalidatesParent(boolean z) {
        this.invalidatesParent = z;
    }

    public void setInvalidateListener(Runnable runnable) {
        this.invalidateListener = runnable;
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

    public void invalidateOutbounds() {
        ChatActionCellDelegate chatActionCellDelegate = this.delegate;
        if (chatActionCellDelegate == null || !chatActionCellDelegate.canDrawOutboundsContent()) {
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
                return;
            }
            return;
        }
        super.invalidate();
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
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.wallpaperPreviewDrawable || super.verifyDrawable(drawable);
    }

    private ColorFilter getAdaptiveEmojiColorFilter(int i) {
        if (i != this.adaptiveEmojiColor || this.adaptiveEmojiColorFilter == null) {
            this.adaptiveEmojiColor = i;
            this.adaptiveEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        return this.adaptiveEmojiColorFilter;
    }

    public ReactionsLayoutInBubble.ReactionButton getReactionButton(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        return this.reactionsLayoutInBubble.getReactionButton(visibleReaction);
    }

    public class TransitionParams {
        public boolean animateChange;
        public float animateChangeProgress = 1.0f;
        public boolean wasDraw;

        public boolean supportChangeAnimation() {
            return true;
        }

        public TransitionParams() {
        }

        public void recordDrawingState() {
            this.wasDraw = true;
            ChatActionCell.this.reactionsLayoutInBubble.recordDrawingState();
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

        public void resetAnimation() {
            this.animateChange = false;
            this.animateChangeProgress = 1.0f;
        }
    }

    public TransitionParams getTransitionParams() {
        return this.transitionParams;
    }

    public void setScrimReaction(Integer num) {
        this.reactionsLayoutInBubble.setScrimReaction(num);
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

    public boolean checkUnreadReactions(float f, int i) {
        if (!this.reactionsLayoutInBubble.hasUnreadReactions) {
            return false;
        }
        float y = getY();
        float f2 = y + r2.y;
        return f2 > f && (f2 + ((float) this.reactionsLayoutInBubble.height)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i);
    }

    public void markReactionsAsRead() {
        this.reactionsLayoutInBubble.hasUnreadReactions = false;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return;
        }
        messageObject.markReactionsAsRead();
    }
}
