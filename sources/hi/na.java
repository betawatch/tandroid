package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class na extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    public /* synthetic */ na(nb nbVar, int i7) {
        this.a = i7;
        this.b = nbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nb nbVar = this.b;
                nbVar.k2 = null;
                nbVar.r.setTranslationY(0.0f);
                nbVar.r.b(0.0f);
                break;
            case 1:
                nb nbVar2 = this.b;
                nbVar2.n.removeView(nbVar2.N0);
                nbVar2.N0 = null;
                nbVar2.o2 = null;
                nbVar2.q2 = null;
                nbVar2.d1.M.b(nbVar2.g0 != 1);
                break;
            default:
                nb nbVar3 = this.b;
                va vaVar = nbVar3.D2;
                if (vaVar != null) {
                    if (vaVar.getParent() != null) {
                        ((ViewGroup) nbVar3.D2.getParent()).removeView(nbVar3.D2);
                    }
                    nbVar3.D2 = null;
                }
                nbVar3.F2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
