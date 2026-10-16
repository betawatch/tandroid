package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ ao0(ap0 ap0Var, int i10) {
        this.a = i10;
        this.b = ap0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new se0(27, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new zn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new tn0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tn0(this.b, tLObject, 0));
                break;
        }
    }
}
