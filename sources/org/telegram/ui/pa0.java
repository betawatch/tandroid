package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ua0 b;

    public /* synthetic */ pa0(ua0 ua0Var, int i10) {
        this.a = i10;
        this.b = ua0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
