package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
