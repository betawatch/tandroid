// default package

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j2c implements j74 {
    public final byte a;
    public final int b;
    public final List c;
    public final xu7 d;
    public final SparseIntArray e;
    public final dd f;
    public final sab g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final gu8 k;
    public zh4 l;
    public l74 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public m2c r;
    public int s;
    public int t;

    /* JADX WARN: Multi-variable type inference failed */
    public j2c(int i, int i2, sab sabVar, uob uobVar, dd ddVar) {
        this.f = ddVar;
        this.a = i;
        this.b = i2;
        this.g = sabVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(uobVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(uobVar);
        }
        this.d = new xu7(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new gu8((byte) 1);
        this.m = l74.v;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (m2c) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new su9(new v8b(this)));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // j74
    public final int b(k74 k74Var, m11 m11Var) {
        byte b;
        ?? r2;
        byte b2;
        byte b3;
        byte b4;
        boolean z;
        long j;
        long j2 = ((ja3) k74Var).c;
        byte b5 = this.a;
        boolean z2 = b5 == 2;
        if (this.o) {
            long j3 = -9223372036854775807L;
            gu8 gu8Var = this.k;
            if (j2 != -1 && !z2 && !gu8Var.d) {
                int i = this.t;
                uob uobVar = gu8Var.b;
                xu7 xu7Var = gu8Var.c;
                if (i <= 0) {
                    gu8Var.a((ja3) k74Var);
                    return 0;
                }
                if (gu8Var.f) {
                    if (gu8Var.h == -9223372036854775807L) {
                        gu8Var.a((ja3) k74Var);
                        return 0;
                    }
                    if (gu8Var.e) {
                        long j4 = gu8Var.g;
                        if (j4 == -9223372036854775807L) {
                            gu8Var.a((ja3) k74Var);
                            return 0;
                        }
                        gu8Var.i = uobVar.c(gu8Var.h) - uobVar.b(j4);
                        gu8Var.a((ja3) k74Var);
                        return 0;
                    }
                    ja3 ja3Var = (ja3) k74Var;
                    int min = (int) Math.min(112800L, ja3Var.c);
                    if (ja3Var.d != 0) {
                        m11Var.a = 0L;
                        return 1;
                    }
                    xu7Var.K(min);
                    ja3Var.f = 0;
                    ja3Var.d(xu7Var.a, 0, min, false);
                    int i2 = xu7Var.b;
                    int i3 = xu7Var.c;
                    while (true) {
                        if (i2 >= i3) {
                            j = -9223372036854775807L;
                            break;
                        }
                        if (xu7Var.a[i2] == 71) {
                            j = zve.a(xu7Var, i2, i);
                            if (j != -9223372036854775807L) {
                                break;
                            }
                        }
                        i2++;
                    }
                    gu8Var.g = j;
                    gu8Var.e = true;
                    return 0;
                }
                ja3 ja3Var2 = (ja3) k74Var;
                long j5 = ja3Var2.c;
                int min2 = (int) Math.min(112800L, j5);
                long j6 = j5 - min2;
                if (ja3Var2.d != j6) {
                    m11Var.a = j6;
                    return 1;
                }
                xu7Var.K(min2);
                ja3Var2.f = 0;
                ja3Var2.d(xu7Var.a, 0, min2, false);
                int i4 = xu7Var.b;
                int i5 = xu7Var.c;
                int i6 = i5 - 188;
                while (true) {
                    if (i6 < i4) {
                        break;
                    }
                    byte[] bArr = xu7Var.a;
                    int i7 = -4;
                    int i8 = 0;
                    while (true) {
                        if (i7 > 4) {
                            break;
                        }
                        int i9 = (i7 * kk7.R2) + i6;
                        if (i9 < i4 || i9 >= i5 || bArr[i9] != 71) {
                            i8 = 0;
                        } else {
                            i8++;
                            if (i8 == 5) {
                                long a = zve.a(xu7Var, i6, i);
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
                gu8Var.h = j3;
                gu8Var.f = true;
                return 0;
            }
            if (this.p) {
                b = 1;
                z = false;
                b2 = b5;
            } else {
                this.p = true;
                long j7 = gu8Var.i;
                if (j7 != -9223372036854775807L) {
                    b = 1;
                    b2 = b5;
                    z = false;
                    zh4 zh4Var = new zh4(new c6e(), new kp(this.t, gu8Var.b), j7, 1 + j7, 0L, j2, 188L, 940);
                    this.l = zh4Var;
                    this.m.g0(zh4Var.a);
                } else {
                    b = 1;
                    z = false;
                    b2 = b5;
                    this.m.g0(new oc0(j7));
                }
            }
            if (this.q) {
                this.q = z;
                d(0L, 0L);
                if (((ja3) k74Var).d != 0) {
                    m11Var.a = 0L;
                    return b;
                }
            }
            zh4 zh4Var2 = this.l;
            r2 = z;
            if (zh4Var2 != null) {
                r2 = z;
                if (zh4Var2.c != null) {
                    return zh4Var2.a((ja3) k74Var, m11Var);
                }
            }
        } else {
            b = 1;
            r2 = 0;
            b2 = b5;
        }
        xu7 xu7Var2 = this.d;
        byte[] bArr2 = xu7Var2.a;
        if (9400 - xu7Var2.b < 188) {
            int a2 = xu7Var2.a();
            if (a2 > 0) {
                System.arraycopy(bArr2, xu7Var2.b, bArr2, r2, a2);
            }
            xu7Var2.L(a2, bArr2);
        }
        while (true) {
            int a3 = xu7Var2.a();
            SparseArray sparseArray = this.h;
            if (a3 >= 188) {
                int i10 = xu7Var2.b;
                int i11 = xu7Var2.c;
                byte[] bArr3 = xu7Var2.a;
                int i12 = i10;
                while (i12 < i11 && bArr3[i12] != 71) {
                    i12++;
                }
                xu7Var2.N(i12);
                int i13 = i12 + kk7.R2;
                if (i13 > i11) {
                    int i14 = (i12 - i10) + this.s;
                    this.s = i14;
                    b3 = b2;
                    b4 = 2;
                    if (b3 == 2 && i14 > 376) {
                        throw av7.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    b3 = b2;
                    b4 = 2;
                    this.s = r2;
                }
                int i15 = xu7Var2.c;
                if (i13 > i15) {
                    return r2;
                }
                int m = xu7Var2.m();
                if ((8388608 & m) != 0) {
                    xu7Var2.N(i13);
                    return r2;
                }
                int i16 = (4194304 & m) != 0 ? 1 : r2;
                int i17 = (2096896 & m) >> 8;
                boolean z3 = (m & 32) != 0 ? true : r2;
                m2c m2cVar = (m & 16) != 0 ? (m2c) sparseArray.get(i17) : null;
                if (m2cVar == null) {
                    xu7Var2.N(i13);
                    return r2;
                }
                if (b3 != b4) {
                    int i18 = m & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i19 = sparseIntArray.get(i17, i18 - 1);
                    sparseIntArray.put(i17, i18);
                    if (i19 == i18) {
                        xu7Var2.N(i13);
                        return r2;
                    }
                    if (i18 != ((i19 + 1) & 15)) {
                        m2cVar.d();
                    }
                }
                if (z3) {
                    int A = xu7Var2.A();
                    i16 |= (xu7Var2.A() & 64) != 0 ? b4 : r2;
                    xu7Var2.O(A - 1);
                }
                boolean z4 = this.o;
                if (b3 == b4 || z4 || !this.j.get(i17, r2)) {
                    xu7Var2.M(i13);
                    m2cVar.a(i16, xu7Var2);
                    xu7Var2.M(i15);
                }
                if (b3 != b4 && !z4 && this.o && j2 != -1) {
                    this.q = true;
                }
                xu7Var2.N(i13);
                return r2;
            }
            int i20 = xu7Var2.c;
            int read = ((ja3) k74Var).read(bArr2, i20, 9400 - i20);
            if (read == -1) {
                int i21 = r2;
                while (i21 < sparseArray.size()) {
                    m2c m2cVar2 = (m2c) sparseArray.valueAt(i21);
                    if (m2cVar2 instanceof n38) {
                        n38 n38Var = (n38) m2cVar2;
                        byte b6 = (!z2 || n38Var.e()) ? b : r2;
                        byte b7 = n38Var.c;
                        if (((b7 == 3 && n38Var.j == -1) || b7 == b) && ((!z2 || !(n38Var.a instanceof yb5)) && b6 != 0)) {
                            n38Var.a(1, new xu7());
                        }
                    }
                    i21++;
                    b = 1;
                }
                return -1;
            }
            xu7Var2.M(i20 + read);
            b = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(k74 k74Var) {
        byte[] bArr = this.d.a;
        ja3 ja3Var = (ja3) k74Var;
        ja3Var.d(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * kk7.R2) + i] != 71) {
                    break;
                }
            }
            ja3Var.l(i, false);
            return true;
        }
        return false;
    }

    @Override // j74
    public final void d(long j, long j2) {
        zh4 zh4Var;
        gre.p(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uob uobVar = (uob) list.get(i);
            boolean z = uobVar.e() == -9223372036854775807L;
            if (!z) {
                long d = uobVar.d();
                z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                uobVar.g(j2);
            }
        }
        if (j2 != 0 && (zh4Var = this.l) != null) {
            zh4Var.d(j2);
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
                ((m2c) sparseArray.valueAt(i2)).d();
                i2++;
            }
        }
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        if ((this.b & 1) == 0) {
            l74Var = new xf4(l74Var, this.g);
        }
        this.m = l74Var;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
