package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h60 b;

    public /* synthetic */ f60(h60 h60Var, int i10) {
        this.a = i10;
        this.b = h60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g(this.b, tL_error, tLObject, 13));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gt(19, this.b, tL_error));
                break;
        }
    }
}
