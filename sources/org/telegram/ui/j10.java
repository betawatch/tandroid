package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class j10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wq b;

    public j10(wq wqVar) {
        this.b = wqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((t10) this.b.d).l0.unlock();
                break;
            default:
                wq wqVar = this.b;
                View view = wqVar.b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((t10) wqVar.d).b.removeView(view);
                break;
        }
    }

    public j10(wq wqVar, s4.o0 o0Var) {
        this.b = wqVar;
    }
}
