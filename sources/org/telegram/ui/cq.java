package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
