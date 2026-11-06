package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;

    public /* synthetic */ ck0(hl0 hl0Var, int i7) {
        this.a = i7;
        this.b = hl0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new gk0(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new zc0(24, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new gk0(this.b, tLObject, 2));
                break;
            default:
                org.telegram.messenger.g0.h3(new kk0(this.b, tL_error, tLObject, 0));
                break;
        }
    }
}
