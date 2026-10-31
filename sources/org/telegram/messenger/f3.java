package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q20 b;

    public /* synthetic */ f3(q20 q20Var, int i10) {
        this.a = i10;
        this.b = q20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new mg(tLObject, this.b, tL_error));
                break;
            default:
                q20 q20Var = this.b;
                if (q20Var != null) {
                    q20Var.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                    break;
                }
                break;
        }
    }
}
