package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r40 b;

    public /* synthetic */ v30(r40 r40Var, int i7) {
        this.a = i7;
        this.b = r40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r40 r40Var = this.b;
                if (animator.equals(r40Var.L)) {
                    r40Var.L = null;
                    break;
                }
                break;
            case 1:
                r40 r40Var2 = this.b;
                if (r40Var2.l1 != null) {
                    r40Var2.l1 = null;
                    break;
                }
                break;
            default:
                r40 r40Var3 = this.b;
                if (animator.equals(r40Var3.e0)) {
                    r40Var3.d(true);
                    r40Var3.g1 = false;
                    r40Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
