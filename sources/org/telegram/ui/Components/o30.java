package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q30 b;

    public /* synthetic */ o30(q30 q30Var, int i10) {
        this.a = i10;
        this.b = q30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q30 q30Var = this.b;
                q30Var.f = null;
                if (!q30Var.H) {
                    ho hoVar = new ho(this, 22);
                    q30Var.h = hoVar;
                    org.telegram.messenger.i0.h3(hoVar, q30Var.n == 0 ? 10000L : 2000L);
                    break;
                }
                break;
            case 1:
                q30 q30Var2 = this.b;
                q30Var2.f = null;
                if (!q30Var2.H) {
                    ho hoVar2 = new ho(this, 23);
                    q30Var2.h = hoVar2;
                    org.telegram.messenger.i0.h3(hoVar2, q30Var2.E);
                    break;
                }
                break;
            default:
                q30 q30Var3 = this.b;
                q30Var3.setVisibility(4);
                q30Var3.getClass();
                q30Var3.e = null;
                q30Var3.d = null;
                q30Var3.f = null;
                break;
        }
    }
}
