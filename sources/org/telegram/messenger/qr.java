package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
