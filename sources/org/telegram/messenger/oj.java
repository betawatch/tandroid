package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class oj {
    public final sf.a a;
    public final long b;

    public oj(sf.a aVar, long j10) {
        this.a = aVar;
        this.b = j10;
    }

    public static oj a() {
        return new oj(sf.a.g(0L, sf.b.a), 0L);
    }

    public static oj b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new oj(sf.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        sf.a aVar = this.a;
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
