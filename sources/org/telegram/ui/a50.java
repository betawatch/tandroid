package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ k60 c;

    public a50(k60 k60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = k60Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        k60 k60Var = this.c;
        q50 q50Var = k60Var.Q;
        q50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        k60Var.q2 = null;
        c40 c40Var = k60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        c40Var.j(videoParticipant);
        if (k60Var.s0) {
            k60Var.s0 = false;
            k60Var.O0(true);
            if (this.b && videoParticipant != null) {
                q50Var.v0(0);
            }
            k60Var.s0 = true;
        } else {
            k60Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
