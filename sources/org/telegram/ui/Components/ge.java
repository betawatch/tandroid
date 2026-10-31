package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ge extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ ge(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.s2)) {
                    chatActivityEnterView.s2 = null;
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
        de deVar;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (chatActivityEnterView.p5) {
                    chatActivityEnterView.w1.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                if (animator.equals(chatActivityEnterView2.s2)) {
                    chatActivityEnterView2.p1.setVisibility(8);
                    if (this.b && (deVar = chatActivityEnterView2.J1) != null) {
                        deVar.setVisibility(8);
                    }
                    chatActivityEnterView2.s2 = null;
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.c;
                chatActivityEnterView3.M1 = null;
                if (!this.b) {
                    chatActivityEnterView3.J1.setVisibility(8);
                    break;
                }
                break;
            default:
                float f7 = this.b ? 1.0f : 0.0f;
                ChatActivityEnterView chatActivityEnterView4 = this.c;
                chatActivityEnterView4.w0 = f7;
                gf gfVar = chatActivityEnterView4.U0;
                if (gfVar != null) {
                    gfVar.Z();
                    break;
                }
                break;
        }
    }
}
