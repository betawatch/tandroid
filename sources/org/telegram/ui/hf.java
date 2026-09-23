package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ hf(xn xnVar, long j3, long j10, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn.p0(this.b, this.c, this.d);
                break;
            default:
                xn.k1(this.b, this.c, this.d);
                break;
        }
    }
}
