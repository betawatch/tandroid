package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
