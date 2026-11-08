package org.telegram.messenger;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ vk(int i7, long j3, long j10, qp qpVar) {
        this.a = 1;
        this.b = qpVar;
        this.c = j3;
        this.d = j10;
        this.e = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z(this.c, this.e, this.d);
                break;
            case 1:
                long j3 = this.d;
                this.b.p0(this.c, this.e, j3);
                break;
            default:
                this.b.z(this.c, this.e, this.d);
                break;
        }
    }

    public /* synthetic */ vk(qp qpVar, int i7, long j3, long j10, int i10) {
        this.a = i10;
        this.b = qpVar;
        this.e = i7;
        this.c = j3;
        this.d = j10;
    }
}
