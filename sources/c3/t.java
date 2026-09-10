package c3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class t implements b0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ t(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // c3.b0
    public final boolean f() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.c;
                e2.d.h(uVar.k);
                n4.y yVar = uVar.k;
                long[] jArr = (long[]) yVar.b;
                long[] jArr2 = (long[]) yVar.c;
                int e = e2.d0.e(jArr, e2.d0.i((uVar.e * j3) / 1000000, 0L, uVar.j - 1), false);
                long j10 = e == -1 ? 0L : jArr[e];
                long j11 = e != -1 ? jArr2[e] : 0L;
                int i10 = uVar.e;
                long j12 = (j10 * 1000000) / i10;
                long j13 = this.b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 == j3 || e == jArr.length - 1) {
                    return new a0(c0Var, c0Var);
                }
                int i11 = e + 1;
                return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
            case 1:
                return (a0) this.c;
            default:
                e3.b bVar = (e3.b) this.c;
                a0 b10 = bVar.i[0].b(j3);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar.i;
                    if (i12 >= eVarArr.length) {
                        return b10;
                    }
                    a0 b11 = eVarArr[i12].b(j3);
                    if (b11.a.b < b10.a.b) {
                        b10 = b11;
                    }
                    i12++;
                }
        }
    }

    @Override // c3.b0
    public final long l() {
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
        c0 c0Var = j10 == 0 ? c0.c : new c0(0L, j10);
        this.c = new a0(c0Var, c0Var);
    }
}
