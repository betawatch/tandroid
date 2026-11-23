package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
