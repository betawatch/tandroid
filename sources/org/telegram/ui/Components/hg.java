package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ hg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.a = i11;
        this.c = chatActivityEnterView;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (i10 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.unlock();
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.t(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                ww0 ww0Var = chatActivityEnterView2.m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                dg dgVar = chatActivityEnterView2.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView2.h5 == null) {
                        dgVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (ww0Var != null) {
                    ww0Var.requestLayout();
                    ww0Var.setForeground(null);
                    ww0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.z2 && chatActivityEnterView2.p0()) {
                    chatActivityEnterView2.p1(0, chatActivityEnterView2.f2, true, true);
                }
                ie ieVar = chatActivityEnterView2.r0;
                if (ieVar != null) {
                    ieVar.run();
                    chatActivityEnterView2.r0 = null;
                }
                chatActivityEnterView2.L3.unlock();
                break;
        }
    }
}
