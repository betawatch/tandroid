package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class vr {
    public final long a;
    public final TLRPC.TL_messageReactions b;
    public final TLRPC.TL_messageReactions c;

    public vr(long j3, TLRPC.Message message, TLRPC.Message message2) {
        this.a = ij.Q1(j3, message2);
        this.b = message.reactions;
        this.c = message2.reactions;
    }
}
