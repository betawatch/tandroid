package j$.util;

import j$.util.function.Consumer;
import java.util.PrimitiveIterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements x, h {
    public final /* synthetic */ PrimitiveIterator.OfLong a;

    private /* synthetic */ v(PrimitiveIterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ x b(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof w ? ((w) ofLong).a : new v(ofLong);
    }

    @Override // j$.util.x, j$.util.h
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.x
    public final /* synthetic */ void d(j$.util.function.T t) {
        this.a.forEachRemaining(j$.util.function.S.a(t));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.a;
        if (obj instanceof v) {
            obj = ((v) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.y
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfLong) obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.x, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.x
    public final /* synthetic */ long nextLong() {
        return this.a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }
}
