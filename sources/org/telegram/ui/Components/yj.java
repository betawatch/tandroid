package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.pq b;

    public yj(org.telegram.ui.pq pqVar) {
        this.b = pqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((ak) this.b.d).Q.unlock();
                break;
            default:
                org.telegram.ui.pq pqVar = this.b;
                View view = pqVar.b;
                view.setAlpha(1.0f);
                f2.x0.x0(view);
                ((ak) pqVar.d).T.r.removeView(view);
                break;
        }
    }

    public yj(org.telegram.ui.pq pqVar, f2.x0 x0Var) {
        this.b = pqVar;
    }
}
