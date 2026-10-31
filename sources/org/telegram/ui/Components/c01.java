package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f01 b;
    public final /* synthetic */ e01 c;

    public /* synthetic */ c01(f01 f01Var, e01 e01Var, int i10) {
        this.a = i10;
        this.b = f01Var;
        this.c = e01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
