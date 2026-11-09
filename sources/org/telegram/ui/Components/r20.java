package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s20 c;

    public /* synthetic */ r20(s20 s20Var, boolean z9, int i7) {
        this.a = i7;
        this.c = s20Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.dn dnVar;
        bi.q1 q1Var;
        switch (this.a) {
            case 0:
                float f10 = this.b ? 1.0f : 0.0f;
                s20 s20Var = this.c;
                s20Var.x = f10;
                s20Var.e.setTranslationY(f10 * org.telegram.messenger.g0.L(48.0f));
                s20Var.e.setPadding(0, 0, 0, (int) (s20Var.x * org.telegram.messenger.g0.L(48.0f)));
                break;
            default:
                boolean z9 = this.b;
                float f11 = z9 ? 1.0f : 0.0f;
                s20 s20Var2 = this.c;
                s20Var2.E = f11;
                s20Var2.n.setScaleX(org.telegram.messenger.g0.T1(0.95f, 1.0f, f11));
                s20Var2.n.setScaleY(org.telegram.messenger.g0.T1(0.95f, 1.0f, s20Var2.E));
                org.telegram.ui.oj ojVar = s20Var2.f;
                if (ojVar != null && (dnVar = ojVar.a) != null && (q1Var = dnVar.Z3) != null) {
                    q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, s20Var2.E));
                    s20Var2.f.a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, s20Var2.E));
                }
                s20Var2.h.setAlpha(s20Var2.E);
                if (!z9) {
                    s20Var2.h.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
