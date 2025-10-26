package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
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
import org.telegram.ui.Components.Paint.Views.WeatherView;
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
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.Weather;
import org.telegram.ui.WrappedResourceProvider;

/* loaded from: classes5.dex */
public abstract class PaintView extends SizeNotifierFrameLayoutPhoto implements IPhotoPaintView, PaintToolsView.Delegate, EntityView.EntityViewDelegate, PaintTextOptionsView.Delegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, StoryRecorder.Touchable {
    private float baseScale;
    private Bitmap bitmapToEdit;
    private Bitmap blurBitmapToEdit;
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
    private boolean emojiViewWasVisible;
    private int emojiWasPadding;
    public boolean enteredThroughText;
    public EntitiesContainerView entitiesView;
    private ArrayList faces;
    private Bitmap facesBitmap;
    private File file;
    private boolean fileFromGallery;
    private boolean fillShapes;
    private boolean forceChanges;
    private int h;
    private boolean hasAudio;
    private boolean ignoreLayout;
    private boolean ignoreToolChangeAnimationOnce;
    private boolean inBubbleMode;
    private ArrayList initialEntities;
    private StoryEntry initialEntry;
    private boolean invalidateReactionPosition;
    private boolean isAnimatePopupClosing;
    private boolean isBot;
    private boolean isColorListShown;
    public boolean isCoverPreview;
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
    private boolean wasKeyboardVisible;
    private PaintWeightChooserView weightChooserView;
    private final PaintWeightChooserView.ValueOverride weightDefaultValueOverride;
    private LinearLayout zoomOutButton;
    private ImageView zoomOutImage;
    private TextView zoomOutText;
    private boolean zoomOutVisible;

    protected abstract boolean checkAudioPermission(Runnable runnable);

    protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
    }

    protected abstract void dismiss();

    public /* bridge */ /* synthetic */ View getView() {
        return IPhotoPaintView.-CC.$default$getView(this);
    }

    protected abstract void onAudioSelect(MessageObject messageObject);

    public abstract void onCreateRound(RoundView roundView);

    public abstract void onDeleteRound();

    public abstract void onDeselectRound(RoundView roundView);

    protected abstract void onGalleryClick();

    protected abstract void onOpenCloseStickersAlert(boolean z);

    public abstract void onSelectRound(RoundView roundView);

    public abstract void onSwitchSegmentedAnimation(PhotoView photoView);

    protected void onTextAdd() {
    }

    public abstract void onTryDeleteRound();

    public /* bridge */ /* synthetic */ void setOffsetTranslationX(float f) {
        IPhotoPaintView.-CC.$default$setOffsetTranslationX(this, f);
    }

    public void setHasAudio(boolean z) {
        if (z != this.hasAudio) {
            this.hasAudio = z;
            checkEntitiesIsVideo();
        }
    }

    public PaintView(final Context context, boolean z, File file, boolean z2, boolean z3, final StoryRecorder.WindowView windowView, Activity activity, final int i, Bitmap bitmap, Bitmap bitmap2, final Bitmap bitmap3, int i2, ArrayList arrayList, StoryEntry storyEntry, int i3, int i4, MediaController.CropState cropState, final Runnable runnable, BlurringShader.BlurManager blurManager, final Theme.ResourcesProvider resourcesProvider, PreviewView.TextureViewHolder textureViewHolder, PreviewView previewView) {
        super(context, activity, true);
        Bitmap bitmap4;
        BlurringShader.BlurManager blurManager2;
        int i5;
        this.tabsSelectedIndex = 0;
        this.tabsNewSelectedIndex = -1;
        PaintWeightChooserView.ValueOverride valueOverride = new PaintWeightChooserView.ValueOverride() { // from class: org.telegram.ui.Stories.recorder.PaintView.1
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
        this.weightDefaultValueOverride = valueOverride;
        this.typefaceMenuOutlinePaint = new Paint(1);
        this.typefaceMenuBackgroundPaint = new Paint(1);
        this.colorPickerRainbowPaint = new Paint(1);
        this.colorSwatchPaint = new Paint(1);
        this.colorSwatchOutlinePaint = new Paint(1);
        this.colorSwatch = new Swatch(-1, 1.0f, 0.016773745f);
        this.fillShapes = false;
        this.toolsPaint = new Paint(1);
        this.zoomOutVisible = false;
        this.points = new float[2];
        this.isCoverPreview = false;
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
        this.isBot = z3;
        this.parent = windowView;
        this.w = i3;
        this.h = i4;
        this.previewView = previewView;
        this.currentAccount = i;
        this.resourcesProvider = new Theme.ResourcesProvider() { // from class: org.telegram.ui.Stories.recorder.PaintView.2
            private ColorFilter animatedEmojiColorFilter;

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ void applyServiceShaderMatrix(int i6, int i7, float f, float f2) {
                Theme.applyServiceShaderMatrix(i6, i7, f, f2);
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ int getColorOrDefault(int i6) {
                int color;
                color = getColor(i6);
                return color;
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public /* synthetic */ int getCurrentColor(int i6) {
                int color;
                color = getColor(i6);
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
            public /* synthetic */ void setAnimatedColor(int i6, int i7) {
                Theme.ResourcesProvider.-CC.$default$setAnimatedColor(this, i6, i7);
            }

            @Override // org.telegram.ui.ActionBar.Theme.ResourcesProvider
            public int getColor(int i6) {
                if (i6 == Theme.key_actionBarDefaultSubmenuBackground) {
                    return -14145495;
                }
                if (i6 == Theme.key_actionBarDefaultSubmenuItem) {
                    return -1;
                }
                if (i6 == Theme.key_dialogBackground) {
                    return -14737633;
                }
                if (i6 == Theme.key_dialogTextBlack) {
                    return -592138;
                }
                if (i6 == Theme.key_dialogTextGray3) {
                    return -8553091;
                }
                if (i6 == Theme.key_chat_emojiPanelBackground) {
                    return -16777216;
                }
                if (i6 == Theme.key_chat_emojiPanelShadowLine) {
                    return -1610612736;
                }
                if (i6 == Theme.key_chat_emojiBottomPanelIcon || i6 == Theme.key_chat_emojiPanelBackspace || i6 == Theme.key_chat_emojiPanelIcon) {
                    return -9539985;
                }
                if (i6 == Theme.key_windowBackgroundWhiteBlackText) {
                    return -1;
                }
                int i7 = Theme.key_featuredStickers_addedIcon;
                if (i6 == i7) {
                    return -11754001;
                }
                if (i6 == Theme.key_listSelector) {
                    return 536870911;
                }
                if (i6 == Theme.key_profile_tabSelectedText || i6 == Theme.key_profile_tabText || i6 == Theme.key_profile_tabSelectedLine) {
                    return -1;
                }
                if (i6 == Theme.key_profile_tabSelector) {
                    return 352321535;
                }
                if (i6 == Theme.key_chat_emojiSearchIcon || i6 == i7) {
                    return -7895161;
                }
                if (i6 == Theme.key_chat_emojiSearchBackground) {
                    return 780633991;
                }
                if (i6 == Theme.key_windowBackgroundGray) {
                    return -15921907;
                }
                Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                if (resourcesProvider2 != null) {
                    return resourcesProvider2.getColor(i6);
                }
                return Theme.getColor(i6);
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
        undoStore.setDelegate(new UndoStore.UndoStoreDelegate() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda18
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
        Painting painting = new Painting(getPaintingSize(), bitmap3, i2, blurManager);
        Bitmap bitmap5 = this.bitmapToEdit;
        Bitmap bitmap6 = this.blurBitmapToEdit;
        if (storyEntry == null || !storyEntry.isRepostMessage) {
            bitmap4 = bitmap6;
            blurManager2 = blurManager;
        } else {
            blurManager2 = null;
            bitmap4 = bitmap6;
        }
        RenderView renderView = new RenderView(context, painting, bitmap5, bitmap4, blurManager2) { // from class: org.telegram.ui.Stories.recorder.PaintView.3
            @Override // org.telegram.ui.Components.Paint.RenderView
            public void selectBrush(Brush brush) {
                int indexOf = Brush.BRUSHES_LIST.indexOf(brush);
                int i6 = indexOf + 1;
                if (i6 <= 1 || bitmap3 != null) {
                    indexOf = i6;
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
                    PaintView.this.lambda$createRound$61(null);
                }
                PaintView.this.weightChooserView.setViewHidden(true);
            }

            @Override // org.telegram.ui.Components.Paint.RenderView.RenderViewDelegate
            public void onFinishedDrawing(boolean z4) {
                PaintView.this.undoStore.getDelegate().historyChanged();
                PaintView.this.weightChooserView.setViewHidden(false);
            }

            @Override // org.telegram.ui.Components.Paint.RenderView.RenderViewDelegate
            public boolean shouldDraw() {
                boolean z4 = PaintView.this.currentEntityView == null;
                if (!z4) {
                    PaintView.this.lambda$createRound$61(null);
                }
                return z4;
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
                } else {
                    PaintView.this.paintToolsView.select(1);
                    PaintView.this.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                }
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
                PaintView.this.lambda$createRound$61(null);
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

            /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
            @Override // android.view.View
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void onDraw(Canvas canvas) {
                int i6;
                int i7;
                float f;
                float f2;
                int measuredWidth;
                float measuredWidth2;
                int measuredHeight;
                float measuredHeight2;
                super.onDraw(canvas);
                long min = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
                this.lastUpdate = System.currentTimeMillis();
                if (PaintView.this.currentEntityView != null && PaintView.this.currentEntityView.hasTouchDown() && PaintView.this.currentEntityView.hasPanned()) {
                    i6 = PaintView.this.currentEntityView.getStickyX();
                    i7 = PaintView.this.currentEntityView.getStickyY();
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (i6 != 0) {
                    this.lastStickyX = i6;
                }
                if (i7 != 0) {
                    this.lastStickyY = i7;
                }
                if (i6 != 0) {
                    float f3 = this.stickyXAlpha;
                    if (f3 != 1.0f) {
                        this.stickyXAlpha = Math.min(1.0f, f3 + (min / 150.0f));
                        invalidate();
                        if (i7 != 0) {
                            float f4 = this.stickyYAlpha;
                            if (f4 != 1.0f) {
                                this.stickyYAlpha = Math.min(1.0f, f4 + (min / 150.0f));
                                invalidate();
                                f = this.stickyYAlpha;
                                if (f != 0.0f) {
                                    this.linePaint.setAlpha((int) (f * 255.0f));
                                    int i8 = this.lastStickyY;
                                    if (i8 == 1) {
                                        measuredHeight = AndroidUtilities.dp(64.0f);
                                    } else if (i8 == 2) {
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
                                    int i9 = this.lastStickyX;
                                    if (i9 == 1) {
                                        measuredWidth = AndroidUtilities.dp(8.0f);
                                    } else {
                                        if (i9 == 2) {
                                            measuredWidth2 = getMeasuredWidth() / 2.0f;
                                            float f6 = measuredWidth2;
                                            canvas.drawLine(f6, 0.0f, f6, getMeasuredHeight(), this.linePaint);
                                            return;
                                        }
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
                        if (i7 == 0) {
                            float f7 = this.stickyYAlpha;
                            if (f7 != 0.0f) {
                                this.stickyYAlpha = Math.max(0.0f, f7 - (min / 150.0f));
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
                        this.stickyXAlpha = Math.max(0.0f, f8 - (min / 150.0f));
                        invalidate();
                    }
                }
                if (i7 != 0) {
                }
                if (i7 == 0) {
                }
                f = this.stickyYAlpha;
                if (f != 0.0f) {
                }
                f2 = this.stickyXAlpha;
                if (f2 != 0.0f) {
                }
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i6, int i7) {
                super.onMeasure(i6, i7);
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

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (PaintView.this.isCoverPreview) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.initialEntry = storyEntry;
        this.initialEntities = arrayList;
        if (this.w > 0 && this.h > 0) {
            setupEntities();
        }
        this.entitiesView.setVisibility(4);
        this.selectionContainerView = new FrameLayout(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.8
            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (PaintView.this.isCoverPreview) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        FrameLayout frameLayout = new FrameLayout(context);
        this.topLayout = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout2 = this.topLayout;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{TLObject.FLAG_30, 0}));
        addView(this.topLayout, LayoutHelper.createFrame(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.undoButton = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        this.undoButton.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.undoButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.undoButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda22
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
        this.zoomOutButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda23
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
        this.undoAllButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda24
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
        this.cancelTextButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda25
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
        this.doneTextButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                PaintView.this.lambda$new$5(view3);
            }
        });
        this.doneTextButton.setAlpha(0.0f);
        this.doneTextButton.setVisibility(8);
        this.topLayout.addView(this.doneTextButton, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.9
            private float lastRainbowX;
            private float lastRainbowY;
            private Path path = new Path();

            {
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
                    int i6 = PaintView.this.colorSwatch.color;
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
                        i6 = ColorUtils.blendARGB(PaintView.this.colorSwatch.color, persistColorPalette.getColor(0), PaintView.this.toolsTransformProgress);
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
                    PaintView.this.colorSwatchPaint.setColor(i6);
                    PaintView.this.colorSwatchPaint.setAlpha((int) (PaintView.this.colorSwatchPaint.getAlpha() * view3.getAlpha()));
                    PaintView.this.colorSwatchOutlinePaint.setColor(i6);
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
        this.bottomLayout = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        this.bottomLayout.setBackground(new GradientDrawable(orientation, new int[]{0, TLObject.FLAG_31}));
        addView(this.bottomLayout, LayoutHelper.createFrame(-1, 104, 80));
        PaintToolsView paintToolsView = new PaintToolsView(context, (storyEntry == null || storyEntry.isCollage() || storyEntry.isRepostMessage || blurManager == null) ? false : true);
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
        post(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$new$6(i);
            }
        });
        this.textOptionsView.setAlignment(PersistColorPalette.getInstance(i).getCurrentAlignment());
        this.bottomLayout.addView(this.textOptionsView, LayoutHelper.createFrame(-1, 48.0f));
        FrameLayout frameLayout4 = new FrameLayout(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.10
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
        this.overlayLayout = frameLayout4;
        addView(frameLayout4, LayoutHelper.createFrame(-1, -1.0f));
        PaintTypefaceListView paintTypefaceListView = new PaintTypefaceListView(context);
        this.typefaceListView = paintTypefaceListView;
        paintTypefaceListView.setVisibility(8);
        this.typefaceListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda28
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view3, int i6) {
                PaintView.this.lambda$new$7(view3, i6);
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
        this.colorsListView.setColorListener(new Consumer() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda29
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
        this.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda30
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
        this.weightChooserView.setValueOverride(valueOverride);
        this.colorSwatch.brushWeight = valueOverride.get();
        this.weightChooserView.setOnUpdate(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$new$12(i);
            }
        });
        addView(this.weightChooserView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.pipetteContainerLayout = frameLayout5;
        addView(frameLayout5, LayoutHelper.createFrame(-1, -1.0f));
        this.colorSwatchOutlinePaint.setStyle(Paint.Style.STROKE);
        this.colorSwatchOutlinePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setCurrentSwatch(this.colorSwatch, true);
        onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            i5 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        } else {
            i5 = 1;
        }
        this.keyboardNotifier = new KeyboardNotifier(windowView, new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda21
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                PaintView.this.lambda$new$13(windowView, (Integer) obj);
            }
        }) { // from class: org.telegram.ui.Stories.recorder.PaintView.13
            @Override // org.telegram.ui.Stories.recorder.KeyboardNotifier
            public void ignore(boolean z4) {
                super.ignore(z4);
                if (z4) {
                    PaintView.this.showTypefaceMenu(false);
                }
            }
        };
        EmojiBottomSheet.savedPosition = i5;
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
            onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
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
        lambda$registerRemovalUndo$62(this.currentEntityView);
        lambda$createRound$61(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(View view) {
        lambda$createRound$61(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6(int i) {
        this.textOptionsView.setTypeface(PersistColorPalette.getInstance(i).getCurrentTypeface());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7(View view, int i) {
        PaintTypeface paintTypeface = (PaintTypeface) PaintTypeface.get().get(i);
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
            return;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return;
        }
        if (this.editingText) {
            lambda$createRound$61(null);
            return;
        }
        Runnable runnable = this.onCancelButtonClickedListener;
        if (runnable != null) {
            runnable.run();
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
            }).setColorListener(new Consumer() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda50
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    PaintView.this.lambda$new$10(persistColorPalette, (Integer) obj);
                }
            }).show();
        } else {
            Runnable runnable = this.onDoneButtonClickedListener;
            if (runnable != null) {
                runnable.run();
            }
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
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$new$13(StoryRecorder.WindowView windowView, Integer num) {
        boolean z;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i;
        int max = Math.max(0, Math.max(num.intValue() - windowView.getBottomPadding2(), this.emojiPadding - windowView.getPaddingUnderContainer()));
        notifyHeightChanged();
        if (max > 0) {
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
                arrayList.add(ObjectAnimator.ofFloat(paintWeightChooserView, (Property<PaintWeightChooserView, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.bottomLayout, (Property<FrameLayout, Float>) property, max <= 0 ? Math.min(0, (-max) + AndroidUtilities.dp(40.0f)) : 0));
                LinearLayout linearLayout = this.tabsLayout;
                Property property2 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property2, !z ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.doneButton, (Property<PaintDoneView, Float>) property2, (z || this.isColorListShown) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.cancelButton, (Property<PaintCancelView, Float>) property2, (z || this.isColorListShown) ? 1.0f : 0.0f));
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
                if (!z) {
                    showTypefaceMenu(false);
                }
                if (this.wasKeyboardVisible != z) {
                    checkEntitiesIsVideo();
                }
                this.wasKeyboardVisible = z;
            }
        }
        z = false;
        animatorSet = this.keyboardAnimator;
        if (animatorSet != null) {
        }
        this.keyboardAnimator = new AnimatorSet();
        arrayList = new ArrayList();
        PaintWeightChooserView paintWeightChooserView2 = this.weightChooserView;
        Property property3 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(paintWeightChooserView2, (Property<PaintWeightChooserView, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.bottomLayout, (Property<FrameLayout, Float>) property3, max <= 0 ? Math.min(0, (-max) + AndroidUtilities.dp(40.0f)) : 0));
        LinearLayout linearLayout2 = this.tabsLayout;
        Property property22 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property22, !z ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.doneButton, (Property<PaintDoneView, Float>) property22, (z || this.isColorListShown) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.cancelButton, (Property<PaintCancelView, Float>) property22, (z || this.isColorListShown) ? 1.0f : 0.0f));
        updatePreviewViewTranslationY();
        this.keyboardAnimator.playTogether(arrayList);
        if (!z) {
        }
        this.keyboardAnimator.start();
        while (i < arrayList.size()) {
        }
        if (!z) {
        }
        if (this.wasKeyboardVisible != z) {
        }
        this.wasKeyboardVisible = z;
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!this.keyboardNotifier.keyboardVisible() || this.keyboardNotifier.ignoring) && this.emojiPadding <= 0) || (entityView = this.currentEntityView) == null) ? 0.0f : (-(entityView.getPosition().y - (view.getMeasuredHeight() * 0.3f))) * view.getScaleY());
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
        setCurrentSwatch(swatch, true, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda1
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

    private LocationView createLocationSticker(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, boolean z) {
        int i;
        onTextAdd();
        this.forceChanges = true;
        getPaintingSize();
        Point startPositionRelativeToEntity = startPositionRelativeToEntity(null);
        float measuredWidth = this.entitiesView.getMeasuredWidth() <= 0 ? this.w : this.entitiesView.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        LocationView locationView = new LocationView(getContext(), startPositionRelativeToEntity, this.currentAccount, messageMedia, mediaArea, measuredWidth / 240.0f, dp);
        if (startPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            locationView.setStickyX(2);
        }
        if (startPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            locationView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            locationView.setColor(i);
        }
        locationView.setDelegate(this);
        locationView.setMaxWidth(dp);
        this.entitiesView.addView(locationView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            locationView.scale(1.0f / cropState.cropScale);
            locationView.rotate(-(r12.transformRotation + this.currentCropState.cropRotate));
        }
        if (z) {
            registerRemovalUndo(locationView);
            selectEntity(locationView, false);
        }
        return locationView;
    }

    private WeatherView createWeatherView(Weather.State state, boolean z) {
        int i;
        onTextAdd();
        this.forceChanges = true;
        getPaintingSize();
        Point startPositionRelativeToEntity = startPositionRelativeToEntity(null);
        float measuredWidth = this.entitiesView.getMeasuredWidth() <= 0 ? this.w : this.entitiesView.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        WeatherView weatherView = new WeatherView(getContext(), startPositionRelativeToEntity, this.currentAccount, state, measuredWidth / 240.0f, dp);
        if (startPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            weatherView.setStickyX(2);
        }
        if (startPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            weatherView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            weatherView.setColor(i);
        }
        weatherView.setDelegate(this);
        weatherView.setMaxWidth(dp);
        this.entitiesView.addView(weatherView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            weatherView.scale(1.0f / cropState.cropScale);
            weatherView.rotate(-(r11.transformRotation + this.currentCropState.cropRotate));
        }
        if (z) {
            registerRemovalUndo(weatherView);
            selectEntity(weatherView, false);
        }
        return weatherView;
    }

    private LinkView createLinkSticker(LinkPreview.WebPagePreview webPagePreview, TL_stories.MediaArea mediaArea, boolean z) {
        int i;
        onTextAdd();
        this.forceChanges = true;
        getPaintingSize();
        Point startPositionRelativeToEntity = startPositionRelativeToEntity(null);
        float measuredWidth = this.entitiesView.getMeasuredWidth() <= 0 ? this.w : this.entitiesView.getMeasuredWidth();
        int dp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        LinkView linkView = new LinkView(getContext(), startPositionRelativeToEntity, this.currentAccount, webPagePreview, mediaArea, measuredWidth / 360.0f, dp, 3);
        if (startPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            linkView.setStickyX(2);
        }
        if (startPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            linkView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            linkView.setColor(i);
        }
        linkView.setDelegate(this);
        linkView.setMaxWidth(dp);
        this.entitiesView.addView(linkView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            linkView.scale(1.0f / cropState.cropScale);
            linkView.rotate(-(r13.transformRotation + this.currentCropState.cropRotate));
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
        float f = paintingSize.width / 9.0f;
        textPaintView.setMinMaxFontSize((int) (0.5f * f), (int) (f * 2.0f), new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda33
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
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            textPaintView.scale(1.0f / cropState.cropScale);
            textPaintView.rotate(-(r0.transformRotation + this.currentCropState.cropRotate));
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
                onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
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

    protected void editSelectedTextEntity() {
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

    /* renamed from: selectEntity, reason: merged with bridge method [inline-methods] */
    public boolean lambda$createRound$61(EntityView entityView) {
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
        } else {
            if (entityView2 == entityView) {
                if (!entityView.hadMultitouch()) {
                    if (entityView instanceof LocationView) {
                        LocationView locationView = (LocationView) entityView;
                        locationView.setType((locationView.getType() + 1) % locationView.getTypesCount());
                    } else if (entityView instanceof WeatherView) {
                        WeatherView weatherView = (WeatherView) entityView;
                        weatherView.setType((weatherView.getType() + 1) % weatherView.getTypesCount());
                    } else if (entityView instanceof LinkView) {
                        LinkView linkView = (LinkView) entityView;
                        if (linkView.marker.withPreview()) {
                            LinkPreview linkPreview = linkView.marker;
                            linkPreview.setPreviewType(linkPreview.getPreviewType() == 0 ? 1 : 0);
                        } else {
                            linkView.setType(linkView.getNextType());
                        }
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
            }
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
            lambda$registerRemovalUndo$62(entityView5);
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
                this.weightChooserView.setValueOverride(new PaintWeightChooserView.ValueOverride() { // from class: org.telegram.ui.Stories.recorder.PaintView.14
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
            reactionsContainerLayout.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Stories.recorder.PaintView.15
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
            ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(2, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new WrappedResourceProvider(new DarkThemeResourceProvider()) { // from class: org.telegram.ui.Stories.recorder.PaintView.16
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
                private final Path clipPath = new Path();
                BlurringShader.StoryBlurDrawer windowBackgroundBlur;

                @Override // org.telegram.ui.Components.ReactionsContainerLayout.ReactionsContainerDelegate
                public /* synthetic */ boolean allowLongPress() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.-CC.$default$allowLongPress(this);
                }

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
                    if (!z && PaintView.this.blurManager != null && PaintView.this.blurManager.hasRenderNode()) {
                        BlurringShader.StoryBlurDrawer storyBlurDrawer2 = z ? this.windowBackgroundBlur : storyBlurDrawer;
                        this.clipPath.rewind();
                        this.clipPath.addRoundRect(rectF, f, f, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.clipPath);
                        storyBlurDrawer2.drawRect(canvas);
                        paint.setAlpha((int) (i * 0.4f));
                        canvas.drawPaint(paint);
                        canvas.restore();
                        return;
                    }
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
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.reactionShowProgress, z ? 1.0f : 0.0f);
                    this.reactionLayout.setTransitionProgress(this.reactionShowProgress);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda3
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
        if ((view == this.renderView || view == this.renderInputView || view == this.entitiesView || view == this.selectionContainerView) && this.currentCropState != null) {
            canvas.save();
            r1 = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + r1;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            MediaController.CropState cropState = this.currentCropState;
            int i = cropState.transformRotation;
            if (i != 90 && i != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float scaleX = measuredHeight * cropState.cropPw * view.getScaleX();
            MediaController.CropState cropState2 = this.currentCropState;
            int i2 = (int) (scaleX / cropState2.cropScale);
            int scaleY = (int) (((measuredWidth * cropState2.cropPh) * view.getScaleY()) / this.currentCropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - i2) / 2.0f)) + this.transformX;
            float measuredHeight2 = (((((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) + getAdditionalBottom()) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + r1 + this.transformY;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, measuredHeight2), Math.min(ceil + i2, getMeasuredWidth()), Math.min(getMeasuredHeight(), measuredHeight2 + scaleY));
            r1 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (r1 != 0) {
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
        this.drawTab.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda9
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
        this.stickerTab.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda10
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
        this.textTab.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda11
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
            lambda$createRound$61(null);
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
        this.tabsSelectionAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda17
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
        postDelayed(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$openStickersView$21();
            }
        }, 350L);
        final EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(getContext(), false, this.resourcesProvider, false) { // from class: org.telegram.ui.Stories.recorder.PaintView.22
            @Override // org.telegram.ui.ActionBar.BottomSheet
            public void onDismissAnimationStart() {
                super.onDismissAnimationStart();
                PaintView.this.switchTab(i);
            }

            @Override // org.telegram.ui.Stories.recorder.EmojiBottomSheet
            public boolean canShowWidget(Integer num) {
                boolean z = false;
                if (PaintView.this.isBot) {
                    return num.intValue() == 2;
                }
                if (num.intValue() != 5) {
                    return true;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= PaintView.this.entitiesView.getChildCount()) {
                        break;
                    }
                    if (PaintView.this.entitiesView.getChildAt(i2) instanceof WeatherView) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                return !z;
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
                    }
                    if (i2 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                        try {
                            this.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
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
        emojiBottomSheet.setBlurDelegate(new Utilities.Callback2() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda5
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                StoryRecorder.WindowView.this.drawBlurBitmap((Bitmap) obj, ((Float) obj2).floatValue());
            }
        });
        final boolean[] zArr = {true};
        emojiBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.this.lambda$openStickersView$22(zArr, i, dialogInterface);
            }
        });
        emojiBottomSheet.whenDocumentSelected(new Utilities.Callback3Return() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda7
            @Override // org.telegram.messenger.Utilities.Callback3Return
            public final Object run(Object obj, Object obj2, Object obj3) {
                Boolean lambda$openStickersView$23;
                lambda$openStickersView$23 = PaintView.this.lambda$openStickersView$23(obj, (TLRPC.Document) obj2, (Boolean) obj3);
                return lambda$openStickersView$23;
            }
        });
        emojiBottomSheet.whenWidgetSelected(new Utilities.CallbackReturn() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda8
            @Override // org.telegram.messenger.Utilities.CallbackReturn
            public final Object run(Object obj) {
                Boolean lambda$openStickersView$27;
                lambda$openStickersView$27 = PaintView.this.lambda$openStickersView$27(zArr, emojiBottomSheet, (Integer) obj);
                return lambda$openStickersView$27;
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
    public /* synthetic */ Boolean lambda$openStickersView$23(Object obj, TLRPC.Document document, Boolean bool) {
        this.forceChanges = true;
        StickerView createSticker = createSticker(obj, document, false);
        if (bool.booleanValue()) {
            createSticker.setScale(1.5f);
        }
        appearAnimation(createSticker);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$openStickersView$27(boolean[] zArr, final EmojiBottomSheet emojiBottomSheet, Integer num) {
        if (num.intValue() == 0) {
            zArr[0] = false;
            showLocationAlert(null, new Utilities.Callback2() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda53
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    PaintView.this.lambda$openStickersView$24((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                }
            });
            return Boolean.TRUE;
        }
        if (num.intValue() == 5) {
            zArr[0] = false;
            Weather.fetch(true, new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda54
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PaintView.this.lambda$openStickersView$25(emojiBottomSheet, (Weather.State) obj);
                }
            });
            return Boolean.FALSE;
        }
        if (num.intValue() == 2) {
            emojiBottomSheet.lambda$new$0();
            onGalleryClick();
            return Boolean.TRUE;
        }
        if (num.intValue() == 1) {
            zArr[0] = false;
            showAudioAlert(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda55
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    PaintView.this.onAudioSelect((MessageObject) obj);
                }
            });
            return Boolean.TRUE;
        }
        if (num.intValue() == 3) {
            this.forceChanges = true;
            appearAnimation(createReactionWidget(true));
            return Boolean.TRUE;
        }
        if (num.intValue() == 4) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                try {
                    emojiBottomSheet.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                BulletinFactory.of(emojiBottomSheet.container, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda56
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaintView.this.lambda$openStickersView$26();
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
            emojiBottomSheet.lambda$new$0();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openStickersView$24(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        appearAnimation(createLocationSticker(messageMedia, mediaArea, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openStickersView$25(EmojiBottomSheet emojiBottomSheet, Weather.State state) {
        if (state != null) {
            emojiBottomSheet.lambda$new$0();
            onOpenCloseStickersAlert(false);
            appearAnimation(createWeatherView(state, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openStickersView$26() {
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
        StoryLinkSheet storyLinkSheet = new StoryLinkSheet(getContext(), this.resourcesProvider, this.previewView, new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda61
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                PaintView.this.lambda$showLinkAlert$28(linkView, (LinkPreview.WebPagePreview) obj);
            }
        });
        if (linkView != null) {
            storyLinkSheet.set(linkView.link);
        }
        storyLinkSheet.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda62
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.this.lambda$showLinkAlert$29(dialogInterface);
            }
        });
        storyLinkSheet.show();
        onOpenCloseStickersAlert(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLinkAlert$28(LinkView linkView, LinkPreview.WebPagePreview webPagePreview) {
        if (linkView != null) {
            linkView.setLink(this.currentAccount, webPagePreview, null);
            appearAnimation(linkView);
        } else {
            appearAnimation(createLinkSticker(webPagePreview, null, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLinkAlert$29(DialogInterface dialogInterface) {
        onOpenCloseStickersAlert(false);
    }

    class 24 extends ChatActivity {
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
        public TLRPC.User getCurrentUser() {
            return UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.telegram.ui.ChatActivity, org.telegram.ui.LocationActivity.LocationActivityDelegate
        public void didSelectLocation(final TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
            TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint;
            TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2;
            if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
                tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint2.geo = messageMedia.geo;
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                    return;
                }
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia;
                long j2 = tL_messageMediaVenue.query_id;
                if (j2 == -1 || j2 == -2) {
                    final TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint3 = new TL_stories.TL_mediaAreaGeoPoint();
                    tL_mediaAreaGeoPoint3.geo = messageMedia.geo;
                    TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                    tL_mediaAreaGeoPoint3.address = tL_geoPointAddress;
                    if (tL_geoPointAddress != null) {
                        tL_mediaAreaGeoPoint3.flags |= 1;
                    }
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$24$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            PaintView.24.lambda$didSelectLocation$0(TLRPC.MessageMedia.this, tL_mediaAreaGeoPoint3);
                        }
                    });
                    tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
                } else {
                    TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                    tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                    tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                    tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
                }
                tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
            }
            this.val$onLocationSelected.run(messageMedia, tL_mediaAreaGeoPoint2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$didSelectLocation$0(TLRPC.MessageMedia messageMedia, TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint) {
            try {
                List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                if (fromLocationName.size() <= 0) {
                    return;
                }
                tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
            } catch (Exception unused) {
            }
        }
    }

    private void showLocationAlert(LocationView locationView, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), new 24(null, callback2), false, true, false, this.resourcesProvider);
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() { // from class: org.telegram.ui.Stories.recorder.PaintView.25
            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void didSelectBot(TLRPC.User user) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$didSelectBot(this, user);
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
            public /* synthetic */ void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
            }
        });
        if (locationView != null && (messageMedia = locationView.location) != null && (geoPoint = messageMedia.geo) != null) {
            chatAttachAlert.setStoryLocationPicker(geoPoint.lat, geoPoint._long);
        } else if (this.fileFromGallery) {
            chatAttachAlert.setStoryLocationPicker(this.isVideo, this.file);
        } else {
            chatAttachAlert.setStoryLocationPicker();
        }
        chatAttachAlert.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda58
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.this.lambda$showLocationAlert$30(dialogInterface);
            }
        });
        chatAttachAlert.init();
        chatAttachAlert.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationAlert$30(DialogInterface dialogInterface) {
        onOpenCloseStickersAlert(false);
    }

    private void showAudioAlert(final Utilities.Callback callback) {
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), new ChatActivity(null) { // from class: org.telegram.ui.Stories.recorder.PaintView.26
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
            public TLRPC.User getCurrentUser() {
                return UserConfig.getInstance(this.currentAccount).getCurrentUser();
            }

            @Override // org.telegram.ui.ChatActivity
            public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                MessageObject messageObject;
                if (arrayList.isEmpty() || (messageObject = (MessageObject) arrayList.get(0)) == null) {
                    return;
                }
                callback.run(messageObject);
                ChatAttachAlert chatAttachAlert2 = r4[0];
                if (chatAttachAlert2 != null) {
                    chatAttachAlert2.lambda$new$0();
                }
            }
        }, false, true, false, this.resourcesProvider);
        final ChatAttachAlert[] chatAttachAlertArr = {chatAttachAlert};
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() { // from class: org.telegram.ui.Stories.recorder.PaintView.27
            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
            }

            @Override // org.telegram.ui.Components.ChatAttachAlert.ChatAttachViewDelegate
            public /* synthetic */ void didSelectBot(TLRPC.User user) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$didSelectBot(this, user);
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
            public /* synthetic */ void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.-CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
            }
        });
        chatAttachAlertArr[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda57
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.this.lambda$showAudioAlert$31(dialogInterface);
            }
        });
        chatAttachAlertArr[0].setStoryAudioPicker();
        chatAttachAlertArr[0].init();
        chatAttachAlertArr[0].show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAudioAlert$31(DialogInterface dialogInterface) {
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
        float f2 = size;
        if (((float) Math.floor((f2 * currentActionBarHeight) / f)) > currentActionBarHeight2) {
            f2 = (float) Math.floor((r3 * f) / currentActionBarHeight);
        }
        this.baseScale = f2 / this.paintingSize.width;
        EntityView entityView = this.currentEntityView;
        if (entityView != null) {
            entityView.updateSelectionView();
        }
        measureChild(this.bottomLayout, i, i2);
        measureChild(this.weightChooserView, i, i2);
        measureChild(this.pipetteContainerLayout, i, i2);
        measureChild(this.overlayLayout, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.emojiPadding - this.parent.getPaddingUnderContainer(), measureKeyboardHeight()), TLObject.FLAG_30));
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

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto, org.telegram.ui.Components.SizeNotifierFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        ArrayList arrayList = this.initialEntities;
        if (arrayList != null) {
            StoryEntry storyEntry = this.initialEntry;
            this.initialEntry = null;
            this.initialEntities = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i);
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
                    CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, createText.getFontMetricsInt(), false);
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
                    createPhoto.crop = mediaEntity.crop;
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
                    int i3 = mediaEntity.color;
                    if (i3 != 0) {
                        createLocationSticker.setColor(i3);
                    }
                    createLocationSticker.setType(mediaEntity.subType);
                    roundView = createLocationSticker;
                } else if (b == 8) {
                    Weather.State state = mediaEntity.weather;
                    if (state != null) {
                        WeatherView createWeatherView = createWeatherView(state, false);
                        int i4 = mediaEntity.color;
                        if (i4 != 0) {
                            createWeatherView.setColor(i4);
                        }
                        createWeatherView.setType(mediaEntity.subType);
                        roundView = createWeatherView;
                    }
                } else if (b == 7) {
                    LinkView createLinkSticker = createLinkSticker(mediaEntity.linkSettings, mediaEntity.mediaArea, false);
                    int i5 = mediaEntity.color;
                    if (i5 != 0) {
                        createLinkSticker.setColor(i5);
                    }
                    if (createLinkSticker.marker.withPreview()) {
                        createLinkSticker.marker.setPreviewType(mediaEntity.subType);
                    }
                    byte b2 = mediaEntity.subType;
                    if (b2 == -1) {
                        createLinkSticker.setType(3);
                        createLinkSticker.marker.setupLayout();
                        int ceil = createLinkSticker.marker.padx + ((int) Math.ceil(r7.w));
                        LinkPreview linkPreview = createLinkSticker.marker;
                        mediaEntity.viewWidth = ceil + linkPreview.padx;
                        mediaEntity.viewHeight = linkPreview.pady + ((int) Math.ceil(linkPreview.h)) + createLinkSticker.marker.pady;
                        Point position = createLinkSticker.getPosition();
                        position.y += this.h * 0.3f;
                        createLinkSticker.setPosition(position);
                    } else {
                        createLinkSticker.setType(b2);
                        roundView = createLinkSticker;
                    }
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
                roundView.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
            }
            this.entitiesView.setVisibility(0);
        }
    }

    private int getFrameRotation() {
        int i = this.originalBitmapRotation;
        if (i == 90) {
            return 1;
        }
        if (i != 180) {
            return i != 270 ? 0 : 3;
        }
        return 2;
    }

    private boolean isSidewardOrientation() {
        int i = this.originalBitmapRotation % 360;
        return i == 90 || i == 270;
    }

    private void detectFaces() {
        this.queue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$detectFaces$32();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectFaces$32() {
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
                SparseArray detect = faceDetector.detect(new Frame.Builder().setBitmap(this.facesBitmap).setRotation(getFrameRotation()).build());
                ArrayList arrayList = new ArrayList();
                Size paintingSize = getPaintingSize();
                for (i = 0; i < detect.size(); i++) {
                    PhotoFace photoFace = new PhotoFace((Face) detect.get(detect.keyAt(i)), this.facesBitmap, paintingSize, isSidewardOrientation());
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
        this.queue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.lambda$shutdown$33();
            }
        });
        EmojiBottomSheet emojiBottomSheet = this.emojiPopup;
        if (emojiBottomSheet != null) {
            emojiBottomSheet.lambda$new$0();
        }
        ColorPickerBottomSheet colorPickerBottomSheet = this.colorPickerBottomSheet;
        if (colorPickerBottomSheet != null) {
            colorPickerBottomSheet.lambda$new$0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$shutdown$33() {
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

    public static boolean isVideoStickerDocument(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap getBitmap(ArrayList arrayList, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, StoryEntry storyEntry) {
        Bitmap bitmap;
        Bitmap resultBitmap;
        Bitmap createBitmap;
        PaintView paintView;
        Bitmap bitmap2;
        int i3;
        int i4;
        View view;
        boolean z5;
        boolean z6;
        ImageReceiver imageReceiver;
        Bitmap bitmap3;
        Canvas canvas;
        View view2;
        EntityView entityView;
        MessageEntityView messageEntityView;
        boolean z7;
        View view3;
        ImageReceiver imageReceiver2;
        boolean z8;
        TLRPC.Message message;
        ChatActionCell chatActionCell;
        StarGiftUniqueActionLayout starGiftUniqueActionLayout;
        ImageReceiver imageReceiver3;
        ImageReceiver imageReceiver4;
        File saveSegmentedImage;
        float scaleX;
        EntityView entityView2;
        boolean z9;
        boolean z10;
        float radius;
        double d;
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        int i5;
        int i6;
        Spanned spanned;
        boolean z11;
        PaintView paintView2 = this;
        ArrayList arrayList2 = arrayList;
        StoryEntry storyEntry2 = storyEntry;
        int i7 = 0;
        byte b = 1;
        if (z) {
            createBitmap = paintView2.renderView.getResultBitmap(false, z4);
        } else if (z3) {
            createBitmap = Bitmap.createBitmap(Math.max(1, paintView2.entitiesView.getMeasuredWidth()), Math.max(1, paintView2.entitiesView.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else if (z2 && (resultBitmap = paintView2.renderView.getResultBitmap(false, false)) != null) {
            createBitmap = Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        } else {
            bitmap = null;
            paintView2.lcm = BigInteger.ONE;
            if (paintView2.entitiesView.entitiesCount() > 0) {
                int childCount = paintView2.entitiesView.getChildCount();
                int i8 = 0;
                while (i8 < childCount) {
                    View childAt = paintView2.entitiesView.getChildAt(i8);
                    if (childAt instanceof EntityView) {
                        EntityView entityView3 = (EntityView) childAt;
                        entityView3.getPosition();
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        if (arrayList2 != null) {
                            if (entityView3 instanceof TextPaintView) {
                                mediaEntity.type = b;
                                TextPaintView textPaintView = (TextPaintView) entityView3;
                                CharSequence text = textPaintView.getText();
                                if (text instanceof Spanned) {
                                    Spanned spanned2 = (Spanned) text;
                                    AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned2.getSpans(i7, text.length(), AnimatedEmojiSpan.class);
                                    if (animatedEmojiSpanArr != null) {
                                        int i9 = 0;
                                        while (i9 < animatedEmojiSpanArr.length) {
                                            AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i9];
                                            TLRPC.Document document = animatedEmojiSpan.document;
                                            if (document == null) {
                                                i5 = childCount;
                                                i6 = i8;
                                                document = AnimatedEmojiDrawable.findDocument(paintView2.currentAccount, animatedEmojiSpan.getDocumentId());
                                            } else {
                                                i5 = childCount;
                                                i6 = i8;
                                            }
                                            if (document != null) {
                                                AnimatedEmojiDrawable.getDocumentFetcher(paintView2.currentAccount).putDocument(document);
                                            }
                                            VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                            View view4 = childAt;
                                            emojiEntity.document_id = animatedEmojiSpan.getDocumentId();
                                            emojiEntity.document = document;
                                            emojiEntity.offset = spanned2.getSpanStart(animatedEmojiSpan);
                                            emojiEntity.length = spanned2.getSpanEnd(animatedEmojiSpan) - emojiEntity.offset;
                                            emojiEntity.documentAbsolutePath = FileLoader.getInstance(paintView2.currentAccount).getPathToAttach(document, true).getAbsolutePath();
                                            int i10 = 0;
                                            while (document != null) {
                                                ArrayList<TLRPC.PhotoSize> arrayList3 = document.thumbs;
                                                if (arrayList3 == null || arrayList3.isEmpty() || new File(emojiEntity.documentAbsolutePath).exists()) {
                                                    break;
                                                }
                                                spanned = spanned2;
                                                z11 = true;
                                                emojiEntity.documentAbsolutePath = FileLoader.getInstance(paintView2.currentAccount).getPathToAttach(document.thumbs.get(i10), true).getAbsolutePath();
                                                i10++;
                                                if (i10 >= document.thumbs.size()) {
                                                    break;
                                                }
                                                spanned2 = spanned;
                                            }
                                            spanned = spanned2;
                                            z11 = true;
                                            boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, z11);
                                            if (isAnimatedStickerDocument || isVideoStickerDocument(emojiEntity.document)) {
                                                emojiEntity.subType = (byte) ((isAnimatedStickerDocument ? (byte) 1 : (byte) 4) | emojiEntity.subType);
                                            }
                                            if (MessageObject.isTextColorEmoji(emojiEntity.document)) {
                                                emojiEntity.subType = (byte) (emojiEntity.subType | 8);
                                            }
                                            mediaEntity.entities.add(emojiEntity);
                                            if (document != null) {
                                                BigInteger valueOf = BigInteger.valueOf(5000L);
                                                paintView2.lcm = paintView2.lcm.multiply(valueOf).divide(paintView2.lcm.gcd(valueOf));
                                            }
                                            i9++;
                                            childCount = i5;
                                            i8 = i6;
                                            childAt = view4;
                                            spanned2 = spanned;
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
                                if (entityView3 instanceof StickerView) {
                                    mediaEntity.type = (byte) 0;
                                    StickerView stickerView = (StickerView) entityView3;
                                    Size baseSize = stickerView.getBaseSize();
                                    mediaEntity.width = baseSize.width;
                                    mediaEntity.height = baseSize.height;
                                    mediaEntity.document = stickerView.getSticker();
                                    mediaEntity.parentObject = stickerView.getParentObject();
                                    TLRPC.Document sticker = stickerView.getSticker();
                                    mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                    if (MessageObject.isAnimatedStickerDocument(sticker, true) || isVideoStickerDocument(sticker)) {
                                        boolean isAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                        mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                        r21 = (isAnimatedStickerDocument2 || isVideoStickerDocument(sticker)) ? stickerView.getDuration() : 5000L;
                                        if (r21 != 0) {
                                            BigInteger valueOf2 = BigInteger.valueOf(r21);
                                            paintView2.lcm = paintView2.lcm.multiply(valueOf2).divide(paintView2.lcm.gcd(valueOf2));
                                        }
                                    }
                                    if (MessageObject.isTextColorEmoji(sticker)) {
                                        mediaEntity.color = -1;
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                    }
                                    if (stickerView.isMirrored()) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                } else if (entityView3 instanceof PhotoView) {
                                    PhotoView photoView = (PhotoView) entityView3;
                                    mediaEntity.type = (byte) 2;
                                    Size baseSize2 = photoView.getBaseSize();
                                    mediaEntity.width = baseSize2.width;
                                    mediaEntity.height = baseSize2.height;
                                    mediaEntity.text = photoView.getPath(paintView2.currentAccount);
                                    mediaEntity.crop = photoView.crop;
                                    if (photoView.isMirrored()) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                    if (photoView.hasSegmentedImage() && photoView.isSegmented() && (saveSegmentedImage = photoView.saveSegmentedImage(paintView2.currentAccount)) != null) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 16);
                                        mediaEntity.segmentedPath = saveSegmentedImage.getPath();
                                    }
                                } else if (entityView3 instanceof LocationView) {
                                    LocationView locationView = (LocationView) entityView3;
                                    mediaEntity.type = (byte) 3;
                                    mediaEntity.subType = (byte) locationView.getType();
                                    mediaEntity.width = locationView.marker.getWidth();
                                    mediaEntity.height = locationView.marker.getHeight();
                                    mediaEntity.text = locationView.marker.getText();
                                    mediaEntity.color = locationView.hasColor() ? locationView.getColor() : 0;
                                    mediaEntity.density = locationView.marker.density;
                                    mediaEntity.media = locationView.location;
                                    TL_stories.MediaArea mediaArea2 = locationView.mediaArea;
                                    mediaEntity.mediaArea = mediaArea2;
                                    mediaArea2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    TLRPC.Document codeEmojiDocument = locationView.marker.getCodeEmojiDocument();
                                    if (codeEmojiDocument != null) {
                                        VideoEditedInfo.EmojiEntity emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                        emojiEntity2.document_id = codeEmojiDocument.id;
                                        emojiEntity2.document = codeEmojiDocument;
                                        emojiEntity2.documentAbsolutePath = FileLoader.getInstance(paintView2.currentAccount).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                        boolean isAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                        if (isAnimatedStickerDocument3 || isVideoStickerDocument(emojiEntity2.document)) {
                                            emojiEntity2.subType = (byte) (emojiEntity2.subType | (isAnimatedStickerDocument3 ? (byte) 1 : (byte) 4));
                                        }
                                        mediaEntity.entities.add(emojiEntity2);
                                    }
                                } else if (entityView3 instanceof WeatherView) {
                                    WeatherView weatherView = (WeatherView) entityView3;
                                    mediaEntity.type = (byte) 8;
                                    mediaEntity.subType = (byte) weatherView.getType();
                                    mediaEntity.width = weatherView.marker.getWidth();
                                    mediaEntity.height = weatherView.marker.getHeight();
                                    mediaEntity.text = weatherView.marker.getText();
                                    mediaEntity.color = weatherView.hasColor() ? weatherView.getColor() : 0;
                                    mediaEntity.density = weatherView.marker.density;
                                    mediaEntity.weather = weatherView.weather;
                                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                    tL_mediaAreaWeather.emoji = weatherView.weather.emoji;
                                    tL_mediaAreaWeather.temperature_c = Math.round(r6.temperature);
                                    tL_mediaAreaWeather.color = weatherView.marker.outlinePaint.getColor();
                                    mediaEntity.mediaArea = tL_mediaAreaWeather;
                                    tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    TLRPC.Document codeEmojiDocument2 = weatherView.marker.getCodeEmojiDocument();
                                    if (codeEmojiDocument2 != null) {
                                        VideoEditedInfo.EmojiEntity emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                        emojiEntity3.document_id = codeEmojiDocument2.id;
                                        emojiEntity3.document = codeEmojiDocument2;
                                        emojiEntity3.documentAbsolutePath = FileLoader.getInstance(paintView2.currentAccount).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                        boolean isAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, true);
                                        if (isAnimatedStickerDocument4 || isVideoStickerDocument(emojiEntity3.document)) {
                                            emojiEntity3.subType = (byte) (emojiEntity3.subType | (isAnimatedStickerDocument4 ? (byte) 1 : (byte) 4));
                                        }
                                        mediaEntity.entities.add(emojiEntity3);
                                    }
                                    entityView = entityView3;
                                    bitmap2 = bitmap;
                                    z7 = false;
                                    z8 = false;
                                    imageReceiver = null;
                                    paintView = paintView2;
                                    arrayList2.add(mediaEntity);
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
                                    mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                    mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x) / paintView.entitiesView.getMeasuredWidth();
                                    mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y) / paintView.entitiesView.getMeasuredHeight();
                                    mediaEntity.textViewWidth = mediaEntity.viewWidth / paintView.entitiesView.getMeasuredWidth();
                                    mediaEntity.textViewHeight = mediaEntity.viewHeight / paintView.entitiesView.getMeasuredHeight();
                                    mediaEntity.scale = scaleX;
                                    entityView2 = entityView;
                                    if (!(entityView2 instanceof MessageEntityView)) {
                                        MessageEntityView messageEntityView2 = (MessageEntityView) entityView2;
                                        RectF rectF = AndroidUtilities.rectTmp;
                                        d = messageEntityView2.getBubbleBounds(rectF);
                                        z9 = z7;
                                        rectF.offset(messageEntityView2.container.getX(), messageEntityView2.container.getY());
                                        rectF.offset(messageEntityView2.listView.getX(), messageEntityView2.listView.getY());
                                        mediaEntity.mediaArea.coordinates.x = ((((x + (view.getWidth() / 2.0f)) - ((view.getWidth() / 2.0f) * scaleX)) + (rectF.centerX() * scaleX)) / paintView.entitiesView.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.y = ((((y + (view.getHeight() / 2.0f)) - ((view.getHeight() / 2.0f) * scaleY)) + (rectF.centerY() * scaleY)) / paintView.entitiesView.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / paintView.entitiesView.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / paintView.entitiesView.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                    } else {
                                        z9 = z7;
                                        if (entityView2 instanceof StickerView) {
                                            float imageAspectRatio = ((StickerView) entityView2).centerImage.getImageAspectRatio();
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
                                            TL_stories.MediaArea mediaArea3 = mediaEntity.mediaArea;
                                            if (mediaArea3 != null && (((z10 = entityView2 instanceof LocationView)) || (entityView2 instanceof WeatherView) || (entityView2 instanceof LinkView) || (entityView2 instanceof ReactionWidgetEntityView))) {
                                                TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea3.coordinates;
                                                float f5 = mediaEntity.x;
                                                float f6 = mediaEntity.width;
                                                mediaAreaCoordinates2.x = (f5 + (f6 / 2.0f)) * 100.0f;
                                                mediaAreaCoordinates2.y = (mediaEntity.y + (mediaEntity.height / 2.0f)) * 100.0f;
                                                if (z10) {
                                                    LocationView locationView2 = (LocationView) entityView2;
                                                    mediaAreaCoordinates2.w = (f6 - (((locationView2.marker.padx * 2) * scaleX) / paintView.entitiesView.getMeasuredWidth())) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = (mediaEntity.height - (((locationView2.marker.pady * 2) * scaleY) / paintView.entitiesView.getMeasuredHeight())) * 100.0f;
                                                } else if (entityView2 instanceof WeatherView) {
                                                    WeatherView weatherView2 = (WeatherView) entityView2;
                                                    mediaAreaCoordinates2.w = (f6 - (((weatherView2.marker.padx * 2) * scaleX) / paintView.entitiesView.getMeasuredWidth())) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = (mediaEntity.height - (((weatherView2.marker.pady * 2) * scaleY) / paintView.entitiesView.getMeasuredHeight())) * 100.0f;
                                                } else if (entityView2 instanceof LinkView) {
                                                    LinkView linkView = (LinkView) entityView2;
                                                    mediaAreaCoordinates2.w = (f6 - (((linkView.marker.padx * 2) * scaleX) / paintView.entitiesView.getMeasuredWidth())) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = (mediaEntity.height - (((linkView.marker.pady * 2) * scaleY) / paintView.entitiesView.getMeasuredHeight())) * 100.0f;
                                                } else if (entityView2 instanceof ReactionWidgetEntityView) {
                                                    ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) entityView2;
                                                    float padding = ((reactionWidgetEntityView.getPadding() * 2) * scaleX) / paintView.entitiesView.getMeasuredWidth();
                                                    float padding2 = ((reactionWidgetEntityView.getPadding() * 2) * scaleX) / paintView.entitiesView.getMeasuredHeight();
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                    mediaAreaCoordinates3.w = (mediaEntity.width - padding) * 100.0f;
                                                    mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                }
                                                mediaEntity.mediaArea.coordinates.rotation = ((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d;
                                                if (z10) {
                                                    radius = ((LocationView) entityView2).marker.getRadius();
                                                } else if (entityView2 instanceof WeatherView) {
                                                    radius = ((WeatherView) entityView2).marker.getRadius();
                                                } else if (entityView2 instanceof LinkView) {
                                                    radius = ((LinkView) entityView2).marker.getRadius();
                                                }
                                                d = radius;
                                            }
                                        }
                                        d = -1.0d;
                                    }
                                    mediaArea = mediaEntity.mediaArea;
                                    if (mediaArea != null && (mediaAreaCoordinates = mediaArea.coordinates) != null && d > 0.0d) {
                                        mediaAreaCoordinates.flags |= 1;
                                        mediaAreaCoordinates.radius = ((scaleX * d) / paintView.entitiesView.getMeasuredWidth()) * 100.0d;
                                    }
                                    z5 = z8;
                                    z6 = z9;
                                } else {
                                    if (entityView3 instanceof LinkView) {
                                        LinkView linkView2 = (LinkView) entityView3;
                                        mediaEntity.type = (byte) 7;
                                        if (linkView2.marker.withPreview()) {
                                            mediaEntity.subType = (byte) linkView2.marker.getPreviewType();
                                        } else {
                                            mediaEntity.subType = (byte) linkView2.getType();
                                        }
                                        mediaEntity.width = linkView2.marker.getWidth();
                                        mediaEntity.height = linkView2.marker.getHeight();
                                        mediaEntity.color = linkView2.hasColor() ? linkView2.getColor() : 0;
                                        LinkPreview linkPreview = linkView2.marker;
                                        mediaEntity.density = linkPreview.density;
                                        mediaEntity.linkSettings = linkView2.link;
                                        if (linkPreview.hasPhoto) {
                                            linkPreview.pushPhotoToCache();
                                            LinkPreview.WebPagePreview webPagePreview = mediaEntity.linkSettings;
                                            webPagePreview.flags |= 4;
                                            webPagePreview.photoSize = linkView2.marker.getPhotoSide();
                                        }
                                        TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                        mediaEntity.mediaArea = tL_mediaAreaUrl;
                                        LinkPreview.WebPagePreview webPagePreview2 = linkView2.link;
                                        if (webPagePreview2 != null) {
                                            TLRPC.WebPage webPage = webPagePreview2.webpage;
                                            tL_mediaAreaUrl.url = (webPage == null || TextUtils.isEmpty(webPage.url)) ? linkView2.link.url : linkView2.link.webpage.url;
                                            mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        }
                                    } else {
                                        if (entityView3 instanceof ReactionWidgetEntityView) {
                                            ReactionWidgetEntityView reactionWidgetEntityView2 = (ReactionWidgetEntityView) entityView3;
                                            mediaEntity.type = (byte) 4;
                                            TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                            mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                            tL_mediaAreaSuggestedReaction.reaction = ReactionsUtils.toTLReaction(reactionWidgetEntityView2.getCurrentReaction());
                                            mediaEntity.mediaArea.dark = reactionWidgetEntityView2.isDark();
                                            mediaEntity.mediaArea.flipped = reactionWidgetEntityView2.isMirrored();
                                            mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                        } else if (entityView3 instanceof RoundView) {
                                            RoundView roundView = (RoundView) entityView3;
                                            Size baseSize3 = roundView.getBaseSize();
                                            mediaEntity.width = baseSize3.width;
                                            mediaEntity.height = baseSize3.height;
                                            mediaEntity.type = (byte) 5;
                                            if (storyEntry2 != null) {
                                                mediaEntity.text = storyEntry2.round.getAbsolutePath();
                                                mediaEntity.roundOffset = storyEntry2.roundOffset;
                                                long j = storyEntry2.roundDuration;
                                                mediaEntity.roundDuration = j;
                                                float f7 = j;
                                                mediaEntity.roundLeft = (long) (storyEntry2.roundLeft * f7);
                                                mediaEntity.roundRight = (long) (storyEntry2.roundRight * f7);
                                            }
                                            mediaEntity.subType = (byte) 4;
                                            if (roundView.isMirrored()) {
                                                mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                            }
                                        } else if (entityView3 instanceof MessageEntityView) {
                                            MessageEntityView messageEntityView3 = (MessageEntityView) entityView3;
                                            mediaEntity.type = (byte) 6;
                                            int width = messageEntityView3.getWidth();
                                            mediaEntity.viewWidth = width;
                                            mediaEntity.width = width;
                                            int height = messageEntityView3.getHeight();
                                            mediaEntity.viewHeight = height;
                                            mediaEntity.height = height;
                                            MessageObject messageObject = messageEntityView3.messageObjects.size() > 0 ? (MessageObject) messageEntityView3.messageObjects.get(0) : null;
                                            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                                                TLRPC.MessageAction messageAction = message.action;
                                                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                    TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                    TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                    mediaEntity.mediaArea = tL_mediaAreaStarGift;
                                                    tL_mediaAreaStarGift.slug = starGift.slug;
                                                    tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 >= messageEntityView3.listView.getChildCount()) {
                                                            chatActionCell = null;
                                                            break;
                                                        }
                                                        View childAt2 = messageEntityView3.listView.getChildAt(i11);
                                                        if (childAt2 instanceof ChatActionCell) {
                                                            chatActionCell = (ChatActionCell) childAt2;
                                                            break;
                                                        }
                                                        i11++;
                                                    }
                                                    if (chatActionCell != null && (starGiftUniqueActionLayout = chatActionCell.starGiftLayout) != null && (imageReceiver3 = starGiftUniqueActionLayout.imageReceiver) != null) {
                                                        imageReceiver3.setVisible(false, false);
                                                        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                        if (stargiftattributemodel != null) {
                                                            float dp = AndroidUtilities.dp(110.0f);
                                                            float x2 = messageEntityView3.listView.getX() + chatActionCell.getX() + chatActionCell.starGiftLayoutX + imageReceiver3.getCenterX();
                                                            float y2 = messageEntityView3.listView.getY() + chatActionCell.getY() + chatActionCell.starGiftLayoutY + imageReceiver3.getCenterY();
                                                            VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                            mediaEntity2.type = (byte) 0;
                                                            mediaEntity2.width = dp;
                                                            mediaEntity2.height = dp;
                                                            TLRPC.Document document2 = stargiftattributemodel.document;
                                                            mediaEntity2.document = document2;
                                                            mediaEntity2.parentObject = starGift;
                                                            mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document2, true).getAbsolutePath();
                                                            if (MessageObject.isAnimatedStickerDocument(document2, true) || isVideoStickerDocument(document2)) {
                                                                boolean isAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document2, true);
                                                                mediaEntity2.subType = (byte) (mediaEntity2.subType | (isAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                RLottieDrawable lottieAnimation = imageReceiver3.getLottieAnimation();
                                                                if (lottieAnimation != null && (isAnimatedStickerDocument5 || isVideoStickerDocument(document2))) {
                                                                    r21 = lottieAnimation.getDuration();
                                                                }
                                                                if (r21 != 0) {
                                                                    BigInteger valueOf3 = BigInteger.valueOf(r21);
                                                                    paintView2.lcm = paintView2.lcm.multiply(valueOf3).divide(paintView2.lcm.gcd(valueOf3));
                                                                }
                                                            }
                                                            float scaleX2 = view.getScaleX();
                                                            float scaleY2 = view.getScaleY();
                                                            float x3 = view.getX();
                                                            float y3 = view.getY();
                                                            imageReceiver4 = imageReceiver3;
                                                            int i12 = (int) dp;
                                                            mediaEntity2.viewWidth = i12;
                                                            mediaEntity2.viewHeight = i12;
                                                            bitmap2 = bitmap;
                                                            mediaEntity2.width = (dp * scaleX2) / paintView2.entitiesView.getMeasuredWidth();
                                                            mediaEntity2.height = (dp * scaleY2) / paintView2.entitiesView.getMeasuredHeight();
                                                            mediaEntity2.x = x3 + (view.getWidth() / 2.0f);
                                                            mediaEntity2.y = y3 + (view.getHeight() / 2.0f);
                                                            messageEntityView = messageEntityView3;
                                                            double width2 = (x2 * scaleX2) - ((view.getWidth() / 2.0f) * scaleX2);
                                                            entityView = entityView3;
                                                            double rotation = (float) ((view.getRotation() / 180.0f) * 3.141592653589793d);
                                                            double height2 = (y2 * scaleY2) - ((view.getHeight() / 2.0f) * scaleY2);
                                                            mediaEntity2.x = (float) (mediaEntity2.x + ((Math.cos(rotation) * width2) - (Math.sin(rotation) * height2)));
                                                            float sin = (float) (mediaEntity2.y + (width2 * Math.sin(rotation)) + (height2 * Math.cos(rotation)));
                                                            float f8 = (-dp) / 2.0f;
                                                            float f9 = mediaEntity2.x + (f8 * scaleX2);
                                                            mediaEntity2.x = f9;
                                                            mediaEntity2.y = sin + (f8 * scaleY2);
                                                            paintView = this;
                                                            mediaEntity2.x = f9 / paintView.entitiesView.getMeasuredWidth();
                                                            mediaEntity2.y /= paintView.entitiesView.getMeasuredHeight();
                                                            mediaEntity2.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                            mediaEntity2.scale = scaleX2;
                                                            arrayList2.add(mediaEntity2);
                                                        } else {
                                                            entityView = entityView3;
                                                            paintView = paintView2;
                                                            messageEntityView = messageEntityView3;
                                                            bitmap2 = bitmap;
                                                            imageReceiver4 = imageReceiver3;
                                                        }
                                                        imageReceiver = imageReceiver4;
                                                        if (z3) {
                                                        }
                                                        z8 = true;
                                                        arrayList2.add(mediaEntity);
                                                        scaleX = view.getScaleX();
                                                        float scaleY3 = view.getScaleY();
                                                        float x4 = view.getX();
                                                        float y4 = view.getY();
                                                        mediaEntity.viewWidth = view.getWidth();
                                                        mediaEntity.viewHeight = view.getHeight();
                                                        mediaEntity.width = (view.getWidth() * scaleX) / paintView.entitiesView.getMeasuredWidth();
                                                        mediaEntity.height = (view.getHeight() * scaleY3) / paintView.entitiesView.getMeasuredHeight();
                                                        mediaEntity.x = (((view.getWidth() * (1.0f - scaleX)) / 2.0f) + x4) / paintView.entitiesView.getMeasuredWidth();
                                                        mediaEntity.y = (((view.getHeight() * (1.0f - scaleY3)) / 2.0f) + y4) / paintView.entitiesView.getMeasuredHeight();
                                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x4) / paintView.entitiesView.getMeasuredWidth();
                                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y4) / paintView.entitiesView.getMeasuredHeight();
                                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / paintView.entitiesView.getMeasuredWidth();
                                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / paintView.entitiesView.getMeasuredHeight();
                                                        mediaEntity.scale = scaleX;
                                                        entityView2 = entityView;
                                                        if (!(entityView2 instanceof MessageEntityView)) {
                                                        }
                                                        mediaArea = mediaEntity.mediaArea;
                                                        if (mediaArea != null) {
                                                        }
                                                        z5 = z8;
                                                        z6 = z9;
                                                    } else {
                                                        entityView = entityView3;
                                                        paintView = paintView2;
                                                        messageEntityView = messageEntityView3;
                                                        bitmap2 = bitmap;
                                                        imageReceiver = null;
                                                        if (z3) {
                                                            if (storyEntry != null && storyEntry.isVideo) {
                                                                storyEntry.matrix.reset();
                                                                MessageEntityView messageEntityView4 = messageEntityView;
                                                                if (messageEntityView4.listView.getChildCount() == 1) {
                                                                    view3 = messageEntityView4.listView.getChildAt(0);
                                                                    if (view3 instanceof ChatMessageCell) {
                                                                        imageReceiver2 = ((ChatMessageCell) view3).getPhotoImage();
                                                                        if (imageReceiver2 != null) {
                                                                            float max = Math.max(imageReceiver2.getImageWidth() / Math.max(1, storyEntry.width), imageReceiver2.getImageHeight() / Math.max(1, storyEntry.height));
                                                                            storyEntry.matrix.postScale(max, max);
                                                                            storyEntry.matrix.postTranslate(imageReceiver2.getCenterX() - ((storyEntry.width * max) / 2.0f), imageReceiver2.getCenterY() - ((storyEntry.height * max) / 2.0f));
                                                                            storyEntry.matrix.postTranslate(messageEntityView4.container.getX(), messageEntityView4.container.getY());
                                                                            storyEntry.matrix.postTranslate(messageEntityView4.listView.getX(), messageEntityView4.listView.getY());
                                                                            storyEntry.matrix.postTranslate(view3.getX(), view3.getY());
                                                                            storyEntry.matrix.postScale(messageEntityView4.getScaleX(), messageEntityView4.getScaleY(), messageEntityView4.getPivotX(), messageEntityView4.getPivotY());
                                                                            storyEntry.matrix.postRotate(messageEntityView4.getRotation(), messageEntityView4.getPivotX(), messageEntityView4.getPivotY());
                                                                            storyEntry.matrix.postTranslate(messageEntityView4.getX(), messageEntityView4.getY());
                                                                            storyEntry.matrix.postScale(1.0f / paintView.entitiesView.getWidth(), 1.0f / paintView.entitiesView.getHeight());
                                                                            storyEntry.matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                                        }
                                                                    }
                                                                } else {
                                                                    view3 = null;
                                                                }
                                                                imageReceiver2 = null;
                                                                if (imageReceiver2 != null) {
                                                                }
                                                            }
                                                            z7 = false;
                                                        } else {
                                                            z7 = true;
                                                        }
                                                        z8 = true;
                                                        arrayList2.add(mediaEntity);
                                                        scaleX = view.getScaleX();
                                                        float scaleY32 = view.getScaleY();
                                                        float x42 = view.getX();
                                                        float y42 = view.getY();
                                                        mediaEntity.viewWidth = view.getWidth();
                                                        mediaEntity.viewHeight = view.getHeight();
                                                        mediaEntity.width = (view.getWidth() * scaleX) / paintView.entitiesView.getMeasuredWidth();
                                                        mediaEntity.height = (view.getHeight() * scaleY32) / paintView.entitiesView.getMeasuredHeight();
                                                        mediaEntity.x = (((view.getWidth() * (1.0f - scaleX)) / 2.0f) + x42) / paintView.entitiesView.getMeasuredWidth();
                                                        mediaEntity.y = (((view.getHeight() * (1.0f - scaleY32)) / 2.0f) + y42) / paintView.entitiesView.getMeasuredHeight();
                                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x42) / paintView.entitiesView.getMeasuredWidth();
                                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y42) / paintView.entitiesView.getMeasuredHeight();
                                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / paintView.entitiesView.getMeasuredWidth();
                                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / paintView.entitiesView.getMeasuredHeight();
                                                        mediaEntity.scale = scaleX;
                                                        entityView2 = entityView;
                                                        if (!(entityView2 instanceof MessageEntityView)) {
                                                        }
                                                        mediaArea = mediaEntity.mediaArea;
                                                        if (mediaArea != null) {
                                                            mediaAreaCoordinates.flags |= 1;
                                                            mediaAreaCoordinates.radius = ((scaleX * d) / paintView.entitiesView.getMeasuredWidth()) * 100.0d;
                                                        }
                                                        z5 = z8;
                                                        z6 = z9;
                                                    }
                                                }
                                            }
                                            entityView = entityView3;
                                            paintView = paintView2;
                                            messageEntityView = messageEntityView3;
                                            bitmap2 = bitmap;
                                            if (messageObject != null) {
                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(paintView.currentAccount).getInputChannel(-StoryEntry.getRepostDialogId(messageObject));
                                                ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).msg_id = StoryEntry.getRepostMessageId(messageObject);
                                            } else {
                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                mediaEntity.mediaArea = tL_inputMediaAreaChannelPost2;
                                                tL_inputMediaAreaChannelPost2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                            imageReceiver = null;
                                            if (z3) {
                                            }
                                            z8 = true;
                                            arrayList2.add(mediaEntity);
                                            scaleX = view.getScaleX();
                                            float scaleY322 = view.getScaleY();
                                            float x422 = view.getX();
                                            float y422 = view.getY();
                                            mediaEntity.viewWidth = view.getWidth();
                                            mediaEntity.viewHeight = view.getHeight();
                                            mediaEntity.width = (view.getWidth() * scaleX) / paintView.entitiesView.getMeasuredWidth();
                                            mediaEntity.height = (view.getHeight() * scaleY322) / paintView.entitiesView.getMeasuredHeight();
                                            mediaEntity.x = (((view.getWidth() * (1.0f - scaleX)) / 2.0f) + x422) / paintView.entitiesView.getMeasuredWidth();
                                            mediaEntity.y = (((view.getHeight() * (1.0f - scaleY322)) / 2.0f) + y422) / paintView.entitiesView.getMeasuredHeight();
                                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x422) / paintView.entitiesView.getMeasuredWidth();
                                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y422) / paintView.entitiesView.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / paintView.entitiesView.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / paintView.entitiesView.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            entityView2 = entityView;
                                            if (!(entityView2 instanceof MessageEntityView)) {
                                            }
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea != null) {
                                            }
                                            z5 = z8;
                                            z6 = z9;
                                        }
                                        entityView = entityView3;
                                        bitmap2 = bitmap;
                                        z7 = true;
                                        z8 = true;
                                        imageReceiver = null;
                                        paintView = paintView2;
                                        arrayList2.add(mediaEntity);
                                        scaleX = view.getScaleX();
                                        float scaleY3222 = view.getScaleY();
                                        float x4222 = view.getX();
                                        float y4222 = view.getY();
                                        mediaEntity.viewWidth = view.getWidth();
                                        mediaEntity.viewHeight = view.getHeight();
                                        mediaEntity.width = (view.getWidth() * scaleX) / paintView.entitiesView.getMeasuredWidth();
                                        mediaEntity.height = (view.getHeight() * scaleY3222) / paintView.entitiesView.getMeasuredHeight();
                                        mediaEntity.x = (((view.getWidth() * (1.0f - scaleX)) / 2.0f) + x4222) / paintView.entitiesView.getMeasuredWidth();
                                        mediaEntity.y = (((view.getHeight() * (1.0f - scaleY3222)) / 2.0f) + y4222) / paintView.entitiesView.getMeasuredHeight();
                                        mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x4222) / paintView.entitiesView.getMeasuredWidth();
                                        mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y4222) / paintView.entitiesView.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / paintView.entitiesView.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / paintView.entitiesView.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        entityView2 = entityView;
                                        if (!(entityView2 instanceof MessageEntityView)) {
                                        }
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea != null) {
                                        }
                                        z5 = z8;
                                        z6 = z9;
                                    }
                                    paintView = paintView2;
                                    bitmap3 = bitmap;
                                }
                            }
                            entityView = entityView3;
                            bitmap2 = bitmap;
                            z7 = false;
                            z8 = true;
                            imageReceiver = null;
                            paintView = paintView2;
                            arrayList2.add(mediaEntity);
                            scaleX = view.getScaleX();
                            float scaleY32222 = view.getScaleY();
                            float x42222 = view.getX();
                            float y42222 = view.getY();
                            mediaEntity.viewWidth = view.getWidth();
                            mediaEntity.viewHeight = view.getHeight();
                            mediaEntity.width = (view.getWidth() * scaleX) / paintView.entitiesView.getMeasuredWidth();
                            mediaEntity.height = (view.getHeight() * scaleY32222) / paintView.entitiesView.getMeasuredHeight();
                            mediaEntity.x = (((view.getWidth() * (1.0f - scaleX)) / 2.0f) + x42222) / paintView.entitiesView.getMeasuredWidth();
                            mediaEntity.y = (((view.getHeight() * (1.0f - scaleY32222)) / 2.0f) + y42222) / paintView.entitiesView.getMeasuredHeight();
                            mediaEntity.rotation = (float) ((-view.getRotation()) * 0.017453292519943295d);
                            mediaEntity.textViewX = ((view.getWidth() / 2.0f) + x42222) / paintView.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewY = ((view.getHeight() / 2.0f) + y42222) / paintView.entitiesView.getMeasuredHeight();
                            mediaEntity.textViewWidth = mediaEntity.viewWidth / paintView.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewHeight = mediaEntity.viewHeight / paintView.entitiesView.getMeasuredHeight();
                            mediaEntity.scale = scaleX;
                            entityView2 = entityView;
                            if (!(entityView2 instanceof MessageEntityView)) {
                            }
                            mediaArea = mediaEntity.mediaArea;
                            if (mediaArea != null) {
                            }
                            z5 = z8;
                            z6 = z9;
                        } else {
                            paintView = paintView2;
                            bitmap2 = bitmap;
                            i3 = childCount;
                            i4 = i8;
                            view = childAt;
                            z5 = true;
                            z6 = false;
                            imageReceiver = null;
                        }
                        if (!z5 || (!(z2 || (z3 && mediaEntity.type == 6)) || bitmap2 == null)) {
                            bitmap3 = bitmap2;
                        } else {
                            bitmap3 = bitmap2;
                            Canvas canvas2 = new Canvas(bitmap3);
                            float width3 = bitmap3.getWidth() / paintView.entitiesView.getMeasuredWidth();
                            int i13 = 0;
                            while (i13 < 2) {
                                Canvas canvas3 = i13 == 0 ? canvas2 : null;
                                if (canvas3 == null || (i13 == 0 && z6)) {
                                    canvas = canvas2;
                                    view2 = view;
                                } else {
                                    canvas3.save();
                                    canvas3.scale(width3, width3);
                                    canvas3.translate(mediaEntity.x * paintView.entitiesView.getMeasuredWidth(), mediaEntity.y * paintView.entitiesView.getMeasuredHeight());
                                    canvas3.scale(view.getScaleX(), view.getScaleY());
                                    canvas3.rotate(view.getRotation(), ((mediaEntity.width / 2.0f) / view.getScaleX()) * paintView.entitiesView.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / view.getScaleY()) * paintView.entitiesView.getMeasuredHeight());
                                    view2 = view;
                                    if ((view2 instanceof TextPaintView) && view2.getHeight() > 0 && view2.getWidth() > 0) {
                                        int width4 = (int) (view2.getWidth() * view2.getScaleX());
                                        int height3 = (int) (view2.getHeight() * view2.getScaleY());
                                        Bitmap createBitmap2 = Bitmaps.createBitmap(width4, height3, Bitmap.Config.ARGB_8888);
                                        Canvas canvas4 = new Canvas(createBitmap2);
                                        canvas4.scale(view2.getScaleX(), view2.getScaleY());
                                        view2.draw(canvas4);
                                        canvas = canvas2;
                                        canvas3.scale(1.0f / view2.getScaleX(), 1.0f / view2.getScaleY());
                                        canvas3.drawBitmap(createBitmap2, (Rect) null, new Rect(0, 0, width4, height3), new Paint(3));
                                        try {
                                            canvas4.setBitmap(null);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        createBitmap2.recycle();
                                    } else {
                                        canvas = canvas2;
                                        if (view2 instanceof MessageEntityView) {
                                            MessageEntityView messageEntityView5 = (MessageEntityView) view2;
                                            messageEntityView5.prepareToDraw(true);
                                            view2.draw(canvas3);
                                            messageEntityView5.prepareToDraw(false);
                                        } else {
                                            view2.draw(canvas3);
                                        }
                                    }
                                    canvas3.restore();
                                }
                                i13++;
                                canvas2 = canvas;
                                view = view2;
                            }
                            if (imageReceiver != null) {
                                imageReceiver.setVisible(true, false);
                            }
                            i8 = i4 + 1;
                            bitmap = bitmap3;
                            paintView2 = paintView;
                            childCount = i3;
                            i7 = 0;
                            b = 1;
                            arrayList2 = arrayList;
                            storyEntry2 = storyEntry;
                        }
                    } else {
                        paintView = paintView2;
                        bitmap3 = bitmap;
                        i3 = childCount;
                        i4 = i8;
                    }
                    i8 = i4 + 1;
                    bitmap = bitmap3;
                    paintView2 = paintView;
                    childCount = i3;
                    i7 = 0;
                    b = 1;
                    arrayList2 = arrayList;
                    storyEntry2 = storyEntry;
                }
            }
            return bitmap;
        }
        bitmap = createBitmap;
        paintView2.lcm = BigInteger.ONE;
        if (paintView2.entitiesView.entitiesCount() > 0) {
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

    public void setCoverPreview(boolean z) {
        if (this.isCoverPreview != z) {
            this.isCoverPreview = z;
            if (z) {
                lambda$createRound$61(null);
            }
            setCoverPause(z);
        }
    }

    private void setCoverPause(boolean z) {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof StickerView) {
                ImageReceiver imageReceiver = ((StickerView) childAt).centerImage;
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                AnimatedFileDrawable animation = imageReceiver.getAnimation();
                boolean z2 = !z;
                imageReceiver.setAllowStartLottieAnimation(z2);
                imageReceiver.setAllowStartAnimation(z2);
                if (lottieAnimation != null) {
                    if (z) {
                        lottieAnimation.stop();
                    } else {
                        lottieAnimation.start();
                    }
                } else if (animation != null) {
                    animation.setAllowDecodeSingleFrame(z);
                    if (z) {
                        animation.stop();
                    } else {
                        animation.start();
                    }
                }
            }
        }
    }

    public void setCoverTime(long j) {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof StickerView) {
                ImageReceiver imageReceiver = ((StickerView) childAt).centerImage;
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.setCurrentFrame(Math.round(((j % lottieAnimation.getDuration()) / lottieAnimation.getDuration()) * lottieAnimation.getFramesCount()), true, false);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.isCoverPreview) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Stories.recorder.StoryRecorder.Touchable
    public boolean onTouch(MotionEvent motionEvent) {
        if (this.isCoverPreview) {
            return false;
        }
        if (this.currentEntityView != null) {
            lambda$createRound$61(null);
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
        lambda$createRound$61(null);
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

    public List<TLRPC.InputDocument> getMasks() {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int childCount = this.entitiesView.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof StickerView) {
                TLRPC.Document sticker = ((StickerView) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof TextPaintView) {
                CharSequence text = ((TextPaintView) childAt).getText();
                if ((text instanceof Spanned) && (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) text).getSpans(0, text.length(), AnimatedEmojiSpan.class)) != null) {
                    for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                        if (animatedEmojiSpan != null) {
                            TLRPC.Document document = animatedEmojiSpan.document;
                            if (document == null) {
                                document = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
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
        setCurrentSwatch(this.colorSwatch, true, Integer.valueOf(i), false);
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
            this.typefaceMenuTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda51
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    PaintView.this.lambda$showTypefaceMenu$36(dynamicAnimation, f, f2);
                }
            });
            this.typefaceMenuTransformAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda52
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    PaintView.this.lambda$showTypefaceMenu$37(z, dynamicAnimation, z2, f, f2);
                }
            });
            this.typefaceMenuTransformAnimation.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTypefaceMenu$36(DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 1000.0f;
        this.typefaceMenuTransformProgress = f3;
        this.typefaceListView.setAlpha(f3);
        this.typefaceListView.invalidate();
        this.overlayLayout.invalidate();
        this.textOptionsView.getTypefaceCell().setAlpha(1.0f - this.typefaceMenuTransformProgress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTypefaceMenu$37(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == this.typefaceMenuTransformAnimation) {
            this.typefaceMenuTransformAnimation = null;
            if (!z) {
                this.typefaceListView.setVisibility(8);
            }
            this.typefaceListView.setMaskProvider(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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
            final boolean[] zArr = {this.keyboardNotifier.keyboardVisible() || this.emojiPadding > 0};
            final float translationY = this.bottomLayout.getTranslationY();
            final float alpha = this.doneButton.getAlpha();
            final ViewGroup barView = getBarView();
            this.toolsTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda14
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    PaintView.this.lambda$showColorList$38(barView, z, zArr, alpha, translationY, dynamicAnimation, f, f2);
                }
            });
            this.toolsTransformAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda15
                @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    PaintView.this.lambda$showColorList$39(z, dynamicAnimation, z2, f, f2);
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
    public /* synthetic */ void lambda$showColorList$38(View view, boolean z, boolean[] zArr, float f, float f2, DynamicAnimation dynamicAnimation, float f3, float f4) {
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
            float f7 = z ? this.toolsTransformProgress : 1.0f - this.toolsTransformProgress;
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
    public /* synthetic */ void lambda$showColorList$39(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
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
        setCurrentSwatch(swatch, z, null, false);
    }

    private void setCurrentSwatch(Swatch swatch, boolean z, final Integer num, boolean z2) {
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
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda13
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PaintView.this.lambda$setCurrentSwatch$40(num, i, valueAnimator);
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
            return;
        }
        if (z2 && (entityView instanceof LocationView)) {
            ((LocationView) entityView).setColor(swatch.color);
            ((LocationView) this.currentEntityView).setType(3);
        } else if (z2 && (entityView instanceof WeatherView)) {
            ((WeatherView) entityView).setColor(swatch.color);
            ((WeatherView) this.currentEntityView).setType(3);
        } else if (z2 && (entityView instanceof LinkView)) {
            ((LinkView) entityView).setColor(swatch.color);
            ((LinkView) this.currentEntityView).setType(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCurrentSwatch$40(Integer num, int i, ValueAnimator valueAnimator) {
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
        }
        if (this.isColorListShown) {
            showColorList(false);
            return true;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return true;
        }
        if (!this.editingText) {
            return false;
        }
        if (this.enteredThroughText) {
            this.enteredThroughText = false;
            this.keyboardNotifier.ignore(true);
            return false;
        }
        lambda$createRound$61(null);
        return true;
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
            popupButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda65
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
                this.reactionLayout.setTranslationY((measuredHeight - r2.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
            }
            if (this.points[0] < getMeasuredWidth() / 2.0f) {
                this.reactionLayout.setMirrorX(true);
                float x = (this.reactionLayout.getX() + (this.reactionLayout.getMeasuredWidth() / 2.0f)) - (this.points[0] - (this.reactionForEntity.getMeasuredHeight() / 2.0f));
                if (x > 0.0f) {
                    this.reactionLayout.setBubbleOffset(((r0.getMeasuredWidth() / 2.0f) - x) / 2.0f);
                }
            } else {
                float x2 = (this.reactionLayout.getX() + (this.reactionLayout.getMeasuredWidth() / 2.0f)) - (this.points[0] + (this.reactionForEntity.getMeasuredHeight() / 2.0f));
                if (x2 < 0.0f) {
                    this.reactionLayout.setBubbleOffset((-((r1.getMeasuredWidth() / 2.0f) + x2)) / 2.0f);
                }
                this.reactionLayout.setMirrorX(false);
            }
            this.reactionLayout.setTranslationX((this.parent.getMeasuredWidth() - this.reactionLayout.getMeasuredWidth()) / 2.0f);
        }
    }

    public void setBlurManager(BlurringShader.BlurManager blurManager) {
        this.blurManager = blurManager;
    }

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
            FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.Stories.recorder.PaintView.PopupButton.1
                Path path = new Path();

                @Override // android.view.ViewGroup
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    boolean z;
                    PopupButton popupButton = PopupButton.this;
                    if (popupButton.imageSwitchAnimator != null && (((z = popupButton.imageSwitchFill) && view == popupButton.image2View) || (!z && view == popupButton.imageView))) {
                        float measuredWidth = ((z ? popupButton.imageSwitchT : 1.0f - popupButton.imageSwitchT) * getMeasuredWidth()) / 2.0f;
                        canvas.save();
                        this.path.rewind();
                        this.path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
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
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            ImageView imageView2 = this.imageView;
            int i = Theme.key_actionBarDefaultSubmenuItem;
            imageView2.setColorFilter(PaintView.this.getThemedColor(i));
            this.imagesView.addView(this.imageView, LayoutHelper.createFrame(-2, -2, 17));
            ImageView imageView3 = new ImageView(context);
            this.image2View = imageView3;
            imageView3.setScaleType(scaleType);
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
            this.checkView.setScaleType(scaleType);
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
        } else {
            this.forceChanges = true;
            createText(true);
        }
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
        if (i == 1) {
            i2 = 4;
        } else if (i == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i2 = 3;
        }
        textPaintView.getEditText().setTextAlignment(i2);
    }

    @Override // org.telegram.ui.Components.Paint.Views.PaintToolsView.Delegate
    public void onAddButtonPressed(View view) {
        showPopup(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$onAddButtonPressed$44();
            }
        }, this, 53, 0, getHeight(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAddButtonPressed$44() {
        boolean fillShapes = PersistColorPalette.getInstance(this.currentAccount).getFillShapes();
        for (int i = 0; i < Brush.Shape.SHAPES_LIST.size(); i++) {
            final Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i);
            final int filledIconRes = fillShapes ? shape.getFilledIconRes() : shape.getIconRes();
            PopupButton buttonForPopup = buttonForPopup(shape.getShapeName(), filledIconRes, false, new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda63
                @Override // java.lang.Runnable
                public final void run() {
                    PaintView.this.lambda$onAddButtonPressed$42(shape, filledIconRes);
                }
            });
            buttonForPopup.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda64
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean lambda$onAddButtonPressed$43;
                    lambda$onAddButtonPressed$43 = PaintView.this.lambda$onAddButtonPressed$43(view);
                    return lambda$onAddButtonPressed$43;
                }
            });
            this.popupLayout.addView((View) buttonForPopup, LayoutHelper.createLinear(-1, 48));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAddButtonPressed$42(Brush.Shape shape, int i) {
        if (this.renderView.getCurrentBrush() instanceof Brush.Shape) {
            this.ignoreToolChangeAnimationOnce = true;
        }
        onBrushSelected(shape);
        this.paintToolsView.animatePlusToIcon(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAddButtonPressed$43(View view) {
        if (this.popupLayout != null) {
            PersistColorPalette.getInstance(this.currentAccount).toggleFillShapes();
            boolean fillShapes = PersistColorPalette.getInstance(this.currentAccount).getFillShapes();
            for (int i = 0; i < this.popupLayout.getItemsCount(); i++) {
                View itemAt = this.popupLayout.getItemAt(i);
                if (itemAt instanceof PopupButton) {
                    Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i);
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
        showPopup(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$showMenuForEntity$55(entityView);
            }
        }, this, 51, centerLocationInWindow[0], centerLocationInWindow[1] - AndroidUtilities.dp(32.0f), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$55(final EntityView entityView) {
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
            textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$45(entityView, view);
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
                textView2.setText(LocaleController.getString(R.string.Paste));
                textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda41
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PaintView.this.lambda$showMenuForEntity$46(entityView, view);
                    }
                });
            } else {
                textView2.setTag(1);
                textView2.setText(LocaleController.getString(R.string.PaintEdit));
                textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda42
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PaintView.this.lambda$showMenuForEntity$47(entityView, view);
                    }
                });
            }
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 44));
        } else if (entityView instanceof LocationView) {
            TextView createActionLayoutButton = createActionLayoutButton(1, LocaleController.getString(R.string.PaintEdit));
            createActionLayoutButton.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda43
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$49(entityView, view);
                }
            });
            linearLayout.addView(createActionLayoutButton, LayoutHelper.createLinear(-2, 44));
        } else if (entityView instanceof LinkView) {
            TextView createActionLayoutButton2 = createActionLayoutButton(1, LocaleController.getString(R.string.PaintEdit));
            createActionLayoutButton2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$50(entityView, view);
                }
            });
            linearLayout.addView(createActionLayoutButton2, LayoutHelper.createLinear(-2, 44));
        }
        if ((entityView instanceof StickerView) || (entityView instanceof RoundView) || (entityView instanceof PhotoView) || (entityView instanceof ReactionWidgetEntityView)) {
            TextView createActionLayoutButton3 = createActionLayoutButton(4, LocaleController.getString(R.string.Flip));
            createActionLayoutButton3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda45
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$51(entityView, view);
                }
            });
            linearLayout.addView(createActionLayoutButton3, LayoutHelper.createLinear(-2, 44));
        }
        boolean z2 = entityView instanceof PhotoView;
        if (z2) {
            final PhotoView photoView = (PhotoView) entityView;
            if (photoView.hasSegmentedImage()) {
                TextView createActionLayoutButton4 = createActionLayoutButton(5, LocaleController.getString(photoView.isSegmented() ? R.string.SegmentationUndoCutOut : R.string.SegmentationCutOut));
                createActionLayoutButton4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda46
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PaintView.this.lambda$showMenuForEntity$52(photoView, view);
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
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda47
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$53(entityView, view);
                }
            });
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, 44));
        } else if (!z2 && !z && !(entityView instanceof RoundView) && !(entityView instanceof LocationView) && !(entityView instanceof WeatherView) && !(entityView instanceof LinkView) && !(entityView instanceof ReactionWidgetEntityView)) {
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
            textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda48
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PaintView.this.lambda$showMenuForEntity$54(entityView, view);
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
    public /* synthetic */ void lambda$showMenuForEntity$45(EntityView entityView, View view) {
        if (entityView instanceof RoundView) {
            onTryDeleteRound();
        } else {
            lambda$registerRemovalUndo$62(entityView);
        }
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$46(EntityView entityView, View view) {
        try {
            ((TextPaintView) entityView).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
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
    public /* synthetic */ void lambda$showMenuForEntity$47(EntityView entityView, View view) {
        lambda$createRound$61(entityView);
        editSelectedTextEntity();
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$49(final EntityView entityView, View view) {
        lambda$createRound$61(null);
        showLocationAlert((LocationView) entityView, new Utilities.Callback2() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda59
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                PaintView.this.lambda$showMenuForEntity$48(entityView, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
            }
        });
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$48(EntityView entityView, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        ((LocationView) entityView).setLocation(this.currentAccount, messageMedia, mediaArea);
        appearAnimation(entityView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$50(EntityView entityView, View view) {
        lambda$createRound$61(null);
        showLinkAlert((LinkView) entityView);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$51(EntityView entityView, View view) {
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
    public /* synthetic */ void lambda$showMenuForEntity$52(PhotoView photoView, View view) {
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
    public /* synthetic */ void lambda$showMenuForEntity$53(EntityView entityView, View view) {
        entityView.bringToFront();
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showMenuForEntity$54(EntityView entityView, View view) {
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
            StickerView stickerView = new StickerView(getContext(), (StickerView) entityView, startPositionRelativeToEntity);
            stickerView.setDelegate(this);
            this.entitiesView.addView(stickerView);
            checkEntitiesIsVideo();
            entityView2 = stickerView;
        } else {
            if (!(entityView instanceof TextPaintView)) {
                return;
            }
            TextPaintView textPaintView = new TextPaintView(getContext(), (TextPaintView) entityView, startPositionRelativeToEntity);
            textPaintView.setDelegate(this);
            textPaintView.setMaxWidth(this.w - AndroidUtilities.dp(32.0f));
            this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
            checkEntitiesIsVideo();
            entityView2 = textPaintView;
        }
        registerRemovalUndo(entityView2);
        lambda$createRound$61(null);
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

    private class PopupWindowLayout extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
        private final ButtonBounce bounce;
        private float cx;
        private float cy;
        public boolean enableBounce;

        public PopupWindowLayout(Context context) {
            super(context, PaintView.this.resourcesProvider);
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

        @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.ActionBarPopupWindowLayout, android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
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

        @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.ActionBarPopupWindowLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
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
            PopupWindowLayout popupWindowLayout = new PopupWindowLayout(getContext());
            this.popupLayout = popupWindowLayout;
            popupWindowLayout.setAnimationEnabled(true);
            this.popupLayout.setOnTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda36
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    boolean lambda$showPopup$56;
                    lambda$showPopup$56 = PaintView.this.lambda$showPopup$56(view2, motionEvent);
                    return lambda$showPopup$56;
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda37
                @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    PaintView.this.lambda$showPopup$57(keyEvent);
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
            this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda38
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    PaintView.this.lambda$showPopup$58();
                }
            });
        }
        this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), TLObject.FLAG_31));
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
        } else {
            this.popupLayout.setBackgroundDrawable(mutate);
            this.popupLayout.setBackgroundColor(-14145495);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showPopup$56(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = this.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(this.popupRect);
        if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        this.popupWindow.dismiss();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPopup$57(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPopup$58() {
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
        float floor = (float) Math.floor(getPaintingSize().width * 0.5d);
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
            float floor = (float) Math.floor(Math.max(this.w, this.entitiesView.getMeasuredWidth()) * 0.5d);
            return new Size(floor, floor / f);
        }
        float floor2 = (float) Math.floor(Math.max(this.h, this.entitiesView.getMeasuredHeight()) * 0.5d);
        return new Size(f * floor2, floor2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Size basePhotoSize(TLObject tLObject) {
        float f;
        if (tLObject instanceof TLRPC.Photo) {
            if (FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT) != null) {
                f = r7.w / r7.h;
                if (f <= 1.0f) {
                    float floor = (float) Math.floor(Math.max(this.w, this.entitiesView.getMeasuredWidth()) * 0.5d);
                    return new Size(floor, floor / f);
                }
                float floor2 = (float) Math.floor(Math.max(this.h, this.entitiesView.getMeasuredHeight()) * 0.5d);
                return new Size(f * floor2, floor2);
            }
        } else if (!(tLObject instanceof TLRPC.Document)) {
            boolean z = tLObject instanceof TLRPC.WebDocument;
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
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$appearAnimation$59(view);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$appearAnimation$59(View view) {
        if (view instanceof EntityView) {
            EntityView entityView = (EntityView) view;
            entityView.updateSelectionView();
            lambda$createRound$61(entityView);
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

    private StickerPosition calculateStickerPosition(TLRPC.Document document) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f;
        ArrayList arrayList;
        int i;
        PhotoFace randomFaceWithVacantAnchor;
        int i2 = 0;
        while (true) {
            if (i2 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
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
        if (tL_maskCoords == null || (arrayList = this.faces) == null || arrayList.size() == 0 || (randomFaceWithVacantAnchor = getRandomFaceWithVacantAnchor((i = tL_maskCoords.n), document.id, tL_maskCoords)) == null) {
            return stickerPosition;
        }
        Point pointForAnchor = randomFaceWithVacantAnchor.getPointForAnchor(i);
        float widthForAnchor = randomFaceWithVacantAnchor.getWidthForAnchor(i);
        return new StickerPosition(new Point(pointForAnchor.x, pointForAnchor.y), (float) ((widthForAnchor / baseStickerSize().width) * tL_maskCoords.zoom), randomFaceWithVacantAnchor.getAngle());
    }

    private PhotoFace getRandomFaceWithVacantAnchor(int i, long j, TLRPC.TL_maskCoords tL_maskCoords) {
        if (i >= 0 && i <= 3 && !this.faces.isEmpty()) {
            int size = this.faces.size();
            int nextInt = Utilities.random.nextInt(size);
            for (int i2 = size; i2 > 0; i2--) {
                PhotoFace photoFace = (PhotoFace) this.faces.get(nextInt);
                if (!isFaceAnchorOccupied(photoFace, i, j, tL_maskCoords)) {
                    return photoFace;
                }
                nextInt = (nextInt + 1) % size;
            }
        }
        return null;
    }

    private boolean isFaceAnchorOccupied(PhotoFace photoFace, int i, long j, TLRPC.TL_maskCoords tL_maskCoords) {
        if (photoFace.getPointForAnchor(i) == null) {
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
                    float hypot = (float) Math.hypot(position.x - r14.x, position.y - r14.y);
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
        photoView.setDelegate(this);
        this.entitiesView.addView(photoView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(photoView);
            lambda$createRound$61(photoView);
        }
        return photoView;
    }

    public void deleteRound() {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            final View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof RoundView) {
                if (this.currentEntityView == childAt) {
                    lambda$createRound$61(null);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        PaintView.this.lambda$deleteRound$60(childAt);
                    }
                }).start();
            }
        }
    }

    public RoundView createRound(String str, boolean z) {
        this.forceChanges = true;
        this.creatingNewRound = true;
        deleteRound();
        int measuredWidth = this.entitiesView.getMeasuredWidth();
        this.entitiesView.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.w;
        }
        float floor = (float) Math.floor(0.43f * r0);
        Size size = new Size(floor, floor);
        final RoundView roundView = new RoundView(getContext(), new Point((measuredWidth - (size.width / 2.0f)) - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(72.0f) + (size.height / 2.0f)), 0.0f, 1.0f, size, str);
        roundView.setDelegate(this);
        this.entitiesView.addView(roundView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(roundView);
            post(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    PaintView.this.lambda$createRound$61(roundView);
                }
            });
        }
        this.creatingNewRound = false;
        return roundView;
    }

    public MessageEntityView createMessage(ArrayList arrayList, boolean z, boolean z2) {
        this.forceChanges = true;
        MessageEntityView messageEntityView = new MessageEntityView(getContext(), centerPositionForEntity(), 0.0f, 1.0f, arrayList, this.blurManager, z2, this.videoTextureHolder) { // from class: org.telegram.ui.Stories.recorder.PaintView.28
            @Override // org.telegram.ui.Components.Paint.Views.MessageEntityView
            public boolean drawForBitmap() {
                return PaintView.this.drawForThemeToggle;
            }
        };
        messageEntityView.setDelegate(this);
        this.entitiesView.addView(messageEntityView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(messageEntityView);
            lambda$createRound$61(messageEntityView);
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
        photoView.setDelegate(this);
        this.entitiesView.addView(photoView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(photoView);
            lambda$createRound$61(photoView);
        }
        return photoView;
    }

    private StickerView createSticker(Object obj, TLRPC.Document document, boolean z) {
        StickerPosition calculateStickerPosition = calculateStickerPosition(document);
        StickerView stickerView = new StickerView(getContext(), calculateStickerPosition.position, calculateStickerPosition.angle, calculateStickerPosition.scale, baseStickerSize(), document, obj) { // from class: org.telegram.ui.Stories.recorder.PaintView.29
            @Override // org.telegram.ui.Components.Paint.Views.StickerView
            protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                PaintView.this.didSetAnimatedSticker(rLottieDrawable);
            }
        };
        if (MessageObject.isTextColorEmoji(document)) {
            stickerView.centerImage.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        stickerView.centerImage.setLayerNum(12);
        stickerView.setDelegate(this);
        this.entitiesView.addView(stickerView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(stickerView);
            lambda$createRound$61(stickerView);
        }
        return stickerView;
    }

    private ReactionWidgetEntityView createReactionWidget(boolean z) {
        Size size = new Size(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        Point centerPositionForEntity = centerPositionForEntity();
        if (this.entitiesView.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
                    View childAt = this.entitiesView.getChildAt(i);
                    if (MathUtils.distance(centerPositionForEntity.x, centerPositionForEntity.y, childAt.getX() + (childAt.getMeasuredWidth() / 2.0f), childAt.getY() + (childAt.getMeasuredHeight() / 2.0f)) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                }
                centerPositionForEntity.x += this.entitiesView.getMeasuredWidth() * 0.05f;
                centerPositionForEntity.y += this.entitiesView.getMeasuredHeight() * 0.05f;
                centerPositionForEntity.x = Utilities.clamp(centerPositionForEntity.x, this.entitiesView.getMeasuredWidth(), 0.0f);
                centerPositionForEntity.y = Utilities.clamp(centerPositionForEntity.y, this.entitiesView.getMeasuredHeight(), 0.0f);
            }
        }
        ReactionWidgetEntityView reactionWidgetEntityView = new ReactionWidgetEntityView(getContext(), centerPositionForEntity, size);
        reactionWidgetEntityView.setDelegate(this);
        this.entitiesView.addView(reactionWidgetEntityView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(reactionWidgetEntityView);
            lambda$createRound$61(reactionWidgetEntityView);
        }
        return reactionWidgetEntityView;
    }

    public void removeCurrentEntity() {
        EntityView entityView = this.currentEntityView;
        if (entityView != null) {
            lambda$registerRemovalUndo$62(entityView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeEntity, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$registerRemovalUndo$62(EntityView entityView) {
        EntityView entityView2 = this.currentEntityView;
        if (entityView == entityView2 && entityView2 != null) {
            entityView2.deselect();
            lambda$createRound$61(null);
            if (entityView instanceof TextPaintView) {
                ValueAnimator valueAnimator = this.tabsSelectionAnimator;
                if (valueAnimator != null && this.tabsNewSelectedIndex != 0) {
                    valueAnimator.cancel();
                }
                switchTab(0);
            }
        }
        this.entitiesView.removeView(entityView);
        checkEntitiesIsVideo();
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

    private void checkEntitiesIsVideo() {
        boolean wouldBeVideo = wouldBeVideo();
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof EntityView) {
                ((EntityView) childAt).setIsVideo(wouldBeVideo);
            }
        }
    }

    public boolean wouldBeVideo() {
        if (this.isVideo || this.hasAudio) {
            return true;
        }
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof TextPaintView) {
                CharSequence text = ((TextPaintView) childAt).getText();
                if (text instanceof Spanned) {
                    for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) ((Spanned) text).getSpans(0, text.length(), AnimatedEmojiSpan.class)) {
                        TLRPC.Document document = animatedEmojiSpan.document;
                        if (document == null) {
                            document = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                        }
                        if (document != null) {
                            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).putDocument(document);
                        }
                        if (StoryEntry.isAnimated(document, FileLoader.getInstance(this.currentAccount).getPathToAttach(document, true).getAbsolutePath())) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (childAt instanceof StickerView) {
                TLRPC.Document sticker = ((StickerView) childAt).getSticker();
                if (StoryEntry.isAnimated(sticker, FileLoader.getInstance(this.currentAccount).getPathToAttach(sticker, true).getAbsolutePath())) {
                    return true;
                }
            } else if (childAt instanceof RoundView) {
                return true;
            }
        }
        return false;
    }

    private void registerRemovalUndo(final EntityView entityView) {
        if (entityView == null) {
            return;
        }
        this.undoStore.registerUndo(entityView.getUUID(), new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$registerRemovalUndo$62(entityView);
            }
        });
    }

    @Override // org.telegram.ui.Components.Paint.Views.EntityView.EntityViewDelegate
    public boolean onEntitySelected(EntityView entityView) {
        return lambda$createRound$61(entityView);
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
        float pivotX = view2.getPivotX() + ((x - view2.getPivotX()) / view2.getScaleX());
        float pivotY = view2.getPivotY() + ((y - view2.getPivotY()) / view2.getScaleY());
        fArr[0] = pivotX;
        fArr[1] = pivotY;
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

    private static class StickerPosition {
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
            this.emojiViewWasVisible = this.emojiViewVisible;
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
            this.emojiWasPadding = paddingUnderContainer;
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
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda2
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PaintView.this.lambda$showEmojiPopup$63(valueAnimator);
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
                this.emojiViewWasVisible = this.emojiViewVisible;
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
    public /* synthetic */ void lambda$showEmojiPopup$63(ValueAnimator valueAnimator) {
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
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PaintView.this.lambda$hideEmojiPopup$64(valueAnimator);
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
    public /* synthetic */ void lambda$hideEmojiPopup$64(ValueAnimator valueAnimator) {
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
                int i4 = layoutParams.height;
                this.emojiWasPadding = i4;
                this.emojiPadding = i4;
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
        this.textDim.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() { // from class: org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                PaintView.this.lambda$updateTextDim$65(z);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTextDim$65(boolean z) {
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
        boolean z2 = !z;
        AndroidUtilities.updateViewShow(this.undoAllButton, z2, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.undoButton, z2, false, 1.0f, true, null);
        boolean z3 = z;
        AndroidUtilities.updateViewShow(this.doneTextButton, z3, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.cancelTextButton, z3, false, 1.0f, true, null);
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

    class 33 implements EmojiView.EmojiViewDelegate {
        int innerTextChange;

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
        /* renamed from: onGifSelected */
        public /* synthetic */ void lambda$onGifSelected$1(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.-CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onSearchOpenClose(int i) {
            EmojiView.EmojiViewDelegate.-CC.$default$onSearchOpenClose(this, i);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            EmojiView.EmojiViewDelegate.-CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.-CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.-CC.$default$onStickerSetAdd(this, stickerSetCovered);
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public /* synthetic */ void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.-CC.$default$onStickerSetRemove(this, stickerSetCovered);
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
                    try {
                        this.innerTextChange = 2;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(str, textPaintView.getFontMetricsInt(), false);
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
                    this.innerTextChange = 0;
                } catch (Throwable th) {
                    this.innerTextChange = 0;
                    throw th;
                }
            }
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
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
                try {
                    this.innerTextChange = 2;
                    SpannableString spannableString = new SpannableString(str);
                    if (document != null) {
                        animatedEmojiSpan = new AnimatedEmojiSpan(document, 1.0f, editText.getPaint().getFontMetricsInt());
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
                this.innerTextChange = 0;
            } catch (Throwable th) {
                this.innerTextChange = 0;
                throw th;
            }
        }

        @Override // org.telegram.ui.Components.EmojiView.EmojiViewDelegate
        public void onClearEmojiRecent() {
            AlertDialog.Builder builder = new AlertDialog.Builder(PaintView.this.getContext(), PaintView.this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Stories.recorder.PaintView$33$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                public final void onClick(AlertDialog alertDialog, int i) {
                    PaintView.33.this.lambda$onClearEmojiRecent$0(alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onClearEmojiRecent$0(AlertDialog alertDialog, int i) {
            PaintView.this.emojiView.clearRecentEmoji();
        }
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        this.destroyed = false;
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.SizeNotifierFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
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
