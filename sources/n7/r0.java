package n7;

import i2.o1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class r0 extends s0 {
    public final int d;
    public final int e;

    public r0(byte[] bArr, int i10, int i11) {
        super(bArr);
        s0.r(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override // n7.s0
    public final byte h(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(o1.k(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // n7.s0
    public final byte m(int i10) {
        return this.b[this.d + i10];
    }

    @Override // n7.s0
    public final int n() {
        return this.d;
    }

    @Override // n7.s0
    public final int o() {
        return this.e;
    }

    @Override // n7.s0
    public final void p(int i10, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i10);
    }
}
