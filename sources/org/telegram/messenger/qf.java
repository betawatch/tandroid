package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class qf implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ f1 d;

    public /* synthetic */ qf(f1 f1Var, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = f1Var;
        this.b = z10;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new qg((ui) this.d, tLObject, this.b, this.c, 1));
                break;
            default:
                i0.g3(new qg((vp) this.d, tLObject, this.b, this.c, 2));
                break;
        }
    }
}
