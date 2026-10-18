package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d70 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f70 b;

    public /* synthetic */ d70(f70 f70Var, int i10) {
        this.a = i10;
        this.b = f70Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lg(this.b, tL_error, tLObject, 10));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yt(17, this.b, tL_error));
                break;
        }
    }
}
