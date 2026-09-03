package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class ub implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ ub(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
        this.a = i10;
        this.b = messagesController;
        this.c = j10;
        this.d = j11;
        this.e = arrayList;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$checkUnreadPollVotesInternal2$430(this.c, this.d, this.e, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$checkUnreadPollVotesInternal2$432(this.c, this.d, this.e, tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$checkUnreadPollVotesInternal2$434(this.c, this.d, this.e, tLObject, tL_error);
                break;
            case 3:
                this.b.lambda$checkUnreadReactionsInternal2$423(this.c, this.d, this.e, tLObject, tL_error);
                break;
            case 4:
                this.b.lambda$checkUnreadReactionsInternal2$425(this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                this.b.lambda$checkUnreadReactionsInternal2$427(this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
