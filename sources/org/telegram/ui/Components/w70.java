package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class w70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x70 b;

    public /* synthetic */ w70(x70 x70Var, int i10) {
        this.a = i10;
        this.b = x70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x70 x70Var = this.b;
                x70Var.e.d0 = null;
                x70Var.requestLayout();
                break;
            default:
                x70 x70Var2 = this.b;
                x70Var2.e.d0 = null;
                x70Var2.a = false;
                break;
        }
    }
}
