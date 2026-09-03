package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class MessageSuggestionParams {
    public final lf.a amount;
    public final long time;

    private MessageSuggestionParams(lf.a aVar, long j10) {
        this.amount = aVar;
        this.time = j10;
    }

    public static MessageSuggestionParams empty() {
        return new MessageSuggestionParams(lf.a.g(0L, lf.b.a), 0L);
    }

    public static MessageSuggestionParams of(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? empty() : new MessageSuggestionParams(lf.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public boolean isEmpty() {
        lf.a aVar = this.amount;
        return (aVar == null || aVar.k()) && this.time <= 0;
    }

    public TLRPC.SuggestedPost toTl() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        lf.a aVar = this.amount;
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
        return of(lf.a.l(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
    }

    public static MessageSuggestionParams of(lf.a aVar, long j10) {
        return new MessageSuggestionParams(aVar, j10);
    }
}
