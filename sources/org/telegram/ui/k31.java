package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k31 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r41 b;

    public /* synthetic */ k31(r41 r41Var, int i3) {
        this.a = i3;
        this.b = r41Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                r41.a0(this.b, tLObject);
                break;
            default:
                r41.Z(this.b, tLObject);
                break;
        }
    }
}
