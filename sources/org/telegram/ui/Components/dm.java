package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm implements tk, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ org.telegram.messenger.u10 a;

    public /* synthetic */ dm(org.telegram.messenger.u10 u10Var) {
        this.a = u10Var;
    }

    @Override // org.telegram.ui.Components.tk
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        this.a.a(new uh.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        org.telegram.messenger.u10 u10Var = this.a;
        if (u10Var != null) {
            u10Var.a(Boolean.FALSE);
        }
    }
}
