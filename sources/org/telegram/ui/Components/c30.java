package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class c30 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ d30 f;

    public c30(d30 d30Var, b30 b30Var, ai.f0 f0Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.x7 x7Var) {
        this.f = d30Var;
        this.a = b30Var;
        this.b = f0Var;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = x7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new ai.m3(this.a, this.b, this.c, this.d, this.e, 22));
    }
}
