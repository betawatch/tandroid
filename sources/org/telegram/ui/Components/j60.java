package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;

    public /* synthetic */ j60(l60 l60Var, int i10) {
        this.a = i10;
        this.b = l60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(this.b, tL_error, tLObject, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zu(16, this.b, tL_error));
                break;
        }
    }
}
