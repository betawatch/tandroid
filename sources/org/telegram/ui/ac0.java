package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc0 b;

    public /* synthetic */ ac0(gc0 gc0Var, int i10) {
        this.a = i10;
        this.b = gc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc0 gc0Var = this.b;
                if (gc0Var.h >= 0) {
                    ConnectionsManager.getInstance(gc0Var.b).cancelRequest(gc0Var.h, true);
                    gc0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
