package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ io0 b;

    public /* synthetic */ in0(io0 io0Var, int i10) {
        this.a = i10;
        this.b = io0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bh0(15, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hn0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bn0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new bn0(this.b, tLObject, 0));
                break;
        }
    }
}
