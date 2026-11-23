package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;

    public /* synthetic */ ik0(ml0 ml0Var, int i7) {
        this.a = i7;
        this.b = ml0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new lk0(this.b, tLObject, 0));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new fe0(17, this.b, tL_error));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new lk0(this.b, tLObject, 2));
                break;
            default:
                org.telegram.messenger.g0.g3(new qk0(this.b, tL_error, tLObject, 0));
                break;
        }
    }
}
