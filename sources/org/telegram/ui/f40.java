package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class f40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q50 c;

    public f40(q50 q50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = q50Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        q50 q50Var = this.c;
        w40 w40Var = q50Var.Q;
        w40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        q50Var.q2 = null;
        h30 h30Var = q50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        h30Var.j(videoParticipant);
        if (q50Var.s0) {
            q50Var.s0 = false;
            q50Var.P0(true);
            if (this.b && videoParticipant != null) {
                w40Var.u0(0);
            }
            q50Var.s0 = true;
        } else {
            q50Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
