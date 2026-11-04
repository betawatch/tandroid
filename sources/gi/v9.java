package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ v9(va vaVar, int i3) {
        this.a = i3;
        this.b = vaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                va vaVar = this.b;
                vaVar.k2 = null;
                vaVar.r.setTranslationY(0.0f);
                vaVar.r.b(0.0f);
                break;
            case 1:
                va vaVar2 = this.b;
                vaVar2.n.removeView(vaVar2.N0);
                vaVar2.N0 = null;
                vaVar2.o2 = null;
                vaVar2.q2 = null;
                vaVar2.d1.M.b(vaVar2.g0 != 1);
                break;
            default:
                va vaVar3 = this.b;
                da daVar = vaVar3.D2;
                if (daVar != null) {
                    if (daVar.getParent() != null) {
                        ((ViewGroup) vaVar3.D2.getParent()).removeView(vaVar3.D2);
                    }
                    vaVar3.D2 = null;
                }
                vaVar3.F2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
