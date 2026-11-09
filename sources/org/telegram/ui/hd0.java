package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hd0 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;

    public /* synthetic */ hd0(id0 id0Var, int i7) {
        this.a = i7;
        this.b = id0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new jz(this, 26));
                break;
            default:
                if (this.b.T != null) {
                    org.telegram.messenger.g0.h3(new jz(this, 27));
                    break;
                }
                break;
        }
    }
}
