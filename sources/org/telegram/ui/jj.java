package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ kj b;

    public jj(kj kjVar, boolean z10) {
        this.b = kjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        wn wnVar = this.b.b;
        if (z10) {
            TLRPC.User user = wnVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                wnVar.getMessagesStorage().getMessagesCount(wnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        wnVar.qa(wnVar.d4, z10);
    }
}
