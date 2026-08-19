package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class D extends G implements d2 {
    public static final B c;
    public static final B d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.G, j$.util.stream.f2
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
        c = new B(true, t2, a, new m(12), new m(13));
        d = new B(false, t2, a, new m(12), new m(13));
    }
}
