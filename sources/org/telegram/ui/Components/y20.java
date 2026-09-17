package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class y20 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ z20 f;

    public y20(z20 z20Var, x20 x20Var, ah.y yVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.u7 u7Var) {
        this.f = z20Var;
        this.a = x20Var;
        this.b = yVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = u7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new bi.z2(this.a, this.b, this.c, this.d, this.e, 22));
    }
}
