package j$.util.stream;

import j$.util.function.BiConsumer$-CC;
import j$.util.function.BiFunction$-CC;
import j$.util.function.Consumer$-CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class Y implements ObjLongConsumer, LongBinaryOperator, ToLongFunction, BiConsumer, IntFunction, LongFunction, Supplier, Consumer, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ Y(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void s(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$-CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 11:
                break;
            case 24:
                break;
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 5:
                return Long.valueOf(j);
            case 13:
                return q1.G(j);
            case 15:
                return q1.O(j);
            default:
                return q1.P(j);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 1:
                return Math.min(j, j2);
            case 9:
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
        switch (this.a) {
            case 0:
                ((j$.util.x) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                ((j$.util.x) obj).b((j$.util.x) obj2);
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
            case 4:
                return new Long[i];
            case 12:
                return new Object[i];
            case 20:
                return new Object[i];
            case 21:
                return new Integer[i];
            case 22:
                return new Long[i];
            case 23:
                return new Double[i];
            case 26:
                return new Integer[i];
            case 27:
                return new Integer[i];
            case 28:
                return new Long[i];
            default:
                return new Long[i];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                return new I0((v0) obj, (v0) obj2);
            case 15:
            case 17:
            default:
                return new M0((B0) obj, (B0) obj2);
            case 16:
                return new J0((x0) obj, (x0) obj2);
            case 18:
                return new K0((z0) obj, (z0) obj2);
        }
    }
}
