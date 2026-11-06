package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
