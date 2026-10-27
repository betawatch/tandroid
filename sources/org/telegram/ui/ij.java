package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ij implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ jj b;

    public ij(jj jjVar, boolean z10) {
        this.b = jjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        wn wnVar = this.b.b;
        if (z10) {
            TLRPC.User user = wnVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.j6, new hj(1, this, z11));
                return;
            }
        }
        wnVar.Da(wnVar.p4, z10);
    }
}
