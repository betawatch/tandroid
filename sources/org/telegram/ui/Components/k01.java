package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t01 b;

    public /* synthetic */ k01(t01 t01Var, int i7) {
        this.a = i7;
        this.b = t01Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t01 t01Var = this.b;
                if (t01Var.T == animator) {
                    t01Var.T = null;
                    break;
                }
                break;
            case 1:
                t01 t01Var2 = this.b;
                if (t01Var2.f0 == animator) {
                    t01Var2.f0 = null;
                }
                t01Var2.b(1.0f);
                break;
            default:
                t01 t01Var3 = this.b;
                if (t01Var3.J == animator) {
                    t01Var3.J = null;
                    break;
                }
                break;
        }
    }
}
