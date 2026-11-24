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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final /* synthetic */ class d1 implements ObjLongConsumer, BiConsumer, IntFunction, LongFunction, Supplier, LongBinaryOperator, ToLongFunction, Consumer, BinaryOperator {
    public final /* synthetic */ byte a;

    public /* synthetic */ d1(byte b) {
        this.a = b;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
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

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 2:
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

    @Override // java.util.function.LongBinaryOperator
    public final long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 7:
                return Math.max(j, j2);
            case 8:
                return j + j2;
            default:
                return Math.min(j, j2);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return new long[2];
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$-CC.$default$andThen(this, biConsumer);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 11:
                break;
            case 24:
                break;
        }
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j) {
        switch (this.a) {
            case 0:
                ((j$.util.z) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        switch (this.a) {
            case 3:
                return Long.valueOf(j);
            case 13:
                return w3.F(j);
            case 15:
                return w3.O(j);
            default:
                return w3.P(j);
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        byte b = this.a;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 14:
                return new o2((b2) obj, (b2) obj2);
            case 15:
            case 17:
            default:
                return new s2((h2) obj, (h2) obj2);
            case 16:
                return new p2((d2) obj, (d2) obj2);
            case 18:
                return new q2((f2) obj, (f2) obj2);
        }
    }

    private final void accept$j$$util$stream$Node$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$1(Object obj) {
    }
}
