package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq b;
    public final /* synthetic */ long c;

    public /* synthetic */ cq(mq mqVar, long j3, int i10) {
        this.a = i10;
        this.b = mqVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                mq mqVar = this.b;
                mqVar.n = j3;
                mqVar.r = true;
                mqVar.n0();
                break;
            default:
                mq.Y(this.b, this.c);
                break;
        }
    }
}
