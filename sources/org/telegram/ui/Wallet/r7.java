package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y10 b;

    public /* synthetic */ r7(y10 y10Var, int i7) {
        this.a = i7;
        this.b = y10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a("Wallet engine is closed");
                break;
            case 1:
                this.b.a(null);
                break;
            default:
                this.b.a(null);
                break;
        }
    }
}
