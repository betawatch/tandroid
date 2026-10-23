package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ ol0(an0 an0Var, int i10) {
        this.a = i10;
        this.b = an0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new re0(this.b, tL_error, tLObject, 12));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new bh0(12, this.b, tL_error));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new kl0(this.b, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new bh0(11, this.b, tLObject));
                break;
        }
    }
}
