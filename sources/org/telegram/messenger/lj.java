package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class lj {
    public final cg.a a;
    public final long b;

    public lj(cg.a aVar, long j3) {
        this.a = aVar;
        this.b = j3;
    }

    public static lj a() {
        return new lj(cg.a.g(0L, cg.b.a), 0L);
    }

    public static lj b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new lj(cg.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        cg.a aVar = this.a;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = aVar.o();
        }
        long j3 = this.b;
        if (j3 > 0) {
            suggestedPost.schedule_date = (int) j3;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
