package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi0 b;

    public /* synthetic */ ai0(gi0 gi0Var, int i10) {
        this.a = i10;
        this.b = gi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.v1(this.b.i1);
                break;
            default:
                org.telegram.messenger.i0.J3(this.b.j1.getEditText());
                break;
        }
    }
}
