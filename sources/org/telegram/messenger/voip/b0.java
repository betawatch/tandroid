package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ b0(int i7, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = i7;
        this.b = voIPService;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startGroupCheckShortpoll$61(this.d, this.c);
                break;
            case 1:
                this.b.lambda$processAcceptedCall$19(this.c, this.d);
                break;
            default:
                this.b.lambda$acceptIncomingCall$101(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ b0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = voIPService;
        this.d = tLObject;
        this.c = tL_error;
    }
}
