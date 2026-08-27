package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class q3 extends t6 implements e2, w1 {
    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(double d) {
        t3.C();
        throw null;
    }

    @Override // j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i10) {
        t3.J();
        throw null;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(long j10) {
        t3.K();
        throw null;
    }

    @Override // j$.util.stream.w1
    public final e2 build() {
        return this;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j10, long j11, IntFunction intFunction) {
        return t3.V(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.j5
    public final void end() {
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final void f(Object[] objArr, int i10) {
        long j10 = i10;
        long count = count() + j10;
        if (count > objArr.length || count < j10) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i10, this.b);
            return;
        }
        for (int i11 = 0; i11 < this.c; i11++) {
            Object[] objArr2 = this.f[i11];
            System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
            i10 += this.f[i11].length;
        }
        int i12 = this.b;
        if (i12 > 0) {
            System.arraycopy(this.e, 0, objArr, i10, i12);
        }
    }

    @Override // j$.util.stream.e2
    public final Object[] g(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        f(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.j5
    public final void o(long j10) {
        clear();
        i(j10);
    }
}
