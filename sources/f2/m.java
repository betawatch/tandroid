package f2;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final q d;
    public final int e;
    public final int f;
    public final boolean g;

    public m(q qVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z4) {
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = qVar;
        int e6 = qVar.e();
        this.e = e6;
        int d = qVar.d();
        this.f = d;
        this.g = z4;
        p pVar = arrayList.isEmpty() ? null : (p) arrayList.get(0);
        if (pVar == null || pVar.a != 0 || pVar.b != 0) {
            p pVar2 = new p();
            pVar2.a = 0;
            pVar2.b = 0;
            pVar2.d = false;
            pVar2.c = 0;
            pVar2.e = false;
            arrayList.add(0, pVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p pVar3 = (p) arrayList.get(size);
            int i10 = pVar3.a;
            int i11 = pVar3.c;
            int i12 = i10 + i11;
            int i13 = pVar3.b + i11;
            if (this.g) {
                while (e6 > i12) {
                    if (iArr[e6 - 1] == 0) {
                        c(e6, d, size, false);
                    }
                    e6--;
                }
                while (d > i13) {
                    if (iArr2[d - 1] == 0) {
                        c(e6, d, size, true);
                    }
                    d--;
                }
            }
            for (int i14 = 0; i14 < pVar3.c; i14++) {
                int i15 = pVar3.a + i14;
                int i16 = pVar3.b + i14;
                int i17 = this.d.a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            e6 = pVar3.a;
            d = pVar3.b;
        }
    }

    public static n d(int i10, ArrayList arrayList, boolean z4) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            n nVar = (n) arrayList.get(size);
            if (nVar.a == i10 && nVar.c == z4) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((n) arrayList.get(size)).b += z4 ? 1 : -1;
                    size++;
                }
                return nVar;
            }
            size--;
        }
        return null;
    }

    public final void a(l0 l0Var) {
        int[] iArr;
        int i10;
        b bVar = l0Var instanceof b ? (b) l0Var : new b(l0Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size() - 1;
        int i11 = this.e;
        int i12 = this.f;
        while (size >= 0) {
            p pVar = (p) arrayList2.get(size);
            int i13 = pVar.c;
            int i14 = pVar.a + i13;
            int i15 = pVar.b + i13;
            int[] iArr2 = this.b;
            boolean z4 = this.g;
            q qVar = this.d;
            ArrayList arrayList3 = arrayList2;
            if (i14 < i11) {
                int i16 = i11 - i14;
                if (z4) {
                    int i17 = i16 - 1;
                    while (i17 >= 0) {
                        int i18 = i14 + i17;
                        int i19 = iArr2[i18];
                        int i20 = size;
                        int i21 = i19 & 31;
                        if (i21 != 0) {
                            iArr = iArr2;
                            if (i21 == 4 || i21 == 8) {
                                int i22 = i19 >> 5;
                                i10 = i17;
                                n d = d(i22, arrayList, false);
                                bVar.C(i18, d.b - 1);
                                if (i21 == 4) {
                                    int i23 = d.b - 1;
                                    qVar.getClass();
                                    bVar.i1(i23, 1);
                                }
                            } else {
                                if (i21 != 16) {
                                    StringBuilder m9 = l.d.m(i18, "unknown flag for pos ", " ");
                                    m9.append(Long.toBinaryString(i21));
                                    throw new IllegalStateException(m9.toString());
                                }
                                arrayList.add(new n(i18, i18, true));
                                i10 = i17;
                            }
                        } else {
                            iArr = iArr2;
                            i10 = i17;
                            bVar.L0(i18, 1);
                            int size2 = arrayList.size();
                            int i24 = 0;
                            while (i24 < size2) {
                                Object obj = arrayList.get(i24);
                                i24++;
                                n nVar = (n) obj;
                                nVar.b--;
                            }
                        }
                        i17 = i10 - 1;
                        size = i20;
                        iArr2 = iArr;
                    }
                } else {
                    bVar.L0(i14, i16);
                }
            }
            int i25 = size;
            int[] iArr3 = iArr2;
            if (i15 < i12) {
                int i26 = i12 - i15;
                if (z4) {
                    for (int i27 = i26 - 1; i27 >= 0; i27--) {
                        int i28 = i15 + i27;
                        int i29 = this.c[i28];
                        int i30 = i29 & 31;
                        if (i30 != 0) {
                            if (i30 != 4 && i30 != 8) {
                                if (i30 != 16) {
                                    StringBuilder m10 = l.d.m(i28, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i30));
                                    throw new IllegalStateException(m10.toString());
                                }
                                arrayList.add(new n(i28, i14, false));
                            }
                            bVar.C(d(i29 >> 5, arrayList, true).b, i14);
                            if (i30 == 4) {
                                qVar.getClass();
                                bVar.i1(i14, 1);
                            }
                        } else {
                            bVar.j0(i14, 1);
                            int size3 = arrayList.size();
                            int i31 = 0;
                            while (i31 < size3) {
                                Object obj2 = arrayList.get(i31);
                                i31++;
                                ((n) obj2).b++;
                            }
                        }
                    }
                } else {
                    bVar.j0(i14, i26);
                }
            }
            for (int i32 = i13 - 1; i32 >= 0; i32--) {
                int i33 = pVar.a + i32;
                if ((iArr3[i33] & 31) == 2) {
                    qVar.getClass();
                    bVar.i1(i33, 1);
                }
            }
            i11 = pVar.a;
            i12 = pVar.b;
            size = i25 - 1;
            arrayList2 = arrayList3;
        }
        bVar.a();
    }

    public final void b(p0 p0Var) {
        a(new o5.i(p0Var, 11));
    }

    public final void c(int i10, int i11, int i12, boolean z4) {
        int i13;
        int i14;
        int i15;
        if (z4) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            p pVar = (p) this.a.get(i12);
            int i16 = pVar.a;
            int i17 = pVar.c;
            int i18 = i16 + i17;
            int i19 = pVar.b + i17;
            int[] iArr = this.b;
            int[] iArr2 = this.c;
            q qVar = this.d;
            if (z4) {
                for (int i20 = i14 - 1; i20 >= i18; i20--) {
                    if (qVar.b(i20, i13)) {
                        i15 = qVar.a(i20, i13) ? 8 : 4;
                        iArr2[i13] = (i20 << 5) | 16;
                        iArr[i20] = (i13 << 5) | i15;
                        return;
                    }
                }
            } else {
                for (int i21 = i11 - 1; i21 >= i19; i21--) {
                    if (qVar.b(i13, i21)) {
                        i15 = qVar.a(i13, i21) ? 8 : 4;
                        int i22 = i10 - 1;
                        iArr[i22] = (i21 << 5) | 16;
                        iArr2[i21] = (i22 << 5) | i15;
                        return;
                    }
                }
            }
            i14 = pVar.a;
            i11 = pVar.b;
            i12--;
        }
    }
}
