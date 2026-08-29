package n4;

import android.util.SparseArray;
import j3.t0;
import o3.n;
import o3.t;
import o3.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements o3.m {
    public static final n s = new n();
    public final o3.k a;
    public final int b;
    public final t0 c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public g9.l f;
    public long h;
    public t n;
    public t0[] r;

    public d(o3.k kVar, int i10, t0 t0Var) {
        this.a = kVar;
        this.b = i10;
        this.c = t0Var;
    }

    @Override // o3.m
    public final void D1(t tVar) {
        this.n = tVar;
    }

    @Override // o3.m
    public final w Z1(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            f5.a.i(this.r == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null);
            g9.l lVar = this.f;
            long j10 = this.h;
            if (lVar == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j10;
                w q6 = lVar.q(i11);
                cVar.e = q6;
                t0 t0Var = cVar.d;
                if (t0Var != null) {
                    q6.b(t0Var);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final void a(g9.l lVar, long j10, long j11) {
        this.f = lVar;
        this.h = j11;
        boolean z10 = this.e;
        o3.k kVar = this.a;
        if (!z10) {
            kVar.i(this);
            if (j10 != -9223372036854775807L) {
                kVar.f(0L, j10);
            }
            this.e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.f(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (lVar == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j11;
                w q6 = lVar.q(cVar.a);
                cVar.e = q6;
                t0 t0Var = cVar.d;
                if (t0Var != null) {
                    q6.b(t0Var);
                }
            }
            i10++;
        }
    }

    @Override // o3.m
    public final void e1() {
        SparseArray sparseArray = this.d;
        t0[] t0VarArr = new t0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            t0 t0Var = ((c) sparseArray.valueAt(i10)).d;
            f5.a.j(t0Var);
            t0VarArr[i10] = t0Var;
        }
        this.r = t0VarArr;
    }
}
