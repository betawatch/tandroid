package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class jb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    public /* synthetic */ jb(lc lcVar, int i10) {
        this.a = i10;
        this.b = lcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                lc lcVar = this.b;
                lcVar.j2 = null;
                lcVar.r.setTranslationY(0.0f);
                lcVar.r.b(0.0f);
                break;
            case 1:
                lc lcVar2 = this.b;
                lcVar2.n.removeView(lcVar2.M0);
                lcVar2.M0 = null;
                lcVar2.n2 = null;
                lcVar2.p2 = null;
                lcVar2.c1.L.b(lcVar2.f0 != 1);
                break;
            default:
                lc lcVar3 = this.b;
                tb tbVar = lcVar3.C2;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) lcVar3.C2.getParent()).removeView(lcVar3.C2);
                    }
                    lcVar3.C2 = null;
                }
                lcVar3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
