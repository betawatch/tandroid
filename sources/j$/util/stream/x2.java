package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public abstract class x2 implements e2 {
    @Override // j$.util.stream.e2
    public final long count() {
        return 0L;
    }

    public final void d(Object obj) {
    }

    @Override // j$.util.stream.e2
    public /* synthetic */ e2 e(long j10, long j11, IntFunction intFunction) {
        return t3.V(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public e2 a(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.e2
    public final Object[] g(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    public final void c(int i9, Object obj) {
    }
}
