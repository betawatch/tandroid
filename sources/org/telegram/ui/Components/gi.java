package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gi(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vi viVar = (vi) this.d;
                viVar.y0.setAlpha(0.0f);
                viVar.y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                ji jiVar = viVar.e0;
                ni niVar = viVar.y0;
                Float valueOf = Float.valueOf(1.0f);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(viVar.z0, o1.h.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new i7(this, 3));
                kVar.a(new ei.m4(3, this, (fh) this.c));
                viVar.t1 = kVar;
                kVar.f();
                break;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((ml0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
            default:
                yh.a4 a4Var = (yh.a4) this.d;
                a4Var.T1();
                yh.k2 k2Var = a4Var.f0;
                int i10 = this.b;
                k2Var.setVisibility(i10 == 0 ? 0 : 8);
                a4Var.r0.setVisibility(i10 == 1 ? 0 : 8);
                a4Var.y0.setVisibility(i10 == 2 ? 0 : 8);
                a4Var.A0.setVisibility(i10 == 3 ? 0 : 8);
                a4Var.s2();
                a4Var.Z0 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
