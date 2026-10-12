package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo b;

    public /* synthetic */ po(zo zoVar, int i10) {
        this.a = i10;
        this.b = zoVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ro(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ro(this.b, 4));
                break;
        }
    }
}
