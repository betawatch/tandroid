package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.vh;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class y4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y4(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.d;
                k7Var.P1();
                h5 h5Var = k7Var.Y1;
                int i7 = this.b;
                h5Var.setVisibility(i7 == 0 ? 0 : 8);
                k7Var.k2.setVisibility(i7 == 1 ? 0 : 8);
                k7Var.t2.setVisibility(i7 == 2 ? 0 : 8);
                k7Var.v2.setVisibility(i7 == 3 ? 0 : 8);
                k7Var.u2();
                k7Var.U2 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                di diVar = (di) this.d;
                diVar.s2.setAlpha(0.0f);
                diVar.s2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.b);
                oh ohVar = diVar.V1;
                vh vhVar = diVar.s2;
                Float valueOf = Float.valueOf(1.0f);
                ohVar.getClass();
                ohVar.a(vhVar, valueOf);
                diVar.R2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) diVar.t2, (r1.e) r1.g.p, 0.0f);
                gVar.m.a(0.75f);
                gVar.m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.e7(this, 3));
                gVar.a(new hi.y3(3, this, (qg) this.c));
                diVar.n3 = gVar;
                gVar.h();
                break;
            default:
                a8.wa waVar = (a8.wa) this.d;
                ((pj0) waVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                waVar.c = null;
                break;
        }
    }
}
