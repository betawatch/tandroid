package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d91 b;

    public /* synthetic */ b91(d91 d91Var, int i10) {
        this.a = i10;
        this.b = d91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d91 d91Var = this.b;
                d91Var.b.setVisibility(4);
                tf.g gVar = d91Var.b;
                gVar.F = false;
                tf.g gVar2 = d91Var.c;
                gVar2.F = true;
                gVar.u0 = 0;
                gVar2.u0 = 0;
                Window window = d91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                d91 d91Var2 = this.b;
                tf.g gVar3 = d91Var2.c;
                gVar3.setVisibility(4);
                tf.g gVar4 = d91Var2.b;
                gVar4.u0 = 0;
                gVar3.u0 = 0;
                gVar4.F = true;
                gVar3.F = false;
                if (gVar4 instanceof tf.q) {
                    gVar4.q0 = false;
                    gVar4.d();
                } else {
                    gVar4.q0 = true;
                    gVar4.x((gVar4.C0 * gVar4.c0.k) - tf.g.g1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = d91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                d91 d91Var3 = this.b;
                d91Var3.b.u0 = 0;
                d91Var3.e.setVisibility(8);
                break;
        }
    }
}
