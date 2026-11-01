package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ gk(int i10, long j10, long j11, wp wpVar) {
        this.a = 1;
        this.b = wpVar;
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

    public /* synthetic */ gk(wp wpVar, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.b = wpVar;
        this.e = i10;
        this.c = j10;
        this.d = j11;
    }
}
