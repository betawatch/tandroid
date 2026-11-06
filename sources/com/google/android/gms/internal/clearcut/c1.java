package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c1 {
    public static final c1 e = new c1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public boolean d;

    public c1(int i7, int[] iArr, Object[] objArr, boolean z9) {
        this.a = i7;
        this.b = iArr;
        this.c = objArr;
        this.d = z9;
    }

    public static c1 b() {
        return new c1(0, new int[8], new Object[8], true);
    }

    public final void a(int i7, Object obj) {
        if (!this.d) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.a;
        int[] iArr = this.b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.b = Arrays.copyOf(iArr, i11);
            this.c = Arrays.copyOf(this.c, i11);
        }
        int[] iArr2 = this.b;
        int i12 = this.a;
        iArr2[i12] = i7;
        this.c[i12] = obj;
        this.a = i12 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        int i7 = this.a;
        if (i7 == c1Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = c1Var.b;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c1Var.c;
                    int i11 = this.a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.a;
        int i10 = (i7 + 527) * 31;
        int[] iArr = this.b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i7; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.c;
        int i15 = this.a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
