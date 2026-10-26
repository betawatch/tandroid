package f2;

import a8.yb;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public byte[] e;

    public u(byte[] bArr, int i10, int i11) {
        this.e = bArr;
        this.b = i10;
        this.c = i10;
        this.a = i11;
        a();
    }

    public void a() {
        int i10;
        int i11 = this.c;
        yb.p(i11 >= 0 && (i11 < (i10 = this.a) || (i11 == i10 && this.d == 0)));
    }

    public boolean b(int i10) {
        int i11 = this.c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 > this.a) {
                break;
            }
            if (h(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.a;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.c;
        int i11 = this.d;
        int i12 = 0;
        while (this.c < this.a && !d()) {
            i12++;
        }
        boolean z10 = this.c == this.a;
        this.c = i10;
        this.d = i11;
        return !z10 && b((i12 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.e[this.c] & (128 >> this.d)) != 0;
        i();
        return z10;
    }

    public int e(int i10) {
        int i11;
        this.d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.d = i13;
            byte[] bArr = this.e;
            int i14 = this.c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!h(i14 + 1)) {
                r3 = 1;
            }
            this.c = i14 + r3;
        }
        byte[] bArr2 = this.e;
        int i15 = this.c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.d = 0;
            this.c = i15 + (h(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    public int g() {
        int f7 = f();
        return ((f7 + 1) / 2) * (f7 % 2 == 0 ? -1 : 1);
    }

    public boolean h(int i10) {
        int i11 = i10 - 2;
        if (this.b > i11 || i10 >= this.a) {
            return false;
        }
        byte[] bArr = this.e;
        return bArr[i10] == 3 && bArr[i11] == 0 && bArr[i10 - 1] == 0;
    }

    public void i() {
        int i10 = this.d + 1;
        this.d = i10;
        if (i10 == 8) {
            this.d = 0;
            int i11 = this.c;
            this.c = i11 + (h(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void j(int i10) {
        int i11 = this.c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.c = i13;
        int i14 = (i10 - (i12 * 8)) + this.d;
        this.d = i14;
        if (i14 > 7) {
            this.c = i13 + 1;
            this.d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.c) {
                a();
                return;
            } else if (h(i11)) {
                this.c++;
                i11 += 2;
            }
        }
    }
}
