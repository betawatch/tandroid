package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ ll0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bf0(this.b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ff0(16, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ff0(15, this.b, tLObject));
                break;
        }
    }
}
