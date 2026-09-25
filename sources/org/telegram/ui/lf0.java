package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ lf0(tf0 tf0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = tf0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                tf0 tf0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new n80(23, tf0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new jf0(tf0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0(this.b, tL_error, this.c, tLObject, 21));
                break;
        }
    }
}
