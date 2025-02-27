package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class r3 extends t3 implements Spliterator, Consumer {
    Object e;

    r3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2);
    }

    r3(Spliterator spliterator, r3 r3Var) {
        super(spliterator, r3Var);
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        consumer.getClass();
        Y2 y2 = null;
        while (true) {
            s3 v = v();
            if (v == s3.NO_MORE) {
                return;
            }
            s3 s3Var = s3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (v != s3Var) {
                spliterator.a(consumer);
                return;
            }
            if (y2 == null) {
                y2 = new Y2();
            } else {
                y2.a = 0;
            }
            long j = 0;
            while (spliterator.s(y2)) {
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
                consumer.r(y2.b[i]);
            }
        }
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void r(Object obj) {
        this.e = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
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
    public final boolean s(Consumer consumer) {
        consumer.getClass();
        while (v() != s3.NO_MORE && this.a.s(this)) {
            if (t(1L) == 1) {
                consumer.r(this.e);
                this.e = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.stream.t3
    protected final Spliterator u(Spliterator spliterator) {
        return new r3(spliterator, this);
    }
}
