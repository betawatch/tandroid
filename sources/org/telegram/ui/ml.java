package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ml extends ou0 {
    public final /* synthetic */ yn a;

    public ml(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return yn.A1(this.a, messageObject, fileLocation, i10, z10, false);
    }
}
