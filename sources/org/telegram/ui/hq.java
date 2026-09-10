package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq b;
    public final /* synthetic */ long c;

    public /* synthetic */ hq(rq rqVar, long j3, int i10) {
        this.a = i10;
        this.b = rqVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                rq rqVar = this.b;
                rqVar.n = j3;
                rqVar.r = true;
                rqVar.n0();
                break;
            default:
                rq.Z(this.b, this.c);
                break;
        }
    }
}
