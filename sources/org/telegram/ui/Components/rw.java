package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vy c;

    public /* synthetic */ rw(vy vyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = vyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.c.y.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!this.b) {
                    this.c.D.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
