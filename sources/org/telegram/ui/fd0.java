package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class fd0 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd0 b;

    public /* synthetic */ fd0(gd0 gd0Var, int i7) {
        this.a = i7;
        this.b = gd0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new hz(this, 26));
                break;
            default:
                if (this.b.T != null) {
                    org.telegram.messenger.g0.h3(new hz(this, 27));
                    break;
                }
                break;
        }
    }
}
