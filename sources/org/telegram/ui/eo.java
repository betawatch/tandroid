package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo b;

    public /* synthetic */ eo(mo moVar, int i10) {
        this.a = i10;
        this.b = moVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new go(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new go(this.b, 4));
                break;
        }
    }
}
