package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class H extends J implements l2 {
    static final E c;
    static final E d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.J, j$.util.stream.m2
    public final void accept(long j) {
        p(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.C.d(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        b3 b3Var = b3.LONG_VALUE;
        c = new E(true, b3Var, j$.util.C.a(), new l(12), new j(10));
        d = new E(false, b3Var, j$.util.C.a(), new l(12), new j(10));
    }
}
