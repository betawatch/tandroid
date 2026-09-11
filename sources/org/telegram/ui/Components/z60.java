package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class z60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a70 b;

    public /* synthetic */ z60(a70 a70Var, int i10) {
        this.a = i10;
        this.b = a70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a70 a70Var = this.b;
                a70Var.e.d0 = null;
                a70Var.requestLayout();
                break;
            default:
                a70 a70Var2 = this.b;
                a70Var2.e.d0 = null;
                a70Var2.a = false;
                break;
        }
    }
}
