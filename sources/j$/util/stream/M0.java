package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class M0 implements I0 {
    private final Collection a;

    @Override // j$.util.stream.I0
    public final /* synthetic */ I0 h(long j, long j2, IntFunction intFunction) {
        return w0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.I0
    public final I0 b(int i) {
        throw new IndexOutOfBoundsException();
    }

    M0(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.I0
    public final Spliterator spliterator() {
        return Collection.-EL.stream(this.a).spliterator();
    }

    @Override // j$.util.stream.I0
    public final void i(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.I0
    public final Object[] o(IntFunction intFunction) {
        java.util.Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.I0
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.I0
    public final void forEach(Consumer consumer) {
        Collection.-EL.a(this.a, consumer);
    }

    public final String toString() {
        java.util.Collection collection = this.a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
