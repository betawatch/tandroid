package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ bf0(jf0 jf0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = jf0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                jf0 jf0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new wb0(10, jf0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new oe0(jf0Var, this.c, tLObject, 3));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(this.b, tL_error, this.c, tLObject, 27));
                break;
        }
    }
}
