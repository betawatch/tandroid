package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ bg(sn snVar, TLRPC.User user, int i10) {
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
