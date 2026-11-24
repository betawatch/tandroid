// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j95 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h85 b;
    public final /* synthetic */ l95 c;

    public /* synthetic */ j95(l95 l95Var, h85 h85Var, byte b) {
        this.a = b;
        this.c = l95Var;
        this.b = h85Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        l95 l95Var = this.c;
        h85 h85Var = this.b;
        switch (b) {
            case 0:
                l95Var.O0 = null;
                h85Var.F = false;
                h85 h85Var2 = l95Var.F;
                if (h85Var2 != null) {
                    if (h85Var2.getParent() != null) {
                        l95Var.removeView(l95Var.F);
                        l95Var.F.e();
                    }
                    l95Var.F = null;
                    break;
                }
                break;
            case 1:
                l95Var.y.e();
                l95Var.r = null;
                h85Var.r = false;
                if (!l95Var.b) {
                    l95Var.d();
                    l95Var.E = null;
                    l95Var.d = 0L;
                }
                l95Var.c = l95Var.b ? 1.0f : 0.0f;
                l95Var.j();
                l95Var.g(false);
                if (!l95Var.b) {
                    l95Var.l0.setVisibility(8);
                    l95Var.m0.setVisibility(8);
                    l95Var.f0.setVisibility(8);
                    l95Var.g0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (h85Var.getParent() != null) {
                    l95Var.removeView(h85Var);
                    h85Var.e();
                    break;
                }
                break;
            default:
                if (h85Var.getParent() != null) {
                    l95Var.removeView(h85Var);
                    h85Var.e();
                    break;
                }
                break;
        }
    }
}
