package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.rq b;

    public kk(org.telegram.ui.rq rqVar) {
        this.b = rqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((mk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.rq rqVar = this.b;
                View view = rqVar.b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((mk) rqVar.d).X.r.removeView(view);
                break;
        }
    }

    public kk(org.telegram.ui.rq rqVar, s4.p0 p0Var) {
        this.b = rqVar;
    }
}
