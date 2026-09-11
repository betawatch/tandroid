package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class kc implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ kc(int i10, long j3, long j10, MessagesController messagesController) {
        this.a = 0;
        this.b = messagesController;
        this.d = j3;
        this.c = i10;
        this.e = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                long j3 = this.e;
                this.b.lambda$getChannelDifference$349(this.d, i10, j3, tLObject, tL_error);
                break;
            case 1:
                long j10 = this.d;
                long j11 = this.e;
                this.b.lambda$sendTyping$172(this.c, j10, j11, tLObject, tL_error);
                break;
            default:
                long j12 = this.d;
                long j13 = this.e;
                this.b.lambda$sendTyping$174(this.c, j12, j13, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ kc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.a = i11;
        this.b = messagesController;
        this.c = i10;
        this.d = j3;
        this.e = j10;
    }
}
