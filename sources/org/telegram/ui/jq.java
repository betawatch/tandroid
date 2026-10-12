package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tq b;
    public final /* synthetic */ long c;

    public /* synthetic */ jq(tq tqVar, long j10, int i10) {
        this.a = i10;
        this.b = tqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                tq tqVar = this.b;
                tqVar.n = j10;
                tqVar.r = true;
                tqVar.n0();
                break;
            default:
                tq.Z(this.b, this.c);
                break;
        }
    }
}
