package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k40 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.t a;
    public final /* synthetic */ x50 b;

    public k40(x50 x50Var, org.telegram.ui.Components.voip.t tVar) {
        this.b = x50Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
