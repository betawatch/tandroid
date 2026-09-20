package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class cf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ cf(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10) {
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
        ze zeVar;
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
                    if (this.b && (zeVar = chatActivityEnterView2.I1) != null) {
                        zeVar.setVisibility(8);
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
                dg dgVar = chatActivityEnterView4.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    break;
                }
                break;
        }
    }
}
