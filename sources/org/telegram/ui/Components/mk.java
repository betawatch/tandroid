package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class mk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.wq b;

    public mk(org.telegram.ui.wq wqVar) {
        this.b = wqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ok) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.wq wqVar = this.b;
                View view = wqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((ok) wqVar.d).X.r.removeView(view);
                break;
        }
    }

    public mk(org.telegram.ui.wq wqVar, s4.o0 o0Var) {
        this.b = wqVar;
    }
}
