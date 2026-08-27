package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class g0 extends i0 implements i5 {
    public static final d0 c;
    public static final d0 d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.i0, j$.util.stream.j5
    public final void accept(long j10) {
        x(Long.valueOf(j10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.d0(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        w6 w6Var = w6.LONG_VALUE;
        n nVar = new n(14);
        n nVar2 = new n(15);
        j$.util.d0 d0Var = j$.util.d0.c;
        c = new d0(true, w6Var, d0Var, nVar, nVar2);
        d = new d0(false, w6Var, d0Var, new n(14), new n(15));
    }
}
