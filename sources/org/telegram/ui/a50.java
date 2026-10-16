package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a50 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.t a;
    public final /* synthetic */ n60 b;

    public a50(n60 n60Var, org.telegram.ui.Components.voip.t tVar) {
        this.b = n60Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
