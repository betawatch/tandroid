package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class mb extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ mb(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pc pcVar = this.b;
                pcVar.j2 = null;
                pcVar.r.setTranslationY(0.0f);
                pcVar.r.b(0.0f);
                break;
            case 1:
                pc pcVar2 = this.b;
                pcVar2.n.removeView(pcVar2.M0);
                pcVar2.M0 = null;
                pcVar2.n2 = null;
                pcVar2.p2 = null;
                pcVar2.c1.L.b(pcVar2.f0 != 1);
                break;
            default:
                pc pcVar3 = this.b;
                xb xbVar = pcVar3.C2;
                if (xbVar != null) {
                    if (xbVar.getParent() != null) {
                        ((ViewGroup) pcVar3.C2.getParent()).removeView(pcVar3.C2);
                    }
                    pcVar3.C2 = null;
                }
                pcVar3.E2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
