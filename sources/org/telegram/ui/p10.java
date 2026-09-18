package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ br b;

    public p10(br brVar) {
        this.b = brVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((z10) this.b.d).l0.unlock();
                break;
            default:
                br brVar = this.b;
                View view = brVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((z10) brVar.d).b.removeView(view);
                break;
        }
    }

    public p10(br brVar, s4.o0 o0Var) {
        this.b = brVar;
    }
}
