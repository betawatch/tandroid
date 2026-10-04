package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class ib extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ ib(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kc kcVar = this.b;
                kcVar.j2 = null;
                kcVar.r.setTranslationY(0.0f);
                kcVar.r.b(0.0f);
                break;
            case 1:
                kc kcVar2 = this.b;
                kcVar2.n.removeView(kcVar2.M0);
                kcVar2.M0 = null;
                kcVar2.n2 = null;
                kcVar2.p2 = null;
                kcVar2.c1.L.b(kcVar2.f0 != 1);
                break;
            default:
                kc kcVar3 = this.b;
                sb sbVar = kcVar3.C2;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) kcVar3.C2.getParent()).removeView(kcVar3.C2);
                    }
                    kcVar3.C2 = null;
                }
                kcVar3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
