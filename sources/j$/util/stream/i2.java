package j$.util.stream;

import j$.util.Collection;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class i2 implements e2 {
    public final Collection a;

    @Override // j$.util.stream.e2
    public final /* synthetic */ e2 e(long j10, long j11, IntFunction intFunction) {
        return t3.V(this, j10, j11, intFunction);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ int h() {
        return 0;
    }

    @Override // j$.util.stream.e2
    public final e2 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public i2(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.e2
    public final Spliterator spliterator() {
        return Collection.-EL.stream(this.a).spliterator();
    }

    @Override // j$.util.stream.e2
    public final void f(Object[] objArr, int i10) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    @Override // j$.util.stream.e2
    public final Object[] g(IntFunction intFunction) {
        java.util.Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.e2
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.e2
    public final void forEach(Consumer consumer) {
        Collection.-EL.a(this.a, consumer);
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.a.size()), this.a);
    }
}
