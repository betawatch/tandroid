package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c30 c;

    public /* synthetic */ b30(c30 c30Var, boolean z10, int i7) {
        this.a = i7;
        this.c = c30Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                c30 c30Var = this.c;
                c30Var.x = f10;
                c30Var.e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                c30Var.e.setPadding(0, 0, 0, (int) (c30Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                c30 c30Var2 = this.c;
                c30Var2.F = f11;
                c30Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                c30Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, c30Var2.F));
                org.telegram.ui.nj njVar = c30Var2.f;
                if (njVar != null && (cnVar = njVar.a) != null && (b1Var = cnVar.a4) != null) {
                    b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                    c30Var2.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, c30Var2.F));
                }
                c30Var2.h.setAlpha(c30Var2.F);
                if (!z10) {
                    c30Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
