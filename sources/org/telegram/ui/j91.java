package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j91 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ na1 b;

    public /* synthetic */ j91(na1 na1Var, int i10) {
        this.a = i10;
        this.b = na1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                na1.U(this.b, tLObject);
                break;
            default:
                na1.V(this.b, tLObject);
                break;
        }
    }
}
