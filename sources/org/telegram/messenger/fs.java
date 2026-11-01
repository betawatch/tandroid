package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class fs {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public fs(long j10, TLRPC.Message message, TLRPC.Message message2) {
        this.a = kj.R1(j10, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
