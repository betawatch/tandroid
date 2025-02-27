package j$.util;

import j$.util.function.Consumer;
import java.util.PrimitiveIterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements p, h {
    public final /* synthetic */ PrimitiveIterator.OfDouble a;

    private /* synthetic */ n(PrimitiveIterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ p b(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof o ? ((o) ofDouble).a : new n(ofDouble);
    }

    @Override // j$.util.p, j$.util.h
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.p
    public final /* synthetic */ void e(j$.util.function.m mVar) {
        this.a.forEachRemaining(j$.util.function.l.a(mVar));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.a;
        if (obj instanceof n) {
            obj = ((n) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.y
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.p, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.p
    public final /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
