package j$.util.concurrent;

import j$.util.A;
import j$.util.G;
import j$.util.function.Consumer;
import j$.util.function.E;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class y implements G {
    long a;
    final long b;
    final int c;
    final int d;

    y(long j, long j2, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        A.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j = this.a;
        long j2 = (this.b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.a = j2;
        return new y(j, j2, this.c, this.d);
    }

    @Override // j$.util.M
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void e(E e) {
        e.getClass();
        long j = this.a;
        long j2 = this.b;
        if (j < j2) {
            this.a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                e.accept(current.d(this.c, this.d));
                j++;
            } while (j < j2);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.M
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean p(E e) {
        e.getClass();
        long j = this.a;
        if (j >= this.b) {
            return false;
        }
        e.accept(ThreadLocalRandom.current().d(this.c, this.d));
        this.a = j + 1;
        return true;
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

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return A.m(this, consumer);
    }
}
