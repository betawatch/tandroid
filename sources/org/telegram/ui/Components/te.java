package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class te extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ te(ChatActivityEnterView chatActivityEnterView, boolean z4, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.o2)) {
                    chatActivityEnterView.o2 = null;
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
                if (chatActivityEnterView.h5) {
                    chatActivityEnterView.s1.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                if (animator.equals(chatActivityEnterView2.o2)) {
                    chatActivityEnterView2.l1.setVisibility(8);
                    if (this.b && (qeVar = chatActivityEnterView2.F1) != null) {
                        qeVar.setVisibility(8);
                    }
                    chatActivityEnterView2.o2 = null;
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = this.c;
                chatActivityEnterView3.I1 = null;
                if (!this.b) {
                    chatActivityEnterView3.F1.setVisibility(8);
                    break;
                }
                break;
            default:
                float f10 = this.b ? 1.0f : 0.0f;
                ChatActivityEnterView chatActivityEnterView4 = this.c;
                chatActivityEnterView4.t0 = f10;
                uf ufVar = chatActivityEnterView4.R0;
                if (ufVar != null) {
                    ufVar.a0();
                    break;
                }
                break;
        }
    }
}
