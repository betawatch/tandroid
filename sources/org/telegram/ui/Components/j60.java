package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
