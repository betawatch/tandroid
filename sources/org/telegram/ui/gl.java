package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gl extends st0 {
    public final /* synthetic */ rn a;

    public gl(rn rnVar) {
        this.a = rnVar;
    }

    @Override // org.telegram.ui.st0, org.telegram.ui.au0
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return rn.A1(this.a, messageObject, fileLocation, i10, z10, false);
    }
}
