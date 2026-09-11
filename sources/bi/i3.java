package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class i3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ i3(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.t3 = 0.0f;
                o5Var.r3.setAlpha(1.0f);
                o5Var.r3.setVisibility(8);
                o5Var.r3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                o5 o5Var2 = this.b;
                o5Var2.N2.unlock();
                o5Var2.H2 = o5Var2.o2;
                n3 n3Var = o5Var2.b2;
                if (n3Var != null && (runnable = n3Var.w) != null) {
                    runnable.run();
                    n3Var.w = null;
                }
                if (o5Var2.K1 && !o5Var2.v2) {
                    pb pbVar = ((gb) o5Var2.Q1).d;
                    if (pbVar.x) {
                        pbVar.x = false;
                        pbVar.P();
                    }
                }
                if (!o5Var2.v2 && (p3Var = o5Var2.d3) != null) {
                    p3Var.setVisibility(8);
                }
                o5Var2.V2 = true;
                o5Var2.invalidate();
                break;
        }
    }
}
