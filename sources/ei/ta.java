package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class ta extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    public /* synthetic */ ta(vb vbVar, int i10) {
        this.a = i10;
        this.b = vbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vb vbVar = this.b;
                vbVar.j2 = null;
                vbVar.r.setTranslationY(0.0f);
                vbVar.r.b(0.0f);
                break;
            case 1:
                vb vbVar2 = this.b;
                vbVar2.n.removeView(vbVar2.M0);
                vbVar2.M0 = null;
                vbVar2.n2 = null;
                vbVar2.p2 = null;
                vbVar2.c1.L.b(vbVar2.f0 != 1);
                break;
            default:
                vb vbVar3 = this.b;
                db dbVar = vbVar3.C2;
                if (dbVar != null) {
                    if (dbVar.getParent() != null) {
                        ((ViewGroup) vbVar3.C2.getParent()).removeView(vbVar3.C2);
                    }
                    vbVar3.C2 = null;
                }
                vbVar3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
