package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ m60(o60 o60Var, int i10) {
        this.a = i10;
        this.b = o60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jp((Object) this.b, (Object) tL_error, tLObject, 6));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gm(27, this.b, tL_error));
                break;
        }
    }
}
