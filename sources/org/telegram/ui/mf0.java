package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ uf0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ mf0(uf0 uf0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = uf0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                uf0 uf0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new ia0(18, uf0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new kf0(uf0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0(this.b, tL_error, this.c, tLObject, 20));
                break;
        }
    }
}
