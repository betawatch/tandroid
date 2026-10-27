package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j30 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ k30 f;

    public j30(k30 k30Var, h30 h30Var, bh.r rVar, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.a8 a8Var) {
        this.f = k30Var;
        this.a = h30Var;
        this.b = rVar;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = a8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new i30(this.a, this.b, this.c, this.d, this.e));
    }
}
