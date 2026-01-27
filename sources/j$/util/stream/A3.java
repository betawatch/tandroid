package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class A3 extends C3 implements Spliterator, Consumer {
    Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.T.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.T.e(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != B3.NO_MORE && this.a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        h3 h3Var = null;
        while (true) {
            B3 d = d();
            if (d == B3.NO_MORE) {
                return;
            }
            B3 b3 = B3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (d == b3) {
                int i = this.c;
                if (h3Var == null) {
                    h3Var = new h3(i);
                } else {
                    h3Var.a = 0;
                }
                long j = 0;
                while (spliterator.tryAdvance(h3Var)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long b = b(j);
                for (int i2 = 0; i2 < b; i2++) {
                    consumer.accept(h3Var.b[i2]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.C3
    protected final Spliterator c(Spliterator spliterator) {
        return new A3(spliterator, this);
    }
}
