package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
