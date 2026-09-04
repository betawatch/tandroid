package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class v7 extends x7 implements Spliterator, Consumer {
    public Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        this.f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (c() != w7.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.x(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        c7 c7Var = null;
        while (true) {
            w7 c10 = c();
            if (c10 == w7.NO_MORE) {
                return;
            }
            w7 w7Var = w7.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (c10 == w7Var) {
                int i10 = this.c;
                if (c7Var == null) {
                    c7Var = new c7(i10);
                } else {
                    c7Var.a = 0;
                }
                long j3 = 0;
                while (spliterator.tryAdvance(c7Var)) {
                    j3++;
                    if (j3 >= i10) {
                        break;
                    }
                }
                if (j3 == 0) {
                    return;
                }
                long a2 = a(j3);
                for (int i11 = 0; i11 < a2; i11++) {
                    consumer.x(c7Var.b[i11]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.x7
    public final Spliterator b(Spliterator spliterator) {
        return new v7(spliterator, this);
    }
}
