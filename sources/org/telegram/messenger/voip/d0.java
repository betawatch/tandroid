package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ MessagesStorage c;

    public /* synthetic */ d0(VoIPService voIPService, MessagesStorage messagesStorage, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = messagesStorage;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$acceptIncomingCall$103(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$startOutgoingCall$11(this.c, tLObject, tL_error);
                break;
        }
    }
}
