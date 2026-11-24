// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class in5 implements fv9 {
    public final dd a;
    public final dd b;
    public long c;

    public in5(long j, long[] jArr, long[] jArr2) {
        dd ddVar;
        dd ddVar2;
        gre.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            ddVar = new dd(length, (byte) 9);
            this.a = ddVar;
            ddVar2 = new dd(length, (byte) 9);
            this.b = ddVar2;
        } else {
            int i = length + 1;
            ddVar = new dd(i, (byte) 9);
            this.a = ddVar;
            ddVar2 = new dd(i, (byte) 9);
            this.b = ddVar2;
            ddVar.W(0L);
            ddVar2.W(0L);
        }
        ddVar.X(jArr);
        ddVar2.X(jArr2);
        this.c = j;
    }

    @Override // fv9
    public final boolean c() {
        return this.b.b > 0;
    }

    @Override // fv9
    public final boolean d() {
        return false;
    }

    @Override // fv9
    public final ev9 f(long j) {
        dd ddVar = this.b;
        if (ddVar.b == 0) {
            hv9 hv9Var = hv9.c;
            return new ev9(hv9Var, hv9Var);
        }
        int c = g8c.c(ddVar, j);
        long f0 = ddVar.f0(c);
        dd ddVar2 = this.a;
        hv9 hv9Var2 = new hv9(f0, ddVar2.f0(c));
        if (f0 == j || c == ddVar.b - 1) {
            return new ev9(hv9Var2, hv9Var2);
        }
        int i = c + 1;
        return new ev9(hv9Var2, new hv9(ddVar.f0(i), ddVar2.f0(i)));
    }

    @Override // fv9
    public final long h() {
        return this.c;
    }

    public final void i(long j, long j2) {
        dd ddVar = this.b;
        int i = ddVar.b;
        dd ddVar2 = this.a;
        if (i == 0 && j > 0) {
            ddVar2.W(0L);
            ddVar.W(0L);
        }
        ddVar2.W(j2);
        ddVar.W(j);
    }
}
