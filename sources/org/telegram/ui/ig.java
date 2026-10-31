package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ig(un unVar, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                unVar.getClass();
                unVar.presentFragment(un.ha(this.c.id));
                break;
            default:
                this.b.Ca(this.c);
                break;
        }
    }
}
