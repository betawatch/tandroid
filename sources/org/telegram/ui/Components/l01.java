package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l01 {
    public TLRPC.TL_forumTopic a;
    public org.telegram.messenger.mv b;
    public final /* synthetic */ n01 c;

    public l01(n01 n01Var) {
        this.c = n01Var;
    }

    public final long a() {
        org.telegram.messenger.mv mvVar = this.b;
        if (mvVar != null) {
            return mvVar.a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        return this.c.c ? org.telegram.messenger.m5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
    }
}
