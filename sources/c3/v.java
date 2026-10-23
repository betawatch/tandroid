package c3;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public class v implements e0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ v(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // c3.e0
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

    @Override // c3.e0
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return false;
    }

    @Override // c3.e0
    public final d0 f(long j10) {
        switch (this.a) {
            case 0:
                w wVar = (w) this.c;
                wVar.k.getClass();
                n4.s sVar = wVar.k;
                long[] jArr = (long[]) sVar.b;
                long[] jArr2 = (long[]) sVar.c;
                int f7 = e2.m0.f(jArr, e2.m0.j((wVar.e * j10) / 1000000, 0L, wVar.j - 1), false);
                long j11 = f7 == -1 ? 0L : jArr[f7];
                long j12 = f7 != -1 ? jArr2[f7] : 0L;
                int i10 = wVar.e;
                long j13 = (j11 * 1000000) / i10;
                long j14 = this.b;
                f0 f0Var = new f0(j13, j12 + j14);
                if (j13 == j10 || f7 == jArr.length - 1) {
                    return new d0(f0Var, f0Var);
                }
                int i11 = f7 + 1;
                return new d0(f0Var, new f0((jArr[i11] * 1000000) / i10, j14 + jArr2[i11]));
            case 1:
                return (d0) this.c;
            default:
                e3.b bVar = (e3.b) this.c;
                d0 b10 = bVar.i[0].b(j10);
                int i12 = 1;
                while (true) {
                    e3.e[] eVarArr = bVar.i;
                    if (i12 >= eVarArr.length) {
                        return b10;
                    }
                    d0 b11 = eVarArr[i12].b(j10);
                    if (b11.a.b < b10.a.b) {
                        b10 = b11;
                    }
                    i12++;
                }
        }
    }

    @Override // c3.e0
    public final long h() {
        switch (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(long j10) {
        this(j10, 0L);
        this.a = 1;
    }

    public v(long j10, long j11) {
        this.a = 1;
        this.b = j10;
        f0 f0Var = j11 == 0 ? f0.c : new f0(0L, j11);
        this.c = new d0(f0Var, f0Var);
    }
}
