package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ co0 b;

    public /* synthetic */ en0(co0 co0Var, int i9) {
        this.a = i9;
        this.b = co0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cf0(19, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new dn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new xm0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xm0(this.b, tLObject, 0));
                break;
        }
    }
}
