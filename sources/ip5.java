// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ip5 implements ix9 {
    public final de a;
    public final de b;
    public long c;

    public ip5(long j, long[] jArr, long[] jArr2) {
        de deVar;
        de deVar2;
        jte.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            deVar = new de(length, (byte) 9);
            this.a = deVar;
            deVar2 = new de(length, (byte) 9);
            this.b = deVar2;
        } else {
            int i = length + 1;
            deVar = new de(i, (byte) 9);
            this.a = deVar;
            deVar2 = new de(i, (byte) 9);
            this.b = deVar2;
            deVar.W(0L);
            deVar2.W(0L);
        }
        deVar.Y(jArr);
        deVar2.Y(jArr2);
        this.c = j;
    }

    @Override // ix9
    public final boolean c() {
        return this.b.b > 0;
    }

    @Override // ix9
    public final boolean d() {
        return false;
    }

    @Override // ix9
    public final hx9 f(long j) {
        de deVar = this.b;
        if (deVar.b == 0) {
            kx9 kx9Var = kx9.c;
            return new hx9(kx9Var, kx9Var);
        }
        int c = hac.c(deVar, j);
        long g0 = deVar.g0(c);
        de deVar2 = this.a;
        kx9 kx9Var2 = new kx9(g0, deVar2.g0(c));
        if (g0 == j || c == deVar.b - 1) {
            return new hx9(kx9Var2, kx9Var2);
        }
        int i = c + 1;
        return new hx9(kx9Var2, new kx9(deVar.g0(i), deVar2.g0(i)));
    }

    @Override // ix9
    public final long h() {
        return this.c;
    }

    public final void i(long j, long j2) {
        de deVar = this.b;
        int i = deVar.b;
        de deVar2 = this.a;
        if (i == 0 && j > 0) {
            deVar2.W(0L);
            deVar.W(0L);
        }
        deVar2.W(j2);
        deVar.W(j);
    }
}
