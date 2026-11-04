package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ab0(lb0 lb0Var, String str, int i3) {
        this.a = i3;
        this.b = lb0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new cb0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new cb0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
