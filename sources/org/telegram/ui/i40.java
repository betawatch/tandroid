package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ u50 c;

    public i40(u50 u50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = u50Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        u50 u50Var = this.c;
        z40 z40Var = u50Var.Q;
        z40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        u50Var.q2 = null;
        k30 k30Var = u50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        k30Var.j(videoParticipant);
        if (u50Var.s0) {
            u50Var.s0 = false;
            u50Var.O0(true);
            if (this.b && videoParticipant != null) {
                z40Var.u0(0);
            }
            u50Var.s0 = true;
        } else {
            u50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
