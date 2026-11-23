package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u50 b;

    public /* synthetic */ s50(u50 u50Var, int i7) {
        this.a = i7;
        this.b = u50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new g(this.b, tL_error, tLObject, 15));
                break;
            default:
                org.telegram.messenger.g0.g3(new ou(16, this.b, tL_error));
                break;
        }
    }
}
