package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ c1(k2 k2Var, int i7) {
        this.a = i7;
        this.b = k2Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        k2 k2Var = this.b;
        Integer num = (Integer) obj;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.l2 l2Var = k2Var.c;
                boolean z9 = k2Var.r1;
                boolean z10 = k2Var.d;
                if (z9 != z10) {
                    k2Var.r1 = z10;
                    l2Var.clearAnimation();
                    float f10 = 0.0f;
                    if (k2Var.d) {
                        int i10 = org.telegram.messenger.g0.q.y;
                        int i11 = k2Var.f;
                        f10 = Math.min(0.0f, Math.max(((i10 - i11) * 0.3f) - k2Var.u1, (-i11) / 3.0f));
                    }
                    l2Var.animate().translationY(f10).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                    break;
                }
                break;
            case 1:
                g1 g1Var = k2Var.m1;
                ValueAnimator valueAnimator = g1Var.S;
                if ((valueAnimator == null || !valueAnimator.isRunning()) && g1Var.getCurrentPosition() != num.intValue()) {
                    g1Var.E(num.intValue());
                    j2 j2Var = k2Var.n1;
                    j2Var.F = num.intValue();
                    j2Var.invalidate();
                    break;
                }
                break;
            default:
                int intValue = num.intValue();
                int i12 = k2.y1;
                k2Var.M0(intValue);
                break;
        }
    }
}
