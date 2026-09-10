package bi;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                r7Var.a1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.W0.invalidate();
                r7Var.T0.invalidate();
                r7Var.U0.invalidate();
                int i10 = 0;
                while (i10 < r7Var.W0.getChildCount()) {
                    r7Var.W0.getChildAt(i10).setAlpha(((i10 == r7Var.Z0 ? r7Var.a1 : i10 == r7Var.Y0 ? 1.0f - r7Var.a1 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = wr.f.getInterpolation(r7Var.a1);
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
            case 1:
                ne neVar = (ne) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                y yVar = (y) this.d;
                neVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    neVar.setDrawable(yVar);
                    break;
                }
                break;
            case 2:
                ii.m mVar = (ii.m) this.b;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (mVar.l) {
                    s1Var.g0 = (-mVar.s) * floatValue2;
                    s1Var.h0 = (-mVar.t) * floatValue2;
                    s1Var.j0 = (-mVar.u) * floatValue2;
                    s1Var.i0 = (-mVar.v) * floatValue2;
                } else {
                    s1Var.g0 = ((-mVar.s) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.h0 = ((-mVar.t) * floatValue2) - t1Var.getAnimationOffsetX();
                    s1Var.j0 = ((-mVar.u) * floatValue2) - t1Var.getTranslationY();
                    s1Var.i0 = ((-mVar.v) * floatValue2) - t1Var.getTranslationY();
                }
                t1Var.invalidate();
                break;
            case 3:
                pg.m0 m0Var = (pg.m0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                m0Var.i1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f1.invalidate();
                m0Var.c1.invalidate();
                m0Var.d1.invalidate();
                int i11 = 0;
                while (i11 < m0Var.f1.getChildCount()) {
                    m0Var.f1.getChildAt(i11).setAlpha(((i11 == m0Var.h1 ? m0Var.i1 : i11 == m0Var.g1 ? 1.0f - m0Var.i1 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = wr.f.getInterpolation(m0Var.i1);
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
            default:
                zh.g2 g2Var = (zh.g2) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                zh.a3 a3Var = g2Var.a;
                a3Var.v3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                a3Var.invalidate();
                if (a3Var.v3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    a3Var.q3 = true;
                    try {
                        a3Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
