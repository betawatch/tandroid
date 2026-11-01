package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h00 b;

    public /* synthetic */ nz(h00 h00Var, int i10) {
        this.a = i10;
        this.b = h00Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.u(17, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.i0.g3(new qq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
