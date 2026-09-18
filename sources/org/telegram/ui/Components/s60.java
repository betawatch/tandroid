package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u60 b;

    public /* synthetic */ s60(u60 u60Var, int i10) {
        this.a = i10;
        this.b = u60Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o(this.b, tL_error, tLObject, 22));
                break;
            default:
                AndroidUtilities.runOnUIThread(new uw(14, this.b, tL_error));
                break;
        }
    }
}
