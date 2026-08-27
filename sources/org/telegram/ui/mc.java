package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mc extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ oc f;

    public mc(oc ocVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f = ocVar;
        this.c = context;
        this.d = c6Var;
        this.e = i10;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        nc ncVar = (nc) o1Var.a;
        ncVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, this.d));
        boolean z10 = i10 == this.f.e;
        ncVar.s = z10;
        ncVar.v.f(z10, true);
        ncVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null || i10 < 0 || i10 >= peerColors.colors.size()) {
            return;
        }
        ncVar.a(peerColors.colors.get(i10));
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.lk0(new nc(this.f, this.c));
    }
}
