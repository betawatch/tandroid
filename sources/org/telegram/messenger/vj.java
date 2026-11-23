package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ vj(int i7, long j3, long j10, np npVar) {
        this.a = 2;
        this.b = npVar;
        this.d = j3;
        this.e = j10;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z(this.d, this.c, this.e);
                break;
            case 1:
                this.b.z(this.d, this.c, this.e);
                break;
            default:
                long j3 = this.e;
                this.b.q0(this.d, this.c, j3);
                break;
        }
    }

    public /* synthetic */ vj(np npVar, int i7, long j3, long j10, int i10) {
        this.a = i10;
        this.b = npVar;
        this.c = i7;
        this.d = j3;
        this.e = j10;
    }
}
