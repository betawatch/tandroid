package h2;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public byte[] e;

    public s(byte[] bArr, int i3, int i10) {
        this.e = bArr;
        this.b = i3;
        this.c = i3;
        this.a = i10;
        a();
    }

    public void a() {
        int i3;
        int i10 = this.c;
        zb.p(i10 >= 0 && (i10 < (i3 = this.a) || (i10 == i3 && this.d == 0)));
    }

    public boolean b(int i3) {
        int i10 = this.c;
        int i11 = i3 / 8;
        int i12 = i10 + i11;
        int i13 = (this.d + i3) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 > this.a) {
                break;
            }
            if (h(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.a;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public boolean c() {
        int i3 = this.c;
        int i10 = this.d;
        int i11 = 0;
        while (this.c < this.a && !d()) {
            i11++;
        }
        boolean z10 = this.c == this.a;
        this.c = i3;
        this.d = i10;
        return !z10 && b((i11 * 2) + 1);
    }

    public boolean d() {
        boolean z10 = (this.e[this.c] & (128 >> this.d)) != 0;
        i();
        return z10;
    }

    public int e(int i3) {
        int i10;
        this.d += i3;
        int i11 = 0;
        while (true) {
            i10 = this.d;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.d = i12;
            byte[] bArr = this.e;
            int i13 = this.c;
            i11 |= (bArr[i13] & 255) << i12;
            if (!h(i13 + 1)) {
                r3 = 1;
            }
            this.c = i13 + r3;
        }
        byte[] bArr2 = this.e;
        int i14 = this.c;
        int i15 = ((-1) >>> (32 - i3)) & (i11 | ((bArr2[i14] & 255) >> (8 - i10)));
        if (i10 == 8) {
            this.d = 0;
            this.c = i14 + (h(i14 + 1) ? 2 : 1);
        }
        a();
        return i15;
    }

    public int f() {
        int i3 = 0;
        while (!d()) {
            i3++;
        }
        return ((1 << i3) - 1) + (i3 > 0 ? e(i3) : 0);
    }

    public int g() {
        int f10 = f();
        return ((f10 + 1) / 2) * (f10 % 2 == 0 ? -1 : 1);
    }

    public boolean h(int i3) {
        int i10 = i3 - 2;
        if (this.b > i10 || i3 >= this.a) {
            return false;
        }
        byte[] bArr = this.e;
        return bArr[i3] == 3 && bArr[i10] == 0 && bArr[i3 - 1] == 0;
    }

    public void i() {
        int i3 = this.d + 1;
        this.d = i3;
        if (i3 == 8) {
            this.d = 0;
            int i10 = this.c;
            this.c = i10 + (h(i10 + 1) ? 2 : 1);
        }
        a();
    }

    public void j(int i3) {
        int i10 = this.c;
        int i11 = i3 / 8;
        int i12 = i10 + i11;
        this.c = i12;
        int i13 = (i3 - (i11 * 8)) + this.d;
        this.d = i13;
        if (i13 > 7) {
            this.c = i12 + 1;
            this.d = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 > this.c) {
                a();
                return;
            } else if (h(i10)) {
                this.c++;
                i10 += 2;
            }
        }
    }
}
