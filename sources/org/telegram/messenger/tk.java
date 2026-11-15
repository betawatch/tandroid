package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ tk(int i7, long j3, long j10, np npVar) {
        this.a = 1;
        this.b = npVar;
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

    public /* synthetic */ tk(np npVar, int i7, long j3, long j10, int i10) {
        this.a = i10;
        this.b = npVar;
        this.e = i7;
        this.c = j3;
        this.d = j10;
    }
}
