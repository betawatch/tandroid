package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s61 b;

    public /* synthetic */ l51(s61 s61Var, int i10) {
        this.a = i10;
        this.b = s61Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                s61.a0(this.b, tLObject);
                break;
            default:
                s61.Z(this.b, tLObject);
                break;
        }
    }
}
