package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class vr {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public vr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.a = ij.R1(j3, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
