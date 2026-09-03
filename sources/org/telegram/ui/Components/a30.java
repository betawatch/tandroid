package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a30 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WindowManager c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ b30 f;

    public a30(b30 b30Var, z20 z20Var, dg.u2 u2Var, WindowManager windowManager, FrameLayout frameLayout, org.telegram.ui.y7 y7Var) {
        this.f = b30Var;
        this.a = z20Var;
        this.b = u2Var;
        this.c = windowManager;
        this.d = frameLayout;
        this.e = y7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NotificationCenter.getInstance(this.f.h).doOnIdle(new gg.j0(this.a, this.b, this.c, this.d, this.e, 28));
    }
}
