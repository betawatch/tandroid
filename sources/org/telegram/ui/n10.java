package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class n10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yq b;

    public n10(yq yqVar) {
        this.b = yqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((x10) this.b.d).l0.unlock();
                break;
            default:
                yq yqVar = this.b;
                View view = yqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) yqVar.d).b.removeView(view);
                break;
        }
    }

    public n10(yq yqVar, s4.o0 o0Var) {
        this.b = yqVar;
    }
}
