package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class E extends G implements e2 {
    public static final B c;
    public static final B d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.G, j$.util.stream.f2
    public final void accept(long j) {
        s(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.B(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        T2 t2 = T2.LONG_VALUE;
        j$.util.B b = j$.util.B.c;
        c = new B(true, t2, b, new m(14), new m(15));
        d = new B(false, t2, b, new m(14), new m(15));
    }
}
