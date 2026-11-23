package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ v71(w71 w71Var, int i7) {
        this.a = i7;
        this.b = w71Var;
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
