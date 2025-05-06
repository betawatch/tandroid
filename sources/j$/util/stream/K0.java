package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class K0 implements G0 {
    private final Collection a;

    K0(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.G0
    public final void forEach(Consumer consumer) {
        Collection.-EL.a(this.a, consumer);
    }

    @Override // j$.util.stream.G0
    public final void i(Object[] objArr, int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final Object[] s(IntFunction intFunction) {
        java.util.Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return Collection.-EL.stream(this.a).spliterator();
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 t(long j, long j2, IntFunction intFunction) {
        return u0.w(this, j, j2, intFunction);
    }

    public final String toString() {
        java.util.Collection collection = this.a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
