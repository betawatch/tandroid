package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class b9 extends AnimatorListenerAdapter {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ org.telegram.ui.Components.d90 b;
    public final /* synthetic */ String c;

    public b9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.d90 d90Var, String str) {
        this.a = atomicBoolean;
        this.b = d90Var;
        this.c = str;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.b.setText(this.c);
    }
}
