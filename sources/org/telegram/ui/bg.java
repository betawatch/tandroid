package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
