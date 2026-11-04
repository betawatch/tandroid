package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cd0 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;

    public /* synthetic */ cd0(dd0 dd0Var, int i3) {
        this.a = i3;
        this.b = dd0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new fz(this, 25));
                break;
            default:
                if (this.b.U != null) {
                    org.telegram.messenger.g0.h3(new fz(this, 26));
                    break;
                }
                break;
        }
    }
}
