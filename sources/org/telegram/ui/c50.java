package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ n60 c;

    public c50(n60 n60Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = n60Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        n60 n60Var = this.c;
        t50 t50Var = n60Var.Q;
        t50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        n60Var.q2 = null;
        e40 e40Var = n60Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        e40Var.j(videoParticipant);
        if (n60Var.s0) {
            n60Var.s0 = false;
            n60Var.P0(true);
            if (this.b && videoParticipant != null) {
                t50Var.u0(0);
            }
            n60Var.s0 = true;
        } else {
            n60Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
