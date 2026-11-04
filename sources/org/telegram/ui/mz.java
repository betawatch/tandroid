package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tp b;

    public mz(tp tpVar) {
        this.b = tpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((wz) this.b.d).m0.e();
                break;
            default:
                tp tpVar = this.b;
                View view = tpVar.b;
                view.setAlpha(1.0f);
                u4.o0.x0(view);
                ((wz) tpVar.d).b.removeView(view);
                break;
        }
    }

    public mz(tp tpVar, u4.o0 o0Var) {
        this.b = tpVar;
    }
}
