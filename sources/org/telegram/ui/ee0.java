package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ee0(ge0 ge0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = ge0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new be0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new be0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
