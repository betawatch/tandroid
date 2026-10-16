package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class em extends zu0 {
    public final /* synthetic */ fo a;

    public em(fo foVar) {
        this.a = foVar;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return fo.E1(this.a, messageObject, fileLocation, i10, z10, false);
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean L() {
        return true;
    }
}
