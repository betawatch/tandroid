package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public abstract class a3 implements h2 {
    @Override // j$.util.stream.h2
    public h2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.h2
    public final long count() {
        return 0L;
    }

    @Override // j$.util.stream.h2
    public /* synthetic */ h2 e(long j, long j2, IntFunction intFunction) {
        return w3.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.h2
    public final Object[] g(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.h2
    public final int h() {
        return 0;
    }

    public final void d(Object obj) {
    }

    public final void c(int i, Object obj) {
    }
}
