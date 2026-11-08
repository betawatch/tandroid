package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o10 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ p10 f;

    public o10(p10 p10Var, n10 n10Var, bi.e5 e5Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f = p10Var;
        this.a = n10Var;
        this.b = e5Var;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.qs.f(this.f.h).d(new bi.u0(this.a, this.b, this.c, this.d, this.e, 29));
    }
}
