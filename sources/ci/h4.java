package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b8.kg;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h4(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i3;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.d;
                l6Var.P1();
                p4 p4Var = l6Var.Z1;
                int i3 = this.b;
                p4Var.setVisibility(i3 == 0 ? 0 : 8);
                l6Var.l2.setVisibility(i3 == 1 ? 0 : 8);
                l6Var.u2.setVisibility(i3 == 2 ? 0 : 8);
                l6Var.w2.setVisibility(i3 == 3 ? 0 : 8);
                l6Var.u2();
                l6Var.V2 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                bi biVar = (bi) this.d;
                biVar.t2.setAlpha(0.0f);
                biVar.t2.setTranslationY(org.telegram.messenger.g0.L(78.0f) + this.b);
                lh lhVar = biVar.W1;
                th thVar = biVar.t2;
                Float valueOf = Float.valueOf(1.0f);
                lhVar.getClass();
                lhVar.a(thVar, valueOf);
                biVar.S2.setAlpha(0.0f);
                q1.g gVar = new q1.g((Object) biVar.u2, (q1.e) q1.g.p, 0.0f);
                gVar.m.a(0.75f);
                gVar.m.b(500.0f);
                gVar.b(new org.telegram.ui.Components.c7(this, 3));
                gVar.a(new ii.z3(3, this, (ng) this.c));
                biVar.o3 = gVar;
                gVar.h();
                break;
            default:
                kg kgVar = (kg) this.d;
                ((tj0) kgVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                kgVar.c = null;
                break;
        }
    }
}
