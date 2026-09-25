package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class hi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hi(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wi wiVar = (wi) this.d;
                wiVar.y0.setAlpha(0.0f);
                wiVar.y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                ki kiVar = wiVar.e0;
                oi oiVar = wiVar.y0;
                Float valueOf = Float.valueOf(1.0f);
                kiVar.getClass();
                kiVar.getClass();
                kiVar.b(oiVar, valueOf.floatValue());
                wiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(wiVar.z0, o1.h.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new ei.m4(3, this, (hh) this.c));
                wiVar.t1 = kVar;
                kVar.f();
                break;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((wl0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                x3Var.T1();
                yh.h2 h2Var = x3Var.f0;
                int i10 = this.b;
                h2Var.setVisibility(i10 == 0 ? 0 : 8);
                x3Var.r0.setVisibility(i10 == 1 ? 0 : 8);
                x3Var.y0.setVisibility(i10 == 2 ? 0 : 8);
                x3Var.A0.setVisibility(i10 == 3 ? 0 : 8);
                x3Var.s2();
                x3Var.Z0 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
