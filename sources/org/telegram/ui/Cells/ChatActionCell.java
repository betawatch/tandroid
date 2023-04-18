package org.telegram.ui.Cells;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_documentEmpty;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_messageActionSuggestProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_messageActionUserUpdatedPhoto;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_photoEmpty;
import org.telegram.tgnet.TLRPC$TL_photoStrippedSize;
import org.telegram.tgnet.TLRPC$TL_premiumGiftOption;
import org.telegram.tgnet.TLRPC$TL_stickerPack;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
/* loaded from: classes3.dex */
public class ChatActionCell extends BaseCell implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    private static Map<Integer, String> monthsToEmoticon;
    private int TAG;
    private SpannableStringBuilder accessibilityText;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiStack;
    private AvatarDrawable avatarDrawable;
    private int backgroundButtonTop;
    private int backgroundHeight;
    private Path backgroundPath;
    private int backgroundRectHeight;
    private RectF backroundRect;
    private boolean canDrawInParent;
    private int currentAccount;
    private MessageObject currentMessageObject;
    private ImageLocation currentVideoLocation;
    private int customDate;
    private CharSequence customText;
    private ChatActionCellDelegate delegate;
    private boolean forceWasUnread;
    private boolean giftButtonPressed;
    private RectF giftButtonRect;
    private TLRPC$VideoSize giftEffectAnimation;
    private int giftPremiumAdditionalHeight;
    private StaticLayout giftPremiumButtonLayout;
    private float giftPremiumButtonWidth;
    private StaticLayout giftPremiumSubtitleLayout;
    private StaticLayout giftPremiumTitleLayout;
    private int giftRectSize;
    private TLRPC$Document giftSticker;
    private ImageReceiver.ImageReceiverDelegate giftStickerDelegate;
    private TextPaint giftSubtitlePaint;
    private TextPaint giftTitlePaint;
    private boolean hasReplyMessage;
    private boolean imagePressed;
    private ImageReceiver imageReceiver;
    private boolean invalidateColors;
    private boolean invalidatePath;
    private View invalidateWithParent;
    private float lastTouchX;
    private float lastTouchY;
    private ArrayList<Integer> lineHeights;
    private ArrayList<Integer> lineWidths;
    private int overrideBackground;
    private Paint overrideBackgroundPaint;
    private int overrideText;
    private TextPaint overrideTextPaint;
    private URLSpan pressedLink;
    private int previousWidth;
    float progressToProgress;
    RadialProgressView progressView;
    private RadialProgress2 radialProgress;
    private RectF rect;
    private View rippleView;
    private StaticLayout settingWallpaperLayout;
    TextPaint settingWallpaperPaint;
    private float settingWallpaperProgress;
    private StaticLayout settingWallpaperProgressTextLayout;
    public List<SpoilerEffect> spoilers;
    private Stack<SpoilerEffect> spoilersPool;
    private StarParticlesView.Drawable starParticlesDrawable;
    private Path starsPath;
    private int starsSize;
    private int stickerSize;
    private int textHeight;
    private StaticLayout textLayout;
    TextPaint textPaint;
    private int textWidth;
    private int textX;
    private int textXLeft;
    private int textY;
    private ThemeDelegate themeDelegate;
    private float viewTop;
    private boolean visiblePartSet;
    private boolean wasLayout;

    /* loaded from: classes3.dex */
    public interface ChatActionCellDelegate {

        /* loaded from: classes3.dex */
        public final /* synthetic */ class -CC {
            public static boolean $default$canDrawOutboundsContent(ChatActionCellDelegate chatActionCellDelegate) {
                return true;
            }

            public static void $default$didClickImage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell) {
            }

            public static boolean $default$didLongPress(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, float f, float f2) {
                return false;
            }

            public static void $default$didOpenPremiumGift(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption, boolean z) {
            }

            public static void $default$didPressReplyMessage(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, int i) {
            }

            public static BaseFragment $default$getBaseFragment(ChatActionCellDelegate chatActionCellDelegate) {
                return null;
            }

            public static long $default$getDialogId(ChatActionCellDelegate chatActionCellDelegate) {
                return 0L;
            }

            public static int $default$getTopicId(ChatActionCellDelegate chatActionCellDelegate) {
                return 0;
            }

            public static void $default$needOpenInviteLink(ChatActionCellDelegate chatActionCellDelegate, TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
            }

            public static void $default$needOpenUserProfile(ChatActionCellDelegate chatActionCellDelegate, long j) {
            }

            public static void $default$needShowEffectOverlay(ChatActionCellDelegate chatActionCellDelegate, ChatActionCell chatActionCell, TLRPC$Document tLRPC$Document, TLRPC$VideoSize tLRPC$VideoSize) {
            }
        }

        boolean canDrawOutboundsContent();

        void didClickImage(ChatActionCell chatActionCell);

        boolean didLongPress(ChatActionCell chatActionCell, float f, float f2);

        void didOpenPremiumGift(ChatActionCell chatActionCell, TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption, boolean z);

        void didPressReplyMessage(ChatActionCell chatActionCell, int i);

        BaseFragment getBaseFragment();

        long getDialogId();

        int getTopicId();

        void needOpenInviteLink(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported);

        void needOpenUserProfile(long j);

        void needShowEffectOverlay(ChatActionCell chatActionCell, TLRPC$Document tLRPC$Document, TLRPC$VideoSize tLRPC$VideoSize);
    }

    /* loaded from: classes3.dex */
    public interface ThemeDelegate extends Theme.ResourcesProvider {
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
        } else if (i == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
        } else if (i == NotificationCenter.didUpdatePremiumGiftStickers) {
            MessageObject messageObject2 = this.currentMessageObject;
            if (messageObject2 != null) {
                setMessageObject(messageObject2, true);
            }
        } else if (i == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.currentAccount).premiumGiftsStickerPack) && (messageObject = this.currentMessageObject) != null) {
            setMessageObject(messageObject, true);
        }
    }

    public void setSpoilersSuppressed(boolean z) {
        for (SpoilerEffect spoilerEffect : this.spoilers) {
            spoilerEffect.setSuppressUpdates(z);
        }
    }

    public void setInvalidateWithParent(View view) {
        this.invalidateWithParent = view;
    }

    public boolean hasButton() {
        MessageObject messageObject = this.currentMessageObject;
        return (messageObject == null || !isButtonLayout(messageObject) || this.giftPremiumButtonLayout == null) ? false : true;
    }

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
            AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda2(lottieAnimation));
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
                TLRPC$VideoSize tLRPC$VideoSize = this.giftEffectAnimation;
                if (tLRPC$VideoSize == null || (chatActionCellDelegate = this.delegate) == null) {
                    return;
                }
                chatActionCellDelegate.needShowEffectOverlay(this, this.giftSticker, tLRPC$VideoSize);
                return;
            }
            return;
        }
        lottieAnimation.stop();
        lottieAnimation.setCurrentFrame(lottieAnimation.getFramesCount() - 1, false);
    }

    public ChatActionCell(Context context) {
        this(context, false, null);
    }

    public ChatActionCell(Context context, boolean z, ThemeDelegate themeDelegate) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.giftButtonRect = new RectF();
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.overrideBackground = -1;
        this.overrideText = -1;
        this.lineWidths = new ArrayList<>();
        this.lineHeights = new ArrayList<>();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.invalidatePath = true;
        this.invalidateColors = false;
        this.giftTitlePaint = new TextPaint(1);
        this.giftSubtitlePaint = new TextPaint(1);
        this.radialProgress = new RadialProgress2(this);
        this.giftStickerDelegate = new ImageReceiver.ImageReceiverDelegate() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda3
            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public final void didSetImage(ImageReceiver imageReceiver, boolean z2, boolean z3, boolean z4) {
                ChatActionCell.this.lambda$new$0(imageReceiver, z2, z3, z4);
            }

            @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
            public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.-CC.$default$onAnimationReady(this, imageReceiver);
            }
        };
        this.starsPath = new Path();
        this.canDrawInParent = z;
        this.themeDelegate = themeDelegate;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.avatarDrawable = new AvatarDrawable();
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.giftTitlePaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.giftSubtitlePaint.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.rippleView = view;
        view.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 7, AndroidUtilities.dp(16.0f)));
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

    public void setCustomDate(int i, boolean z, boolean z2) {
        String formatDateChat;
        int i2 = this.customDate;
        if (i2 == i || i2 / 3600 == i / 3600) {
            return;
        }
        if (!z) {
            formatDateChat = LocaleController.formatDateChat(i);
        } else if (i == 2147483646) {
            formatDateChat = LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline);
        } else {
            formatDateChat = LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i));
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
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda0
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

    public void setMessageObject(MessageObject messageObject, boolean z) {
        TLRPC$PhotoSize tLRPC$PhotoSize;
        TLRPC$Document tLRPC$Document;
        float f;
        StaticLayout staticLayout;
        if (this.currentMessageObject != messageObject || (!((staticLayout = this.textLayout) == null || TextUtils.equals(staticLayout.getText(), messageObject.messageText)) || (!(this.hasReplyMessage || messageObject.replyMessageObject == null) || z || messageObject.type == 21))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            TLRPC$VideoSize tLRPC$VideoSize = null;
            r1 = null;
            TLRPC$PhotoSize tLRPC$PhotoSize2 = null;
            tLRPC$VideoSize = null;
            tLRPC$VideoSize = null;
            this.accessibilityText = null;
            MessageObject messageObject2 = this.currentMessageObject;
            boolean z2 = messageObject2 == null || messageObject2.stableId != messageObject.stableId;
            this.currentMessageObject = messageObject;
            this.hasReplyMessage = messageObject.replyMessageObject != null;
            DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
            this.previousWidth = 0;
            this.imageReceiver.setAutoRepeatCount(0);
            int i = messageObject.type;
            if (i == 22) {
                if (messageObject.strippedThumb == null) {
                    int size = messageObject.photoThumbs.size();
                    for (int i2 = 0; i2 < size && !(messageObject.photoThumbs.get(i2) instanceof TLRPC$TL_photoStrippedSize); i2++) {
                    }
                }
                TLRPC$MessageAction tLRPC$MessageAction = messageObject.messageOwner.action;
                String str = tLRPC$MessageAction.wallpaper.uploadingImage;
                if (str != null) {
                    this.imageReceiver.setImage(ImageLocation.getForPath(str), "150_150_wallpaper" + tLRPC$MessageAction.wallpaper.id + ChatBackgroundDrawable.hash(tLRPC$MessageAction.wallpaper.settings), null, null, ChatBackgroundDrawable.createThumb(tLRPC$MessageAction.wallpaper), 0L, null, tLRPC$MessageAction.wallpaper, 1);
                } else {
                    this.imageReceiver.setImage(ImageLocation.getForDocument((TLRPC$Document) messageObject.photoThumbsObject), "150_150_wallpaper" + tLRPC$MessageAction.wallpaper.id + ChatBackgroundDrawable.hash(tLRPC$MessageAction.wallpaper.settings), null, null, ChatBackgroundDrawable.createThumb(tLRPC$MessageAction.wallpaper), 0L, null, tLRPC$MessageAction.wallpaper, 1);
                }
                this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                if (getUploadingInfoProgress(messageObject) == 1.0f) {
                    this.radialProgress.setProgress(1.0f, !z2);
                    this.radialProgress.setIcon(4, !z2, !z2);
                } else {
                    this.radialProgress.setIcon(3, !z2, !z2);
                }
            } else if (i == 21) {
                this.imageReceiver.setRoundRadius((int) (this.stickerSize / 2.0f));
                this.imageReceiver.setAllowStartLottieAnimation(true);
                this.imageReceiver.setDelegate(null);
                TLRPC$TL_messageActionSuggestProfilePhoto tLRPC$TL_messageActionSuggestProfilePhoto = (TLRPC$TL_messageActionSuggestProfilePhoto) messageObject.messageOwner.action;
                TLRPC$VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tLRPC$TL_messageActionSuggestProfilePhoto.photo.video_sizes, 1000);
                ArrayList<TLRPC$VideoSize> arrayList = tLRPC$TL_messageActionSuggestProfilePhoto.photo.video_sizes;
                ImageLocation forPhoto = (arrayList == null || arrayList.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize, tLRPC$TL_messageActionSuggestProfilePhoto.photo);
                TLRPC$Photo tLRPC$Photo = messageObject.messageOwner.action.photo;
                if (messageObject.strippedThumb == null) {
                    int size2 = messageObject.photoThumbs.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        TLRPC$PhotoSize tLRPC$PhotoSize3 = messageObject.photoThumbs.get(i3);
                        if (tLRPC$PhotoSize3 instanceof TLRPC$TL_photoStrippedSize) {
                            tLRPC$PhotoSize2 = tLRPC$PhotoSize3;
                            break;
                        }
                        i3++;
                    }
                }
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 1000);
                if (closestPhotoSizeWithSize != null) {
                    if (closestVideoSizeWithSize != null) {
                        this.imageReceiver.setImage(forPhoto, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForPhoto(closestPhotoSizeWithSize, tLRPC$Photo), "150_150", ImageLocation.getForObject(tLRPC$PhotoSize2, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 0);
                    } else {
                        this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tLRPC$Photo), "150_150", ImageLocation.getForObject(tLRPC$PhotoSize2, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 0);
                    }
                }
                this.imageReceiver.setAllowStartLottieAnimation(false);
                ImageUpdater imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id);
                if (imageUpdater != null) {
                    f = 1.0f;
                    if (imageUpdater.getCurrentImageProgress() != 1.0f) {
                        this.radialProgress.setIcon(3, !z2, !z2);
                    }
                } else {
                    f = 1.0f;
                }
                this.radialProgress.setProgress(f, !z2);
                this.radialProgress.setIcon(4, !z2, !z2);
            } else if (i == 18) {
                this.imageReceiver.setRoundRadius(0);
                String str2 = UserConfig.getInstance(this.currentAccount).premiumGiftsStickerPack;
                if (str2 == null) {
                    MediaDataController.getInstance(this.currentAccount).checkPremiumGiftStickers();
                    return;
                }
                TLRPC$TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName(str2);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName(str2);
                }
                TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSetByName;
                if (tLRPC$TL_messages_stickerSet != null) {
                    String str3 = monthsToEmoticon.get(Integer.valueOf(messageObject.messageOwner.action.months));
                    Iterator<TLRPC$TL_stickerPack> it = tLRPC$TL_messages_stickerSet.packs.iterator();
                    tLRPC$Document = null;
                    while (it.hasNext()) {
                        TLRPC$TL_stickerPack next = it.next();
                        if (Objects.equals(next.emoticon, str3)) {
                            Iterator<Long> it2 = next.documents.iterator();
                            while (it2.hasNext()) {
                                long longValue = it2.next().longValue();
                                Iterator<TLRPC$Document> it3 = tLRPC$TL_messages_stickerSet.documents.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    TLRPC$Document next2 = it3.next();
                                    if (next2.id == longValue) {
                                        tLRPC$Document = next2;
                                        break;
                                    }
                                }
                                if (tLRPC$Document != null) {
                                    break;
                                }
                            }
                        }
                        if (tLRPC$Document != null) {
                            break;
                        }
                    }
                    if (tLRPC$Document == null && !tLRPC$TL_messages_stickerSet.documents.isEmpty()) {
                        tLRPC$Document = tLRPC$TL_messages_stickerSet.documents.get(0);
                    }
                } else {
                    tLRPC$Document = null;
                }
                this.forceWasUnread = messageObject.wasUnread;
                this.giftSticker = tLRPC$Document;
                if (tLRPC$Document != null) {
                    this.imageReceiver.setAllowStartLottieAnimation(false);
                    this.imageReceiver.setDelegate(this.giftStickerDelegate);
                    this.giftEffectAnimation = null;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= tLRPC$Document.video_thumbs.size()) {
                            break;
                        } else if ("f".equals(tLRPC$Document.video_thumbs.get(i4).type)) {
                            this.giftEffectAnimation = tLRPC$Document.video_thumbs.get(i4);
                            break;
                        } else {
                            i4++;
                        }
                    }
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$Document.thumbs, Theme.key_emptyListPlaceholder, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS);
                    }
                    this.imageReceiver.setAutoRepeat(0);
                    this.imageReceiver.setImage(ImageLocation.getForDocument(tLRPC$Document), messageObject.getId() + "_130_130", svgThumb, "tgs", tLRPC$TL_messages_stickerSet, 1);
                } else {
                    MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(str2, false, tLRPC$TL_messages_stickerSet == null);
                }
            } else if (i == 11) {
                this.imageReceiver.setAllowStartLottieAnimation(true);
                this.imageReceiver.setDelegate(null);
                this.imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                this.imageReceiver.setAutoRepeatCount(1);
                this.avatarDrawable.setInfo(messageObject.getDialogId(), null, null);
                if (messageObject.messageOwner.action instanceof TLRPC$TL_messageActionUserUpdatedPhoto) {
                    this.imageReceiver.setImage(null, null, this.avatarDrawable, null, messageObject, 0);
                } else {
                    if (messageObject.strippedThumb == null) {
                        int size3 = messageObject.photoThumbs.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            tLRPC$PhotoSize = messageObject.photoThumbs.get(i5);
                            if (tLRPC$PhotoSize instanceof TLRPC$TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    tLRPC$PhotoSize = null;
                    TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 640);
                    if (closestPhotoSizeWithSize2 != null) {
                        TLRPC$Photo tLRPC$Photo2 = messageObject.messageOwner.action.photo;
                        if (!tLRPC$Photo2.video_sizes.isEmpty() && SharedConfig.isAutoplayGifs()) {
                            TLRPC$VideoSize closestVideoSizeWithSize2 = FileLoader.getClosestVideoSizeWithSize(tLRPC$Photo2.video_sizes, 1000);
                            if (messageObject.mediaExists || DownloadController.getInstance(this.currentAccount).canDownloadMedia(4, closestVideoSizeWithSize2.size)) {
                                tLRPC$VideoSize = closestVideoSizeWithSize2;
                            } else {
                                this.currentVideoLocation = ImageLocation.getForPhoto(closestVideoSizeWithSize2, tLRPC$Photo2);
                                DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(FileLoader.getAttachFileName(closestVideoSizeWithSize2), messageObject, this);
                            }
                        }
                        if (tLRPC$VideoSize != null) {
                            this.imageReceiver.setImage(ImageLocation.getForPhoto(tLRPC$VideoSize, tLRPC$Photo2), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(tLRPC$PhotoSize, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 1);
                        } else {
                            this.imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject), "150_150", ImageLocation.getForObject(tLRPC$PhotoSize, messageObject.photoThumbsObject), "50_50_b", messageObject.strippedThumb, 0L, null, messageObject, 1);
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
            this.rippleView.setVisibility(isButtonLayout(messageObject) ? 0 : 8);
            ForumUtilities.applyTopicToMessage(messageObject);
            requestLayout();
        }
    }

    private float getUploadingInfoProgress(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject == null || messageObject.type != 22 || (str = (messagesController = MessagesController.getInstance(this.currentAccount)).uploadingWallpaper) == null || !TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
            return 1.0f;
        }
        return messagesController.uploadingWallpaperInfo.uploadingProgress;
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
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
        this.imageReceiver.onDetachedFromWindow();
        setStarsPaused(true);
        this.wasLayout = false;
        AnimatedEmojiSpan.release(this, this.animatedEmojiStack);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ChatActionCellDelegate chatActionCellDelegate;
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
        setStarsPaused(false);
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.type != 21) {
            return;
        }
        setMessageObject(messageObject, true);
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
            this.starParticlesDrawable.particles.get(i).lifeTime += System.currentTimeMillis() - this.starParticlesDrawable.pausedTime;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ImageUpdater imageUpdater;
        boolean z2;
        StaticLayout staticLayout;
        int i;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return super.onTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        this.lastTouchX = x;
        float y = motionEvent.getY();
        this.lastTouchY = y;
        boolean z3 = true;
        if (motionEvent.getAction() == 0) {
            if (this.delegate != null) {
                if ((messageObject.type == 11 || isButtonLayout(messageObject)) && this.imageReceiver.isInsideImage(x, y)) {
                    this.imagePressed = true;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.radialProgress.getIcon() == 4 && (((i = messageObject.type) == 21 || i == 22) && this.backroundRect.contains(x, y))) {
                    this.imagePressed = true;
                    z2 = true;
                }
                if (isButtonLayout(messageObject) && this.giftButtonRect.contains(x, y)) {
                    View view = this.rippleView;
                    this.giftButtonPressed = true;
                    view.setPressed(true);
                    z2 = true;
                }
                if (z2) {
                    startCheckLongPress();
                }
                if (!z2 && (motionEvent.getAction() == 0 || (this.pressedLink != null && motionEvent.getAction() == 1))) {
                    staticLayout = this.textLayout;
                    if (staticLayout != null) {
                        int i2 = this.textX;
                        if (x >= i2) {
                            int i3 = this.textY;
                            if (y >= i3 && x <= i2 + this.textWidth && y <= this.textHeight + i3) {
                                float f = x - this.textXLeft;
                                int lineForVertical = staticLayout.getLineForVertical((int) (y - i3));
                                int offsetForHorizontal = this.textLayout.getOffsetForHorizontal(lineForVertical, f);
                                float lineLeft = this.textLayout.getLineLeft(lineForVertical);
                                if (lineLeft <= f && lineLeft + this.textLayout.getLineWidth(lineForVertical) >= f) {
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
                                            z2 = z3;
                                        } else {
                                            this.pressedLink = null;
                                        }
                                        z3 = z2;
                                        z2 = z3;
                                    }
                                }
                                this.pressedLink = null;
                            }
                        }
                    }
                    this.pressedLink = null;
                }
                return z2 ? super.onTouchEvent(motionEvent) : z2;
            }
        } else {
            if (motionEvent.getAction() != 2) {
                cancelCheckLongPress();
            }
            if (this.imagePressed) {
                int action = motionEvent.getAction();
                if (action == 1) {
                    this.imagePressed = false;
                    int i4 = messageObject.type;
                    if (i4 == 18) {
                        openPremiumGiftPreview();
                    } else if (this.delegate != null) {
                        if (i4 != 21 || (imageUpdater = MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id)) == null) {
                            z = false;
                        } else {
                            imageUpdater.cancel();
                            z = true;
                        }
                        if (!z) {
                            this.delegate.didClickImage(this);
                            playSoundEffect(0);
                        }
                    }
                } else if (action == 2) {
                    int i5 = messageObject.type;
                    if (i5 == 21 || i5 == 22) {
                        if (!this.backroundRect.contains(x, y)) {
                            this.imagePressed = false;
                        }
                    } else if (!this.imageReceiver.isInsideImage(x, y)) {
                        this.imagePressed = false;
                    }
                } else if (action == 3) {
                    this.imagePressed = false;
                }
            } else if (this.giftButtonPressed) {
                int action2 = motionEvent.getAction();
                if (action2 == 1) {
                    View view2 = this.rippleView;
                    this.giftButtonPressed = false;
                    view2.setPressed(false);
                    if (this.delegate != null) {
                        if (messageObject.type == 18) {
                            playSoundEffect(0);
                            openPremiumGiftPreview();
                        } else if (MessagesController.getInstance(this.currentAccount).photoSuggestion.get(messageObject.messageOwner.local_id) == null) {
                            this.delegate.didClickImage(this);
                        }
                    }
                } else if (action2 != 2) {
                    if (action2 == 3) {
                        View view3 = this.rippleView;
                        this.giftButtonPressed = false;
                        view3.setPressed(false);
                    }
                } else if (!this.giftButtonRect.contains(x, y)) {
                    View view4 = this.rippleView;
                    this.giftButtonPressed = false;
                    view4.setPressed(false);
                }
            }
        }
        z2 = false;
        if (!z2) {
            staticLayout = this.textLayout;
            if (staticLayout != null) {
            }
            this.pressedLink = null;
        }
        if (z2) {
        }
    }

    private void openPremiumGiftPreview() {
        final TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption = new TLRPC$TL_premiumGiftOption();
        TLRPC$MessageAction tLRPC$MessageAction = this.currentMessageObject.messageOwner.action;
        tLRPC$TL_premiumGiftOption.amount = tLRPC$MessageAction.amount;
        tLRPC$TL_premiumGiftOption.months = tLRPC$MessageAction.months;
        tLRPC$TL_premiumGiftOption.currency = tLRPC$MessageAction.currency;
        if (this.delegate != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ChatActionCell.this.lambda$openPremiumGiftPreview$1(tLRPC$TL_premiumGiftOption);
                }
            });
        }
    }

    public /* synthetic */ void lambda$openPremiumGiftPreview$1(TLRPC$TL_premiumGiftOption tLRPC$TL_premiumGiftOption) {
        this.delegate.didOpenPremiumGift(this, tLRPC$TL_premiumGiftOption, false);
    }

    public void openLink(CharacterStyle characterStyle) {
        if (this.delegate == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.pressedLink;
            if (uRLSpan instanceof URLSpanNoUnderline) {
                TLObject object = ((URLSpanNoUnderline) uRLSpan).getObject();
                if (object instanceof TLRPC$TL_forumTopic) {
                    ForumUtilities.openTopic(this.delegate.getBaseFragment(), -this.delegate.getDialogId(), (TLRPC$TL_forumTopic) object, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.pressedLink;
            if (uRLSpan2 instanceof URLSpanNoUnderline) {
                TLObject object2 = ((URLSpanNoUnderline) uRLSpan2).getObject();
                if (object2 instanceof TLRPC$TL_chatInviteExported) {
                    this.delegate.needOpenInviteLink((TLRPC$TL_chatInviteExported) object2);
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

    private void createLayout(CharSequence charSequence, int i) {
        TextPaint textPaint;
        ChatActionCellDelegate chatActionCellDelegate;
        int dp = i - AndroidUtilities.dp(30.0f);
        if (dp < 0) {
            return;
        }
        this.invalidatePath = true;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.drawServiceWithDefaultTypeface) {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText2");
        } else {
            textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        }
        TextPaint textPaint2 = textPaint;
        textPaint2.linkColor = textPaint2.getColor();
        this.textLayout = new StaticLayout(charSequence, textPaint2, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.spoilersPool.addAll(this.spoilers);
        this.spoilers.clear();
        if (charSequence instanceof Spannable) {
            SpoilerEffect.addSpoilers(this, this.textLayout, (Spannable) charSequence, this.spoilersPool, this.spoilers);
        }
        this.animatedEmojiStack = AnimatedEmojiSpan.update(0, this, (!this.canDrawInParent || (chatActionCellDelegate = this.delegate) == null || chatActionCellDelegate.canDrawOutboundsContent()) ? false : true, this.animatedEmojiStack, this.textLayout);
        this.textHeight = 0;
        this.textWidth = 0;
        try {
            int lineCount = this.textLayout.getLineCount();
            for (int i2 = 0; i2 < lineCount; i2++) {
                try {
                    float lineWidth = this.textLayout.getLineWidth(i2);
                    float f = dp;
                    if (lineWidth > f) {
                        lineWidth = f;
                    }
                    this.textHeight = (int) Math.max(this.textHeight, Math.ceil(this.textLayout.getLineBottom(i2)));
                    this.textWidth = (int) Math.max(this.textWidth, Math.ceil(lineWidth));
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        this.textX = (i - this.textWidth) / 2;
        this.textY = AndroidUtilities.dp(7.0f);
        this.textXLeft = (i - this.textLayout.getWidth()) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        float dp;
        StaticLayout staticLayout;
        float dp2;
        StaticLayout staticLayout2;
        int i4;
        int dp3;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null && this.customText == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.textHeight + AndroidUtilities.dp(14.0f));
            return;
        }
        int i5 = 0;
        if (isButtonLayout(messageObject)) {
            int min = Math.min((int) ((AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() : AndroidUtilities.displaySize.x) * 0.6f), ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            this.giftRectSize = min;
            int dp4 = min - AndroidUtilities.dp(106.0f);
            this.stickerSize = dp4;
            int i6 = messageObject.type;
            if (i6 == 21 || i6 == 22) {
                this.imageReceiver.setRoundRadius(dp4 / 2);
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
                i4 = AndroidUtilities.roundMessageSize;
                dp3 = AndroidUtilities.dp(10.0f);
            } else if (isButtonLayout(messageObject)) {
                i4 = this.giftRectSize;
                dp3 = AndroidUtilities.dp(12.0f);
            }
            i3 = i4 + dp3;
            if (isButtonLayout(messageObject)) {
                int imageSize = getImageSize(messageObject);
                if (messageObject.type == 22) {
                    dp = this.textY + this.textHeight + AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(16.0f) * 2) + imageSize + this.giftPremiumSubtitleLayout.getHeight() + AndroidUtilities.dp(4.0f);
                } else {
                    dp = this.textY + this.textHeight + (this.giftRectSize * 0.075f) + imageSize + AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.giftPremiumSubtitleLayout.getHeight();
                }
                this.giftPremiumAdditionalHeight = 0;
                if (this.giftPremiumTitleLayout != null) {
                    dp2 = dp + staticLayout.getHeight();
                } else {
                    dp2 = dp - AndroidUtilities.dp(12.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(30.0f);
                }
                if (messageObject.type == 21) {
                    dp2 += AndroidUtilities.dp(16.0f);
                }
                if (this.giftPremiumSubtitleLayout.getLineCount() > 2) {
                    this.giftPremiumAdditionalHeight += ((this.giftPremiumSubtitleLayout.getLineBottom(0) - this.giftPremiumSubtitleLayout.getLineTop(0)) * this.giftPremiumSubtitleLayout.getLineCount()) - 2;
                }
                i3 += this.giftPremiumAdditionalHeight;
                int dp5 = this.textHeight + i3 + AndroidUtilities.dp(14.0f);
                StaticLayout staticLayout3 = this.giftPremiumButtonLayout;
                if (staticLayout3 != null) {
                    float height = dp2 + ((((dp5 - dp2) - (staticLayout3 != null ? staticLayout3.getHeight() : 0)) - AndroidUtilities.dp(8.0f)) / 2.0f);
                    float f = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                    this.giftButtonRect.set(f - AndroidUtilities.dp(18.0f), height - AndroidUtilities.dp(8.0f), f + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), height + (this.giftPremiumButtonLayout != null ? staticLayout2.getHeight() : 0) + AndroidUtilities.dp(8.0f));
                } else {
                    i3 -= AndroidUtilities.dp(40.0f);
                    this.giftPremiumAdditionalHeight -= AndroidUtilities.dp(40.0f);
                }
                int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                this.starParticlesDrawable.rect.set(this.giftButtonRect);
                this.starParticlesDrawable.rect2.set(this.giftButtonRect);
                if (this.starsSize != measuredWidth) {
                    this.starsSize = measuredWidth;
                    this.starParticlesDrawable.resetPositions();
                }
                if (messageObject.type == 22) {
                    int dp6 = this.textY + this.textHeight + AndroidUtilities.dp(12.0f);
                    this.backgroundRectHeight = 0;
                    int dp7 = 0 + (AndroidUtilities.dp(16.0f) * 2) + imageSize;
                    this.backgroundRectHeight = dp7;
                    int height2 = dp7 + this.giftPremiumSubtitleLayout.getHeight();
                    this.backgroundRectHeight = height2;
                    if (this.giftPremiumButtonLayout != null) {
                        this.backgroundButtonTop = height2 + dp6 + AndroidUtilities.dp(10.0f);
                        float f2 = (this.previousWidth - this.giftPremiumButtonWidth) / 2.0f;
                        this.giftButtonRect.set(f2 - AndroidUtilities.dp(18.0f), this.backgroundButtonTop, f2 + this.giftPremiumButtonWidth + AndroidUtilities.dp(18.0f), this.backgroundButtonTop + this.giftPremiumButtonLayout.getHeight() + (AndroidUtilities.dp(8.0f) * 2));
                        this.backgroundRectHeight = (int) (this.backgroundRectHeight + AndroidUtilities.dp(10.0f) + this.giftButtonRect.height());
                    }
                    int dp8 = this.backgroundRectHeight + AndroidUtilities.dp(16.0f);
                    this.backgroundRectHeight = dp8;
                    i5 = dp6 + dp8 + AndroidUtilities.dp(14.0f);
                }
            }
            if (messageObject == null && messageObject.type == 22) {
                setMeasuredDimension(max, i5);
                return;
            } else {
                setMeasuredDimension(max, this.textHeight + i3 + AndroidUtilities.dp(14.0f));
            }
        }
        i3 = 0;
        if (isButtonLayout(messageObject)) {
        }
        if (messageObject == null) {
        }
        setMeasuredDimension(max, this.textHeight + i3 + AndroidUtilities.dp(14.0f));
    }

    private int getImageSize(MessageObject messageObject) {
        int i = this.stickerSize;
        int i2 = messageObject.type;
        return (i2 == 21 || i2 == 22) ? (int) (i * 0.7f) : i;
    }

    private void buildLayout() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        String formatString;
        String string2;
        ArrayList<TLRPC$VideoSize> arrayList;
        TLRPC$Photo tLRPC$Photo;
        ArrayList<TLRPC$VideoSize> arrayList2;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            charSequence = (this.delegate.getTopicId() == 0 && MessageObject.isTopicActionMessage(messageObject)) ? ForumUtilities.createActionTextWithTopic(MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.messageOwner, true)), messageObject) : null;
            if (charSequence == null) {
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                if (tLRPC$Message != null && (tLRPC$MessageMedia = tLRPC$Message.media) != null && tLRPC$MessageMedia.ttl_seconds != 0) {
                    if (tLRPC$MessageMedia.photo instanceof TLRPC$TL_photoEmpty) {
                        charSequence = LocaleController.getString("AttachPhotoExpired", R.string.AttachPhotoExpired);
                    } else if (tLRPC$MessageMedia.document instanceof TLRPC$TL_documentEmpty) {
                        charSequence = LocaleController.getString("AttachVideoExpired", R.string.AttachVideoExpired);
                    } else {
                        charSequence = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
                    }
                } else {
                    charSequence = AnimatedEmojiSpan.cloneSpans(messageObject.messageText);
                }
            }
        } else {
            charSequence = this.customText;
        }
        createLayout(charSequence, this.previousWidth);
        if (messageObject != null) {
            int i = messageObject.type;
            if (i == 11) {
                int i2 = AndroidUtilities.roundMessageSize;
                this.imageReceiver.setImageCoords((this.previousWidth - AndroidUtilities.roundMessageSize) / 2.0f, this.textHeight + AndroidUtilities.dp(19.0f), i2, i2);
            } else if (i == 18) {
                createGiftPremiumLayouts(LocaleController.getString(R.string.ActionGiftPremiumTitle), LocaleController.formatString(R.string.ActionGiftPremiumSubtitle, LocaleController.formatPluralString("Months", messageObject.messageOwner.action.months, new Object[0])), LocaleController.getString(R.string.ActionGiftPremiumView), this.giftRectSize);
            } else {
                if (i != 21) {
                    if (i == 22) {
                        if (MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.isOutOwner() ? 0L : messageObject.getDialogId())).id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                            charSequence2 = messageObject.messageText;
                            string = null;
                        } else {
                            charSequence2 = messageObject.messageText;
                            string = LocaleController.getString("ViewWallpaperAction", R.string.ViewWallpaperAction);
                        }
                        createGiftPremiumLayouts(null, charSequence2, string, this.giftRectSize);
                        this.textLayout = null;
                        this.textHeight = 0;
                        this.textY = 0;
                        return;
                    }
                    return;
                }
                TLRPC$TL_messageActionSuggestProfilePhoto tLRPC$TL_messageActionSuggestProfilePhoto = (TLRPC$TL_messageActionSuggestProfilePhoto) messageObject.messageOwner.action;
                TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.isOutOwner() ? 0L : messageObject.getDialogId()));
                boolean z = tLRPC$TL_messageActionSuggestProfilePhoto.video || !((tLRPC$Photo = tLRPC$TL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = tLRPC$Photo.video_sizes) == null || arrayList2.isEmpty());
                if (user.id == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    TLRPC$User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(messageObject.getDialogId()));
                    if (z) {
                        formatString = LocaleController.formatString("ActionSuggestVideoFromYouDescription", R.string.ActionSuggestVideoFromYouDescription, user2.first_name);
                    } else {
                        formatString = LocaleController.formatString("ActionSuggestPhotoFromYouDescription", R.string.ActionSuggestPhotoFromYouDescription, user2.first_name);
                    }
                } else if (z) {
                    formatString = LocaleController.formatString("ActionSuggestVideoToYouDescription", R.string.ActionSuggestVideoToYouDescription, user.first_name);
                } else {
                    formatString = LocaleController.formatString("ActionSuggestPhotoToYouDescription", R.string.ActionSuggestPhotoToYouDescription, user.first_name);
                }
                if (tLRPC$TL_messageActionSuggestProfilePhoto.video || ((arrayList = tLRPC$TL_messageActionSuggestProfilePhoto.photo.video_sizes) != null && !arrayList.isEmpty())) {
                    string2 = LocaleController.getString("ViewVideoAction", R.string.ViewVideoAction);
                } else {
                    string2 = LocaleController.getString("ViewPhotoAction", R.string.ViewPhotoAction);
                }
                createGiftPremiumLayouts(null, formatString, string2, this.giftRectSize);
                this.textLayout = null;
                this.textHeight = 0;
                this.textY = 0;
            }
        }
    }

    private void createGiftPremiumLayouts(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        int dp = i - AndroidUtilities.dp(16.0f);
        if (charSequence != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0, valueOf.length(), 33);
            this.giftPremiumTitleLayout = new StaticLayout(valueOf, this.giftTitlePaint, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            this.giftPremiumTitleLayout = null;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.type == 21) {
            this.giftSubtitlePaint.setTextSize(AndroidUtilities.dp(13.0f));
        } else {
            this.giftSubtitlePaint.setTextSize(AndroidUtilities.dp(15.0f));
        }
        this.giftPremiumSubtitleLayout = new StaticLayout(charSequence2, this.giftSubtitlePaint, dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), 0, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) getThemedPaint("paintChatActionText"), dp, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.giftPremiumButtonLayout = staticLayout;
            this.giftPremiumButtonWidth = measureLayoutWidth(staticLayout);
            return;
        }
        this.giftPremiumButtonLayout = null;
        this.giftPremiumButtonWidth = 0.0f;
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

    public int getCustomDate() {
        return this.customDate;
    }

    /* JADX WARN: Removed duplicated region for block: B:296:0x053b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        float f;
        float dp;
        float clamp;
        MessageObject messageObject = this.currentMessageObject;
        int i4 = this.stickerSize;
        if (isButtonLayout(messageObject)) {
            int dp2 = this.giftRectSize - AndroidUtilities.dp(106.0f);
            this.stickerSize = dp2;
            int i5 = messageObject.type;
            if (i5 == 22) {
                i4 = getImageSize(messageObject);
                float f2 = i4;
                this.imageReceiver.setImageCoords((this.previousWidth - i4) / 2.0f, this.textY + this.textHeight + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(16.0f), f2, f2);
            } else if (i5 == 11) {
                this.imageReceiver.setImageCoords((this.previousWidth - dp2) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f), dp2, dp2);
            } else {
                i4 = (int) (dp2 * 0.7f);
                float f3 = i4;
                this.imageReceiver.setImageCoords((this.previousWidth - i4) / 2.0f, this.textY + this.textHeight + (this.giftRectSize * 0.075f) + AndroidUtilities.dp(8.0f), f3, f3);
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
                }
            }
        }
        int i6 = i4;
        drawBackground(canvas, false);
        if (isButtonLayout(messageObject) || (messageObject != null && messageObject.type == 11)) {
            this.imageReceiver.draw(canvas);
            this.radialProgress.setProgressRect(this.imageReceiver.getImageX(), this.imageReceiver.getImageY(), this.imageReceiver.getImageX() + this.imageReceiver.getImageWidth(), this.imageReceiver.getImageY() + this.imageReceiver.getImageHeight());
            int i7 = messageObject.type;
            if (i7 == 21) {
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
            } else if (i7 == 22) {
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
        }
        if (this.textPaint == null || this.textLayout == null) {
            i = i6;
            i2 = 4;
        } else {
            canvas.save();
            canvas.translate(this.textXLeft, this.textY);
            if (this.textLayout.getPaint() != this.textPaint) {
                buildLayout();
            }
            canvas.save();
            SpoilerEffect.clipOutCanvas(canvas, this.spoilers);
            this.textLayout.draw(canvas);
            ChatActionCellDelegate chatActionCellDelegate = this.delegate;
            if (chatActionCellDelegate == null || chatActionCellDelegate.canDrawOutboundsContent()) {
                i2 = 4;
                i = i6;
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.textLayout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
            } else {
                i = i6;
                i2 = 4;
            }
            canvas.restore();
            for (SpoilerEffect spoilerEffect : this.spoilers) {
                spoilerEffect.setColor(this.textLayout.getPaint().getColor());
                spoilerEffect.draw(canvas);
            }
            canvas.restore();
        }
        if (isButtonLayout(messageObject)) {
            canvas.save();
            float dp3 = ((this.previousWidth - this.giftRectSize) / 2.0f) + AndroidUtilities.dp(8.0f);
            int i8 = messageObject.type;
            if (i8 == 22) {
                RectF rectF = this.backroundRect;
                f = (rectF != null ? rectF.top : this.textY + this.textHeight + AndroidUtilities.dp(12.0f)) + (AndroidUtilities.dp(16.0f) * 2) + i;
                i3 = 21;
            } else {
                i3 = 21;
                float dp4 = this.textY + this.textHeight + (this.giftRectSize * 0.075f) + (i8 == 21 ? i : this.stickerSize) + AndroidUtilities.dp(4.0f);
                if (messageObject.type == 21) {
                    dp4 += AndroidUtilities.dp(16.0f);
                }
                f = dp4;
                if (this.giftPremiumButtonLayout == null) {
                    f -= AndroidUtilities.dp(24.0f);
                }
            }
            canvas.translate(dp3, f);
            StaticLayout staticLayout = this.giftPremiumTitleLayout;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
                dp = f + this.giftPremiumTitleLayout.getHeight();
            } else {
                dp = f - AndroidUtilities.dp(4.0f);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(dp3, dp + AndroidUtilities.dp(4.0f));
            if (messageObject.type == 22) {
                if (this.radialProgress.getTransitionProgress() != 1.0f || this.radialProgress.getIcon() != i2) {
                    if (this.settingWallpaperLayout == null) {
                        TextPaint textPaint4 = new TextPaint();
                        this.settingWallpaperPaint = textPaint4;
                        textPaint4.setTextSize(AndroidUtilities.dp(13.0f));
                        this.settingWallpaperLayout = new StaticLayout("Setting new wallpaper...", this.settingWallpaperPaint, this.giftPremiumSubtitleLayout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    float uploadingInfoProgress2 = getUploadingInfoProgress(messageObject);
                    if (this.settingWallpaperProgressTextLayout == null || this.settingWallpaperProgress != uploadingInfoProgress2) {
                        this.settingWallpaperProgress = uploadingInfoProgress2;
                        this.settingWallpaperProgressTextLayout = new StaticLayout(((int) (uploadingInfoProgress2 * 100.0f)) + "%", this.giftSubtitlePaint, this.giftPremiumSubtitleLayout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                    this.settingWallpaperPaint.setColor(this.giftSubtitlePaint.getColor());
                    if (this.radialProgress.getIcon() == i2) {
                        float transitionProgress = this.radialProgress.getTransitionProgress();
                        int color = this.giftSubtitlePaint.getColor();
                        float f4 = 1.0f - transitionProgress;
                        this.settingWallpaperPaint.setAlpha((int) (Color.alpha(color) * f4));
                        this.giftSubtitlePaint.setAlpha((int) (Color.alpha(color) * transitionProgress));
                        float f5 = (transitionProgress * 0.2f) + 0.8f;
                        canvas.save();
                        canvas.scale(f5, f5, this.giftPremiumSubtitleLayout.getWidth() / 2.0f, this.giftPremiumSubtitleLayout.getHeight() / 2.0f);
                        this.giftPremiumSubtitleLayout.draw(canvas);
                        canvas.restore();
                        this.giftSubtitlePaint.setAlpha((int) (Color.alpha(color) * f4));
                        float f6 = (f4 * 0.2f) + 0.8f;
                        canvas.save();
                        canvas.scale(f6, f6, this.settingWallpaperLayout.getWidth() / 2.0f, this.settingWallpaperLayout.getHeight() / 2.0f);
                        this.settingWallpaperLayout.draw(canvas);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(0.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                        canvas.scale(f6, f6, this.settingWallpaperProgressTextLayout.getWidth() / 2.0f, this.settingWallpaperProgressTextLayout.getHeight() / 2.0f);
                        this.settingWallpaperProgressTextLayout.draw(canvas);
                        canvas.restore();
                        this.giftSubtitlePaint.setColor(color);
                    } else {
                        this.settingWallpaperLayout.draw(canvas);
                        canvas.save();
                        canvas.translate(0.0f, this.settingWallpaperLayout.getHeight() + AndroidUtilities.dp(4.0f));
                        this.settingWallpaperProgressTextLayout.draw(canvas);
                        canvas.restore();
                    }
                } else {
                    this.giftPremiumSubtitleLayout.draw(canvas);
                }
            } else {
                this.giftPremiumSubtitleLayout.draw(canvas);
            }
            canvas.restore();
            if (this.giftPremiumTitleLayout == null) {
                AndroidUtilities.dp(8.0f);
            }
            this.giftPremiumSubtitleLayout.getHeight();
            StaticLayout staticLayout2 = this.giftPremiumButtonLayout;
            if (staticLayout2 != null) {
                staticLayout2.getHeight();
            }
            getHeight();
            AndroidUtilities.dp(8.0f);
            ThemeDelegate themeDelegate = this.themeDelegate;
            if (themeDelegate != null) {
                themeDelegate.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.dp(4.0f));
            } else {
                Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.dp(4.0f));
            }
            if (this.giftPremiumButtonLayout != null) {
                canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), getThemedPaint("paintChatActionBackground"));
                if (hasGradientService()) {
                    canvas.drawRoundRect(this.giftButtonRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
                }
                if (getMessageObject().type != i3 && getMessageObject().type != 22) {
                    this.starsPath.rewind();
                    this.starsPath.addRoundRect(this.giftButtonRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
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
            boolean z = messageObject.settingAvatar;
            if (z) {
                float f7 = this.progressToProgress;
                if (f7 != 1.0f) {
                    this.progressToProgress = f7 + 0.10666667f;
                    clamp = Utilities.clamp(this.progressToProgress, 1.0f, 0.0f);
                    this.progressToProgress = clamp;
                    if (clamp != 0.0f) {
                        if (this.progressView == null) {
                            this.progressView = new RadialProgressView(getContext());
                        }
                        int dp5 = AndroidUtilities.dp(16.0f);
                        canvas.save();
                        float f8 = this.progressToProgress;
                        canvas.scale(f8, f8, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                        this.progressView.setSize(dp5);
                        this.progressView.setProgressColor(Theme.getColor(Theme.key_chat_serviceText));
                        this.progressView.draw(canvas, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                        canvas.restore();
                    }
                    if (this.progressToProgress != 1.0f || this.giftPremiumButtonLayout == null) {
                    }
                    canvas.save();
                    float f9 = 1.0f - this.progressToProgress;
                    canvas.scale(f9, f9, this.giftButtonRect.centerX(), this.giftButtonRect.centerY());
                    canvas.translate(dp3, this.giftButtonRect.top + AndroidUtilities.dp(8.0f));
                    this.giftPremiumButtonLayout.draw(canvas);
                    canvas.restore();
                    return;
                }
            }
            if (!z) {
                float f10 = this.progressToProgress;
                if (f10 != 0.0f) {
                    this.progressToProgress = f10 - 0.10666667f;
                }
            }
            clamp = Utilities.clamp(this.progressToProgress, 1.0f, 0.0f);
            this.progressToProgress = clamp;
            if (clamp != 0.0f) {
            }
            if (this.progressToProgress != 1.0f) {
            }
        }
    }

    public void drawBackground(Canvas canvas, boolean z) {
        Paint paint;
        Paint paint2;
        int i;
        int i2;
        int i3;
        Paint paint3;
        int i4;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3;
        int i9;
        int i10;
        int i11;
        if (this.canDrawInParent) {
            if (hasGradientService() && !z) {
                return;
            }
            if (!hasGradientService() && z) {
                return;
            }
        }
        Paint themedPaint = getThemedPaint("paintChatActionBackground");
        this.textPaint = (TextPaint) getThemedPaint("paintChatActionText");
        int i12 = this.overrideBackground;
        if (i12 >= 0) {
            int themedColor = getThemedColor(i12);
            if (this.overrideBackgroundPaint == null) {
                Paint paint4 = new Paint(1);
                this.overrideBackgroundPaint = paint4;
                paint4.setColor(themedColor);
                TextPaint textPaint = new TextPaint(1);
                this.overrideTextPaint = textPaint;
                textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.overrideTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                this.overrideTextPaint.setColor(getThemedColor(this.overrideText));
            }
            themedPaint = this.overrideBackgroundPaint;
            this.textPaint = this.overrideTextPaint;
        }
        if (this.invalidatePath) {
            this.invalidatePath = false;
            this.lineWidths.clear();
            StaticLayout staticLayout = this.textLayout;
            int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
            int dp = AndroidUtilities.dp(11.0f);
            int dp2 = AndroidUtilities.dp(8.0f);
            int i13 = 0;
            for (int i14 = 0; i14 < lineCount; i14++) {
                int ceil = (int) Math.ceil(this.textLayout.getLineWidth(i14));
                if (i14 == 0 || (i11 = i13 - ceil) <= 0 || i11 > dp + dp2) {
                    i13 = ceil;
                }
                this.lineWidths.add(Integer.valueOf(i13));
            }
            for (int i15 = lineCount - 2; i15 >= 0; i15--) {
                int intValue = this.lineWidths.get(i15).intValue();
                int i16 = i13 - intValue;
                if (i16 <= 0 || i16 > dp + dp2) {
                    i13 = intValue;
                }
                this.lineWidths.set(i15, Integer.valueOf(i13));
            }
            int dp3 = AndroidUtilities.dp(4.0f);
            int measuredWidth = getMeasuredWidth() / 2;
            int dp4 = AndroidUtilities.dp(3.0f);
            int dp5 = AndroidUtilities.dp(6.0f);
            int i17 = dp - dp4;
            this.lineHeights.clear();
            this.backgroundPath.reset();
            float f4 = measuredWidth;
            this.backgroundPath.moveTo(f4, dp3);
            int i18 = 0;
            int i19 = 0;
            while (i18 < lineCount) {
                int intValue2 = this.lineWidths.get(i18).intValue();
                int lineBottom = this.textLayout.getLineBottom(i18);
                int i20 = dp2;
                int i21 = lineCount - 1;
                if (i18 < i21) {
                    paint3 = themedPaint;
                    i4 = this.lineWidths.get(i18 + 1).intValue();
                } else {
                    paint3 = themedPaint;
                    i4 = 0;
                }
                int i22 = lineBottom - i19;
                if (i18 == 0 || intValue2 > i13) {
                    f = 3.0f;
                    i22 += AndroidUtilities.dp(3.0f);
                } else {
                    f = 3.0f;
                }
                if (i18 == i21 || intValue2 > i4) {
                    i22 += AndroidUtilities.dp(f);
                }
                float f5 = (intValue2 / 2.0f) + f4;
                int i23 = (i18 == i21 || intValue2 >= i4 || i18 == 0 || intValue2 >= i13) ? i20 : dp5;
                if (i18 == 0 || intValue2 > i13) {
                    f2 = f4;
                    i5 = lineCount;
                    i6 = i13;
                    i7 = measuredWidth;
                    i8 = lineBottom;
                    this.rect.set((f5 - dp4) - dp, dp3, i17 + f5, (dp * 2) + dp3);
                    this.backgroundPath.arcTo(this.rect, -90.0f, 90.0f);
                } else {
                    f2 = f4;
                    if (intValue2 < i13) {
                        i8 = lineBottom;
                        float f6 = i17 + f5;
                        i7 = measuredWidth;
                        i5 = lineCount;
                        i6 = i13;
                        this.rect.set(f6, dp3, (i23 * 2) + f6, i10 + dp3);
                        this.backgroundPath.arcTo(this.rect, -90.0f, -90.0f);
                    } else {
                        i5 = lineCount;
                        i6 = i13;
                        i7 = measuredWidth;
                        i8 = lineBottom;
                    }
                }
                dp3 += i22;
                if (i18 == i21 || intValue2 >= i4) {
                    f3 = 3.0f;
                } else {
                    f3 = 3.0f;
                    dp3 -= AndroidUtilities.dp(3.0f);
                    i22 -= AndroidUtilities.dp(3.0f);
                }
                if (i18 != 0 && intValue2 < i6) {
                    dp3 -= AndroidUtilities.dp(f3);
                    i22 -= AndroidUtilities.dp(f3);
                }
                this.lineHeights.add(Integer.valueOf(i22));
                if (i18 == i21 || intValue2 > i4) {
                    this.rect.set((f5 - dp4) - dp, dp3 - (dp * 2), f5 + i17, dp3);
                    this.backgroundPath.arcTo(this.rect, 0.0f, 90.0f);
                } else if (intValue2 < i4) {
                    float f7 = f5 + i17;
                    this.rect.set(f7, dp3 - i9, (i23 * 2) + f7, dp3);
                    this.backgroundPath.arcTo(this.rect, 180.0f, -90.0f);
                }
                i18++;
                i13 = intValue2;
                dp2 = i20;
                themedPaint = paint3;
                f4 = f2;
                i19 = i8;
                measuredWidth = i7;
                lineCount = i5;
            }
            paint = themedPaint;
            int i24 = dp2;
            int i25 = measuredWidth;
            int i26 = lineCount - 1;
            int i27 = i26;
            while (i27 >= 0) {
                int intValue3 = i27 != 0 ? this.lineWidths.get(i27 - 1).intValue() : 0;
                int intValue4 = this.lineWidths.get(i27).intValue();
                int intValue5 = i27 != i26 ? this.lineWidths.get(i27 + 1).intValue() : 0;
                this.textLayout.getLineBottom(i27);
                float f8 = i25 - (intValue4 / 2);
                int i28 = (i27 == i26 || intValue4 >= intValue5 || i27 == 0 || intValue4 >= intValue3) ? i24 : dp5;
                if (i27 == i26 || intValue4 > intValue5) {
                    this.rect.set(f8 - i17, dp3 - (dp * 2), dp4 + f8 + dp, dp3);
                    this.backgroundPath.arcTo(this.rect, 90.0f, 90.0f);
                } else if (intValue4 < intValue5) {
                    float f9 = f8 - i17;
                    this.rect.set(f9 - (i28 * 2), dp3 - i3, f9, dp3);
                    this.backgroundPath.arcTo(this.rect, 90.0f, -90.0f);
                }
                dp3 -= this.lineHeights.get(i27).intValue();
                if (i27 == 0 || intValue4 > intValue3) {
                    this.rect.set(f8 - i17, dp3, f8 + dp4 + dp, (dp * 2) + dp3);
                    this.backgroundPath.arcTo(this.rect, 180.0f, 90.0f);
                } else if (intValue4 < intValue3) {
                    float f10 = f8 - i17;
                    this.rect.set(f10 - (i28 * 2), dp3, f10, i2 + dp3);
                    this.backgroundPath.arcTo(this.rect, 0.0f, -90.0f);
                }
                i27--;
            }
            this.backgroundPath.close();
        } else {
            paint = themedPaint;
        }
        if (!this.visiblePartSet) {
            this.backgroundHeight = ((ViewGroup) getParent()).getMeasuredHeight();
        }
        ThemeDelegate themeDelegate = this.themeDelegate;
        if (themeDelegate != null) {
            themeDelegate.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.dp(4.0f));
        } else {
            Theme.applyServiceShaderMatrix(getMeasuredWidth(), this.backgroundHeight, 0.0f, this.viewTop + AndroidUtilities.dp(4.0f));
        }
        int i29 = -1;
        if (!z || getAlpha() == 1.0f) {
            paint2 = paint;
            i = -1;
        } else {
            i29 = paint.getAlpha();
            i = Theme.chat_actionBackgroundGradientDarkenPaint.getAlpha();
            paint2 = paint;
            paint2.setAlpha((int) (i29 * getAlpha()));
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha((int) (i * getAlpha()));
        }
        canvas.drawPath(this.backgroundPath, paint2);
        if (hasGradientService()) {
            canvas.drawPath(this.backgroundPath, Theme.chat_actionBackgroundGradientDarkenPaint);
        }
        MessageObject messageObject = this.currentMessageObject;
        if (isButtonLayout(messageObject)) {
            float width = (getWidth() - this.giftRectSize) / 2.0f;
            float dp6 = this.textY + this.textHeight + AndroidUtilities.dp(12.0f);
            if (messageObject.type == 22) {
                AndroidUtilities.rectTmp.set(width, dp6, this.giftRectSize + width, this.backgroundRectHeight + dp6);
            } else {
                RectF rectF = AndroidUtilities.rectTmp;
                int i30 = this.giftRectSize;
                rectF.set(width, dp6, i30 + width, i30 + dp6 + this.giftPremiumAdditionalHeight);
            }
            if (this.backroundRect == null) {
                this.backroundRect = new RectF();
            }
            this.backroundRect.set(AndroidUtilities.rectTmp);
            canvas.drawRoundRect(this.backroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint2);
            if (hasGradientService()) {
                canvas.drawRoundRect(this.backroundRect, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.chat_actionBackgroundGradientDarkenPaint);
            }
        }
        if (i29 >= 0) {
            paint2.setAlpha(i29);
            Theme.chat_actionBackgroundGradientDarkenPaint.setAlpha(i);
        }
    }

    public boolean hasGradientService() {
        ThemeDelegate themeDelegate;
        return this.overrideBackgroundPaint == null && ((themeDelegate = this.themeDelegate) == null ? Theme.hasGradientService() : themeDelegate.hasGradientService());
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public void onSuccessDownload(String str) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || messageObject.type != 11) {
            return;
        }
        TLRPC$PhotoSize tLRPC$PhotoSize = null;
        int i = 0;
        int size = messageObject.photoThumbs.size();
        while (true) {
            if (i >= size) {
                break;
            }
            TLRPC$PhotoSize tLRPC$PhotoSize2 = messageObject.photoThumbs.get(i);
            if (tLRPC$PhotoSize2 instanceof TLRPC$TL_photoStrippedSize) {
                tLRPC$PhotoSize = tLRPC$PhotoSize2;
                break;
            }
            i++;
        }
        this.imageReceiver.setImage(this.currentVideoLocation, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(tLRPC$PhotoSize, messageObject.photoThumbsObject), "50_50_b", this.avatarDrawable, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.TAG;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharacterStyle[] characterStyleArr;
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
                    {
                        ChatActionCell.this = this;
                    }

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
        ThemeDelegate themeDelegate = this.themeDelegate;
        Integer valueOf = themeDelegate != null ? Integer.valueOf(themeDelegate.getColor(i)) : null;
        return valueOf != null ? valueOf.intValue() : Theme.getColor(i);
    }

    private Paint getThemedPaint(String str) {
        ThemeDelegate themeDelegate = this.themeDelegate;
        Paint paint = themeDelegate != null ? themeDelegate.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    public void drawOutboundsContent(Canvas canvas) {
        canvas.save();
        canvas.translate(this.textXLeft, this.textY);
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.textLayout, this.animatedEmojiStack, 0.0f, this.spoilers, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    private boolean isButtonLayout(MessageObject messageObject) {
        int i;
        return messageObject != null && ((i = messageObject.type) == 18 || i == 21 || i == 22);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        View view = this.invalidateWithParent;
        if (view != null) {
            view.invalidate();
        }
    }
}
