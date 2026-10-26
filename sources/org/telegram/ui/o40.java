package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ o40(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v50 v50Var = this.b;
                v50Var.V.setVisibility(4);
                v50Var.W.setVisibility(4);
                v50Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                v50 v50Var2 = this.b;
                v50Var2.h1 = null;
                v50Var2.g1.setColor(v50Var2.T1 == 3 ? -1163700 : -12761513);
                v50Var2.f1.invalidate();
                break;
        }
    }
}
