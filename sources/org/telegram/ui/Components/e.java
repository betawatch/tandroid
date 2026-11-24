package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public e(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        i29 i29Var = chatActivityEnterView.i1;
        if (i29Var != null && i29Var.T0 != null) {
            chatActivityEnterView.y5 = new kx1(this, animator, (byte) 2);
            return;
        }
        scc sccVar = chatActivityEnterView.g1;
        if (sccVar != null) {
            sccVar.setVisibility(8);
        }
        i29 i29Var2 = chatActivityEnterView.i1;
        if (i29Var2 != null) {
            i29Var2.setVisibility(8);
        }
        chatActivityEnterView.e5 = 0.0f;
        chatActivityEnterView.U0();
        chatActivityEnterView.M0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
