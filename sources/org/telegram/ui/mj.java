package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mj implements org.telegram.messenger.zr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nj b;

    public mj(nj njVar, boolean z10) {
        this.b = njVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.zr
    public final void i(boolean z10) {
        un unVar = this.b.b;
        if (z10) {
            TLRPC.User user = unVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                org.telegram.messenger.hs messagesStorage = unVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.lr(messagesStorage, unVar.j6, new lj(1, this, z11), 0));
                return;
            }
        }
        unVar.Ga(unVar.r4, z10);
    }
}
