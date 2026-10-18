package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class gj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ hj b;

    public gj(hj hjVar, boolean z10) {
        this.b = hjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        sn snVar = this.b.b;
        if (z10) {
            TLRPC.User user = snVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                snVar.getMessagesStorage().getMessagesCount(snVar.T5, new fj(1, this, z11));
                return;
            }
        }
        snVar.va(snVar.d4, z10);
    }
}
