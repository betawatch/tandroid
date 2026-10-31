package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f20 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ g20 f;

    public f20(g20 g20Var, e20 e20Var, jg.l0 l0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f = g20Var;
        this.a = e20Var;
        this.b = l0Var;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.zs.f(this.f.h).d(new ag.e3(this.a, this.b, this.c, this.d, this.e, 19));
    }
}
