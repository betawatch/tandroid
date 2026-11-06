package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ k2(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                i4Var.c3 = 0.0f;
                i4Var.a3.setAlpha(1.0f);
                i4Var.a3.setVisibility(8);
                i4Var.a3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                i4 i4Var2 = this.b;
                i4Var2.w2.e();
                i4Var2.q2 = i4Var2.X1;
                o2 o2Var = i4Var2.K1;
                if (o2Var != null && (runnable = o2Var.x) != null) {
                    runnable.run();
                    o2Var.x = null;
                }
                if (i4Var2.t1 && !i4Var2.e2) {
                    p9 p9Var = ((g9) i4Var2.z1).d;
                    if (p9Var.y) {
                        p9Var.y = false;
                        p9Var.V();
                    }
                }
                if (!i4Var2.e2 && (q2Var = i4Var2.M2) != null) {
                    q2Var.setVisibility(8);
                }
                i4Var2.E2 = true;
                i4Var2.invalidate();
                break;
        }
    }
}
