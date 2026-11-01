package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ uq b;

    public o00(uq uqVar) {
        this.b = uqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((y00) this.b.d).l0.e();
                break;
            default:
                uq uqVar = this.b;
                View view = uqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((y00) uqVar.d).b.removeView(view);
                break;
        }
    }

    public o00(uq uqVar, s4.n0 n0Var) {
        this.b = uqVar;
    }
}
