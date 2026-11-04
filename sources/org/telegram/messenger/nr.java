package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class nr {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public nr(long j10, TLRPC.Message message, TLRPC.Message message2) {
        this.a = zi.R1(j10, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
