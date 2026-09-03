package eg;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import oh.f4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.pr;
import qh.a5;
import qh.ma;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                c1Var.f1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.c1.invalidate();
                c1Var.Z0.invalidate();
                c1Var.a1.invalidate();
                int i10 = 0;
                while (i10 < c1Var.c1.getChildCount()) {
                    c1Var.c1.getChildAt(i10).setAlpha(((i10 == c1Var.e1 ? c1Var.f1 : i10 == c1Var.d1 ? 1.0f - c1Var.f1 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = pr.f.getInterpolation(c1Var.f1);
                if (view != null && view2 != null) {
                    float f10 = 1.0f - interpolation;
                    float f11 = (f10 * 0.4f) + 0.6f;
                    view.setScaleX(f11);
                    view.setScaleY(f11);
                    view.setTranslationY((Math.min(interpolation, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
                    float f12 = (interpolation * 0.4f) + 0.6f;
                    view2.setScaleX(f12);
                    view2.setScaleY(f12);
                    view2.setTranslationY((Math.min(f10, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view2.setAlpha(1.0f - (Math.min(f10, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 1:
                oh.i3 i3Var = (oh.i3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                f4 f4Var = i3Var.a;
                f4Var.s3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                if (f4Var.s3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    f4Var.n3 = true;
                    try {
                        f4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                a5 a5Var = (a5) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                a5Var.X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.T0.invalidate();
                a5Var.Q0.invalidate();
                a5Var.R0.invalidate();
                int i11 = 0;
                while (i11 < a5Var.T0.getChildCount()) {
                    a5Var.T0.getChildAt(i11).setAlpha(((i11 == a5Var.W0 ? a5Var.X0 : i11 == a5Var.V0 ? 1.0f - a5Var.X0 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = pr.f.getInterpolation(a5Var.X0);
                if (view3 != null && view4 != null) {
                    float f13 = 1.0f - interpolation2;
                    float f14 = (f13 * 0.4f) + 0.6f;
                    view3.setScaleX(f14);
                    view3.setScaleY(f14);
                    view3.setTranslationY((Math.min(interpolation2, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view3.setAlpha(1.0f - (Math.min(interpolation2, 0.25f) / 0.25f));
                    float f15 = (interpolation2 * 0.4f) + 0.6f;
                    view4.setScaleX(f15);
                    view4.setScaleY(f15);
                    view4.setTranslationY((Math.min(f13, 0.25f) * (-AndroidUtilities.dp(16.0f))) / 0.25f);
                    view4.setAlpha(1.0f - (Math.min(f13, 0.25f) / 0.25f));
                    break;
                }
                break;
            case 3:
                ma maVar = (ma) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                lc0 lc0Var = (lc0) this.d;
                maVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    maVar.setDrawable(lc0Var);
                    break;
                }
                break;
            default:
                xh.m mVar = (xh.m) this.b;
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
        }
    }
}
