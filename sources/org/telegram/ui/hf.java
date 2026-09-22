package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ hf(zn znVar, long j3, long j10, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn.j0(this.b, this.c, this.d);
                break;
            default:
                zn.c0(this.b, this.c, this.d);
                break;
        }
    }
}
