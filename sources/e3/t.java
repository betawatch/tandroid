package e3;

import g2.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class t implements b0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ t(Object obj, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
    }

    @Override // e3.b0
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

    @Override // e3.b0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // e3.b0
    public final a0 f(long j10) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.c;
                uVar.k.getClass();
                tf.b bVar = uVar.k;
                long[] jArr = (long[]) bVar.a;
                long[] jArr2 = (long[]) bVar.b;
                int f10 = n0.f(jArr, n0.j((uVar.e * j10) / 1000000, 0L, uVar.j - 1), false);
                long j11 = f10 == -1 ? 0L : jArr[f10];
                long j12 = f10 != -1 ? jArr2[f10] : 0L;
                int i3 = uVar.e;
                long j13 = (j11 * 1000000) / i3;
                long j14 = this.b;
                c0 c0Var = new c0(j13, j12 + j14);
                if (j13 == j10 || f10 == jArr.length - 1) {
                    return new a0(c0Var, c0Var);
                }
                int i10 = f10 + 1;
                return new a0(c0Var, new c0((jArr[i10] * 1000000) / i3, j14 + jArr2[i10]));
            case 1:
                return (a0) this.c;
            default:
                g3.b bVar2 = (g3.b) this.c;
                a0 b10 = bVar2.i[0].b(j10);
                int i11 = 1;
                while (true) {
                    g3.e[] eVarArr = bVar2.i;
                    if (i11 >= eVarArr.length) {
                        return b10;
                    }
                    a0 b11 = eVarArr[i11].b(j10);
                    if (b11.a.b < b10.a.b) {
                        b10 = b11;
                    }
                    i11++;
                }
        }
    }

    @Override // e3.b0
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
