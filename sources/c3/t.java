package c3;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                pf.b bVar = uVar.k;
                long[] jArr = (long[]) bVar.b;
                long[] jArr2 = (long[]) bVar.c;
                int e7 = e2.d0.e(jArr, e2.d0.i((uVar.e * j3) / 1000000, 0L, uVar.j - 1), false);
                long j10 = e7 == -1 ? 0L : jArr[e7];
                long j11 = e7 != -1 ? jArr2[e7] : 0L;
                int i10 = uVar.e;
                long j12 = (j10 * 1000000) / i10;
                long j13 = this.b;
                c0 c0Var = new c0(j12, j11 + j13);
                if (j12 == j3 || e7 == jArr.length - 1) {
                    return new a0(c0Var, c0Var);
                }
                int i11 = e7 + 1;
                return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j13 + jArr2[i11]));
            case 1:
                return (a0) this.c;
            default:
                e3.b bVar2 = (e3.b) this.c;
                a0 b10 = bVar2.i[0].b(j3);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.i;
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
