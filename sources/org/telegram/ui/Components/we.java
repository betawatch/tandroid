package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class we extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ we(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.n2)) {
                    chatActivityEnterView.n2 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        te teVar;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (chatActivityEnterView.g5) {
                    chatActivityEnterView.r1.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                if (animator.equals(chatActivityEnterView2.n2)) {
                    chatActivityEnterView2.k1.setVisibility(8);
                    if (this.b && (teVar = chatActivityEnterView2.E1) != null) {
                        teVar.setVisibility(8);
                    }
                    chatActivityEnterView2.n2 = null;
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.c;
                chatActivityEnterView3.H1 = null;
                if (!this.b) {
                    chatActivityEnterView3.E1.setVisibility(8);
                    break;
                }
                break;
            default:
                float f9 = this.b ? 1.0f : 0.0f;
                ChatActivityEnterView chatActivityEnterView4 = this.c;
                chatActivityEnterView4.s0 = f9;
                xf xfVar = chatActivityEnterView4.Q0;
                if (xfVar != null) {
                    xfVar.a0();
                    break;
                }
                break;
        }
    }
}
