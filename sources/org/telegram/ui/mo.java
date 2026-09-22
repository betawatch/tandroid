package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;

    public /* synthetic */ mo(wo woVar, int i10) {
        this.a = i10;
        this.b = woVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new oo(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new oo(this.b, 4));
                break;
        }
    }
}
