package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ mk(int i3, long j10, long j11, hp hpVar) {
        this.a = 1;
        this.b = hpVar;
        this.c = j10;
        this.d = j11;
        this.e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z(this.c, this.e, this.d);
                break;
            case 1:
                long j10 = this.d;
                this.b.p0(this.c, this.e, j10);
                break;
            default:
                this.b.z(this.c, this.e, this.d);
                break;
        }
    }

    public /* synthetic */ mk(hp hpVar, int i3, long j10, long j11, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.e = i3;
        this.c = j10;
        this.d = j11;
    }
}
