package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class m9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ m9(o9 o9Var, int i10) {
        this.a = i10;
        this.b = o9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                aa aaVar = this.b.I0;
                aaVar.X = 0.0f;
                aa.k(aaVar);
                break;
            default:
                aa aaVar2 = this.b.I0;
                aaVar2.W = 0.0f;
                aaVar2.Z = 0.0f;
                aa.k(aaVar2);
                break;
        }
    }
}
