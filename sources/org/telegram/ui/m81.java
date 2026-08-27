package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ q91 b;

    public /* synthetic */ m81(q91 q91Var, int i10) {
        this.a = i10;
        this.b = q91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                q91.U(this.b, tLObject);
                break;
            default:
                q91.V(this.b, tLObject);
                break;
        }
    }
}
