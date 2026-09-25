package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class q40 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.u a;
    public final /* synthetic */ d60 b;

    public q40(d60 d60Var, org.telegram.ui.Components.voip.u uVar) {
        this.b = d60Var;
        this.a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.u uVar = this.a;
        if (uVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.b).containerView;
            viewGroup.removeView(uVar);
        }
    }
}
