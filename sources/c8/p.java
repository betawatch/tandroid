package c8;

import java.util.Iterator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class p extends j {
    public final transient r c;
    public final transient q d;

    public p(r rVar, q qVar) {
        this.c = rVar;
        this.d = qVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // c8.e
    public final int f(Object[] objArr) {
        return this.d.f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.c.getClass();
        return 1;
    }
}
