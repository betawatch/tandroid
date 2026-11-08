package f3;

import h2.m0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class t implements c0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ t(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // f3.c0
    public final boolean d() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // f3.c0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.c;
                uVar.k.getClass();
                q4.q qVar = uVar.k;
                long[] jArr = (long[]) qVar.b;
                long[] jArr2 = (long[]) qVar.c;
                int f10 = m0.f(jArr, m0.j((uVar.e * j3) / 1000000, 0L, uVar.j - 1), false);
                long j10 = f10 == -1 ? 0L : jArr[f10];
                long j11 = f10 != -1 ? jArr2[f10] : 0L;
                int i7 = uVar.e;
                long j12 = (j10 * 1000000) / i7;
                long j13 = this.b;
                d0 d0Var = new d0(j12, j11 + j13);
                if (j12 == j3 || f10 == jArr.length - 1) {
                    return new b0(d0Var, d0Var);
                }
                int i10 = f10 + 1;
                return new b0(d0Var, new d0((jArr[i10] * 1000000) / i7, j13 + jArr2[i10]));
            case 1:
                return (b0) this.c;
            default:
                h3.b bVar = (h3.b) this.c;
                b0 b10 = bVar.i[0].b(j3);
                int i11 = 1;
                while (true) {
                    h3.e[] eVarArr = bVar.i;
                    if (i11 >= eVarArr.length) {
                        return b10;
                    }
                    b0 b11 = eVarArr[i11].b(j3);
                    if (b11.a.b < b10.a.b) {
                        b10 = b11;
                    }
                    i11++;
                }
        }
    }

    @Override // f3.c0
    public final long h() {
        switch (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(long j3) {
        this(j3, 0L);
        this.a = 1;
    }

    public t(long j3, long j10) {
        this.a = 1;
        this.b = j3;
        d0 d0Var = j10 == 0 ? d0.c : new d0(0L, j10);
        this.c = new b0(d0Var, d0Var);
    }
}
