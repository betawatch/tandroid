package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c00 b;

    public /* synthetic */ b00(c00 c00Var, int i10) {
        this.a = i10;
        this.b = c00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                c00 c00Var = this.b;
                c00Var.b(c00Var.D);
                break;
        }
    }
}
