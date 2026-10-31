package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class le0 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ le0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new zy(this, 26));
                break;
            default:
                if (this.b.T != null) {
                    org.telegram.messenger.i0.g3(new zy(this, 27));
                    break;
                }
                break;
        }
    }
}
