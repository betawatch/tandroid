package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ z(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
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

    public /* synthetic */ z(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = voIPService;
        this.d = tLObject;
        this.c = tL_error;
    }
}
