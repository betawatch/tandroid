// default package

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j4c implements s84 {
    public final byte a;
    public final int b;
    public final List c;
    public final yw7 d;
    public final SparseIntArray e;
    public final de f;
    public final tcb g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final hw8 k;
    public dk4 l;
    public u84 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public m4c r;
    public int s;
    public int t;

    /* JADX WARN: Multi-variable type inference failed */
    public j4c(int i, int i2, tcb tcbVar, vqb vqbVar, de deVar) {
        this.f = deVar;
        this.a = i;
        this.b = i2;
        this.g = tcbVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(vqbVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(vqbVar);
        }
        this.d = new yw7(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new hw8((byte) 1);
        this.m = u84.v;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (m4c) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new vw9(new xab(this)));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        byte b;
        ?? r2;
        byte b2;
        byte b3;
        byte b4;
        boolean z;
        long j;
        long j2 = ((vb3) t84Var).c;
        byte b5 = this.a;
        boolean z2 = b5 == 2;
        if (this.o) {
            long j3 = -9223372036854775807L;
            hw8 hw8Var = this.k;
            if (j2 != -1 && !z2 && !hw8Var.d) {
                int i = this.t;
                vqb vqbVar = hw8Var.b;
                yw7 yw7Var = hw8Var.c;
                if (i <= 0) {
                    hw8Var.a((vb3) t84Var);
                    return 0;
                }
                if (hw8Var.f) {
                    if (hw8Var.h == -9223372036854775807L) {
                        hw8Var.a((vb3) t84Var);
                        return 0;
                    }
                    if (hw8Var.e) {
                        long j4 = hw8Var.g;
                        if (j4 == -9223372036854775807L) {
                            hw8Var.a((vb3) t84Var);
                            return 0;
                        }
                        hw8Var.i = vqbVar.c(hw8Var.h) - vqbVar.b(j4);
                        hw8Var.a((vb3) t84Var);
                        return 0;
                    }
                    vb3 vb3Var = (vb3) t84Var;
                    int min = (int) Math.min(112800L, vb3Var.c);
                    if (vb3Var.d != 0) {
                        u21Var.a = 0L;
                        return 1;
                    }
                    yw7Var.K(min);
                    vb3Var.f = 0;
                    vb3Var.d(yw7Var.a, 0, min, false);
                    int i2 = yw7Var.b;
                    int i3 = yw7Var.c;
                    while (true) {
                        if (i2 >= i3) {
                            j = -9223372036854775807L;
                            break;
                        }
                        if (yw7Var.a[i2] == 71) {
                            j = bye.a(yw7Var, i2, i);
                            if (j != -9223372036854775807L) {
                                break;
                            }
                        }
                        i2++;
                    }
                    hw8Var.g = j;
                    hw8Var.e = true;
                    return 0;
                }
                vb3 vb3Var2 = (vb3) t84Var;
                long j5 = vb3Var2.c;
                int min2 = (int) Math.min(112800L, j5);
                long j6 = j5 - min2;
                if (vb3Var2.d != j6) {
                    u21Var.a = j6;
                    return 1;
                }
                yw7Var.K(min2);
                vb3Var2.f = 0;
                vb3Var2.d(yw7Var.a, 0, min2, false);
                int i4 = yw7Var.b;
                int i5 = yw7Var.c;
                int i6 = i5 - 188;
                while (true) {
                    if (i6 < i4) {
                        break;
                    }
                    byte[] bArr = yw7Var.a;
                    int i7 = -4;
                    int i8 = 0;
                    while (true) {
                        if (i7 > 4) {
                            break;
                        }
                        int i9 = (i7 * nm7.R2) + i6;
                        if (i9 < i4 || i9 >= i5 || bArr[i9] != 71) {
                            i8 = 0;
                        } else {
                            i8++;
                            if (i8 == 5) {
                                long a = bye.a(yw7Var, i6, i);
                                if (a != -9223372036854775807L) {
                                    j3 = a;
                                    break;
                                }
                            }
                        }
                        i7++;
                    }
                    i6--;
                }
                hw8Var.h = j3;
                hw8Var.f = true;
                return 0;
            }
            if (this.p) {
                b = 1;
                z = false;
                b2 = b5;
            } else {
                this.p = true;
                long j7 = hw8Var.i;
                if (j7 != -9223372036854775807L) {
                    b = 1;
                    b2 = b5;
                    z = false;
                    dk4 dk4Var = new dk4(new f8e(), new kq(this.t, hw8Var.b), j7, 1 + j7, 0L, j2, 188L, 940);
                    this.l = dk4Var;
                    this.m.f0(dk4Var.a);
                } else {
                    b = 1;
                    z = false;
                    b2 = b5;
                    this.m.f0(new od0(j7));
                }
            }
            if (this.q) {
                this.q = z;
                d(0L, 0L);
                if (((vb3) t84Var).d != 0) {
                    u21Var.a = 0L;
                    return b;
                }
            }
            dk4 dk4Var2 = this.l;
            r2 = z;
            if (dk4Var2 != null) {
                r2 = z;
                if (dk4Var2.c != null) {
                    return dk4Var2.a((vb3) t84Var, u21Var);
                }
            }
        } else {
            b = 1;
            r2 = 0;
            b2 = b5;
        }
        yw7 yw7Var2 = this.d;
        byte[] bArr2 = yw7Var2.a;
        if (9400 - yw7Var2.b < 188) {
            int a2 = yw7Var2.a();
            if (a2 > 0) {
                System.arraycopy(bArr2, yw7Var2.b, bArr2, r2, a2);
            }
            yw7Var2.L(a2, bArr2);
        }
        while (true) {
            int a3 = yw7Var2.a();
            SparseArray sparseArray = this.h;
            if (a3 >= 188) {
                int i10 = yw7Var2.b;
                int i11 = yw7Var2.c;
                byte[] bArr3 = yw7Var2.a;
                int i12 = i10;
                while (i12 < i11 && bArr3[i12] != 71) {
                    i12++;
                }
                yw7Var2.N(i12);
                int i13 = i12 + nm7.R2;
                if (i13 > i11) {
                    int i14 = (i12 - i10) + this.s;
                    this.s = i14;
                    b3 = b2;
                    b4 = 2;
                    if (b3 == 2 && i14 > 376) {
                        throw bx7.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    b3 = b2;
                    b4 = 2;
                    this.s = r2;
                }
                int i15 = yw7Var2.c;
                if (i13 > i15) {
                    return r2;
                }
                int m = yw7Var2.m();
                if ((8388608 & m) != 0) {
                    yw7Var2.N(i13);
                    return r2;
                }
                int i16 = (4194304 & m) != 0 ? 1 : r2;
                int i17 = (2096896 & m) >> 8;
                boolean z3 = (m & 32) != 0 ? true : r2;
                m4c m4cVar = (m & 16) != 0 ? (m4c) sparseArray.get(i17) : null;
                if (m4cVar == null) {
                    yw7Var2.N(i13);
                    return r2;
                }
                if (b3 != b4) {
                    int i18 = m & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i19 = sparseIntArray.get(i17, i18 - 1);
                    sparseIntArray.put(i17, i18);
                    if (i19 == i18) {
                        yw7Var2.N(i13);
                        return r2;
                    }
                    if (i18 != ((i19 + 1) & 15)) {
                        m4cVar.d();
                    }
                }
                if (z3) {
                    int A = yw7Var2.A();
                    i16 |= (yw7Var2.A() & 64) != 0 ? b4 : r2;
                    yw7Var2.O(A - 1);
                }
                boolean z4 = this.o;
                if (b3 == b4 || z4 || !this.j.get(i17, r2)) {
                    yw7Var2.M(i13);
                    m4cVar.a(i16, yw7Var2);
                    yw7Var2.M(i15);
                }
                if (b3 != b4 && !z4 && this.o && j2 != -1) {
                    this.q = true;
                }
                yw7Var2.N(i13);
                return r2;
            }
            int i20 = yw7Var2.c;
            int read = ((vb3) t84Var).read(bArr2, i20, 9400 - i20);
            if (read == -1) {
                int i21 = r2;
                while (i21 < sparseArray.size()) {
                    m4c m4cVar2 = (m4c) sparseArray.valueAt(i21);
                    if (m4cVar2 instanceof p58) {
                        p58 p58Var = (p58) m4cVar2;
                        byte b6 = (!z2 || p58Var.e()) ? b : r2;
                        byte b7 = p58Var.c;
                        if (((b7 == 3 && p58Var.j == -1) || b7 == b) && ((!z2 || !(p58Var.a instanceof wd5)) && b6 != 0)) {
                            p58Var.a(1, new yw7());
                        }
                    }
                    i21++;
                    b = 1;
                }
                return -1;
            }
            yw7Var2.M(i20 + read);
            b = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(t84 t84Var) {
        byte[] bArr = this.d.a;
        vb3 vb3Var = (vb3) t84Var;
        vb3Var.d(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * nm7.R2) + i] != 71) {
                    break;
                }
            }
            vb3Var.m(i, false);
            return true;
        }
        return false;
    }

    @Override // s84
    public final void d(long j, long j2) {
        dk4 dk4Var;
        jte.p(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vqb vqbVar = (vqb) list.get(i);
            boolean z = vqbVar.e() == -9223372036854775807L;
            if (!z) {
                long d = vqbVar.d();
                z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                vqbVar.g(j2);
            }
        }
        if (j2 != 0 && (dk4Var = this.l) != null) {
            dk4Var.d(j2);
        }
        this.d.K(0);
        this.e.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.h;
            if (i2 >= sparseArray.size()) {
                this.s = 0;
                return;
            } else {
                ((m4c) sparseArray.valueAt(i2)).d();
                i2++;
            }
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        if ((this.b & 1) == 0) {
            u84Var = new yh4(u84Var, this.g);
        }
        this.m = u84Var;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
