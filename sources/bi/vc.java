package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class vc extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    public /* synthetic */ vc(ce ceVar, int i10) {
        this.a = i10;
        this.b = ceVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ce ceVar = this.b;
                ceVar.j2 = null;
                ceVar.r.setTranslationY(0.0f);
                ceVar.r.b(0.0f);
                break;
            case 1:
                ce ceVar2 = this.b;
                ceVar2.n.removeView(ceVar2.M0);
                ceVar2.M0 = null;
                ceVar2.n2 = null;
                ceVar2.p2 = null;
                ceVar2.c1.L.b(ceVar2.f0 != 1);
                break;
            default:
                ce ceVar3 = this.b;
                gd gdVar = ceVar3.C2;
                if (gdVar != null) {
                    if (gdVar.getParent() != null) {
                        ((ViewGroup) ceVar3.C2.getParent()).removeView(ceVar3.C2);
                    }
                    ceVar3.C2 = null;
                }
                ceVar3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
