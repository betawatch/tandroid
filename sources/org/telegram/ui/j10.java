package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
