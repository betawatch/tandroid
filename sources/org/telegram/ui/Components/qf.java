package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ qf(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i7 = this.b;
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (i7 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.H1.setTranslationY(0.0f);
                chatActivityEnterView.H1.setVisibility(8);
                chatActivityEnterView.L3.e();
                wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.w(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                rt0 rt0Var = chatActivityEnterView2.m1;
                chatActivityEnterView2.A3 = false;
                chatActivityEnterView2.B3 = null;
                mf mfVar = chatActivityEnterView2.U0;
                if (mfVar != null) {
                    if (chatActivityEnterView2.h5 == null) {
                        mfVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (rt0Var != null) {
                    rt0Var.requestLayout();
                    rt0Var.setForeground(null);
                    rt0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.z2 && chatActivityEnterView2.s0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.f2, true, true);
                }
                rd rdVar = chatActivityEnterView2.r0;
                if (rdVar != null) {
                    rdVar.run();
                    chatActivityEnterView2.r0 = null;
                }
                chatActivityEnterView2.L3.e();
                break;
        }
    }
}
