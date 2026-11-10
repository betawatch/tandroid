package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class id0 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd0 b;

    public /* synthetic */ id0(jd0 jd0Var, int i7) {
        this.a = i7;
        this.b = jd0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new kz(this, 26));
                break;
            default:
                if (this.b.T != null) {
                    org.telegram.messenger.g0.h3(new kz(this, 27));
                    break;
                }
                break;
        }
    }
}
