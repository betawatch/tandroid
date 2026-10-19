package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class kk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ org.telegram.ui.oq b;

    public kk(org.telegram.ui.oq oqVar) {
        this.b = oqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ((mk) this.b.d).U.unlock();
                break;
            default:
                org.telegram.ui.oq oqVar = this.b;
                View view = oqVar.b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((mk) oqVar.d).X.r.removeView(view);
                break;
        }
    }

    public kk(org.telegram.ui.oq oqVar, s4.n0 n0Var) {
        this.b = oqVar;
    }
}
