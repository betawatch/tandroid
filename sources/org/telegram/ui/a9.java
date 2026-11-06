package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a9 extends AnimatorListenerAdapter {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ org.telegram.ui.Components.w70 b;
    public final /* synthetic */ String c;

    public a9(AtomicBoolean atomicBoolean, org.telegram.ui.Components.w70 w70Var, String str) {
        this.a = atomicBoolean;
        this.b = w70Var;
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
