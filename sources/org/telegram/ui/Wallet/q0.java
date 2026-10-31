package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ q0(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = w7.k6.b;
                if (u0Var != null) {
                    if (this.b.equals(u0Var.d)) {
                        w7.k6.b.c("STORAGE_CANCELED");
                        w7.k6.b.e();
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.i0.g(this.b);
                break;
        }
    }
}
