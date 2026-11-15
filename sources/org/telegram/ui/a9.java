package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a9 extends AnimatorListenerAdapter {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ org.telegram.ui.Components.z70 b;
    public final /* synthetic */ String c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.z70 z70Var, String str) {
        this.a = atomicBoolean;
        this.b = z70Var;
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
