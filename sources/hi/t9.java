package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class t9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    public /* synthetic */ t9(ta taVar, int i7) {
        this.a = i7;
        this.b = taVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ta taVar = this.b;
                taVar.k2 = null;
                taVar.r.setTranslationY(0.0f);
                taVar.r.b(0.0f);
                break;
            case 1:
                ta taVar2 = this.b;
                taVar2.n.removeView(taVar2.N0);
                taVar2.N0 = null;
                taVar2.o2 = null;
                taVar2.q2 = null;
                taVar2.d1.M.b(taVar2.g0 != 1);
                break;
            default:
                ta taVar3 = this.b;
                ba baVar = taVar3.D2;
                if (baVar != null) {
                    if (baVar.getParent() != null) {
                        ((ViewGroup) taVar3.D2.getParent()).removeView(taVar3.D2);
                    }
                    taVar3.D2 = null;
                }
                taVar3.F2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
