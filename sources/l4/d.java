package l4;

import android.util.SparseArray;
import h3.t0;
import m3.n;
import m3.t;
import m3.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements m3.m {
    public static final n s = new n();
    public final m3.k a;
    public final int b;
    public final t0 c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public g5.b f;
    public long h;
    public t n;
    public t0[] r;

    public d(m3.k kVar, int i10, t0 t0Var) {
        this.a = kVar;
        this.b = i10;
        this.c = t0Var;
    }

    @Override // m3.m
    public final void A() {
        SparseArray sparseArray = this.d;
        t0[] t0VarArr = new t0[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            t0 t0Var = ((c) sparseArray.valueAt(i10)).d;
            d5.a.j(t0Var);
            t0VarArr[i10] = t0Var;
        }
        this.r = t0VarArr;
    }

    @Override // m3.m
    public final w C(int i10, int i11) {
        SparseArray sparseArray = this.d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            d5.a.i(this.r == null);
            cVar = new c(i10, i11, i11 == this.b ? this.c : null);
            g5.b bVar = this.f;
            long j10 = this.h;
            if (bVar == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j10;
                w u10 = bVar.u(i11);
                cVar.e = u10;
                t0 t0Var = cVar.d;
                if (t0Var != null) {
                    u10.c(t0Var);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    public final void a(g5.b bVar, long j10, long j11) {
        this.f = bVar;
        this.h = j11;
        boolean z10 = this.e;
        m3.k kVar = this.a;
        if (!z10) {
            kVar.c(this);
            if (j10 != -9223372036854775807L) {
                kVar.g(0L, j10);
            }
            this.e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.g(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (bVar == null) {
                cVar.e = cVar.c;
            } else {
                cVar.f = j11;
                w u10 = bVar.u(cVar.a);
                cVar.e = u10;
                t0 t0Var = cVar.d;
                if (t0Var != null) {
                    u10.c(t0Var);
                }
            }
            i10++;
        }
    }

    @Override // m3.m
    public final void n(t tVar) {
        this.n = tVar;
    }
}
