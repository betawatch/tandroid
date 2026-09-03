package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d70 b;

    public /* synthetic */ c70(d70 d70Var, int i10) {
        this.a = i10;
        this.b = d70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d70 d70Var = this.b;
                d70Var.e.a0 = null;
                d70Var.requestLayout();
                break;
            default:
                d70 d70Var2 = this.b;
                d70Var2.e.a0 = null;
                d70Var2.a = false;
                break;
        }
    }
}
