package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ yh0 b;

    public /* synthetic */ hh0(yh0 yh0Var, int i10) {
        this.a = i10;
        this.b = yh0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mh0(this.b, tL_error, tLObject, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new r80(28, this.b, tL_error));
                break;
        }
    }
}
