package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb0 b;

    public /* synthetic */ pb0(wb0 wb0Var, int i10) {
        this.a = i10;
        this.b = wb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wb0 wb0Var = this.b;
                if (wb0Var.h >= 0) {
                    ConnectionsManager.getInstance(wb0Var.b).cancelRequest(wb0Var.h, true);
                    wb0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
