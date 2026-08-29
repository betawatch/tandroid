package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class f0 extends i0 implements h5 {
    public static final d0 c;
    public static final d0 d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.i0, j$.util.stream.j5, j$.util.stream.h5, java.util.function.IntConsumer
    public final void accept(int i10) {
        x(Integer.valueOf(i10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.c0(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        w6 w6Var = w6.INT_VALUE;
        n nVar = new n(12);
        n nVar2 = new n(13);
        j$.util.c0 c0Var = j$.util.c0.c;
        c = new d0(true, w6Var, c0Var, nVar, nVar2);
        d = new d0(false, w6Var, c0Var, new n(12), new n(13));
    }
}
