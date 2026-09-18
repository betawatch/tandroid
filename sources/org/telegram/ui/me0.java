package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ oe0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ me0(oe0 oe0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = oe0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new je0(this.b, tL_error, this.c, this.d, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new je0(this.b, tL_error, tLObject, this.c, this.d));
                break;
        }
    }
}
