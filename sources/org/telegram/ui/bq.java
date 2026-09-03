package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq b;
    public final /* synthetic */ long c;

    public /* synthetic */ bq(lq lqVar, long j10, int i10) {
        this.a = i10;
        this.b = lqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                lq lqVar = this.b;
                lqVar.n = j10;
                lqVar.r = true;
                lqVar.n0();
                break;
            default:
                lq.Z(this.b, this.c);
                break;
        }
    }
}
