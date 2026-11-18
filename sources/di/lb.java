package di;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
