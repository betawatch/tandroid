package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.HintView2;

/* loaded from: classes5.dex */
public class ItemOptions {
    public ActionBarPopupWindow actionBarPopupWindow;
    private boolean allowCenter;
    private boolean allowMoveScrim;
    private int animateToHeight;
    private int animateToWidth;
    private boolean blur;
    private ViewGroup container;
    private Context context;
    private int dimAlpha;
    private ValueAnimator dimAnimator;
    private DimView dimView;
    private Runnable dismissListener;
    public boolean dismissWithButtons;
    private boolean dontDismiss;
    private boolean drawScrim;
    private int fixedWidthDp;
    private boolean forceBottom;
    private boolean forceTop;
    private int foregroundIndex;
    private BaseFragment fragment;
    private Integer gapBackgroundColor;
    private int gravity;
    private boolean hideScrimUnder;
    private Integer iconColor;
    private boolean ignoreX;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout lastLayout;
    private ViewGroup layout;
    private LinearLayout linearLayout;
    private int maxHeight;
    private int minWidthDp;
    public boolean needsFocus;
    private float offsetX;
    private float offsetY;
    public boolean onTopOfScrim;
    private boolean overridenSwipebackGravity;
    private final float[] point;
    private ViewGroup pointContainer;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean scaleOut;
    private View scrimView;
    private Drawable scrimViewBackground;
    private int scrimViewPadding;
    private int scrimViewRoundRadius;
    private Integer selectorColor;
    private int shiftDp;
    public boolean shownFromBottom;
    public boolean swipeback;
    private Integer textColor;
    private float translateX;
    private float translateY;
    public boolean useScrollView;
    private android.graphics.Rect viewAdditionalOffsets;

    public class DimView extends View {
        private Bitmap blurBitmap;
        private Paint blurPaint;
        private final RectF bounds;
        private final Bitmap cachedBitmap;
        private final Paint cachedBitmapPaint;
        public final float clipBottom;
        private final Path clipPath;
        public final float clipTop;
        private final int dim;
        public float dimProgress;
        private float moveToX;
        private float moveToY;

        public DimView(Context context) {
            super(context);
            this.clipPath = new Path();
            this.bounds = new RectF();
            if (ItemOptions.this.scrimView == null || !(ItemOptions.this.scrimView.getParent() instanceof View)) {
                this.clipTop = 0.0f;
                this.clipBottom = 0.0f;
            } else {
                this.clipTop = ((View) ItemOptions.this.scrimView.getParent()).getY() + ItemOptions.this.scrimView.getY();
                this.clipBottom = ItemOptions.this.allowMoveScrim ? Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, ((View) ItemOptions.this.scrimView.getParent()).getY() + ItemOptions.this.scrimView.getY() + ItemOptions.this.scrimView.getHeight())) : 0.0f;
            }
            this.dim = ColorUtils.setAlphaComponent(0, ItemOptions.this.dimAlpha);
            if (ItemOptions.this.drawScrim && (ItemOptions.this.scrimView instanceof UserCell) && (ItemOptions.this.fragment instanceof ProfileActivity)) {
                this.cachedBitmapPaint = new Paint(3);
                Bitmap createBitmap = Bitmap.createBitmap(ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.width(), ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.height(), Bitmap.Config.ARGB_8888);
                this.cachedBitmap = createBitmap;
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(ItemOptions.this.viewAdditionalOffsets.left, ItemOptions.this.viewAdditionalOffsets.top);
                ItemOptions.this.scrimView.draw(canvas);
            } else {
                this.cachedBitmapPaint = null;
                this.cachedBitmap = null;
            }
            if (ItemOptions.this.blur) {
                this.blurPaint = new Paint(3);
                ItemOptions.this.scrimView.setAlpha(0.0f);
                AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() { // from class: org.telegram.ui.Components.ItemOptions$DimView$$ExternalSyntheticLambda0
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        ItemOptions.DimView.this.lambda$new$0((Bitmap) obj);
                    }
                }, 12.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(Bitmap bitmap) {
            ItemOptions.this.scrimView.setAlpha(1.0f);
            this.blurBitmap = bitmap;
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            float f;
            float f2;
            float measuredWidth;
            float measuredHeight;
            float f3;
            float f4;
            float width;
            int height;
            Drawable drawable;
            int i;
            int i2;
            int width2;
            int height2;
            int i3;
            float f5;
            float f6;
            Drawable drawable2;
            int i4;
            int i5;
            int width3;
            int height3;
            int i6;
            super.onDraw(canvas);
            if (this.blurBitmap != null) {
                canvas.save();
                float max = Math.max(getWidth() / this.blurBitmap.getWidth(), getHeight() / this.blurBitmap.getHeight());
                canvas.scale(max, max);
                this.blurPaint.setAlpha((int) (this.dimProgress * 255.0f));
                canvas.drawBitmap(this.blurBitmap, 0.0f, 0.0f, this.blurPaint);
                canvas.restore();
            } else {
                canvas.drawColor(Theme.multAlpha(this.dim, this.dimProgress));
            }
            if (ItemOptions.this.drawScrim) {
                if (this.cachedBitmap != null && (ItemOptions.this.scrimView.getParent() instanceof View)) {
                    canvas.save();
                    if (this.clipTop < 1.0f) {
                        canvas.clipRect(-ItemOptions.this.viewAdditionalOffsets.left, (((-ItemOptions.this.viewAdditionalOffsets.top) + ItemOptions.this.point[1]) - (this.clipTop * (ItemOptions.this.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f, getMeasuredWidth() + ItemOptions.this.viewAdditionalOffsets.right, getMeasuredHeight() + ItemOptions.this.viewAdditionalOffsets.bottom);
                    }
                    if (ItemOptions.this.allowMoveScrim) {
                        ItemOptions.getPointOnScreen(ItemOptions.this.scrimView, ItemOptions.this.pointContainer, ItemOptions.this.point);
                        f5 = AndroidUtilities.lerp(ItemOptions.this.point[0], this.moveToX, this.dimProgress);
                        f6 = AndroidUtilities.lerp(ItemOptions.this.point[1], this.moveToY, this.dimProgress);
                    } else {
                        f5 = ItemOptions.this.point[0];
                        f6 = ItemOptions.this.point[1];
                    }
                    canvas.translate(f5, f6);
                    if (ItemOptions.this.scrimViewBackground != null) {
                        if (ItemOptions.this.scrimViewBackground.getIntrinsicWidth() <= 0 || ItemOptions.this.scrimViewBackground.getIntrinsicHeight() <= 0) {
                            drawable2 = ItemOptions.this.scrimViewBackground;
                            i4 = -ItemOptions.this.viewAdditionalOffsets.left;
                            i5 = -ItemOptions.this.viewAdditionalOffsets.top;
                            width3 = ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right;
                            height3 = ItemOptions.this.scrimView.getHeight();
                            i6 = ItemOptions.this.viewAdditionalOffsets.bottom;
                        } else {
                            drawable2 = ItemOptions.this.scrimViewBackground;
                            i4 = (-ItemOptions.this.viewAdditionalOffsets.left) + (((ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right) - ItemOptions.this.scrimViewBackground.getIntrinsicWidth()) / 2);
                            i5 = (-ItemOptions.this.viewAdditionalOffsets.top) + (((ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom) - ItemOptions.this.scrimViewBackground.getIntrinsicHeight()) / 2);
                            width3 = (-ItemOptions.this.viewAdditionalOffsets.left) + (((ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right) + ItemOptions.this.scrimViewBackground.getIntrinsicWidth()) / 2);
                            height3 = -ItemOptions.this.viewAdditionalOffsets.top;
                            i6 = ((ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom) + ItemOptions.this.scrimViewBackground.getIntrinsicHeight()) / 2;
                        }
                        drawable2.setBounds(i4, i5, width3, height3 + i6);
                        ItemOptions.this.scrimViewBackground.draw(canvas);
                    }
                    if (ItemOptions.this.scrimViewPadding > 0 || ItemOptions.this.scrimViewRoundRadius > 0) {
                        this.clipPath.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-ItemOptions.this.viewAdditionalOffsets.left) + (ItemOptions.this.scrimViewPadding * this.dimProgress), (-ItemOptions.this.viewAdditionalOffsets.top) + (ItemOptions.this.scrimViewPadding * getAlpha()), ((-ItemOptions.this.viewAdditionalOffsets.left) + this.cachedBitmap.getWidth()) - (ItemOptions.this.scrimViewPadding * getAlpha()), ((-ItemOptions.this.viewAdditionalOffsets.top) + this.cachedBitmap.getHeight()) - (ItemOptions.this.scrimViewPadding * getAlpha()));
                        this.clipPath.addRoundRect(rectF, ItemOptions.this.scrimViewRoundRadius * this.dimProgress, ItemOptions.this.scrimViewRoundRadius * this.dimProgress, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                    }
                    this.cachedBitmapPaint.setAlpha((int) (this.dimProgress * 255.0f));
                    canvas.drawBitmap(this.cachedBitmap, -ItemOptions.this.viewAdditionalOffsets.left, -ItemOptions.this.viewAdditionalOffsets.top, this.cachedBitmapPaint);
                } else {
                    if (ItemOptions.this.scrimView == null || !(ItemOptions.this.scrimView.getParent() instanceof View)) {
                        return;
                    }
                    canvas.save();
                    if (this.clipTop < 1.0f || this.clipBottom != 0.0f) {
                        if (ItemOptions.this.allowMoveScrim) {
                            f = -ItemOptions.this.viewAdditionalOffsets.left;
                            f2 = AndroidUtilities.lerp((((-ItemOptions.this.viewAdditionalOffsets.top) + ItemOptions.this.point[1]) - (this.clipTop * (ItemOptions.this.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f, 0.0f, this.dimProgress);
                            measuredWidth = getMeasuredWidth() + ItemOptions.this.viewAdditionalOffsets.right;
                            measuredHeight = (getMeasuredHeight() + ItemOptions.this.viewAdditionalOffsets.bottom) - (this.clipBottom * (1.0f - this.dimProgress));
                        } else {
                            f = -ItemOptions.this.viewAdditionalOffsets.left;
                            f2 = (((-ItemOptions.this.viewAdditionalOffsets.top) + ItemOptions.this.point[1]) - (this.clipTop * (ItemOptions.this.blur ? 1.0f - this.dimProgress : 1.0f))) + 1.0f;
                            measuredWidth = getMeasuredWidth() + ItemOptions.this.viewAdditionalOffsets.right;
                            measuredHeight = getMeasuredHeight() + ItemOptions.this.viewAdditionalOffsets.bottom;
                        }
                        canvas.clipRect(f, f2, measuredWidth, measuredHeight);
                    }
                    float f7 = this.dimProgress;
                    if (ItemOptions.this.allowMoveScrim) {
                        ItemOptions.getPointOnScreen(ItemOptions.this.scrimView, ItemOptions.this.pointContainer, ItemOptions.this.point);
                        f3 = AndroidUtilities.lerp(ItemOptions.this.point[0], this.moveToX, f7);
                        f4 = AndroidUtilities.lerp(ItemOptions.this.point[1], this.moveToY, f7);
                    } else {
                        f3 = ItemOptions.this.point[0];
                        f4 = ItemOptions.this.point[1];
                    }
                    canvas.translate(f3, f4);
                    if (ItemOptions.this.animateToWidth == 0 || ItemOptions.this.animateToHeight == 0) {
                        width = ItemOptions.this.scrimView.getWidth();
                        height = ItemOptions.this.scrimView.getHeight();
                    } else {
                        width = AndroidUtilities.lerp(ItemOptions.this.scrimView.getWidth(), ItemOptions.this.animateToWidth, f7);
                        height = AndroidUtilities.lerp(ItemOptions.this.scrimView.getHeight(), ItemOptions.this.animateToHeight, f7);
                    }
                    float f8 = height;
                    if (ItemOptions.this.scrimViewBackground != null) {
                        if (ItemOptions.this.scrimViewBackground.getIntrinsicWidth() <= 0 || ItemOptions.this.scrimViewBackground.getIntrinsicHeight() <= 0) {
                            drawable = ItemOptions.this.scrimViewBackground;
                            i = -ItemOptions.this.viewAdditionalOffsets.left;
                            i2 = -ItemOptions.this.viewAdditionalOffsets.top;
                            width2 = ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right;
                            height2 = ItemOptions.this.scrimView.getHeight();
                            i3 = ItemOptions.this.viewAdditionalOffsets.bottom;
                        } else {
                            drawable = ItemOptions.this.scrimViewBackground;
                            i = (-ItemOptions.this.viewAdditionalOffsets.left) + (((ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right) - ItemOptions.this.scrimViewBackground.getIntrinsicWidth()) / 2);
                            i2 = (-ItemOptions.this.viewAdditionalOffsets.top) + (((ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom) - ItemOptions.this.scrimViewBackground.getIntrinsicHeight()) / 2);
                            width2 = (-ItemOptions.this.viewAdditionalOffsets.left) + (((ItemOptions.this.scrimView.getWidth() + ItemOptions.this.viewAdditionalOffsets.right) + ItemOptions.this.scrimViewBackground.getIntrinsicWidth()) / 2);
                            height2 = -ItemOptions.this.viewAdditionalOffsets.top;
                            i3 = ((ItemOptions.this.scrimView.getHeight() + ItemOptions.this.viewAdditionalOffsets.bottom) + ItemOptions.this.scrimViewBackground.getIntrinsicHeight()) / 2;
                        }
                        drawable.setBounds(i, i2, width2, height2 + i3);
                        ItemOptions.this.scrimViewBackground.setAlpha((int) (this.dimProgress * 255.0f));
                        ItemOptions.this.scrimViewBackground.draw(canvas);
                    }
                    if (ItemOptions.this.scrimViewPadding > 0 || ItemOptions.this.scrimViewRoundRadius > 0) {
                        this.clipPath.rewind();
                        if (ItemOptions.this.scrimView instanceof ScrimView) {
                            ((ScrimView) ItemOptions.this.scrimView).getBounds(this.bounds);
                        } else {
                            this.bounds.set(0.0f, 0.0f, getWidth(), getHeight());
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set((-ItemOptions.this.viewAdditionalOffsets.left) + this.bounds.left + (ItemOptions.this.scrimViewPadding * this.dimProgress), (-ItemOptions.this.viewAdditionalOffsets.top) + this.bounds.top + (ItemOptions.this.scrimViewPadding * this.dimProgress), ((-ItemOptions.this.viewAdditionalOffsets.left) + this.bounds.right) - (ItemOptions.this.scrimViewPadding * this.dimProgress), ((-ItemOptions.this.viewAdditionalOffsets.top) + this.bounds.bottom) - (ItemOptions.this.scrimViewPadding * this.dimProgress));
                        this.clipPath.addRoundRect(rectF2, ItemOptions.this.scrimViewRoundRadius * this.dimProgress, ItemOptions.this.scrimViewRoundRadius * this.dimProgress, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                    }
                    if (!(ItemOptions.this.scrimView instanceof GiftSheet.GiftCell) || ItemOptions.this.animateToWidth == 0 || ItemOptions.this.animateToHeight == 0) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, ItemOptions.this.scrimView.getWidth(), ItemOptions.this.scrimView.getHeight(), (int) (this.dimProgress * 255.0f), 31);
                        if (ItemOptions.this.scrimView instanceof ScrimView) {
                            ((ScrimView) ItemOptions.this.scrimView).drawScrim(canvas, this.dimProgress);
                        } else {
                            ItemOptions.this.scrimView.draw(canvas);
                        }
                    } else if (ItemOptions.this.scrimView.getAlpha() >= 1.0f) {
                        ((GiftSheet.GiftCell) ItemOptions.this.scrimView).customDraw(this, canvas, width, f8, this.dimProgress);
                    } else {
                        float f9 = width;
                        canvas.saveLayerAlpha(0.0f, 0.0f, f9, f8, (int) (this.dimProgress * 255.0f), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.dimProgress);
                        canvas.scale(lerp, lerp, width / 2.0f, f8 / 2.0f);
                        ((GiftSheet.GiftCell) ItemOptions.this.scrimView).customDraw(this, canvas, f9, f8, this.dimProgress);
                    }
                    canvas.restore();
                }
                canvas.restore();
            }
        }

        public void setProgress(float f) {
            if (this.dimProgress == f) {
                return;
            }
            this.dimProgress = f;
            invalidate();
        }
    }

    public interface ScrimView {
        void drawScrim(Canvas canvas, float f);

        void getBounds(RectF rectF);
    }

    private ItemOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z, boolean z2) {
        this.gravity = 5;
        this.point = new float[2];
        this.drawScrim = true;
        this.viewAdditionalOffsets = new android.graphics.Rect();
        this.dismissWithButtons = true;
        this.shiftDp = -4;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        this.container = viewGroup;
        this.resourcesProvider = resourcesProvider;
        this.context = viewGroup.getContext();
        this.scrimView = view;
        this.dimAlpha = ((double) AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider))) > 0.705d ? 102 : 51;
        this.swipeback = z;
        this.shownFromBottom = z2;
        init();
    }

    private ItemOptions(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, Theme.ResourcesProvider resourcesProvider) {
        this.gravity = 5;
        this.point = new float[2];
        this.drawScrim = true;
        this.viewAdditionalOffsets = new android.graphics.Rect();
        this.dismissWithButtons = true;
        this.shiftDp = -4;
        this.context = actionBarPopupWindowLayout.getContext();
        LinearLayout linearLayout = new LinearLayout(this.context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.resourcesProvider = resourcesProvider;
    }

    private ItemOptions(BaseFragment baseFragment, View view, boolean z, boolean z2, boolean z3) {
        this.gravity = 5;
        this.point = new float[2];
        this.drawScrim = true;
        this.viewAdditionalOffsets = new android.graphics.Rect();
        this.dismissWithButtons = true;
        this.shiftDp = -4;
        if (baseFragment.getContext() == null) {
            return;
        }
        this.fragment = baseFragment;
        this.resourcesProvider = baseFragment.getResourceProvider();
        this.context = baseFragment.getContext();
        this.scrimView = view;
        this.dimAlpha = ((double) AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider))) > 0.705d ? 102 : 51;
        this.swipeback = z;
        this.useScrollView = z2;
        this.shownFromBottom = z3;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissDim(final ViewGroup viewGroup) {
        final DimView dimView = this.dimView;
        if (dimView == null) {
            return;
        }
        this.dimView = null;
        ValueAnimator valueAnimator = this.dimAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(dimView.dimProgress, 0.0f);
        this.dimAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ItemOptions.lambda$dismissDim$12(ItemOptions.DimView.this, valueAnimator2);
            }
        });
        this.dimAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ItemOptions.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                dimView.setProgress(0.0f);
                dimView.invalidate();
                AndroidUtilities.removeFromParent(dimView);
                viewGroup.getViewTreeObserver().removeOnPreDrawListener(ItemOptions.this.preDrawListener);
                if (ItemOptions.this.hideScrimUnder) {
                    ItemOptions.this.scrimView.setVisibility(0);
                    if (ItemOptions.this.scrimView instanceof GiftSheet.GiftCell) {
                        ((GiftSheet.GiftCell) ItemOptions.this.scrimView).invalidateCustom();
                    }
                }
            }
        });
        if (this.allowMoveScrim) {
            this.dimAnimator.setDuration(380L);
            this.dimAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        } else {
            this.dimAnimator.setDuration(150L);
        }
        this.dimAnimator.start();
    }

    public static void getPointOnScreen(View view, ViewGroup viewGroup, float[] fArr) {
        if (view == null || viewGroup == null) {
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        while (view != viewGroup) {
            f2 += view.getY();
            f += view.getX();
            if (view instanceof ScrollView) {
                f -= view.getScrollX();
                f2 -= view.getScrollY();
            }
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            if (!(view instanceof ViewGroup)) {
                return;
            }
        }
        fArr[0] = f - viewGroup.getPaddingLeft();
        fArr[1] = f2 - viewGroup.getPaddingTop();
    }

    private void init() {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.context, R.drawable.popup_fixed_alert2, this.resourcesProvider, (this.useScrollView ? 0 : 4) | (this.swipeback ? 1 : 0) | (this.shownFromBottom ? 2 : 0)) { // from class: org.telegram.ui.Components.ItemOptions.1
            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.ActionBarPopupWindowLayout, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                if (this == ItemOptions.this.layout && ItemOptions.this.maxHeight > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(ItemOptions.this.maxHeight, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2));
                }
                super.onMeasure(i, i2);
            }
        };
        this.lastLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                ItemOptions.this.lambda$init$0(keyEvent);
            }
        });
        this.layout = this.lastLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$add$1(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$add$5(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addChat$4(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addChecked$2(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissWithButtons) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$addChecked$3(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
        if (!this.dismissWithButtons) {
            return true;
        }
        dismiss();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addProfile$9(Runnable runnable, View view) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSpaceGap$7(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.actionBarPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dismissDim$12(DimView dimView, ValueAnimator valueAnimator) {
        dimView.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.actionBarPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putPremiumLock$6(Runnable runnable, View view) {
        if (runnable != null) {
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(view, i);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$show$10(DimView dimView) {
        dimView.invalidate();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$11(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        DimView dimView = this.dimView;
        if (dimView != null) {
            dimView.setProgress(floatValue);
        }
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, View view) {
        return makeOptions(viewGroup, (Theme.ResourcesProvider) null, view);
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view) {
        return new ItemOptions(viewGroup, resourcesProvider, view, false, false);
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z) {
        return new ItemOptions(viewGroup, resourcesProvider, view, z, false);
    }

    public static ItemOptions makeOptions(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, View view, boolean z, boolean z2) {
        return new ItemOptions(viewGroup, resourcesProvider, view, z, z2);
    }

    public static ItemOptions makeOptions(BaseFragment baseFragment, View view) {
        return new ItemOptions(baseFragment, view, false, true, false);
    }

    public static ItemOptions makeOptions(BaseFragment baseFragment, View view, boolean z) {
        return new ItemOptions(baseFragment, view, z, true, false);
    }

    public static ItemOptions makeOptions(BaseFragment baseFragment, View view, boolean z, boolean z2) {
        return new ItemOptions(baseFragment, view, z, !z2, false);
    }

    public ActionBarMenuSubItem add() {
        int i;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(this.context, false, false, this.resourcesProvider);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.textColor;
        int intValue = num != null ? num.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(intValue, num2 != null ? num2.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.12f));
        int i2 = this.minWidthDp;
        if (i2 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i2));
            i = this.minWidthDp;
        } else {
            i = -1;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(i, -2));
        return actionBarMenuSubItem;
    }

    public ItemOptions add(int i, Drawable drawable, CharSequence charSequence, int i2, int i3, final Runnable runnable) {
        int i4;
        if (this.context == null) {
            return this;
        }
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(this.context, false, false, this.resourcesProvider);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (i == 0 && drawable == null) {
            actionBarMenuSubItem.setText(charSequence);
        } else {
            actionBarMenuSubItem.setTextAndIcon(charSequence, i, drawable);
        }
        Integer num = this.textColor;
        int intValue = num != null ? num.intValue() : Theme.getColor(i3, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(intValue, num2 != null ? num2.intValue() : Theme.getColor(i2, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(Theme.getColor(i3, this.resourcesProvider), 0.12f));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemOptions.this.lambda$add$1(runnable, view);
            }
        });
        int i5 = this.minWidthDp;
        if (i5 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i5));
            i4 = this.minWidthDp;
        } else {
            i4 = -1;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(i4, -2));
        return this;
    }

    public ItemOptions add(int i, CharSequence charSequence, int i2, int i3, Runnable runnable) {
        return add(i, null, charSequence, i2, i3, runnable);
    }

    public ItemOptions add(int i, CharSequence charSequence, int i2, Runnable runnable) {
        return add(i, charSequence, i2, i2, runnable);
    }

    public ItemOptions add(int i, CharSequence charSequence, Runnable runnable) {
        return add(i, charSequence, false, runnable);
    }

    public ItemOptions add(int i, CharSequence charSequence, boolean z, Runnable runnable) {
        return add(i, charSequence, z ? Theme.key_text_RedRegular : Theme.key_actionBarDefaultSubmenuItemIcon, z ? Theme.key_text_RedRegular : Theme.key_actionBarDefaultSubmenuItem, runnable);
    }

    public ItemOptions add(CharSequence charSequence, CharSequence charSequence2, final Runnable runnable) {
        int i;
        if (this.context == null) {
            return this;
        }
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(this.context, false, false, this.resourcesProvider);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(charSequence);
        actionBarMenuSubItem.setSubtext(charSequence2);
        Integer num = this.textColor;
        int intValue = num != null ? num.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(intValue, num2 != null ? num2.intValue() : Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.12f));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemOptions.this.lambda$add$5(runnable, view);
            }
        });
        int i2 = this.minWidthDp;
        if (i2 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i2));
            i = this.minWidthDp;
        } else {
            i = -1;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(i, -2));
        return this;
    }

    public ItemOptions add(CharSequence charSequence, Runnable runnable) {
        return add(0, charSequence, false, runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ItemOptions addChat(TLObject tLObject, boolean z, final Runnable runnable) {
        int i;
        int i2;
        int i3;
        String str;
        if (this.context == null) {
            return this;
        }
        int i4 = Theme.key_actionBarDefaultSubmenuItem;
        int i5 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(this.context, false, false, this.resourcesProvider);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        if (!(tLObject instanceof TLRPC.Chat)) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                actionBarMenuSubItem.setText(UserObject.getUserName(user));
                if (user.id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    i = R.string.VoipGroupPersonalAccount;
                } else if (UserObject.isBot(user)) {
                    i = R.string.Bot;
                }
            }
            actionBarMenuSubItem.setClipToPadding(false);
            if (actionBarMenuSubItem.checkViewLeft) {
                actionBarMenuSubItem.textView.setPadding((actionBarMenuSubItem.checkViewLeft || actionBarMenuSubItem.checkView != null) ? AndroidUtilities.dp(43.0f) : 0, 0, (!actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
                BackupImageView backupImageView = new BackupImageView(this.context);
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(tLObject);
                backupImageView.setRoundRadius(AndroidUtilities.dp(34.0f));
                backupImageView.setForUserOrChat(tLObject, avatarDrawable);
                backupImageView.setScaleX(!z ? 0.84f : 1.0f);
                backupImageView.setScaleY(z ? 0.84f : 1.0f);
                actionBarMenuSubItem.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, (!LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
                if (z) {
                }
                Integer num = this.textColor;
                if (num == null) {
                }
                Integer num2 = this.iconColor;
                actionBarMenuSubItem.setColors(r1, num2 == null ? num2.intValue() : Theme.getColor(i5, this.resourcesProvider));
                Integer num3 = this.selectorColor;
                actionBarMenuSubItem.setSelectorColor(num3 == null ? num3.intValue() : Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 0.12f));
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ItemOptions.this.lambda$addChat$4(runnable, view);
                    }
                });
                i2 = this.minWidthDp;
                if (i2 <= 0) {
                }
                addView(actionBarMenuSubItem, LayoutHelper.createLinear(i3, -2));
                return this;
            }
            actionBarMenuSubItem.textView.setPadding((actionBarMenuSubItem.checkViewLeft || actionBarMenuSubItem.checkView != null) ? AndroidUtilities.dp(43.0f) : 0, 0, (!actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
            BackupImageView backupImageView2 = new BackupImageView(this.context);
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(tLObject);
            backupImageView2.setRoundRadius(AndroidUtilities.dp(34.0f));
            backupImageView2.setForUserOrChat(tLObject, avatarDrawable2);
            backupImageView2.setScaleX(!z ? 0.84f : 1.0f);
            backupImageView2.setScaleY(z ? 0.84f : 1.0f);
            actionBarMenuSubItem.addView(backupImageView2, LayoutHelper.createFrame(34, 34.0f, (!LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
            if (z) {
            }
            Integer num4 = this.textColor;
            if (num4 == null) {
            }
            Integer num22 = this.iconColor;
            actionBarMenuSubItem.setColors(r1, num22 == null ? num22.intValue() : Theme.getColor(i5, this.resourcesProvider));
            Integer num32 = this.selectorColor;
            actionBarMenuSubItem.setSelectorColor(num32 == null ? num32.intValue() : Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 0.12f));
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemOptions.this.lambda$addChat$4(runnable, view);
                }
            });
            i2 = this.minWidthDp;
            if (i2 <= 0) {
            }
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(i3, -2));
            return this;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        actionBarMenuSubItem.setText(chat == null ? "" : chat.title);
        if (!ChatObject.isChannelAndNotMegaGroup(chat)) {
            str = LocaleController.getString(R.string.AccDescrGroup).toLowerCase();
            actionBarMenuSubItem.setSubtext(str);
            actionBarMenuSubItem.setClipToPadding(false);
            actionBarMenuSubItem.textView.setPadding((actionBarMenuSubItem.checkViewLeft || actionBarMenuSubItem.checkView != null) ? AndroidUtilities.dp(43.0f) : 0, 0, (!actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
            BackupImageView backupImageView22 = new BackupImageView(this.context);
            AvatarDrawable avatarDrawable22 = new AvatarDrawable();
            avatarDrawable22.setInfo(tLObject);
            backupImageView22.setRoundRadius(AndroidUtilities.dp(34.0f));
            backupImageView22.setForUserOrChat(tLObject, avatarDrawable22);
            backupImageView22.setScaleX(!z ? 0.84f : 1.0f);
            backupImageView22.setScaleY(z ? 0.84f : 1.0f);
            actionBarMenuSubItem.addView(backupImageView22, LayoutHelper.createFrame(34, 34.0f, (!LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
            if (z) {
                View view = new View(this.context);
                view.setBackground(Theme.createOutlineCircleDrawable(AndroidUtilities.dp(34.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), AndroidUtilities.dp(2.0f)));
                actionBarMenuSubItem.addView(view, LayoutHelper.createFrame(36.0f, 36.0f, (LocaleController.isRTL ? 5 : 3) | 16, -6.0f, 0.0f, -5.0f, 0.0f));
            }
            Integer num42 = this.textColor;
            int intValue = num42 == null ? num42.intValue() : Theme.getColor(i4, this.resourcesProvider);
            Integer num222 = this.iconColor;
            actionBarMenuSubItem.setColors(intValue, num222 == null ? num222.intValue() : Theme.getColor(i5, this.resourcesProvider));
            Integer num322 = this.selectorColor;
            actionBarMenuSubItem.setSelectorColor(num322 == null ? num322.intValue() : Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 0.12f));
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ItemOptions.this.lambda$addChat$4(runnable, view2);
                }
            });
            i2 = this.minWidthDp;
            if (i2 <= 0) {
                actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i2));
                i3 = this.minWidthDp;
            } else {
                i3 = -1;
            }
            addView(actionBarMenuSubItem, LayoutHelper.createLinear(i3, -2));
            return this;
        }
        i = R.string.DiscussChannel;
        str = LocaleController.getString(i);
        actionBarMenuSubItem.setSubtext(str);
        actionBarMenuSubItem.setClipToPadding(false);
        actionBarMenuSubItem.textView.setPadding((actionBarMenuSubItem.checkViewLeft || actionBarMenuSubItem.checkView != null) ? AndroidUtilities.dp(43.0f) : 0, 0, (!actionBarMenuSubItem.checkViewLeft && actionBarMenuSubItem.checkView == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        BackupImageView backupImageView222 = new BackupImageView(this.context);
        AvatarDrawable avatarDrawable222 = new AvatarDrawable();
        avatarDrawable222.setInfo(tLObject);
        backupImageView222.setRoundRadius(AndroidUtilities.dp(34.0f));
        backupImageView222.setForUserOrChat(tLObject, avatarDrawable222);
        backupImageView222.setScaleX(!z ? 0.84f : 1.0f);
        backupImageView222.setScaleY(z ? 0.84f : 1.0f);
        actionBarMenuSubItem.addView(backupImageView222, LayoutHelper.createFrame(34, 34.0f, (!LocaleController.isRTL ? 5 : 3) | 16, -5.0f, 0.0f, -5.0f, 0.0f));
        if (z) {
        }
        Integer num422 = this.textColor;
        if (num422 == null) {
        }
        Integer num2222 = this.iconColor;
        actionBarMenuSubItem.setColors(intValue, num2222 == null ? num2222.intValue() : Theme.getColor(i5, this.resourcesProvider));
        Integer num3222 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3222 == null ? num3222.intValue() : Theme.multAlpha(Theme.getColor(i4, this.resourcesProvider), 0.12f));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ItemOptions.this.lambda$addChat$4(runnable, view2);
            }
        });
        i2 = this.minWidthDp;
        if (i2 <= 0) {
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(i3, -2));
        return this;
    }

    public ActionBarMenuSubItem addChecked() {
        int i;
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        int i3 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(this.context, true, false, false, this.resourcesProvider);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        Integer num = this.textColor;
        int intValue = num != null ? num.intValue() : Theme.getColor(i2, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(intValue, num2 != null ? num2.intValue() : Theme.getColor(i3, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(Theme.getColor(i2, this.resourcesProvider), 0.12f));
        int i4 = this.minWidthDp;
        if (i4 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i4));
            i = this.minWidthDp;
        } else {
            i = -1;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(i, -2));
        return actionBarMenuSubItem;
    }

    public ItemOptions addChecked(boolean z, CharSequence charSequence, Runnable runnable) {
        return addChecked(z, charSequence, runnable, null);
    }

    public ItemOptions addChecked(boolean z, CharSequence charSequence, final Runnable runnable, final Runnable runnable2) {
        int i;
        if (this.context == null) {
            return this;
        }
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        int i3 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(this.context, true, false, false, this.resourcesProvider);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(charSequence);
        actionBarMenuSubItem.setChecked(z);
        Integer num = this.textColor;
        int intValue = num != null ? num.intValue() : Theme.getColor(i2, this.resourcesProvider);
        Integer num2 = this.iconColor;
        actionBarMenuSubItem.setColors(intValue, num2 != null ? num2.intValue() : Theme.getColor(i3, this.resourcesProvider));
        Integer num3 = this.selectorColor;
        actionBarMenuSubItem.setSelectorColor(num3 != null ? num3.intValue() : Theme.multAlpha(Theme.getColor(i2, this.resourcesProvider), 0.12f));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemOptions.this.lambda$addChecked$2(runnable, view);
            }
        });
        if (runnable2 != null) {
            actionBarMenuSubItem.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda11
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean lambda$addChecked$3;
                    lambda$addChecked$3 = ItemOptions.this.lambda$addChecked$3(runnable2, view);
                    return lambda$addChecked$3;
                }
            });
        }
        int i4 = this.minWidthDp;
        if (i4 > 0) {
            actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(i4));
            i = this.minWidthDp;
        } else {
            i = -1;
        }
        addView(actionBarMenuSubItem, LayoutHelper.createLinear(i, -2));
        return this;
    }

    public ItemOptions addGap() {
        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(this.context, this.resourcesProvider);
        gapView.setTag(R.id.fit_width_tag, 1);
        Integer num = this.gapBackgroundColor;
        if (num != null) {
            gapView.setColor(num.intValue());
        }
        addView(gapView, LayoutHelper.createLinear(-1, 8));
        return this;
    }

    public ItemOptions addIf(boolean z, int i, Drawable drawable, CharSequence charSequence, Runnable runnable) {
        return !z ? this : add(i, drawable, charSequence, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, runnable);
    }

    public ItemOptions addIf(boolean z, int i, CharSequence charSequence, Runnable runnable) {
        return !z ? this : add(i, charSequence, Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, runnable);
    }

    public ItemOptions addIf(boolean z, int i, CharSequence charSequence, boolean z2, Runnable runnable) {
        return !z ? this : add(i, charSequence, z2, runnable);
    }

    public ItemOptions addProfile(TLObject tLObject, CharSequence charSequence, final Runnable runnable) {
        String str;
        FrameLayout frameLayout = new FrameLayout(this.context);
        frameLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 0, 6));
        BackupImageView backupImageView = new BackupImageView(this.context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(17.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(tLObject);
        backupImageView.setForUserOrChat(tLObject, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(this.context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) tLObject).title;
            }
            frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(this.context);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
            textView2.setTextSize(1, 13.0f);
            textView2.setText(AndroidUtilities.replaceArrows(charSequence, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemOptions.lambda$addProfile$9(runnable, view);
                }
            });
            addView(frameLayout, LayoutHelper.createLinear(-1, 52));
            return this;
        }
        str = UserObject.getUserName((TLRPC.User) tLObject);
        textView.setText(str);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 6.0f, 16.0f, 0.0f));
        TextView textView22 = new TextView(this.context);
        textView22.setTextColor(Theme.getColor(Theme.key_dialogTextGray2, this.resourcesProvider));
        textView22.setTextSize(1, 13.0f);
        textView22.setText(AndroidUtilities.replaceArrows(charSequence, false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(0.66f)));
        frameLayout.addView(textView22, LayoutHelper.createFrame(-2, -2.0f, 55, 59.0f, 27.0f, 16.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemOptions.lambda$addProfile$9(runnable, view);
            }
        });
        addView(frameLayout, LayoutHelper.createLinear(-1, 52));
        return this;
    }

    public ItemOptions addSpaceGap() {
        if (!(this.layout instanceof LinearLayout)) {
            LinearLayout linearLayout = new LinearLayout(this.context);
            this.layout = linearLayout;
            linearLayout.setOrientation(1);
            this.layout.addView(this.lastLayout, LayoutHelper.createLinear(-1, -2));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.context, this.resourcesProvider);
        this.lastLayout = actionBarPopupWindowLayout;
        actionBarPopupWindowLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda8
            @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow.OnDispatchKeyEventListener
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                ItemOptions.this.lambda$addSpaceGap$7(keyEvent);
            }
        });
        this.layout.addView(this.lastLayout, LayoutHelper.createLinear(-1, -2, 0.0f, -8.0f, 0.0f, 0.0f));
        return this;
    }

    public ItemOptions addText(CharSequence charSequence, int i) {
        return addText(charSequence, i, -1);
    }

    public ItemOptions addText(CharSequence charSequence, int i, int i2) {
        return addText(charSequence, i, null, i2);
    }

    public ItemOptions addText(CharSequence charSequence, int i, Typeface typeface, int i2) {
        TextView textView = new TextView(this.context) { // from class: org.telegram.ui.Components.ItemOptions.2
            @Override // android.widget.TextView, android.view.View
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
            }
        };
        textView.setTextSize(1, i);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setTypeface(typeface);
        NotificationCenter.listenEmojiLoading(textView);
        if (i2 > 0) {
            textView.setMaxWidth(i2);
        }
        addView(textView, LayoutHelper.createLinear(-1, -2));
        return this;
    }

    public ItemOptions addView(View view) {
        if (view == null) {
            return this;
        }
        view.setTag(R.id.fit_width_tag, 1);
        addView(view, LayoutHelper.createLinear(-1, -2));
        return this;
    }

    public ItemOptions addView(View view, LinearLayout.LayoutParams layoutParams) {
        if (view == null) {
            return this;
        }
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            linearLayout.addView(view, layoutParams);
        } else {
            this.lastLayout.addView(view, layoutParams);
        }
        return this;
    }

    public ItemOptions allowCenter(boolean z) {
        this.allowCenter = z;
        return this;
    }

    public ItemOptions allowMoveScrim() {
        this.allowMoveScrim = true;
        return this;
    }

    public ItemOptions animateToSize(int i, int i2) {
        this.animateToWidth = i;
        this.animateToHeight = i2;
        return this;
    }

    public void closeSwipeback() {
        dontDismiss();
        this.lastLayout.getSwipeBack().closeForeground();
    }

    public ItemOptions cutTextInFancyHalf() {
        if (this.context != null && this.lastLayout.getItemsCount() > 0) {
            View itemAt = this.lastLayout.getItemAt(r0.getItemsCount() - 1);
            if (itemAt instanceof ActionBarMenuSubItem) {
                AnimatedEmojiSpan.TextViewEmojis textView = ((ActionBarMenuSubItem) itemAt).getTextView();
                textView.setMaxWidth(HintView2.cutInFancyHalf(textView.getText(), textView.getPaint()) + textView.getPaddingLeft() + textView.getPaddingRight());
            }
        }
        return this;
    }

    public void dismiss() {
        if (this.dontDismiss) {
            this.dontDismiss = false;
            return;
        }
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
            return;
        }
        Runnable runnable = this.dismissListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void dontDismiss() {
        this.dontDismiss = true;
    }

    public ItemOptions forceBottom(boolean z) {
        this.forceBottom = z;
        return this;
    }

    public ItemOptions forceTop(boolean z) {
        this.forceTop = z;
        return this;
    }

    public Context getContext() {
        return this.context;
    }

    public View getItemAt(int i) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        if (actionBarPopupWindowLayout == null && this.layout == null) {
            return null;
        }
        if (actionBarPopupWindowLayout == this.layout) {
            return actionBarPopupWindowLayout.getItemAt(i);
        }
        int i2 = 0;
        while (i2 < this.layout.getChildCount() - 1) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                View itemAt = actionBarPopupWindowLayout2.getItemAt(i);
                if (itemAt != null) {
                    return itemAt;
                }
                i -= actionBarPopupWindowLayout2.getItemsCount();
            }
            i2++;
        }
        return null;
    }

    public int getItemsCount() {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        int i = 0;
        if (actionBarPopupWindowLayout == null && this.layout == null) {
            return 0;
        }
        if (actionBarPopupWindowLayout == this.layout) {
            return actionBarPopupWindowLayout.getItemsCount();
        }
        int i2 = 0;
        while (i < this.layout.getChildCount() - 1) {
            View childAt = i == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                i2 += ((ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt).getItemsCount();
            }
            i++;
        }
        return i2;
    }

    public ActionBarMenuSubItem getLast() {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() <= 0) {
                return null;
            }
            View childAt = this.linearLayout.getChildAt(r0.getChildCount() - 1);
            if (childAt instanceof ActionBarMenuSubItem) {
                return (ActionBarMenuSubItem) childAt;
            }
            return null;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        if (actionBarPopupWindowLayout == null || actionBarPopupWindowLayout.getItemsCount() <= 0) {
            return null;
        }
        View itemAt = this.lastLayout.getItemAt(r0.getItemsCount() - 1);
        if (itemAt instanceof ActionBarMenuSubItem) {
            return (ActionBarMenuSubItem) itemAt;
        }
        return null;
    }

    public ViewGroup getLayout() {
        return this.layout;
    }

    public ItemOptions hideScrimUnder() {
        this.hideScrimUnder = true;
        return this;
    }

    public ItemOptions ignoreX() {
        this.ignoreX = true;
        return this;
    }

    public boolean isShown() {
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        return actionBarPopupWindow != null && actionBarPopupWindow.isShowing();
    }

    public ItemOptions makeMultiline(boolean z) {
        if (this.context != null && this.lastLayout.getItemsCount() > 0) {
            View itemAt = this.lastLayout.getItemAt(r0.getItemsCount() - 1);
            if (itemAt instanceof ActionBarMenuSubItem) {
                ((ActionBarMenuSubItem) itemAt).setMultiline(z);
            }
        }
        return this;
    }

    public ItemOptions makeSwipeback() {
        ItemOptions itemOptions = new ItemOptions(this.lastLayout, this.resourcesProvider);
        itemOptions.foregroundIndex = this.lastLayout.addViewToSwipeBack(itemOptions.linearLayout);
        return itemOptions;
    }

    public ItemOptions needsFocus() {
        this.needsFocus = true;
        return this;
    }

    public void openSwipeback(ItemOptions itemOptions) {
        dontDismiss();
        this.lastLayout.getSwipeBack().openForeground(itemOptions.foregroundIndex);
    }

    public ItemOptions putCheck() {
        if (this.context != null && this.lastLayout.getItemsCount() > 0) {
            View itemAt = this.lastLayout.getItemAt(r0.getItemsCount() - 1);
            if (!(itemAt instanceof ActionBarMenuSubItem)) {
                return this;
            }
            ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) itemAt;
            actionBarMenuSubItem.setRightIcon(R.drawable.msg_text_check);
            actionBarMenuSubItem.getRightIcon().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
            actionBarMenuSubItem.getRightIcon().setScaleX(0.85f);
            actionBarMenuSubItem.getRightIcon().setScaleY(0.85f);
        }
        return this;
    }

    public ItemOptions putPremiumLock(final Runnable runnable) {
        if (runnable != null && this.context != null && this.lastLayout.getItemsCount() > 0) {
            View itemAt = this.lastLayout.getItemAt(r0.getItemsCount() - 1);
            if (!(itemAt instanceof ActionBarMenuSubItem)) {
                return this;
            }
            ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) itemAt;
            actionBarMenuSubItem.setRightIcon(R.drawable.msg_mini_lock3);
            actionBarMenuSubItem.getRightIcon().setAlpha(0.4f);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemOptions.this.lambda$putPremiumLock$6(runnable, view);
                }
            });
        }
        return this;
    }

    public ItemOptions setBackgroundColor(int i) {
        int i2 = 0;
        while (i2 < this.layout.getChildCount()) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                childAt.setBackgroundColor(i);
            }
            i2++;
        }
        return this;
    }

    public ItemOptions setBlur(boolean z) {
        this.blur = z;
        return this;
    }

    public ItemOptions setBlurBackground(BlurringShader.BlurManager blurManager, float f, float f2) {
        Drawable mutate = this.context.getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        ViewGroup viewGroup = this.layout;
        if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
            viewGroup.setBackground(new BlurringShader.StoryBlurDrawer(blurManager, viewGroup, 5).makeDrawable(this.offsetX + f + this.layout.getX(), this.offsetY + f2 + this.layout.getY(), mutate, AndroidUtilities.dp(6.0f)));
        } else {
            for (int i = 0; i < this.layout.getChildCount(); i++) {
                View childAt = this.layout.getChildAt(i);
                if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                    childAt.setBackground(new BlurringShader.StoryBlurDrawer(blurManager, childAt, 5).makeDrawable(this.offsetX + f + this.layout.getX() + childAt.getX(), this.offsetY + f2 + this.layout.getY() + childAt.getY(), mutate, AndroidUtilities.dp(6.0f)));
                }
            }
        }
        return this;
    }

    public ItemOptions setColors(int i, int i2) {
        this.textColor = Integer.valueOf(i);
        this.iconColor = Integer.valueOf(i2);
        int i3 = 0;
        while (i3 < this.layout.getChildCount()) {
            View childAt = i3 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i3);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                for (int i4 = 0; i4 < actionBarPopupWindowLayout.getItemsCount(); i4++) {
                    View itemAt = actionBarPopupWindowLayout.getItemAt(i4);
                    if (itemAt instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) itemAt).setColors(i, i2);
                    }
                }
            } else if (childAt instanceof ActionBarMenuSubItem) {
                ((ActionBarMenuSubItem) childAt).setColors(i, i2);
            }
            i3++;
        }
        return this;
    }

    public ItemOptions setDimAlpha(int i) {
        this.dimAlpha = i;
        return this;
    }

    public ItemOptions setDismissWithButtons(boolean z) {
        this.dismissWithButtons = z;
        return this;
    }

    public ItemOptions setDrawScrim(boolean z) {
        this.drawScrim = z;
        return this;
    }

    public ItemOptions setFixedWidth(int i) {
        this.fixedWidthDp = i;
        return this;
    }

    public ItemOptions setGapBackgroundColor(int i) {
        this.gapBackgroundColor = Integer.valueOf(i);
        int i2 = 0;
        while (i2 < this.layout.getChildCount()) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                for (int i3 = 0; i3 < actionBarPopupWindowLayout.getItemsCount(); i3++) {
                    View itemAt = actionBarPopupWindowLayout.getItemAt(i3);
                    if (itemAt instanceof ActionBarPopupWindow.GapView) {
                        ((ActionBarPopupWindow.GapView) itemAt).setColor(i);
                    }
                }
            } else if (childAt instanceof ActionBarPopupWindow.GapView) {
                ((ActionBarPopupWindow.GapView) childAt).setColor(i);
            }
            i2++;
        }
        return this;
    }

    public ItemOptions setGravity(int i) {
        this.gravity = i;
        if (i == 5 && this.swipeback) {
            ViewGroup viewGroup = this.layout;
            if (viewGroup instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ((ActionBarPopupWindow.ActionBarPopupWindowLayout) viewGroup).swipeBackGravityRight = true;
            }
        }
        return this;
    }

    public ItemOptions setMaxHeight(int i) {
        this.maxHeight = i;
        return this;
    }

    public ItemOptions setMinWidth(int i) {
        this.minWidthDp = i;
        return this;
    }

    public ItemOptions setOnDismiss(Runnable runnable) {
        this.dismissListener = runnable;
        return this;
    }

    public ItemOptions setOnTopOfScrim() {
        this.onTopOfScrim = true;
        return this;
    }

    public ItemOptions setRoundRadius(int i, int i2) {
        this.scrimViewRoundRadius = i;
        this.scrimViewPadding = i2;
        return this;
    }

    public ItemOptions setScaleOut(boolean z) {
        this.scaleOut = z;
        return this;
    }

    public ItemOptions setScrimViewBackground(Drawable drawable) {
        this.scrimViewBackground = drawable;
        return this;
    }

    public ItemOptions setSelectorColor(int i) {
        this.selectorColor = Integer.valueOf(i);
        int i2 = 0;
        while (i2 < this.layout.getChildCount()) {
            View childAt = i2 == this.layout.getChildCount() + (-1) ? this.lastLayout : this.layout.getChildAt(i2);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                for (int i3 = 0; i3 < actionBarPopupWindowLayout.getItemsCount(); i3++) {
                    View itemAt = actionBarPopupWindowLayout.getItemAt(i3);
                    if (itemAt instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) itemAt).setSelectorColor(i);
                    }
                }
            } else if (childAt instanceof ActionBarMenuSubItem) {
                ((ActionBarMenuSubItem) childAt).setSelectorColor(i);
            }
            i2++;
        }
        return this;
    }

    public ItemOptions setSwipebackGravity(boolean z, boolean z2) {
        this.overridenSwipebackGravity = true;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.lastLayout;
        actionBarPopupWindowLayout.swipeBackGravityRight = z;
        actionBarPopupWindowLayout.swipeBackGravityBottom = z2;
        return this;
    }

    public void setTranslationY(float f) {
        ActionBarPopupWindow actionBarPopupWindow = this.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.update((int) this.offsetX, (int) (this.offsetY + f), -1, -1);
        }
    }

    public ItemOptions setViewAdditionalOffsets(int i, int i2, int i3, int i4) {
        this.viewAdditionalOffsets.set(i, i2, i3, i4);
        return this;
    }

    public void setupSelectors() {
        if (this.layout == null) {
            return;
        }
        int i = 0;
        while (i < this.layout.getChildCount()) {
            View childAt = i == this.layout.getChildCount() - 1 ? this.lastLayout : this.layout.getChildAt(i);
            if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                if (actionBarPopupWindowLayout.getItemsCount() > 0) {
                    View itemAt = actionBarPopupWindowLayout.getItemAt(0);
                    View itemAt2 = actionBarPopupWindowLayout.getItemAt(actionBarPopupWindowLayout.getItemsCount() - 1);
                    if (itemAt instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) itemAt).updateSelectorBackground(true, itemAt == itemAt2);
                    } else if ((itemAt instanceof MessagePreviewView.ToggleButton) || (itemAt instanceof FrameLayout)) {
                        itemAt.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider), 6, itemAt == itemAt2 ? 6 : 0));
                    }
                    if (itemAt2 instanceof ActionBarMenuSubItem) {
                        ((ActionBarMenuSubItem) itemAt2).updateSelectorBackground(itemAt2 == itemAt, true);
                    } else if ((itemAt2 instanceof MessagePreviewView.ToggleButton) || (itemAt2 instanceof FrameLayout)) {
                        itemAt2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider), itemAt == itemAt2 ? 6 : 0, 6));
                    }
                }
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0368 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ItemOptions show() {
        float f;
        float f2;
        float measuredWidth;
        float measuredHeight;
        int i;
        int width;
        int height;
        boolean z;
        BaseFragment baseFragment;
        DimView dimView;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        float x;
        float f3;
        DimView dimView2;
        if (this.actionBarPopupWindow != null || this.linearLayout != null || getItemsCount() <= 0) {
            return this;
        }
        setupSelectors();
        if (this.fixedWidthDp > 0) {
            int i2 = 0;
            while (i2 < this.layout.getChildCount() - 1) {
                View childAt = i2 == this.layout.getChildCount() - 1 ? this.lastLayout : this.layout.getChildAt(i2);
                if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                    for (int i3 = 0; i3 < actionBarPopupWindowLayout2.getItemsCount(); i3++) {
                        actionBarPopupWindowLayout2.getItemAt(i3).getLayoutParams().width = AndroidUtilities.dp(this.fixedWidthDp);
                    }
                }
                i2++;
            }
        } else if (this.minWidthDp > 0) {
            int i4 = 0;
            while (i4 < this.layout.getChildCount() - 1) {
                View childAt2 = i4 == this.layout.getChildCount() - 1 ? this.lastLayout : this.layout.getChildAt(i4);
                if (childAt2 instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout3 = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt2;
                    for (int i5 = 0; i5 < actionBarPopupWindowLayout3.getItemsCount(); i5++) {
                        actionBarPopupWindowLayout3.getItemAt(i5).setMinimumWidth(AndroidUtilities.dp(this.minWidthDp));
                    }
                }
                i4++;
            }
        }
        ViewGroup viewGroup = this.container;
        if (viewGroup == null) {
            viewGroup = this.fragment.getParentLayout().getOverlayContainerView();
        }
        final ViewGroup viewGroup2 = viewGroup;
        this.pointContainer = viewGroup2;
        if (this.context != null && viewGroup2 != null) {
            float f4 = AndroidUtilities.displaySize.y / 2.0f;
            View view = this.scrimView;
            if (view != null) {
                getPointOnScreen(view, viewGroup2, this.point);
                float[] fArr = this.point;
                f = fArr[1];
                f2 = fArr[0];
            } else {
                f = f4;
                f2 = 0.0f;
            }
            RectF rectF = new RectF();
            View view2 = this.scrimView;
            if (view2 instanceof ScrimView) {
                ((ScrimView) view2).getBounds(rectF);
            } else {
                int i6 = this.animateToWidth;
                if (i6 == 0 || (i = this.animateToHeight) == 0) {
                    measuredWidth = view2.getMeasuredWidth();
                    measuredHeight = this.scrimView.getMeasuredHeight();
                } else {
                    measuredWidth = i6;
                    measuredHeight = i;
                }
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            }
            float f5 = f2 + rectF.left;
            float f6 = f + rectF.top;
            if (this.ignoreX) {
                this.point[0] = 0.0f;
                f5 = 0.0f;
            }
            if (this.dimAlpha > 0) {
                final DimView dimView3 = new DimView(this.context);
                this.dimView = dimView3;
                this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda2
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        boolean lambda$show$10;
                        lambda$show$10 = ItemOptions.lambda$show$10(ItemOptions.DimView.this);
                        return lambda$show$10;
                    }
                };
                viewGroup2.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
                viewGroup2.addView(this.dimView, LayoutHelper.createFrame(-1, -1.0f));
                this.dimView.setProgress(0.0f);
                if (this.hideScrimUnder) {
                    this.scrimView.setVisibility(4);
                }
                ValueAnimator valueAnimator = this.dimAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.dimAnimator = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.dimAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        ItemOptions.this.lambda$show$11(valueAnimator2);
                    }
                });
                this.dimAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ItemOptions.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (ItemOptions.this.dimView != null) {
                            ItemOptions.this.dimView.setProgress(1.0f);
                            ItemOptions.this.dimView.invalidate();
                        }
                        ItemOptions.this.dimAnimator = null;
                    }
                });
                if (this.allowMoveScrim) {
                    this.dimAnimator.setDuration(380L);
                    this.dimAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                } else {
                    this.dimAnimator.setDuration(150L);
                }
                this.dimAnimator.start();
            }
            if (this.allowMoveScrim && (dimView2 = this.dimView) != null && this.animateToWidth != 0) {
                dimView2.moveToX = (viewGroup2.getWidth() - this.animateToWidth) / 2.0f;
                f5 += (-this.point[0]) + ((viewGroup2.getWidth() - this.animateToWidth) / 2.0f);
            }
            float f7 = f5;
            this.layout.measure(View.MeasureSpec.makeMeasureSpec(viewGroup2.getMeasuredWidth(), TLRPC.FLAG_31), View.MeasureSpec.makeMeasureSpec(viewGroup2.getMeasuredHeight(), TLRPC.FLAG_31));
            RectF rectF2 = new RectF();
            android.graphics.Rect padding = this.lastLayout.getPadding();
            rectF2.set(padding.left, padding.top, this.layout.getMeasuredWidth() - padding.right, this.layout.getMeasuredHeight() - padding.bottom);
            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(this.layout, -2, -2) { // from class: org.telegram.ui.Components.ItemOptions.4
                @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow, android.widget.PopupWindow
                public void dismiss() {
                    super.dismiss();
                    ItemOptions.this.dismissDim(viewGroup2);
                    if (ItemOptions.this.dismissListener != null) {
                        ItemOptions.this.dismissListener.run();
                        ItemOptions.this.dismissListener = null;
                    }
                }
            };
            this.actionBarPopupWindow = actionBarPopupWindow;
            actionBarPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: org.telegram.ui.Components.ItemOptions.5
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    ItemOptions itemOptions = ItemOptions.this;
                    itemOptions.actionBarPopupWindow = null;
                    itemOptions.dismissDim(viewGroup2);
                    if (ItemOptions.this.dismissListener != null) {
                        ItemOptions.this.dismissListener.run();
                        ItemOptions.this.dismissListener = null;
                    }
                }
            });
            this.actionBarPopupWindow.setOutsideTouchable(true);
            this.actionBarPopupWindow.setFocusable(true);
            this.actionBarPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
            this.actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            if (this.needsFocus) {
                this.actionBarPopupWindow.setInputMethodMode(1);
                this.actionBarPopupWindow.setSoftInputMode(32);
            } else {
                this.actionBarPopupWindow.setInputMethodMode(2);
                this.actionBarPopupWindow.setSoftInputMode(0);
            }
            if (AndroidUtilities.isTablet()) {
                f6 += viewGroup2.getPaddingTop();
                f7 -= viewGroup2.getPaddingLeft();
            }
            if (this.scrimView != null) {
                int i7 = this.gravity;
                if (i7 != 5) {
                    if (i7 == 1) {
                        x = viewGroup2.getX() + f7 + (rectF.width() / 2.0f);
                        f3 = this.layout.getMeasuredWidth() / 2.0f;
                    } else if (rectF2.width() + f7 <= viewGroup2.getWidth()) {
                        x = viewGroup2.getX() + f7;
                        f3 = rectF2.left;
                    }
                    width = (int) (x - f3);
                }
                x = viewGroup2.getX() + f7 + rectF.width();
                f3 = rectF2.right;
                width = (int) (x - f3);
            } else {
                width = (viewGroup2.getWidth() - this.layout.getMeasuredWidth()) / 2;
            }
            float height2 = this.onTopOfScrim ? 0.0f : rectF.height();
            if (this.forceBottom) {
                float f8 = f6 + height2;
                height = this.allowMoveScrim ? (int) f8 : (int) ((Math.min(f8, AndroidUtilities.displaySize.y) - this.layout.getMeasuredHeight()) + viewGroup2.getY());
            } else if (this.scrimView != null) {
                if (this.forceTop || f6 + height2 + this.layout.getMeasuredHeight() + AndroidUtilities.dp(16.0f) > AndroidUtilities.displaySize.y - AndroidUtilities.navigationBarHeight) {
                    f6 = (f6 - height2) - this.layout.getMeasuredHeight();
                    if (this.allowCenter && Math.max(0.0f, f6 + height2) + this.layout.getMeasuredHeight() > this.point[1] + rectF.top && rectF.height() == this.scrimView.getHeight()) {
                        f6 = (((viewGroup2.getHeight() - this.layout.getMeasuredHeight()) / 2.0f) - height2) - viewGroup2.getY();
                    } else {
                        z = true;
                        height = (int) (f6 + height2 + viewGroup2.getY());
                        if (this.swipeback && z && !this.overridenSwipebackGravity && (actionBarPopupWindowLayout = this.lastLayout) != null) {
                            actionBarPopupWindowLayout.swipeBackGravityBottom = true;
                        }
                        if (this.allowMoveScrim && (dimView = this.dimView) != null) {
                            dimView.moveToY = (viewGroup2.getHeight() - (this.layout.getMeasuredHeight() + rectF.bottom)) / 2.0f;
                            height = (int) (this.dimView.moveToY + rectF.bottom);
                            width = (int) (((this.dimView.moveToX + rectF.right) - this.layout.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                        }
                        baseFragment = this.fragment;
                        if (baseFragment == null && baseFragment.getFragmentView() != null) {
                            this.fragment.getFragmentView().getRootView().dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        } else if (this.container != null) {
                            viewGroup2.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                        }
                        this.actionBarPopupWindow.setScaleOut(this.scaleOut);
                        ActionBarPopupWindow actionBarPopupWindow2 = this.actionBarPopupWindow;
                        float f9 = width + this.translateX;
                        this.offsetX = f9;
                        float f10 = height + this.translateY;
                        this.offsetY = f10;
                        actionBarPopupWindow2.showAtLocation(viewGroup2, 0, (int) f9, (int) f10);
                    }
                }
                z = false;
                height = (int) (f6 + height2 + viewGroup2.getY());
                if (this.swipeback) {
                    actionBarPopupWindowLayout.swipeBackGravityBottom = true;
                }
                if (this.allowMoveScrim) {
                    dimView.moveToY = (viewGroup2.getHeight() - (this.layout.getMeasuredHeight() + rectF.bottom)) / 2.0f;
                    height = (int) (this.dimView.moveToY + rectF.bottom);
                    width = (int) (((this.dimView.moveToX + rectF.right) - this.layout.getMeasuredWidth()) + AndroidUtilities.dp(4.0f));
                }
                baseFragment = this.fragment;
                if (baseFragment == null) {
                }
                if (this.container != null) {
                }
                this.actionBarPopupWindow.setScaleOut(this.scaleOut);
                ActionBarPopupWindow actionBarPopupWindow22 = this.actionBarPopupWindow;
                float f92 = width + this.translateX;
                this.offsetX = f92;
                float f102 = height + this.translateY;
                this.offsetY = f102;
                actionBarPopupWindow22.showAtLocation(viewGroup2, 0, (int) f92, (int) f102);
            } else {
                height = (viewGroup2.getHeight() - this.layout.getMeasuredHeight()) / 2;
            }
            z = false;
            if (this.swipeback) {
            }
            if (this.allowMoveScrim) {
            }
            baseFragment = this.fragment;
            if (baseFragment == null) {
            }
            if (this.container != null) {
            }
            this.actionBarPopupWindow.setScaleOut(this.scaleOut);
            ActionBarPopupWindow actionBarPopupWindow222 = this.actionBarPopupWindow;
            float f922 = width + this.translateX;
            this.offsetX = f922;
            float f1022 = height + this.translateY;
            this.offsetY = f1022;
            actionBarPopupWindow222.showAtLocation(viewGroup2, 0, (int) f922, (int) f1022);
        }
        return this;
    }

    public ItemOptions translate(float f, float f2) {
        this.translateX += f;
        this.translateY += f2;
        return this;
    }

    public void updateColors() {
    }
}
