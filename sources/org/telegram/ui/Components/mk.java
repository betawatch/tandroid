package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.fr b;

    public mk(org.telegram.ui.fr frVar) {
        this.b = frVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ok) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.fr frVar = this.b;
                View view = frVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((ok) frVar.d).X.r.removeView(view);
                break;
        }
    }

    public mk(org.telegram.ui.fr frVar, s4.n0 n0Var) {
        this.b = frVar;
    }
}
