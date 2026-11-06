package org.telegram.ui.Wallet;

import c8.va;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ s0(String str, int i7) {
        this.a = i7;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w0 w0Var = va.b;
                if (w0Var != null) {
                    if (this.b.equals(w0Var.d)) {
                        va.b.c("STORAGE_CANCELED");
                        va.b.e();
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.g(this.b);
                break;
        }
    }
}
