package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
