package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ c3(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new ng(tLObject, this.b, tL_error));
                break;
            default:
                c20 c20Var = this.b;
                if (c20Var != null) {
                    c20Var.a(tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null);
                    break;
                }
                break;
        }
    }
}
