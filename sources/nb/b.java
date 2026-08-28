package nb;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final a a;
    public final int[] b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = aVar;
        int length = iArr.length;
        int i9 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i9 < length && iArr[i9] == 0) {
            i9++;
        }
        if (i9 == length) {
            this.b = new int[]{0};
            return;
        }
        int i10 = length - i9;
        int[] iArr2 = new int[i10];
        this.b = iArr2;
        System.arraycopy(iArr, i9, iArr2, 0, i10);
    }

    public final b a(b bVar) {
        a aVar = bVar.a;
        a aVar2 = this.a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return bVar;
        }
        if (bVar.e()) {
            return this;
        }
        int[] iArr = bVar.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i9 = length; i9 < iArr.length; i9++) {
            iArr3[i9] = iArr2[i9 - length] ^ iArr[i9];
        }
        return new b(aVar2, iArr3);
    }

    public final int b(int i9) {
        if (i9 == 0) {
            return c(0);
        }
        int[] iArr = this.b;
        if (i9 != 1) {
            int i10 = iArr[0];
            int length = iArr.length;
            for (int i11 = 1; i11 < length; i11++) {
                i10 = this.a.c(i9, i10) ^ iArr[i11];
            }
            return i10;
        }
        int i12 = 0;
        for (int i13 : iArr) {
            a aVar = a.h;
            i12 ^= i13;
        }
        return i12;
    }

    public final int c(int i9) {
        return this.b[(r0.length - 1) - i9];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final b f(int i9) {
        a aVar = this.a;
        if (i9 == 0) {
            return aVar.c;
        }
        if (i9 == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = aVar.c(iArr[i10], i9);
        }
        return new b(aVar, iArr2);
    }

    public final b g(b bVar) {
        a aVar = bVar.a;
        a aVar2 = this.a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e() || bVar.e()) {
            return aVar2.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = bVar.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = iArr[i9];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i9 + i11;
                iArr3[i12] = iArr3[i12] ^ aVar2.c(i10, iArr2[i11]);
            }
        }
        return new b(aVar2, iArr3);
    }

    public final b h(int i9, int i10) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        a aVar = this.a;
        if (i10 == 0) {
            return aVar.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i9 + length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = aVar.c(iArr[i11], i10);
        }
        return new b(aVar, iArr2);
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int d = d(); d >= 0; d--) {
            int c10 = c(d);
            if (c10 != 0) {
                if (c10 < 0) {
                    if (d == d()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    c10 = -c10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (d == 0 || c10 != 1) {
                    a aVar = this.a;
                    if (c10 == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i9 = aVar.b[c10];
                    if (i9 == 0) {
                        sb2.append('1');
                    } else if (i9 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i9);
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
