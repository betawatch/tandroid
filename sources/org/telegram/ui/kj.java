package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class kj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lj b;

    public kj(lj ljVar, boolean z10) {
        this.b = ljVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        yn ynVar = this.b.b;
        if (z10) {
            TLRPC.User user = ynVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                ynVar.getMessagesStorage().getMessagesCount(ynVar.R5, new jj(1, this, z11));
                return;
            }
        }
        ynVar.pa(ynVar.b4, z10);
    }
}
