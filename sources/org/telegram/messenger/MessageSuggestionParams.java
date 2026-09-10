package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class MessageSuggestionParams {
    public final yf.a amount;
    public final long time;

    private MessageSuggestionParams(yf.a aVar, long j3) {
        this.amount = aVar;
        this.time = j3;
    }

    public static MessageSuggestionParams empty() {
        return new MessageSuggestionParams(yf.a.g(0L, yf.b.a), 0L);
    }

    public static MessageSuggestionParams of(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? empty() : new MessageSuggestionParams(yf.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public boolean isEmpty() {
        yf.a aVar = this.amount;
        return (aVar == null || aVar.k()) && this.time <= 0;
    }

    public TLRPC.SuggestedPost toTl() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        yf.a aVar = this.amount;
        if (aVar != null && !aVar.k()) {
            suggestedPost.price = this.amount.o();
        }
        long j3 = this.time;
        if (j3 > 0) {
            suggestedPost.schedule_date = (int) j3;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }

    public static MessageSuggestionParams of(TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval) {
        return of(yf.a.l(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
    }

    public static MessageSuggestionParams of(yf.a aVar, long j3) {
        return new MessageSuggestionParams(aVar, j3);
    }
}
