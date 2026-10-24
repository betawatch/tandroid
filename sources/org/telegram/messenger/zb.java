package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class zb implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ zb(int i10, long j10, long j11, ArrayList arrayList, MessagesController messagesController) {
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
                this.b.lambda$checkUnreadPollVotesInternal2$433(this.c, this.d, this.e, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$checkUnreadPollVotesInternal2$435(this.c, this.d, this.e, tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$checkUnreadPollVotesInternal2$437(this.c, this.d, this.e, tLObject, tL_error);
                break;
            case 3:
                this.b.lambda$checkUnreadReactionsInternal2$426(this.c, this.d, this.e, tLObject, tL_error);
                break;
            case 4:
                this.b.lambda$checkUnreadReactionsInternal2$428(this.c, this.d, this.e, tLObject, tL_error);
                break;
            default:
                this.b.lambda$checkUnreadReactionsInternal2$430(this.c, this.d, this.e, tLObject, tL_error);
                break;
        }
    }
}
