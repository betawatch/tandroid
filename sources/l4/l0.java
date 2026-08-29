package l4;

import j3.j2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l0 implements z, y {
    public final z[] a;
    public final IdentityHashMap b;
    public final bb.a c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public y f;
    public k1 h;
    public z[] n;
    public ha.c r;

    public l0(bb.a aVar, long[] jArr, z... zVarArr) {
        this.c = aVar;
        this.a = zVarArr;
        aVar.getClass();
        this.r = new ha.c(new e1[0], 24);
        this.b = new IdentityHashMap();
        this.n = new z[0];
        for (int i10 = 0; i10 < zVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.a[i10] = new j0(zVarArr[i10], j10);
            }
        }
    }

    @Override // l4.z
    public final long A(d5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.b;
            if (i10 >= length) {
                break;
            }
            c1 c1Var = c1VarArr[i10];
            Integer num = c1Var == null ? null : (Integer) identityHashMap.get(c1Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            d5.r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.a().b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        c1[] c1VarArr2 = new c1[length2];
        c1[] c1VarArr3 = new c1[rVarArr.length];
        d5.r[] rVarArr2 = new d5.r[rVarArr.length];
        z[] zVarArr = this.a;
        ArrayList arrayList = new ArrayList(zVarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < zVarArr.length) {
            int i12 = 0;
            while (i12 < rVarArr.length) {
                c1VarArr3[i12] = iArr2[i12] == i11 ? c1VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    d5.r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr2;
                    j1 j1Var = (j1) this.e.get(rVar2.a());
                    j1Var.getClass();
                    rVarArr2[i12] = new i0(rVar2, j1Var);
                } else {
                    iArr = iArr2;
                    rVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            z[] zVarArr2 = zVarArr;
            int i13 = i11;
            long A = zVarArr2[i11].A(rVarArr2, zArr, c1VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = A;
            } else if (A != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    c1 c1Var2 = c1VarArr3[i14];
                    c1Var2.getClass();
                    c1VarArr2[i14] = c1VarArr3[i14];
                    identityHashMap.put(c1Var2, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    f5.a.i(c1VarArr3[i14] == null);
                }
            }
            if (z10) {
                arrayList.add(zVarArr2[i13]);
            }
            i11 = i13 + 1;
            zVarArr = zVarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(c1VarArr2, 0, c1VarArr, 0, length2);
        z[] zVarArr3 = (z[]) arrayList.toArray(new z[0]);
        this.n = zVarArr3;
        this.c.getClass();
        this.r = new ha.c(zVarArr3, 24);
        return j11;
    }

    @Override // l4.z
    public final long E() {
        long j10 = -9223372036854775807L;
        for (z zVar : this.n) {
            long E = zVar.E();
            if (E != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (z zVar2 : this.n) {
                        if (zVar2 == zVar) {
                            break;
                        }
                        if (zVar2.p(E) != E) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = E;
                } else if (E != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && zVar.p(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // l4.z
    public final k1 J() {
        k1 k1Var = this.h;
        k1Var.getClass();
        return k1Var;
    }

    @Override // l4.e1
    public final long L() {
        return this.r.L();
    }

    @Override // l4.e1
    public final void U(long j10) {
        this.r.U(j10);
    }

    @Override // l4.d1
    public final void a(e1 e1Var) {
        y yVar = this.f;
        yVar.getClass();
        yVar.a(this);
    }

    @Override // l4.e1
    public final boolean b() {
        return this.r.b();
    }

    @Override // l4.y
    public final void c(z zVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(zVar);
        if (arrayList.isEmpty()) {
            z[] zVarArr = this.a;
            int i10 = 0;
            for (z zVar2 : zVarArr) {
                i10 += zVar2.J().a;
            }
            j1[] j1VarArr = new j1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < zVarArr.length; i12++) {
                k1 J = zVarArr[i12].J();
                int i13 = J.a;
                int i14 = 0;
                while (i14 < i13) {
                    j1 a2 = J.a(i14);
                    j1 j1Var = new j1(i12 + ":" + a2.b, a2.d);
                    this.e.put(j1Var, a2);
                    j1VarArr[i11] = j1Var;
                    i14++;
                    i11++;
                }
            }
            this.h = new k1(j1VarArr);
            y yVar = this.f;
            yVar.getClass();
            yVar.c(this);
        }
    }

    @Override // l4.z
    public final long f(long j10, j2 j2Var) {
        z[] zVarArr = this.n;
        return (zVarArr.length > 0 ? zVarArr[0] : this.a[0]).f(j10, j2Var);
    }

    @Override // l4.e1
    public final long h() {
        return this.r.h();
    }

    @Override // l4.z
    public final void n(y yVar, long j10) {
        this.f = yVar;
        ArrayList arrayList = this.d;
        z[] zVarArr = this.a;
        Collections.addAll(arrayList, zVarArr);
        for (z zVar : zVarArr) {
            zVar.n(this, j10);
        }
    }

    @Override // l4.z
    public final void o() {
        for (z zVar : this.a) {
            zVar.o();
        }
    }

    @Override // l4.z
    public final long p(long j10) {
        long p10 = this.n[0].p(j10);
        int i10 = 1;
        while (true) {
            z[] zVarArr = this.n;
            if (i10 >= zVarArr.length) {
                return p10;
            }
            if (zVarArr[i10].p(p10) != p10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // l4.z
    public final void r(long j10) {
        for (z zVar : this.n) {
            zVar.r(j10);
        }
    }

    @Override // l4.e1
    public final boolean s(long j10) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.r.s(j10);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((z) arrayList.get(i10)).s(j10);
        }
        return false;
    }
}
