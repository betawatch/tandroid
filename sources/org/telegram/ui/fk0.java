package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ fk0(jl0 jl0Var, int i7) {
        this.a = i7;
        this.b = jl0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ik0(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new jd0(20, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ik0(this.b, tLObject, 2));
                break;
            default:
                org.telegram.messenger.g0.h3(new nk0(this.b, tL_error, tLObject, 0));
                break;
        }
    }
}
