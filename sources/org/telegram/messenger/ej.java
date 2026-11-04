package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ej {
    public final dg.a a;
    public final long b;

    public ej(dg.a aVar, long j10) {
        this.a = aVar;
        this.b = j10;
    }

    public static ej a() {
        return new ej(dg.a.g(0L, dg.b.a), 0L);
    }

    public static ej b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new ej(dg.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        dg.a aVar = this.a;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = aVar.o();
        }
        long j10 = this.b;
        if (j10 > 0) {
            suggestedPost.schedule_date = (int) j10;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
