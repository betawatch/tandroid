package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class f40 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.voip.t a;
    public final /* synthetic */ s50 b;

    public f40(s50 s50Var, org.telegram.ui.Components.voip.t tVar) {
        this.b = s50Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        org.telegram.ui.Components.voip.t tVar = this.a;
        if (tVar.getParent() != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.b).containerView;
            viewGroup.removeView(tVar);
        }
    }
}
