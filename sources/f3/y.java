package f3;

import a8.ja;
import h2.l0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class y implements b0 {
    public final f5.v a;
    public final f5.v b;
    public long c;

    public y(long j3, long[] jArr, long[] jArr2) {
        ja.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new f5.v(length, 7);
            this.b = new f5.v(length, 7);
        } else {
            int i7 = length + 1;
            f5.v vVar = new f5.v(i7, 7);
            this.a = vVar;
            f5.v vVar2 = new f5.v(i7, 7);
            this.b = vVar2;
            vVar.c(0L);
            vVar2.c(0L);
        }
        this.a.d(jArr);
        this.b.d(jArr2);
        this.c = j3;
    }

    @Override // f3.b0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // f3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.b0
    public final a0 f(long j3) {
        f5.v vVar = this.b;
        if (vVar.b == 0) {
            c0 c0Var = c0.c;
            return new a0(c0Var, c0Var);
        }
        int c10 = l0.c(vVar, j3);
        long m10 = vVar.m(c10);
        f5.v vVar2 = this.a;
        c0 c0Var2 = new c0(m10, vVar2.m(c10));
        if (m10 == j3 || c10 == vVar.b - 1) {
            return new a0(c0Var2, c0Var2);
        }
        int i7 = c10 + 1;
        return new a0(c0Var2, new c0(vVar.m(i7), vVar2.m(i7)));
    }

    @Override // f3.b0
    public final long h() {
        return this.c;
    }
}
