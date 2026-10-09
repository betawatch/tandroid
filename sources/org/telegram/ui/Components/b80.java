package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b80 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c80 b;

    public /* synthetic */ b80(c80 c80Var, int i10) {
        this.a = i10;
        this.b = c80Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c80 c80Var = this.b;
                c80Var.e.d0 = null;
                c80Var.requestLayout();
                break;
            default:
                c80 c80Var2 = this.b;
                c80Var2.e.d0 = null;
                c80Var2.a = false;
                break;
        }
    }
}
