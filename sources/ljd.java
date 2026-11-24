// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ljd extends yjd {
    public final transient yjd r;

    public ljd(yjd yjdVar) {
        super((byte) 4);
        this.r = yjdVar;
    }

    @Override // yjd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        yjd yjdVar = this.r;
        m2f.a(i, yjdVar.size());
        return yjdVar.get((yjdVar.size() - 1) - i);
    }

    @Override // yjd, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.r.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // yjd, java.util.List
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

    @Override // yjd
    public final yjd y() {
        return this.r;
    }

    @Override // yjd, java.util.List
    /* renamed from: z */
    public final yjd subList(int i, int i2) {
        yjd yjdVar = this.r;
        m2f.b(i, i2, yjdVar.size());
        return yjdVar.subList(yjdVar.size() - i2, yjdVar.size() - i).y();
    }
}
