package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ gf(wn wnVar, long j3, long j10, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn.i0(this.b, this.c, this.d);
                break;
            default:
                wn.b0(this.b, this.c, this.d);
                break;
        }
    }
}
