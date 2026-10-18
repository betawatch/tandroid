package m4;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public final int b;
    public final boolean c;
    public Object d;
    public final Cloneable e;
    public Serializable f;
    public Object g;

    public c() {
        this.b = 0;
        this.e = Bundle.EMPTY;
        this.a = -1;
        this.c = true;
    }

    public static s4.l e(int i10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            s4.l lVar = (s4.l) arrayList.get(size);
            if (lVar.a == i10 && lVar.c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((s4.l) arrayList.get(size)).b += z10 ? 1 : -1;
                    size++;
                }
                return lVar;
            }
            size--;
        }
        return null;
    }

    public d a() {
        int i10 = 1;
        u6.o("Exactly one of sessionCommand and playerCommand should be set", (((o1) this.d) == null) != (this.a == -1));
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
        return new d((o1) this.d, this.a, this.b, (Bundle) this.e, this.c, (i9.a) this.f, this.g);
    }

    public void b(s4.d0 d0Var) {
        s4.o oVar;
        int i10;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        s4.o oVar2 = (s4.o) this.g;
        s4.c cVar = d0Var instanceof s4.c ? (s4.c) d0Var : new s4.c(d0Var);
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int size = arrayList.size() - 1;
        int i12 = this.b;
        while (size >= 0) {
            s4.n nVar = (s4.n) arrayList.get(size);
            int i13 = nVar.c;
            int i14 = nVar.a + i13;
            int i15 = nVar.b + i13;
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
                            oVar = oVar2;
                            if (i20 == 4 || i20 == 8) {
                                int i21 = i19 >> 5;
                                i10 = i17;
                                s4.l e = e(i21, arrayList2, false);
                                cVar.y(i18, e.b - 1);
                                if (i20 == 4) {
                                    int i22 = e.b - 1;
                                    oVar.getClass();
                                    cVar.a1(i22, 1);
                                }
                            } else {
                                if (i20 != 16) {
                                    StringBuilder l4 = i2.d.l(i18, "unknown flag for pos ", " ");
                                    l4.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(l4.toString());
                                }
                                arrayList2.add(new s4.l(i18, i18, true));
                                i10 = i17;
                            }
                        } else {
                            oVar = oVar2;
                            i10 = i17;
                            boolean z11 = true;
                            cVar.t0(i18, 1);
                            int size2 = arrayList2.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj = arrayList2.get(i23);
                                i23++;
                                s4.l lVar = (s4.l) obj;
                                lVar.b--;
                                z11 = true;
                            }
                        }
                        i17 = i10 - 1;
                        arrayList = arrayList3;
                        oVar2 = oVar;
                    }
                } else {
                    cVar.t0(i14, i16);
                }
            }
            ArrayList arrayList4 = arrayList;
            s4.o oVar3 = oVar2;
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
                                    StringBuilder l10 = i2.d.l(i26, "unknown flag for pos ", " ");
                                    l10.append(Long.toBinaryString(i28));
                                    throw new IllegalStateException(l10.toString());
                                }
                                arrayList2.add(new s4.l(i26, i14, false));
                            }
                            cVar.y(e(i27 >> 5, arrayList2, true).b, i14);
                            if (i28 == 4) {
                                oVar3.getClass();
                                cVar.a1(i14, 1);
                            }
                        } else {
                            boolean z12 = true;
                            cVar.X(i14, 1);
                            int size3 = arrayList2.size();
                            int i29 = 0;
                            while (i29 < size3) {
                                Object obj2 = arrayList2.get(i29);
                                i29++;
                                ((s4.l) obj2).b++;
                                z12 = true;
                            }
                        }
                    }
                } else {
                    cVar.X(i14, i24);
                }
            }
            for (int i30 = i13 - 1; i30 >= 0; i30--) {
                int i31 = nVar.a + i30;
                if ((iArr2[i31] & 31) == 2) {
                    oVar3.getClass();
                    cVar.a1(i31, 1);
                }
            }
            i11 = nVar.a;
            i12 = nVar.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            oVar2 = oVar3;
        }
        cVar.a();
    }

    public void c(s4.g0 g0Var) {
        b(new k0.b(g0Var, 25));
    }

    public void d(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int i15;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        s4.o oVar = (s4.o) this.g;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            s4.n nVar = (s4.n) ((ArrayList) this.d).get(i12);
            int i16 = nVar.a;
            int i17 = nVar.c;
            int i18 = i16 + i17;
            int i19 = nVar.b + i17;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i18; i20--) {
                    if (oVar.b(i20, i13)) {
                        i15 = oVar.a(i20, i13) ? 8 : 4;
                        iArr2[i13] = (i20 << 5) | 16;
                        iArr[i20] = (i13 << 5) | i15;
                        return;
                    }
                }
            } else {
                for (int i21 = i11 - 1; i21 >= i19; i21--) {
                    if (oVar.b(i13, i21)) {
                        i15 = oVar.a(i13, i21) ? 8 : 4;
                        int i22 = i10 - 1;
                        iArr[i22] = (i21 << 5) | 16;
                        iArr2[i21] = (i22 << 5) | i15;
                        return;
                    }
                }
            }
            i14 = nVar.a;
            i11 = nVar.b;
            i12--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(s4.o oVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = oVar;
        int e = oVar.e();
        this.a = e;
        int d = oVar.d();
        this.b = d;
        this.c = z10;
        s4.n nVar = arrayList.isEmpty() ? null : (s4.n) arrayList.get(0);
        if (nVar == null || nVar.a != 0 || nVar.b != 0) {
            s4.n nVar2 = new s4.n();
            nVar2.a = 0;
            nVar2.b = 0;
            nVar2.d = false;
            nVar2.c = 0;
            nVar2.e = false;
            arrayList.add(0, nVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.n nVar3 = (s4.n) arrayList.get(size);
            int i10 = nVar3.a;
            int i11 = nVar3.c;
            int i12 = i10 + i11;
            int i13 = nVar3.b + i11;
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
            for (int i14 = 0; i14 < nVar3.c; i14++) {
                int i15 = nVar3.a + i14;
                int i16 = nVar3.b + i14;
                int i17 = ((s4.o) this.g).a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            e = nVar3.a;
            d = nVar3.b;
        }
    }
}
