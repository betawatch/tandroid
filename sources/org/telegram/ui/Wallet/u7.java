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
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u7 extends ph.c1 {
    public ValueAnimator A0;
    public TL_wallet.nftItem w0;
    public h8 x0;
    public float y0;
    public boolean z0;

    @Override // ph.c1
    public final void b(x60 x60Var, Canvas canvas, float f7, float f10, float f11) {
        if (this.y0 == 1.0f) {
            super.b(x60Var, canvas, f7, f10, f11);
            return;
        }
        canvas.save();
        float f12 = this.y0;
        canvas.scale(f12, f12, f7 / 2.0f, f10 / 2.0f);
        super.b(x60Var, canvas, f7, f10, f11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.y0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f7 = this.y0;
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        h8 h8Var;
        float f7;
        int i10;
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (h8Var = this.x0) != null) {
            RectF rectF = h8Var.H;
            Paint paint = h8Var.y;
            g8 g8Var = h8Var.k1;
            if (this == h8Var.l1 && g8Var != null && g8Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l4 = Utilities.l(h8Var.p1.a);
                float[] D = h8Var.D(h8Var.n1 % 2.0f);
                float f11 = D[0] * l4;
                float f12 = D[1] * l4;
                float f13 = D[2] * l4;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.g9 g9Var = this.D;
                float left2 = g9Var.getLeft() + left + (g9Var.getWidth() / 2.0f);
                float height = (g9Var.getHeight() / 2.0f) + g9Var.getTop() + frameLayout.getTop();
                float D2 = c3.i0.D(f13, 0.025f, (0.07f * f12) + 1.0f, (g9Var.getWidth() * zs.L4) / 268.0f);
                if (f12 > 0.01f && g8Var.w != null) {
                    float f14 = ((176.0f * D2) / 128.0f) / 2.0f;
                    float L = (org.telegram.messenger.i0.L(2.0f) * f12) + height;
                    rectF.set(left2 - f14, L - f14, left2 + f14, L + f14);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f12));
                    canvas.drawBitmap(g8Var.w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                float l10 = g8Var.u == null ? 0.0f : Utilities.l(1.4f * f12);
                float L2 = height - (org.telegram.messenger.i0.L(5.0f) * f12);
                float f15 = f12 * (-5.0f);
                if (l10 < 0.99f) {
                    paint.setAlpha(zs.e4);
                    f10 = L2;
                    f7 = D2;
                    i10 = 255;
                    h8Var.r(canvas, g8Var.v, left2, f10, f7, f11, 1.0f, f15, 0.24f, 0.97f);
                } else {
                    f7 = D2;
                    i10 = 255;
                    f10 = L2;
                }
                if (l10 > 0.01f) {
                    paint.setAlpha((int) (255.0f * l10));
                    h8Var.r(canvas, g8Var.u, left2, f10, f7, f11, 1.0f, f15, 0.24f, 0.97f);
                }
                paint.setAlpha(i10);
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

    public final void m(float f7, long j10, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, f7);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new r3(this, 5));
        if (overshootInterpolator != null) {
            this.A0.setInterpolator(overshootInterpolator);
        }
        this.A0.setDuration(j10);
        this.A0.start();
    }

    public final void n(float f7) {
        this.y0 = f7;
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
        h8 h8Var = this.x0;
        if (h8Var != null) {
            h8Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h8 h8Var = this.x0;
        if (h8Var != null) {
            h8Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
