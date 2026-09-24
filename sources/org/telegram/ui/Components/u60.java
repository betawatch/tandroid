package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w60 b;

    public /* synthetic */ u60(w60 w60Var, int i10) {
        this.a = i10;
        this.b = w60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.b, tL_error, tLObject, 22));
                break;
            default:
                AndroidUtilities.runOnUIThread(new cv(16, this.b, tL_error));
                break;
        }
    }
}
