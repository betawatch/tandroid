package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.qq b;

    public kk(org.telegram.ui.qq qqVar) {
        this.b = qqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((mk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.qq qqVar = this.b;
                View view = qqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((mk) qqVar.d).X.r.removeView(view);
                break;
        }
    }

    public kk(org.telegram.ui.qq qqVar, s4.n0 n0Var) {
        this.b = qqVar;
    }
}
