package j4;

import h3.j2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m0 implements a0, z {
    public final a0[] a;
    public final IdentityHashMap b;
    public final za.a c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public z f;
    public j1 h;
    public a0[] n;
    public android.support.v4.media.c r;

    public m0(za.a aVar, long[] jArr, a0... a0VarArr) {
        this.c = aVar;
        this.a = a0VarArr;
        aVar.getClass();
        this.r = new android.support.v4.media.c(new d1[0], 19);
        this.b = new IdentityHashMap();
        this.n = new a0[0];
        for (int i9 = 0; i9 < a0VarArr.length; i9++) {
            long j10 = jArr[i9];
            if (j10 != 0) {
                this.a[i9] = new k0(a0VarArr[i9], j10);
            }
        }
    }

    @Override // j4.d1
    public final boolean b() {
        return this.r.b();
    }

    @Override // j4.c1
    public final void c(d1 d1Var) {
        z zVar = this.f;
        zVar.getClass();
        zVar.c(this);
    }

    @Override // j4.d1
    public final long d() {
        return this.r.d();
    }

    @Override // j4.z
    public final void f(a0 a0Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(a0Var);
        if (arrayList.isEmpty()) {
            a0[] a0VarArr = this.a;
            int i9 = 0;
            for (a0 a0Var2 : a0VarArr) {
                i9 += a0Var2.q().a;
            }
            i1[] i1VarArr = new i1[i9];
            int i10 = 0;
            for (int i11 = 0; i11 < a0VarArr.length; i11++) {
                j1 q10 = a0VarArr[i11].q();
                int i12 = q10.a;
                int i13 = 0;
                while (i13 < i12) {
                    i1 a2 = q10.a(i13);
                    i1 i1Var = new i1(i11 + ":" + a2.b, a2.d);
                    this.e.put(i1Var, a2);
                    i1VarArr[i10] = i1Var;
                    i13++;
                    i10++;
                }
            }
            this.h = new j1(i1VarArr);
            z zVar = this.f;
            zVar.getClass();
            zVar.f(this);
        }
    }

    @Override // j4.a0
    public final void g() {
        for (a0 a0Var : this.a) {
            a0Var.g();
        }
    }

    @Override // j4.a0
    public final long i(long j10) {
        long i9 = this.n[0].i(j10);
        int i10 = 1;
        while (true) {
            a0[] a0VarArr = this.n;
            if (i10 >= a0VarArr.length) {
                return i9;
            }
            if (a0VarArr[i10].i(i9) != i9) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // j4.a0
    public final void k(long j10) {
        for (a0 a0Var : this.n) {
            a0Var.k(j10);
        }
    }

    @Override // j4.d1
    public final boolean n(long j10) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.r.n(j10);
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((a0) arrayList.get(i9)).n(j10);
        }
        return false;
    }

    @Override // j4.a0
    public final long o() {
        long j10 = -9223372036854775807L;
        for (a0 a0Var : this.n) {
            long o6 = a0Var.o();
            if (o6 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (a0 a0Var2 : this.n) {
                        if (a0Var2 == a0Var) {
                            break;
                        }
                        if (a0Var2.i(o6) != o6) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = o6;
                } else if (o6 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && a0Var.i(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // j4.a0
    public final j1 q() {
        j1 j1Var = this.h;
        j1Var.getClass();
        return j1Var;
    }

    @Override // j4.a0
    public final long u(long j10, j2 j2Var) {
        a0[] a0VarArr = this.n;
        return (a0VarArr.length > 0 ? a0VarArr[0] : this.a[0]).u(j10, j2Var);
    }

    @Override // j4.d1
    public final long v() {
        return this.r.v();
    }

    @Override // j4.a0
    public final void w(z zVar, long j10) {
        this.f = zVar;
        ArrayList arrayList = this.d;
        a0[] a0VarArr = this.a;
        Collections.addAll(arrayList, a0VarArr);
        for (a0 a0Var : a0VarArr) {
            a0Var.w(this, j10);
        }
    }

    @Override // j4.a0
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[tVarArr.length];
        int[] iArr3 = new int[tVarArr.length];
        int i9 = 0;
        while (true) {
            int length = tVarArr.length;
            identityHashMap = this.b;
            if (i9 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i9];
            Integer num = b1Var == null ? null : (Integer) identityHashMap.get(b1Var);
            iArr2[i9] = num == null ? -1 : num.intValue();
            b5.t tVar = tVarArr[i9];
            if (tVar != null) {
                String str = tVar.b().b;
                iArr3[i9] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i9] = -1;
            }
            i9++;
        }
        identityHashMap.clear();
        int length2 = tVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[tVarArr.length];
        b5.t[] tVarArr2 = new b5.t[tVarArr.length];
        a0[] a0VarArr = this.a;
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        long j11 = j10;
        int i10 = 0;
        while (i10 < a0VarArr.length) {
            int i11 = 0;
            while (i11 < tVarArr.length) {
                b1VarArr3[i11] = iArr2[i11] == i10 ? b1VarArr[i11] : null;
                if (iArr3[i11] == i10) {
                    b5.t tVar2 = tVarArr[i11];
                    tVar2.getClass();
                    iArr = iArr2;
                    i1 i1Var = (i1) this.e.get(tVar2.b());
                    i1Var.getClass();
                    tVarArr2[i11] = new j0(tVar2, i1Var);
                } else {
                    iArr = iArr2;
                    tVarArr2[i11] = null;
                }
                i11++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            a0[] a0VarArr2 = a0VarArr;
            int i12 = i10;
            long x10 = a0VarArr2[i10].x(tVarArr2, zArr, b1VarArr3, zArr2, j11);
            if (i12 == 0) {
                j11 = x10;
            } else if (x10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i13 = 0; i13 < tVarArr.length; i13++) {
                if (iArr3[i13] == i12) {
                    b1 b1Var2 = b1VarArr3[i13];
                    b1Var2.getClass();
                    b1VarArr2[i13] = b1VarArr3[i13];
                    identityHashMap.put(b1Var2, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr4[i13] == i12) {
                    d5.a.i(b1VarArr3[i13] == null);
                }
            }
            if (z10) {
                arrayList.add(a0VarArr2[i12]);
            }
            i10 = i12 + 1;
            a0VarArr = a0VarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(b1VarArr2, 0, b1VarArr, 0, length2);
        a0[] a0VarArr3 = (a0[]) arrayList.toArray(new a0[0]);
        this.n = a0VarArr3;
        this.c.getClass();
        this.r = new android.support.v4.media.c(a0VarArr3, 19);
        return j11;
    }

    @Override // j4.d1
    public final void z(long j10) {
        this.r.z(j10);
    }
}
