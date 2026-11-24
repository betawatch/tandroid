// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k95 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l95 b;

    public /* synthetic */ k95(l95 l95Var, byte b) {
        this.a = b;
        this.b = l95Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        l95 l95Var = this.b;
        switch (b) {
            case 0:
                l95Var.O0 = null;
                l95Var.E.F = false;
                h85 h85Var = l95Var.F;
                if (h85Var != null) {
                    if (h85Var.getParent() != null) {
                        l95Var.removeView(l95Var.F);
                        l95Var.F.e();
                    }
                    l95Var.F = null;
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                l95Var.K0 = null;
                l95Var.J0 = 0.0f;
                l95Var.invalidate();
                break;
            default:
                l95Var.C0 = null;
                l95Var.z0 = 1.0f;
                l95Var.s0 = 0.0f;
                l95Var.t0 = 0.0f;
                l95Var.invalidate();
                break;
        }
    }
}
