package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ m2(r2 r2Var, int i10, int i11) {
        this.a = i11;
        this.b = r2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new m2(this.b, this.c, 2));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new m2(this.b, this.c, 3));
                break;
            case 2:
                this.b.c(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
