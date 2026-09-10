package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                yiVar.y0.setAlpha(0.0f);
                yiVar.y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                mi miVar = yiVar.e0;
                qi qiVar = yiVar.y0;
                Float valueOf = Float.valueOf(1.0f);
                miVar.getClass();
                miVar.getClass();
                miVar.b(qiVar, valueOf.floatValue());
                yiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(yiVar.z0, o1.h.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new di.q4(3, this, (jh) this.c));
                yiVar.t1 = kVar;
                kVar.f();
                break;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((vl0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
            default:
                xh.x3 x3Var = (xh.x3) this.d;
                x3Var.T1();
                xh.i2 i2Var = x3Var.f0;
                int i10 = this.b;
                i2Var.setVisibility(i10 == 0 ? 0 : 8);
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
