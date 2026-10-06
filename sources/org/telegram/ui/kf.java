package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ kf(yn ynVar, long j3, long j10, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yn.q0(this.b, this.c, this.d);
                break;
            default:
                yn.k1(this.b, this.c, this.d);
                break;
        }
    }
}
