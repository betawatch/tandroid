package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class sr {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public sr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.a = gj.Q1(j3, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
