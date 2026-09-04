package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class em0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn0 b;

    public /* synthetic */ em0(pn0 pn0Var, int i10) {
        this.a = i10;
        this.b = pn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pf0(this.b, tL_error, tLObject, 10));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ej0(10, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ej0(9, this.b, tLObject));
                break;
        }
    }
}
