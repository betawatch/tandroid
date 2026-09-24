package org.telegram.ui;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
