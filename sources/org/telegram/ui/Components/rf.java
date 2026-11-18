package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        xi0 xi0Var = chatActivityEnterView.i1;
        if (xi0Var != null && xi0Var.T0 != null) {
            chatActivityEnterView.x5 = new org.telegram.ui.ci(29, this, animator);
            return;
        }
        t61 t61Var = chatActivityEnterView.g1;
        if (t61Var != null) {
            t61Var.setVisibility(8);
        }
        xi0 xi0Var2 = chatActivityEnterView.i1;
        if (xi0Var2 != null) {
            xi0Var2.setVisibility(8);
        }
        chatActivityEnterView.d5 = 0.0f;
        chatActivityEnterView.S0();
        chatActivityEnterView.J0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
