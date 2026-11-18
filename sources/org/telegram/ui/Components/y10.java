package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class y10 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ z10 f;

    public y10(z10 z10Var, x10 x10Var, bi.a3 a3Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f = z10Var;
        this.a = x10Var;
        this.b = a3Var;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.ks.f(this.f.h).d(new org.telegram.ui.wn(this.a, this.b, this.c, this.d, this.e, 4));
    }
}
