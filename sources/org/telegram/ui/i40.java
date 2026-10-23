package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
