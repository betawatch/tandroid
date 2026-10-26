package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ q50(o60 o60Var, int i10) {
        this.a = i10;
        this.b = o60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o60 o60Var = this.b;
                if (animator.equals(o60Var.L)) {
                    o60Var.L = null;
                    break;
                }
                break;
            case 1:
                o60 o60Var2 = this.b;
                if (o60Var2.l1 != null) {
                    o60Var2.l1 = null;
                    break;
                }
                break;
            default:
                o60 o60Var3 = this.b;
                if (animator.equals(o60Var3.e0)) {
                    o60Var3.c(true);
                    o60Var3.g1 = false;
                    o60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
