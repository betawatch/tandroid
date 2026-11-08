package org.telegram.messenger;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ni implements Runnable {
    public final /* synthetic */ ui a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long h;
    public final /* synthetic */ int n;

    public /* synthetic */ ni(ui uiVar, long j3, boolean z9, int i7, int i10, int i11, long j10, int i12) {
        this.a = uiVar;
        this.b = j3;
        this.c = z9;
        this.d = i7;
        this.e = i10;
        this.f = i11;
        this.h = j10;
        this.n = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        int i7;
        long j10 = this.b;
        boolean C = m5.C(j10);
        boolean z9 = this.c;
        int i10 = this.d;
        int i11 = this.e;
        boolean z10 = z9 && (i10 == -1 || (i10 == 0 && i11 == 2)) && !C;
        ui uiVar = this.a;
        long j11 = j10;
        int i12 = i11;
        long j12 = this.h;
        if (z10 || (this.f == 1 && !C)) {
            uiVar.d0(i12, this.n, j11, j12, false);
        }
        if (z10) {
            return;
        }
        if (z9) {
            j3 = j12;
            i7 = i10;
        } else {
            i7 = i10;
            uiVar.H1(j11, j12, i12, i7);
            j3 = j12;
            j11 = j11;
            i12 = i12;
        }
        uiVar.getNotificationCenter().k(qs.W, Long.valueOf(j11), Long.valueOf(j3), Integer.valueOf((z9 && i7 == -1) ? 0 : i7), Boolean.valueOf(z9), Integer.valueOf(i12));
    }
}
