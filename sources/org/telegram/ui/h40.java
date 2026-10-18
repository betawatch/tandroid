package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class h40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s50 c;

    public h40(s50 s50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = s50Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        s50 s50Var = this.c;
        y40 y40Var = s50Var.Q;
        y40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        s50Var.q2 = null;
        j30 j30Var = s50Var.a2;
        ChatObject.VideoParticipant videoParticipant = this.a;
        j30Var.j(videoParticipant);
        if (s50Var.s0) {
            s50Var.s0 = false;
            s50Var.P0(true);
            if (this.b && videoParticipant != null) {
                y40Var.u0(0);
            }
            s50Var.s0 = true;
        } else {
            s50Var.P0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
