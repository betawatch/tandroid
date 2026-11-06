package bi;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zc implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ zc(int i7, int i10, long j3, boolean z9) {
        this.a = j3;
        this.b = i7;
        this.c = i10;
        this.d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3 = this.a;
        int i7 = this.b;
        int i10 = this.c;
        if (j3 != 0) {
            n0.g(i7).p(i10, j3);
        } else {
            ea.y(i7, this.d).W(i10);
        }
    }
}
