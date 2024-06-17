package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.zxing.common.detector.MathUtils;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$StickerSetCovered;
import org.telegram.tgnet.TLRPC$TL_documentAttributeCustomEmoji;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_maskCoords;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.tl.TL_stories$MediaArea;
import org.telegram.tgnet.tl.TL_stories$MediaAreaCoordinates;
import org.telegram.tgnet.tl.TL_stories$TL_geoPointAddress;
import org.telegram.tgnet.tl.TL_stories$TL_inputMediaAreaChannelPost;
import org.telegram.tgnet.tl.TL_stories$TL_inputMediaAreaVenue;
import org.telegram.tgnet.tl.TL_stories$TL_mediaAreaCoordinates;
import org.telegram.tgnet.tl.TL_stories$TL_mediaAreaGeoPoint;
import org.telegram.tgnet.tl.TL_stories$TL_mediaAreaSuggestedReaction;
import org.telegram.tgnet.tl.TL_stories$TL_mediaAreaUrl;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.IPhotoPaintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.PhotoFace;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;
import org.telegram.ui.Components.Paint.Views.EntitiesContainerView;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.LinkView;
import org.telegram.ui.Components.Paint.Views.LocationView;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;
import org.telegram.ui.Components.Paint.Views.PaintCancelView;
import org.telegram.ui.Components.Paint.Views.PaintColorsListView;
import org.telegram.ui.Components.Paint.Views.PaintDoneView;
import org.telegram.ui.Components.Paint.Views.PaintTextOptionsView;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.Paint.Views.PaintTypefaceListView;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.WrappedResourceProvider;
/* loaded from: classes4.dex */
public class PaintView extends SizeNotifierFrameLayoutPhoto implements IPhotoPaintView, PaintToolsView.Delegate, EntityView.EntityViewDelegate, PaintTextOptionsView.Delegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, StoryRecorder.Touchable {
    private final Bitmap bitmapToEdit;
    private final Bitmap blurBitmapToEdit;
    private BlurringShader.BlurManager blurManager;
    private FrameLayout bottomLayout;
    private PaintCancelView cancelButton;
    private TextView cancelTextButton;
    private ColorPickerBottomSheet colorPickerBottomSheet;
    private Paint colorPickerRainbowPaint;
    private Swatch colorSwatch;
    private Paint colorSwatchOutlinePaint;
    private Paint colorSwatchPaint;
    private PaintColorsListView colorsListView;
    private boolean creatingNewRound;
    private int currentAccount;
    private MediaController.CropState currentCropState;
    private EntityView currentEntityView;
    private boolean destroyed;
    private PaintDoneView doneButton;
    private TextView doneTextButton;
    public boolean drawForThemeToggle;
    private TextView drawTab;
    private boolean editingText;
    private int emojiPadding;
    private EmojiBottomSheet emojiPopup;
    public EmojiView emojiView;
    private boolean emojiViewVisible;
    public boolean enteredThroughText;
    public EntitiesContainerView entitiesView;
    private ArrayList<PhotoFace> faces;
    private Bitmap facesBitmap;
    private File file;
    private boolean fileFromGallery;
    private boolean forceChanges;
    private int h;
    private boolean ignoreLayout;
    private boolean ignoreToolChangeAnimationOnce;
    private boolean inBubbleMode;
    private ArrayList<VideoEditedInfo.MediaEntity> initialEntities;
    private StoryEntry initialEntry;
    private boolean invalidateReactionPosition;
    private boolean isAnimatePopupClosing;
    private boolean isColorListShown;
    private boolean isTypefaceMenuShown;
    private boolean isVideo;
    private AnimatorSet keyboardAnimator;
    private int keyboardHeight;
    private int keyboardHeightLand;
    public final KeyboardNotifier keyboardNotifier;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private BigInteger lcm;
    private float offsetTranslationY;
    private Runnable onCancelButtonClickedListener;
    private Runnable onDoneButtonClickedListener;
    private Runnable openKeyboardRunnable;
    private int originalBitmapRotation;
    private FrameLayout overlayLayout;
    private PaintToolsView paintToolsView;
    private Size paintingSize;
    private StoryRecorder.WindowView parent;
    private FrameLayout pipetteContainerLayout;
    float[] points;
    private PopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    private int[] pos;
    private PreviewView previewView;
    private ObjectAnimator previewViewTranslationAnimator;
    private DispatchQueue queue;
    ReactionWidgetEntityView reactionForEntity;
    public ReactionsContainerLayout reactionLayout;
    private boolean reactionLayoutShowing;
    private float reactionShowProgress;
    private View renderInputView;
    private RenderView renderView;
    private Theme.ResourcesProvider resourcesProvider;
    private int selectedTextType;
    private FrameLayout selectionContainerView;
    private TextView stickerTab;
    private LinearLayout tabsLayout;
    private int tabsNewSelectedIndex;
    private int tabsSelectedIndex;
    private ValueAnimator tabsSelectionAnimator;
    private float tabsSelectionProgress;
    private View textDim;
    private PaintTextOptionsView textOptionsView;
    private TextView textTab;
    private Paint toolsPaint;
    private SpringAnimation toolsTransformAnimation;
    private float toolsTransformProgress;
    private FrameLayout topLayout;
    private float transformX;
    private float transformY;
    private boolean translateBottomPanelAfterResize;
    private PaintTypefaceListView typefaceListView;
    private Paint typefaceMenuBackgroundPaint;
    private Paint typefaceMenuOutlinePaint;
    private SpringAnimation typefaceMenuTransformAnimation;
    private float typefaceMenuTransformProgress;
    private TextView undoAllButton;
    private ImageView undoButton;
    private UndoStore undoStore;
    private PreviewView.TextureViewHolder videoTextureHolder;
    private int w;
    private boolean waitingForKeyboardOpen;
    private PaintWeightChooserView weightChooserView;
    private PaintWeightChooserView.ValueOverride weightDefaultValueOverride;
    private LinearLayout zoomOutButton;
    private ImageView zoomOutImage;
    private TextView zoomOutText;

    protected boolean checkAudioPermission(Runnable runnable) {
        return true;
    }

    protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
    }

    protected void dismiss() {
    }

    public /* bridge */ /* synthetic */ View getView() {
        return IPhotoPaintView.-CC.$default$getView(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAudioSelect(MessageObject messageObject) {
    }

    public void onCreateRound(RoundView roundView) {
    }

    public void onDeleteRound() {
    }

    public void onDeselectRound(RoundView roundView) {
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public /* synthetic */ void onEntityDragMultitouchEnd() {
        EntityView.EntityViewDelegate.-CC.$default$onEntityDragMultitouchEnd(this);
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public /* synthetic */ void onEntityDragMultitouchStart() {
        EntityView.EntityViewDelegate.-CC.$default$onEntityDragMultitouchStart(this);
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public /* synthetic */ void onEntityDragTrash(boolean z) {
        EntityView.EntityViewDelegate.-CC.$default$onEntityDragTrash(this, z);
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public /* synthetic */ void onEntityDraggedBottom(boolean z) {
        EntityView.EntityViewDelegate.-CC.$default$onEntityDraggedBottom(this, z);
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public /* synthetic */ void onEntityDraggedTop(boolean z) {
        EntityView.EntityViewDelegate.-CC.$default$onEntityDraggedTop(this, z);
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public /* synthetic */ void onEntityHandleTouched() {
        EntityView.EntityViewDelegate.-CC.$default$onEntityHandleTouched(this);
    }

    protected void onGalleryClick() {
    }

    protected void onOpenCloseStickersAlert(boolean z) {
    }

    public void onSelectRound(RoundView roundView) {
    }

    public void onSwitchSegmentedAnimation(PhotoView photoView) {
    }

    protected void onTextAdd() {
    }

    public void onTryDeleteRound() {
    }

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f) {
        IPhotoPaintView.-CC.$default$setOffsetTranslationX(this, f);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public PaintView(final Context context, boolean z, File file, boolean z2, final StoryRecorder.WindowView windowView, Activity activity, final int i, Bitmap bitmap, Bitmap bitmap2, final Bitmap bitmap3, int i2, ArrayList<VideoEditedInfo.MediaEntity> arrayList, StoryEntry storyEntry, int i3, int i4, MediaController.CropState cropState, final Runnable runnable, BlurringShader.BlurManager blurManager, final Theme.ResourcesProvider resourcesProvider, PreviewView.TextureViewHolder textureViewHolder, PreviewView previewView) {
        super(context, activity, true);
        this.tabsSelectedIndex = 0;
        this.tabsNewSelectedIndex = -1;
        this.weightDefaultValueOverride = new PaintWeightChooserView.ValueOverride() { // from class: org.telegram.ui.Stories.recorder.PaintView.1
            @Override // org.telegram.ui.Components.Paint.Views.PaintWeightChooserView.ValueOverride
            public float get() {
                Brush currentBrush = PaintView.this.renderView.getCurrentBrush();
                return currentBrush == null ? PersistColorPalette.getInstance(PaintView.this.currentAccount).getCurrentWeight() : PersistColorPalette.getInstance(PaintView.this.currentAccount).getWeight(String.valueOf(Brush.BRUSHES_LIST.indexOf(currentBrush)), currentBrush.getDefaultWeight());
            }

            @Override // org.telegram.ui.Components.Paint.Views.PaintWeightChooserView.ValueOverride
            public void set(float f) {
                PersistColorPalette.getInstance(PaintView.this.currentAccount).setWeight(String.valueOf(Brush.BRUSHES_LIST.indexOf(PaintView.this.renderView.getCurrentBrush())), f);
                PaintView.this.colorSwatch.brushWeight = f;
                PaintView paintView = PaintView.this;
                paintView.setCurrentSwatch(paintView.colorSwatch, true);
            }
        };
        this.typefaceMenuOutlinePaint = new Paint(1);
        this.typefaceMenuBackgroundPaint = new Paint(1);
        this.colorPickerRainbowPaint = new Paint(1);
        this.colorSwatchPaint = new Paint(1);
        this.colorSwatchOutlinePaint = new Paint(1);
        this.colorSwatch = new Swatch(-1, 1.0f, 0.016773745f);
        this.toolsPaint = new Paint(1);
        this.points = new float[2];
        this.pos = new int[2];
        this.openKeyboardRunnable = new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView.30
            @Override // java.lang.Runnable
            public void run() {
                if (PaintView.this.currentEntityView instanceof TextPaintView) {
                    EditTextOutline editText = ((TextPaintView) PaintView.this.currentEntityView).getEditText();
                    if (PaintView.this.destroyed || editText == null || !PaintView.this.waitingForKeyboardOpen || PaintView.this.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editText.requestFocus();
                    AndroidUtilities.showKeyboard(editText);
                    AndroidUtilities.cancelRunOnUIThread(PaintView.this.openKeyboardRunnable);
                    AndroidUtilities.runOnUIThread(PaintView.this.openKeyboardRunnable, 100L);
                }
            }
        };
        setDelegate(this);
        this.blurManager = blurManager;
        this.videoTextureHolder = textureViewHolder;
        this.fileFromGallery = z;
        this.file = file;
        this.isVideo = z2;
        this.parent = windowView;
        this.w = i3;
        this.h = i4;
        this.previewView = previewView;
        this.currentAccount = i;
        this.resourcesProvider = new Theme.ResourcesProvider(this) { // from class: org.telegram.ui.Stories.recorder.PaintView.2
            private ColorFilter animatedEmojiColorFilter;

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ void applyServiceShaderMatrix(int i5, int i6, float f, float f2) {
                Theme.applyServiceShaderMatrix(i5, i6, f, f2);
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ int getColorOrDefault(int i5) {
                int color;
                color = getColor(i5);
                return color;
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ int getCurrentColor(int i5) {
                int color;
                color = getColor(i5);
                return color;
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ Drawable getDrawable(String str) {
                return Theme.ResourcesProvider.-CC.$default$getDrawable(this, str);
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ boolean hasGradientService() {
                return Theme.ResourcesProvider.-CC.$default$hasGradientService(this);
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ boolean isDark() {
                boolean isCurrentThemeDark;
                isCurrentThemeDark = Theme.isCurrentThemeDark();
                return isCurrentThemeDark;
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ void setAnimatedColor(int i5, int i6) {
                Theme.ResourcesProvider.-CC.$default$setAnimatedColor(this, i5, i6);
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public int getColor(int i5) {
                if (i5 == Theme.key_actionBarDefaultSubmenuBackground) {
                    return -14145495;
                }
                if (i5 == Theme.key_actionBarDefaultSubmenuItem) {
                    return -1;
                }
                if (i5 == Theme.key_dialogBackground) {
                    return -14737633;
                }
                if (i5 == Theme.key_dialogTextBlack) {
                    return -592138;
                }
                if (i5 == Theme.key_dialogTextGray3) {
                    return -8553091;
                }
                if (i5 == Theme.key_chat_emojiPanelBackground) {
                    return -16777216;
                }
                if (i5 == Theme.key_chat_emojiPanelShadowLine) {
                    return -1610612736;
                }
                if (i5 == Theme.key_chat_emojiBottomPanelIcon || i5 == Theme.key_chat_emojiPanelBackspace || i5 == Theme.key_chat_emojiPanelIcon) {
                    return -9539985;
                }
                if (i5 == Theme.key_windowBackgroundWhiteBlackText) {
                    return -1;
                }
                int i6 = Theme.key_featuredStickers_addedIcon;
                if (i5 == i6) {
                    return -11754001;
                }
                if (i5 == Theme.key_listSelector) {
                    return 536870911;
                }
                if (i5 == Theme.key_profile_tabSelectedText || i5 == Theme.key_profile_tabText || i5 == Theme.key_profile_tabSelectedLine) {
                    return -1;
                }
                if (i5 == Theme.key_profile_tabSelector) {
                    return 352321535;
                }
                if (i5 == Theme.key_chat_emojiSearchIcon || i5 == i6) {
                    return -7895161;
                }
                if (i5 == Theme.key_chat_emojiSearchBackground) {
                    return 780633991;
                }
                if (i5 == Theme.key_windowBackgroundGray) {
                    return -15921907;
                }
                Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                if (resourcesProvider2 != null) {
                    return resourcesProvider2.getColor(i5);
                }
                return Theme.getColor(i5);
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public Paint getPaint(String str) {
                return resourcesProvider.getPaint(str);
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public ColorFilter getAnimatedEmojiColorFilter() {
                if (this.animatedEmojiColorFilter == null) {
                    this.animatedEmojiColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return this.animatedEmojiColorFilter;
            }
        };
        this.currentCropState = cropState;
        this.inBubbleMode = context instanceof BubbleActivity;
        final PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i);
        persistColorPalette.resetCurrentColor();
        this.colorSwatch.color = persistColorPalette.getCurrentColor();
        this.colorSwatch.brushWeight = persistColorPalette.getCurrentWeight();
        this.queue = new DispatchQueue("Paint");
        this.bitmapToEdit = bitmap;
        this.blurBitmapToEdit = bitmap2;
        this.facesBitmap = bitmap3;
        this.originalBitmapRotation = i2;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        undoStore.setDelegate(new UndoStore.UndoStoreDelegate() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda63
            @Override // org.telegram.ui.Components.Paint.UndoStore.UndoStoreDelegate
            public final void historyChanged() {
                PaintView.this.lambda$new$0();
            }
        });
        View view = new View(context);
        this.textDim = view;
        view.setVisibility(8);
        this.textDim.setBackgroundColor(1291845632);
        this.textDim.setAlpha(0.0f);
        RenderView renderView = new RenderView(context, new Painting(getPaintingSize(), bitmap3, i2, blurManager), bitmap, bitmap2, (storyEntry == null || !storyEntry.isRepostMessage) ? blurManager : null) { // from class: org.telegram.ui.Stories.recorder.PaintView.3
            @Override // org.telegram.ui.Components.Paint.RenderView
            public void selectBrush(Brush brush) {
                int indexOf = Brush.BRUSHES_LIST.indexOf(brush) + 1;
                if (indexOf > 1 && bitmap3 == null) {
                    indexOf--;
                }
                PaintView.this.paintToolsView.select(indexOf);
                PaintView.this.onBrushSelected(brush);
            }
        };
        this.renderView = renderView;
        renderView.setDelegate(new RenderView.RenderViewDelegate() { // from class: org.telegram.ui.Stories.recorder.PaintView.4
            @Override // org.telegram.ui.Components.Paint.RenderView.RenderViewDelegate
            public void onFirstDraw() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override // org.telegram.ui.Components.Paint.RenderView.RenderViewDelegate
            public void onBeganDrawing() {
                if (PaintView.this.currentEntityView != null) {
                    PaintView.this.lambda$createRound$60(null);
                }
                PaintView.this.weightChooserView.setViewHidden(true);
            }

            @Override // org.telegram.ui.Components.Paint.RenderView.RenderViewDelegate
            public void onFinishedDrawing(boolean z3) {
                PaintView.this.undoStore.getDelegate().historyChanged();
                PaintView.this.weightChooserView.setViewHidden(false);
            }

            @Override // org.telegram.ui.Components.Paint.RenderView.RenderViewDelegate
            public boolean shouldDraw() {
                boolean z3 = PaintView.this.currentEntityView == null;
                if (!z3) {
                    PaintView.this.lambda$createRound$60(null);
                }
                return z3;
            }

            @Override // org.telegram.ui.Components.Paint.RenderView.RenderViewDelegate
            public void invalidateInputView() {
                if (PaintView.this.renderInputView != null) {
                    PaintView.this.renderInputView.invalidate();
                }
            }

            @Override // org.telegram.ui.Components.Paint.RenderView.RenderViewDelegate
            public void resetBrush() {
                if (PaintView.this.ignoreToolChangeAnimationOnce) {
                    PaintView.this.ignoreToolChangeAnimationOnce = false;
                    return;
                }
                PaintView.this.paintToolsView.select(1);
                PaintView.this.onBrushSelected(Brush.BRUSHES_LIST.get(0));
            }
        });
        this.renderView.setUndoStore(this.undoStore);
        this.renderView.setQueue(this.queue);
        this.renderView.setVisibility(4);
        View view2 = new View(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.5
            @Override // android.view.View
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (PaintView.this.renderView != null) {
                    PaintView.this.renderView.onDrawForInput(canvas);
                }
            }
        };
        this.renderInputView = view2;
        view2.setVisibility(4);
        this.entitiesView = new EntitiesContainerView(context, new EntitiesContainerView.EntitiesContainerViewDelegate() { // from class: org.telegram.ui.Stories.recorder.PaintView.6
            @Override // org.telegram.ui.Components.Paint.Views.EntitiesContainerView.EntitiesContainerViewDelegate
            public EntityView onSelectedEntityRequest() {
                return PaintView.this.currentEntityView;
            }

            @Override // org.telegram.ui.Components.Paint.Views.EntitiesContainerView.EntitiesContainerViewDelegate
            public void onEntityDeselect() {
                PaintView.this.lambda$createRound$60(null);
                PaintView paintView = PaintView.this;
                if (paintView.enteredThroughText) {
                    paintView.dismiss();
                    PaintView.this.enteredThroughText = false;
                }
                PaintView.this.showReactionsLayout(false);
            }
        }) { // from class: org.telegram.ui.Stories.recorder.PaintView.7
            private int lastStickyX;
            private int lastStickyY;
            long lastUpdate;
            Paint linePaint = new Paint();
            float stickyXAlpha;
            float stickyYAlpha;

            {
                setWillNotDraw(false);
                this.linePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.linePaint.setStyle(Paint.Style.STROKE);
                this.linePaint.setColor(-1);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void onDraw(Canvas canvas) {
                int i5;
                float f;
                float f2;
                int measuredWidth;
                float measuredWidth2;
                int measuredHeight;
                float measuredHeight2;
                super.onDraw(canvas);
                long min = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
                this.lastUpdate = System.currentTimeMillis();
                int i6 = 0;
                if (PaintView.this.currentEntityView != null && PaintView.this.currentEntityView.hasTouchDown() && PaintView.this.currentEntityView.hasPanned()) {
                    i6 = PaintView.this.currentEntityView.getStickyX();
                    i5 = PaintView.this.currentEntityView.getStickyY();
                } else {
                    i5 = 0;
                }
                if (i6 != 0) {
                    this.lastStickyX = i6;
                }
                if (i5 != 0) {
                    this.lastStickyY = i5;
                }
                if (i6 != 0) {
                    float f3 = this.stickyXAlpha;
                    if (f3 != 1.0f) {
                        this.stickyXAlpha = Math.min(1.0f, f3 + (((float) min) / 150.0f));
                        invalidate();
                        if (i5 != 0) {
                            float f4 = this.stickyYAlpha;
                            if (f4 != 1.0f) {
                                this.stickyYAlpha = Math.min(1.0f, f4 + (((float) min) / 150.0f));
                                invalidate();
                                f = this.stickyYAlpha;
                                if (f != 0.0f) {
                                    this.linePaint.setAlpha((int) (f * 255.0f));
                                    int i7 = this.lastStickyY;
                                    if (i7 == 1) {
                                        measuredHeight = AndroidUtilities.dp(64.0f);
                                    } else if (i7 == 2) {
                                        measuredHeight2 = getMeasuredHeight() / 2.0f;
                                        float f5 = measuredHeight2;
                                        canvas.drawLine(0.0f, f5, getMeasuredWidth(), f5, this.linePaint);
                                    } else {
                                        measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(64.0f);
                                    }
                                    measuredHeight2 = measuredHeight;
                                    float f52 = measuredHeight2;
                                    canvas.drawLine(0.0f, f52, getMeasuredWidth(), f52, this.linePaint);
                                }
                                f2 = this.stickyXAlpha;
                                if (f2 != 0.0f) {
                                    this.linePaint.setAlpha((int) (f2 * 255.0f));
                                    int i8 = this.lastStickyX;
                                    if (i8 == 1) {
                                        measuredWidth = AndroidUtilities.dp(8.0f);
                                    } else if (i8 == 2) {
                                        measuredWidth2 = getMeasuredWidth() / 2.0f;
                                        float f6 = measuredWidth2;
                                        canvas.drawLine(f6, 0.0f, f6, getMeasuredHeight(), this.linePaint);
                                        return;
                                    } else {
                                        measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                                    }
                                    measuredWidth2 = measuredWidth;
                                    float f62 = measuredWidth2;
                                    canvas.drawLine(f62, 0.0f, f62, getMeasuredHeight(), this.linePaint);
                                    return;
                                }
                                return;
                            }
                        }
                        if (i5 == 0) {
                            float f7 = this.stickyYAlpha;
                            if (f7 != 0.0f) {
                                this.stickyYAlpha = Math.max(0.0f, f7 - (((float) min) / 150.0f));
                                invalidate();
                            }
                        }
                        f = this.stickyYAlpha;
                        if (f != 0.0f) {
                        }
                        f2 = this.stickyXAlpha;
                        if (f2 != 0.0f) {
                        }
                    }
                }
                if (i6 == 0) {
                    float f8 = this.stickyXAlpha;
                    if (f8 != 0.0f) {
                        this.stickyXAlpha = Math.max(0.0f, f8 - (((float) min) / 150.0f));
                        invalidate();
                    }
                }
                if (i5 != 0) {
                }
                if (i5 == 0) {
                }
                f = this.stickyYAlpha;
                if (f != 0.0f) {
                }
                f2 = this.stickyXAlpha;
                if (f2 != 0.0f) {
                }
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i5, int i6) {
                super.onMeasure(i5, i6);
                if (PaintView.this.w <= 0) {
                    PaintView paintView = PaintView.this;
                    paintView.w = paintView.entitiesView.getMeasuredWidth();
                }
                if (PaintView.this.h <= 0) {
                    PaintView paintView2 = PaintView.this;
                    paintView2.h = paintView2.entitiesView.getMeasuredHeight();
                }
                PaintView.this.setupEntities();
            }
        };
        this.initialEntry = storyEntry;
        this.initialEntities = arrayList;
        if (this.w > 0 && this.h > 0) {
            setupEntities();
        }
        this.entitiesView.setVisibility(4);
        this.selectionContainerView = new FrameLayout(this, context) { // from class: org.telegram.ui.Stories.recorder.PaintView.8
            @Override // android.view.View
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        FrameLayout frameLayout = new FrameLayout(context);
        this.topLayout = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        this.topLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1073741824, 0}));
        addView(this.topLayout, LayoutHelper.createFrame(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.undoButton = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        this.undoButton.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.undoButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.undoButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaintView.this.lambda$new$1(view3);
            }
        });
        this.undoButton.setAlpha(0.6f);
        this.undoButton.setClickable(false);
        this.topLayout.addView(this.undoButton, LayoutHelper.createFrame(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.zoomOutButton = linearLayout;
        linearLayout.setOrientation(0);
        this.zoomOutButton.setBackground(Theme.createSelectorDrawable(822083583, 7));
        this.zoomOutButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        this.zoomOutText = textView;
        textView.setTextColor(-1);
        this.zoomOutText.setTypeface(AndroidUtilities.bold());
        this.zoomOutText.setTextSize(1, 16.0f);
        this.zoomOutText.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        this.zoomOutImage = imageView2;
        imageView2.setImageResource(R.drawable.photo_zoomout);
        this.zoomOutButton.addView(this.zoomOutImage, LayoutHelper.createLinear(24, 24, 16, 0, 0, 8, 0));
        this.zoomOutButton.addView(this.zoomOutText, LayoutHelper.createLinear(-2, -2, 16));
        this.zoomOutButton.setAlpha(0.0f);
        this.zoomOutButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda29
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaintView.lambda$new$2(view3);
            }
        });
        this.topLayout.addView(this.zoomOutButton, LayoutHelper.createFrame(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.undoAllButton = textView2;
        textView2.setBackground(Theme.createSelectorDrawable(822083583, 7));
        this.undoAllButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.undoAllButton.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        this.undoAllButton.setGravity(16);
        this.undoAllButton.setTextColor(-1);
        this.undoAllButton.setTypeface(AndroidUtilities.bold());
        this.undoAllButton.setTextSize(1, 16.0f);
        this.undoAllButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaintView.this.lambda$new$3(view3);
            }
        });
        this.undoAllButton.setAlpha(0.6f);
        this.topLayout.addView(this.undoAllButton, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.cancelTextButton = textView3;
        textView3.setBackground(Theme.createSelectorDrawable(822083583, 7));
        this.cancelTextButton.setText(LocaleController.getString(R.string.Clear));
        this.cancelTextButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.cancelTextButton.setGravity(16);
        this.cancelTextButton.setTextColor(-1);
        this.cancelTextButton.setTypeface(AndroidUtilities.bold());
        this.cancelTextButton.setTextSize(1, 16.0f);
        this.cancelTextButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaintView.this.lambda$new$4(view3);
            }
        });
        this.cancelTextButton.setAlpha(0.0f);
        this.cancelTextButton.setVisibility(8);
        this.topLayout.addView(this.cancelTextButton, LayoutHelper.createFrame(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.doneTextButton = textView4;
        textView4.setBackground(Theme.createSelectorDrawable(822083583, 7));
        this.doneTextButton.setText(LocaleController.getString(R.string.Done));
        this.doneTextButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.doneTextButton.setGravity(16);
        this.doneTextButton.setTextColor(-1);
        this.doneTextButton.setTypeface(AndroidUtilities.bold());
        this.doneTextButton.setTextSize(1, 16.0f);
        this.doneTextButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda18
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaintView.this.lambda$new$5(view3);
            }
        });
        this.doneTextButton.setAlpha(0.0f);
        this.doneTextButton.setVisibility(8);
        this.topLayout.addView(this.doneTextButton, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.9
            private float lastRainbowX;
            private float lastRainbowY;

            {
                new Path();
                setWillNotDraw(false);
                PaintView.this.colorPickerRainbowPaint.setStyle(Paint.Style.STROKE);
                PaintView.this.colorPickerRainbowPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            }

            private void checkRainbow(float f, float f2) {
                if (f == this.lastRainbowX && f2 == this.lastRainbowY) {
                    return;
                }
                this.lastRainbowX = f;
                this.lastRainbowY = f2;
                PaintView.this.colorPickerRainbowPaint.setShader(new SweepGradient(f, f2, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }

            @Override // android.view.View
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (PaintView.this.overlayLayout != null) {
                    PaintView.this.overlayLayout.invalidate();
                }
            }

            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                ViewGroup barView = PaintView.this.getBarView();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.lerp(barView.getLeft(), PaintView.this.colorsListView.getLeft(), PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop(), PaintView.this.colorsListView.getTop(), PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight(), PaintView.this.colorsListView.getRight(), PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom(), PaintView.this.colorsListView.getBottom(), PaintView.this.toolsTransformProgress));
                float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), PaintView.this.toolsTransformProgress);
                canvas.drawRoundRect(rectF, lerp, lerp, PaintView.this.toolsPaint);
                if (barView.getChildCount() < 1 || PaintView.this.toolsTransformProgress == 1.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(barView.getLeft(), barView.getTop());
                View childAt = barView.getChildAt(0);
                if (barView instanceof PaintTextOptionsView) {
                    childAt = ((PaintTextOptionsView) barView).getColorClickableView();
                }
                View view3 = childAt;
                if (view3.getAlpha() != 0.0f) {
                    canvas.scale(view3.getScaleX(), view3.getScaleY(), view3.getPivotX(), view3.getPivotY());
                    PaintView.this.colorPickerRainbowPaint.setAlpha((int) ((1.0f - PaintView.this.toolsTransformProgress) * view3.getAlpha() * 255.0f));
                    int width = (view3.getWidth() - view3.getPaddingLeft()) - view3.getPaddingRight();
                    int height = (view3.getHeight() - view3.getPaddingTop()) - view3.getPaddingBottom();
                    float x = view3.getX() + view3.getPaddingLeft() + (width / 2.0f);
                    float y = view3.getY() + view3.getPaddingTop() + (height / 2.0f);
                    int i5 = PaintView.this.colorSwatch.color;
                    if (PaintView.this.tabsNewSelectedIndex != -1) {
                        PaintView paintView = PaintView.this;
                        ViewGroup viewGroup = (ViewGroup) paintView.getBarView(paintView.tabsNewSelectedIndex);
                        View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                        if (viewGroup instanceof PaintTextOptionsView) {
                            childAt2 = ((PaintTextOptionsView) viewGroup).getColorClickableView();
                        }
                        x = AndroidUtilities.lerp(x, childAt2.getX() + childAt2.getPaddingLeft() + (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f), PaintView.this.tabsSelectionProgress);
                        y = AndroidUtilities.lerp(y, childAt2.getY() + childAt2.getPaddingTop() + (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f), PaintView.this.tabsSelectionProgress);
                    }
                    if (PaintView.this.colorsListView != null && PaintView.this.colorsListView.getChildCount() > 0) {
                        View childAt3 = PaintView.this.colorsListView.getChildAt(0);
                        x = AndroidUtilities.lerp(x, (PaintView.this.colorsListView.getX() - barView.getLeft()) + childAt3.getX() + (childAt3.getWidth() / 2.0f), PaintView.this.toolsTransformProgress);
                        y = AndroidUtilities.lerp(y, (PaintView.this.colorsListView.getY() - barView.getTop()) + childAt3.getY() + (childAt3.getHeight() / 2.0f), PaintView.this.toolsTransformProgress);
                        i5 = ColorUtils.blendARGB(PaintView.this.colorSwatch.color, persistColorPalette.getColor(0), PaintView.this.toolsTransformProgress);
                    }
                    float f = x;
                    checkRainbow(f, y);
                    float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                    if (PaintView.this.colorsListView != null && PaintView.this.colorsListView.getChildCount() > 0) {
                        View childAt4 = PaintView.this.colorsListView.getChildAt(0);
                        min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), PaintView.this.toolsTransformProgress);
                    }
                    float f2 = min;
                    rectF.set(f - f2, y - f2, f + f2, y + f2);
                    canvas.drawArc(rectF, 0.0f, 360.0f, false, PaintView.this.colorPickerRainbowPaint);
                    PaintView.this.colorSwatchPaint.setColor(i5);
                    PaintView.this.colorSwatchPaint.setAlpha((int) (PaintView.this.colorSwatchPaint.getAlpha() * view3.getAlpha()));
                    PaintView.this.colorSwatchOutlinePaint.setColor(i5);
                    PaintView.this.colorSwatchOutlinePaint.setAlpha((int) (view3.getAlpha() * 255.0f));
                    float dp = f2 - AndroidUtilities.dp(3.0f);
                    if (PaintView.this.colorsListView != null && PaintView.this.colorsListView.getSelectedColorIndex() != 0) {
                        dp = AndroidUtilities.lerp(f2 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f2, PaintView.this.toolsTransformProgress);
                    }
                    PaintColorsListView.drawColorCircle(canvas, f, y, dp, PaintView.this.colorSwatchPaint.getColor());
                    if (PaintView.this.colorsListView != null && PaintView.this.colorsListView.getSelectedColorIndex() == 0) {
                        PaintView.this.colorSwatchOutlinePaint.setAlpha((int) (PaintView.this.colorSwatchOutlinePaint.getAlpha() * PaintView.this.toolsTransformProgress * view3.getAlpha()));
                        canvas.drawCircle(f, y, f2 - ((AndroidUtilities.dp(3.0f) + PaintView.this.colorSwatchOutlinePaint.getStrokeWidth()) * (1.0f - PaintView.this.toolsTransformProgress)), PaintView.this.colorSwatchOutlinePaint);
                    }
                }
                canvas.restore();
            }
        };
        this.bottomLayout = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        this.bottomLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, Integer.MIN_VALUE}));
        addView(this.bottomLayout, LayoutHelper.createFrame(-1, (int) R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 80));
        PaintToolsView paintToolsView = new PaintToolsView(context, (storyEntry == null || storyEntry.isRepostMessage || blurManager == null) ? false : true);
        this.paintToolsView = paintToolsView;
        paintToolsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.paintToolsView.setDelegate(this);
        this.paintToolsView.setSelectedIndex(1);
        this.bottomLayout.addView(this.paintToolsView, LayoutHelper.createFrame(-1, 48.0f));
        PaintTextOptionsView paintTextOptionsView = new PaintTextOptionsView(context);
        this.textOptionsView = paintTextOptionsView;
        paintTextOptionsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.textOptionsView.setVisibility(8);
        this.textOptionsView.setDelegate(this);
        post(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$new$6(i);
            }
        });
        this.textOptionsView.setAlignment(PersistColorPalette.getInstance(i).getCurrentAlignment());
        this.bottomLayout.addView(this.textOptionsView, LayoutHelper.createFrame(-1, 48.0f));
        FrameLayout frameLayout3 = new FrameLayout(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.10
            {
                setWillNotDraw(false);
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0 && PaintView.this.isTypefaceMenuShown) {
                    PaintView.this.showTypefaceMenu(false);
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override // android.view.View
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                PaintView.this.typefaceMenuOutlinePaint.setAlpha((int) (PaintView.this.textOptionsView.getAlpha() * 20.0f * (1.0f - PaintView.this.typefaceMenuTransformProgress)));
                PaintTextOptionsView paintTextOptionsView2 = PaintView.this.textOptionsView;
                RectF rectF = AndroidUtilities.rectTmp;
                paintTextOptionsView2.getTypefaceCellBounds(rectF);
                float top = PaintView.this.bottomLayout.getTop() + PaintView.this.textOptionsView.getTop() + PaintView.this.bottomLayout.getTranslationY() + PaintView.this.textOptionsView.getTranslationY();
                rectF.set(AndroidUtilities.lerp(rectF.left, PaintView.this.typefaceListView.getLeft(), PaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.top + top, PaintView.this.typefaceListView.getTop() - PaintView.this.typefaceListView.getTranslationY(), PaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.right, PaintView.this.typefaceListView.getRight(), PaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(top + rectF.bottom, PaintView.this.typefaceListView.getBottom() - PaintView.this.typefaceListView.getTranslationY(), PaintView.this.typefaceMenuTransformProgress));
                float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, PaintView.this.typefaceMenuTransformProgress));
                int alpha = PaintView.this.typefaceMenuBackgroundPaint.getAlpha();
                PaintView.this.typefaceMenuBackgroundPaint.setAlpha((int) (alpha * PaintView.this.typefaceMenuTransformProgress));
                canvas.drawRoundRect(rectF, dp, dp, PaintView.this.typefaceMenuBackgroundPaint);
                PaintView.this.typefaceMenuBackgroundPaint.setAlpha(alpha);
                canvas.drawRoundRect(rectF, dp, dp, PaintView.this.typefaceMenuOutlinePaint);
            }
        };
        this.overlayLayout = frameLayout3;
        addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f));
        PaintTypefaceListView paintTypefaceListView = new PaintTypefaceListView(context);
        this.typefaceListView = paintTypefaceListView;
        paintTypefaceListView.setVisibility(8);
        this.typefaceListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda64
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view3, int i5) {
                PaintView.this.lambda$new$7(view3, i5);
            }
        });
        this.textOptionsView.setTypefaceListView(this.typefaceListView);
        this.overlayLayout.addView(this.typefaceListView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        this.typefaceMenuOutlinePaint.setStyle(Paint.Style.FILL);
        this.typefaceMenuOutlinePaint.setColor(352321535);
        this.typefaceMenuBackgroundPaint.setColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        PaintColorsListView paintColorsListView = new PaintColorsListView(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.11
            private Path path = new Path();

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
            public void draw(Canvas canvas) {
                ViewGroup barView = PaintView.this.getBarView();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), PaintView.this.toolsTransformProgress));
                this.path.rewind();
                this.path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.path);
                super.draw(canvas);
                canvas.restore();
            }
        };
        this.colorsListView = paintColorsListView;
        paintColorsListView.setVisibility(8);
        this.colorsListView.setColorPalette(PersistColorPalette.getInstance(i));
        this.colorsListView.setColorListener(new Consumer() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda33
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                PaintView.this.lambda$new$8((Integer) obj);
            }
        });
        this.bottomLayout.addView(this.colorsListView, LayoutHelper.createFrame(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        PaintCancelView paintCancelView = new PaintCancelView(context);
        this.cancelButton = paintCancelView;
        paintCancelView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.cancelButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.bottomLayout.addView(this.cancelButton, LayoutHelper.createFrame(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaintView.this.lambda$new$9(view3);
            }
        });
        PaintDoneView paintDoneView = new PaintDoneView(context);
        this.doneButton = paintDoneView;
        paintDoneView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.doneButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.doneButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda19
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaintView.this.lambda$new$11(context, bitmap3, persistColorPalette, view3);
            }
        });
        this.bottomLayout.addView(this.doneButton, LayoutHelper.createFrame(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.setColorSwatch(this.colorSwatch);
        this.weightChooserView.setRenderView(this.renderView);
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        this.weightChooserView.setOnUpdate(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$new$12(i);
            }
        });
        addView(this.weightChooserView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.pipetteContainerLayout = frameLayout4;
        addView(frameLayout4, LayoutHelper.createFrame(-1, -1.0f));
        this.colorSwatchOutlinePaint.setStyle(Paint.Style.STROKE);
        this.colorSwatchOutlinePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setCurrentSwatch(this.colorSwatch, true);
        onBrushSelected(Brush.BRUSHES_LIST.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            int dp = AndroidUtilities.dp(100.0f);
            double d = AndroidUtilities.displaySize.y;
            Double.isNaN(d);
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), dp, (int) (d * 0.65d))));
        }
        this.keyboardNotifier = new KeyboardNotifier(windowView, new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda60
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                PaintView.this.lambda$new$13(windowView, (Integer) obj);
            }
        }) { // from class: org.telegram.ui.Stories.recorder.PaintView.13
            @Override // org.telegram.ui.Stories.recorder.KeyboardNotifier
            public void ignore(boolean z3) {
                super.ignore(z3);
                if (z3) {
                    PaintView.this.showTypefaceMenu(false);
                }
            }
        };
        EmojiBottomSheet.savedPosition = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        boolean canUndo = this.undoStore.canUndo();
        this.undoButton.animate().cancel();
        this.undoButton.animate().alpha(canUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        this.undoButton.setClickable(canUndo);
        this.undoAllButton.animate().cancel();
        this.undoAllButton.animate().alpha(canUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        this.undoAllButton.setClickable(canUndo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        RenderView renderView = this.renderView;
        if (renderView != null && (renderView.getCurrentBrush() instanceof Brush.Shape)) {
            this.renderView.clearShape();
            this.paintToolsView.setSelectedIndex(1);
            onBrushSelected(Brush.BRUSHES_LIST.get(0));
            return;
        }
        this.undoStore.undo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$2(View view) {
        PhotoViewer.getInstance().zoomOut();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(View view) {
        clearAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(View view) {
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(false);
        }
        lambda$registerRemovalUndo$61(this.currentEntityView);
        lambda$createRound$60(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(View view) {
        lambda$createRound$60(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6(int i) {
        this.textOptionsView.setTypeface(PersistColorPalette.getInstance(i).getCurrentTypeface());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7(View view, int i) {
        PaintTypeface paintTypeface = PaintTypeface.get().get(i);
        this.textOptionsView.setTypeface(paintTypeface.getKey());
        onTypefaceSelected(paintTypeface);
        showTypefaceMenu(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$8(Integer num) {
        setNewColor(num.intValue());
        showColorList(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$9(View view) {
        if (this.isColorListShown) {
            showColorList(false);
        } else if (this.emojiViewVisible) {
            hideEmojiPopup(true);
        } else if (this.editingText) {
            lambda$createRound$60(null);
        } else {
            Runnable runnable = this.onCancelButtonClickedListener;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$11(Context context, final Bitmap bitmap, final PersistColorPalette persistColorPalette, View view) {
        if (this.isColorListShown) {
            ColorPickerBottomSheet colorPickerBottomSheet = new ColorPickerBottomSheet(context, this.resourcesProvider);
            this.colorPickerBottomSheet = colorPickerBottomSheet;
            colorPickerBottomSheet.setColor(this.colorSwatch.color).setPipetteDelegate(new ColorPickerBottomSheet.PipetteDelegate() { // from class: org.telegram.ui.Stories.recorder.PaintView.12
                private boolean hasPipette;

                @Override // org.telegram.ui.Components.Paint.ColorPickerBottomSheet.PipetteDelegate
                public void onStartColorPipette() {
                    this.hasPipette = true;
                }

                @Override // org.telegram.ui.Components.Paint.ColorPickerBottomSheet.PipetteDelegate
                public void onStopColorPipette() {
                    this.hasPipette = false;
                }

                @Override // org.telegram.ui.Components.Paint.ColorPickerBottomSheet.PipetteDelegate
                public ViewGroup getContainerView() {
                    return PaintView.this.pipetteContainerLayout;
                }

                @Override // org.telegram.ui.Components.Paint.ColorPickerBottomSheet.PipetteDelegate
                public View getSnapshotDrawingView() {
                    return PaintView.this;
                }

                @Override // org.telegram.ui.Components.Paint.ColorPickerBottomSheet.PipetteDelegate
                public void onDrawImageOverCanvas(Bitmap bitmap2, Canvas canvas) {
                    Matrix matrix = PaintView.this.renderView.getMatrix();
                    canvas.save();
                    canvas.translate(PaintView.this.renderView.getX(), PaintView.this.renderView.getY());
                    canvas.concat(matrix);
                    canvas.scale(PaintView.this.renderView.getWidth() / bitmap.getWidth(), PaintView.this.renderView.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }

                @Override // org.telegram.ui.Components.Paint.ColorPickerBottomSheet.PipetteDelegate
                public boolean isPipetteVisible() {
                    return this.hasPipette;
                }

                @Override // org.telegram.ui.Components.Paint.ColorPickerBottomSheet.PipetteDelegate
                public boolean isPipetteAvailable() {
                    return bitmap != null;
                }

                @Override // org.telegram.ui.Components.Paint.ColorPickerBottomSheet.PipetteDelegate
                public void onColorSelected(int i) {
                    PaintView.this.showColorList(false);
                    persistColorPalette.selectColor(i);
                    persistColorPalette.saveColors();
                    PaintView.this.setNewColor(i);
                    PaintView.this.colorsListView.setSelectedColorIndex(persistColorPalette.getCurrentColorPosition());
                    PaintView.this.colorsListView.getAdapter().notifyDataSetChanged();
                }
            }).setColorListener(new Consumer() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda34
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    PaintView.this.lambda$new$10(persistColorPalette, (Integer) obj);
                }
            }).show();
            return;
        }
        Runnable runnable = this.onDoneButtonClickedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$10(PersistColorPalette persistColorPalette, Integer num) {
        persistColorPalette.selectColor(num.intValue());
        persistColorPalette.saveColors();
        setNewColor(num.intValue());
        this.colorsListView.setSelectedColorIndex(persistColorPalette.getCurrentColorPosition());
        this.colorPickerBottomSheet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$12(int i) {
        setCurrentSwatch(this.colorSwatch, true);
        PersistColorPalette.getInstance(i).setCurrentWeight(this.colorSwatch.brushWeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$new$13(StoryRecorder.WindowView windowView, Integer num) {
        boolean z;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i;
        Integer valueOf = Integer.valueOf(Math.max(0, Integer.valueOf(Math.max(num.intValue() - windowView.getBottomPadding2(), this.emojiPadding - windowView.getPaddingUnderContainer())).intValue()));
        notifyHeightChanged();
        if (valueOf.intValue() > 0) {
            EntityView entityView = this.currentEntityView;
            if ((entityView instanceof TextPaintView) && ((TextPaintView) entityView).getEditText().isFocused()) {
                z = true;
                animatorSet = this.keyboardAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.keyboardAnimator = new AnimatorSet();
                arrayList = new ArrayList();
                PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
                Property property = View.TRANSLATION_Y;
                float[] fArr = new float[1];
                float f = 0.0f;
                fArr[0] = valueOf.intValue() <= 0 ? Math.min(0.0f, ((-valueOf.intValue()) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(paintWeightChooserView, property, fArr));
                FrameLayout frameLayout = this.bottomLayout;
                Property property2 = View.TRANSLATION_Y;
                float[] fArr2 = new float[1];
                fArr2[0] = valueOf.intValue() <= 0 ? Math.min(0, (-valueOf.intValue()) + AndroidUtilities.dp(40.0f)) : 0;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property2, fArr2));
                LinearLayout linearLayout = this.tabsLayout;
                Property property3 = View.ALPHA;
                float[] fArr3 = new float[1];
                fArr3[0] = !z ? 0.0f : 1.0f;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout, property3, fArr3));
                PaintDoneView paintDoneView = this.doneButton;
                Property property4 = View.ALPHA;
                float[] fArr4 = new float[1];
                fArr4[0] = (z || this.isColorListShown) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(paintDoneView, property4, fArr4));
                PaintCancelView paintCancelView = this.cancelButton;
                Property property5 = View.ALPHA;
                float[] fArr5 = new float[1];
                fArr5[0] = (z || this.isColorListShown) ? 1.0f : 1.0f;
                arrayList.add(ObjectAnimator.ofFloat(paintCancelView, property5, fArr5));
                updatePreviewViewTranslationY();
                this.keyboardAnimator.playTogether(arrayList);
                if (!z) {
                    this.keyboardAnimator.setDuration(250L);
                    this.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                } else {
                    this.keyboardAnimator.setDuration(350L);
                    this.keyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                }
                this.keyboardAnimator.start();
                for (i = 0; i < arrayList.size(); i++) {
                    ((Animator) arrayList.get(i)).setDuration(z ? 350L : 250L);
                    ((Animator) arrayList.get(i)).setInterpolator(z ? CubicBezierInterpolator.EASE_OUT_QUINT : AdjustPanLayoutHelper.keyboardInterpolator);
                    ((Animator) arrayList.get(i)).start();
                }
                if (z) {
                    showTypefaceMenu(false);
                    return;
                }
                return;
            }
        }
        z = false;
        animatorSet = this.keyboardAnimator;
        if (animatorSet != null) {
        }
        this.keyboardAnimator = new AnimatorSet();
        arrayList = new ArrayList();
        PaintWeightChooserView paintWeightChooserView2 = this.weightChooserView;
        Property property6 = View.TRANSLATION_Y;
        float[] fArr6 = new float[1];
        float f2 = 0.0f;
        fArr6[0] = valueOf.intValue() <= 0 ? Math.min(0.0f, ((-valueOf.intValue()) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(paintWeightChooserView2, property6, fArr6));
        FrameLayout frameLayout2 = this.bottomLayout;
        Property property22 = View.TRANSLATION_Y;
        float[] fArr22 = new float[1];
        fArr22[0] = valueOf.intValue() <= 0 ? Math.min(0, (-valueOf.intValue()) + AndroidUtilities.dp(40.0f)) : 0;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property22, fArr22));
        LinearLayout linearLayout2 = this.tabsLayout;
        Property property32 = View.ALPHA;
        float[] fArr32 = new float[1];
        fArr32[0] = !z ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout2, property32, fArr32));
        PaintDoneView paintDoneView2 = this.doneButton;
        Property property42 = View.ALPHA;
        float[] fArr42 = new float[1];
        fArr42[0] = (z || this.isColorListShown) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(paintDoneView2, property42, fArr42));
        PaintCancelView paintCancelView2 = this.cancelButton;
        Property property52 = View.ALPHA;
        float[] fArr52 = new float[1];
        fArr52[0] = (z || this.isColorListShown) ? 1.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(paintCancelView2, property52, fArr52));
        updatePreviewViewTranslationY();
        this.keyboardAnimator.playTogether(arrayList);
        if (!z) {
        }
        this.keyboardAnimator.start();
        while (i < arrayList.size()) {
        }
        if (z) {
        }
    }

    private void updatePreviewViewTranslationY() {
        EntityView entityView;
        ObjectAnimator objectAnimator = this.previewViewTranslationAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.renderView.getParent();
        if (view == null) {
            return;
        }
        Property property = View.TRANSLATION_Y;
        float[] fArr = new float[1];
        fArr[0] = (((!this.keyboardNotifier.keyboardVisible() || this.keyboardNotifier.ignoring) && this.emojiPadding <= 0) || (entityView = this.currentEntityView) == null) ? 0.0f : (-(entityView.getPosition().y - (view.getMeasuredHeight() * 0.3f))) * view.getScaleY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        this.previewViewTranslationAnimator = ofFloat;
        ofFloat.setDuration(350L);
        this.previewViewTranslationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.previewViewTranslationAnimator.start();
    }

    public void onAnimationStateChanged(boolean z) {
        this.weightChooserView.setLayerType(z ? 2 : 0, null);
    }

    public View getWeightChooserView() {
        return this.weightChooserView;
    }

    public View getTopLayout() {
        return this.topLayout;
    }

    public View getBottomLayout() {
        return this.bottomLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewColor(final int i) {
        Swatch swatch = this.colorSwatch;
        final int i2 = swatch.color;
        swatch.color = i;
        setCurrentSwatch(swatch, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PaintView.this.lambda$setNewColor$14(i2, i, valueAnimator);
            }
        });
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNewColor$14(int i, int i2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.colorSwatch.color = ColorUtils.blendARGB(i, i2, floatValue);
        this.bottomLayout.invalidate();
    }

    private LocationView createLocationSticker(TLRPC$MessageMedia tLRPC$MessageMedia, TL_stories$MediaArea tL_stories$MediaArea, boolean z) {
        MediaController.CropState cropState;
        onTextAdd();
        this.forceChanges = true;
        getPaintingSize();
        Point startPositionRelativeToEntity = startPositionRelativeToEntity(null);
        float measuredWidth = this.entitiesView.getMeasuredWidth() <= 0 ? this.w : this.entitiesView.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        Context context = getContext();
        int i = this.currentAccount;
        float f = measuredWidth / 240.0f;
        Swatch swatch = this.colorSwatch;
        LocationView locationView = new LocationView(context, startPositionRelativeToEntity, i, tLRPC$MessageMedia, tL_stories$MediaArea, f, dp, 3, swatch == null ? -1 : swatch.color);
        if (startPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            locationView.setStickyX(2);
        }
        if (startPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            locationView.setStickyY(2);
        }
        locationView.setDelegate(this);
        locationView.setMaxWidth(dp);
        this.entitiesView.addView(locationView, LayoutHelper.createFrame(-2, -2.0f));
        MediaController.CropState cropState2 = this.currentCropState;
        if (cropState2 != null) {
            locationView.scale(1.0f / cropState2.cropScale);
            locationView.rotate(-(cropState.transformRotation + this.currentCropState.cropRotate));
        }
        if (z) {
            registerRemovalUndo(locationView);
            selectEntity(locationView, false);
        }
        return locationView;
    }

    private LinkView createLinkSticker(LinkPreview.WebPagePreview webPagePreview, TL_stories$MediaArea tL_stories$MediaArea, boolean z) {
        MediaController.CropState cropState;
        onTextAdd();
        this.forceChanges = true;
        getPaintingSize();
        Point startPositionRelativeToEntity = startPositionRelativeToEntity(null);
        float measuredWidth = this.entitiesView.getMeasuredWidth() <= 0 ? this.w : this.entitiesView.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        Context context = getContext();
        int i = this.currentAccount;
        float f = measuredWidth / 360.0f;
        Swatch swatch = this.colorSwatch;
        LinkView linkView = new LinkView(context, startPositionRelativeToEntity, i, webPagePreview, tL_stories$MediaArea, f, dp, 3, swatch == null ? -1 : swatch.color);
        if (startPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            linkView.setStickyX(2);
        }
        if (startPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            linkView.setStickyY(2);
        }
        linkView.setDelegate(this);
        linkView.setMaxWidth(dp);
        this.entitiesView.addView(linkView, LayoutHelper.createFrame(-2, -2.0f));
        MediaController.CropState cropState2 = this.currentCropState;
        if (cropState2 != null) {
            linkView.scale(1.0f / cropState2.cropScale);
            linkView.rotate(-(cropState.transformRotation + this.currentCropState.cropRotate));
        }
        if (z) {
            registerRemovalUndo(linkView);
            selectEntity(linkView, false);
        }
        return linkView;
    }

    private TextPaintView createText(boolean z) {
        onTextAdd();
        Size paintingSize = getPaintingSize();
        Point startPositionRelativeToEntity = startPositionRelativeToEntity(null);
        TextPaintView textPaintView = new TextPaintView(getContext(), startPositionRelativeToEntity, (int) (paintingSize.width / 9.0f), "", this.colorSwatch, this.selectedTextType);
        float f = paintingSize.width;
        textPaintView.setMinMaxFontSize((int) ((f / 9.0f) * 0.5f), (int) ((f / 9.0f) * 2.0f), new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda39
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$createText$15();
            }
        });
        if (startPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            textPaintView.setStickyX(2);
        }
        if (startPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            textPaintView.setStickyY(2);
        }
        textPaintView.setDelegate(this);
        textPaintView.setMaxWidth(this.w - AndroidUtilities.dp(32.0f));
        textPaintView.setTypeface(PersistColorPalette.getInstance(this.currentAccount).getCurrentTypeface());
        textPaintView.setType(PersistColorPalette.getInstance(this.currentAccount).getCurrentTextType());
        this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            textPaintView.scale(1.0f / cropState.cropScale);
            MediaController.CropState cropState2 = this.currentCropState;
            textPaintView.rotate(-(cropState2.transformRotation + cropState2.cropRotate));
        }
        if (z) {
            registerRemovalUndo(textPaintView);
            textPaintView.beginEditing();
            selectEntity(textPaintView, false);
            textPaintView.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(textPaintView.getFocusedView());
            this.editingText = true;
            this.textOptionsView.setAlignment(PersistColorPalette.getInstance(this.currentAccount).getCurrentAlignment(), true);
            this.textOptionsView.setOutlineType(PersistColorPalette.getInstance(this.currentAccount).getCurrentTextType());
        }
        return textPaintView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createText$15() {
        PaintWeightChooserView paintWeightChooserView = this.weightChooserView;
        if (paintWeightChooserView != null) {
            paintWeightChooserView.invalidate();
        }
    }

    public void clearAll() {
        if (this.undoStore.canUndo()) {
            RenderView renderView = this.renderView;
            if (renderView != null && (renderView.getCurrentBrush() instanceof Brush.Shape)) {
                this.renderView.clearShape();
                this.paintToolsView.setSelectedIndex(1);
                onBrushSelected(Brush.BRUSHES_LIST.get(0));
            }
            RenderView renderView2 = this.renderView;
            if (renderView2 != null) {
                renderView2.clearAll();
            }
            this.undoStore.reset();
            this.entitiesView.removeAllViews();
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.onDoneButtonClickedListener = runnable;
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.onCancelButtonClickedListener = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void editSelectedTextEntity() {
        EntityView entityView = this.currentEntityView;
        if (!(entityView instanceof TextPaintView) || this.editingText) {
            return;
        }
        TextPaintView textPaintView = (TextPaintView) entityView;
        this.editingText = true;
        textPaintView.beginEditing();
        View focusedView = textPaintView.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    /* renamed from: selectEntity */
    public boolean lambda$createRound$60(EntityView entityView) {
        return selectEntity(entityView, true);
    }

    private boolean selectEntity(EntityView entityView, boolean z) {
        boolean z2;
        int i;
        boolean z3 = entityView instanceof TextPaintView;
        int i2 = 2;
        if (z3 && (((i = this.tabsNewSelectedIndex) == -1 && this.tabsSelectedIndex != 2) || (i != -1 && i != 2))) {
            ValueAnimator valueAnimator = this.tabsSelectionAnimator;
            if (valueAnimator != null && i != 2) {
                valueAnimator.cancel();
            }
            if (this.isColorListShown) {
                showColorList(false);
            }
            switchTab(2);
        }
        boolean z4 = true;
        if (z3 && z) {
            TextPaintView textPaintView = (TextPaintView) entityView;
            int gravity = textPaintView.getEditText().getGravity();
            if (gravity == 17) {
                i2 = 1;
            } else if (gravity != 21) {
                i2 = 0;
            }
            this.textOptionsView.setAlignment(i2);
            PaintTypeface typeface = textPaintView.getTypeface();
            if (typeface != null) {
                this.textOptionsView.setTypeface(typeface.getKey());
            }
            this.textOptionsView.setOutlineType(textPaintView.getType(), true);
            this.overlayLayout.invalidate();
        }
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 == null) {
            z2 = false;
        } else if (entityView2 == entityView) {
            if (!entityView.hadMultitouch()) {
                if (entityView instanceof LocationView) {
                    LocationView locationView = (LocationView) entityView;
                    locationView.setType((locationView.getType() + 1) % 4);
                } else if (entityView instanceof LinkView) {
                    LinkView linkView = (LinkView) entityView;
                    linkView.setType((linkView.getType() + 1) % 4);
                } else if (!this.editingText) {
                    if (entityView instanceof TextPaintView) {
                        this.enteredThroughText = true;
                        editSelectedTextEntity();
                    } else if (entityView instanceof ReactionWidgetEntityView) {
                        ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) entityView;
                        if (this.reactionLayoutShowing && this.reactionForEntity == entityView) {
                            reactionWidgetEntityView.changeStyle(true);
                        } else {
                            showReactionsLayoutForView(reactionWidgetEntityView);
                        }
                    } else {
                        showMenuForEntity(this.currentEntityView);
                    }
                } else {
                    EntityView entityView3 = this.currentEntityView;
                    if (entityView3 instanceof TextPaintView) {
                        AndroidUtilities.showKeyboard(((TextPaintView) entityView3).getFocusedView());
                        hideEmojiPopup(false);
                    }
                }
            }
            return true;
        } else {
            entityView2.deselect();
            EntityView entityView4 = this.currentEntityView;
            if (entityView4 instanceof TextPaintView) {
                ((TextPaintView) entityView4).endEditing();
                if (!z3) {
                    this.editingText = false;
                    AndroidUtilities.hideKeyboard(((TextPaintView) this.currentEntityView).getFocusedView());
                    hideEmojiPopup(false);
                }
            } else if (entityView4 instanceof RoundView) {
                onDeselectRound((RoundView) entityView4);
            }
            z2 = true;
        }
        EntityView entityView5 = this.currentEntityView;
        this.currentEntityView = entityView;
        if ((entityView5 instanceof TextPaintView) && TextUtils.isEmpty(((TextPaintView) entityView5).getText())) {
            lambda$registerRemovalUndo$61(entityView5);
        }
        EntityView entityView6 = this.currentEntityView;
        if (entityView5 != entityView6 && (entityView6 instanceof RoundView)) {
            onSelectRound((RoundView) entityView6);
        }
        EntityView entityView7 = this.currentEntityView;
        if (entityView7 != null) {
            entityView7.select(this.selectionContainerView);
            EntityView entityView8 = this.currentEntityView;
            if (entityView8 instanceof TextPaintView) {
                final TextPaintView textPaintView2 = (TextPaintView) entityView8;
                textPaintView2.getSwatch().brushWeight = this.colorSwatch.brushWeight;
                textPaintView2.disableAutoresize(false);
                setCurrentSwatch(textPaintView2.getSwatch(), true);
                final float f = (int) (this.paintingSize.width / 9.0f);
                this.weightChooserView.setValueOverride(new PaintWeightChooserView.ValueOverride(this) { // from class: org.telegram.ui.Stories.recorder.PaintView.14
                    @Override // org.telegram.ui.Components.Paint.Views.PaintWeightChooserView.ValueOverride
                    public float get() {
                        return textPaintView2.getBaseFontSize() / f;
                    }

                    @Override // org.telegram.ui.Components.Paint.Views.PaintWeightChooserView.ValueOverride
                    public void set(float f2) {
                        textPaintView2.disableAutoresize(true);
                        textPaintView2.setBaseFontSize((int) (f * f2));
                    }
                });
                this.weightChooserView.setShowPreview(false);
            } else {
                this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
                this.weightChooserView.setShowPreview(true);
                this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
                setCurrentSwatch(this.colorSwatch, true);
            }
        } else {
            ValueAnimator valueAnimator2 = this.tabsSelectionAnimator;
            if (valueAnimator2 != null && this.tabsNewSelectedIndex != 0) {
                valueAnimator2.cancel();
            }
            if (this.isColorListShown) {
                showColorList(false);
            }
            switchTab(0);
            this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
            this.weightChooserView.setShowPreview(true);
            this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
            setCurrentSwatch(this.colorSwatch, true);
            z4 = z2;
        }
        updateTextDim();
        return z4;
    }

    private void showReactionsLayoutForView(ReactionWidgetEntityView reactionWidgetEntityView) {
        final ReactionsContainerLayout reactionsContainerLayout;
        ReactionWidgetEntityView reactionWidgetEntityView2 = this.reactionForEntity;
        if (reactionWidgetEntityView2 != null && reactionWidgetEntityView2 != reactionWidgetEntityView && (reactionsContainerLayout = this.reactionLayout) != null) {
            reactionsContainerLayout.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter(this) { // from class: org.telegram.ui.Stories.recorder.PaintView.15
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    AndroidUtilities.removeFromParent(reactionsContainerLayout);
                }
            });
            this.reactionLayout = null;
            this.reactionLayoutShowing = false;
            this.reactionShowProgress = 0.0f;
        }
        if (this.reactionLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(2, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new WrappedResourceProvider(this, new DarkThemeResourceProvider()) { // from class: org.telegram.ui.Stories.recorder.PaintView.16
                @Override // org.telegram.ui.WrappedResourceProvider
                public void appendColors() {
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                }
            });
            this.reactionLayout = reactionsContainerLayout2;
            final BlurringShader.StoryBlurDrawer storyBlurDrawer = new BlurringShader.StoryBlurDrawer(this.blurManager, reactionsContainerLayout2, 0);
            this.reactionLayout.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
            this.parent.addView(this.reactionLayout, LayoutHelper.createFrame(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
            final Paint paint = new Paint(1);
            paint.setColor(ColorUtils.setAlphaComponent(-16777216, 120));
            this.reactionLayout.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() { // from class: org.telegram.ui.Stories.recorder.PaintView.17
                BlurringShader.StoryBlurDrawer windowBackgroundBlur;

                @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                public boolean drawBackground() {
                    return true;
                }

                @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                public /* synthetic */ boolean needEnterText() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$needEnterText(this);
                }

                @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                public /* synthetic */ void onEmojiWindowDismissed() {
                    ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$onEmojiWindowDismissed(this);
                }

                @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
                    Paint paint2;
                    if (z) {
                        if (this.windowBackgroundBlur == null) {
                            this.windowBackgroundBlur = new BlurringShader.StoryBlurDrawer(PaintView.this.blurManager, PaintView.this.reactionLayout.getReactionsWindow().windowView, 0);
                        }
                        float f4 = -f2;
                        float f5 = -f3;
                        this.windowBackgroundBlur.setBounds(f4, f5, PaintView.this.getMeasuredWidth() + f4, PaintView.this.getMeasuredHeight() + f5);
                        paint2 = this.windowBackgroundBlur.paint;
                    } else {
                        float f6 = -f2;
                        float f7 = -f3;
                        storyBlurDrawer.setBounds(f6, f7, PaintView.this.getMeasuredWidth() + f6, PaintView.this.getMeasuredHeight() + f7);
                        paint2 = storyBlurDrawer.paint;
                    }
                    paint2.setAlpha(i);
                    paint.setAlpha((int) (i * 0.4f));
                    canvas.drawRoundRect(rectF, f, f, paint2);
                    canvas.drawRoundRect(rectF, f, f, paint);
                }

                @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                    ReactionWidgetEntityView reactionWidgetEntityView3 = PaintView.this.reactionForEntity;
                    if (reactionWidgetEntityView3 == null) {
                        return;
                    }
                    reactionWidgetEntityView3.setCurrentReaction(visibleReaction, true);
                    PaintView.this.showReactionsLayout(false);
                }
            });
            this.reactionLayout.setMessage(null, null, true);
        }
        this.reactionLayout.setFragment(LaunchActivity.getLastFragment());
        this.reactionForEntity = reactionWidgetEntityView;
        showReactionsLayout(true);
    }

    public void showReactionsLayout(final boolean z) {
        if (this.reactionLayoutShowing != z) {
            if (z || this.reactionLayout != null) {
                this.reactionLayoutShowing = z;
                if (z) {
                    this.reactionLayout.reset();
                    this.reactionLayout.setVisibility(0);
                    this.reactionLayout.setSelectedReaction(this.reactionForEntity.getCurrentReaction());
                    this.reactionLayout.getParent().bringChildToFront(this.reactionLayout);
                } else {
                    this.reactionForEntity = null;
                }
                if (z) {
                    this.invalidateReactionPosition = true;
                    this.parent.invalidate();
                    float[] fArr = new float[2];
                    fArr[0] = this.reactionShowProgress;
                    fArr[1] = z ? 1.0f : 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    this.reactionLayout.setTransitionProgress(this.reactionShowProgress);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PaintView.this.lambda$showReactionsLayout$16(valueAnimator);
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.recorder.PaintView.18
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            if (z) {
                                return;
                            }
                            PaintView.this.reactionLayout.setVisibility(8);
                            PaintView.this.reactionLayout.reset();
                        }
                    });
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    ofFloat.start();
                    return;
                }
                if (this.reactionLayout.getReactionsWindow() != null) {
                    this.reactionLayout.getReactionsWindow().dismissWithAlpha();
                }
                this.reactionLayout.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.recorder.PaintView.19
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        PaintView.this.reactionShowProgress = 0.0f;
                        PaintView.this.reactionLayout.setAlpha(1.0f);
                        PaintView.this.reactionLayout.setVisibility(8);
                        PaintView.this.reactionLayout.reset();
                    }
                }).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showReactionsLayout$16(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.reactionShowProgress = floatValue;
        this.reactionLayout.setTransitionProgress(floatValue);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        if ((view == this.renderView || view == this.renderInputView || view == this.entitiesView || view == this.selectionContainerView) && this.currentCropState != null) {
            canvas.save();
            if (Build.VERSION.SDK_INT >= 21 && !this.inBubbleMode) {
                i = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            MediaController.CropState cropState = this.currentCropState;
            int i2 = cropState.transformRotation;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float scaleX = measuredWidth * cropState.cropPw * view.getScaleX();
            MediaController.CropState cropState2 = this.currentCropState;
            int i3 = (int) (scaleX / cropState2.cropScale);
            int scaleY = (int) (((measuredHeight * cropState2.cropPh) * view.getScaleY()) / this.currentCropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - i3) / 2.0f)) + this.transformX;
            float measuredHeight2 = (((((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) + getAdditionalBottom()) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i + this.transformY;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, measuredHeight2), Math.min(ceil + i3, getMeasuredWidth()), Math.min(getMeasuredHeight(), measuredHeight2 + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getBarView() {
        return this.tabsSelectedIndex == 2 ? this.textOptionsView : this.paintToolsView;
    }

    private void setupTabsLayout(Context context) {
        LinearLayout linearLayout = new LinearLayout(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.20
            Paint linePaint;

            {
                Paint paint = new Paint(1);
                this.linePaint = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.linePaint.setStyle(Paint.Style.STROKE);
                this.linePaint.setStrokeCap(Paint.Cap.ROUND);
                setWillNotDraw(false);
            }

            @Override // android.widget.LinearLayout, android.view.View
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                TextView textView = (TextView) getChildAt(PaintView.this.tabsSelectedIndex);
                TextView textView2 = PaintView.this.tabsNewSelectedIndex != -1 ? (TextView) getChildAt(PaintView.this.tabsNewSelectedIndex) : null;
                this.linePaint.setColor(textView.getCurrentTextColor());
                float y = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout = textView.getLayout();
                if (layout == null) {
                    return;
                }
                Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                float interpolation = layout2 == null ? 0.0f : CubicBezierInterpolator.DEFAULT.getInterpolation(PaintView.this.tabsSelectionProgress);
                float lerp = AndroidUtilities.lerp(textView.getX() + layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? textView2.getX() + layout2.getPrimaryHorizontal(layout.getLineStart(0)) : 0.0f, interpolation);
                canvas.drawLine(lerp, y, lerp + AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation), y, this.linePaint);
            }
        };
        this.tabsLayout = linearLayout;
        linearLayout.setClipToPadding(false);
        this.tabsLayout.setOrientation(0);
        this.bottomLayout.addView(this.tabsLayout, LayoutHelper.createFrame(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.drawTab = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.drawTab;
        int i = Theme.key_listSelector;
        textView2.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 7));
        this.drawTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.drawTab.setTextColor(-1);
        this.drawTab.setTextSize(1, 14.0f);
        this.drawTab.setGravity(1);
        this.drawTab.setTypeface(AndroidUtilities.bold());
        this.drawTab.setSingleLine();
        this.drawTab.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaintView.this.lambda$setupTabsLayout$17(view);
            }
        });
        this.tabsLayout.addView(this.drawTab, LayoutHelper.createLinear(0, -2, 1.0f));
        TextView textView3 = new TextView(context);
        this.stickerTab = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.stickerTab.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 7));
        this.stickerTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.stickerTab.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaintView.this.lambda$setupTabsLayout$18(view);
            }
        });
        this.stickerTab.setTextColor(-1);
        this.stickerTab.setTextSize(1, 14.0f);
        this.stickerTab.setGravity(1);
        this.stickerTab.setTypeface(AndroidUtilities.bold());
        this.stickerTab.setAlpha(0.6f);
        this.stickerTab.setSingleLine();
        this.tabsLayout.addView(this.stickerTab, LayoutHelper.createLinear(0, -2, 1.0f));
        TextView textView4 = new TextView(context);
        this.textTab = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.textTab.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 7));
        this.textTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.textTab.setTextColor(-1);
        this.textTab.setTextSize(1, 14.0f);
        this.textTab.setGravity(1);
        this.textTab.setTypeface(AndroidUtilities.bold());
        this.textTab.setAlpha(0.6f);
        this.textTab.setSingleLine();
        this.textTab.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaintView.this.lambda$setupTabsLayout$19(view);
            }
        });
        this.tabsLayout.addView(this.textTab, LayoutHelper.createLinear(0, -2, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupTabsLayout$17(View view) {
        if (this.editingText) {
            lambda$createRound$60(null);
        } else {
            switchTab(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupTabsLayout$18(View view) {
        openStickersView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupTabsLayout$19(View view) {
        switchTab(2);
        if (this.currentEntityView instanceof TextPaintView) {
            return;
        }
        this.forceChanges = true;
        createText(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getBarView(int i) {
        if (i == 0) {
            return this.paintToolsView;
        }
        if (i == 2) {
            return this.textOptionsView;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchTab(final int i) {
        if (this.tabsSelectedIndex == i || this.tabsNewSelectedIndex == i) {
            return;
        }
        ValueAnimator valueAnimator = this.tabsSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final View barView = getBarView(this.tabsSelectedIndex);
        this.tabsNewSelectedIndex = i;
        final View barView2 = getBarView(i);
        PersistColorPalette.getInstance(this.currentAccount).setInTextMode(i == 2);
        this.colorSwatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
        setCurrentSwatch(this.colorSwatch, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.tabsSelectionAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.tabsSelectionAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PaintView.this.lambda$switchTab$20(barView, barView2, valueAnimator2);
            }
        });
        this.tabsSelectionAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.recorder.PaintView.21
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                View view;
                if (barView != null && (view = barView2) != null) {
                    view.setVisibility(0);
                }
                if (i == 2) {
                    PaintView.this.weightChooserView.setMinMax(0.5f, 2.0f);
                    return;
                }
                Brush currentBrush = PaintView.this.renderView.getCurrentBrush();
                if ((currentBrush instanceof Brush.Blurer) || (currentBrush instanceof Brush.Eraser)) {
                    PaintView.this.weightChooserView.setMinMax(0.4f, 1.75f);
                } else {
                    PaintView.this.weightChooserView.setMinMax(0.05f, 1.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PaintView paintView = PaintView.this;
                paintView.tabsSelectedIndex = paintView.tabsNewSelectedIndex;
                PaintView.this.tabsNewSelectedIndex = -1;
                PaintView.this.tabsLayout.invalidate();
                View view = barView;
                if (view != null && barView2 != null) {
                    view.setVisibility(8);
                }
                if (animator == PaintView.this.tabsSelectionAnimator) {
                    PaintView.this.tabsSelectionAnimator = null;
                }
            }
        });
        this.tabsSelectionAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchTab$20(View view, View view2, ValueAnimator valueAnimator) {
        this.tabsSelectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.tabsLayout.invalidate();
        this.bottomLayout.invalidate();
        this.overlayLayout.invalidate();
        int i = 0;
        while (i < this.tabsLayout.getChildCount()) {
            this.tabsLayout.getChildAt(i).setAlpha(((i == this.tabsNewSelectedIndex ? this.tabsSelectionProgress : i == this.tabsSelectedIndex ? 1.0f - this.tabsSelectionProgress : 0.0f) * 0.4f) + 0.6f);
            i++;
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.tabsSelectionProgress);
        if (view == null || view2 == null) {
            return;
        }
        float f = 1.0f - interpolation;
        float f2 = (f * 0.4f) + 0.6f;
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setTranslationY((AndroidUtilities.dp(16.0f) * Math.min(interpolation, 0.25f)) / 0.25f);
        view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
        float f3 = (interpolation * 0.4f) + 0.6f;
        view2.setScaleX(f3);
        view2.setScaleY(f3);
        view2.setTranslationY(((-AndroidUtilities.dp(16.0f)) * Math.min(f, 0.25f)) / 0.25f);
        view2.setAlpha(1.0f - (Math.min(f, 0.25f) / 0.25f));
    }

    private void openStickersView() {
        final int i = this.tabsSelectedIndex;
        switchTab(1);
        postDelayed(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$openStickersView$21();
            }
        }, 350L);
        final EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(getContext(), false, this.resourcesProvider, false) { // from class: org.telegram.ui.Stories.recorder.PaintView.22
            @Override // org.telegram.ui.Stories.recorder.EmojiBottomSheet
            public boolean canShowWidget(Integer num) {
                return true;
            }

            @Override // org.telegram.ui.ActionBar.BottomSheet
            public void onDismissAnimationStart() {
                super.onDismissAnimationStart();
                PaintView.this.switchTab(i);
            }

            @Override // org.telegram.ui.Stories.recorder.EmojiBottomSheet
            public boolean canClickWidget(Integer num) {
                if (num.intValue() == 3) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < PaintView.this.entitiesView.getChildCount(); i3++) {
                        if (PaintView.this.entitiesView.getChildAt(i3) instanceof ReactionWidgetEntityView) {
                            i2++;
                        }
                    }
                    if (i2 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                        showPremiumBulletin(LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]));
                        return false;
                    } else if (i2 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                        this.container.performHapticFeedback(3);
                        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0])).show(true);
                        return false;
                    }
                }
                return true;
            }

            @Override // org.telegram.ui.Stories.recorder.EmojiBottomSheet
            protected boolean checkAudioPermission(Runnable runnable) {
                return PaintView.this.checkAudioPermission(runnable);
            }
        };
        this.emojiPopup = emojiBottomSheet;
        final StoryRecorder.WindowView windowView = this.parent;
        Objects.requireNonNull(windowView);
        emojiBottomSheet.setBlurDelegate(new Utilities.Callback2() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda56
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StoryRecorder.WindowView.this.drawBlurBitmap((Bitmap) obj, ((Float) obj2).floatValue());
            }
        });
        final boolean[] zArr = {true};
        emojiBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.this.lambda$openStickersView$22(zArr, i, dialogInterface);
            }
        });
        emojiBottomSheet.whenDocumentSelected(new Utilities.Callback3Return() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda57
            @Override // org.telegram.messenger.Utilities.Callback3Return
            public final Object run(Object obj, Object obj2, Object obj3) {
                Boolean lambda$openStickersView$23;
                lambda$openStickersView$23 = PaintView.this.lambda$openStickersView$23(obj, (TLRPC$Document) obj2, (Boolean) obj3);
                return lambda$openStickersView$23;
            }
        });
        emojiBottomSheet.whenWidgetSelected(new Utilities.CallbackReturn() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda61
            @Override // org.telegram.messenger.Utilities.CallbackReturn
            public final Object run(Object obj) {
                Boolean lambda$openStickersView$26;
                lambda$openStickersView$26 = PaintView.this.lambda$openStickersView$26(zArr, emojiBottomSheet, (Integer) obj);
                return lambda$openStickersView$26;
            }
        });
        emojiBottomSheet.show();
        onOpenCloseStickersAlert(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openStickersView$21() {
        if (this.facesBitmap != null) {
            detectFaces();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openStickersView$22(boolean[] zArr, int i, DialogInterface dialogInterface) {
        this.emojiPopup = null;
        if (zArr[0]) {
            onOpenCloseStickersAlert(false);
        }
        switchTab(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$openStickersView$23(Object obj, TLRPC$Document tLRPC$Document, Boolean bool) {
        this.forceChanges = true;
        StickerView createSticker = createSticker(obj, tLRPC$Document, false);
        if (bool.booleanValue()) {
            createSticker.setScale(1.5f);
        }
        appearAnimation(createSticker);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$openStickersView$26(boolean[] zArr, EmojiBottomSheet emojiBottomSheet, Integer num) {
        if (num.intValue() == 0) {
            zArr[0] = false;
            showLocationAlert(null, new Utilities.Callback2() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda54
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    PaintView.this.lambda$openStickersView$24((TLRPC$MessageMedia) obj, (TL_stories$MediaArea) obj2);
                }
            });
            return Boolean.TRUE;
        } else if (num.intValue() == 2) {
            emojiBottomSheet.dismiss();
            onGalleryClick();
            return Boolean.TRUE;
        } else if (num.intValue() == 1) {
            zArr[0] = false;
            showAudioAlert(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda58
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PaintView.this.onAudioSelect((MessageObject) obj);
                }
            });
            return Boolean.TRUE;
        } else if (num.intValue() == 3) {
            this.forceChanges = true;
            appearAnimation(createReactionWidget(true));
            return Boolean.TRUE;
        } else if (num.intValue() == 4) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                emojiBottomSheet.container.performHapticFeedback(3);
                BulletinFactory.of(emojiBottomSheet.container, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda43
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaintView.this.lambda$openStickersView$25();
                    }
                })).show(true);
                return Boolean.FALSE;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.entitiesView.getChildCount(); i2++) {
                if (this.entitiesView.getChildAt(i2) instanceof LinkView) {
                    i++;
                }
            }
            if (i >= 3) {
                BulletinFactory.of(emojiBottomSheet.container, this.resourcesProvider).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0])).show(true);
                return Boolean.FALSE;
            }
            zArr[0] = false;
            showLinkAlert(null);
            emojiBottomSheet.dismiss();
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openStickersView$24(TLRPC$MessageMedia tLRPC$MessageMedia, TL_stories$MediaArea tL_stories$MediaArea) {
        appearAnimation(createLocationSticker(tLRPC$MessageMedia, tL_stories$MediaArea, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openStickersView$25() {
        new PremiumFeatureBottomSheet(new BaseFragment() { // from class: org.telegram.ui.Stories.recorder.PaintView.23
            @Override // org.telegram.ui.ActionBar.BaseFragment
            public int getCurrentAccount() {
                return this.currentAccount;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Context getContext() {
                return PaintView.this.getContext();
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Activity getParentActivity() {
                return AndroidUtilities.findActivity(PaintView.this.getContext());
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Theme.ResourcesProvider getResourceProvider() {
                return PaintView.this.resourcesProvider;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public boolean presentFragment(BaseFragment baseFragment) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment == null) {
                    return false;
                }
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                bottomSheetParams.allowNestedScroll = false;
                lastFragment.showAsSheet(baseFragment, bottomSheetParams);
                return true;
            }
        }, 14, true).show();
    }

    private void showLinkAlert(final LinkView linkView) {
        StoryLinkSheet storyLinkSheet = new StoryLinkSheet(getContext(), this.resourcesProvider, this.previewView, new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda59
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                PaintView.this.lambda$showLinkAlert$27(linkView, (LinkPreview.WebPagePreview) obj);
            }
        });
        if (linkView != null) {
            storyLinkSheet.set(linkView.link);
        }
        storyLinkSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.this.lambda$showLinkAlert$28(dialogInterface);
            }
        });
        storyLinkSheet.show();
        onOpenCloseStickersAlert(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLinkAlert$27(LinkView linkView, LinkPreview.WebPagePreview webPagePreview) {
        if (linkView != null) {
            linkView.setLink(this.currentAccount, webPagePreview, null);
            appearAnimation(linkView);
            return;
        }
        appearAnimation(createLinkSticker(webPagePreview, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLinkAlert$28(DialogInterface dialogInterface) {
        onOpenCloseStickersAlert(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 24 extends ChatActivity {
        final /* synthetic */ Utilities.Callback2 val$onLocationSelected;

        @Override // org.telegram.ui.ChatActivity, org.telegram.ui.Components.ChatActivityInterface, org.telegram.ui.Components.InstantCameraView.Delegate
        public long getDialogId() {
            return 0L;
        }

        @Override // org.telegram.ui.ChatActivity
        public boolean isKeyboardVisible() {
            return false;
        }

        @Override // org.telegram.ui.ChatActivity, org.telegram.ui.ActionBar.BaseFragment
        public boolean isLightStatusBar() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        24(Bundle bundle, Utilities.Callback2 callback2) {
            super(bundle);
            this.val$onLocationSelected = callback2;
        }

        @Override // org.telegram.ui.ChatActivity, org.telegram.ui.ActionBar.BaseFragment
        public Theme.ResourcesProvider getResourceProvider() {
            return PaintView.this.resourcesProvider;
        }

        @Override // org.telegram.ui.ActionBar.BaseFragment
        public Activity getParentActivity() {
            return AndroidUtilities.findActivity(PaintView.this.getContext());
        }

        @Override // org.telegram.ui.ChatActivity, org.telegram.ui.Components.ChatActivityInterface
        public TLRPC$User getCurrentUser() {
            return UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.telegram.ui.ChatActivity, org.telegram.ui.LocationActivity.LocationActivityDelegate
        public void didSelectLocation(final TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2) {
            final TL_stories$TL_mediaAreaGeoPoint tL_stories$TL_mediaAreaGeoPoint;
            if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaGeo) {
                tL_stories$TL_mediaAreaGeoPoint = new TL_stories$TL_mediaAreaGeoPoint();
                tL_stories$TL_mediaAreaGeoPoint.geo = tLRPC$MessageMedia.geo;
            } else if (!(tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaVenue)) {
                return;
            } else {
                TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue = (TLRPC$TL_messageMediaVenue) tLRPC$MessageMedia;
                long j = tLRPC$TL_messageMediaVenue.query_id;
                if (j == -1 || j == -2) {
                    tL_stories$TL_mediaAreaGeoPoint = new TL_stories$TL_mediaAreaGeoPoint();
                    tL_stories$TL_mediaAreaGeoPoint.geo = tLRPC$MessageMedia.geo;
                    TL_stories$TL_geoPointAddress tL_stories$TL_geoPointAddress = ((TLRPC$TL_messageMediaVenue) tLRPC$MessageMedia).geoAddress;
                    tL_stories$TL_mediaAreaGeoPoint.address = tL_stories$TL_geoPointAddress;
                    if (tL_stories$TL_geoPointAddress != null) {
                        tL_stories$TL_mediaAreaGeoPoint.flags |= 1;
                    }
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$24$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            PaintView.24.lambda$didSelectLocation$0(TLRPC$MessageMedia.this, tL_stories$TL_mediaAreaGeoPoint);
                        }
                    });
                } else {
                    TL_stories$TL_inputMediaAreaVenue tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_inputMediaAreaVenue();
                    tL_stories$TL_inputMediaAreaVenue.query_id = tLRPC$TL_messageMediaVenue.query_id;
                    tL_stories$TL_inputMediaAreaVenue.result_id = tLRPC$TL_messageMediaVenue.result_id;
                    tL_stories$TL_mediaAreaGeoPoint = tL_stories$TL_inputMediaAreaVenue;
                }
            }
            this.val$onLocationSelected.run(tLRPC$MessageMedia, tL_stories$TL_mediaAreaGeoPoint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$didSelectLocation$0(TLRPC$MessageMedia tLRPC$MessageMedia, TL_stories$TL_mediaAreaGeoPoint tL_stories$TL_mediaAreaGeoPoint) {
            try {
                List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(tLRPC$MessageMedia.title, 1);
                if (fromLocationName.size() <= 0) {
                    return;
                }
                tL_stories$TL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                tL_stories$TL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
            } catch (Exception unused) {
            }
        }
    }

    private void showLocationAlert(LocationView locationView, Utilities.Callback2<TLRPC$MessageMedia, TL_stories$MediaArea> callback2) {
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$GeoPoint tLRPC$GeoPoint;
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), new 24(null, callback2), false, true, false, this.resourcesProvider);
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate(this) { // from class: org.telegram.ui.Stories.recorder.PaintView.25
            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void didPressedButton(int i, boolean z, boolean z2, int i2, long j, boolean z3, boolean z4) {
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void didSelectBot(TLRPC$User tLRPC$User) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$didSelectBot(this, tLRPC$User);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void doOnIdle(Runnable runnable) {
                runnable.run();
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ boolean needEnterComment() {
                return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$needEnterComment(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void onCameraOpened() {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onCameraOpened(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onWallpaperSelected(this, obj);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$openAvatarsSearch(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$selectItemOnClicking(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, long j, boolean z2) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$sendAudio(this, arrayList, charSequence, z, i, j, z2);
            }
        });
        if (locationView != null && (tLRPC$MessageMedia = locationView.location) != null && (tLRPC$GeoPoint = tLRPC$MessageMedia.geo) != null) {
            chatAttachAlert.setStoryLocationPicker(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
        } else if (this.fileFromGallery) {
            chatAttachAlert.setStoryLocationPicker(this.isVideo, this.file);
        } else {
            chatAttachAlert.setStoryLocationPicker();
        }
        chatAttachAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.this.lambda$showLocationAlert$29(dialogInterface);
            }
        });
        chatAttachAlert.init();
        chatAttachAlert.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationAlert$29(DialogInterface dialogInterface) {
        onOpenCloseStickersAlert(false);
    }

    private void showAudioAlert(final Utilities.Callback<MessageObject> callback) {
        final ChatAttachAlert[] chatAttachAlertArr = {new ChatAttachAlert(getContext(), new ChatActivity(null) { // from class: org.telegram.ui.Stories.recorder.PaintView.26
            @Override // org.telegram.ui.ChatActivity, org.telegram.ui.Components.ChatActivityInterface, org.telegram.ui.Components.InstantCameraView.Delegate
            public long getDialogId() {
                return 0L;
            }

            @Override // org.telegram.ui.ChatActivity
            public boolean isKeyboardVisible() {
                return false;
            }

            @Override // org.telegram.ui.ChatActivity, org.telegram.ui.ActionBar.BaseFragment
            public boolean isLightStatusBar() {
                return false;
            }

            @Override // org.telegram.ui.ChatActivity, org.telegram.ui.ActionBar.BaseFragment
            public Theme.ResourcesProvider getResourceProvider() {
                return PaintView.this.resourcesProvider;
            }

            @Override // org.telegram.ui.ActionBar.BaseFragment
            public Activity getParentActivity() {
                return AndroidUtilities.findActivity(PaintView.this.getContext());
            }

            @Override // org.telegram.ui.ChatActivity, org.telegram.ui.Components.ChatActivityInterface
            public TLRPC$User getCurrentUser() {
                return UserConfig.getInstance(this.currentAccount).getCurrentUser();
            }

            @Override // org.telegram.ui.ChatActivity
            public void sendAudio(ArrayList<MessageObject> arrayList, CharSequence charSequence, boolean z, int i, long j, boolean z2) {
                MessageObject messageObject;
                if (arrayList.isEmpty() || (messageObject = arrayList.get(0)) == null) {
                    return;
                }
                callback.run(messageObject);
                ChatAttachAlert[] chatAttachAlertArr2 = chatAttachAlertArr;
                if (chatAttachAlertArr2[0] != null) {
                    chatAttachAlertArr2[0].dismiss();
                }
            }
        }, false, true, false, this.resourcesProvider)};
        chatAttachAlertArr[0].setDelegate(new ChatAttachAlert.ChatAttachViewDelegate(this) { // from class: org.telegram.ui.Stories.recorder.PaintView.27
            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void didPressedButton(int i, boolean z, boolean z2, int i2, long j, boolean z3, boolean z4) {
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void didSelectBot(TLRPC$User tLRPC$User) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$didSelectBot(this, tLRPC$User);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void doOnIdle(Runnable runnable) {
                runnable.run();
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ boolean needEnterComment() {
                return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$needEnterComment(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void onCameraOpened() {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onCameraOpened(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$onWallpaperSelected(this, obj);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$openAvatarsSearch(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$selectItemOnClicking(this);
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, long j, boolean z2) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$sendAudio(this, arrayList, charSequence, z, i, j, z2);
            }
        });
        chatAttachAlertArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.this.lambda$showAudioAlert$30(dialogInterface);
            }
        });
        chatAttachAlertArr[0].setStoryAudioPicker();
        chatAttachAlertArr[0].init();
        chatAttachAlertArr[0].show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAudioAlert$30(DialogInterface dialogInterface) {
        onOpenCloseStickersAlert(false);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float currentActionBarHeight;
        float f;
        float f2;
        this.ignoreLayout = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.bitmapToEdit;
        if (bitmap != null) {
            f = bitmap.getWidth();
            currentActionBarHeight = this.bitmapToEdit.getHeight();
        } else {
            currentActionBarHeight = (size2 - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f)) > currentActionBarHeight2) {
            Math.floor((f2 * f) / currentActionBarHeight);
        }
        float f3 = this.paintingSize.width;
        EntityView entityView = this.currentEntityView;
        if (entityView != null) {
            entityView.updateSelectionView();
        }
        measureChild(this.bottomLayout, i, i2);
        measureChild(this.weightChooserView, i, i2);
        measureChild(this.pipetteContainerLayout, i, i2);
        measureChild(this.overlayLayout, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.emojiPadding - this.parent.getPaddingUnderContainer(), measureKeyboardHeight()), 1073741824));
        FrameLayout frameLayout = this.topLayout;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), this.topLayout.getPaddingRight(), this.topLayout.getPaddingBottom());
        measureChild(this.topLayout, i, i2);
        this.ignoreLayout = false;
        if (!this.waitingForKeyboardOpen && AndroidUtilities.dp(20.0f) >= 0 && !this.emojiViewVisible && !this.isAnimatePopupClosing) {
            this.ignoreLayout = true;
            hideEmojiView();
            this.ignoreLayout = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        hideEmojiView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto, org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    private Size getPaintingSize() {
        Size size = this.paintingSize;
        if (size != null) {
            return size;
        }
        Size size2 = new Size(1080.0f, 1920.0f);
        this.paintingSize = size2;
        return size2;
    }

    public void init() {
        this.entitiesView.setVisibility(0);
        this.renderView.setVisibility(0);
        this.renderInputView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupEntities() {
        Emoji.EmojiSpan[] emojiSpanArr;
        RoundView roundView;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.initialEntities;
        if (arrayList != null) {
            StoryEntry storyEntry = this.initialEntry;
            this.initialEntry = null;
            this.initialEntities = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i);
                byte b = mediaEntity.type;
                if (b == 0) {
                    StickerView createSticker = createSticker(mediaEntity.parentObject, mediaEntity.document, false);
                    if ((2 & mediaEntity.subType) != 0) {
                        createSticker.mirror();
                    }
                    ViewGroup.LayoutParams layoutParams = createSticker.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    roundView = createSticker;
                } else if (b == 1) {
                    TextPaintView createText = createText(false);
                    createText.setType(mediaEntity.subType);
                    createText.setTypeface(mediaEntity.textTypeface);
                    createText.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    Iterator<VideoEditedInfo.EmojiEntity> it = mediaEntity.entities.iterator();
                    while (it.hasNext()) {
                        VideoEditedInfo.EmojiEntity next = it.next();
                        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(next.document_id, 1.0f, createText.getFontMetricsInt());
                        int i2 = next.offset;
                        spannableString.setSpan(animatedEmojiSpan, i2, next.length + i2, 33);
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) spannableString, createText.getFontMetricsInt(), (int) (createText.getFontSize() * 0.8f), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    createText.setText(replaceEmoji);
                    setTextAlignment(createText, mediaEntity.textAlign);
                    Swatch swatch = createText.getSwatch();
                    swatch.color = mediaEntity.color;
                    createText.setSwatch(swatch);
                    roundView = createText;
                } else if (b == 2) {
                    PhotoView createPhoto = createPhoto(mediaEntity.text, false);
                    createPhoto.preloadSegmented(mediaEntity.segmentedPath);
                    if ((2 & mediaEntity.subType) != 0) {
                        createPhoto.mirror();
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        createPhoto.toggleSegmented(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = createPhoto.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    roundView = createPhoto;
                } else if (b == 6) {
                    MessageEntityView createMessage = createMessage(storyEntry.messageObjects, false, storyEntry.isVideo);
                    roundView = createMessage;
                    if (mediaEntity.viewWidth > 0) {
                        roundView = createMessage;
                        if (mediaEntity.viewHeight > 0) {
                            ViewGroup.LayoutParams layoutParams3 = createMessage.getLayoutParams();
                            layoutParams3.width = mediaEntity.viewWidth;
                            layoutParams3.height = mediaEntity.viewHeight;
                            roundView = createMessage;
                        }
                    }
                } else if (b == 3) {
                    LocationView createLocationSticker = createLocationSticker(mediaEntity.media, mediaEntity.mediaArea, false);
                    createLocationSticker.setType(mediaEntity.subType, mediaEntity.color);
                    roundView = createLocationSticker;
                } else if (b == 7) {
                    LinkView createLinkSticker = createLinkSticker(mediaEntity.linkSettings, mediaEntity.mediaArea, false);
                    createLinkSticker.setType(mediaEntity.subType, mediaEntity.color);
                    roundView = createLinkSticker;
                } else if (b == 4) {
                    ReactionWidgetEntityView createReactionWidget = createReactionWidget(false);
                    createReactionWidget.setCurrentReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(mediaEntity.mediaArea.reaction), false);
                    if (mediaEntity.mediaArea.flipped) {
                        createReactionWidget.mirror(false);
                    }
                    roundView = createReactionWidget;
                    if (mediaEntity.mediaArea.dark) {
                        createReactionWidget.changeStyle(false);
                        roundView = createReactionWidget;
                    }
                } else {
                    if (b == 5 && storyEntry.round != null) {
                        RoundView createRound = createRound(storyEntry.roundThumb, false);
                        onCreateRound(createRound);
                        roundView = createRound;
                        if ((2 & mediaEntity.subType) != 0) {
                            createRound.mirror(false);
                            roundView = createRound;
                        }
                    }
                }
                roundView.setX((mediaEntity.x * this.w) - ((mediaEntity.viewWidth * (1.0f - mediaEntity.scale)) / 2.0f));
                roundView.setY((mediaEntity.y * this.h) - ((mediaEntity.viewHeight * (1.0f - mediaEntity.scale)) / 2.0f));
                roundView.setPosition(new Point(roundView.getX() + (mediaEntity.viewWidth / 2.0f), roundView.getY() + (mediaEntity.viewHeight / 2.0f)));
                roundView.setScale(mediaEntity.scale);
                double d = -mediaEntity.rotation;
                Double.isNaN(d);
                roundView.setRotation((float) ((d / 3.141592653589793d) * 180.0d));
            }
            this.entitiesView.setVisibility(0);
        }
    }

    private int getFrameRotation() {
        int i = this.originalBitmapRotation;
        if (i != 90) {
            if (i != 180) {
                return i != 270 ? 0 : 3;
            }
            return 2;
        }
        return 1;
    }

    private boolean isSidewardOrientation() {
        int i = this.originalBitmapRotation;
        return i % 360 == 90 || i % 360 == 270;
    }

    private void detectFaces() {
        this.queue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$detectFaces$31();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectFaces$31() {
        int i;
        FaceDetector faceDetector = null;
        try {
            try {
                faceDetector = new FaceDetector.Builder(getContext()).setMode(1).setLandmarkType(1).setTrackingEnabled(false).build();
            } catch (Exception e) {
                FileLog.e(e);
                if (0 == 0) {
                    return;
                }
            }
            if (!faceDetector.isOperational()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("face detection is not operational");
                }
                faceDetector.release();
                return;
            }
            try {
                SparseArray<Face> detect = faceDetector.detect(new Frame.Builder().setBitmap(this.facesBitmap).setRotation(getFrameRotation()).build());
                ArrayList<PhotoFace> arrayList = new ArrayList<>();
                Size paintingSize = getPaintingSize();
                for (i = 0; i < detect.size(); i++) {
                    PhotoFace photoFace = new PhotoFace(detect.get(detect.keyAt(i)), this.facesBitmap, paintingSize, isSidewardOrientation());
                    if (photoFace.isSufficient()) {
                        arrayList.add(photoFace);
                    }
                }
                this.faces = arrayList;
                faceDetector.release();
            } catch (Throwable th) {
                FileLog.e(th);
                faceDetector.release();
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                faceDetector.release();
            }
            throw th2;
        }
    }

    public void shutdown() {
        this.renderView.shutdown();
        this.entitiesView.setVisibility(8);
        this.selectionContainerView.setVisibility(8);
        this.queue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda53
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.lambda$shutdown$32();
            }
        });
        EmojiBottomSheet emojiBottomSheet = this.emojiPopup;
        if (emojiBottomSheet != null) {
            emojiBottomSheet.dismiss();
        }
        ColorPickerBottomSheet colorPickerBottomSheet = this.colorPickerBottomSheet;
        if (colorPickerBottomSheet != null) {
            colorPickerBottomSheet.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$shutdown$32() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout
    public void onResume() {
        this.renderView.redraw();
    }

    public float getOffsetTranslationY() {
        return this.offsetTranslationY;
    }

    public void updateColors() {
        this.toolsPaint.setColor(-15132391);
    }

    public boolean hasChanges() {
        return this.undoStore.canUndo() || this.forceChanges;
    }

    public static boolean isVideoStickerDocument(TLRPC$Document tLRPC$Document) {
        if (tLRPC$Document != null) {
            for (int i = 0; i < tLRPC$Document.attributes.size(); i++) {
                TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i);
                if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeCustomEmoji) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) {
                    return "video/webm".equals(tLRPC$Document.mime_type) || "video/mp4".equals(tLRPC$Document.mime_type);
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x071a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap getBitmap(ArrayList<VideoEditedInfo.MediaEntity> arrayList, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, StoryEntry storyEntry) {
        Bitmap bitmap;
        Bitmap createBitmap;
        int i3;
        int i4;
        View view;
        boolean z5;
        View view2;
        View view3;
        ImageReceiver imageReceiver;
        ArrayList<MessageObject> arrayList2;
        long j;
        File saveSegmentedImage;
        float scaleX;
        float radius;
        double d;
        TL_stories$MediaArea tL_stories$MediaArea;
        TL_stories$MediaAreaCoordinates tL_stories$MediaAreaCoordinates;
        int i5;
        int i6;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        boolean z6;
        PaintView paintView = this;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = arrayList;
        int i7 = 0;
        byte b = 1;
        if (z) {
            createBitmap = paintView.renderView.getResultBitmap(false, z4);
        } else if (z3) {
            createBitmap = Bitmap.createBitmap(Math.max(1, paintView.entitiesView.getMeasuredWidth()), Math.max(1, paintView.entitiesView.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else if (z2) {
            Bitmap resultBitmap = paintView.renderView.getResultBitmap(false, false);
            createBitmap = resultBitmap != null ? Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), Bitmap.Config.ARGB_8888) : null;
        } else {
            bitmap = null;
            paintView.lcm = BigInteger.ONE;
            if (paintView.entitiesView.entitiesCount() > 0) {
                int childCount = paintView.entitiesView.getChildCount();
                int i8 = 0;
                while (i8 < childCount) {
                    View childAt = paintView.entitiesView.getChildAt(i8);
                    if (childAt instanceof EntityView) {
                        EntityView entityView = (EntityView) childAt;
                        entityView.getPosition();
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        if (arrayList3 != null) {
                            long j2 = 5000;
                            if (entityView instanceof TextPaintView) {
                                mediaEntity.type = b;
                                TextPaintView textPaintView = (TextPaintView) entityView;
                                CharSequence text = textPaintView.getText();
                                if (text instanceof Spanned) {
                                    Spanned spanned = (Spanned) text;
                                    AnimatedEmojiSpan[] animatedEmojiSpanArr2 = (AnimatedEmojiSpan[]) spanned.getSpans(i7, text.length(), AnimatedEmojiSpan.class);
                                    if (animatedEmojiSpanArr2 != null) {
                                        int i9 = 0;
                                        while (i9 < animatedEmojiSpanArr2.length) {
                                            AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr2[i9];
                                            TLRPC$Document tLRPC$Document = animatedEmojiSpan.document;
                                            if (tLRPC$Document == null) {
                                                i5 = childCount;
                                                i6 = i8;
                                                tLRPC$Document = AnimatedEmojiDrawable.findDocument(paintView.currentAccount, animatedEmojiSpan.getDocumentId());
                                            } else {
                                                i5 = childCount;
                                                i6 = i8;
                                            }
                                            if (tLRPC$Document != null) {
                                                AnimatedEmojiDrawable.getDocumentFetcher(paintView.currentAccount).putDocument(tLRPC$Document);
                                            }
                                            VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                            View view4 = childAt;
                                            emojiEntity.document_id = animatedEmojiSpan.getDocumentId();
                                            emojiEntity.document = tLRPC$Document;
                                            emojiEntity.offset = spanned.getSpanStart(animatedEmojiSpan);
                                            emojiEntity.length = spanned.getSpanEnd(animatedEmojiSpan) - emojiEntity.offset;
                                            emojiEntity.documentAbsolutePath = FileLoader.getInstance(paintView.currentAccount).getPathToAttach(tLRPC$Document, true).getAbsolutePath();
                                            int i10 = 0;
                                            while (tLRPC$Document != null) {
                                                ArrayList<TLRPC$PhotoSize> arrayList4 = tLRPC$Document.thumbs;
                                                if (arrayList4 == null || arrayList4.isEmpty() || new File(emojiEntity.documentAbsolutePath).exists()) {
                                                    break;
                                                }
                                                animatedEmojiSpanArr = animatedEmojiSpanArr2;
                                                z6 = true;
                                                emojiEntity.documentAbsolutePath = FileLoader.getInstance(paintView.currentAccount).getPathToAttach(tLRPC$Document.thumbs.get(i10), true).getAbsolutePath();
                                                i10++;
                                                if (i10 >= tLRPC$Document.thumbs.size()) {
                                                    break;
                                                }
                                                animatedEmojiSpanArr2 = animatedEmojiSpanArr;
                                            }
                                            animatedEmojiSpanArr = animatedEmojiSpanArr2;
                                            z6 = true;
                                            boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, z6);
                                            if (isAnimatedStickerDocument || isVideoStickerDocument(emojiEntity.document)) {
                                                emojiEntity.subType = (byte) ((isAnimatedStickerDocument ? (byte) 1 : (byte) 4) | emojiEntity.subType);
                                            }
                                            if (MessageObject.isTextColorEmoji(emojiEntity.document)) {
                                                emojiEntity.subType = (byte) (emojiEntity.subType | 8);
                                            }
                                            mediaEntity.entities.add(emojiEntity);
                                            if (tLRPC$Document != null) {
                                                BigInteger valueOf = BigInteger.valueOf(5000L);
                                                paintView.lcm = paintView.lcm.multiply(valueOf).divide(paintView.lcm.gcd(valueOf));
                                            }
                                            i9++;
                                            childCount = i5;
                                            i8 = i6;
                                            childAt = view4;
                                            animatedEmojiSpanArr2 = animatedEmojiSpanArr;
                                        }
                                    }
                                }
                                i3 = childCount;
                                i4 = i8;
                                view = childAt;
                                mediaEntity.text = text.toString();
                                mediaEntity.subType = (byte) textPaintView.getType();
                                mediaEntity.color = textPaintView.getSwatch().color;
                                mediaEntity.fontSize = textPaintView.getTextSize();
                                mediaEntity.textTypeface = textPaintView.getTypeface();
                                mediaEntity.textAlign = textPaintView.getAlign();
                            } else {
                                i3 = childCount;
                                i4 = i8;
                                view = childAt;
                                if (entityView instanceof StickerView) {
                                    mediaEntity.type = (byte) 0;
                                    StickerView stickerView = (StickerView) entityView;
                                    Size baseSize = stickerView.getBaseSize();
                                    mediaEntity.width = baseSize.width;
                                    mediaEntity.height = baseSize.height;
                                    mediaEntity.document = stickerView.getSticker();
                                    mediaEntity.parentObject = stickerView.getParentObject();
                                    TLRPC$Document sticker = stickerView.getSticker();
                                    mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                    if (MessageObject.isAnimatedStickerDocument(sticker, true) || isVideoStickerDocument(sticker)) {
                                        boolean isAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                        mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                        if (isAnimatedStickerDocument2 || isVideoStickerDocument(sticker)) {
                                            j2 = stickerView.getDuration();
                                        }
                                        if (j2 != 0) {
                                            BigInteger valueOf2 = BigInteger.valueOf(j2);
                                            paintView.lcm = paintView.lcm.multiply(valueOf2).divide(paintView.lcm.gcd(valueOf2));
                                        }
                                    }
                                    if (MessageObject.isTextColorEmoji(sticker)) {
                                        mediaEntity.color = -1;
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                    }
                                    if (stickerView.isMirrored()) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                } else if (entityView instanceof PhotoView) {
                                    PhotoView photoView = (PhotoView) entityView;
                                    mediaEntity.type = (byte) 2;
                                    Size baseSize2 = photoView.getBaseSize();
                                    mediaEntity.width = baseSize2.width;
                                    mediaEntity.height = baseSize2.height;
                                    mediaEntity.text = photoView.getPath(paintView.currentAccount);
                                    if (photoView.isMirrored()) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                    if (photoView.hasSegmentedImage() && photoView.isSegmented() && (saveSegmentedImage = photoView.saveSegmentedImage(paintView.currentAccount)) != null) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 16);
                                        mediaEntity.segmentedPath = saveSegmentedImage.getPath();
                                    }
                                } else if (entityView instanceof LocationView) {
                                    LocationView locationView = (LocationView) entityView;
                                    mediaEntity.type = (byte) 3;
                                    mediaEntity.subType = (byte) locationView.getType();
                                    mediaEntity.width = locationView.marker.getWidth();
                                    mediaEntity.height = locationView.marker.getHeight();
                                    mediaEntity.text = locationView.marker.getText();
                                    mediaEntity.color = locationView.getColor();
                                    mediaEntity.density = locationView.marker.density;
                                    mediaEntity.media = locationView.location;
                                    TL_stories$MediaArea tL_stories$MediaArea2 = locationView.mediaArea;
                                    mediaEntity.mediaArea = tL_stories$MediaArea2;
                                    tL_stories$MediaArea2.coordinates = new TL_stories$TL_mediaAreaCoordinates();
                                    TLRPC$Document countryCodeEmojiDocument = locationView.marker.getCountryCodeEmojiDocument();
                                    if (countryCodeEmojiDocument != null) {
                                        VideoEditedInfo.EmojiEntity emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                        emojiEntity2.document_id = countryCodeEmojiDocument.id;
                                        emojiEntity2.document = countryCodeEmojiDocument;
                                        emojiEntity2.documentAbsolutePath = FileLoader.getInstance(paintView.currentAccount).getPathToAttach(countryCodeEmojiDocument, true).getAbsolutePath();
                                        boolean isAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                        if (isAnimatedStickerDocument3 || isVideoStickerDocument(emojiEntity2.document)) {
                                            emojiEntity2.subType = (byte) (emojiEntity2.subType | (isAnimatedStickerDocument3 ? (byte) 1 : (byte) 4));
                                        }
                                        mediaEntity.entities.add(emojiEntity2);
                                    }
                                } else {
                                    if (entityView instanceof LinkView) {
                                        LinkView linkView = (LinkView) entityView;
                                        mediaEntity.type = (byte) 7;
                                        mediaEntity.subType = (byte) linkView.getType();
                                        mediaEntity.width = linkView.marker.getWidth();
                                        mediaEntity.height = linkView.marker.getHeight();
                                        mediaEntity.color = linkView.getColor();
                                        LinkPreview linkPreview = linkView.marker;
                                        mediaEntity.density = linkPreview.density;
                                        mediaEntity.linkSettings = linkView.link;
                                        if (linkPreview.hasPhoto) {
                                            linkPreview.pushPhotoToCache();
                                            LinkPreview.WebPagePreview webPagePreview = mediaEntity.linkSettings;
                                            webPagePreview.flags |= 4;
                                            webPagePreview.photoSize = linkView.marker.getPhotoSide();
                                        }
                                        TL_stories$TL_mediaAreaUrl tL_stories$TL_mediaAreaUrl = new TL_stories$TL_mediaAreaUrl();
                                        mediaEntity.mediaArea = tL_stories$TL_mediaAreaUrl;
                                        LinkPreview.WebPagePreview webPagePreview2 = linkView.link;
                                        if (webPagePreview2 != null) {
                                            TL_stories$TL_mediaAreaUrl tL_stories$TL_mediaAreaUrl2 = tL_stories$TL_mediaAreaUrl;
                                            TLRPC$WebPage tLRPC$WebPage = webPagePreview2.webpage;
                                            tL_stories$TL_mediaAreaUrl2.url = (tLRPC$WebPage == null || TextUtils.isEmpty(tLRPC$WebPage.url)) ? linkView.link.url : linkView.link.webpage.url;
                                            mediaEntity.mediaArea.coordinates = new TL_stories$TL_mediaAreaCoordinates();
                                        }
                                    } else {
                                        if (entityView instanceof ReactionWidgetEntityView) {
                                            ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) entityView;
                                            mediaEntity.type = (byte) 4;
                                            TL_stories$TL_mediaAreaSuggestedReaction tL_stories$TL_mediaAreaSuggestedReaction = new TL_stories$TL_mediaAreaSuggestedReaction();
                                            mediaEntity.mediaArea = tL_stories$TL_mediaAreaSuggestedReaction;
                                            tL_stories$TL_mediaAreaSuggestedReaction.reaction = ReactionsUtils.toTLReaction(reactionWidgetEntityView.getCurrentReaction());
                                            mediaEntity.mediaArea.dark = reactionWidgetEntityView.isDark();
                                            mediaEntity.mediaArea.flipped = reactionWidgetEntityView.isMirrored();
                                            mediaEntity.mediaArea.coordinates = new TL_stories$TL_mediaAreaCoordinates();
                                        } else if (entityView instanceof RoundView) {
                                            RoundView roundView = (RoundView) entityView;
                                            Size baseSize3 = roundView.getBaseSize();
                                            mediaEntity.width = baseSize3.width;
                                            mediaEntity.height = baseSize3.height;
                                            mediaEntity.type = (byte) 5;
                                            if (storyEntry != null) {
                                                mediaEntity.text = storyEntry.round.getAbsolutePath();
                                                mediaEntity.roundOffset = storyEntry.roundOffset;
                                                mediaEntity.roundDuration = storyEntry.roundDuration;
                                                mediaEntity.roundLeft = storyEntry.roundLeft * ((float) j);
                                                mediaEntity.roundRight = storyEntry.roundRight * ((float) j);
                                            }
                                            mediaEntity.subType = (byte) 4;
                                            if (roundView.isMirrored()) {
                                                mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                            }
                                        } else if (entityView instanceof MessageEntityView) {
                                            MessageEntityView messageEntityView = (MessageEntityView) entityView;
                                            mediaEntity.type = (byte) 6;
                                            int width = messageEntityView.getWidth();
                                            mediaEntity.viewWidth = width;
                                            mediaEntity.width = width;
                                            int height = messageEntityView.getHeight();
                                            mediaEntity.viewHeight = height;
                                            mediaEntity.height = height;
                                            TL_stories$TL_inputMediaAreaChannelPost tL_stories$TL_inputMediaAreaChannelPost = new TL_stories$TL_inputMediaAreaChannelPost();
                                            mediaEntity.mediaArea = tL_stories$TL_inputMediaAreaChannelPost;
                                            tL_stories$TL_inputMediaAreaChannelPost.coordinates = new TL_stories$TL_mediaAreaCoordinates();
                                            if (storyEntry != null && (arrayList2 = storyEntry.messageObjects) != null) {
                                                MessageObject messageObject = arrayList2.get(0);
                                                ((TL_stories$TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(paintView.currentAccount).getInputChannel(-StoryEntry.getRepostDialogId(messageObject));
                                                ((TL_stories$TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).msg_id = StoryEntry.getRepostMessageId(messageObject);
                                            }
                                            if (z3) {
                                                if (storyEntry != null && storyEntry.isVideo) {
                                                    storyEntry.matrix.reset();
                                                    if (messageEntityView.listView.getChildCount() == 1) {
                                                        view3 = messageEntityView.listView.getChildAt(0);
                                                        if (view3 instanceof ChatMessageCell) {
                                                            imageReceiver = ((ChatMessageCell) view3).getPhotoImage();
                                                            if (imageReceiver != null) {
                                                                float max = Math.max(imageReceiver.getImageWidth() / Math.max(1, storyEntry.width), imageReceiver.getImageHeight() / Math.max(1, storyEntry.height));
                                                                storyEntry.matrix.postScale(max, max);
                                                                storyEntry.matrix.postTranslate(imageReceiver.getCenterX() - ((storyEntry.width * max) / 2.0f), imageReceiver.getCenterY() - ((storyEntry.height * max) / 2.0f));
                                                                storyEntry.matrix.postTranslate(messageEntityView.container.getX(), messageEntityView.container.getY());
                                                                storyEntry.matrix.postTranslate(messageEntityView.listView.getX(), messageEntityView.listView.getY());
                                                                storyEntry.matrix.postTranslate(view3.getX(), view3.getY());
                                                                storyEntry.matrix.postScale(messageEntityView.getScaleX(), messageEntityView.getScaleY(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                storyEntry.matrix.postRotate(messageEntityView.getRotation(), messageEntityView.getPivotX(), messageEntityView.getPivotY());
                                                                storyEntry.matrix.postTranslate(messageEntityView.getX(), messageEntityView.getY());
                                                                storyEntry.matrix.postScale(1.0f / paintView.entitiesView.getWidth(), 1.0f / paintView.entitiesView.getHeight());
                                                                storyEntry.matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                            }
                                                        }
                                                    } else {
                                                        view3 = null;
                                                    }
                                                    imageReceiver = null;
                                                    if (imageReceiver != null) {
                                                    }
                                                }
                                            }
                                        }
                                        z5 = true;
                                    }
                                    arrayList3.add(mediaEntity);
                                    scaleX = view.getScaleX();
                                    float scaleY = view.getScaleY();
                                    float x = view.getX();
                                    float y = view.getY();
                                    mediaEntity.viewWidth = view.getWidth();
                                    mediaEntity.viewHeight = view.getHeight();
                                    mediaEntity.width = (view.getWidth() * scaleX) / paintView.entitiesView.getMeasuredWidth();
                                    mediaEntity.height = (view.getHeight() * scaleY) / paintView.entitiesView.getMeasuredHeight();
                                    mediaEntity.x = (((view.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / paintView.entitiesView.getMeasuredWidth();
                                    mediaEntity.y = (((view.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / paintView.entitiesView.getMeasuredHeight();
                                    double d2 = -view.getRotation();
                                    Double.isNaN(d2);
                                    mediaEntity.rotation = (float) (d2 * 0.017453292519943295d);
                                    mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x) / paintView.entitiesView.getMeasuredWidth();
                                    mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y) / paintView.entitiesView.getMeasuredHeight();
                                    mediaEntity.textViewWidth = mediaEntity.viewWidth / paintView.entitiesView.getMeasuredWidth();
                                    mediaEntity.textViewHeight = mediaEntity.viewHeight / paintView.entitiesView.getMeasuredHeight();
                                    mediaEntity.scale = scaleX;
                                    if (!(entityView instanceof MessageEntityView)) {
                                        MessageEntityView messageEntityView2 = (MessageEntityView) entityView;
                                        RectF rectF = AndroidUtilities.rectTmp;
                                        d = messageEntityView2.getBubbleBounds(rectF);
                                        rectF.offset(messageEntityView2.container.getX(), messageEntityView2.container.getY());
                                        rectF.offset(messageEntityView2.listView.getX(), messageEntityView2.listView.getY());
                                        mediaEntity.mediaArea.coordinates.x = ((((x + (view.getWidth() / 2.0f)) - ((view.getWidth() / 2.0f) * scaleX)) + (rectF.centerX() * scaleX)) / paintView.entitiesView.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.y = ((((y + (view.getHeight() / 2.0f)) - ((view.getHeight() / 2.0f) * scaleY)) + (rectF.centerY() * scaleY)) / paintView.entitiesView.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / paintView.entitiesView.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / paintView.entitiesView.getMeasuredHeight()) * 100.0f;
                                        TL_stories$MediaAreaCoordinates tL_stories$MediaAreaCoordinates2 = mediaEntity.mediaArea.coordinates;
                                        double d3 = -mediaEntity.rotation;
                                        Double.isNaN(d3);
                                        tL_stories$MediaAreaCoordinates2.rotation = (d3 / 3.141592653589793d) * 180.0d;
                                    } else {
                                        if (entityView instanceof StickerView) {
                                            float imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                            float f = mediaEntity.x + (mediaEntity.width / 2.0f);
                                            float f2 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                            float measuredWidth = paintView.entitiesView.getMeasuredWidth() / paintView.entitiesView.getMeasuredHeight();
                                            if (imageAspectRatio > 1.0f) {
                                                float f3 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                mediaEntity.height = f3;
                                                mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                mediaEntity.y = f2 - (f3 / 2.0f);
                                            } else if (imageAspectRatio < 1.0f) {
                                                float f4 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                mediaEntity.width = f4;
                                                mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                mediaEntity.x = f - (f4 / 2.0f);
                                            }
                                        } else {
                                            boolean z7 = entityView instanceof LocationView;
                                            if (z7 || (entityView instanceof LinkView) || (entityView instanceof ReactionWidgetEntityView)) {
                                                TL_stories$MediaAreaCoordinates tL_stories$MediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                float f5 = mediaEntity.x;
                                                float f6 = mediaEntity.width;
                                                tL_stories$MediaAreaCoordinates3.x = (f5 + (f6 / 2.0f)) * 100.0f;
                                                tL_stories$MediaAreaCoordinates3.y = (mediaEntity.y + (mediaEntity.height / 2.0f)) * 100.0f;
                                                if (z7) {
                                                    LocationView locationView2 = (LocationView) entityView;
                                                    tL_stories$MediaAreaCoordinates3.w = (f6 - (((locationView2.marker.padx * 2) * scaleX) / paintView.entitiesView.getMeasuredWidth())) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = (mediaEntity.height - (((locationView2.marker.pady * 2) * scaleY) / paintView.entitiesView.getMeasuredHeight())) * 100.0f;
                                                } else if (entityView instanceof LinkView) {
                                                    LinkView linkView2 = (LinkView) entityView;
                                                    tL_stories$MediaAreaCoordinates3.w = (f6 - (((linkView2.marker.padx * 2) * scaleX) / paintView.entitiesView.getMeasuredWidth())) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = (mediaEntity.height - (((linkView2.marker.pady * 2) * scaleY) / paintView.entitiesView.getMeasuredHeight())) * 100.0f;
                                                } else if (entityView instanceof ReactionWidgetEntityView) {
                                                    ReactionWidgetEntityView reactionWidgetEntityView2 = (ReactionWidgetEntityView) entityView;
                                                    float padding = ((reactionWidgetEntityView2.getPadding() * 2) * scaleX) / paintView.entitiesView.getMeasuredWidth();
                                                    float padding2 = ((reactionWidgetEntityView2.getPadding() * 2) * scaleX) / paintView.entitiesView.getMeasuredHeight();
                                                    TL_stories$MediaAreaCoordinates tL_stories$MediaAreaCoordinates4 = mediaEntity.mediaArea.coordinates;
                                                    tL_stories$MediaAreaCoordinates4.w = (mediaEntity.width - padding) * 100.0f;
                                                    tL_stories$MediaAreaCoordinates4.h = (mediaEntity.height - padding2) * 100.0f;
                                                }
                                                TL_stories$MediaAreaCoordinates tL_stories$MediaAreaCoordinates5 = mediaEntity.mediaArea.coordinates;
                                                double d4 = -mediaEntity.rotation;
                                                Double.isNaN(d4);
                                                tL_stories$MediaAreaCoordinates5.rotation = (d4 / 3.141592653589793d) * 180.0d;
                                                if (z7) {
                                                    radius = ((LocationView) entityView).marker.getRadius();
                                                } else if (entityView instanceof LinkView) {
                                                    radius = ((LinkView) entityView).marker.getRadius();
                                                }
                                                d = radius;
                                            }
                                        }
                                        d = -1.0d;
                                    }
                                    tL_stories$MediaArea = mediaEntity.mediaArea;
                                    if (tL_stories$MediaArea != null && (tL_stories$MediaAreaCoordinates = tL_stories$MediaArea.coordinates) != null && d > 0.0d) {
                                        tL_stories$MediaAreaCoordinates.flags |= 1;
                                        double d5 = scaleX;
                                        Double.isNaN(d5);
                                        Double.isNaN(r8);
                                        tL_stories$MediaAreaCoordinates.radius = ((d5 * d) / r8) * 100.0d;
                                    }
                                }
                            }
                            z5 = false;
                            arrayList3.add(mediaEntity);
                            scaleX = view.getScaleX();
                            float scaleY2 = view.getScaleY();
                            float x2 = view.getX();
                            float y2 = view.getY();
                            mediaEntity.viewWidth = view.getWidth();
                            mediaEntity.viewHeight = view.getHeight();
                            mediaEntity.width = (view.getWidth() * scaleX) / paintView.entitiesView.getMeasuredWidth();
                            mediaEntity.height = (view.getHeight() * scaleY2) / paintView.entitiesView.getMeasuredHeight();
                            mediaEntity.x = (((view.getWidth() * (1.0f - scaleX)) / 2.0f) + x2) / paintView.entitiesView.getMeasuredWidth();
                            mediaEntity.y = (((view.getHeight() * (1.0f - scaleY2)) / 2.0f) + y2) / paintView.entitiesView.getMeasuredHeight();
                            double d22 = -view.getRotation();
                            Double.isNaN(d22);
                            mediaEntity.rotation = (float) (d22 * 0.017453292519943295d);
                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x2) / paintView.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y2) / paintView.entitiesView.getMeasuredHeight();
                            mediaEntity.textViewWidth = mediaEntity.viewWidth / paintView.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewHeight = mediaEntity.viewHeight / paintView.entitiesView.getMeasuredHeight();
                            mediaEntity.scale = scaleX;
                            if (!(entityView instanceof MessageEntityView)) {
                            }
                            tL_stories$MediaArea = mediaEntity.mediaArea;
                            if (tL_stories$MediaArea != null) {
                                tL_stories$MediaAreaCoordinates.flags |= 1;
                                double d52 = scaleX;
                                Double.isNaN(d52);
                                Double.isNaN(r8);
                                tL_stories$MediaAreaCoordinates.radius = ((d52 * d) / r8) * 100.0d;
                            }
                        } else {
                            i3 = childCount;
                            i4 = i8;
                            view = childAt;
                            z5 = false;
                        }
                        if ((z2 || (z3 && mediaEntity.type == 6)) && bitmap != null) {
                            Canvas canvas = new Canvas(bitmap);
                            float width2 = bitmap.getWidth() / paintView.entitiesView.getMeasuredWidth();
                            int i11 = 0;
                            while (i11 < 2) {
                                Canvas canvas2 = i11 == 0 ? canvas : null;
                                if (canvas2 == null || (i11 == 0 && z5)) {
                                    view2 = view;
                                } else {
                                    canvas2.save();
                                    canvas2.scale(width2, width2);
                                    canvas2.translate(mediaEntity.x * paintView.entitiesView.getMeasuredWidth(), mediaEntity.y * paintView.entitiesView.getMeasuredHeight());
                                    canvas2.scale(view.getScaleX(), view.getScaleY());
                                    canvas2.rotate(view.getRotation(), ((mediaEntity.width / 2.0f) / view.getScaleX()) * paintView.entitiesView.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / view.getScaleY()) * paintView.entitiesView.getMeasuredHeight());
                                    view2 = view;
                                    if ((view2 instanceof TextPaintView) && view2.getHeight() > 0 && view2.getWidth() > 0) {
                                        int width3 = (int) (view2.getWidth() * view2.getScaleX());
                                        int height2 = (int) (view2.getHeight() * view2.getScaleY());
                                        Bitmap createBitmap2 = Bitmaps.createBitmap(width3, height2, Bitmap.Config.ARGB_8888);
                                        Canvas canvas3 = new Canvas(createBitmap2);
                                        canvas3.scale(view2.getScaleX(), view2.getScaleY());
                                        view2.draw(canvas3);
                                        canvas2.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                        canvas2.drawBitmap(createBitmap2, (Rect) null, new Rect(0, 0, width3, height2), new Paint(3));
                                        try {
                                            canvas3.setBitmap(null);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        createBitmap2.recycle();
                                    } else if (view2 instanceof MessageEntityView) {
                                        MessageEntityView messageEntityView3 = (MessageEntityView) view2;
                                        messageEntityView3.prepareToDraw(true);
                                        view2.draw(canvas2);
                                        messageEntityView3.prepareToDraw(false);
                                    } else {
                                        view2.draw(canvas2);
                                    }
                                    canvas2.restore();
                                }
                                i11++;
                                paintView = this;
                                view = view2;
                            }
                        }
                    } else {
                        i3 = childCount;
                        i4 = i8;
                    }
                    i8 = i4 + 1;
                    paintView = this;
                    arrayList3 = arrayList;
                    childCount = i3;
                    i7 = 0;
                    b = 1;
                }
            }
            return bitmap;
        }
        bitmap = createBitmap;
        paintView.lcm = BigInteger.ONE;
        if (paintView.entitiesView.entitiesCount() > 0) {
        }
        return bitmap;
    }

    public boolean hasBlur() {
        return this.renderView.getPainting().hasBlur;
    }

    public Bitmap getBlurBitmap() {
        return this.renderView.getResultBitmap(true, false);
    }

    public void onCleanupEntities() {
        this.entitiesView.removeAllViews();
    }

    public long getLcm() {
        return this.lcm.longValue();
    }

    public View getDoneView() {
        return this.doneButton;
    }

    public View getCancelView() {
        return this.cancelButton;
    }

    @Override // org.telegram.ui.Stories.recorder.StoryRecorder.Touchable
    public boolean onTouch(MotionEvent motionEvent) {
        if (this.currentEntityView != null) {
            lambda$createRound$60(null);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x, y);
        this.renderView.onTouch(obtain);
        obtain.recycle();
        return true;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.renderView, this.renderInputView, this.entitiesView, this.selectionContainerView);
    }

    public void clearSelection() {
        lambda$createRound$60(null);
    }

    public void openPaint() {
        switchTab(0);
        clearSelection();
    }

    public void openText() {
        switchTab(2);
        this.forceChanges = true;
        createText(true);
    }

    public void openStickers() {
        switchTab(1);
        openStickersView();
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public RenderView getRenderView() {
        return this.renderView;
    }

    public View getTextDimView() {
        return this.textDim;
    }

    public View getRenderInputView() {
        return this.renderInputView;
    }

    public View getEntitiesView() {
        return this.entitiesView;
    }

    public View getSelectionEntitiesView() {
        return this.selectionContainerView;
    }

    public List<TLRPC$InputDocument> getMasks() {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int childCount = this.entitiesView.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof StickerView) {
                TLRPC$Document sticker = ((StickerView) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
                tLRPC$TL_inputDocument.id = sticker.id;
                tLRPC$TL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tLRPC$TL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tLRPC$TL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tLRPC$TL_inputDocument);
            } else if (childAt instanceof TextPaintView) {
                CharSequence text = ((TextPaintView) childAt).getText();
                if ((text instanceof Spanned) && (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) text).getSpans(0, text.length(), AnimatedEmojiSpan.class)) != null) {
                    for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                        if (animatedEmojiSpan != null) {
                            TLRPC$Document tLRPC$Document = animatedEmojiSpan.document;
                            if (tLRPC$Document == null) {
                                tLRPC$Document = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                            }
                            if (tLRPC$Document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC$TL_inputDocument tLRPC$TL_inputDocument2 = new TLRPC$TL_inputDocument();
                                tLRPC$TL_inputDocument2.id = tLRPC$Document.id;
                                tLRPC$TL_inputDocument2.access_hash = tLRPC$Document.access_hash;
                                byte[] bArr2 = tLRPC$Document.file_reference;
                                tLRPC$TL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tLRPC$TL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tLRPC$TL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintToolsView.Delegate
    public void onBrushSelected(Brush brush) {
        if ((brush instanceof Brush.Blurer) || (brush instanceof Brush.Eraser)) {
            this.weightChooserView.setMinMax(0.4f, 1.75f);
        } else {
            this.weightChooserView.setMinMax(0.05f, 1.0f);
        }
        this.weightChooserView.setDrawCenter(!(brush instanceof Brush.Shape));
        if (this.renderView.getCurrentBrush() instanceof Brush.Shape) {
            this.ignoreToolChangeAnimationOnce = true;
        }
        this.renderView.setBrush(brush);
        Swatch swatch = this.colorSwatch;
        int i = swatch.color;
        swatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(this.colorSwatch, true, Integer.valueOf(i));
        this.renderInputView.invalidate();
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintTextOptionsView.Delegate
    public void onTypefaceButtonClicked() {
        showTypefaceMenu(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTypefaceMenu(final boolean z) {
        if (this.isTypefaceMenuShown != z) {
            this.isTypefaceMenuShown = z;
            SpringAnimation springAnimation = this.typefaceMenuTransformAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(z ? 0.0f : 1000.0f));
            this.typefaceMenuTransformAnimation = springAnimation2;
            springAnimation2.setSpring(new SpringForce().setFinalPosition(z ? 1000.0f : 0.0f).setStiffness(1250.0f).setDampingRatio(1.0f));
            if (z) {
                this.typefaceListView.setAlpha(0.0f);
                this.typefaceListView.setVisibility(0);
            }
            this.typefaceMenuTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda37
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    PaintView.this.lambda$showTypefaceMenu$35(dynamicAnimation, f, f2);
                }
            });
            this.typefaceMenuTransformAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda35
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    PaintView.this.lambda$showTypefaceMenu$36(z, dynamicAnimation, z2, f, f2);
                }
            });
            this.typefaceMenuTransformAnimation.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTypefaceMenu$35(DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 1000.0f;
        this.typefaceMenuTransformProgress = f3;
        this.typefaceListView.setAlpha(f3);
        this.typefaceListView.invalidate();
        this.overlayLayout.invalidate();
        this.textOptionsView.getTypefaceCell().setAlpha(1.0f - this.typefaceMenuTransformProgress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTypefaceMenu$36(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == this.typefaceMenuTransformAnimation) {
            this.typefaceMenuTransformAnimation = null;
            if (!z) {
                this.typefaceListView.setVisibility(8);
            }
            this.typefaceListView.setMaskProvider(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public void showColorList(final boolean z) {
        if (this.isColorListShown != z) {
            this.isColorListShown = z;
            SpringAnimation springAnimation = this.toolsTransformAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(z ? 0.0f : 1000.0f));
            this.toolsTransformAnimation = springAnimation2;
            springAnimation2.setSpring(new SpringForce().setFinalPosition(z ? 1000.0f : 0.0f).setStiffness(1250.0f).setDampingRatio(1.0f));
            boolean z2 = true;
            final boolean[] zArr = new boolean[1];
            if (!this.keyboardNotifier.keyboardVisible() && this.emojiPadding <= 0) {
                z2 = false;
            }
            zArr[0] = z2;
            final float translationY = this.bottomLayout.getTranslationY();
            final float alpha = this.doneButton.getAlpha();
            final ViewGroup barView = getBarView();
            this.toolsTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda38
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    PaintView.this.lambda$showColorList$37(barView, z, zArr, alpha, translationY, dynamicAnimation, f, f2);
                }
            });
            this.toolsTransformAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda36
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f, float f2) {
                    PaintView.this.lambda$showColorList$38(z, dynamicAnimation, z3, f, f2);
                }
            });
            this.toolsTransformAnimation.start();
            if (z) {
                this.colorsListView.setVisibility(0);
                this.colorsListView.setSelectedColorIndex(PersistColorPalette.getInstance(this.currentAccount).getCurrentColorPosition());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showColorList$37(View view, boolean z, boolean[] zArr, float f, float f2, DynamicAnimation dynamicAnimation, float f3, float f4) {
        float f5 = f3 / 1000.0f;
        this.toolsTransformProgress = f5;
        float f6 = ((1.0f - f5) * 0.4f) + 0.6f;
        view.setScaleX(f6);
        view.setScaleY(f6);
        view.setTranslationY((AndroidUtilities.dp(16.0f) * Math.min(this.toolsTransformProgress, 0.25f)) / 0.25f);
        view.setAlpha(1.0f - (Math.min(this.toolsTransformProgress, 0.25f) / 0.25f));
        this.colorsListView.setProgress(this.toolsTransformProgress, z);
        this.doneButton.setProgress(this.toolsTransformProgress);
        this.cancelButton.setProgress(this.toolsTransformProgress);
        this.tabsLayout.setTranslationY(AndroidUtilities.dp(32.0f) * this.toolsTransformProgress);
        AnimatorSet animatorSet = this.keyboardAnimator;
        if (animatorSet != null && animatorSet.isRunning()) {
            zArr[0] = false;
        }
        if (zArr[0]) {
            float f7 = this.toolsTransformProgress;
            if (!z) {
                f7 = 1.0f - f7;
            }
            this.doneButton.setAlpha(AndroidUtilities.lerp(f, z ? 1.0f : 0.0f, f7));
            this.cancelButton.setAlpha(AndroidUtilities.lerp(f, z ? 1.0f : 0.0f, f7));
            this.bottomLayout.setTranslationY(f2 - ((AndroidUtilities.dp(39.0f) * f7) * (z ? 1 : -1)));
        }
        this.bottomLayout.invalidate();
        if (view == this.textOptionsView) {
            this.overlayLayout.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showColorList$38(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == this.toolsTransformAnimation) {
            this.toolsTransformAnimation = null;
            if (z) {
                return;
            }
            this.colorsListView.setVisibility(8);
            PersistColorPalette.getInstance(this.currentAccount).saveColors();
            this.colorsListView.getAdapter().notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentSwatch(Swatch swatch, boolean z) {
        setCurrentSwatch(swatch, z, null);
    }

    private void setCurrentSwatch(Swatch swatch, boolean z, final Integer num) {
        Swatch swatch2 = this.colorSwatch;
        if (swatch2 != swatch) {
            swatch2.color = swatch.color;
            swatch2.colorLocation = swatch.colorLocation;
            swatch2.brushWeight = swatch.brushWeight;
            PersistColorPalette.getInstance(this.currentAccount).selectColor(swatch.color);
            PersistColorPalette.getInstance(this.currentAccount).setCurrentWeight(swatch.brushWeight);
        }
        this.renderView.setColor(swatch.color);
        this.renderView.setBrushSize(swatch.brushWeight);
        if (z) {
            final int i = this.colorSwatch.color;
            if (num != null && num.intValue() != i) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda5
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PaintView.this.lambda$setCurrentSwatch$39(num, i, valueAnimator);
                    }
                });
                duration.start();
            } else {
                FrameLayout frameLayout = this.bottomLayout;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                }
            }
        }
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setSwatch(new Swatch(swatch.color, swatch.colorLocation, swatch.brushWeight));
        } else if (entityView instanceof LocationView) {
            ((LocationView) entityView).setColor(swatch.color);
        } else if (entityView instanceof LinkView) {
            ((LinkView) entityView).setColor(swatch.color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCurrentSwatch$39(Integer num, int i, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.colorSwatch.color = ColorUtils.blendARGB(num.intValue(), i, floatValue);
        FrameLayout frameLayout = this.bottomLayout;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    public boolean onBackPressed() {
        if (this.reactionLayoutShowing) {
            if (this.reactionLayout.getReactionsWindow() != null && this.reactionLayout.getReactionsWindow().isShowing()) {
                this.reactionLayout.dismissWindow();
            } else {
                showReactionsLayout(false);
            }
            return true;
        } else if (this.isColorListShown) {
            showColorList(false);
            return true;
        } else if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return true;
        } else if (this.editingText) {
            if (this.enteredThroughText) {
                this.enteredThroughText = false;
                this.keyboardNotifier.ignore(true);
                return false;
            }
            lambda$createRound$60(null);
            return true;
        } else {
            return false;
        }
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintToolsView.Delegate, org.telegram.ui.Components.Paint.Views.PaintTextOptionsView.Delegate
    public void onColorPickerSelected() {
        showColorList(true);
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintTextOptionsView.Delegate
    public void onTextOutlineSelected(View view) {
        setTextType((this.selectedTextType + 1) % 4);
    }

    private PopupButton buttonForPopup(String str, int i, boolean z, final Runnable runnable) {
        PopupButton popupButton = new PopupButton(getContext());
        popupButton.setIcon(i);
        popupButton.setText(str);
        popupButton.setSelected(z);
        if (runnable != null) {
            popupButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return popupButton;
    }

    public void onParentPreDraw() {
        ReactionWidgetEntityView reactionWidgetEntityView;
        if (this.invalidateReactionPosition) {
            this.invalidateReactionPosition = false;
            if (this.reactionLayout == null || (reactionWidgetEntityView = this.reactionForEntity) == null) {
                return;
            }
            this.points[0] = reactionWidgetEntityView.getMeasuredWidth() / 2.0f;
            this.points[1] = this.reactionForEntity.getMeasuredHeight() / 2.0f;
            this.reactionForEntity.getMatrix().mapPoints(this.points);
            float measuredHeight = this.points[1] - ((this.reactionForEntity.getMeasuredHeight() / 2.0f) * this.reactionForEntity.getScaleX());
            float measuredHeight2 = this.points[1] + ((this.reactionForEntity.getMeasuredHeight() / 2.0f) * this.reactionForEntity.getScaleX());
            if (measuredHeight < AndroidUtilities.dp(120.0f) && measuredHeight2 > this.parent.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                this.reactionLayout.setTop(false);
                this.reactionLayout.setTranslationY((AndroidUtilities.dp(120.0f) - this.reactionLayout.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
            } else if (measuredHeight < AndroidUtilities.dp(120.0f)) {
                this.reactionLayout.setTop(true);
                this.reactionLayout.setTranslationY(this.points[1] + ((this.reactionForEntity.getMeasuredHeight() / 2.0f) * this.reactionForEntity.getScaleX()));
            } else {
                this.reactionLayout.setTop(false);
                ReactionsContainerLayout reactionsContainerLayout = this.reactionLayout;
                reactionsContainerLayout.setTranslationY((measuredHeight - reactionsContainerLayout.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
            }
            if (this.points[0] < getMeasuredWidth() / 2.0f) {
                this.reactionLayout.setMirrorX(true);
                float x = (this.reactionLayout.getX() + (this.reactionLayout.getMeasuredWidth() / 2.0f)) - (this.points[0] - (this.reactionForEntity.getMeasuredHeight() / 2.0f));
                if (x > 0.0f) {
                    ReactionsContainerLayout reactionsContainerLayout2 = this.reactionLayout;
                    reactionsContainerLayout2.setBubbleOffset(((reactionsContainerLayout2.getMeasuredWidth() / 2.0f) - x) / 2.0f);
                }
            } else {
                float x2 = (this.reactionLayout.getX() + (this.reactionLayout.getMeasuredWidth() / 2.0f)) - (this.points[0] + (this.reactionForEntity.getMeasuredHeight() / 2.0f));
                if (x2 < 0.0f) {
                    ReactionsContainerLayout reactionsContainerLayout3 = this.reactionLayout;
                    reactionsContainerLayout3.setBubbleOffset((-((reactionsContainerLayout3.getMeasuredWidth() / 2.0f) + x2)) / 2.0f);
                }
                this.reactionLayout.setMirrorX(false);
            }
            this.reactionLayout.setTranslationX((this.parent.getMeasuredWidth() - this.reactionLayout.getMeasuredWidth()) / 2.0f);
        }
    }

    public void setBlurManager(BlurringShader.BlurManager blurManager) {
        this.blurManager = blurManager;
    }

    /* loaded from: classes4.dex */
    public class PopupButton extends LinearLayout {
        ImageView checkView;
        ImageView image2View;
        ValueAnimator imageSwitchAnimator;
        boolean imageSwitchFill;
        float imageSwitchT;
        ImageView imageView;
        FrameLayout imagesView;
        public TextView textView;

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        public PopupButton(Context context) {
            super(context);
            setOrientation(0);
            setBackground(Theme.getSelectorDrawable(Theme.getColor(Theme.key_listSelector, PaintView.this.resourcesProvider), false));
            FrameLayout frameLayout = new FrameLayout(context, PaintView.this) { // from class: org.telegram.ui.Stories.recorder.PaintView.PopupButton.1
                Path path = new Path();

                @Override // android.view.ViewGroup
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    boolean z;
                    PopupButton popupButton = PopupButton.this;
                    if (popupButton.imageSwitchAnimator != null && (((z = popupButton.imageSwitchFill) && view == popupButton.image2View) || (!z && view == popupButton.imageView))) {
                        float f = z ? popupButton.imageSwitchT : 1.0f - popupButton.imageSwitchT;
                        canvas.save();
                        this.path.rewind();
                        this.path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                        canvas.clipPath(this.path);
                        boolean drawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return drawChild;
                    }
                    return super.drawChild(canvas, view, j);
                }
            };
            this.imagesView = frameLayout;
            addView(frameLayout, LayoutHelper.createLinear(-2, -2, 19, 16, 0, 16, 0));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView2 = this.imageView;
            int i = Theme.key_actionBarDefaultSubmenuItem;
            imageView2.setColorFilter(PaintView.this.getThemedColor(i));
            this.imagesView.addView(this.imageView, LayoutHelper.createFrame(-2, -2, 17));
            ImageView imageView3 = new ImageView(context);
            this.image2View = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            this.image2View.setColorFilter(PaintView.this.getThemedColor(i));
            this.image2View.setVisibility(8);
            this.imagesView.addView(this.image2View, LayoutHelper.createFrame(-2, -2, 17));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(PaintView.this.getThemedColor(i));
            this.textView.setTextSize(1, 16.0f);
            addView(this.textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 16, 0));
            ImageView imageView4 = new ImageView(context);
            this.checkView = imageView4;
            imageView4.setImageResource(R.drawable.msg_text_check);
            this.checkView.setScaleType(ImageView.ScaleType.CENTER);
            this.checkView.setColorFilter(new PorterDuffColorFilter(PaintView.this.getThemedColor(Theme.key_radioBackgroundChecked), PorterDuff.Mode.MULTIPLY));
            this.checkView.setVisibility(8);
            addView(this.checkView, LayoutHelper.createLinear(50, -1));
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            this.checkView.setVisibility(z ? 0 : 8);
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        public void setIcon(int i) {
            setIcon(i, true, false);
        }

        public void setIcon(int i, final boolean z, boolean z2) {
            if (z2) {
                ValueAnimator valueAnimator = this.imageSwitchAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.imageSwitchAnimator = null;
                    setIcon(i, false, false);
                    return;
                }
                this.imageSwitchFill = z;
                this.image2View.setImageResource(i);
                this.image2View.setVisibility(0);
                this.image2View.setAlpha(1.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.imageSwitchAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$PopupButton$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        PaintView.PopupButton.this.lambda$setIcon$0(z, valueAnimator2);
                    }
                });
                this.imageSwitchAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.recorder.PaintView.PopupButton.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        PopupButton popupButton = PopupButton.this;
                        ImageView imageView = popupButton.imageView;
                        popupButton.imageView = popupButton.image2View;
                        popupButton.image2View = imageView;
                        imageView.bringToFront();
                        PopupButton.this.image2View.setVisibility(8);
                        PopupButton.this.imageSwitchAnimator = null;
                    }
                });
                this.imageSwitchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.imageSwitchAnimator.setDuration(420L);
                this.imageSwitchAnimator.start();
                return;
            }
            this.imageView.setImageResource(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setIcon$0(boolean z, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.imageSwitchT = floatValue;
            if (!z) {
                this.imageView.setAlpha(1.0f - floatValue);
            }
            this.imagesView.invalidate();
        }

        @Override // android.view.View
        public boolean performClick() {
            if (PaintView.this.popupWindow != null && PaintView.this.popupWindow.isShowing()) {
                PaintView.this.popupWindow.dismiss(true);
            }
            return super.performClick();
        }
    }

    private void setTextType(int i) {
        this.selectedTextType = i;
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setType(i);
        }
        PersistColorPalette.getInstance(this.currentAccount).setCurrentTextType(i);
        this.textOptionsView.setOutlineType(i, true);
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintTextOptionsView.Delegate
    public void onNewTextSelected() {
        if (this.keyboardVisible || this.emojiViewVisible) {
            onEmojiButtonClick();
            return;
        }
        this.forceChanges = true;
        createText(true);
    }

    public void onTypefaceSelected(PaintTypeface paintTypeface) {
        PersistColorPalette.getInstance(this.currentAccount).setCurrentTypeface(paintTypeface.getKey());
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setTypeface(paintTypeface);
        }
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintTextOptionsView.Delegate
    public void onTextAlignmentSelected(int i) {
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            setTextAlignment((TextPaintView) entityView, i);
            PersistColorPalette.getInstance(this.currentAccount).setCurrentAlignment(i);
        }
    }

    private void setTextAlignment(TextPaintView textPaintView, int i) {
        textPaintView.setAlign(i);
        int i2 = 2;
        textPaintView.getEditText().setGravity(i != 1 ? i != 2 ? 19 : 21 : 17);
        if (Build.VERSION.SDK_INT >= 17) {
            if (i == 1) {
                i2 = 4;
            } else if (i == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i2 = 3;
            }
            textPaintView.getEditText().setTextAlignment(i2);
        }
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintToolsView.Delegate
    public void onAddButtonPressed(View view) {
        showPopup(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$onAddButtonPressed$43();
            }
        }, this, 53, 0, getHeight(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAddButtonPressed$43() {
        boolean fillShapes = PersistColorPalette.getInstance(this.currentAccount).getFillShapes();
        for (int i = 0; i < Brush.Shape.SHAPES_LIST.size(); i++) {
            final Brush.Shape shape = Brush.Shape.SHAPES_LIST.get(i);
            final int filledIconRes = fillShapes ? shape.getFilledIconRes() : shape.getIconRes();
            PopupButton buttonForPopup = buttonForPopup(shape.getShapeName(), filledIconRes, false, new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda48
                @Override // java.lang.Runnable
                public final void run() {
                    PaintView.this.lambda$onAddButtonPressed$41(shape, filledIconRes);
                }
            });
            buttonForPopup.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda30
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean lambda$onAddButtonPressed$42;
                    lambda$onAddButtonPressed$42 = PaintView.this.lambda$onAddButtonPressed$42(view);
                    return lambda$onAddButtonPressed$42;
                }
            });
            this.popupLayout.addView((View) buttonForPopup, LayoutHelper.createLinear(-1, 48));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAddButtonPressed$41(Brush.Shape shape, int i) {
        if (this.renderView.getCurrentBrush() instanceof Brush.Shape) {
            this.ignoreToolChangeAnimationOnce = true;
        }
        onBrushSelected(shape);
        this.paintToolsView.animatePlusToIcon(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAddButtonPressed$42(View view) {
        if (this.popupLayout != null) {
            PersistColorPalette.getInstance(this.currentAccount).toggleFillShapes();
            boolean fillShapes = PersistColorPalette.getInstance(this.currentAccount).getFillShapes();
            for (int i = 0; i < this.popupLayout.getItemsCount(); i++) {
                View itemAt = this.popupLayout.getItemAt(i);
                if (itemAt instanceof PopupButton) {
                    Brush.Shape shape = Brush.Shape.SHAPES_LIST.get(i);
                    ((PopupButton) itemAt).setIcon(fillShapes ? shape.getFilledIconRes() : shape.getIconRes(), fillShapes, true);
                }
            }
        }
        return true;
    }

    private void showMenuForEntity(final EntityView entityView) {
        if (entityView instanceof MessageEntityView) {
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
                return;
            }
            this.popupWindow.dismiss();
            return;
        }
        int[] centerLocationInWindow = getCenterLocationInWindow(entityView);
        showPopup(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$showMenuForEntity$54(entityView);
            }
        }, this, 51, centerLocationInWindow[0], centerLocationInWindow[1] - AndroidUtilities.dp(32.0f), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$54(final EntityView entityView) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        boolean z = entityView instanceof MessageEntityView;
        if (!z) {
            TextView textView = new TextView(getContext());
            textView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
            textView.setGravity(16);
            textView.setLines(1);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView.setTextSize(1, 14.0f);
            textView.setTag(0);
            textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
            textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$44(entityView, view);
                }
            });
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, 44));
        }
        if (entityView instanceof TextPaintView) {
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
            textView2.setGravity(16);
            textView2.setLines(1);
            textView2.setSingleLine();
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView2.setTextSize(1, 14.0f);
            if ((this.keyboardNotifier.keyboardVisible() && !this.keyboardNotifier.ignoring) || this.emojiPadding > 0) {
                textView2.setTag(3);
                textView2.setText(LocaleController.getString("Paste", R.string.Paste));
                textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda27
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PaintView.this.lambda$showMenuForEntity$45(entityView, view);
                    }
                });
            } else {
                textView2.setTag(1);
                textView2.setText(LocaleController.getString("PaintEdit", R.string.PaintEdit));
                textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda26
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PaintView.this.lambda$showMenuForEntity$46(entityView, view);
                    }
                });
            }
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 44));
        } else if (entityView instanceof LocationView) {
            TextView createActionLayoutButton = createActionLayoutButton(1, LocaleController.getString("PaintEdit", R.string.PaintEdit));
            createActionLayoutButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$48(entityView, view);
                }
            });
            linearLayout.addView(createActionLayoutButton, LayoutHelper.createLinear(-2, 44));
        } else if (entityView instanceof LinkView) {
            TextView createActionLayoutButton2 = createActionLayoutButton(1, LocaleController.getString("PaintEdit", R.string.PaintEdit));
            createActionLayoutButton2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda24
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$49(entityView, view);
                }
            });
            linearLayout.addView(createActionLayoutButton2, LayoutHelper.createLinear(-2, 44));
        }
        if ((entityView instanceof StickerView) || (entityView instanceof RoundView) || (entityView instanceof PhotoView) || (entityView instanceof ReactionWidgetEntityView)) {
            TextView createActionLayoutButton3 = createActionLayoutButton(4, LocaleController.getString("Flip", R.string.Flip));
            createActionLayoutButton3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda22
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$50(entityView, view);
                }
            });
            linearLayout.addView(createActionLayoutButton3, LayoutHelper.createLinear(-2, 44));
        }
        boolean z2 = entityView instanceof PhotoView;
        if (z2) {
            final PhotoView photoView = (PhotoView) entityView;
            if (photoView.hasSegmentedImage()) {
                TextView createActionLayoutButton4 = createActionLayoutButton(5, LocaleController.getString(photoView.isSegmented() ? R.string.SegmentationUndoCutOut : R.string.SegmentationCutOut));
                createActionLayoutButton4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda28
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PaintView.this.lambda$showMenuForEntity$51(photoView, view);
                    }
                });
                linearLayout.addView(createActionLayoutButton4, LayoutHelper.createLinear(-2, 44));
                photoView.highlightSegmented();
            }
        }
        if (this.entitiesView.indexOfChild(entityView) != this.entitiesView.getChildCount() - 1 && !(entityView instanceof ReactionWidgetEntityView)) {
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
            textView3.setLines(1);
            textView3.setSingleLine();
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setGravity(16);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView3.setTextSize(1, 14.0f);
            textView3.setTag(2);
            textView3.setText(LocaleController.getString(R.string.PaintBringToFront));
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$52(entityView, view);
                }
            });
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, 44));
        } else if (!z2 && !z && !(entityView instanceof RoundView) && !(entityView instanceof LocationView) && !(entityView instanceof LinkView) && !(entityView instanceof ReactionWidgetEntityView)) {
            TextView textView4 = new TextView(getContext());
            textView4.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
            textView4.setLines(1);
            textView4.setSingleLine();
            textView4.setEllipsize(TextUtils.TruncateAt.END);
            textView4.setGravity(16);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView4.setTextSize(1, 14.0f);
            textView4.setTag(2);
            textView4.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
            textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda23
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$53(entityView, view);
                }
            });
            linearLayout.addView(textView4, LayoutHelper.createLinear(-2, 44));
        }
        int i = 0;
        while (i < linearLayout.getChildCount()) {
            View childAt = linearLayout.getChildAt(i);
            int themedColor = getThemedColor(Theme.key_listSelector);
            int i2 = 8;
            int i3 = i == 0 ? 8 : 0;
            int i4 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
            int i5 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
            if (i != 0) {
                i2 = 0;
            }
            childAt.setBackground(Theme.createRadSelectorDrawable(themedColor, i3, i4, i5, i2));
            i++;
        }
        this.popupLayout.addView(linearLayout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        linearLayout.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$44(EntityView entityView, View view) {
        if (entityView instanceof RoundView) {
            onTryDeleteRound();
        } else {
            lambda$registerRemovalUndo$61(entityView);
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$45(EntityView entityView, View view) {
        try {
            ((TextPaintView) entityView).getEditText().onTextContextMenuItem(16908337);
        } catch (Exception e) {
            FileLog.e(e);
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$46(EntityView entityView, View view) {
        lambda$createRound$60(entityView);
        editSelectedTextEntity();
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$48(final EntityView entityView, View view) {
        lambda$createRound$60(null);
        showLocationAlert((LocationView) entityView, new Utilities.Callback2() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda55
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                PaintView.this.lambda$showMenuForEntity$47(entityView, (TLRPC$MessageMedia) obj, (TL_stories$MediaArea) obj2);
            }
        });
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$47(EntityView entityView, TLRPC$MessageMedia tLRPC$MessageMedia, TL_stories$MediaArea tL_stories$MediaArea) {
        ((LocationView) entityView).setLocation(this.currentAccount, tLRPC$MessageMedia, tL_stories$MediaArea);
        appearAnimation(entityView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$49(EntityView entityView, View view) {
        lambda$createRound$60(null);
        showLinkAlert((LinkView) entityView);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$50(EntityView entityView, View view) {
        if (entityView instanceof StickerView) {
            ((StickerView) entityView).mirror(true);
        } else if (entityView instanceof ReactionWidgetEntityView) {
            ((ReactionWidgetEntityView) entityView).mirror(true);
        } else if (entityView instanceof RoundView) {
            ((RoundView) entityView).mirror(true);
        } else {
            ((PhotoView) entityView).mirror(true);
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$51(PhotoView photoView, View view) {
        photoView.toggleSegmented(true);
        if (photoView.isSegmented()) {
            onSwitchSegmentedAnimation(photoView);
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$52(EntityView entityView, View view) {
        entityView.bringToFront();
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$53(EntityView entityView, View view) {
        duplicateEntity(entityView);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    private TextView createActionLayoutButton(int i, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        return textView;
    }

    private void duplicateEntity(EntityView entityView) {
        EntityView entityView2;
        if (entityView == null) {
            return;
        }
        Point startPositionRelativeToEntity = startPositionRelativeToEntity(entityView);
        if (entityView instanceof StickerView) {
            EntityView stickerView = new StickerView(getContext(), (StickerView) entityView, startPositionRelativeToEntity);
            stickerView.setDelegate(this);
            this.entitiesView.addView(stickerView);
            entityView2 = stickerView;
        } else if (!(entityView instanceof TextPaintView)) {
            return;
        } else {
            TextPaintView textPaintView = new TextPaintView(getContext(), (TextPaintView) entityView, startPositionRelativeToEntity);
            textPaintView.setDelegate(this);
            textPaintView.setMaxWidth(this.w - AndroidUtilities.dp(32.0f));
            this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
            entityView2 = textPaintView;
        }
        registerRemovalUndo(entityView2);
        lambda$createRound$60(null);
        appearAnimation(entityView2);
    }

    private Point startPositionRelativeToEntity(EntityView entityView) {
        int i;
        MediaController.CropState cropState = this.currentCropState;
        float f = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (entityView != null) {
            Point position = entityView.getPosition();
            float min = Math.min(entityView.getHeight(), entityView.getWidth()) * 0.2f;
            return new Point(position.x + min, position.y + min);
        }
        float f2 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        Point centerPositionForEntity = centerPositionForEntity();
        int i2 = 0;
        while (i2 < 10) {
            int i3 = 0;
            boolean z = false;
            while (i3 < this.entitiesView.getChildCount()) {
                View childAt = this.entitiesView.getChildAt(i3);
                if (!(childAt instanceof EntityView) || (childAt instanceof MessageEntityView)) {
                    i = i2;
                } else {
                    Point position2 = ((EntityView) childAt).getPosition();
                    i = i2;
                    if (((float) Math.sqrt(Math.pow(position2.x - centerPositionForEntity.x, 2.0d) + Math.pow(position2.y - centerPositionForEntity.y, 2.0d))) < f2) {
                        f = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z = true;
                    }
                }
                i3++;
                i2 = i;
            }
            int i4 = i2;
            if (!z) {
                break;
            }
            i2 = i4 + 1;
            centerPositionForEntity = new Point(centerPositionForEntity.x + f, centerPositionForEntity.y + f);
        }
        return centerPositionForEntity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class PopupWindowLayout extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
        private final ButtonBounce bounce;
        private float cx;
        private float cy;
        public boolean enableBounce;

        public PopupWindowLayout(PaintView paintView, Context context) {
            super(context, paintView.resourcesProvider);
            this.bounce = new ButtonBounce(this, 1.5f, 1.0f, 2.0f);
            this.enableBounce = true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.cx = motionEvent.getX();
                this.cy = motionEvent.getY();
                this.bounce.setPressed(this.enableBounce);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.bounce.setPressed(false);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.ActionBarPopupWindowLayout, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            float scale = this.bounce.getScale(0.05f);
            if (scale < 1.0f) {
                canvas.save();
                canvas.scale(scale, scale, this.cx, this.cy);
            }
            super.dispatchDraw(canvas);
            if (scale < 1.0f) {
                canvas.restore();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.ActionBarPopupWindowLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
        }
    }

    private void showPopup(Runnable runnable, View view, int i, int i2, int i3, boolean z) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
            return;
        }
        if (this.popupLayout == null) {
            this.popupRect = new Rect();
            PopupWindowLayout popupWindowLayout = new PopupWindowLayout(this, getContext());
            this.popupLayout = popupWindowLayout;
            popupWindowLayout.setAnimationEnabled(true);
            this.popupLayout.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda31
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean lambda$showPopup$55;
                    lambda$showPopup$55 = PaintView.this.lambda$showPopup$55(view2, motionEvent);
                    return lambda$showPopup$55;
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda62
                @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    PaintView.this.lambda$showPopup$56(keyEvent);
                }
            });
            this.popupLayout.setShownFromBottom(true);
        }
        PopupWindowLayout popupWindowLayout2 = this.popupLayout;
        popupWindowLayout2.enableBounce = z;
        popupWindowLayout2.removeInnerViews();
        runnable.run();
        if (this.popupWindow == null) {
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(this.popupLayout, -2, -2);
            this.popupWindow = actionBarPopupWindow2;
            actionBarPopupWindow2.setAnimationEnabled(true);
            this.popupWindow.setAnimationStyle(R.style.PopupAnimation);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setClippingEnabled(true);
            this.popupWindow.setInputMethodMode(2);
            this.popupWindow.setSoftInputMode(0);
            this.popupWindow.getContentView().setFocusableInTouchMode(true);
            this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda32
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    PaintView.this.lambda$showPopup$57();
                }
            });
        }
        this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.popupWindow.setFocusable(true);
        if ((i & 48) != 0) {
            i2 -= this.popupLayout.getMeasuredWidth() / 2;
            i3 -= this.popupLayout.getMeasuredHeight();
        }
        this.popupWindow.showAtLocation(view, i, i2, i3);
        ActionBarPopupWindow.startAnimation(this.popupLayout);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z) {
            PopupWindowLayout popupWindowLayout3 = this.popupLayout;
            popupWindowLayout3.setBackgroundDrawable(new BlurringShader.StoryBlurDrawer(this.blurManager, popupWindowLayout3, 5).makeDrawable(i2, i3, mutate, AndroidUtilities.dpf2(8.3f)));
            return;
        }
        this.popupLayout.setBackgroundDrawable(mutate);
        this.popupLayout.setBackgroundColor(-14145495);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showPopup$55(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            view.getHitRect(this.popupRect);
            if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            this.popupWindow.dismiss();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPopup$56(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPopup$57() {
        this.popupLayout.removeInnerViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintToolsView.Delegate
    public PersistColorPalette onGetPalette() {
        return PersistColorPalette.getInstance(this.currentAccount);
    }

    private Size baseStickerSize() {
        double d = getPaintingSize().width;
        Double.isNaN(d);
        float floor = (float) Math.floor(d * 0.5d);
        return new Size(floor, floor);
    }

    private Size basePhotoSize(String str) {
        float f;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f = 1.0f;
        }
        if (f > 1.0f) {
            double max = Math.max(this.w, this.entitiesView.getMeasuredWidth());
            Double.isNaN(max);
            float floor = (float) Math.floor(max * 0.5d);
            return new Size(floor, floor / f);
        }
        double max2 = Math.max(this.h, this.entitiesView.getMeasuredHeight());
        Double.isNaN(max2);
        float floor2 = (float) Math.floor(max2 * 0.5d);
        return new Size(f * floor2, floor2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Size basePhotoSize(TLObject tLObject) {
        float f;
        TLRPC$PhotoSize closestPhotoSizeWithSize;
        if (tLObject instanceof TLRPC$Photo) {
            if (FileLoader.getClosestPhotoSizeWithSize(((TLRPC$Photo) tLObject).sizes, 1000) != null) {
                f = closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                if (f <= 1.0f) {
                    double max = Math.max(this.w, this.entitiesView.getMeasuredWidth());
                    Double.isNaN(max);
                    float floor = (float) Math.floor(max * 0.5d);
                    return new Size(floor, floor / f);
                }
                double max2 = Math.max(this.h, this.entitiesView.getMeasuredHeight());
                Double.isNaN(max2);
                float floor2 = (float) Math.floor(max2 * 0.5d);
                return new Size(f * floor2, floor2);
            }
        } else if (!(tLObject instanceof TLRPC$Document)) {
            boolean z = tLObject instanceof TLRPC$WebDocument;
        }
        f = 1.0f;
        if (f <= 1.0f) {
        }
    }

    public void appearAnimation(final View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$appearAnimation$58(view);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$appearAnimation$58(View view) {
        if (view instanceof EntityView) {
            EntityView entityView = (EntityView) view;
            entityView.updateSelectionView();
            lambda$createRound$60(entityView);
        }
    }

    private Point centerPositionForEntity() {
        int measuredWidth = this.entitiesView.getMeasuredWidth();
        int measuredHeight = this.entitiesView.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.w;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.h;
        }
        return new Point(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    private StickerPosition calculateStickerPosition(TLRPC$Document tLRPC$Document) {
        TLRPC$TL_maskCoords tLRPC$TL_maskCoords;
        float f;
        ArrayList<PhotoFace> arrayList;
        int i;
        PhotoFace randomFaceWithVacantAnchor;
        int i2 = 0;
        while (true) {
            if (i2 >= tLRPC$Document.attributes.size()) {
                tLRPC$TL_maskCoords = null;
                break;
            }
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i2);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                tLRPC$TL_maskCoords = tLRPC$DocumentAttribute.mask_coords;
                break;
            }
            i2++;
        }
        MediaController.CropState cropState = this.currentCropState;
        float f2 = 0.75f;
        if (cropState != null) {
            f = -(cropState.transformRotation + cropState.cropRotate);
            f2 = 0.75f / cropState.cropScale;
        } else {
            f = 0.0f;
        }
        StickerPosition stickerPosition = new StickerPosition(centerPositionForEntity(), f2, f);
        if (tLRPC$TL_maskCoords == null || (arrayList = this.faces) == null || arrayList.size() == 0 || (randomFaceWithVacantAnchor = getRandomFaceWithVacantAnchor((i = tLRPC$TL_maskCoords.n), tLRPC$Document.id, tLRPC$TL_maskCoords)) == null) {
            return stickerPosition;
        }
        Point pointForAnchor = randomFaceWithVacantAnchor.getPointForAnchor(i);
        float widthForAnchor = randomFaceWithVacantAnchor.getWidthForAnchor(i);
        float angle = randomFaceWithVacantAnchor.getAngle();
        double d = widthForAnchor / baseStickerSize().width;
        double d2 = tLRPC$TL_maskCoords.zoom;
        Double.isNaN(d);
        return new StickerPosition(new Point(pointForAnchor.x, pointForAnchor.y), (float) (d * d2), angle);
    }

    private PhotoFace getRandomFaceWithVacantAnchor(int i, long j, TLRPC$TL_maskCoords tLRPC$TL_maskCoords) {
        if (i >= 0 && i <= 3 && !this.faces.isEmpty()) {
            int size = this.faces.size();
            int nextInt = Utilities.random.nextInt(size);
            for (int i2 = size; i2 > 0; i2--) {
                PhotoFace photoFace = this.faces.get(nextInt);
                if (!isFaceAnchorOccupied(photoFace, i, j, tLRPC$TL_maskCoords)) {
                    return photoFace;
                }
                nextInt = (nextInt + 1) % size;
            }
        }
        return null;
    }

    private boolean isFaceAnchorOccupied(PhotoFace photoFace, int i, long j, TLRPC$TL_maskCoords tLRPC$TL_maskCoords) {
        Point pointForAnchor = photoFace.getPointForAnchor(i);
        if (pointForAnchor == null) {
            return true;
        }
        float widthForAnchor = photoFace.getWidthForAnchor(0) * 1.1f;
        for (int i2 = 0; i2 < this.entitiesView.getChildCount(); i2++) {
            View childAt = this.entitiesView.getChildAt(i2);
            if (childAt instanceof StickerView) {
                StickerView stickerView = (StickerView) childAt;
                if (stickerView.getAnchor() != i) {
                    continue;
                } else {
                    Point position = stickerView.getPosition();
                    float hypot = (float) Math.hypot(position.x - pointForAnchor.x, position.y - pointForAnchor.y);
                    if ((j == stickerView.getSticker().id || this.faces.size() > 1) && hypot < widthForAnchor) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public PhotoView createPhoto(String str, boolean z) {
        this.forceChanges = true;
        Size basePhotoSize = basePhotoSize(str);
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f = basePhotoSize.width;
            basePhotoSize.width = basePhotoSize.height;
            basePhotoSize.height = f;
        }
        PhotoView photoView = new PhotoView(getContext(), centerPositionForEntity(), 0.0f, 1.0f, basePhotoSize, str, ((Integer) imageOrientation.first).intValue(), ((Integer) imageOrientation.second).intValue());
        photoView.centerImage.setLayerNum(12);
        photoView.setDelegate(this);
        this.entitiesView.addView(photoView);
        if (z) {
            registerRemovalUndo(photoView);
            lambda$createRound$60(photoView);
        }
        return photoView;
    }

    public void deleteRound() {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            final View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof RoundView) {
                if (this.currentEntityView == childAt) {
                    lambda$createRound$60(null);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda46
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaintView.this.lambda$deleteRound$59(childAt);
                    }
                }).start();
            }
        }
    }

    public RoundView createRound(String str, boolean z) {
        float f;
        this.forceChanges = true;
        this.creatingNewRound = true;
        deleteRound();
        int measuredWidth = this.entitiesView.getMeasuredWidth();
        this.entitiesView.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.w;
        }
        float floor = (float) Math.floor(0.43f * f);
        Size size = new Size(floor, floor);
        final RoundView roundView = new RoundView(getContext(), new Point((measuredWidth - (size.width / 2.0f)) - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(72.0f) + (size.height / 2.0f)), 0.0f, 1.0f, size, str);
        roundView.setDelegate(this);
        this.entitiesView.addView(roundView);
        if (z) {
            registerRemovalUndo(roundView);
            post(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda51
                @Override // java.lang.Runnable
                public final void run() {
                    PaintView.this.lambda$createRound$60(roundView);
                }
            });
        }
        this.creatingNewRound = false;
        return roundView;
    }

    public MessageEntityView createMessage(ArrayList<MessageObject> arrayList, boolean z, boolean z2) {
        this.forceChanges = true;
        MessageEntityView messageEntityView = new MessageEntityView(getContext(), centerPositionForEntity(), 0.0f, 1.0f, arrayList, this.blurManager, z2, this.videoTextureHolder) { // from class: org.telegram.ui.Stories.recorder.PaintView.28
            @Override // org.telegram.ui.Components.Paint.Views.MessageEntityView
            public boolean drawForBitmap() {
                return PaintView.this.drawForThemeToggle;
            }
        };
        messageEntityView.setDelegate(this);
        this.entitiesView.addView(messageEntityView);
        if (z) {
            registerRemovalUndo(messageEntityView);
            lambda$createRound$60(messageEntityView);
        }
        return messageEntityView;
    }

    public MessageEntityView findMessageView() {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof MessageEntityView) {
                return (MessageEntityView) childAt;
            }
        }
        return null;
    }

    public PhotoView createPhoto(TLObject tLObject, boolean z) {
        this.forceChanges = true;
        PhotoView photoView = new PhotoView(getContext(), centerPositionForEntity(), 0.0f, 1.0f, basePhotoSize(tLObject), tLObject);
        photoView.centerImage.setLayerNum(12);
        photoView.setDelegate(this);
        this.entitiesView.addView(photoView);
        if (z) {
            registerRemovalUndo(photoView);
            lambda$createRound$60(photoView);
        }
        return photoView;
    }

    private StickerView createSticker(Object obj, TLRPC$Document tLRPC$Document, boolean z) {
        StickerPosition calculateStickerPosition = calculateStickerPosition(tLRPC$Document);
        StickerView stickerView = new StickerView(getContext(), calculateStickerPosition.position, calculateStickerPosition.angle, calculateStickerPosition.scale, baseStickerSize(), tLRPC$Document, obj) { // from class: org.telegram.ui.Stories.recorder.PaintView.29
            @Override // org.telegram.ui.Components.Paint.Views.StickerView
            protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                PaintView.this.didSetAnimatedSticker(rLottieDrawable);
            }
        };
        if (MessageObject.isTextColorEmoji(tLRPC$Document)) {
            stickerView.centerImage.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        stickerView.centerImage.setLayerNum(12);
        stickerView.setDelegate(this);
        this.entitiesView.addView(stickerView);
        if (z) {
            registerRemovalUndo(stickerView);
            lambda$createRound$60(stickerView);
        }
        return stickerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ReactionWidgetEntityView createReactionWidget(boolean z) {
        boolean z2;
        Size size = new Size(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        Point centerPositionForEntity = centerPositionForEntity();
        if (this.entitiesView.getMeasuredHeight() > 0) {
            do {
                z2 = false;
                int i = 0;
                while (true) {
                    if (i >= this.entitiesView.getChildCount()) {
                        z2 = true;
                        continue;
                        break;
                    }
                    View childAt = this.entitiesView.getChildAt(i);
                    if (MathUtils.distance(centerPositionForEntity.x, centerPositionForEntity.y, childAt.getX() + (childAt.getMeasuredWidth() / 2.0f), childAt.getY() + (childAt.getMeasuredHeight() / 2.0f)) < AndroidUtilities.dp(6.0f)) {
                        centerPositionForEntity.x += this.entitiesView.getMeasuredWidth() * 0.05f;
                        centerPositionForEntity.y += this.entitiesView.getMeasuredHeight() * 0.05f;
                        centerPositionForEntity.x = Utilities.clamp(centerPositionForEntity.x, this.entitiesView.getMeasuredWidth(), 0.0f);
                        centerPositionForEntity.y = Utilities.clamp(centerPositionForEntity.y, this.entitiesView.getMeasuredHeight(), 0.0f);
                        continue;
                        break;
                    }
                    i++;
                }
            } while (!z2);
            ReactionWidgetEntityView reactionWidgetEntityView = new ReactionWidgetEntityView(getContext(), centerPositionForEntity, size);
            reactionWidgetEntityView.setDelegate(this);
            this.entitiesView.addView(reactionWidgetEntityView);
            if (z) {
                registerRemovalUndo(reactionWidgetEntityView);
                lambda$createRound$60(reactionWidgetEntityView);
            }
            return reactionWidgetEntityView;
        }
        ReactionWidgetEntityView reactionWidgetEntityView2 = new ReactionWidgetEntityView(getContext(), centerPositionForEntity, size);
        reactionWidgetEntityView2.setDelegate(this);
        this.entitiesView.addView(reactionWidgetEntityView2);
        if (z) {
        }
        return reactionWidgetEntityView2;
    }

    public void removeCurrentEntity() {
        EntityView entityView = this.currentEntityView;
        if (entityView != null) {
            lambda$registerRemovalUndo$61(entityView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeEntity */
    public void lambda$registerRemovalUndo$61(EntityView entityView) {
        EntityView entityView2 = this.currentEntityView;
        if (entityView == entityView2 && entityView2 != null) {
            entityView2.deselect();
            lambda$createRound$60(null);
            if (entityView instanceof TextPaintView) {
                ValueAnimator valueAnimator = this.tabsSelectionAnimator;
                if (valueAnimator != null && this.tabsNewSelectedIndex != 0) {
                    valueAnimator.cancel();
                }
                switchTab(0);
            }
        }
        this.entitiesView.removeView(entityView);
        if (entityView != null) {
            this.undoStore.unregisterUndo(entityView.getUUID());
        }
        if (entityView instanceof PhotoView) {
            ((PhotoView) entityView).deleteSegmentedFile();
        }
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.weightChooserView.setShowPreview(true);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(this.colorSwatch, true);
        if (this.creatingNewRound || !(entityView instanceof RoundView)) {
            return;
        }
        onDeleteRound();
    }

    private void registerRemovalUndo(final EntityView entityView) {
        if (entityView == null) {
            return;
        }
        this.undoStore.registerUndo(entityView.getUUID(), new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda50
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$registerRemovalUndo$61(entityView);
            }
        });
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public boolean onEntitySelected(EntityView entityView) {
        return lambda$createRound$60(entityView);
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public boolean isEntityDeletable() {
        return isEntityDeletable(this.currentEntityView);
    }

    public boolean isEntityDeletable(EntityView entityView) {
        return !(entityView instanceof MessageEntityView);
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public void onEntityDragEnd(boolean z) {
        updatePreviewViewTranslationY();
        this.forceChanges = true;
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public void onEntityDragStart() {
        if (this.reactionLayout != null) {
            showReactionsLayout(false);
        }
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public boolean onEntityLongClicked(EntityView entityView) {
        showReactionsLayout(false);
        showMenuForEntity(entityView);
        return true;
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public void getTransformedTouch(float f, float f2, float[] fArr) {
        View view;
        View view2 = (View) this.renderView.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x = (f - view2.getX()) - view.getLeft();
        float y = (f2 - view2.getY()) - view.getTop();
        fArr[0] = view2.getPivotX() + ((x - view2.getPivotX()) / view2.getScaleX());
        fArr[1] = view2.getPivotY() + ((y - view2.getPivotY()) / view2.getScaleY());
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public int[] getCenterLocation(EntityView entityView) {
        this.pos[0] = (int) entityView.getPosition().x;
        this.pos[1] = (int) entityView.getPosition().y;
        return this.pos;
    }

    private int[] getCenterLocationInWindow(View view) {
        view.getLocationInWindow(this.pos);
        float width = view.getWidth() * view.getScaleX() * this.entitiesView.getScaleX();
        float height = view.getHeight() * view.getScaleY() * this.entitiesView.getScaleY();
        int[] iArr = this.pos;
        iArr[0] = (int) (iArr[0] + (width / 2.0f));
        iArr[1] = (int) (iArr[1] + (height / 2.0f));
        return iArr;
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public boolean allowInteraction(EntityView entityView) {
        return !this.editingText;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class StickerPosition {
        private float angle;
        private Point position;
        private float scale;

        StickerPosition(Point point, float f, float f2) {
            this.position = point;
            this.scale = f;
            this.angle = f2;
        }
    }

    public void onEmojiButtonClick() {
        if (this.emojiViewVisible && (this.currentEntityView instanceof TextPaintView)) {
            this.keyboardNotifier.awaitKeyboard();
            AndroidUtilities.showKeyboard(((TextPaintView) this.currentEntityView).getEditText());
        }
        showEmojiPopup(!this.emojiViewVisible ? 1 : 0);
    }

    private void showEmojiPopup(int i) {
        if (i == 1) {
            EmojiView emojiView = this.emojiView;
            boolean z = emojiView != null && emojiView.getVisibility() == 0;
            createEmojiView();
            this.emojiView.setVisibility(0);
            this.emojiViewVisible = true;
            EmojiView emojiView2 = this.emojiView;
            if (this.keyboardHeight <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeight = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.keyboardHeightLand <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeightLand = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            android.graphics.Point point = AndroidUtilities.displaySize;
            int paddingUnderContainer = (point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight) + this.parent.getPaddingUnderContainer();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView2.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            emojiView2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                EntityView entityView = this.currentEntityView;
                if (entityView instanceof TextPaintView) {
                    AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getEditText());
                }
            }
            this.emojiPadding = paddingUnderContainer;
            this.keyboardNotifier.fire();
            requestLayout();
            ChatActivityEnterViewAnimatedIconView emojiButton = this.textOptionsView.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
            }
            if (!z) {
                if (this.keyboardVisible) {
                    this.translateBottomPanelAfterResize = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PaintView.this.lambda$showEmojiPopup$62(valueAnimator);
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.recorder.PaintView.31
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            PaintView.this.emojiView.setTranslationY(0.0f);
                        }
                    });
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    ofFloat.start();
                }
            }
        } else {
            ChatActivityEnterViewAnimatedIconView emojiButton2 = this.textOptionsView.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
            }
            EmojiView emojiView3 = this.emojiView;
            if (emojiView3 != null) {
                this.emojiViewVisible = false;
                if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                    emojiView3.setVisibility(8);
                }
            }
            if (i == 0) {
                this.emojiPadding = 0;
                this.keyboardNotifier.fire();
            }
            requestLayout();
        }
        updatePlusEmojiKeyboardButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEmojiPopup$62(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void hideEmojiPopup(boolean z) {
        if (this.emojiViewVisible) {
            showEmojiPopup(0);
        }
        if (z) {
            EmojiView emojiView = this.emojiView;
            if (emojiView != null && emojiView.getVisibility() == 0 && !this.waitingForKeyboardOpen) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PaintView.this.lambda$hideEmojiPopup$63(valueAnimator);
                    }
                });
                this.isAnimatePopupClosing = true;
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.recorder.PaintView.32
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        PaintView.this.isAnimatePopupClosing = false;
                        PaintView.this.emojiView.setTranslationY(0.0f);
                        PaintView.this.hideEmojiView();
                    }
                });
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                ofFloat.start();
                return;
            }
            hideEmojiView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideEmojiPopup$63(ValueAnimator valueAnimator) {
        this.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideEmojiView() {
        EmojiView emojiView;
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            this.emojiView.setVisibility(8);
        }
        int i = this.emojiPadding;
        this.emojiPadding = 0;
        if (i != 0) {
            this.keyboardNotifier.fire();
        }
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto, org.telegram.ui.Components.SizeNotifierFrameLayout
    public int measureKeyboardHeight() {
        return this.keyboardNotifier.getKeyboardHeight() - this.parent.getBottomPadding2();
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate
    public void onSizeChanged(int i, boolean z) {
        boolean z2;
        if (i > AndroidUtilities.dp(50.0f) && this.keyboardVisible && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z) {
                this.keyboardHeightLand = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        if (this.emojiViewVisible) {
            int paddingUnderContainer = (z ? this.keyboardHeightLand : this.keyboardHeight) + this.parent.getPaddingUnderContainer();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i2 = layoutParams.width;
            int i3 = AndroidUtilities.displaySize.x;
            if (i2 != i3 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i3;
                layoutParams.height = paddingUnderContainer;
                this.emojiView.setLayoutParams(layoutParams);
                this.emojiPadding = layoutParams.height;
                this.keyboardNotifier.fire();
                requestLayout();
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z3 = this.keyboardVisible;
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            this.keyboardVisible = ((TextPaintView) entityView).getEditText().isFocused() && this.keyboardNotifier.keyboardVisible();
        } else {
            this.keyboardVisible = false;
        }
        if (this.keyboardVisible && this.emojiViewVisible) {
            showEmojiPopup(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !this.emojiViewVisible) {
            this.emojiPadding = 0;
            this.keyboardNotifier.fire();
            requestLayout();
        }
        updateTextDim();
        if (z3 && !this.keyboardVisible && this.emojiPadding > 0 && this.translateBottomPanelAfterResize) {
            this.translateBottomPanelAfterResize = false;
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        updatePlusEmojiKeyboardButton();
    }

    private void updateTextDim() {
        final boolean z = (this.currentEntityView instanceof TextPaintView) && (this.keyboardNotifier.keyboardVisible() || this.emojiPadding > 0) && !this.keyboardNotifier.ignoring;
        this.textDim.animate().cancel();
        this.textDim.setVisibility(0);
        this.textDim.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$updateTextDim$64(z);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTextDim$64(boolean z) {
        if (z) {
            return;
        }
        this.textDim.setVisibility(8);
    }

    private void updatePlusEmojiKeyboardButton() {
        if (this.textOptionsView != null) {
            if (this.keyboardNotifier.keyboardVisible()) {
                this.textOptionsView.animatePlusToIcon(R.drawable.input_smile);
            } else if (this.emojiViewVisible) {
                this.textOptionsView.animatePlusToIcon(R.drawable.input_keyboard);
            } else {
                this.textOptionsView.animatePlusToIcon(R.drawable.msg_add);
            }
        }
        boolean z = this.keyboardNotifier.keyboardVisible() || this.emojiViewVisible;
        AndroidUtilities.updateViewShow(this.undoAllButton, !z, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.undoButton, !z, false, 1.0f, true, null);
        boolean z2 = z;
        AndroidUtilities.updateViewShow(this.doneTextButton, z2, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.cancelTextButton, z2, false, 1.0f, true, null);
    }

    protected void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.parent.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), false, null, null, true, this.resourcesProvider, false);
        this.emojiView = emojiView2;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.allowEmojisForNonPremium(true);
        this.emojiView.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new 33());
        this.parent.addView(this.emojiView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class 33 implements EmojiView.EmojiViewDelegate {
        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ boolean canSchedule() {
            return EmojiView.EmojiViewDelegate.-CC.$default$canSchedule(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ long getDialogId() {
            return EmojiView.EmojiViewDelegate.-CC.$default$getDialogId(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ float getProgressToSearchOpened() {
            return EmojiView.EmojiViewDelegate.-CC.$default$getProgressToSearchOpened(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ int getThreadId() {
            return EmojiView.EmojiViewDelegate.-CC.$default$getThreadId(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void invalidateEnterView() {
            EmojiView.EmojiViewDelegate.-CC.$default$invalidateEnterView(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ boolean isExpanded() {
            return EmojiView.EmojiViewDelegate.-CC.$default$isExpanded(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ boolean isInScheduleMode() {
            return EmojiView.EmojiViewDelegate.-CC.$default$isInScheduleMode(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ boolean isSearchOpened() {
            return EmojiView.EmojiViewDelegate.-CC.$default$isSearchOpened(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ boolean isUserSelf() {
            return EmojiView.EmojiViewDelegate.-CC.$default$isUserSelf(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public void onAnimatedEmojiUnlockClick() {
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onEmojiSettingsClick(ArrayList arrayList) {
            EmojiView.EmojiViewDelegate.-CC.$default$onEmojiSettingsClick(this, arrayList);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i) {
            EmojiView.EmojiViewDelegate.-CC.$default$onGifSelected(this, view, obj, str, obj2, z, i);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onSearchOpenClose(int i) {
            EmojiView.EmojiViewDelegate.-CC.$default$onSearchOpenClose(this, i);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onShowStickerSet(TLRPC$StickerSet tLRPC$StickerSet, TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z) {
            EmojiView.EmojiViewDelegate.-CC.$default$onShowStickerSet(this, tLRPC$StickerSet, tLRPC$InputStickerSet, z);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onStickerSelected(View view, TLRPC$Document tLRPC$Document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i) {
            EmojiView.EmojiViewDelegate.-CC.$default$onStickerSelected(this, view, tLRPC$Document, str, obj, sendAnimationData, z, i);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onStickerSetAdd(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
            EmojiView.EmojiViewDelegate.-CC.$default$onStickerSetAdd(this, tLRPC$StickerSetCovered);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onStickerSetRemove(TLRPC$StickerSetCovered tLRPC$StickerSetCovered) {
            EmojiView.EmojiViewDelegate.-CC.$default$onStickerSetRemove(this, tLRPC$StickerSetCovered);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onStickersGroupClick(long j) {
            EmojiView.EmojiViewDelegate.-CC.$default$onStickersGroupClick(this, j);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onStickersSettingsClick() {
            EmojiView.EmojiViewDelegate.-CC.$default$onStickersSettingsClick(this);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onTabOpened(int i) {
            EmojiView.EmojiViewDelegate.-CC.$default$onTabOpened(this, i);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            EmojiView.EmojiViewDelegate.-CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
        }

        33() {
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public boolean onBackspace() {
            EditTextOutline editText = ((TextPaintView) PaintView.this.currentEntityView).getEditText();
            if (editText == null || editText.length() == 0) {
                return false;
            }
            editText.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public void onEmojiSelected(String str) {
            TextPaintView textPaintView;
            EditTextOutline editText;
            Emoji.EmojiSpan[] emojiSpanArr;
            if ((PaintView.this.currentEntityView instanceof TextPaintView) && (editText = (textPaintView = (TextPaintView) PaintView.this.currentEntityView).getEditText()) != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    CharSequence replaceEmoji = Emoji.replaceEmoji((CharSequence) str, textPaintView.getFontMetricsInt(), (int) (textPaintView.getFontSize() * 0.8f), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    editText.setText(editText.getText().insert(selectionEnd, replaceEmoji));
                    int length = selectionEnd + replaceEmoji.length();
                    editText.setSelection(length, length);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public void onCustomEmojiSelected(long j, TLRPC$Document tLRPC$Document, String str, boolean z) {
            AnimatedEmojiSpan animatedEmojiSpan;
            EditTextOutline editText = ((TextPaintView) PaintView.this.currentEntityView).getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                SpannableString spannableString = new SpannableString(str);
                if (tLRPC$Document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$Document, 1.0f, editText.getPaint().getFontMetricsInt());
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.0f, editText.getPaint().getFontMetricsInt());
                }
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                editText.setText(editText.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public void onClearEmojiRecent() {
            AlertDialog.Builder builder = new AlertDialog.Builder(PaintView.this.getContext(), PaintView.this.resourcesProvider);
            builder.setTitle(LocaleController.getString("ClearRecentEmojiTitle", R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString("ClearRecentEmojiText", R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$33$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PaintView.33.this.lambda$onClearEmojiRecent$0(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            builder.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClearEmojiRecent$0(DialogInterface dialogInterface, int i) {
            PaintView.this.emojiView.clearRecentEmoji();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.destroyed = false;
        super.onAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.destroyed = true;
        ReactionsContainerLayout reactionsContainerLayout = this.reactionLayout;
        if (reactionsContainerLayout != null) {
            AndroidUtilities.removeFromParent(reactionsContainerLayout);
            this.reactionLayout = null;
        }
        super.onDetachedFromWindow();
    }

    public EntityView getSelectedEntity() {
        return this.currentEntityView;
    }

    public RoundView findRoundView() {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof RoundView) {
                return (RoundView) childAt;
            }
        }
        return null;
    }
}
