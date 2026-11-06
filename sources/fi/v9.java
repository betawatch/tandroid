package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ v9(va vaVar, int i7) {
        this.a = i7;
        this.b = vaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                va vaVar = this.b;
                vaVar.j2 = null;
                vaVar.r.setTranslationY(0.0f);
                vaVar.r.b(0.0f);
                break;
            case 1:
                va vaVar2 = this.b;
                vaVar2.n.removeView(vaVar2.M0);
                vaVar2.M0 = null;
                vaVar2.n2 = null;
                vaVar2.p2 = null;
                vaVar2.c1.L.b(vaVar2.f0 != 1);
                break;
            default:
                va vaVar3 = this.b;
                da daVar = vaVar3.C2;
                if (daVar != null) {
                    if (daVar.getParent() != null) {
                        ((ViewGroup) vaVar3.C2.getParent()).removeView(vaVar3.C2);
                    }
                    vaVar3.C2 = null;
                }
                vaVar3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
