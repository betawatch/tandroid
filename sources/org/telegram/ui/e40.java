package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChatObject.VideoParticipant a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ o50 c;

    public e40(o50 o50Var, ChatObject.VideoParticipant videoParticipant, boolean z10) {
        this.c = o50Var;
        this.a = videoParticipant;
        this.b = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup;
        o50 o50Var = this.c;
        u40 u40Var = o50Var.M;
        u40Var.getViewTreeObserver().removeOnPreDrawListener(this);
        o50Var.m2 = null;
        g30 g30Var = o50Var.W1;
        ChatObject.VideoParticipant videoParticipant = this.a;
        g30Var.j(videoParticipant);
        if (o50Var.o0) {
            o50Var.o0 = false;
            o50Var.O0(true);
            if (this.b && videoParticipant != null) {
                u40Var.u0(0);
            }
            o50Var.o0 = true;
        } else {
            o50Var.O0(true);
        }
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.requestLayout();
        return false;
    }
}
