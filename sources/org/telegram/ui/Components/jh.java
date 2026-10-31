package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jh(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bi biVar = (bi) this.d;
                biVar.s2.setAlpha(0.0f);
                biVar.s2.setTranslationY(org.telegram.messenger.i0.L(78.0f) + this.b);
                mh mhVar = biVar.V1;
                uh uhVar = biVar.s2;
                Float valueOf = Float.valueOf(1.0f);
                mhVar.getClass();
                mhVar.a(uhVar, valueOf);
                biVar.R2.setAlpha(0.0f);
                o1.j jVar = new o1.j((Object) biVar.t2, (o1.h) o1.j.p, 0.0f);
                jVar.m.a(0.75f);
                jVar.m.b(500.0f);
                jVar.b(new a7(this, 3));
                jVar.a(new za(2, this, (mg) this.c));
                biVar.n3 = jVar;
                jVar.h();
                break;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((tk0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
            default:
                rh.e4 e4Var = (rh.e4) this.d;
                e4Var.P1();
                rh.m2 m2Var = e4Var.Y1;
                int i10 = this.b;
                m2Var.setVisibility(i10 == 0 ? 0 : 8);
                e4Var.k2.setVisibility(i10 == 1 ? 0 : 8);
                e4Var.t2.setVisibility(i10 == 2 ? 0 : 8);
                e4Var.v2.setVisibility(i10 == 3 ? 0 : 8);
                e4Var.u2();
                e4Var.U2 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
