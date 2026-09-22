package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class mj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nj b;

    public mj(nj njVar, boolean z10) {
        this.b = njVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        zn znVar = this.b.b;
        if (z10) {
            TLRPC.User user = znVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new lj(1, this, z11));
                return;
            }
        }
        znVar.qa(znVar.d4, z10);
    }
}
