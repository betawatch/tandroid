package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class kj {
    public final cg.a a;
    public final long b;

    public kj(cg.a aVar, long j3) {
        this.a = aVar;
        this.b = j3;
    }

    public static kj a() {
        return new kj(cg.a.h(0L, cg.b.a), 0L);
    }

    public static kj b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new kj(cg.a.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        cg.a aVar = this.a;
        if (aVar != null && !aVar.l()) {
            suggestedPost.price = aVar.q();
        }
        long j3 = this.b;
        if (j3 > 0) {
            suggestedPost.schedule_date = (int) j3;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
