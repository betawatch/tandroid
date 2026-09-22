package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ br b;

    public n10(br brVar) {
        this.b = brVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((x10) this.b.d).l0.unlock();
                break;
            default:
                br brVar = this.b;
                View view = brVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) brVar.d).b.removeView(view);
                break;
        }
    }

    public n10(br brVar, s4.o0 o0Var) {
        this.b = brVar;
    }
}
