package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class bl extends mq0 {
    public final /* synthetic */ an a;

    public bl(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return an.O1(this.a, ijVar, fileLocation, i7, z9, false);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean L() {
        return true;
    }
}
