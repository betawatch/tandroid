package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class P implements t, j$.util.function.G, h {
    boolean a = false;
    int b;
    final /* synthetic */ G c;

    @Override // j$.util.function.G
    public final /* synthetic */ j$.util.function.G l(j$.util.function.G g) {
        return j$.com.android.tools.r8.a.b(this, g);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (d0.a) {
            d0.a(P.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.t, j$.util.h
    public final void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.G) {
            forEachRemaining((j$.util.function.G) consumer);
            return;
        }
        consumer.getClass();
        if (d0.a) {
            d0.a(P.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        forEachRemaining(new q(consumer));
    }

    @Override // j$.util.y
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(j$.util.function.G g) {
        g.getClass();
        while (hasNext()) {
            g.accept(nextInt());
        }
    }

    P(G g) {
        this.c = g;
    }

    @Override // j$.util.function.G
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
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
