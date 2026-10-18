package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ kg(sn snVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                snVar.getClass();
                snVar.presentFragment(sn.W9(this.c.id));
                break;
            default:
                this.b.ra(this.c);
                break;
        }
    }
}
