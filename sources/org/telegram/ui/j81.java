package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class j81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k81 b;

    public /* synthetic */ j81(k81 k81Var, int i7) {
        this.a = i7;
        this.b = k81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.s.setVisibility(8);
                break;
            default:
                this.b.b.a.setVisibility(8);
                break;
        }
    }
}
