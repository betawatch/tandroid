package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ct implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ct(pt ptVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = ptVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pt ptVar = this.b;
                ptVar.F = this.c;
                ptVar.G = this.d;
                break;
            default:
                this.b.o(this.c, this.d);
                break;
        }
    }
}
