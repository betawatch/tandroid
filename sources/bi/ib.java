package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class ib extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya b;

    public /* synthetic */ ib(ya yaVar, int i10) {
        this.a = i10;
        this.b = yaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                pb pbVar = this.b.b;
                y8 y8Var = pbVar.u1;
                if (y8Var != null) {
                    y8Var.b();
                    pbVar.v.removeView(pbVar.u1);
                }
                pbVar.u1 = null;
                pbVar.P();
                break;
            default:
                super.onAnimationEnd(animator);
                y8 y8Var2 = this.b.b.u1;
                if (y8Var2 != null) {
                    y8Var2.a(true);
                    break;
                }
                break;
        }
    }
}
