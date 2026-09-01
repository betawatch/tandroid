package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class k3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k3(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.d;
                g5Var.T1();
                p3 p3Var = g5Var.c0;
                int i10 = this.b;
                p3Var.setVisibility(i10 == 0 ? 0 : 8);
                g5Var.o0.setVisibility(i10 == 1 ? 0 : 8);
                g5Var.v0.setVisibility(i10 == 2 ? 0 : 8);
                g5Var.x0.setVisibility(i10 == 3 ? 0 : 8);
                g5Var.s2();
                g5Var.W0 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                mi miVar = (mi) this.d;
                miVar.v0.setAlpha(0.0f);
                miVar.v0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                yh yhVar = miVar.b0;
                ei eiVar = miVar.v0;
                Float valueOf = Float.valueOf(1.0f);
                yhVar.getClass();
                yhVar.getClass();
                yhVar.b(eiVar, valueOf.floatValue());
                miVar.U0.setAlpha(0.0f);
                o1.j jVar = new o1.j(miVar.w0, o1.h.n, 0.0f);
                jVar.u.a(0.75f);
                jVar.u.b(500.0f);
                jVar.b(new org.telegram.ui.Components.f7(this, 3));
                jVar.a(new lb(2, this, (wg) this.c));
                miVar.q1 = jVar;
                jVar.f();
                break;
            default:
                b4.e0 e0Var = (b4.e0) this.d;
                ((tl0) e0Var.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                e0Var.c = null;
                break;
        }
    }
}
