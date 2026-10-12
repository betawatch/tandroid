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
public final /* synthetic */ class a1 implements ObjLongConsumer, LongBinaryOperator, ToLongFunction, BiConsumer, IntFunction, LongFunction, Supplier, Consumer, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ a1(int i10) {
        this.a = i10;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void x(Object obj) {
        int i10 = this.a;
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
    public Object apply(long j10) {
        switch (this.a) {
            case 5:
                return Long.valueOf(j10);
            case 13:
                return t3.h0(j10);
            case 15:
                return t3.s0(j10);
            default:
                return t3.t0(j10);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j10, long j11) {
        switch (this.a) {
            case 1:
                return Math.min(j10, j11);
            case 9:
                return Math.max(j10, j11);
            default:
                return j10 + j11;
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
    public void accept(Object obj, long j10) {
        switch (this.a) {
            case 0:
                ((j$.util.z) obj).accept(j10);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j10;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                ((j$.util.z) obj).a((j$.util.z) obj2);
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
    public Object apply(int i10) {
        switch (this.a) {
            case 4:
                return new Long[i10];
            case 12:
                return new Object[i10];
            case 20:
                return new Object[i10];
            case 21:
                return new Integer[i10];
            case 22:
                return new Long[i10];
            case 23:
                return new Double[i10];
            case 26:
                return new Integer[i10];
            case 27:
                return new Integer[i10];
            case 28:
                return new Long[i10];
            default:
                return new Long[i10];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                return new l2((y1) obj, (y1) obj2);
            case 15:
            case 17:
            default:
                return new p2((e2) obj, (e2) obj2);
            case 16:
                return new m2((a2) obj, (a2) obj2);
            case 18:
                return new n2((c2) obj, (c2) obj2);
        }
    }
}
