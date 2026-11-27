// default package

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class j6c implements e84 {
    public final byte a;
    public final int b;
    public final List c;
    public final ey7 d;
    public final SparseIntArray e;
    public final ed f;
    public final peb g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final px8 k;
    public dk4 l;
    public g84 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public m6c r;
    public int s;
    public int t;

    /* JADX WARN: Multi-variable type inference failed */
    public j6c(int i, int i2, peb pebVar, usb usbVar, ed edVar) {
        this.f = edVar;
        this.a = i;
        this.b = i2;
        this.g = pebVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(usbVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(usbVar);
        }
        this.d = new ey7(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new px8((byte) 1);
        this.m = g84.v;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (m6c) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new my9(new k7b(this)));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // e84
    public final int b(f84 f84Var, v11 v11Var) {
        byte b;
        ?? r2;
        byte b2;
        byte b3;
        byte b4;
        boolean z;
        long j;
        long j2 = ((cb3) f84Var).c;
        byte b5 = this.a;
        boolean z2 = b5 == 2;
        if (this.o) {
            long j3 = -9223372036854775807L;
            px8 px8Var = this.k;
            if (j2 != -1 && !z2 && !px8Var.d) {
                int i = this.t;
                usb usbVar = px8Var.b;
                ey7 ey7Var = px8Var.c;
                if (i <= 0) {
                    px8Var.a((cb3) f84Var);
                    return 0;
                }
                if (px8Var.f) {
                    if (px8Var.h == -9223372036854775807L) {
                        px8Var.a((cb3) f84Var);
                        return 0;
                    }
                    if (px8Var.e) {
                        long j4 = px8Var.g;
                        if (j4 == -9223372036854775807L) {
                            px8Var.a((cb3) f84Var);
                            return 0;
                        }
                        px8Var.i = usbVar.c(px8Var.h) - usbVar.b(j4);
                        px8Var.a((cb3) f84Var);
                        return 0;
                    }
                    cb3 cb3Var = (cb3) f84Var;
                    int min = (int) Math.min(112800L, cb3Var.c);
                    if (cb3Var.d != 0) {
                        v11Var.a = 0L;
                        return 1;
                    }
                    ey7Var.K(min);
                    cb3Var.f = 0;
                    cb3Var.d(ey7Var.a, 0, min, false);
                    int i2 = ey7Var.b;
                    int i3 = ey7Var.c;
                    while (true) {
                        if (i2 >= i3) {
                            j = -9223372036854775807L;
                            break;
                        }
                        if (ey7Var.a[i2] == 71) {
                            j = r0f.a(ey7Var, i2, i);
                            if (j != -9223372036854775807L) {
                                break;
                            }
                        }
                        i2++;
                    }
                    px8Var.g = j;
                    px8Var.e = true;
                    return 0;
                }
                cb3 cb3Var2 = (cb3) f84Var;
                long j5 = cb3Var2.c;
                int min2 = (int) Math.min(112800L, j5);
                long j6 = j5 - min2;
                if (cb3Var2.d != j6) {
                    v11Var.a = j6;
                    return 1;
                }
                ey7Var.K(min2);
                cb3Var2.f = 0;
                cb3Var2.d(ey7Var.a, 0, min2, false);
                int i4 = ey7Var.b;
                int i5 = ey7Var.c;
                int i6 = i5 - 188;
                while (true) {
                    if (i6 < i4) {
                        break;
                    }
                    byte[] bArr = ey7Var.a;
                    int i7 = -4;
                    int i8 = 0;
                    while (true) {
                        if (i7 > 4) {
                            break;
                        }
                        int i9 = (i7 * jn7.R2) + i6;
                        if (i9 < i4 || i9 >= i5 || bArr[i9] != 71) {
                            i8 = 0;
                        } else {
                            i8++;
                            if (i8 == 5) {
                                long a = r0f.a(ey7Var, i6, i);
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
                px8Var.h = j3;
                px8Var.f = true;
                return 0;
            }
            if (this.p) {
                b = 1;
                z = false;
                b2 = b5;
            } else {
                this.p = true;
                long j7 = px8Var.i;
                if (j7 != -9223372036854775807L) {
                    b = 1;
                    b2 = b5;
                    z = false;
                    dk4 dk4Var = new dk4(new sae(), new lp(this.t, px8Var.b), j7, 1 + j7, 0L, j2, 188L, 940);
                    this.l = dk4Var;
                    this.m.m0(dk4Var.a);
                } else {
                    b = 1;
                    z = false;
                    b2 = b5;
                    this.m.m0(new qc0(j7));
                }
            }
            if (this.q) {
                this.q = z;
                d(0L, 0L);
                if (((cb3) f84Var).d != 0) {
                    v11Var.a = 0L;
                    return b;
                }
            }
            dk4 dk4Var2 = this.l;
            r2 = z;
            if (dk4Var2 != null) {
                r2 = z;
                if (dk4Var2.c != null) {
                    return dk4Var2.a((cb3) f84Var, v11Var);
                }
            }
        } else {
            b = 1;
            r2 = 0;
            b2 = b5;
        }
        ey7 ey7Var2 = this.d;
        byte[] bArr2 = ey7Var2.a;
        if (9400 - ey7Var2.b < 188) {
            int a2 = ey7Var2.a();
            if (a2 > 0) {
                System.arraycopy(bArr2, ey7Var2.b, bArr2, r2, a2);
            }
            ey7Var2.L(a2, bArr2);
        }
        while (true) {
            int a3 = ey7Var2.a();
            SparseArray sparseArray = this.h;
            if (a3 >= 188) {
                int i10 = ey7Var2.b;
                int i11 = ey7Var2.c;
                byte[] bArr3 = ey7Var2.a;
                int i12 = i10;
                while (i12 < i11 && bArr3[i12] != 71) {
                    i12++;
                }
                ey7Var2.N(i12);
                int i13 = i12 + jn7.R2;
                if (i13 > i11) {
                    int i14 = (i12 - i10) + this.s;
                    this.s = i14;
                    b3 = b2;
                    b4 = 2;
                    if (b3 == 2 && i14 > 376) {
                        throw hy7.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    b3 = b2;
                    b4 = 2;
                    this.s = r2;
                }
                int i15 = ey7Var2.c;
                if (i13 > i15) {
                    return r2;
                }
                int m = ey7Var2.m();
                if ((8388608 & m) != 0) {
                    ey7Var2.N(i13);
                    return r2;
                }
                int i16 = (4194304 & m) != 0 ? 1 : r2;
                int i17 = (2096896 & m) >> 8;
                boolean z3 = (m & 32) != 0 ? true : r2;
                m6c m6cVar = (m & 16) != 0 ? (m6c) sparseArray.get(i17) : null;
                if (m6cVar == null) {
                    ey7Var2.N(i13);
                    return r2;
                }
                if (b3 != b4) {
                    int i18 = m & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i19 = sparseIntArray.get(i17, i18 - 1);
                    sparseIntArray.put(i17, i18);
                    if (i19 == i18) {
                        ey7Var2.N(i13);
                        return r2;
                    }
                    if (i18 != ((i19 + 1) & 15)) {
                        m6cVar.d();
                    }
                }
                if (z3) {
                    int A = ey7Var2.A();
                    i16 |= (ey7Var2.A() & 64) != 0 ? b4 : r2;
                    ey7Var2.O(A - 1);
                }
                boolean z4 = this.o;
                if (b3 == b4 || z4 || !this.j.get(i17, r2)) {
                    ey7Var2.M(i13);
                    m6cVar.a(i16, ey7Var2);
                    ey7Var2.M(i15);
                }
                if (b3 != b4 && !z4 && this.o && j2 != -1) {
                    this.q = true;
                }
                ey7Var2.N(i13);
                return r2;
            }
            int i20 = ey7Var2.c;
            int read = ((cb3) f84Var).read(bArr2, i20, 9400 - i20);
            if (read == -1) {
                int i21 = r2;
                while (i21 < sparseArray.size()) {
                    m6c m6cVar2 = (m6c) sparseArray.valueAt(i21);
                    if (m6cVar2 instanceof d78) {
                        d78 d78Var = (d78) m6cVar2;
                        byte b6 = (!z2 || d78Var.e()) ? b : r2;
                        byte b7 = d78Var.c;
                        if (((b7 == 3 && d78Var.j == -1) || b7 == b) && ((!z2 || !(d78Var.a instanceof zd5)) && b6 != 0)) {
                            d78Var.a(1, new ey7());
                        }
                    }
                    i21++;
                    b = 1;
                }
                return -1;
            }
            ey7Var2.M(i20 + read);
            b = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(f84 f84Var) {
        byte[] bArr = this.d.a;
        cb3 cb3Var = (cb3) f84Var;
        cb3Var.d(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * jn7.R2) + i] != 71) {
                    break;
                }
            }
            cb3Var.l(i, false);
            return true;
        }
        return false;
    }

    @Override // e84
    public final void d(long j, long j2) {
        dk4 dk4Var;
        yve.p(this.a != 2);
        List list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            usb usbVar = (usb) list.get(i);
            boolean z = usbVar.e() == -9223372036854775807L;
            if (!z) {
                long d = usbVar.d();
                z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                usbVar.g(j2);
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
                ((m6c) sparseArray.valueAt(i2)).d();
                i2++;
            }
        }
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        if ((this.b & 1) == 0) {
            g84Var = new vh4(g84Var, this.g);
        }
        this.m = g84Var;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
