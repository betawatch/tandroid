package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public abstract class a8 extends d8 implements j$.util.d1 {
    public abstract void d(Object obj);

    public h7 e() {
        return new g7();
    }

    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        h7 h7Var = null;
        while (true) {
            c8 c = c();
            if (c == c8.NO_MORE) {
                return;
            }
            c8 c8Var = c8.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (c != c8Var) {
                ((j$.util.d1) spliterator).forEachRemaining(obj);
                return;
            }
            if (h7Var == null) {
                h7Var = e();
            } else {
                h7Var.b = 0;
            }
            long j = 0;
            while (((j$.util.d1) spliterator).tryAdvance(h7Var)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            } else {
                h7Var.a(obj, a(j));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.time.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.time.a.o(this, i);
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (c() != c8.NO_MORE && ((j$.util.d1) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                d(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.stream.d8, j$.util.d1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        return (j$.util.d1) trySplit();
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public final /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
