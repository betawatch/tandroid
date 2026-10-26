package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
