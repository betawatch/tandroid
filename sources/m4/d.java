package m4;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d {
    public int a;
    public final int b;
    public final boolean c;
    public Object d;
    public final Cloneable e;
    public Serializable f;
    public Object g;

    public d() {
        this.b = 0;
        this.e = Bundle.EMPTY;
        this.a = -1;
        this.c = true;
    }

    public static s4.k e(int i10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            s4.k kVar = (s4.k) arrayList.get(size);
            if (kVar.a == i10 && kVar.c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((s4.k) arrayList.get(size)).b += z10 ? 1 : -1;
                    size++;
                }
                return kVar;
            }
            size--;
        }
        return null;
    }

    public e a() {
        int i10 = 1;
        t6.o("Exactly one of sessionCommand and playerCommand should be set", (((p1) this.d) == null) != (this.a == -1));
        if (((i9.a) this.f) == null) {
            int i11 = this.a;
            if (i11 != 1) {
                if (i11 != 11 && i11 != 7) {
                    i10 = 6;
                    if (i11 != 6) {
                        if (i11 == 12 || i11 == 9 || i11 == 8) {
                            i10 = 3;
                        }
                    }
                }
                i10 = 2;
            }
            this.f = new i9.a(new int[]{i10});
        }
        return new e((p1) this.d, this.a, this.b, (Bundle) this.e, this.c, (i9.a) this.f, this.g);
    }

    public void b(s4.c0 c0Var) {
        s4.n nVar;
        int i10;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        s4.n nVar2 = (s4.n) this.g;
        s4.b bVar = c0Var instanceof s4.b ? (s4.b) c0Var : new s4.b(c0Var);
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int size = arrayList.size() - 1;
        int i12 = this.b;
        while (size >= 0) {
            s4.m mVar = (s4.m) arrayList.get(size);
            int i13 = mVar.c;
            int i14 = mVar.a + i13;
            int i15 = mVar.b + i13;
            boolean z10 = this.c;
            int[] iArr2 = iArr;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (z10) {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        ArrayList arrayList3 = arrayList;
                        int i20 = i19 & 31;
                        if (i20 != 0) {
                            nVar = nVar2;
                            if (i20 == 4 || i20 == 8) {
                                int i21 = i19 >> 5;
                                i10 = i17;
                                s4.k e = e(i21, arrayList2, false);
                                bVar.E(i18, e.b - 1);
                                if (i20 == 4) {
                                    int i22 = e.b - 1;
                                    nVar.getClass();
                                    bVar.x1(i22, 1);
                                }
                            } else {
                                if (i20 != 16) {
                                    StringBuilder l4 = i0.a.l(i18, "unknown flag for pos ", " ");
                                    l4.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(l4.toString());
                                }
                                arrayList2.add(new s4.k(i18, i18, true));
                                i10 = i17;
                            }
                        } else {
                            nVar = nVar2;
                            i10 = i17;
                            boolean z11 = true;
                            bVar.Q0(i18, 1);
                            int size2 = arrayList2.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj = arrayList2.get(i23);
                                i23++;
                                s4.k kVar = (s4.k) obj;
                                kVar.b--;
                                z11 = true;
                            }
                        }
                        i17 = i10 - 1;
                        arrayList = arrayList3;
                        nVar2 = nVar;
                    }
                } else {
                    bVar.Q0(i14, i16);
                }
            }
            ArrayList arrayList4 = arrayList;
            s4.n nVar3 = nVar2;
            if (i15 < i12) {
                int i24 = i12 - i15;
                if (z10) {
                    for (int i25 = i24 - 1; i25 >= 0; i25--) {
                        int i26 = i15 + i25;
                        int i27 = ((int[]) this.f)[i26];
                        int i28 = i27 & 31;
                        if (i28 != 0) {
                            if (i28 != 4 && i28 != 8) {
                                if (i28 != 16) {
                                    StringBuilder l10 = i0.a.l(i26, "unknown flag for pos ", " ");
                                    l10.append(Long.toBinaryString(i28));
                                    throw new IllegalStateException(l10.toString());
                                }
                                arrayList2.add(new s4.k(i26, i14, false));
                            }
                            bVar.E(e(i27 >> 5, arrayList2, true).b, i14);
                            if (i28 == 4) {
                                nVar3.getClass();
                                bVar.x1(i14, 1);
                            }
                        } else {
                            boolean z12 = true;
                            bVar.n0(i14, 1);
                            int size3 = arrayList2.size();
                            int i29 = 0;
                            while (i29 < size3) {
                                Object obj2 = arrayList2.get(i29);
                                i29++;
                                ((s4.k) obj2).b++;
                                z12 = true;
                            }
                        }
                    }
                } else {
                    bVar.n0(i14, i24);
                }
            }
            for (int i30 = i13 - 1; i30 >= 0; i30--) {
                int i31 = mVar.a + i30;
                if ((iArr2[i31] & 31) == 2) {
                    nVar3.getClass();
                    bVar.x1(i31, 1);
                }
            }
            i11 = mVar.a;
            i12 = mVar.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            nVar2 = nVar3;
        }
        bVar.a();
    }

    public void c(s4.g0 g0Var) {
        b(new l2.f(g0Var, 27));
    }

    public void d(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int i15;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        s4.n nVar = (s4.n) this.g;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            s4.m mVar = (s4.m) ((ArrayList) this.d).get(i12);
            int i16 = mVar.a;
            int i17 = mVar.c;
            int i18 = i16 + i17;
            int i19 = mVar.b + i17;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i18; i20--) {
                    if (nVar.b(i20, i13)) {
                        i15 = nVar.a(i20, i13) ? 8 : 4;
                        iArr2[i13] = (i20 << 5) | 16;
                        iArr[i20] = (i13 << 5) | i15;
                        return;
                    }
                }
            } else {
                for (int i21 = i11 - 1; i21 >= i19; i21--) {
                    if (nVar.b(i13, i21)) {
                        i15 = nVar.a(i13, i21) ? 8 : 4;
                        int i22 = i10 - 1;
                        iArr[i22] = (i21 << 5) | 16;
                        iArr2[i21] = (i22 << 5) | i15;
                        return;
                    }
                }
            }
            i14 = mVar.a;
            i11 = mVar.b;
            i12--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(s4.n nVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = nVar;
        int e = nVar.e();
        this.a = e;
        int d = nVar.d();
        this.b = d;
        this.c = z10;
        s4.m mVar = arrayList.isEmpty() ? null : (s4.m) arrayList.get(0);
        if (mVar == null || mVar.a != 0 || mVar.b != 0) {
            s4.m mVar2 = new s4.m();
            mVar2.a = 0;
            mVar2.b = 0;
            mVar2.d = false;
            mVar2.c = 0;
            mVar2.e = false;
            arrayList.add(0, mVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.m mVar3 = (s4.m) arrayList.get(size);
            int i10 = mVar3.a;
            int i11 = mVar3.c;
            int i12 = i10 + i11;
            int i13 = mVar3.b + i11;
            if (this.c) {
                while (e > i12) {
                    if (iArr[e - 1] == 0) {
                        d(e, d, size, false);
                    }
                    e--;
                }
                while (d > i13) {
                    if (iArr2[d - 1] == 0) {
                        d(e, d, size, true);
                    }
                    d--;
                }
            }
            for (int i14 = 0; i14 < mVar3.c; i14++) {
                int i15 = mVar3.a + i14;
                int i16 = mVar3.b + i14;
                int i17 = ((s4.n) this.g).a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            e = mVar3.a;
            d = mVar3.b;
        }
    }
}
