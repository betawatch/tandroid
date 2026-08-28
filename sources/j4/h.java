package j4;

import h3.q2;
import h3.r2;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends l1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final q2 r;
    public f s;
    public g t;
    public long u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(aVar);
        aVar.getClass();
        d5.a.f(j10 >= 0);
        this.l = j10;
        this.m = j11;
        this.n = z10;
        this.o = z11;
        this.p = z12;
        this.q = new ArrayList();
        this.r = new q2();
    }

    public final void A(r2 r2Var) {
        long j10;
        long j11;
        long j12;
        q2 q2Var = this.r;
        r2Var.n(0, q2Var);
        long j13 = q2Var.C;
        f fVar = this.s;
        long j14 = this.m;
        ArrayList arrayList = this.q;
        if (fVar == null || arrayList.isEmpty() || this.o) {
            boolean z10 = this.p;
            j10 = this.l;
            if (z10) {
                long j15 = q2Var.x;
                j10 += j15;
                j11 = j15 + j14;
            } else {
                j11 = j14;
            }
            this.u = j13 + j10;
            this.v = j14 != Long.MIN_VALUE ? j13 + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                e eVar = (e) arrayList.get(i9);
                long j16 = this.u;
                long j17 = this.v;
                eVar.e = j16;
                eVar.f = j17;
            }
            j12 = j11;
        } else {
            j10 = this.u - j13;
            j12 = j14 != Long.MIN_VALUE ? this.v - j13 : Long.MIN_VALUE;
        }
        try {
            f fVar2 = new f(r2Var, j10, j12);
            this.s = fVar2;
            m(fVar2);
        } catch (g e10) {
            this.t = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((e) arrayList.get(i10)).h = this.t;
            }
        }
    }

    @Override // j4.a
    public final a0 b(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        e eVar = new e(this.k.b(d0Var, rVar, j10), this.n, this.u, this.v);
        this.q.add(eVar);
        return eVar;
    }

    @Override // j4.k, j4.a
    public final void j() {
        g gVar = this.t;
        if (gVar != null) {
            throw gVar;
        }
        super.j();
    }

    @Override // j4.a
    public final void n(a0 a0Var) {
        ArrayList arrayList = this.q;
        d5.a.i(arrayList.remove(a0Var));
        this.k.n(((e) a0Var).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        f fVar = this.s;
        fVar.getClass();
        A(fVar.b);
    }

    @Override // j4.k, j4.a
    public final void p() {
        super.p();
        this.t = null;
        this.s = null;
    }

    @Override // j4.l1
    public final void y(r2 r2Var) {
        if (this.t != null) {
            return;
        }
        A(r2Var);
    }
}
