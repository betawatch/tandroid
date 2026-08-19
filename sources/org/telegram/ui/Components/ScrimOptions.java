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
import android.os.Bundle;
import android.text.Layout;
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
import org.telegram.ui.ActionBar.MessageDrawable;
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
                Canvas canvas2;
                if (ScrimOptions.this.openProgress <= 0.0f || ScrimOptions.this.blurBitmapPaint == null) {
                    canvas2 = canvas;
                } else {
                    ScrimOptions.this.blurMatrix.reset();
                    float width = getWidth() / ScrimOptions.this.blurBitmap.getWidth();
                    ScrimOptions.this.blurMatrix.postScale(width, width);
                    ScrimOptions.this.blurBitmapShader.setLocalMatrix(ScrimOptions.this.blurMatrix);
                    ScrimOptions.this.blurBitmapPaint.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ScrimOptions.this.blurBitmapPaint);
                }
                super.dispatchDraw(canvas2);
                if (ScrimOptions.this.scrimDrawable != null) {
                    ScrimOptions.this.scrimDrawable.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                    canvas2.save();
                    canvas2.translate(ScrimOptions.this.scrimDrawableTx2 + (ScrimOptions.this.scrimDrawableTx1 * ScrimOptions.this.openProgress), ScrimOptions.this.scrimDrawableTy2 + (ScrimOptions.this.scrimDrawableTy1 * ScrimOptions.this.openProgress));
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(ScrimOptions.this.scrimDrawableSw, ScrimOptions.this.scrimDrawableSh), Math.max(ScrimOptions.this.scrimDrawableSw, ScrimOptions.this.scrimDrawableSh), 0.75f), 1.0f, ScrimOptions.this.openProgress);
                    canvas2.scale(lerp, lerp, (-ScrimOptions.this.scrimDrawableTx2) + ScrimOptions.this.scrimDrawable.getBounds().left + ((ScrimOptions.this.scrimDrawable.getBounds().width() / 2.0f) * ScrimOptions.this.scrimDrawableSw), (-ScrimOptions.this.scrimDrawableTy2) + ScrimOptions.this.scrimDrawable.getBounds().top + ((ScrimOptions.this.scrimDrawable.getBounds().height() / 2.0f) * ScrimOptions.this.scrimDrawableSh));
                    if (ScrimOptions.this.scrimDrawableBackground != null) {
                        ScrimOptions.this.scrimDrawableBackground.setAlpha((int) (ScrimOptions.this.openProgress * 255.0f));
                        ScrimOptions.this.scrimDrawableBackground.draw(canvas2);
                    }
                    ScrimOptions.this.scrimDrawable.draw(canvas2);
                    canvas2.restore();
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
                ScrimOptions.this.onBackPressed();
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
                Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
                ScrimOptions.this.containerView.setPadding(defaultWindowInsets.left, defaultWindowInsets.top, defaultWindowInsets.right, defaultWindowInsets.bottom);
                ScrimOptions.this.windowView.requestLayout();
                return WindowInsetsCompat.CONSUMED;
            }
        });
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
                ScrimOptions.$r8$lambda$Qwwuzmrq2q7ZjciBQ5G6nUwzM0s(ScrimOptions.this);
            }
        });
        this.windowView.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$Qwwuzmrq2q7ZjciBQ5G6nUwzM0s(final ScrimOptions scrimOptions) {
        scrimOptions.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                super/*android.app.Dialog*/.dismiss();
            }
        });
    }

    public void dismissFast() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        animateOpenTo(false, 2.0f, new Runnable() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ScrimOptions.$r8$lambda$8V3yZuc7FCgSPXDzxeQbV-1JQ6U(ScrimOptions.this);
            }
        });
        this.windowView.invalidate();
    }

    public static /* synthetic */ void $r8$lambda$8V3yZuc7FCgSPXDzxeQbV-1JQ6U(final ScrimOptions scrimOptions) {
        scrimOptions.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                super/*android.app.Dialog*/.dismiss();
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
                ScrimOptions.$r8$lambda$-6MkXxIYJUu4hMIegmVvwNJvY-M(ScrimOptions.this, valueAnimator2);
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

    public static /* synthetic */ void $r8$lambda$-6MkXxIYJUu4hMIegmVvwNJvY-M(ScrimOptions scrimOptions, ValueAnimator valueAnimator) {
        scrimOptions.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        scrimOptions.openProgress = floatValue;
        scrimOptions.optionsView.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue));
        scrimOptions.optionsView.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, scrimOptions.openProgress));
        scrimOptions.optionsView.setAlpha(scrimOptions.openProgress);
        scrimOptions.windowView.invalidate();
        scrimOptions.containerView.invalidate();
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
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
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
                ScrimOptions.$r8$lambda$J_nM03ZcSufCsHupI0Ejlfl3kmc(ScrimOptions.this, view, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$J_nM03ZcSufCsHupI0Ejlfl3kmc(ScrimOptions scrimOptions, View view, Bitmap bitmap, Bitmap bitmap2) {
        if (view != null) {
            scrimOptions.getClass();
            view.setVisibility(0);
        }
        scrimOptions.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        scrimOptions.blurBitmapPaint = paint;
        Bitmap bitmap3 = scrimOptions.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        scrimOptions.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        scrimOptions.blurMatrix = new Matrix();
        scrimOptions.iBlur3SourceBitmap.setBitmap(bitmap2);
        scrimOptions.checkBitmapMatrix();
    }

    public static void makeGlobalBlurBitmaps(final Utilities.Callback2 callback2) {
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() { // from class: org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda1
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ScrimOptions.$r8$lambda$t4hDgimCWIj8tgunowf0q1ImPVw(Utilities.Callback2.this, (Bitmap) obj);
            }
        }, 15.0f);
    }

    public static /* synthetic */ void $r8$lambda$t4hDgimCWIj8tgunowf0q1ImPVw(Utilities.Callback2 callback2, Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.04f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.04f : -0.07f);
        Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
        applyColorMatrix.setHasAlpha(false);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(Theme.isCurrentThemeDark() ? 2.0f : 3.0f);
        if (!Theme.isCurrentThemeDark()) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, Theme.isCurrentThemeDark() ? -0.2f : -0.07f);
        }
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
                    ScrimOptions.$r8$lambda$7AwtP5SUIkivLwGZFKBd5UkJZxg(view, callback2, (Bitmap) obj);
                }
            }, 15.0f);
        }
    }

    public static /* synthetic */ void $r8$lambda$7AwtP5SUIkivLwGZFKBd5UkJZxg(View view, Utilities.Callback2 callback2, Bitmap bitmap) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.text.Layout] */
    /* JADX WARN: Type inference failed for: r12v15, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [android.text.Layout, android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r14v8, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.graphics.Path, org.telegram.ui.Components.CornerPath, org.telegram.ui.Components.LinkPath] */
    /* JADX WARN: Type inference failed for: r7v13, types: [android.graphics.Path, org.telegram.ui.Components.LinkPath] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setScrim(final ChatMessageCell chatMessageCell, CharacterStyle characterStyle, CharSequence charSequence, boolean z) {
        float f;
        float f2;
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        float f3;
        boolean z2;
        float f4;
        float f5;
        int i;
        int i2;
        int i3;
        ?? r14;
        float f6;
        RectF rectF;
        StaticLayout staticLayout;
        Layout layout;
        Bitmap bitmap;
        SpannableStringBuilder spannableStringBuilder;
        int i4;
        RichMessageLayout richMessageLayout;
        RichMessageLayout.FoundLink findLink;
        ArrayList<ChatMessageCell.PollButton> pollButtons;
        int i5;
        int i6;
        float f7;
        float f8;
        int i7;
        int i8;
        float f9;
        float f10;
        int i9;
        if (chatMessageCell == null) {
            return;
        }
        this.scrimCell = chatMessageCell;
        int i10 = 0;
        this.isGroup = chatMessageCell.getCurrentMessagesGroup() != null;
        MessageObject messageObject = chatMessageCell.getMessageObject();
        boolean z3 = chatMessageCell.getExplanationLayout() != null && messageObject.expandedExplanation;
        if (z3 && z) {
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
            int i11 = 0;
            while (i11 < arrayList.size()) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                StaticLayout staticLayout2 = textLayoutBlock.textLayout;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spanned)) {
                    z2 = z3;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) staticLayout2.getText()).getSpans(i10, staticLayout2.getText().length(), CharacterStyle.class);
                    if (characterStyleArr != null) {
                        for (CharacterStyle characterStyle2 : characterStyleArr) {
                            if (characterStyle2 == characterStyle) {
                                i = ((Spanned) staticLayout2.getText()).getSpanStart(characterStyle);
                                i3 = ((Spanned) staticLayout2.getText()).getSpanEnd(characterStyle);
                                if (textLayoutBlock.isRtl()) {
                                    f9 = f;
                                    f10 = f2;
                                    i9 = (int) Math.ceil(f3);
                                } else {
                                    f9 = f;
                                    f10 = f2;
                                    i9 = 0;
                                }
                                f4 = i9 + f9;
                                f5 = f10 + textLayoutBlock.padTop + textLayoutBlock.textYOffset(arrayList, chatMessageCell.transitionParams);
                                i2 = textLayoutBlock.originalWidth;
                                r14 = staticLayout2;
                                if (r14 == 0 && chatMessageCell.getDescriptionlayout() != null) {
                                    StaticLayout descriptionlayout = chatMessageCell.getDescriptionlayout();
                                    i7 = 0;
                                    r14 = r14;
                                    while (i7 == 0) {
                                        if (descriptionlayout != null && (descriptionlayout.getText() instanceof Spanned)) {
                                            i8 = i;
                                            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) ((Spanned) descriptionlayout.getText()).getSpans(0, descriptionlayout.getText().length(), CharacterStyle.class);
                                            if (characterStyleArr2 != null) {
                                                for (CharacterStyle characterStyle3 : characterStyleArr2) {
                                                    if (characterStyle3 == characterStyle) {
                                                        i = ((Spanned) descriptionlayout.getText()).getSpanStart(characterStyle);
                                                        i3 = ((Spanned) descriptionlayout.getText()).getSpanEnd(characterStyle);
                                                        f4 = chatMessageCell.getDescriptionLayoutX();
                                                        f5 = chatMessageCell.getDescriptionLayoutY();
                                                        i2 = descriptionlayout.getWidth();
                                                        r14 = descriptionlayout;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            i8 = i;
                                        }
                                        i = i8;
                                        i7++;
                                        r14 = r14;
                                    }
                                }
                                if (r14 == 0 && ((messageObject.isTodo() || messageObject.isPoll()) && (pollButtons = chatMessageCell.getPollButtons()) != null)) {
                                    i5 = 0;
                                    r14 = r14;
                                    while (i5 < pollButtons.size()) {
                                        ChatMessageCell.PollButton pollButton = pollButtons.get(i5);
                                        StaticLayout staticLayout3 = pollButton.title;
                                        if (staticLayout3 == null) {
                                            i6 = i;
                                        } else {
                                            i6 = i;
                                            if (staticLayout3.getText() instanceof Spanned) {
                                                f7 = f4;
                                                f8 = f5;
                                                CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) ((Spanned) staticLayout3.getText()).getSpans(0, staticLayout3.getText().length(), CharacterStyle.class);
                                                if (characterStyleArr3 != null) {
                                                    for (CharacterStyle characterStyle4 : characterStyleArr3) {
                                                        if (characterStyle4 == characterStyle) {
                                                            i = ((Spanned) staticLayout3.getText()).getSpanStart(characterStyle);
                                                            i3 = ((Spanned) staticLayout3.getText()).getSpanEnd(characterStyle);
                                                            f4 = pollButton.titleX;
                                                            f5 = pollButton.titleY;
                                                            i2 = staticLayout3.getWidth();
                                                            r14 = staticLayout3;
                                                            break;
                                                        }
                                                    }
                                                }
                                                i = i6;
                                                f5 = f8;
                                                f4 = f7;
                                                i5++;
                                                r14 = r14;
                                            }
                                        }
                                        f7 = f4;
                                        f8 = f5;
                                        i = i6;
                                        f5 = f8;
                                        f4 = f7;
                                        i5++;
                                        r14 = r14;
                                    }
                                }
                                if (r14 == 0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && (findLink = richMessageLayout.findLink(characterStyle)) != null) {
                                    r14 = findLink.layout;
                                    i = findLink.start;
                                    i3 = findLink.end;
                                    i2 = findLink.originalWidth;
                                    f4 = chatMessageCell.getTextX() + findLink.x;
                                    f5 = chatMessageCell.getTextY() + findLink.y;
                                }
                                int i12 = i2;
                                int i13 = i;
                                float f11 = f4;
                                int i14 = i3;
                                if (r14 != 0 && z2 && !z) {
                                    setScrim(chatMessageCell, characterStyle, charSequence, true);
                                    return;
                                }
                                if (r14 != 0) {
                                    return;
                                }
                                if (charSequence != null) {
                                    int lineForOffset = r14.getLineForOffset(i13);
                                    float lineTop = f5 + r14.getLineTop(lineForOffset);
                                    float primaryHorizontal = r14.getPrimaryHorizontal(i13);
                                    float lineWidth = r14.getLineWidth(lineForOffset);
                                    ?? linkPath = new LinkPath(true);
                                    linkPath.setCurrentLayout(r14, i13, 0.0f);
                                    r14.getSelectionPath(i13, i14, linkPath);
                                    RectF rectF2 = new RectF();
                                    linkPath.computeBounds(rectF2, true);
                                    StaticLayout makeStaticLayout = MessageObject.makeStaticLayout(charSequence, r14.getPaint(), r14.getWidth(), 1.0f, 0.0f, false);
                                    i14 = charSequence.length();
                                    float width = makeStaticLayout.getWidth();
                                    float f12 = 0.0f;
                                    for (int i15 = 0; i15 < makeStaticLayout.getLineCount(); i15++) {
                                        width = Math.min(width, makeStaticLayout.getLineLeft(i15));
                                        f12 = Math.max(f12, makeStaticLayout.getLineRight(i15));
                                    }
                                    f11 += Math.max(0.0f, Math.min(primaryHorizontal, lineWidth - Math.max(0.0f, f12 - width)));
                                    rectF = rectF2;
                                    i13 = 0;
                                    f6 = lineTop;
                                    staticLayout = makeStaticLayout;
                                } else {
                                    f6 = f5;
                                    rectF = null;
                                    staticLayout = r14;
                                }
                                ?? r0 = staticLayout;
                                float f13 = f11;
                                final Paint paint = new Paint(1);
                                paint.setColor(Theme.getColor(messageObject.isOutOwner() ? Theme.key_chat_outBubble : Theme.key_chat_inBubble, this.resourcesProvider));
                                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
                                final ?? linkPath2 = new LinkPath(true);
                                linkPath2.setUseCornerPathImplementation(true);
                                linkPath2.setCurrentLayout(r0, i13, 0.0f);
                                r0.getSelectionPath(i13, i14, linkPath2);
                                linkPath2.closeRects();
                                final RectF rectF3 = new RectF();
                                linkPath2.computeBounds(rectF3, true);
                                int width2 = (int) (rectF3.width() + LinkPath.getRadius());
                                if (!chatMessageCell.drawBackgroundInParent() || width2 <= 0) {
                                    layout = r0;
                                } else {
                                    if (rectF3.height() > 0.0f) {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, (int) rectF3.height(), Bitmap.Config.ALPHA_8);
                                        ?? canvas = new Canvas(createBitmap);
                                        layout = r0;
                                        Paint paint2 = new Paint(1);
                                        paint2.setColor(-1);
                                        canvas.drawRect(0.0f, 0.0f, width2, rectF3.height(), paint2);
                                        Paint paint3 = new Paint(1);
                                        paint3.setColor(-1);
                                        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(5.0f)));
                                        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                        canvas.translate(-rectF3.left, -rectF3.top);
                                        canvas.drawPath(linkPath2, paint3);
                                        bitmap = createBitmap;
                                        final Paint paint4 = new Paint(3);
                                        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                        chatMessageCell.setupTextColors();
                                        TextPaint textPaint = new TextPaint(layout.getPaint());
                                        textPaint.set(layout.getPaint());
                                        spannableStringBuilder = new SpannableStringBuilder(AnimatedEmojiSpan.cloneSpans(layout.getText(), -1, textPaint.getFontMetricsInt()));
                                        if (i13 <= 0) {
                                            i4 = 0;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), 0, i13, 33);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i14 < spannableStringBuilder.length()) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i14, spannableStringBuilder.length(), 33);
                                        }
                                        final StaticLayout makeStaticLayout2 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint, i12, 1.0f, messageObject.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, false);
                                        final int[] iArr = new int[2];
                                        chatMessageCell.getLocationOnScreen(iArr);
                                        final int[] iArr2 = {iArr[0] + ((int) f13), iArr[1] + ((int) f6)};
                                        final Bitmap bitmap2 = bitmap;
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
                                                RectF rectF4 = AndroidUtilities.rectTmp;
                                                rectF4.set(getBounds());
                                                rectF4.left -= LinkPath.getRadius() / 2.0f;
                                                canvas2.save();
                                                canvas2.saveLayerAlpha(rectF4, this.alpha, 31);
                                                int[] iArr3 = iArr2;
                                                canvas2.translate(iArr3[0], iArr3[1]);
                                                ChatMessageCell chatMessageCell2 = chatMessageCell;
                                                if (chatMessageCell2 != null && chatMessageCell2.drawBackgroundInParent()) {
                                                    MessageDrawable messageDrawable = chatMessageCell.currentBackgroundDrawable;
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
                                                    if (bitmap2 != null) {
                                                        canvas2.save();
                                                        Bitmap bitmap3 = bitmap2;
                                                        RectF rectF5 = rectF3;
                                                        canvas2.drawBitmap(bitmap3, rectF5.left, rectF5.top, paint4);
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
                                            public void setAlpha(int i16) {
                                                this.alpha = i16;
                                            }
                                        };
                                        int radius = (int) (iArr[0] + f13 + rectF3.left + (LinkPath.getRadius() / 2.0f));
                                        int i16 = (int) (iArr[1] + f6 + rectF3.top);
                                        this.scrimDrawable.setBounds(radius, i16, ((int) rectF3.width()) + radius, ((int) rectF3.height()) + i16);
                                        if (charSequence == null) {
                                            float f14 = radius;
                                            if (rectF3.width() + f14 > AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f)) {
                                                this.scrimDrawableTx2 -= (f14 + rectF3.width()) - (AndroidUtilities.displaySize.x - AndroidUtilities.dp(8.0f));
                                            }
                                            float f15 = i16;
                                            if (rectF3.height() + f15 > ((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f)) {
                                                this.scrimDrawableTy2 -= (f15 + rectF3.height()) - (((AndroidUtilities.displaySize.y - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f));
                                            }
                                            if (rectF != null) {
                                                this.scrimDrawableSw = rectF.width() / rectF3.width();
                                                this.scrimDrawableSh = rectF.height() / rectF3.height();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    layout = r0;
                                }
                                bitmap = null;
                                final Paint paint42 = new Paint(3);
                                paint42.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                chatMessageCell.setupTextColors();
                                TextPaint textPaint2 = new TextPaint(layout.getPaint());
                                textPaint2.set(layout.getPaint());
                                spannableStringBuilder = new SpannableStringBuilder(AnimatedEmojiSpan.cloneSpans(layout.getText(), -1, textPaint2.getFontMetricsInt()));
                                if (i13 <= 0) {
                                }
                                if (i14 < spannableStringBuilder.length()) {
                                }
                                final StaticLayout makeStaticLayout22 = MessageObject.makeStaticLayout(spannableStringBuilder, textPaint2, i12, 1.0f, messageObject.totalAnimatedEmojiCount < 4 ? -1.0f : 0.0f, false);
                                final int[] iArr3 = new int[2];
                                chatMessageCell.getLocationOnScreen(iArr3);
                                final int[] iArr22 = {iArr3[0] + ((int) f13), iArr3[1] + ((int) f6)};
                                final Bitmap bitmap22 = bitmap;
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
                                        RectF rectF4 = AndroidUtilities.rectTmp;
                                        rectF4.set(getBounds());
                                        rectF4.left -= LinkPath.getRadius() / 2.0f;
                                        canvas2.save();
                                        canvas2.saveLayerAlpha(rectF4, this.alpha, 31);
                                        int[] iArr32 = iArr22;
                                        canvas2.translate(iArr32[0], iArr32[1]);
                                        ChatMessageCell chatMessageCell2 = chatMessageCell;
                                        if (chatMessageCell2 != null && chatMessageCell2.drawBackgroundInParent()) {
                                            MessageDrawable messageDrawable = chatMessageCell.currentBackgroundDrawable;
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
                                            if (bitmap22 != null) {
                                                canvas2.save();
                                                Bitmap bitmap3 = bitmap22;
                                                RectF rectF5 = rectF3;
                                                canvas2.drawBitmap(bitmap3, rectF5.left, rectF5.top, paint42);
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
                                    public void setAlpha(int i162) {
                                        this.alpha = i162;
                                    }
                                };
                                int radius2 = (int) (iArr3[0] + f13 + rectF3.left + (LinkPath.getRadius() / 2.0f));
                                int i162 = (int) (iArr3[1] + f6 + rectF3.top);
                                this.scrimDrawable.setBounds(radius2, i162, ((int) rectF3.width()) + radius2, ((int) rectF3.height()) + i162);
                                if (charSequence == null) {
                                }
                            }
                        }
                    }
                } else {
                    z2 = z3;
                }
                i11++;
                f = f;
                z3 = z2;
                f2 = f2;
                i10 = 0;
            }
        }
        z2 = z3;
        f4 = f;
        f5 = f2;
        i = 0;
        i2 = 0;
        i3 = 0;
        r14 = 0;
        if (r14 == 0) {
            StaticLayout descriptionlayout2 = chatMessageCell.getDescriptionlayout();
            i7 = 0;
            r14 = r14;
            while (i7 == 0) {
            }
        }
        if (r14 == 0) {
            i5 = 0;
            r14 = r14;
            while (i5 < pollButtons.size()) {
            }
        }
        if (r14 == 0) {
            r14 = findLink.layout;
            i = findLink.start;
            i3 = findLink.end;
            i2 = findLink.originalWidth;
            f4 = chatMessageCell.getTextX() + findLink.x;
            f5 = chatMessageCell.getTextY() + findLink.y;
        }
        int i122 = i2;
        int i132 = i;
        float f112 = f4;
        int i142 = i3;
        if (r14 != 0) {
        }
        if (r14 != 0) {
        }
    }
}
