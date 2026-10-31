package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ fk(int i10, long j10, long j11, vp vpVar) {
        this.a = 1;
        this.b = vpVar;
        this.c = j10;
        this.d = j11;
        this.e = i10;
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

    public /* synthetic */ fk(vp vpVar, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.b = vpVar;
        this.e = i10;
        this.c = j10;
        this.d = j11;
    }
}
