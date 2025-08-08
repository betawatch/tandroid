package j$.util.stream;

import j$.util.function.IntFunction;

/* loaded from: classes2.dex */
final class r1 extends N2 implements F0, x0 {
    @Override // j$.util.stream.d2, j$.util.function.l
    public final /* synthetic */ void accept(double d) {
        t0.b();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(int i) {
        t0.k();
        throw null;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ void accept(long j) {
        t0.l();
        throw null;
    }

    @Override // j$.util.stream.x0
    public final F0 b() {
        return this;
    }

    @Override // j$.util.stream.d2
    public final void m() {
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.d2
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ F0 t(long j, long j2, IntFunction intFunction) {
        return t0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.F0
    public final F0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final void i(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object[] objArr2 = this.f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.F0
    public final Object[] s(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.d2
    public final void n(long j) {
        clear();
        u(j);
    }
}
