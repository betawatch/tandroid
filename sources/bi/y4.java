package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uh;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                k7Var.O1();
                h5 h5Var = k7Var.b2;
                int i7 = this.b;
                h5Var.setVisibility(i7 == 0 ? 0 : 8);
                k7Var.n2.setVisibility(i7 == 1 ? 0 : 8);
                k7Var.w2.setVisibility(i7 == 2 ? 0 : 8);
                k7Var.y2.setVisibility(i7 == 3 ? 0 : 8);
                k7Var.u2();
                k7Var.X2 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ci ciVar = (ci) this.d;
                ciVar.v2.setAlpha(0.0f);
                ciVar.v2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.b);
                nh nhVar = ciVar.Y1;
                uh uhVar = ciVar.v2;
                Float valueOf = Float.valueOf(1.0f);
                nhVar.getClass();
                nhVar.a(uhVar, valueOf);
                ciVar.U2.setAlpha(0.0f);
                r1.g gVar = new r1.g((Object) ciVar.w2, (r1.e) r1.g.p, 0.0f);
                gVar.m.a(0.75f);
                gVar.m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.d7(this, 3));
                gVar.a(new hi.y3(3, this, (pg) this.c));
                ciVar.q3 = gVar;
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
