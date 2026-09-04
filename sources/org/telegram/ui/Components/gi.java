package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                jiVar.getClass();
                jiVar.b(niVar, valueOf.floatValue());
                viVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(viVar.z0, o1.h.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new l7(this, 3));
                kVar.a(new fi.n4(3, this, (hh) this.c));
                viVar.t1 = kVar;
                kVar.f();
                break;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((ll0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
            default:
                zh.w3 w3Var = (zh.w3) this.d;
                w3Var.T1();
                zh.h2 h2Var = w3Var.f0;
                int i10 = this.b;
                h2Var.setVisibility(i10 == 0 ? 0 : 8);
                w3Var.r0.setVisibility(i10 == 1 ? 0 : 8);
                w3Var.y0.setVisibility(i10 == 2 ? 0 : 8);
                w3Var.A0.setVisibility(i10 == 3 ? 0 : 8);
                w3Var.s2();
                w3Var.Z0 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
