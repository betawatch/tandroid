package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements j$.util.function.t0, BiConsumer, j$.util.function.U, Consumer, IntFunction, ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i) {
        this.a = i;
    }

    private final void a(Object obj) {
    }

    private final void c(Object obj) {
    }

    private final void d(Object obj) {
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public void r(Object obj) {
        int i = this.a;
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 3:
                break;
            case 10:
                break;
        }
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.function.U
    public long applyAsLong(long j, long j2) {
        return Math.max(j, j2);
    }

    @Override // j$.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return 1L;
    }

    @Override // j$.util.function.t0
    public void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // j$.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override // j$.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 4:
                return new Object[i];
            case 5:
            default:
                return new Double[i];
            case 6:
                return new Object[i];
            case 7:
                return new Integer[i];
            case 8:
                return new Long[i];
        }
    }
}
