package n7;

import java.util.Iterator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c0 extends p {
    public final transient Object d;

    public c0(Object obj) {
        this.d = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // n7.p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // n7.i
    public final int i(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new u(this.d);
    }

    @Override // n7.i
    public final e0 p() {
        return new u(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // n7.p
    public final n t() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            j jVar = n.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(hc.b.j(i10, "at index "));
            }
        }
        return n.t(1, objArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a4.a.p("[", this.d.toString(), "]");
    }
}
