package j$.util.stream;

import j$.util.function.BiConsumer$-CC;
import j$.util.function.Consumer$-CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements LongBinaryOperator, ToLongFunction, BiConsumer, IntFunction, LongFunction, Supplier, ObjLongConsumer, Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ b0(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 10:
                break;
            case 16:
                break;
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 0:
                return Math.min(j, j2);
            case 8:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new long[2];
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                ((j$.util.z) obj).b((j$.util.z) obj2);
                break;
            default:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 3:
                return new Long[i];
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 16:
            case 17:
            default:
                return new Double[i];
            case 11:
                return new Object[i];
            case 12:
                return new Object[i];
            case 13:
                return new Integer[i];
            case 14:
                return new Long[i];
            case 15:
                return new Double[i];
            case 18:
                return new Integer[i];
            case 19:
                return new Integer[i];
            case 20:
                return new Long[i];
            case 21:
                return new Long[i];
            case 22:
                return new Double[i];
        }
    }
}
