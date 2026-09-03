package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                AndroidUtilities.runOnUIThread(new xc(3, this.b, tLObject));
                break;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ed(this.b, 3));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new xc(1, this.b, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new s1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
