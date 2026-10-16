package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo b;

    public /* synthetic */ po(zo zoVar, int i10) {
        this.a = i10;
        this.b = zoVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ro(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ro(this.b, 4));
                break;
        }
    }
}
