package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ef(un unVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un.Z(this.b, this.c, this.d);
                break;
            default:
                un.k1(this.b, this.c, this.d);
                break;
        }
    }
}
