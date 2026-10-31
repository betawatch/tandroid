package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class mi implements Runnable {
    public final /* synthetic */ ui a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;
    public final /* synthetic */ int n;

    public /* synthetic */ mi(ui uiVar, long j10, boolean z10, int i10, int i11, int i12, long j11, int i13) {
        this.a = uiVar;
        this.b = j10;
        this.c = z10;
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = j11;
        this.n = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i10;
        long j11 = this.b;
        boolean C = o5.C(j11);
        boolean z10 = this.c;
        int i11 = this.d;
        int i12 = this.e;
        boolean z11 = z10 && (i11 == -1 || (i11 == 0 && i12 == 2)) && !C;
        ui uiVar = this.a;
        long j12 = j11;
        int i13 = i12;
        long j13 = this.h;
        if (z11 || (this.f == 1 && !C)) {
            uiVar.d0(i13, this.n, j12, j13, false);
        }
        if (z11) {
            return;
        }
        if (z10) {
            j10 = j13;
            i10 = i11;
        } else {
            i10 = i11;
            uiVar.H1(j12, j13, i13, i10);
            j10 = j13;
            j12 = j12;
            i13 = i13;
        }
        uiVar.getNotificationCenter().k(zs.W, Long.valueOf(j12), Long.valueOf(j10), Integer.valueOf((z10 && i10 == -1) ? 0 : i10), Boolean.valueOf(z10), Integer.valueOf(i13));
    }
}
