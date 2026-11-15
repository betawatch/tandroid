package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ u20 c;

    public /* synthetic */ t20(u20 u20Var, boolean z10, int i7) {
        this.a = i7;
        this.c = u20Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.bn bnVar;
        di.c1 c1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                u20 u20Var = this.c;
                u20Var.x = f10;
                u20Var.e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                u20Var.e.setPadding(0, 0, 0, (int) (u20Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                u20 u20Var2 = this.c;
                u20Var2.F = f11;
                u20Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                u20Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, u20Var2.F));
                org.telegram.ui.mj mjVar = u20Var2.f;
                if (mjVar != null && (bnVar = mjVar.a) != null && (c1Var = bnVar.a4) != null) {
                    c1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                    u20Var2.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, u20Var2.F));
                }
                u20Var2.h.setAlpha(u20Var2.F);
                if (!z10) {
                    u20Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
