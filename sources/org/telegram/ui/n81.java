package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n81 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r91 b;

    public /* synthetic */ n81(r91 r91Var, int i10) {
        this.a = i10;
        this.b = r91Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                r91.U(this.b, tLObject);
                break;
            default:
                r91.V(this.b, tLObject);
                break;
        }
    }
}
