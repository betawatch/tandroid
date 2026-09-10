package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i30 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ j30 f;

    public i30(j30 j30Var, h30 h30Var, bi.ld ldVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.t7 t7Var) {
        this.f = j30Var;
        this.a = h30Var;
        this.b = ldVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = t7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new bi.ya(this.a, this.b, this.c, this.d, this.e, 18));
    }
}
