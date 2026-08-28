package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb0 b;

    public /* synthetic */ db0(kb0 kb0Var, int i9) {
        this.a = i9;
        this.b = kb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kb0 kb0Var = this.b;
                if (kb0Var.h >= 0) {
                    ConnectionsManager.getInstance(kb0Var.b).cancelRequest(kb0Var.h, true);
                    kb0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
