package b7;

import java.util.Iterator;
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e0 extends q {
    public final transient Object d;

    public e0(Object obj) {
        this.d = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // b7.q, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // b7.j
    public final int i(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new w(this.d);
    }

    @Override // b7.j
    public final g0 p() {
        return new w(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // b7.q
    public final o t() {
        Object[] objArr = {this.d};
        for (int i10 = 0; i10 < 1; i10++) {
            k kVar = o.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(a2.j(i10, "at index "));
            }
        }
        return o.t(1, objArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return android.support.v4.media.a.o("[", this.d.toString(), "]");
    }
}
