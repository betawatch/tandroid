package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;

    public /* synthetic */ c3(u10 u10Var, int i3) {
        this.a = i3;
        this.b = u10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new fg(tLObject, this.b, tL_error));
                break;
            default:
                u10 u10Var = this.b;
                if (u10Var != null) {
                    u10Var.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                    break;
                }
                break;
        }
    }
}
