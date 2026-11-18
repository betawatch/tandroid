package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class r7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x10 b;

    public /* synthetic */ r7(x10 x10Var, int i7) {
        this.a = i7;
        this.b = x10Var;
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
