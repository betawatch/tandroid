package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ns(ys ysVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = ysVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ys ysVar = this.b;
                ysVar.G = this.c;
                ysVar.H = this.d;
                break;
            default:
                this.b.o(this.c, this.d);
                break;
        }
    }
}
