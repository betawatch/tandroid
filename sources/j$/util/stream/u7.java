package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class u7 extends x7 implements j$.util.d1 {
    public abstract void d(Object obj);

    public abstract b7 e(int i10);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.com.android.tools.r8.a.p(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (c() != w7.NO_MORE && ((j$.util.d1) this.a).tryAdvance(this)) {
            if (a(1L) == 1) {
                d(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        b7 b7Var = null;
        while (true) {
            w7 c10 = c();
            if (c10 == w7.NO_MORE) {
                return;
            }
            w7 w7Var = w7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (c10 == w7Var) {
                int i10 = this.c;
                if (b7Var == null) {
                    b7Var = e(i10);
                } else {
                    b7Var.b = 0;
                }
                long j3 = 0;
                while (((j$.util.d1) spliterator).tryAdvance(b7Var)) {
                    j3++;
                    if (j3 >= i10) {
                        break;
                    }
                }
                if (j3 == 0) {
                    return;
                } else {
                    b7Var.a(obj, a(j3));
                }
            } else {
                ((j$.util.d1) spliterator).forEachRemaining(obj);
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
