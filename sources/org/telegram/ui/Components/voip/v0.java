package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class v0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z0 b;

    public /* synthetic */ v0(z0 z0Var, int i7) {
        this.a = i7;
        this.b = z0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                z0 z0Var = this.b;
                if (z0Var.getParent() != null) {
                    ((ViewGroup) z0Var.getParent()).removeView(z0Var);
                    break;
                }
                break;
            case 1:
                z0 z0Var2 = this.b;
                if (z0Var2.getParent() != null) {
                    ((ViewGroup) z0Var2.getParent()).removeView(z0Var2);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                z0 z0Var3 = this.b;
                if (z0Var3.getParent() != null) {
                    ((ViewGroup) z0Var3.getParent()).removeView(z0Var3);
                    break;
                }
                break;
        }
    }
}
