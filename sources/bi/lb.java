package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class lb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb b;

    public /* synthetic */ lb(bb bbVar, int i10) {
        this.a = i10;
        this.b = bbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                sb sbVar = this.b.b;
                b9 b9Var = sbVar.u1;
                if (b9Var != null) {
                    b9Var.b();
                    sbVar.v.removeView(sbVar.u1);
                }
                sbVar.u1 = null;
                sbVar.P();
                break;
            default:
                super.onAnimationEnd(animator);
                b9 b9Var2 = this.b.b.u1;
                if (b9Var2 != null) {
                    b9Var2.a(true);
                    break;
                }
                break;
        }
    }
}
