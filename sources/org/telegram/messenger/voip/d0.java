package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ d0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = i10;
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

    public /* synthetic */ d0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = voIPService;
        this.d = tLObject;
        this.c = tL_error;
    }
}
