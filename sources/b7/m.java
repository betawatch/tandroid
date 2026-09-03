package b7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m extends o {
    public final transient o c;

    public m(o oVar) {
        this.c = oVar;
    }

    @Override // b7.o, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        o oVar = this.c;
        b.e(i10, oVar.size());
        return oVar.get((oVar.size() - 1) - i10);
    }

    @Override // b7.o, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // b7.o, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // b7.o
    public final o r() {
        return this.c;
    }

    @Override // b7.o, java.util.List
    /* renamed from: s */
    public final o subList(int i10, int i11) {
        o oVar = this.c;
        b.m(i10, i11, oVar.size());
        return oVar.subList(oVar.size() - i11, oVar.size() - i10).r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
