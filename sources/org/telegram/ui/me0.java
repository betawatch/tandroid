package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf0 b;

    public /* synthetic */ me0(cf0 cf0Var, int i7) {
        this.a = i7;
        this.b = cf0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new re0(this.b, tL_error, tLObject, 0));
                break;
            default:
                org.telegram.messenger.g0.h3(new jd0(4, this.b, tL_error));
                break;
        }
    }
}
