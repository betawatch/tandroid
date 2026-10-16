package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                viVar.B0.setAlpha(0.0f);
                viVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                ji jiVar = viVar.e0;
                ni niVar = viVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(viVar.C0, o1.h.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new n7(this, 3));
                kVar.a(new fi.m4(3, this, (hh) this.c));
                viVar.w1 = kVar;
                kVar.h();
                break;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((mm0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
            default:
                zh.r3 r3Var = (zh.r3) this.d;
                r3Var.U1();
                zh.d2 d2Var = r3Var.g0;
                int i10 = this.b;
                d2Var.setVisibility(i10 == 0 ? 0 : 8);
                r3Var.s0.setVisibility(i10 == 1 ? 0 : 8);
                r3Var.z0.setVisibility(i10 == 2 ? 0 : 8);
                r3Var.B0.setVisibility(i10 == 3 ? 0 : 8);
                r3Var.u2();
                r3Var.a1 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
