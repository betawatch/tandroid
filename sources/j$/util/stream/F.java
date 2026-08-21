package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class F extends H implements f2 {
    public static final C c;
    public static final C d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.H, j$.util.stream.g2
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
        c = new C(true, t2, b, new n(14), new n(15));
        d = new C(false, t2, b, new n(14), new n(15));
    }
}
