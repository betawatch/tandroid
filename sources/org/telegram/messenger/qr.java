package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
