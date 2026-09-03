package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf0 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ kf0(sf0 sf0Var, Bundle bundle, int i10) {
        this.a = i10;
        this.b = sf0Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                sf0 sf0Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new ue0(4, sf0Var, tL_error));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new if0(sf0Var, this.c, tLObject, 1));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new b30(this.b, tL_error, this.c, tLObject));
                break;
        }
    }
}
