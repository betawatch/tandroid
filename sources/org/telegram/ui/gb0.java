package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gb0(yb0 yb0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = yb0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                yb0 yb0Var = this.b;
                if (!z10) {
                    yb0Var.b.setVisibility(8);
                    break;
                } else {
                    yb0Var.getClass();
                    break;
                }
            default:
                if (!this.c) {
                    this.b.e.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
