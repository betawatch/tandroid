package o4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
