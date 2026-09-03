package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public jf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        x71 x71Var = chatActivityEnterView.c1;
        if (x71Var != null) {
            x71Var.setVisibility(8);
        }
        qk0 qk0Var = chatActivityEnterView.e1;
        if (qk0Var != null) {
            qk0Var.setVisibility(8);
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
