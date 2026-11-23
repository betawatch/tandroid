package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl0 b;

    public /* synthetic */ gk0(kl0 kl0Var, int i7) {
        this.a = i7;
        this.b = kl0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new jk0(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new bd0(21, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new jk0(this.b, tLObject, 2));
                break;
            default:
                org.telegram.messenger.g0.g3(new ok0(this.b, tL_error, tLObject, 0));
                break;
        }
    }
}
