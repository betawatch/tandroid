package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ej b;

    public dj(ej ejVar, boolean z10) {
        this.b = ejVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        tn tnVar = this.b.b;
        if (z10) {
            TLRPC.User user = tnVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                tnVar.getMessagesStorage().getMessagesCount(tnVar.P5, new cj(1, this, z11));
                return;
            }
        }
        tnVar.qa(tnVar.Z3, z10);
    }
}
