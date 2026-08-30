package o4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p0 implements q0 {
    public final int a;

    public p0(int i10) {
        this.a = i10;
    }

    @Override // o4.q0
    public final int a() {
        return this.a > 0 ? 0 : -1;
    }

    @Override // o4.q0
    public final q0 b(int i10) {
        return new p0(this.a - i10);
    }

    @Override // o4.q0
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return -1;
    }

    @Override // o4.q0
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.a) {
            return i11;
        }
        return -1;
    }

    @Override // o4.q0
    public final q0 e(int i10) {
        return new p0(this.a + i10);
    }

    @Override // o4.q0
    public final int f() {
        int i10 = this.a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override // o4.q0
    public final q0 g() {
        return new p0(0);
    }

    @Override // o4.q0
    public final int getLength() {
        return this.a;
    }
}
