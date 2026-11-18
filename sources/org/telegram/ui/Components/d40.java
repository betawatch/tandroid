package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z40 b;

    public /* synthetic */ d40(z40 z40Var, int i7) {
        this.a = i7;
        this.b = z40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z40 z40Var = this.b;
                if (animator.equals(z40Var.L)) {
                    z40Var.L = null;
                    break;
                }
                break;
            case 1:
                z40 z40Var2 = this.b;
                if (z40Var2.l1 != null) {
                    z40Var2.l1 = null;
                    break;
                }
                break;
            default:
                z40 z40Var3 = this.b;
                if (animator.equals(z40Var3.e0)) {
                    z40Var3.d(true);
                    z40Var3.g1 = false;
                    z40Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
