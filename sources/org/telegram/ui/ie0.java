package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ie0(ke0 ke0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = ke0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fe0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new fe0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
