package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
