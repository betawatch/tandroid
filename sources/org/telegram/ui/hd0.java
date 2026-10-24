package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hd0(rd0 rd0Var, String str, int i10) {
        this.a = i10;
        this.b = rd0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jd0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jd0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
