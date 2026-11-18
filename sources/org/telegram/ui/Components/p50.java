package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ p50(r50 r50Var, int i7) {
        this.a = i7;
        this.b = r50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new k7((Object) this.b, (Object) tL_error, (Object) tLObject, 14));
                break;
            default:
                org.telegram.messenger.g0.g3(new dw(14, this.b, tL_error));
                break;
        }
    }
}
