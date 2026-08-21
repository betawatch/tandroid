package j$.util.stream;

import j$.util.DesugarArrays;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class F0 implements C0 {
    public final Object[] a;
    public int b;

    @Override // j$.util.stream.C0
    public final /* synthetic */ C0 f(long j, long j2, IntFunction intFunction) {
        return r1.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.C0
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.C0
    public final C0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    public F0(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    public F0(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }

    @Override // j$.util.stream.C0
    public final Spliterator spliterator() {
        return DesugarArrays.a(this.a, 0, this.b);
    }

    @Override // j$.util.stream.C0
    public final void g(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.C0
    public final Object[] h(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.C0
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.C0
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.s(this.a[i]);
        }
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
