package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ ll0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ve0(this.b, tL_error, tLObject, 11));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new xg0(12, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new xg0(11, this.b, tLObject));
                break;
        }
    }
}
