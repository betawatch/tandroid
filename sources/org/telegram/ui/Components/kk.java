package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class kk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.qq b;

    public kk(org.telegram.ui.qq qqVar) {
        this.b = qqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((mk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.qq qqVar = this.b;
                View view = qqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((mk) qqVar.d).X.r.removeView(view);
                break;
        }
    }

    public kk(org.telegram.ui.qq qqVar, s4.n0 n0Var) {
        this.b = qqVar;
    }
}
