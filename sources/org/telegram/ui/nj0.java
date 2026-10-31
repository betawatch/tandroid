package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bs b;

    public /* synthetic */ nj0(bs bsVar, int i10) {
        this.a = i10;
        this.b = bsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C(1.0f);
                break;
            default:
                this.b.C(1.0f);
                break;
        }
    }
}
