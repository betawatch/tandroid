package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class mb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ mb(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                oc ocVar = this.b;
                ocVar.j2 = null;
                ocVar.r.setTranslationY(0.0f);
                ocVar.r.b(0.0f);
                break;
            case 1:
                oc ocVar2 = this.b;
                ocVar2.n.removeView(ocVar2.M0);
                ocVar2.M0 = null;
                ocVar2.n2 = null;
                ocVar2.p2 = null;
                ocVar2.c1.L.b(ocVar2.f0 != 1);
                break;
            default:
                oc ocVar3 = this.b;
                wb wbVar = ocVar3.C2;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) ocVar3.C2.getParent()).removeView(ocVar3.C2);
                    }
                    ocVar3.C2 = null;
                }
                ocVar3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
