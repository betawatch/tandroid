package j4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f1 implements g1 {
    public final int a;

    public f1(int i10) {
        this.a = i10;
    }

    @Override // j4.g1
    public final g1 a(int i10, int i11) {
        return new f1((this.a - i11) + i10);
    }

    @Override // j4.g1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // j4.g1
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // j4.g1
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // j4.g1
    public final g1 e(int i10, int i11) {
        return new f1(this.a + i11);
    }

    @Override // j4.g1
    public final int f() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // j4.g1
    public final g1 g() {
        return new f1(0);
    }

    @Override // j4.g1
    public final int getLength() {
        return this.a;
    }
}
