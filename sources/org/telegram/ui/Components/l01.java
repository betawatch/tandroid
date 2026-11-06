package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l01 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.uv b;
    public final /* synthetic */ n01 c;

    public l01(n01 n01Var) {
        this.c = n01Var;
    }

    public final long a() {
        org.telegram.messenger.uv uvVar = this.b;
        if (uvVar != null) {
            return uvVar.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        return this.c.c ? org.telegram.messenger.m5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}
