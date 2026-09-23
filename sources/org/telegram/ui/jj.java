package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        xn xnVar = this.b.b;
        if (z10) {
            TLRPC.User user = xnVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                xnVar.getMessagesStorage().getMessagesCount(xnVar.T5, new ij(1, this, z11));
                return;
            }
        }
        xnVar.qa(xnVar.d4, z10);
    }
}
