package o7;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k extends m {
    public final transient m c;

    public k(m mVar) {
        this.c = mVar;
    }

    @Override // o7.m, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m mVar = this.c;
        a.e(i10, mVar.size());
        return mVar.get((mVar.size() - 1) - i10);
    }

    @Override // o7.m, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // o7.m, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // o7.m
    public final m q() {
        return this.c;
    }

    @Override // o7.m, java.util.List
    /* renamed from: r */
    public final m subList(int i10, int i11) {
        m mVar = this.c;
        a.m(i10, i11, mVar.size());
        return mVar.subList(mVar.size() - i11, mVar.size() - i10).q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
