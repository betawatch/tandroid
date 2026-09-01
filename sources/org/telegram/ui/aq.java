package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq b;
    public final /* synthetic */ long c;

    public /* synthetic */ aq(kq kqVar, long j10, int i10) {
        this.a = i10;
        this.b = kqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                kq kqVar = this.b;
                kqVar.n = j10;
                kqVar.r = true;
                kqVar.n0();
                break;
            default:
                kq.Z(this.b, this.c);
                break;
        }
    }
}
