package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
