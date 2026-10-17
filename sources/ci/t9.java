package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class t9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ t9(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                aa aaVar = this.b.b;
                m7 m7Var = aaVar.u1;
                if (m7Var != null) {
                    m7Var.b();
                    aaVar.v.removeView(aaVar.u1);
                }
                aaVar.u1 = null;
                aaVar.P();
                break;
            default:
                super.onAnimationEnd(animator);
                m7 m7Var2 = this.b.b.u1;
                if (m7Var2 != null) {
                    m7Var2.a(true);
                    break;
                }
                break;
        }
    }
}
