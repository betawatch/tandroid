package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class v70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w70 b;

    public /* synthetic */ v70(w70 w70Var, int i10) {
        this.a = i10;
        this.b = w70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w70 w70Var = this.b;
                w70Var.e.d0 = null;
                w70Var.requestLayout();
                break;
            default:
                w70 w70Var2 = this.b;
                w70Var2.e.d0 = null;
                w70Var2.a = false;
                break;
        }
    }
}
