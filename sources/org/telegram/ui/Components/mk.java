package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
