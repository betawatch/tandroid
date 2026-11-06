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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Consumer {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ r b;
    public final /* synthetic */ w c;

    public /* synthetic */ k0(s0 s0Var, r rVar, w wVar) {
        this.a = s0Var;
        this.b = rVar;
        this.c = wVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        int[] iArr;
        int[] iArr2;
        float f10;
        float f11;
        float f12;
        float max;
        RectF rectF;
        float f13;
        float f14;
        float f15;
        Paint paint;
        int[] iArr3;
        Paint paint2;
        Canvas canvas;
        float f16;
        Canvas canvas2;
        float f17;
        float f18;
        float f19;
        r rVar;
        Canvas canvas3 = (Canvas) obj;
        s0 s0Var = this.a;
        int[] iArr4 = s0Var.U;
        int[] iArr5 = s0Var.T;
        float[] fArr = s0Var.S;
        RectF rectF2 = s0Var.R;
        RectF rectF3 = s0Var.h0;
        Paint paint3 = s0Var.O;
        Paint paint4 = s0Var.J;
        int[] iArr6 = s0Var.M;
        Paint paint5 = s0Var.g0;
        int[] iArr7 = s0Var.L;
        Paint paint6 = s0Var.Q;
        Matrix matrix = s0Var.P;
        r rVar2 = this.b;
        if (rVar2.isVerticalScrollBarEnabled()) {
            rVar2.setVerticalScrollBarEnabled(false);
        }
        if (s0Var.e0) {
            iArr = iArr4;
        } else {
            iArr = iArr4;
            q0 q0Var = s0Var.h;
            if (q0Var != null) {
                s0Var.e0 = true;
                s0.c0(q0Var);
            }
        }
        if (s0Var.h == null || Float.isNaN(s0Var.K)) {
            return;
        }
        l1 l1Var = s0Var.d;
        if (l1Var != null) {
            f10 = 1.0f;
            if (l1Var.g1 < 0.5f) {
                iArr2 = iArr5;
                f11 = (-Utilities.l((AnimationUtils.currentAnimationTimeMillis() - l1Var.d6) / 150.0f)) - 1.0E-4f;
            } else {
                iArr2 = iArr5;
                f11 = !l1Var.e6 ? 0.0f : Utilities.l((AnimationUtils.currentAnimationTimeMillis() - l1Var.c6) / 470.0f);
            }
        } else {
            iArr2 = iArr5;
            f10 = 1.0f;
            f11 = 1.0f;
        }
        l1 l1Var2 = s0Var.d;
        int[] iArr8 = iArr2;
        boolean z9 = l1Var2 != null && l1Var2.g1 > 0.5f;
        float l10 = l1Var2 != null ? Utilities.l(l1Var2.f1) : f10;
        float f20 = f10 - l10;
        boolean z10 = z9;
        float x10 = org.telegram.ui.Cells.f1.x(f20, f20, f20, f10);
        float V0 = z10 ? s0Var.d.V0() : -1.0f;
        if (V0 >= 0.0f) {
            float f21 = f10 - V0;
            max = ((f10 - ((f21 * f21) * f21)) * 0.25f) + 0.75f;
            f12 = V0;
        } else if (l10 >= 0.999f) {
            f12 = V0;
            max = 1.0f;
        } else {
            f12 = V0;
            max = Math.max(rVar2.getScaleX(), (0.25f * x10) + 0.75f);
        }
        if (z10) {
            rectF = rectF2;
            f13 = 1.0f;
            f14 = Math.min(1.0f, l10 / 0.55f);
        } else {
            rectF = rectF2;
            f13 = 1.0f;
            f14 = 1.0f;
        }
        if (V0 < 0.0f || f12 >= f13) {
            f15 = f13;
        } else {
            f15 = f13;
            s0Var.d.invalidate();
        }
        if (max < f15) {
            rVar2.postInvalidateOnAnimation();
        }
        if (rVar2.getScaleX() != max) {
            View view = rVar2;
            float f22 = 0.0f;
            while (true) {
                paint = paint5;
                if (view == null || view == s0Var.h || !(view.getParent() instanceof View)) {
                    break;
                }
                f22 += view.getTop();
                view = (View) view.getParent();
                paint5 = paint;
            }
            float height = Float.isNaN(s0Var.K) ? rVar2.getHeight() : Math.max(0.0f, Math.min(rVar2.getHeight(), s0Var.K - f22));
            rVar2.setPivotX(rVar2.getWidth() / 2.0f);
            rVar2.setPivotY(height);
            rVar2.setScaleX(max);
            rVar2.setScaleY(max);
        } else {
            paint = paint5;
        }
        if (rVar2.getAlpha() != f14) {
            rVar2.setAlpha(f14);
        }
        rVar2.getLocationOnScreen(iArr7);
        s0Var.h.getLocationOnScreen(iArr6);
        float f23 = iArr7[1] - iArr6[1];
        float scaleY = rVar2.getScaleY() > 0.01f ? rVar2.getScaleY() : 1.0f;
        float width = rVar2.getWidth();
        if (s0Var.V == null) {
            LinearGradient j02 = s0.j0(false);
            s0Var.V = j02;
            paint4.setShader(j02);
            iArr3 = iArr6;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint4.setXfermode(new PorterDuffXfermode(mode));
            LinearGradient j03 = s0.j0(true);
            s0Var.N = j03;
            paint3.setShader(j03);
            paint3.setXfermode(new PorterDuffXfermode(mode));
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            iArr3 = iArr6;
        }
        w wVar = this.c;
        wVar.getLocationOnScreen(iArr7);
        float f24 = iArr7[1] - iArr3[1];
        float f25 = (f24 - f23) / scaleY;
        float L = ((org.telegram.messenger.g0.L(12.0f) + wVar.getHeight()) / scaleY) + f25;
        d dVar = s0Var.y;
        if (dVar != null) {
            float height2 = (f24 + wVar.getHeight()) - s0Var.c0;
            paint2 = paint3;
            if (dVar.K != height2) {
                dVar.K = height2;
                dVar.invalidate();
            }
        } else {
            paint2 = paint3;
        }
        wVar.getLocationOnScreen(s0Var.i0);
        rVar2.getLocationOnScreen(s0Var.j0);
        float scaleX = (r0[0] - r3[0]) / rVar2.getScaleX();
        rectF3.set((s0Var.a0 / scaleY) + scaleX, (s0Var.b0 / scaleY) + f25, ((wVar.getWidth() - s0Var.a0) / scaleY) + scaleX, ((wVar.getHeight() - s0Var.c0) / scaleY) + f25);
        paint6.setAlpha(qs.e4);
        canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
        matrix.setScale(1.0f, L - f25);
        matrix.postTranslate(0.0f, f25);
        s0Var.N.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, Math.min(f25, (-f23) / scaleY), width, L, paint2);
        float L2 = org.telegram.messenger.g0.L(10.0f);
        float f26 = ((s0Var.K - f23) - L2) / scaleY;
        float f27 = L2 / scaleY;
        matrix.setScale(1.0f, f27);
        matrix.postTranslate(0.0f, f26);
        s0Var.V.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, f26, width, Math.max(f27 + f26, org.telegram.messenger.g0.L(200.0f) + rVar2.getHeight()), paint4);
        boolean z11 = f11 < 1.0f && !z10;
        float f28 = z10 ? l10 : f11;
        l1 l1Var3 = s0Var.d;
        float f29 = 90.0f;
        if (l1Var3 != null) {
            s0Var.d0 = s0Var.r - (l1Var3.H0() - org.telegram.messenger.g0.L(8.0f));
            float translationY = wVar.getTranslationY();
            float f30 = s0Var.d0;
            if (translationY != f30) {
                wVar.setTranslationY(f30);
                wVar.invalidate();
            }
            if (f28 >= 1.0f) {
                f18 = 1.0f;
                f19 = 1.0f;
            } else if (f28 >= 0.0f) {
                float max2 = Math.max(0.0f, Math.min(1.0f, f28));
                float f31 = 1.0f - max2;
                f18 = Math.min(1.0f, max2 / 0.35f);
                f19 = ((1.0f - ((f31 * f31) * f31)) * 0.15f) + 0.85f;
            } else {
                float max3 = Math.max(0.0f, Math.min(1.0f, ((-f28) * 150.0f) / 90.0f));
                f19 = org.telegram.ui.Cells.f1.x(max3, 0.15f, max3, 1.0f);
                f18 = 1.0f - max3;
            }
            if (wVar.getScaleX() != f19) {
                wVar.setPivotX(wVar.getWidth() / 2.0f);
                wVar.setPivotY(wVar.getHeight() / 2.0f);
                wVar.setScaleX(f19);
                wVar.setScaleY(f19);
                wVar.invalidate();
            }
            if (wVar.getAlpha() != f18) {
                wVar.setAlpha(f18);
            }
            if ((f19 != 1.0f || f18 != 1.0f) && (rVar = s0Var.Z) != null) {
                rVar.postInvalidateOnAnimation();
            }
        }
        float max4 = Math.max(0.0f, -f23);
        float f32 = s0Var.K - f23;
        int i7 = 0;
        float f33 = 0.0f;
        while (true) {
            float f34 = f29;
            if (i7 >= rVar2.getChildCount()) {
                break;
            }
            View childAt = rVar2.getChildAt(i7);
            if (childAt instanceof q) {
                q qVar = (q) childAt;
                if (f33 == 0.0f) {
                    f33 = childAt.getHeight();
                }
                if (!z11 || f33 <= 0.0f) {
                    canvas2 = canvas3;
                    f17 = 1.0f;
                } else {
                    float max5 = Math.max(1.0f, (f32 - max4) / f33);
                    float height3 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                    if (f11 >= 0.0f) {
                        canvas2 = canvas3;
                        f17 = (l1.S(Math.max(0.0f, Math.min(1.0f, ((f11 * 470.0f) - (Math.max(0.0f, ((f32 - height3) / f33) - 0.5f) * Math.min(45.0f, 250.0f / max5))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                    } else {
                        canvas2 = canvas3;
                        float max6 = Math.max(0.0f, Math.min(1.0f, (((-f11) * 150.0f) - (Math.max(0.0f, ((height3 - max4) / f33) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max5 - 1.0f)))) / f34));
                        f17 = org.telegram.ui.Cells.f1.x(max6, 0.4f, max6, 1.0f);
                    }
                }
                if (qVar.r != f17) {
                    qVar.r = f17;
                    qVar.invalidate();
                }
            } else {
                canvas2 = canvas3;
            }
            i7++;
            f29 = f34;
            canvas3 = canvas2;
        }
        Canvas canvas4 = canvas3;
        if (!z11 || f33 <= 0.0f) {
            canvas = canvas4;
            f16 = 1.0f;
        } else {
            float max7 = Math.max(1.0f, (f32 - max4) / f33);
            if (s0Var.f0 == null) {
                s0Var.f0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
            }
            if (f11 >= 0.0f) {
                float max8 = f32 - (Math.max(-1.0f, ((f11 * 470.0f) - 38.5f) / Math.min(45.0f, 250.0f / max7)) * f33);
                f16 = 1.0f;
                matrix.setScale(1.0f, f33);
                matrix.postTranslate(0.0f, max8 - (f33 / 2.0f));
            } else {
                f16 = 1.0f;
                float max9 = (Math.max(-1.0f, (((-f11) * 150.0f) - 76.5f) / Math.min(25.0f, 60.0f / Math.max(1.0f, max7 - 1.0f))) * f33) + max4;
                matrix.setScale(1.0f, f33);
                matrix.postTranslate(0.0f, max9 - (f33 / 2.0f));
            }
            s0Var.f0.setLocalMatrix(matrix);
            Paint paint7 = paint;
            paint7.setShader(s0Var.f0);
            if (paint7.getXfermode() == null) {
                paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
            canvas = canvas4;
            canvas.drawRect(0.0f, 0.0f, width, rVar2.getHeight(), paint7);
            rVar2.invalidate();
        }
        d dVar2 = s0Var.y;
        if (dVar2 != null) {
            RectF rectF4 = dVar2.F;
            if (dVar2.y <= 0.003f || rectF4.isEmpty()) {
                return;
            }
            RectF rectF5 = rectF;
            rectF5.set(rectF4);
            fArr[0] = rectF4.height() / 2.0f;
            fArr[1] = dVar2.D;
            s0Var.y.getLocationOnScreen(iArr8);
            int[] iArr9 = iArr;
            rVar2.getLocationOnScreen(iArr9);
            float scaleX2 = rVar2.getScaleX() > 0.01f ? rVar2.getScaleX() : f16;
            if (rVar2.getScaleY() > 0.01f) {
                f16 = rVar2.getScaleY();
            }
            float f35 = iArr8[0] - iArr9[0];
            float f36 = iArr8[1] - iArr9[1];
            rectF5.set((rectF5.left + f35) / scaleX2, (rectF5.top + f36) / f16, (rectF5.right + f35) / scaleX2, (rectF5.bottom + f36) / f16);
            fArr[0] = fArr[0] / f16;
            paint6.setAlpha((int) (fArr[1] * 255.0f));
            float f37 = fArr[0];
            canvas.drawRoundRect(rectF5, f37, f37, paint6);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
