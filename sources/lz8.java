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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lz8 implements Consumer {
    public final /* synthetic */ rz8 a;
    public final /* synthetic */ yy8 b;
    public final /* synthetic */ cz8 c;

    public /* synthetic */ lz8(rz8 rz8Var, yy8 yy8Var, cz8 cz8Var) {
        this.a = rz8Var;
        this.b = yy8Var;
        this.c = cz8Var;
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
        yy8 yy8Var;
        Canvas canvas3 = (Canvas) obj;
        rz8 rz8Var = this.a;
        float[] fArr = rz8Var.T;
        int[] iArr3 = rz8Var.V;
        int[] iArr4 = rz8Var.U;
        RectF rectF2 = rz8Var.S;
        RectF rectF3 = rz8Var.i0;
        Paint paint3 = rz8Var.P;
        Paint paint4 = rz8Var.K;
        int[] iArr5 = rz8Var.N;
        Paint paint5 = rz8Var.h0;
        int[] iArr6 = rz8Var.M;
        Paint paint6 = rz8Var.R;
        Matrix matrix = rz8Var.Q;
        yy8 yy8Var2 = this.b;
        if (yy8Var2.isVerticalScrollBarEnabled()) {
            yy8Var2.setVerticalScrollBarEnabled(false);
        }
        if (rz8Var.f0) {
            iArr = iArr3;
        } else {
            iArr = iArr3;
            pz8 pz8Var = rz8Var.h;
            if (pz8Var != null) {
                rz8Var.f0 = true;
                rz8.Z(pz8Var);
            }
        }
        if (rz8Var.h == null || Float.isNaN(rz8Var.L)) {
            return;
        }
        f09 f09Var = rz8Var.d;
        float l = f09Var != null ? f09Var.h1 < 0.5f ? (-Utilities.l((AnimationUtils.currentAnimationTimeMillis() - f09Var.d6) / 150.0f)) - 1.0E-4f : !f09Var.e6 ? 0.0f : Utilities.l((AnimationUtils.currentAnimationTimeMillis() - f09Var.c6) / 470.0f) : 1.0f;
        f09 f09Var2 = rz8Var.d;
        boolean z = f09Var2 != null && f09Var2.h1 > 0.5f;
        float l2 = f09Var2 != null ? Utilities.l(f09Var2.g1) : 1.0f;
        float f9 = 1.0f - l2;
        boolean z2 = z;
        float v = bp1.v(f9, f9, f9, 1.0f);
        float V0 = z2 ? rz8Var.d.V0() : -1.0f;
        if (V0 >= 0.0f) {
            float f10 = 1.0f - V0;
            max = ((1.0f - ((f10 * f10) * f10)) * 0.25f) + 0.75f;
            f = V0;
        } else if (l2 >= 0.999f) {
            f = V0;
            max = 1.0f;
        } else {
            f = V0;
            max = Math.max(yy8Var2.getScaleX(), (0.25f * v) + 0.75f);
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
            rz8Var.d.invalidate();
        }
        if (max < f4) {
            yy8Var2.postInvalidateOnAnimation();
        }
        if (yy8Var2.getScaleX() != max) {
            View view = yy8Var2;
            float f11 = 0.0f;
            while (true) {
                paint = paint5;
                if (view == null || view == rz8Var.h || !(view.getParent() instanceof View)) {
                    break;
                }
                f11 += view.getTop();
                view = (View) view.getParent();
                paint5 = paint;
            }
            float height = Float.isNaN(rz8Var.L) ? yy8Var2.getHeight() : Math.max(0.0f, Math.min(yy8Var2.getHeight(), rz8Var.L - f11));
            yy8Var2.setPivotX(yy8Var2.getWidth() / 2.0f);
            yy8Var2.setPivotY(height);
            yy8Var2.setScaleX(max);
            yy8Var2.setScaleY(max);
        } else {
            paint = paint5;
        }
        if (yy8Var2.getAlpha() != f3) {
            yy8Var2.setAlpha(f3);
        }
        yy8Var2.getLocationOnScreen(iArr6);
        rz8Var.h.getLocationOnScreen(iArr5);
        float f12 = iArr6[1] - iArr5[1];
        float scaleY = yy8Var2.getScaleY() > 0.01f ? yy8Var2.getScaleY() : 1.0f;
        float width = yy8Var2.getWidth();
        if (rz8Var.W == null) {
            LinearGradient i0 = rz8.i0(false);
            rz8Var.W = i0;
            paint4.setShader(i0);
            iArr2 = iArr5;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint4.setXfermode(new PorterDuffXfermode(mode));
            LinearGradient i02 = rz8.i0(true);
            rz8Var.O = i02;
            paint3.setShader(i02);
            paint3.setXfermode(new PorterDuffXfermode(mode));
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            iArr2 = iArr5;
        }
        cz8 cz8Var = this.c;
        cz8Var.getLocationOnScreen(iArr6);
        float f13 = iArr6[1] - iArr2[1];
        float f14 = (f13 - f12) / scaleY;
        float L = ((hl.L(12.0f) + cz8Var.getHeight()) / scaleY) + f14;
        ny3 ny3Var = rz8Var.y;
        if (ny3Var != null) {
            float height2 = (f13 + cz8Var.getHeight()) - rz8Var.d0;
            paint2 = paint3;
            if (ny3Var.L != height2) {
                ny3Var.L = height2;
                ny3Var.invalidate();
            }
        } else {
            paint2 = paint3;
        }
        cz8Var.getLocationOnScreen(rz8Var.j0);
        yy8Var2.getLocationOnScreen(rz8Var.k0);
        float scaleX = (r0[0] - r4[0]) / yy8Var2.getScaleX();
        float f15 = scaleY;
        rectF3.set((rz8Var.b0 / scaleY) + scaleX, (rz8Var.c0 / scaleY) + f14, ((cz8Var.getWidth() - rz8Var.b0) / scaleY) + scaleX, ((cz8Var.getHeight() - rz8Var.d0) / f15) + f14);
        paint6.setAlpha(jn7.d4);
        canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
        matrix.setScale(1.0f, L - f14);
        matrix.postTranslate(0.0f, f14);
        rz8Var.O.setLocalMatrix(matrix);
        Canvas canvas4 = canvas3;
        canvas4.drawRect(0.0f, Math.min(f14, (-f12) / f15), width, L, paint2);
        float L2 = hl.L(10.0f);
        float f16 = ((rz8Var.L - f12) - L2) / f15;
        float f17 = L2 / f15;
        matrix.setScale(1.0f, f17);
        matrix.postTranslate(0.0f, f16);
        rz8Var.W.setLocalMatrix(matrix);
        canvas4.drawRect(0.0f, f16, width, Math.max(f17 + f16, hl.L(200.0f) + yy8Var2.getHeight()), paint4);
        boolean z3 = l < 1.0f && !z2;
        float f18 = z2 ? l2 : l;
        f09 f09Var3 = rz8Var.d;
        float f19 = 90.0f;
        if (f09Var3 != null) {
            rz8Var.e0 = rz8Var.r - (f09Var3.H0() - hl.L(8.0f));
            float translationY = cz8Var.getTranslationY();
            float f20 = rz8Var.e0;
            if (translationY != f20) {
                cz8Var.setTranslationY(f20);
                cz8Var.invalidate();
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
                f8 = bp1.v(max3, 0.15f, max3, 1.0f);
                f7 = 1.0f - max3;
            }
            if (cz8Var.getScaleX() != f8) {
                cz8Var.setPivotX(cz8Var.getWidth() / 2.0f);
                cz8Var.setPivotY(cz8Var.getHeight() / 2.0f);
                cz8Var.setScaleX(f8);
                cz8Var.setScaleY(f8);
                cz8Var.invalidate();
            }
            if (cz8Var.getAlpha() != f7) {
                cz8Var.setAlpha(f7);
            }
            if ((f8 != 1.0f || f7 != 1.0f) && (yy8Var = rz8Var.a0) != null) {
                yy8Var.postInvalidateOnAnimation();
            }
        }
        float max4 = Math.max(0.0f, -f12);
        float f22 = rz8Var.L - f12;
        int i = 0;
        float f23 = 0.0f;
        while (true) {
            float f24 = f19;
            if (i >= yy8Var2.getChildCount()) {
                break;
            }
            View childAt = yy8Var2.getChildAt(i);
            if (childAt instanceof xy8) {
                xy8 xy8Var = (xy8) childAt;
                if (f23 == 0.0f) {
                    f23 = childAt.getHeight();
                }
                if (!z3 || f23 <= 0.0f) {
                    canvas2 = canvas4;
                    f6 = 1.0f;
                } else {
                    float f25 = bp1.f(f22, max4, f23, 1.0f);
                    float height3 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                    if (l >= 0.0f) {
                        canvas2 = canvas4;
                        f6 = (f09.S(Math.max(0.0f, Math.min(1.0f, ((l * 470.0f) - (Math.max(0.0f, ((f22 - height3) / f23) - 0.5f) * Math.min(45.0f, 250.0f / f25))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                    } else {
                        canvas2 = canvas4;
                        float max5 = Math.max(0.0f, Math.min(1.0f, (((-l) * 150.0f) - (Math.max(0.0f, ((height3 - max4) / f23) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, f25 - 1.0f)))) / f24));
                        f6 = bp1.v(max5, 0.4f, max5, 1.0f);
                    }
                }
                if (xy8Var.r != f6) {
                    xy8Var.r = f6;
                    xy8Var.invalidate();
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
            float f26 = bp1.f(f22, max4, f23, 1.0f);
            if (rz8Var.g0 == null) {
                rz8Var.g0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
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
            rz8Var.g0.setLocalMatrix(matrix);
            Paint paint7 = paint;
            paint7.setShader(rz8Var.g0);
            if (paint7.getXfermode() == null) {
                paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
            canvas = canvas5;
            canvas.drawRect(0.0f, 0.0f, width, yy8Var2.getHeight(), paint7);
            yy8Var2.invalidate();
        }
        ny3 ny3Var2 = rz8Var.y;
        if (ny3Var2 != null) {
            RectF rectF4 = ny3Var2.G;
            if (ny3Var2.y <= 0.003f || rectF4.isEmpty()) {
                return;
            }
            RectF rectF5 = rectF;
            rectF5.set(rectF4);
            fArr[0] = rectF4.height() / 2.0f;
            fArr[1] = ny3Var2.E;
            rz8Var.y.getLocationOnScreen(iArr4);
            int[] iArr7 = iArr;
            yy8Var2.getLocationOnScreen(iArr7);
            float scaleX2 = yy8Var2.getScaleX() > 0.01f ? yy8Var2.getScaleX() : f5;
            float scaleY2 = yy8Var2.getScaleY() > 0.01f ? yy8Var2.getScaleY() : f5;
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
