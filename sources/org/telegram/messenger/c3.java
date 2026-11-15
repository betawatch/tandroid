package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;

    public /* synthetic */ c3(z10 z10Var, int i7) {
        this.a = i7;
        this.b = z10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new mg(tLObject, this.b, tL_error));
                break;
            default:
                z10 z10Var = this.b;
                if (z10Var != null) {
                    z10Var.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                    break;
                }
                break;
        }
    }
}
