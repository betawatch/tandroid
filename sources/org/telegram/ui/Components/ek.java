package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ek extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.vq b;

    public ek(org.telegram.ui.vq vqVar) {
        this.b = vqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((gk) this.b.d).R.unlock();
                break;
            default:
                org.telegram.ui.vq vqVar = this.b;
                View view = vqVar.b;
                view.setAlpha(1.0f);
                f2.v0.x0(view);
                ((gk) vqVar.d).U.r.removeView(view);
                break;
        }
    }

    public ek(org.telegram.ui.vq vqVar, f2.v0 v0Var) {
        this.b = vqVar;
    }
}
