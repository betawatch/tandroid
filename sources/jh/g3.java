package jh;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.dc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i3 i3Var = (i3) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.c;
                boolean[] zArr = (boolean[]) this.d;
                e4 e4Var = i3Var.a;
                e4Var.r3 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                e4Var.invalidate();
                if (e4Var.r3 > 0.8f && !zArr[0]) {
                    zArr[0] = true;
                    e4Var.m3 = true;
                    try {
                        e4Var.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                lh.f6 f6Var = (lh.f6) this.b;
                View view = (View) this.c;
                View view2 = (View) this.d;
                f6Var.W0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.S0.invalidate();
                f6Var.P0.invalidate();
                f6Var.Q0.invalidate();
                int i10 = 0;
                while (i10 < f6Var.S0.getChildCount()) {
                    f6Var.S0.getChildAt(i10).setAlpha(((i10 == f6Var.V0 ? f6Var.W0 : i10 == f6Var.U0 ? 1.0f - f6Var.W0 : 0.0f) * 0.4f) + 0.6f);
                    i10++;
                }
                float interpolation = er.f.getInterpolation(f6Var.W0);
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
            case 2:
                dc dcVar = (dc) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                lh.v vVar = (lh.v) this.d;
                dcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Math.abs(floatValue - 0.5f);
                if (floatValue >= 0.5f && !atomicBoolean.get()) {
                    atomicBoolean.set(true);
                    dcVar.setDrawable(vVar);
                    break;
                }
                break;
            case 3:
                sh.l lVar = (sh.l) this.b;
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
                zf.l0 l0Var = (zf.l0) this.b;
                View view3 = (View) this.c;
                View view4 = (View) this.d;
                l0Var.e1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.b1.invalidate();
                l0Var.Y0.invalidate();
                l0Var.Z0.invalidate();
                int i11 = 0;
                while (i11 < l0Var.b1.getChildCount()) {
                    l0Var.b1.getChildAt(i11).setAlpha(((i11 == l0Var.d1 ? l0Var.e1 : i11 == l0Var.c1 ? 1.0f - l0Var.e1 : 0.0f) * 0.4f) + 0.6f);
                    i11++;
                }
                float interpolation2 = er.f.getInterpolation(l0Var.e1);
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
        }
    }
}
