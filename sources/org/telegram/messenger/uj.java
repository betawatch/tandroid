package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ uj(int i7, long j3, long j10, mp mpVar) {
        this.a = 2;
        this.b = mpVar;
        this.d = j3;
        this.e = j10;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z(this.d, this.c, this.e);
                break;
            case 1:
                this.b.z(this.d, this.c, this.e);
                break;
            default:
                long j3 = this.e;
                this.b.q0(this.d, this.c, j3);
                break;
        }
    }

    public /* synthetic */ uj(mp mpVar, int i7, long j3, long j10, int i10) {
        this.a = i10;
        this.b = mpVar;
        this.c = i7;
        this.d = j3;
        this.e = j10;
    }
}
