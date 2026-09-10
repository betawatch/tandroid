package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ kf(eo eoVar, long j3, long j10, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo.o0(this.b, this.c, this.d);
                break;
            default:
                eo.k1(this.b, this.c, this.d);
                break;
        }
    }
}
