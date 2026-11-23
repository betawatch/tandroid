package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ kn(rn rnVar, int i7) {
        this.a = i7;
        this.b = rnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new o1(this.b, tL_error, tLObject, 27));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new mn(this.b, 1));
                break;
            default:
                org.telegram.messenger.g0.g3(new mn(this.b, 4));
                break;
        }
    }
}
