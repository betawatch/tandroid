package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ hf(bo boVar, long j3, long j10, int i10) {
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
