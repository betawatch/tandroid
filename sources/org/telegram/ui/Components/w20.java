package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y20 b;

    public /* synthetic */ w20(y20 y20Var, int i7) {
        this.a = i7;
        this.b = y20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y20 y20Var = this.b;
                y20Var.d = null;
                gp gpVar = new gp(this, 20);
                y20Var.e = gpVar;
                org.telegram.messenger.g0.i3(gpVar, y20Var.w);
                break;
            default:
                y20 y20Var2 = this.b;
                y20Var2.setVisibility(4);
                y20Var2.c = null;
                y20Var2.d = null;
                break;
        }
    }
}
