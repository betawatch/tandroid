package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ n20 c;

    public /* synthetic */ m20(n20 n20Var, boolean z10, int i3) {
        this.a = i3;
        this.c = n20Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.xm xmVar;
        ci.j1 j1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                n20 n20Var = this.c;
                n20Var.x = f10;
                n20Var.e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                n20Var.e.setPadding(0, 0, 0, (int) (n20Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                n20 n20Var2 = this.c;
                n20Var2.F = f11;
                n20Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                n20Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, n20Var2.F));
                org.telegram.ui.ij ijVar = n20Var2.f;
                if (ijVar != null && (xmVar = ijVar.a) != null && (j1Var = xmVar.a4) != null) {
                    j1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, n20Var2.F));
                    n20Var2.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, n20Var2.F));
                }
                n20Var2.h.setAlpha(n20Var2.F);
                if (!z10) {
                    n20Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
