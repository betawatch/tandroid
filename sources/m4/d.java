package m4;

import a8.yb;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import li.e3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    public static s4.m e(int i10, ArrayList arrayList, boolean z10) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            s4.m mVar = (s4.m) arrayList.get(size);
            if (mVar.a == i10 && mVar.c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((s4.m) arrayList.get(size)).b += z10 ? 1 : -1;
                    size++;
                }
                return mVar;
            }
            size--;
        }
        return null;
    }

    public e a() {
        int i10 = 1;
        yb.o("Exactly one of sessionCommand and playerCommand should be set", (((p1) this.d) == null) != (this.a == -1));
        if (((j9.a) this.f) == null) {
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
            this.f = new j9.a(new int[]{i10});
        }
        return new e((p1) this.d, this.a, this.b, (Bundle) this.e, this.c, (j9.a) this.f, this.g);
    }

    public void b(s4.e0 e0Var) {
        s4.p pVar;
        int i10;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        s4.p pVar2 = (s4.p) this.g;
        s4.c cVar = e0Var instanceof s4.c ? (s4.c) e0Var : new s4.c(e0Var);
        ArrayList arrayList2 = new ArrayList();
        int i11 = this.a;
        int size = arrayList.size() - 1;
        int i12 = this.b;
        while (size >= 0) {
            s4.o oVar = (s4.o) arrayList.get(size);
            int i13 = oVar.c;
            int i14 = oVar.a + i13;
            int i15 = oVar.b + i13;
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
                            pVar = pVar2;
                            if (i20 == 4 || i20 == 8) {
                                int i21 = i19 >> 5;
                                i10 = i17;
                                s4.m e = e(i21, arrayList2, false);
                                cVar.A(i18, e.b - 1);
                                if (i20 == 4) {
                                    int i22 = e.b - 1;
                                    pVar.getClass();
                                    cVar.g1(i22, 1);
                                }
                            } else {
                                if (i20 != 16) {
                                    StringBuilder k10 = ic.a.k(i18, "unknown flag for pos ", " ");
                                    k10.append(Long.toBinaryString(i20));
                                    throw new IllegalStateException(k10.toString());
                                }
                                arrayList2.add(new s4.m(i18, i18, true));
                                i10 = i17;
                            }
                        } else {
                            pVar = pVar2;
                            i10 = i17;
                            boolean z11 = true;
                            cVar.N0(i18, 1);
                            int size2 = arrayList2.size();
                            int i23 = 0;
                            while (i23 < size2) {
                                Object obj = arrayList2.get(i23);
                                i23++;
                                s4.m mVar = (s4.m) obj;
                                mVar.b--;
                                z11 = true;
                            }
                        }
                        i17 = i10 - 1;
                        arrayList = arrayList3;
                        pVar2 = pVar;
                    }
                } else {
                    cVar.N0(i14, i16);
                }
            }
            ArrayList arrayList4 = arrayList;
            s4.p pVar3 = pVar2;
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
                                    StringBuilder k11 = ic.a.k(i26, "unknown flag for pos ", " ");
                                    k11.append(Long.toBinaryString(i28));
                                    throw new IllegalStateException(k11.toString());
                                }
                                arrayList2.add(new s4.m(i26, i14, false));
                            }
                            cVar.A(e(i27 >> 5, arrayList2, true).b, i14);
                            if (i28 == 4) {
                                pVar3.getClass();
                                cVar.g1(i14, 1);
                            }
                        } else {
                            boolean z12 = true;
                            cVar.i0(i14, 1);
                            int size3 = arrayList2.size();
                            int i29 = 0;
                            while (i29 < size3) {
                                Object obj2 = arrayList2.get(i29);
                                i29++;
                                ((s4.m) obj2).b++;
                                z12 = true;
                            }
                        }
                    }
                } else {
                    cVar.i0(i14, i24);
                }
            }
            for (int i30 = i13 - 1; i30 >= 0; i30--) {
                int i31 = oVar.a + i30;
                if ((iArr2[i31] & 31) == 2) {
                    pVar3.getClass();
                    cVar.g1(i31, 1);
                }
            }
            i11 = oVar.a;
            i12 = oVar.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            pVar2 = pVar3;
        }
        cVar.a();
    }

    public void c(s4.h0 h0Var) {
        b(new e3(h0Var, 17));
    }

    public void d(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        int i15;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        s4.p pVar = (s4.p) this.g;
        if (z10) {
            i11--;
            i14 = i10;
            i13 = i11;
        } else {
            i13 = i10 - 1;
            i14 = i13;
        }
        while (i12 >= 0) {
            s4.o oVar = (s4.o) ((ArrayList) this.d).get(i12);
            int i16 = oVar.a;
            int i17 = oVar.c;
            int i18 = i16 + i17;
            int i19 = oVar.b + i17;
            if (z10) {
                for (int i20 = i14 - 1; i20 >= i18; i20--) {
                    if (pVar.b(i20, i13)) {
                        i15 = pVar.a(i20, i13) ? 8 : 4;
                        iArr2[i13] = (i20 << 5) | 16;
                        iArr[i20] = (i13 << 5) | i15;
                        return;
                    }
                }
            } else {
                for (int i21 = i11 - 1; i21 >= i19; i21--) {
                    if (pVar.b(i13, i21)) {
                        i15 = pVar.a(i13, i21) ? 8 : 4;
                        int i22 = i10 - 1;
                        iArr[i22] = (i21 << 5) | 16;
                        iArr2[i21] = (i22 << 5) | i15;
                        return;
                    }
                }
            }
            i14 = oVar.a;
            i11 = oVar.b;
            i12--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(s4.p pVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = pVar;
        int e = pVar.e();
        this.a = e;
        int d = pVar.d();
        this.b = d;
        this.c = z10;
        s4.o oVar = arrayList.isEmpty() ? null : (s4.o) arrayList.get(0);
        if (oVar == null || oVar.a != 0 || oVar.b != 0) {
            s4.o oVar2 = new s4.o();
            oVar2.a = 0;
            oVar2.b = 0;
            oVar2.d = false;
            oVar2.c = 0;
            oVar2.e = false;
            arrayList.add(0, oVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.o oVar3 = (s4.o) arrayList.get(size);
            int i10 = oVar3.a;
            int i11 = oVar3.c;
            int i12 = i10 + i11;
            int i13 = oVar3.b + i11;
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
            for (int i14 = 0; i14 < oVar3.c; i14++) {
                int i15 = oVar3.a + i14;
                int i16 = oVar3.b + i14;
                int i17 = ((s4.p) this.g).a(i15, i16) ? 1 : 2;
                iArr[i15] = (i16 << 5) | i17;
                iArr2[i16] = (i15 << 5) | i17;
            }
            e = oVar3.a;
            d = oVar3.b;
        }
    }
}
