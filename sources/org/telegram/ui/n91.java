package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class n91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ va1 b;

    public /* synthetic */ n91(va1 va1Var, int i10) {
        this.a = i10;
        this.b = va1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                va1.T(this.b, tLObject);
                break;
            default:
                va1.S(this.b, tLObject);
                break;
        }
    }
}
