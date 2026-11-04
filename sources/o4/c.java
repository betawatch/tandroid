package o4;

import android.os.Bundle;
import b8.zb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public static u4.l e(int i3, ArrayList arrayList, boolean z10) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            u4.l lVar = (u4.l) arrayList.get(size);
            if (lVar.a == i3 && lVar.c == z10) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((u4.l) arrayList.get(size)).b += z10 ? 1 : -1;
                    size++;
                }
                return lVar;
            }
            size--;
        }
        return null;
    }

    public d a() {
        int i3 = 1;
        zb.o("Exactly one of sessionCommand and playerCommand should be set", (((n1) this.d) == null) != (this.a == -1));
        if (((k9.a) this.f) == null) {
            int i10 = this.a;
            if (i10 != 1) {
                if (i10 != 11 && i10 != 7) {
                    i3 = 6;
                    if (i10 != 6) {
                        if (i10 == 12 || i10 == 9 || i10 == 8) {
                            i3 = 3;
                        }
                    }
                }
                i3 = 2;
            }
            this.f = new k9.a(new int[]{i3});
        }
        return new d((n1) this.d, this.a, this.b, (Bundle) this.e, this.c, (k9.a) this.f, this.g);
    }

    public void b(u4.d0 d0Var) {
        u4.o oVar;
        int i3;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        u4.o oVar2 = (u4.o) this.g;
        u4.c cVar = d0Var instanceof u4.c ? (u4.c) d0Var : new u4.c(d0Var);
        ArrayList arrayList2 = new ArrayList();
        int i10 = this.a;
        int size = arrayList.size() - 1;
        int i11 = this.b;
        while (size >= 0) {
            u4.n nVar = (u4.n) arrayList.get(size);
            int i12 = nVar.c;
            int i13 = nVar.a + i12;
            int i14 = nVar.b + i12;
            boolean z10 = this.c;
            int[] iArr2 = iArr;
            if (i13 < i10) {
                int i15 = i10 - i13;
                if (z10) {
                    int i16 = i15 - 1;
                    while (i16 >= 0) {
                        int i17 = i13 + i16;
                        int i18 = iArr2[i17];
                        ArrayList arrayList3 = arrayList;
                        int i19 = i18 & 31;
                        if (i19 != 0) {
                            oVar = oVar2;
                            if (i19 == 4 || i19 == 8) {
                                int i20 = i18 >> 5;
                                i3 = i16;
                                u4.l e10 = e(i20, arrayList2, false);
                                cVar.E(i17, e10.b - 1);
                                if (i19 == 4) {
                                    int i21 = e10.b - 1;
                                    oVar.getClass();
                                    cVar.j1(i21, 1);
                                }
                            } else {
                                if (i19 != 16) {
                                    StringBuilder m10 = k2.p1.m(i17, "unknown flag for pos ", " ");
                                    m10.append(Long.toBinaryString(i19));
                                    throw new IllegalStateException(m10.toString());
                                }
                                arrayList2.add(new u4.l(i17, i17, true));
                                i3 = i16;
                            }
                        } else {
                            oVar = oVar2;
                            i3 = i16;
                            boolean z11 = true;
                            cVar.O0(i17, 1);
                            int size2 = arrayList2.size();
                            int i22 = 0;
                            while (i22 < size2) {
                                Object obj = arrayList2.get(i22);
                                i22++;
                                u4.l lVar = (u4.l) obj;
                                lVar.b--;
                                z11 = true;
                            }
                        }
                        i16 = i3 - 1;
                        arrayList = arrayList3;
                        oVar2 = oVar;
                    }
                } else {
                    cVar.O0(i13, i15);
                }
            }
            ArrayList arrayList4 = arrayList;
            u4.o oVar3 = oVar2;
            if (i14 < i11) {
                int i23 = i11 - i14;
                if (z10) {
                    for (int i24 = i23 - 1; i24 >= 0; i24--) {
                        int i25 = i14 + i24;
                        int i26 = ((int[]) this.f)[i25];
                        int i27 = i26 & 31;
                        if (i27 != 0) {
                            if (i27 != 4 && i27 != 8) {
                                if (i27 != 16) {
                                    StringBuilder m11 = k2.p1.m(i25, "unknown flag for pos ", " ");
                                    m11.append(Long.toBinaryString(i27));
                                    throw new IllegalStateException(m11.toString());
                                }
                                arrayList2.add(new u4.l(i25, i13, false));
                            }
                            cVar.E(e(i26 >> 5, arrayList2, true).b, i13);
                            if (i27 == 4) {
                                oVar3.getClass();
                                cVar.j1(i13, 1);
                            }
                        } else {
                            boolean z12 = true;
                            cVar.l0(i13, 1);
                            int size3 = arrayList2.size();
                            int i28 = 0;
                            while (i28 < size3) {
                                Object obj2 = arrayList2.get(i28);
                                i28++;
                                ((u4.l) obj2).b++;
                                z12 = true;
                            }
                        }
                    }
                } else {
                    cVar.l0(i13, i23);
                }
            }
            for (int i29 = i12 - 1; i29 >= 0; i29--) {
                int i30 = nVar.a + i29;
                if ((iArr2[i30] & 31) == 2) {
                    oVar3.getClass();
                    cVar.j1(i30, 1);
                }
            }
            i10 = nVar.a;
            i11 = nVar.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            oVar2 = oVar3;
        }
        cVar.a();
    }

    public void c(u4.h0 h0Var) {
        b(new nh(h0Var, 21));
    }

    public void d(int i3, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int i14;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        u4.o oVar = (u4.o) this.g;
        if (z10) {
            i10--;
            i13 = i3;
            i12 = i10;
        } else {
            i12 = i3 - 1;
            i13 = i12;
        }
        while (i11 >= 0) {
            u4.n nVar = (u4.n) ((ArrayList) this.d).get(i11);
            int i15 = nVar.a;
            int i16 = nVar.c;
            int i17 = i15 + i16;
            int i18 = nVar.b + i16;
            if (z10) {
                for (int i19 = i13 - 1; i19 >= i17; i19--) {
                    if (oVar.b(i19, i12)) {
                        i14 = oVar.a(i19, i12) ? 8 : 4;
                        iArr2[i12] = (i19 << 5) | 16;
                        iArr[i19] = (i12 << 5) | i14;
                        return;
                    }
                }
            } else {
                for (int i20 = i10 - 1; i20 >= i18; i20--) {
                    if (oVar.b(i12, i20)) {
                        i14 = oVar.a(i12, i20) ? 8 : 4;
                        int i21 = i3 - 1;
                        iArr[i21] = (i20 << 5) | 16;
                        iArr2[i20] = (i21 << 5) | i14;
                        return;
                    }
                }
            }
            i13 = nVar.a;
            i10 = nVar.b;
            i11--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(u4.o oVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = oVar;
        int e10 = oVar.e();
        this.a = e10;
        int d = oVar.d();
        this.b = d;
        this.c = z10;
        u4.n nVar = arrayList.isEmpty() ? null : (u4.n) arrayList.get(0);
        if (nVar == null || nVar.a != 0 || nVar.b != 0) {
            u4.n nVar2 = new u4.n();
            nVar2.a = 0;
            nVar2.b = 0;
            nVar2.d = false;
            nVar2.c = 0;
            nVar2.e = false;
            arrayList.add(0, nVar2);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u4.n nVar3 = (u4.n) arrayList.get(size);
            int i3 = nVar3.a;
            int i10 = nVar3.c;
            int i11 = i3 + i10;
            int i12 = nVar3.b + i10;
            if (this.c) {
                while (e10 > i11) {
                    if (iArr[e10 - 1] == 0) {
                        d(e10, d, size, false);
                    }
                    e10--;
                }
                while (d > i12) {
                    if (iArr2[d - 1] == 0) {
                        d(e10, d, size, true);
                    }
                    d--;
                }
            }
            for (int i13 = 0; i13 < nVar3.c; i13++) {
                int i14 = nVar3.a + i13;
                int i15 = nVar3.b + i13;
                int i16 = ((u4.o) this.g).a(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 5) | i16;
                iArr2[i15] = (i14 << 5) | i16;
            }
            e10 = nVar3.a;
            d = nVar3.b;
        }
    }
}
