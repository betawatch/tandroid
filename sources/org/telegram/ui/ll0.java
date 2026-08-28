package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ ll0(wm0 wm0Var, int i9) {
        this.a = i9;
        this.b = wm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ye0(this.b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new cf0(16, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new cf0(15, this.b, tLObject));
                break;
        }
    }
}
