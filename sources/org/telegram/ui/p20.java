package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ v50 b;

    public /* synthetic */ p20(v50 v50Var, int i10) {
        this.a = i10;
        this.b = v50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                v50.u(this.b, tLObject);
                break;
            default:
                v50.s(this.b, tLObject);
                break;
        }
    }
}
