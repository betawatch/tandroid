package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o50 b;

    public /* synthetic */ i40(o50 o50Var, int i9) {
        this.a = i9;
        this.b = o50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o50 o50Var = this.b;
                o50Var.R.setVisibility(4);
                o50Var.S.setVisibility(4);
                o50Var.Q.setVisibility(4);
                break;
            case 1:
                this.b.d0 = null;
                break;
            default:
                o50 o50Var2 = this.b;
                o50Var2.d1 = null;
                o50Var2.c1.setColor(o50Var2.P1 == 3 ? -1163700 : -12761513);
                o50Var2.b1.invalidate();
                break;
        }
    }
}
