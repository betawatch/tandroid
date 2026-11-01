package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;

    public /* synthetic */ kl0(qm0 qm0Var, int i10) {
        this.a = i10;
        this.b = qm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new nl0(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new if0(17, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new nl0(this.b, tLObject, 2));
                break;
            default:
                org.telegram.messenger.i0.g3(new rl0(this.b, tL_error, tLObject, 0));
                break;
        }
    }
}
