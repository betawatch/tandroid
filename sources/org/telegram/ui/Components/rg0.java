package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rg0 extends ub {
    public final LinearLayout a;
    public final TextView b;
    public final bk0 c;
    public final RectF d;
    public final Path e;
    public final wh.b f;
    public ValueAnimator h;
    public float n;
    public float r;
    public float s;
    public float v;

    public rg0(Context context, org.telegram.ui.ActionBar.u6 u6Var, Drawable drawable, CharSequence charSequence) {
        super(context, u6Var);
        this.d = new RectF();
        this.e = new Path();
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.v = 1.0f;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setBackground(TLObject.FLAG_31, 24);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setGravity(16);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        bk0 bk0Var = new bk0(context);
        this.c = bk0Var;
        bk0Var.setImageDrawable(drawable);
        bk0Var.setColorFilter(-1);
        linearLayout.addView(bk0Var, kb1.r(24, 24));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(16);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(charSequence);
        linearLayout.addView(textView, kb1.q(1.0f, 0, -1, 12, 0, 0));
        addView(linearLayout, kb1.i(-1, 48, 17));
        this.f = new wh.b(new tv(this, 13));
    }

    public static /* synthetic */ void c(rg0 rg0Var, Canvas canvas, int i10) {
        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, rg0Var.getWidth(), rg0Var.getHeight(), i10);
        rg0Var.drawChild(canvas, rg0Var.a, rg0Var.getDrawingTime());
        canvas.restoreToCount(saveLayerAlpha);
    }

    public static /* synthetic */ void d(rg0 rg0Var, boolean z10, q0.a aVar, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z10) {
            if (floatValue <= 200.0f) {
                float f7 = 1.0f - f(floatValue / 200.0f);
                rg0Var.n = (1.0f - (f7 * f7)) * 1.027027f;
            } else {
                float f10 = 1.0f - f((floatValue - 200.0f) / 120.0f);
                rg0Var.n = c3.h0.u(f10, 0.027027028f, f10, 1.0f);
            }
            rg0Var.r = floatValue < 160.0f ? 1.0f - ((float) Math.pow(1.0f - (floatValue / 160.0f), 3.0d)) : (((float) Math.sin(f((floatValue - 160.0f) / 160.0f) * 3.141592653589793d)) / 48.0f) + 1.0f;
            rg0Var.s = f((floatValue - 130.0f) / 70.0f);
            rg0Var.v = f(floatValue / 160.0f);
        } else {
            rg0Var.s = 1.0f - f(floatValue / 60.0f);
            float f11 = f(floatValue / 150.0f);
            rg0Var.n = 1.0f - (((float) Math.pow(f11, 0.7d)) * 0.8783784f);
            rg0Var.r = org.telegram.ui.d3.A(f11, 0.625f, f11, 1.0f);
            rg0Var.v = (1.0f - f((floatValue - 150.0f) / 30.0f)) * (1.0f - (f11 * 0.15f));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            float f12 = z10 ? (1.0f - f(floatValue / 160.0f)) * AndroidUtilities.dp(6.0f) : (f(floatValue / 180.0f) + 1.0f) * AndroidUtilities.dp(3.0f);
            rg0Var.setRenderEffect(f12 > 0.01f ? RenderEffect.createBlurEffect(f12, f12, Shader.TileMode.DECAL) : null);
        }
        aVar.accept(Float.valueOf(0.0f));
        rg0Var.invalidate();
    }

    public static void e(final rg0 rg0Var, final boolean z10, Runnable runnable, Runnable runnable2, final q0.a aVar) {
        ValueAnimator valueAnimator = rg0Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            rg0Var.h.cancel();
            rg0Var.transitionRunningEnter = false;
        }
        rg0Var.f.a();
        ub.IN_OUT_OFFSET_Y.b(rg0Var, 0.0f);
        runnable.run();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, z10 ? 320.0f : 180.0f);
        rg0Var.h = ofFloat;
        ofFloat.setDuration(z10 ? 320L : 180L);
        rg0Var.h.setInterpolator(null);
        rg0Var.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.qg0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                rg0.d(rg0.this, z10, aVar, valueAnimator2);
            }
        });
        rg0Var.h.addListener(new bi.ce(29, rg0Var, runnable2));
        if (z10) {
            rg0Var.v = 0.0f;
            rg0Var.s = 0.0f;
            rg0Var.r = 0.0f;
            rg0Var.n = 0.0f;
        }
        rg0Var.h.start();
    }

    public static float f(float f7) {
        return Math.max(0.0f, Math.min(1.0f, f7));
    }

    @Override // org.telegram.ui.Components.ub
    public final tb createTransition() {
        return new jg.i(this);
    }

    @Override // org.telegram.ui.Components.ub, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = (getWidth() - AndroidUtilities.dp(8.0f)) * this.n;
        float dp = AndroidUtilities.dp(48.0f) * this.r;
        RectF rectF = this.d;
        rectF.set((getWidth() - width) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + width) / 2.0f, (getHeight() + dp) / 2.0f);
        this.background.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        this.background.setAlpha(Math.round(this.v * 255.0f));
        this.background.draw(canvas);
        this.background.setAlpha(255);
        if (this.s > 0.0f) {
            canvas.save();
            Path path = this.e;
            path.rewind();
            float f7 = dp / 2.0f;
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.clipPath(path);
            float f10 = this.s;
            wh.b bVar = this.f;
            if (f10 < 1.0f && bVar.c == null) {
                bVar.b(getWidth(), getHeight(), 2.0f, AndroidUtilities.dp(3.0f));
            }
            bVar.setBounds(0, 0, getWidth(), getHeight());
            bVar.i = Math.round(this.s * 255.0f);
            bVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.h = null;
        }
        this.f.a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(304.0f), Math.max(0, View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(24.0f))), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.ub
    public final void onShow() {
        super.onShow();
        this.c.d();
    }
}
