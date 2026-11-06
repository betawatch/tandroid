package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class oz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vp b;

    public oz(vp vpVar) {
        this.b = vpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((yz) this.b.d).l0.e();
                break;
            default:
                vp vpVar = this.b;
                View view = vpVar.b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((yz) vpVar.d).b.removeView(view);
                break;
        }
    }

    public oz(vp vpVar, v4.n0 n0Var) {
        this.b = vpVar;
    }
}
