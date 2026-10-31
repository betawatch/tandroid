package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p00 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ uq b;

    public p00(uq uqVar) {
        this.b = uqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((z00) this.b.d).l0.e();
                break;
            default:
                uq uqVar = this.b;
                View view = uqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((z00) uqVar.d).b.removeView(view);
                break;
        }
    }

    public p00(uq uqVar, s4.n0 n0Var) {
        this.b = uqVar;
    }
}
