package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ kf(bo boVar, long j3, long j10, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo.o0(this.b, this.c, this.d);
                break;
            default:
                bo.k1(this.b, this.c, this.d);
                break;
        }
    }
}
