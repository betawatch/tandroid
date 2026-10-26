package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class pa extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ pa(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                sb sbVar = this.b;
                sbVar.j2 = null;
                sbVar.r.setTranslationY(0.0f);
                sbVar.r.b(0.0f);
                break;
            case 1:
                sb sbVar2 = this.b;
                sbVar2.n.removeView(sbVar2.M0);
                sbVar2.M0 = null;
                sbVar2.n2 = null;
                sbVar2.p2 = null;
                sbVar2.c1.L.b(sbVar2.f0 != 1);
                break;
            default:
                sb sbVar3 = this.b;
                ab abVar = sbVar3.C2;
                if (abVar != null) {
                    if (abVar.getParent() != null) {
                        ((ViewGroup) sbVar3.C2.getParent()).removeView(sbVar3.C2);
                    }
                    sbVar3.C2 = null;
                }
                sbVar3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
