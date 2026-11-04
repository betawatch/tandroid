package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ni implements org.telegram.messenger.ir {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ oi b;

    public ni(oi oiVar, boolean z10) {
        this.b = oiVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.ir
    public final void o(boolean z10) {
        wm wmVar = this.b.b;
        if (z10) {
            TLRPC.User user = wmVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                org.telegram.messenger.qr messagesStorage = wmVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.wq(messagesStorage, wmVar.k6, new mi(1, this, z11), 0));
                return;
            }
        }
        wmVar.Qa(wmVar.s4, z10);
    }
}
