package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
