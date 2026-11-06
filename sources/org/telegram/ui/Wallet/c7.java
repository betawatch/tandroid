package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ c7(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
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
