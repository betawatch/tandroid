package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lf0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ df0(lf0 lf0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = lf0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                lf0 lf0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new kb0(11, lf0Var, tL_error));
                        break;
                    }
                } else {
                    Bundle bundle = this.c;
                    AndroidUtilities.runOnUIThread(new ne0(lf0Var, bundle, tLObject, false, 4));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(this.b, tL_error, this.c, tLObject, 27));
                break;
        }
    }
}
