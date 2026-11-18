package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cl extends oq0 {
    public final /* synthetic */ bn a;

    public cl(bn bnVar) {
        this.a = bnVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.a, fjVar, fileLocation, i7, z10, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean L() {
        return true;
    }
}
