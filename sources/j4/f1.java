package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f1 implements g1 {
    public final int a;

    public f1(int i9) {
        this.a = i9;
    }

    @Override // j4.g1
    public final g1 a(int i9, int i10) {
        return new f1((this.a - i10) + i9);
    }

    @Override // j4.g1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // j4.g1
    public final int c(int i9) {
        int i10 = i9 - 1;
        if (i10 >= 0) {
            return i10;
        }
        return -1;
    }

    @Override // j4.g1
    public final int d(int i9) {
        int i10 = i9 + 1;
        if (i10 < this.a) {
            return i10;
        }
        return -1;
    }

    @Override // j4.g1
    public final g1 e(int i9, int i10) {
        return new f1(this.a + i10);
    }

    @Override // j4.g1
    public final int f() {
        int i9 = this.a;
        if (i9 > 0) {
            return i9 - 1;
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
