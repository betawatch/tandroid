// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bmd extends omd {
    public final transient omd r;

    public bmd(omd omdVar) {
        super((byte) 4);
        this.r = omdVar;
    }

    @Override // omd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        omd omdVar = this.r;
        c5f.a(i, omdVar.size());
        return omdVar.get((omdVar.size() - 1) - i);
    }

    @Override // omd, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.r.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // omd, java.util.List
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

    @Override // omd
    public final omd y() {
        return this.r;
    }

    @Override // omd, java.util.List
    /* renamed from: z */
    public final omd subList(int i, int i2) {
        omd omdVar = this.r;
        c5f.b(i, i2, omdVar.size());
        return omdVar.subList(omdVar.size() - i2, omdVar.size() - i).y();
    }
}
