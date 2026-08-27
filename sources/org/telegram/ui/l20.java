package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ l20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                s50.v(this.b, tLObject);
                break;
            default:
                s50.t(this.b, tLObject);
                break;
        }
    }
}
