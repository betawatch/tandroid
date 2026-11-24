// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aa1 extends AnimatorListenerAdapter {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ l66 b;
    public final /* synthetic */ String c;

    public aa1(AtomicBoolean atomicBoolean, l66 l66Var, String str) {
        this.a = atomicBoolean;
        this.b = l66Var;
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
