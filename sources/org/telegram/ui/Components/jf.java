package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        z61 z61Var = chatActivityEnterView.b1;
        if (z61Var != null) {
            z61Var.setVisibility(8);
        }
        vj0 vj0Var = chatActivityEnterView.d1;
        if (vj0Var != null) {
            vj0Var.setVisibility(8);
        }
        chatActivityEnterView.k4 = 0.0f;
        chatActivityEnterView.w0();
        chatActivityEnterView.o0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
