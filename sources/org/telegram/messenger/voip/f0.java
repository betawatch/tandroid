package org.telegram.messenger.voip;

import org.telegram.messenger.hs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ hs c;

    public /* synthetic */ f0(VoIPService voIPService, hs hsVar, int i10) {
        this.a = i10;
        this.b = voIPService;
        this.c = hsVar;
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
