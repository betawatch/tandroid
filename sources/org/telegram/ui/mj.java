package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        co coVar = this.b.b;
        if (z10) {
            TLRPC.User user = coVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                coVar.getMessagesStorage().getMessagesCount(coVar.T5, new lj(1, this, z11));
                return;
            }
        }
        coVar.qa(coVar.d4, z10);
    }
}
