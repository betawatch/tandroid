package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ dj b;

    public cj(dj djVar, boolean z10) {
        this.b = djVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        rn rnVar = this.b.b;
        if (z10) {
            TLRPC.User user = rnVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                rnVar.getMessagesStorage().getMessagesCount(rnVar.P5, new bj(1, this, z11));
                return;
            }
        }
        rnVar.qa(rnVar.Z3, z10);
    }
}
