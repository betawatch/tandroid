package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i00 b;

    public /* synthetic */ mz(i00 i00Var, int i10) {
        this.a = i10;
        this.b = i00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i00.Z(this.b);
                break;
            default:
                i00.a0(this.b);
                break;
        }
    }
}
