package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        y71 y71Var = chatActivityEnterView.c1;
        if (y71Var != null) {
            y71Var.setVisibility(8);
        }
        rk0 rk0Var = chatActivityEnterView.e1;
        if (rk0Var != null) {
            rk0Var.setVisibility(8);
        }
        chatActivityEnterView.l4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
