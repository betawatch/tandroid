package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class dc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tb b;

    public /* synthetic */ dc(tb tbVar, int i10) {
        this.a = i10;
        this.b = tbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                kc kcVar = this.b.b;
                q9 q9Var = kcVar.u1;
                if (q9Var != null) {
                    q9Var.b();
                    kcVar.v.removeView(kcVar.u1);
                }
                kcVar.u1 = null;
                kcVar.P();
                break;
            default:
                super.onAnimationEnd(animator);
                q9 q9Var2 = this.b.b.u1;
                if (q9Var2 != null) {
                    q9Var2.a(true);
                    break;
                }
                break;
        }
    }
}
