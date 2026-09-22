package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc0 b;

    public /* synthetic */ bc0(hc0 hc0Var, int i10) {
        this.a = i10;
        this.b = hc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hc0 hc0Var = this.b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
