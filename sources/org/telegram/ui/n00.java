package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n00 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k10 b;

    public /* synthetic */ n00(k10 k10Var, int i10) {
        this.a = i10;
        this.b = k10Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n51(27, this.b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new br(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
