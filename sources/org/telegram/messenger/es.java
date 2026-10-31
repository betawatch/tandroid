package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class es {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public es(long j10, TLRPC.Message message, TLRPC.Message message2) {
        this.a = jj.R1(j10, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
