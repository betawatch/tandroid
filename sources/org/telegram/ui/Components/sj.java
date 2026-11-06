package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.vp b;

    public sj(org.telegram.ui.vp vpVar) {
        this.b = vpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((uj) this.b.d).U.e();
                break;
            default:
                org.telegram.ui.vp vpVar = this.b;
                View view = vpVar.b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((uj) vpVar.d).X.r.removeView(view);
                break;
        }
    }

    public sj(org.telegram.ui.vp vpVar, v4.n0 n0Var) {
        this.b = vpVar;
    }
}
