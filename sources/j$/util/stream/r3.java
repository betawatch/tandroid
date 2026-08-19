package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class r3 extends u3 implements j$.util.c0 {
    public abstract void e(Object obj);

    public abstract Y2 f(int i);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.p(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != t3.NO_MORE && ((j$.util.c0) this.a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.c0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        Y2 y2 = null;
        while (true) {
            t3 d = d();
            if (d == t3.NO_MORE) {
                return;
            }
            t3 t3Var = t3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (d == t3Var) {
                int i = this.c;
                if (y2 == null) {
                    y2 = f(i);
                } else {
                    y2.b = 0;
                }
                long j = 0;
                while (((j$.util.c0) spliterator).tryAdvance(y2)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    y2.b(obj, b(j));
                }
            } else {
                ((j$.util.c0) spliterator).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
