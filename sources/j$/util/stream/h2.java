package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class h2 implements e2 {
    public final Object[] a;
    public int b;

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j3, long j10, IntFunction intFunction) {
        return t3.V(this, j3, j10, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public h2(long j3, IntFunction intFunction) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j3);
        this.b = 0;
    }

    public h2(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return DesugarArrays.a(this.a, 0, this.b);
    }

    @Override // j$.util.stream.e2
    public final void f(Object[] objArr, int i10) {
        System.arraycopy(this.a, 0, objArr, i10, this.b);
    }

    @Override // j$.util.stream.e2
    public final Object[] g(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.e2
    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.b; i10++) {
            consumer.x(this.a[i10]);
        }
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
