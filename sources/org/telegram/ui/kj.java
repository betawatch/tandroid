package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lj b;

    public kj(lj ljVar, boolean z4) {
        this.b = ljVar;
        this.a = z4;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z4) {
        zn znVar = this.b.b;
        if (z4) {
            TLRPC.User user = znVar.f;
            boolean z10 = this.a;
            if (user != null || z10) {
                znVar.getMessagesStorage().getMessagesCount(znVar.Q5, new jj(1, this, z10));
                return;
            }
        }
        znVar.qa(znVar.a4, z4);
    }
}
