package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ v50 c;

    public k40(v50 v50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = v50Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        v50 v50Var = this.c;
        b50 b50Var = v50Var.Q;
        b50Var.getViewTreeObserver().removeOnPreDrawListener(this);
        v50Var.q2 = null;
        m30 m30Var = v50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        m30Var.j(videoParticipant);
        if (v50Var.s0) {
            v50Var.s0 = false;
            v50Var.O0(true);
            if (this.b && videoParticipant != null) {
                b50Var.v0(0);
            }
            v50Var.s0 = true;
        } else {
            v50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
