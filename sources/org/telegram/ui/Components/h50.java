package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j50 b;

    public /* synthetic */ h50(j50 j50Var, int i7) {
        this.a = i7;
        this.b = j50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new yf(this.b, tL_error, tLObject, 11));
                break;
            default:
                org.telegram.messenger.g0.h3(new vs(18, this.b, tL_error));
                break;
        }
    }
}
