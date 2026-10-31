package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;

    public /* synthetic */ h1(k1 k1Var, int i10) {
        this.a = i10;
        this.b = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(null, false);
                break;
            default:
                this.b.b(true);
                break;
        }
    }
}
