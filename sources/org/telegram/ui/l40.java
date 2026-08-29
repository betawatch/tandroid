package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ l40(r50 r50Var, int i10) {
        this.a = i10;
        this.b = r50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r50 r50Var = this.b;
                r50Var.R.setVisibility(4);
                r50Var.S.setVisibility(4);
                r50Var.Q.setVisibility(4);
                break;
            case 1:
                this.b.d0 = null;
                break;
            default:
                r50 r50Var2 = this.b;
                r50Var2.d1 = null;
                r50Var2.c1.setColor(r50Var2.P1 == 3 ? -1163700 : -12761513);
                r50Var2.b1.invalidate();
                break;
        }
    }
}
