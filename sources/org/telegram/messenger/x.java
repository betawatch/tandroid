package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ x(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setTranslationX(0.0f);
                break;
            case 1:
                i0.E2(this.b);
                break;
            default:
                i0.E2(this.b);
                break;
        }
    }
}
