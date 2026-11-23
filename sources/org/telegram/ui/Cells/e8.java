package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ h8 c;

    public /* synthetic */ e8(h8 h8Var, boolean z10, int i7) {
        this.a = i7;
        this.c = h8Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.c.h.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!this.b) {
                    this.c.y.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    this.c.h.setVisibility(0);
                    break;
                }
                break;
            default:
                if (this.b) {
                    this.c.y.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
