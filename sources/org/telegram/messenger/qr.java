package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
