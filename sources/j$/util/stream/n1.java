package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class n1 extends P2 implements B0, t0 {
    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // j$.util.stream.t0
    public final B0 a() {
        return this;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ B0 f(long j, long j2, IntFunction intFunction) {
        return q1.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.B0
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.f2
    public final void x() {
    }

    @Override // j$.util.stream.B0
    public final B0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.B0
    public final void g(Object[] objArr, int i) {
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

    @Override // j$.util.stream.B0
    public final Object[] h(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        g(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.f2
    public final void y(long j) {
        clear();
        k(j);
    }
}
