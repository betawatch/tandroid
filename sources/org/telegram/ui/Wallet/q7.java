package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class q7 extends zh.y0 {
    public ValueAnimator A0;
    public TL_wallet.nftItem w0;
    public d8 x0;
    public float y0;
    public boolean z0;

    @Override // zh.y0
    public final void b(i60 i60Var, Canvas canvas, float f10, float f11, float f12) {
        if (this.y0 == 1.0f) {
            super.b(i60Var, canvas, f10, f11, f12);
            return;
        }
        canvas.save();
        float f13 = this.y0;
        canvas.scale(f13, f13, f10 / 2.0f, f11 / 2.0f);
        super.b(i60Var, canvas, f10, f11, f12);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.y0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f10 = this.y0;
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d8 d8Var;
        float f10;
        int i7;
        float f11;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (d8Var = this.x0) != null) {
            RectF rectF = d8Var.H;
            Paint paint = d8Var.y;
            c8 c8Var = d8Var.k1;
            if (this == d8Var.l1 && c8Var != null && c8Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l10 = Utilities.l(d8Var.p1.a);
                float[] D = d8Var.D(d8Var.n1 % 2.0f);
                float f12 = D[0] * l10;
                float f13 = D[1] * l10;
                float f14 = D[2] * l10;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.k9 k9Var = this.D;
                float left2 = k9Var.getLeft() + left + (k9Var.getWidth() / 2.0f);
                float height = (k9Var.getHeight() / 2.0f) + k9Var.getTop() + frameLayout.getTop();
                float C = com.google.android.recaptcha.internal.a.C(f14, 0.025f, (0.07f * f13) + 1.0f, (k9Var.getWidth() * qs.L4) / 268.0f);
                if (f13 > 0.01f && c8Var.w != null) {
                    float f15 = ((176.0f * C) / 128.0f) / 2.0f;
                    float L = (org.telegram.messenger.g0.L(2.0f) * f13) + height;
                    rectF.set(left2 - f15, L - f15, left2 + f15, L + f15);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f13));
                    canvas.drawBitmap(c8Var.w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                float l11 = c8Var.u == null ? 0.0f : Utilities.l(1.4f * f13);
                float L2 = height - (org.telegram.messenger.g0.L(5.0f) * f13);
                float f16 = f13 * (-5.0f);
                if (l11 < 0.99f) {
                    paint.setAlpha(qs.e4);
                    f11 = L2;
                    f10 = C;
                    i7 = 255;
                    d8Var.r(canvas, c8Var.v, left2, f11, f10, f12, 1.0f, f16, 0.24f, 0.97f);
                } else {
                    f10 = C;
                    i7 = 255;
                    f11 = L2;
                }
                if (l11 > 0.01f) {
                    paint.setAlpha((int) (255.0f * l11));
                    d8Var.r(canvas, c8Var.u, left2, f11, f10, f12, 1.0f, f16, 0.24f, 0.97f);
                }
                paint.setAlpha(i7);
            }
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() == this.z0) {
            return;
        }
        boolean isPressed = isPressed();
        this.z0 = isPressed;
        m(isPressed ? 0.96f : 1.0f, isPressed ? 80L : 350L, isPressed ? null : new OvershootInterpolator(1.5f));
    }

    public final void m(float f10, long j3, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, f10);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 5));
        if (overshootInterpolator != null) {
            this.A0.setInterpolator(overshootInterpolator);
        }
        this.A0.setDuration(j3);
        this.A0.start();
    }

    public final void n(float f10) {
        this.y0 = f10;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void o() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.y0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.y0);
        setScaleY(getScaleY() * this.y0);
        n(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d8 d8Var = this.x0;
        if (d8Var != null) {
            d8Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        d8 d8Var = this.x0;
        if (d8Var != null) {
            d8Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
