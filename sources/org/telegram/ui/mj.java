package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mj implements org.telegram.messenger.as {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nj b;

    public mj(nj njVar, boolean z10) {
        this.b = njVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.as
    public final void i(boolean z10) {
        un unVar = this.b.b;
        if (z10) {
            TLRPC.User user = unVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                org.telegram.messenger.is messagesStorage = unVar.getMessagesStorage();
                messagesStorage.a.c(new org.telegram.messenger.mr(messagesStorage, unVar.j6, new lj(1, this, z11), 0));
                return;
            }
        }
        unVar.La(unVar.r4, z10);
    }
}
