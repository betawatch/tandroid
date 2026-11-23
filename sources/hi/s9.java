package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class s9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ s9(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sa saVar = this.b;
                saVar.k2 = null;
                saVar.r.setTranslationY(0.0f);
                saVar.r.b(0.0f);
                break;
            case 1:
                sa saVar2 = this.b;
                saVar2.n.removeView(saVar2.N0);
                saVar2.N0 = null;
                saVar2.o2 = null;
                saVar2.q2 = null;
                saVar2.d1.M.b(saVar2.g0 != 1);
                break;
            default:
                sa saVar3 = this.b;
                aa aaVar = saVar3.D2;
                if (aaVar != null) {
                    if (aaVar.getParent() != null) {
                        ((ViewGroup) saVar3.D2.getParent()).removeView(saVar3.D2);
                    }
                    saVar3.D2 = null;
                }
                saVar3.F2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
