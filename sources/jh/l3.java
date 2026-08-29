package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l3(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h5 h5Var = (h5) this.d;
                h5Var.T1();
                q3 q3Var = h5Var.b0;
                int i10 = this.b;
                q3Var.setVisibility(i10 == 0 ? 0 : 8);
                h5Var.n0.setVisibility(i10 == 1 ? 0 : 8);
                h5Var.u0.setVisibility(i10 == 2 ? 0 : 8);
                h5Var.w0.setVisibility(i10 == 3 ? 0 : 8);
                h5Var.s2();
                h5Var.V0 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ni niVar = (ni) this.d;
                niVar.u0.setAlpha(0.0f);
                niVar.u0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                bi biVar = niVar.a0;
                fi fiVar = niVar.u0;
                Float valueOf = Float.valueOf(1.0f);
                biVar.getClass();
                biVar.getClass();
                biVar.b(fiVar, valueOf.floatValue());
                niVar.T0.setAlpha(0.0f);
                o1.k kVar = new o1.k(niVar.v0, o1.i.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new org.telegram.ui.Components.j7(this, 3));
                kVar.a(new pb(2, this, (zg) this.c));
                niVar.p1 = kVar;
                kVar.f();
                break;
            default:
                ag.j2 j2Var = (ag.j2) this.d;
                ((jl0) j2Var.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                j2Var.c = null;
                break;
        }
    }
}
