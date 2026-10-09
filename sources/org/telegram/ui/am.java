package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class am extends uu0 {
    public final /* synthetic */ zn a;

    public am(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return zn.E1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean K() {
        return true;
    }
}
