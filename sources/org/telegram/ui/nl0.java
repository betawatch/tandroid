package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm0 b;

    public /* synthetic */ nl0(xm0 xm0Var, int i10) {
        this.a = i10;
        this.b = xm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xe0(this.b, tL_error, tLObject, 11));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new yg0(12, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new jl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yg0(11, this.b, tLObject));
                break;
        }
    }
}
