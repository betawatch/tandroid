package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                AndroidUtilities.runOnUIThread(new cu(14, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new vq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
