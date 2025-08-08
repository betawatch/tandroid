package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class q3 extends s3 implements Spliterator, Consumer {
    Object e;

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.A.k(this, i);
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        consumer.getClass();
        X2 x2 = null;
        while (true) {
            r3 v = v();
            if (v == r3.NO_MORE) {
                return;
            }
            r3 r3Var = r3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (v == r3Var) {
                if (x2 == null) {
                    x2 = new X2();
                } else {
                    x2.a = 0;
                }
                long j = 0;
                while (spliterator.s(x2)) {
                    j++;
                    if (j >= 128) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long t = t(j);
                for (int i = 0; i < t; i++) {
                    consumer.r(x2.b[i]);
                }
            } else {
                spliterator.a(consumer);
                return;
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean s(Consumer consumer) {
        consumer.getClass();
        while (v() != r3.NO_MORE && this.a.s(this)) {
            if (t(1L) == 1) {
                consumer.r(this.e);
                this.e = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        this.e = obj;
    }

    @Override // j$.util.stream.s3
    protected final Spliterator u(Spliterator spliterator) {
        return new q3(spliterator, this);
    }
}
