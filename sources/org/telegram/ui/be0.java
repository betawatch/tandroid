package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ be0(le0 le0Var, String str, int i10) {
        this.a = i10;
        this.b = le0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new de0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new de0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
