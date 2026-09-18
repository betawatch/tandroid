package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y20 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ z20 f;

    public y20(z20 z20Var, x20 x20Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.w7 w7Var) {
        this.f = z20Var;
        this.a = x20Var;
        this.b = f0Var;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = w7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new ai.m3(this.a, this.b, this.c, this.d, this.e, 22));
    }
}
