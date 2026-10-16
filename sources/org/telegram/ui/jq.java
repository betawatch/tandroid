package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
