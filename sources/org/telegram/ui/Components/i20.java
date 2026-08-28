package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i20 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ j20 f;

    public i20(j20 j20Var, h20 h20Var, fh.d2 d2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.t7 t7Var) {
        this.f = j20Var;
        this.a = h20Var;
        this.b = d2Var;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = t7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new org.telegram.ui.hr(this.a, this.b, this.c, this.d, this.e, 1));
    }
}
