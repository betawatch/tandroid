package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ fe0(me0 me0Var, int i10, int i11) {
        this.a = i11;
        this.b = me0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new fe0(this.b, this.c, 1));
                break;
            case 1:
                this.b.z(this.c);
                break;
            default:
                this.b.f.f[this.c].C(1.0f);
                break;
        }
    }
}
