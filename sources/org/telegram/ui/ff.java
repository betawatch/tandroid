package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ff(un unVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un.E0(this.b, this.c, this.d);
                break;
            default:
                un.h0(this.b, this.c, this.d);
                break;
        }
    }
}
