package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                ((t10) this.b.d).i0.unlock();
                break;
            default:
                wq wqVar = this.b;
                View view = wqVar.b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((t10) wqVar.d).b.removeView(view);
                break;
        }
    }

    public j10(wq wqVar, f2.w0 w0Var) {
        this.b = wqVar;
    }
}
