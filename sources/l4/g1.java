package l4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g1 implements h1 {
    public final int a;

    public g1(int i10) {
        this.a = i10;
    }

    @Override // l4.h1
    public final h1 a(int i10, int i11) {
        return new g1((this.a - i11) + i10);
    }

    @Override // l4.h1
    public final int b() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // l4.h1
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // l4.h1
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // l4.h1
    public final h1 e(int i10, int i11) {
        return new g1(this.a + i11);
    }

    @Override // l4.h1
    public final int f() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // l4.h1
    public final h1 g() {
        return new g1(0);
    }

    @Override // l4.h1
    public final int getLength() {
        return this.a;
    }
}
