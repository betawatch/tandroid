package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ji extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ji(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                yi yiVar = (yi) this.d;
                yiVar.B0.setAlpha(0.0f);
                yiVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                mi miVar = yiVar.e0;
                qi qiVar = yiVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                miVar.getClass();
                miVar.a(qiVar, valueOf);
                yiVar.a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(yiVar.C0, o1.h.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new m7(this, 3));
                kVar.a(new ei.l4(3, this, (jh) this.c));
                yiVar.w1 = kVar;
                kVar.h();
                break;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((qm0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
            default:
                yh.s3 s3Var = (yh.s3) this.d;
                s3Var.U1();
                yh.e2 e2Var = s3Var.g0;
                int i10 = this.b;
                e2Var.setVisibility(i10 == 0 ? 0 : 8);
                s3Var.s0.setVisibility(i10 == 1 ? 0 : 8);
                s3Var.z0.setVisibility(i10 == 2 ? 0 : 8);
                s3Var.B0.setVisibility(i10 == 3 ? 0 : 8);
                s3Var.u2();
                s3Var.a1 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
