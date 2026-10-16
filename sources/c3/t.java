package c3;

import e2.m0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class t implements b0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ t(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // c3.b0
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

    @Override // c3.b0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // c3.b0
    public final a0 f(long j10) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.c;
                uVar.k.getClass();
                qf.b bVar = uVar.k;
                long[] jArr = (long[]) bVar.b;
                long[] jArr2 = (long[]) bVar.c;
                int f7 = m0.f(jArr, m0.j((uVar.e * j10) / 1000000, 0L, uVar.j - 1), false);
                long j11 = f7 == -1 ? 0L : jArr[f7];
                long j12 = f7 != -1 ? jArr2[f7] : 0L;
                int i10 = uVar.e;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.b;
                c0 c0Var = new c0(j13, j12 + j14);
                if (j13 == j10 || f7 == jArr.length - 1) {
                    return new a0(c0Var, c0Var);
                }
                int i11 = f7 + 1;
                return new a0(c0Var, new c0((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
            case 1:
                return (a0) this.c;
            default:
                e3.b bVar2 = (e3.b) this.c;
                a0 b10 = bVar2.i[0].b(j10);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar2.i;
                    if (i12 >= eVarArr.length) {
                        return b10;
                    }
                    a0 b11 = eVarArr[i12].b(j10);
                    if (b11.a.b < b10.a.b) {
                        b10 = b11;
                    }
                    i12++;
                }
        }
    }

    @Override // c3.b0
    public final long h() {
        switch (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(long j10) {
        this(j10, 0L);
        this.a = 1;
    }

    public t(long j10, long j11) {
        this.a = 1;
        this.b = j10;
        c0 c0Var = j11 == 0 ? c0.c : new c0(0L, j11);
        this.c = new a0(c0Var, c0Var);
    }
}
