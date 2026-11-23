package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class rr {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public rr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.a = gj.Q1(j3, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
