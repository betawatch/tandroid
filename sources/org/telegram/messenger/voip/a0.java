package org.telegram.messenger.voip;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ a0(int i10, VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
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

    public /* synthetic */ a0(VoIPService voIPService, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = voIPService;
        this.d = tLObject;
        this.c = tL_error;
    }
}
