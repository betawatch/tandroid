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
    public final /* synthetic */ void accept(int i7) {
        t3.J();
        throw null;
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void accept(long j3) {
        t3.K();
        throw null;
    }

    @Override // j$.util.stream.w1
    public final e2 build() {
        return this;
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j3, long j10, IntFunction intFunction) {
        return t3.V(this, j3, j10, intFunction);
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
    public final e2 a(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final void f(Object[] objArr, int i7) {
        long j3 = i7;
        long count = count() + j3;
        if (count > objArr.length || count < j3) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i7, this.b);
            return;
        }
        for (int i10 = 0; i10 < this.c; i10++) {
            Object[] objArr2 = this.f[i10];
            System.arraycopy(objArr2, 0, objArr, i7, objArr2.length);
            i7 += this.f[i10].length;
        }
        int i11 = this.b;
        if (i11 > 0) {
            System.arraycopy(this.e, 0, objArr, i7, i11);
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
    public final void o(long j3) {
        clear();
        i(j3);
    }
}
