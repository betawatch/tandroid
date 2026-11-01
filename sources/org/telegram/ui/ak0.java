package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ ak0(jl0 jl0Var, int i10) {
        this.a = i10;
        this.b = jl0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                jl0 jl0Var = this.b;
                org.telegram.messenger.i0.g3(new pd0(jl0Var, tL_error, tLObject, false, 13));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new if0(14, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new vj0(this.b, 5));
                break;
            default:
                org.telegram.messenger.i0.g3(new if0(13, this.b, tLObject));
                break;
        }
    }
}
