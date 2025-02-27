package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class S implements p, j$.util.function.m, h {
    boolean a = false;
    double b;
    final /* synthetic */ D c;

    S(D d) {
        this.c = d;
    }

    @Override // j$.util.p, j$.util.h
    public final void a(Consumer consumer) {
        if (consumer instanceof j$.util.function.m) {
            forEachRemaining((j$.util.function.m) consumer);
            return;
        }
        consumer.getClass();
        if (d0.a) {
            d0.a(S.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        forEachRemaining(new m(consumer));
    }

    @Override // j$.util.function.m
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    @Override // j$.util.y
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(j$.util.function.m mVar) {
        mVar.getClass();
        while (hasNext()) {
            mVar.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override // j$.util.function.m
    public final /* synthetic */ j$.util.function.m k(j$.util.function.m mVar) {
        return j$.com.android.tools.r8.a.b(this, mVar);
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (!d0.a) {
            return Double.valueOf(nextDouble());
        }
        d0.a(S.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
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
