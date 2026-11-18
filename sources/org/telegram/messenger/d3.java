package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ x10 b;

    public /* synthetic */ d3(x10 x10Var, int i7) {
        this.a = i7;
        this.b = x10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.g3(new yf(tLObject, this.b, tL_error));
                break;
            default:
                x10 x10Var = this.b;
                if (x10Var != null) {
                    x10Var.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                    break;
                }
                break;
        }
    }
}
