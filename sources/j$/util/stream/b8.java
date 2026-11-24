package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class b8 extends d8 implements Spliterator, Consumer {
    public Object e;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        this.e = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.d8
    public final Spliterator b(Spliterator spliterator) {
        return new b8(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        i7 i7Var = null;
        while (true) {
            c8 c = c();
            if (c == c8.NO_MORE) {
                return;
            }
            c8 c8Var = c8.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (c != c8Var) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            if (i7Var == null) {
                i7Var = new i7();
            } else {
                i7Var.a = 0;
            }
            long j = 0;
            while (spliterator.tryAdvance(i7Var)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long a = a(j);
            for (int i = 0; i < a; i++) {
                consumer.x(i7Var.b[i]);
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (c() != c8.NO_MORE && this.a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.x(this.e);
                this.e = null;
                return true;
            }
        }
        return false;
    }
}
