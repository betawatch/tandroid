package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ md b;

    public /* synthetic */ dd(md mdVar, int i10) {
        this.a = i10;
        this.b = mdVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h0(19, this.b, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new h0(17, this.b, tL_error));
                break;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new cd(this.b, 3));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new s1(this.b, tL_error, tLObject, 11));
                break;
        }
    }
}
