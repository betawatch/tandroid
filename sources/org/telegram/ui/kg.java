package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ kg(un unVar, TLRPC.User user, int i10) {
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
                unVar.presentFragment(un.ma(this.c.id));
                break;
            default:
                this.b.Ha(this.c);
                break;
        }
    }
}
