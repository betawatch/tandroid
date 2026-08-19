package j$.util.stream;

/* loaded from: classes2.dex */
public final class C3 extends b2 implements P3 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ D3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3(D3 d3, f2 f2Var, boolean z) {
        super(f2Var);
        this.e = d3;
        this.d = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(obj);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept((f2) obj);
                }
                return;
            }
        }
        z = true;
        z2 = this.d;
        if (z2) {
            this.b++;
        }
        if (z2) {
        }
        this.a.accept((f2) obj);
    }

    @Override // j$.util.stream.P3
    public final long m() {
        return this.b;
    }
}
