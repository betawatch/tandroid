package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ oj b;

    public nj(oj ojVar, boolean z10) {
        this.b = ojVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        zn znVar = this.b.b;
        if (z10) {
            TLRPC.User user = znVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                znVar.getMessagesStorage().getMessagesCount(znVar.T5, new mj(1, this, z11));
                return;
            }
        }
        znVar.va(znVar.d4, z10);
    }
}
