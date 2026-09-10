package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h10 b;

    public /* synthetic */ k00(h10 h10Var, int i10) {
        this.a = i10;
        this.b = h10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uv(13, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
