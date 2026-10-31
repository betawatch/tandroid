package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class in implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;
    public final /* synthetic */ int c;

    public /* synthetic */ in(q0.a aVar, int i10, int i11) {
        this.a = i11;
        this.b = aVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.accept(Integer.valueOf(this.c));
                break;
            default:
                this.b.accept(Integer.valueOf(this.c));
                break;
        }
    }
}
