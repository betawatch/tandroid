// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class edc implements ez9 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    public edc(long[] jArr, long[] jArr2, long j, long j2, long j3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = cue.a(j3 - j2, j);
    }

    @Override // ez9
    public final long a() {
        return this.e;
    }

    @Override // ez9
    public final long b() {
        return this.d;
    }

    @Override // zy9
    public final boolean c() {
        return true;
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        long[] jArr = this.a;
        int f = gcc.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        bz9 bz9Var = new bz9(j2, jArr2[f]);
        if (j2 >= j || f == jArr.length - 1) {
            return new yy9(bz9Var, bz9Var);
        }
        int i = f + 1;
        return new yy9(bz9Var, new bz9(jArr[i], jArr2[i]));
    }

    @Override // ez9
    public final long f(long j) {
        return this.a[gcc.f(this.b, j, true)];
    }

    @Override // ez9
    public final int g() {
        return this.f;
    }

    @Override // zy9
    public final long h() {
        return this.c;
    }
}
