package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w50 b;

    public /* synthetic */ u50(w50 w50Var, int i10) {
        this.a = i10;
        this.b = w50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new jg(this.b, tL_error, tLObject, 9));
                break;
            default:
                org.telegram.messenger.i0.g3(new at(18, this.b, tL_error));
                break;
        }
    }
}
