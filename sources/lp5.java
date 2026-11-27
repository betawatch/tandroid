// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lp5 implements zy9 {
    public final ed a;
    public final ed b;
    public long c;

    public lp5(long j, long[] jArr, long[] jArr2) {
        ed edVar;
        ed edVar2;
        yve.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            edVar = new ed(length, (byte) 9);
            this.a = edVar;
            edVar2 = new ed(length, (byte) 9);
            this.b = edVar2;
        } else {
            int i = length + 1;
            edVar = new ed(i, (byte) 9);
            this.a = edVar;
            edVar2 = new ed(i, (byte) 9);
            this.b = edVar2;
            edVar.W(0L);
            edVar2.W(0L);
        }
        edVar.Y(jArr);
        edVar2.Y(jArr2);
        this.c = j;
    }

    @Override // zy9
    public final boolean c() {
        return this.b.b > 0;
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        ed edVar = this.b;
        if (edVar.b == 0) {
            bz9 bz9Var = bz9.c;
            return new yy9(bz9Var, bz9Var);
        }
        int c = gcc.c(edVar, j);
        long h0 = edVar.h0(c);
        ed edVar2 = this.a;
        bz9 bz9Var2 = new bz9(h0, edVar2.h0(c));
        if (h0 == j || c == edVar.b - 1) {
            return new yy9(bz9Var2, bz9Var2);
        }
        int i = c + 1;
        return new yy9(bz9Var2, new bz9(edVar.h0(i), edVar2.h0(i)));
    }

    @Override // zy9
    public final long h() {
        return this.c;
    }

    public final void i(long j, long j2) {
        ed edVar = this.b;
        int i = edVar.b;
        ed edVar2 = this.a;
        if (i == 0 && j > 0) {
            edVar2.W(0L);
            edVar.W(0L);
        }
        edVar2.W(j2);
        edVar.W(j);
    }
}
