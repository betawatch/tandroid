package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class G extends J implements k2 {
    static final E c;
    static final E d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.J, j$.util.stream.m2
    public final void accept(int i) {
        p(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.B.d(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        b3 b3Var = b3.INT_VALUE;
        c = new E(true, b3Var, j$.util.B.a(), new l(11), new j(9));
        d = new E(false, b3Var, j$.util.B.a(), new l(11), new j(9));
    }
}
