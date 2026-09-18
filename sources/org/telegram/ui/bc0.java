package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
