package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ go0 b;

    public /* synthetic */ fn0(go0 go0Var, int i10) {
        this.a = i10;
        this.b = go0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zg0(15, this.b, tL_error));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new en0(this.b, tL_error, tLObject, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ym0(this.b, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ym0(this.b, tLObject, 0));
                break;
        }
    }
}
