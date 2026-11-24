// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AnimationUtils;
import j$.util.function.Consumer$-CC;
import java.util.function.Consumer;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aw8 implements Consumer {
    public final /* synthetic */ gw8 a;
    public final /* synthetic */ nv8 b;
    public final /* synthetic */ rv8 c;

    public /* synthetic */ aw8(gw8 gw8Var, nv8 nv8Var, rv8 rv8Var) {
        this.a = gw8Var;
        this.b = nv8Var;
        this.c = rv8Var;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        int[] iArr;
        float f;
        float max;
        RectF rectF;
        float f2;
        float f3;
        float f4;
        Paint paint;
        int[] iArr2;
        Paint paint2;
        Canvas canvas;
        float f5;
        Canvas canvas2;
        float f6;
        float f7;
        float f8;
        nv8 nv8Var;
        Canvas canvas3 = (Canvas) obj;
        gw8 gw8Var = this.a;
        float[] fArr = gw8Var.T;
        int[] iArr3 = gw8Var.V;
        int[] iArr4 = gw8Var.U;
        RectF rectF2 = gw8Var.S;
        RectF rectF3 = gw8Var.i0;
        Paint paint3 = gw8Var.P;
        Paint paint4 = gw8Var.K;
        int[] iArr5 = gw8Var.N;
        Paint paint5 = gw8Var.h0;
        int[] iArr6 = gw8Var.M;
        Paint paint6 = gw8Var.R;
        Matrix matrix = gw8Var.Q;
        nv8 nv8Var2 = this.b;
        if (nv8Var2.isVerticalScrollBarEnabled()) {
            nv8Var2.setVerticalScrollBarEnabled(false);
        }
        if (gw8Var.f0) {
            iArr = iArr3;
        } else {
            iArr = iArr3;
            ew8 ew8Var = gw8Var.h;
            if (ew8Var != null) {
                gw8Var.f0 = true;
                gw8.Z(ew8Var);
            }
        }
        if (gw8Var.h == null || Float.isNaN(gw8Var.L)) {
            return;
        }
        vw8 vw8Var = gw8Var.d;
        float l = vw8Var != null ? vw8Var.h1 < 0.5f ? (-Utilities.l((AnimationUtils.currentAnimationTimeMillis() - vw8Var.d6) / 150.0f)) - 1.0E-4f : !vw8Var.e6 ? 0.0f : Utilities.l((AnimationUtils.currentAnimationTimeMillis() - vw8Var.c6) / 470.0f) : 1.0f;
        vw8 vw8Var2 = gw8Var.d;
        boolean z = vw8Var2 != null && vw8Var2.h1 > 0.5f;
        float l2 = vw8Var2 != null ? Utilities.l(vw8Var2.g1) : 1.0f;
        float f9 = 1.0f - l2;
        boolean z2 = z;
        float v = oo1.v(f9, f9, f9, 1.0f);
        float V0 = z2 ? gw8Var.d.V0() : -1.0f;
        if (V0 >= 0.0f) {
            float f10 = 1.0f - V0;
            max = ((1.0f - ((f10 * f10) * f10)) * 0.25f) + 0.75f;
            f = V0;
        } else if (l2 >= 0.999f) {
            f = V0;
            max = 1.0f;
        } else {
            f = V0;
            max = Math.max(nv8Var2.getScaleX(), (0.25f * v) + 0.75f);
        }
        if (z2) {
            rectF = rectF2;
            f2 = 1.0f;
            f3 = Math.min(1.0f, l2 / 0.55f);
        } else {
            rectF = rectF2;
            f2 = 1.0f;
            f3 = 1.0f;
        }
        if (V0 < 0.0f || f >= f2) {
            f4 = f2;
        } else {
            f4 = f2;
            gw8Var.d.invalidate();
        }
        if (max < f4) {
            nv8Var2.postInvalidateOnAnimation();
        }
        if (nv8Var2.getScaleX() != max) {
            View view = nv8Var2;
            float f11 = 0.0f;
            while (true) {
                paint = paint5;
                if (view == null || view == gw8Var.h || !(view.getParent() instanceof View)) {
                    break;
                }
                f11 += view.getTop();
                view = (View) view.getParent();
                paint5 = paint;
            }
            float height = Float.isNaN(gw8Var.L) ? nv8Var2.getHeight() : Math.max(0.0f, Math.min(nv8Var2.getHeight(), gw8Var.L - f11));
            nv8Var2.setPivotX(nv8Var2.getWidth() / 2.0f);
            nv8Var2.setPivotY(height);
            nv8Var2.setScaleX(max);
            nv8Var2.setScaleY(max);
        } else {
            paint = paint5;
        }
        if (nv8Var2.getAlpha() != f3) {
            nv8Var2.setAlpha(f3);
        }
        nv8Var2.getLocationOnScreen(iArr6);
        gw8Var.h.getLocationOnScreen(iArr5);
        float f12 = iArr6[1] - iArr5[1];
        float scaleY = nv8Var2.getScaleY() > 0.01f ? nv8Var2.getScaleY() : 1.0f;
        float width = nv8Var2.getWidth();
        if (gw8Var.W == null) {
            LinearGradient i0 = gw8.i0(false);
            gw8Var.W = i0;
            paint4.setShader(i0);
            iArr2 = iArr5;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint4.setXfermode(new PorterDuffXfermode(mode));
            LinearGradient i02 = gw8.i0(true);
            gw8Var.O = i02;
            paint3.setShader(i02);
            paint3.setXfermode(new PorterDuffXfermode(mode));
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            iArr2 = iArr5;
        }
        rv8 rv8Var = this.c;
        rv8Var.getLocationOnScreen(iArr6);
        float f13 = iArr6[1] - iArr2[1];
        float f14 = (f13 - f12) / scaleY;
        float L = ((gl.L(12.0f) + rv8Var.getHeight()) / scaleY) + f14;
        sx3 sx3Var = gw8Var.y;
        if (sx3Var != null) {
            float height2 = (f13 + rv8Var.getHeight()) - gw8Var.d0;
            paint2 = paint3;
            if (sx3Var.L != height2) {
                sx3Var.L = height2;
                sx3Var.invalidate();
            }
        } else {
            paint2 = paint3;
        }
        rv8Var.getLocationOnScreen(gw8Var.j0);
        nv8Var2.getLocationOnScreen(gw8Var.k0);
        float scaleX = (r0[0] - r4[0]) / nv8Var2.getScaleX();
        float f15 = scaleY;
        rectF3.set((gw8Var.b0 / scaleY) + scaleX, (gw8Var.c0 / scaleY) + f14, ((rv8Var.getWidth() - gw8Var.b0) / scaleY) + scaleX, ((rv8Var.getHeight() - gw8Var.d0) / f15) + f14);
        paint6.setAlpha(kk7.d4);
        canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
        matrix.setScale(1.0f, L - f14);
        matrix.postTranslate(0.0f, f14);
        gw8Var.O.setLocalMatrix(matrix);
        Canvas canvas4 = canvas3;
        canvas4.drawRect(0.0f, Math.min(f14, (-f12) / f15), width, L, paint2);
        float L2 = gl.L(10.0f);
        float f16 = ((gw8Var.L - f12) - L2) / f15;
        float f17 = L2 / f15;
        matrix.setScale(1.0f, f17);
        matrix.postTranslate(0.0f, f16);
        gw8Var.W.setLocalMatrix(matrix);
        canvas4.drawRect(0.0f, f16, width, Math.max(f17 + f16, gl.L(200.0f) + nv8Var2.getHeight()), paint4);
        boolean z3 = l < 1.0f && !z2;
        float f18 = z2 ? l2 : l;
        vw8 vw8Var3 = gw8Var.d;
        float f19 = 90.0f;
        if (vw8Var3 != null) {
            gw8Var.e0 = gw8Var.r - (vw8Var3.H0() - gl.L(8.0f));
            float translationY = rv8Var.getTranslationY();
            float f20 = gw8Var.e0;
            if (translationY != f20) {
                rv8Var.setTranslationY(f20);
                rv8Var.invalidate();
            }
            if (f18 >= 1.0f) {
                f7 = 1.0f;
                f8 = 1.0f;
            } else if (f18 >= 0.0f) {
                float max2 = Math.max(0.0f, Math.min(1.0f, f18));
                float f21 = 1.0f - max2;
                f7 = Math.min(1.0f, max2 / 0.35f);
                f8 = ((1.0f - ((f21 * f21) * f21)) * 0.15f) + 0.85f;
            } else {
                float max3 = Math.max(0.0f, Math.min(1.0f, ((-f18) * 150.0f) / 90.0f));
                f8 = oo1.v(max3, 0.15f, max3, 1.0f);
                f7 = 1.0f - max3;
            }
            if (rv8Var.getScaleX() != f8) {
                rv8Var.setPivotX(rv8Var.getWidth() / 2.0f);
                rv8Var.setPivotY(rv8Var.getHeight() / 2.0f);
                rv8Var.setScaleX(f8);
                rv8Var.setScaleY(f8);
                rv8Var.invalidate();
            }
            if (rv8Var.getAlpha() != f7) {
                rv8Var.setAlpha(f7);
            }
            if ((f8 != 1.0f || f7 != 1.0f) && (nv8Var = gw8Var.a0) != null) {
                nv8Var.postInvalidateOnAnimation();
            }
        }
        float max4 = Math.max(0.0f, -f12);
        float f22 = gw8Var.L - f12;
        int i = 0;
        float f23 = 0.0f;
        while (true) {
            float f24 = f19;
            if (i >= nv8Var2.getChildCount()) {
                break;
            }
            View childAt = nv8Var2.getChildAt(i);
            if (childAt instanceof mv8) {
                mv8 mv8Var = (mv8) childAt;
                if (f23 == 0.0f) {
                    f23 = childAt.getHeight();
                }
                if (!z3 || f23 <= 0.0f) {
                    canvas2 = canvas4;
                    f6 = 1.0f;
                } else {
                    float f25 = oo1.f(f22, max4, f23, 1.0f);
                    float height3 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                    if (l >= 0.0f) {
                        canvas2 = canvas4;
                        f6 = (vw8.S(Math.max(0.0f, Math.min(1.0f, ((l * 470.0f) - (Math.max(0.0f, ((f22 - height3) / f23) - 0.5f) * Math.min(45.0f, 250.0f / f25))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                    } else {
                        canvas2 = canvas4;
                        float max5 = Math.max(0.0f, Math.min(1.0f, (((-l) * 150.0f) - (Math.max(0.0f, ((height3 - max4) / f23) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, f25 - 1.0f)))) / f24));
                        f6 = oo1.v(max5, 0.4f, max5, 1.0f);
                    }
                }
                if (mv8Var.r != f6) {
                    mv8Var.r = f6;
                    mv8Var.invalidate();
                }
            } else {
                canvas2 = canvas4;
            }
            i++;
            f19 = f24;
            canvas4 = canvas2;
        }
        Canvas canvas5 = canvas4;
        if (!z3 || f23 <= 0.0f) {
            canvas = canvas5;
            f5 = 1.0f;
        } else {
            float f26 = oo1.f(f22, max4, f23, 1.0f);
            if (gw8Var.g0 == null) {
                gw8Var.g0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
            }
            if (l >= 0.0f) {
                float max6 = f22 - (Math.max(-1.0f, ((l * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / f26)) * f23);
                f5 = 1.0f;
                matrix.setScale(1.0f, f23);
                matrix.postTranslate(0.0f, max6 - (f23 / 2.0f));
            } else {
                f5 = 1.0f;
                float max7 = (Math.max(-1.0f, (((-l) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, f26 - 1.0f))) * f23) + max4;
                matrix.setScale(1.0f, f23);
                matrix.postTranslate(0.0f, max7 - (f23 / 2.0f));
            }
            gw8Var.g0.setLocalMatrix(matrix);
            Paint paint7 = paint;
            paint7.setShader(gw8Var.g0);
            if (paint7.getXfermode() == null) {
                paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
            canvas = canvas5;
            canvas.drawRect(0.0f, 0.0f, width, nv8Var2.getHeight(), paint7);
            nv8Var2.invalidate();
        }
        sx3 sx3Var2 = gw8Var.y;
        if (sx3Var2 != null) {
            RectF rectF4 = sx3Var2.G;
            if (sx3Var2.y <= 0.003f || rectF4.isEmpty()) {
                return;
            }
            RectF rectF5 = rectF;
            rectF5.set(rectF4);
            fArr[0] = rectF4.height() / 2.0f;
            fArr[1] = sx3Var2.E;
            gw8Var.y.getLocationOnScreen(iArr4);
            int[] iArr7 = iArr;
            nv8Var2.getLocationOnScreen(iArr7);
            float scaleX2 = nv8Var2.getScaleX() > 0.01f ? nv8Var2.getScaleX() : f5;
            float scaleY2 = nv8Var2.getScaleY() > 0.01f ? nv8Var2.getScaleY() : f5;
            float f27 = iArr4[0] - iArr7[0];
            float f28 = iArr4[1] - iArr7[1];
            rectF5.set((rectF5.left + f27) / scaleX2, (rectF5.top + f28) / scaleY2, (rectF5.right + f27) / scaleX2, (rectF5.bottom + f28) / scaleY2);
            fArr[0] = fArr[0] / scaleY2;
            paint6.setAlpha((int) (fArr[1] * 255.0f));
            float f29 = fArr[0];
            canvas.drawRoundRect(rectF5, f29, f29, paint6);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
