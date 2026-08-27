package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ jg(rn rnVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                rnVar.getClass();
                rnVar.presentFragment(rn.R9(this.c.id));
                break;
            default:
                this.b.ma(this.c);
                break;
        }
    }
}
