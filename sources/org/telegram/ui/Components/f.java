package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public f(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        x59 x59Var = chatActivityEnterView.i1;
        if (x59Var != null && x59Var.R0 != null) {
            chatActivityEnterView.A5 = new dy1(this, animator, (byte) 2);
            return;
        }
        qgc qgcVar = chatActivityEnterView.g1;
        if (qgcVar != null) {
            qgcVar.setVisibility(8);
        }
        x59 x59Var2 = chatActivityEnterView.i1;
        if (x59Var2 != null) {
            x59Var2.setVisibility(8);
        }
        chatActivityEnterView.d5 = 0.0f;
        chatActivityEnterView.Y0();
        chatActivityEnterView.Q0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
        if (recordCircle != null) {
            recordCircle.h();
        }
    }
}
