package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract class o7 extends q7 implements j$.util.d1 {
    public abstract Object b();

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

    public o7(j$.util.d1 d1Var, long j3, long j10) {
        super(d1Var, j3, j10, 0L, Math.min(d1Var.estimateSize(), j10));
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        long j3;
        Objects.requireNonNull(obj);
        long j10 = this.e;
        long j11 = this.a;
        if (j11 >= j10) {
            return false;
        }
        while (true) {
            j3 = this.d;
            if (j11 <= j3) {
                break;
            }
            ((j$.util.d1) this.c).tryAdvance(b());
            this.d++;
        }
        if (j3 >= this.e) {
            return false;
        }
        this.d = j3 + 1;
        return ((j$.util.d1) this.c).tryAdvance(obj);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j3 = this.e;
        long j10 = this.a;
        if (j10 >= j3) {
            return;
        }
        long j11 = this.d;
        if (j11 >= j3) {
            return;
        }
        if (j11 >= j10 && ((j$.util.d1) this.c).estimateSize() + j11 <= this.b) {
            ((j$.util.d1) this.c).forEachRemaining(obj);
            this.d = this.e;
            return;
        }
        while (j10 > this.d) {
            ((j$.util.d1) this.c).tryAdvance(b());
            this.d++;
        }
        while (this.d < this.e) {
            ((j$.util.d1) this.c).tryAdvance(obj);
            this.d++;
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
