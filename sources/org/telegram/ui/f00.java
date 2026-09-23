package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c10 b;

    public /* synthetic */ f00(c10 c10Var, int i10) {
        this.a = i10;
        this.b = c10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hw(10, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
