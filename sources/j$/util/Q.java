package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class Q implements x, j$.util.function.T, h {
    boolean a = false;
    long b;
    final /* synthetic */ J c;

    Q(J j) {
        this.c = j;
    }

    @Override // j$.util.x, j$.util.h
    public final void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.T) {
            forEachRemaining((j$.util.function.T) consumer);
            return;
        }
        consumer.getClass();
        if (d0.a) {
            d0.a(Q.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        forEachRemaining(new u(consumer));
    }

    @Override // j$.util.function.T
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    @Override // j$.util.y
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(j$.util.function.T t) {
        t.getClass();
        while (hasNext()) {
            t.accept(nextLong());
        }
    }

    @Override // j$.util.function.T
    public final /* synthetic */ j$.util.function.T f(j$.util.function.T t) {
        return j$.com.android.tools.r8.a.d(this, t);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (!d0.a) {
            return Long.valueOf(nextLong());
        }
        d0.a(Q.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.x
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
