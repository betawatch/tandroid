package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class P implements t, j$.util.function.E, h {
    boolean a = false;
    int b;
    final /* synthetic */ G c;

    P(G g) {
        this.c = g;
    }

    @Override // j$.util.t, j$.util.h
    public final void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.E) {
            forEachRemaining((j$.util.function.E) consumer);
            return;
        }
        consumer.getClass();
        if (d0.a) {
            d0.a(P.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        forEachRemaining(new q(consumer));
    }

    @Override // j$.util.function.E
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    @Override // j$.util.y
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(j$.util.function.E e) {
        e.getClass();
        while (hasNext()) {
            e.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // j$.util.function.E
    public final /* synthetic */ j$.util.function.E l(j$.util.function.E e) {
        return j$.com.android.tools.r8.a.c(this, e);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (!d0.a) {
            return Integer.valueOf(nextInt());
        }
        d0.a(P.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.t
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
