package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kc extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ mc f;

    public kc(mc mcVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f = mcVar;
        this.c = context;
        this.d = c6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        lc lcVar = (lc) n1Var.a;
        lcVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, this.d));
        boolean z10 = i10 == this.f.e;
        lcVar.s = z10;
        lcVar.v.f(z10, true);
        lcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) {
            return;
        }
        lcVar.a(peerColors.colors.get(i10));
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.vk0(new lc(this.f, this.c));
    }
}
