package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
