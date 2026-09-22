package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;

    public /* synthetic */ i00(f10 f10Var, int i10) {
        this.a = i10;
        this.b = f10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kw(10, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
