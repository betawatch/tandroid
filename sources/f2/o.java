package f2;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final s d;
    public final int e;
    public final int f;
    public final boolean g;

    public o(s sVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = sVar;
        int e10 = sVar.e();
        this.e = e10;
        int d = sVar.d();
        this.f = d;
        this.g = z10;
        r rVar = arrayList.isEmpty() ? null : (r) arrayList.get(0);
        if (rVar == null || rVar.a != 0 || rVar.b != 0) {
            r rVar2 = new r();
            rVar2.a = 0;
            rVar2.b = 0;
            rVar2.d = false;
            rVar2.c = 0;
            rVar2.e = false;
            arrayList.add(0, rVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r rVar3 = (r) arrayList.get(size);
            int i9 = rVar3.a;
            int i10 = rVar3.c;
            int i11 = i9 + i10;
            int i12 = rVar3.b + i10;
            if (this.g) {
                while (e10 > i11) {
                    if (iArr[e10 - 1] == 0) {
                        c(e10, d, size, false);
                    }
                    e10--;
                }
                while (d > i12) {
                    if (iArr2[d - 1] == 0) {
                        c(e10, d, size, true);
                    }
                    d--;
                }
            }
            for (int i13 = 0; i13 < rVar3.c; i13++) {
                int i14 = rVar3.a + i13;
                int i15 = rVar3.b + i13;
                int i16 = this.d.a(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 5) | i16;
                iArr2[i15] = (i14 << 5) | i16;
            }
            e10 = rVar3.a;
            d = rVar3.b;
        }
    }

    public static p d(int i9, ArrayList arrayList, boolean z10) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            p pVar = (p) arrayList.get(size);
            if (pVar.a == i9 && pVar.c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((p) arrayList.get(size)).b += z10 ? 1 : -1;
                    size++;
                }
                return pVar;
            }
            size--;
        }
        return null;
    }

    public final void a(o0 o0Var) {
        int[] iArr;
        int i9;
        c cVar = o0Var instanceof c ? (c) o0Var : new c(o0Var);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size() - 1;
        int i10 = this.e;
        int i11 = this.f;
        while (size >= 0) {
            r rVar = (r) arrayList2.get(size);
            int i12 = rVar.c;
            int i13 = rVar.a + i12;
            int i14 = rVar.b + i12;
            int[] iArr2 = this.b;
            boolean z10 = this.g;
            s sVar = this.d;
            ArrayList arrayList3 = arrayList2;
            if (i13 < i10) {
                int i15 = i10 - i13;
                if (z10) {
                    int i16 = i15 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + i16;
                        int i18 = iArr2[i17];
                        int i19 = size;
                        int i20 = i18 & 31;
                        if (i20 != 0) {
                            iArr = iArr2;
                            if (i20 == 4 || i20 == 8) {
                                int i21 = i18 >> 5;
                                i9 = i16;
                                p d = d(i21, arrayList, false);
                                cVar.t(i17, d.b - 1);
                                if (i20 == 4) {
                                    int i22 = d.b - 1;
                                    sVar.getClass();
                                    cVar.j1(i22, 1);
                                }
                            } else {
                                if (i20 != 16) {
                                    StringBuilder p6 = j3.r0.p(i17, "unknown flag for pos ", " ");
                                    p6.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(p6.toString());
                                }
                                arrayList.add(new p(i17, i17, true));
                                i9 = i16;
                            }
                        } else {
                            iArr = iArr2;
                            i9 = i16;
                            cVar.J0(i17, 1);
                            int size2 = arrayList.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj = arrayList.get(i23);
                                i23++;
                                p pVar = (p) obj;
                                pVar.b--;
                            }
                        }
                        i16 = i9 - 1;
                        size = i19;
                        iArr2 = iArr;
                    }
                } else {
                    cVar.J0(i13, i15);
                }
            }
            int i24 = size;
            int[] iArr3 = iArr2;
            if (i14 < i11) {
                int i25 = i11 - i14;
                if (z10) {
                    for (int i26 = i25 - 1; i26 >= 0; i26--) {
                        int i27 = i14 + i26;
                        int i28 = this.c[i27];
                        int i29 = i28 & 31;
                        if (i29 != 0) {
                            if (i29 != 4 && i29 != 8) {
                                if (i29 != 16) {
                                    StringBuilder p9 = j3.r0.p(i27, "unknown flag for pos ", " ");
                                    p9.append(Long.toBinaryString(i29));
                                    throw new IllegalStateException(p9.toString());
                                }
                                arrayList.add(new p(i27, i13, false));
                            }
                            cVar.t(d(i28 >> 5, arrayList, true).b, i13);
                            if (i29 == 4) {
                                sVar.getClass();
                                cVar.j1(i13, 1);
                            }
                        } else {
                            cVar.I(i13, 1);
                            int size3 = arrayList.size();
                            int i30 = 0;
                            while (i30 < size3) {
                                Object obj2 = arrayList.get(i30);
                                i30++;
                                ((p) obj2).b++;
                            }
                        }
                    }
                } else {
                    cVar.I(i13, i25);
                }
            }
            for (int i31 = i12 - 1; i31 >= 0; i31--) {
                int i32 = rVar.a + i31;
                if ((iArr3[i32] & 31) == 2) {
                    sVar.getClass();
                    cVar.j1(i32, 1);
                }
            }
            i10 = rVar.a;
            i11 = rVar.b;
            size = i24 - 1;
            arrayList2 = arrayList3;
        }
        cVar.a();
    }

    public final void b(r0 r0Var) {
        a(new android.support.v4.media.c(r0Var, 10));
    }

    public final void c(int i9, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        if (z10) {
            i10--;
            i13 = i9;
            i12 = i10;
        } else {
            i12 = i9 - 1;
            i13 = i12;
        }
        while (i11 >= 0) {
            r rVar = (r) this.a.get(i11);
            int i15 = rVar.a;
            int i16 = rVar.c;
            int i17 = i15 + i16;
            int i18 = rVar.b + i16;
            int[] iArr = this.b;
            int[] iArr2 = this.c;
            s sVar = this.d;
            if (z10) {
                for (int i19 = i13 - 1; i19 >= i17; i19--) {
                    if (sVar.b(i19, i12)) {
                        i14 = sVar.a(i19, i12) ? 8 : 4;
                        iArr2[i12] = (i19 << 5) | 16;
                        iArr[i19] = (i12 << 5) | i14;
                        return;
                    }
                }
            } else {
                for (int i20 = i10 - 1; i20 >= i18; i20--) {
                    if (sVar.b(i12, i20)) {
                        i14 = sVar.a(i12, i20) ? 8 : 4;
                        int i21 = i9 - 1;
                        iArr[i21] = (i20 << 5) | 16;
                        iArr2[i20] = (i21 << 5) | i14;
                        return;
                    }
                }
            }
            i13 = rVar.a;
            i10 = rVar.b;
            i11--;
        }
    }
}
