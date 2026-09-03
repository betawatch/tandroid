package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k8 c;

    public /* synthetic */ h8(k8 k8Var, boolean z4, int i10) {
        this.a = i10;
        this.c = k8Var;
        this.b = z4;
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
                    this.c.x.setVisibility(4);
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
                    this.c.x.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
