package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w91 b;

    public /* synthetic */ o81(w91 w91Var, int i10) {
        this.a = i10;
        this.b = w91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                w91.W(this.b, tLObject);
                break;
            default:
                w91.V(this.b, tLObject);
                break;
        }
    }
}
