package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class E extends H implements e2 {
    public static final C c;
    public static final C d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.H, j$.util.stream.g2
    public final void accept(int i) {
        s(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.A(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        T2 t2 = T2.INT_VALUE;
        j$.util.A a = j$.util.A.c;
        c = new C(true, t2, a, new n(12), new n(13));
        d = new C(false, t2, a, new n(12), new n(13));
    }
}
