package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class MessageSuggestionParams {
    public final mf.a amount;
    public final long time;

    private MessageSuggestionParams(mf.a aVar, long j10) {
        this.amount = aVar;
        this.time = j10;
    }

    public static MessageSuggestionParams empty() {
        return new MessageSuggestionParams(mf.a.g(0L, mf.b.a), 0L);
    }

    public static MessageSuggestionParams of(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? empty() : new MessageSuggestionParams(mf.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public boolean isEmpty() {
        mf.a aVar = this.amount;
        return (aVar == null || aVar.k()) && this.time <= 0;
    }

    public TLRPC.SuggestedPost toTl() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        mf.a aVar = this.amount;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = this.amount.o();
        }
        long j10 = this.time;
        if (j10 > 0) {
            suggestedPost.schedule_date = (int) j10;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }

    public static MessageSuggestionParams of(TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval) {
        return of(mf.a.l(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
    }

    public static MessageSuggestionParams of(mf.a aVar, long j10) {
        return new MessageSuggestionParams(aVar, j10);
    }
}
