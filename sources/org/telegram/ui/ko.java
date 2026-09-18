package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo b;

    public /* synthetic */ ko(uo uoVar, int i10) {
        this.a = i10;
        this.b = uoVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new mo(this.b, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new mo(this.b, 4));
                break;
        }
    }
}
