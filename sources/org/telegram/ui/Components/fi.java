package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class fi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fi(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                xi xiVar = (xi) this.d;
                xiVar.y0.setAlpha(0.0f);
                xiVar.y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.b);
                ii iiVar = xiVar.e0;
                pi piVar = xiVar.y0;
                Float valueOf = Float.valueOf(1.0f);
                iiVar.getClass();
                iiVar.a(piVar, valueOf);
                xiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(xiVar.z0, o1.h.n, 0.0f);
                kVar.u.a(0.75f);
                kVar.u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new ei.n4(3, this, (ih) this.c));
                xiVar.t1 = kVar;
                kVar.f();
                break;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((zl0) aVar.d).scrollBy(0, this.b - ((int[]) this.c)[0]);
                aVar.c = null;
                break;
            default:
                yh.y3 y3Var = (yh.y3) this.d;
                y3Var.T1();
                yh.i2 i2Var = y3Var.f0;
                int i10 = this.b;
                i2Var.setVisibility(i10 == 0 ? 0 : 8);
                y3Var.r0.setVisibility(i10 == 1 ? 0 : 8);
                y3Var.y0.setVisibility(i10 == 2 ? 0 : 8);
                y3Var.A0.setVisibility(i10 == 3 ? 0 : 8);
                y3Var.s2();
                y3Var.Z0 = null;
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
