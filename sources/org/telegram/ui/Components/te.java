package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class te extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ te(ChatActivityEnterView chatActivityEnterView, boolean z10, int i9) {
        this.a = i9;
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
        qe qeVar;
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
                    if (this.b && (qeVar = chatActivityEnterView2.E1) != null) {
                        qeVar.setVisibility(8);
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
                float f10 = this.b ? 1.0f : 0.0f;
                ChatActivityEnterView chatActivityEnterView4 = this.c;
                chatActivityEnterView4.s0 = f10;
                uf ufVar = chatActivityEnterView4.Q0;
                if (ufVar != null) {
                    ufVar.Z();
                    break;
                }
                break;
        }
    }
}
