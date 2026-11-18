package a8;

import java.util.Iterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class d0 extends w {
    public final transient f0 c;
    public final transient e0 d;

    public d0(f0 f0Var, e0 e0Var) {
        this.c = f0Var;
        this.d = e0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // a8.p
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
