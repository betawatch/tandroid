package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class n10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ cr b;

    public n10(cr crVar) {
        this.b = crVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((x10) this.b.d).l0.unlock();
                break;
            default:
                cr crVar = this.b;
                View view = crVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) crVar.d).b.removeView(view);
                break;
        }
    }

    public n10(cr crVar, s4.o0 o0Var) {
        this.b = crVar;
    }
}
