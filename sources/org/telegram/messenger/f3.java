package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ f3(r20 r20Var, int i10) {
        this.a = i10;
        this.b = r20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new ng(tLObject, this.b, tL_error));
                break;
            default:
                r20 r20Var = this.b;
                if (r20Var != null) {
                    r20Var.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                    break;
                }
                break;
        }
    }
}
