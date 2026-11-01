package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class pj {
    public final sf.a a;
    public final long b;

    public pj(sf.a aVar, long j10) {
        this.a = aVar;
        this.b = j10;
    }

    public static pj a() {
        return new pj(sf.a.g(0L, sf.b.a), 0L);
    }

    public static pj b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new pj(sf.a.l(suggestedPost.price), suggestedPost.schedule_date);
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
