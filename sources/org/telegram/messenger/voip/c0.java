package org.telegram.messenger.voip;

import org.telegram.messenger.vr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ VoIPService b;
    public final /* synthetic */ vr c;

    public /* synthetic */ c0(VoIPService voIPService, vr vrVar, int i7) {
        this.a = i7;
        this.b = voIPService;
        this.c = vrVar;
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
