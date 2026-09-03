package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ff(zn znVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn.o0(this.b, this.c, this.d);
                break;
            default:
                zn.k1(this.b, this.c, this.d);
                break;
        }
    }
}
