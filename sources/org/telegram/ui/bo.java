package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ko b;

    public /* synthetic */ bo(ko koVar, int i10) {
        this.a = i10;
        this.b = koVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new eo(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new eo(this.b, 4));
                break;
        }
    }
}
