package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class S implements p, j$.util.function.l, h {
    boolean a = false;
    double b;
    final /* synthetic */ D c;

    @Override // j$.util.function.l
    public final /* synthetic */ j$.util.function.l k(j$.util.function.l lVar) {
        return j$.com.android.tools.r8.a.a(this, lVar);
    }

    @Override // j$.util.y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(j$.util.function.l lVar) {
        lVar.getClass();
        while (hasNext()) {
            lVar.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (d0.a) {
            d0.a(S.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.p, j$.util.h
    public final void a(Consumer consumer) {
        if (!(consumer instanceof j$.util.function.l)) {
            consumer.getClass();
            if (d0.a) {
                d0.a(S.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
                throw null;
            }
            forEachRemaining(new m(consumer));
            return;
        }
        forEachRemaining((j$.util.function.l) consumer);
    }

    S(D d) {
        this.c = d;
    }

    @Override // j$.util.function.l
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // j$.util.p
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
