package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pq b;
    public final /* synthetic */ long c;

    public /* synthetic */ fq(pq pqVar, long j3, int i10) {
        this.a = i10;
        this.b = pqVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                pq pqVar = this.b;
                pqVar.n = j3;
                pqVar.r = true;
                pqVar.n0();
                break;
            default:
                pq.Z(this.b, this.c);
                break;
        }
    }
}
