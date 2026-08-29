package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.pq b;

    public gk(org.telegram.ui.pq pqVar) {
        this.b = pqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ik) this.b.d).Q.unlock();
                break;
            default:
                org.telegram.ui.pq pqVar = this.b;
                View view = pqVar.b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((ik) pqVar.d).T.r.removeView(view);
                break;
        }
    }

    public gk(org.telegram.ui.pq pqVar, f2.w0 w0Var) {
        this.b = pqVar;
    }
}
