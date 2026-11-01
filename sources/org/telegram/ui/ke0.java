package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ke0 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ ke0(le0 le0Var, int i10) {
        this.a = i10;
        this.b = le0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new yy(this, 26));
                break;
            default:
                if (this.b.T != null) {
                    org.telegram.messenger.i0.g3(new yy(this, 27));
                    break;
                }
                break;
        }
    }
}
