package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
