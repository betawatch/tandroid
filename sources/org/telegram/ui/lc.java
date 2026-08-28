package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lc extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ nc f;

    public lc(nc ncVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        this.f = ncVar;
        this.c = context;
        this.d = b6Var;
        this.e = i9;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        mc mcVar = (mc) q1Var.a;
        mcVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.d));
        boolean z10 = i9 == this.f.e;
        mcVar.s = z10;
        mcVar.v.f(z10, true);
        mcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null || i9 < 0 || i9 >= peerColors.colors.size()) {
            return;
        }
        mcVar.a(peerColors.colors.get(i9));
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new org.telegram.ui.Components.ik0(new mc(this.f, this.c));
    }
}
