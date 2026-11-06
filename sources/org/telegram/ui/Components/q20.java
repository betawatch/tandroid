package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r20 c;

    public /* synthetic */ q20(r20 r20Var, boolean z9, int i7) {
        this.a = i7;
        this.c = r20Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.bn bnVar;
        bi.q1 q1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                r20 r20Var = this.c;
                r20Var.x = f10;
                r20Var.e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                r20Var.e.setPadding(0, 0, 0, (int) (r20Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                boolean z9 = this.b;
                float f11 = z9 ? 1.0f : 0.0f;
                r20 r20Var2 = this.c;
                r20Var2.E = f11;
                r20Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                r20Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, r20Var2.E));
                org.telegram.ui.mj mjVar = r20Var2.f;
                if (mjVar != null && (bnVar = mjVar.a) != null && (q1Var = bnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                    r20Var2.f.a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, r20Var2.E));
                }
                r20Var2.h.setAlpha(r20Var2.E);
                if (!z9) {
                    r20Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
