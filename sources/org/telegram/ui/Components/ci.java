package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ci implements lj {
    public final /* synthetic */ ti a;

    public ci(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.lj
    public final void a(TLRPC.User user, boolean z10, int i7, long j3) {
        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.a.a2;
        if (bnVar.u7()) {
            org.telegram.messenger.xy g10 = org.telegram.messenger.xy.g(user, bnVar.l6, bnVar.F5, bnVar.m4, null, null, z10, i7, 0);
            g10.K = bnVar.Y8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = bnVar.j9();
            g10.T = bnVar.y5;
            bnVar.getSendMessagesHelper().r0(g10);
            bnVar.L6();
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void c(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        ((org.telegram.ui.bn) this.a.a2).Jb(arrayList, str, z10, i7, j3, z11);
    }
}
