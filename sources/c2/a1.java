package c2;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a1 implements u3.d {
    public int d;
    public int a = 0;
    public int b = -1;
    public int c = 0;
    public Object e = new int[16];

    public a1() {
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
        d5.z zVar = (d5.z) this.e;
        int i10 = this.b;
        if (i10 == 8) {
            return zVar.r();
        }
        if (i10 == 16) {
            return zVar.w();
        }
        int i11 = this.c;
        this.c = i11 + 1;
        if (i11 % 2 != 0) {
            return this.d & 15;
        }
        int r10 = zVar.r();
        this.d = r10;
        return (r10 & 240) >> 4;
    }

    public void d(int i10) {
        int i11 = this.c;
        int[] iArr = (int[]) this.e;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy((int[]) this.e, 0, iArr2, i13, i12);
            this.a = 0;
            this.b = this.c - 1;
            this.e = iArr2;
            this.d = length - 1;
        }
        int i14 = (this.b + 1) & this.d;
        this.b = i14;
        ((int[]) this.e)[i14] = i10;
        this.c++;
    }

    public int e() {
        int i10 = this.c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.e;
        int i11 = this.a;
        int i12 = iArr[i11];
        this.a = (i11 + 1) & this.d;
        this.c = i10 - 1;
        return i12;
    }
}
