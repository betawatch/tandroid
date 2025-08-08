package j$.util;

import j$.util.function.Consumer;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements PrimitiveIterator.OfLong {
    public final /* synthetic */ x a;

    private /* synthetic */ w(x xVar) {
        this.a = xVar;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong b(x xVar) {
        if (xVar == null) {
            return null;
        }
        return xVar instanceof v ? ((v) xVar).a : new w(xVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        x xVar = this.a;
        if (obj instanceof w) {
            obj = ((w) obj).a;
        }
        return xVar.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.d(j$.util.function.W.a(longConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
