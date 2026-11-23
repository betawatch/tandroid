package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                org.telegram.messenger.g0.g3(new lz(this, 26));
                break;
            default:
                if (this.b.U != null) {
                    org.telegram.messenger.g0.g3(new lz(this, 27));
                    break;
                }
                break;
        }
    }
}
