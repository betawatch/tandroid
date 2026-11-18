package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s71 b;

    public /* synthetic */ r71(s71 s71Var, int i7) {
        this.a = i7;
        this.b = s71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.E = null;
                break;
            default:
                this.b.E = null;
                break;
        }
    }
}
