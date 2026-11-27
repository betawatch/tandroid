// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jbd extends tbd {
    public final transient tbd r;

    public jbd(tbd tbdVar) {
        super((byte) 3);
        this.r = tbdVar;
    }

    @Override // tbd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        tbd tbdVar = this.r;
        t8f.a(i, tbdVar.size());
        return tbdVar.get((tbdVar.size() - 1) - i);
    }

    @Override // tbd, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.r.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // tbd, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.r.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r.size();
    }

    @Override // tbd
    public final tbd y() {
        return this.r;
    }

    @Override // tbd, java.util.List
    /* renamed from: z */
    public final tbd subList(int i, int i2) {
        tbd tbdVar = this.r;
        t8f.b(i, i2, tbdVar.size());
        return tbdVar.subList(tbdVar.size() - i2, tbdVar.size() - i).y();
    }
}
