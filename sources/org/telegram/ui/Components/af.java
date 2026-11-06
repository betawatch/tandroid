package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class af extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public af(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        h61 h61Var = chatActivityEnterView.f1;
        if (h61Var != null) {
            h61Var.setVisibility(8);
        }
        ji0 ji0Var = chatActivityEnterView.h1;
        if (ji0Var != null) {
            ji0Var.setVisibility(8);
        }
        chatActivityEnterView.p4 = 0.0f;
        chatActivityEnterView.w0();
        chatActivityEnterView.n0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
