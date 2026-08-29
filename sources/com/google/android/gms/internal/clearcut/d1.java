package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class d1 {
    public static final d1 e = new d1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public boolean d;

    public d1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.a = i10;
        this.b = iArr;
        this.c = objArr;
        this.d = z10;
    }

    public static d1 b() {
        return new d1(0, new int[8], new Object[8], true);
    }

    public final void a(int i10, Object obj) {
        if (!this.d) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.a;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.b = Arrays.copyOf(iArr, i12);
            this.c = Arrays.copyOf(this.c, i12);
        }
        int[] iArr2 = this.b;
        int i13 = this.a;
        iArr2[i13] = i10;
        this.c[i13] = obj;
        this.a = i13 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        int i10 = this.a;
        if (i10 == d1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = d1Var.b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = d1Var.c;
                    int i12 = this.a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.c;
        int i16 = this.a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
