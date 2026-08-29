package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v20 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ w20 f;

    public v20(w20 w20Var, t20 t20Var, bg.x2 x2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.s7 s7Var) {
        this.f = w20Var;
        this.a = t20Var;
        this.b = x2Var;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = s7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new u20(this.a, this.b, this.c, this.d, this.e));
    }
}
