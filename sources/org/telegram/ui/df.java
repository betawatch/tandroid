package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ df(xn xnVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn.o0(this.b, this.c, this.d);
                break;
            default:
                xn.k1(this.b, this.c, this.d);
                break;
        }
    }
}
