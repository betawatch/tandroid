package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz b;

    public /* synthetic */ oy(hz hzVar, int i7) {
        this.a = i7;
        this.b = hzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(19, this.b, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new tp(this.b, tL_error, tLObject, 6));
                break;
        }
    }
}
