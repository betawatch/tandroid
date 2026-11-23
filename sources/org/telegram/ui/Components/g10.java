package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i10 b;

    public /* synthetic */ g10(i10 i10Var, int i7) {
        this.a = i7;
        this.b = i10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i10 i10Var = this.b;
                org.telegram.messenger.ls.f(i10Var.r.a).j(i10Var.f);
                i10Var.requestLayout();
                break;
            default:
                i10 i10Var2 = this.b;
                i10Var2.d = null;
                i10Var2.a = null;
                i10Var2.b = false;
                break;
        }
    }
}
