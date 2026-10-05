package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ pf0(xf0 xf0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = xf0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                xf0 xf0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new h90(21, xf0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new nf0(xf0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0(this.b, tL_error, this.c, tLObject, 20));
                break;
        }
    }
}
