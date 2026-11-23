package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class qr {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public qr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.a = fj.Q1(j3, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
