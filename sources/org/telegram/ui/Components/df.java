package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class df extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ df(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.r2)) {
                    chatActivityEnterView.r2 = null;
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
        af afVar;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (chatActivityEnterView.k5) {
                    chatActivityEnterView.v1.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                if (animator.equals(chatActivityEnterView2.r2)) {
                    chatActivityEnterView2.o1.setVisibility(8);
                    if (this.b && (afVar = chatActivityEnterView2.I1) != null) {
                        afVar.setVisibility(8);
                    }
                    chatActivityEnterView2.r2 = null;
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.c;
                chatActivityEnterView3.L1 = null;
                if (!this.b) {
                    chatActivityEnterView3.I1.setVisibility(8);
                    break;
                }
                break;
            default:
                float f7 = this.b ? 1.0f : 0.0f;
                ChatActivityEnterView chatActivityEnterView4 = this.c;
                chatActivityEnterView4.w0 = f7;
                eg egVar = chatActivityEnterView4.U0;
                if (egVar != null) {
                    egVar.a0();
                    break;
                }
                break;
        }
    }
}
