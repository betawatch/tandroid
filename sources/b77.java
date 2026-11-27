// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class b77 {
    public final oj a;
    public final long b;

    public b77(oj ojVar, long j) {
        this.a = ojVar;
        this.b = j;
    }

    public static b77 a() {
        return new b77(oj.h(0L, pj.a), 0L);
    }

    public static b77 b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new b77(oj.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        oj ojVar = this.a;
        if (ojVar != null && !ojVar.l()) {
            suggestedPost.price = ojVar.q();
        }
        long j = this.b;
        if (j > 0) {
            suggestedPost.schedule_date = (int) j;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
