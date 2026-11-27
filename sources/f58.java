// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class f58 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o68 b;

    public /* synthetic */ f58(o68 o68Var, byte b) {
        this.a = b;
        this.b = o68Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j58 j58Var;
        Runnable runnable;
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                o68Var.d3 = 0.0f;
                o68Var.b3.setAlpha(1.0f);
                o68Var.b3.setVisibility(8);
                o68Var.b3.k();
                break;
            default:
                super.onAnimationEnd(animator);
                o68Var.x2.e();
                o68Var.r2 = o68Var.Y1;
                h58 h58Var = o68Var.L1;
                if (h58Var != null && (runnable = h58Var.x) != null) {
                    runnable.run();
                    h58Var.x = null;
                }
                if (o68Var.u1 && !o68Var.f2) {
                    lcb lcbVar = ((ccb) o68Var.A1).d;
                    if (lcbVar.y) {
                        lcbVar.y = false;
                        lcbVar.U();
                    }
                }
                if (!o68Var.f2 && (j58Var = o68Var.N2) != null) {
                    j58Var.setVisibility(8);
                }
                o68Var.F2 = true;
                o68Var.invalidate();
                break;
        }
    }
}
