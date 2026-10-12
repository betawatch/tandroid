package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class h70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;

    public /* synthetic */ h70(j70 j70Var, int i10) {
        this.a = i10;
        this.b = j70Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n2.h(this.b, tL_error, tLObject, 28));
                break;
            default:
                AndroidUtilities.runOnUIThread(new f60(3, this.b, tL_error));
                break;
        }
    }
}
