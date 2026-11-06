package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;
    public final /* synthetic */ long c;

    public /* synthetic */ bp(kp kpVar, long j3, int i7) {
        this.a = i7;
        this.b = kpVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                kp kpVar = this.b;
                kpVar.n = j3;
                kpVar.r = true;
                kpVar.s0();
                break;
            default:
                kp.e0(this.b, this.c);
                break;
        }
    }
}
