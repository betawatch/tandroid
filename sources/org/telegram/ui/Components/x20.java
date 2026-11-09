package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z20 b;

    public /* synthetic */ x20(z20 z20Var, int i7) {
        this.a = i7;
        this.b = z20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z20 z20Var = this.b;
                z20Var.d = null;
                gp gpVar = new gp(this, 20);
                z20Var.e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, z20Var.w);
                break;
            default:
                z20 z20Var2 = this.b;
                z20Var2.setVisibility(4);
                z20Var2.c = null;
                z20Var2.d = null;
                break;
        }
    }
}
