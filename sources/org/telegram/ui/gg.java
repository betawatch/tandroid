package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ gg(bn bnVar, TLRPC.User user, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                bnVar.getClass();
                bnVar.presentFragment(bn.ua(this.c.id));
                break;
            default:
                this.b.Pa(this.c);
                break;
        }
    }
}
