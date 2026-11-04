package bi;

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
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Consumer {
    public final /* synthetic */ j0 a;
    public final /* synthetic */ m b;
    public final /* synthetic */ r c;

    public /* synthetic */ c0(j0 j0Var, m mVar, r rVar) {
        this.a = j0Var;
        this.b = mVar;
        this.c = rVar;
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
        m mVar;
        Canvas canvas3 = (Canvas) obj;
        j0 j0Var = this.a;
        int[] iArr4 = j0Var.V;
        int[] iArr5 = j0Var.U;
        float[] fArr = j0Var.T;
        RectF rectF2 = j0Var.S;
        RectF rectF3 = j0Var.i0;
        Paint paint3 = j0Var.P;
        Paint paint4 = j0Var.K;
        int[] iArr6 = j0Var.N;
        Paint paint5 = j0Var.h0;
        int[] iArr7 = j0Var.M;
        Paint paint6 = j0Var.R;
        Matrix matrix = j0Var.Q;
        m mVar2 = this.b;
        if (mVar2.isVerticalScrollBarEnabled()) {
            mVar2.setVerticalScrollBarEnabled(false);
        }
        if (j0Var.f0) {
            iArr = iArr4;
        } else {
            iArr = iArr4;
            h0 h0Var = j0Var.h;
            if (h0Var != null) {
                j0Var.f0 = true;
                j0.c0(h0Var);
            }
        }
        if (j0Var.h == null || Float.isNaN(j0Var.L)) {
            return;
        }
        a1 a1Var = j0Var.d;
        if (a1Var != null) {
            f10 = 1.0f;
            if (a1Var.h1 < 0.5f) {
                iArr2 = iArr5;
                f11 = (-Utilities.l((AnimationUtils.currentAnimationTimeMillis() - a1Var.e6) / 150.0f)) - 1.0E-4f;
            } else {
                iArr2 = iArr5;
                f11 = !a1Var.f6 ? 0.0f : Utilities.l((AnimationUtils.currentAnimationTimeMillis() - a1Var.d6) / 470.0f);
            }
        } else {
            iArr2 = iArr5;
            f10 = 1.0f;
            f11 = 1.0f;
        }
        a1 a1Var2 = j0Var.d;
        int[] iArr8 = iArr2;
        boolean z10 = a1Var2 != null && a1Var2.h1 > 0.5f;
        float l10 = a1Var2 != null ? Utilities.l(a1Var2.g1) : f10;
        float f20 = f10 - l10;
        boolean z11 = z10;
        float A = f1.A(f20, f20, f20, f10);
        float V0 = z11 ? j0Var.d.V0() : -1.0f;
        if (V0 >= 0.0f) {
            float f21 = f10 - V0;
            max = ((f10 - ((f21 * f21) * f21)) * 0.25f) + 0.75f;
            f12 = V0;
        } else if (l10 >= 0.999f) {
            f12 = V0;
            max = 1.0f;
        } else {
            f12 = V0;
            max = Math.max(mVar2.getScaleX(), (0.25f * A) + 0.75f);
        }
        if (z11) {
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
            j0Var.d.invalidate();
        }
        if (max < f15) {
            mVar2.postInvalidateOnAnimation();
        }
        if (mVar2.getScaleX() != max) {
            View view = mVar2;
            float f22 = 0.0f;
            while (true) {
                paint = paint5;
                if (view == null || view == j0Var.h || !(view.getParent() instanceof View)) {
                    break;
                }
                f22 += view.getTop();
                view = (View) view.getParent();
                paint5 = paint;
            }
            float height = Float.isNaN(j0Var.L) ? mVar2.getHeight() : Math.max(0.0f, Math.min(mVar2.getHeight(), j0Var.L - f22));
            mVar2.setPivotX(mVar2.getWidth() / 2.0f);
            mVar2.setPivotY(height);
            mVar2.setScaleX(max);
            mVar2.setScaleY(max);
        } else {
            paint = paint5;
        }
        if (mVar2.getAlpha() != f14) {
            mVar2.setAlpha(f14);
        }
        mVar2.getLocationOnScreen(iArr7);
        j0Var.h.getLocationOnScreen(iArr6);
        float f23 = iArr7[1] - iArr6[1];
        float scaleY = mVar2.getScaleY() > 0.01f ? mVar2.getScaleY() : 1.0f;
        float width = mVar2.getWidth();
        if (j0Var.W == null) {
            LinearGradient j02 = j0.j0(false);
            j0Var.W = j02;
            paint4.setShader(j02);
            iArr3 = iArr6;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint4.setXfermode(new PorterDuffXfermode(mode));
            LinearGradient j03 = j0.j0(true);
            j0Var.O = j03;
            paint3.setShader(j03);
            paint3.setXfermode(new PorterDuffXfermode(mode));
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            iArr3 = iArr6;
        }
        r rVar = this.c;
        rVar.getLocationOnScreen(iArr7);
        float f24 = iArr7[1] - iArr3[1];
        float f25 = (f24 - f23) / scaleY;
        float L = ((org.telegram.messenger.g0.L(12.0f) + rVar.getHeight()) / scaleY) + f25;
        c cVar = j0Var.y;
        if (cVar != null) {
            float height2 = (f24 + rVar.getHeight()) - j0Var.d0;
            paint2 = paint3;
            if (cVar.L != height2) {
                cVar.L = height2;
                cVar.invalidate();
            }
        } else {
            paint2 = paint3;
        }
        rVar.getLocationOnScreen(j0Var.j0);
        mVar2.getLocationOnScreen(j0Var.k0);
        float scaleX = (r0[0] - r3[0]) / mVar2.getScaleX();
        rectF3.set((j0Var.b0 / scaleY) + scaleX, (j0Var.c0 / scaleY) + f25, ((rVar.getWidth() - j0Var.b0) / scaleY) + scaleX, ((rVar.getHeight() - j0Var.d0) / scaleY) + f25);
        paint6.setAlpha(hs.e4);
        canvas3.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint6);
        matrix.setScale(1.0f, L - f25);
        matrix.postTranslate(0.0f, f25);
        j0Var.O.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, Math.min(f25, (-f23) / scaleY), width, L, paint2);
        float L2 = org.telegram.messenger.g0.L(10.0f);
        float f26 = ((j0Var.L - f23) - L2) / scaleY;
        float f27 = L2 / scaleY;
        matrix.setScale(1.0f, f27);
        matrix.postTranslate(0.0f, f26);
        j0Var.W.setLocalMatrix(matrix);
        canvas3.drawRect(0.0f, f26, width, Math.max(f27 + f26, org.telegram.messenger.g0.L(200.0f) + mVar2.getHeight()), paint4);
        boolean z12 = f11 < 1.0f && !z11;
        float f28 = z11 ? l10 : f11;
        a1 a1Var3 = j0Var.d;
        float f29 = 90.0f;
        if (a1Var3 != null) {
            j0Var.e0 = j0Var.r - (a1Var3.H0() - org.telegram.messenger.g0.L(8.0f));
            float translationY = rVar.getTranslationY();
            float f30 = j0Var.e0;
            if (translationY != f30) {
                rVar.setTranslationY(f30);
                rVar.invalidate();
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
                f19 = f1.A(max3, 0.15f, max3, 1.0f);
                f18 = 1.0f - max3;
            }
            if (rVar.getScaleX() != f19) {
                rVar.setPivotX(rVar.getWidth() / 2.0f);
                rVar.setPivotY(rVar.getHeight() / 2.0f);
                rVar.setScaleX(f19);
                rVar.setScaleY(f19);
                rVar.invalidate();
            }
            if (rVar.getAlpha() != f18) {
                rVar.setAlpha(f18);
            }
            if ((f19 != 1.0f || f18 != 1.0f) && (mVar = j0Var.a0) != null) {
                mVar.postInvalidateOnAnimation();
            }
        }
        float max4 = Math.max(0.0f, -f23);
        float f32 = j0Var.L - f23;
        int i3 = 0;
        float f33 = 0.0f;
        while (true) {
            float f34 = f29;
            if (i3 >= mVar2.getChildCount()) {
                break;
            }
            View childAt = mVar2.getChildAt(i3);
            if (childAt instanceof l) {
                l lVar = (l) childAt;
                if (f33 == 0.0f) {
                    f33 = childAt.getHeight();
                }
                if (!z12 || f33 <= 0.0f) {
                    canvas2 = canvas3;
                    f17 = 1.0f;
                } else {
                    float max5 = Math.max(1.0f, (f32 - max4) / f33);
                    float height3 = (childAt.getHeight() / 2.0f) + childAt.getTop();
                    if (f11 >= 0.0f) {
                        canvas2 = canvas3;
                        f17 = (a1.S(Math.max(0.0f, Math.min(1.0f, ((f11 * 470.0f) - (Math.max(0.0f, ((f32 - height3) / f33) - 0.5f) * Math.min(45.0f, 250.0f / max5))) / 220.0f)), 1.2f) * 0.5f) + 0.5f;
                    } else {
                        canvas2 = canvas3;
                        float max6 = Math.max(0.0f, Math.min(1.0f, (((-f11) * 150.0f) - (Math.max(0.0f, ((height3 - max4) / f33) - 0.5f) * Math.min(25.0f, 60.0f / Math.max(1.0f, max5 - 1.0f)))) / f34));
                        f17 = f1.A(max6, 0.4f, max6, 1.0f);
                    }
                }
                if (lVar.r != f17) {
                    lVar.r = f17;
                    lVar.invalidate();
                }
            } else {
                canvas2 = canvas3;
            }
            i3++;
            f29 = f34;
            canvas3 = canvas2;
        }
        Canvas canvas4 = canvas3;
        if (!z12 || f33 <= 0.0f) {
            canvas = canvas4;
            f16 = 1.0f;
        } else {
            float max7 = Math.max(1.0f, (f32 - max4) / f33);
            if (j0Var.g0 == null) {
                j0Var.g0 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
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
            j0Var.g0.setLocalMatrix(matrix);
            Paint paint7 = paint;
            paint7.setShader(j0Var.g0);
            if (paint7.getXfermode() == null) {
                paint7.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
            canvas = canvas4;
            canvas.drawRect(0.0f, 0.0f, width, mVar2.getHeight(), paint7);
            mVar2.invalidate();
        }
        c cVar2 = j0Var.y;
        if (cVar2 != null) {
            RectF rectF4 = cVar2.G;
            if (cVar2.y <= 0.003f || rectF4.isEmpty()) {
                return;
            }
            RectF rectF5 = rectF;
            rectF5.set(rectF4);
            fArr[0] = rectF4.height() / 2.0f;
            fArr[1] = cVar2.E;
            j0Var.y.getLocationOnScreen(iArr8);
            int[] iArr9 = iArr;
            mVar2.getLocationOnScreen(iArr9);
            float scaleX2 = mVar2.getScaleX() > 0.01f ? mVar2.getScaleX() : f16;
            if (mVar2.getScaleY() > 0.01f) {
                f16 = mVar2.getScaleY();
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
