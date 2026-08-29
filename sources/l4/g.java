package l4;

import j3.q2;
import j3.r2;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends m1 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final q2 r;
    public e s;
    public f t;
    public long u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super(aVar);
        aVar.getClass();
        f5.a.f(j10 >= 0);
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
        e eVar = this.s;
        long j14 = this.m;
        ArrayList arrayList = this.q;
        if (eVar == null || arrayList.isEmpty() || this.o) {
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
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.u;
                long j17 = this.v;
                dVar.e = j16;
                dVar.f = j17;
            }
            j12 = j11;
        } else {
            j10 = this.u - j13;
            j12 = j14 != Long.MIN_VALUE ? this.v - j13 : Long.MIN_VALUE;
        }
        try {
            e eVar2 = new e(r2Var, j10, j12);
            this.s = eVar2;
            m(eVar2);
        } catch (f e10) {
            this.t = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.t;
            }
        }
    }

    @Override // l4.a
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        d dVar = new d(this.k.b(c0Var, rVar, j10), this.n, this.u, this.v);
        this.q.add(dVar);
        return dVar;
    }

    @Override // l4.j, l4.a
    public final void j() {
        f fVar = this.t;
        if (fVar != null) {
            throw fVar;
        }
        super.j();
    }

    @Override // l4.a
    public final void n(z zVar) {
        ArrayList arrayList = this.q;
        f5.a.i(arrayList.remove(zVar));
        this.k.n(((d) zVar).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        e eVar = this.s;
        eVar.getClass();
        A(eVar.b);
    }

    @Override // l4.j, l4.a
    public final void p() {
        super.p();
        this.t = null;
        this.s = null;
    }

    @Override // l4.m1
    public final void y(r2 r2Var) {
        if (this.t != null) {
            return;
        }
        A(r2Var);
    }
}
