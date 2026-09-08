package n7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k extends m {
    public final transient m c;

    public k(m mVar) {
        this.c = mVar;
    }

    @Override // n7.m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m mVar = this.c;
        a.e(i10, mVar.size());
        return mVar.get((mVar.size() - 1) - i10);
    }

    @Override // n7.m, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // n7.m, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // n7.m
    public final m r() {
        return this.c;
    }

    @Override // n7.m, java.util.List
    /* renamed from: s */
    public final m subList(int i10, int i11) {
        m mVar = this.c;
        a.m(i10, i11, mVar.size());
        return mVar.subList(mVar.size() - i11, mVar.size() - i10).r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
