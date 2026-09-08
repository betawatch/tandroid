package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class lk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.cr b;

    public lk(org.telegram.ui.cr crVar) {
        this.b = crVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((nk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.cr crVar = this.b;
                View view = crVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((nk) crVar.d).X.r.removeView(view);
                break;
        }
    }

    public lk(org.telegram.ui.cr crVar, s4.o0 o0Var) {
        this.b = crVar;
    }
}
