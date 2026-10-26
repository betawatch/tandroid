package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.d3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Consumer {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ r b;
    public final /* synthetic */ x c;

    public /* synthetic */ q0(z0 z0Var, r rVar, x xVar) {
        this.a = z0Var;
        this.b = rVar;
        this.c = xVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        int[] iArr;
        int[] iArr2;
        float f7;
        float f10;
        float f11;
        float max;
        RectF rectF;
        float f12;
        float f13;
        float f14;
        Paint paint;
        int[] iArr3;
        Paint paint2;
        Canvas canvas;
        float f15;
        Canvas canvas2;
        float f16;
        float f17;
        float f18;
        r rVar;
        Canvas canvas3 = (Canvas) obj;
        z0 z0Var = this.a;
        int[] iArr4 = z0Var.U;
        int[] iArr5 = z0Var.T;
        float[] fArr = z0Var.S;
        RectF rectF2 = z0Var.R;
        RectF rectF3 = z0Var.h0;
        Paint paint3 = z0Var.O;
        Paint paint4 = z0Var.J;
        int[] iArr6 = z0Var.M;
        Paint paint5 = z0Var.g0;
        int[] iArr7 = z0Var.L;
        Paint paint6 = z0Var.Q;
        Matrix matrix = z0Var.P;
        r rVar2 = this.b;
        if (rVar2.isVerticalScrollBarEnabled()) {
            rVar2.setVerticalScrollBarEnabled(false);
        }
        if (z0Var.e0) {
            iArr = iArr4;
        } else {
            iArr = iArr4;
            x0 x0Var = z0Var.h;
            if (x0Var != null) {
                z0Var.e0 = true;
                z0.Y(x0Var);
            }
        }
        if (z0Var.h == null || Float.isNaN(z0Var.K)) {
            return;
        }
        t1 t1Var = z0Var.d;
        if (t1Var != null) {
            f7 = 1.0f;
            if (t1Var.g1 < 0.5f) {
                iArr2 = iArr5;
                f10 = (-Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - t1Var.e6) / 150.0f)) - 1.0E-4f;
            } else {
                iArr2 = iArr5;
                f10 = !t1Var.f6 ? 0.0f : Utilities.clamp01((AnimationUtils.currentAnimationTimeMillis() - t1Var.d6) / 470.0f);
            }
        } else {
            iArr2 = iArr5;
            f7 = 1.0f;
            f10 = 1.0f;
        }
        t1 t1Var2 = z0Var.d;
        int[] iArr8 = iArr2;
        boolean z10 = t1Var2 != null && t1Var2.g1 > 0.5f;
        float clamp01 = t1Var2 != null ? Utilities.clamp01(t1Var2.f1) : f7;
        float f19 = f7 - clamp01;
        boolean z11 = z10;
        float A = d3.A(f19, f19, f19, f7);
        float V0 = z11 ? z0Var.d.V0() : -1.0f;
        if (V0 >= 0.0f) {
            float f20 = f7 - V0;
            max = ((f7 - ((f20 * f20) * f20)) * 0.25f) + 0.75f;
            f11 = V0;
        } else if (clamp01 >= 0.999f) {
            f11 = V0;
            max = 1.0f;
        } else {
            f11 = V0;
            max = Math.max(rVar2.getScaleX(), (0.25f * A) + 0.75f);
        }
        if (z11) {
            rectF = rectF2;
            f12 = 1.0f;
            f13 = Math.min(1.0f, clamp01 / 0.55f);
        } else {
            rectF = rectF2;
            f12 = 1.0f;
            f13 = 1.0f;
        }
        if (V0 < 0.0f || f11 >= f12) {
            f14 = f12;
        } else {
            f14 = f12;
            z0Var.d.invalidate();
        }
        if (max < f14) {
            rVar2.postInvalidateOnAnimation();
        }
        if (rVar2.getScaleX() != max) {
            View view = rVar2;
            float f21 = 0.0f;
            while (true) {
                paint = paint5;
                if (view == null || view == z0Var.h || !(view.getParent() instanceof View)) {
                    break;
                }
                f21 += view.getTop();
                view = (View) view.getParent();
                paint5 = paint;
            }
            float height = Float.isNaN(z0Var.K) ? rVar2.getHeight() : Math.max(0.0f, Math.min(rVar2.getHeight(), z0Var.K - f21));
            rVar2.setPivotX(rVar2.getWidth() / 2.0f);
            rVar2.setPivotY(height);
            rVar2.setScaleX(max);
            rVar2.setScaleY(max);
        } else {
            paint = paint5;
        }
        if (rVar2.getAlpha() != f13) {
            rVar2.setAlpha(f13);
        }
        rVar2.getLocationOnScreen(iArr7);
        z0Var.h.getLocationOnScreen(iArr6);
        float f22 = iArr7[1] - iArr6[1];
        float scaleY = rVar2.getScaleY() > 0.01f ? rVar2.getScaleY() : 1.0f;
        float width = rVar2.getWidth();
        if (z0Var.V == null) {
            LinearGradient f02 = z0.f0(false);
            z0Var.V = f02;
            paint4.setShader(f02);
            iArr3 = iArr6;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint4.setXfermode(new PorterDuffXfermode(mode));
            LinearGradient f03 = z0.f0(true);
            z0Var.N = f03;
            paint3.setShader(f03);
            paint3.setXfermode(new PorterDuffXfermode(mode));
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            iArr3 = iArr6;
        }
        x xVar = this.c;
        xVar.getLocationOnScreen(iArr7);
        float f23 = iArr7[1] - iArr3[1];
        float f24 = (f23 - f22) / scaleY;
        float dp = ((AndroidUtilities.dp(12.0f) + xVar.getHeight()) / scaleY) + f24;
        d dVar = z0Var.x;
        if (dVar != null) {
            float height2 = (f23 + xVar.getHeight()) - z0Var.c0;
            paint2 = paint3;
            if (dVar.K != height2) {
                dVar.K = height2;
                dVar.invalidate();
            }
        } else {
            paint2 = paint3;
        }
        xVar.getLocationOnScreen(z0Var.i0);
        rVar2.getLocationOnScreen(z0Var.j0);
        float scaleX = (r0[0] - r3[0]) / rVar2.getScaleX();
        rectF3.set((z0Var.a0 / scaleY) + scaleX, (z0Var.b0 / scaleY) + f24, ((xVar.getWidth() - z0Var.a0) / scaleY) + scaleX, ((xVar.getHeight() - z0Var.c0) / scaleY) + f24);
        paint6.setAlpha(255);
        canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
        matrix.setScale(1.0f, dp - f24);
        matrix.postTranslate(0.0f, f24);
        z0Var.N.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, Math.min(f24, (-f22) / scaleY), width, dp, paint2);
        float dp2 = AndroidUtilities.dp(10.0f);
        float f25 = ((z0Var.K - f22) - dp2) / scaleY;
        float f26 = dp2 / scaleY;
        matrix.setScale(1.0f, f26);
        matrix.postTranslate(0.0f, f25);
        z0Var.V.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, f25, width, Math.max(f26 + f25, AndroidUtilities.dp(200.0f) + rVar2.getHeight()), paint4);
        boolean z12 = f10 < 1.0f && !z11;
        float f27 = z11 ? clamp01 : f10;
        t1 t1Var3 = z0Var.d;
        float f28 = 90.0f;
        if (t1Var3 != null) {
            z0Var.d0 = z0Var.r - (t1Var3.H0() - AndroidUtilities.dp(8.0f));
            float translationY = xVar.getTranslationY();
            float f29 = z0Var.d0;
            if (translationY != f29) {
                xVar.setTranslationY(f29);
                xVar.invalidate();
            }
            if (f27 >= 1.0f) {
                f17 = 1.0f;
                f18 = 1.0f;
            } else if (f27 >= 0.0f) {
                float max2 = Math.max(0.0f, Math.min(1.0f, f27));
                float f30 = 1.0f - max2;
                f17 = Math.min(1.0f, max2 / 0.35f);
                f18 = ((1.0f - ((f30 * f30) * f30)) * 0.15f) + 0.85f;
            } else {
                float max3 = Math.max(0.0f, Math.min(1.0f, ((-f27) * 150.0f) / 90.0f));
                f18 = d3.A(max3, 0.15f, max3, 1.0f);
                f17 = 1.0f - max3;
            }
            if (xVar.getScaleX() != f18) {
                xVar.setPivotX(xVar.getWidth() / 2.0f);
                xVar.setPivotY(xVar.getHeight() / 2.0f);
                xVar.setScaleX(f18);
                xVar.setScaleY(f18);
                xVar.invalidate();
            }
            if (xVar.getAlpha() != f17) {
                xVar.setAlpha(f17);
            }
            if ((f18 != 1.0f || f17 != 1.0f) && (rVar = z0Var.Z) != null) {
                rVar.postInvalidateOnAnimation();
            }
        }
        float max4 = Math.max(0.0f, -f22);
        float f31 = z0Var.K - f22;
        int i10 = 0;
        float f32 = 0.0f;
        while (true) {
            float f33 = f28;
            if (i10 >= rVar2.getChildCount()) {
                break;
            }
            View childAt = rVar2.getChildAt(i10);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                if (f32 == 0.0f) {
                    f32 = childAt.getHeight();
                }
                if (!z12 || f32 <= 0.0f) {
                    canvas2 = canvas3;
                    f16 = 1.0f;
                } else {
                    float max5 = Math.max(1.0f, (f31 - max4) / f32);
                    float height3 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                    if (f10 >= 0.0f) {
                        canvas2 = canvas3;
                        f16 = (t1.S(Math.max(0.0f, Math.min(1.0f, ((f10 * 470.0f) - (Math.max(0.0f, ((f31 - height3) / f32) - 0.5f) * Math.min(45.0f, 250.0f / max5))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                    } else {
                        canvas2 = canvas3;
                        float max6 = Math.max(0.0f, Math.min(1.0f, (((-f10) * 150.0f) - (Math.max(0.0f, ((height3 - max4) / f32) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max5 - 1.0f)))) / f33));
                        f16 = d3.A(max6, 0.4f, max6, 1.0f);
                    }
                }
                if (qVar.r != f16) {
                    qVar.r = f16;
                    qVar.invalidate();
                }
            } else {
                canvas2 = canvas3;
            }
            i10++;
            f28 = f33;
            canvas3 = canvas2;
        }
        Canvas canvas4 = canvas3;
        if (!z12 || f32 <= 0.0f) {
            canvas = canvas4;
            f15 = 1.0f;
        } else {
            float max7 = Math.max(1.0f, (f31 - max4) / f32);
            if (z0Var.f0 == null) {
                z0Var.f0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
            }
            if (f10 >= 0.0f) {
                float max8 = f31 - (Math.max(-1.0f, ((f10 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / max7)) * f32);
                f15 = 1.0f;
                matrix.setScale(1.0f, f32);
                matrix.postTranslate(0.0f, max8 - (f32 / 2.0f));
            } else {
                f15 = 1.0f;
                float max9 = (Math.max(-1.0f, (((-f10) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, max7 - 1.0f))) * f32) + max4;
                matrix.setScale(1.0f, f32);
                matrix.postTranslate(0.0f, max9 - (f32 / 2.0f));
            }
            z0Var.f0.setLocalMatrix(matrix);
            Paint paint7 = paint;
            paint7.setShader(z0Var.f0);
            if (paint7.getXfermode() == null) {
                paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
            canvas = canvas4;
            canvas.drawRect(0.0f, 0.0f, width, rVar2.getHeight(), paint7);
            rVar2.invalidate();
        }
        d dVar2 = z0Var.x;
        if (dVar2 != null) {
            RectF rectF4 = dVar2.F;
            if (dVar2.x <= 0.003f || rectF4.isEmpty()) {
                return;
            }
            RectF rectF5 = rectF;
            rectF5.set(rectF4);
            fArr[0] = rectF4.height() / 2.0f;
            fArr[1] = dVar2.y;
            z0Var.x.getLocationOnScreen(iArr8);
            int[] iArr9 = iArr;
            rVar2.getLocationOnScreen(iArr9);
            float scaleX2 = rVar2.getScaleX() > 0.01f ? rVar2.getScaleX() : f15;
            if (rVar2.getScaleY() > 0.01f) {
                f15 = rVar2.getScaleY();
            }
            float f34 = iArr8[0] - iArr9[0];
            float f35 = iArr8[1] - iArr9[1];
            rectF5.set((rectF5.left + f34) / scaleX2, (rectF5.top + f35) / f15, (rectF5.right + f34) / scaleX2, (rectF5.bottom + f35) / f15);
            fArr[0] = fArr[0] / f15;
            paint6.setAlpha((int) (fArr[1] * 255.0f));
            float f36 = fArr[0];
            canvas.drawRoundRect(rectF5, f36, f36, paint6);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
