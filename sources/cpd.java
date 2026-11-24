// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cpd extends okd {
    public final transient Object s;

    public cpd(Object obj) {
        super((byte) 4);
        this.s = obj;
    }

    @Override // okd
    public final yjd A() {
        Object[] objArr = {this.s};
        for (int i = 0; i < 1; i++) {
            eid eidVar = yjd.n;
            if (objArr[i] == null) {
                gxc.d(hg9.j(i, "at index "));
                return null;
            }
        }
        return yjd.A(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.equals(obj);
    }

    @Override // okd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new imd(this.s);
    }

    @Override // l1d
    public final int p(Object[] objArr) {
        objArr[0] = this.s;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return kt6.o("[", this.s.toString(), "]");
    }

    @Override // l1d
    public final v7c u() {
        return new imd(this.s);
    }
}
