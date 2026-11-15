package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
