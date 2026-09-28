package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq b;
    public final /* synthetic */ long c;

    public /* synthetic */ aq(kq kqVar, long j3, int i10) {
        this.a = i10;
        this.b = kqVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                kq kqVar = this.b;
                kqVar.n = j3;
                kqVar.r = true;
                kqVar.n0();
                break;
            default:
                kq.Z(this.b, this.c);
                break;
        }
    }
}
