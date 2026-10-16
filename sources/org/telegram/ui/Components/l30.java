package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l30 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ m30 f;

    public l30(m30 m30Var, k30 k30Var, ah.x xVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.y7 y7Var) {
        this.f = m30Var;
        this.a = k30Var;
        this.b = xVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = y7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new bi.c3(this.a, this.b, this.c, this.d, this.e, 22));
    }
}
