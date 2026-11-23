package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
