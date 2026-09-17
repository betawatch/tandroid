package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
