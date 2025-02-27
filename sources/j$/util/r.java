package j$.util;

import j$.util.function.Consumer;
import java.util.PrimitiveIterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements t, h {
    public final /* synthetic */ PrimitiveIterator.OfInt a;

    private /* synthetic */ r(PrimitiveIterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ t b(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof s ? ((s) ofInt).a : new r(ofInt);
    }

    @Override // j$.util.t, j$.util.h
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.t
    public final /* synthetic */ void c(j$.util.function.E e) {
        this.a.forEachRemaining(j$.util.function.D.a(e));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.y
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfInt) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.t, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.t
    public final /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
