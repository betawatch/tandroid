package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;

    public /* synthetic */ dd(nd ndVar, int i10) {
        this.a = i10;
        this.b = ndVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ed(0, this.b, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(28, this.b, tL_error));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cd(this.b, 3));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
