package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
