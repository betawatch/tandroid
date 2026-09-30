package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ b10 b;

    public /* synthetic */ e00(b10 b10Var, int i10) {
        this.a = i10;
        this.b = b10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tt(16, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new sq(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
