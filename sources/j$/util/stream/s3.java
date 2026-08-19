package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class s3 extends u3 implements Spliterator, Consumer {
    public Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void s(Object obj) {
        this.f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != t3.NO_MORE && this.a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.s(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Z2 z2 = null;
        while (true) {
            t3 d = d();
            if (d == t3.NO_MORE) {
                return;
            }
            t3 t3Var = t3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (d == t3Var) {
                int i = this.c;
                if (z2 == null) {
                    z2 = new Z2(i);
                } else {
                    z2.a = 0;
                }
                long j = 0;
                while (spliterator.tryAdvance(z2)) {
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
                    consumer.s(z2.b[i2]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.u3
    public final Spliterator c(Spliterator spliterator) {
        return new s3(spliterator, this);
    }
}
