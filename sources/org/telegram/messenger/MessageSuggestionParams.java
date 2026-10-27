package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class MessageSuggestionParams {
    public final bg.a amount;
    public final long time;

    private MessageSuggestionParams(bg.a aVar, long j10) {
        this.amount = aVar;
        this.time = j10;
    }

    public static MessageSuggestionParams empty() {
        return new MessageSuggestionParams(bg.a.g(0L, bg.b.a), 0L);
    }

    public static MessageSuggestionParams of(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? empty() : new MessageSuggestionParams(bg.a.l(suggestedPost.price), suggestedPost.schedule_date);
    }

    public boolean isEmpty() {
        bg.a aVar = this.amount;
        return (aVar == null || aVar.k()) && this.time <= 0;
    }

    public TLRPC.SuggestedPost toTl() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        bg.a aVar = this.amount;
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
        return of(bg.a.l(tL_messageActionSuggestedPostApproval.price), tL_messageActionSuggestedPostApproval.schedule_date);
    }

    public static MessageSuggestionParams of(bg.a aVar, long j10) {
        return new MessageSuggestionParams(aVar, j10);
    }
}
