package j$.util.concurrent;

import j$.util.A;
import j$.util.J;
import j$.util.function.Consumer;
import j$.util.function.T;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class z implements J {
    long a;
    final long b;
    final long c;
    final long d;

    z(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        A.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new z(j, j2, this.c, this.d);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.M
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void e(T t) {
        t.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                t.accept(current.e(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return A.k(this, i);
    }

    @Override // j$.util.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean p(T t) {
        t.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        t.accept(ThreadLocalRandom.current().e(this.c, this.d));
        this.a = j + 1;
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return A.n(this, consumer);
    }
}
