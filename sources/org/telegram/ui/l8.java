package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ l8(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.l0(false);
                break;
            default:
                this.b.g0();
                break;
        }
    }
}
