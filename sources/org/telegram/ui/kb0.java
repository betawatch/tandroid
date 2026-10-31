package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                yb0 yb0Var = (yb0) this.c;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new a3.i0(yb0Var, tLObject, this.b, 21));
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.g3(new a3.i0((th.e5) this.c, this.b, tLObject, 28));
                break;
        }
    }
}
