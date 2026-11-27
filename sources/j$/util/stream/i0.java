package j$.util.stream;

import j$.util.function.IntConsumer$-CC;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class i0 extends l0 implements l5 {
    public static final g0 c;
    public static final g0 d;

    static {
        c7 c7Var = c7.INT_VALUE;
        q qVar = new q((byte) 12);
        q qVar2 = new q((byte) 13);
        j$.util.c0 c0Var = j$.util.c0.c;
        c = new g0(true, c7Var, c0Var, qVar, qVar2);
        d = new g0(false, c7Var, c0Var, new q((byte) 12), new q((byte) 13));
    }

    @Override // j$.util.stream.l0, j$.util.stream.n5
    public final void accept(int i) {
        x(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$-CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.c0(((Integer) this.b).intValue());
        }
        return null;
    }
}
