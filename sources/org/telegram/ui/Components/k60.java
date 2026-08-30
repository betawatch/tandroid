package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m60 b;

    public /* synthetic */ k60(m60 m60Var, int i10) {
        this.a = i10;
        this.b = m60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hp((Object) this.b, (Object) tL_error, tLObject, 6));
                break;
            default:
                AndroidUtilities.runOnUIThread(new il(28, this.b, tL_error));
                break;
        }
    }
}
