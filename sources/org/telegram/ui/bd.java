package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd b;

    public /* synthetic */ bd(kd kdVar, int i10) {
        this.a = i10;
        this.b = kdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new h0(20, this.b, tLObject));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new h0(18, this.b, tL_error));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.i0.g3(new ad(this.b, 3));
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new p1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
