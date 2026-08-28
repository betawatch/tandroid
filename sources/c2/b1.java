package c2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b1 implements u3.d {
    public int d;
    public int a = 0;
    public int b = -1;
    public int c = 0;
    public Object e = new int[16];

    public b1() {
        this.d = r0.length - 1;
    }

    @Override // u3.d
    public int a() {
        return -1;
    }

    @Override // u3.d
    public int b() {
        return this.a;
    }

    @Override // u3.d
    public int c() {
        d5.y yVar = (d5.y) this.e;
        int i9 = this.b;
        if (i9 == 8) {
            return yVar.r();
        }
        if (i9 == 16) {
            return yVar.w();
        }
        int i10 = this.c;
        this.c = i10 + 1;
        if (i10 % 2 != 0) {
            return this.d & 15;
        }
        int r10 = yVar.r();
        this.d = r10;
        return (r10 & 240) >> 4;
    }

    public void d(int i9) {
        int i10 = this.c;
        int[] iArr = (int[]) this.e;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i11 = this.a;
            int i12 = length2 - i11;
            System.arraycopy(iArr, i11, iArr2, 0, i12);
            System.arraycopy((int[]) this.e, 0, iArr2, i12, i11);
            this.a = 0;
            this.b = this.c - 1;
            this.e = iArr2;
            this.d = length - 1;
        }
        int i13 = (this.b + 1) & this.d;
        this.b = i13;
        ((int[]) this.e)[i13] = i9;
        this.c++;
    }

    public int e() {
        int i9 = this.c;
        if (i9 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.e;
        int i10 = this.a;
        int i11 = iArr[i10];
        this.a = (i10 + 1) & this.d;
        this.c = i9 - 1;
        return i11;
    }
}
