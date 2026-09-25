package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class pl extends lu0 {
    public final /* synthetic */ wn a;

    public pl(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.A1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean K() {
        return true;
    }
}
