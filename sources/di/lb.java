package di;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ lb(int i7, int i10, long j3, boolean z10) {
        this.a = j3;
        this.b = i7;
        this.c = i10;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3 = this.a;
        int i7 = this.b;
        int i10 = this.c;
        if (j3 != 0) {
            e0.g(i7).p(i10, j3);
        } else {
            x8.y(i7, this.d).V(i10);
        }
    }
}
