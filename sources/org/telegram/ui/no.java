package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;

    public /* synthetic */ no(xo xoVar, int i10) {
        this.a = i10;
        this.b = xoVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new po(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new po(this.b, 4));
                break;
        }
    }
}
