package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;
    public final /* synthetic */ long c;

    public /* synthetic */ gq(qq qqVar, long j3, int i10) {
        this.a = i10;
        this.b = qqVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j3 = this.c;
                qq qqVar = this.b;
                qqVar.n = j3;
                qqVar.r = true;
                qqVar.n0();
                break;
            default:
                qq.Z(this.b, this.c);
                break;
        }
    }
}
