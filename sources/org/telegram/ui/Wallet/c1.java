package org.telegram.ui.Wallet;

import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f11 b;
    public final /* synthetic */ String c;

    public /* synthetic */ c1(f11 f11Var, String str, int i10) {
        this.a = i10;
        this.b = f11Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
