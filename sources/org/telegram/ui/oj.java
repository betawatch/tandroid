package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ pj b;

    public oj(pj pjVar, boolean z10) {
        this.b = pjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        eo eoVar = this.b.b;
        if (z10) {
            TLRPC.User user = eoVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                eoVar.getMessagesStorage().getMessagesCount(eoVar.T5, new nj(1, this, z11));
                return;
            }
        }
        eoVar.qa(eoVar.d4, z10);
    }
}
