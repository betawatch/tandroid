// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class aqc extends ox4 {
    public boolean A0;
    public ValueAnimator B0;
    public TL_wallet.nftItem x0;
    public mqc y0;
    public float z0;

    @Override // ox4
    public final void b(yt5 yt5Var, Canvas canvas, float f, float f2, float f3) {
        if (this.z0 == 1.0f) {
            super.b(yt5Var, canvas, f, f2, f3);
            return;
        }
        canvas.save();
        float f4 = this.z0;
        canvas.scale(f4, f4, f / 2.0f, f2 / 2.0f);
        super.b(yt5Var, canvas, f, f2, f3);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.z0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f = this.z0;
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        mqc mqcVar;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        boolean drawChild = super.drawChild(canvas, view, j);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (mqcVar = this.y0) != null) {
            RectF rectF = mqcVar.I;
            Paint paint = mqcVar.y;
            lqc lqcVar = mqcVar.l1;
            if (this == mqcVar.m1 && lqcVar != null && lqcVar.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l = Utilities.l(mqcVar.q1.a);
                float[] D = mqcVar.D(mqcVar.o1 % 2.0f);
                float f5 = D[0] * l;
                float f6 = D[1] * l;
                float f7 = D[2] * l;
                int left = frameLayout.getLeft();
                bf0 bf0Var = this.E;
                float left2 = bf0Var.getLeft() + left + (bf0Var.getWidth() / 2.0f);
                float height = (bf0Var.getHeight() / 2.0f) + bf0Var.getTop() + frameLayout.getTop();
                float B = mlb.B(f7, 0.025f, (0.07f * f6) + 1.0f, (bf0Var.getWidth() * nm7.K4) / 268.0f);
                if (f6 <= 0.01f || lqcVar.w == null) {
                    f = 0.01f;
                } else {
                    float f8 = ((176.0f * B) / 128.0f) / 2.0f;
                    float L = (gm.L(2.0f) * f6) + height;
                    f = 0.01f;
                    rectF.set(left2 - f8, L - f8, left2 + f8, L + f8);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f6));
                    canvas.drawBitmap(lqcVar.w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                float l2 = lqcVar.u == null ? 0.0f : Utilities.l(1.4f * f6);
                float L2 = height - (gm.L(5.0f) * f6);
                float f9 = f6 * (-5.0f);
                if (l2 < 0.99f) {
                    paint.setAlpha(nm7.d4);
                    f3 = L2;
                    f4 = f9;
                    f2 = B;
                    i = 255;
                    mqcVar.r(canvas, lqcVar.v, left2, f3, f2, f5, 1.0f, f4, 0.24f, 0.97f);
                } else {
                    f2 = B;
                    i = 255;
                    f3 = L2;
                    f4 = f9;
                }
                if (l2 > f) {
                    paint.setAlpha((int) (l2 * 255.0f));
                    mqcVar.r(canvas, lqcVar.u, left2, f3, f2, f5, 1.0f, f4, 0.24f, 0.97f);
                }
                paint.setAlpha(i);
            }
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        OvershootInterpolator overshootInterpolator;
        float f;
        long j;
        super.drawableStateChanged();
        if (isPressed() == this.A0) {
            return;
        }
        boolean isPressed = isPressed();
        this.A0 = isPressed;
        if (isPressed) {
            f = 0.96f;
            j = 80;
            overshootInterpolator = null;
        } else {
            overshootInterpolator = new OvershootInterpolator(1.5f);
            f = 1.0f;
            j = 350;
        }
        m(f, j, overshootInterpolator);
    }

    public final void m(float f, long j, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z0, f);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new oxb(this, (byte) 15));
        if (overshootInterpolator != null) {
            this.B0.setInterpolator(overshootInterpolator);
        }
        this.B0.setDuration(j);
        this.B0.start();
    }

    public final void n(float f) {
        this.z0 = f;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void o() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.z0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.z0);
        setScaleY(getScaleY() * this.z0);
        n(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mqc mqcVar = this.y0;
        if (mqcVar != null) {
            mqcVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        mqc mqcVar = this.y0;
        if (mqcVar != null) {
            mqcVar.h.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        jm2.W = getMeasuredHeight();
    }
}
