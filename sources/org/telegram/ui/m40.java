package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x50 c;

    public m40(x50 x50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = x50Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        x50 x50Var = this.c;
        d50 d50Var = x50Var.Q;
        d50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        x50Var.q2 = null;
        o30 o30Var = x50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        o30Var.j(videoParticipant);
        if (x50Var.s0) {
            x50Var.s0 = false;
            x50Var.O0(true);
            if (this.b && videoParticipant != null) {
                d50Var.v0(0);
            }
            x50Var.s0 = true;
        } else {
            x50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
