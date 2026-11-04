package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class js implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ js(us usVar, long j10, long j11, int i3) {
        this.a = i3;
        this.b = usVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                us usVar = this.b;
                usVar.G = this.c;
                usVar.H = this.d;
                break;
            default:
                this.b.o(this.c, this.d);
                break;
        }
    }
}
