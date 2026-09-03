package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ qb0(xb0 xb0Var, int i10) {
        this.a = i10;
        this.b = xb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb0 xb0Var = this.b;
                if (xb0Var.h >= 0) {
                    ConnectionsManager.getInstance(xb0Var.b).cancelRequest(xb0Var.h, true);
                    xb0Var.h = -1;
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
