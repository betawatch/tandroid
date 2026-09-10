package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ dm0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pf0(this.b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ak0(7, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new yl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ak0(6, this.b, tLObject));
                break;
        }
    }
}
