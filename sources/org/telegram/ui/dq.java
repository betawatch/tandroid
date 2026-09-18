package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq b;
    public final /* synthetic */ long c;

    public /* synthetic */ dq(nq nqVar, long j3, int i10) {
        this.a = i10;
        this.b = nqVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                nq nqVar = this.b;
                nqVar.n = j3;
                nqVar.r = true;
                nqVar.n0();
                break;
            default:
                nq.Z(this.b, this.c);
                break;
        }
    }
}
