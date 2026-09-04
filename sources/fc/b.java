package fc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
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
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = iArr2[i10 - length] ^ iArr[i10];
        }
        return new b(aVar2, iArr3);
    }

    public final int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        int[] iArr = this.b;
        if (i10 != 1) {
            int i11 = iArr[0];
            int length = iArr.length;
            for (int i12 = 1; i12 < length; i12++) {
                i11 = this.a.c(i10, i11) ^ iArr[i12];
            }
            return i11;
        }
        int i13 = 0;
        for (int i14 : iArr) {
            a aVar = a.h;
            i13 ^= i14;
        }
        return i13;
    }

    public final int c(int i10) {
        return this.b[(r0.length - 1) - i10];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final b f(int i10) {
        a aVar = this.a;
        if (i10 == 0) {
            return aVar.c;
        }
        if (i10 == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr2[i11] = aVar.c(iArr[i11], i10);
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
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = iArr3[i13] ^ aVar2.c(i11, iArr2[i12]);
            }
        }
        return new b(aVar2, iArr3);
    }

    public final b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        a aVar = this.a;
        if (i11 == 0) {
            return aVar.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr2[i12] = aVar.c(iArr[i12], i11);
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
                    int i10 = aVar.b[c10];
                    if (i10 == 0) {
                        sb2.append('1');
                    } else if (i10 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i10);
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
