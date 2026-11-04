package o7;

import b8.bf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends e {
    public final transient e c;

    public c(e eVar) {
        this.c = eVar;
    }

    @Override // o7.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        e eVar = this.c;
        bf.a(i3, eVar.size());
        return eVar.get((eVar.size() - 1) - i3);
    }

    @Override // o7.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // o7.e
    public final e l() {
        return this.c;
    }

    @Override // o7.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // o7.e, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final e subList(int i3, int i10) {
        e eVar = this.c;
        bf.b(i3, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i3).l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
