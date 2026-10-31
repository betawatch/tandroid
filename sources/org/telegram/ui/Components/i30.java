package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j30 c;

    public /* synthetic */ i30(j30 j30Var, boolean z10, int i10) {
        this.a = i10;
        this.c = j30Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.vn vnVar;
        ag.b1 b1Var;
        switch (this.a) {
            case 0:
                float f7 = this.b ? 1.0f : 0.0f;
                j30 j30Var = this.c;
                j30Var.x = f7;
                j30Var.e.setTranslationY(f7 * org.telegram.messenger.i0.L(48.0f));
                j30Var.e.setPadding(0, 0, 0, (int) (j30Var.x * org.telegram.messenger.i0.L(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                j30 j30Var2 = this.c;
                j30Var2.E = f10;
                j30Var2.n.setScaleX(org.telegram.messenger.i0.T1(0.95f, 1.0f, f10));
                j30Var2.n.setScaleY(org.telegram.messenger.i0.T1(0.95f, 1.0f, j30Var2.E));
                org.telegram.ui.ik ikVar = j30Var2.f;
                if (ikVar != null && (vnVar = ikVar.a) != null && (b1Var = vnVar.Z3) != null) {
                    b1Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.95f, j30Var2.E));
                    j30Var2.f.a.Z3.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.95f, j30Var2.E));
                }
                j30Var2.h.setAlpha(j30Var2.E);
                if (!z10) {
                    j30Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
