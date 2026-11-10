package org.telegram.messenger.voip;

import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ yr c;

    public /* synthetic */ b0(VoIPService voIPService, yr yrVar, int i7) {
        this.a = i7;
        this.b = voIPService;
        this.c = yrVar;
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
