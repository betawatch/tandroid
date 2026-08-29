package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kl extends pt0 {
    public final /* synthetic */ tn a;

    public kl(tn tnVar) {
        this.a = tnVar;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return tn.A1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean K() {
        return true;
    }
}
