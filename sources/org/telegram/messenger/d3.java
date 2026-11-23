package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y10 b;

    public /* synthetic */ d3(y10 y10Var, int i7) {
        this.a = i7;
        this.b = y10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.g3(new zf(tLObject, this.b, tL_error));
                break;
            default:
                y10 y10Var = this.b;
                if (y10Var != null) {
                    y10Var.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                    break;
                }
                break;
        }
    }
}
