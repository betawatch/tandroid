package j$.util.stream;

/* loaded from: classes2.dex */
final class L3 extends i2 implements a4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ M3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L3(M3 m3, m2 m2Var, boolean z) {
        super(m2Var);
        this.e = m3;
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
                    this.a.accept((m2) obj);
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
        this.a.accept((m2) obj);
    }

    @Override // j$.util.stream.a4
    public final long f() {
        return this.b;
    }
}
