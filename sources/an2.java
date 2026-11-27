// default package

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class an2 {
    public int a;
    public final int b;
    public final boolean c;
    public Object d;
    public final Cloneable e;
    public Serializable f;
    public Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public an2(qie qieVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
        int i;
        int i2;
        this.d = arrayList;
        this.e = iArr;
        this.f = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = qieVar;
        int d = qieVar.d();
        this.a = d;
        int c = qieVar.c();
        this.b = c;
        this.c = z;
        lo3 lo3Var = arrayList.isEmpty() ? null : (lo3) arrayList.get(0);
        if (lo3Var == null || lo3Var.a != 0 || lo3Var.b != 0) {
            lo3 lo3Var2 = new lo3();
            lo3Var2.a = 0;
            lo3Var2.b = 0;
            lo3Var2.d = false;
            lo3Var2.c = 0;
            lo3Var2.e = false;
            arrayList.add(0, lo3Var2);
        }
        int size = arrayList.size() - 1;
        while (size >= 0) {
            lo3 lo3Var3 = (lo3) arrayList.get(size);
            int i3 = lo3Var3.a;
            int i4 = lo3Var3.c;
            int i5 = i3 + i4;
            int i6 = lo3Var3.b + i4;
            if (this.c) {
                while (d > i5) {
                    if (iArr[d - 1] == 0) {
                        d(d, c, size, false);
                    }
                    d--;
                }
                while (c > i6) {
                    if (iArr2[c - 1] == 0) {
                        d(d, c, size, true);
                    }
                    c--;
                }
            }
            int i7 = 0;
            while (true) {
                int i8 = lo3Var3.c;
                i = lo3Var3.a;
                i2 = lo3Var3.b;
                if (i7 < i8) {
                    int i9 = i + i7;
                    int i10 = i2 + i7;
                    int i11 = ((qie) this.g).a(i9, i10) ? 1 : 2;
                    iArr[i9] = (i10 << 5) | i11;
                    iArr2[i10] = (i9 << 5) | i11;
                    i7++;
                }
            }
            size--;
            d = i;
            c = i2;
        }
    }

    public static jo3 e(int i, ArrayList arrayList, boolean z) {
        int size = arrayList.size() - 1;
        while (size >= 0) {
            jo3 jo3Var = (jo3) arrayList.get(size);
            if (jo3Var.a == i && jo3Var.c == z) {
                arrayList.remove(size);
                while (size < arrayList.size()) {
                    ((jo3) arrayList.get(size)).b += z ? 1 : -1;
                    size++;
                }
                return jo3Var;
            }
            size--;
        }
        return null;
    }

    public final bn2 a() {
        int i;
        yve.o("Exactly one of sessionCommand and playerCommand should be set", (((h9a) this.d) == null) != (this.a == -1));
        if (((lo5) this.f) == null) {
            int i2 = this.a;
            if (i2 != 1) {
                if (i2 != 11 && i2 != 7) {
                    i = 6;
                    if (i2 != 6) {
                        if (i2 == 12 || i2 == 9 || i2 == 8) {
                            i = 3;
                        }
                    }
                }
                i = 2;
            } else {
                i = 1;
            }
            this.f = new lo5(new int[]{i}, 1);
        }
        return new bn2((h9a) this.d, this.a, this.b, (Bundle) this.e, this.c, (lo5) this.f, this.g);
    }

    public final void b(v76 v76Var) {
        int i;
        int[] iArr = (int[]) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        qie qieVar = (qie) this.g;
        ch0 ch0Var = v76Var instanceof ch0 ? (ch0) v76Var : new ch0(v76Var);
        ArrayList arrayList2 = new ArrayList();
        int i2 = this.a;
        int size = arrayList.size() - 1;
        int i3 = this.b;
        while (size >= 0) {
            lo3 lo3Var = (lo3) arrayList.get(size);
            int i4 = lo3Var.c;
            int i5 = lo3Var.a + i4;
            int i6 = lo3Var.b + i4;
            boolean z = this.c;
            int[] iArr2 = iArr;
            if (i5 < i2) {
                int i7 = i2 - i5;
                if (z) {
                    int i8 = i7 - 1;
                    while (i8 >= 0) {
                        int i9 = i5 + i8;
                        int i10 = iArr2[i9];
                        ArrayList arrayList3 = arrayList;
                        int i11 = i10 & 31;
                        qie qieVar2 = qieVar;
                        if (i11 == 0) {
                            i = i8;
                            boolean z2 = true;
                            ch0Var.X(i9, 1);
                            int size2 = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                jo3 jo3Var = (jo3) obj;
                                jo3Var.b--;
                                z2 = true;
                            }
                        } else if (i11 == 4 || i11 == 8) {
                            int i13 = i10 >> 5;
                            i = i8;
                            jo3 e = e(i13, arrayList2, false);
                            ch0Var.n(i9, e.b - 1);
                            if (i11 == 4) {
                                int i14 = e.b - 1;
                                qieVar2.getClass();
                                ch0Var.x0(i14, 1);
                            }
                        } else if (i11 != 16) {
                            grb.k(uh9.m(i9, "unknown flag for pos ", " "), Long.toBinaryString(i11));
                            return;
                        } else {
                            arrayList2.add(new jo3(i9, i9, true));
                            i = i8;
                        }
                        i8 = i - 1;
                        arrayList = arrayList3;
                        qieVar = qieVar2;
                    }
                } else {
                    ch0Var.X(i5, i7);
                }
            }
            ArrayList arrayList4 = arrayList;
            qie qieVar3 = qieVar;
            if (i6 < i3) {
                int i15 = i3 - i6;
                if (z) {
                    for (int i16 = i15 - 1; i16 >= 0; i16--) {
                        int i17 = i6 + i16;
                        int i18 = ((int[]) this.f)[i17];
                        int i19 = i18 & 31;
                        if (i19 == 0) {
                            boolean z3 = true;
                            ch0Var.C(i5, 1);
                            int size3 = arrayList2.size();
                            int i20 = 0;
                            while (i20 < size3) {
                                Object obj2 = arrayList2.get(i20);
                                i20++;
                                ((jo3) obj2).b++;
                                z3 = true;
                            }
                        } else if (i19 == 4 || i19 == 8) {
                            ch0Var.n(e(i18 >> 5, arrayList2, true).b, i5);
                            if (i19 == 4) {
                                qieVar3.getClass();
                                ch0Var.x0(i5, 1);
                            }
                        } else {
                            if (i19 != 16) {
                                grb.k(uh9.m(i17, "unknown flag for pos ", " "), Long.toBinaryString(i19));
                                return;
                            }
                            arrayList2.add(new jo3(i17, i5, false));
                        }
                    }
                } else {
                    ch0Var.C(i5, i15);
                }
            }
            while (true) {
                i4--;
                i2 = lo3Var.a;
                if (i4 >= 0) {
                    int i21 = i2 + i4;
                    if ((iArr2[i21] & 31) == 2) {
                        qieVar3.getClass();
                        ch0Var.x0(i21, 1);
                    }
                }
            }
            i3 = lo3Var.b;
            size--;
            iArr = iArr2;
            arrayList = arrayList4;
            qieVar = qieVar3;
        }
        ch0Var.a();
    }

    public final void c(j79 j79Var) {
        b(new z8d((Object) j79Var, (byte) 4));
    }

    public final void d(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        int[] iArr = (int[]) this.e;
        int[] iArr2 = (int[]) this.f;
        qie qieVar = (qie) this.g;
        if (z) {
            i2--;
            i5 = i;
            i4 = i2;
        } else {
            i4 = i - 1;
            i5 = i4;
        }
        while (i3 >= 0) {
            lo3 lo3Var = (lo3) ((ArrayList) this.d).get(i3);
            int i7 = lo3Var.a;
            int i8 = lo3Var.c;
            int i9 = i7 + i8;
            int i10 = lo3Var.b + i8;
            if (z) {
                for (int i11 = i5 - 1; i11 >= i9; i11--) {
                    if (qieVar.b(i11, i4)) {
                        i6 = qieVar.a(i11, i4) ? 8 : 4;
                        iArr2[i4] = (i11 << 5) | 16;
                        iArr[i11] = (i4 << 5) | i6;
                        return;
                    }
                }
            } else {
                for (int i12 = i2 - 1; i12 >= i10; i12--) {
                    if (qieVar.b(i4, i12)) {
                        i6 = qieVar.a(i4, i12) ? 8 : 4;
                        int i13 = i - 1;
                        iArr[i13] = (i12 << 5) | 16;
                        iArr2[i12] = (i13 << 5) | i6;
                        return;
                    }
                }
            }
            i5 = lo3Var.a;
            i2 = lo3Var.b;
            i3--;
        }
    }

    public an2() {
        this.b = 0;
        this.e = Bundle.EMPTY;
        this.a = -1;
        this.c = true;
    }
}
