package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class nk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.wq b;

    public nk(org.telegram.ui.wq wqVar) {
        this.b = wqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((pk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.wq wqVar = this.b;
                View view = wqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((pk) wqVar.d).X.r.removeView(view);
                break;
        }
    }

    public nk(org.telegram.ui.wq wqVar, s4.o0 o0Var) {
        this.b = wqVar;
    }
}
