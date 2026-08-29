package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ r50 c;

    public h40(r50 r50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = r50Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        r50 r50Var = this.c;
        x40 x40Var = r50Var.M;
        x40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        r50Var.m2 = null;
        j30 j30Var = r50Var.W1;
        ChatObject.VideoParticipant videoParticipant = this.a;
        j30Var.j(videoParticipant);
        if (r50Var.o0) {
            r50Var.o0 = false;
            r50Var.O0(true);
            if (this.b && videoParticipant != null) {
                x40Var.u0(0);
            }
            r50Var.o0 = true;
        } else {
            r50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
