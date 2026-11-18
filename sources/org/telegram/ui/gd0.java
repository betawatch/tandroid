package org.telegram.ui;

import java.util.TimerTask;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class gd0 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;

    public /* synthetic */ gd0(hd0 hd0Var, int i7) {
        this.a = i7;
        this.b = hd0Var;
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
