package j$.util.stream;

/* loaded from: classes2.dex */
public final class f8 extends f5 implements o8 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ e8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(e8 e8Var, j5 j5Var, boolean z4) {
        super(j5Var);
        this.e = e8Var;
        this.d = z4;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z4;
        boolean z10;
        if (!this.c) {
            boolean test = this.e.t.test(obj);
            this.c = !test;
            if (test) {
                z4 = false;
                z10 = this.d;
                if (z10 && !z4) {
                    this.b++;
                }
                if (!z10 || z4) {
                    this.a.accept((j5) obj);
                }
                return;
            }
        }
        z4 = true;
        z10 = this.d;
        if (z10) {
            this.b++;
        }
        if (z10) {
        }
        this.a.accept((j5) obj);
    }

    @Override // j$.util.stream.o8
    public final long s() {
        return this.b;
    }
}
