// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class khd extends xhd {
    public final transient xhd r;

    public khd(xhd xhdVar) {
        super((byte) 4);
        this.r = xhdVar;
    }

    @Override // xhd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.r.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        xhd xhdVar = this.r;
        k0f.a(i, xhdVar.size());
        return xhdVar.get((xhdVar.size() - 1) - i);
    }

    @Override // xhd, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.r.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // xhd, java.util.List
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

    @Override // xhd
    public final xhd y() {
        return this.r;
    }

    @Override // xhd, java.util.List
    /* renamed from: z */
    public final xhd subList(int i, int i2) {
        xhd xhdVar = this.r;
        k0f.b(i, i2, xhdVar.size());
        return xhdVar.subList(xhdVar.size() - i2, xhdVar.size() - i).y();
    }
}
