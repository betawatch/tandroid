package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
