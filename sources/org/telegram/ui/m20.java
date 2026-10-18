package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m20 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ m20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                s50.w(this.b, tLObject);
                break;
            default:
                s50.t(this.b, tLObject);
                break;
        }
    }
}
