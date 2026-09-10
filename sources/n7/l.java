package n7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l extends n {
    public final transient n c;

    public l(n nVar) {
        this.c = nVar;
    }

    @Override // n7.n, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n nVar = this.c;
        a.e(i10, nVar.size());
        return nVar.get((nVar.size() - 1) - i10);
    }

    @Override // n7.n, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // n7.n, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // n7.n
    public final n r() {
        return this.c;
    }

    @Override // n7.n, java.util.List
    /* renamed from: s */
    public final n subList(int i10, int i11) {
        n nVar = this.c;
        a.m(i10, i11, nVar.size());
        return nVar.subList(nVar.size() - i11, nVar.size() - i10).r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
