package di;

import android.animation.ValueAnimator;
import android.view.View;
import fi.dc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n3(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p3 p3Var = (p3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                q4 q4Var = p3Var.a;
                q4Var.k3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                if (q4Var.k3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    q4Var.f3 = true;
                    try {
                        q4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                fi.e6 e6Var = (fi.e6) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                e6Var.P0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.L0.invalidate();
                e6Var.I0.invalidate();
                e6Var.J0.invalidate();
                int i10 = 0;
                while (i10 < e6Var.L0.getChildCount()) {
                    e6Var.L0.getChildAt(i10).setAlpha(((i10 == e6Var.O0 ? e6Var.P0 : i10 == e6Var.N0 ? 1.0f - e6Var.P0 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = ds.f.getInterpolation(e6Var.P0);
                if (view != null && view2 != null) {
                    float f7 = 1.0f - interpolation;
                    float f10 = (f7 * 0.4f) + 0.6f;
                    view.setScaleX(f10);
                    view.setScaleY(f10);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f11 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f11);
                    view2.setScaleY(f11);
                    view2.setTranslationY((Math.min(f7, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f7, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 2:
                dc dcVar = (dc) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                fi.u uVar = (fi.u) this.d;
                dcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    dcVar.setDrawable(uVar);
                    break;
                }
                break;
            case 3:
                mi.l lVar = (mi.l) this.b;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.c;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (lVar.l) {
                    r1Var.g0 = (-lVar.s) * floatValue2;
                    r1Var.h0 = (-lVar.t) * floatValue2;
                    r1Var.j0 = (-lVar.u) * floatValue2;
                    r1Var.i0 = (-lVar.v) * floatValue2;
                } else {
                    r1Var.g0 = ((-lVar.s) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.h0 = ((-lVar.t) * floatValue2) - s1Var.getAnimationOffsetX();
                    r1Var.j0 = ((-lVar.u) * floatValue2) - s1Var.getTranslationY();
                    r1Var.i0 = ((-lVar.v) * floatValue2) - s1Var.getTranslationY();
                }
                s1Var.invalidate();
                break;
            default:
                sg.m0 m0Var = (sg.m0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                m0Var.X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.U0.invalidate();
                m0Var.R0.invalidate();
                m0Var.S0.invalidate();
                int i11 = 0;
                while (i11 < m0Var.U0.getChildCount()) {
                    m0Var.U0.getChildAt(i11).setAlpha(((i11 == m0Var.W0 ? m0Var.X0 : i11 == m0Var.V0 ? 1.0f - m0Var.X0 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = ds.f.getInterpolation(m0Var.X0);
                if (view3 != null && view4 != null) {
                    float f12 = 1.0f - interpolation2;
                    float f13 = (f12 * 0.4f) + 0.6f;
                    view3.setScaleX(f13);
                    view3.setScaleY(f13);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f14 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f14);
                    view4.setScaleY(f14);
                    view4.setTranslationY((Math.min(f12, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f12, 0.25f) / 0.25f));
                    break;
                }
                break;
        }
    }
}
