package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class nj {
    public final cg.a a;
    public final long b;

    public nj(cg.a aVar, long j3) {
        this.a = aVar;
        this.b = j3;
    }

    public static nj a() {
        return new nj(cg.a.g(0L, cg.b.a), 0L);
    }

    public static nj b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new nj(cg.a.l(suggestedPost.price), suggestedPost.schedule_date);
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
