package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class Q implements x, j$.util.function.Y, h {
    boolean a = false;
    long b;
    final /* synthetic */ J c;

    @Override // j$.util.function.Y
    public final /* synthetic */ j$.util.function.Y f(j$.util.function.Y y) {
        return j$.com.android.tools.r8.a.c(this, y);
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (d0.a) {
            d0.a(Q.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.y
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(j$.util.function.Y y) {
        y.getClass();
        while (hasNext()) {
            y.accept(nextLong());
        }
    }

    @Override // j$.util.x, j$.util.h
    public final void a(Consumer consumer) {
        if (!(consumer instanceof j$.util.function.Y)) {
            consumer.getClass();
            if (d0.a) {
                d0.a(Q.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
                throw null;
            }
            forEachRemaining(new u(consumer));
            return;
        }
        forEachRemaining((j$.util.function.Y) consumer);
    }

    Q(J j) {
        this.c = j;
    }

    @Override // j$.util.function.Y
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
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
