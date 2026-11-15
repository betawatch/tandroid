package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ jn(qn qnVar, int i7) {
        this.a = i7;
        this.b = qnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new o1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ln(this.b, 1));
                break;
            default:
                org.telegram.messenger.g0.h3(new ln(this.b, 4));
                break;
        }
    }
}
