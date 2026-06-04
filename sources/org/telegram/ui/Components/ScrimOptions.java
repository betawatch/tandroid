package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

/* loaded from: classes5.dex */
public class ScrimOptions extends Dialog {
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private final FrameLayout containerView;
    public final Context context;
    public final int currentAccount;
    private boolean dismissing;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    private boolean isGroup;
    private ValueAnimator openAnimator;
    private float openProgress;
    private ItemOptions options;
    private boolean optionsAtCenter;
    private FrameLayout optionsContainer;
    private View optionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    private ChatMessageCell scrimCell;
    private Drawable scrimDrawable;
    private Drawable scrimDrawableBackground;
    private float scrimDrawableSh;
    private float scrimDrawableSw;
    private float scrimDrawableTx1;
    private float scrimDrawableTx2;
    private float scrimDrawableTy1;
    private float scrimDrawableTy2;
    private final FrameLayout windowView;

    public ScrimOptions(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.currentAccount = UserConfig.selectedAccount;
        this.scrimDrawableSw = 1.0f;
        this.scrimDrawableSh = 1.0f;
        this.dismissing = false;
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.Components.ScrimOptions.1
            @Override // android.view.ViewGroup, android.view.View
            protected void dispatchDraw(Canvas canvas) {
                if (ScrimOptions.this.openProgress > 0.0f && ScrimOptions.this.blurBitmapPaint != null) {
                    ScrimOptions.this.blurMatrix.reset();
                    float width = getWidth() / ScrimOptions.this.blurBitmap.getWidth();
                    ScrimOptions.this.blurMatrix.postScale(width, width);
                    ScrimOptions.this.blurBitmapShader.setLocalMatrix(ScrimOptions.this.blurMatrix);
                    ScrimOptions.this.blurBitmapPaint.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ScrimOptions.this.blurBitmapPaint);
                }
                super.dispatchDraw(canvas);
                if (ScrimOptions.this.scrimDrawable != null) {
                    ScrimOptions.this.scrimDrawable.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                    canvas.save();
                    canvas.translate(ScrimOptions.this.scrimDrawableTx2 + (ScrimOptions.this.scrimDrawableTx1 * ScrimOptions.this.openProgress), ScrimOptions.this.scrimDrawableTy2 + (ScrimOptions.this.scrimDrawableTy1 * ScrimOptions.this.openProgress));
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(ScrimOptions.this.scrimDrawableSw, ScrimOptions.this.scrimDrawableSh), Math.max(ScrimOptions.this.scrimDrawableSw, ScrimOptions.this.scrimDrawableSh), 0.75f), 1.0f, ScrimOptions.this.openProgress);
                    canvas.scale(lerp, lerp, (-ScrimOptions.this.scrimDrawableTx2) + ScrimOptions.this.scrimDrawable.getBounds().left + ((ScrimOptions.this.scrimDrawable.getBounds().width() / 2.0f) * ScrimOptions.this.scrimDrawableSw), (-ScrimOptions.this.scrimDrawableTy2) + ScrimOptions.this.scrimDrawable.getBounds().top + ((ScrimOptions.this.scrimDrawable.getBounds().height() / 2.0f) * ScrimOptions.this.scrimDrawableSh));
                    if (ScrimOptions.this.scrimDrawableBackground != null) {
                        ScrimOptions.this.scrimDrawableBackground.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                        ScrimOptions.this.scrimDrawableBackground.draw(canvas);
                    }
                    ScrimOptions.this.scrimDrawable.draw(canvas);
                    canvas.restore();
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ScrimOptions.this.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                ScrimOptions.this.layout();
            }

            @Override // android.view.View
            protected void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                ScrimOptions.this.checkBitmapMatrix();
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScrimOptions.this.lambda$new$0(view);
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context);
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setClipToPadding(false);
        frameLayout.addView(sizeNotifierFrameLayout, LayoutHelper.createFrame(-1, -1, 119));
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.setSourceRootView(new ViewPositionWatcher(frameLayout), frameLayout);
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() { // from class: org.telegram.ui.Components.ScrimOptions.2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.systemBars());
                ScrimOptions.this.containerView.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                ScrimOptions.this.windowView.requestLayout();
                return WindowInsetsCompat.CONSUMED;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        onBackPressed();
    }

    public void setItemOptions(ItemOptions itemOptions) {
        this.options = itemOptions.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f)).setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        this.optionsView = itemOptions.getLayout();
        FrameLayout frameLayout = new FrameLayout(this.context);
        this.optionsContainer = frameLayout;
        frameLayout.addView(this.optionsView, LayoutHelper.createFrame(-2, -2.0f));
        this.containerView.addView(this.optionsContainer, LayoutHelper.createFrame(-2, -2.0f));
    }

    public void setOptionsAtCenter() {
        ((FrameLayout.LayoutParams) this.optionsContainer.getLayoutParams()).gravity = 1;
        this.optionsAtCenter = true;
    }

    public FrameLayout getWindowView() {
        return this.windowView;
    }

    @Override // android.app.Dialog
    public boolean isShowing() {
        return !this.dismissing;
    }

    @Override // android.app.Dialog
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            prepareBlur(null);
            animateOpenTo(true, null);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        animateOpenTo(false, new Runnable() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ScrimOptions.this.lambda$dismiss$2();
            }
        });
        this.windowView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$1() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismiss$2() {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                ScrimOptions.this.lambda$dismiss$1();
            }
        });
    }

    public void dismissFast() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        animateOpenTo(false, 2.0f, new Runnable() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ScrimOptions.this.lambda$dismissFast$4();
            }
        });
        this.windowView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissFast$3() {
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissFast$4() {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                ScrimOptions.this.lambda$dismissFast$3();
            }
        });
    }

    private void animateOpenTo(boolean z, Runnable runnable) {
        animateOpenTo(z, 1.0f, runnable);
    }

    private void animateOpenTo(final boolean z, float f, final Runnable runnable) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ScrimOptions.this.lambda$animateOpenTo$5(valueAnimator2);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Components.ScrimOptions.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ScrimOptions.this.openProgress = z ? 1.0f : 0.0f;
                ScrimOptions.this.optionsView.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, ScrimOptions.this.openProgress));
                ScrimOptions.this.optionsView.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ScrimOptions.this.openProgress));
                ScrimOptions.this.optionsView.setAlpha(ScrimOptions.this.openProgress);
                ScrimOptions.this.windowView.invalidate();
                ScrimOptions.this.containerView.invalidate();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
        });
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(350L);
        this.openAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateOpenTo$5(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.openProgress = floatValue;
        this.optionsView.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
        this.optionsView.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, this.openProgress));
        this.optionsView.setAlpha(this.openProgress);
        this.windowView.invalidate();
        this.containerView.invalidate();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.isCurrentThemeDark());
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        makeGlobalBlurBitmaps(new Utilities.Callback2() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda2
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                ScrimOptions.this.lambda$prepareBlur$6(view, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareBlur$6(View view, Bitmap bitmap, Bitmap bitmap2) {
        if (view != null) {
            view.setVisibility(0);
        }
        this.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap3 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        this.blurMatrix = new Matrix();
        this.iBlur3SourceBitmap.setBitmap(bitmap2);
        checkBitmapMatrix();
    }

    public static void makeGlobalBlurBitmaps(final Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ScrimOptions.lambda$makeGlobalBlurBitmaps$7(Utilities.Callback2.this, (Bitmap) obj);
            }
        }, 15.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeGlobalBlurBitmaps$7(Utilities.Callback2 callback2, Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.04f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.04f : -0.07f);
        Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
        applyColorMatrix.setHasAlpha(false);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(Theme.isCurrentThemeDark() ? 2.0f : 3.0f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, Theme.isCurrentThemeDark() ? -0.2f : -0.07f);
        Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
        applyColorMatrix2.setHasAlpha(false);
        bitmap.recycle();
        callback2.run(applyColorMatrix, applyColorMatrix2);
    }

    public static void makeGlobalBlurBitmaps(final View view, final Utilities.Callback2 callback2) {
        if (view == null) {
            makeGlobalBlurBitmaps(callback2);
        } else {
            AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda8
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    ScrimOptions.lambda$makeGlobalBlurBitmaps$8(view, callback2, (Bitmap) obj);
                }
            }, 15.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeGlobalBlurBitmaps$8(View view, Utilities.Callback2 callback2, Bitmap bitmap) {
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            view.getLocationOnScreen(new int[2]);
            int clamp = Utilities.clamp((int) ((r0[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
            int clamp2 = Utilities.clamp((int) ((r0[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
            int clamp3 = Utilities.clamp((int) ((view.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
            int clamp4 = Utilities.clamp((int) ((view.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
            if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
            }
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.04f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.04f : -0.07f);
        Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
        applyColorMatrix.setHasAlpha(false);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(Theme.isCurrentThemeDark() ? 2.0f : 3.0f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, Theme.isCurrentThemeDark() ? -0.2f : -0.07f);
        Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
        applyColorMatrix2.setHasAlpha(false);
        bitmap.recycle();
        callback2.run(applyColorMatrix, applyColorMatrix2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkBitmapMatrix() {
        Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this.windowView);
        View view = this.optionsView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void layout() {
        boolean z;
        Drawable drawable = this.scrimDrawable;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            if (this.optionsContainer != null) {
                float f = bounds.left;
                float f2 = this.scrimDrawableTx2;
                float f3 = f + f2;
                float f4 = bounds.right + f2;
                float f5 = bounds.top;
                float f6 = this.scrimDrawableTy2;
                float f7 = f5 + f6;
                float f8 = bounds.bottom + f6;
                boolean z2 = true;
                if (this.optionsAtCenter) {
                    z = false;
                } else {
                    if (f4 - r1.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                        this.optionsView.setPivotX(AndroidUtilities.dp(6.0f));
                        this.optionsContainer.setX(Math.min(this.containerView.getWidth() - this.optionsContainer.getWidth(), f3 - AndroidUtilities.dp(10.0f)) - this.containerView.getX());
                        z = false;
                    } else {
                        this.optionsView.setPivotX(r1.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                        this.optionsContainer.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f4) - this.optionsContainer.getMeasuredWidth()) - this.containerView.getX());
                        z = true;
                    }
                    this.scrimDrawableTx1 = z ? ((this.optionsContainer.getX() + this.optionsContainer.getWidth()) - AndroidUtilities.dp(6.0f)) - f4 : (this.optionsContainer.getX() + AndroidUtilities.dp(10.0f)) - f3;
                    this.scrimDrawableTy1 = 0.0f;
                }
                float dp = f8 + (this.scrimDrawableBackground != null ? AndroidUtilities.dp(21.0f) : 0);
                if (this.optionsContainer.getMeasuredHeight() + dp > this.windowView.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                    this.optionsView.setPivotY(r0.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                    this.optionsContainer.setY(((f7 - AndroidUtilities.dp(4.0f)) - this.optionsContainer.getMeasuredHeight()) - this.containerView.getY());
                } else {
                    this.optionsView.setPivotY(AndroidUtilities.dp(6.0f));
                    this.optionsContainer.setY(Math.min((this.windowView.getHeight() - this.optionsContainer.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), dp) - this.containerView.getY());
                    z2 = false;
                }
                this.options.setSwipebackGravity(z, z2);
            }
        }
    }

    public void setScrimDrawable(Drawable drawable, int i, int i2) {
        BlurredBackgroundDrawable radius = this.iBlur3Factory.create().setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider)).setPadding(AndroidUtilities.dp(8.0f)).setHasPadding(true).setRadius(AndroidUtilities.dp(16.0f));
        this.scrimDrawableBackground = radius;
        this.scrimDrawable = drawable;
        Point point = AndroidUtilities.displaySize;
        int i3 = (point.x - i) / 2;
        int i4 = (point.y - i2) / 2;
        int i5 = i + i3;
        int i6 = i2 + i4;
        radius.setBounds(i3 - AndroidUtilities.dp(8.0f), i4 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i5, AndroidUtilities.dp(8.0f) + i6);
        this.scrimDrawable.setBounds(i3, i4, i5, i6);
    }

    public void setScrim(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, CharSequence charSequence) {
        setScrim(chatMessageCell, characterStyle, charSequence, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0238 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setScrim(final ChatMessageCell chatMessageCell, CharacterStyle characterStyle, CharSequence charSequence, boolean z) {
        float f;
        float f2;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f3;
        int i;
        int i2;
        int i3;
        StaticLayout staticLayout;
        int i4;
        float f4;
        StaticLayout staticLayout2;
        float f5;
        int i5;
        StaticLayout staticLayout3;
        RectF rectF;
        RectF rectF2;
        final Bitmap bitmap;
        SpannableStringBuilder spannableStringBuilder;
        int i6;
        RichMessageLayout richMessageLayout;
        RichMessageLayout.FoundLink findLink;
        ArrayList<ChatMessageCell.PollButton> pollButtons;
        int i7;
        int i8;
        float f6;
        float f7;
        int i9;
        int i10;
        CharacterStyle[] characterStyleArr;
        if (chatMessageCell == null) {
            return;
        }
        this.scrimCell = chatMessageCell;
        int i11 = 0;
        this.isGroup = chatMessageCell.getCurrentMessagesGroup() != null;
        MessageObject messageObject = chatMessageCell.getMessageObject();
        boolean z2 = chatMessageCell.getExplanationLayout() != null && messageObject.expandedExplanation;
        if (z2 && z) {
            f = chatMessageCell.getExplanationX();
            f2 = chatMessageCell.getExplanationY();
            arrayList = chatMessageCell.getExplanationLayout().textLayoutBlocks;
            f3 = chatMessageCell.getExplanationLayout().textXOffset;
        } else if (chatMessageCell.getCaptionLayout() != null) {
            f = chatMessageCell.getCaptionX();
            f2 = chatMessageCell.getCaptionY();
            arrayList = chatMessageCell.getCaptionLayout().textLayoutBlocks;
            f3 = chatMessageCell.getCaptionLayout().textXOffset;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            arrayList = null;
            f3 = 0.0f;
        }
        if (arrayList == null) {
            f = chatMessageCell.getTextX();
            f2 = chatMessageCell.getTextY() + chatMessageCell.transitionYOffsetForDrawables;
            arrayList = messageObject.textLayoutBlocks;
            f3 = messageObject.textXOffset;
        }
        if (arrayList != null) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i12);
                StaticLayout staticLayout4 = textLayoutBlock.textLayout;
                if (staticLayout4 != null && (staticLayout4.getText() instanceof Spanned) && (characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout4.getText()).getSpans(i11, staticLayout4.getText().length(), CharacterStyle.class)) != null) {
                    for (CharacterStyle characterStyle2 : characterStyleArr) {
                        if (characterStyle2 == characterStyle) {
                            i2 = ((Spanned) staticLayout4.getText()).getSpanStart(characterStyle);
                            i3 = ((Spanned) staticLayout4.getText()).getSpanEnd(characterStyle);
                            f += textLayoutBlock.isRtl() ? (int) Math.ceil(f3) : 0;
                            f2 += textLayoutBlock.padTop + textLayoutBlock.textYOffset(arrayList, chatMessageCell.transitionParams);
                            i = textLayoutBlock.originalWidth;
                            staticLayout = staticLayout4;
                            if (staticLayout == null && chatMessageCell.getDescriptionlayout() != null) {
                                StaticLayout descriptionlayout = chatMessageCell.getDescriptionlayout();
                                i9 = 0;
                                staticLayout = staticLayout;
                                while (i9 == 0) {
                                    if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                                        i10 = i;
                                        CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                                        if (characterStyleArr2 != null) {
                                            for (CharacterStyle characterStyle3 : characterStyleArr2) {
                                                if (characterStyle3 == characterStyle) {
                                                    int spanStart = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                                    int spanEnd = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                                    float descriptionLayoutX = chatMessageCell.getDescriptionLayoutX();
                                                    float descriptionLayoutY = chatMessageCell.getDescriptionLayoutY();
                                                    staticLayout = descriptionlayout;
                                                    i2 = spanStart;
                                                    i = descriptionlayout.getWidth();
                                                    i3 = spanEnd;
                                                    f = descriptionLayoutX;
                                                    f2 = descriptionLayoutY;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        i10 = i;
                                    }
                                    i = i10;
                                    i9++;
                                    staticLayout = staticLayout;
                                }
                            }
                            if (staticLayout == null && ((messageObject.isTodo() || messageObject.isPoll()) && (pollButtons = chatMessageCell.getPollButtons()) != null)) {
                                i7 = 0;
                                staticLayout = staticLayout;
                                while (i7 < pollButtons.size()) {
                                    ChatMessageCell.PollButton pollButton = pollButtons.get(i7);
                                    StaticLayout staticLayout5 = pollButton.title;
                                    if (staticLayout5 == null) {
                                        i8 = i;
                                    } else {
                                        i8 = i;
                                        if (staticLayout5.getText() instanceof Spanned) {
                                            f6 = f;
                                            f7 = f2;
                                            CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout5.getText()).getSpans(0, staticLayout5.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr3 != null) {
                                                for (CharacterStyle characterStyle4 : characterStyleArr3) {
                                                    if (characterStyle4 == characterStyle) {
                                                        int spanStart2 = ((Spanned) staticLayout5.getText()).getSpanStart(characterStyle);
                                                        int spanEnd2 = ((Spanned) staticLayout5.getText()).getSpanEnd(characterStyle);
                                                        float f8 = pollButton.titleX;
                                                        float f9 = pollButton.titleY;
                                                        staticLayout = staticLayout5;
                                                        i2 = spanStart2;
                                                        i = staticLayout5.getWidth();
                                                        i3 = spanEnd2;
                                                        f = f8;
                                                        f2 = f9;
                                                        break;
                                                    }
                                                }
                                            }
                                            i = i8;
                                            f2 = f7;
                                            f = f6;
                                            i7++;
                                            staticLayout = staticLayout;
                                        }
                                    }
                                    f6 = f;
                                    f7 = f2;
                                    i = i8;
                                    f2 = f7;
                                    f = f6;
                                    i7++;
                                    staticLayout = staticLayout;
                                }
                            }
                            if (staticLayout == null || messageObject == null || (richMessageLayout = messageObject.richLayout) == null || (findLink = richMessageLayout.findLink(characterStyle)) == null) {
                                i4 = i;
                                f4 = f;
                                staticLayout2 = staticLayout;
                            } else {
                                StaticLayout staticLayout6 = findLink.layout;
                                int i13 = findLink.start;
                                i3 = findLink.end;
                                i2 = i13;
                                i4 = findLink.originalWidth;
                                f4 = chatMessageCell.getTextX() + findLink.x;
                                f2 = findLink.y + chatMessageCell.getTextY();
                                staticLayout2 = staticLayout6;
                            }
                            if (staticLayout2 != null && z2 && !z) {
                                setScrim(chatMessageCell, characterStyle, charSequence, true);
                                return;
                            }
                            if (staticLayout2 != null) {
                                return;
                            }
                            if (charSequence != null) {
                                int lineForOffset = staticLayout2.getLineForOffset(i2);
                                float lineTop = staticLayout2.getLineTop(lineForOffset) + f2;
                                float primaryHorizontal = staticLayout2.getPrimaryHorizontal(i2);
                                float lineWidth = staticLayout2.getLineWidth(lineForOffset);
                                LinkPath linkPath = new LinkPath(true);
                                linkPath.setCurrentLayout(staticLayout2, i2, 0.0f);
                                staticLayout2.getSelectionPath(i2, i3, linkPath);
                                RectF rectF3 = new RectF();
                                linkPath.computeBounds(rectF3, true);
                                StaticLayout makeStaticLayout = MessageObject.makeStaticLayout(charSequence, staticLayout2.getPaint(), staticLayout2.getWidth(), 1.0f, 0.0f, false);
                                i5 = charSequence.length();
                                float width = makeStaticLayout.getWidth();
                                float f10 = 0.0f;
                                for (int i14 = 0; i14 < makeStaticLayout.getLineCount(); i14++) {
                                    width = Math.min(width, makeStaticLayout.getLineLeft(i14));
                                    f10 = Math.max(f10, makeStaticLayout.getLineRight(i14));
                                }
                                f4 += Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, f10 - width)));
                                f5 = lineTop;
                                staticLayout3 = makeStaticLayout;
                                i2 = 0;
                                rectF = rectF3;
                            } else {
                                f5 = f2;
                                i5 = i3;
                                staticLayout3 = staticLayout2;
                                rectF = null;
                            }
                            float f11 = f4;
                            final Paint paint = new Paint(1);
                            paint.setColor(Theme.getColor(messageObject.isOutOwner() ? Theme.key_chat_outBubble : Theme.key_chat_inBubble, this.resourcesProvider));
                            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
                            final LinkPath linkPath2 = new LinkPath(true);
                            linkPath2.setUseCornerPathImplementation(true);
                            linkPath2.setCurrentLayout(staticLayout3, i2, 0.0f);
                            staticLayout3.getSelectionPath(i2, i5, linkPath2);
                            linkPath2.closeRects();
                            final RectF rectF4 = new RectF();
                            linkPath2.computeBounds(rectF4, true);
                            int width2 = (int) (rectF4.width() + LinkPath.getRadius());
                            if (!chatMessageCell.drawBackgroundInParent() || width2 <= 0) {
                                rectF2 = rectF;
                            } else {
                                if (rectF4.height() > 0.0f) {
                                    Bitmap createBitmap = Bitmap.createBitmap(width2, (int) rectF4.height(), Bitmap.Config.ALPHA_8);
                                    Canvas canvas = new Canvas(createBitmap);
                                    rectF2 = rectF;
                                    Paint paint2 = new Paint(1);
                                    paint2.setColor(-1);
                                    canvas.drawRect(0.0f, 0.0f, width2, rectF4.height(), paint2);
                                    Paint paint3 = new Paint(1);
                                    paint3.setColor(-1);
                                    paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
                                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                    canvas.translate(-rectF4.left, -rectF4.top);
                                    canvas.drawPath(linkPath2, paint3);
                                    bitmap = createBitmap;
                                    final Paint paint4 = new Paint(3);
                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                    chatMessageCell.setupTextColors();
                                    TextPaint textPaint = new TextPaint(staticLayout3.getPaint());
                                    textPaint.set(staticLayout3.getPaint());
                                    spannableStringBuilder = new SpannableStringBuilder(AnimatedEmojiSpan.cloneSpans(staticLayout3.getText(), -1, textPaint.getFontMetricsInt()));
                                    if (i2 <= 0) {
                                        i6 = 0;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i2, 33);
                                    } else {
                                        i6 = 0;
                                    }
                                    if (i5 < spannableStringBuilder.length()) {
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, spannableStringBuilder.length(), 33);
                                    }
                                    final StaticLayout makeStaticLayout2 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint, i4, 1.0f, messageObject.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, false);
                                    final int[] iArr = new int[2];
                                    chatMessageCell.getLocationOnScreen(iArr);
                                    final int[] iArr2 = {iArr[0] + ((int) f11), iArr[1] + ((int) f5)};
                                    this.scrimDrawable = new Drawable() { // from class: org.telegram.ui.Components.ScrimOptions.4
                                        private int alpha = NotificationCenter.didReceiveSmsCode;

                                        @Override // android.graphics.drawable.Drawable
                                        public int getOpacity() {
                                            return -2;
                                        }

                                        @Override // android.graphics.drawable.Drawable
                                        public void setColorFilter(ColorFilter colorFilter) {
                                        }

                                        @Override // android.graphics.drawable.Drawable
                                        public void draw(Canvas canvas2) {
                                            if (this.alpha <= 0) {
                                                return;
                                            }
                                            RectF rectF5 = AndroidUtilities.rectTmp;
                                            rectF5.set(getBounds());
                                            rectF5.left -= LinkPath.getRadius() / 2.0f;
                                            canvas2.save();
                                            canvas2.saveLayerAlpha(rectF5, this.alpha, 31);
                                            int[] iArr3 = iArr2;
                                            canvas2.translate(iArr3[0], iArr3[1]);
                                            ChatMessageCell chatMessageCell2 = chatMessageCell;
                                            if (chatMessageCell2 != null && chatMessageCell2.drawBackgroundInParent()) {
                                                Theme.MessageDrawable messageDrawable = chatMessageCell.currentBackgroundDrawable;
                                                if (messageDrawable != null && messageDrawable.getPaint() != null) {
                                                    canvas2.save();
                                                    chatMessageCell.setBackgroundTopY(true);
                                                    canvas2.translate(0.0f, -chatMessageCell.currentBackgroundDrawable.getTopY());
                                                    canvas2.drawPaint(chatMessageCell.currentBackgroundDrawable.getPaint());
                                                    canvas2.restore();
                                                } else {
                                                    int[] iArr4 = iArr2;
                                                    canvas2.translate(-iArr4[0], -iArr4[1]);
                                                    int[] iArr5 = iArr;
                                                    canvas2.translate(iArr5[0], iArr5[1] + chatMessageCell.getPaddingTop());
                                                    chatMessageCell.drawBackgroundInternal(canvas2, true);
                                                    int[] iArr6 = iArr;
                                                    canvas2.translate(-iArr6[0], (-iArr6[1]) - chatMessageCell.getPaddingTop());
                                                    int[] iArr7 = iArr2;
                                                    canvas2.translate(iArr7[0], iArr7[1]);
                                                }
                                                if (bitmap != null) {
                                                    canvas2.save();
                                                    Bitmap bitmap2 = bitmap;
                                                    RectF rectF6 = rectF4;
                                                    canvas2.drawBitmap(bitmap2, rectF6.left, rectF6.top, paint4);
                                                    canvas2.restore();
                                                }
                                            } else {
                                                canvas2.drawPath(linkPath2, paint);
                                            }
                                            canvas2.clipPath(linkPath2);
                                            makeStaticLayout2.draw(canvas2);
                                            canvas2.restore();
                                        }

                                        @Override // android.graphics.drawable.Drawable
                                        public void setAlpha(int i15) {
                                            this.alpha = i15;
                                        }
                                    };
                                    int radius = (int) (iArr[0] + f11 + rectF4.left + (LinkPath.getRadius() / 2.0f));
                                    int i15 = (int) (iArr[1] + f5 + rectF4.top);
                                    this.scrimDrawable.setBounds(radius, i15, ((int) rectF4.width()) + radius, ((int) rectF4.height()) + i15);
                                    if (charSequence == null) {
                                        float f12 = radius;
                                        if (rectF4.width() + f12 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f)) {
                                            this.scrimDrawableTx2 -= (f12 + rectF4.width()) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f));
                                        }
                                        float f13 = i15;
                                        if (rectF4.height() + f13 > ((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f)) {
                                            this.scrimDrawableTy2 -= (f13 + rectF4.height()) - (((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f));
                                        }
                                        if (rectF2 != null) {
                                            this.scrimDrawableSw = rectF2.width() / rectF4.width();
                                            this.scrimDrawableSh = rectF2.height() / rectF4.height();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                rectF2 = rectF;
                            }
                            bitmap = null;
                            final Paint paint42 = new Paint(3);
                            paint42.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                            chatMessageCell.setupTextColors();
                            TextPaint textPaint2 = new TextPaint(staticLayout3.getPaint());
                            textPaint2.set(staticLayout3.getPaint());
                            spannableStringBuilder = new SpannableStringBuilder(AnimatedEmojiSpan.cloneSpans(staticLayout3.getText(), -1, textPaint2.getFontMetricsInt()));
                            if (i2 <= 0) {
                            }
                            if (i5 < spannableStringBuilder.length()) {
                            }
                            final StaticLayout makeStaticLayout22 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint2, i4, 1.0f, messageObject.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, false);
                            final int[] iArr3 = new int[2];
                            chatMessageCell.getLocationOnScreen(iArr3);
                            final int[] iArr22 = {iArr3[0] + ((int) f11), iArr3[1] + ((int) f5)};
                            this.scrimDrawable = new Drawable() { // from class: org.telegram.ui.Components.ScrimOptions.4
                                private int alpha = NotificationCenter.didReceiveSmsCode;

                                @Override // android.graphics.drawable.Drawable
                                public int getOpacity() {
                                    return -2;
                                }

                                @Override // android.graphics.drawable.Drawable
                                public void setColorFilter(ColorFilter colorFilter) {
                                }

                                @Override // android.graphics.drawable.Drawable
                                public void draw(Canvas canvas2) {
                                    if (this.alpha <= 0) {
                                        return;
                                    }
                                    RectF rectF5 = AndroidUtilities.rectTmp;
                                    rectF5.set(getBounds());
                                    rectF5.left -= LinkPath.getRadius() / 2.0f;
                                    canvas2.save();
                                    canvas2.saveLayerAlpha(rectF5, this.alpha, 31);
                                    int[] iArr32 = iArr22;
                                    canvas2.translate(iArr32[0], iArr32[1]);
                                    ChatMessageCell chatMessageCell2 = chatMessageCell;
                                    if (chatMessageCell2 != null && chatMessageCell2.drawBackgroundInParent()) {
                                        Theme.MessageDrawable messageDrawable = chatMessageCell.currentBackgroundDrawable;
                                        if (messageDrawable != null && messageDrawable.getPaint() != null) {
                                            canvas2.save();
                                            chatMessageCell.setBackgroundTopY(true);
                                            canvas2.translate(0.0f, -chatMessageCell.currentBackgroundDrawable.getTopY());
                                            canvas2.drawPaint(chatMessageCell.currentBackgroundDrawable.getPaint());
                                            canvas2.restore();
                                        } else {
                                            int[] iArr4 = iArr22;
                                            canvas2.translate(-iArr4[0], -iArr4[1]);
                                            int[] iArr5 = iArr3;
                                            canvas2.translate(iArr5[0], iArr5[1] + chatMessageCell.getPaddingTop());
                                            chatMessageCell.drawBackgroundInternal(canvas2, true);
                                            int[] iArr6 = iArr3;
                                            canvas2.translate(-iArr6[0], (-iArr6[1]) - chatMessageCell.getPaddingTop());
                                            int[] iArr7 = iArr22;
                                            canvas2.translate(iArr7[0], iArr7[1]);
                                        }
                                        if (bitmap != null) {
                                            canvas2.save();
                                            Bitmap bitmap2 = bitmap;
                                            RectF rectF6 = rectF4;
                                            canvas2.drawBitmap(bitmap2, rectF6.left, rectF6.top, paint42);
                                            canvas2.restore();
                                        }
                                    } else {
                                        canvas2.drawPath(linkPath2, paint);
                                    }
                                    canvas2.clipPath(linkPath2);
                                    makeStaticLayout22.draw(canvas2);
                                    canvas2.restore();
                                }

                                @Override // android.graphics.drawable.Drawable
                                public void setAlpha(int i152) {
                                    this.alpha = i152;
                                }
                            };
                            int radius2 = (int) (iArr3[0] + f11 + rectF4.left + (LinkPath.getRadius() / 2.0f));
                            int i152 = (int) (iArr3[1] + f5 + rectF4.top);
                            this.scrimDrawable.setBounds(radius2, i152, ((int) rectF4.width()) + radius2, ((int) rectF4.height()) + i152);
                            if (charSequence == null) {
                            }
                        }
                    }
                }
                i12++;
                i11 = 0;
            }
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        staticLayout = null;
        if (staticLayout == null) {
            StaticLayout descriptionlayout2 = chatMessageCell.getDescriptionlayout();
            i9 = 0;
            staticLayout = staticLayout;
            while (i9 == 0) {
            }
        }
        if (staticLayout == null) {
            i7 = 0;
            staticLayout = staticLayout;
            while (i7 < pollButtons.size()) {
            }
        }
        if (staticLayout == null) {
        }
        i4 = i;
        f4 = f;
        staticLayout2 = staticLayout;
        if (staticLayout2 != null) {
        }
        if (staticLayout2 != null) {
        }
    }
}
